/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayDimension;
import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayTypeable;
import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArraysPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.impl.CommentableImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Typeable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArrayTypeableImpl#getArrayDimensionsBefore <em>Array Dimensions Before</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArrayTypeableImpl#getArrayDimensionsAfter <em>Array Dimensions After</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ArrayTypeableImpl extends CommentableImpl implements ArrayTypeable {
    /**
     * The cached value of the '{@link #getArrayDimensionsBefore() <em>Array Dimensions Before</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getArrayDimensionsBefore()
     * @generated
     * @ordered
     */
    protected EList<ArrayDimension> arrayDimensionsBefore;

    /**
     * The cached value of the '{@link #getArrayDimensionsAfter() <em>Array Dimensions After</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getArrayDimensionsAfter()
     * @generated
     * @ordered
     */
    protected EList<ArrayDimension> arrayDimensionsAfter;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ArrayTypeableImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ArraysPackage.Literals.ARRAY_TYPEABLE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<ArrayDimension> getArrayDimensionsBefore() {
        if (arrayDimensionsBefore == null) {
            arrayDimensionsBefore = new EObjectContainmentEList<ArrayDimension>(ArrayDimension.class, this,
                    ArraysPackage.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_BEFORE);
        }
        return arrayDimensionsBefore;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<ArrayDimension> getArrayDimensionsAfter() {
        if (arrayDimensionsAfter == null) {
            arrayDimensionsAfter = new EObjectContainmentEList<ArrayDimension>(ArrayDimension.class, this,
                    ArraysPackage.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_AFTER);
        }
        return arrayDimensionsAfter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public long getArrayDimension() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case ArraysPackage.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_BEFORE:
            return ((InternalEList<?>) getArrayDimensionsBefore()).basicRemove(otherEnd, msgs);
        case ArraysPackage.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_AFTER:
            return ((InternalEList<?>) getArrayDimensionsAfter()).basicRemove(otherEnd, msgs);
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
        case ArraysPackage.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_BEFORE:
            return getArrayDimensionsBefore();
        case ArraysPackage.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_AFTER:
            return getArrayDimensionsAfter();
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
        case ArraysPackage.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_BEFORE:
            getArrayDimensionsBefore().clear();
            getArrayDimensionsBefore().addAll((Collection<? extends ArrayDimension>) newValue);
            return;
        case ArraysPackage.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_AFTER:
            getArrayDimensionsAfter().clear();
            getArrayDimensionsAfter().addAll((Collection<? extends ArrayDimension>) newValue);
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
        case ArraysPackage.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_BEFORE:
            getArrayDimensionsBefore().clear();
            return;
        case ArraysPackage.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_AFTER:
            getArrayDimensionsAfter().clear();
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
        case ArraysPackage.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_BEFORE:
            return arrayDimensionsBefore != null && !arrayDimensionsBefore.isEmpty();
        case ArraysPackage.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_AFTER:
            return arrayDimensionsAfter != null && !arrayDimensionsAfter.isEmpty();
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
        case ArraysPackage.ARRAY_TYPEABLE___GET_ARRAY_DIMENSION:
            return getArrayDimension();
        default:
            return super.eInvoke(operationID, arguments);
        }
    }

} //ArrayTypeableImpl
