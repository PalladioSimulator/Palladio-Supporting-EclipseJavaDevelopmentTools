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

package org.emftext.language.java.test.bugs;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emftext.language.java.classifiers.ClassifiersFactory;
import org.emftext.language.java.containers.CompilationUnit;
import org.emftext.language.java.containers.ContainersFactory;
import org.junit.Test;

public class Bug1819Test extends AbstractBugTestCase {
	
	private final static String LINE_BREAK = System.getProperty("line.separator");
	
	@Test
	public void testDefaultPackage() throws IOException {
		String className = "TestName";
		
		ResourceSet rs = createResourceSet();
		Resource r = rs.createResource(URI.createHierarchicalURI(
			"empty", "JaMoPP-Class", null, new String[] {className + ".java"}, null, null));
		CompilationUnit cu = ContainersFactory.eINSTANCE.createCompilationUnit();
		org.emftext.language.java.classifiers.Class clazz = ClassifiersFactory.eINSTANCE.createClass();
		clazz.setName(className);
		cu.getClassifiers().add(clazz);
		
		r.getContents().add(cu);
		
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		r.save(os , null);
		String result = new String(os.toByteArray()).trim();
	
		assertEquals("class " + className + " {" + LINE_BREAK + "}", result);
	}
	
	@Test
	public void testMissingDeclaredPackage() throws IOException {
		String className = "TestName";
		String packageName = "a.b.c";
		
		ResourceSet rs = createResourceSet();
		Resource resource = rs.createResource(URI.createHierarchicalURI(
			"empty", "JaMoPP-Class", null, new String[] {packageName + "." + className + ".java"}, null, null));
		CompilationUnit cu = ContainersFactory.eINSTANCE.createCompilationUnit();
		org.emftext.language.java.classifiers.Class clazz = ClassifiersFactory.eINSTANCE.createClass();
		clazz.setName(className);
		cu.getClassifiers().add(clazz);
		
		resource.getContents().add(cu);
		
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		resource.save(os , null);
		String result = new String(os.toByteArray()).trim();
		
		assertEquals("package " + packageName + ";" + LINE_BREAK + LINE_BREAK
				+ LINE_BREAK + "class " + className + " {" + LINE_BREAK + "}",
				result);
	}
}
