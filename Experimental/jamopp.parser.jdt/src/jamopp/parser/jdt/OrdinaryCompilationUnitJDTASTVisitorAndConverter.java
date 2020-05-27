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

import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.AbstractTypeDeclaration;
import org.eclipse.jdt.core.dom.Annotation;
import org.eclipse.jdt.core.dom.BodyDeclaration;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.EnumConstantDeclaration;
import org.eclipse.jdt.core.dom.EnumDeclaration;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.IExtendedModifier;
import org.eclipse.jdt.core.dom.Initializer;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.Type;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.TypeParameter;

public class OrdinaryCompilationUnitJDTASTVisitorAndConverter extends ModuleJDTASTVisitorAndConverter {
	@Override
	public boolean visit(CompilationUnit node) {
		if (node.types().size() > 0) {
			this.setConvertedElement(this.convertToCompilationUnit(node));
		}
		super.visit(node);
		return false;
	}
	
	@SuppressWarnings("unchecked")
	private org.emftext.language.java.containers.CompilationUnit convertToCompilationUnit(CompilationUnit cu) {
		org.emftext.language.java.containers.CompilationUnit result = org.emftext.language.java.containers.ContainersFactory.eINSTANCE.createCompilationUnit();
		LayoutInformationConverter.convertJavaRootLayoutInformation(result, cu, getSource());
		cu.types().forEach(obj -> result.getClassifiers().add(this.convertToConcreteClassifier((AbstractTypeDeclaration) obj)));
		return result;
	}
	
	@SuppressWarnings("unchecked")
	private org.emftext.language.java.classifiers.ConcreteClassifier convertToConcreteClassifier(AbstractTypeDeclaration typeDecl) {
		org.emftext.language.java.classifiers.ConcreteClassifier result = null;
		if (typeDecl.getNodeType() == ASTNode.TYPE_DECLARATION) {
			result = this.convertToClassOrInterface((TypeDeclaration) typeDecl);
		} else if (typeDecl.getNodeType() == ASTNode.ANNOTATION_TYPE_DECLARATION) {
			result = org.emftext.language.java.classifiers.ClassifiersFactory.eINSTANCE.createAnnotation();
		} else { // typeDecl.getNodeType() == ASTNode.ENUM_DECLARATION
			result = this.convertToEnum((EnumDeclaration) typeDecl);
		}
		org.emftext.language.java.classifiers.ConcreteClassifier finalResult = result;
		typeDecl.modifiers().forEach(obj -> finalResult.getAnnotationsAndModifiers().add(this.converToModifierOrAnnotationInstance((IExtendedModifier) obj)));
		this.convertToSimpleNameOnlyAndSet(typeDecl.getName(), result);
		typeDecl.bodyDeclarations().forEach(obj -> finalResult.getMembers().add(this.convertToMember((BodyDeclaration) obj)));
		LayoutInformationConverter.convertToMinimalLayoutInformation(result, typeDecl);
		return result;
	}
	
	@SuppressWarnings("unchecked")
	private org.emftext.language.java.classifiers.ConcreteClassifier convertToClassOrInterface(TypeDeclaration typeDecl) {
		org.emftext.language.java.classifiers.ConcreteClassifier result;
		if (typeDecl.isInterface()) {
			org.emftext.language.java.classifiers.Interface interfaceObj = org.emftext.language.java.classifiers.ClassifiersFactory.eINSTANCE.createInterface();
			typeDecl.superInterfaceTypes().forEach(obj -> interfaceObj.getExtends().add(this.convertToTypeReference((Type) obj)));
			result = interfaceObj;
		} else {
			org.emftext.language.java.classifiers.Class classObj = org.emftext.language.java.classifiers.ClassifiersFactory.eINSTANCE.createClass();
			if (typeDecl.getSuperclassType() != null) {
				classObj.setExtends(this.convertToTypeReference(typeDecl.getSuperclassType()));
			}
			typeDecl.superInterfaceTypes().forEach(obj -> classObj.getImplements().add(this.convertToTypeReference((Type) obj)));
			result = classObj;
		}
		typeDecl.typeParameters().forEach(obj -> result.getTypeParameters().add(this.convertToTypeParameter((TypeParameter) obj)));
		return result;
	}
	
	@SuppressWarnings("unchecked")
	private org.emftext.language.java.classifiers.Enumeration convertToEnum(EnumDeclaration enumDecl) {
		org.emftext.language.java.classifiers.Enumeration result = org.emftext.language.java.classifiers.ClassifiersFactory.eINSTANCE.createEnumeration();
		enumDecl.superInterfaceTypes().forEach(obj -> result.getImplements().add(this.convertToTypeReference((Type) obj)));
		enumDecl.enumConstants().forEach(obj -> result.getConstants().add(this.convertToEnumConstant((EnumConstantDeclaration) obj)));
		return result;
	}
	
	private org.emftext.language.java.members.Member convertToMember(BodyDeclaration body) {
		if (body instanceof AbstractTypeDeclaration) {
			return this.convertToConcreteClassifier((AbstractTypeDeclaration) body);
		} else if (body.getNodeType() == ASTNode.INITIALIZER) {
			return this.convertToBlock((Initializer) body);
		} else if (body.getNodeType() == ASTNode.FIELD_DECLARATION) {
			return this.convertToField((FieldDeclaration) body);
		} else if (body.getNodeType() == ASTNode.METHOD_DECLARATION) {
			return this.convertToMethodOrConstructor((MethodDeclaration) body);
		}
		return null;
	}
	
	private org.emftext.language.java.statements.Block convertToBlock(Initializer init) {
		return null;
	}
	
	private org.emftext.language.java.members.Field convertToField(FieldDeclaration fieldDecl) {
		return null;
	}
	
	private org.emftext.language.java.members.Member convertToMethodOrConstructor(MethodDeclaration methodDecl) {
		return null;
	}
	
	private org.emftext.language.java.members.EnumConstant convertToEnumConstant(EnumConstantDeclaration enDecl) {
		return null;
	}
	
	@SuppressWarnings("unchecked")
	private org.emftext.language.java.generics.TypeParameter convertToTypeParameter(TypeParameter param) {
		org.emftext.language.java.generics.TypeParameter result = org.emftext.language.java.generics.GenericsFactory.eINSTANCE.createTypeParameter();
		param.modifiers().forEach(obj -> result.getAnnotations().add(this.convertToAnnotationInstance((Annotation) obj)));
		this.convertToSimpleNameOnlyAndSet(param.getName(), result);
		param.typeBounds().forEach(obj -> result.getExtendTypes().add(this.convertToTypeReference((Type) obj)));
		LayoutInformationConverter.convertToMinimalLayoutInformation(result, param);
		return result;
	}
}
