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
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.ImportDeclaration;
import org.eclipse.jdt.core.dom.Name;
import org.eclipse.jdt.core.dom.QualifiedName;
import org.eclipse.jdt.core.dom.SimpleName;

class AbstractAndEmptyModelJDTASTVisitorAndConverter extends ASTVisitor {
	private org.emftext.language.java.containers.JavaRoot convertedRootElement;
	private String originalSource;
	
	void setSource(String src) {
		this.originalSource = src;
	}
	
	String getSource() {
		return this.originalSource;
	}
	
	void setConvertedElement(org.emftext.language.java.containers.JavaRoot root) {
		this.convertedRootElement = root;
	}
	
	org.emftext.language.java.containers.JavaRoot getConvertedElement() {
		return this.convertedRootElement;
	}
	
	@Override
	public boolean visit(CompilationUnit node) {
		if (this.convertedRootElement == null) {
			this.convertedRootElement = org.emftext.language.java.containers.ContainersFactory.eINSTANCE.createEmptyModel();
		}
		node.imports().forEach(obj -> this.convertedRootElement.getImports().add(this.convertToImport((ImportDeclaration) obj)));
		return false;
	}
	
	org.emftext.language.java.types.TypeReference convertToClassifierOrNamespaceClassifierReference(Name name) {
		if (name.isSimpleName()) {
			return this.convertToClassifierReference((SimpleName) name);
		} else { // name.isQualifiedName()
			QualifiedName qualifiedName = (QualifiedName) name;
			org.emftext.language.java.types.NamespaceClassifierReference ref = org.emftext.language.java.types.TypesFactory.eINSTANCE.createNamespaceClassifierReference();
			ref.getClassifierReferences().add(this.convertToClassifierReference(qualifiedName.getName()));
			this.convertToNamespacesAndSet(qualifiedName.getQualifier(), ref);
			return ref;
		}
	}
	
	org.emftext.language.java.types.ClassifierReference convertToClassifierReference(SimpleName simpleName) {
		org.emftext.language.java.types.ClassifierReference ref = org.emftext.language.java.types.TypesFactory.eINSTANCE.createClassifierReference();
		org.emftext.language.java.classifiers.Class proxy = org.emftext.language.java.classifiers.ClassifiersFactory.eINSTANCE.createClass();
		((InternalEObject) proxy).eSetProxyURI(null);
		proxy.setName(simpleName.getIdentifier());
		ref.setTarget(proxy);
		return ref;
	}
	
	private org.emftext.language.java.imports.Import convertToImport(ImportDeclaration importDecl) {
		if (!importDecl.isOnDemand() && !importDecl.isStatic()) {
			org.emftext.language.java.imports.ClassifierImport convertedImport =
				org.emftext.language.java.imports.ImportsFactory.eINSTANCE.createClassifierImport();
			org.emftext.language.java.classifiers.Class proxy = org.emftext.language.java.classifiers.ClassifiersFactory.eINSTANCE.createClass();
			((InternalEObject) proxy).eSetProxyURI(null);
			convertedImport.setClassifier(proxy);
			this.convertToNamespacesAndSimpleNameAndSet(importDecl.getName(), convertedImport, proxy);
			LayoutInformationConverter.convertToMinimalLayoutInformation(convertedImport, importDecl);
			return convertedImport;
		} else if (!importDecl.isOnDemand() && importDecl.isStatic()) {
			org.emftext.language.java.imports.StaticMemberImport convertedImport =
				org.emftext.language.java.imports.ImportsFactory.eINSTANCE.createStaticMemberImport();
			convertedImport.setStatic(org.emftext.language.java.modifiers.ModifiersFactory.eINSTANCE.createStatic());
			org.emftext.language.java.members.Field proxyMember = org.emftext.language.java.members.MembersFactory.eINSTANCE.createField();
			((InternalEObject) proxyMember).eSetProxyURI(null);
			QualifiedName qualifiedName = (QualifiedName) importDecl.getName();
			proxyMember.setName(qualifiedName.getName().getIdentifier());
			convertedImport.getStaticMembers().add(proxyMember);
			org.emftext.language.java.classifiers.Class proxyClass = org.emftext.language.java.classifiers.ClassifiersFactory.eINSTANCE.createClass();
			((InternalEObject) proxyClass).eSetProxyURI(null);
			convertedImport.setClassifier(proxyClass);
			this.convertToNamespacesAndSimpleNameAndSet(qualifiedName.getQualifier(), convertedImport, proxyClass);
			LayoutInformationConverter.convertToMinimalLayoutInformation(convertedImport, importDecl);
			return convertedImport;
		} else if (importDecl.isOnDemand() && !importDecl.isStatic()) {
			org.emftext.language.java.imports.PackageImport convertedImport = org.emftext.language.java.imports.ImportsFactory.eINSTANCE.createPackageImport();
			this.convertToNamespacesAndSet(importDecl.getName(), convertedImport);
			LayoutInformationConverter.convertToMinimalLayoutInformation(convertedImport, importDecl);
			return convertedImport;
		} else { // importDecl.isOnDemand() && importDecl.isStatic()
			org.emftext.language.java.imports.StaticClassifierImport convertedImport = org.emftext.language.java.imports.ImportsFactory.eINSTANCE.createStaticClassifierImport();
			convertedImport.setStatic(org.emftext.language.java.modifiers.ModifiersFactory.eINSTANCE.createStatic());
			org.emftext.language.java.classifiers.Class proxyClass = org.emftext.language.java.classifiers.ClassifiersFactory.eINSTANCE.createClass();
			((InternalEObject) proxyClass).eSetProxyURI(null);
			convertedImport.setClassifier(proxyClass);
			this.convertToNamespacesAndSimpleNameAndSet(importDecl.getName(), convertedImport, proxyClass);
			LayoutInformationConverter.convertToMinimalLayoutInformation(convertedImport, importDecl);
			return convertedImport;
		}
	}
	
	void convertToNamespacesAndSimpleNameAndSet(Name name, org.emftext.language.java.commons.NamespaceAwareElement namespaceElement,
		org.emftext.language.java.commons.NamedElement namedElement) {
		if (name.isSimpleName()) {
			namedElement.setName(((SimpleName) name).getIdentifier());
		} else if (name.isQualifiedName()) {
			QualifiedName qualifiedName = (QualifiedName) name;
			namedElement.setName(qualifiedName.getName().getIdentifier());
			this.convertToNamespacesAndSet(qualifiedName.getQualifier(), namespaceElement);
		}
	}
	
	void convertToNamespacesAndSet(Name name, org.emftext.language.java.commons.NamespaceAwareElement namespaceElement) {
		if (name.isSimpleName()) {
			SimpleName simpleName = (SimpleName) name;
			namespaceElement.getNamespaces().add(0, simpleName.getIdentifier());
		} else if (name.isQualifiedName()) {
			QualifiedName qualifiedName = (QualifiedName) name;
			namespaceElement.getNamespaces().add(0, qualifiedName.getName().getIdentifier());
			convertToNamespacesAndSet(qualifiedName.getQualifier(), namespaceElement);
		}
	}
	
	void convertToSimpleNameOnlyAndSet(Name name, org.emftext.language.java.commons.NamedElement namedElement) {
		if (name.isSimpleName()) {
			SimpleName simpleName = (SimpleName) name;
			namedElement.setName(simpleName.getIdentifier());
		} else { // name.isQualifiedName()
			QualifiedName qualifiedName = (QualifiedName) name;
			namedElement.setName(qualifiedName.getName().getIdentifier());
		}
	}
}
