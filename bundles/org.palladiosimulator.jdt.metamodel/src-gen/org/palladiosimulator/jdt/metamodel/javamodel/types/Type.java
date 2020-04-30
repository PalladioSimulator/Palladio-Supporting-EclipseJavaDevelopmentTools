/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.types;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayTypeable;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable;

import org.palladiosimulator.jdt.metamodel.javamodel.members.Member;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.types.TypesPackage#getType()
 * @model abstract="true"
 * @generated
 */
public interface Type extends Commentable {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean equalsType(long arrayDimension, Type otherType, long otherArrayDimension);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean isSuperType(long arrayDimension, Type otherType, ArrayTypeable otherArrayType);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    EList<Member> getAllMembers(Commentable context);

} // Type
