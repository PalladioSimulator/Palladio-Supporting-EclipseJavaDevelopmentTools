/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.statements;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable;

import org.palladiosimulator.jdt.metamodel.javamodel.variables.LocalVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement List Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementListContainer#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementsPackage#getStatementListContainer()
 * @model abstract="true"
 * @generated
 */
public interface StatementListContainer extends Commentable {
    /**
     * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
     * The list contents are of type {@link org.palladiosimulator.jdt.metamodel.javamodel.statements.Statement}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Statements</em>' containment reference list.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementsPackage#getStatementListContainer_Statements()
     * @model containment="true"
     * @generated
     */
    EList<Statement> getStatements();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * <!-- end-model-doc -->
     * @model required="true" nameRequired="true"
     * @generated
     */
    LocalVariable getLocalVariable(String name);

} // StatementListContainer
