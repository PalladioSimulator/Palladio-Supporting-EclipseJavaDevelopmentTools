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
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.ImportDeclaration;
import org.eclipse.jdt.core.dom.ModuleDeclaration;
import org.eclipse.jdt.core.dom.ModuleDirective;
import org.eclipse.jdt.core.dom.ModuleModifier;
import org.eclipse.jdt.core.dom.ModulePackageAccess;
import org.eclipse.jdt.core.dom.Name;
import org.eclipse.jdt.core.dom.ProvidesDirective;
import org.eclipse.jdt.core.dom.QualifiedName;
import org.eclipse.jdt.core.dom.RequiresDirective;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.UsesDirective;

public class JDTASTVisitorAndConverter extends ASTVisitor {
	private org.emftext.language.java.containers.JavaRoot convertedRootElement;
	
	public org.emftext.language.java.containers.JavaRoot getConvertedElement() {
		return convertedRootElement;
	}
	
	@Override
	public boolean visit(CompilationUnit node) {
		if (node.getModule() != null) {
			convertedRootElement = convertToModule(node.getModule());
		} else {
			convertedRootElement = org.emftext.language.java.containers.ContainersFactory.eINSTANCE.createEmptyModel();
		}
		node.imports().forEach(obj -> {
			ImportDeclaration importDecl = (ImportDeclaration) obj;
			convertedRootElement.getImports().add(convertToImport(importDecl));
		});
		return false;
	}
	
	private org.emftext.language.java.containers.Module convertToModule(ModuleDeclaration node) {
		org.emftext.language.java.containers.Module module;
		if (node.isOpen()) {
			module = org.emftext.language.java.modules.ModulesFactory.eINSTANCE.createOpenModule();
		} else {
			module = org.emftext.language.java.modules.ModulesFactory.eINSTANCE.createNormalModule();
		}
		convertToNamespacesAndSet(node.getName(), module);
		node.annotations();
		node.moduleStatements().forEach(statement -> {
			ModuleDirective directive = (ModuleDirective) statement;
			module.getTarget().add(convertToDirective(directive));
		});
		return module;
	}
	
	private org.emftext.language.java.modules.ModuleDirective convertToDirective(ModuleDirective directive) {
		if (directive.getNodeType() == ASTNode.REQUIRES_DIRECTIVE) {
			RequiresDirective reqDir = (RequiresDirective) directive;
			org.emftext.language.java.modules.RequiresModuleDirective result = org.emftext.language.java.modules.ModulesFactory.eINSTANCE.createRequiresModuleDirective();
			reqDir.modifiers().forEach(obj -> {
				ModuleModifier modifier = (ModuleModifier) obj;
				if (modifier.isStatic()) {
					result.getModifiers().add(org.emftext.language.java.modifiers.ModifiersFactory.eINSTANCE.createStatic());
				} else if (modifier.isTransitive()) {
					result.getModifiers().add(org.emftext.language.java.modifiers.ModifiersFactory.eINSTANCE.createTransitive());
				}
			});
			result.setRequiredModule(convertToModuleReference(reqDir.getName()));
			return result;
		} else if (directive.getNodeType() == ASTNode.EXPORTS_DIRECTIVE || directive.getNodeType() == ASTNode.OPENS_DIRECTIVE) {
			ModulePackageAccess accessDir = (ModulePackageAccess) directive;
			org.emftext.language.java.modules.AccessProvidingModuleDirective convertedDir;
			if (directive.getNodeType() == ASTNode.OPENS_DIRECTIVE) {
				convertedDir = org.emftext.language.java.modules.ModulesFactory.eINSTANCE.createOpensModuleDirective();
			} else { // directive.getNodeType() == ASTNode.EXPORTS_DIRECTIVE
				convertedDir = org.emftext.language.java.modules.ModulesFactory.eINSTANCE.createExportsModuleDirective();
			}
			org.emftext.language.java.references.IdentifierReference idRef = org.emftext.language.java.references.ReferencesFactory.eINSTANCE.createIdentifierReference();
			org.emftext.language.java.references.PackageReference target = org.emftext.language.java.references.ReferencesFactory.eINSTANCE.createPackageReference();
			convertToPackageReference(accessDir.getName(), target);
			idRef.setTarget(target);
			convertedDir.setAccessGrantedPackage(idRef);
			accessDir.modules().forEach(obj -> {
				convertedDir.getModules().add(convertToModuleReference((Name) obj));
			});
			return convertedDir;
		} else if (directive.getNodeType() == ASTNode.PROVIDES_DIRECTIVE) {
			ProvidesDirective provDir = (ProvidesDirective) directive;
			org.emftext.language.java.modules.ProvidesModuleDirective result = org.emftext.language.java.modules.ModulesFactory.eINSTANCE.createProvidesModuleDirective();
			result.setTypeReference(convertToClassifierOrNamespaceClassifierReference(provDir.getName()));
			provDir.implementations().forEach(obj -> {
				result.getServiceProviders().add(convertToClassifierOrNamespaceClassifierReference((Name) obj));
			});
			return result;
		} else { // directive.getNodeType() == ASTNode.USES_DIRECTIVE
			UsesDirective usDir = (UsesDirective) directive;
			org.emftext.language.java.modules.UsesModuleDirective result = org.emftext.language.java.modules.ModulesFactory.eINSTANCE.createUsesModuleDirective();
			result.setTypeReference(convertToClassifierOrNamespaceClassifierReference(usDir.getName()));
			return result;
		}
	}
	
	private org.emftext.language.java.modules.ModuleReference convertToModuleReference(Name name) {
		org.emftext.language.java.modules.ModuleReference ref = org.emftext.language.java.modules.ModulesFactory.eINSTANCE.createModuleReference();
		org.emftext.language.java.modules.NormalModule modProxy = org.emftext.language.java.modules.ModulesFactory.eINSTANCE.createNormalModule();
		((InternalEObject) modProxy).eSetProxyURI(null);
		ref.setTarget(modProxy);
		convertToNamespacesAndSet(name, modProxy);
		return ref;
	}
	
	private org.emftext.language.java.references.PackageReference convertToPackageReference(Name name, org.emftext.language.java.references.PackageReference superPackage) {
		if (name.isSimpleName()) {
			SimpleName simpleName = (SimpleName) name;
			superPackage.setName(simpleName.getIdentifier());
			return superPackage;
		} else if (name.isQualifiedName()) {
			QualifiedName qualifiedName = (QualifiedName) name;
			org.emftext.language.java.references.PackageReference superRef = convertToPackageReference(qualifiedName.getQualifier(), superPackage);
			org.emftext.language.java.references.PackageReference subRef = org.emftext.language.java.references.ReferencesFactory.eINSTANCE.createPackageReference();
			subRef.setName(qualifiedName.getName().getIdentifier());
			superRef.getSubpackages().add(subRef);
			return subRef;
		}
		return null;
	}
	
	private org.emftext.language.java.types.TypeReference convertToClassifierOrNamespaceClassifierReference(Name name) {
		if (name.isSimpleName()) {
			return convertToClassifierReference((SimpleName) name);
		} else { // name.isQualifiedName()
			QualifiedName qualifiedName = (QualifiedName) name;
			org.emftext.language.java.types.NamespaceClassifierReference ref = org.emftext.language.java.types.TypesFactory.eINSTANCE.createNamespaceClassifierReference();
			ref.getClassifierReferences().add(0, convertToClassifierReference(qualifiedName.getName()));
			Name qualifier = qualifiedName.getQualifier();
			while(qualifier.isQualifiedName()) {
				qualifiedName = (QualifiedName) qualifier;
				ref.getClassifierReferences().add(0, convertToClassifierReference(qualifiedName.getName()));
				qualifier = qualifiedName.getQualifier();
			}
			ref.getClassifierReferences().add(0, convertToClassifierReference((SimpleName) qualifier));
			return ref;
		}
	}
	
	private org.emftext.language.java.types.ClassifierReference convertToClassifierReference(SimpleName simpleName) {
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
			convertToNamespacesAndSimpleNameAndSet(importDecl.getName(), convertedImport, proxy);
			return convertedImport;
		} else if (!importDecl.isOnDemand() && importDecl.isStatic()) {
			org.emftext.language.java.imports.StaticMemberImport convertedImport =
				org.emftext.language.java.imports.ImportsFactory.eINSTANCE.createStaticMemberImport();
			convertedImport.setStatic(org.emftext.language.java.modifiers.ModifiersFactory.eINSTANCE.createStatic());
			org.emftext.language.java.classifiers.Class proxyType = org.emftext.language.java.classifiers.ClassifiersFactory.eINSTANCE.createClass();
			((InternalEObject) proxyType).eSetProxyURI(null);
			org.emftext.language.java.members.Field proxyMember = org.emftext.language.java.members.MembersFactory.eINSTANCE.createField();
			((InternalEObject) proxyType).eSetProxyURI(null);
			convertedImport.getStaticMembers().add(proxyType);
			convertedImport.getStaticMembers().add(proxyMember);
			convertToMemberNameAndNamespacesAndSimpleNameAndSet(importDecl.getName(), proxyMember, proxyType, convertedImport);
			return convertedImport;
		} else if (importDecl.isOnDemand() && !importDecl.isStatic()) {
			org.emftext.language.java.imports.PackageImport convertedImport = org.emftext.language.java.imports.ImportsFactory.eINSTANCE.createPackageImport();
			convertToNamespacesAndSet(importDecl.getName(), convertedImport);
			return convertedImport;
		} else { // importDecl.isOnDemand() && importDecl.isStatic()
			org.emftext.language.java.imports.StaticClassifierImport convertedImport = org.emftext.language.java.imports.ImportsFactory.eINSTANCE.createStaticClassifierImport();
			convertedImport.setStatic(org.emftext.language.java.modifiers.ModifiersFactory.eINSTANCE.createStatic());
			convertToNamespacesAndSet(importDecl.getName(), convertedImport);
			return convertedImport;
		}
	}
	
	private void convertToMemberNameAndNamespacesAndSimpleNameAndSet(Name name, org.emftext.language.java.commons.NamedElement memberReference,
		org.emftext.language.java.commons.NamedElement memberContainer, org.emftext.language.java.commons.NamespaceAwareElement namespace) {
		QualifiedName qualifiedName = (QualifiedName) name;
		memberReference.setName(qualifiedName.getName().getIdentifier());
		convertToNamespacesAndSimpleNameAndSet(qualifiedName.getQualifier(), namespace, memberContainer);
	}
	
	private void convertToNamespacesAndSimpleNameAndSet(Name name, org.emftext.language.java.commons.NamespaceAwareElement namespaceElement,
		org.emftext.language.java.commons.NamedElement namedElement) {
		if (name.isSimpleName()) {
			namedElement.setName(((SimpleName) name).getIdentifier());
		} else if (name.isQualifiedName()) {
			QualifiedName qualifiedName = (QualifiedName) name;
			namedElement.setName(qualifiedName.getName().getIdentifier());
			convertToNamespacesAndSet(qualifiedName.getQualifier(), namespaceElement);
		}
	}
	
	private void convertToNamespacesAndSet(Name name, org.emftext.language.java.commons.NamespaceAwareElement namespaceElement) {
		if (name.isSimpleName()) {
			SimpleName simpleName = (SimpleName) name;
			namespaceElement.getNamespaces().add(0, simpleName.getIdentifier());
		} else if (name.isQualifiedName()) {
			QualifiedName qualifiedName = (QualifiedName) name;
			namespaceElement.getNamespaces().add(0, qualifiedName.getName().getIdentifier());
			convertToNamespacesAndSet(qualifiedName.getQualifier(), namespaceElement);
		}
	}
}
