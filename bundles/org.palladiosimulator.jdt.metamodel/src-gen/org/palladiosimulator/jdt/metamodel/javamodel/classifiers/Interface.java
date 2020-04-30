/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.classifiers;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.jdt.metamodel.javamodel.types.TypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Interface#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Interface#getDefaultExtends <em>Default Extends</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.ClassifiersPackage#getInterface()
 * @model
 * @generated
 */
public interface Interface extends ConcreteClassifier {
    /**
     * Returns the value of the '<em><b>Extends</b></em>' containment reference list.
     * The list contents are of type {@link org.palladiosimulator.jdt.metamodel.javamodel.types.TypeReference}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Extends</em>' containment reference list.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.ClassifiersPackage#getInterface_Extends()
     * @model containment="true"
     * @generated
     */
    EList<TypeReference> getExtends();

    /**
     * Returns the value of the '<em><b>Default Extends</b></em>' containment reference list.
     * The list contents are of type {@link org.palladiosimulator.jdt.metamodel.javamodel.types.TypeReference}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Default Extends</em>' containment reference list.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.ClassifiersPackage#getInterface_DefaultExtends()
     * @model containment="true"
     * @generated
     */
    EList<TypeReference> getDefaultExtends();

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

} // Interface
