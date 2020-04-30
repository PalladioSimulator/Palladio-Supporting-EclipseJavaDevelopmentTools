/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.statements.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.impl.CommentableImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.statements.Statement;
import org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementContainer;
import org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statement Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.statements.impl.StatementContainerImpl#getStatement <em>Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class StatementContainerImpl extends CommentableImpl implements StatementContainer {
    /**
     * The cached value of the '{@link #getStatement() <em>Statement</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStatement()
     * @generated
     * @ordered
     */
    protected Statement statement;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected StatementContainerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return StatementsPackage.Literals.STATEMENT_CONTAINER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Statement getStatement() {
        return statement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetStatement(Statement newStatement, NotificationChain msgs) {
        Statement oldStatement = statement;
        statement = newStatement;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    StatementsPackage.STATEMENT_CONTAINER__STATEMENT, oldStatement, newStatement);
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
    public void setStatement(Statement newStatement) {
        if (newStatement != statement) {
            NotificationChain msgs = null;
            if (statement != null)
                msgs = ((InternalEObject) statement).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - StatementsPackage.STATEMENT_CONTAINER__STATEMENT, null, msgs);
            if (newStatement != null)
                msgs = ((InternalEObject) newStatement).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - StatementsPackage.STATEMENT_CONTAINER__STATEMENT, null, msgs);
            msgs = basicSetStatement(newStatement, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.STATEMENT_CONTAINER__STATEMENT,
                    newStatement, newStatement));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case StatementsPackage.STATEMENT_CONTAINER__STATEMENT:
            return basicSetStatement(null, msgs);
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
        case StatementsPackage.STATEMENT_CONTAINER__STATEMENT:
            return getStatement();
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
        case StatementsPackage.STATEMENT_CONTAINER__STATEMENT:
            setStatement((Statement) newValue);
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
        case StatementsPackage.STATEMENT_CONTAINER__STATEMENT:
            setStatement((Statement) null);
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
        case StatementsPackage.STATEMENT_CONTAINER__STATEMENT:
            return statement != null;
        default:
            return super.eIsSet(featureID);
        }
    }

} //StatementContainerImpl
