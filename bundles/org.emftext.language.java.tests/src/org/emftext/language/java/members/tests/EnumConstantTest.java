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
package org.emftext.language.java.members.tests;

import junit.textui.TestRunner;

import org.emftext.language.java.members.EnumConstant;
import org.emftext.language.java.members.MembersFactory;

import org.emftext.language.java.references.tests.ReferenceableElementTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Enum Constant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.emftext.language.java.references.Argumentable#getArgumentTypes() <em>Get Argument Types</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class EnumConstantTest extends ReferenceableElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EnumConstantTest.class);
	}

	/**
	 * Constructs a new Enum Constant test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumConstantTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Enum Constant test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EnumConstant getFixture() {
		return (EnumConstant)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MembersFactory.eINSTANCE.createEnumConstant());
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
	 * Tests the '{@link org.emftext.language.java.references.Argumentable#getArgumentTypes() <em>Get Argument Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.references.Argumentable#getArgumentTypes()
	 * @generated
	 */
	public void testGetArgumentTypes() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //EnumConstantTest
