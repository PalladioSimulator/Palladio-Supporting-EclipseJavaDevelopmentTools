/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.instantiations.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationValue;

import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayInitializationValue;

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

import org.palladiosimulator.jdt.metamodel.javamodel.generics.CallTypeArgumentable;
import org.palladiosimulator.jdt.metamodel.javamodel.generics.TypeArgumentable;

import org.palladiosimulator.jdt.metamodel.javamodel.instantiations.*;

import org.palladiosimulator.jdt.metamodel.javamodel.references.Argumentable;
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
 * @see org.palladiosimulator.jdt.metamodel.javamodel.instantiations.InstantiationsPackage
 * @generated
 */
public class InstantiationsSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static InstantiationsPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InstantiationsSwitch() {
        if (modelPackage == null) {
            modelPackage = InstantiationsPackage.eINSTANCE;
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
        case InstantiationsPackage.INITIALIZABLE: {
            Initializable initializable = (Initializable) theEObject;
            T result = caseInitializable(initializable);
            if (result == null)
                result = caseCommentable(initializable);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case InstantiationsPackage.INSTANTIATION: {
            Instantiation instantiation = (Instantiation) theEObject;
            T result = caseInstantiation(instantiation);
            if (result == null)
                result = caseReference(instantiation);
            if (result == null)
                result = caseArgumentable(instantiation);
            if (result == null)
                result = casePrimaryExpression(instantiation);
            if (result == null)
                result = caseTypeArgumentable(instantiation);
            if (result == null)
                result = caseUnaryModificationExpressionChild(instantiation);
            if (result == null)
                result = caseUnaryExpressionChild(instantiation);
            if (result == null)
                result = caseMultiplicativeExpressionChild(instantiation);
            if (result == null)
                result = caseAdditiveExpressionChild(instantiation);
            if (result == null)
                result = caseShiftExpressionChild(instantiation);
            if (result == null)
                result = caseRelationExpressionChild(instantiation);
            if (result == null)
                result = caseInstanceOfExpressionChild(instantiation);
            if (result == null)
                result = caseEqualityExpressionChild(instantiation);
            if (result == null)
                result = caseAndExpressionChild(instantiation);
            if (result == null)
                result = caseExclusiveOrExpressionChild(instantiation);
            if (result == null)
                result = caseInclusiveOrExpressionChild(instantiation);
            if (result == null)
                result = caseConditionalAndExpressionChild(instantiation);
            if (result == null)
                result = caseConditionalOrExpressionChild(instantiation);
            if (result == null)
                result = caseConditionalExpressionChild(instantiation);
            if (result == null)
                result = caseAssignmentExpressionChild(instantiation);
            if (result == null)
                result = caseExpression(instantiation);
            if (result == null)
                result = caseArrayInitializationValue(instantiation);
            if (result == null)
                result = caseAnnotationValue(instantiation);
            if (result == null)
                result = caseCommentable(instantiation);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case InstantiationsPackage.NEW_CONSTRUCTOR_CALL: {
            NewConstructorCall newConstructorCall = (NewConstructorCall) theEObject;
            T result = caseNewConstructorCall(newConstructorCall);
            if (result == null)
                result = caseTypedElement(newConstructorCall);
            if (result == null)
                result = caseInstantiation(newConstructorCall);
            if (result == null)
                result = caseCallTypeArgumentable(newConstructorCall);
            if (result == null)
                result = caseReference(newConstructorCall);
            if (result == null)
                result = caseArgumentable(newConstructorCall);
            if (result == null)
                result = casePrimaryExpression(newConstructorCall);
            if (result == null)
                result = caseTypeArgumentable(newConstructorCall);
            if (result == null)
                result = caseUnaryModificationExpressionChild(newConstructorCall);
            if (result == null)
                result = caseUnaryExpressionChild(newConstructorCall);
            if (result == null)
                result = caseMultiplicativeExpressionChild(newConstructorCall);
            if (result == null)
                result = caseAdditiveExpressionChild(newConstructorCall);
            if (result == null)
                result = caseShiftExpressionChild(newConstructorCall);
            if (result == null)
                result = caseRelationExpressionChild(newConstructorCall);
            if (result == null)
                result = caseInstanceOfExpressionChild(newConstructorCall);
            if (result == null)
                result = caseEqualityExpressionChild(newConstructorCall);
            if (result == null)
                result = caseAndExpressionChild(newConstructorCall);
            if (result == null)
                result = caseExclusiveOrExpressionChild(newConstructorCall);
            if (result == null)
                result = caseInclusiveOrExpressionChild(newConstructorCall);
            if (result == null)
                result = caseConditionalAndExpressionChild(newConstructorCall);
            if (result == null)
                result = caseConditionalOrExpressionChild(newConstructorCall);
            if (result == null)
                result = caseConditionalExpressionChild(newConstructorCall);
            if (result == null)
                result = caseAssignmentExpressionChild(newConstructorCall);
            if (result == null)
                result = caseExpression(newConstructorCall);
            if (result == null)
                result = caseArrayInitializationValue(newConstructorCall);
            if (result == null)
                result = caseAnnotationValue(newConstructorCall);
            if (result == null)
                result = caseCommentable(newConstructorCall);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case InstantiationsPackage.EXPLICIT_CONSTRUCTOR_CALL: {
            ExplicitConstructorCall explicitConstructorCall = (ExplicitConstructorCall) theEObject;
            T result = caseExplicitConstructorCall(explicitConstructorCall);
            if (result == null)
                result = caseInstantiation(explicitConstructorCall);
            if (result == null)
                result = caseReference(explicitConstructorCall);
            if (result == null)
                result = caseArgumentable(explicitConstructorCall);
            if (result == null)
                result = casePrimaryExpression(explicitConstructorCall);
            if (result == null)
                result = caseTypeArgumentable(explicitConstructorCall);
            if (result == null)
                result = caseUnaryModificationExpressionChild(explicitConstructorCall);
            if (result == null)
                result = caseUnaryExpressionChild(explicitConstructorCall);
            if (result == null)
                result = caseMultiplicativeExpressionChild(explicitConstructorCall);
            if (result == null)
                result = caseAdditiveExpressionChild(explicitConstructorCall);
            if (result == null)
                result = caseShiftExpressionChild(explicitConstructorCall);
            if (result == null)
                result = caseRelationExpressionChild(explicitConstructorCall);
            if (result == null)
                result = caseInstanceOfExpressionChild(explicitConstructorCall);
            if (result == null)
                result = caseEqualityExpressionChild(explicitConstructorCall);
            if (result == null)
                result = caseAndExpressionChild(explicitConstructorCall);
            if (result == null)
                result = caseExclusiveOrExpressionChild(explicitConstructorCall);
            if (result == null)
                result = caseInclusiveOrExpressionChild(explicitConstructorCall);
            if (result == null)
                result = caseConditionalAndExpressionChild(explicitConstructorCall);
            if (result == null)
                result = caseConditionalOrExpressionChild(explicitConstructorCall);
            if (result == null)
                result = caseConditionalExpressionChild(explicitConstructorCall);
            if (result == null)
                result = caseAssignmentExpressionChild(explicitConstructorCall);
            if (result == null)
                result = caseExpression(explicitConstructorCall);
            if (result == null)
                result = caseArrayInitializationValue(explicitConstructorCall);
            if (result == null)
                result = caseAnnotationValue(explicitConstructorCall);
            if (result == null)
                result = caseCommentable(explicitConstructorCall);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        default:
            return defaultCase(theEObject);
        }
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
     * Returns the result of interpreting the object as an instance of '<em>Instantiation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Instantiation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInstantiation(Instantiation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>New Constructor Call</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>New Constructor Call</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNewConstructorCall(NewConstructorCall object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Explicit Constructor Call</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Explicit Constructor Call</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExplicitConstructorCall(ExplicitConstructorCall object) {
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

} //InstantiationsSwitch
