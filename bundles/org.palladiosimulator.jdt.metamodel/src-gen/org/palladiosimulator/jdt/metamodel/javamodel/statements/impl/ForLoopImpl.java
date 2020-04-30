/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.statements.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.palladiosimulator.jdt.metamodel.javamodel.expressions.Expression;

import org.palladiosimulator.jdt.metamodel.javamodel.statements.Conditional;
import org.palladiosimulator.jdt.metamodel.javamodel.statements.ForLoop;
import org.palladiosimulator.jdt.metamodel.javamodel.statements.ForLoopInitializer;
import org.palladiosimulator.jdt.metamodel.javamodel.statements.Statement;
import org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementContainer;
import org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Loop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.statements.impl.ForLoopImpl#getStatement <em>Statement</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.statements.impl.ForLoopImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.statements.impl.ForLoopImpl#getInit <em>Init</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.statements.impl.ForLoopImpl#getUpdates <em>Updates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForLoopImpl extends StatementImpl implements ForLoop {
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
     * The cached value of the '{@link #getInit() <em>Init</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInit()
     * @generated
     * @ordered
     */
    protected ForLoopInitializer init;

    /**
     * The cached value of the '{@link #getUpdates() <em>Updates</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUpdates()
     * @generated
     * @ordered
     */
    protected EList<Expression> updates;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ForLoopImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return StatementsPackage.Literals.FOR_LOOP;
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
                    StatementsPackage.FOR_LOOP__STATEMENT, oldStatement, newStatement);
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
                        EOPPOSITE_FEATURE_BASE - StatementsPackage.FOR_LOOP__STATEMENT, null, msgs);
            if (newStatement != null)
                msgs = ((InternalEObject) newStatement).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - StatementsPackage.FOR_LOOP__STATEMENT, null, msgs);
            msgs = basicSetStatement(newStatement, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.FOR_LOOP__STATEMENT, newStatement,
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
                    StatementsPackage.FOR_LOOP__CONDITION, oldCondition, newCondition);
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
                        EOPPOSITE_FEATURE_BASE - StatementsPackage.FOR_LOOP__CONDITION, null, msgs);
            if (newCondition != null)
                msgs = ((InternalEObject) newCondition).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - StatementsPackage.FOR_LOOP__CONDITION, null, msgs);
            msgs = basicSetCondition(newCondition, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.FOR_LOOP__CONDITION, newCondition,
                    newCondition));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ForLoopInitializer getInit() {
        return init;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInit(ForLoopInitializer newInit, NotificationChain msgs) {
        ForLoopInitializer oldInit = init;
        init = newInit;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    StatementsPackage.FOR_LOOP__INIT, oldInit, newInit);
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
    public void setInit(ForLoopInitializer newInit) {
        if (newInit != init) {
            NotificationChain msgs = null;
            if (init != null)
                msgs = ((InternalEObject) init).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - StatementsPackage.FOR_LOOP__INIT, null, msgs);
            if (newInit != null)
                msgs = ((InternalEObject) newInit).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - StatementsPackage.FOR_LOOP__INIT, null, msgs);
            msgs = basicSetInit(newInit, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.FOR_LOOP__INIT, newInit, newInit));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Expression> getUpdates() {
        if (updates == null) {
            updates = new EObjectContainmentEList<Expression>(Expression.class, this,
                    StatementsPackage.FOR_LOOP__UPDATES);
        }
        return updates;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case StatementsPackage.FOR_LOOP__STATEMENT:
            return basicSetStatement(null, msgs);
        case StatementsPackage.FOR_LOOP__CONDITION:
            return basicSetCondition(null, msgs);
        case StatementsPackage.FOR_LOOP__INIT:
            return basicSetInit(null, msgs);
        case StatementsPackage.FOR_LOOP__UPDATES:
            return ((InternalEList<?>) getUpdates()).basicRemove(otherEnd, msgs);
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
        case StatementsPackage.FOR_LOOP__STATEMENT:
            return getStatement();
        case StatementsPackage.FOR_LOOP__CONDITION:
            return getCondition();
        case StatementsPackage.FOR_LOOP__INIT:
            return getInit();
        case StatementsPackage.FOR_LOOP__UPDATES:
            return getUpdates();
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
        case StatementsPackage.FOR_LOOP__STATEMENT:
            setStatement((Statement) newValue);
            return;
        case StatementsPackage.FOR_LOOP__CONDITION:
            setCondition((Expression) newValue);
            return;
        case StatementsPackage.FOR_LOOP__INIT:
            setInit((ForLoopInitializer) newValue);
            return;
        case StatementsPackage.FOR_LOOP__UPDATES:
            getUpdates().clear();
            getUpdates().addAll((Collection<? extends Expression>) newValue);
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
        case StatementsPackage.FOR_LOOP__STATEMENT:
            setStatement((Statement) null);
            return;
        case StatementsPackage.FOR_LOOP__CONDITION:
            setCondition((Expression) null);
            return;
        case StatementsPackage.FOR_LOOP__INIT:
            setInit((ForLoopInitializer) null);
            return;
        case StatementsPackage.FOR_LOOP__UPDATES:
            getUpdates().clear();
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
        case StatementsPackage.FOR_LOOP__STATEMENT:
            return statement != null;
        case StatementsPackage.FOR_LOOP__CONDITION:
            return condition != null;
        case StatementsPackage.FOR_LOOP__INIT:
            return init != null;
        case StatementsPackage.FOR_LOOP__UPDATES:
            return updates != null && !updates.isEmpty();
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
            case StatementsPackage.FOR_LOOP__STATEMENT:
                return StatementsPackage.STATEMENT_CONTAINER__STATEMENT;
            default:
                return -1;
            }
        }
        if (baseClass == Conditional.class) {
            switch (derivedFeatureID) {
            case StatementsPackage.FOR_LOOP__CONDITION:
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
                return StatementsPackage.FOR_LOOP__STATEMENT;
            default:
                return -1;
            }
        }
        if (baseClass == Conditional.class) {
            switch (baseFeatureID) {
            case StatementsPackage.CONDITIONAL__CONDITION:
                return StatementsPackage.FOR_LOOP__CONDITION;
            default:
                return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //ForLoopImpl
