/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.members;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.jdt.metamodel.javamodel.instantiations.Initializable;

import org.palladiosimulator.jdt.metamodel.javamodel.modifiers.AnnotableAndModifiable;

import org.palladiosimulator.jdt.metamodel.javamodel.references.ReferenceableElement;

import org.palladiosimulator.jdt.metamodel.javamodel.variables.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.members.Field#getAdditionalFields <em>Additional Fields</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.members.MembersPackage#getField()
 * @model
 * @generated
 */
public interface Field extends Member, Initializable, Variable, ReferenceableElement, AnnotableAndModifiable {
    /**
     * Returns the value of the '<em><b>Additional Fields</b></em>' containment reference list.
     * The list contents are of type {@link org.palladiosimulator.jdt.metamodel.javamodel.members.AdditionalField}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Additional Fields</em>' containment reference list.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.members.MembersPackage#getField_AdditionalFields()
     * @model containment="true"
     * @generated
     */
    EList<AdditionalField> getAdditionalFields();

} // Field
