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
 *      - Extension for Java 7-13
 ******************************************************************************/
package org.emftext.language.java.resource.java.analysis;

/**
 * A ReferenceCache can be used to improve the performance of the reference
 * resolving. This default implementation is initialized by traversing the content
 * of the current resource. During this traversal, two maps are created. One (the
 * classToObject map) can be used to retrieve all objects of a given type. The
 * other one (the nameToObjects map) can be used to retrieve all objects for a
 * given name.
 */
public class JavaReferenceCache extends org.eclipse.emf.common.notify.impl.AdapterImpl implements org.emftext.language.java.resource.java.IJavaReferenceCache {
	
	private java.util.Map<org.eclipse.emf.ecore.EClass, java.util.Set<org.eclipse.emf.ecore.EObject>> classToObjectsMap = new java.util.LinkedHashMap<org.eclipse.emf.ecore.EClass, java.util.Set<org.eclipse.emf.ecore.EObject>>();
	private java.util.Map<String, java.util.Set<org.eclipse.emf.ecore.EObject>> nameToObjectsMap  = new java.util.LinkedHashMap<String, java.util.Set<org.eclipse.emf.ecore.EObject>>();
	private boolean isInitialized;
	private org.emftext.language.java.resource.java.IJavaNameProvider nameProvider;
	
	public JavaReferenceCache(org.emftext.language.java.resource.java.IJavaNameProvider nameProvider) {
		super();
		this.nameProvider = nameProvider;
	}
	
	public java.util.Set<org.eclipse.emf.ecore.EObject> getObjects(org.eclipse.emf.ecore.EClass type) {
		return classToObjectsMap.get(type);
	}
	
	public void initialize(org.eclipse.emf.ecore.EObject root) {
		if (isInitialized) {
			return;
		}
		put(root);
		java.util.Iterator<org.eclipse.emf.ecore.EObject> it = root.eAllContents();
		while (it.hasNext()) {
			put(it.next());
		}
		isInitialized = true;
	}
	
	public java.util.Map<String, java.util.Set<org.eclipse.emf.ecore.EObject>> getNameToObjectsMap() {
		return nameToObjectsMap;
	}
	
	private void put(org.eclipse.emf.ecore.EObject object) {
		org.eclipse.emf.ecore.EClass eClass = object.eClass();
		put(classToObjectsMap, eClass, object);
		java.util.List<String> names = nameProvider.getNames(object);
		for (String name : names) {
			put(nameToObjectsMap, name, object);
		}
	}
	
	private <T> void put(java.util.Map<T, java.util.Set<org.eclipse.emf.ecore.EObject>> map, T key, org.eclipse.emf.ecore.EObject object) {
		if (!map.containsKey(key)) {
			map.put(key, new java.util.LinkedHashSet<org.eclipse.emf.ecore.EObject>());
		}
		map.get(key).add(object);
	}
	
	public void clear() {
		classToObjectsMap.clear();
		nameToObjectsMap.clear();
		isInitialized = false;
	}
	
}