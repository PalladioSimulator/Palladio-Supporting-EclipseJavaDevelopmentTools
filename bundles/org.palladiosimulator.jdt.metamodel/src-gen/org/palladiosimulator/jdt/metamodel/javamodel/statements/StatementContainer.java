/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.statements;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementContainer#getStatement <em>Statement</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementsPackage#getStatementContainer()
 * @model abstract="true"
 * @generated
 */
public interface StatementContainer extends Commentable {
    /**
     * Returns the value of the '<em><b>Statement</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Statement</em>' containment reference.
     * @see #setStatement(Statement)
     * @see org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementsPackage#getStatementContainer_Statement()
     * @model containment="true" required="true"
     * @generated
     */
    Statement getStatement();

    /**
     * Sets the value of the '{@link org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementContainer#getStatement <em>Statement</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Statement</em>' containment reference.
     * @see #getStatement()
     * @generated
     */
    void setStatement(Statement value);

} // StatementContainer
