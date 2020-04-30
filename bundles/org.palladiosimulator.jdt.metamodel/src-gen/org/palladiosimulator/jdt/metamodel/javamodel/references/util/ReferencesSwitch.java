/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.references.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationValue;

import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayInitializationValue;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable;
import org.palladiosimulator.jdt.metamodel.javamodel.commons.NamedElement;

import org.palladiosimulator.jdt.metamodel.javamodel.expressions.AdditiveExpressionChild;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.AndExpressionChild;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.AssignmentExpressionChild;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.ConditionalAndExpressionChild;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.ConditionalExpressionChild;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.ConditionalOrExpressionChild;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.EqualityExpressionChild;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExclusiveOrExpressionChild;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.Expression;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.InclusiveOrExpressionChild;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.InstanceOfExpressionChild;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.MultiplicativeExpressionChild;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.PrimaryExpression;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.RelationExpressionChild;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.ShiftExpressionChild;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.UnaryExpressionChild;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.UnaryModificationExpressionChild;

import org.palladiosimulator.jdt.metamodel.javamodel.generics.CallTypeArgumentable;
import org.palladiosimulator.jdt.metamodel.javamodel.generics.TypeArgumentable;

import org.palladiosimulator.jdt.metamodel.javamodel.references.*;

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
 * @see org.palladiosimulator.jdt.metamodel.javamodel.references.ReferencesPackage
 * @generated
 */
public class ReferencesSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static ReferencesPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ReferencesSwitch() {
        if (modelPackage == null) {
            modelPackage = ReferencesPackage.eINSTANCE;
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
        case ReferencesPackage.REFERENCE: {
            Reference reference = (Reference) theEObject;
            T result = caseReference(reference);
            if (result == null)
                result = casePrimaryExpression(reference);
            if (result == null)
                result = caseTypeArgumentable(reference);
            if (result == null)
                result = caseUnaryModificationExpressionChild(reference);
            if (result == null)
                result = caseUnaryExpressionChild(reference);
            if (result == null)
                result = caseMultiplicativeExpressionChild(reference);
            if (result == null)
                result = caseAdditiveExpressionChild(reference);
            if (result == null)
                result = caseShiftExpressionChild(reference);
            if (result == null)
                result = caseRelationExpressionChild(reference);
            if (result == null)
                result = caseInstanceOfExpressionChild(reference);
            if (result == null)
                result = caseEqualityExpressionChild(reference);
            if (result == null)
                result = caseAndExpressionChild(reference);
            if (result == null)
                result = caseExclusiveOrExpressionChild(reference);
            if (result == null)
                result = caseInclusiveOrExpressionChild(reference);
            if (result == null)
                result = caseConditionalAndExpressionChild(reference);
            if (result == null)
                result = caseConditionalOrExpressionChild(reference);
            if (result == null)
                result = caseConditionalExpressionChild(reference);
            if (result == null)
                result = caseAssignmentExpressionChild(reference);
            if (result == null)
                result = caseExpression(reference);
            if (result == null)
                result = caseArrayInitializationValue(reference);
            if (result == null)
                result = caseAnnotationValue(reference);
            if (result == null)
                result = caseCommentable(reference);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ReferencesPackage.ARGUMENTABLE: {
            Argumentable argumentable = (Argumentable) theEObject;
            T result = caseArgumentable(argumentable);
            if (result == null)
                result = caseCommentable(argumentable);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ReferencesPackage.REFERENCEABLE_ELEMENT: {
            ReferenceableElement referenceableElement = (ReferenceableElement) theEObject;
            T result = caseReferenceableElement(referenceableElement);
            if (result == null)
                result = caseNamedElement(referenceableElement);
            if (result == null)
                result = caseCommentable(referenceableElement);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ReferencesPackage.ELEMENT_REFERENCE: {
            ElementReference elementReference = (ElementReference) theEObject;
            T result = caseElementReference(elementReference);
            if (result == null)
                result = caseReference(elementReference);
            if (result == null)
                result = casePrimaryExpression(elementReference);
            if (result == null)
                result = caseTypeArgumentable(elementReference);
            if (result == null)
                result = caseUnaryModificationExpressionChild(elementReference);
            if (result == null)
                result = caseUnaryExpressionChild(elementReference);
            if (result == null)
                result = caseMultiplicativeExpressionChild(elementReference);
            if (result == null)
                result = caseAdditiveExpressionChild(elementReference);
            if (result == null)
                result = caseShiftExpressionChild(elementReference);
            if (result == null)
                result = caseRelationExpressionChild(elementReference);
            if (result == null)
                result = caseInstanceOfExpressionChild(elementReference);
            if (result == null)
                result = caseEqualityExpressionChild(elementReference);
            if (result == null)
                result = caseAndExpressionChild(elementReference);
            if (result == null)
                result = caseExclusiveOrExpressionChild(elementReference);
            if (result == null)
                result = caseInclusiveOrExpressionChild(elementReference);
            if (result == null)
                result = caseConditionalAndExpressionChild(elementReference);
            if (result == null)
                result = caseConditionalOrExpressionChild(elementReference);
            if (result == null)
                result = caseConditionalExpressionChild(elementReference);
            if (result == null)
                result = caseAssignmentExpressionChild(elementReference);
            if (result == null)
                result = caseExpression(elementReference);
            if (result == null)
                result = caseArrayInitializationValue(elementReference);
            if (result == null)
                result = caseAnnotationValue(elementReference);
            if (result == null)
                result = caseCommentable(elementReference);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ReferencesPackage.IDENTIFIER_REFERENCE: {
            IdentifierReference identifierReference = (IdentifierReference) theEObject;
            T result = caseIdentifierReference(identifierReference);
            if (result == null)
                result = caseElementReference(identifierReference);
            if (result == null)
                result = caseReference(identifierReference);
            if (result == null)
                result = casePrimaryExpression(identifierReference);
            if (result == null)
                result = caseTypeArgumentable(identifierReference);
            if (result == null)
                result = caseUnaryModificationExpressionChild(identifierReference);
            if (result == null)
                result = caseUnaryExpressionChild(identifierReference);
            if (result == null)
                result = caseMultiplicativeExpressionChild(identifierReference);
            if (result == null)
                result = caseAdditiveExpressionChild(identifierReference);
            if (result == null)
                result = caseShiftExpressionChild(identifierReference);
            if (result == null)
                result = caseRelationExpressionChild(identifierReference);
            if (result == null)
                result = caseInstanceOfExpressionChild(identifierReference);
            if (result == null)
                result = caseEqualityExpressionChild(identifierReference);
            if (result == null)
                result = caseAndExpressionChild(identifierReference);
            if (result == null)
                result = caseExclusiveOrExpressionChild(identifierReference);
            if (result == null)
                result = caseInclusiveOrExpressionChild(identifierReference);
            if (result == null)
                result = caseConditionalAndExpressionChild(identifierReference);
            if (result == null)
                result = caseConditionalOrExpressionChild(identifierReference);
            if (result == null)
                result = caseConditionalExpressionChild(identifierReference);
            if (result == null)
                result = caseAssignmentExpressionChild(identifierReference);
            if (result == null)
                result = caseExpression(identifierReference);
            if (result == null)
                result = caseArrayInitializationValue(identifierReference);
            if (result == null)
                result = caseAnnotationValue(identifierReference);
            if (result == null)
                result = caseCommentable(identifierReference);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ReferencesPackage.METHOD_CALL: {
            MethodCall methodCall = (MethodCall) theEObject;
            T result = caseMethodCall(methodCall);
            if (result == null)
                result = caseElementReference(methodCall);
            if (result == null)
                result = caseArgumentable(methodCall);
            if (result == null)
                result = caseCallTypeArgumentable(methodCall);
            if (result == null)
                result = caseReference(methodCall);
            if (result == null)
                result = casePrimaryExpression(methodCall);
            if (result == null)
                result = caseTypeArgumentable(methodCall);
            if (result == null)
                result = caseUnaryModificationExpressionChild(methodCall);
            if (result == null)
                result = caseUnaryExpressionChild(methodCall);
            if (result == null)
                result = caseMultiplicativeExpressionChild(methodCall);
            if (result == null)
                result = caseAdditiveExpressionChild(methodCall);
            if (result == null)
                result = caseShiftExpressionChild(methodCall);
            if (result == null)
                result = caseRelationExpressionChild(methodCall);
            if (result == null)
                result = caseInstanceOfExpressionChild(methodCall);
            if (result == null)
                result = caseEqualityExpressionChild(methodCall);
            if (result == null)
                result = caseAndExpressionChild(methodCall);
            if (result == null)
                result = caseExclusiveOrExpressionChild(methodCall);
            if (result == null)
                result = caseInclusiveOrExpressionChild(methodCall);
            if (result == null)
                result = caseConditionalAndExpressionChild(methodCall);
            if (result == null)
                result = caseConditionalOrExpressionChild(methodCall);
            if (result == null)
                result = caseConditionalExpressionChild(methodCall);
            if (result == null)
                result = caseAssignmentExpressionChild(methodCall);
            if (result == null)
                result = caseExpression(methodCall);
            if (result == null)
                result = caseArrayInitializationValue(methodCall);
            if (result == null)
                result = caseAnnotationValue(methodCall);
            if (result == null)
                result = caseCommentable(methodCall);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ReferencesPackage.REFLECTIVE_CLASS_REFERENCE: {
            ReflectiveClassReference reflectiveClassReference = (ReflectiveClassReference) theEObject;
            T result = caseReflectiveClassReference(reflectiveClassReference);
            if (result == null)
                result = caseReference(reflectiveClassReference);
            if (result == null)
                result = casePrimaryExpression(reflectiveClassReference);
            if (result == null)
                result = caseTypeArgumentable(reflectiveClassReference);
            if (result == null)
                result = caseUnaryModificationExpressionChild(reflectiveClassReference);
            if (result == null)
                result = caseUnaryExpressionChild(reflectiveClassReference);
            if (result == null)
                result = caseMultiplicativeExpressionChild(reflectiveClassReference);
            if (result == null)
                result = caseAdditiveExpressionChild(reflectiveClassReference);
            if (result == null)
                result = caseShiftExpressionChild(reflectiveClassReference);
            if (result == null)
                result = caseRelationExpressionChild(reflectiveClassReference);
            if (result == null)
                result = caseInstanceOfExpressionChild(reflectiveClassReference);
            if (result == null)
                result = caseEqualityExpressionChild(reflectiveClassReference);
            if (result == null)
                result = caseAndExpressionChild(reflectiveClassReference);
            if (result == null)
                result = caseExclusiveOrExpressionChild(reflectiveClassReference);
            if (result == null)
                result = caseInclusiveOrExpressionChild(reflectiveClassReference);
            if (result == null)
                result = caseConditionalAndExpressionChild(reflectiveClassReference);
            if (result == null)
                result = caseConditionalOrExpressionChild(reflectiveClassReference);
            if (result == null)
                result = caseConditionalExpressionChild(reflectiveClassReference);
            if (result == null)
                result = caseAssignmentExpressionChild(reflectiveClassReference);
            if (result == null)
                result = caseExpression(reflectiveClassReference);
            if (result == null)
                result = caseArrayInitializationValue(reflectiveClassReference);
            if (result == null)
                result = caseAnnotationValue(reflectiveClassReference);
            if (result == null)
                result = caseCommentable(reflectiveClassReference);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ReferencesPackage.PRIMITIVE_TYPE_REFERENCE: {
            PrimitiveTypeReference primitiveTypeReference = (PrimitiveTypeReference) theEObject;
            T result = casePrimitiveTypeReference(primitiveTypeReference);
            if (result == null)
                result = caseReference(primitiveTypeReference);
            if (result == null)
                result = casePrimaryExpression(primitiveTypeReference);
            if (result == null)
                result = caseTypeArgumentable(primitiveTypeReference);
            if (result == null)
                result = caseUnaryModificationExpressionChild(primitiveTypeReference);
            if (result == null)
                result = caseUnaryExpressionChild(primitiveTypeReference);
            if (result == null)
                result = caseMultiplicativeExpressionChild(primitiveTypeReference);
            if (result == null)
                result = caseAdditiveExpressionChild(primitiveTypeReference);
            if (result == null)
                result = caseShiftExpressionChild(primitiveTypeReference);
            if (result == null)
                result = caseRelationExpressionChild(primitiveTypeReference);
            if (result == null)
                result = caseInstanceOfExpressionChild(primitiveTypeReference);
            if (result == null)
                result = caseEqualityExpressionChild(primitiveTypeReference);
            if (result == null)
                result = caseAndExpressionChild(primitiveTypeReference);
            if (result == null)
                result = caseExclusiveOrExpressionChild(primitiveTypeReference);
            if (result == null)
                result = caseInclusiveOrExpressionChild(primitiveTypeReference);
            if (result == null)
                result = caseConditionalAndExpressionChild(primitiveTypeReference);
            if (result == null)
                result = caseConditionalOrExpressionChild(primitiveTypeReference);
            if (result == null)
                result = caseConditionalExpressionChild(primitiveTypeReference);
            if (result == null)
                result = caseAssignmentExpressionChild(primitiveTypeReference);
            if (result == null)
                result = caseExpression(primitiveTypeReference);
            if (result == null)
                result = caseArrayInitializationValue(primitiveTypeReference);
            if (result == null)
                result = caseAnnotationValue(primitiveTypeReference);
            if (result == null)
                result = caseCommentable(primitiveTypeReference);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ReferencesPackage.STRING_REFERENCE: {
            StringReference stringReference = (StringReference) theEObject;
            T result = caseStringReference(stringReference);
            if (result == null)
                result = caseReference(stringReference);
            if (result == null)
                result = casePrimaryExpression(stringReference);
            if (result == null)
                result = caseTypeArgumentable(stringReference);
            if (result == null)
                result = caseUnaryModificationExpressionChild(stringReference);
            if (result == null)
                result = caseUnaryExpressionChild(stringReference);
            if (result == null)
                result = caseMultiplicativeExpressionChild(stringReference);
            if (result == null)
                result = caseAdditiveExpressionChild(stringReference);
            if (result == null)
                result = caseShiftExpressionChild(stringReference);
            if (result == null)
                result = caseRelationExpressionChild(stringReference);
            if (result == null)
                result = caseInstanceOfExpressionChild(stringReference);
            if (result == null)
                result = caseEqualityExpressionChild(stringReference);
            if (result == null)
                result = caseAndExpressionChild(stringReference);
            if (result == null)
                result = caseExclusiveOrExpressionChild(stringReference);
            if (result == null)
                result = caseInclusiveOrExpressionChild(stringReference);
            if (result == null)
                result = caseConditionalAndExpressionChild(stringReference);
            if (result == null)
                result = caseConditionalOrExpressionChild(stringReference);
            if (result == null)
                result = caseConditionalExpressionChild(stringReference);
            if (result == null)
                result = caseAssignmentExpressionChild(stringReference);
            if (result == null)
                result = caseExpression(stringReference);
            if (result == null)
                result = caseArrayInitializationValue(stringReference);
            if (result == null)
                result = caseAnnotationValue(stringReference);
            if (result == null)
                result = caseCommentable(stringReference);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ReferencesPackage.SELF_REFERENCE: {
            SelfReference selfReference = (SelfReference) theEObject;
            T result = caseSelfReference(selfReference);
            if (result == null)
                result = caseReference(selfReference);
            if (result == null)
                result = casePrimaryExpression(selfReference);
            if (result == null)
                result = caseTypeArgumentable(selfReference);
            if (result == null)
                result = caseUnaryModificationExpressionChild(selfReference);
            if (result == null)
                result = caseUnaryExpressionChild(selfReference);
            if (result == null)
                result = caseMultiplicativeExpressionChild(selfReference);
            if (result == null)
                result = caseAdditiveExpressionChild(selfReference);
            if (result == null)
                result = caseShiftExpressionChild(selfReference);
            if (result == null)
                result = caseRelationExpressionChild(selfReference);
            if (result == null)
                result = caseInstanceOfExpressionChild(selfReference);
            if (result == null)
                result = caseEqualityExpressionChild(selfReference);
            if (result == null)
                result = caseAndExpressionChild(selfReference);
            if (result == null)
                result = caseExclusiveOrExpressionChild(selfReference);
            if (result == null)
                result = caseInclusiveOrExpressionChild(selfReference);
            if (result == null)
                result = caseConditionalAndExpressionChild(selfReference);
            if (result == null)
                result = caseConditionalOrExpressionChild(selfReference);
            if (result == null)
                result = caseConditionalExpressionChild(selfReference);
            if (result == null)
                result = caseAssignmentExpressionChild(selfReference);
            if (result == null)
                result = caseExpression(selfReference);
            if (result == null)
                result = caseArrayInitializationValue(selfReference);
            if (result == null)
                result = caseAnnotationValue(selfReference);
            if (result == null)
                result = caseCommentable(selfReference);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ReferencesPackage.PACKAGE_REFERENCE: {
            PackageReference packageReference = (PackageReference) theEObject;
            T result = casePackageReference(packageReference);
            if (result == null)
                result = caseReferenceableElement(packageReference);
            if (result == null)
                result = caseNamedElement(packageReference);
            if (result == null)
                result = caseCommentable(packageReference);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        default:
            return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseReference(Reference object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Element Reference</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Element Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseElementReference(ElementReference object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Identifier Reference</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Identifier Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIdentifierReference(IdentifierReference object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Method Call</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Method Call</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMethodCall(MethodCall object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Reflective Class Reference</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Reflective Class Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseReflectiveClassReference(ReflectiveClassReference object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Primitive Type Reference</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Primitive Type Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePrimitiveTypeReference(PrimitiveTypeReference object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>String Reference</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>String Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStringReference(StringReference object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Self Reference</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Self Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSelfReference(SelfReference object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Package Reference</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Package Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePackageReference(PackageReference object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Array Initialization Value</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Array Initialization Value</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseArrayInitializationValue(ArrayInitializationValue object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Annotation Value</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Annotation Value</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAnnotationValue(AnnotationValue object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExpression(Expression object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Assignment Expression Child</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Assignment Expression Child</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAssignmentExpressionChild(AssignmentExpressionChild object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Conditional Expression Child</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Conditional Expression Child</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConditionalExpressionChild(ConditionalExpressionChild object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Conditional Or Expression Child</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Conditional Or Expression Child</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConditionalOrExpressionChild(ConditionalOrExpressionChild object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Conditional And Expression Child</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Conditional And Expression Child</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConditionalAndExpressionChild(ConditionalAndExpressionChild object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Inclusive Or Expression Child</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Inclusive Or Expression Child</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInclusiveOrExpressionChild(InclusiveOrExpressionChild object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exclusive Or Expression Child</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exclusive Or Expression Child</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExclusiveOrExpressionChild(ExclusiveOrExpressionChild object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>And Expression Child</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>And Expression Child</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAndExpressionChild(AndExpressionChild object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Equality Expression Child</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Equality Expression Child</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEqualityExpressionChild(EqualityExpressionChild object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Instance Of Expression Child</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Instance Of Expression Child</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInstanceOfExpressionChild(InstanceOfExpressionChild object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Relation Expression Child</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Relation Expression Child</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRelationExpressionChild(RelationExpressionChild object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Shift Expression Child</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Shift Expression Child</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseShiftExpressionChild(ShiftExpressionChild object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Additive Expression Child</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Additive Expression Child</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAdditiveExpressionChild(AdditiveExpressionChild object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Multiplicative Expression Child</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Multiplicative Expression Child</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMultiplicativeExpressionChild(MultiplicativeExpressionChild object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Unary Expression Child</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Unary Expression Child</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUnaryExpressionChild(UnaryExpressionChild object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Unary Modification Expression Child</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Unary Modification Expression Child</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUnaryModificationExpressionChild(UnaryModificationExpressionChild object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Primary Expression</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Primary Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePrimaryExpression(PrimaryExpression object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Call Type Argumentable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Call Type Argumentable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCallTypeArgumentable(CallTypeArgumentable object) {
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

} //ReferencesSwitch
