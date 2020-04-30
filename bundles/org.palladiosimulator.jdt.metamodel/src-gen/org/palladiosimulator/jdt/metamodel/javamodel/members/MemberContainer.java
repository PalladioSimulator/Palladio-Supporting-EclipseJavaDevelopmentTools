/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.members;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.ConcreteClassifier;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.members.MemberContainer#getMembers <em>Members</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.members.MemberContainer#getDefaultMembers <em>Default Members</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.members.MembersPackage#getMemberContainer()
 * @model abstract="true"
 * @generated
 */
public interface MemberContainer extends Commentable {
    /**
     * Returns the value of the '<em><b>Members</b></em>' containment reference list.
     * The list contents are of type {@link org.palladiosimulator.jdt.metamodel.javamodel.members.Member}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Members</em>' containment reference list.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.members.MembersPackage#getMemberContainer_Members()
     * @model containment="true"
     * @generated
     */
    EList<Member> getMembers();

    /**
     * Returns the value of the '<em><b>Default Members</b></em>' containment reference list.
     * The list contents are of type {@link org.palladiosimulator.jdt.metamodel.javamodel.members.Member}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Default Members</em>' containment reference list.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.members.MembersPackage#getMemberContainer_DefaultMembers()
     * @model containment="true"
     * @generated
     */
    EList<Member> getDefaultMembers();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    ConcreteClassifier getContainedClassifier(String name);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    Field getContainedField(String name);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    Method getContainedMethod(String name);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * <!-- end-model-doc -->
     * @model kind="operation"
     * @generated
     */
    EList<Method> getMethods();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * <!-- end-model-doc -->
     * @model nameRequired="true"
     * @generated
     */
    void removeMethods(String name);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * <!-- end-model-doc -->
     * @model nameRequired="true"
     * @generated
     */
    EList<Member> getMembersByName(String name);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * <!-- end-model-doc -->
     * @model nameRequired="true" qualifiedTypeNameRequired="true"
     * @generated
     */
    Field createField(String name, String qualifiedTypeName);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * <!-- end-model-doc -->
     * @model kind="operation"
     * @generated
     */
    EList<Field> getFields();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * <!-- end-model-doc -->
     * @model kind="operation"
     * @generated
     */
    EList<Constructor> getConstructors();

} // MemberContainer
