package jamopp.resolution.bindings;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jdt.core.dom.IAnnotationBinding;
import org.eclipse.jdt.core.dom.IBinding;
import org.eclipse.jdt.core.dom.IMemberValuePairBinding;
import org.eclipse.jdt.core.dom.IMethodBinding;
import org.eclipse.jdt.core.dom.IModuleBinding;
import org.eclipse.jdt.core.dom.IPackageBinding;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.IVariableBinding;

public class CentralBindingBasedResolver {
	private ITypeBindingResolver typeResolver;
	private IModuleBindingResolver moduleResolver;
	private IPackageBindingResolver packageResolver;
	private IAnnotationBindingResolver annotationResolver;
	private IMemberValuePairBindingResolver memberValueResolver;
	private IMethodBindingResolver methodResolver;
	private IVariableBindingResolver variableResolver;
	private ResourceSet resSet;
	
	public CentralBindingBasedResolver(ResourceSet set) {
		typeResolver = new ITypeBindingResolver(this);
		moduleResolver = new IModuleBindingResolver(this);
		packageResolver = new IPackageBindingResolver(this);
		annotationResolver = new IAnnotationBindingResolver(this);
		memberValueResolver = new IMemberValuePairBindingResolver(this);
		methodResolver = new IMethodBindingResolver(this);
		variableResolver = new IVariableBindingResolver(this);
		resSet = set;
	}
	
	public EObject resolve(IBinding binding) {
		if (binding == null || binding.isRecovered()) {
			return null;
		}
		if (binding.getKind() == IBinding.TYPE) {
			return typeResolver.resolve((ITypeBinding) binding);
		} else if (binding.getKind() == IBinding.MODULE) {
			return moduleResolver.resolve((IModuleBinding) binding);
		} else if (binding.getKind() == IBinding.PACKAGE) {
			return packageResolver.resolve((IPackageBinding) binding);
		} else if (binding.getKind() == IBinding.ANNOTATION) {
			return annotationResolver.resolve((IAnnotationBinding) binding);
		} else if (binding.getKind() == IBinding.MEMBER_VALUE_PAIR) {
			return memberValueResolver.resolve((IMemberValuePairBinding) binding);
		} else if (binding.getKind() == IBinding.METHOD) {
			return methodResolver.resolve((IMethodBinding) binding);
		} else if (binding.getKind() == IBinding.VARIABLE) {
			return variableResolver.resolve((IVariableBinding) binding);
		}
		return null;
	}
	
	ResourceSet getResourceSet() {
		return resSet;
	}
}
