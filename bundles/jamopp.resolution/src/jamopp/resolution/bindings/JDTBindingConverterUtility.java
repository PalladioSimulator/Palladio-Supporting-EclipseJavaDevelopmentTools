package jamopp.resolution.bindings;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.jdt.core.dom.IAnnotationBinding;
import org.eclipse.jdt.core.dom.IMemberValuePairBinding;
import org.eclipse.jdt.core.dom.IMethodBinding;
import org.eclipse.jdt.core.dom.IModuleBinding;
import org.eclipse.jdt.core.dom.IPackageBinding;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.IVariableBinding;
import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.jdt.internal.compiler.problem.AbortCompilation;
import org.emftext.language.java.containers.Origin;

import jamopp.proxy.IJavaContextDependentURIFragmentCollector;

@SuppressWarnings("restriction")
public class JDTBindingConverterUtility {
	public static List<org.emftext.language.java.types.TypeReference> convertToTypeReferences(ITypeBinding binding) {
		List<org.emftext.language.java.types.TypeReference> result = new ArrayList<>();
		if (binding.isPrimitive()) {
			if (binding.getName().equals("int")) {
				result.add(org.emftext.language.java.types.TypesFactory.eINSTANCE.createInt());
			} else if (binding.getName().equals("byte")) {
				result.add(org.emftext.language.java.types.TypesFactory.eINSTANCE.createByte());
			} else if (binding.getName().equals("short")) {
				result.add(org.emftext.language.java.types.TypesFactory.eINSTANCE.createShort());
			} else if (binding.getName().equals("long")) {
				result.add(org.emftext.language.java.types.TypesFactory.eINSTANCE.createLong());
			} else if (binding.getName().equals("boolean")) {
				result.add(org.emftext.language.java.types.TypesFactory.eINSTANCE.createBoolean());
			} else if (binding.getName().equals("double")) {
				result.add(org.emftext.language.java.types.TypesFactory.eINSTANCE.createDouble());
			} else if (binding.getName().equals("float")) {
				result.add(org.emftext.language.java.types.TypesFactory.eINSTANCE.createFloat());
			} else if (binding.getName().equals("void")) {
				result.add(org.emftext.language.java.types.TypesFactory.eINSTANCE.createVoid());
			} else if (binding.getName().equals("char")) {
				result.add(org.emftext.language.java.types.TypesFactory.eINSTANCE.createChar());
			}
		} else if (binding.isArray()) {
			return convertToTypeReferences(binding.getElementType());
		} else if (binding.isIntersectionType()) {
			for (ITypeBinding b : binding.getTypeBounds()) {
				result.addAll(convertToTypeReferences(b));
			}
		} else {
			String qualifiedName = binding.getQualifiedName();
			if (qualifiedName != null && !qualifiedName.equals("") && qualifiedName.contains(".")) {
				org.emftext.language.java.types.NamespaceClassifierReference parentRef =
						org.emftext.language.java.types.TypesFactory.eINSTANCE
						.createNamespaceClassifierReference();
				int index = qualifiedName.indexOf("<");
				if (index > -1) {
					qualifiedName = qualifiedName.substring(0, index);
				}
				index = qualifiedName.indexOf("[");
				if (index > -1) {
					qualifiedName = qualifiedName.substring(0, index);
				}
				String[] nameParts = qualifiedName.split("\\.");
				for (index = 0; index < nameParts.length - 1; index++) {
					parentRef.getNamespaces().add(nameParts[index]);
				}
				parentRef.getClassifierReferences().add(convertToClassifierReference(binding));
				result.add(parentRef);
			} else {
				result.add(convertToClassifierReference(binding));
			}
		}
		return result;
	}
	
	private static org.emftext.language.java.types.ClassifierReference convertToClassifierReference(
			ITypeBinding binding) {
		org.emftext.language.java.types.ClassifierReference ref =
				org.emftext.language.java.types.TypesFactory.eINSTANCE.createClassifierReference();
		org.emftext.language.java.classifiers.Class classifier =
				org.emftext.language.java.classifiers.ClassifiersFactory.eINSTANCE.createClass();
		convertToNameAndSet(binding, classifier);
		IJavaContextDependentURIFragmentCollector.GLOBAL_INSTANCE.registerContextDependentURIFragment(ref,
				org.emftext.language.java.types.TypesPackage.Literals.CLASSIFIER_REFERENCE__TARGET,
				classifier.getName(), classifier, -1, binding);
		if (binding.isParameterizedType()) {
			for (ITypeBinding b : binding.getTypeArguments()) {
				ref.getTypeArguments().add(convertToTypeArgument(b));
			}
		}
		ref.setTarget(classifier);
		return ref;
	}
	
	private static void convertToNameAndSet(ITypeBinding binding, org.emftext.language.java.commons.NamedElement element) {
		String name = binding.getName();
		if (binding.isParameterizedType()) {
			name = name.substring(0, name.indexOf("<"));
		} else if (binding.isArray()) {
			name = name.substring(0, name.indexOf("["));
		}
		element.setName(name);
	}
	
	private static org.emftext.language.java.generics.TypeArgument convertToTypeArgument(ITypeBinding binding) {
		if (binding.isWildcardType()) {
			if (binding.getBound() == null) {
				return org.emftext.language.java.generics.GenericsFactory.eINSTANCE.createUnknownTypeArgument();
			} else if (binding.isUpperbound()) {
				org.emftext.language.java.generics.ExtendsTypeArgument result = org.emftext.language
						.java.generics.GenericsFactory.eINSTANCE.createExtendsTypeArgument();
				result.setExtendType(convertToTypeReferences(binding.getBound()).get(0));
				convertToArrayDimensionsAndSet(binding, result, false);
				return result;
			} else {
				org.emftext.language.java.generics.SuperTypeArgument result = org.emftext.language
						.java.generics.GenericsFactory.eINSTANCE.createSuperTypeArgument();
				result.setSuperType(convertToTypeReferences(binding.getBound()).get(0));
				convertToArrayDimensionsAndSet(binding, result, false);
				return result;
			}
		} else {
			org.emftext.language.java.generics.QualifiedTypeArgument result = org.emftext.language
					.java.generics.GenericsFactory.eINSTANCE.createQualifiedTypeArgument();
			result.setTypeReference(convertToTypeReferences(binding).get(0));
			convertToArrayDimensionsAndSet(binding, result, false);
			return result;
		}
	}
	
	private static void convertToArrayDimensionsAndSet(ITypeBinding binding,
			org.emftext.language.java.arrays.ArrayTypeable arrDimContainer, boolean isVarArg) {
		if (binding.isArray()) {
			for (int i = isVarArg ? 1 : 0; i < binding.getDimensions(); i++) {
				arrDimContainer.getArrayDimensionsBefore().add(
						org.emftext.language.java.arrays.ArraysFactory.eINSTANCE.createArrayDimension());
			}
		}
	}
	
	static org.emftext.language.java.containers.CompilationUnit convertToCompilationUnit(ITypeBinding binding) {
		binding = binding.getTypeDeclaration();
		org.emftext.language.java.containers.CompilationUnit result =
				org.emftext.language.java.containers.ContainersFactory.eINSTANCE.createCompilationUnit();
		result.setOrigin(Origin.BINDING);
		result.setName(binding.getName());
		convertIPackageNameComponentsToNamespaces(binding.getPackage(), result);
		result.getClassifiers().add(convertToConcreteClassifier(binding));
		return result;
	}
	
	private static org.emftext.language.java.classifiers.ConcreteClassifier
			convertToConcreteClassifier(ITypeBinding binding) {
		org.emftext.language.java.classifiers.ConcreteClassifier result = null;
		if (binding.isAnnotation()) {
			result = org.emftext.language.java.classifiers.ClassifiersFactory.eINSTANCE.createAnnotation();
		} else if (binding.isClass()) {
			org.emftext.language.java.classifiers.Class resultClass =
					org.emftext.language.java.classifiers.ClassifiersFactory.eINSTANCE.createClass();
			if (resultClass.eContainer() == null) {
				try {
					if (binding.getSuperclass() != null) {
						resultClass.setExtends(convertToTypeReferences(binding.getSuperclass()).get(0));
					}
					for (ITypeBinding typeBind : binding.getInterfaces()) {
						resultClass.getImplements().addAll(convertToTypeReferences(typeBind));
					}
				} catch (AbortCompilation e) {
				}
			}
			result = resultClass;
		} else if (binding.isInterface()) {
			org.emftext.language.java.classifiers.Interface resultInterface =
					org.emftext.language.java.classifiers.ClassifiersFactory.eINSTANCE.createInterface();
			if (resultInterface.eContainer() == null) {
				try {
					for (ITypeBinding typeBind : binding.getInterfaces()) {
						resultInterface.getExtends().addAll(convertToTypeReferences(typeBind));
					}
				} catch (AbortCompilation e) {
				}
			}
			result = resultInterface;
		} else {
			org.emftext.language.java.classifiers.Enumeration resultEnum =
					org.emftext.language.java.classifiers.ClassifiersFactory.eINSTANCE.createEnumeration();
			if (resultEnum.eContainer() == null) {
				try {
					for (ITypeBinding typeBind : binding.getInterfaces()) {
						resultEnum.getImplements().addAll(convertToTypeReferences(typeBind));
					}
					for (IVariableBinding varBind : binding.getDeclaredFields()) {
						if (varBind.isEnumConstant()) {
							resultEnum.getConstants().add(convertToEnumConstant(varBind));
						}
					}
				} catch (AbortCompilation e) {
				}
			}
			result = resultEnum;
		}
		if (binding.getPackage() != null) {
			result.setPackage(convertToPackageProxy(binding.getPackage(), result,
					org.emftext.language.java.classifiers.ClassifiersPackage
					.Literals.CONCRETE_CLASSIFIER__PACKAGE));
		}
		try {
			for (IAnnotationBinding annotBind : binding.getAnnotations()) {
				result.getAnnotationsAndModifiers().add(convertToAnnotationInstance(annotBind));
			}
			for (ITypeBinding typeBind : binding.getTypeParameters()) {
				result.getTypeParameters().add(convertToTypeParameter(typeBind));
			}
		} catch (AbortCompilation e) {
		}
		result.getAnnotationsAndModifiers().addAll(convertToModifiers(binding.getModifiers()));
		convertToNameAndSet(binding, result);
		try {
			org.emftext.language.java.members.Member member;
			for (IVariableBinding varBind : binding.getDeclaredFields()) {
				if (varBind.isEnumConstant()) {
					
					continue;
				}
				member = convertToField(varBind);
				result.getMembers().add(member);
			}
			for (IMethodBinding methBind : binding.getDeclaredMethods()) {
				if (methBind.isDefaultConstructor()) {
					continue;
				}
				if (methBind.isConstructor()) {
					member = convertToConstructor(methBind);
				} else {
					member = convertToMethod(methBind);
				}
				result.getMembers().add(member);
			}
			for (ITypeBinding typeBind : binding.getDeclaredTypes()) {
				member = convertToConcreteClassifier(typeBind);
				result.getMembers().add(member);
			}
		} catch (AbortCompilation e) {
		}
		return result;
	}
	
	private static org.emftext.language.java.generics.TypeParameter convertToTypeParameter(ITypeBinding binding) {
		org.emftext.language.java.generics.TypeParameter result =
				org.emftext.language.java.generics.GenericsFactory.eINSTANCE.createTypeParameter();
		try {
			for (IAnnotationBinding annotBind : binding.getAnnotations()) {
				result.getAnnotations().add(convertToAnnotationInstance(annotBind));
			}
			for (ITypeBinding typeBind : binding.getTypeBounds()) {
				result.getExtendTypes().addAll(convertToTypeReferences(typeBind));
			}
		} catch (AbortCompilation e) {
		}
		convertToNameAndSet(binding, result);
		return result;
	}
	
	private static org.emftext.language.java.references.Reference internalConvertToReference(ITypeBinding binding) {
		org.emftext.language.java.references.IdentifierReference idRef =
				org.emftext.language.java.references.ReferencesFactory.eINSTANCE.createIdentifierReference();
		org.emftext.language.java.members.Field proxyField =
				org.emftext.language.java.members.MembersFactory.eINSTANCE.createField();
		convertToNameAndSet(binding, proxyField);
		IJavaContextDependentURIFragmentCollector.GLOBAL_INSTANCE.registerContextDependentURIFragment(idRef,
				org.emftext.language.java.references.ReferencesPackage.Literals.ELEMENT_REFERENCE__TARGET,
				proxyField.getName(), proxyField, -1, binding);
		idRef.setTarget(proxyField);
		if (binding.isNested()) {
			org.emftext.language.java.references.Reference parentRef =
					internalConvertToReference(binding.getDeclaringClass());
			parentRef.setNext(idRef);
		}
		return idRef;
	}
	
	private static org.emftext.language.java.references.Reference
			getTopReference(org.emftext.language.java.references.Reference ref) {
		org.emftext.language.java.references.Reference currentRef = ref;
		org.emftext.language.java.references.Reference parentRef = ref.getPrevious();
		while (parentRef != null) {
			currentRef = parentRef;
			parentRef = currentRef.getPrevious();
		}
		return currentRef;
	}
	
	private static org.emftext.language.java.members.Field convertToField(IVariableBinding binding) {
		org.emftext.language.java.members.Field result =
				org.emftext.language.java.members.MembersFactory.eINSTANCE.createField();
		result.getAnnotationsAndModifiers().addAll(convertToModifiers(binding.getModifiers()));
		try {
			for (IAnnotationBinding annotBind : binding.getAnnotations()) {
				result.getAnnotationsAndModifiers().add(convertToAnnotationInstance(annotBind));
			}
		} catch (AbortCompilation e) {
		}
		result.setName(binding.getName());
		result.setTypeReference(convertToTypeReferences(binding.getType()).get(0));
		convertToArrayDimensionsAndSet(binding.getType(), result, false);
		if (binding.getConstantValue() != null) {
			result.setInitialValue(convertToPrimaryExpression(binding.getConstantValue()));
		}
		return result;
	}
	
	private static org.emftext.language.java.members.EnumConstant convertToEnumConstant(IVariableBinding binding) {
		org.emftext.language.java.members.EnumConstant result =
				org.emftext.language.java.members.MembersFactory.eINSTANCE.createEnumConstant();
		try {
			for (IAnnotationBinding annotBind : binding.getAnnotations()) {
				result.getAnnotations().add(convertToAnnotationInstance(annotBind));
			}
		} catch (AbortCompilation e) {
		}
		result.setName(binding.getName());
		return result;
	}
	
	private static org.emftext.language.java.members.Constructor convertToConstructor(IMethodBinding binding) {
		org.emftext.language.java.members.Constructor result =
				org.emftext.language.java.members.MembersFactory.eINSTANCE.createConstructor();
		result.getAnnotationsAndModifiers().addAll(convertToModifiers(binding.getModifiers()));
		try {
			for (IAnnotationBinding annotBind : binding.getAnnotations()) {
				result.getAnnotationsAndModifiers().add(convertToAnnotationInstance(annotBind));
			}
		} catch (AbortCompilation e) {
		}
		result.setName(binding.getName());
		try {
			for (ITypeBinding typeBind : binding.getTypeParameters()) {
				result.getTypeParameters().add(convertToTypeParameter(typeBind));
			}
		} catch (AbortCompilation e) {
		}
		if (binding.getDeclaredReceiverType() != null) {
			org.emftext.language.java.parameters.ReceiverParameter param = org.emftext.language
					.java.parameters.ParametersFactory.eINSTANCE.createReceiverParameter();
			param.setName("");
			param.setTypeReference(convertToTypeReferences(binding.getDeclaredReceiverType()).get(0));
			param.setOuterTypeReference(param.getTypeReference());
			param.setThisReference(org.emftext.language.java.literals.LiteralsFactory.eINSTANCE.createThis());
			result.getParameters().add(param);
		}
		for (int index = 0; index < binding.getParameterTypes().length; index++) {
			ITypeBinding typeBind = binding.getParameterTypes()[index];
			org.emftext.language.java.parameters.Parameter param;
			if (binding.isVarargs() && index == binding.getParameterTypes().length - 1) {
				param = org.emftext.language.java.parameters.ParametersFactory
						.eINSTANCE.createVariableLengthParameter();
			} else {
				param = org.emftext.language.java.parameters.ParametersFactory
						.eINSTANCE.createOrdinaryParameter();
			}
			param.setName("param" + index);
			param.setTypeReference(convertToTypeReferences(typeBind).get(0));
			convertToArrayDimensionsAndSet(typeBind, param, binding.isVarargs()
					&& index == binding.getParameterTypes().length - 1);
			IAnnotationBinding[] binds = binding.getParameterAnnotations(index);
			try {
				for (IAnnotationBinding annotBind : binds) {
					param.getAnnotationsAndModifiers().add(convertToAnnotationInstance(annotBind));
				}
			} catch (AbortCompilation e) {
			}
			result.getParameters().add(param);
		}
		for (ITypeBinding typeBind : binding.getExceptionTypes()) {
			result.getExceptions().add(convertToNamespaceClassifierReference(typeBind));
		}
		org.emftext.language.java.statements.Block statement =
				org.emftext.language.java.statements.StatementsFactory.eINSTANCE.createBlock();
		statement.setName("");
		result.setBlock(statement);
		return result;
	}
	
	private static org.emftext.language.java.members.Method convertToMethod(IMethodBinding binding) {
		org.emftext.language.java.members.Method result;
		if (binding.getDeclaringClass().isInterface()) {
			result = org.emftext.language.java.members.MembersFactory.eINSTANCE.createInterfaceMethod();
		} else {
			result = org.emftext.language.java.members.MembersFactory.eINSTANCE.createClassMethod();
		}
		result.getAnnotationsAndModifiers().addAll(convertToModifiers(binding.getModifiers()));
		try {
			for (IAnnotationBinding annotBind : binding.getAnnotations()) {
				result.getAnnotationsAndModifiers().add(convertToAnnotationInstance(annotBind));
			}
		} catch (AbortCompilation e) {
		}
		result.setName(binding.getName());
		result.setTypeReference(convertToTypeReferences(binding.getReturnType()).get(0));
		convertToArrayDimensionsAndSet(binding.getReturnType(), result, false);
		try {
			for (ITypeBinding typeBind : binding.getTypeParameters()) {
				result.getTypeParameters().add(convertToTypeParameter(typeBind));
			}
		} catch (AbortCompilation e) {
		}
		if (binding.getDeclaredReceiverType() != null) {
			org.emftext.language.java.parameters.ReceiverParameter param = org.emftext.language.java
					.parameters.ParametersFactory.eINSTANCE.createReceiverParameter();
			param.setTypeReference(convertToTypeReferences(binding.getDeclaredReceiverType()).get(0));
			param.setName("");
			param.setThisReference(org.emftext.language.java.literals.LiteralsFactory.eINSTANCE.createThis());
			result.getParameters().add(param);
		}
		for (int index = 0; index < binding.getParameterTypes().length; index++) {
			ITypeBinding typeBind = binding.getParameterTypes()[index];
			org.emftext.language.java.parameters.Parameter param;
			if (binding.isVarargs() && index == binding.getParameterTypes().length - 1) {
				param = org.emftext.language.java.parameters.ParametersFactory
						.eINSTANCE.createVariableLengthParameter();
			} else {
				param = org.emftext.language.java.parameters.ParametersFactory
						.eINSTANCE.createOrdinaryParameter();
			}
			param.setName("param" + index);
			param.setTypeReference(convertToTypeReferences(typeBind).get(0));
			convertToArrayDimensionsAndSet(typeBind, param, binding.isVarargs()
					&& index == binding.getParameterTypes().length - 1);
			try {
				IAnnotationBinding[] binds = binding.getParameterAnnotations(index);
				for (IAnnotationBinding annotBind : binds) {
					param.getAnnotationsAndModifiers().add(convertToAnnotationInstance(annotBind));
				}
			} catch (AbortCompilation e) {
			}
			result.getParameters().add(param);
		}
		if (binding.getDefaultValue() != null) {
			((org.emftext.language.java.members.InterfaceMethod) result)
				.setDefaultValue(convertToAnnotationValue(binding.getDefaultValue()));
		}
		try {
			for (ITypeBinding typeBind : binding.getExceptionTypes()) {
				result.getExceptions().add(convertToNamespaceClassifierReference(typeBind));
			}
		} catch (AbortCompilation e) {
		}
		if (binding.getDeclaringClass().isInterface()) {
			boolean hasDefaultImpl = false;
			for (org.emftext.language.java.modifiers.Modifier mod : result.getModifiers()) {
				if (mod instanceof org.emftext.language.java.modifiers.Default) {
					hasDefaultImpl = true;
					break;
				}
			}
			if (!hasDefaultImpl) {
				result.setStatement(org.emftext.language.java.statements.StatementsFactory
						.eINSTANCE.createEmptyStatement());
			}
		}
		if (result.getStatement() == null) {
			org.emftext.language.java.statements.Block block =
					org.emftext.language.java.statements.StatementsFactory.eINSTANCE.createBlock();
			block.setName("");
			result.setStatement(block);
		}
		return result;
	}
	
	private static org.emftext.language.java.types.NamespaceClassifierReference
			convertToNamespaceClassifierReference(ITypeBinding binding) {
		org.emftext.language.java.types.NamespaceClassifierReference ref = org.emftext.language
				.java.types.TypesFactory.eINSTANCE.createNamespaceClassifierReference();
		if (binding.getPackage() != null) {
			convertIPackageNameComponentsToNamespaces(binding.getPackage(), ref);
		}
		org.emftext.language.java.types.ClassifierReference classRef =
				org.emftext.language.java.types.TypesFactory.eINSTANCE.createClassifierReference();
		org.emftext.language.java.classifiers.Class proxyClass =
				org.emftext.language.java.classifiers.ClassifiersFactory.eINSTANCE.createClass();
		convertToNameAndSet(binding, proxyClass);
		IJavaContextDependentURIFragmentCollector.GLOBAL_INSTANCE.registerContextDependentURIFragment(classRef,
				org.emftext.language.java.types.TypesPackage.Literals.CLASSIFIER_REFERENCE__TARGET,
				proxyClass.getName(), proxyClass, -1, binding);
		classRef.setTarget(proxyClass);
		ref.getClassifierReferences().add(classRef);
		return ref;
	}
	
	private static org.emftext.language.java.annotations.AnnotationInstance
			convertToAnnotationInstance(IAnnotationBinding binding) {
		org.emftext.language.java.annotations.AnnotationInstance result =
				org.emftext.language.java.annotations.AnnotationsFactory.eINSTANCE.createAnnotationInstance();
		org.emftext.language.java.classifiers.Annotation resultClass =
				org.emftext.language.java.classifiers.ClassifiersFactory.eINSTANCE.createAnnotation();
		convertToNameAndSet(binding.getAnnotationType(), resultClass);
		IJavaContextDependentURIFragmentCollector.GLOBAL_INSTANCE.registerContextDependentURIFragment(result,
				org.emftext.language.java.annotations.AnnotationsPackage.Literals.ANNOTATION_INSTANCE__ANNOTATION,
				resultClass.getName(), resultClass, -1, binding.getAnnotationType());
		result.setAnnotation(resultClass);
		if (binding.getDeclaredMemberValuePairs().length > 0) {
			org.emftext.language.java.annotations.AnnotationParameterList params = org.emftext.language
					.java.annotations.AnnotationsFactory.eINSTANCE.createAnnotationParameterList();
			for (IMemberValuePairBinding memBind : binding.getDeclaredMemberValuePairs()) {
				params.getSettings().add(convertToAnnotationAttributeSetting(memBind));
			}
			result.setParameter(params);
		}
		return result;
	}
	
	private static org.emftext.language.java.annotations.AnnotationAttributeSetting convertToAnnotationAttributeSetting(
		IMemberValuePairBinding binding) {
		org.emftext.language.java.annotations.AnnotationAttributeSetting result =
			org.emftext.language.java.annotations.AnnotationsFactory.eINSTANCE.createAnnotationAttributeSetting();
		org.emftext.language.java.members.InterfaceMethod proxyMeth =
				org.emftext.language.java.members.MembersFactory.eINSTANCE.createInterfaceMethod();
		proxyMeth.setName(binding.getMethodBinding().getName());
		IJavaContextDependentURIFragmentCollector.GLOBAL_INSTANCE.registerContextDependentURIFragment(result, org.emftext
				.language.java.annotations.AnnotationsPackage.Literals.ANNOTATION_ATTRIBUTE_SETTING__ATTRIBUTE,
				proxyMeth.getName(), proxyMeth, -1, binding.getMethodBinding());
		result.setAttribute(proxyMeth);
		result.setValue(convertToAnnotationValue(binding.getValue()));
		return result;
	}
	
	private static org.emftext.language.java.annotations.AnnotationValue convertToAnnotationValue(Object value) {
		if (value instanceof IVariableBinding) {
			IVariableBinding varBind = (IVariableBinding) value;
			org.emftext.language.java.references.Reference parentRef =
					internalConvertToReference(varBind.getDeclaringClass());
			org.emftext.language.java.references.IdentifierReference varRef = org.emftext.language
					.java.references.ReferencesFactory.eINSTANCE.createIdentifierReference();
			org.emftext.language.java.members.EnumConstant proxyConst =
					org.emftext.language.java.members.MembersFactory.eINSTANCE.createEnumConstant();
			proxyConst.setName(varBind.getName());
			IJavaContextDependentURIFragmentCollector.GLOBAL_INSTANCE.registerContextDependentURIFragment(varRef,
					org.emftext.language.java.references.ReferencesPackage.Literals.ELEMENT_REFERENCE__TARGET,
					proxyConst.getName(), proxyConst, -1, varBind);
			varRef.setTarget(proxyConst);
			parentRef.setNext(varRef);
			return getTopReference(varRef);
		} else if (value instanceof IAnnotationBinding) {
			return convertToAnnotationInstance((IAnnotationBinding) value);
		} else if (value instanceof Object[]) {
			Object[] values = (Object[]) value;
			org.emftext.language.java.arrays.ArrayInitializer initializer =
					org.emftext.language.java.arrays.ArraysFactory.eINSTANCE.createArrayInitializer();
			for (int index = 0; index < values.length; index++) {
				initializer.getInitialValues().add((org.emftext.language.java.arrays.ArrayInitializationValue)
					convertToAnnotationValue(values[index]));
			}
			return initializer;
		} else if (value instanceof ITypeBinding) {
			org.emftext.language.java.references.Reference parentRef =
					internalConvertToReference((ITypeBinding) value);
			org.emftext.language.java.references.ReflectiveClassReference classRef = org.emftext.language
					.java.references.ReferencesFactory.eINSTANCE.createReflectiveClassReference();
			parentRef.setNext(classRef);
			return getTopReference(classRef);
		} else {
			return convertToPrimaryExpression(value);
		}
	}
	
	private static org.emftext.language.java.expressions.PrimaryExpression convertToPrimaryExpression(Object value) {
		if (value instanceof String) {
			org.emftext.language.java.references.StringReference ref =
					org.emftext.language.java.references.ReferencesFactory.eINSTANCE.createStringReference();
			ref.setValue((String) value);
			return ref;
		} else if (value instanceof Boolean) {
			org.emftext.language.java.literals.BooleanLiteral literal =
					org.emftext.language.java.literals.LiteralsFactory.eINSTANCE.createBooleanLiteral();
			literal.setValue((boolean) value);
			return literal;
		} else if (value instanceof Character) {
			org.emftext.language.java.literals.CharacterLiteral literal =
					org.emftext.language.java.literals.LiteralsFactory.eINSTANCE.createCharacterLiteral();
			literal.setValue("\\u" + Integer.toHexString((Character) value));
			return literal;
		} else if (value instanceof Byte) {
			org.emftext.language.java.literals.DecimalIntegerLiteral literal = org.emftext.language
					.java.literals.LiteralsFactory.eINSTANCE.createDecimalIntegerLiteral();
			literal.setDecimalValue(BigInteger.valueOf((byte) value));
			return literal;
		} else if (value instanceof Short) {
			org.emftext.language.java.literals.DecimalIntegerLiteral literal = org.emftext.language
					.java.literals.LiteralsFactory.eINSTANCE.createDecimalIntegerLiteral();
			literal.setDecimalValue(BigInteger.valueOf((short) value));
			return literal;
		} else if (value instanceof Integer) {
			org.emftext.language.java.literals.DecimalIntegerLiteral literal = org.emftext.language
					.java.literals.LiteralsFactory.eINSTANCE.createDecimalIntegerLiteral();
			literal.setDecimalValue(BigInteger.valueOf((int) value));
			return literal;
		} else if (value instanceof Long) {
			org.emftext.language.java.literals.DecimalLongLiteral literal =
					org.emftext.language.java.literals.LiteralsFactory.eINSTANCE.createDecimalLongLiteral();
			literal.setDecimalValue(BigInteger.valueOf((long) value));
			return literal;
		} else if (value instanceof Float) {
			org.emftext.language.java.literals.DecimalFloatLiteral literal =
					org.emftext.language.java.literals.LiteralsFactory.eINSTANCE.createDecimalFloatLiteral();
			literal.setDecimalValue((float) value);
			return literal;
		} else if (value instanceof Double) {
			org.emftext.language.java.literals.DecimalDoubleLiteral literal =
					org.emftext.language.java.literals.LiteralsFactory.eINSTANCE.createDecimalDoubleLiteral();
			literal.setDecimalValue((double) value);
			return literal;
		} else { // value == null
			org.emftext.language.java.literals.NullLiteral literal =
					org.emftext.language.java.literals.LiteralsFactory.eINSTANCE.createNullLiteral();
			return literal;
		}
	}

	private static List<org.emftext.language.java.modifiers.Modifier> convertToModifiers(int modifiers) {
		ArrayList<org.emftext.language.java.modifiers.Modifier> result = new ArrayList<>();
		if (Modifier.isAbstract(modifiers)) {
			result.add(org.emftext.language.java.modifiers.ModifiersFactory.eINSTANCE.createAbstract());
		}
		if (Modifier.isDefault(modifiers)) {
			result.add(org.emftext.language.java.modifiers.ModifiersFactory.eINSTANCE.createDefault());
		}
		if (Modifier.isFinal(modifiers)) {
			result.add(org.emftext.language.java.modifiers.ModifiersFactory.eINSTANCE.createFinal());
		}
		if (Modifier.isNative(modifiers)) {
			result.add(org.emftext.language.java.modifiers.ModifiersFactory.eINSTANCE.createNative());
		}
		if (Modifier.isPrivate(modifiers)) {
			result.add(org.emftext.language.java.modifiers.ModifiersFactory.eINSTANCE.createPrivate());
		}
		if (Modifier.isProtected(modifiers)) {
			result.add(org.emftext.language.java.modifiers.ModifiersFactory.eINSTANCE.createProtected());
		}
		if (Modifier.isPublic(modifiers)) {
			result.add(org.emftext.language.java.modifiers.ModifiersFactory.eINSTANCE.createPublic());
		}
		if (Modifier.isStatic(modifiers)) {
			result.add(org.emftext.language.java.modifiers.ModifiersFactory.eINSTANCE.createStatic());
		}
		if (Modifier.isStrictfp(modifiers)) {
			result.add(org.emftext.language.java.modifiers.ModifiersFactory.eINSTANCE.createStrictfp());
		}
		if (Modifier.isSynchronized(modifiers)) {
			result.add(org.emftext.language.java.modifiers.ModifiersFactory.eINSTANCE.createSynchronized());
		}
		if (Modifier.isTransient(modifiers)) {
			result.add(org.emftext.language.java.modifiers.ModifiersFactory.eINSTANCE.createTransient());
		}
		if (Modifier.isVolatile(modifiers)) {
			result.add(org.emftext.language.java.modifiers.ModifiersFactory.eINSTANCE.createVolatile());
		}
		return result;
	}
	
	static org.emftext.language.java.containers.Package convertToPackage(IPackageBinding binding) {
		org.emftext.language.java.containers.Package pack =
				org.emftext.language.java.containers.ContainersFactory.eINSTANCE.createPackage();
		pack.setOrigin(Origin.BINDING);
		convertIPackageNameComponentsToNamespaces(binding, pack);
		pack.setName("");
		try {
			for (IAnnotationBinding annotBind : binding.getAnnotations()) {
				pack.getAnnotations().add(convertToAnnotationInstance(annotBind));
			}
		} catch (AbortCompilation e) {
		}
		if (binding.getModule() != null) {
			org.emftext.language.java.containers.Module proxy =
					org.emftext.language.java.containers.ContainersFactory.eINSTANCE.createModule();
			proxy.setName(binding.getModule().getName());
			IJavaContextDependentURIFragmentCollector.GLOBAL_INSTANCE
				.registerContextDependentURIFragment(pack,
				org.emftext.language.java.containers.ContainersPackage.Literals.PACKAGE__MODULE,
				proxy.getName(), proxy, -1, binding.getModule());
			pack.setModule(proxy);
		}
		return pack;
	}
	
	private static void convertIPackageNameComponentsToNamespaces(
			IPackageBinding binding, org.emftext.language.java.commons.NamespaceAwareElement element) {
		for (String com : binding.getNameComponents()) {
			element.getNamespaces().add(com);
		}
	}
	
	private static org.emftext.language.java.containers.Package convertToPackageProxy(IPackageBinding binding,
			EObject container, EReference feature) {
		org.emftext.language.java.containers.Package proxy =
				org.emftext.language.java.containers.ContainersFactory.eINSTANCE.createPackage();
		convertIPackageNameComponentsToNamespaces(binding, proxy);
		proxy.setName("");
		IJavaContextDependentURIFragmentCollector.GLOBAL_INSTANCE
			.registerContextDependentURIFragment(container, feature, binding.getName(), proxy, -1, binding);
		return proxy;
	}
	
	static org.emftext.language.java.containers.Module convertToModule(IModuleBinding binding) {
		org.emftext.language.java.containers.Module result =
				org.emftext.language.java.containers.ContainersFactory.eINSTANCE.createModule();
		result.setOrigin(Origin.BINDING);
		try {
			for (IAnnotationBinding annotBind : binding.getAnnotations()) {
				result.getAnnotations().add(convertToAnnotationInstance(annotBind));
			}
		} catch (AbortCompilation e) {
		}
		if (binding.isOpen()) {
			result.setOpen(org.emftext.language.java.modifiers.ModifiersFactory.eINSTANCE.createOpen());
		}
		convertToNamespacesAndSet(binding.getName(), result);
		result.setName("");
		try {
			for (IPackageBinding packBind : binding.getExportedPackages()) {
				org.emftext.language.java.modules.ExportsModuleDirective dir = org.emftext.language
						.java.modules.ModulesFactory.eINSTANCE.createExportsModuleDirective();
				convertIPackageNameComponentsToNamespaces(packBind, dir);
				dir.setAccessablePackage(convertToPackageProxy(packBind, dir,
					org.emftext.language.java.modules.ModulesPackage.Literals
					.ACCESS_PROVIDING_MODULE_DIRECTIVE__ACCESSABLE_PACKAGE));
				String[] mods = binding.getExportedTo(packBind);
				for (String modName : mods) {
					org.emftext.language.java.modules.ModuleReference ref = org.emftext.language
							.java.modules.ModulesFactory.eINSTANCE.createModuleReference();
					convertToNamespacesAndSet(modName, ref);
					dir.getModules().add(ref);
				}
				result.getTarget().add(dir);
			}
			for (IPackageBinding packBind : binding.getOpenedPackages()) {
				org.emftext.language.java.modules.OpensModuleDirective dir = org.emftext.language
						.java.modules.ModulesFactory.eINSTANCE.createOpensModuleDirective();
				convertIPackageNameComponentsToNamespaces(packBind, dir);
				dir.setAccessablePackage(convertToPackageProxy(packBind, dir,
					org.emftext.language.java.modules.ModulesPackage.Literals
					.ACCESS_PROVIDING_MODULE_DIRECTIVE__ACCESSABLE_PACKAGE));
				String[] mods = binding.getOpenedTo(packBind);
				for (String modName : mods) {
					org.emftext.language.java.modules.ModuleReference ref = org.emftext.language
							.java.modules.ModulesFactory.eINSTANCE.createModuleReference();
					convertToNamespacesAndSet(modName, ref);
					dir.getModules().add(ref);
				}
				result.getTarget().add(dir);
			}
			for (IModuleBinding modBind : binding.getRequiredModules()) {
				org.emftext.language.java.modules.RequiresModuleDirective dir = org.emftext.language
						.java.modules.ModulesFactory.eINSTANCE.createRequiresModuleDirective();
				dir.setRequiredModule(convertToModuleReference(modBind));
				result.getTarget().add(dir);
			}
			for (ITypeBinding typeBind : binding.getUses()) {
				org.emftext.language.java.modules.UsesModuleDirective dir = org.emftext.language
						.java.modules.ModulesFactory.eINSTANCE.createUsesModuleDirective();
				dir.setTypeReference(convertToTypeReferences(typeBind).get(0));
				result.getTarget().add(dir);
			}
			for (ITypeBinding typeBind : binding.getServices()) {
				org.emftext.language.java.modules.ProvidesModuleDirective dir = org.emftext.language
						.java.modules.ModulesFactory.eINSTANCE.createProvidesModuleDirective();
				dir.setTypeReference(convertToTypeReferences(typeBind).get(0));
				for (ITypeBinding service : binding.getImplementations(typeBind)) {
					dir.getServiceProviders().addAll(convertToTypeReferences(service));
				}
				result.getTarget().add(dir);
			}
		} catch (AbortCompilation e) {
		}
		return result;
	}
	
	private static void convertToNamespacesAndSet(String namespaces,
			org.emftext.language.java.commons.NamespaceAwareElement ele) {
		String[] singleNamespaces = namespaces.split("\\.");
		for (String part : singleNamespaces) {
			ele.getNamespaces().add(part);
		}
	}
	
	private static org.emftext.language.java.modules.ModuleReference convertToModuleReference(IModuleBinding binding) {
		org.emftext.language.java.modules.ModuleReference ref = org.emftext.language.java
				.modules.ModulesFactory.eINSTANCE.createModuleReference();
		convertToNamespacesAndSet(binding.getName(), ref);
		org.emftext.language.java.containers.Module proxyMod =
				org.emftext.language.java.containers.ContainersFactory.eINSTANCE.createModule();
		proxyMod.setName(binding.getName());
		IJavaContextDependentURIFragmentCollector.GLOBAL_INSTANCE
			.registerContextDependentURIFragment(ref,
			org.emftext.language.java.modules.ModulesPackage.Literals.MODULE_REFERENCE__TARGET,
			proxyMod.getName(), proxyMod, -1, binding);
		ref.setTarget(proxyMod);
		return ref;
	}
}
