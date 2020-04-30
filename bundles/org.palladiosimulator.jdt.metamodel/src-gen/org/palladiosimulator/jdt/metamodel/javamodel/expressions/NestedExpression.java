/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.expressions;

import org.palladiosimulator.jdt.metamodel.javamodel.references.Reference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nested Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.NestedExpression#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExpressionsPackage#getNestedExpression()
 * @model
 * @generated
 */
public interface NestedExpression extends Reference {
    /**
     * Returns the value of the '<em><b>Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Expression</em>' containment reference.
     * @see #setExpression(Expression)
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExpressionsPackage#getNestedExpression_Expression()
     * @model containment="true" required="true"
     * @generated
     */
    Expression getExpression();

    /**
     * Sets the value of the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.NestedExpression#getExpression <em>Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Expression</em>' containment reference.
     * @see #getExpression()
     * @generated
     */
    void setExpression(Expression value);

} // NestedExpression
