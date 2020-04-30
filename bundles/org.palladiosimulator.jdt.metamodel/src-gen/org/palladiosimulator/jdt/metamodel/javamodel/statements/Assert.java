/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.statements;

import org.palladiosimulator.jdt.metamodel.javamodel.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assert</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.statements.Assert#getErrorMessage <em>Error Message</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementsPackage#getAssert()
 * @model
 * @generated
 */
public interface Assert extends Statement, Conditional {
    /**
     * Returns the value of the '<em><b>Error Message</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Error Message</em>' containment reference.
     * @see #setErrorMessage(Expression)
     * @see org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementsPackage#getAssert_ErrorMessage()
     * @model containment="true"
     * @generated
     */
    Expression getErrorMessage();

    /**
     * Sets the value of the '{@link org.palladiosimulator.jdt.metamodel.javamodel.statements.Assert#getErrorMessage <em>Error Message</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Error Message</em>' containment reference.
     * @see #getErrorMessage()
     * @generated
     */
    void setErrorMessage(Expression value);

} // Assert
