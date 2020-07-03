package jamopp.parser.jdt;

import java.util.HashMap;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jdt.core.dom.IMethodBinding;
import org.eclipse.jdt.core.dom.IModuleBinding;
import org.eclipse.jdt.core.dom.ITypeBinding;

public class JDTResolverUtility {
	private static ResourceSet resourceSet;
	private static HashMap<IModuleBinding, org.emftext.language.java.containers.Module> modBindToMod = new HashMap<>();
	private static HashMap<ITypeBinding, org.emftext.language.java.classifiers.Annotation> typeBindToAnnot = new HashMap<>();
	private static HashMap<ITypeBinding, org.emftext.language.java.classifiers.Enumeration> typeBindToEnum = new HashMap<>();
	private static HashMap<ITypeBinding, org.emftext.language.java.classifiers.Interface> typeBindToInterface = new HashMap<>();
	private static HashMap<ITypeBinding, org.emftext.language.java.classifiers.Class> typeBindToClass = new HashMap<>();
	private static HashMap<ITypeBinding, org.emftext.language.java.containers.CompilationUnit> typeBindToCU = new HashMap<>();
	private static HashMap<IMethodBinding, org.emftext.language.java.members.InterfaceMethod> methBindToInter = new HashMap<>();
	
	static void setResourceSet(ResourceSet set) {
		resourceSet = set;
	}
	
	static org.emftext.language.java.containers.Module getModule(IModuleBinding binding) {
		if (modBindToMod.containsKey(binding)) {
			return modBindToMod.get(binding);
		} else {
			org.emftext.language.java.containers.Module result = org.emftext.language.java.containers.ContainersFactory.eINSTANCE.createModule();
			Resource newResource = resourceSet.createResource(URI.createHierarchicalURI("empty", "JaMoPP-Module", null, new String[] {binding.getName(), "module-info.java"}, null, null));
			newResource.getContents().add(result);
			modBindToMod.put(binding, result);
			return result;
		}
	}
	
	static org.emftext.language.java.classifiers.Annotation getAnnotation(ITypeBinding binding) {
		if (typeBindToAnnot.containsKey(binding)) {
			return typeBindToAnnot.get(binding);
		} else {
			org.emftext.language.java.classifiers.Annotation result = org.emftext.language.java.classifiers.ClassifiersFactory.eINSTANCE.createAnnotation();
			if (binding.isNested()) {
				org.emftext.language.java.classifiers.ConcreteClassifier classifier = getConcreteClassifier(binding.getDeclaringClass());
				classifier.getMembers().add(result);
			} else {
				org.emftext.language.java.containers.CompilationUnit cu = getCompilationUnit(binding);
				cu.getClassifiers().add(result);
			}
			typeBindToAnnot.put(binding, result);
			return result;
		}
	}
	
	static org.emftext.language.java.classifiers.ConcreteClassifier getConcreteClassifier(ITypeBinding binding) {
		if (binding.isAnnotation()) {
			return getAnnotation(binding);
		} else if (binding.isInterface()) {
			
		} else if (binding.isEnum()) {
			
		} else if (binding.isClass()) {
			
		}
		return null;
	}
	
	static org.emftext.language.java.containers.CompilationUnit getCompilationUnit(ITypeBinding binding) {
		if (typeBindToCU.containsKey(binding)) {
			return typeBindToCU.get(binding);
		}
		else {
			org.emftext.language.java.containers.CompilationUnit result = org.emftext.language.java.containers.ContainersFactory.eINSTANCE.createCompilationUnit();
			Resource newResource = resourceSet.createResource(URI.createHierarchicalURI("empty", "JaMoPP-CompilationUnit", null, new String[] {binding.getQualifiedName() + ".java"}, null, null));
			newResource.getContents().add(result);
			typeBindToCU.put(binding, result);
			return result;
		}
	}
	
	static void updateMapping(ITypeBinding binding, org.emftext.language.java.containers.CompilationUnit cu) {
		typeBindToCU.put(binding, cu);
	}
	
	static org.emftext.language.java.members.InterfaceMethod getInterfaceMethod(IMethodBinding binding) {
		if (methBindToInter.containsKey(binding)) {
			return methBindToInter.get(binding);
		} else {
			org.emftext.language.java.members.InterfaceMethod result = org.emftext.language.java.members.MembersFactory.eINSTANCE.createInterfaceMethod();
			org.emftext.language.java.classifiers.ConcreteClassifier parent = getConcreteClassifier(binding.getDeclaringClass());
			parent.getMembers().add(result);
			methBindToInter.put(binding, result);
			return result;
		}
	}
}
