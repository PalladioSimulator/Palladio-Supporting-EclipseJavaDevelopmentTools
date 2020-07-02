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
package org.emftext.language.java.operators.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>operators</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class OperatorsTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new OperatorsTests("operators Tests");
		suite.addTestSuite(AssignmentTest.class);
		suite.addTestSuite(AssignmentAndTest.class);
		suite.addTestSuite(AssignmentDivisionTest.class);
		suite.addTestSuite(AssignmentExclusiveOrTest.class);
		suite.addTestSuite(AssignmentMinusTest.class);
		suite.addTestSuite(AssignmentModuloTest.class);
		suite.addTestSuite(AssignmentMultiplicationTest.class);
		suite.addTestSuite(AssignmentLeftShiftTest.class);
		suite.addTestSuite(AssignmentOrTest.class);
		suite.addTestSuite(AssignmentPlusTest.class);
		suite.addTestSuite(AssignmentRightShiftTest.class);
		suite.addTestSuite(AssignmentUnsignedRightShiftTest.class);
		suite.addTestSuite(EqualTest.class);
		suite.addTestSuite(NotEqualTest.class);
		suite.addTestSuite(GreaterThanTest.class);
		suite.addTestSuite(GreaterThanOrEqualTest.class);
		suite.addTestSuite(LessThanTest.class);
		suite.addTestSuite(LessThanOrEqualTest.class);
		suite.addTestSuite(AdditionTest.class);
		suite.addTestSuite(SubtractionTest.class);
		suite.addTestSuite(DivisionTest.class);
		suite.addTestSuite(MultiplicationTest.class);
		suite.addTestSuite(RemainderTest.class);
		suite.addTestSuite(ComplementTest.class);
		suite.addTestSuite(MinusMinusTest.class);
		suite.addTestSuite(NegateTest.class);
		suite.addTestSuite(PlusPlusTest.class);
		suite.addTestSuite(LeftShiftTest.class);
		suite.addTestSuite(RightShiftTest.class);
		suite.addTestSuite(UnsignedRightShiftTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatorsTests(String name) {
		super(name);
	}

} //OperatorsTests
