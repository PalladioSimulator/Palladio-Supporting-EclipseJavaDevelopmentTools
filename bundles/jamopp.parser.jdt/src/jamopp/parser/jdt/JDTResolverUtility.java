package jamopp.parser.jdt;

import java.util.HashMap;
import java.util.HashSet;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jdt.core.dom.IMethodBinding;
import org.eclipse.jdt.core.dom.IModuleBinding;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.IVariableBinding;

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
	private static HashMap<String, org.emftext.language.java.members.Field> nameToField = new HashMap<>();
	private static HashMap<String, org.emftext.language.java.members.AdditionalField> nameToAddField = new HashMap<>();
	private static HashMap<String, org.emftext.language.java.variables.LocalVariable> nameToLocVar = new HashMap<>();
	private static HashMap<String, org.emftext.language.java.variables.AdditionalLocalVariable> nameToAddLocVar = new HashMap<>();
	private static HashMap<String, org.emftext.language.java.members.EnumConstant> nameToEnumConst = new HashMap<>();
	private static HashMap<String, org.emftext.language.java.parameters.VariableLengthParameter> nameToVarLenParam = new HashMap<>();
	private static HashMap<String, org.emftext.language.java.parameters.OrdinaryParameter> nameToOrdParam = new HashMap<>();
	private static HashMap<String, org.emftext.language.java.parameters.CatchParameter> nameToCatchParam = new HashMap<>();
	private static HashSet<IModuleBinding> moduleBindings = new HashSet<>();
	private static HashSet<ITypeBinding> typeBindings = new HashSet<>();
	private static HashSet<IMethodBinding> methodBindings = new HashSet<>();
	private static HashSet<IVariableBinding> variableBindings = new HashSet<>();
	private static int uid = 0;
	private static HashMap<IVariableBinding, Integer> varBindToUid = new HashMap<>();
	
	static void setResourceSet(ResourceSet set) {
		resourceSet = set;
	}
	
	static org.emftext.language.java.containers.Module getModule(IModuleBinding binding) {
		String modName = binding.getName();
		if (modBindToMod.containsKey(modName)) {
			return modBindToMod.get(modName);
		} else {
			moduleBindings.add(binding);
			org.emftext.language.java.containers.Module result = org.emftext.language.java.containers.ContainersFactory.eINSTANCE.createModule();
			modBindToMod.put(modName, result);
			return result;
		}
	}
	
	private static String convertToTypeName(ITypeBinding binding) {
		if (binding == null) {
			return "";
		}
		String qualifiedName = binding.getQualifiedName();
		if (qualifiedName.contains("<")) {
			qualifiedName = qualifiedName.substring(0, qualifiedName.indexOf("<"));
		}
		if (qualifiedName.contains("[")) {
			qualifiedName = qualifiedName.substring(0, qualifiedName.indexOf("["));
		}
		return qualifiedName;
	}
	
	static org.emftext.language.java.classifiers.Annotation getAnnotation(ITypeBinding binding) {
		String annotName = convertToTypeName(binding);
		if (typeBindToAnnot.containsKey(annotName)) {
			return typeBindToAnnot.get(annotName);
		} else {
			typeBindings.add(binding);
			org.emftext.language.java.classifiers.Annotation result = org.emftext.language.java.classifiers.ClassifiersFactory.eINSTANCE.createAnnotation();
			typeBindToAnnot.put(annotName, result);
			return result;
		}
	}
	
	static org.emftext.language.java.classifiers.Enumeration getEnumeration(ITypeBinding binding) {
		String enumName = convertToTypeName(binding);
		if (typeBindToEnum.containsKey(enumName)) {
			return typeBindToEnum.get(enumName);
		} else {
			typeBindings.add(binding);
			org.emftext.language.java.classifiers.Enumeration result = org.emftext.language.java.classifiers.ClassifiersFactory.eINSTANCE.createEnumeration();
			typeBindToEnum.put(enumName, result);
			return result;
		}
	}
	
	static org.emftext.language.java.classifiers.Class getClass(ITypeBinding binding) {
		typeBindings.add(binding);
		return getClass(convertToTypeName(binding));
	}
	
	static org.emftext.language.java.classifiers.Interface getInterface(ITypeBinding binding) {
		String interName = convertToTypeName(binding);
		if (typeBindToInterface.containsKey(interName)) {
			return typeBindToInterface.get(interName);
		} else {
			typeBindings.add(binding);
			org.emftext.language.java.classifiers.Interface result = org.emftext.language.java.classifiers.ClassifiersFactory.eINSTANCE.createInterface();
			typeBindToInterface.put(interName, result);
			return result;
		}
	}
	
	static org.emftext.language.java.generics.TypeParameter getTypeParameter(ITypeBinding binding) {
		String paramName = convertToTypeName(binding);
		if (typeBindToTP.containsKey(paramName)) {
			return typeBindToTP.get(paramName);
		} else {
			typeBindings.add(binding);
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
		} else if (binding.isArray()) {
			return getClassifier(binding.getElementType());
		}
		return null;
	}
	
	private static String convertToMethodName(IMethodBinding binding) {
		StringBuilder builder = new StringBuilder();
		builder.append(convertToTypeName(binding.getDeclaringClass()));
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
			methodBindings.add(binding);
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
			methodBindings.add(binding);
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
			methodBindings.add(binding);
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
	
	static boolean isMappingRegistered(ITypeBinding binding) {
		if (binding == null) {
			return false;
		}
		return isMappingRegistered(binding.getQualifiedName());
	}
	
	static boolean isMappingRegistered(String typeName) {
		return typeBindToAnnot.containsKey(typeName) || typeBindToEnum.containsKey(typeName) || typeBindToInterface.containsKey(typeName)
				|| typeBindToClass.containsKey(typeName) || typeBindToTP.containsKey(typeName);
	}
	
	static org.emftext.language.java.classifiers.Class getClass(String typeName) {
		if (typeBindToClass.containsKey(typeName)) {
			return typeBindToClass.get(typeName);
		} else {
			org.emftext.language.java.classifiers.Class result = org.emftext.language.java.classifiers.ClassifiersFactory.eINSTANCE.createClass();
			typeBindToClass.put(typeName, result);
			return result;
		}
	}
	
	private static String convertToFieldName(IVariableBinding binding) {
		if (binding == null || !binding.isField()) {
			return "";
		}
		return convertToTypeName(binding.getDeclaringClass()) + "::" + binding.getName();
	}
	
	static org.emftext.language.java.members.Field getField(IVariableBinding binding) {
		String varName = convertToFieldName(binding);
		if (nameToField.containsKey(varName)) {
			return nameToField.get(varName);
		} else {
			variableBindings.add(binding);
			org.emftext.language.java.members.Field result = org.emftext.language.java.members.MembersFactory.eINSTANCE.createField();
			nameToField.put(varName, result);
			return result;
		}
	}
	
	static org.emftext.language.java.members.EnumConstant getEnumConstant(IVariableBinding binding) {
		String enumCN = convertToFieldName(binding);
		if (nameToEnumConst.containsKey(enumCN)) {
			return nameToEnumConst.get(enumCN);
		} else {
			variableBindings.add(binding);
			org.emftext.language.java.members.EnumConstant result = org.emftext.language.java.members.MembersFactory.eINSTANCE.createEnumConstant();
			nameToEnumConst.put(enumCN, result);
			return result;
		}
	}
	
	static org.emftext.language.java.members.AdditionalField getAdditionalField(IVariableBinding binding) {
		String varName = convertToFieldName(binding);
		if (nameToAddField.containsKey(varName)) {
			return nameToAddField.get(varName);
		} else {
			variableBindings.add(binding);
			org.emftext.language.java.members.AdditionalField result = org.emftext.language.java.members.MembersFactory.eINSTANCE.createAdditionalField();
			nameToAddField.put(varName, result);
			return result;
		}
	}
	
	private static String convertToParameterName(IVariableBinding binding, boolean register) {
		if (binding == null) {
			return "";
		}
		String prefix = "";
		if (binding.getDeclaringMethod() != null) {
			prefix = convertToMethodName(binding.getDeclaringMethod());
		} else if (varBindToUid.containsKey(binding)) {
			prefix = varBindToUid.get(binding) + "";
		} else {
			prefix = uid + "";
			if (register) {
				varBindToUid.put(binding, uid);
			}
		}
		return prefix + "::" + binding.getName() + "::" + binding.getVariableId();
	}
	
	private static String convertToLocalVariableName(IVariableBinding binding, boolean register) {
		if (binding == null) {
			return "";
		}
		String prefix = "";
		if (binding.getDeclaringMethod() != null) {
			prefix = convertToMethodName(binding.getDeclaringMethod());
		} else if (varBindToUid.containsKey(binding)) {
			prefix = varBindToUid.get(binding) + "";
		} else {
			prefix = uid + "";
			if (register) {
				varBindToUid.put(binding, uid);
			}
		}
		return prefix + "::" + binding.getName() + "::" + binding.getVariableId();
	}
	
	static org.emftext.language.java.variables.LocalVariable getLocalVariable(IVariableBinding binding) {
		String varName = convertToLocalVariableName(binding, true);
		if (nameToLocVar.containsKey(varName)) {
			return nameToLocVar.get(varName);
		} else {
			variableBindings.add(binding);
			org.emftext.language.java.variables.LocalVariable result = org.emftext.language.java.variables.VariablesFactory.eINSTANCE.createLocalVariable();
			nameToLocVar.put(varName, result);
			return result;
		}
	}
	
	static org.emftext.language.java.variables.AdditionalLocalVariable getAdditionalLocalVariable(IVariableBinding binding) {
		String varName = convertToLocalVariableName(binding, true);
		if (nameToAddLocVar.containsKey(varName)) {
			return nameToAddLocVar.get(varName);
		} else {
			variableBindings.add(binding);
			org.emftext.language.java.variables.AdditionalLocalVariable result = org.emftext.language.java.variables.VariablesFactory.eINSTANCE.createAdditionalLocalVariable();
			nameToAddLocVar.put(varName, result);
			return result;
		}
	}
	
	static org.emftext.language.java.parameters.OrdinaryParameter getOrdinaryParameter(IVariableBinding binding) {
		String paramName = convertToParameterName(binding, true);
		if (nameToOrdParam.containsKey(paramName)) {
			return nameToOrdParam.get(paramName);
		} else {
			variableBindings.add(binding);
			org.emftext.language.java.parameters.OrdinaryParameter result = org.emftext.language.java.parameters.ParametersFactory.eINSTANCE.createOrdinaryParameter();
			nameToOrdParam.put(paramName, result);
			return result;
		}
	}
	
	static org.emftext.language.java.parameters.VariableLengthParameter getVariableLengthParameter(IVariableBinding binding) {
		String paramName = convertToParameterName(binding, true);
		if (nameToVarLenParam.containsKey(paramName)) {
			return nameToVarLenParam.get(paramName);
		} else {
			variableBindings.add(binding);
			org.emftext.language.java.parameters.VariableLengthParameter result = org.emftext.language.java.parameters.ParametersFactory.eINSTANCE.createVariableLengthParameter();
			nameToVarLenParam.put(paramName, result);
			return result;
		}
	}
	
	static org.emftext.language.java.parameters.CatchParameter getCatchParameter(IVariableBinding binding) {
		String paramName = convertToParameterName(binding, true);
		if (nameToCatchParam.containsKey(paramName)) {
			return nameToCatchParam.get(paramName);
		} else {
			variableBindings.add(binding);
			org.emftext.language.java.parameters.CatchParameter result = org.emftext.language.java.parameters.ParametersFactory.eINSTANCE.createCatchParameter();
			nameToCatchParam.put(paramName, result);
			return result;
		}
	}
	
	static void prepareNextUid() {
		uid++;
	}
	
	static org.emftext.language.java.references.ReferenceableElement getReferencableElement(IVariableBinding binding) {
		if (binding.isEnumConstant()) {
			return getEnumConstant(binding);
		} else if (binding.isField()) {
			String fieldName = convertToFieldName(binding);
			if (nameToField.containsKey(fieldName)) {
				return nameToField.get(fieldName);
			} else if (nameToAddField.containsKey(fieldName)) {
				nameToAddField.get(fieldName);
			} else {
				return getField(binding);
			}
		} else if (binding.isParameter()) {
			String paramName = convertToParameterName(binding, false);
			if (nameToCatchParam.containsKey(paramName)) {
				return nameToCatchParam.get(paramName);
			} else if (nameToOrdParam.containsKey(paramName)) {
				return nameToOrdParam.get(paramName);
			} else if (nameToVarLenParam.containsKey(paramName)) {
				return nameToVarLenParam.get(paramName);
			} else {
				return getOrdinaryParameter(binding);
			}
		} else {
			String varName = convertToLocalVariableName(binding, false);
			if (nameToLocVar.containsKey(varName)) {
				return nameToLocVar.get(varName);
			} else if (nameToAddLocVar.containsKey(varName)) {
				return nameToAddLocVar.get(varName);
			} else {
				return getLocalVariable(binding);
			}
		}
		return null;
	}
	
	static void completeResolution() {
		modBindToMod.forEach((modName, module) -> {
			if (module.eContainer() == null) {
				Resource newResource = resourceSet.createResource(URI.createHierarchicalURI("empty", "JaMoPP-Module", null,
					new String[] {modName, "module-info.java"}, null, null));
				newResource.getContents().add(module);
			}
		});
		
		nameToEnumConst.forEach((constName, enConst) -> {
			if (enConst.eContainer() == null) {
				IVariableBinding varBind = variableBindings.stream().filter(var -> constName.equals(convertToFieldName(var)))
					.findFirst().get();
				org.emftext.language.java.classifiers.Enumeration enume = getEnumeration(varBind.getDeclaringClass());
				enume.getConstants().add(enConst);
			}
		});
		
		nameToField.forEach((fieldName, field) -> {
			if (field.eContainer() == null) {
				IVariableBinding varBind = variableBindings.stream().filter(var -> fieldName.equals(convertToFieldName(var)))
					.findFirst().get();
				org.emftext.language.java.classifiers.ConcreteClassifier classifier = (org.emftext.language.java.classifiers.ConcreteClassifier)
					getClassifier(varBind.getDeclaringClass());
				classifier.getMembers().add(field);
			}
		});
		
		methBindToConstr.forEach(JDTResolverUtility::completeMethod);
		
		methBindToInter.forEach(JDTResolverUtility::completeMethod);
		
		methBindToCM.forEach(JDTResolverUtility::completeMethod);
		
		typeBindToClass.forEach(JDTResolverUtility::completeType);
		
		typeBindToInterface.forEach(JDTResolverUtility::completeType);
		
		typeBindToAnnot.forEach(JDTResolverUtility::completeType);
		
		typeBindToEnum.forEach(JDTResolverUtility::completeType);
		
		modBindToMod.clear();
		typeBindToAnnot.clear();
		typeBindToEnum.clear();
		typeBindToInterface.clear();
		typeBindToClass.clear();
		typeBindToTP.clear();
		methBindToInter.clear();
		methBindToCM.clear();
		methBindToConstr.clear();
		nameToField.clear();
		nameToAddField.clear();
		nameToLocVar.clear();
		nameToAddLocVar.clear();
		nameToEnumConst.clear();
		nameToVarLenParam.clear();
		nameToOrdParam.clear();
		nameToCatchParam.clear();
		moduleBindings.clear();
		typeBindings.clear();
		methodBindings.clear();
		variableBindings.clear();
		uid = 0;
		varBindToUid.clear();
	}
	
	private static void completeMethod(String methodName, org.emftext.language.java.members.Member method) {
		if (method.eContainer() == null) {
			IMethodBinding methBind = methodBindings.stream().filter(meth -> methodName.equals(convertToMethodName(meth)))
				.findFirst().get();
			org.emftext.language.java.classifiers.ConcreteClassifier classifier = (org.emftext.language.java.classifiers.ConcreteClassifier)
				getClassifier(methBind.getDeclaringClass());
			classifier.getMembers().add(method);
		}
	}
	
	private static void completeType(String typeName, org.emftext.language.java.classifiers.ConcreteClassifier classifier) {
		if (classifier.eContainer() == null) {
			ITypeBinding typeBind = typeBindings.stream().filter(type -> typeName.equals(convertToTypeName(type)))
				.findFirst().orElse(null);
			if (typeBind == null || typeBind.isTopLevel()) {
				org.emftext.language.java.containers.CompilationUnit cu = org.emftext.language.java.containers.ContainersFactory.eINSTANCE.createCompilationUnit();
				cu.setName("");
				cu.getClassifiers().add(classifier);
				String[] namespaces = typeName.substring(0, typeName.length() -
					(typeBind == null ? typeName.length() - 1 : typeBind.getName().length()) - 1).split(".");
				for (int index = 0; index < namespaces.length; index++) {
					cu.getNamespaces().add(namespaces[index]);
				}
				Resource newResource = resourceSet.createResource(URI.createHierarchicalURI("empty",
					"JaMoPP-CompilationUnit", null, new String[] {typeName + ".java"}, null, null));
				newResource.getContents().add(cu);
			} else if (typeBind.isNested()) {
				org.emftext.language.java.classifiers.ConcreteClassifier parentClassifier = (org.emftext.language.java.classifiers.ConcreteClassifier)
					getClassifier(typeBind.getDeclaringClass());
				completeType(typeBind.getDeclaringClass().getQualifiedName(), parentClassifier);
				if (!parentClassifier.getMembers().contains(classifier)) {
					parentClassifier.getMembers().add(classifier);
				}
			} else if (typeBind.isArray()) {
				ITypeBinding elementType = typeBind.getElementType();
				if (!elementType.isPrimitive() && !elementType.isTypeVariable()) {
					completeType(typeName, (org.emftext.language.java.classifiers.ConcreteClassifier) getClassifier(elementType));
				}
			}
		}
	}
}
