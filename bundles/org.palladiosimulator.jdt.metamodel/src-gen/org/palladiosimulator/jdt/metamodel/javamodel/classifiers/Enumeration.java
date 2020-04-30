/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.classifiers;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.jdt.metamodel.javamodel.members.EnumConstant;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Enumeration#getConstants <em>Constants</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.ClassifiersPackage#getEnumeration()
 * @model
 * @generated
 */
public interface Enumeration extends ConcreteClassifier, Implementor {
    /**
     * Returns the value of the '<em><b>Constants</b></em>' containment reference list.
     * The list contents are of type {@link org.palladiosimulator.jdt.metamodel.javamodel.members.EnumConstant}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Constants</em>' containment reference list.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.ClassifiersPackage#getEnumeration_Constants()
     * @model containment="true"
     * @generated
     */
    EList<EnumConstant> getConstants();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * <!-- end-model-doc -->
     * @model kind="operation"
     * @generated
     */
    EList<ConcreteClassifier> getAllSuperClassifiers();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    EnumConstant getContainedConstant(String name);

} // Enumeration
