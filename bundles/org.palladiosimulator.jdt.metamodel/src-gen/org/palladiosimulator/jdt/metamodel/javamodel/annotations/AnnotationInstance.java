/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.annotations;

import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Classifier;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.NamespaceAwareElement;

import org.palladiosimulator.jdt.metamodel.javamodel.modifiers.AnnotationInstanceOrModifier;

import org.palladiosimulator.jdt.metamodel.javamodel.references.Reference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationInstance#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationInstance#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationsPackage#getAnnotationInstance()
 * @model
 * @generated
 */
public interface AnnotationInstance extends Reference, AnnotationInstanceOrModifier, NamespaceAwareElement {
    /**
     * Returns the value of the '<em><b>Annotation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Annotation</em>' reference.
     * @see #setAnnotation(Classifier)
     * @see org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationsPackage#getAnnotationInstance_Annotation()
     * @model required="true"
     * @generated
     */
    Classifier getAnnotation();

    /**
     * Sets the value of the '{@link org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationInstance#getAnnotation <em>Annotation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Annotation</em>' reference.
     * @see #getAnnotation()
     * @generated
     */
    void setAnnotation(Classifier value);

    /**
     * Returns the value of the '<em><b>Parameter</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parameter</em>' containment reference.
     * @see #setParameter(AnnotationParameter)
     * @see org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationsPackage#getAnnotationInstance_Parameter()
     * @model containment="true"
     * @generated
     */
    AnnotationParameter getParameter();

    /**
     * Sets the value of the '{@link org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationInstance#getParameter <em>Parameter</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parameter</em>' containment reference.
     * @see #getParameter()
     * @generated
     */
    void setParameter(AnnotationParameter value);

} // AnnotationInstance
