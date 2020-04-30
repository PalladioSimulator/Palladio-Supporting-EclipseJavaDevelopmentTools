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
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.RelationExpression;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.RelationExpressionChild;

import org.palladiosimulator.jdt.metamodel.javamodel.operators.RelationOperator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.RelationExpressionImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.RelationExpressionImpl#getRelationOperators <em>Relation Operators</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationExpressionImpl extends InstanceOfExpressionChildImpl implements RelationExpression {
    /**
     * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChildren()
     * @generated
     * @ordered
     */
    protected EList<RelationExpressionChild> children;

    /**
     * The cached value of the '{@link #getRelationOperators() <em>Relation Operators</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRelationOperators()
     * @generated
     * @ordered
     */
    protected EList<RelationOperator> relationOperators;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RelationExpressionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExpressionsPackage.Literals.RELATION_EXPRESSION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<RelationExpressionChild> getChildren() {
        if (children == null) {
            children = new EObjectContainmentEList<RelationExpressionChild>(RelationExpressionChild.class, this,
                    ExpressionsPackage.RELATION_EXPRESSION__CHILDREN);
        }
        return children;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<RelationOperator> getRelationOperators() {
        if (relationOperators == null) {
            relationOperators = new EObjectContainmentEList<RelationOperator>(RelationOperator.class, this,
                    ExpressionsPackage.RELATION_EXPRESSION__RELATION_OPERATORS);
        }
        return relationOperators;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case ExpressionsPackage.RELATION_EXPRESSION__CHILDREN:
            return ((InternalEList<?>) getChildren()).basicRemove(otherEnd, msgs);
        case ExpressionsPackage.RELATION_EXPRESSION__RELATION_OPERATORS:
            return ((InternalEList<?>) getRelationOperators()).basicRemove(otherEnd, msgs);
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
        case ExpressionsPackage.RELATION_EXPRESSION__CHILDREN:
            return getChildren();
        case ExpressionsPackage.RELATION_EXPRESSION__RELATION_OPERATORS:
            return getRelationOperators();
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
        case ExpressionsPackage.RELATION_EXPRESSION__CHILDREN:
            getChildren().clear();
            getChildren().addAll((Collection<? extends RelationExpressionChild>) newValue);
            return;
        case ExpressionsPackage.RELATION_EXPRESSION__RELATION_OPERATORS:
            getRelationOperators().clear();
            getRelationOperators().addAll((Collection<? extends RelationOperator>) newValue);
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
        case ExpressionsPackage.RELATION_EXPRESSION__CHILDREN:
            getChildren().clear();
            return;
        case ExpressionsPackage.RELATION_EXPRESSION__RELATION_OPERATORS:
            getRelationOperators().clear();
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
        case ExpressionsPackage.RELATION_EXPRESSION__CHILDREN:
            return children != null && !children.isEmpty();
        case ExpressionsPackage.RELATION_EXPRESSION__RELATION_OPERATORS:
            return relationOperators != null && !relationOperators.isEmpty();
        default:
            return super.eIsSet(featureID);
        }
    }

} //RelationExpressionImpl
