/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.expressions;

import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayTypeable;

import org.palladiosimulator.jdt.metamodel.javamodel.types.TypedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Of Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.InstanceOfExpression#getChild <em>Child</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExpressionsPackage#getInstanceOfExpression()
 * @model
 * @generated
 */
public interface InstanceOfExpression extends ArrayTypeable, TypedElement, EqualityExpressionChild {
    /**
     * Returns the value of the '<em><b>Child</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Child</em>' containment reference.
     * @see #setChild(InstanceOfExpressionChild)
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExpressionsPackage#getInstanceOfExpression_Child()
     * @model containment="true" required="true"
     * @generated
     */
    InstanceOfExpressionChild getChild();

    /**
     * Sets the value of the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.InstanceOfExpression#getChild <em>Child</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Child</em>' containment reference.
     * @see #getChild()
     * @generated
     */
    void setChild(InstanceOfExpressionChild value);

} // InstanceOfExpression
