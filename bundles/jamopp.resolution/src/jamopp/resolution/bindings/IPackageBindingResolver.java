package jamopp.resolution.bindings;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.core.dom.IPackageBinding;
import org.emftext.language.java.JavaClasspath;
import org.emftext.language.java.LogicalJavaURIGenerator;

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
		pack = JDTBindingConverterUtility.convertToPackage(binding);
		URI uri = LogicalJavaURIGenerator.getPackageURI(pack.getNamespacesAsString());
		Resource packContainer = this.getParentResolver().getResourceSet().createResource(uri);
		packContainer.getContents().add(pack);
		JavaClasspath.get().registerJavaRoot(pack, uri);
		return pack;
	}
}
