/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.palladiosimulator.jdt.metamodel.javamodel.expressions.AdditiveExpression;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.AdditiveExpressionChild;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExpressionsPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.operators.AdditiveOperator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Additive Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.AdditiveExpressionImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.AdditiveExpressionImpl#getAdditiveOperators <em>Additive Operators</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdditiveExpressionImpl extends ShiftExpressionChildImpl implements AdditiveExpression {
    /**
     * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChildren()
     * @generated
     * @ordered
     */
    protected EList<AdditiveExpressionChild> children;

    /**
     * The cached value of the '{@link #getAdditiveOperators() <em>Additive Operators</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAdditiveOperators()
     * @generated
     * @ordered
     */
    protected EList<AdditiveOperator> additiveOperators;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AdditiveExpressionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExpressionsPackage.Literals.ADDITIVE_EXPRESSION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<AdditiveExpressionChild> getChildren() {
        if (children == null) {
            children = new EObjectContainmentEList<AdditiveExpressionChild>(AdditiveExpressionChild.class, this,
                    ExpressionsPackage.ADDITIVE_EXPRESSION__CHILDREN);
        }
        return children;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<AdditiveOperator> getAdditiveOperators() {
        if (additiveOperators == null) {
            additiveOperators = new EObjectContainmentEList<AdditiveOperator>(AdditiveOperator.class, this,
                    ExpressionsPackage.ADDITIVE_EXPRESSION__ADDITIVE_OPERATORS);
        }
        return additiveOperators;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case ExpressionsPackage.ADDITIVE_EXPRESSION__CHILDREN:
            return ((InternalEList<?>) getChildren()).basicRemove(otherEnd, msgs);
        case ExpressionsPackage.ADDITIVE_EXPRESSION__ADDITIVE_OPERATORS:
            return ((InternalEList<?>) getAdditiveOperators()).basicRemove(otherEnd, msgs);
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
        case ExpressionsPackage.ADDITIVE_EXPRESSION__CHILDREN:
            return getChildren();
        case ExpressionsPackage.ADDITIVE_EXPRESSION__ADDITIVE_OPERATORS:
            return getAdditiveOperators();
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
        case ExpressionsPackage.ADDITIVE_EXPRESSION__CHILDREN:
            getChildren().clear();
            getChildren().addAll((Collection<? extends AdditiveExpressionChild>) newValue);
            return;
        case ExpressionsPackage.ADDITIVE_EXPRESSION__ADDITIVE_OPERATORS:
            getAdditiveOperators().clear();
            getAdditiveOperators().addAll((Collection<? extends AdditiveOperator>) newValue);
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
        case ExpressionsPackage.ADDITIVE_EXPRESSION__CHILDREN:
            getChildren().clear();
            return;
        case ExpressionsPackage.ADDITIVE_EXPRESSION__ADDITIVE_OPERATORS:
            getAdditiveOperators().clear();
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
        case ExpressionsPackage.ADDITIVE_EXPRESSION__CHILDREN:
            return children != null && !children.isEmpty();
        case ExpressionsPackage.ADDITIVE_EXPRESSION__ADDITIVE_OPERATORS:
            return additiveOperators != null && !additiveOperators.isEmpty();
        default:
            return super.eIsSet(featureID);
        }
    }

} //AdditiveExpressionImpl
