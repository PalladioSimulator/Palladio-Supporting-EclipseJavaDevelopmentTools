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
import org.eclipse.jdt.core.dom.AnnotationTypeDeclaration;
import org.eclipse.jdt.core.dom.BodyDeclaration;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.EnumDeclaration;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.IExtendedModifier;
import org.eclipse.jdt.core.dom.Initializer;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;

public class OrdinaryCompilationUnitJDTASTVisitorAndConverter extends ModuleJDTASTVisitorAndConverter {
	@Override
	public boolean visit(CompilationUnit node) {
		if (node.types().size() > 0) {
			this.setConvertedElement(this.convertToCompilationUnit(node));
		}
		super.visit(node);
		return false;
	}
	
	private org.emftext.language.java.containers.CompilationUnit convertToCompilationUnit(CompilationUnit cu) {
		org.emftext.language.java.containers.CompilationUnit result = org.emftext.language.java.containers.ContainersFactory.eINSTANCE.createCompilationUnit();
		LayoutInformationConverter.convertJavaRootLayoutInformation(result, cu, getSource());
		cu.types().forEach(obj -> result.getClassifiers().add(this.convertToConcreteClassifier((AbstractTypeDeclaration) obj)));
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
	
	private org.emftext.language.java.classifiers.ConcreteClassifier convertToConcreteClassifier(AbstractTypeDeclaration typeDecl) {
		org.emftext.language.java.classifiers.ConcreteClassifier result = null;
		if (typeDecl.getNodeType() == ASTNode.TYPE_DECLARATION) {
			result = this.convertToClassOrInterface((TypeDeclaration) typeDecl);
		} else if (typeDecl.getNodeType() == ASTNode.ANNOTATION_TYPE_DECLARATION) {
			result = this.convertToAnnotation((AnnotationTypeDeclaration) typeDecl);
		} else { // typeDecl.getNodeType() == ASTNode.ENUM_DECLARATION
			result = this.convertToEnum((EnumDeclaration) typeDecl);
		}
		org.emftext.language.java.classifiers.ConcreteClassifier finalResult = result;
		typeDecl.modifiers().forEach(obj -> finalResult.getAnnotationsAndModifiers().add(
			this.converToModifierOrAnnotationInstance((IExtendedModifier) obj)));
		return result;
	}
	
	private org.emftext.language.java.classifiers.ConcreteClassifier convertToClassOrInterface(TypeDeclaration typeDecl) {
		return null;
	}
	
	private org.emftext.language.java.classifiers.Annotation convertToAnnotation(AnnotationTypeDeclaration typeDecl) {
		return null;
	}
	
	private org.emftext.language.java.classifiers.Enumeration convertToEnum(EnumDeclaration enumDecl) {
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
}
