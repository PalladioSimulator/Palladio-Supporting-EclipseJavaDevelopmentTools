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

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>statements</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class StatementsTests extends TestSuite {

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
		TestSuite suite = new StatementsTests("statements Tests");
		suite.addTestSuite(AssertTest.class);
		suite.addTestSuite(BreakTest.class);
		suite.addTestSuite(BlockTest.class);
		suite.addTestSuite(CatchBlockTest.class);
		suite.addTestSuite(ConditionTest.class);
		suite.addTestSuite(ContinueTest.class);
		suite.addTestSuite(DefaultSwitchCaseTest.class);
		suite.addTestSuite(DoWhileLoopTest.class);
		suite.addTestSuite(EmptyStatementTest.class);
		suite.addTestSuite(ExpressionStatementTest.class);
		suite.addTestSuite(ForLoopTest.class);
		suite.addTestSuite(ForEachLoopTest.class);
		suite.addTestSuite(JumpLabelTest.class);
		suite.addTestSuite(LocalVariableStatementTest.class);
		suite.addTestSuite(NormalSwitchCaseTest.class);
		suite.addTestSuite(ReturnTest.class);
		suite.addTestSuite(SwitchTest.class);
		suite.addTestSuite(SynchronizedBlockTest.class);
		suite.addTestSuite(ThrowTest.class);
		suite.addTestSuite(TryBlockTest.class);
		suite.addTestSuite(WhileLoopTest.class);
		suite.addTestSuite(YieldStatementTest.class);
		suite.addTestSuite(DefaultSwitchRuleTest.class);
		suite.addTestSuite(NormalSwitchRuleTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatementsTests(String name) {
		super(name);
	}

} //StatementsTests
