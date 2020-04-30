/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.statements;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.jdt.metamodel.javamodel.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.statements.ForLoop#getInit <em>Init</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.statements.ForLoop#getUpdates <em>Updates</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementsPackage#getForLoop()
 * @model
 * @generated
 */
public interface ForLoop extends Statement, StatementContainer, Conditional {
    /**
     * Returns the value of the '<em><b>Init</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Init</em>' containment reference.
     * @see #setInit(ForLoopInitializer)
     * @see org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementsPackage#getForLoop_Init()
     * @model containment="true"
     * @generated
     */
    ForLoopInitializer getInit();

    /**
     * Sets the value of the '{@link org.palladiosimulator.jdt.metamodel.javamodel.statements.ForLoop#getInit <em>Init</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Init</em>' containment reference.
     * @see #getInit()
     * @generated
     */
    void setInit(ForLoopInitializer value);

    /**
     * Returns the value of the '<em><b>Updates</b></em>' containment reference list.
     * The list contents are of type {@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.Expression}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Updates</em>' containment reference list.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementsPackage#getForLoop_Updates()
     * @model containment="true"
     * @generated
     */
    EList<Expression> getUpdates();

} // ForLoop
