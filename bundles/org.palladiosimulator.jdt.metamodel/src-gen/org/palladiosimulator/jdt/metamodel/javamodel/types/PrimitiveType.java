/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.types;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable;

import org.palladiosimulator.jdt.metamodel.javamodel.members.Member;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Type</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.types.TypesPackage#getPrimitiveType()
 * @model abstract="true"
 * @generated
 */
public interface PrimitiveType extends Type, TypeReference {
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

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Class wrapPrimitiveType();

} // PrimitiveType
