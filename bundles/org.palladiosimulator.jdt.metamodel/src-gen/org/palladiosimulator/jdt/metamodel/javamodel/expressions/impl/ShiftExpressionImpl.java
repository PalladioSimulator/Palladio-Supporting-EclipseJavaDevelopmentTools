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

import org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExpressionsPackage;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.ShiftExpression;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.ShiftExpressionChild;

import org.palladiosimulator.jdt.metamodel.javamodel.operators.ShiftOperator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shift Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ShiftExpressionImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ShiftExpressionImpl#getShiftOperators <em>Shift Operators</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShiftExpressionImpl extends RelationExpressionChildImpl implements ShiftExpression {
    /**
     * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChildren()
     * @generated
     * @ordered
     */
    protected EList<ShiftExpressionChild> children;

    /**
     * The cached value of the '{@link #getShiftOperators() <em>Shift Operators</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getShiftOperators()
     * @generated
     * @ordered
     */
    protected EList<ShiftOperator> shiftOperators;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ShiftExpressionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExpressionsPackage.Literals.SHIFT_EXPRESSION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<ShiftExpressionChild> getChildren() {
        if (children == null) {
            children = new EObjectContainmentEList<ShiftExpressionChild>(ShiftExpressionChild.class, this,
                    ExpressionsPackage.SHIFT_EXPRESSION__CHILDREN);
        }
        return children;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<ShiftOperator> getShiftOperators() {
        if (shiftOperators == null) {
            shiftOperators = new EObjectContainmentEList<ShiftOperator>(ShiftOperator.class, this,
                    ExpressionsPackage.SHIFT_EXPRESSION__SHIFT_OPERATORS);
        }
        return shiftOperators;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case ExpressionsPackage.SHIFT_EXPRESSION__CHILDREN:
            return ((InternalEList<?>) getChildren()).basicRemove(otherEnd, msgs);
        case ExpressionsPackage.SHIFT_EXPRESSION__SHIFT_OPERATORS:
            return ((InternalEList<?>) getShiftOperators()).basicRemove(otherEnd, msgs);
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
        case ExpressionsPackage.SHIFT_EXPRESSION__CHILDREN:
            return getChildren();
        case ExpressionsPackage.SHIFT_EXPRESSION__SHIFT_OPERATORS:
            return getShiftOperators();
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
        case ExpressionsPackage.SHIFT_EXPRESSION__CHILDREN:
            getChildren().clear();
            getChildren().addAll((Collection<? extends ShiftExpressionChild>) newValue);
            return;
        case ExpressionsPackage.SHIFT_EXPRESSION__SHIFT_OPERATORS:
            getShiftOperators().clear();
            getShiftOperators().addAll((Collection<? extends ShiftOperator>) newValue);
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
        case ExpressionsPackage.SHIFT_EXPRESSION__CHILDREN:
            getChildren().clear();
            return;
        case ExpressionsPackage.SHIFT_EXPRESSION__SHIFT_OPERATORS:
            getShiftOperators().clear();
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
        case ExpressionsPackage.SHIFT_EXPRESSION__CHILDREN:
            return children != null && !children.isEmpty();
        case ExpressionsPackage.SHIFT_EXPRESSION__SHIFT_OPERATORS:
            return shiftOperators != null && !shiftOperators.isEmpty();
        default:
            return super.eIsSet(featureID);
        }
    }

} //ShiftExpressionImpl
