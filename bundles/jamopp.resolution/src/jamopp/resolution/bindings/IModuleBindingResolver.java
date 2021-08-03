package jamopp.resolution.bindings;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.core.dom.IModuleBinding;
import org.emftext.language.java.JavaClasspath;
import org.emftext.language.java.LogicalJavaURIGenerator;

import jamopp.options.ParserOptions;

class IModuleBindingResolver extends AbstractBindingResolver<IModuleBinding> {
	protected IModuleBindingResolver(CentralBindingBasedResolver parentResolver) {
		super(parentResolver);
	}

	@Override
	protected EObject resolve(IModuleBinding binding) {
		URI uri = LogicalJavaURIGenerator.getModuleURI(binding.getName());
		Resource modContainer = this.getParentResolver().findResourceInResourceSet(uri);
		if (modContainer == null) {
			if (ParserOptions.PREFER_BINDING_CONVERSION.isTrue()) {
				return convertBindingToModule(binding, uri);
			}
			try {
				modContainer = this.getParentResolver().getResourceSet().getResource(uri, true);
				if (modContainer != null) {
					return (org.emftext.language.java.containers.Module) modContainer.getContents().get(0);
				}
			} catch (RuntimeException e) {
			}
		} else {
			return (org.emftext.language.java.containers.Module) modContainer.getContents().get(0);
		}
		return convertBindingToModule(binding, uri);
	}
	
	private org.emftext.language.java.containers.Module convertBindingToModule(IModuleBinding binding, URI uri) {
		org.emftext.language.java.containers.Module result =
				JDTBindingConverterUtility.convertToModule(binding);
		// Logical URI of the module is used to create the corresponding resource.
		Resource modContainer = this.getParentResolver().getResourceSet().createResource(uri);
		modContainer.getContents().add(result);
		// For the registration, the physical URI is used.
		uri = JavaClasspath.get(this.getParentResolver().getResourceSet()).getURIMap().get(uri);
		JavaClasspath.get(this.getParentResolver().getResourceSet()).registerJavaRoot(result, uri);
		return result;
	}
}
