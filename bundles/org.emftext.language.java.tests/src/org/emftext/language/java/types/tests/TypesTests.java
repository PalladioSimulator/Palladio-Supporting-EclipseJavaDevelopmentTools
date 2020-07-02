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
package org.emftext.language.java.types.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>types</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypesTests extends TestSuite {

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
		TestSuite suite = new TypesTests("types Tests");
		suite.addTestSuite(ClassifierReferenceTest.class);
		suite.addTestSuite(NamespaceClassifierReferenceTest.class);
		suite.addTestSuite(BooleanTest.class);
		suite.addTestSuite(ByteTest.class);
		suite.addTestSuite(CharTest.class);
		suite.addTestSuite(DoubleTest.class);
		suite.addTestSuite(FloatTest.class);
		suite.addTestSuite(IntTest.class);
		suite.addTestSuite(LongTest.class);
		suite.addTestSuite(ShortTest.class);
		suite.addTestSuite(VoidTest.class);
		suite.addTestSuite(InferableTypeTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesTests(String name) {
		super(name);
	}

} //TypesTests
