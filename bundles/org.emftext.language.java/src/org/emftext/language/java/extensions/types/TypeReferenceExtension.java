/*******************************************************************************
 * Copyright (c) 2006-2014
 * Software Technology Group, Dresden University of Technology
 * DevBoost GmbH, Berlin, Amtsgericht Charlottenburg, HRB 140026
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Software Technology Group - TU Dresden, Germany;
 *   DevBoost GmbH - Berlin, Germany
 *      - initial API and implementation
 ******************************************************************************/
package org.emftext.language.java.extensions.types;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.emftext.language.java.arrays.ArrayTypeable;
import org.emftext.language.java.classifiers.Classifier;
import org.emftext.language.java.classifiers.Interface;
import org.emftext.language.java.expressions.Expression;
import org.emftext.language.java.expressions.LambdaExpression;
import org.emftext.language.java.expressions.LambdaParameters;
import org.emftext.language.java.generics.ExtendsTypeArgument;
import org.emftext.language.java.generics.GenericsFactory;
import org.emftext.language.java.generics.QualifiedTypeArgument;
import org.emftext.language.java.generics.SuperTypeArgument;
import org.emftext.language.java.generics.TypeArgument;
import org.emftext.language.java.generics.TypeParameter;
import org.emftext.language.java.generics.UnknownTypeArgument;
import org.emftext.language.java.members.Method;
import org.emftext.language.java.references.ElementReference;
import org.emftext.language.java.references.MethodCall;
import org.emftext.language.java.references.Reference;
import org.emftext.language.java.references.ReferenceableElement;
import org.emftext.language.java.types.ClassifierReference;
import org.emftext.language.java.types.InferableType;
import org.emftext.language.java.types.NamespaceClassifierReference;
import org.emftext.language.java.types.PrimitiveType;
import org.emftext.language.java.types.Type;
import org.emftext.language.java.types.TypeReference;
import org.emftext.language.java.types.TypesFactory;
import org.emftext.language.java.util.TemporalCompositeClassifier;
import org.emftext.language.java.util.TemporalCompositeTypeReference;
import org.emftext.language.java.variables.LocalVariable;

public class TypeReferenceExtension {

	/**
	 * Returns the type referenced by this <code>TypeReference</code>
	 * considering all concrete subclasses of <code>TypeReference</code> used
	 * by the Java metamodel.
	 * 
	 * @return the referenced type
	 */
	public static Type getTarget(TypeReference me) {
		return me.getBoundTarget(null);
	}
	
	/**
	 * Sets the type targeted by this type reference
	 * 
	 * @param type the new type to set as target.
	 */
	public static void setTarget(TypeReference me, Classifier type) {
		if (type == null) {
			return;
		}
		
		if (type.eIsProxy()) {
			return;
		}
		
		if (me instanceof NamespaceClassifierReference) {
			NamespaceClassifierReference nsClassifierReference = (NamespaceClassifierReference) me;
			nsClassifierReference.getClassifierReferences().clear();
			nsClassifierReference.getNamespaces().clear();
			nsClassifierReference.getNamespaces().addAll(type.getContainingContainerName());
			ClassifierReference classifierRef = TypesFactory.eINSTANCE.createClassifierReference();
			classifierRef.setTarget(type);
			nsClassifierReference.getClassifierReferences().add(classifierRef);			
		} else if (me instanceof ClassifierReference) {
			ClassifierReference ref = (ClassifierReference) me;
			ref.setTarget(type);
		} else if (me instanceof InferableType) {
			InferableType ref = (InferableType) me;
			ref.getArrayDimensionsBefore().clear();
			ref.getActualTargets().clear();
			ClassifierReference newRef = TypesFactory.eINSTANCE.createClassifierReference();
			newRef.setTarget(type);
			ref.getActualTargets().add(newRef);
		}
	}
	
	/**
	 * Returns the type referenced by this <code>TypeReference</code>
	 * considering all concrete subclasses of <code>TypeReference</code> used by
	 * the Java metamodel. If type parameters are bound in the given reference,
	 * the bound type will be returned instead of the parameter.
	 * 
	 * @param reference.
	 * 
	 * @return the referenced type.
	 */
	public static Type getBoundTarget(TypeReference me, Reference reference) {
		Type type = null;
		if (me instanceof ClassifierReference || 
				me instanceof NamespaceClassifierReference) {
			ClassifierReference classifierRef = me.getPureClassifierReference();
			if (classifierRef != null) {
				type = classifierRef.getTarget();
			}
			
			if (reference instanceof MethodCall) {
				MethodCall potentialCloneCall = (MethodCall) reference;
				//clone returns the type of the cloned in the case of arrays
				ReferenceableElement potentialCloneCallTarget = potentialCloneCall.getTarget();
				if (potentialCloneCallTarget != null && 
						!potentialCloneCallTarget.eIsProxy() && 
						"clone".equals(potentialCloneCallTarget.getName()))  {
					if (potentialCloneCall.getPrevious() instanceof ElementReference) {
						ElementReference prevRef = (ElementReference) potentialCloneCall.getPrevious();
						if (prevRef.getTarget() instanceof ArrayTypeable && 
								((ArrayTypeable)prevRef.getTarget()).getArrayDimension() > 0) {
							type = prevRef.getReferencedType();
						}
					}
				}
			}
		}

		else if (me instanceof PrimitiveType) {
			return (PrimitiveType) me;
		}
		
		else if (me instanceof InferableType) {
			InferableType t = (InferableType) me;
			if (t.getActualTargets().size() == 0) {
				Type initType = null;
				if (t.eContainer() instanceof LocalVariable) {
					LocalVariable loc = (LocalVariable) t.eContainer();
					TypeReference ref = loc.getInitialValue().getOneTypeReference(false);
					if (ref == null) {
						return null;
					}
					ref = clone(ref);
					if (ref instanceof TemporalCompositeTypeReference) {
						TemporalCompositeTypeReference tempRef = (TemporalCompositeTypeReference) ref;
						t.getActualTargets().addAll(tempRef.getTypeReferences());
						return tempRef.asType();
					}
					t.getActualTargets().add(ref);
					return ref.getTarget();
				} else if (t.eContainer().eContainer() instanceof LambdaParameters) {
					LambdaExpression lambExpr = (LambdaExpression) t.eContainer().eContainer().eContainer();
					initType = lambExpr.getType();
					if (!(initType instanceof Interface)) {
						return initType;
					}
					Method m = ((Interface) initType).getAbstractMethodOfFunctionalInterface();
					EObject container = lambExpr.eContainer();
					while (container instanceof Expression && !(container instanceof MethodCall)) {
						container = container.eContainer();
					}
					if (container instanceof MethodCall) {
						initType = m.getParameters().get(
								lambExpr.getParameters().getParameters().indexOf(t.eContainer()))
									.getTypeReference().getBoundTarget((Reference) container);
					} else {
						initType = m.getParameters().get(
							lambExpr.getParameters().getParameters().indexOf(t.eContainer()))
								.getTypeReference().getBoundTarget(reference);
					}
				}
				if (initType != null) {
					if (initType instanceof TemporalCompositeClassifier) {
						for (EObject obj : ((TemporalCompositeClassifier) initType).getSuperTypes()) {
							t.getActualTargets().add(convertToTypeReference(obj));
						}
					} else {
						t.getActualTargets().add(convertToTypeReference(initType));
					}
					return initType;
				}
			} else if (t.getActualTargets().size() == 1) {
				return t.getActualTargets().get(0).getBoundTarget(reference);
			} else {
				TemporalCompositeClassifier result = new TemporalCompositeClassifier(me);
				for (TypeReference ref : t.getActualTargets()) {
					result.getSuperTypes().add(ref.getBoundTarget(reference));
				}
				return result;
			}
		}
		
		//resolve parameter to real type
		if (type instanceof TypeParameter) {
			type = ((TypeParameter) type).getBoundType(me, reference);
		}

		if (type != null && type.eIsProxy()) {
			//this may happen, when e.g. a super type is resolved. It is ok.
			return null;
		}
		
		return type;
	}
	
	public static TypeReference convertToTypeReference(EObject obj) {
		if (obj instanceof PrimitiveType) {
			return (PrimitiveType) obj;
		} else if (obj instanceof Classifier) {
			ClassifierReference ref = TypesFactory.eINSTANCE.createClassifierReference();
			ref.setTarget((Classifier) obj);
			return ref;
		}
		return null;
	}
	
	public static TypeReference clone(TypeReference me) {
		if (me instanceof NamespaceClassifierReference) {
			NamespaceClassifierReference ncr = (NamespaceClassifierReference) me;
			NamespaceClassifierReference result = TypesFactory.eINSTANCE.createNamespaceClassifierReference();
			for (String s : ncr.getNamespaces()) {
				result.getNamespaces().add(s);
			}
			for(ClassifierReference cR : ncr.getClassifierReferences()) {
				result.getClassifierReferences().add((ClassifierReference) clone(cR));
			}
			return result;
		} else if (me instanceof ClassifierReference) {
			ClassifierReference ref = (ClassifierReference) me;
			ClassifierReference result = TypesFactory.eINSTANCE.createClassifierReference();
			for (TypeArgument arg : ref.getTypeArguments()) {
				result.getTypeArguments().add(clone(arg));
			}
			result.setTarget(ref.getTarget());
			return result;
		} else if (me instanceof InferableType) {
			InferableType infer = (InferableType) me;
			InferableType result = TypesFactory.eINSTANCE.createInferableType();
			for (TypeReference ref : infer.getActualTargets()) {
				result.getActualTargets().add(clone(ref));
			}
			return result;
		} else if (me instanceof TemporalCompositeTypeReference) {
			TemporalCompositeTypeReference ref = (TemporalCompositeTypeReference) me;
			List<TypeReference> refList = new ArrayList<>(ref.getTypeReferences());
			ref.getTypeReferences().clear();
			for (TypeReference typeRef : refList) {
				ref.getTypeReferences().add(clone(typeRef));
			}
			return ref;
		} else if (me instanceof org.emftext.language.java.types.Void) {
			return TypesFactory.eINSTANCE.createVoid();
		} else if (me instanceof org.emftext.language.java.types.Boolean) {
			return TypesFactory.eINSTANCE.createBoolean();
		} else if (me instanceof org.emftext.language.java.types.Byte) {
			return TypesFactory.eINSTANCE.createByte();
		} else if (me instanceof org.emftext.language.java.types.Short) {
			return TypesFactory.eINSTANCE.createShort();
		} else if (me instanceof org.emftext.language.java.types.Int) {
			return TypesFactory.eINSTANCE.createInt();
		} else if (me instanceof org.emftext.language.java.types.Long) {
			return TypesFactory.eINSTANCE.createLong();
		} else if (me instanceof org.emftext.language.java.types.Float) {
			return TypesFactory.eINSTANCE.createFloat();
		} else if (me instanceof org.emftext.language.java.types.Double) {
			return TypesFactory.eINSTANCE.createDouble();
		} else if (me instanceof org.emftext.language.java.types.Char) {
			return TypesFactory.eINSTANCE.createChar();
		}
		return null;
	}
	
	public static TypeArgument clone(TypeArgument me) {
		if (me instanceof QualifiedTypeArgument) {
			QualifiedTypeArgument arg = (QualifiedTypeArgument) me;
			QualifiedTypeArgument result = GenericsFactory.eINSTANCE.createQualifiedTypeArgument();
			result.setTypeReference(clone(arg.getTypeReference()));
			return result;
		} else if (me instanceof UnknownTypeArgument) {
			return GenericsFactory.eINSTANCE.createUnknownTypeArgument();
		} else if (me instanceof SuperTypeArgument) {
			SuperTypeArgument arg = (SuperTypeArgument) me;
			SuperTypeArgument result = GenericsFactory.eINSTANCE.createSuperTypeArgument();
			result.setSuperType(clone(arg.getSuperType()));
			return result;
		} else if (me instanceof ExtendsTypeArgument) {
			ExtendsTypeArgument arg = (ExtendsTypeArgument) me;
			ExtendsTypeArgument result = GenericsFactory.eINSTANCE.createExtendsTypeArgument();
			result.setExtendType(clone(arg.getExtendType()));
			return result;
		}
		return null;
	}
	
	/**
	 * Extracts the (possibly nested) classifier reference (if any) from this
	 * type references.
	 * 
	 * @return
	 */
	public static ClassifierReference getPureClassifierReference(TypeReference me) {
		ClassifierReference classifierReference = null;
		if (me instanceof ClassifierReference) {
			classifierReference = (ClassifierReference) me;
		}
		
		if (me instanceof NamespaceClassifierReference) {
			NamespaceClassifierReference nsClassifierReference = (NamespaceClassifierReference) me;
			if (!nsClassifierReference.getClassifierReferences().isEmpty()) {
				int lastIndex = nsClassifierReference.getClassifierReferences().size() - 1;
				classifierReference = nsClassifierReference.getClassifierReferences().get(lastIndex);
			}
		}
		
		if (me instanceof InferableType) {
			InferableType t = (InferableType) me;
			if (t.getActualTargets().size() > 0) {
				return t.getActualTargets().get(0).getPureClassifierReference();
			}
		}
		
		return classifierReference;
	}
}
