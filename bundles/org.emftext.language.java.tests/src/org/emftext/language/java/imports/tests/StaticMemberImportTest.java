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
package org.emftext.language.java.imports.tests;

import junit.textui.TestRunner;

import org.emftext.language.java.imports.ImportsFactory;
import org.emftext.language.java.imports.StaticMemberImport;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Static Member Import</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StaticMemberImportTest extends StaticImportTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StaticMemberImportTest.class);
	}

	/**
	 * Constructs a new Static Member Import test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticMemberImportTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Static Member Import test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StaticMemberImport getFixture() {
		return (StaticMemberImport)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ImportsFactory.eINSTANCE.createStaticMemberImport());
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

} //StaticMemberImportTest
