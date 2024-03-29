/*******************************************************************************
 * Copyright (c) 2006-2014
 * Software Technology Group, Dresden University of Technology
 * DevBoost GmbH, Berlin, Amtsgericht Charlottenburg, HRB 140026
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Software Technology Group - TU Dresden, Germany;
 *   DevBoost GmbH - Berlin, Germany
 *      - initial API and implementation
 *   Martin Armbruster
 *      - Adaptation and extension for Java 7+
 ******************************************************************************/
package jamopp.resolution.util;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * A utility class to resolve proxy objects that allows to terminate the resolution.
 */
public class JavaInterruptibleEcoreResolver {
	
	private boolean terminate = false;
	
	public void terminate() {
		terminate = true;
	}
	
	/**
	 * Visits all proxies in the ResourceSet and tries to resolve them.
	 * 
	 * @param resourceSet the objects to visit.
	 */
	public void resolveAll(ResourceSet resourceSet) {
		List<Resource> resources = resourceSet.getResources();
		for (int i = 0; i < resources.size() && !terminate; i++) {
			resolveAll(resources.get(i));
		}
	}
	
	/**
	 * Visits all proxies in the Resource and tries to resolve them.
	 * 
	 * @param resource the objects to visit.
	 */
	public void resolveAll(Resource resource) {
		for (EObject eObject : resource.getContents()) {
			if (terminate) {
				return;
			}
			resolveAll(eObject);
		}
	}
	
	/**
	 * Visits all proxies referenced by the object and recursively any of its
	 * contained objects.
	 * 
	 * @param eObject the object to visit.
	 */
	public void resolveAll(EObject eObject) {
		eObject.eContainer();
		resolveCrossReferences(eObject);
		for (Iterator<EObject> i = eObject.eAllContents(); i.hasNext();) {
			if (terminate) {
				return;
			}
			EObject childEObject = i.next();
			resolveCrossReferences(childEObject);
		}
	}
	
	protected void resolveCrossReferences(EObject eObject) {
		for (Iterator<EObject> i = eObject.eCrossReferences().iterator(); i.hasNext(); i.next()) {
			// The loop resolves the cross references by visiting them.
			if (terminate) {
				return;
			}
		}
	}
	
	/**
	 * Searches for all unresolved proxy objects in the given resource.
	 * 
	 * @param resource the Resource.
	 * 
	 * @return all proxy objects that are not resolvable.
	 */
	public Set<EObject> findUnresolvedProxies(Resource resource) {
		Set<EObject> unresolvedProxies = new LinkedHashSet<>();
		
		for (Iterator<EObject> elementIt = EcoreUtil.getAllContents(resource, true); elementIt.hasNext();) {
			InternalEObject nextElement = (InternalEObject) elementIt.next();
			if (terminate) {
				return unresolvedProxies;
			}
			if (nextElement.eIsProxy()) {
				unresolvedProxies.add(nextElement);
			}
			for (EObject crElement : nextElement.eCrossReferences()) {
				if (terminate) {
					return unresolvedProxies;
				}
				crElement = EcoreUtil.resolve(crElement, resource);
				if (crElement.eIsProxy()) {
					unresolvedProxies.add(crElement);
				}
			}
		}
		return unresolvedProxies;
	}
	
	/**
	 * Searches for all unresolved proxy objects in the given ResourceSet.
	 * 
	 * @param resourceSet the ResourceSet.
	 * 
	 * @return all proxy objects that are not resolvable.
	 */
	public Set<EObject> findUnresolvedProxies(ResourceSet resourceSet) {
		Set<EObject> unresolvedProxies = new LinkedHashSet<EObject>();
		
		for (Resource resource : resourceSet.getResources()) {
			if (terminate) {
				return unresolvedProxies;
			}
			unresolvedProxies.addAll(findUnresolvedProxies(resource));
		}
		return unresolvedProxies;
	}
}
