package jamopp.parser.jdt;

import java.util.HashMap;

import org.eclipse.jdt.core.dom.IModuleBinding;

public class JDTResolverUtility {
	private static HashMap<IModuleBinding, org.emftext.language.java.containers.Module> modBindToMod = new HashMap<>();
	
	static org.emftext.language.java.containers.Module getModule(IModuleBinding binding) {
		if (modBindToMod.containsKey(binding)) {
			return modBindToMod.get(binding);
		} else {
			org.emftext.language.java.containers.Module result = org.emftext.language.java.containers.ContainersFactory.eINSTANCE.createModule();
			modBindToMod.put(binding, result);
			return result;
		}
	}
}
