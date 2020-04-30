/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.statements.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.expressions.Expression;

import org.palladiosimulator.jdt.metamodel.javamodel.statements.Assert;
import org.palladiosimulator.jdt.metamodel.javamodel.statements.Conditional;
import org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assert</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.statements.impl.AssertImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.statements.impl.AssertImpl#getErrorMessage <em>Error Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssertImpl extends StatementImpl implements Assert {
    /**
     * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCondition()
     * @generated
     * @ordered
     */
    protected Expression condition;

    /**
     * The cached value of the '{@link #getErrorMessage() <em>Error Message</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getErrorMessage()
     * @generated
     * @ordered
     */
    protected Expression errorMessage;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AssertImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return StatementsPackage.Literals.ASSERT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Expression getCondition() {
        return condition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCondition(Expression newCondition, NotificationChain msgs) {
        Expression oldCondition = condition;
        condition = newCondition;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    StatementsPackage.ASSERT__CONDITION, oldCondition, newCondition);
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
    public void setCondition(Expression newCondition) {
        if (newCondition != condition) {
            NotificationChain msgs = null;
            if (condition != null)
                msgs = ((InternalEObject) condition).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - StatementsPackage.ASSERT__CONDITION, null, msgs);
            if (newCondition != null)
                msgs = ((InternalEObject) newCondition).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - StatementsPackage.ASSERT__CONDITION, null, msgs);
            msgs = basicSetCondition(newCondition, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.ASSERT__CONDITION, newCondition,
                    newCondition));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Expression getErrorMessage() {
        return errorMessage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetErrorMessage(Expression newErrorMessage, NotificationChain msgs) {
        Expression oldErrorMessage = errorMessage;
        errorMessage = newErrorMessage;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    StatementsPackage.ASSERT__ERROR_MESSAGE, oldErrorMessage, newErrorMessage);
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
    public void setErrorMessage(Expression newErrorMessage) {
        if (newErrorMessage != errorMessage) {
            NotificationChain msgs = null;
            if (errorMessage != null)
                msgs = ((InternalEObject) errorMessage).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - StatementsPackage.ASSERT__ERROR_MESSAGE, null, msgs);
            if (newErrorMessage != null)
                msgs = ((InternalEObject) newErrorMessage).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - StatementsPackage.ASSERT__ERROR_MESSAGE, null, msgs);
            msgs = basicSetErrorMessage(newErrorMessage, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.ASSERT__ERROR_MESSAGE,
                    newErrorMessage, newErrorMessage));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case StatementsPackage.ASSERT__CONDITION:
            return basicSetCondition(null, msgs);
        case StatementsPackage.ASSERT__ERROR_MESSAGE:
            return basicSetErrorMessage(null, msgs);
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
        case StatementsPackage.ASSERT__CONDITION:
            return getCondition();
        case StatementsPackage.ASSERT__ERROR_MESSAGE:
            return getErrorMessage();
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
        case StatementsPackage.ASSERT__CONDITION:
            setCondition((Expression) newValue);
            return;
        case StatementsPackage.ASSERT__ERROR_MESSAGE:
            setErrorMessage((Expression) newValue);
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
        case StatementsPackage.ASSERT__CONDITION:
            setCondition((Expression) null);
            return;
        case StatementsPackage.ASSERT__ERROR_MESSAGE:
            setErrorMessage((Expression) null);
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
        case StatementsPackage.ASSERT__CONDITION:
            return condition != null;
        case StatementsPackage.ASSERT__ERROR_MESSAGE:
            return errorMessage != null;
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
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == Conditional.class) {
            switch (derivedFeatureID) {
            case StatementsPackage.ASSERT__CONDITION:
                return StatementsPackage.CONDITIONAL__CONDITION;
            default:
                return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == Conditional.class) {
            switch (baseFeatureID) {
            case StatementsPackage.CONDITIONAL__CONDITION:
                return StatementsPackage.ASSERT__CONDITION;
            default:
                return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //AssertImpl
