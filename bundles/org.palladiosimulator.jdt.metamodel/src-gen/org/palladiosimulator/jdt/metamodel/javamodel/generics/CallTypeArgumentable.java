/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.generics;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Type Argumentable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.generics.CallTypeArgumentable#getCallTypeArguments <em>Call Type Arguments</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.generics.GenericsPackage#getCallTypeArgumentable()
 * @model abstract="true"
 * @generated
 */
public interface CallTypeArgumentable extends Commentable {
    /**
     * Returns the value of the '<em><b>Call Type Arguments</b></em>' containment reference list.
     * The list contents are of type {@link org.palladiosimulator.jdt.metamodel.javamodel.generics.TypeArgument}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Call Type Arguments</em>' containment reference list.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.generics.GenericsPackage#getCallTypeArgumentable_CallTypeArguments()
     * @model containment="true"
     * @generated
     */
    EList<TypeArgument> getCallTypeArguments();

} // CallTypeArgumentable
