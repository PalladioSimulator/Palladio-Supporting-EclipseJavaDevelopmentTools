/*******************************************************************************
 * Copyright (c) 2006-2013
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

package org.emftext.language.java.test.xmi;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.EqualityHelper;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.emftext.language.java.containers.CompilationUnit;
import org.emftext.language.java.containers.JavaRoot;
import org.emftext.language.java.containers.Package;
import org.emftext.language.java.test.AbstractJaMoPPTests;
import org.junit.Test;

public class JavaXMISerializationTest extends AbstractJaMoPPTests {

	protected static final String TEST_INPUT_FOLDER_NAME = "src-input";
	protected static final String TEST_OUTPUT_FOLDER_NAME = "output";
	
	// The following files can not be saved to XMI, because they contain
	// characters XML (1.0) does not support.
	protected static final String[] filesWithInvalidCharacters = new String [] {
		"EscapedStrings.java", "UnicodeIdentifiers.java", "SpecialCharacters.java", 
		"StaticImports.java", //because it depends on EscapedStrings
		"MoreUnicodeCharacters.java", 
		"ControlZ.java", "UnicodeSurrogateCharacters.java" //here the issue exists only in the layout information
	};
	
	@Test
	public void testXMISerialization() throws Exception {
		File inputFolder = new File("./" + TEST_INPUT_FOLDER_NAME);
		List<File> allTestFiles = collectAllFilesRecursive(inputFolder, "java");
		
		for (final File file : allTestFiles) {
			if (!Arrays.asList(filesWithInvalidCharacters).contains(file.getName())) {
				load(file);
			}
		}

		transferToXMI();
		
		for (final File file : allTestFiles) {
			if (!Arrays.asList(filesWithInvalidCharacters).contains(file.getName())) {
				compare(file);
			}
		}
	}

	private void load(final File file) {
		try {
			loadResource(file.getAbsolutePath());
		}
		catch (Exception e) {
			e.printStackTrace();
			fail(e.getClass() +  ": " + e.getMessage());
		}
	}
	
	private void transferToXMI() throws Exception {
		ResourceSet rs = getResourceSet();
		EcoreUtil.resolveAll(rs);
		int emptyFileName = 0;
		
		for (Resource javaResource : new ArrayList<Resource>(rs.getResources())) {
			assertResolveAllProxies(javaResource);
			if (javaResource.getContents().isEmpty()) {
				System.out.println("WARNING: Emtpy Resource: " + javaResource.getURI());
				continue;
			}
			JavaRoot root = (JavaRoot) javaResource.getContents().get(0);
			String outputFileName = "ERROR";
			if (root instanceof CompilationUnit) {
				outputFileName = root.getNamespacesAsString().replace(".", File.separator) + File.separator;
				CompilationUnit cu = (CompilationUnit) root;
				if (cu.getClassifiers().size() > 0) {
					outputFileName += cu.getClassifiers().get(0).getName();
				} else {
					outputFileName += emptyFileName++;
				}

			} else if (root instanceof Package) {
				outputFileName = root.getNamespacesAsString().replace(".", File.separator) + File.separator + "package-info";
				if (outputFileName.startsWith(File.separator)) {
					outputFileName = outputFileName.substring(1);
				}
			} else if (root instanceof org.emftext.language.java.containers.Module) {
				outputFileName = root.getNamespacesAsString().replace(".", File.separator) + File.separator + "module-info";
			} else {
				fail();
			}
			File outputFile = new File("." + File.separator + TEST_OUTPUT_FOLDER_NAME + File.separator + outputFileName);
			URI xmiFileURI = URI.createFileURI(outputFile.getAbsolutePath()).appendFileExtension("xmi");	
			Resource xmiResource = rs.createResource(xmiFileURI);
			xmiResource.getContents().addAll(javaResource.getContents());

		}
		for (Resource xmiResource : rs.getResources()) {
			if (xmiResource instanceof XMIResource) {
				try {
					xmiResource.save(rs.getLoadOptions());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

	}
	
	protected void compare(File file) throws Exception {
		ResourceSet rs = getResourceSet();
		String outputXMIFileName = calculateOutputFilename(file,
				getTestInputFolder(), TEST_OUTPUT_FOLDER);
		URI xmiFileURI = URI.createFileURI(outputXMIFileName).trimFileExtension().appendFileExtension("xmi");
		Resource xmiResource = rs.getResource(xmiFileURI, false);
		assertNotNull(xmiResource);
		EObject root = xmiResource.getContents().get(0);
		xmiResource.save(rs.getLoadOptions());
		
		//reload
		ResourceSet reloadeSet = super.getResourceSet();
		Resource reloadedResource = null;
		try {
			reloadedResource = reloadeSet.getResource(xmiFileURI, true);
		} catch (Exception e) {
			fail(e.getClass() +  ": " + e.getMessage());
			return;
		}
		assertResolveAllProxies(reloadedResource);
		for (Diagnostic d : reloadedResource.getErrors()) {
			System.out.println(d.getMessage());
		}
		assertTrue("Parsed XMI contains errors", 
				reloadedResource.getErrors().isEmpty());
		
		EObject reloadedRoot = reloadedResource.getContents().get(0);
	    EqualityHelper equalityHelper = new EqualityHelper() {
			private static final long serialVersionUID = 1L;

			@Override
	    	public boolean equals(EObject eObject1, EObject eObject2) {
	    		boolean result = super.equals(eObject1, eObject2);
	    		if (!result) {
	    			System.out.println("Not equal: " + eObject1 + " != " + eObject2);
	    		}
	    		return result;
	    	}
	    	
	    	@Override
	    	protected boolean haveEqualFeature(EObject eObject1,
	    			EObject eObject2, EStructuralFeature feature) {
	    		if (feature.isTransient()) {
	    			//ignore transient features
	    			return true;
	    		}
	    		return super.haveEqualFeature(eObject1, eObject2, feature);
	    	}
	    };
	    
	    assertTrue("Original and reloaded XMI are not equal",
	    		equalityHelper.equals(root, reloadedRoot));
	}
	
	private ResourceSet sharedRS;
	
	@Override
	protected ResourceSet getResourceSet() throws Exception {
		if (sharedRS == null) {
			sharedRS = super.getResourceSet();
		}
		return sharedRS;
	}

	@Override
	protected boolean isExcludedFromReprintTest(String filename) {
		return true;
	}

	@Override
	protected String getTestInputFolder() {
		return TEST_INPUT_FOLDER_NAME;
	}
}
