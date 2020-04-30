/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.generics;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.jdt.metamodel.javamodel.types.TypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extends Type Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.generics.ExtendsTypeArgument#getExtendTypes <em>Extend Types</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.generics.GenericsPackage#getExtendsTypeArgument()
 * @model
 * @generated
 */
public interface ExtendsTypeArgument extends TypeArgument {
    /**
     * Returns the value of the '<em><b>Extend Types</b></em>' containment reference list.
     * The list contents are of type {@link org.palladiosimulator.jdt.metamodel.javamodel.types.TypeReference}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Extend Types</em>' containment reference list.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.generics.GenericsPackage#getExtendsTypeArgument_ExtendTypes()
     * @model containment="true" required="true"
     * @generated
     */
    EList<TypeReference> getExtendTypes();

} // ExtendsTypeArgument
