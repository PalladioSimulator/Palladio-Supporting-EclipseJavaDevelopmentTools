/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.variables;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.jdt.metamodel.javamodel.instantiations.Initializable;

import org.palladiosimulator.jdt.metamodel.javamodel.modifiers.AnnotableAndModifiable;

import org.palladiosimulator.jdt.metamodel.javamodel.statements.ForLoopInitializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.variables.LocalVariable#getAdditionalLocalVariables <em>Additional Local Variables</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.variables.VariablesPackage#getLocalVariable()
 * @model
 * @generated
 */
public interface LocalVariable extends Variable, Initializable, ForLoopInitializer, AnnotableAndModifiable {
    /**
     * Returns the value of the '<em><b>Additional Local Variables</b></em>' containment reference list.
     * The list contents are of type {@link org.palladiosimulator.jdt.metamodel.javamodel.variables.AdditionalLocalVariable}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Additional Local Variables</em>' containment reference list.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.variables.VariablesPackage#getLocalVariable_AdditionalLocalVariables()
     * @model containment="true"
     * @generated
     */
    EList<AdditionalLocalVariable> getAdditionalLocalVariables();

} // LocalVariable
