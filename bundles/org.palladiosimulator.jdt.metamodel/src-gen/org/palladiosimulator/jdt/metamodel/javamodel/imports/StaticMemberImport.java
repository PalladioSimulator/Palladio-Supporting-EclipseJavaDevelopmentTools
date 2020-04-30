/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.imports;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.jdt.metamodel.javamodel.references.ReferenceableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Static Member Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.imports.StaticMemberImport#getStaticMembers <em>Static Members</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.imports.ImportsPackage#getStaticMemberImport()
 * @model
 * @generated
 */
public interface StaticMemberImport extends StaticImport {
    /**
     * Returns the value of the '<em><b>Static Members</b></em>' reference list.
     * The list contents are of type {@link org.palladiosimulator.jdt.metamodel.javamodel.references.ReferenceableElement}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Static Members</em>' reference list.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.imports.ImportsPackage#getStaticMemberImport_StaticMembers()
     * @model required="true"
     * @generated
     */
    EList<ReferenceableElement> getStaticMembers();

} // StaticMemberImport
