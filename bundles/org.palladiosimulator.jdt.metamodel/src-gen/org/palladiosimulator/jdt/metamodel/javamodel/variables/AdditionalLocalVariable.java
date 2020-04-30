/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.variables;

import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayTypeable;

import org.palladiosimulator.jdt.metamodel.javamodel.instantiations.Initializable;

import org.palladiosimulator.jdt.metamodel.javamodel.references.ReferenceableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Additional Local Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.variables.VariablesPackage#getAdditionalLocalVariable()
 * @model
 * @generated
 */
public interface AdditionalLocalVariable extends ReferenceableElement, ArrayTypeable, Initializable {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * <!-- end-model-doc -->
     * @model kind="operation"
     * @generated
     */
    long getArrayDimension();

} // AdditionalLocalVariable
