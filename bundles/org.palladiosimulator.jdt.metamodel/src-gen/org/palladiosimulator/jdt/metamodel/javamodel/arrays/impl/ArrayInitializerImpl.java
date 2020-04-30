/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayInitializationValue;
import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayInitializer;
import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArraysPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Initializer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArrayInitializerImpl#getInitialValues <em>Initial Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArrayInitializerImpl extends ArrayInitializationValueImpl implements ArrayInitializer {
    /**
     * The cached value of the '{@link #getInitialValues() <em>Initial Values</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInitialValues()
     * @generated
     * @ordered
     */
    protected EList<ArrayInitializationValue> initialValues;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ArrayInitializerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ArraysPackage.Literals.ARRAY_INITIALIZER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<ArrayInitializationValue> getInitialValues() {
        if (initialValues == null) {
            initialValues = new EObjectContainmentEList<ArrayInitializationValue>(ArrayInitializationValue.class, this,
                    ArraysPackage.ARRAY_INITIALIZER__INITIAL_VALUES);
        }
        return initialValues;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case ArraysPackage.ARRAY_INITIALIZER__INITIAL_VALUES:
            return ((InternalEList<?>) getInitialValues()).basicRemove(otherEnd, msgs);
        default:
            return super.eInverseRemove(otherEnd, featureID, msgs);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case ArraysPackage.ARRAY_INITIALIZER__INITIAL_VALUES:
            return getInitialValues();
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
        case ArraysPackage.ARRAY_INITIALIZER__INITIAL_VALUES:
            getInitialValues().clear();
            getInitialValues().addAll((Collection<? extends ArrayInitializationValue>) newValue);
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
        case ArraysPackage.ARRAY_INITIALIZER__INITIAL_VALUES:
            getInitialValues().clear();
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
        case ArraysPackage.ARRAY_INITIALIZER__INITIAL_VALUES:
            return initialValues != null && !initialValues.isEmpty();
        default:
            return super.eIsSet(featureID);
        }
    }

} //ArrayInitializerImpl
