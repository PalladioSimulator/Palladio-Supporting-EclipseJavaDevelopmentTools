/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.commons;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.ConcreteClassifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Namespace Aware Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.commons.NamespaceAwareElement#getNamespaces <em>Namespaces</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.commons.CommonsPackage#getNamespaceAwareElement()
 * @model abstract="true"
 * @generated
 */
public interface NamespaceAwareElement extends Commentable {
    /**
     * Returns the value of the '<em><b>Namespaces</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Namespaces</em>' attribute list.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.commons.CommonsPackage#getNamespaceAwareElement_Namespaces()
     * @model unique="false"
     * @generated
     */
    EList<String> getNamespaces();

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
    ConcreteClassifier getClassifierAtNamespaces();

} // NamespaceAwareElement
