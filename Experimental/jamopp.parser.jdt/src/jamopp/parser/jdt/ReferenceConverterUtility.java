/*******************************************************************************
 * Copyright (c) 2020, Martin Armbruster
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Martin Armbruster
 *      - Initial implementation
 ******************************************************************************/

package jamopp.parser.jdt;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.Annotation;
import org.eclipse.jdt.core.dom.ArrayAccess;
import org.eclipse.jdt.core.dom.ArrayCreation;
import org.eclipse.jdt.core.dom.ArrayInitializer;
import org.eclipse.jdt.core.dom.ClassInstanceCreation;
import org.eclipse.jdt.core.dom.Expression;
import org.eclipse.jdt.core.dom.FieldAccess;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.ParameterizedType;
import org.eclipse.jdt.core.dom.ParenthesizedExpression;
import org.eclipse.jdt.core.dom.QualifiedName;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.StringLiteral;
import org.eclipse.jdt.core.dom.SuperFieldAccess;
import org.eclipse.jdt.core.dom.SuperMethodInvocation;
import org.eclipse.jdt.core.dom.ThisExpression;
import org.eclipse.jdt.core.dom.Type;
import org.eclipse.jdt.core.dom.TypeLiteral;

class ReferenceConverterUtility {
	static org.emftext.language.java.references.Reference convertToReference(Expression expr) {
		org.emftext.language.java.references.Reference result = internalConvertToReference(expr);
		org.emftext.language.java.references.Reference parent = result.getPrevious();
		while (parent != null) {
			result = parent;
			parent = result.getPrevious();
		}
		return result;
	}
	
	@SuppressWarnings("unchecked")
	private static org.emftext.language.java.references.Reference internalConvertToReference(Expression expr) {
		if (expr instanceof Annotation) {
			return AnnotationInstanceOrModifierConverterUtility.convertToAnnotationInstance((Annotation) expr);
		} else if (expr.getNodeType() == ASTNode.ARRAY_ACCESS) {
			ArrayAccess arr = (ArrayAccess) expr;
			org.emftext.language.java.references.Reference parent = internalConvertToReference(arr.getArray());
			org.emftext.language.java.arrays.ArraySelector selector = org.emftext.language.java.arrays.ArraysFactory.eINSTANCE.createArraySelector();
			selector.setPosition(ExpressionConverterUtility.convertToExpression(arr.getIndex()));
			parent.getArraySelectors().add(selector);
			return parent;
		} else if (expr.getNodeType() == ASTNode.ARRAY_CREATION) {
			ArrayCreation arr = (ArrayCreation) expr;
			if (arr.getInitializer() != null) {
				org.emftext.language.java.arrays.ArrayInstantiationByValuesTyped result = org.emftext.language.java.arrays.ArraysFactory.eINSTANCE.createArrayInstantiationByValuesTyped();
				result.setTypeReference(BaseConverterUtility.convertToTypeReference(arr.getType()));
				BaseConverterUtility.convertToArrayDimensionsAndSet(arr.getType(), result);
				result.setArrayInitializer(AnnotationInstanceOrModifierConverterUtility.convertToArrayInitializer(arr.getInitializer()));
				LayoutInformationConverter.convertToMinimalLayoutInformation(result, arr);
				return result;
			} else {
				org.emftext.language.java.arrays.ArrayInstantiationBySize result = org.emftext.language.java.arrays.ArraysFactory.eINSTANCE.createArrayInstantiationBySize();
				result.setTypeReference(BaseConverterUtility.convertToTypeReference(arr.getType()));
				BaseConverterUtility.convertToArrayDimensionsAndSet(arr.getType(), result);
				arr.dimensions().forEach(obj -> result.getSizes().add(ExpressionConverterUtility.convertToExpression((Expression) obj)));
				LayoutInformationConverter.convertToMinimalLayoutInformation(result, arr);
				return result;
			}
		} else if (expr.getNodeType() == ASTNode.ARRAY_INITIALIZER) {
			org.emftext.language.java.arrays.ArrayInstantiationByValuesUntyped result = org.emftext.language.java.arrays.ArraysFactory.eINSTANCE.createArrayInstantiationByValuesUntyped();
			result.setArrayInitializer(AnnotationInstanceOrModifierConverterUtility.convertToArrayInitializer((ArrayInitializer) expr));
			LayoutInformationConverter.convertToMinimalLayoutInformation(result, expr);
			return result;
		} else if (expr.getNodeType() == ASTNode.CLASS_INSTANCE_CREATION) {
			ClassInstanceCreation arr = (ClassInstanceCreation) expr;
			org.emftext.language.java.instantiations.NewConstructorCall result;
			if (arr.getType().isParameterizedType() && ((ParameterizedType) arr.getType()).typeArguments().size() == 0) {
				result = org.emftext.language.java.instantiations.InstantiationsFactory.eINSTANCE.createNewConstructorCallWithInferredTypeArguments();
			} else {
				result = org.emftext.language.java.instantiations.InstantiationsFactory.eINSTANCE.createNewConstructorCall();
			}
			arr.typeArguments().forEach(obj -> result.getCallTypeArguments().add(BaseConverterUtility.convertToTypeArgument((Type) obj)));
			result.setTypeReference(BaseConverterUtility.convertToTypeReference(arr.getType()));
			arr.arguments().forEach(obj -> result.getArguments().add(ExpressionConverterUtility.convertToExpression((Expression) obj)));
			LayoutInformationConverter.convertToMinimalLayoutInformation(result, arr);
			if (arr.getAnonymousClassDeclaration() != null) {
				result.setAnonymousClass(ClassifierConverterUtility.convertToAnonymousClass(arr.getAnonymousClassDeclaration()));
			}
			if (arr.getExpression() != null) {
				org.emftext.language.java.references.Reference parent = internalConvertToReference(arr.getExpression());
				parent.setNext(result);
			}
			return result;
		} else if (expr.getNodeType() == ASTNode.FIELD_ACCESS) {
			FieldAccess arr = (FieldAccess) expr;
			org.emftext.language.java.references.Reference parent = internalConvertToReference(arr.getExpression());
			org.emftext.language.java.references.IdentifierReference result = convertToProxyIdentifierReference(arr.getName());
			parent.setNext(result);
			return result;
		} else if (expr.getNodeType() == ASTNode.METHOD_INVOCATION) {
			MethodInvocation arr = (MethodInvocation) expr;
			org.emftext.language.java.references.MethodCall result = org.emftext.language.java.references.ReferencesFactory.eINSTANCE.createMethodCall();
			arr.typeArguments().forEach(obj -> result.getCallTypeArguments().add(BaseConverterUtility.convertToTypeArgument((Type) obj)));
			arr.arguments().forEach(obj -> result.getArguments().add(ExpressionConverterUtility.convertToExpression((Expression) obj)));
			org.emftext.language.java.members.Method methodProxy = org.emftext.language.java.members.MembersFactory.eINSTANCE.createClassMethod();
			((InternalEObject) methodProxy).eSetProxyURI(null);
			BaseConverterUtility.convertToSimpleNameOnlyAndSet(arr.getName(), methodProxy);
			result.setTarget(methodProxy);
			LayoutInformationConverter.convertToMinimalLayoutInformation(result, arr);
			if (arr.getExpression() != null) {
				org.emftext.language.java.references.Reference parent = internalConvertToReference(arr.getExpression());
				parent.setNext(result);
			}
			return result;
		} else if (expr.getNodeType() == ASTNode.QUALIFIED_NAME) {
			QualifiedName arr = (QualifiedName) expr;
			org.emftext.language.java.references.IdentifierReference result = convertToProxyIdentifierReference(arr.getName());
			org.emftext.language.java.references.Reference parent = internalConvertToReference(arr.getQualifier());
			parent.setNext(result);
			LayoutInformationConverter.convertToMinimalLayoutInformation(result, arr);
			return result;
		} else if (expr.getNodeType() == ASTNode.SIMPLE_NAME) {
			return convertToProxyIdentifierReference((SimpleName) expr);
		} else if (expr.getNodeType() == ASTNode.PARENTHESIZED_EXPRESSION) {
			ParenthesizedExpression arr = (ParenthesizedExpression) expr;
			org.emftext.language.java.expressions.NestedExpression result = org.emftext.language.java.expressions.ExpressionsFactory.eINSTANCE.createNestedExpression();
			result.setExpression(ExpressionConverterUtility.convertToExpression(arr.getExpression()));
			LayoutInformationConverter.convertToMinimalLayoutInformation(result, arr);
			return result;
		} else if (expr.getNodeType() == ASTNode.STRING_LITERAL) {
			StringLiteral arr = (StringLiteral) expr;
			org.emftext.language.java.references.StringReference result = org.emftext.language.java.references.ReferencesFactory.eINSTANCE.createStringReference();
			result.setValue(arr.getEscapedValue());
			LayoutInformationConverter.convertToMinimalLayoutInformation(result, arr);
			return result;
		} else if (expr.getNodeType() == ASTNode.SUPER_FIELD_ACCESS) {
			SuperFieldAccess arr = (SuperFieldAccess) expr;
			org.emftext.language.java.references.SelfReference partOne = org.emftext.language.java.references.ReferencesFactory.eINSTANCE.createSelfReference();
			partOne.setSelf(org.emftext.language.java.literals.LiteralsFactory.eINSTANCE.createSuper());
			if (arr.getQualifier() != null) {
				org.emftext.language.java.references.Reference parent = internalConvertToReference(arr.getQualifier());
				parent.setNext(partOne);
			}
			org.emftext.language.java.references.IdentifierReference partTwo = convertToProxyIdentifierReference(arr.getName());
			partOne.setNext(partTwo);
			return partTwo;
		} else if (expr.getNodeType() == ASTNode.SUPER_METHOD_INVOCATION) {
			SuperMethodInvocation arr = (SuperMethodInvocation) expr;
			org.emftext.language.java.references.SelfReference partOne = org.emftext.language.java.references.ReferencesFactory.eINSTANCE.createSelfReference();
			partOne.setSelf(org.emftext.language.java.literals.LiteralsFactory.eINSTANCE.createSuper());
			if (arr.getQualifier() != null) {
				org.emftext.language.java.references.Reference parent = internalConvertToReference(arr.getQualifier());
				parent.setNext(partOne);
			}
			org.emftext.language.java.references.MethodCall partTwo = org.emftext.language.java.references.ReferencesFactory.eINSTANCE.createMethodCall();
			arr.typeArguments().forEach(obj -> partTwo.getCallTypeArguments().add(BaseConverterUtility.convertToTypeArgument((Type) obj)));
			arr.arguments().forEach(obj -> partTwo.getArguments().add(ExpressionConverterUtility.convertToExpression((Expression) obj)));
			org.emftext.language.java.members.Method proxy = org.emftext.language.java.members.MembersFactory.eINSTANCE.createClassMethod();
			((InternalEObject) proxy).eSetProxyURI(null);
			BaseConverterUtility.convertToSimpleNameOnlyAndSet(arr.getName(), proxy);
			partTwo.setTarget(proxy);
			partOne.setNext(partTwo);
			LayoutInformationConverter.convertToMinimalLayoutInformation(partTwo, arr);
			return partTwo;
		} else if (expr.getNodeType() == ASTNode.THIS_EXPRESSION) {
			ThisExpression arr = (ThisExpression) expr;
			org.emftext.language.java.references.SelfReference result = org.emftext.language.java.references.ReferencesFactory.eINSTANCE.createSelfReference();
			result.setSelf(org.emftext.language.java.literals.LiteralsFactory.eINSTANCE.createThis());
			if (arr.getQualifier() != null) {
				org.emftext.language.java.references.Reference parent = internalConvertToReference(arr.getQualifier());
				parent.setNext(result);
			}
			LayoutInformationConverter.convertToMinimalLayoutInformation(result, arr);
			return result;
		} else if (expr.getNodeType() == ASTNode.TYPE_LITERAL) {
			TypeLiteral arr = (TypeLiteral) expr;
			org.emftext.language.java.references.ReflectiveClassReference result = org.emftext.language.java.references.ReferencesFactory.eINSTANCE.createReflectiveClassReference();
			org.emftext.language.java.types.TypeReference typeRef = BaseConverterUtility.convertToTypeReference(arr.getType());
			org.emftext.language.java.references.Reference parent;
			if (typeRef instanceof org.emftext.language.java.types.PrimitiveType) {
				org.emftext.language.java.references.PrimitiveTypeReference temp = org.emftext.language.java.references.ReferencesFactory.eINSTANCE.createPrimitiveTypeReference();
				temp.setPrimitiveType((org.emftext.language.java.types.PrimitiveType) typeRef);
				parent = temp;
			} else if (typeRef instanceof org.emftext.language.java.types.ClassifierReference) {
				parent = convertToIdentifierReference((org.emftext.language.java.types.ClassifierReference) typeRef);
			} else { // typeRef instanceof org.emftext.language.java.types.NamespaceClassifierReference
				org.emftext.language.java.types.NamespaceClassifierReference ref = (org.emftext.language.java.types.NamespaceClassifierReference) typeRef;
				org.emftext.language.java.references.IdentifierReference currentResult = null;
				for (String namespace : ref.getNamespaces()) {
					org.emftext.language.java.references.IdentifierReference iterRef = createProxyIdentifierReference(namespace);
					if (currentResult != null) {
						currentResult.setNext(iterRef);
					}
					currentResult = iterRef;
				}
				for (org.emftext.language.java.types.ClassifierReference iterRef : ref.getClassifierReferences()) {
					org.emftext.language.java.references.IdentifierReference iterIdRef = convertToIdentifierReference(iterRef);
					if (currentResult != null) {
						currentResult.setNext(iterIdRef);
					}
					currentResult = iterIdRef;
				}
				parent = currentResult;
			}
			parent.setNext(result);
			parent.getLayoutInformations().addAll(typeRef.getLayoutInformations());
			LayoutInformationConverter.convertToMinimalLayoutInformation(result, arr);
			return result;
		}
		return null;
	}
	
	private static org.emftext.language.java.references.IdentifierReference convertToProxyIdentifierReference(SimpleName name) {
		org.emftext.language.java.references.IdentifierReference result = createProxyIdentifierReference(name.getIdentifier());
		LayoutInformationConverter.convertToMinimalLayoutInformation(result, name);
		return result;
	}
	
	private static org.emftext.language.java.references.IdentifierReference createProxyIdentifierReference(String name) {
		org.emftext.language.java.references.IdentifierReference result = org.emftext.language.java.references.ReferencesFactory.eINSTANCE.createIdentifierReference();
		org.emftext.language.java.members.Field proxy = org.emftext.language.java.members.MembersFactory.eINSTANCE.createField();
		((InternalEObject) proxy).eSetProxyURI(null);
		proxy.setName(name);
		result.setTarget(proxy);
		return result;
	}
	
	private static org.emftext.language.java.references.IdentifierReference convertToIdentifierReference(org.emftext.language.java.types.ClassifierReference ref) {
		org.emftext.language.java.references.IdentifierReference temp = org.emftext.language.java.references.ReferencesFactory.eINSTANCE.createIdentifierReference();
		temp.setTarget(ref.getTarget());
		temp.getTypeArguments().addAll(ref.getTypeArguments());
		temp.getAnnotations().addAll(ref.getAnnotations());
		return temp;
	}
}
