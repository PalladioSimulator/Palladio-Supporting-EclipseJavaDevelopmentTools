/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.containers;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.jdt.metamodel.javamodel.annotations.Annotable;

import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.ConcreteClassifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.containers.Package#getCompilationUnits <em>Compilation Units</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.containers.ContainersPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends JavaRoot, Annotable {
    /**
     * Returns the value of the '<em><b>Compilation Units</b></em>' containment reference list.
     * The list contents are of type {@link org.palladiosimulator.jdt.metamodel.javamodel.containers.CompilationUnit}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Compilation Units</em>' containment reference list.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.containers.ContainersPackage#getPackage_CompilationUnits()
     * @model containment="true"
     * @generated
     */
    EList<CompilationUnit> getCompilationUnits();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * <!-- end-model-doc -->
     * @model kind="operation"
     * @generated
     */
    String getNamespacesAsString();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * <!-- end-model-doc -->
     * @model kind="operation"
     * @generated
     */
    EList<ConcreteClassifier> getClassifiersInSamePackage();

} // Package
