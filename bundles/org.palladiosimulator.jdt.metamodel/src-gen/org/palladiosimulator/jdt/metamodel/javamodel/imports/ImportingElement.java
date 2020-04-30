/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.imports;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.ConcreteClassifier;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Importing Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.imports.ImportingElement#getImports <em>Imports</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.imports.ImportsPackage#getImportingElement()
 * @model abstract="true"
 * @generated
 */
public interface ImportingElement extends Commentable {
    /**
     * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
     * The list contents are of type {@link org.palladiosimulator.jdt.metamodel.javamodel.imports.Import}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Imports</em>' containment reference list.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.imports.ImportsPackage#getImportingElement_Imports()
     * @model containment="true"
     * @generated
     */
    EList<Import> getImports();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * <!-- end-model-doc -->
     * @model kind="operation"
     * @generated
     */
    EList<ConcreteClassifier> getDefaultImports();

} // ImportingElement
