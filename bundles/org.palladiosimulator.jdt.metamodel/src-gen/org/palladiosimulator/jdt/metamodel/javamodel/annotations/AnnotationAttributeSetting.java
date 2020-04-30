/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.annotations;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable;

import org.palladiosimulator.jdt.metamodel.javamodel.members.InterfaceMethod;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Attribute Setting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationAttributeSetting#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationAttributeSetting#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationsPackage#getAnnotationAttributeSetting()
 * @model
 * @generated
 */
public interface AnnotationAttributeSetting extends Commentable {
    /**
     * Returns the value of the '<em><b>Attribute</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Attribute</em>' reference.
     * @see #setAttribute(InterfaceMethod)
     * @see org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationsPackage#getAnnotationAttributeSetting_Attribute()
     * @model required="true"
     * @generated
     */
    InterfaceMethod getAttribute();

    /**
     * Sets the value of the '{@link org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationAttributeSetting#getAttribute <em>Attribute</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Attribute</em>' reference.
     * @see #getAttribute()
     * @generated
     */
    void setAttribute(InterfaceMethod value);

    /**
     * Returns the value of the '<em><b>Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' containment reference.
     * @see #setValue(AnnotationValue)
     * @see org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationsPackage#getAnnotationAttributeSetting_Value()
     * @model containment="true" required="true"
     * @generated
     */
    AnnotationValue getValue();

    /**
     * Sets the value of the '{@link org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationAttributeSetting#getValue <em>Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' containment reference.
     * @see #getValue()
     * @generated
     */
    void setValue(AnnotationValue value);

} // AnnotationAttributeSetting
