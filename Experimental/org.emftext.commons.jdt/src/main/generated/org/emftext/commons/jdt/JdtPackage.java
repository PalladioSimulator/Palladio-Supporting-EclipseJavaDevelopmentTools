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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.emftext.commons.jdt.JdtFactory
 * @model kind="package"
 * @generated
 */
public interface JdtPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "jdt";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.emftext.org/commons/jdt";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "jdt";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JdtPackage eINSTANCE = org.emftext.commons.jdt.impl.JdtPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.emftext.commons.jdt.impl.JDTJavaClassifierImpl <em>JDT Java Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.commons.jdt.impl.JDTJavaClassifierImpl
	 * @see org.emftext.commons.jdt.impl.JdtPackageImpl#getJDTJavaClassifier()
	 * @generated
	 */
	int JDT_JAVA_CLASSIFIER = 0;

	/**
	 * The feature id for the '<em><b>Simple Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_JAVA_CLASSIFIER__SIMPLE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_JAVA_CLASSIFIER__PACKAGE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Enclosing Type Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_JAVA_CLASSIFIER__ENCLOSING_TYPE_NAMES = 2;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_JAVA_CLASSIFIER__PATH = 3;

	/**
	 * The feature id for the '<em><b>Cached Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_JAVA_CLASSIFIER__CACHED_FIELDS = 4;

	/**
	 * The feature id for the '<em><b>Has Cached Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_JAVA_CLASSIFIER__HAS_CACHED_FIELDS = 5;

	/**
	 * The feature id for the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_JAVA_CLASSIFIER__PROJECT_NAME = 6;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_JAVA_CLASSIFIER__ABSTRACT = 7;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_JAVA_CLASSIFIER__INTERFACE = 8;

	/**
	 * The feature id for the '<em><b>Enum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_JAVA_CLASSIFIER__ENUM = 9;

	/**
	 * The number of structural features of the '<em>JDT Java Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_JAVA_CLASSIFIER_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.emftext.commons.jdt.impl.JDTFieldImpl <em>JDT Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.commons.jdt.impl.JDTFieldImpl
	 * @see org.emftext.commons.jdt.impl.JdtPackageImpl#getJDTField()
	 * @generated
	 */
	int JDT_FIELD = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_FIELD__NAME = 0;

	/**
	 * The number of structural features of the '<em>JDT Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_FIELD_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link org.emftext.commons.jdt.JDTJavaClassifier <em>JDT Java Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JDT Java Classifier</em>'.
	 * @see org.emftext.commons.jdt.JDTJavaClassifier
	 * @generated
	 */
	EClass getJDTJavaClassifier();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.commons.jdt.JDTJavaClassifier#getSimpleName <em>Simple Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Simple Name</em>'.
	 * @see org.emftext.commons.jdt.JDTJavaClassifier#getSimpleName()
	 * @see #getJDTJavaClassifier()
	 * @generated
	 */
	EAttribute getJDTJavaClassifier_SimpleName();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.commons.jdt.JDTJavaClassifier#getPackageName <em>Package Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Name</em>'.
	 * @see org.emftext.commons.jdt.JDTJavaClassifier#getPackageName()
	 * @see #getJDTJavaClassifier()
	 * @generated
	 */
	EAttribute getJDTJavaClassifier_PackageName();

	/**
	 * Returns the meta object for the attribute list '{@link org.emftext.commons.jdt.JDTJavaClassifier#getEnclosingTypeNames <em>Enclosing Type Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Enclosing Type Names</em>'.
	 * @see org.emftext.commons.jdt.JDTJavaClassifier#getEnclosingTypeNames()
	 * @see #getJDTJavaClassifier()
	 * @generated
	 */
	EAttribute getJDTJavaClassifier_EnclosingTypeNames();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.commons.jdt.JDTJavaClassifier#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.emftext.commons.jdt.JDTJavaClassifier#getPath()
	 * @see #getJDTJavaClassifier()
	 * @generated
	 */
	EAttribute getJDTJavaClassifier_Path();

	/**
	 * Returns the meta object for the reference list '{@link org.emftext.commons.jdt.JDTJavaClassifier#getCachedFields <em>Cached Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cached Fields</em>'.
	 * @see org.emftext.commons.jdt.JDTJavaClassifier#getCachedFields()
	 * @see #getJDTJavaClassifier()
	 * @generated
	 */
	EReference getJDTJavaClassifier_CachedFields();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.commons.jdt.JDTJavaClassifier#isHasCachedFields <em>Has Cached Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Cached Fields</em>'.
	 * @see org.emftext.commons.jdt.JDTJavaClassifier#isHasCachedFields()
	 * @see #getJDTJavaClassifier()
	 * @generated
	 */
	EAttribute getJDTJavaClassifier_HasCachedFields();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.commons.jdt.JDTJavaClassifier#getProjectName <em>Project Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Name</em>'.
	 * @see org.emftext.commons.jdt.JDTJavaClassifier#getProjectName()
	 * @see #getJDTJavaClassifier()
	 * @generated
	 */
	EAttribute getJDTJavaClassifier_ProjectName();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.commons.jdt.JDTJavaClassifier#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see org.emftext.commons.jdt.JDTJavaClassifier#isAbstract()
	 * @see #getJDTJavaClassifier()
	 * @generated
	 */
	EAttribute getJDTJavaClassifier_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.commons.jdt.JDTJavaClassifier#isInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface</em>'.
	 * @see org.emftext.commons.jdt.JDTJavaClassifier#isInterface()
	 * @see #getJDTJavaClassifier()
	 * @generated
	 */
	EAttribute getJDTJavaClassifier_Interface();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.commons.jdt.JDTJavaClassifier#isEnum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enum</em>'.
	 * @see org.emftext.commons.jdt.JDTJavaClassifier#isEnum()
	 * @see #getJDTJavaClassifier()
	 * @generated
	 */
	EAttribute getJDTJavaClassifier_Enum();

	/**
	 * Returns the meta object for class '{@link org.emftext.commons.jdt.JDTField <em>JDT Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JDT Field</em>'.
	 * @see org.emftext.commons.jdt.JDTField
	 * @generated
	 */
	EClass getJDTField();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.commons.jdt.JDTField#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.emftext.commons.jdt.JDTField#getName()
	 * @see #getJDTField()
	 * @generated
	 */
	EAttribute getJDTField_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JdtFactory getJdtFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link org.emftext.commons.jdt.impl.JDTJavaClassifierImpl <em>JDT Java Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.commons.jdt.impl.JDTJavaClassifierImpl
		 * @see org.emftext.commons.jdt.impl.JdtPackageImpl#getJDTJavaClassifier()
		 * @generated
		 */
		EClass JDT_JAVA_CLASSIFIER = eINSTANCE.getJDTJavaClassifier();

		/**
		 * The meta object literal for the '<em><b>Simple Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JDT_JAVA_CLASSIFIER__SIMPLE_NAME = eINSTANCE.getJDTJavaClassifier_SimpleName();

		/**
		 * The meta object literal for the '<em><b>Package Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JDT_JAVA_CLASSIFIER__PACKAGE_NAME = eINSTANCE.getJDTJavaClassifier_PackageName();

		/**
		 * The meta object literal for the '<em><b>Enclosing Type Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JDT_JAVA_CLASSIFIER__ENCLOSING_TYPE_NAMES = eINSTANCE.getJDTJavaClassifier_EnclosingTypeNames();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JDT_JAVA_CLASSIFIER__PATH = eINSTANCE.getJDTJavaClassifier_Path();

		/**
		 * The meta object literal for the '<em><b>Cached Fields</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JDT_JAVA_CLASSIFIER__CACHED_FIELDS = eINSTANCE.getJDTJavaClassifier_CachedFields();

		/**
		 * The meta object literal for the '<em><b>Has Cached Fields</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JDT_JAVA_CLASSIFIER__HAS_CACHED_FIELDS = eINSTANCE.getJDTJavaClassifier_HasCachedFields();

		/**
		 * The meta object literal for the '<em><b>Project Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JDT_JAVA_CLASSIFIER__PROJECT_NAME = eINSTANCE.getJDTJavaClassifier_ProjectName();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JDT_JAVA_CLASSIFIER__ABSTRACT = eINSTANCE.getJDTJavaClassifier_Abstract();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JDT_JAVA_CLASSIFIER__INTERFACE = eINSTANCE.getJDTJavaClassifier_Interface();

		/**
		 * The meta object literal for the '<em><b>Enum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JDT_JAVA_CLASSIFIER__ENUM = eINSTANCE.getJDTJavaClassifier_Enum();

		/**
		 * The meta object literal for the '{@link org.emftext.commons.jdt.impl.JDTFieldImpl <em>JDT Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.commons.jdt.impl.JDTFieldImpl
		 * @see org.emftext.commons.jdt.impl.JdtPackageImpl#getJDTField()
		 * @generated
		 */
		EClass JDT_FIELD = eINSTANCE.getJDTField();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JDT_FIELD__NAME = eINSTANCE.getJDTField_Name();

	}

} //JdtPackage
