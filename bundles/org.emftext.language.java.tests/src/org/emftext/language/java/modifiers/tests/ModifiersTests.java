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
package org.emftext.language.java.modifiers.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>modifiers</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModifiersTests extends TestSuite {

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
		TestSuite suite = new ModifiersTests("modifiers Tests");
		suite.addTestSuite(AbstractTest.class);
		suite.addTestSuite(FinalTest.class);
		suite.addTestSuite(NativeTest.class);
		suite.addTestSuite(ProtectedTest.class);
		suite.addTestSuite(PublicTest.class);
		suite.addTestSuite(PrivateTest.class);
		suite.addTestSuite(StaticTest.class);
		suite.addTestSuite(StrictfpTest.class);
		suite.addTestSuite(SynchronizedTest.class);
		suite.addTestSuite(TransientTest.class);
		suite.addTestSuite(VolatileTest.class);
		suite.addTestSuite(DefaultTest.class);
		suite.addTestSuite(TransitiveTest.class);
		suite.addTestSuite(OpenTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifiersTests(String name) {
		super(name);
	}

} //ModifiersTests
