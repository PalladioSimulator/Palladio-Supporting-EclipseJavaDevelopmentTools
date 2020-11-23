package org.emftext.language.java.resource.java;

import java.util.LinkedHashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;

public interface IJavaContextDependentURIFragmentWrapper {
	static final IJavaContextDependentURIFragmentWrapper GLOBAL_INSTANCE = new IJavaContextDependentURIFragmentWrapperImpl();
	
	void setBaseURI(URI uri);
	<ContainerType extends EObject, ReferenceType extends EObject> void registerContextDependentProxy(IJavaContextDependentURIFragmentFactory<ContainerType, ReferenceType> factory, ContainerType container, EReference reference, String id, EObject proxyElement, int position);
	Map<String, IJavaContextDependentURIFragment<? extends EObject>> getInternalURIFragmentMap();
	
	class IJavaContextDependentURIFragmentWrapperImpl implements IJavaContextDependentURIFragmentWrapper {
		private URI baseURI;
		private int proxyCounter = 0;
		private Map<String, IJavaContextDependentURIFragment<? extends EObject>> internalURIFragmentMap = new LinkedHashMap<String, IJavaContextDependentURIFragment<? extends EObject>>();
		
		@Override
		public void setBaseURI(URI uri) {
			baseURI = uri;
		}
		
		@Override
		public <ContainerType extends EObject, ReferenceType extends EObject> void registerContextDependentProxy(IJavaContextDependentURIFragmentFactory<ContainerType, ReferenceType> factory, ContainerType container, EReference reference, String id, EObject proxyElement, int position) {
			InternalEObject proxy = (InternalEObject) proxyElement;
			String internalURIFragment = IJavaContextDependentURIFragment.INTERNAL_URI_FRAGMENT_PREFIX + (proxyCounter++) + "_" + id;
			IJavaContextDependentURIFragment<?> uriFragment = factory.create(id, container, reference, position, proxy);
			proxy.eSetProxyURI(baseURI.appendFragment(internalURIFragment));
			internalURIFragmentMap.put(internalURIFragment, uriFragment);
		}
		
		@Override
		public Map<String, IJavaContextDependentURIFragment<? extends EObject>> getInternalURIFragmentMap() {
			return internalURIFragmentMap;
		}
	}
}
