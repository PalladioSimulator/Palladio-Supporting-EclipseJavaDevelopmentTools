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
package org.emftext.language.java.extensions.references;

import org.emftext.language.java.classifiers.Annotation;
import org.emftext.language.java.classifiers.AnonymousClass;
import org.emftext.language.java.classifiers.ConcreteClassifier;
import org.emftext.language.java.classifiers.Enumeration;
import org.emftext.language.java.expressions.NestedExpression;
import org.emftext.language.java.extensions.types.TypeReferenceExtension;
import org.emftext.language.java.instantiations.ExplicitConstructorCall;
import org.emftext.language.java.literals.Literal;
import org.emftext.language.java.literals.Super;
import org.emftext.language.java.literals.This;
import org.emftext.language.java.members.AdditionalField;
import org.emftext.language.java.members.EnumConstant;
import org.emftext.language.java.references.ElementReference;
import org.emftext.language.java.references.PrimitiveTypeReference;
import org.emftext.language.java.references.Reference;
import org.emftext.language.java.references.ReferenceableElement;
import org.emftext.language.java.references.ReflectiveClassReference;
import org.emftext.language.java.references.SelfReference;
import org.emftext.language.java.references.StringReference;
import org.emftext.language.java.references.TextBlockReference;
import org.emftext.language.java.types.Type;
import org.emftext.language.java.types.TypeReference;
import org.emftext.language.java.types.TypedElement;
import org.emftext.language.java.util.TemporalCompositeTypeReference;
import org.emftext.language.java.variables.AdditionalLocalVariable;

public class ReferenceExtension {

	public static Reference getPrevious(Reference me) {
		if (me.eContainer() instanceof Reference) { 
			Reference container = (Reference) me.eContainer(); 
			if (me.equals(container.getNext())) {
				return container;
			}
		}
		return null;
	}
	
	/**
	 * Determines the {@link Type} of the reference. That is, either the type to
	 * which the reference points directly, or the type of the element to which
	 * the reference points.
	 * 
	 * @return the determined type
	 */
	public static Type getReferencedType(Reference me) {
		TypeReference ref = getReferencedTypeReference(me);
		if (ref instanceof TemporalCompositeTypeReference) {
			return ((TemporalCompositeTypeReference) ref).asType();
		}
		return ref == null ? null : ref.getBoundTarget(me);
	}
	
	public static TypeReference getReferencedTypeReference(Reference me) {
		if (me instanceof Literal) {
			return TypeReferenceExtension.convertToTypeReference(((Literal) me).getType());
		}

		TypeReference type = null;

		if (me instanceof TypedElement) {
			// Referenced element points to a type.
			type = ((TypedElement) me).getTypeReference();
		} else if (me instanceof SelfReference) {
			// Element points to this or super.
			TypeReference thisClassRef = null;
			Type thisClass = null;
			if (me.getPrevious() != null) {
				thisClassRef = me.getPrevious().getReferencedTypeReference();
				thisClass = thisClassRef.getTarget();
			} else {
				AnonymousClass anonymousContainer = me.getContainingAnonymousClass();
				if (anonymousContainer != null) {
					thisClass = anonymousContainer;
				} else {
					thisClass = me.getContainingConcreteClassifier();
				}
			}
			
			// Find super class if "self" is "super".
			if (((SelfReference) me).getSelf() instanceof Super) {
				if (thisClass instanceof org.emftext.language.java.classifiers.Class) {
					return TypeReferenceExtension.convertToTypeReference(
						((org.emftext.language.java.classifiers.Class) thisClass).getSuperClass());
				}
				if (thisClass instanceof AnonymousClass) {
					return TypeReferenceExtension.convertToTypeReference(((AnonymousClass)thisClass).getSuperClassifier());
				}
			}
			
			type = thisClassRef != null ? thisClassRef : TypeReferenceExtension.convertToTypeReference(thisClass);
		} else if (me instanceof ReflectiveClassReference) {
			// Element points to the object's class object.
			return TypeReferenceExtension.convertToTypeReference(me.getClassClass());
		} else if (me instanceof ElementReference) {
			// Referenced element points to an element with a type.
			ReferenceableElement target = (ReferenceableElement) ((ElementReference) me).getTarget();
			
			if (target == null) {
				return null;
			}
			if (target.eIsProxy()) {
				type = null;
			}
			
			// Navigate through AdditionalLocalVariable or Field
			if (target instanceof AdditionalLocalVariable) {
				target = (ReferenceableElement) target.eContainer();
			}
			if (target instanceof AdditionalField) {
				target = (ReferenceableElement) target.eContainer();
			}
			if (target instanceof TypedElement) {
				type = ((TypedElement) target).getTypeReference();
			} else if (target instanceof Type /*e.g. Annotation*/) {
				return TypeReferenceExtension.convertToTypeReference((Type) target);
			} else if (target instanceof EnumConstant) {
				type = TypeReferenceExtension.convertToTypeReference((Enumeration) target.eContainer());
			}
		}
		// Strings may also appear as reference.
		else if (me instanceof StringReference || me instanceof TextBlockReference) {
			return TypeReferenceExtension.convertToTypeReference(me.getStringClass());
		} else if (me instanceof NestedExpression) {
			type = ((NestedExpression) me).getExpression().getOneTypeReference(false);
		} else if (me instanceof PrimitiveTypeReference) {
			type = ((PrimitiveTypeReference) me).getPrimitiveType();
		} else if (me instanceof ExplicitConstructorCall) {
			ExplicitConstructorCall exCall = (ExplicitConstructorCall) me;
			ConcreteClassifier thisClass = me.getContainingConcreteClassifier();
			if (exCall.getCallTarget() instanceof This) {
				return TypeReferenceExtension.convertToTypeReference(thisClass);
			} else {
				if (thisClass instanceof org.emftext.language.java.classifiers.Class) {
					return TypeReferenceExtension.convertToTypeReference(
							((org.emftext.language.java.classifiers.Class) thisClass).getSuperClass());
				}
			}
		} else {
			assert false;
		}
		return type;
	}
}
