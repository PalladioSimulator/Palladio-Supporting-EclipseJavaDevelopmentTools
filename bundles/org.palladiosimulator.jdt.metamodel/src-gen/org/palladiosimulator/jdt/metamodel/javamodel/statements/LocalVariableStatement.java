/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.statements;

import org.palladiosimulator.jdt.metamodel.javamodel.variables.LocalVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Variable Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.statements.LocalVariableStatement#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementsPackage#getLocalVariableStatement()
 * @model
 * @generated
 */
public interface LocalVariableStatement extends Statement {
    /**
     * Returns the value of the '<em><b>Variable</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Variable</em>' containment reference.
     * @see #setVariable(LocalVariable)
     * @see org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementsPackage#getLocalVariableStatement_Variable()
     * @model containment="true" required="true"
     * @generated
     */
    LocalVariable getVariable();

    /**
     * Sets the value of the '{@link org.palladiosimulator.jdt.metamodel.javamodel.statements.LocalVariableStatement#getVariable <em>Variable</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Variable</em>' containment reference.
     * @see #getVariable()
     * @generated
     */
    void setVariable(LocalVariable value);

} // LocalVariableStatement
