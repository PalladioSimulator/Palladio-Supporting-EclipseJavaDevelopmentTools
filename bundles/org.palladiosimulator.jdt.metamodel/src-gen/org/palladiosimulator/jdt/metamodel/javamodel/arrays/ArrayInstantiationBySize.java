/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.arrays;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.jdt.metamodel.javamodel.expressions.Expression;

import org.palladiosimulator.jdt.metamodel.javamodel.types.TypedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Instantiation By Size</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayInstantiationBySize#getSizes <em>Sizes</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArraysPackage#getArrayInstantiationBySize()
 * @model
 * @generated
 */
public interface ArrayInstantiationBySize extends ArrayInstantiation, TypedElement, ArrayTypeable {
    /**
     * Returns the value of the '<em><b>Sizes</b></em>' containment reference list.
     * The list contents are of type {@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.Expression}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sizes</em>' containment reference list.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArraysPackage#getArrayInstantiationBySize_Sizes()
     * @model containment="true" required="true"
     * @generated
     */
    EList<Expression> getSizes();

} // ArrayInstantiationBySize
