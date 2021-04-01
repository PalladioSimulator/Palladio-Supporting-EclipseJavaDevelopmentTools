package jamopp.resolution.bindings;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.dom.IPackageBinding;
import org.emftext.language.java.JavaClasspath;

class IPackageBindingResolver extends AbstractBindingResolver<IPackageBinding> {
	protected IPackageBindingResolver(CentralBindingBasedResolver parentResolver) {
		super(parentResolver);
	}

	@Override
	protected EObject resolve(IPackageBinding binding) {
		org.emftext.language.java.containers.Package pack =
				JavaClasspath.get().getPackage(binding.getName());
		if (pack != null && !pack.eIsProxy()) {
			return pack;
		}
		return JDTBindingConverterUtility.convertToPackage(binding);
	}
}
