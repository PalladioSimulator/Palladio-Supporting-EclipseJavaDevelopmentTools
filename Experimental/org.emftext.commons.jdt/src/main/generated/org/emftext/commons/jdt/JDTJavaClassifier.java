/**
 * Copyright (c) 2006-2012
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
 *  
 */
package org.emftext.commons.jdt;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JDT Java Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.commons.jdt.JDTJavaClassifier#getSimpleName <em>Simple Name</em>}</li>
 *   <li>{@link org.emftext.commons.jdt.JDTJavaClassifier#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link org.emftext.commons.jdt.JDTJavaClassifier#getEnclosingTypeNames <em>Enclosing Type Names</em>}</li>
 *   <li>{@link org.emftext.commons.jdt.JDTJavaClassifier#getPath <em>Path</em>}</li>
 *   <li>{@link org.emftext.commons.jdt.JDTJavaClassifier#getCachedFields <em>Cached Fields</em>}</li>
 *   <li>{@link org.emftext.commons.jdt.JDTJavaClassifier#isHasCachedFields <em>Has Cached Fields</em>}</li>
 *   <li>{@link org.emftext.commons.jdt.JDTJavaClassifier#getProjectName <em>Project Name</em>}</li>
 *   <li>{@link org.emftext.commons.jdt.JDTJavaClassifier#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.emftext.commons.jdt.JDTJavaClassifier#isInterface <em>Interface</em>}</li>
 *   <li>{@link org.emftext.commons.jdt.JDTJavaClassifier#isEnum <em>Enum</em>}</li>
 * </ul>
 *
 * @see org.emftext.commons.jdt.JdtPackage#getJDTJavaClassifier()
 * @model
 * @generated
 */
public interface JDTJavaClassifier extends EObject
{
	/**
	 * Returns the value of the '<em><b>Simple Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Name</em>' attribute.
	 * @see #setSimpleName(String)
	 * @see org.emftext.commons.jdt.JdtPackage#getJDTJavaClassifier_SimpleName()
	 * @model required="true"
	 * @generated
	 */
	String getSimpleName();

	/**
	 * Sets the value of the '{@link org.emftext.commons.jdt.JDTJavaClassifier#getSimpleName <em>Simple Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple Name</em>' attribute.
	 * @see #getSimpleName()
	 * @generated
	 */
	void setSimpleName(String value);

	/**
	 * Returns the value of the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Name</em>' attribute.
	 * @see #setPackageName(String)
	 * @see org.emftext.commons.jdt.JdtPackage#getJDTJavaClassifier_PackageName()
	 * @model required="true"
	 * @generated
	 */
	String getPackageName();

	/**
	 * Sets the value of the '{@link org.emftext.commons.jdt.JDTJavaClassifier#getPackageName <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Name</em>' attribute.
	 * @see #getPackageName()
	 * @generated
	 */
	void setPackageName(String value);

	/**
	 * Returns the value of the '<em><b>Enclosing Type Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enclosing Type Names</em>' attribute list.
	 * @see org.emftext.commons.jdt.JdtPackage#getJDTJavaClassifier_EnclosingTypeNames()
	 * @model
	 * @generated
	 */
	EList<String> getEnclosingTypeNames();

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see org.emftext.commons.jdt.JdtPackage#getJDTJavaClassifier_Path()
	 * @model required="true"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link org.emftext.commons.jdt.JDTJavaClassifier#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Cached Fields</b></em>' reference list.
	 * The list contents are of type {@link org.emftext.commons.jdt.JDTField}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cached Fields</em>' reference list.
	 * @see org.emftext.commons.jdt.JdtPackage#getJDTJavaClassifier_CachedFields()
	 * @model
	 * @generated
	 */
	EList<JDTField> getCachedFields();

	/**
	 * Returns the value of the '<em><b>Has Cached Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Cached Fields</em>' attribute.
	 * @see #setHasCachedFields(boolean)
	 * @see org.emftext.commons.jdt.JdtPackage#getJDTJavaClassifier_HasCachedFields()
	 * @model required="true"
	 * @generated
	 */
	boolean isHasCachedFields();

	/**
	 * Sets the value of the '{@link org.emftext.commons.jdt.JDTJavaClassifier#isHasCachedFields <em>Has Cached Fields</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Cached Fields</em>' attribute.
	 * @see #isHasCachedFields()
	 * @generated
	 */
	void setHasCachedFields(boolean value);

	/**
	 * Returns the value of the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Name</em>' attribute.
	 * @see #setProjectName(String)
	 * @see org.emftext.commons.jdt.JdtPackage#getJDTJavaClassifier_ProjectName()
	 * @model required="true"
	 * @generated
	 */
	String getProjectName();

	/**
	 * Sets the value of the '{@link org.emftext.commons.jdt.JDTJavaClassifier#getProjectName <em>Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Name</em>' attribute.
	 * @see #getProjectName()
	 * @generated
	 */
	void setProjectName(String value);

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(boolean)
	 * @see org.emftext.commons.jdt.JdtPackage#getJDTJavaClassifier_Abstract()
	 * @model
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link org.emftext.commons.jdt.JDTJavaClassifier#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #isAbstract()
	 * @generated
	 */
	void setAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' attribute.
	 * @see #setInterface(boolean)
	 * @see org.emftext.commons.jdt.JdtPackage#getJDTJavaClassifier_Interface()
	 * @model
	 * @generated
	 */
	boolean isInterface();

	/**
	 * Sets the value of the '{@link org.emftext.commons.jdt.JDTJavaClassifier#isInterface <em>Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' attribute.
	 * @see #isInterface()
	 * @generated
	 */
	void setInterface(boolean value);

	/**
	 * Returns the value of the '<em><b>Enum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum</em>' attribute.
	 * @see #setEnum(boolean)
	 * @see org.emftext.commons.jdt.JdtPackage#getJDTJavaClassifier_Enum()
	 * @model
	 * @generated
	 */
	boolean isEnum();

	/**
	 * Sets the value of the '{@link org.emftext.commons.jdt.JDTJavaClassifier#isEnum <em>Enum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum</em>' attribute.
	 * @see #isEnum()
	 * @generated
	 */
	void setEnum(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	String getQualifiedName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<JDTField> getFields();

} // JDTJavaClassifier
