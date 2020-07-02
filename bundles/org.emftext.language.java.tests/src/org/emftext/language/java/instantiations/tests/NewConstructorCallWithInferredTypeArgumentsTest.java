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
package org.emftext.language.java.instantiations.tests;

import junit.textui.TestRunner;

import org.emftext.language.java.instantiations.InstantiationsFactory;
import org.emftext.language.java.instantiations.NewConstructorCallWithInferredTypeArguments;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>New Constructor Call With Inferred Type Arguments</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NewConstructorCallWithInferredTypeArgumentsTest extends NewConstructorCallTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NewConstructorCallWithInferredTypeArgumentsTest.class);
	}

	/**
	 * Constructs a new New Constructor Call With Inferred Type Arguments test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewConstructorCallWithInferredTypeArgumentsTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this New Constructor Call With Inferred Type Arguments test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NewConstructorCallWithInferredTypeArguments getFixture() {
		return (NewConstructorCallWithInferredTypeArguments)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(InstantiationsFactory.eINSTANCE.createNewConstructorCallWithInferredTypeArguments());
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

} //NewConstructorCallWithInferredTypeArgumentsTest
