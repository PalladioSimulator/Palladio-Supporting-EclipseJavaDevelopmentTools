/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.containers;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.jdt.metamodel.javamodel.containers.ContainersPackage
 * @generated
 */
public interface ContainersFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ContainersFactory eINSTANCE = org.palladiosimulator.jdt.metamodel.javamodel.containers.impl.ContainersFactoryImpl
            .init();

    /**
     * Returns a new object of class '<em>Compilation Unit</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Compilation Unit</em>'.
     * @generated
     */
    CompilationUnit createCompilationUnit();

    /**
     * Returns a new object of class '<em>Package</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Package</em>'.
     * @generated
     */
    Package createPackage();

    /**
     * Returns a new object of class '<em>Empty Model</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Empty Model</em>'.
     * @generated
     */
    EmptyModel createEmptyModel();

    /**
     * Returns a new object of class '<em>Project Root</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Project Root</em>'.
     * @generated
     */
    ProjectRoot createProjectRoot();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    ContainersPackage getContainersPackage();

} //ContainersFactory
