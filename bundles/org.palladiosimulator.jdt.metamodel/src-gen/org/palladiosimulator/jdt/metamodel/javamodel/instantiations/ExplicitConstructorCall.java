/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.instantiations;

import org.palladiosimulator.jdt.metamodel.javamodel.literals.Self;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Explicit Constructor Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.instantiations.ExplicitConstructorCall#getCallTarget <em>Call Target</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.instantiations.InstantiationsPackage#getExplicitConstructorCall()
 * @model
 * @generated
 */
public interface ExplicitConstructorCall extends Instantiation {
    /**
     * Returns the value of the '<em><b>Call Target</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Call Target</em>' containment reference.
     * @see #setCallTarget(Self)
     * @see org.palladiosimulator.jdt.metamodel.javamodel.instantiations.InstantiationsPackage#getExplicitConstructorCall_CallTarget()
     * @model containment="true" required="true"
     * @generated
     */
    Self getCallTarget();

    /**
     * Sets the value of the '{@link org.palladiosimulator.jdt.metamodel.javamodel.instantiations.ExplicitConstructorCall#getCallTarget <em>Call Target</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Call Target</em>' containment reference.
     * @see #getCallTarget()
     * @generated
     */
    void setCallTarget(Self value);

} // ExplicitConstructorCall
