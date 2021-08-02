package jamopp.resolution.bindings;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.core.dom.IPackageBinding;
import org.emftext.language.java.JavaClasspath;
import org.emftext.language.java.LogicalJavaURIGenerator;

import jamopp.options.ParserOptions;
import jamopp.proxy.IJavaContextDependentURIFragmentCollector;

class IPackageBindingResolver extends AbstractBindingResolver<IPackageBinding> {
	protected IPackageBindingResolver(CentralBindingBasedResolver parentResolver) {
		super(parentResolver);
	}

	@Override
	protected EObject resolve(IPackageBinding binding) {
		URI uri = LogicalJavaURIGenerator.getPackageURI(binding.getName());
		Resource packContainer = this.getParentResolver().findResourceInResourceSet(uri);
		if (packContainer == null) {
			if (ParserOptions.PREFER_BINDING_CONVERSION.isTrue()) {
				return convertBindingToPackage(binding, uri);
			}
			try {
				packContainer = this.getParentResolver().getResourceSet().getResource(uri, true);
				if (packContainer != null) {
					return (org.emftext.language.java.containers.Package) packContainer.getContents().get(0);
				}
			} catch (RuntimeException e) {
			}
		} else {
			return (org.emftext.language.java.containers.Package) packContainer.getContents().get(0);
		}
		return convertBindingToPackage(binding, uri);
	}
	
	private org.emftext.language.java.containers.Package convertBindingToPackage(IPackageBinding binding, URI uri) {
		IJavaContextDependentURIFragmentCollector.GLOBAL_INSTANCE.setBaseURI(uri);
		org.emftext.language.java.containers.Package result = JDTBindingConverterUtility.convertToPackage(binding);
		// The logical URI is used to create the corresponding resource.
		Resource packContainer = this.getParentResolver().getResourceSet().createResource(uri);
		packContainer.getContents().add(result);
		// For the registration, the physical URI is used.
		uri = JavaClasspath.get(this.getParentResolver().getResourceSet()).getURIMap().get(uri);
		JavaClasspath.get(this.getParentResolver().getResourceSet()).registerJavaRoot(result, uri);
		return result;
	}
}
