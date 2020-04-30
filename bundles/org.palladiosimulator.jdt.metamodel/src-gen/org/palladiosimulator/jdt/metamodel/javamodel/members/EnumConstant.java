/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.members;

import org.palladiosimulator.jdt.metamodel.javamodel.annotations.Annotable;

import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.AnonymousClass;

import org.palladiosimulator.jdt.metamodel.javamodel.references.Argumentable;
import org.palladiosimulator.jdt.metamodel.javamodel.references.ReferenceableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.members.EnumConstant#getAnonymousClass <em>Anonymous Class</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.members.MembersPackage#getEnumConstant()
 * @model
 * @generated
 */
public interface EnumConstant extends ReferenceableElement, Argumentable, Annotable {
    /**
     * Returns the value of the '<em><b>Anonymous Class</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Anonymous Class</em>' containment reference.
     * @see #setAnonymousClass(AnonymousClass)
     * @see org.palladiosimulator.jdt.metamodel.javamodel.members.MembersPackage#getEnumConstant_AnonymousClass()
     * @model containment="true"
     * @generated
     */
    AnonymousClass getAnonymousClass();

    /**
     * Sets the value of the '{@link org.palladiosimulator.jdt.metamodel.javamodel.members.EnumConstant#getAnonymousClass <em>Anonymous Class</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Anonymous Class</em>' containment reference.
     * @see #getAnonymousClass()
     * @generated
     */
    void setAnonymousClass(AnonymousClass value);

} // EnumConstant
