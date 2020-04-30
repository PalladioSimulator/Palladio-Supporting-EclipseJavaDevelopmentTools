/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.modifiers;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.jdt.metamodel.javamodel.modifiers.ModifiersPackage
 * @generated
 */
public interface ModifiersFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ModifiersFactory eINSTANCE = org.palladiosimulator.jdt.metamodel.javamodel.modifiers.impl.ModifiersFactoryImpl
            .init();

    /**
     * Returns a new object of class '<em>Abstract</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Abstract</em>'.
     * @generated
     */
    Abstract createAbstract();

    /**
     * Returns a new object of class '<em>Final</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Final</em>'.
     * @generated
     */
    Final createFinal();

    /**
     * Returns a new object of class '<em>Native</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Native</em>'.
     * @generated
     */
    Native createNative();

    /**
     * Returns a new object of class '<em>Protected</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Protected</em>'.
     * @generated
     */
    Protected createProtected();

    /**
     * Returns a new object of class '<em>Public</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Public</em>'.
     * @generated
     */
    Public createPublic();

    /**
     * Returns a new object of class '<em>Private</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Private</em>'.
     * @generated
     */
    Private createPrivate();

    /**
     * Returns a new object of class '<em>Static</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Static</em>'.
     * @generated
     */
    Static createStatic();

    /**
     * Returns a new object of class '<em>Strictfp</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Strictfp</em>'.
     * @generated
     */
    Strictfp createStrictfp();

    /**
     * Returns a new object of class '<em>Synchronized</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Synchronized</em>'.
     * @generated
     */
    Synchronized createSynchronized();

    /**
     * Returns a new object of class '<em>Transient</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Transient</em>'.
     * @generated
     */
    Transient createTransient();

    /**
     * Returns a new object of class '<em>Volatile</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Volatile</em>'.
     * @generated
     */
    Volatile createVolatile();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    ModifiersPackage getModifiersPackage();

} //ModifiersFactory
