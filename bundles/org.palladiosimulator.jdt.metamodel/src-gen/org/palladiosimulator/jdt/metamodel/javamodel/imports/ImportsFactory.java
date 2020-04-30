/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.imports;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.jdt.metamodel.javamodel.imports.ImportsPackage
 * @generated
 */
public interface ImportsFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ImportsFactory eINSTANCE = org.palladiosimulator.jdt.metamodel.javamodel.imports.impl.ImportsFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Classifier Import</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Classifier Import</em>'.
     * @generated
     */
    ClassifierImport createClassifierImport();

    /**
     * Returns a new object of class '<em>Package Import</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Package Import</em>'.
     * @generated
     */
    PackageImport createPackageImport();

    /**
     * Returns a new object of class '<em>Static Classifier Import</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Static Classifier Import</em>'.
     * @generated
     */
    StaticClassifierImport createStaticClassifierImport();

    /**
     * Returns a new object of class '<em>Static Member Import</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Static Member Import</em>'.
     * @generated
     */
    StaticMemberImport createStaticMemberImport();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    ImportsPackage getImportsPackage();

} //ImportsFactory
