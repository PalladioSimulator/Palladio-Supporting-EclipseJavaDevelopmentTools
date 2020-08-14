package jamopp.parser.jdt;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.core.dom.IAnnotationBinding;
import org.eclipse.jdt.core.dom.IMethodBinding;
import org.eclipse.jdt.core.dom.IPackageBinding;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.IVariableBinding;

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
	
	private static org.emftext.language.java.members.Field convertToField(IVariableBinding binding) {
		return null;
	}
	
	private static org.emftext.language.java.members.Method convertToMethod(IMethodBinding binding) {
		return null;
	}
	
	private static org.emftext.language.java.annotations.AnnotationInstance convertToAnnotationInstance(IAnnotationBinding binding) {
		return null;
	}
	
	private static List<org.emftext.language.java.modifiers.Modifier> convertToModifiers(int modifiers) {
		ArrayList<org.emftext.language.java.modifiers.Modifier> result = new ArrayList<>();
		return result;
	}
	
	private static org.emftext.language.java.containers.Package convertToPackage(IPackageBinding binding) {
		return null;
	}
}
