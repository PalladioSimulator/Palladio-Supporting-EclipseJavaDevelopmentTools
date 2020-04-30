/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.arrays;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable;

import org.palladiosimulator.jdt.metamodel.javamodel.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArraySelector#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArraysPackage#getArraySelector()
 * @model
 * @generated
 */
public interface ArraySelector extends Commentable {
    /**
     * Returns the value of the '<em><b>Position</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Position</em>' containment reference.
     * @see #setPosition(Expression)
     * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArraysPackage#getArraySelector_Position()
     * @model containment="true"
     * @generated
     */
    Expression getPosition();

    /**
     * Sets the value of the '{@link org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArraySelector#getPosition <em>Position</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Position</em>' containment reference.
     * @see #getPosition()
     * @generated
     */
    void setPosition(Expression value);

} // ArraySelector
