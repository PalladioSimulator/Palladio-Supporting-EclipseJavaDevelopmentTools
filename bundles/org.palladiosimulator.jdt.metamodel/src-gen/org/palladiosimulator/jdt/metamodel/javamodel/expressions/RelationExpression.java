/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.expressions;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.jdt.metamodel.javamodel.operators.RelationOperator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.RelationExpression#getChildren <em>Children</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.RelationExpression#getRelationOperators <em>Relation Operators</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExpressionsPackage#getRelationExpression()
 * @model
 * @generated
 */
public interface RelationExpression extends InstanceOfExpressionChild {
    /**
     * Returns the value of the '<em><b>Children</b></em>' containment reference list.
     * The list contents are of type {@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.RelationExpressionChild}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Children</em>' containment reference list.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExpressionsPackage#getRelationExpression_Children()
     * @model containment="true" required="true"
     * @generated
     */
    EList<RelationExpressionChild> getChildren();

    /**
     * Returns the value of the '<em><b>Relation Operators</b></em>' containment reference list.
     * The list contents are of type {@link org.palladiosimulator.jdt.metamodel.javamodel.operators.RelationOperator}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Relation Operators</em>' containment reference list.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExpressionsPackage#getRelationExpression_RelationOperators()
     * @model containment="true" required="true"
     * @generated
     */
    EList<RelationOperator> getRelationOperators();

} // RelationExpression
