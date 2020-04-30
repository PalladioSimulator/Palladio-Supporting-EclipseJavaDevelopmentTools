/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArraySelector;
import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArraysPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.impl.CommentableImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Selector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArraySelectorImpl#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArraySelectorImpl extends CommentableImpl implements ArraySelector {
    /**
     * The cached value of the '{@link #getPosition() <em>Position</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPosition()
     * @generated
     * @ordered
     */
    protected Expression position;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ArraySelectorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ArraysPackage.Literals.ARRAY_SELECTOR;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Expression getPosition() {
        return position;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPosition(Expression newPosition, NotificationChain msgs) {
        Expression oldPosition = position;
        position = newPosition;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    ArraysPackage.ARRAY_SELECTOR__POSITION, oldPosition, newPosition);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPosition(Expression newPosition) {
        if (newPosition != position) {
            NotificationChain msgs = null;
            if (position != null)
                msgs = ((InternalEObject) position).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - ArraysPackage.ARRAY_SELECTOR__POSITION, null, msgs);
            if (newPosition != null)
                msgs = ((InternalEObject) newPosition).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - ArraysPackage.ARRAY_SELECTOR__POSITION, null, msgs);
            msgs = basicSetPosition(newPosition, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ArraysPackage.ARRAY_SELECTOR__POSITION, newPosition,
                    newPosition));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case ArraysPackage.ARRAY_SELECTOR__POSITION:
            return basicSetPosition(null, msgs);
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
        case ArraysPackage.ARRAY_SELECTOR__POSITION:
            return getPosition();
        default:
            return super.eGet(featureID, resolve, coreType);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case ArraysPackage.ARRAY_SELECTOR__POSITION:
            setPosition((Expression) newValue);
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
        case ArraysPackage.ARRAY_SELECTOR__POSITION:
            setPosition((Expression) null);
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
        case ArraysPackage.ARRAY_SELECTOR__POSITION:
            return position != null;
        default:
            return super.eIsSet(featureID);
        }
    }

} //ArraySelectorImpl
