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
package org.emftext.language.java.variables.tests;

import junit.textui.TestRunner;

import org.emftext.language.java.references.tests.ReferenceableElementTest;

import org.emftext.language.java.variables.AdditionalLocalVariable;
import org.emftext.language.java.variables.VariablesFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Additional Local Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.emftext.language.java.variables.AdditionalLocalVariable#getArrayDimension() <em>Get Array Dimension</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class AdditionalLocalVariableTest extends ReferenceableElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AdditionalLocalVariableTest.class);
	}

	/**
	 * Constructs a new Additional Local Variable test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionalLocalVariableTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Additional Local Variable test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AdditionalLocalVariable getFixture() {
		return (AdditionalLocalVariable)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(VariablesFactory.eINSTANCE.createAdditionalLocalVariable());
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
	 * Tests the '{@link org.emftext.language.java.variables.AdditionalLocalVariable#getArrayDimension() <em>Get Array Dimension</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.variables.AdditionalLocalVariable#getArrayDimension()
	 * @generated
	 */
	public void testGetArrayDimension() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //AdditionalLocalVariableTest
