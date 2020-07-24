package jamopp.parser.jdt;

import java.util.HashMap;
import java.util.HashSet;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jdt.core.dom.IMethodBinding;
import org.eclipse.jdt.core.dom.IModuleBinding;
import org.eclipse.jdt.core.dom.IPackageBinding;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.IVariableBinding;
import org.emftext.language.java.JavaClasspath;

public class JDTResolverUtility {
	private static ResourceSet resourceSet;
	private static HashMap<String, org.emftext.language.java.containers.Module> modBindToMod = new HashMap<>();
	private static HashMap<String, org.emftext.language.java.containers.Package> nameToPackage = new HashMap<>();
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
	private static HashSet<IPackageBinding> packageBindings = new HashSet<>();
	private static HashSet<ITypeBinding> typeBindings = new HashSet<>();
	private static HashSet<IMethodBinding> methodBindings = new HashSet<>();
	private static HashSet<IVariableBinding> variableBindings = new HashSet<>();
	private static int uid = 0;
	private static HashMap<IVariableBinding, Integer> varBindToUid = new HashMap<>();
	
	static void setResourceSet(ResourceSet set) {
		resourceSet = set;
	}
	
	static org.emftext.language.java.containers.Module getModule(IModuleBinding binding) {
		moduleBindings.add(binding);
		return getModule(binding.getName());
	}
	
	private static org.emftext.language.java.containers.Module getModule(String modName) {
		if (modBindToMod.containsKey(modName)) {
			return modBindToMod.get(modName);
		} else {
			org.emftext.language.java.containers.Module result = JavaClasspath.get().getModule(modName);
			if (result == null) {
				result = org.emftext.language.java.containers.ContainersFactory.eINSTANCE.createModule();
			}
			modBindToMod.put(modName, result);
			return result;
		}
	}
	
	static org.emftext.language.java.containers.Package getPackage(IPackageBinding binding) {
		packageBindings.add(binding);
		return getPackage(binding.getName());
	}
	
	private static org.emftext.language.java.containers.Package getPackage(String packageName) {
		if (nameToPackage.containsKey(packageName)) {
			return nameToPackage.get(packageName);
		} else {
			org.emftext.language.java.containers.Package result = JavaClasspath.get().getPackage(packageName);
			if (result == null) {
				result = org.emftext.language.java.containers.ContainersFactory.eINSTANCE.createPackage();
			}
			nameToPackage.put(packageName, result);
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
	
	private static String convertToSimpleTypeName(ITypeBinding binding) {
		if (binding == null) {
			return "";
		}
		String name = binding.getName();
		if (name.contains("<")) {
			name = name.substring(0, name.indexOf("<"));
		}
		if (name.contains("[")) {
			name = name.substring(0, name.indexOf("["));
		}
		return name;
	}
	
	static org.emftext.language.java.classifiers.Annotation getAnnotation(ITypeBinding binding) {
		String annotName = convertToTypeName(binding);
		if (typeBindToAnnot.containsKey(annotName)) {
			return typeBindToAnnot.get(annotName);
		} else {
			typeBindings.add(binding);
			org.emftext.language.java.classifiers.Annotation result = (org.emftext.language.java.classifiers.Annotation)
				JavaClasspath.get().getConcreteClassifier(annotName);
			if (result == null) {
				result = org.emftext.language.java.classifiers.ClassifiersFactory.eINSTANCE.createAnnotation();
			}
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
			org.emftext.language.java.classifiers.ConcreteClassifier classifier = JavaClasspath.get().getConcreteClassifier(enumName);
			org.emftext.language.java.classifiers.Enumeration result;
			if (classifier != null && classifier instanceof org.emftext.language.java.classifiers.Enumeration) {
				result = (org.emftext.language.java.classifiers.Enumeration) classifier;
			} else {
				result = org.emftext.language.java.classifiers.ClassifiersFactory.eINSTANCE.createEnumeration();
			}
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
			org.emftext.language.java.classifiers.Interface result;
			org.emftext.language.java.classifiers.ConcreteClassifier classifier = JavaClasspath.get().getConcreteClassifier(interName);
			if (classifier != null && classifier instanceof org.emftext.language.java.classifiers.Interface) {
				result = (org.emftext.language.java.classifiers.Interface) classifier;
			} else {
				result = org.emftext.language.java.classifiers.ClassifiersFactory.eINSTANCE.createInterface();
			}
			typeBindToInterface.put(interName, result);
			return result;
		}
	}
	
	private static String convertToTypeParameterName(ITypeBinding binding) {
		if (binding == null) {
			return "";
		}
		String name = "";
		if (binding.getDeclaringClass() != null) {
			name += convertToTypeName(binding.getDeclaringClass());
		} else if (binding.getDeclaringMethod() != null) {
			name += convertToMethodName(binding.getDeclaringMethod());
		}
		name += "." + binding.getName();
		return name;
	}
	
	static org.emftext.language.java.generics.TypeParameter getTypeParameter(ITypeBinding binding) {
		String paramName = convertToTypeParameterName(binding);
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
		String typeName = convertToTypeName(binding);
		org.emftext.language.java.classifiers.ConcreteClassifier potClass = JavaClasspath.get().getConcreteClassifier(typeName);
		if (potClass != null) {
			return potClass;
		}
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
	
	static org.emftext.language.java.members.InterfaceMethod getInterfaceMethod(String methodName) {
		if (methBindToInter.containsKey(methodName)) {
			return methBindToInter.get(methodName);
		} else {
			org.emftext.language.java.members.InterfaceMethod result = org.emftext.language.java.members.MembersFactory.eINSTANCE.createInterfaceMethod();
			result.setTypeReference(org.emftext.language.java.types.TypesFactory.eINSTANCE.createVoid());
			result.setStatement(org.emftext.language.java.statements.StatementsFactory.eINSTANCE.createEmptyStatement());
			methBindToInter.put(methodName, result);
			return result;
		}
	}
	
	static org.emftext.language.java.members.InterfaceMethod getInterfaceMethod(IMethodBinding binding) {
		methodBindings.add(binding);
		return getInterfaceMethod(convertToMethodName(binding));
	}
	
	static org.emftext.language.java.members.ClassMethod getClassMethod(String methodName) {
		if (methBindToCM.containsKey(methodName)) {
			return methBindToCM.get(methodName);
		} else {
			org.emftext.language.java.members.ClassMethod result = org.emftext.language.java.members.MembersFactory.eINSTANCE.createClassMethod();
			result.setTypeReference(org.emftext.language.java.types.TypesFactory.eINSTANCE.createVoid());
			org.emftext.language.java.statements.Block block = org.emftext.language.java.statements.StatementsFactory.eINSTANCE.createBlock();
			block.setName("");
			result.setStatement(block);
			methBindToCM.put(methodName, result);
			return result;
		}
	}
	
	static org.emftext.language.java.members.ClassMethod getClassMethod(IMethodBinding binding) {
		methodBindings.add(binding);
		return getClassMethod(convertToMethodName(binding));
	}
	
	static org.emftext.language.java.members.Constructor getConstructor(IMethodBinding binding) {
		String methName = convertToMethodName(binding);
		if (methBindToConstr.containsKey(methName)) {
			return methBindToConstr.get(methName);
		} else {
			methodBindings.add(binding);
			org.emftext.language.java.members.Constructor result = org.emftext.language.java.members.MembersFactory.eINSTANCE.createConstructor();
			org.emftext.language.java.statements.Block block = org.emftext.language.java.statements.StatementsFactory.eINSTANCE.createBlock();
			block.setName("");
			result.setBlock(block);
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
	
	static org.emftext.language.java.classifiers.Class getClass(String typeName) {
		if (typeBindToClass.containsKey(typeName)) {
			return typeBindToClass.get(typeName);
		} else {
			org.emftext.language.java.classifiers.Class result = (org.emftext.language.java.classifiers.Class)
				JavaClasspath.get().getConcreteClassifier(typeName);
			if (result == null) {
				result = org.emftext.language.java.classifiers.ClassifiersFactory.eINSTANCE.createClass();
			}
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
			result.setTypeReference(org.emftext.language.java.types.TypesFactory.eINSTANCE.createInt());
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
			if (nameToOrdParam.containsKey(paramName)) {
				return nameToOrdParam.get(paramName);
			} else if (nameToVarLenParam.containsKey(paramName)) {
				return nameToVarLenParam.get(paramName);
			} else {
				return getOrdinaryParameter(binding);
			}
		} else {
			String paramName = convertToParameterName(binding, false);
			if (nameToCatchParam.containsKey(paramName)) {
				return nameToCatchParam.get(paramName);
			}
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
	
	static org.emftext.language.java.references.ReferenceableElement getReferenceableElementByNameMatching(String name) {
		IVariableBinding vBinding = variableBindings.stream().filter(var -> var.getName().equals(name)).findFirst().orElse(null);
		if (vBinding != null) {
			return getReferencableElement(vBinding);
		}
		IMethodBinding mBinding = methodBindings.stream().filter(meth -> meth.getName().equals(name)).findFirst().orElse(null);
		if (mBinding != null) {
			return getMethod(mBinding);
		}
		ITypeBinding tBinding = typeBindings.stream().filter(type -> type.getName().equals(name)).findFirst().orElse(null);
		if (tBinding != null) {
			return getClassifier(tBinding);
		}
		org.emftext.language.java.variables.Variable par = nameToCatchParam.values().stream()
			.filter(param -> param.getName().equals(name)).findFirst().orElse(null);
		if (par != null) {
			return par;
		}
		par = nameToLocVar.values().stream().filter(param -> param.getName().equals(name)).findFirst().orElse(null);
		if (par != null) {
			return par;
		}
		org.emftext.language.java.variables.AdditionalLocalVariable addLocVar = nameToAddLocVar.values().stream()
			.filter(param -> param.getName().equals(name)).findFirst().orElse(null);
		if (addLocVar != null) {
			return addLocVar;
		}
		par = nameToVarLenParam.values().stream().filter(param -> param.getName().equals(name)).findFirst().orElse(null);
		if (par != null) {
			return par;
		}
		par = nameToOrdParam.values().stream().filter(param -> param.getName().equals(name)).findFirst().orElse(null);
		if (par != null) {
			return par;
		}
		org.emftext.language.java.members.EnumConstant enumConst = nameToEnumConst.values().stream()
			.filter(param -> param.getName().equals(name)).findFirst().orElse(null);
		if (enumConst != null) {
			return enumConst;
		}
		org.emftext.language.java.members.Field field = nameToField.values().stream()
			.filter(param -> param.getName().equals(name)).findFirst().orElse(null);
		if (field != null) {
			return field;
		}
		org.emftext.language.java.members.AdditionalField addField = nameToAddField.values().stream()
			.filter(param -> param.getName().equals(name)).findFirst().orElse(null);
		if (addField != null) {
			return addField;
		}
		org.emftext.language.java.members.Method meth = methBindToCM.values().stream()
			.filter(param -> param.getName().equals(name)).findFirst().orElse(null);
		if (meth != null) {
			return meth;
		}
		meth = methBindToInter.values().stream().filter(param -> param.getName().equals(name)).findFirst().orElse(null);
		if (meth != null) {
			return meth;
		}
		org.emftext.language.java.classifiers.Classifier c = typeBindToTP.values().stream()
			.filter(param -> param.getName().equals(name)).findFirst().orElse(null);
		if (c != null) {
			return c;
		}
		c = typeBindToEnum.values().stream().filter(param -> name.equals(param.getName())).findFirst().orElse(null);
		if (c != null) {
			return c;
		}
		c = typeBindToAnnot.values().stream().filter(param -> name.equals(param.getName())).findFirst().orElse(null);
		if (c != null) {
			return c;
		}
		c = typeBindToClass.values().stream().filter(param -> name.equals(param.getName())).findFirst().orElse(null);
		if (c != null) {
			return c;
		}
		c = typeBindToInterface.values().stream().filter(param -> name.equals(param.getName())).findFirst().orElse(null);
		if (c != null) {
			return c;
		}
		return JDTResolverUtility.getClass(name);
	}
	
	static void completeResolution() {
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
		
		nameToPackage.forEach((packageName, pack) -> {
			if (pack.eContainer() == null) {
				Resource newResource = resourceSet.createResource(URI.createHierarchicalURI("empty", "JaMoPP-Package", null,
					new String[] {packageName, "package-info.java"}, null, null));
				newResource.getContents().add(pack);
			}
			IPackageBinding binding = packageBindings.stream().filter(b -> packageName.equals(b.getName())).findFirst().orElse(null);
			pack.setName("");
			pack.getNamespaces().clear();
			org.emftext.language.java.containers.Module module;
			if (binding != null) {
				for (String s : binding.getNameComponents()) {
					pack.getNamespaces().add(s);
				}
				module = getModule(binding.getModule());
			} else {
				module = getModule("");
			}
			pack.setModule(module);
			module.getPackages().add(pack);
		});
		
		modBindToMod.forEach((modName, module) -> {
			if (module.eContainer() == null) {
				Resource newResource = resourceSet.createResource(URI.createHierarchicalURI("empty", "JaMoPP-Module", null,
					new String[] {modName, "module-info.java"}, null, null));
				newResource.getContents().add(module);
			}
			IModuleBinding binding = moduleBindings.stream().filter(b -> modName.equals(b.getName())).findFirst().orElse(null);
			module.setName("");
			module.getNamespaces().clear();
			if (binding != null) {
				String nameParts[] = binding.getName().split(".");
				for (String s : nameParts) {
					module.getNamespaces().add(s);
				}
			}
		});
		
		modBindToMod.values().forEach(module -> JavaClasspath.get().registerModule(module));
		
		nameToPackage.values().forEach(pack -> JavaClasspath.get().registerPackage(pack));
		
		typeBindToAnnot.values().forEach(ann -> JavaClasspath.get().registerConcreteClassifier(ann));
		
		typeBindToEnum.values().forEach(enume -> JavaClasspath.get().registerConcreteClassifier(enume));
		
		typeBindToInterface.values().forEach(interf -> JavaClasspath.get().registerConcreteClassifier(interf));
		
		typeBindToClass.values().forEach(clazz -> JavaClasspath.get().registerConcreteClassifier(clazz));
		
		modBindToMod.clear();
		nameToPackage.clear();
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
		packageBindings.clear();
		typeBindings.clear();
		methodBindings.clear();
		variableBindings.clear();
		uid = 0;
		varBindToUid.clear();
	}
	
	private static void completeMethod(String methodName, org.emftext.language.java.members.Member method) {
		if (method.eContainer() == null) {
			IMethodBinding methBind = methodBindings.stream().filter(meth -> methodName.equals(convertToMethodName(meth)))
				.findFirst().orElse(null);
			if (methBind != null) {
				org.emftext.language.java.classifiers.ConcreteClassifier classifier = (org.emftext.language.java.classifiers.ConcreteClassifier)
					getClassifier(methBind.getDeclaringClass());
				classifier.getMembers().add(method);
			} else {
				String synName = "SyntheticContainerClass";
				org.emftext.language.java.classifiers.Class container = getClass(synName);
				container.setName(synName);
				if (!container.getMembers().contains(method)) {
					container.getMembers().add(method);
				}
			}
		}
	}
	
	private static void completeType(String typeName, org.emftext.language.java.classifiers.ConcreteClassifier classifier) {
		ITypeBinding typeBind = typeBindings.stream().filter(type -> typeName.equals(convertToTypeName(type)))
			.findFirst().orElse(null);
		if (typeBind != null) {
			classifier.setPackage(getPackage(typeBind.getPackage()));
		} else {
			classifier.setPackage(getPackage(""));
		}
		if (classifier.eContainer() != null) {
			return;
		}
		if (typeBind == null || typeBind.isTopLevel()) {
			classifier.setName(typeBind == null ? typeName : convertToSimpleTypeName(typeBind));
			org.emftext.language.java.containers.CompilationUnit cu = org.emftext.language.java.containers.ContainersFactory.eINSTANCE.createCompilationUnit();
			cu.setName("");
			cu.getClassifiers().add(classifier);
			String[] namespaces = typeName.substring(0, typeName.length() -
				(typeBind == null ? typeName.length() : convertToSimpleTypeName(typeBind).length())).split("\\.");
			for (int index = 0; index < namespaces.length; index++) {
				cu.getNamespaces().add(namespaces[index]);
			}
			Resource newResource = resourceSet.createResource(URI.createHierarchicalURI("empty",
				"JaMoPP-CompilationUnit", null, new String[] {typeName + ".java"}, null, null));
			newResource.getContents().add(cu);
		} else if (typeBind.isNested()) {
			org.emftext.language.java.classifiers.ConcreteClassifier parentClassifier = (org.emftext.language.java.classifiers.ConcreteClassifier)
				getClassifier(typeBind.getDeclaringClass());
			completeType(convertToTypeName(typeBind.getDeclaringClass()), parentClassifier);
			parentClassifier.getMembers().add(classifier);
		} else if (typeBind.isArray()) {
			ITypeBinding elementType = typeBind.getElementType();
			if (!elementType.isPrimitive() && !elementType.isTypeVariable()) {
				completeType(typeName, (org.emftext.language.java.classifiers.ConcreteClassifier) getClassifier(elementType));
			}
		}
	}
}
