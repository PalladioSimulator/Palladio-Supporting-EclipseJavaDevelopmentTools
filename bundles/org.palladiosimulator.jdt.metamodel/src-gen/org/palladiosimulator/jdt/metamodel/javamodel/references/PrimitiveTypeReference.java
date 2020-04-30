/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.references;

import org.palladiosimulator.jdt.metamodel.javamodel.types.PrimitiveType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Type Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.references.PrimitiveTypeReference#getPrimitiveType <em>Primitive Type</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.references.ReferencesPackage#getPrimitiveTypeReference()
 * @model
 * @generated
 */
public interface PrimitiveTypeReference extends Reference {
    /**
     * Returns the value of the '<em><b>Primitive Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Primitive Type</em>' containment reference.
     * @see #setPrimitiveType(PrimitiveType)
     * @see org.palladiosimulator.jdt.metamodel.javamodel.references.ReferencesPackage#getPrimitiveTypeReference_PrimitiveType()
     * @model containment="true" required="true"
     * @generated
     */
    PrimitiveType getPrimitiveType();

    /**
     * Sets the value of the '{@link org.palladiosimulator.jdt.metamodel.javamodel.references.PrimitiveTypeReference#getPrimitiveType <em>Primitive Type</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Primitive Type</em>' containment reference.
     * @see #getPrimitiveType()
     * @generated
     */
    void setPrimitiveType(PrimitiveType value);

} // PrimitiveTypeReference
