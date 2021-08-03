package jamopp.resolution.bindings;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
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
	
	public CentralBindingBasedResolver() {
		this(new ResourceSetImpl());
	}
	
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
		EObject res = null;
		if (binding.getKind() == IBinding.TYPE) {
			res =  typeResolver.resolve((ITypeBinding) binding);
		} else if (binding.getKind() == IBinding.MODULE) {
			res =  moduleResolver.resolve((IModuleBinding) binding);
		} else if (binding.getKind() == IBinding.PACKAGE) {
			res =  packageResolver.resolve((IPackageBinding) binding);
		} else if (binding.getKind() == IBinding.ANNOTATION) {
			res =  annotationResolver.resolve((IAnnotationBinding) binding);
		} else if (binding.getKind() == IBinding.MEMBER_VALUE_PAIR) {
			res =  memberValueResolver.resolve((IMemberValuePairBinding) binding);
		} else if (binding.getKind() == IBinding.METHOD) {
			res =  methodResolver.resolve((IMethodBinding) binding);
		} else if (binding.getKind() == IBinding.VARIABLE) {
			res = variableResolver.resolve((IVariableBinding) binding);
		}
		return res;
	}
	
	ResourceSet getResourceSet() {
		return resSet;
	}
	
	Resource findResourceInResourceSet(URI uri) {
		for (Resource res : resSet.getResources()) {
			if (res.getURI().equals(uri)) {
				return res;
			}
		}
		return null;
	}
}
