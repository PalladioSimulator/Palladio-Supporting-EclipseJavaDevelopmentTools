/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.annotations;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Parameter List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationParameterList#getSettings <em>Settings</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationsPackage#getAnnotationParameterList()
 * @model
 * @generated
 */
public interface AnnotationParameterList extends AnnotationParameter {
    /**
     * Returns the value of the '<em><b>Settings</b></em>' containment reference list.
     * The list contents are of type {@link org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationAttributeSetting}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Settings</em>' containment reference list.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationsPackage#getAnnotationParameterList_Settings()
     * @model containment="true"
     * @generated
     */
    EList<AnnotationAttributeSetting> getSettings();

} // AnnotationParameterList
