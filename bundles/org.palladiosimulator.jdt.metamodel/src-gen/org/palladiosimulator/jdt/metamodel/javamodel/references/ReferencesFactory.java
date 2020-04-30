/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.references;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.jdt.metamodel.javamodel.references.ReferencesPackage
 * @generated
 */
public interface ReferencesFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ReferencesFactory eINSTANCE = org.palladiosimulator.jdt.metamodel.javamodel.references.impl.ReferencesFactoryImpl
            .init();

    /**
     * Returns a new object of class '<em>Identifier Reference</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Identifier Reference</em>'.
     * @generated
     */
    IdentifierReference createIdentifierReference();

    /**
     * Returns a new object of class '<em>Method Call</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Method Call</em>'.
     * @generated
     */
    MethodCall createMethodCall();

    /**
     * Returns a new object of class '<em>Reflective Class Reference</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Reflective Class Reference</em>'.
     * @generated
     */
    ReflectiveClassReference createReflectiveClassReference();

    /**
     * Returns a new object of class '<em>Primitive Type Reference</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Primitive Type Reference</em>'.
     * @generated
     */
    PrimitiveTypeReference createPrimitiveTypeReference();

    /**
     * Returns a new object of class '<em>String Reference</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>String Reference</em>'.
     * @generated
     */
    StringReference createStringReference();

    /**
     * Returns a new object of class '<em>Self Reference</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Self Reference</em>'.
     * @generated
     */
    SelfReference createSelfReference();

    /**
     * Returns a new object of class '<em>Package Reference</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Package Reference</em>'.
     * @generated
     */
    PackageReference createPackageReference();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    ReferencesPackage getReferencesPackage();

} //ReferencesFactory
