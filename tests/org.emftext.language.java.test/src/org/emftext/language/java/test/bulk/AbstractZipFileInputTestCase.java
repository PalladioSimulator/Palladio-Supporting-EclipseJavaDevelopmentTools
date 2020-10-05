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

import static org.junit.Assert.fail;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.apache.commons.compress.archivers.ArchiveException;
import org.apache.commons.compress.archivers.ArchiveStreamFactory;
import org.apache.commons.compress.archivers.examples.Expander;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emftext.language.java.test.AbstractJaMoPPTests;

import jamopp.parser.jdt.JaMoPPJDTParser;

public class AbstractZipFileInputTestCase extends AbstractJaMoPPTests {
	private final static String BASE_ZIP = "";
	private final static String END_ZIP = "src.zip";
	private final static String END_SRC = "src";
	private String inputFolder;
	private String generalInputFolder;
	
	@Override
	protected boolean isExcludedFromReprintTest(String filename) {
		return false;
	}

	@Override
	protected String getTestInputFolder() {
		return generalInputFolder == null ? BASE_ZIP + inputFolder + END_SRC : generalInputFolder;
	}
	
	private String getSrcZip() {
		return generalInputFolder == null ? BASE_ZIP + inputFolder + END_ZIP : null;
	}
	
	private void testProject() {
		JaMoPPJDTParser parser = new JaMoPPJDTParser();
		Path target = null;
		if (generalInputFolder == null) {
			decompressZipFile();
		}
		target = Paths.get(getTestInputFolder());
		ResourceSet set = parser.parseDirectory(target);
		try {
			this.testReprint(set);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
	
	private void decompressZipFile() {
		Path file = Paths.get(getSrcZip());
		if (Files.exists(file)) {
			Path target = Paths.get(getTestInputFolder());
			try {
				new Expander().expand(ArchiveStreamFactory.ZIP, file.toFile(), target.toFile());
			} catch (IOException | ArchiveException e) {
				fail(e.getMessage());
			}
		} else {
			fail("File " + file + " is not a zip file.");
		}
	}
}
