/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExpressionsPackage;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.UnaryModificationExpression;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.UnaryModificationExpressionChild;

import org.palladiosimulator.jdt.metamodel.javamodel.operators.UnaryModificationOperator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unary Modification Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.UnaryModificationExpressionImpl#getChild <em>Child</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.UnaryModificationExpressionImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class UnaryModificationExpressionImpl extends UnaryExpressionChildImpl
        implements UnaryModificationExpression {
    /**
     * The cached value of the '{@link #getChild() <em>Child</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChild()
     * @generated
     * @ordered
     */
    protected UnaryModificationExpressionChild child;

    /**
     * The cached value of the '{@link #getOperator() <em>Operator</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperator()
     * @generated
     * @ordered
     */
    protected UnaryModificationOperator operator;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected UnaryModificationExpressionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExpressionsPackage.Literals.UNARY_MODIFICATION_EXPRESSION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public UnaryModificationExpressionChild getChild() {
        return child;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetChild(UnaryModificationExpressionChild newChild, NotificationChain msgs) {
        UnaryModificationExpressionChild oldChild = child;
        child = newChild;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    ExpressionsPackage.UNARY_MODIFICATION_EXPRESSION__CHILD, oldChild, newChild);
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
    public void setChild(UnaryModificationExpressionChild newChild) {
        if (newChild != child) {
            NotificationChain msgs = null;
            if (child != null)
                msgs = ((InternalEObject) child).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - ExpressionsPackage.UNARY_MODIFICATION_EXPRESSION__CHILD, null, msgs);
            if (newChild != null)
                msgs = ((InternalEObject) newChild).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - ExpressionsPackage.UNARY_MODIFICATION_EXPRESSION__CHILD, null, msgs);
            msgs = basicSetChild(newChild, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    ExpressionsPackage.UNARY_MODIFICATION_EXPRESSION__CHILD, newChild, newChild));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public UnaryModificationOperator getOperator() {
        return operator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOperator(UnaryModificationOperator newOperator, NotificationChain msgs) {
        UnaryModificationOperator oldOperator = operator;
        operator = newOperator;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    ExpressionsPackage.UNARY_MODIFICATION_EXPRESSION__OPERATOR, oldOperator, newOperator);
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
    public void setOperator(UnaryModificationOperator newOperator) {
        if (newOperator != operator) {
            NotificationChain msgs = null;
            if (operator != null)
                msgs = ((InternalEObject) operator).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - ExpressionsPackage.UNARY_MODIFICATION_EXPRESSION__OPERATOR, null,
                        msgs);
            if (newOperator != null)
                msgs = ((InternalEObject) newOperator).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - ExpressionsPackage.UNARY_MODIFICATION_EXPRESSION__OPERATOR, null,
                        msgs);
            msgs = basicSetOperator(newOperator, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    ExpressionsPackage.UNARY_MODIFICATION_EXPRESSION__OPERATOR, newOperator, newOperator));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case ExpressionsPackage.UNARY_MODIFICATION_EXPRESSION__CHILD:
            return basicSetChild(null, msgs);
        case ExpressionsPackage.UNARY_MODIFICATION_EXPRESSION__OPERATOR:
            return basicSetOperator(null, msgs);
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
        case ExpressionsPackage.UNARY_MODIFICATION_EXPRESSION__CHILD:
            return getChild();
        case ExpressionsPackage.UNARY_MODIFICATION_EXPRESSION__OPERATOR:
            return getOperator();
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
        case ExpressionsPackage.UNARY_MODIFICATION_EXPRESSION__CHILD:
            setChild((UnaryModificationExpressionChild) newValue);
            return;
        case ExpressionsPackage.UNARY_MODIFICATION_EXPRESSION__OPERATOR:
            setOperator((UnaryModificationOperator) newValue);
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
        case ExpressionsPackage.UNARY_MODIFICATION_EXPRESSION__CHILD:
            setChild((UnaryModificationExpressionChild) null);
            return;
        case ExpressionsPackage.UNARY_MODIFICATION_EXPRESSION__OPERATOR:
            setOperator((UnaryModificationOperator) null);
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
        case ExpressionsPackage.UNARY_MODIFICATION_EXPRESSION__CHILD:
            return child != null;
        case ExpressionsPackage.UNARY_MODIFICATION_EXPRESSION__OPERATOR:
            return operator != null;
        default:
            return super.eIsSet(featureID);
        }
    }

} //UnaryModificationExpressionImpl
