/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.annotations;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.annotations.Annotable#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationsPackage#getAnnotable()
 * @model abstract="true"
 * @generated
 */
public interface Annotable extends Commentable {
    /**
     * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
     * The list contents are of type {@link org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationInstance}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Annotations</em>' containment reference list.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationsPackage#getAnnotable_Annotations()
     * @model containment="true"
     * @generated
     */
    EList<AnnotationInstance> getAnnotations();

} // Annotable
