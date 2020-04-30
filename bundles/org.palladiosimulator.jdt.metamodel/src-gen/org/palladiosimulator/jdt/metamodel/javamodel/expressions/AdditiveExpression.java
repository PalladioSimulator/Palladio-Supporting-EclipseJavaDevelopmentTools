/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.expressions;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.jdt.metamodel.javamodel.operators.AdditiveOperator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Additive Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.AdditiveExpression#getChildren <em>Children</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.AdditiveExpression#getAdditiveOperators <em>Additive Operators</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExpressionsPackage#getAdditiveExpression()
 * @model
 * @generated
 */
public interface AdditiveExpression extends ShiftExpressionChild {
    /**
     * Returns the value of the '<em><b>Children</b></em>' containment reference list.
     * The list contents are of type {@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.AdditiveExpressionChild}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Children</em>' containment reference list.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExpressionsPackage#getAdditiveExpression_Children()
     * @model containment="true" required="true"
     * @generated
     */
    EList<AdditiveExpressionChild> getChildren();

    /**
     * Returns the value of the '<em><b>Additive Operators</b></em>' containment reference list.
     * The list contents are of type {@link org.palladiosimulator.jdt.metamodel.javamodel.operators.AdditiveOperator}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Additive Operators</em>' containment reference list.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExpressionsPackage#getAdditiveExpression_AdditiveOperators()
     * @model containment="true" required="true"
     * @generated
     */
    EList<AdditiveOperator> getAdditiveOperators();

} // AdditiveExpression
