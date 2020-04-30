/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.annotations;

import org.palladiosimulator.jdt.metamodel.javamodel.expressions.Expression;

import org.palladiosimulator.jdt.metamodel.javamodel.members.InterfaceMethod;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationAttribute#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationsPackage#getAnnotationAttribute()
 * @model
 * @generated
 */
public interface AnnotationAttribute extends InterfaceMethod {
    /**
     * Returns the value of the '<em><b>Default Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Default Value</em>' containment reference.
     * @see #setDefaultValue(Expression)
     * @see org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationsPackage#getAnnotationAttribute_DefaultValue()
     * @model containment="true" required="true"
     * @generated
     */
    Expression getDefaultValue();

    /**
     * Sets the value of the '{@link org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationAttribute#getDefaultValue <em>Default Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Default Value</em>' containment reference.
     * @see #getDefaultValue()
     * @generated
     */
    void setDefaultValue(Expression value);

} // AnnotationAttribute
