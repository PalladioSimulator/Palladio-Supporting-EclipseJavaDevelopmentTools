/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.members;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable;

import org.palladiosimulator.jdt.metamodel.javamodel.types.NamespaceClassifierReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exception Thrower</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.members.ExceptionThrower#getExceptions <em>Exceptions</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.members.MembersPackage#getExceptionThrower()
 * @model abstract="true"
 * @generated
 */
public interface ExceptionThrower extends Commentable {
    /**
     * Returns the value of the '<em><b>Exceptions</b></em>' containment reference list.
     * The list contents are of type {@link org.palladiosimulator.jdt.metamodel.javamodel.types.NamespaceClassifierReference}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Exceptions</em>' containment reference list.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.members.MembersPackage#getExceptionThrower_Exceptions()
     * @model containment="true"
     * @generated
     */
    EList<NamespaceClassifierReference> getExceptions();

} // ExceptionThrower
