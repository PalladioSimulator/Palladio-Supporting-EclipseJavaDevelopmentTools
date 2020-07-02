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
package org.emftext.language.java.statements.tests;

import junit.textui.TestRunner;

import org.emftext.language.java.statements.StatementsFactory;
import org.emftext.language.java.statements.TryBlock;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Try Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.emftext.language.java.statements.TryBlock#getCatcheBlocks() <em>Get Catche Blocks</em>}</li>
 *   <li>{@link org.emftext.language.java.statements.TryBlock#getStatements() <em>Get Statements</em>}</li>
 *   <li>{@link org.emftext.language.java.statements.StatementListContainer#getLocalVariable(java.lang.String) <em>Get Local Variable</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class TryBlockTest extends StatementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TryBlockTest.class);
	}

	/**
	 * Constructs a new Try Block test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TryBlockTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Try Block test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TryBlock getFixture() {
		return (TryBlock)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StatementsFactory.eINSTANCE.createTryBlock());
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
	 * Tests the '{@link org.emftext.language.java.statements.TryBlock#getCatcheBlocks() <em>Get Catche Blocks</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.statements.TryBlock#getCatcheBlocks()
	 * @generated
	 */
	public void testGetCatcheBlocks() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.emftext.language.java.statements.TryBlock#getStatements() <em>Get Statements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.statements.TryBlock#getStatements()
	 * @generated
	 */
	public void testGetStatements() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.emftext.language.java.statements.StatementListContainer#getLocalVariable(java.lang.String) <em>Get Local Variable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.statements.StatementListContainer#getLocalVariable(java.lang.String)
	 * @generated
	 */
	public void testGetLocalVariable__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //TryBlockTest
