/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.instantiations;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.jdt.metamodel.javamodel.instantiations.InstantiationsPackage
 * @generated
 */
public interface InstantiationsFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    InstantiationsFactory eINSTANCE = org.palladiosimulator.jdt.metamodel.javamodel.instantiations.impl.InstantiationsFactoryImpl
            .init();

    /**
     * Returns a new object of class '<em>New Constructor Call</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>New Constructor Call</em>'.
     * @generated
     */
    NewConstructorCall createNewConstructorCall();

    /**
     * Returns a new object of class '<em>Explicit Constructor Call</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Explicit Constructor Call</em>'.
     * @generated
     */
    ExplicitConstructorCall createExplicitConstructorCall();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    InstantiationsPackage getInstantiationsPackage();

} //InstantiationsFactory
