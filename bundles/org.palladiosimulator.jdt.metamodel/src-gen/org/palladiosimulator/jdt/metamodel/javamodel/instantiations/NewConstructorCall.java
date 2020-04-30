/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.instantiations;

import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.AnonymousClass;

import org.palladiosimulator.jdt.metamodel.javamodel.generics.CallTypeArgumentable;

import org.palladiosimulator.jdt.metamodel.javamodel.types.TypedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>New Constructor Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.instantiations.NewConstructorCall#getAnonymousClass <em>Anonymous Class</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.instantiations.InstantiationsPackage#getNewConstructorCall()
 * @model
 * @generated
 */
public interface NewConstructorCall extends TypedElement, Instantiation, CallTypeArgumentable {
    /**
     * Returns the value of the '<em><b>Anonymous Class</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Anonymous Class</em>' containment reference.
     * @see #setAnonymousClass(AnonymousClass)
     * @see org.palladiosimulator.jdt.metamodel.javamodel.instantiations.InstantiationsPackage#getNewConstructorCall_AnonymousClass()
     * @model containment="true"
     * @generated
     */
    AnonymousClass getAnonymousClass();

    /**
     * Sets the value of the '{@link org.palladiosimulator.jdt.metamodel.javamodel.instantiations.NewConstructorCall#getAnonymousClass <em>Anonymous Class</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Anonymous Class</em>' containment reference.
     * @see #getAnonymousClass()
     * @generated
     */
    void setAnonymousClass(AnonymousClass value);

} // NewConstructorCall
