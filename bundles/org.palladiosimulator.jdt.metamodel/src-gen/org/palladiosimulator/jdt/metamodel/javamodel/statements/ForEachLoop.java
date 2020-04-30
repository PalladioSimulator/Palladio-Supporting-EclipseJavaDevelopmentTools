/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.statements;

import org.palladiosimulator.jdt.metamodel.javamodel.expressions.Expression;

import org.palladiosimulator.jdt.metamodel.javamodel.parameters.OrdinaryParameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Each Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.statements.ForEachLoop#getNext <em>Next</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.statements.ForEachLoop#getCollection <em>Collection</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementsPackage#getForEachLoop()
 * @model
 * @generated
 */
public interface ForEachLoop extends Statement, StatementContainer {
    /**
     * Returns the value of the '<em><b>Next</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Next</em>' containment reference.
     * @see #setNext(OrdinaryParameter)
     * @see org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementsPackage#getForEachLoop_Next()
     * @model containment="true" required="true"
     * @generated
     */
    OrdinaryParameter getNext();

    /**
     * Sets the value of the '{@link org.palladiosimulator.jdt.metamodel.javamodel.statements.ForEachLoop#getNext <em>Next</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Next</em>' containment reference.
     * @see #getNext()
     * @generated
     */
    void setNext(OrdinaryParameter value);

    /**
     * Returns the value of the '<em><b>Collection</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Collection</em>' containment reference.
     * @see #setCollection(Expression)
     * @see org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementsPackage#getForEachLoop_Collection()
     * @model containment="true" required="true"
     * @generated
     */
    Expression getCollection();

    /**
     * Sets the value of the '{@link org.palladiosimulator.jdt.metamodel.javamodel.statements.ForEachLoop#getCollection <em>Collection</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Collection</em>' containment reference.
     * @see #getCollection()
     * @generated
     */
    void setCollection(Expression value);

} // ForEachLoop
