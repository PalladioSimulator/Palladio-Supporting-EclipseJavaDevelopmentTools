package jamopp.resolution.bindings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.emftext.language.java.JavaClasspath;
import org.emftext.language.java.LogicalJavaURIGenerator;
import org.emftext.language.java.classifiers.AnonymousClass;
import org.emftext.language.java.classifiers.ConcreteClassifier;
import org.emftext.language.java.containers.CompilationUnit;
import org.emftext.language.java.generics.TypeParameter;
import org.emftext.language.java.generics.TypeParametrizable;
import org.emftext.language.java.members.Member;
import org.emftext.language.java.members.MemberContainer;

class ITypeBindingResolver extends AbstractBindingResolver<ITypeBinding> {
	private Pattern parentNamePattern;
	private Pattern innerNamesPattern;
	
	protected ITypeBindingResolver(CentralBindingBasedResolver parentResolver) {
		super(parentResolver);
		parentNamePattern = Pattern.compile("([a-zA-Z0-9\\.]+?)([\\$[0-9]*?([a-zA-z][a-zA-z0-9]*?)??]+?)");
		innerNamesPattern = Pattern.compile("\\$([0-9]*?)([a-zA-Z][a-zA-Z0-9]*?)??");
	}

	@Override
	protected EObject resolve(ITypeBinding binding) {
		binding = binding.getTypeDeclaration();
		if (binding.isAnonymous() || binding.isLocal()) {
			return findLocalOrAnonymousClass(binding.getBinaryName());
		} else if (binding.isArray()) {
			return this.getParentResolver().resolve(binding.getElementType());
		} else if (binding.isTypeVariable()) {
			TypeParametrizable param;
			if (binding.getDeclaringClass() != null) {
				param = (TypeParametrizable) this.getParentResolver().resolve(binding.getDeclaringClass());
			} else {
				param = (TypeParametrizable) this.getParentResolver().resolve(binding.getDeclaringMethod());
			}
			for (TypeParameter p : param.getTypeParameters()) {
				if (p.getName().equals(binding.getName())) {
					return p;
				}
			}
		} else if (binding.isMember() || binding.isTopLevel()) {
			ConcreteClassifier classifier = JavaClasspath.get().getConcreteClassifier(
					binding.getQualifiedName());
			if (classifier != null && !classifier.eIsProxy()) {
				return classifier;
			}
			CompilationUnit cu = JDTBindingConverterUtility.convertToCompilationUnit(binding);
			URI uri = LogicalJavaURIGenerator.getJavaFileResourceURI(cu.getClassifiers().get(0).getQualifiedName());
			Resource res = this.getParentResolver().getResourceSet().createResource(uri);
			res.getContents().add(cu);
			JavaClasspath.get().registerJavaRoot(cu, uri);
			return JavaClasspath.get().getConcreteClassifier(binding.getQualifiedName());
		}
		return null;
	}
	
	private EObject findLocalOrAnonymousClass(String binaryName) {
		Matcher m1 = parentNamePattern.matcher(binaryName);
		if (m1.matches()) {
			String parentName = m1.group(1);
			ConcreteClassifier parentClassifier = JavaClasspath.get().getConcreteClassifier(parentName);
			if (parentClassifier != null && !parentClassifier.eIsProxy()) {
				Matcher m2 = innerNamesPattern.matcher(m1.group(2));
				MemberContainer currentContainer = parentClassifier;
				while (m2.find()) {
					String index = m2.group(1);
					String innerClass = m2.group(2);
					if (index == null && innerClass != null) {
						for (Member mem : currentContainer.getMembers()) {
							if (mem instanceof ConcreteClassifier
									&& ((ConcreteClassifier) mem).getName()
									.equals(innerClass)) {
								currentContainer = (ConcreteClassifier) mem;
							}
						}
					} else if (index != null && innerClass != null) {
						int i = Integer.parseInt(index);
						int currentIndex = 1;
						for (ConcreteClassifier conClass : currentContainer
								.getChildrenByType(ConcreteClassifier.class)) {
							if (!(conClass.eContainer() instanceof MemberContainer)) {
								EObject conContainer = conClass.getContainingAnonymousClass();
								if (conContainer != null
										&& conContainer.equals(currentContainer)) {
									if (currentIndex == i) {
										conContainer = conClass;
										break;
									} else {
										currentIndex++;
										continue;
									}
								}
								conContainer = conClass.getContainingConcreteClassifier();
								if (currentContainer.equals(conContainer)) {
									if (currentIndex == i) {
										conContainer = conClass;
										break;
									} else {
										currentIndex++;
									}
								}
							}
						}
					} else if (index != null && innerClass == null) {
						int i = Integer.parseInt(index);
						int currentIndex = 1;
						for (AnonymousClass ano
								: currentContainer.getChildrenByType(AnonymousClass.class)) {
							EObject anoContainer = ano.getContainingAnonymousClass();
							if (anoContainer != null && anoContainer.equals(currentContainer)) {
								if (currentIndex == i) {
									currentContainer = ano;
									break;
								} else {
									currentIndex++;
									continue;
								}
							}
							anoContainer = ano.getContainingConcreteClassifier();
							if (currentContainer.equals(anoContainer)) {
								if (currentIndex == i) {
									currentContainer = ano;
									break;
								} else {
									currentIndex++;
								}
							}
						}
					}
				}
				return currentContainer;
			}
		}
		return null;
	}
}
