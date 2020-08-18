package jamopp.parser.jdt;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.core.dom.IAnnotationBinding;
import org.eclipse.jdt.core.dom.IMemberValuePairBinding;
import org.eclipse.jdt.core.dom.IMethodBinding;
import org.eclipse.jdt.core.dom.IPackageBinding;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.IVariableBinding;
import org.eclipse.jdt.core.dom.Modifier;

class JDTBindingConverterUtility {
	static List<org.emftext.language.java.types.TypeReference> convertToTypeReferences(ITypeBinding binding) {
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
		} else if (binding.isIntersectionType()) {
			for (ITypeBinding b : binding.getTypeBounds()) {
				result.addAll(convertToTypeReferences(b));
			}
		} else {
			org.emftext.language.java.classifiers.Classifier classifier = JDTResolverUtility.getClassifier(binding);
			convertToNameAndSet(binding, classifier);
			org.emftext.language.java.types.ClassifierReference ref = org.emftext.language.java.types.TypesFactory.eINSTANCE.createClassifierReference();
			if (binding.isParameterizedType()) {
				for (ITypeBinding b : binding.getTypeArguments()) {
					ref.getTypeArguments().add(convertToTypeArgument(b));
				}
			}
			ref.setTarget(classifier);
			result.add(ref);
		}
		return result;
	}
	
	static void convertToNameAndSet(ITypeBinding binding, org.emftext.language.java.commons.NamedElement element) {
		String name = binding.getName();
		if (binding.isParameterizedType()) {
			name = name.substring(0, name.indexOf("<"));
		} else if (binding.isArray()) {
			name = name.substring(0, name.indexOf("["));
		}
		element.setName(name);
	}
	
	static org.emftext.language.java.generics.TypeArgument convertToTypeArgument(ITypeBinding binding) {
		if (binding.isWildcardType()) {
			if (binding.getBound() == null) {
				return org.emftext.language.java.generics.GenericsFactory.eINSTANCE.createUnknownTypeArgument();
			} else if (binding.isUpperbound()) {
				org.emftext.language.java.generics.ExtendsTypeArgument result = org.emftext.language.java.generics.GenericsFactory.eINSTANCE.createExtendsTypeArgument();
				result.setExtendType(convertToTypeReferences(binding.getBound()).get(0));
				convertToArrayDimensionsAndSet(binding, result);
				return result;
			} else {
				org.emftext.language.java.generics.SuperTypeArgument result = org.emftext.language.java.generics.GenericsFactory.eINSTANCE.createSuperTypeArgument();
				result.setSuperType(convertToTypeReferences(binding.getBound()).get(0));
				convertToArrayDimensionsAndSet(binding, result);
				return result;
			}
		} else {
			org.emftext.language.java.generics.QualifiedTypeArgument result = org.emftext.language.java.generics.GenericsFactory.eINSTANCE.createQualifiedTypeArgument();
			result.setTypeReference(convertToTypeReferences(binding).get(0));
			convertToArrayDimensionsAndSet(binding, result);
			return result;
		}
	}
	
	static void convertToArrayDimensionsAndSet(ITypeBinding binding, org.emftext.language.java.arrays.ArrayTypeable arrDimContainer) {
		if (binding.isArray()) {
			for (int i = 0; i < binding.getDimensions(); i++) {
				arrDimContainer.getArrayDimensionsBefore().add(org.emftext.language.java.arrays.ArraysFactory.eINSTANCE.createArrayDimension());
			}
		}
	}
	
	static org.emftext.language.java.classifiers.ConcreteClassifier convertToConcreteClassifier(ITypeBinding binding) {
		org.emftext.language.java.classifiers.ConcreteClassifier result = null;
		if (binding.isAnnotation()) {
			result = JDTResolverUtility.getAnnotation(binding);
		} else if (binding.isClass()) {
			org.emftext.language.java.classifiers.Class resultClass = JDTResolverUtility.getClass(binding);
			if (binding.getSuperclass() != null) {
				resultClass.setExtends(convertToTypeReferences(binding.getSuperclass()).get(0));
			}
			for (ITypeBinding typeBind : binding.getInterfaces()) {
				resultClass.getImplements().addAll(convertToTypeReferences(typeBind));
			}
			result = resultClass;
		} else if (binding.isInterface()) {
			org.emftext.language.java.classifiers.Interface resultInterface = JDTResolverUtility.getInterface(binding);
			for (ITypeBinding typeBind : binding.getInterfaces()) {
				resultInterface.getExtends().addAll(convertToTypeReferences(typeBind));
			}
			result = resultInterface;
		} else {
			org.emftext.language.java.classifiers.Enumeration resultEnum = JDTResolverUtility.getEnumeration(binding);
			for (ITypeBinding typeBind : binding.getInterfaces()) {
				resultEnum.getImplements().addAll(convertToTypeReferences(typeBind));
			}
			for (IVariableBinding varBind : binding.getDeclaredFields()) {
				if (varBind.isEnumConstant()) {
					resultEnum.getConstants().add(convertToEnumConstant(varBind));
				}
			}
			result = resultEnum;
		}
		result.setPackage(convertToPackage(binding.getPackage()));
		for (IAnnotationBinding annotBind : binding.getAnnotations()) {
			result.getAnnotationsAndModifiers().add(convertToAnnotationInstance(annotBind));
		}
		for (ITypeBinding typeBind : binding.getTypeParameters()) {
			result.getTypeParameters().add(convertToTypeParameter(typeBind));
		}
		result.getAnnotationsAndModifiers().addAll(convertToModifiers(binding.getModifiers()));
		convertToNameAndSet(binding, result);
		for (IVariableBinding varBind : binding.getDeclaredFields()) {
			if (varBind.isEnumConstant()) {
				continue;
			}
			result.getMembers().add(convertToField(varBind));
		}
		for (IMethodBinding methBind : binding.getDeclaredMethods()) {
			result.getMembers().add(convertToMethod(methBind));
		}
		for (ITypeBinding typeBind : binding.getDeclaredTypes()) {
			result.getMembers().add(convertToConcreteClassifier(typeBind));
		}
		return null;
	}
	
	private static org.emftext.language.java.generics.TypeParameter convertToTypeParameter(ITypeBinding binding) {
		org.emftext.language.java.generics.TypeParameter result = JDTResolverUtility.getTypeParameter(binding);
		for (IAnnotationBinding annotBind : binding.getAnnotations()) {
			result.getAnnotations().add(convertToAnnotationInstance(annotBind));
		}
		for (ITypeBinding typeBind : binding.getTypeBounds()) {
			result.getExtendTypes().addAll(convertToTypeReferences(typeBind));
		}
		convertToNameAndSet(binding, result);
		return result;
	}
	
	private static org.emftext.language.java.references.Reference internalConvertToReference(ITypeBinding binding) {
		org.emftext.language.java.references.IdentifierReference idRef = org.emftext.language.java.references.ReferencesFactory.eINSTANCE.createIdentifierReference();
		idRef.setTarget(JDTResolverUtility.getClassifier(binding));
		if (binding.isNested()) {
			org.emftext.language.java.references.Reference parentRef = internalConvertToReference(binding.getDeclaringClass());
			parentRef.setNext(idRef);
		}
		return idRef;
	}
	
	private static org.emftext.language.java.references.Reference getTopReference(org.emftext.language.java.references.Reference ref) {
		org.emftext.language.java.references.Reference currentRef = ref;
		org.emftext.language.java.references.Reference parentRef = ref.getPrevious();
		while (parentRef != null) {
			currentRef = parentRef;
			parentRef = currentRef.getPrevious();
		}
		return currentRef;
	}
	
	private static org.emftext.language.java.members.Field convertToField(IVariableBinding binding) {
		org.emftext.language.java.members.Field result = JDTResolverUtility.getField(binding);
		result.getAnnotationsAndModifiers().addAll(convertToModifiers(binding.getModifiers()));
		for (IAnnotationBinding annotBind : binding.getAnnotations()) {
			result.getAnnotationsAndModifiers().add(convertToAnnotationInstance(annotBind));
		}
		result.setName(binding.getName());
		result.setTypeReference(convertToTypeReferences(binding.getType()).get(0));
		if (binding.getConstantValue() != null) {
			result.setInitialValue(convertToPrimaryExpression(binding.getConstantValue()));
		}
		return result;
	}
	
	private static org.emftext.language.java.members.EnumConstant convertToEnumConstant(IVariableBinding binding) {
		org.emftext.language.java.members.EnumConstant result = JDTResolverUtility.getEnumConstant(binding);
		for (IAnnotationBinding annotBind : binding.getAnnotations()) {
			result.getAnnotations().add(convertToAnnotationInstance(annotBind));
		}
		result.setName(binding.getName());
		return result;
	}
	
	private static org.emftext.language.java.members.Method convertToMethod(IMethodBinding binding) {
		return null;
	}
	
	private static org.emftext.language.java.annotations.AnnotationInstance convertToAnnotationInstance(IAnnotationBinding binding) {
		org.emftext.language.java.annotations.AnnotationInstance result = org.emftext.language.java.annotations.AnnotationsFactory.eINSTANCE.createAnnotationInstance();
		org.emftext.language.java.classifiers.Annotation resultClass = JDTResolverUtility.getAnnotation(binding.getAnnotationType());
		convertToNameAndSet(binding.getAnnotationType(), resultClass);
		result.setAnnotation(resultClass);
		if (binding.getDeclaredMemberValuePairs().length > 0) {
			org.emftext.language.java.annotations.AnnotationParameterList params =
				org.emftext.language.java.annotations.AnnotationsFactory.eINSTANCE.createAnnotationParameterList();
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
		result.setAttribute(JDTResolverUtility.getInterfaceMethod(binding.getMethodBinding()));
		result.setValue(convertToAnnotationValue(binding.getValue()));
		return result;
	}
	
	private static org.emftext.language.java.annotations.AnnotationValue convertToAnnotationValue(Object value) {
		if (value instanceof IVariableBinding) {
			IVariableBinding varBind = (IVariableBinding) value;
			org.emftext.language.java.references.Reference parentRef = internalConvertToReference(varBind.getDeclaringClass());
			org.emftext.language.java.references.IdentifierReference varRef = org.emftext.language.java.references.ReferencesFactory.eINSTANCE.createIdentifierReference();
			varRef.setTarget(JDTResolverUtility.getEnumConstant(varBind));
			parentRef.setNext(varRef);
			return getTopReference(varRef);
		} else if (value instanceof IAnnotationBinding) {
			return convertToAnnotationInstance((IAnnotationBinding) value);
		} else if (value.getClass().isArray()) {
			Object[] values = (Object[]) value;
			org.emftext.language.java.arrays.ArrayInitializer initializer = org.emftext.language.java.arrays.ArraysFactory.eINSTANCE.createArrayInitializer();
			for (int index = 0; index < values.length; index++) {
				initializer.getInitialValues().add((org.emftext.language.java.arrays.ArrayInitializationValue)
					convertToAnnotationValue(values[index]));
			}
			return initializer;
		} else if (value instanceof ITypeBinding) {
			org.emftext.language.java.references.Reference parentRef = internalConvertToReference((ITypeBinding) value);
			org.emftext.language.java.references.ReflectiveClassReference classRef = org.emftext.language.java.references.ReferencesFactory.eINSTANCE.createReflectiveClassReference();
			parentRef.setNext(classRef);
			return getTopReference(classRef);
		} else {
			return convertToPrimaryExpression(value);
		}
	}
	
	private static org.emftext.language.java.expressions.PrimaryExpression convertToPrimaryExpression(Object value) {
		if (value instanceof String) {
			org.emftext.language.java.references.StringReference ref = org.emftext.language.java.references.ReferencesFactory.eINSTANCE.createStringReference();
			ref.setValue((String) value);
			return ref;
		} else if (value instanceof Boolean) {
			org.emftext.language.java.literals.BooleanLiteral literal = org.emftext.language.java.literals.LiteralsFactory.eINSTANCE.createBooleanLiteral();
			literal.setValue((boolean) value);
			return literal;
		} else if (value instanceof Character) {
			org.emftext.language.java.literals.CharacterLiteral literal = org.emftext.language.java.literals.LiteralsFactory.eINSTANCE.createCharacterLiteral();
			literal.setValue((char) value);
			return literal;
		} else if (value instanceof Byte || value instanceof Short || value instanceof Integer) {
			org.emftext.language.java.literals.DecimalIntegerLiteral literal = org.emftext.language.java.literals.LiteralsFactory.eINSTANCE.createDecimalIntegerLiteral();
			literal.setDecimalValue(BigInteger.valueOf((long) value));
			return literal;
		} else if (value instanceof Long) {
			org.emftext.language.java.literals.DecimalLongLiteral literal = org.emftext.language.java.literals.LiteralsFactory.eINSTANCE.createDecimalLongLiteral();
			literal.setDecimalValue(BigInteger.valueOf((long) value));
			return literal;
		} else if (value instanceof Float) {
			org.emftext.language.java.literals.DecimalFloatLiteral literal = org.emftext.language.java.literals.LiteralsFactory.eINSTANCE.createDecimalFloatLiteral();
			literal.setDecimalValue((float) value);
			return literal;
		} else { // value instanceof Double
			org.emftext.language.java.literals.DecimalDoubleLiteral literal = org.emftext.language.java.literals.LiteralsFactory.eINSTANCE.createDecimalDoubleLiteral();
			literal.setDecimalValue((double) value);
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
	
	private static org.emftext.language.java.containers.Package convertToPackage(IPackageBinding binding) {
		return null;
	}
}
