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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.emftext.commons.jdt.JDTField;
import org.emftext.commons.jdt.JDTJavaClassifier;
import org.emftext.commons.jdt.JdtPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JDT Java Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.commons.jdt.impl.JDTJavaClassifierImpl#getSimpleName <em>Simple Name</em>}</li>
 *   <li>{@link org.emftext.commons.jdt.impl.JDTJavaClassifierImpl#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link org.emftext.commons.jdt.impl.JDTJavaClassifierImpl#getEnclosingTypeNames <em>Enclosing Type Names</em>}</li>
 *   <li>{@link org.emftext.commons.jdt.impl.JDTJavaClassifierImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.emftext.commons.jdt.impl.JDTJavaClassifierImpl#getCachedFields <em>Cached Fields</em>}</li>
 *   <li>{@link org.emftext.commons.jdt.impl.JDTJavaClassifierImpl#isHasCachedFields <em>Has Cached Fields</em>}</li>
 *   <li>{@link org.emftext.commons.jdt.impl.JDTJavaClassifierImpl#getProjectName <em>Project Name</em>}</li>
 *   <li>{@link org.emftext.commons.jdt.impl.JDTJavaClassifierImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.emftext.commons.jdt.impl.JDTJavaClassifierImpl#isInterface <em>Interface</em>}</li>
 *   <li>{@link org.emftext.commons.jdt.impl.JDTJavaClassifierImpl#isEnum <em>Enum</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JDTJavaClassifierImpl extends EObjectImpl implements JDTJavaClassifier
{
	/**
	 * The default value of the '{@link #getSimpleName() <em>Simple Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleName()
	 * @generated
	 * @ordered
	 */
	protected static final String SIMPLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSimpleName() <em>Simple Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleName()
	 * @generated
	 * @ordered
	 */
	protected String simpleName = SIMPLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageName()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageName()
	 * @generated
	 * @ordered
	 */
	protected String packageName = PACKAGE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEnclosingTypeNames() <em>Enclosing Type Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnclosingTypeNames()
	 * @generated
	 * @ordered
	 */
	protected EList<String> enclosingTypeNames;

	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCachedFields() <em>Cached Fields</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCachedFields()
	 * @generated
	 * @ordered
	 */
	protected EList<JDTField> cachedFields;

	/**
	 * The default value of the '{@link #isHasCachedFields() <em>Has Cached Fields</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasCachedFields()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_CACHED_FIELDS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasCachedFields() <em>Has Cached Fields</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasCachedFields()
	 * @generated
	 * @ordered
	 */
	protected boolean hasCachedFields = HAS_CACHED_FIELDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getProjectName() <em>Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROJECT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProjectName() <em>Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectName()
	 * @generated
	 * @ordered
	 */
	protected String projectName = PROJECT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean abstract_ = ABSTRACT_EDEFAULT;

	/**
	 * The default value of the '{@link #isInterface() <em>Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInterface()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INTERFACE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInterface() <em>Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInterface()
	 * @generated
	 * @ordered
	 */
	protected boolean interface_ = INTERFACE_EDEFAULT;

	/**
	 * The default value of the '{@link #isEnum() <em>Enum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnum()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENUM_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnum() <em>Enum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnum()
	 * @generated
	 * @ordered
	 */
	protected boolean enum_ = ENUM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JDTJavaClassifierImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return JdtPackage.Literals.JDT_JAVA_CLASSIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSimpleName()
	{
		return simpleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSimpleName(String newSimpleName)
	{
		String oldSimpleName = simpleName;
		simpleName = newSimpleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JdtPackage.JDT_JAVA_CLASSIFIER__SIMPLE_NAME, oldSimpleName, simpleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPackageName()
	{
		return packageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPackageName(String newPackageName)
	{
		String oldPackageName = packageName;
		packageName = newPackageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JdtPackage.JDT_JAVA_CLASSIFIER__PACKAGE_NAME, oldPackageName, packageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getEnclosingTypeNames()
	{
		if (enclosingTypeNames == null)
		{
			enclosingTypeNames = new EDataTypeUniqueEList<String>(String.class, this, JdtPackage.JDT_JAVA_CLASSIFIER__ENCLOSING_TYPE_NAMES);
		}
		return enclosingTypeNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPath()
	{
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPath(String newPath)
	{
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JdtPackage.JDT_JAVA_CLASSIFIER__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<JDTField> getCachedFields()
	{
		if (cachedFields == null)
		{
			cachedFields = new EObjectResolvingEList<JDTField>(JDTField.class, this, JdtPackage.JDT_JAVA_CLASSIFIER__CACHED_FIELDS);
		}
		return cachedFields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHasCachedFields()
	{
		return hasCachedFields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasCachedFields(boolean newHasCachedFields)
	{
		boolean oldHasCachedFields = hasCachedFields;
		hasCachedFields = newHasCachedFields;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JdtPackage.JDT_JAVA_CLASSIFIER__HAS_CACHED_FIELDS, oldHasCachedFields, hasCachedFields));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProjectName()
	{
		return projectName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProjectName(String newProjectName)
	{
		String oldProjectName = projectName;
		projectName = newProjectName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JdtPackage.JDT_JAVA_CLASSIFIER__PROJECT_NAME, oldProjectName, projectName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAbstract()
	{
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbstract(boolean newAbstract)
	{
		boolean oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JdtPackage.JDT_JAVA_CLASSIFIER__ABSTRACT, oldAbstract, abstract_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isInterface()
	{
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInterface(boolean newInterface)
	{
		boolean oldInterface = interface_;
		interface_ = newInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JdtPackage.JDT_JAVA_CLASSIFIER__INTERFACE, oldInterface, interface_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEnum()
	{
		return enum_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnum(boolean newEnum)
	{
		boolean oldEnum = enum_;
		enum_ = newEnum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JdtPackage.JDT_JAVA_CLASSIFIER__ENUM, oldEnum, enum_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQualifiedName()
	{
		java.lang.StringBuilder qualifiedName = new java.lang.StringBuilder();
		qualifiedName.append(getPackageName());
		qualifiedName.append(".");
		for ( java.lang.String enclosingType : getEnclosingTypeNames()) {
			qualifiedName.append(enclosingType);
			qualifiedName.append("$");
		}
		qualifiedName.append(getSimpleName());
		return qualifiedName.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<JDTField> getFields()
	{
		if (!isHasCachedFields()) {
			try {
				org.eclipse.core.resources.IWorkspace workspace = org.eclipse.core.resources.ResourcesPlugin.getWorkspace();
				org.eclipse.core.resources.IWorkspaceRoot root = workspace.getRoot();
				java.lang.String projectName = getProjectName();
				if (projectName != null) {
					org.eclipse.core.resources.IProject project = root.getProject(projectName);
					if (project != null) {
						org.eclipse.jdt.core.IJavaProject javaProject = org.eclipse.jdt.core.JavaCore.create(project);
						if (javaProject != null && javaProject.exists()) {
							org.eclipse.jdt.core.IType type = javaProject.findType(getQualifiedName());
							org.eclipse.jdt.core.IField[] fields = type.getFields();
							for ( org.eclipse.jdt.core.IField field : fields) {
								org.emftext.commons.jdt.JDTField newField = org.emftext.commons.jdt.JdtFactory.eINSTANCE.createJDTField();
								newField.setName(field.getElementName());
								getCachedFields().add(newField);
							}
						}
					}
				}
			} catch ( org.eclipse.jdt.core.JavaModelException e) {
				// TODO handle exception
			}
			setHasCachedFields(true);
		}
		return getCachedFields();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case JdtPackage.JDT_JAVA_CLASSIFIER__SIMPLE_NAME:
				return getSimpleName();
			case JdtPackage.JDT_JAVA_CLASSIFIER__PACKAGE_NAME:
				return getPackageName();
			case JdtPackage.JDT_JAVA_CLASSIFIER__ENCLOSING_TYPE_NAMES:
				return getEnclosingTypeNames();
			case JdtPackage.JDT_JAVA_CLASSIFIER__PATH:
				return getPath();
			case JdtPackage.JDT_JAVA_CLASSIFIER__CACHED_FIELDS:
				return getCachedFields();
			case JdtPackage.JDT_JAVA_CLASSIFIER__HAS_CACHED_FIELDS:
				return isHasCachedFields();
			case JdtPackage.JDT_JAVA_CLASSIFIER__PROJECT_NAME:
				return getProjectName();
			case JdtPackage.JDT_JAVA_CLASSIFIER__ABSTRACT:
				return isAbstract();
			case JdtPackage.JDT_JAVA_CLASSIFIER__INTERFACE:
				return isInterface();
			case JdtPackage.JDT_JAVA_CLASSIFIER__ENUM:
				return isEnum();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case JdtPackage.JDT_JAVA_CLASSIFIER__SIMPLE_NAME:
				setSimpleName((String)newValue);
				return;
			case JdtPackage.JDT_JAVA_CLASSIFIER__PACKAGE_NAME:
				setPackageName((String)newValue);
				return;
			case JdtPackage.JDT_JAVA_CLASSIFIER__ENCLOSING_TYPE_NAMES:
				getEnclosingTypeNames().clear();
				getEnclosingTypeNames().addAll((Collection<? extends String>)newValue);
				return;
			case JdtPackage.JDT_JAVA_CLASSIFIER__PATH:
				setPath((String)newValue);
				return;
			case JdtPackage.JDT_JAVA_CLASSIFIER__CACHED_FIELDS:
				getCachedFields().clear();
				getCachedFields().addAll((Collection<? extends JDTField>)newValue);
				return;
			case JdtPackage.JDT_JAVA_CLASSIFIER__HAS_CACHED_FIELDS:
				setHasCachedFields((Boolean)newValue);
				return;
			case JdtPackage.JDT_JAVA_CLASSIFIER__PROJECT_NAME:
				setProjectName((String)newValue);
				return;
			case JdtPackage.JDT_JAVA_CLASSIFIER__ABSTRACT:
				setAbstract((Boolean)newValue);
				return;
			case JdtPackage.JDT_JAVA_CLASSIFIER__INTERFACE:
				setInterface((Boolean)newValue);
				return;
			case JdtPackage.JDT_JAVA_CLASSIFIER__ENUM:
				setEnum((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case JdtPackage.JDT_JAVA_CLASSIFIER__SIMPLE_NAME:
				setSimpleName(SIMPLE_NAME_EDEFAULT);
				return;
			case JdtPackage.JDT_JAVA_CLASSIFIER__PACKAGE_NAME:
				setPackageName(PACKAGE_NAME_EDEFAULT);
				return;
			case JdtPackage.JDT_JAVA_CLASSIFIER__ENCLOSING_TYPE_NAMES:
				getEnclosingTypeNames().clear();
				return;
			case JdtPackage.JDT_JAVA_CLASSIFIER__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case JdtPackage.JDT_JAVA_CLASSIFIER__CACHED_FIELDS:
				getCachedFields().clear();
				return;
			case JdtPackage.JDT_JAVA_CLASSIFIER__HAS_CACHED_FIELDS:
				setHasCachedFields(HAS_CACHED_FIELDS_EDEFAULT);
				return;
			case JdtPackage.JDT_JAVA_CLASSIFIER__PROJECT_NAME:
				setProjectName(PROJECT_NAME_EDEFAULT);
				return;
			case JdtPackage.JDT_JAVA_CLASSIFIER__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case JdtPackage.JDT_JAVA_CLASSIFIER__INTERFACE:
				setInterface(INTERFACE_EDEFAULT);
				return;
			case JdtPackage.JDT_JAVA_CLASSIFIER__ENUM:
				setEnum(ENUM_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case JdtPackage.JDT_JAVA_CLASSIFIER__SIMPLE_NAME:
				return SIMPLE_NAME_EDEFAULT == null ? simpleName != null : !SIMPLE_NAME_EDEFAULT.equals(simpleName);
			case JdtPackage.JDT_JAVA_CLASSIFIER__PACKAGE_NAME:
				return PACKAGE_NAME_EDEFAULT == null ? packageName != null : !PACKAGE_NAME_EDEFAULT.equals(packageName);
			case JdtPackage.JDT_JAVA_CLASSIFIER__ENCLOSING_TYPE_NAMES:
				return enclosingTypeNames != null && !enclosingTypeNames.isEmpty();
			case JdtPackage.JDT_JAVA_CLASSIFIER__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case JdtPackage.JDT_JAVA_CLASSIFIER__CACHED_FIELDS:
				return cachedFields != null && !cachedFields.isEmpty();
			case JdtPackage.JDT_JAVA_CLASSIFIER__HAS_CACHED_FIELDS:
				return hasCachedFields != HAS_CACHED_FIELDS_EDEFAULT;
			case JdtPackage.JDT_JAVA_CLASSIFIER__PROJECT_NAME:
				return PROJECT_NAME_EDEFAULT == null ? projectName != null : !PROJECT_NAME_EDEFAULT.equals(projectName);
			case JdtPackage.JDT_JAVA_CLASSIFIER__ABSTRACT:
				return abstract_ != ABSTRACT_EDEFAULT;
			case JdtPackage.JDT_JAVA_CLASSIFIER__INTERFACE:
				return interface_ != INTERFACE_EDEFAULT;
			case JdtPackage.JDT_JAVA_CLASSIFIER__ENUM:
				return enum_ != ENUM_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (simpleName: ");
		result.append(simpleName);
		result.append(", packageName: ");
		result.append(packageName);
		result.append(", enclosingTypeNames: ");
		result.append(enclosingTypeNames);
		result.append(", path: ");
		result.append(path);
		result.append(", hasCachedFields: ");
		result.append(hasCachedFields);
		result.append(", projectName: ");
		result.append(projectName);
		result.append(", abstract: ");
		result.append(abstract_);
		result.append(", interface: ");
		result.append(interface_);
		result.append(", enum: ");
		result.append(enum_);
		result.append(')');
		return result.toString();
	}

} //JDTJavaClassifierImpl
