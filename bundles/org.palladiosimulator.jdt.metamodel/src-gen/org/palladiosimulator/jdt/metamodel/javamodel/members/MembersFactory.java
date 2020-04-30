/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.members;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.jdt.metamodel.javamodel.members.MembersPackage
 * @generated
 */
public interface MembersFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    MembersFactory eINSTANCE = org.palladiosimulator.jdt.metamodel.javamodel.members.impl.MembersFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Additional Field</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Additional Field</em>'.
     * @generated
     */
    AdditionalField createAdditionalField();

    /**
     * Returns a new object of class '<em>Constructor</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Constructor</em>'.
     * @generated
     */
    Constructor createConstructor();

    /**
     * Returns a new object of class '<em>Empty Member</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Empty Member</em>'.
     * @generated
     */
    EmptyMember createEmptyMember();

    /**
     * Returns a new object of class '<em>Field</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Field</em>'.
     * @generated
     */
    Field createField();

    /**
     * Returns a new object of class '<em>Interface Method</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Interface Method</em>'.
     * @generated
     */
    InterfaceMethod createInterfaceMethod();

    /**
     * Returns a new object of class '<em>Class Method</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Class Method</em>'.
     * @generated
     */
    ClassMethod createClassMethod();

    /**
     * Returns a new object of class '<em>Enum Constant</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Enum Constant</em>'.
     * @generated
     */
    EnumConstant createEnumConstant();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    MembersPackage getMembersPackage();

} //MembersFactory
