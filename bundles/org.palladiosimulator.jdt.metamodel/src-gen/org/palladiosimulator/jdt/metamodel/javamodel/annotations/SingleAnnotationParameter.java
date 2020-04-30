/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.annotations;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Annotation Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.annotations.SingleAnnotationParameter#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationsPackage#getSingleAnnotationParameter()
 * @model
 * @generated
 */
public interface SingleAnnotationParameter extends AnnotationParameter {
    /**
     * Returns the value of the '<em><b>Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' containment reference.
     * @see #setValue(AnnotationValue)
     * @see org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationsPackage#getSingleAnnotationParameter_Value()
     * @model containment="true" required="true"
     * @generated
     */
    AnnotationValue getValue();

    /**
     * Sets the value of the '{@link org.palladiosimulator.jdt.metamodel.javamodel.annotations.SingleAnnotationParameter#getValue <em>Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' containment reference.
     * @see #getValue()
     * @generated
     */
    void setValue(AnnotationValue value);

} // SingleAnnotationParameter
