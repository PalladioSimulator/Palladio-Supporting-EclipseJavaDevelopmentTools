package org.emftext.language.java.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.emftext.language.java.classifiers.impl.ClassifierImpl;

/**
 * This class represents a temporarily unknown type.
 */
public class TemporalUnknownType extends ClassifierImpl {

	private EObject creator;

	public TemporalUnknownType(EObject creator) {
		this.creator = creator;
	}

	@Override
	public Resource eResource() {
		return creator.eResource();
	}

	public EObject getCreator() {
		return creator;
	}
}
