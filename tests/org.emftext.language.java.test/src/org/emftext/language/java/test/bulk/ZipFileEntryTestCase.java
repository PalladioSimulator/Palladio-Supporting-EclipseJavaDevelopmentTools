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

import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emftext.language.java.JavaClasspath;
import org.emftext.language.java.resource.java.IJavaOptions;
import org.emftext.language.java.test.AbstractJavaParserTestCase;

/**
 * A test that can be used to parse and print an entry from a ZIP file.
 */
public class ZipFileEntryTestCase extends AbstractJavaParserTestCase {

	private final ZipFile zipFile;
	private final ZipEntry zipEntry;
	private final boolean excludeFromReprint;
	private final boolean prefixUsedInZipFile;
	private final IClasspathSetter classpathSetter;

	/**
	 * Creates a new test for the given entry in a ZIP file.
	 * 
	 * @param zipFile
	 * @param zipEntry
	 * @param excludeFromReprint
	 * @param prefixUsedInZipFile
	 */
	public ZipFileEntryTestCase(ZipFile zipFile, ZipEntry zipEntry, boolean excludeFromReprint,
			boolean prefixUsedInZipFile, IClasspathSetter classpathSetter) {
		this.zipFile = zipFile;
		this.excludeFromReprint = excludeFromReprint;
		this.prefixUsedInZipFile = prefixUsedInZipFile;
		this.zipEntry = zipEntry;
		this.classpathSetter = classpathSetter;
	}

	public void runTest() {
		try {
			if (isExcludedFromReprintTest(zipFile.getName())) {
				parseAllEntries();
			} else {
				/*
				 * // if there is more entries that must be printed // together we have to parse them before if
				 * (entries.size() > 1) { parseAllEntries(); }
				 */
				parseAndReprintAllEntries();
			}
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getClass() + ": " + e.getMessage());
		}
	}

	@Override
	protected Map<Object, Object> getLoadOptions() {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put(JavaClasspath.OPTION_USE_LOCAL_CLASSPATH, Boolean.TRUE);
		map.put(JavaClasspath.OPTION_REGISTER_STD_LIB, Boolean.FALSE);
		map.put(IJavaOptions.DISABLE_LOCATION_MAP, Boolean.TRUE);
		map.put(IJavaOptions.DISABLE_LAYOUT_INFORMATION_RECORDING, Boolean.TRUE);
		return map;
	}

	protected void setUpClasspath(ResourceSet resourceSet) throws Exception {
		// Sub class can override this method
		if (classpathSetter != null) {
			classpathSetter.setUpClasspath(resourceSet);
		}
	}

	private void parseAndReprintEntry(ZipEntry entry) throws Exception {
		String plainZipFileName = zipFile.getName().substring(AbstractZipFileInputTestCase.BULK_INPUT_DIR.length());
		plainZipFileName = plainZipFileName.substring(0, plainZipFileName.length() - File.separator.length()
				- "src.zip".length());

		parseAndReprint(zipFile, entry, "output/" + plainZipFileName, "input/" + plainZipFileName);
	}

	private void parseAllEntries() throws Exception {
		parseResource(zipFile, zipEntry);
	}

	private void parseAndReprintAllEntries() throws Exception {
		parseAndReprintEntry(zipEntry);
	}

	@Override
	protected boolean isExcludedFromReprintTest(String filename) {
		return excludeFromReprint;
	}

	@Override
	protected boolean ignoreSemanticErrors(String filename) {
		return excludeFromReprint;
	}

	@Override
	protected String getTestInputFolder() {
		return null;
	}

	@Override
	protected boolean prefixUsedInZipFile() {
		return prefixUsedInZipFile;
	}

	@Override
	public void addParsedResource(File file) {
		// do nothing to avoid storing unneeded file objects in memory
	}

	@Override
	public void addReprintedResource(File file) {
		// do nothing to avoid storing unneeded file objects in memory
	}

	public boolean isExcludeFromReprint() {
		return excludeFromReprint;
	}

	public ZipEntry getZipEntry() {
		return zipEntry;
	}

	public void tearDown() {
		JavaClasspath.reset();
	}
}
