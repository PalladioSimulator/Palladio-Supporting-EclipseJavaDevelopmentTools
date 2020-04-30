/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.members;

import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayTypeable;

import org.palladiosimulator.jdt.metamodel.javamodel.generics.TypeParametrizable;

import org.palladiosimulator.jdt.metamodel.javamodel.modifiers.AnnotableAndModifiable;

import org.palladiosimulator.jdt.metamodel.javamodel.parameters.Parametrizable;

import org.palladiosimulator.jdt.metamodel.javamodel.references.MethodCall;
import org.palladiosimulator.jdt.metamodel.javamodel.references.ReferenceableElement;

import org.palladiosimulator.jdt.metamodel.javamodel.types.TypedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.members.MembersPackage#getMethod()
 * @model abstract="true"
 * @generated
 */
public interface Method extends Member, TypedElement, ArrayTypeable, TypeParametrizable, Parametrizable,
        ReferenceableElement, ExceptionThrower, AnnotableAndModifiable {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean isMethodForCall(MethodCall methodCall, boolean needsPerfectMatch);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean isSomeMethodForCall(MethodCall methodCall);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean isBetterMethodForCall(Method otherMethod, MethodCall methodCall);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * <!-- end-model-doc -->
     * @model kind="operation"
     * @generated
     */
    long getArrayDimension();

} // Method
