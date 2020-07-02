/**
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
 *  
 */
package org.emftext.language.java.containers.tests;

import junit.textui.TestRunner;

import org.emftext.language.java.containers.ContainersFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.emftext.language.java.containers.Package#getNamespacesAsString() <em>Get Namespaces As String</em>}</li>
 *   <li>{@link org.emftext.language.java.containers.Package#getClassifiersInSamePackage() <em>Get Classifiers In Same Package</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class PackageTest extends JavaRootTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PackageTest.class);
	}

	/**
	 * Constructs a new Package test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Package test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected org.emftext.language.java.containers.Package getFixture() {
		return (org.emftext.language.java.containers.Package)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ContainersFactory.eINSTANCE.createPackage());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link org.emftext.language.java.containers.Package#getNamespacesAsString() <em>Get Namespaces As String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.containers.Package#getNamespacesAsString()
	 * @generated
	 */
	public void testGetNamespacesAsString() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.emftext.language.java.containers.Package#getClassifiersInSamePackage() <em>Get Classifiers In Same Package</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.containers.Package#getClassifiersInSamePackage()
	 * @generated
	 */
	public void testGetClassifiersInSamePackage() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //PackageTest
