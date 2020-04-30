/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExpressionsPackage;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.UnaryExpression;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.UnaryExpressionChild;

import org.palladiosimulator.jdt.metamodel.javamodel.operators.UnaryOperator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unary Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.UnaryExpressionImpl#getOperators <em>Operators</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.UnaryExpressionImpl#getChild <em>Child</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnaryExpressionImpl extends MultiplicativeExpressionChildImpl implements UnaryExpression {
    /**
     * The cached value of the '{@link #getOperators() <em>Operators</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperators()
     * @generated
     * @ordered
     */
    protected EList<UnaryOperator> operators;

    /**
     * The cached value of the '{@link #getChild() <em>Child</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChild()
     * @generated
     * @ordered
     */
    protected UnaryExpressionChild child;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected UnaryExpressionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExpressionsPackage.Literals.UNARY_EXPRESSION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<UnaryOperator> getOperators() {
        if (operators == null) {
            operators = new EObjectContainmentEList<UnaryOperator>(UnaryOperator.class, this,
                    ExpressionsPackage.UNARY_EXPRESSION__OPERATORS);
        }
        return operators;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public UnaryExpressionChild getChild() {
        return child;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetChild(UnaryExpressionChild newChild, NotificationChain msgs) {
        UnaryExpressionChild oldChild = child;
        child = newChild;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    ExpressionsPackage.UNARY_EXPRESSION__CHILD, oldChild, newChild);
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
    public void setChild(UnaryExpressionChild newChild) {
        if (newChild != child) {
            NotificationChain msgs = null;
            if (child != null)
                msgs = ((InternalEObject) child).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - ExpressionsPackage.UNARY_EXPRESSION__CHILD, null, msgs);
            if (newChild != null)
                msgs = ((InternalEObject) newChild).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - ExpressionsPackage.UNARY_EXPRESSION__CHILD, null, msgs);
            msgs = basicSetChild(newChild, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.UNARY_EXPRESSION__CHILD, newChild,
                    newChild));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case ExpressionsPackage.UNARY_EXPRESSION__OPERATORS:
            return ((InternalEList<?>) getOperators()).basicRemove(otherEnd, msgs);
        case ExpressionsPackage.UNARY_EXPRESSION__CHILD:
            return basicSetChild(null, msgs);
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
        case ExpressionsPackage.UNARY_EXPRESSION__OPERATORS:
            return getOperators();
        case ExpressionsPackage.UNARY_EXPRESSION__CHILD:
            return getChild();
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
        case ExpressionsPackage.UNARY_EXPRESSION__OPERATORS:
            getOperators().clear();
            getOperators().addAll((Collection<? extends UnaryOperator>) newValue);
            return;
        case ExpressionsPackage.UNARY_EXPRESSION__CHILD:
            setChild((UnaryExpressionChild) newValue);
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
        case ExpressionsPackage.UNARY_EXPRESSION__OPERATORS:
            getOperators().clear();
            return;
        case ExpressionsPackage.UNARY_EXPRESSION__CHILD:
            setChild((UnaryExpressionChild) null);
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
        case ExpressionsPackage.UNARY_EXPRESSION__OPERATORS:
            return operators != null && !operators.isEmpty();
        case ExpressionsPackage.UNARY_EXPRESSION__CHILD:
            return child != null;
        default:
            return super.eIsSet(featureID);
        }
    }

} //UnaryExpressionImpl
