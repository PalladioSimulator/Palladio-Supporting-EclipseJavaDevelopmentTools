/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.references;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.references.PackageReference#getSubpackages <em>Subpackages</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.references.ReferencesPackage#getPackageReference()
 * @model
 * @generated
 */
public interface PackageReference extends ReferenceableElement {
    /**
     * Returns the value of the '<em><b>Subpackages</b></em>' containment reference list.
     * The list contents are of type {@link org.palladiosimulator.jdt.metamodel.javamodel.references.PackageReference}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Subpackages</em>' containment reference list.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.references.ReferencesPackage#getPackageReference_Subpackages()
     * @model containment="true"
     * @generated
     */
    EList<PackageReference> getSubpackages();

} // PackageReference
