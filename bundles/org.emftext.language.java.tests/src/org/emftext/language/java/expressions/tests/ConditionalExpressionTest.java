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
package org.emftext.language.java.expressions.tests;

import junit.textui.TestRunner;

import org.emftext.language.java.expressions.ConditionalExpression;
import org.emftext.language.java.expressions.ExpressionsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Conditional Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.emftext.language.java.expressions.ConditionalExpression#getExpressionElse() <em>Get Expression Else</em>}</li>
 *   <li>{@link org.emftext.language.java.expressions.ConditionalExpression#setExpressionChild(org.emftext.language.java.expressions.AssignmentExpressionChild) <em>Set Expression Child</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ConditionalExpressionTest extends AssignmentExpressionChildTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ConditionalExpressionTest.class);
	}

	/**
	 * Constructs a new Conditional Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalExpressionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Conditional Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ConditionalExpression getFixture() {
		return (ConditionalExpression)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ExpressionsFactory.eINSTANCE.createConditionalExpression());
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
	 * Tests the '{@link org.emftext.language.java.expressions.ConditionalExpression#getExpressionElse() <em>Get Expression Else</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.expressions.ConditionalExpression#getExpressionElse()
	 * @generated
	 */
	public void testGetExpressionElse() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.emftext.language.java.expressions.ConditionalExpression#setExpressionChild(org.emftext.language.java.expressions.AssignmentExpressionChild) <em>Set Expression Child</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.expressions.ConditionalExpression#setExpressionChild(org.emftext.language.java.expressions.AssignmentExpressionChild)
	 * @generated
	 */
	public void testSetExpressionChild__AssignmentExpressionChild() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //ConditionalExpressionTest
