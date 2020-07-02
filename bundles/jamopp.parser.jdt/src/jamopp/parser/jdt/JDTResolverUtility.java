package jamopp.parser.jdt;

import java.util.HashMap;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jdt.core.dom.IModuleBinding;

public class JDTResolverUtility {
	private static ResourceSet resourceSet;
	private static HashMap<IModuleBinding, org.emftext.language.java.containers.Module> modBindToMod = new HashMap<>();
	
	static void setResourceSet(ResourceSet set) {
		resourceSet = set;
	}
	
	static org.emftext.language.java.containers.Module getModule(IModuleBinding binding) {
		if (modBindToMod.containsKey(binding)) {
			return modBindToMod.get(binding);
		} else {
			org.emftext.language.java.containers.Module result = org.emftext.language.java.containers.ContainersFactory.eINSTANCE.createModule();
			Resource newResource = resourceSet.createResource(URI.createHierarchicalURI("empty", "JaMoPP", null, new String[] {binding.getName(), "module-info.java"}, null, null));
			newResource.getContents().add(result);
			modBindToMod.put(binding, result);
			return result;
		}
	}
}
