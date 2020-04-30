/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.types;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typed Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.types.TypedElement#getTypeReference <em>Type Reference</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.types.TypesPackage#getTypedElement()
 * @model abstract="true"
 * @generated
 */
public interface TypedElement extends Commentable {
    /**
     * Returns the value of the '<em><b>Type Reference</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type Reference</em>' containment reference.
     * @see #setTypeReference(TypeReference)
     * @see org.palladiosimulator.jdt.metamodel.javamodel.types.TypesPackage#getTypedElement_TypeReference()
     * @model containment="true" required="true"
     * @generated
     */
    TypeReference getTypeReference();

    /**
     * Sets the value of the '{@link org.palladiosimulator.jdt.metamodel.javamodel.types.TypedElement#getTypeReference <em>Type Reference</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type Reference</em>' containment reference.
     * @see #getTypeReference()
     * @generated
     */
    void setTypeReference(TypeReference value);

} // TypedElement
