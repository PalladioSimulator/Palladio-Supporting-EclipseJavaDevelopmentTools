/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.statements;

import org.palladiosimulator.jdt.metamodel.javamodel.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Throw</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.statements.Throw#getThrowable <em>Throwable</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementsPackage#getThrow()
 * @model
 * @generated
 */
public interface Throw extends Statement {
    /**
     * Returns the value of the '<em><b>Throwable</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Throwable</em>' containment reference.
     * @see #setThrowable(Expression)
     * @see org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementsPackage#getThrow_Throwable()
     * @model containment="true" required="true"
     * @generated
     */
    Expression getThrowable();

    /**
     * Sets the value of the '{@link org.palladiosimulator.jdt.metamodel.javamodel.statements.Throw#getThrowable <em>Throwable</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Throwable</em>' containment reference.
     * @see #getThrowable()
     * @generated
     */
    void setThrowable(Expression value);

} // Throw
