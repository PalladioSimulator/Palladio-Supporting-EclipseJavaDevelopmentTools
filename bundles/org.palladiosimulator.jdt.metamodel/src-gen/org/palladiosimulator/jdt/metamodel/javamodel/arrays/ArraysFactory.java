/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.arrays;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArraysPackage
 * @generated
 */
public interface ArraysFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ArraysFactory eINSTANCE = org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArraysFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Array Dimension</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Array Dimension</em>'.
     * @generated
     */
    ArrayDimension createArrayDimension();

    /**
     * Returns a new object of class '<em>Array Initializer</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Array Initializer</em>'.
     * @generated
     */
    ArrayInitializer createArrayInitializer();

    /**
     * Returns a new object of class '<em>Array Instantiation By Size</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Array Instantiation By Size</em>'.
     * @generated
     */
    ArrayInstantiationBySize createArrayInstantiationBySize();

    /**
     * Returns a new object of class '<em>Array Instantiation By Values Untyped</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Array Instantiation By Values Untyped</em>'.
     * @generated
     */
    ArrayInstantiationByValuesUntyped createArrayInstantiationByValuesUntyped();

    /**
     * Returns a new object of class '<em>Array Instantiation By Values Typed</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Array Instantiation By Values Typed</em>'.
     * @generated
     */
    ArrayInstantiationByValuesTyped createArrayInstantiationByValuesTyped();

    /**
     * Returns a new object of class '<em>Array Selector</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Array Selector</em>'.
     * @generated
     */
    ArraySelector createArraySelector();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    ArraysPackage getArraysPackage();

} //ArraysFactory
