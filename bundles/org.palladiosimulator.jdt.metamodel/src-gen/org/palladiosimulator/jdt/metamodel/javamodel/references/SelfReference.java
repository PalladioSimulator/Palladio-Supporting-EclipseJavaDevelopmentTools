/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.references;

import org.palladiosimulator.jdt.metamodel.javamodel.literals.Self;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Self Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.references.SelfReference#getSelf <em>Self</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.references.ReferencesPackage#getSelfReference()
 * @model
 * @generated
 */
public interface SelfReference extends Reference {
    /**
     * Returns the value of the '<em><b>Self</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Self</em>' containment reference.
     * @see #setSelf(Self)
     * @see org.palladiosimulator.jdt.metamodel.javamodel.references.ReferencesPackage#getSelfReference_Self()
     * @model containment="true" required="true"
     * @generated
     */
    Self getSelf();

    /**
     * Sets the value of the '{@link org.palladiosimulator.jdt.metamodel.javamodel.references.SelfReference#getSelf <em>Self</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Self</em>' containment reference.
     * @see #getSelf()
     * @generated
     */
    void setSelf(Self value);

} // SelfReference
