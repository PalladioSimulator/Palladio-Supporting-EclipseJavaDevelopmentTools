/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.statements.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.expressions.Expression;

import org.palladiosimulator.jdt.metamodel.javamodel.statements.Condition;
import org.palladiosimulator.jdt.metamodel.javamodel.statements.Conditional;
import org.palladiosimulator.jdt.metamodel.javamodel.statements.Statement;
import org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementContainer;
import org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.statements.impl.ConditionImpl#getStatement <em>Statement</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.statements.impl.ConditionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.statements.impl.ConditionImpl#getElseStatement <em>Else Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionImpl extends StatementImpl implements Condition {
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
     * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCondition()
     * @generated
     * @ordered
     */
    protected Expression condition;

    /**
     * The cached value of the '{@link #getElseStatement() <em>Else Statement</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getElseStatement()
     * @generated
     * @ordered
     */
    protected Statement elseStatement;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ConditionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return StatementsPackage.Literals.CONDITION;
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
                    StatementsPackage.CONDITION__STATEMENT, oldStatement, newStatement);
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
                        EOPPOSITE_FEATURE_BASE - StatementsPackage.CONDITION__STATEMENT, null, msgs);
            if (newStatement != null)
                msgs = ((InternalEObject) newStatement).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - StatementsPackage.CONDITION__STATEMENT, null, msgs);
            msgs = basicSetStatement(newStatement, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.CONDITION__STATEMENT, newStatement,
                    newStatement));
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
                    StatementsPackage.CONDITION__CONDITION, oldCondition, newCondition);
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
                        EOPPOSITE_FEATURE_BASE - StatementsPackage.CONDITION__CONDITION, null, msgs);
            if (newCondition != null)
                msgs = ((InternalEObject) newCondition).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - StatementsPackage.CONDITION__CONDITION, null, msgs);
            msgs = basicSetCondition(newCondition, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.CONDITION__CONDITION, newCondition,
                    newCondition));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Statement getElseStatement() {
        return elseStatement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetElseStatement(Statement newElseStatement, NotificationChain msgs) {
        Statement oldElseStatement = elseStatement;
        elseStatement = newElseStatement;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    StatementsPackage.CONDITION__ELSE_STATEMENT, oldElseStatement, newElseStatement);
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
    public void setElseStatement(Statement newElseStatement) {
        if (newElseStatement != elseStatement) {
            NotificationChain msgs = null;
            if (elseStatement != null)
                msgs = ((InternalEObject) elseStatement).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - StatementsPackage.CONDITION__ELSE_STATEMENT, null, msgs);
            if (newElseStatement != null)
                msgs = ((InternalEObject) newElseStatement).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - StatementsPackage.CONDITION__ELSE_STATEMENT, null, msgs);
            msgs = basicSetElseStatement(newElseStatement, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.CONDITION__ELSE_STATEMENT,
                    newElseStatement, newElseStatement));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case StatementsPackage.CONDITION__STATEMENT:
            return basicSetStatement(null, msgs);
        case StatementsPackage.CONDITION__CONDITION:
            return basicSetCondition(null, msgs);
        case StatementsPackage.CONDITION__ELSE_STATEMENT:
            return basicSetElseStatement(null, msgs);
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
        case StatementsPackage.CONDITION__STATEMENT:
            return getStatement();
        case StatementsPackage.CONDITION__CONDITION:
            return getCondition();
        case StatementsPackage.CONDITION__ELSE_STATEMENT:
            return getElseStatement();
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
        case StatementsPackage.CONDITION__STATEMENT:
            setStatement((Statement) newValue);
            return;
        case StatementsPackage.CONDITION__CONDITION:
            setCondition((Expression) newValue);
            return;
        case StatementsPackage.CONDITION__ELSE_STATEMENT:
            setElseStatement((Statement) newValue);
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
        case StatementsPackage.CONDITION__STATEMENT:
            setStatement((Statement) null);
            return;
        case StatementsPackage.CONDITION__CONDITION:
            setCondition((Expression) null);
            return;
        case StatementsPackage.CONDITION__ELSE_STATEMENT:
            setElseStatement((Statement) null);
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
        case StatementsPackage.CONDITION__STATEMENT:
            return statement != null;
        case StatementsPackage.CONDITION__CONDITION:
            return condition != null;
        case StatementsPackage.CONDITION__ELSE_STATEMENT:
            return elseStatement != null;
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
        if (baseClass == StatementContainer.class) {
            switch (derivedFeatureID) {
            case StatementsPackage.CONDITION__STATEMENT:
                return StatementsPackage.STATEMENT_CONTAINER__STATEMENT;
            default:
                return -1;
            }
        }
        if (baseClass == Conditional.class) {
            switch (derivedFeatureID) {
            case StatementsPackage.CONDITION__CONDITION:
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
        if (baseClass == StatementContainer.class) {
            switch (baseFeatureID) {
            case StatementsPackage.STATEMENT_CONTAINER__STATEMENT:
                return StatementsPackage.CONDITION__STATEMENT;
            default:
                return -1;
            }
        }
        if (baseClass == Conditional.class) {
            switch (baseFeatureID) {
            case StatementsPackage.CONDITIONAL__CONDITION:
                return StatementsPackage.CONDITION__CONDITION;
            default:
                return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //ConditionImpl
