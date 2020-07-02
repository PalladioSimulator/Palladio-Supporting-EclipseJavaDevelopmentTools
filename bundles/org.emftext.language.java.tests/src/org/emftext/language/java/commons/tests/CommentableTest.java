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
package org.emftext.language.java.commons.tests;

import junit.framework.TestCase;

import org.emftext.language.java.commons.Commentable;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Commentable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.emftext.language.java.commons.Commentable#getConcreteClassifier(java.lang.String) <em>Get Concrete Classifier</em>}</li>
 *   <li>{@link org.emftext.language.java.commons.Commentable#getConcreteClassifierProxy(java.lang.String) <em>Get Concrete Classifier Proxy</em>}</li>
 *   <li>{@link org.emftext.language.java.commons.Commentable#getConcreteClassifiers(java.lang.String, java.lang.String) <em>Get Concrete Classifiers</em>}</li>
 *   <li>{@link org.emftext.language.java.commons.Commentable#getConcreteClassifierProxies(java.lang.String, java.lang.String) <em>Get Concrete Classifier Proxies</em>}</li>
 *   <li>{@link org.emftext.language.java.commons.Commentable#getLibClass(java.lang.String) <em>Get Lib Class</em>}</li>
 *   <li>{@link org.emftext.language.java.commons.Commentable#getLibInterface(java.lang.String) <em>Get Lib Interface</em>}</li>
 *   <li>{@link org.emftext.language.java.commons.Commentable#getClassClass() <em>Get Class Class</em>}</li>
 *   <li>{@link org.emftext.language.java.commons.Commentable#getObjectClass() <em>Get Object Class</em>}</li>
 *   <li>{@link org.emftext.language.java.commons.Commentable#getStringClass() <em>Get String Class</em>}</li>
 *   <li>{@link org.emftext.language.java.commons.Commentable#getAnnotationInterface() <em>Get Annotation Interface</em>}</li>
 *   <li>{@link org.emftext.language.java.commons.Commentable#getContainingAnnotationInstance() <em>Get Containing Annotation Instance</em>}</li>
 *   <li>{@link org.emftext.language.java.commons.Commentable#getContainingAnonymousClass() <em>Get Containing Anonymous Class</em>}</li>
 *   <li>{@link org.emftext.language.java.commons.Commentable#getContainingConcreteClassifier() <em>Get Containing Concrete Classifier</em>}</li>
 *   <li>{@link org.emftext.language.java.commons.Commentable#getContainingCompilationUnit() <em>Get Containing Compilation Unit</em>}</li>
 *   <li>{@link org.emftext.language.java.commons.Commentable#getContainingPackageName() <em>Get Containing Package Name</em>}</li>
 *   <li>{@link org.emftext.language.java.commons.Commentable#getContainingContainerName() <em>Get Containing Container Name</em>}</li>
 *   <li>{@link org.emftext.language.java.commons.Commentable#getParentConcreteClassifier() <em>Get Parent Concrete Classifier</em>}</li>
 *   <li>{@link org.emftext.language.java.commons.Commentable#getParentByEType(org.eclipse.emf.ecore.EClass) <em>Get Parent By EType</em>}</li>
 *   <li>{@link org.emftext.language.java.commons.Commentable#getFirstChildByEType(org.eclipse.emf.ecore.EClass) <em>Get First Child By EType</em>}</li>
 *   <li>{@link org.emftext.language.java.commons.Commentable#getParentByType(java.lang.Class) <em>Get Parent By Type</em>}</li>
 *   <li>{@link org.emftext.language.java.commons.Commentable#getFirstChildByType(java.lang.Class) <em>Get First Child By Type</em>}</li>
 *   <li>{@link org.emftext.language.java.commons.Commentable#getChildrenByEType(org.eclipse.emf.ecore.EClass) <em>Get Children By EType</em>}</li>
 *   <li>{@link org.emftext.language.java.commons.Commentable#getChildrenByType(java.lang.Class) <em>Get Children By Type</em>}</li>
 *   <li>{@link org.emftext.language.java.commons.Commentable#getComments() <em>Get Comments</em>}</li>
 *   <li>{@link org.emftext.language.java.commons.Commentable#addBeforeContainingStatement(org.emftext.language.java.statements.Statement) <em>Add Before Containing Statement</em>}</li>
 *   <li>{@link org.emftext.language.java.commons.Commentable#addAfterContainingStatement(org.emftext.language.java.statements.Statement) <em>Add After Containing Statement</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class CommentableTest extends TestCase {

	/**
	 * The fixture for this Commentable test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Commentable fixture = null;

	/**
	 * Constructs a new Commentable test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommentableTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Commentable test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Commentable fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Commentable test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Commentable getFixture() {
		return fixture;
	}

	/**
	 * Tests the '{@link org.emftext.language.java.commons.Commentable#getConcreteClassifier(java.lang.String) <em>Get Concrete Classifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.commons.Commentable#getConcreteClassifier(java.lang.String)
	 * @generated
	 */
	public void testGetConcreteClassifier__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.emftext.language.java.commons.Commentable#getConcreteClassifierProxy(java.lang.String) <em>Get Concrete Classifier Proxy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.commons.Commentable#getConcreteClassifierProxy(java.lang.String)
	 * @generated
	 */
	public void testGetConcreteClassifierProxy__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.emftext.language.java.commons.Commentable#getConcreteClassifiers(java.lang.String, java.lang.String) <em>Get Concrete Classifiers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.commons.Commentable#getConcreteClassifiers(java.lang.String, java.lang.String)
	 * @generated
	 */
	public void testGetConcreteClassifiers__String_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.emftext.language.java.commons.Commentable#getConcreteClassifierProxies(java.lang.String, java.lang.String) <em>Get Concrete Classifier Proxies</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.commons.Commentable#getConcreteClassifierProxies(java.lang.String, java.lang.String)
	 * @generated
	 */
	public void testGetConcreteClassifierProxies__String_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.emftext.language.java.commons.Commentable#getLibClass(java.lang.String) <em>Get Lib Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.commons.Commentable#getLibClass(java.lang.String)
	 * @generated
	 */
	public void testGetLibClass__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.emftext.language.java.commons.Commentable#getLibInterface(java.lang.String) <em>Get Lib Interface</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.commons.Commentable#getLibInterface(java.lang.String)
	 * @generated
	 */
	public void testGetLibInterface__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.emftext.language.java.commons.Commentable#getClassClass() <em>Get Class Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.commons.Commentable#getClassClass()
	 * @generated
	 */
	public void testGetClassClass() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.emftext.language.java.commons.Commentable#getObjectClass() <em>Get Object Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.commons.Commentable#getObjectClass()
	 * @generated
	 */
	public void testGetObjectClass() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.emftext.language.java.commons.Commentable#getStringClass() <em>Get String Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.commons.Commentable#getStringClass()
	 * @generated
	 */
	public void testGetStringClass() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.emftext.language.java.commons.Commentable#getAnnotationInterface() <em>Get Annotation Interface</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.commons.Commentable#getAnnotationInterface()
	 * @generated
	 */
	public void testGetAnnotationInterface() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.emftext.language.java.commons.Commentable#getContainingAnnotationInstance() <em>Get Containing Annotation Instance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.commons.Commentable#getContainingAnnotationInstance()
	 * @generated
	 */
	public void testGetContainingAnnotationInstance() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.emftext.language.java.commons.Commentable#getContainingAnonymousClass() <em>Get Containing Anonymous Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.commons.Commentable#getContainingAnonymousClass()
	 * @generated
	 */
	public void testGetContainingAnonymousClass() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.emftext.language.java.commons.Commentable#getContainingConcreteClassifier() <em>Get Containing Concrete Classifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.commons.Commentable#getContainingConcreteClassifier()
	 * @generated
	 */
	public void testGetContainingConcreteClassifier() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.emftext.language.java.commons.Commentable#getContainingCompilationUnit() <em>Get Containing Compilation Unit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.commons.Commentable#getContainingCompilationUnit()
	 * @generated
	 */
	public void testGetContainingCompilationUnit() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.emftext.language.java.commons.Commentable#getContainingPackageName() <em>Get Containing Package Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.commons.Commentable#getContainingPackageName()
	 * @generated
	 */
	public void testGetContainingPackageName() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.emftext.language.java.commons.Commentable#getContainingContainerName() <em>Get Containing Container Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.commons.Commentable#getContainingContainerName()
	 * @generated
	 */
	public void testGetContainingContainerName() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.emftext.language.java.commons.Commentable#getParentConcreteClassifier() <em>Get Parent Concrete Classifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.commons.Commentable#getParentConcreteClassifier()
	 * @generated
	 */
	public void testGetParentConcreteClassifier() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.emftext.language.java.commons.Commentable#getParentByEType(org.eclipse.emf.ecore.EClass) <em>Get Parent By EType</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.commons.Commentable#getParentByEType(org.eclipse.emf.ecore.EClass)
	 * @generated
	 */
	public void testGetParentByEType__EClass() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.emftext.language.java.commons.Commentable#getFirstChildByEType(org.eclipse.emf.ecore.EClass) <em>Get First Child By EType</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.commons.Commentable#getFirstChildByEType(org.eclipse.emf.ecore.EClass)
	 * @generated
	 */
	public void testGetFirstChildByEType__EClass() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.emftext.language.java.commons.Commentable#getParentByType(java.lang.Class) <em>Get Parent By Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.commons.Commentable#getParentByType(java.lang.Class)
	 * @generated
	 */
	public void testGetParentByType__Class() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.emftext.language.java.commons.Commentable#getFirstChildByType(java.lang.Class) <em>Get First Child By Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.commons.Commentable#getFirstChildByType(java.lang.Class)
	 * @generated
	 */
	public void testGetFirstChildByType__Class() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.emftext.language.java.commons.Commentable#getChildrenByEType(org.eclipse.emf.ecore.EClass) <em>Get Children By EType</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.commons.Commentable#getChildrenByEType(org.eclipse.emf.ecore.EClass)
	 * @generated
	 */
	public void testGetChildrenByEType__EClass() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.emftext.language.java.commons.Commentable#getChildrenByType(java.lang.Class) <em>Get Children By Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.commons.Commentable#getChildrenByType(java.lang.Class)
	 * @generated
	 */
	public void testGetChildrenByType__Class() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.emftext.language.java.commons.Commentable#getComments() <em>Get Comments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.commons.Commentable#getComments()
	 * @generated
	 */
	public void testGetComments() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.emftext.language.java.commons.Commentable#addBeforeContainingStatement(org.emftext.language.java.statements.Statement) <em>Add Before Containing Statement</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.commons.Commentable#addBeforeContainingStatement(org.emftext.language.java.statements.Statement)
	 * @generated
	 */
	public void testAddBeforeContainingStatement__Statement() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.emftext.language.java.commons.Commentable#addAfterContainingStatement(org.emftext.language.java.statements.Statement) <em>Add After Containing Statement</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.commons.Commentable#addAfterContainingStatement(org.emftext.language.java.statements.Statement)
	 * @generated
	 */
	public void testAddAfterContainingStatement__Statement() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //CommentableTest
