/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.expressions;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.jdt.metamodel.javamodel.operators.EqualityOperator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equality Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.EqualityExpression#getEqualityOperators <em>Equality Operators</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.EqualityExpression#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExpressionsPackage#getEqualityExpression()
 * @model
 * @generated
 */
public interface EqualityExpression extends AndExpressionChild {
    /**
     * Returns the value of the '<em><b>Equality Operators</b></em>' containment reference list.
     * The list contents are of type {@link org.palladiosimulator.jdt.metamodel.javamodel.operators.EqualityOperator}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Equality Operators</em>' containment reference list.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExpressionsPackage#getEqualityExpression_EqualityOperators()
     * @model containment="true" required="true"
     * @generated
     */
    EList<EqualityOperator> getEqualityOperators();

    /**
     * Returns the value of the '<em><b>Children</b></em>' containment reference list.
     * The list contents are of type {@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.EqualityExpressionChild}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Children</em>' containment reference list.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExpressionsPackage#getEqualityExpression_Children()
     * @model containment="true" required="true"
     * @generated
     */
    EList<EqualityExpressionChild> getChildren();

} // EqualityExpression
