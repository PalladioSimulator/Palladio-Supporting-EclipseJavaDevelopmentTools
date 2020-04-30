/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.generics;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Parametrizable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.generics.TypeParametrizable#getTypeParameters <em>Type Parameters</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.generics.GenericsPackage#getTypeParametrizable()
 * @model abstract="true"
 * @generated
 */
public interface TypeParametrizable extends Commentable {
    /**
     * Returns the value of the '<em><b>Type Parameters</b></em>' containment reference list.
     * The list contents are of type {@link org.palladiosimulator.jdt.metamodel.javamodel.generics.TypeParameter}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type Parameters</em>' containment reference list.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.generics.GenericsPackage#getTypeParametrizable_TypeParameters()
     * @model containment="true"
     * @generated
     */
    EList<TypeParameter> getTypeParameters();

} // TypeParametrizable
