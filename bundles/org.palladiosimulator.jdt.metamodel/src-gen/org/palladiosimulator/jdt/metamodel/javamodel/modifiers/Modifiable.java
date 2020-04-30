/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.modifiers;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modifiable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.modifiers.Modifiable#getModifiers <em>Modifiers</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.modifiers.ModifiersPackage#getModifiable()
 * @model abstract="true"
 * @generated
 */
public interface Modifiable extends Commentable {
    /**
     * Returns the value of the '<em><b>Modifiers</b></em>' containment reference list.
     * The list contents are of type {@link org.palladiosimulator.jdt.metamodel.javamodel.modifiers.Modifier}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Modifiers</em>' containment reference list.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.modifiers.ModifiersPackage#getModifiable_Modifiers()
     * @model containment="true"
     * @generated
     */
    EList<Modifier> getModifiers();

} // Modifiable
