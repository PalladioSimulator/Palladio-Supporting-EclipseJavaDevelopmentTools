/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.classifiers;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable;

import org.palladiosimulator.jdt.metamodel.javamodel.generics.TypeParametrizable;

import org.palladiosimulator.jdt.metamodel.javamodel.members.Member;
import org.palladiosimulator.jdt.metamodel.javamodel.members.MemberContainer;

import org.palladiosimulator.jdt.metamodel.javamodel.modifiers.AnnotableAndModifiable;

import org.palladiosimulator.jdt.metamodel.javamodel.statements.Statement;

import org.palladiosimulator.jdt.metamodel.javamodel.types.ClassifierReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concrete Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.ClassifiersPackage#getConcreteClassifier()
 * @model abstract="true"
 * @generated
 */
public interface ConcreteClassifier
        extends Classifier, TypeParametrizable, MemberContainer, Member, Statement, AnnotableAndModifiable {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * <!-- end-model-doc -->
     * @model kind="operation"
     * @generated
     */
    EList<ConcreteClassifier> getInnerClassifiers();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * <!-- end-model-doc -->
     * @model kind="operation"
     * @generated
     */
    EList<ConcreteClassifier> getAllInnerClassifiers();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * <!-- end-model-doc -->
     * @model kind="operation"
     * @generated
     */
    EList<ClassifierReference> getSuperTypeReferences();

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
     * @model kind="operation" required="true"
     * @generated
     */
    String getQualifiedName();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * <!-- end-model-doc -->
     * @model required="true" clazzRequired="true"
     * @generated
     */
    boolean isJavaLangObject(ConcreteClassifier clazz);

} // ConcreteClassifier
