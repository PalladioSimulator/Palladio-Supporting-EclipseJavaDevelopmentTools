package jamopp.resolution.bindings;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.dom.IVariableBinding;
import org.emftext.language.java.classifiers.ConcreteClassifier;
import org.emftext.language.java.classifiers.Enumeration;
import org.emftext.language.java.members.EnumConstant;
import org.emftext.language.java.members.Field;
import org.emftext.language.java.members.Member;

class IVariableBindingResolver extends AbstractBindingResolver<IVariableBinding> {
	protected IVariableBindingResolver(CentralBindingBasedResolver parentResolver) {
		super(parentResolver);
	}

	@Override
	protected EObject resolve(IVariableBinding binding) {
		if (binding.isEnumConstant()) {
			Enumeration e = (Enumeration) this.getParentResolver().resolve(binding.getDeclaringClass());
			for (EnumConstant enCons : e.getConstants()) {
				if (enCons.getName().equals(binding.getName())) {
					return enCons;
				}
			}
		} else if (binding.isField()) {
			ConcreteClassifier container = (ConcreteClassifier) this.getParentResolver()
					.resolve(binding.getDeclaringClass());
			for (Member mem : container.getMembers()) {
				if (mem instanceof Field && ((Field) mem).getName().equals(binding.getName())) {
					return mem;
				}
			}
		}
		return null;
	}
}
