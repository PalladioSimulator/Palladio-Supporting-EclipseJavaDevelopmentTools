package jamopp.resolution.bindings;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.dom.IMethodBinding;

class IMethodBindingResolver extends AbstractBindingResolver<IMethodBinding> {
	protected IMethodBindingResolver(CentralBindingBasedResolver parentResolver) {
		super(parentResolver);
	}

	@Override
	protected EObject resolve(IMethodBinding binding) {
		return null;
	}
}
