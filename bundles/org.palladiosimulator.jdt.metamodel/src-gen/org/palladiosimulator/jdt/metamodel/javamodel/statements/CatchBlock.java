/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.statements;

import org.palladiosimulator.jdt.metamodel.javamodel.parameters.OrdinaryParameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catch Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.statements.CatchBlock#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementsPackage#getCatchBlock()
 * @model
 * @generated
 */
public interface CatchBlock extends StatementListContainer {
    /**
     * Returns the value of the '<em><b>Parameter</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parameter</em>' containment reference.
     * @see #setParameter(OrdinaryParameter)
     * @see org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementsPackage#getCatchBlock_Parameter()
     * @model containment="true" required="true"
     * @generated
     */
    OrdinaryParameter getParameter();

    /**
     * Sets the value of the '{@link org.palladiosimulator.jdt.metamodel.javamodel.statements.CatchBlock#getParameter <em>Parameter</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parameter</em>' containment reference.
     * @see #getParameter()
     * @generated
     */
    void setParameter(OrdinaryParameter value);

} // CatchBlock
