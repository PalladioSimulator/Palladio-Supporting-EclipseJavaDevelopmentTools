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
package org.emftext.language.java.resolver.result;

import org.eclipse.emf.common.util.URI;

/**
 * A basic implementation of the
 * org.emftext.language.java.resource.java.IJavaURIMapping interface that can map
 * identifiers to URIs.
 * 
 * @param <ReferenceType> unused type parameter which is needed to implement
 * org.emftext.language.java.resource.java.IJavaURIMapping.
 */
public class JavaURIMapping<ReferenceType> implements IJavaURIMapping<ReferenceType> {
	private URI uri;
	private String identifier;
	private String warning;
	
	public JavaURIMapping(String identifier, URI newIdentifier, String warning) {
		this.uri = newIdentifier;
		this.identifier = identifier;
		this.warning = warning;
	}
	
	@Override
	public URI getTargetIdentifier() {
		return uri;
	}
	
	@Override
	public String getIdentifier() {
		return identifier;
	}
	
	@Override
	public String getWarning() {
		return warning;
	}
}
