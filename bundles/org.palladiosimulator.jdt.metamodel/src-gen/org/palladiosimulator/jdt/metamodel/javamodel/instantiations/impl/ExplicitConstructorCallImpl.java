/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.instantiations.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.instantiations.ExplicitConstructorCall;
import org.palladiosimulator.jdt.metamodel.javamodel.instantiations.InstantiationsPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.literals.Self;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Explicit Constructor Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.instantiations.impl.ExplicitConstructorCallImpl#getCallTarget <em>Call Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExplicitConstructorCallImpl extends InstantiationImpl implements ExplicitConstructorCall {
    /**
     * The cached value of the '{@link #getCallTarget() <em>Call Target</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCallTarget()
     * @generated
     * @ordered
     */
    protected Self callTarget;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExplicitConstructorCallImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return InstantiationsPackage.Literals.EXPLICIT_CONSTRUCTOR_CALL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Self getCallTarget() {
        return callTarget;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCallTarget(Self newCallTarget, NotificationChain msgs) {
        Self oldCallTarget = callTarget;
        callTarget = newCallTarget;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    InstantiationsPackage.EXPLICIT_CONSTRUCTOR_CALL__CALL_TARGET, oldCallTarget, newCallTarget);
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
    public void setCallTarget(Self newCallTarget) {
        if (newCallTarget != callTarget) {
            NotificationChain msgs = null;
            if (callTarget != null)
                msgs = ((InternalEObject) callTarget).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - InstantiationsPackage.EXPLICIT_CONSTRUCTOR_CALL__CALL_TARGET, null,
                        msgs);
            if (newCallTarget != null)
                msgs = ((InternalEObject) newCallTarget).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - InstantiationsPackage.EXPLICIT_CONSTRUCTOR_CALL__CALL_TARGET, null,
                        msgs);
            msgs = basicSetCallTarget(newCallTarget, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    InstantiationsPackage.EXPLICIT_CONSTRUCTOR_CALL__CALL_TARGET, newCallTarget, newCallTarget));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case InstantiationsPackage.EXPLICIT_CONSTRUCTOR_CALL__CALL_TARGET:
            return basicSetCallTarget(null, msgs);
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
        case InstantiationsPackage.EXPLICIT_CONSTRUCTOR_CALL__CALL_TARGET:
            return getCallTarget();
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
        case InstantiationsPackage.EXPLICIT_CONSTRUCTOR_CALL__CALL_TARGET:
            setCallTarget((Self) newValue);
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
        case InstantiationsPackage.EXPLICIT_CONSTRUCTOR_CALL__CALL_TARGET:
            setCallTarget((Self) null);
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
        case InstantiationsPackage.EXPLICIT_CONSTRUCTOR_CALL__CALL_TARGET:
            return callTarget != null;
        default:
            return super.eIsSet(featureID);
        }
    }

} //ExplicitConstructorCallImpl
