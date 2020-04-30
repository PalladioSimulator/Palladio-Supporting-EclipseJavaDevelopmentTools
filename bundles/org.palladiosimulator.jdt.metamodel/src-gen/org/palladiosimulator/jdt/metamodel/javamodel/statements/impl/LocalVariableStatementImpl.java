/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.statements.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.statements.LocalVariableStatement;
import org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementsPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.variables.LocalVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local Variable Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.statements.impl.LocalVariableStatementImpl#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocalVariableStatementImpl extends StatementImpl implements LocalVariableStatement {
    /**
     * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVariable()
     * @generated
     * @ordered
     */
    protected LocalVariable variable;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LocalVariableStatementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return StatementsPackage.Literals.LOCAL_VARIABLE_STATEMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LocalVariable getVariable() {
        return variable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetVariable(LocalVariable newVariable, NotificationChain msgs) {
        LocalVariable oldVariable = variable;
        variable = newVariable;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    StatementsPackage.LOCAL_VARIABLE_STATEMENT__VARIABLE, oldVariable, newVariable);
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
    public void setVariable(LocalVariable newVariable) {
        if (newVariable != variable) {
            NotificationChain msgs = null;
            if (variable != null)
                msgs = ((InternalEObject) variable).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - StatementsPackage.LOCAL_VARIABLE_STATEMENT__VARIABLE, null, msgs);
            if (newVariable != null)
                msgs = ((InternalEObject) newVariable).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - StatementsPackage.LOCAL_VARIABLE_STATEMENT__VARIABLE, null, msgs);
            msgs = basicSetVariable(newVariable, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.LOCAL_VARIABLE_STATEMENT__VARIABLE,
                    newVariable, newVariable));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case StatementsPackage.LOCAL_VARIABLE_STATEMENT__VARIABLE:
            return basicSetVariable(null, msgs);
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
        case StatementsPackage.LOCAL_VARIABLE_STATEMENT__VARIABLE:
            return getVariable();
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
        case StatementsPackage.LOCAL_VARIABLE_STATEMENT__VARIABLE:
            setVariable((LocalVariable) newValue);
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
        case StatementsPackage.LOCAL_VARIABLE_STATEMENT__VARIABLE:
            setVariable((LocalVariable) null);
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
        case StatementsPackage.LOCAL_VARIABLE_STATEMENT__VARIABLE:
            return variable != null;
        default:
            return super.eIsSet(featureID);
        }
    }

} //LocalVariableStatementImpl
