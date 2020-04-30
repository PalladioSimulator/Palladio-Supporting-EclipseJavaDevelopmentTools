/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.classifiers;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable;

import org.palladiosimulator.jdt.metamodel.javamodel.types.TypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implementor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Implementor#getImplements <em>Implements</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.ClassifiersPackage#getImplementor()
 * @model abstract="true"
 * @generated
 */
public interface Implementor extends Commentable {
    /**
     * Returns the value of the '<em><b>Implements</b></em>' containment reference list.
     * The list contents are of type {@link org.palladiosimulator.jdt.metamodel.javamodel.types.TypeReference}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Implements</em>' containment reference list.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.ClassifiersPackage#getImplementor_Implements()
     * @model containment="true"
     * @generated
     */
    EList<TypeReference> getImplements();

} // Implementor
