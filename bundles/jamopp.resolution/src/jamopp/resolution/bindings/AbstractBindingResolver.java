package jamopp.resolution.bindings;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.dom.IBinding;

abstract class AbstractBindingResolver<T extends IBinding> {
	private CentralBindingBasedResolver resolver;
	
	protected AbstractBindingResolver(CentralBindingBasedResolver parentResolver) {
		resolver = parentResolver;
	}
	
	protected CentralBindingBasedResolver getParentResolver() {
		return resolver;
	}
	
	protected abstract EObject resolve(T binding);
}
