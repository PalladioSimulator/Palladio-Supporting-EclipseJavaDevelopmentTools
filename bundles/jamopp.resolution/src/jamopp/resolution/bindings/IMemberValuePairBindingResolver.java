package jamopp.resolution.bindings;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.dom.IMemberValuePairBinding;

class IMemberValuePairBindingResolver extends AbstractBindingResolver<IMemberValuePairBinding> {
	protected IMemberValuePairBindingResolver(CentralBindingBasedResolver parentResolver) {
		super(parentResolver);
	}

	@Override
	protected EObject resolve(IMemberValuePairBinding binding) {
		return this.getParentResolver().resolve(binding.getMethodBinding());
	}
}
