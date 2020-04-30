/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.expressions;

import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayTypeable;

import org.palladiosimulator.jdt.metamodel.javamodel.types.TypedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cast Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.CastExpression#getChild <em>Child</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExpressionsPackage#getCastExpression()
 * @model
 * @generated
 */
public interface CastExpression extends TypedElement, ArrayTypeable, UnaryModificationExpressionChild {
    /**
     * Returns the value of the '<em><b>Child</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Child</em>' containment reference.
     * @see #setChild(MultiplicativeExpressionChild)
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExpressionsPackage#getCastExpression_Child()
     * @model containment="true" required="true"
     * @generated
     */
    MultiplicativeExpressionChild getChild();

    /**
     * Sets the value of the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.CastExpression#getChild <em>Child</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Child</em>' containment reference.
     * @see #getChild()
     * @generated
     */
    void setChild(MultiplicativeExpressionChild value);

} // CastExpression
