/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.expressions;

import org.palladiosimulator.jdt.metamodel.javamodel.operators.UnaryModificationOperator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Modification Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.UnaryModificationExpression#getChild <em>Child</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.UnaryModificationExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExpressionsPackage#getUnaryModificationExpression()
 * @model abstract="true"
 * @generated
 */
public interface UnaryModificationExpression extends UnaryExpressionChild {
    /**
     * Returns the value of the '<em><b>Child</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Child</em>' containment reference.
     * @see #setChild(UnaryModificationExpressionChild)
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExpressionsPackage#getUnaryModificationExpression_Child()
     * @model containment="true" required="true"
     * @generated
     */
    UnaryModificationExpressionChild getChild();

    /**
     * Sets the value of the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.UnaryModificationExpression#getChild <em>Child</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Child</em>' containment reference.
     * @see #getChild()
     * @generated
     */
    void setChild(UnaryModificationExpressionChild value);

    /**
     * Returns the value of the '<em><b>Operator</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operator</em>' containment reference.
     * @see #setOperator(UnaryModificationOperator)
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExpressionsPackage#getUnaryModificationExpression_Operator()
     * @model containment="true" required="true"
     * @generated
     */
    UnaryModificationOperator getOperator();

    /**
     * Sets the value of the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.UnaryModificationExpression#getOperator <em>Operator</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Operator</em>' containment reference.
     * @see #getOperator()
     * @generated
     */
    void setOperator(UnaryModificationOperator value);

} // UnaryModificationExpression
