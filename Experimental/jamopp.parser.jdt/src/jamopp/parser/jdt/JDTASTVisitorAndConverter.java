package jamopp.parser.jdt;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.ImportDeclaration;
import org.eclipse.jdt.core.dom.ModuleDeclaration;
import org.eclipse.jdt.core.dom.ModuleDirective;
import org.eclipse.jdt.core.dom.Name;
import org.eclipse.jdt.core.dom.QualifiedName;
import org.eclipse.jdt.core.dom.SimpleName;

public class JDTASTVisitorAndConverter extends ASTVisitor {
	@Override
	public boolean visit(CompilationUnit node) {
		org.emftext.language.java.containers.JavaRoot root;
		if (node.getModule() != null) {
			root = convertToModule(node.getModule());
		} else {
			root = org.emftext.language.java.containers.ContainersFactory.eINSTANCE.createEmptyModel();
		}
		node.imports().forEach(obj -> {
			ImportDeclaration importDecl = (ImportDeclaration) obj;
			root.getImports().add(convertToImport(importDecl));
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
		return null;
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
