/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.arrays.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationValue;

import org.palladiosimulator.jdt.metamodel.javamodel.arrays.*;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable;

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

import org.palladiosimulator.jdt.metamodel.javamodel.generics.TypeArgumentable;

import org.palladiosimulator.jdt.metamodel.javamodel.references.Reference;

import org.palladiosimulator.jdt.metamodel.javamodel.types.TypedElement;

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
 * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArraysPackage
 * @generated
 */
public class ArraysSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static ArraysPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ArraysSwitch() {
        if (modelPackage == null) {
            modelPackage = ArraysPackage.eINSTANCE;
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
        case ArraysPackage.ARRAY_TYPEABLE: {
            ArrayTypeable arrayTypeable = (ArrayTypeable) theEObject;
            T result = caseArrayTypeable(arrayTypeable);
            if (result == null)
                result = caseCommentable(arrayTypeable);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ArraysPackage.ARRAY_DIMENSION: {
            ArrayDimension arrayDimension = (ArrayDimension) theEObject;
            T result = caseArrayDimension(arrayDimension);
            if (result == null)
                result = caseCommentable(arrayDimension);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ArraysPackage.ARRAY_INITIALIZER: {
            ArrayInitializer arrayInitializer = (ArrayInitializer) theEObject;
            T result = caseArrayInitializer(arrayInitializer);
            if (result == null)
                result = caseArrayInitializationValue(arrayInitializer);
            if (result == null)
                result = caseAnnotationValue(arrayInitializer);
            if (result == null)
                result = caseCommentable(arrayInitializer);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ArraysPackage.ARRAY_INITIALIZATION_VALUE: {
            ArrayInitializationValue arrayInitializationValue = (ArrayInitializationValue) theEObject;
            T result = caseArrayInitializationValue(arrayInitializationValue);
            if (result == null)
                result = caseCommentable(arrayInitializationValue);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ArraysPackage.ARRAY_INSTANTIATION: {
            ArrayInstantiation arrayInstantiation = (ArrayInstantiation) theEObject;
            T result = caseArrayInstantiation(arrayInstantiation);
            if (result == null)
                result = caseReference(arrayInstantiation);
            if (result == null)
                result = caseArrayInitializationValue(arrayInstantiation);
            if (result == null)
                result = caseAnnotationValue(arrayInstantiation);
            if (result == null)
                result = casePrimaryExpression(arrayInstantiation);
            if (result == null)
                result = caseTypeArgumentable(arrayInstantiation);
            if (result == null)
                result = caseCommentable(arrayInstantiation);
            if (result == null)
                result = caseUnaryModificationExpressionChild(arrayInstantiation);
            if (result == null)
                result = caseUnaryExpressionChild(arrayInstantiation);
            if (result == null)
                result = caseMultiplicativeExpressionChild(arrayInstantiation);
            if (result == null)
                result = caseAdditiveExpressionChild(arrayInstantiation);
            if (result == null)
                result = caseShiftExpressionChild(arrayInstantiation);
            if (result == null)
                result = caseRelationExpressionChild(arrayInstantiation);
            if (result == null)
                result = caseInstanceOfExpressionChild(arrayInstantiation);
            if (result == null)
                result = caseEqualityExpressionChild(arrayInstantiation);
            if (result == null)
                result = caseAndExpressionChild(arrayInstantiation);
            if (result == null)
                result = caseExclusiveOrExpressionChild(arrayInstantiation);
            if (result == null)
                result = caseInclusiveOrExpressionChild(arrayInstantiation);
            if (result == null)
                result = caseConditionalAndExpressionChild(arrayInstantiation);
            if (result == null)
                result = caseConditionalOrExpressionChild(arrayInstantiation);
            if (result == null)
                result = caseConditionalExpressionChild(arrayInstantiation);
            if (result == null)
                result = caseAssignmentExpressionChild(arrayInstantiation);
            if (result == null)
                result = caseExpression(arrayInstantiation);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ArraysPackage.ARRAY_INSTANTIATION_BY_SIZE: {
            ArrayInstantiationBySize arrayInstantiationBySize = (ArrayInstantiationBySize) theEObject;
            T result = caseArrayInstantiationBySize(arrayInstantiationBySize);
            if (result == null)
                result = caseArrayInstantiation(arrayInstantiationBySize);
            if (result == null)
                result = caseTypedElement(arrayInstantiationBySize);
            if (result == null)
                result = caseArrayTypeable(arrayInstantiationBySize);
            if (result == null)
                result = caseReference(arrayInstantiationBySize);
            if (result == null)
                result = caseArrayInitializationValue(arrayInstantiationBySize);
            if (result == null)
                result = caseAnnotationValue(arrayInstantiationBySize);
            if (result == null)
                result = casePrimaryExpression(arrayInstantiationBySize);
            if (result == null)
                result = caseTypeArgumentable(arrayInstantiationBySize);
            if (result == null)
                result = caseCommentable(arrayInstantiationBySize);
            if (result == null)
                result = caseUnaryModificationExpressionChild(arrayInstantiationBySize);
            if (result == null)
                result = caseUnaryExpressionChild(arrayInstantiationBySize);
            if (result == null)
                result = caseMultiplicativeExpressionChild(arrayInstantiationBySize);
            if (result == null)
                result = caseAdditiveExpressionChild(arrayInstantiationBySize);
            if (result == null)
                result = caseShiftExpressionChild(arrayInstantiationBySize);
            if (result == null)
                result = caseRelationExpressionChild(arrayInstantiationBySize);
            if (result == null)
                result = caseInstanceOfExpressionChild(arrayInstantiationBySize);
            if (result == null)
                result = caseEqualityExpressionChild(arrayInstantiationBySize);
            if (result == null)
                result = caseAndExpressionChild(arrayInstantiationBySize);
            if (result == null)
                result = caseExclusiveOrExpressionChild(arrayInstantiationBySize);
            if (result == null)
                result = caseInclusiveOrExpressionChild(arrayInstantiationBySize);
            if (result == null)
                result = caseConditionalAndExpressionChild(arrayInstantiationBySize);
            if (result == null)
                result = caseConditionalOrExpressionChild(arrayInstantiationBySize);
            if (result == null)
                result = caseConditionalExpressionChild(arrayInstantiationBySize);
            if (result == null)
                result = caseAssignmentExpressionChild(arrayInstantiationBySize);
            if (result == null)
                result = caseExpression(arrayInstantiationBySize);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ArraysPackage.ARRAY_INSTANTIATION_BY_VALUES: {
            ArrayInstantiationByValues arrayInstantiationByValues = (ArrayInstantiationByValues) theEObject;
            T result = caseArrayInstantiationByValues(arrayInstantiationByValues);
            if (result == null)
                result = caseArrayInstantiation(arrayInstantiationByValues);
            if (result == null)
                result = caseReference(arrayInstantiationByValues);
            if (result == null)
                result = caseArrayInitializationValue(arrayInstantiationByValues);
            if (result == null)
                result = caseAnnotationValue(arrayInstantiationByValues);
            if (result == null)
                result = casePrimaryExpression(arrayInstantiationByValues);
            if (result == null)
                result = caseTypeArgumentable(arrayInstantiationByValues);
            if (result == null)
                result = caseCommentable(arrayInstantiationByValues);
            if (result == null)
                result = caseUnaryModificationExpressionChild(arrayInstantiationByValues);
            if (result == null)
                result = caseUnaryExpressionChild(arrayInstantiationByValues);
            if (result == null)
                result = caseMultiplicativeExpressionChild(arrayInstantiationByValues);
            if (result == null)
                result = caseAdditiveExpressionChild(arrayInstantiationByValues);
            if (result == null)
                result = caseShiftExpressionChild(arrayInstantiationByValues);
            if (result == null)
                result = caseRelationExpressionChild(arrayInstantiationByValues);
            if (result == null)
                result = caseInstanceOfExpressionChild(arrayInstantiationByValues);
            if (result == null)
                result = caseEqualityExpressionChild(arrayInstantiationByValues);
            if (result == null)
                result = caseAndExpressionChild(arrayInstantiationByValues);
            if (result == null)
                result = caseExclusiveOrExpressionChild(arrayInstantiationByValues);
            if (result == null)
                result = caseInclusiveOrExpressionChild(arrayInstantiationByValues);
            if (result == null)
                result = caseConditionalAndExpressionChild(arrayInstantiationByValues);
            if (result == null)
                result = caseConditionalOrExpressionChild(arrayInstantiationByValues);
            if (result == null)
                result = caseConditionalExpressionChild(arrayInstantiationByValues);
            if (result == null)
                result = caseAssignmentExpressionChild(arrayInstantiationByValues);
            if (result == null)
                result = caseExpression(arrayInstantiationByValues);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ArraysPackage.ARRAY_INSTANTIATION_BY_VALUES_UNTYPED: {
            ArrayInstantiationByValuesUntyped arrayInstantiationByValuesUntyped = (ArrayInstantiationByValuesUntyped) theEObject;
            T result = caseArrayInstantiationByValuesUntyped(arrayInstantiationByValuesUntyped);
            if (result == null)
                result = caseArrayInstantiationByValues(arrayInstantiationByValuesUntyped);
            if (result == null)
                result = caseArrayInstantiation(arrayInstantiationByValuesUntyped);
            if (result == null)
                result = caseReference(arrayInstantiationByValuesUntyped);
            if (result == null)
                result = caseArrayInitializationValue(arrayInstantiationByValuesUntyped);
            if (result == null)
                result = caseAnnotationValue(arrayInstantiationByValuesUntyped);
            if (result == null)
                result = casePrimaryExpression(arrayInstantiationByValuesUntyped);
            if (result == null)
                result = caseTypeArgumentable(arrayInstantiationByValuesUntyped);
            if (result == null)
                result = caseCommentable(arrayInstantiationByValuesUntyped);
            if (result == null)
                result = caseUnaryModificationExpressionChild(arrayInstantiationByValuesUntyped);
            if (result == null)
                result = caseUnaryExpressionChild(arrayInstantiationByValuesUntyped);
            if (result == null)
                result = caseMultiplicativeExpressionChild(arrayInstantiationByValuesUntyped);
            if (result == null)
                result = caseAdditiveExpressionChild(arrayInstantiationByValuesUntyped);
            if (result == null)
                result = caseShiftExpressionChild(arrayInstantiationByValuesUntyped);
            if (result == null)
                result = caseRelationExpressionChild(arrayInstantiationByValuesUntyped);
            if (result == null)
                result = caseInstanceOfExpressionChild(arrayInstantiationByValuesUntyped);
            if (result == null)
                result = caseEqualityExpressionChild(arrayInstantiationByValuesUntyped);
            if (result == null)
                result = caseAndExpressionChild(arrayInstantiationByValuesUntyped);
            if (result == null)
                result = caseExclusiveOrExpressionChild(arrayInstantiationByValuesUntyped);
            if (result == null)
                result = caseInclusiveOrExpressionChild(arrayInstantiationByValuesUntyped);
            if (result == null)
                result = caseConditionalAndExpressionChild(arrayInstantiationByValuesUntyped);
            if (result == null)
                result = caseConditionalOrExpressionChild(arrayInstantiationByValuesUntyped);
            if (result == null)
                result = caseConditionalExpressionChild(arrayInstantiationByValuesUntyped);
            if (result == null)
                result = caseAssignmentExpressionChild(arrayInstantiationByValuesUntyped);
            if (result == null)
                result = caseExpression(arrayInstantiationByValuesUntyped);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ArraysPackage.ARRAY_INSTANTIATION_BY_VALUES_TYPED: {
            ArrayInstantiationByValuesTyped arrayInstantiationByValuesTyped = (ArrayInstantiationByValuesTyped) theEObject;
            T result = caseArrayInstantiationByValuesTyped(arrayInstantiationByValuesTyped);
            if (result == null)
                result = caseArrayInstantiationByValues(arrayInstantiationByValuesTyped);
            if (result == null)
                result = caseTypedElement(arrayInstantiationByValuesTyped);
            if (result == null)
                result = caseArrayTypeable(arrayInstantiationByValuesTyped);
            if (result == null)
                result = caseArrayInstantiation(arrayInstantiationByValuesTyped);
            if (result == null)
                result = caseReference(arrayInstantiationByValuesTyped);
            if (result == null)
                result = caseArrayInitializationValue(arrayInstantiationByValuesTyped);
            if (result == null)
                result = caseAnnotationValue(arrayInstantiationByValuesTyped);
            if (result == null)
                result = casePrimaryExpression(arrayInstantiationByValuesTyped);
            if (result == null)
                result = caseTypeArgumentable(arrayInstantiationByValuesTyped);
            if (result == null)
                result = caseCommentable(arrayInstantiationByValuesTyped);
            if (result == null)
                result = caseUnaryModificationExpressionChild(arrayInstantiationByValuesTyped);
            if (result == null)
                result = caseUnaryExpressionChild(arrayInstantiationByValuesTyped);
            if (result == null)
                result = caseMultiplicativeExpressionChild(arrayInstantiationByValuesTyped);
            if (result == null)
                result = caseAdditiveExpressionChild(arrayInstantiationByValuesTyped);
            if (result == null)
                result = caseShiftExpressionChild(arrayInstantiationByValuesTyped);
            if (result == null)
                result = caseRelationExpressionChild(arrayInstantiationByValuesTyped);
            if (result == null)
                result = caseInstanceOfExpressionChild(arrayInstantiationByValuesTyped);
            if (result == null)
                result = caseEqualityExpressionChild(arrayInstantiationByValuesTyped);
            if (result == null)
                result = caseAndExpressionChild(arrayInstantiationByValuesTyped);
            if (result == null)
                result = caseExclusiveOrExpressionChild(arrayInstantiationByValuesTyped);
            if (result == null)
                result = caseInclusiveOrExpressionChild(arrayInstantiationByValuesTyped);
            if (result == null)
                result = caseConditionalAndExpressionChild(arrayInstantiationByValuesTyped);
            if (result == null)
                result = caseConditionalOrExpressionChild(arrayInstantiationByValuesTyped);
            if (result == null)
                result = caseConditionalExpressionChild(arrayInstantiationByValuesTyped);
            if (result == null)
                result = caseAssignmentExpressionChild(arrayInstantiationByValuesTyped);
            if (result == null)
                result = caseExpression(arrayInstantiationByValuesTyped);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ArraysPackage.ARRAY_SELECTOR: {
            ArraySelector arraySelector = (ArraySelector) theEObject;
            T result = caseArraySelector(arraySelector);
            if (result == null)
                result = caseCommentable(arraySelector);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        default:
            return defaultCase(theEObject);
        }
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
     * Returns the result of interpreting the object as an instance of '<em>Array Dimension</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Array Dimension</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseArrayDimension(ArrayDimension object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Array Initializer</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Array Initializer</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseArrayInitializer(ArrayInitializer object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Array Instantiation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Array Instantiation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseArrayInstantiation(ArrayInstantiation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Array Instantiation By Size</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Array Instantiation By Size</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseArrayInstantiationBySize(ArrayInstantiationBySize object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Array Instantiation By Values</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Array Instantiation By Values</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseArrayInstantiationByValues(ArrayInstantiationByValues object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Array Instantiation By Values Untyped</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Array Instantiation By Values Untyped</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseArrayInstantiationByValuesUntyped(ArrayInstantiationByValuesUntyped object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Array Instantiation By Values Typed</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Array Instantiation By Values Typed</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseArrayInstantiationByValuesTyped(ArrayInstantiationByValuesTyped object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Array Selector</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Array Selector</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseArraySelector(ArraySelector object) {
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

} //ArraysSwitch
