/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.types;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.NamespaceAwareElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Namespace Classifier Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.types.NamespaceClassifierReference#getClassifierReferences <em>Classifier References</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.types.TypesPackage#getNamespaceClassifierReference()
 * @model
 * @generated
 */
public interface NamespaceClassifierReference extends TypeReference, NamespaceAwareElement {
    /**
     * Returns the value of the '<em><b>Classifier References</b></em>' containment reference list.
     * The list contents are of type {@link org.palladiosimulator.jdt.metamodel.javamodel.types.ClassifierReference}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Classifier References</em>' containment reference list.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.types.TypesPackage#getNamespaceClassifierReference_ClassifierReferences()
     * @model containment="true" required="true"
     * @generated
     */
    EList<ClassifierReference> getClassifierReferences();

} // NamespaceClassifierReference
