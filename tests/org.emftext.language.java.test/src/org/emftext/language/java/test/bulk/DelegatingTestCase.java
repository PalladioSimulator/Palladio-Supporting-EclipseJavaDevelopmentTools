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

import junit.framework.TestCase;

public class DelegatingTestCase extends TestCase {

	private final ZipFileEntryTestCase zipFileEntryTestCase;

	public DelegatingTestCase(ZipFileEntryTestCase zipFileEntryTestCase) {
		super("Parse " + (zipFileEntryTestCase.isExcludeFromReprint() ? "" : "and reprint: ")
				+ zipFileEntryTestCase.getZipEntry().getName());
		this.zipFileEntryTestCase = zipFileEntryTestCase;
	}

	@Override
	protected void runTest() throws Throwable {
		zipFileEntryTestCase.runTest();
	}

	@Override
	protected void tearDown() throws Exception {
		zipFileEntryTestCase.tearDown();
	}
}