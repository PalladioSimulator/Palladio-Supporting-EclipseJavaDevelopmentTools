/*******************************************************************************
 * Copyright 2021 Marvin Meller
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Marvin Meller
 *      - initial implementation
 ******************************************************************************/
package org.emftext.language.java.test.standalone;

import java.nio.file.Paths;

import org.eclipse.emf.ecore.resource.Resource.Factory.Registry;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emftext.language.java.test.bugs.AbstractBugTestCase;
import org.junit.jupiter.api.Test;

import jamopp.parser.jdt.singlefile.JaMoPPJDTSingleFileParser;
import jamopp.resource.JavaResource2Factory;

/**
 * {@code EcoreUtil.resolveAll(...)} throws {@code NullPointerException}.
 *
 * @author Marvin Meller
 */
public class StandaloneTest extends AbstractBugTestCase {
	@Test
	public void testResolveAll() {
		Registry.INSTANCE.getExtensionToFactoryMap().put("java", new JavaResource2Factory());
		EcoreUtil.resolveAll(new JaMoPPJDTSingleFileParser().parseDirectory(Paths.get("src-standalone")));
	}
}
