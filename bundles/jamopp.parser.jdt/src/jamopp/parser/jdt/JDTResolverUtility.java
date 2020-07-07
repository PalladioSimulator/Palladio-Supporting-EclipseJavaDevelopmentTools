package jamopp.parser.jdt;

import java.util.HashMap;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jdt.core.dom.IMethodBinding;
import org.eclipse.jdt.core.dom.IModuleBinding;
import org.eclipse.jdt.core.dom.ITypeBinding;

public class JDTResolverUtility {
	private static ResourceSet resourceSet;
	private static HashMap<String, org.emftext.language.java.containers.Module> modBindToMod = new HashMap<>();
	private static HashMap<String, org.emftext.language.java.classifiers.Annotation> typeBindToAnnot = new HashMap<>();
	private static HashMap<String, org.emftext.language.java.classifiers.Enumeration> typeBindToEnum = new HashMap<>();
	private static HashMap<String, org.emftext.language.java.classifiers.Interface> typeBindToInterface = new HashMap<>();
	private static HashMap<String, org.emftext.language.java.classifiers.Class> typeBindToClass = new HashMap<>();
	private static HashMap<String, org.emftext.language.java.generics.TypeParameter> typeBindToTP = new HashMap<>();
	private static HashMap<String, org.emftext.language.java.members.InterfaceMethod> methBindToInter = new HashMap<>();
	private static HashMap<String, org.emftext.language.java.members.ClassMethod> methBindToCM = new HashMap<>();
	private static HashMap<String, org.emftext.language.java.members.Constructor> methBindToConstr = new HashMap<>();
	
	static void setResourceSet(ResourceSet set) {
		resourceSet = set;
	}
	
	static org.emftext.language.java.containers.Module getModule(IModuleBinding binding) {
		String modName = binding.getName();
		if (modBindToMod.containsKey(modName)) {
			return modBindToMod.get(modName);
		} else {
			org.emftext.language.java.containers.Module result = org.emftext.language.java.containers.ContainersFactory.eINSTANCE.createModule();
			modBindToMod.put(modName, result);
			return result;
		}
	}
	
	static org.emftext.language.java.classifiers.Annotation getAnnotation(ITypeBinding binding) {
		String annotName = binding.getQualifiedName();
		if (typeBindToAnnot.containsKey(annotName)) {
			return typeBindToAnnot.get(annotName);
		} else {
			org.emftext.language.java.classifiers.Annotation result = org.emftext.language.java.classifiers.ClassifiersFactory.eINSTANCE.createAnnotation();
			typeBindToAnnot.put(annotName, result);
			return result;
		}
	}
	
	static org.emftext.language.java.classifiers.Enumeration getEnumeration(ITypeBinding binding) {
		String enumName = binding.getQualifiedName();
		if (typeBindToEnum.containsKey(enumName)) {
			return typeBindToEnum.get(enumName);
		} else {
			org.emftext.language.java.classifiers.Enumeration result = org.emftext.language.java.classifiers.ClassifiersFactory.eINSTANCE.createEnumeration();
			typeBindToEnum.put(enumName, result);
			return result;
		}
	}
	
	static org.emftext.language.java.classifiers.Class getClass(ITypeBinding binding) {
		String className = binding.getQualifiedName();
		if (typeBindToClass.containsKey(className)) {
			return typeBindToClass.get(className);
		} else {
			org.emftext.language.java.classifiers.Class result = org.emftext.language.java.classifiers.ClassifiersFactory.eINSTANCE.createClass();
			typeBindToClass.put(className, result);
			return result;
		}
	}
	
	static org.emftext.language.java.classifiers.Interface getInterface(ITypeBinding binding) {
		String interName = binding.getQualifiedName();
		if (typeBindToInterface.containsKey(interName)) {
			return typeBindToInterface.get(interName);
		} else {
			org.emftext.language.java.classifiers.Interface result = org.emftext.language.java.classifiers.ClassifiersFactory.eINSTANCE.createInterface();
			typeBindToInterface.put(interName, result);
			return result;
		}
	}
	
	static org.emftext.language.java.generics.TypeParameter getTypeParameter(ITypeBinding binding) {
		String paramName = binding.getQualifiedName();
		if (typeBindToTP.containsKey(paramName)) {
			return typeBindToTP.get(paramName);
		} else {
			org.emftext.language.java.generics.TypeParameter result = org.emftext.language.java.generics.GenericsFactory.eINSTANCE.createTypeParameter();
			typeBindToTP.put(paramName, result);
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
	
	private static String convertToMethodName(IMethodBinding binding) {
		StringBuilder builder = new StringBuilder();
		builder.append(binding.getDeclaringClass().getQualifiedName());
		builder.append("::");
		builder.append(binding.getName());
		builder.append("(");
		for (ITypeBinding p : binding.getParameterTypes()) {
			builder.append(p.getQualifiedName());
		}
		builder.append(")");
		builder.append(binding.getReturnType().getQualifiedName());
		return builder.toString();
	}
	
	static org.emftext.language.java.members.InterfaceMethod getInterfaceMethod(IMethodBinding binding) {
		String methName = convertToMethodName(binding);
		if (methBindToInter.containsKey(methName)) {
			return methBindToInter.get(methName);
		} else {
			org.emftext.language.java.members.InterfaceMethod result = org.emftext.language.java.members.MembersFactory.eINSTANCE.createInterfaceMethod();
			methBindToInter.put(methName, result);
			return result;
		}
	}
	
	static org.emftext.language.java.members.ClassMethod getClassMethod(IMethodBinding binding) {
		String methName = convertToMethodName(binding);
		if (methBindToCM.containsKey(methName)) {
			return methBindToCM.get(methName);
		} else {
			org.emftext.language.java.members.ClassMethod result = org.emftext.language.java.members.MembersFactory.eINSTANCE.createClassMethod();
			methBindToCM.put(methName, result);
			return result;
		}
	}
	
	static org.emftext.language.java.members.Constructor getConstructor(IMethodBinding binding) {
		String methName = convertToMethodName(binding);
		if (methBindToConstr.containsKey(methName)) {
			return methBindToConstr.get(methName);
		} else {
			org.emftext.language.java.members.Constructor result = org.emftext.language.java.members.MembersFactory.eINSTANCE.createConstructor();
			methBindToConstr.put(methName, result);
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
