/*******************************************************************************
 * Copyright (c) 2006-2015
 * Software Technology Group, Dresden University of Technology
 * DevBoost GmbH, Dresden, Amtsgericht Dresden, HRB 34001
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Software Technology Group - TU Dresden, Germany;
 *   DevBoost GmbH - Dresden, Germany
 *      - initial API and implementation
 ******************************************************************************/
package org.emftext.language.java.test.bulk;

import org.eclipse.emf.ecore.resource.Resource;
import org.emftext.language.java.JavaClasspath;

public class CustomClasspathInitializer implements JavaClasspath.Initializer {

	private final boolean requiresStdLib;

	public CustomClasspathInitializer(boolean requiresStdLib) {
		this.requiresStdLib = requiresStdLib;
	}

	@Override
	public boolean requiresStdLib() {
		return requiresStdLib;
	}

	@Override
	public boolean requiresLocalClasspath() {
		return true;
	}

	@Override
	public void initialize(Resource resource) {
		// Do nothing
	}
}