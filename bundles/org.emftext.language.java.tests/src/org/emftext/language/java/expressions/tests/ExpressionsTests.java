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

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>expressions</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExpressionsTests extends TestSuite {

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
		TestSuite suite = new ExpressionsTests("expressions Tests");
		suite.addTestSuite(ExpressionListTest.class);
		suite.addTestSuite(AssignmentExpressionTest.class);
		suite.addTestSuite(ConditionalExpressionTest.class);
		suite.addTestSuite(ConditionalOrExpressionTest.class);
		suite.addTestSuite(ConditionalAndExpressionTest.class);
		suite.addTestSuite(InclusiveOrExpressionTest.class);
		suite.addTestSuite(ExclusiveOrExpressionTest.class);
		suite.addTestSuite(AndExpressionTest.class);
		suite.addTestSuite(EqualityExpressionTest.class);
		suite.addTestSuite(InstanceOfExpressionTest.class);
		suite.addTestSuite(RelationExpressionTest.class);
		suite.addTestSuite(ShiftExpressionTest.class);
		suite.addTestSuite(AdditiveExpressionTest.class);
		suite.addTestSuite(MultiplicativeExpressionTest.class);
		suite.addTestSuite(UnaryExpressionTest.class);
		suite.addTestSuite(PrefixUnaryModificationExpressionTest.class);
		suite.addTestSuite(SuffixUnaryModificationExpressionTest.class);
		suite.addTestSuite(CastExpressionTest.class);
		suite.addTestSuite(NestedExpressionTest.class);
		suite.addTestSuite(PrimaryExpressionReferenceExpressionTest.class);
		suite.addTestSuite(ClassTypeConstructorReferenceExpressionTest.class);
		suite.addTestSuite(ArrayConstructorReferenceExpressionTest.class);
		suite.addTestSuite(LambdaExpressionTest.class);
		suite.addTestSuite(ExplicitlyTypedLambdaParametersTest.class);
		suite.addTestSuite(ImplicitlyTypedLambdaParametersTest.class);
		suite.addTestSuite(SingleImplicitLambdaParameterTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionsTests(String name) {
		super(name);
	}

} //ExpressionsTests
