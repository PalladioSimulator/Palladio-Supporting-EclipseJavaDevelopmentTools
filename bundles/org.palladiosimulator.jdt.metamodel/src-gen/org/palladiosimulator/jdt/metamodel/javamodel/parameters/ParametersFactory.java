/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.parameters;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.jdt.metamodel.javamodel.parameters.ParametersPackage
 * @generated
 */
public interface ParametersFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ParametersFactory eINSTANCE = org.palladiosimulator.jdt.metamodel.javamodel.parameters.impl.ParametersFactoryImpl
            .init();

    /**
     * Returns a new object of class '<em>Ordinary Parameter</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Ordinary Parameter</em>'.
     * @generated
     */
    OrdinaryParameter createOrdinaryParameter();

    /**
     * Returns a new object of class '<em>Variable Length Parameter</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Variable Length Parameter</em>'.
     * @generated
     */
    VariableLengthParameter createVariableLengthParameter();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    ParametersPackage getParametersPackage();

} //ParametersFactory
