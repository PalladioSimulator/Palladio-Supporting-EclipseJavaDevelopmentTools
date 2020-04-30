/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.statements;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Try Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.statements.TryBlock#getCatcheBlocks <em>Catche Blocks</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.statements.TryBlock#getFinallyBlock <em>Finally Block</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementsPackage#getTryBlock()
 * @model
 * @generated
 */
public interface TryBlock extends Statement, StatementListContainer {
    /**
     * Returns the value of the '<em><b>Catche Blocks</b></em>' containment reference list.
     * The list contents are of type {@link org.palladiosimulator.jdt.metamodel.javamodel.statements.CatchBlock}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Catche Blocks</em>' containment reference list.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementsPackage#getTryBlock_CatcheBlocks()
     * @model containment="true"
     * @generated
     */
    EList<CatchBlock> getCatcheBlocks();

    /**
     * Returns the value of the '<em><b>Finally Block</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Finally Block</em>' containment reference.
     * @see #setFinallyBlock(Block)
     * @see org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementsPackage#getTryBlock_FinallyBlock()
     * @model containment="true"
     * @generated
     */
    Block getFinallyBlock();

    /**
     * Sets the value of the '{@link org.palladiosimulator.jdt.metamodel.javamodel.statements.TryBlock#getFinallyBlock <em>Finally Block</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Finally Block</em>' containment reference.
     * @see #getFinallyBlock()
     * @generated
     */
    void setFinallyBlock(Block value);

} // TryBlock
