package jamopp.resolution.bindings;

import org.eclipse.emf.ecore.EObject;
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
	
	public CentralBindingBasedResolver() {
		typeResolver = new ITypeBindingResolver(this);
		moduleResolver = new IModuleBindingResolver(this);
		packageResolver = new IPackageBindingResolver(this);
		annotationResolver = new IAnnotationBindingResolver(this);
		memberValueResolver = new IMemberValuePairBindingResolver(this);
		methodResolver = new IMethodBindingResolver(this);
		variableResolver = new IVariableBindingResolver(this);
	}
	
	public EObject resolve(IBinding binding) {
		if (binding == null || binding.isRecovered()) {
			return null;
		}
		if (binding instanceof ITypeBinding) {
			return typeResolver.resolve((ITypeBinding) binding);
		} else if (binding instanceof IModuleBinding) {
			return moduleResolver.resolve((IModuleBinding) binding);
		} else if (binding instanceof IPackageBinding) {
			return packageResolver.resolve((IPackageBinding) binding);
		} else if (binding instanceof IAnnotationBinding) {
			return annotationResolver.resolve((IAnnotationBinding) binding);
		} else if (binding instanceof IMemberValuePairBinding) {
			return memberValueResolver.resolve((IMemberValuePairBinding) binding);
		} else if (binding instanceof IMethodBinding) {
			return methodResolver.resolve((IMethodBinding) binding);
		} else if (binding instanceof IVariableBinding) {
			return variableResolver.resolve((IVariableBinding) binding);
		}
		return null;
	}
}
