/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.containers;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.ConcreteClassifier;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.NamedElement;
import org.palladiosimulator.jdt.metamodel.javamodel.commons.NamespaceAwareElement;

import org.palladiosimulator.jdt.metamodel.javamodel.imports.ImportingElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Root</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.containers.ContainersPackage#getJavaRoot()
 * @model abstract="true"
 * @generated
 */
public interface JavaRoot extends NamedElement, NamespaceAwareElement, ImportingElement {
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

} // JavaRoot
