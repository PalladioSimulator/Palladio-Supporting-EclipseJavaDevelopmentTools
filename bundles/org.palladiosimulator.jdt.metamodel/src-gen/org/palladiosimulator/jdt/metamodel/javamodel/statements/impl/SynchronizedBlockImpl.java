/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.statements.impl;

import java.lang.reflect.InvocationTargetException;

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

import org.palladiosimulator.jdt.metamodel.javamodel.statements.Statement;
import org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementListContainer;
import org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementsPackage;
import org.palladiosimulator.jdt.metamodel.javamodel.statements.SynchronizedBlock;

import org.palladiosimulator.jdt.metamodel.javamodel.variables.LocalVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Synchronized Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.statements.impl.SynchronizedBlockImpl#getStatements <em>Statements</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.statements.impl.SynchronizedBlockImpl#getLockProvider <em>Lock Provider</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SynchronizedBlockImpl extends StatementImpl implements SynchronizedBlock {
    /**
     * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStatements()
     * @generated
     * @ordered
     */
    protected EList<Statement> statements;

    /**
     * The cached value of the '{@link #getLockProvider() <em>Lock Provider</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLockProvider()
     * @generated
     * @ordered
     */
    protected Expression lockProvider;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SynchronizedBlockImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return StatementsPackage.Literals.SYNCHRONIZED_BLOCK;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Statement> getStatements() {
        if (statements == null) {
            statements = new EObjectContainmentEList<Statement>(Statement.class, this,
                    StatementsPackage.SYNCHRONIZED_BLOCK__STATEMENTS);
        }
        return statements;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Expression getLockProvider() {
        return lockProvider;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLockProvider(Expression newLockProvider, NotificationChain msgs) {
        Expression oldLockProvider = lockProvider;
        lockProvider = newLockProvider;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    StatementsPackage.SYNCHRONIZED_BLOCK__LOCK_PROVIDER, oldLockProvider, newLockProvider);
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
    public void setLockProvider(Expression newLockProvider) {
        if (newLockProvider != lockProvider) {
            NotificationChain msgs = null;
            if (lockProvider != null)
                msgs = ((InternalEObject) lockProvider).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - StatementsPackage.SYNCHRONIZED_BLOCK__LOCK_PROVIDER, null, msgs);
            if (newLockProvider != null)
                msgs = ((InternalEObject) newLockProvider).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - StatementsPackage.SYNCHRONIZED_BLOCK__LOCK_PROVIDER, null, msgs);
            msgs = basicSetLockProvider(newLockProvider, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.SYNCHRONIZED_BLOCK__LOCK_PROVIDER,
                    newLockProvider, newLockProvider));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LocalVariable getLocalVariable(final String name) {
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case StatementsPackage.SYNCHRONIZED_BLOCK__STATEMENTS:
            return ((InternalEList<?>) getStatements()).basicRemove(otherEnd, msgs);
        case StatementsPackage.SYNCHRONIZED_BLOCK__LOCK_PROVIDER:
            return basicSetLockProvider(null, msgs);
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
        case StatementsPackage.SYNCHRONIZED_BLOCK__STATEMENTS:
            return getStatements();
        case StatementsPackage.SYNCHRONIZED_BLOCK__LOCK_PROVIDER:
            return getLockProvider();
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
        case StatementsPackage.SYNCHRONIZED_BLOCK__STATEMENTS:
            getStatements().clear();
            getStatements().addAll((Collection<? extends Statement>) newValue);
            return;
        case StatementsPackage.SYNCHRONIZED_BLOCK__LOCK_PROVIDER:
            setLockProvider((Expression) newValue);
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
        case StatementsPackage.SYNCHRONIZED_BLOCK__STATEMENTS:
            getStatements().clear();
            return;
        case StatementsPackage.SYNCHRONIZED_BLOCK__LOCK_PROVIDER:
            setLockProvider((Expression) null);
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
        case StatementsPackage.SYNCHRONIZED_BLOCK__STATEMENTS:
            return statements != null && !statements.isEmpty();
        case StatementsPackage.SYNCHRONIZED_BLOCK__LOCK_PROVIDER:
            return lockProvider != null;
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
        if (baseClass == StatementListContainer.class) {
            switch (derivedFeatureID) {
            case StatementsPackage.SYNCHRONIZED_BLOCK__STATEMENTS:
                return StatementsPackage.STATEMENT_LIST_CONTAINER__STATEMENTS;
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
        if (baseClass == StatementListContainer.class) {
            switch (baseFeatureID) {
            case StatementsPackage.STATEMENT_LIST_CONTAINER__STATEMENTS:
                return StatementsPackage.SYNCHRONIZED_BLOCK__STATEMENTS;
            default:
                return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
        if (baseClass == StatementListContainer.class) {
            switch (baseOperationID) {
            case StatementsPackage.STATEMENT_LIST_CONTAINER___GET_LOCAL_VARIABLE__STRING:
                return StatementsPackage.SYNCHRONIZED_BLOCK___GET_LOCAL_VARIABLE__STRING;
            default:
                return -1;
            }
        }
        return super.eDerivedOperationID(baseOperationID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
        switch (operationID) {
        case StatementsPackage.SYNCHRONIZED_BLOCK___GET_LOCAL_VARIABLE__STRING:
            return getLocalVariable((String) arguments.get(0));
        default:
            return super.eInvoke(operationID, arguments);
        }
    }

} //SynchronizedBlockImpl
