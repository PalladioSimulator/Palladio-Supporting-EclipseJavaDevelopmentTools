package jamopp.resource;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

public class JavaResource2Factory implements Resource.Factory {
	@Override
	public Resource createResource(URI uri) {
		return new JavaResource2(uri);
	}
}
