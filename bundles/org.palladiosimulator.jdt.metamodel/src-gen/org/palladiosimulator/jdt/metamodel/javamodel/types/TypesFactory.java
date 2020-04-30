/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.types;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.jdt.metamodel.javamodel.types.TypesPackage
 * @generated
 */
public interface TypesFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    TypesFactory eINSTANCE = org.palladiosimulator.jdt.metamodel.javamodel.types.impl.TypesFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Classifier Reference</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Classifier Reference</em>'.
     * @generated
     */
    ClassifierReference createClassifierReference();

    /**
     * Returns a new object of class '<em>Namespace Classifier Reference</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Namespace Classifier Reference</em>'.
     * @generated
     */
    NamespaceClassifierReference createNamespaceClassifierReference();

    /**
     * Returns a new object of class '<em>Boolean</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Boolean</em>'.
     * @generated
     */
    Boolean createBoolean();

    /**
     * Returns a new object of class '<em>Byte</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Byte</em>'.
     * @generated
     */
    Byte createByte();

    /**
     * Returns a new object of class '<em>Char</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Char</em>'.
     * @generated
     */
    Char createChar();

    /**
     * Returns a new object of class '<em>Double</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Double</em>'.
     * @generated
     */
    Double createDouble();

    /**
     * Returns a new object of class '<em>Float</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Float</em>'.
     * @generated
     */
    Float createFloat();

    /**
     * Returns a new object of class '<em>Int</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Int</em>'.
     * @generated
     */
    Int createInt();

    /**
     * Returns a new object of class '<em>Long</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Long</em>'.
     * @generated
     */
    Long createLong();

    /**
     * Returns a new object of class '<em>Short</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Short</em>'.
     * @generated
     */
    Short createShort();

    /**
     * Returns a new object of class '<em>Void</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Void</em>'.
     * @generated
     */
    Void createVoid();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    TypesPackage getTypesPackage();

} //TypesFactory
