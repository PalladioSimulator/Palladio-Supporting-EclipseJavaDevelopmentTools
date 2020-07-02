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
package org.emftext.language.java.classifiers.tests;

import org.emftext.language.java.classifiers.ConcreteClassifier;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Concrete Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.emftext.language.java.classifiers.ConcreteClassifier#getInnerClassifiers() <em>Get Inner Classifiers</em>}</li>
 *   <li>{@link org.emftext.language.java.classifiers.ConcreteClassifier#getAllInnerClassifiers() <em>Get All Inner Classifiers</em>}</li>
 *   <li>{@link org.emftext.language.java.classifiers.ConcreteClassifier#getSuperTypeReferences() <em>Get Super Type References</em>}</li>
 *   <li>{@link org.emftext.language.java.classifiers.ConcreteClassifier#getAllMembers(org.emftext.language.java.commons.Commentable) <em>Get All Members</em>}</li>
 *   <li>{@link org.emftext.language.java.classifiers.ConcreteClassifier#getQualifiedName() <em>Get Qualified Name</em>}</li>
 *   <li>{@link org.emftext.language.java.classifiers.ConcreteClassifier#isJavaLangObject(org.emftext.language.java.classifiers.ConcreteClassifier) <em>Is Java Lang Object</em>}</li>
 *   <li>{@link org.emftext.language.java.modifiers.AnnotableAndModifiable#isHidden(org.emftext.language.java.commons.Commentable) <em>Is Hidden</em>}</li>
 *   <li>{@link org.emftext.language.java.modifiers.AnnotableAndModifiable#isStatic() <em>Is Static</em>}</li>
 *   <li>{@link org.emftext.language.java.modifiers.AnnotableAndModifiable#removeModifier(java.lang.Class) <em>Remove Modifier</em>}</li>
 *   <li>{@link org.emftext.language.java.modifiers.AnnotableAndModifiable#makePublic() <em>Make Public</em>}</li>
 *   <li>{@link org.emftext.language.java.modifiers.AnnotableAndModifiable#makePrivate() <em>Make Private</em>}</li>
 *   <li>{@link org.emftext.language.java.modifiers.AnnotableAndModifiable#makeProtected() <em>Make Protected</em>}</li>
 *   <li>{@link org.emftext.language.java.modifiers.AnnotableAndModifiable#getModifiers() <em>Get Modifiers</em>}</li>
 *   <li>{@link org.emftext.language.java.modifiers.AnnotableAndModifiable#removeAllModifiers() <em>Remove All Modifiers</em>}</li>
 *   <li>{@link org.emftext.language.java.modifiers.AnnotableAndModifiable#hasModifier(java.lang.Class) <em>Has Modifier</em>}</li>
 *   <li>{@link org.emftext.language.java.modifiers.AnnotableAndModifiable#isPublic() <em>Is Public</em>}</li>
 *   <li>{@link org.emftext.language.java.modifiers.AnnotableAndModifiable#isPrivate() <em>Is Private</em>}</li>
 *   <li>{@link org.emftext.language.java.modifiers.AnnotableAndModifiable#isProtected() <em>Is Protected</em>}</li>
 *   <li>{@link org.emftext.language.java.modifiers.AnnotableAndModifiable#addModifier(org.emftext.language.java.modifiers.Modifier) <em>Add Modifier</em>}</li>
 *   <li>{@link org.emftext.language.java.modifiers.AnnotableAndModifiable#getAnnotationInstances() <em>Get Annotation Instances</em>}</li>
 *   <li>{@link org.emftext.language.java.members.MemberContainer#getContainedClassifier(java.lang.String) <em>Get Contained Classifier</em>}</li>
 *   <li>{@link org.emftext.language.java.members.MemberContainer#getContainedField(java.lang.String) <em>Get Contained Field</em>}</li>
 *   <li>{@link org.emftext.language.java.members.MemberContainer#getContainedMethod(java.lang.String) <em>Get Contained Method</em>}</li>
 *   <li>{@link org.emftext.language.java.members.MemberContainer#getMethods() <em>Get Methods</em>}</li>
 *   <li>{@link org.emftext.language.java.members.MemberContainer#removeMethods(java.lang.String) <em>Remove Methods</em>}</li>
 *   <li>{@link org.emftext.language.java.members.MemberContainer#getMembersByName(java.lang.String) <em>Get Members By Name</em>}</li>
 *   <li>{@link org.emftext.language.java.members.MemberContainer#createField(java.lang.String, java.lang.String) <em>Create Field</em>}</li>
 *   <li>{@link org.emftext.language.java.members.MemberContainer#getFields() <em>Get Fields</em>}</li>
 *   <li>{@link org.emftext.language.java.members.MemberContainer#getConstructors() <em>Get Constructors</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class ConcreteClassifierTest extends ClassifierTest {

	/**
	 * Constructs a new Concrete Classifier test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteClassifierTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Concrete Classifier test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ConcreteClassifier getFixture() {
		return (ConcreteClassifier)fixture;
	}

	/**
	 * Tests the '{@link org.emftext.language.java.classifiers.ConcreteClassifier#getInnerClassifiers() <em>Get Inner Classifiers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.classifiers.ConcreteClassifier#getInnerClassifiers()
	 * @generated
	 */
	public void testGetInnerClassifiers() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.emftext.language.java.classifiers.ConcreteClassifier#getAllInnerClassifiers() <em>Get All Inner Classifiers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.classifiers.ConcreteClassifier#getAllInnerClassifiers()
	 * @generated
	 */
	public void testGetAllInnerClassifiers() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.emftext.language.java.classifiers.ConcreteClassifier#getSuperTypeReferences() <em>Get Super Type References</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.classifiers.ConcreteClassifier#getSuperTypeReferences()
	 * @generated
	 */
	public void testGetSuperTypeReferences() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.emftext.language.java.classifiers.ConcreteClassifier#getAllMembers(org.emftext.language.java.commons.Commentable) <em>Get All Members</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.classifiers.ConcreteClassifier#getAllMembers(org.emftext.language.java.commons.Commentable)
	 * @generated
	 */
	public void testGetAllMembers__Commentable() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.emftext.language.java.classifiers.ConcreteClassifier#getQualifiedName() <em>Get Qualified Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.classifiers.ConcreteClassifier#getQualifiedName()
	 * @generated
	 */
	public void testGetQualifiedName() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.emftext.language.java.classifiers.ConcreteClassifier#isJavaLangObject(org.emftext.language.java.classifiers.ConcreteClassifier) <em>Is Java Lang Object</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.classifiers.ConcreteClassifier#isJavaLangObject(org.emftext.language.java.classifiers.ConcreteClassifier)
	 * @generated
	 */
	public void testIsJavaLangObject__ConcreteClassifier() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.emftext.language.java.modifiers.AnnotableAndModifiable#isHidden(org.emftext.language.java.commons.Commentable) <em>Is Hidden</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.modifiers.AnnotableAndModifiable#isHidden(org.emftext.language.java.commons.Commentable)
	 * @generated
	 */
	public void testIsHidden__Commentable() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.emftext.language.java.modifiers.AnnotableAndModifiable#isStatic() <em>Is Static</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.modifiers.AnnotableAndModifiable#isStatic()
	 * @generated
	 */
	public void testIsStatic() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.emftext.language.java.modifiers.AnnotableAndModifiable#removeModifier(java.lang.Class) <em>Remove Modifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.modifiers.AnnotableAndModifiable#removeModifier(java.lang.Class)
	 * @generated
	 */
	public void testRemoveModifier__Class() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.emftext.language.java.modifiers.AnnotableAndModifiable#makePublic() <em>Make Public</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.modifiers.AnnotableAndModifiable#makePublic()
	 * @generated
	 */
	public void testMakePublic() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.emftext.language.java.modifiers.AnnotableAndModifiable#makePrivate() <em>Make Private</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.modifiers.AnnotableAndModifiable#makePrivate()
	 * @generated
	 */
	public void testMakePrivate() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.emftext.language.java.modifiers.AnnotableAndModifiable#makeProtected() <em>Make Protected</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.modifiers.AnnotableAndModifiable#makeProtected()
	 * @generated
	 */
	public void testMakeProtected() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.emftext.language.java.modifiers.AnnotableAndModifiable#getModifiers() <em>Get Modifiers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.modifiers.AnnotableAndModifiable#getModifiers()
	 * @generated
	 */
	public void testGetModifiers() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.emftext.language.java.modifiers.AnnotableAndModifiable#removeAllModifiers() <em>Remove All Modifiers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.modifiers.AnnotableAndModifiable#removeAllModifiers()
	 * @generated
	 */
	public void testRemoveAllModifiers() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.emftext.language.java.modifiers.AnnotableAndModifiable#hasModifier(java.lang.Class) <em>Has Modifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.modifiers.AnnotableAndModifiable#hasModifier(java.lang.Class)
	 * @generated
	 */
	public void testHasModifier__Class() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.emftext.language.java.modifiers.AnnotableAndModifiable#isPublic() <em>Is Public</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.modifiers.AnnotableAndModifiable#isPublic()
	 * @generated
	 */
	public void testIsPublic() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.emftext.language.java.modifiers.AnnotableAndModifiable#isPrivate() <em>Is Private</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.modifiers.AnnotableAndModifiable#isPrivate()
	 * @generated
	 */
	public void testIsPrivate() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.emftext.language.java.modifiers.AnnotableAndModifiable#isProtected() <em>Is Protected</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.modifiers.AnnotableAndModifiable#isProtected()
	 * @generated
	 */
	public void testIsProtected() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.emftext.language.java.modifiers.AnnotableAndModifiable#addModifier(org.emftext.language.java.modifiers.Modifier) <em>Add Modifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.modifiers.AnnotableAndModifiable#addModifier(org.emftext.language.java.modifiers.Modifier)
	 * @generated
	 */
	public void testAddModifier__Modifier() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.emftext.language.java.modifiers.AnnotableAndModifiable#getAnnotationInstances() <em>Get Annotation Instances</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.modifiers.AnnotableAndModifiable#getAnnotationInstances()
	 * @generated
	 */
	public void testGetAnnotationInstances() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.emftext.language.java.members.MemberContainer#getContainedClassifier(java.lang.String) <em>Get Contained Classifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.members.MemberContainer#getContainedClassifier(java.lang.String)
	 * @generated
	 */
	public void testGetContainedClassifier__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.emftext.language.java.members.MemberContainer#getContainedField(java.lang.String) <em>Get Contained Field</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.members.MemberContainer#getContainedField(java.lang.String)
	 * @generated
	 */
	public void testGetContainedField__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.emftext.language.java.members.MemberContainer#getContainedMethod(java.lang.String) <em>Get Contained Method</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.members.MemberContainer#getContainedMethod(java.lang.String)
	 * @generated
	 */
	public void testGetContainedMethod__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.emftext.language.java.members.MemberContainer#getMethods() <em>Get Methods</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.members.MemberContainer#getMethods()
	 * @generated
	 */
	public void testGetMethods() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.emftext.language.java.members.MemberContainer#removeMethods(java.lang.String) <em>Remove Methods</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.members.MemberContainer#removeMethods(java.lang.String)
	 * @generated
	 */
	public void testRemoveMethods__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.emftext.language.java.members.MemberContainer#getMembersByName(java.lang.String) <em>Get Members By Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.members.MemberContainer#getMembersByName(java.lang.String)
	 * @generated
	 */
	public void testGetMembersByName__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.emftext.language.java.members.MemberContainer#createField(java.lang.String, java.lang.String) <em>Create Field</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.members.MemberContainer#createField(java.lang.String, java.lang.String)
	 * @generated
	 */
	public void testCreateField__String_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.emftext.language.java.members.MemberContainer#getFields() <em>Get Fields</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.members.MemberContainer#getFields()
	 * @generated
	 */
	public void testGetFields() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.emftext.language.java.members.MemberContainer#getConstructors() <em>Get Constructors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.java.members.MemberContainer#getConstructors()
	 * @generated
	 */
	public void testGetConstructors() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //ConcreteClassifierTest
