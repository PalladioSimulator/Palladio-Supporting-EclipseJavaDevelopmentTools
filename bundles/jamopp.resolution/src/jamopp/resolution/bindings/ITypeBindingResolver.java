package jamopp.resolution.bindings;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.dom.ITypeBinding;

class ITypeBindingResolver extends AbstractBindingResolver<ITypeBinding> {
	protected ITypeBindingResolver(CentralBindingBasedResolver parentResolver) {
		super(parentResolver);
	}

	@Override
	protected EObject resolve(ITypeBinding binding) {
		return null;
	}
}
