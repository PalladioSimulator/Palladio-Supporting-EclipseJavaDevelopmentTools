package jamopp.resolution.bindings;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.dom.IModuleBinding;
import org.emftext.language.java.JavaClasspath;

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
		return JDTBindingConverterUtility.convertToModule(binding);
	}
}
