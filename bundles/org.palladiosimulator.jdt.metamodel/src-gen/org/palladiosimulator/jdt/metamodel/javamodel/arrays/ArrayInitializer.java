/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.arrays;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Initializer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayInitializer#getInitialValues <em>Initial Values</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArraysPackage#getArrayInitializer()
 * @model
 * @generated
 */
public interface ArrayInitializer extends ArrayInitializationValue, AnnotationValue {
    /**
     * Returns the value of the '<em><b>Initial Values</b></em>' containment reference list.
     * The list contents are of type {@link org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayInitializationValue}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Initial Values</em>' containment reference list.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArraysPackage#getArrayInitializer_InitialValues()
     * @model containment="true"
     * @generated
     */
    EList<ArrayInitializationValue> getInitialValues();

} // ArrayInitializer
