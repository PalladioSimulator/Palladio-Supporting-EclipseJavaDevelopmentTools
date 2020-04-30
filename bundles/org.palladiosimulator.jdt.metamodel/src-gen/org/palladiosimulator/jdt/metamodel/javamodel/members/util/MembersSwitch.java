/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.members.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.palladiosimulator.jdt.metamodel.javamodel.annotations.Annotable;

import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayTypeable;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable;
import org.palladiosimulator.jdt.metamodel.javamodel.commons.NamedElement;

import org.palladiosimulator.jdt.metamodel.javamodel.generics.TypeArgumentable;
import org.palladiosimulator.jdt.metamodel.javamodel.generics.TypeParametrizable;

import org.palladiosimulator.jdt.metamodel.javamodel.instantiations.Initializable;

import org.palladiosimulator.jdt.metamodel.javamodel.members.*;

import org.palladiosimulator.jdt.metamodel.javamodel.modifiers.AnnotableAndModifiable;

import org.palladiosimulator.jdt.metamodel.javamodel.parameters.Parametrizable;

import org.palladiosimulator.jdt.metamodel.javamodel.references.Argumentable;
import org.palladiosimulator.jdt.metamodel.javamodel.references.ReferenceableElement;

import org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementListContainer;

import org.palladiosimulator.jdt.metamodel.javamodel.types.TypedElement;

import org.palladiosimulator.jdt.metamodel.javamodel.variables.Variable;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.jdt.metamodel.javamodel.members.MembersPackage
 * @generated
 */
public class MembersSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static MembersPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MembersSwitch() {
        if (modelPackage == null) {
            modelPackage = MembersPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
        case MembersPackage.EXCEPTION_THROWER: {
            ExceptionThrower exceptionThrower = (ExceptionThrower) theEObject;
            T result = caseExceptionThrower(exceptionThrower);
            if (result == null)
                result = caseCommentable(exceptionThrower);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case MembersPackage.MEMBER: {
            Member member = (Member) theEObject;
            T result = caseMember(member);
            if (result == null)
                result = caseNamedElement(member);
            if (result == null)
                result = caseCommentable(member);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case MembersPackage.MEMBER_CONTAINER: {
            MemberContainer memberContainer = (MemberContainer) theEObject;
            T result = caseMemberContainer(memberContainer);
            if (result == null)
                result = caseCommentable(memberContainer);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case MembersPackage.ADDITIONAL_FIELD: {
            AdditionalField additionalField = (AdditionalField) theEObject;
            T result = caseAdditionalField(additionalField);
            if (result == null)
                result = caseReferenceableElement(additionalField);
            if (result == null)
                result = caseArrayTypeable(additionalField);
            if (result == null)
                result = caseInitializable(additionalField);
            if (result == null)
                result = caseNamedElement(additionalField);
            if (result == null)
                result = caseCommentable(additionalField);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case MembersPackage.CONSTRUCTOR: {
            Constructor constructor = (Constructor) theEObject;
            T result = caseConstructor(constructor);
            if (result == null)
                result = caseMember(constructor);
            if (result == null)
                result = caseStatementListContainer(constructor);
            if (result == null)
                result = caseParametrizable(constructor);
            if (result == null)
                result = caseTypeParametrizable(constructor);
            if (result == null)
                result = caseExceptionThrower(constructor);
            if (result == null)
                result = caseAnnotableAndModifiable(constructor);
            if (result == null)
                result = caseNamedElement(constructor);
            if (result == null)
                result = caseCommentable(constructor);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case MembersPackage.EMPTY_MEMBER: {
            EmptyMember emptyMember = (EmptyMember) theEObject;
            T result = caseEmptyMember(emptyMember);
            if (result == null)
                result = caseMember(emptyMember);
            if (result == null)
                result = caseNamedElement(emptyMember);
            if (result == null)
                result = caseCommentable(emptyMember);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case MembersPackage.FIELD: {
            Field field = (Field) theEObject;
            T result = caseField(field);
            if (result == null)
                result = caseMember(field);
            if (result == null)
                result = caseInitializable(field);
            if (result == null)
                result = caseVariable(field);
            if (result == null)
                result = caseAnnotableAndModifiable(field);
            if (result == null)
                result = caseTypedElement(field);
            if (result == null)
                result = caseArrayTypeable(field);
            if (result == null)
                result = caseReferenceableElement(field);
            if (result == null)
                result = caseTypeArgumentable(field);
            if (result == null)
                result = caseNamedElement(field);
            if (result == null)
                result = caseCommentable(field);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case MembersPackage.METHOD: {
            Method method = (Method) theEObject;
            T result = caseMethod(method);
            if (result == null)
                result = caseMember(method);
            if (result == null)
                result = caseTypedElement(method);
            if (result == null)
                result = caseArrayTypeable(method);
            if (result == null)
                result = caseTypeParametrizable(method);
            if (result == null)
                result = caseParametrizable(method);
            if (result == null)
                result = caseReferenceableElement(method);
            if (result == null)
                result = caseExceptionThrower(method);
            if (result == null)
                result = caseAnnotableAndModifiable(method);
            if (result == null)
                result = caseNamedElement(method);
            if (result == null)
                result = caseCommentable(method);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case MembersPackage.INTERFACE_METHOD: {
            InterfaceMethod interfaceMethod = (InterfaceMethod) theEObject;
            T result = caseInterfaceMethod(interfaceMethod);
            if (result == null)
                result = caseMethod(interfaceMethod);
            if (result == null)
                result = caseMember(interfaceMethod);
            if (result == null)
                result = caseTypedElement(interfaceMethod);
            if (result == null)
                result = caseArrayTypeable(interfaceMethod);
            if (result == null)
                result = caseTypeParametrizable(interfaceMethod);
            if (result == null)
                result = caseParametrizable(interfaceMethod);
            if (result == null)
                result = caseReferenceableElement(interfaceMethod);
            if (result == null)
                result = caseExceptionThrower(interfaceMethod);
            if (result == null)
                result = caseAnnotableAndModifiable(interfaceMethod);
            if (result == null)
                result = caseNamedElement(interfaceMethod);
            if (result == null)
                result = caseCommentable(interfaceMethod);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case MembersPackage.CLASS_METHOD: {
            ClassMethod classMethod = (ClassMethod) theEObject;
            T result = caseClassMethod(classMethod);
            if (result == null)
                result = caseMethod(classMethod);
            if (result == null)
                result = caseStatementListContainer(classMethod);
            if (result == null)
                result = caseMember(classMethod);
            if (result == null)
                result = caseTypedElement(classMethod);
            if (result == null)
                result = caseArrayTypeable(classMethod);
            if (result == null)
                result = caseTypeParametrizable(classMethod);
            if (result == null)
                result = caseParametrizable(classMethod);
            if (result == null)
                result = caseReferenceableElement(classMethod);
            if (result == null)
                result = caseExceptionThrower(classMethod);
            if (result == null)
                result = caseAnnotableAndModifiable(classMethod);
            if (result == null)
                result = caseNamedElement(classMethod);
            if (result == null)
                result = caseCommentable(classMethod);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case MembersPackage.ENUM_CONSTANT: {
            EnumConstant enumConstant = (EnumConstant) theEObject;
            T result = caseEnumConstant(enumConstant);
            if (result == null)
                result = caseReferenceableElement(enumConstant);
            if (result == null)
                result = caseArgumentable(enumConstant);
            if (result == null)
                result = caseAnnotable(enumConstant);
            if (result == null)
                result = caseNamedElement(enumConstant);
            if (result == null)
                result = caseCommentable(enumConstant);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        default:
            return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exception Thrower</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exception Thrower</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExceptionThrower(ExceptionThrower object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Member</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Member</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMember(Member object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Member Container</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Member Container</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMemberContainer(MemberContainer object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Additional Field</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Additional Field</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAdditionalField(AdditionalField object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Constructor</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Constructor</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConstructor(Constructor object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Empty Member</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Empty Member</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEmptyMember(EmptyMember object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Field</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Field</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseField(Field object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Method</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Method</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMethod(Method object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Interface Method</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Interface Method</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInterfaceMethod(InterfaceMethod object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Class Method</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Class Method</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseClassMethod(ClassMethod object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Enum Constant</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Enum Constant</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEnumConstant(EnumConstant object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Commentable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Commentable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCommentable(Commentable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNamedElement(NamedElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Referenceable Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Referenceable Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseReferenceableElement(ReferenceableElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Array Typeable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Array Typeable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseArrayTypeable(ArrayTypeable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Initializable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Initializable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInitializable(Initializable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Statement List Container</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Statement List Container</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStatementListContainer(StatementListContainer object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Parametrizable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Parametrizable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseParametrizable(Parametrizable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Type Parametrizable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Type Parametrizable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTypeParametrizable(TypeParametrizable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Annotable And Modifiable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Annotable And Modifiable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAnnotableAndModifiable(AnnotableAndModifiable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Typed Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Typed Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTypedElement(TypedElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Type Argumentable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Type Argumentable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTypeArgumentable(TypeArgumentable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVariable(Variable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Argumentable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Argumentable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseArgumentable(Argumentable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Annotable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Annotable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAnnotable(Annotable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(EObject object) {
        return null;
    }

} //MembersSwitch
