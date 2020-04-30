/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.statements.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.expressions.Expression;

import org.palladiosimulator.jdt.metamodel.javamodel.parameters.OrdinaryParameter;

import org.palladiosimulator.jdt.metamodel.javamodel.statements.ForEachLoop;
import org.palladiosimulator.jdt.metamodel.javamodel.statements.Statement;
import org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementContainer;
import org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Each Loop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.statements.impl.ForEachLoopImpl#getStatement <em>Statement</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.statements.impl.ForEachLoopImpl#getNext <em>Next</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.statements.impl.ForEachLoopImpl#getCollection <em>Collection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForEachLoopImpl extends StatementImpl implements ForEachLoop {
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
     * The cached value of the '{@link #getNext() <em>Next</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNext()
     * @generated
     * @ordered
     */
    protected OrdinaryParameter next;

    /**
     * The cached value of the '{@link #getCollection() <em>Collection</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCollection()
     * @generated
     * @ordered
     */
    protected Expression collection;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ForEachLoopImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return StatementsPackage.Literals.FOR_EACH_LOOP;
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
                    StatementsPackage.FOR_EACH_LOOP__STATEMENT, oldStatement, newStatement);
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
                        EOPPOSITE_FEATURE_BASE - StatementsPackage.FOR_EACH_LOOP__STATEMENT, null, msgs);
            if (newStatement != null)
                msgs = ((InternalEObject) newStatement).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - StatementsPackage.FOR_EACH_LOOP__STATEMENT, null, msgs);
            msgs = basicSetStatement(newStatement, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.FOR_EACH_LOOP__STATEMENT,
                    newStatement, newStatement));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public OrdinaryParameter getNext() {
        return next;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetNext(OrdinaryParameter newNext, NotificationChain msgs) {
        OrdinaryParameter oldNext = next;
        next = newNext;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    StatementsPackage.FOR_EACH_LOOP__NEXT, oldNext, newNext);
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
    public void setNext(OrdinaryParameter newNext) {
        if (newNext != next) {
            NotificationChain msgs = null;
            if (next != null)
                msgs = ((InternalEObject) next).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - StatementsPackage.FOR_EACH_LOOP__NEXT, null, msgs);
            if (newNext != null)
                msgs = ((InternalEObject) newNext).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - StatementsPackage.FOR_EACH_LOOP__NEXT, null, msgs);
            msgs = basicSetNext(newNext, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.FOR_EACH_LOOP__NEXT, newNext,
                    newNext));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Expression getCollection() {
        return collection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCollection(Expression newCollection, NotificationChain msgs) {
        Expression oldCollection = collection;
        collection = newCollection;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    StatementsPackage.FOR_EACH_LOOP__COLLECTION, oldCollection, newCollection);
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
    public void setCollection(Expression newCollection) {
        if (newCollection != collection) {
            NotificationChain msgs = null;
            if (collection != null)
                msgs = ((InternalEObject) collection).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - StatementsPackage.FOR_EACH_LOOP__COLLECTION, null, msgs);
            if (newCollection != null)
                msgs = ((InternalEObject) newCollection).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - StatementsPackage.FOR_EACH_LOOP__COLLECTION, null, msgs);
            msgs = basicSetCollection(newCollection, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.FOR_EACH_LOOP__COLLECTION,
                    newCollection, newCollection));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case StatementsPackage.FOR_EACH_LOOP__STATEMENT:
            return basicSetStatement(null, msgs);
        case StatementsPackage.FOR_EACH_LOOP__NEXT:
            return basicSetNext(null, msgs);
        case StatementsPackage.FOR_EACH_LOOP__COLLECTION:
            return basicSetCollection(null, msgs);
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
        case StatementsPackage.FOR_EACH_LOOP__STATEMENT:
            return getStatement();
        case StatementsPackage.FOR_EACH_LOOP__NEXT:
            return getNext();
        case StatementsPackage.FOR_EACH_LOOP__COLLECTION:
            return getCollection();
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
        case StatementsPackage.FOR_EACH_LOOP__STATEMENT:
            setStatement((Statement) newValue);
            return;
        case StatementsPackage.FOR_EACH_LOOP__NEXT:
            setNext((OrdinaryParameter) newValue);
            return;
        case StatementsPackage.FOR_EACH_LOOP__COLLECTION:
            setCollection((Expression) newValue);
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
        case StatementsPackage.FOR_EACH_LOOP__STATEMENT:
            setStatement((Statement) null);
            return;
        case StatementsPackage.FOR_EACH_LOOP__NEXT:
            setNext((OrdinaryParameter) null);
            return;
        case StatementsPackage.FOR_EACH_LOOP__COLLECTION:
            setCollection((Expression) null);
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
        case StatementsPackage.FOR_EACH_LOOP__STATEMENT:
            return statement != null;
        case StatementsPackage.FOR_EACH_LOOP__NEXT:
            return next != null;
        case StatementsPackage.FOR_EACH_LOOP__COLLECTION:
            return collection != null;
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
            case StatementsPackage.FOR_EACH_LOOP__STATEMENT:
                return StatementsPackage.STATEMENT_CONTAINER__STATEMENT;
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
                return StatementsPackage.FOR_EACH_LOOP__STATEMENT;
            default:
                return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //ForEachLoopImpl
