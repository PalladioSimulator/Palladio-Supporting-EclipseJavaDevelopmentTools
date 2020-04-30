/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.statements;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.jdt.metamodel.javamodel.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.statements.Switch#getCases <em>Cases</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.statements.Switch#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementsPackage#getSwitch()
 * @model
 * @generated
 */
public interface Switch extends Statement {
    /**
     * Returns the value of the '<em><b>Cases</b></em>' containment reference list.
     * The list contents are of type {@link org.palladiosimulator.jdt.metamodel.javamodel.statements.SwitchCase}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cases</em>' containment reference list.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementsPackage#getSwitch_Cases()
     * @model containment="true"
     * @generated
     */
    EList<SwitchCase> getCases();

    /**
     * Returns the value of the '<em><b>Variable</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Variable</em>' containment reference.
     * @see #setVariable(Expression)
     * @see org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementsPackage#getSwitch_Variable()
     * @model containment="true" required="true"
     * @generated
     */
    Expression getVariable();

    /**
     * Sets the value of the '{@link org.palladiosimulator.jdt.metamodel.javamodel.statements.Switch#getVariable <em>Variable</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Variable</em>' containment reference.
     * @see #getVariable()
     * @generated
     */
    void setVariable(Expression value);

} // Switch
