/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.expressions;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.ConditionalExpression#getChild <em>Child</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.ConditionalExpression#getExpressionIf <em>Expression If</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.ConditionalExpression#getExpressionElse <em>Expression Else</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExpressionsPackage#getConditionalExpression()
 * @model
 * @generated
 */
public interface ConditionalExpression extends AssignmentExpressionChild {
    /**
     * Returns the value of the '<em><b>Child</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Child</em>' containment reference.
     * @see #setChild(ConditionalExpressionChild)
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExpressionsPackage#getConditionalExpression_Child()
     * @model containment="true"
     * @generated
     */
    ConditionalExpressionChild getChild();

    /**
     * Sets the value of the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.ConditionalExpression#getChild <em>Child</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Child</em>' containment reference.
     * @see #getChild()
     * @generated
     */
    void setChild(ConditionalExpressionChild value);

    /**
     * Returns the value of the '<em><b>Expression If</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Expression If</em>' containment reference.
     * @see #setExpressionIf(Expression)
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExpressionsPackage#getConditionalExpression_ExpressionIf()
     * @model containment="true" required="true"
     * @generated
     */
    Expression getExpressionIf();

    /**
     * Sets the value of the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.ConditionalExpression#getExpressionIf <em>Expression If</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Expression If</em>' containment reference.
     * @see #getExpressionIf()
     * @generated
     */
    void setExpressionIf(Expression value);

    /**
     * Returns the value of the '<em><b>Expression Else</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Expression Else</em>' containment reference.
     * @see #setExpressionElse(AssignmentExpressionChild)
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExpressionsPackage#getConditionalExpression_ExpressionElse()
     * @model containment="true" required="true"
     * @generated
     */
    AssignmentExpressionChild getExpressionElse();

    /**
     * Sets the value of the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.ConditionalExpression#getExpressionElse <em>Expression Else</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Expression Else</em>' containment reference.
     * @see #getExpressionElse()
     * @generated
     */
    void setExpressionElse(AssignmentExpressionChild value);

} // ConditionalExpression
