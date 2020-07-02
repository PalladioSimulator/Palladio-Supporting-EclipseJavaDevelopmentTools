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
package org.emftext.language.java.generics.tests;

import junit.textui.TestRunner;

import org.emftext.language.java.classifiers.tests.ClassifierTest;

import org.emftext.language.java.generics.GenericsFactory;
import org.emftext.language.java.generics.TypeParameter;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Type Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.emftext.language.java.generics.TypeParameter#getAllSuperClassifiers() <em>Get All Super Classifiers</em>}</li>
 *   <li>{@link org.emftext.language.java.generics.TypeParameter#getAllMembers(org.emftext.language.java.commons.Commentable) <em>Get All Members</em>}</li>
 *   <li>{@link org.emftext.language.java.generics.TypeParameter#getBoundType(org.emftext.language.java.types.TypeReference, org.emftext.language.java.references.Reference) <em>Get Bound Type</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class TypeParameterTest extends ClassifierTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TypeParameterTest.class);
	}

	/**
	 * Constructs a new Type Parameter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeParameterTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Type Parameter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TypeParameter getFixture() {
		return (TypeParameter)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GenericsFactory.eINSTANCE.createTypeParameter());
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
	 * Tests the '{@link org.emftext.language.java.generics.TypeParameter#getAllSuperClassifiers() <em>Get All Super Classifiers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.generics.TypeParameter#getAllSuperClassifiers()
	 * @generated
	 */
	public void testGetAllSuperClassifiers() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.emftext.language.java.generics.TypeParameter#getAllMembers(org.emftext.language.java.commons.Commentable) <em>Get All Members</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.generics.TypeParameter#getAllMembers(org.emftext.language.java.commons.Commentable)
	 * @generated
	 */
	public void testGetAllMembers__Commentable() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.emftext.language.java.generics.TypeParameter#getBoundType(org.emftext.language.java.types.TypeReference, org.emftext.language.java.references.Reference) <em>Get Bound Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.generics.TypeParameter#getBoundType(org.emftext.language.java.types.TypeReference, org.emftext.language.java.references.Reference)
	 * @generated
	 */
	public void testGetBoundType__TypeReference_Reference() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //TypeParameterTest
