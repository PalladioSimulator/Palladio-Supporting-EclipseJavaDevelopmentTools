/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.classifiers;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.jdt.metamodel.javamodel.types.PrimitiveType;
import org.palladiosimulator.jdt.metamodel.javamodel.types.TypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Class#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Class#getDefaultExtends <em>Default Extends</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.ClassifiersPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends ConcreteClassifier, Implementor {
    /**
     * Returns the value of the '<em><b>Extends</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Extends</em>' containment reference.
     * @see #setExtends(TypeReference)
     * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.ClassifiersPackage#getClass_Extends()
     * @model containment="true"
     * @generated
     */
    TypeReference getExtends();

    /**
     * Sets the value of the '{@link org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Class#getExtends <em>Extends</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Extends</em>' containment reference.
     * @see #getExtends()
     * @generated
     */
    void setExtends(TypeReference value);

    /**
     * Returns the value of the '<em><b>Default Extends</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Default Extends</em>' containment reference.
     * @see #setDefaultExtends(TypeReference)
     * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.ClassifiersPackage#getClass_DefaultExtends()
     * @model containment="true"
     * @generated
     */
    TypeReference getDefaultExtends();

    /**
     * Sets the value of the '{@link org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Class#getDefaultExtends <em>Default Extends</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Default Extends</em>' containment reference.
     * @see #getDefaultExtends()
     * @generated
     */
    void setDefaultExtends(TypeReference value);

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
     * @model kind="operation"
     * @generated
     */
    Class getSuperClass();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    PrimitiveType unWrapPrimitiveType();

} // Class
