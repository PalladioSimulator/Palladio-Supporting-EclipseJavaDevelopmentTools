package jamopp.resolution.bindings;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.dom.IAnnotationBinding;

class IAnnotationBindingResolver extends AbstractBindingResolver<IAnnotationBinding> {
	protected IAnnotationBindingResolver(CentralBindingBasedResolver parentResolver) {
		super(parentResolver);
	}

	@Override
	protected EObject resolve(IAnnotationBinding binding) {
		return this.getParentResolver().resolve(binding.getAnnotationType());
	}
}
