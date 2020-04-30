/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.imports;

import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.ConcreteClassifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classifier Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.imports.ClassifierImport#getClassifier <em>Classifier</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.imports.ImportsPackage#getClassifierImport()
 * @model
 * @generated
 */
public interface ClassifierImport extends Import {
    /**
     * Returns the value of the '<em><b>Classifier</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Classifier</em>' reference.
     * @see #setClassifier(ConcreteClassifier)
     * @see org.palladiosimulator.jdt.metamodel.javamodel.imports.ImportsPackage#getClassifierImport_Classifier()
     * @model required="true"
     * @generated
     */
    ConcreteClassifier getClassifier();

    /**
     * Sets the value of the '{@link org.palladiosimulator.jdt.metamodel.javamodel.imports.ClassifierImport#getClassifier <em>Classifier</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Classifier</em>' reference.
     * @see #getClassifier()
     * @generated
     */
    void setClassifier(ConcreteClassifier value);

} // ClassifierImport
