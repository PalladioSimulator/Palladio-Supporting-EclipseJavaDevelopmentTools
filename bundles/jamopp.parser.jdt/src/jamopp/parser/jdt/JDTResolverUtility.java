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
	private static HashMap<ITypeBinding, org.emftext.language.java.generics.TypeParameter> typeBindToTP = new HashMap<>();
	private static HashMap<IMethodBinding, org.emftext.language.java.members.InterfaceMethod> methBindToInter = new HashMap<>();
	private static HashMap<IMethodBinding, org.emftext.language.java.members.ClassMethod> methBindToCM = new HashMap<>();
	private static HashMap<IMethodBinding, org.emftext.language.java.members.Constructor> methBindToConstr = new HashMap<>();
	
	static void setResourceSet(ResourceSet set) {
		resourceSet = set;
	}
	
	static org.emftext.language.java.containers.Module getModule(IModuleBinding binding) {
		if (modBindToMod.containsKey(binding)) {
			return modBindToMod.get(binding);
		} else {
			org.emftext.language.java.containers.Module result = org.emftext.language.java.containers.ContainersFactory.eINSTANCE.createModule();
			modBindToMod.put(binding, result);
			return result;
		}
	}
	
	static org.emftext.language.java.classifiers.Annotation getAnnotation(ITypeBinding binding) {
		if (typeBindToAnnot.containsKey(binding)) {
			return typeBindToAnnot.get(binding);
		} else {
			org.emftext.language.java.classifiers.Annotation result = org.emftext.language.java.classifiers.ClassifiersFactory.eINSTANCE.createAnnotation();
			typeBindToAnnot.put(binding, result);
			return result;
		}
	}
	
	static org.emftext.language.java.classifiers.Enumeration getEnumeration(ITypeBinding binding) {
		if (typeBindToEnum.containsKey(binding)) {
			return typeBindToEnum.get(binding);
		} else {
			org.emftext.language.java.classifiers.Enumeration result = org.emftext.language.java.classifiers.ClassifiersFactory.eINSTANCE.createEnumeration();
			typeBindToEnum.put(binding, result);
			return result;
		}
	}
	
	static org.emftext.language.java.classifiers.Class getClass(ITypeBinding binding) {
		if (typeBindToClass.containsKey(binding)) {
			return typeBindToClass.get(binding);
		} else {
			org.emftext.language.java.classifiers.Class result = org.emftext.language.java.classifiers.ClassifiersFactory.eINSTANCE.createClass();
			typeBindToClass.put(binding, result);
			return result;
		}
	}
	
	static org.emftext.language.java.classifiers.Interface getInterface(ITypeBinding binding) {
		if (typeBindToInterface.containsKey(binding)) {
			return typeBindToInterface.get(binding);
		} else {
			org.emftext.language.java.classifiers.Interface result = org.emftext.language.java.classifiers.ClassifiersFactory.eINSTANCE.createInterface();
			typeBindToInterface.put(binding, result);
			return result;
		}
	}
	
	static org.emftext.language.java.generics.TypeParameter getTypeParameter(ITypeBinding binding) {
		if (typeBindToTP.containsKey(binding)) {
			return typeBindToTP.get(binding);
		} else {
			org.emftext.language.java.generics.TypeParameter result = org.emftext.language.java.generics.GenericsFactory.eINSTANCE.createTypeParameter();
			typeBindToTP.put(binding, result);
			return result;
		}
	}
	
	static org.emftext.language.java.classifiers.Classifier getClassifier(ITypeBinding binding) {
		if (binding.isAnnotation()) {
			return getAnnotation(binding);
		} else if (binding.isInterface()) {
			return getInterface(binding);
		} else if (binding.isEnum()) {
			return getEnumeration(binding);
		} else if (binding.isClass()) {
			return getClass(binding);
		} else if (binding.isTypeVariable()) {
			return getTypeParameter(binding);
		}
		return null;
	}
	
	static org.emftext.language.java.members.InterfaceMethod getInterfaceMethod(IMethodBinding binding) {
		if (methBindToInter.containsKey(binding)) {
			return methBindToInter.get(binding);
		} else {
			org.emftext.language.java.members.InterfaceMethod result = org.emftext.language.java.members.MembersFactory.eINSTANCE.createInterfaceMethod();
			methBindToInter.put(binding, result);
			return result;
		}
	}
	
	static org.emftext.language.java.members.ClassMethod getClassMethod(IMethodBinding binding) {
		if (methBindToCM.containsKey(binding)) {
			return methBindToCM.get(binding);
		} else {
			org.emftext.language.java.members.ClassMethod result = org.emftext.language.java.members.MembersFactory.eINSTANCE.createClassMethod();
			methBindToCM.put(binding, result);
			return result;
		}
	}
	
	static org.emftext.language.java.members.Constructor getConstructor(IMethodBinding binding) {
		if (methBindToConstr.containsKey(binding)) {
			return methBindToConstr.get(binding);
		} else {
			org.emftext.language.java.members.Constructor result = org.emftext.language.java.members.MembersFactory.eINSTANCE.createConstructor();
			methBindToConstr.put(binding, result);
			return result;
		}
	}
	
	static org.emftext.language.java.members.Method getMethod(IMethodBinding binding) {
		if (binding.getDeclaringClass().isClass()) {
			return getClassMethod(binding);
		} else {
			return getInterfaceMethod(binding);
		}
	}
	
	static void completeResolution() {
		// CompilationUnits
//		Resource newResource = resourceSet.createResource(URI.createHierarchicalURI("empty", "JaMoPP-CompilationUnit", null, new String[] {binding.getQualifiedName() + ".java"}, null, null));
//		newResource.getContents().add(result);
		
		// Annotations
//		if (binding.isNested()) {
//			org.emftext.language.java.classifiers.ConcreteClassifier classifier = getConcreteClassifier(binding.getDeclaringClass());
//			classifier.getMembers().add(result);
//		} else {
//			org.emftext.language.java.containers.CompilationUnit cu = getCompilationUnit(binding);
//			cu.getClassifiers().add(result);
//		}
		
		// Modules
//		Resource newResource = resourceSet.createResource(URI.createHierarchicalURI("empty", "JaMoPP-Module", null, new String[] {binding.getName(), "module-info.java"}, null, null));
//		newResource.getContents().add(result);
	}
}
