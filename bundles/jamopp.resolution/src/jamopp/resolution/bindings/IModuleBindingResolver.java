package jamopp.resolution.bindings;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.core.dom.IModuleBinding;
import org.emftext.language.java.JavaClasspath;
import org.emftext.language.java.LogicalJavaURIGenerator;

class IModuleBindingResolver extends AbstractBindingResolver<IModuleBinding> {
	protected IModuleBindingResolver(CentralBindingBasedResolver parentResolver) {
		super(parentResolver);
	}

	@Override
	protected EObject resolve(IModuleBinding binding) {
		org.emftext.language.java.containers.Module mod =
				JavaClasspath.get().getModule(binding.getName());
		if (mod != null && !mod.eIsProxy()) {
			return mod;
		}
		mod = JDTBindingConverterUtility.convertToModule(binding);
		// Logical URI of the module is used to create the corresponding resource.
		URI uri = LogicalJavaURIGenerator.getModuleURI(mod.getNamespacesAsString());
		Resource modContainer = this.getParentResolver().getResourceSet().createResource(uri);
		modContainer.getContents().add(mod);
		// For the registration, the physical URI is used.
		uri = JavaClasspath.get().getURIMap().get(uri);
		JavaClasspath.get().registerJavaRoot(mod, uri);
		return mod;
	}
}
