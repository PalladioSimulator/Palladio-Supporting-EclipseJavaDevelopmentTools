package jamopp.resolution.bindings;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.dom.IVariableBinding;

class IVariableBindingResolver extends AbstractBindingResolver<IVariableBinding> {
	protected IVariableBindingResolver(CentralBindingBasedResolver parentResolver) {
		super(parentResolver);
	}

	@Override
	protected EObject resolve(IVariableBinding binding) {
		return null;
	}
}
