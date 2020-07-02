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
package org.emftext.language.java.literals.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>literals</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class LiteralsTests extends TestSuite {

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
		TestSuite suite = new LiteralsTests("literals Tests");
		suite.addTestSuite(BooleanLiteralTest.class);
		suite.addTestSuite(CharacterLiteralTest.class);
		suite.addTestSuite(DecimalFloatLiteralTest.class);
		suite.addTestSuite(HexFloatLiteralTest.class);
		suite.addTestSuite(DecimalDoubleLiteralTest.class);
		suite.addTestSuite(HexDoubleLiteralTest.class);
		suite.addTestSuite(DecimalIntegerLiteralTest.class);
		suite.addTestSuite(HexIntegerLiteralTest.class);
		suite.addTestSuite(OctalIntegerLiteralTest.class);
		suite.addTestSuite(BinaryIntegerLiteralTest.class);
		suite.addTestSuite(DecimalLongLiteralTest.class);
		suite.addTestSuite(HexLongLiteralTest.class);
		suite.addTestSuite(OctalLongLiteralTest.class);
		suite.addTestSuite(BinaryLongLiteralTest.class);
		suite.addTestSuite(NullLiteralTest.class);
		suite.addTestSuite(SuperTest.class);
		suite.addTestSuite(ThisTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralsTests(String name) {
		super(name);
	}

} //LiteralsTests
