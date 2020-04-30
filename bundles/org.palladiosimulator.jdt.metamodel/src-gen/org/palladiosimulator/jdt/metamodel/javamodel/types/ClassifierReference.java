/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.types;

import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Classifier;

import org.palladiosimulator.jdt.metamodel.javamodel.generics.TypeArgumentable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classifier Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.types.ClassifierReference#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.types.TypesPackage#getClassifierReference()
 * @model
 * @generated
 */
public interface ClassifierReference extends TypeReference, TypeArgumentable {
    /**
     * Returns the value of the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target</em>' reference.
     * @see #setTarget(Classifier)
     * @see org.palladiosimulator.jdt.metamodel.javamodel.types.TypesPackage#getClassifierReference_Target()
     * @model required="true"
     * @generated
     */
    Classifier getTarget();

    /**
     * Sets the value of the '{@link org.palladiosimulator.jdt.metamodel.javamodel.types.ClassifierReference#getTarget <em>Target</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target</em>' reference.
     * @see #getTarget()
     * @generated
     */
    void setTarget(Classifier value);

} // ClassifierReference
