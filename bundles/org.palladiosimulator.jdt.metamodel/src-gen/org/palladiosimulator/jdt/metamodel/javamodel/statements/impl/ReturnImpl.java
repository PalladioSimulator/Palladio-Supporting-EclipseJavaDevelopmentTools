/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.statements.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.expressions.Expression;

import org.palladiosimulator.jdt.metamodel.javamodel.statements.Return;
import org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Return</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.statements.impl.ReturnImpl#getReturnValue <em>Return Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReturnImpl extends StatementImpl implements Return {
    /**
     * The cached value of the '{@link #getReturnValue() <em>Return Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReturnValue()
     * @generated
     * @ordered
     */
    protected Expression returnValue;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ReturnImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return StatementsPackage.Literals.RETURN;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Expression getReturnValue() {
        return returnValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetReturnValue(Expression newReturnValue, NotificationChain msgs) {
        Expression oldReturnValue = returnValue;
        returnValue = newReturnValue;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    StatementsPackage.RETURN__RETURN_VALUE, oldReturnValue, newReturnValue);
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
    public void setReturnValue(Expression newReturnValue) {
        if (newReturnValue != returnValue) {
            NotificationChain msgs = null;
            if (returnValue != null)
                msgs = ((InternalEObject) returnValue).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - StatementsPackage.RETURN__RETURN_VALUE, null, msgs);
            if (newReturnValue != null)
                msgs = ((InternalEObject) newReturnValue).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - StatementsPackage.RETURN__RETURN_VALUE, null, msgs);
            msgs = basicSetReturnValue(newReturnValue, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.RETURN__RETURN_VALUE,
                    newReturnValue, newReturnValue));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case StatementsPackage.RETURN__RETURN_VALUE:
            return basicSetReturnValue(null, msgs);
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
        case StatementsPackage.RETURN__RETURN_VALUE:
            return getReturnValue();
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
        case StatementsPackage.RETURN__RETURN_VALUE:
            setReturnValue((Expression) newValue);
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
        case StatementsPackage.RETURN__RETURN_VALUE:
            setReturnValue((Expression) null);
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
        case StatementsPackage.RETURN__RETURN_VALUE:
            return returnValue != null;
        default:
            return super.eIsSet(featureID);
        }
    }

} //ReturnImpl
