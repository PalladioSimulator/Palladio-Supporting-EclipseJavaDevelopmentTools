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
package org.emftext.language.java.arrays.tests;

import junit.textui.TestRunner;

import org.emftext.language.java.arrays.ArrayDimension;
import org.emftext.language.java.arrays.ArraysFactory;

import org.emftext.language.java.commons.tests.CommentableTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Array Dimension</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArrayDimensionTest extends CommentableTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ArrayDimensionTest.class);
	}

	/**
	 * Constructs a new Array Dimension test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayDimensionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Array Dimension test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ArrayDimension getFixture() {
		return (ArrayDimension)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ArraysFactory.eINSTANCE.createArrayDimension());
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

} //ArrayDimensionTest
