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
package org.emftext.language.java.resource.java;

/**
 * An extended resource that can hold information about the exact positions of
 * each element of its content in a text file. This can be used to give more
 * detailed error feedback.
 */
public interface IJavaTextResource extends org.eclipse.emf.ecore.resource.Resource {
	
	/**
	 * Returns the raw contents of this resource. This method must be used by
	 * generated classes only. It is not intended to be used by clients.
	 */
	public org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> getContentsInternal();
	
	/**
	 * Try to load the content of this resource from the given stream. If loading
	 * fails, the state of this resource is kept. If loading is successful, the
	 * content of this resource is replaced with the new content.
	 * This method can be used to try loading erroneous files, as e.g., needed during
	 * background parsing in the editor.
	 * 
	 * @param stream the stream to read from
	 * @param options the load options to use
	 * 
	 * @throws java.io.IOException thrown if the stream can not be read
	 */
	public void reload(java.io.InputStream stream, java.util.Map<?,?> options) throws java.io.IOException;

	/**
	 * Internal method used by the parser to register a context dependent proxy object
	 * for later resolution.
	 * 
	 * @param container
	 * @param reference
	 * @param position
	 * @param id
	 * @param proxyElement
	 */
	public <ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject> void registerContextDependentProxy(org.emftext.language.java.resource.java.IJavaContextDependentURIFragmentFactory<ContainerType, ReferenceType> factory, ContainerType container, org.eclipse.emf.ecore.EReference reference, String id, org.eclipse.emf.ecore.EObject proxyElement, int position);
	
	@Deprecated	
	public void addWarning(String message, org.eclipse.emf.ecore.EObject cause);
	

	@Deprecated	
	public void addError(String message, org.eclipse.emf.ecore.EObject cause);
}
