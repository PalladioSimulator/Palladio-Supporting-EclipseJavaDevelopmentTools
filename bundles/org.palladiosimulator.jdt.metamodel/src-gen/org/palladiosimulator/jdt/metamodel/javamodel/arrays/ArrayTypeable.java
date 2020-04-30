/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.arrays;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Typeable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayTypeable#getArrayDimensionsBefore <em>Array Dimensions Before</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayTypeable#getArrayDimensionsAfter <em>Array Dimensions After</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArraysPackage#getArrayTypeable()
 * @model abstract="true"
 * @generated
 */
public interface ArrayTypeable extends Commentable {
    /**
     * Returns the value of the '<em><b>Array Dimensions Before</b></em>' containment reference list.
     * The list contents are of type {@link org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayDimension}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Array Dimensions Before</em>' containment reference list.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArraysPackage#getArrayTypeable_ArrayDimensionsBefore()
     * @model containment="true"
     * @generated
     */
    EList<ArrayDimension> getArrayDimensionsBefore();

    /**
     * Returns the value of the '<em><b>Array Dimensions After</b></em>' containment reference list.
     * The list contents are of type {@link org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayDimension}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Array Dimensions After</em>' containment reference list.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArraysPackage#getArrayTypeable_ArrayDimensionsAfter()
     * @model containment="true"
     * @generated
     */
    EList<ArrayDimension> getArrayDimensionsAfter();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation"
     * @generated
     */
    long getArrayDimension();

} // ArrayTypeable
