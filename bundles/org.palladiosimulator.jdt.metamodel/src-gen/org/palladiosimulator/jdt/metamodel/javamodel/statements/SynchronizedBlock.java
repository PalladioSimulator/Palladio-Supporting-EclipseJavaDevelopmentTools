/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.statements;

import org.palladiosimulator.jdt.metamodel.javamodel.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Synchronized Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.statements.SynchronizedBlock#getLockProvider <em>Lock Provider</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementsPackage#getSynchronizedBlock()
 * @model
 * @generated
 */
public interface SynchronizedBlock extends Statement, StatementListContainer {
    /**
     * Returns the value of the '<em><b>Lock Provider</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Lock Provider</em>' containment reference.
     * @see #setLockProvider(Expression)
     * @see org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementsPackage#getSynchronizedBlock_LockProvider()
     * @model containment="true" required="true"
     * @generated
     */
    Expression getLockProvider();

    /**
     * Sets the value of the '{@link org.palladiosimulator.jdt.metamodel.javamodel.statements.SynchronizedBlock#getLockProvider <em>Lock Provider</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lock Provider</em>' containment reference.
     * @see #getLockProvider()
     * @generated
     */
    void setLockProvider(Expression value);

} // SynchronizedBlock
