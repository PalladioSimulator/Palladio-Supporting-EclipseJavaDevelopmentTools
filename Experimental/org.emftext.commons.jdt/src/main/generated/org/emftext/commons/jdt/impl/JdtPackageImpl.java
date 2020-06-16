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
package org.emftext.commons.jdt.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.emftext.commons.jdt.JDTField;
import org.emftext.commons.jdt.JDTJavaClassifier;
import org.emftext.commons.jdt.JdtFactory;
import org.emftext.commons.jdt.JdtPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JdtPackageImpl extends EPackageImpl implements JdtPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jdtJavaClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jdtFieldEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.emftext.commons.jdt.JdtPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JdtPackageImpl()
	{
		super(eNS_URI, JdtFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link JdtPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static JdtPackage init()
	{
		if (isInited) return (JdtPackage)EPackage.Registry.INSTANCE.getEPackage(JdtPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredJdtPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		JdtPackageImpl theJdtPackage = registeredJdtPackage instanceof JdtPackageImpl ? (JdtPackageImpl)registeredJdtPackage : new JdtPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theJdtPackage.createPackageContents();

		// Initialize created meta-data
		theJdtPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJdtPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(JdtPackage.eNS_URI, theJdtPackage);
		return theJdtPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJDTJavaClassifier()
	{
		return jdtJavaClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJDTJavaClassifier_SimpleName()
	{
		return (EAttribute)jdtJavaClassifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJDTJavaClassifier_PackageName()
	{
		return (EAttribute)jdtJavaClassifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJDTJavaClassifier_EnclosingTypeNames()
	{
		return (EAttribute)jdtJavaClassifierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJDTJavaClassifier_Path()
	{
		return (EAttribute)jdtJavaClassifierEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJDTJavaClassifier_CachedFields()
	{
		return (EReference)jdtJavaClassifierEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJDTJavaClassifier_HasCachedFields()
	{
		return (EAttribute)jdtJavaClassifierEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJDTJavaClassifier_ProjectName()
	{
		return (EAttribute)jdtJavaClassifierEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJDTJavaClassifier_Abstract()
	{
		return (EAttribute)jdtJavaClassifierEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJDTJavaClassifier_Interface()
	{
		return (EAttribute)jdtJavaClassifierEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJDTJavaClassifier_Enum()
	{
		return (EAttribute)jdtJavaClassifierEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJDTField()
	{
		return jdtFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJDTField_Name()
	{
		return (EAttribute)jdtFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JdtFactory getJdtFactory()
	{
		return (JdtFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents()
	{
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		jdtJavaClassifierEClass = createEClass(JDT_JAVA_CLASSIFIER);
		createEAttribute(jdtJavaClassifierEClass, JDT_JAVA_CLASSIFIER__SIMPLE_NAME);
		createEAttribute(jdtJavaClassifierEClass, JDT_JAVA_CLASSIFIER__PACKAGE_NAME);
		createEAttribute(jdtJavaClassifierEClass, JDT_JAVA_CLASSIFIER__ENCLOSING_TYPE_NAMES);
		createEAttribute(jdtJavaClassifierEClass, JDT_JAVA_CLASSIFIER__PATH);
		createEReference(jdtJavaClassifierEClass, JDT_JAVA_CLASSIFIER__CACHED_FIELDS);
		createEAttribute(jdtJavaClassifierEClass, JDT_JAVA_CLASSIFIER__HAS_CACHED_FIELDS);
		createEAttribute(jdtJavaClassifierEClass, JDT_JAVA_CLASSIFIER__PROJECT_NAME);
		createEAttribute(jdtJavaClassifierEClass, JDT_JAVA_CLASSIFIER__ABSTRACT);
		createEAttribute(jdtJavaClassifierEClass, JDT_JAVA_CLASSIFIER__INTERFACE);
		createEAttribute(jdtJavaClassifierEClass, JDT_JAVA_CLASSIFIER__ENUM);

		jdtFieldEClass = createEClass(JDT_FIELD);
		createEAttribute(jdtFieldEClass, JDT_FIELD__NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents()
	{
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(jdtJavaClassifierEClass, JDTJavaClassifier.class, "JDTJavaClassifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJDTJavaClassifier_SimpleName(), ecorePackage.getEString(), "simpleName", null, 1, 1, JDTJavaClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJDTJavaClassifier_PackageName(), ecorePackage.getEString(), "packageName", null, 1, 1, JDTJavaClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJDTJavaClassifier_EnclosingTypeNames(), ecorePackage.getEString(), "enclosingTypeNames", null, 0, -1, JDTJavaClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJDTJavaClassifier_Path(), ecorePackage.getEString(), "path", null, 1, 1, JDTJavaClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJDTJavaClassifier_CachedFields(), this.getJDTField(), null, "cachedFields", null, 0, -1, JDTJavaClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJDTJavaClassifier_HasCachedFields(), ecorePackage.getEBoolean(), "hasCachedFields", null, 1, 1, JDTJavaClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJDTJavaClassifier_ProjectName(), ecorePackage.getEString(), "projectName", null, 1, 1, JDTJavaClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJDTJavaClassifier_Abstract(), ecorePackage.getEBoolean(), "abstract", null, 0, 1, JDTJavaClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJDTJavaClassifier_Interface(), ecorePackage.getEBoolean(), "interface", null, 0, 1, JDTJavaClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJDTJavaClassifier_Enum(), ecorePackage.getEBoolean(), "enum", null, 0, 1, JDTJavaClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(jdtJavaClassifierEClass, ecorePackage.getEString(), "getQualifiedName", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(jdtJavaClassifierEClass, this.getJDTField(), "getFields", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(jdtFieldEClass, JDTField.class, "JDTField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJDTField_Name(), ecorePackage.getEString(), "name", null, 1, 1, JDTField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //JdtPackageImpl
