/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.commons.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.ConcreteClassifier;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.CommonsPackage;
import org.palladiosimulator.jdt.metamodel.javamodel.commons.NamespaceAwareElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Namespace Aware Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.commons.impl.NamespaceAwareElementImpl#getNamespaces <em>Namespaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class NamespaceAwareElementImpl extends CommentableImpl implements NamespaceAwareElement {
    /**
     * The cached value of the '{@link #getNamespaces() <em>Namespaces</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNamespaces()
     * @generated
     * @ordered
     */
    protected EList<String> namespaces;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected NamespaceAwareElementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CommonsPackage.Literals.NAMESPACE_AWARE_ELEMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<String> getNamespaces() {
        if (namespaces == null) {
            namespaces = new EDataTypeEList<String>(String.class, this,
                    CommonsPackage.NAMESPACE_AWARE_ELEMENT__NAMESPACES);
        }
        return namespaces;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getNamespacesAsString() {
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ConcreteClassifier getClassifierAtNamespaces() {
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case CommonsPackage.NAMESPACE_AWARE_ELEMENT__NAMESPACES:
            return getNamespaces();
        default:
            return super.eGet(featureID, resolve, coreType);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case CommonsPackage.NAMESPACE_AWARE_ELEMENT__NAMESPACES:
            getNamespaces().clear();
            getNamespaces().addAll((Collection<? extends String>) newValue);
            return;
        default:
            super.eSet(featureID, newValue);
            return;
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
        case CommonsPackage.NAMESPACE_AWARE_ELEMENT__NAMESPACES:
            getNamespaces().clear();
            return;
        default:
            super.eUnset(featureID);
            return;
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
        case CommonsPackage.NAMESPACE_AWARE_ELEMENT__NAMESPACES:
            return namespaces != null && !namespaces.isEmpty();
        default:
            return super.eIsSet(featureID);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
        switch (operationID) {
        case CommonsPackage.NAMESPACE_AWARE_ELEMENT___GET_NAMESPACES_AS_STRING:
            return getNamespacesAsString();
        case CommonsPackage.NAMESPACE_AWARE_ELEMENT___GET_CLASSIFIER_AT_NAMESPACES:
            return getClassifierAtNamespaces();
        default:
            return super.eInvoke(operationID, arguments);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy())
            return super.toString();

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (namespaces: ");
        result.append(namespaces);
        result.append(')');
        return result.toString();
    }

} //NamespaceAwareElementImpl
