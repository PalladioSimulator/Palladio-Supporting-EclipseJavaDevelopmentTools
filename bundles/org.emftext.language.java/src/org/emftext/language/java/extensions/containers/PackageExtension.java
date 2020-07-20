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
 ******************************************************************************/
package org.emftext.language.java.extensions.containers;

import java.util.Iterator;

import org.emftext.language.java.JavaUniquePathConstructor;

public class PackageExtension {
	public static String getNamespacesAsString(org.emftext.language.java.containers.Package me) {
		String packageName = ""; 
		for (Iterator<String> it = me.getNamespaces().iterator(); it.hasNext(); ) {
			String namespaceFragment = it.next();
			packageName = packageName + namespaceFragment + JavaUniquePathConstructor.PACKAGE_SEPARATOR;
		}
		return packageName;
	}
}
