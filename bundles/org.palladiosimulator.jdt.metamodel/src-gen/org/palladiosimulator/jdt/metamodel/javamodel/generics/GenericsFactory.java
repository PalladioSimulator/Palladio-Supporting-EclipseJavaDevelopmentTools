/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.generics;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.jdt.metamodel.javamodel.generics.GenericsPackage
 * @generated
 */
public interface GenericsFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    GenericsFactory eINSTANCE = org.palladiosimulator.jdt.metamodel.javamodel.generics.impl.GenericsFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Extends Type Argument</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Extends Type Argument</em>'.
     * @generated
     */
    ExtendsTypeArgument createExtendsTypeArgument();

    /**
     * Returns a new object of class '<em>Qualified Type Argument</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Qualified Type Argument</em>'.
     * @generated
     */
    QualifiedTypeArgument createQualifiedTypeArgument();

    /**
     * Returns a new object of class '<em>Super Type Argument</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Super Type Argument</em>'.
     * @generated
     */
    SuperTypeArgument createSuperTypeArgument();

    /**
     * Returns a new object of class '<em>Type Parameter</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Type Parameter</em>'.
     * @generated
     */
    TypeParameter createTypeParameter();

    /**
     * Returns a new object of class '<em>Unknown Type Argument</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Unknown Type Argument</em>'.
     * @generated
     */
    UnknownTypeArgument createUnknownTypeArgument();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    GenericsPackage getGenericsPackage();

} //GenericsFactory
