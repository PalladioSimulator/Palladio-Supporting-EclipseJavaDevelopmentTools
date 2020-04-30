/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.expressions.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationValue;

import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayInitializationValue;
import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayTypeable;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable;

import org.palladiosimulator.jdt.metamodel.javamodel.expressions.*;

import org.palladiosimulator.jdt.metamodel.javamodel.generics.TypeArgumentable;

import org.palladiosimulator.jdt.metamodel.javamodel.references.Reference;

import org.palladiosimulator.jdt.metamodel.javamodel.statements.ForLoopInitializer;

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
 * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExpressionsPackage
 * @generated
 */
public class ExpressionsSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static ExpressionsPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExpressionsSwitch() {
        if (modelPackage == null) {
            modelPackage = ExpressionsPackage.eINSTANCE;
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
        case ExpressionsPackage.EXPRESSION_LIST: {
            ExpressionList expressionList = (ExpressionList) theEObject;
            T result = caseExpressionList(expressionList);
            if (result == null)
                result = caseForLoopInitializer(expressionList);
            if (result == null)
                result = caseCommentable(expressionList);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ExpressionsPackage.EXPRESSION: {
            Expression expression = (Expression) theEObject;
            T result = caseExpression(expression);
            if (result == null)
                result = caseArrayInitializationValue(expression);
            if (result == null)
                result = caseAnnotationValue(expression);
            if (result == null)
                result = caseCommentable(expression);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ExpressionsPackage.ASSIGNMENT_EXPRESSION: {
            AssignmentExpression assignmentExpression = (AssignmentExpression) theEObject;
            T result = caseAssignmentExpression(assignmentExpression);
            if (result == null)
                result = caseExpression(assignmentExpression);
            if (result == null)
                result = caseArrayInitializationValue(assignmentExpression);
            if (result == null)
                result = caseAnnotationValue(assignmentExpression);
            if (result == null)
                result = caseCommentable(assignmentExpression);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ExpressionsPackage.ASSIGNMENT_EXPRESSION_CHILD: {
            AssignmentExpressionChild assignmentExpressionChild = (AssignmentExpressionChild) theEObject;
            T result = caseAssignmentExpressionChild(assignmentExpressionChild);
            if (result == null)
                result = caseExpression(assignmentExpressionChild);
            if (result == null)
                result = caseArrayInitializationValue(assignmentExpressionChild);
            if (result == null)
                result = caseAnnotationValue(assignmentExpressionChild);
            if (result == null)
                result = caseCommentable(assignmentExpressionChild);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ExpressionsPackage.CONDITIONAL_EXPRESSION: {
            ConditionalExpression conditionalExpression = (ConditionalExpression) theEObject;
            T result = caseConditionalExpression(conditionalExpression);
            if (result == null)
                result = caseAssignmentExpressionChild(conditionalExpression);
            if (result == null)
                result = caseExpression(conditionalExpression);
            if (result == null)
                result = caseArrayInitializationValue(conditionalExpression);
            if (result == null)
                result = caseAnnotationValue(conditionalExpression);
            if (result == null)
                result = caseCommentable(conditionalExpression);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ExpressionsPackage.CONDITIONAL_EXPRESSION_CHILD: {
            ConditionalExpressionChild conditionalExpressionChild = (ConditionalExpressionChild) theEObject;
            T result = caseConditionalExpressionChild(conditionalExpressionChild);
            if (result == null)
                result = caseAssignmentExpressionChild(conditionalExpressionChild);
            if (result == null)
                result = caseExpression(conditionalExpressionChild);
            if (result == null)
                result = caseArrayInitializationValue(conditionalExpressionChild);
            if (result == null)
                result = caseAnnotationValue(conditionalExpressionChild);
            if (result == null)
                result = caseCommentable(conditionalExpressionChild);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ExpressionsPackage.CONDITIONAL_OR_EXPRESSION: {
            ConditionalOrExpression conditionalOrExpression = (ConditionalOrExpression) theEObject;
            T result = caseConditionalOrExpression(conditionalOrExpression);
            if (result == null)
                result = caseConditionalExpressionChild(conditionalOrExpression);
            if (result == null)
                result = caseAssignmentExpressionChild(conditionalOrExpression);
            if (result == null)
                result = caseExpression(conditionalOrExpression);
            if (result == null)
                result = caseArrayInitializationValue(conditionalOrExpression);
            if (result == null)
                result = caseAnnotationValue(conditionalOrExpression);
            if (result == null)
                result = caseCommentable(conditionalOrExpression);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ExpressionsPackage.CONDITIONAL_OR_EXPRESSION_CHILD: {
            ConditionalOrExpressionChild conditionalOrExpressionChild = (ConditionalOrExpressionChild) theEObject;
            T result = caseConditionalOrExpressionChild(conditionalOrExpressionChild);
            if (result == null)
                result = caseConditionalExpressionChild(conditionalOrExpressionChild);
            if (result == null)
                result = caseAssignmentExpressionChild(conditionalOrExpressionChild);
            if (result == null)
                result = caseExpression(conditionalOrExpressionChild);
            if (result == null)
                result = caseArrayInitializationValue(conditionalOrExpressionChild);
            if (result == null)
                result = caseAnnotationValue(conditionalOrExpressionChild);
            if (result == null)
                result = caseCommentable(conditionalOrExpressionChild);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ExpressionsPackage.CONDITIONAL_AND_EXPRESSION: {
            ConditionalAndExpression conditionalAndExpression = (ConditionalAndExpression) theEObject;
            T result = caseConditionalAndExpression(conditionalAndExpression);
            if (result == null)
                result = caseConditionalOrExpressionChild(conditionalAndExpression);
            if (result == null)
                result = caseConditionalExpressionChild(conditionalAndExpression);
            if (result == null)
                result = caseAssignmentExpressionChild(conditionalAndExpression);
            if (result == null)
                result = caseExpression(conditionalAndExpression);
            if (result == null)
                result = caseArrayInitializationValue(conditionalAndExpression);
            if (result == null)
                result = caseAnnotationValue(conditionalAndExpression);
            if (result == null)
                result = caseCommentable(conditionalAndExpression);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ExpressionsPackage.CONDITIONAL_AND_EXPRESSION_CHILD: {
            ConditionalAndExpressionChild conditionalAndExpressionChild = (ConditionalAndExpressionChild) theEObject;
            T result = caseConditionalAndExpressionChild(conditionalAndExpressionChild);
            if (result == null)
                result = caseConditionalOrExpressionChild(conditionalAndExpressionChild);
            if (result == null)
                result = caseConditionalExpressionChild(conditionalAndExpressionChild);
            if (result == null)
                result = caseAssignmentExpressionChild(conditionalAndExpressionChild);
            if (result == null)
                result = caseExpression(conditionalAndExpressionChild);
            if (result == null)
                result = caseArrayInitializationValue(conditionalAndExpressionChild);
            if (result == null)
                result = caseAnnotationValue(conditionalAndExpressionChild);
            if (result == null)
                result = caseCommentable(conditionalAndExpressionChild);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ExpressionsPackage.INCLUSIVE_OR_EXPRESSION: {
            InclusiveOrExpression inclusiveOrExpression = (InclusiveOrExpression) theEObject;
            T result = caseInclusiveOrExpression(inclusiveOrExpression);
            if (result == null)
                result = caseConditionalAndExpressionChild(inclusiveOrExpression);
            if (result == null)
                result = caseConditionalOrExpressionChild(inclusiveOrExpression);
            if (result == null)
                result = caseConditionalExpressionChild(inclusiveOrExpression);
            if (result == null)
                result = caseAssignmentExpressionChild(inclusiveOrExpression);
            if (result == null)
                result = caseExpression(inclusiveOrExpression);
            if (result == null)
                result = caseArrayInitializationValue(inclusiveOrExpression);
            if (result == null)
                result = caseAnnotationValue(inclusiveOrExpression);
            if (result == null)
                result = caseCommentable(inclusiveOrExpression);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ExpressionsPackage.INCLUSIVE_OR_EXPRESSION_CHILD: {
            InclusiveOrExpressionChild inclusiveOrExpressionChild = (InclusiveOrExpressionChild) theEObject;
            T result = caseInclusiveOrExpressionChild(inclusiveOrExpressionChild);
            if (result == null)
                result = caseConditionalAndExpressionChild(inclusiveOrExpressionChild);
            if (result == null)
                result = caseConditionalOrExpressionChild(inclusiveOrExpressionChild);
            if (result == null)
                result = caseConditionalExpressionChild(inclusiveOrExpressionChild);
            if (result == null)
                result = caseAssignmentExpressionChild(inclusiveOrExpressionChild);
            if (result == null)
                result = caseExpression(inclusiveOrExpressionChild);
            if (result == null)
                result = caseArrayInitializationValue(inclusiveOrExpressionChild);
            if (result == null)
                result = caseAnnotationValue(inclusiveOrExpressionChild);
            if (result == null)
                result = caseCommentable(inclusiveOrExpressionChild);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ExpressionsPackage.EXCLUSIVE_OR_EXPRESSION: {
            ExclusiveOrExpression exclusiveOrExpression = (ExclusiveOrExpression) theEObject;
            T result = caseExclusiveOrExpression(exclusiveOrExpression);
            if (result == null)
                result = caseInclusiveOrExpressionChild(exclusiveOrExpression);
            if (result == null)
                result = caseConditionalAndExpressionChild(exclusiveOrExpression);
            if (result == null)
                result = caseConditionalOrExpressionChild(exclusiveOrExpression);
            if (result == null)
                result = caseConditionalExpressionChild(exclusiveOrExpression);
            if (result == null)
                result = caseAssignmentExpressionChild(exclusiveOrExpression);
            if (result == null)
                result = caseExpression(exclusiveOrExpression);
            if (result == null)
                result = caseArrayInitializationValue(exclusiveOrExpression);
            if (result == null)
                result = caseAnnotationValue(exclusiveOrExpression);
            if (result == null)
                result = caseCommentable(exclusiveOrExpression);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ExpressionsPackage.EXCLUSIVE_OR_EXPRESSION_CHILD: {
            ExclusiveOrExpressionChild exclusiveOrExpressionChild = (ExclusiveOrExpressionChild) theEObject;
            T result = caseExclusiveOrExpressionChild(exclusiveOrExpressionChild);
            if (result == null)
                result = caseInclusiveOrExpressionChild(exclusiveOrExpressionChild);
            if (result == null)
                result = caseConditionalAndExpressionChild(exclusiveOrExpressionChild);
            if (result == null)
                result = caseConditionalOrExpressionChild(exclusiveOrExpressionChild);
            if (result == null)
                result = caseConditionalExpressionChild(exclusiveOrExpressionChild);
            if (result == null)
                result = caseAssignmentExpressionChild(exclusiveOrExpressionChild);
            if (result == null)
                result = caseExpression(exclusiveOrExpressionChild);
            if (result == null)
                result = caseArrayInitializationValue(exclusiveOrExpressionChild);
            if (result == null)
                result = caseAnnotationValue(exclusiveOrExpressionChild);
            if (result == null)
                result = caseCommentable(exclusiveOrExpressionChild);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ExpressionsPackage.AND_EXPRESSION: {
            AndExpression andExpression = (AndExpression) theEObject;
            T result = caseAndExpression(andExpression);
            if (result == null)
                result = caseExclusiveOrExpressionChild(andExpression);
            if (result == null)
                result = caseInclusiveOrExpressionChild(andExpression);
            if (result == null)
                result = caseConditionalAndExpressionChild(andExpression);
            if (result == null)
                result = caseConditionalOrExpressionChild(andExpression);
            if (result == null)
                result = caseConditionalExpressionChild(andExpression);
            if (result == null)
                result = caseAssignmentExpressionChild(andExpression);
            if (result == null)
                result = caseExpression(andExpression);
            if (result == null)
                result = caseArrayInitializationValue(andExpression);
            if (result == null)
                result = caseAnnotationValue(andExpression);
            if (result == null)
                result = caseCommentable(andExpression);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ExpressionsPackage.AND_EXPRESSION_CHILD: {
            AndExpressionChild andExpressionChild = (AndExpressionChild) theEObject;
            T result = caseAndExpressionChild(andExpressionChild);
            if (result == null)
                result = caseExclusiveOrExpressionChild(andExpressionChild);
            if (result == null)
                result = caseInclusiveOrExpressionChild(andExpressionChild);
            if (result == null)
                result = caseConditionalAndExpressionChild(andExpressionChild);
            if (result == null)
                result = caseConditionalOrExpressionChild(andExpressionChild);
            if (result == null)
                result = caseConditionalExpressionChild(andExpressionChild);
            if (result == null)
                result = caseAssignmentExpressionChild(andExpressionChild);
            if (result == null)
                result = caseExpression(andExpressionChild);
            if (result == null)
                result = caseArrayInitializationValue(andExpressionChild);
            if (result == null)
                result = caseAnnotationValue(andExpressionChild);
            if (result == null)
                result = caseCommentable(andExpressionChild);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ExpressionsPackage.EQUALITY_EXPRESSION: {
            EqualityExpression equalityExpression = (EqualityExpression) theEObject;
            T result = caseEqualityExpression(equalityExpression);
            if (result == null)
                result = caseAndExpressionChild(equalityExpression);
            if (result == null)
                result = caseExclusiveOrExpressionChild(equalityExpression);
            if (result == null)
                result = caseInclusiveOrExpressionChild(equalityExpression);
            if (result == null)
                result = caseConditionalAndExpressionChild(equalityExpression);
            if (result == null)
                result = caseConditionalOrExpressionChild(equalityExpression);
            if (result == null)
                result = caseConditionalExpressionChild(equalityExpression);
            if (result == null)
                result = caseAssignmentExpressionChild(equalityExpression);
            if (result == null)
                result = caseExpression(equalityExpression);
            if (result == null)
                result = caseArrayInitializationValue(equalityExpression);
            if (result == null)
                result = caseAnnotationValue(equalityExpression);
            if (result == null)
                result = caseCommentable(equalityExpression);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ExpressionsPackage.EQUALITY_EXPRESSION_CHILD: {
            EqualityExpressionChild equalityExpressionChild = (EqualityExpressionChild) theEObject;
            T result = caseEqualityExpressionChild(equalityExpressionChild);
            if (result == null)
                result = caseAndExpressionChild(equalityExpressionChild);
            if (result == null)
                result = caseExclusiveOrExpressionChild(equalityExpressionChild);
            if (result == null)
                result = caseInclusiveOrExpressionChild(equalityExpressionChild);
            if (result == null)
                result = caseConditionalAndExpressionChild(equalityExpressionChild);
            if (result == null)
                result = caseConditionalOrExpressionChild(equalityExpressionChild);
            if (result == null)
                result = caseConditionalExpressionChild(equalityExpressionChild);
            if (result == null)
                result = caseAssignmentExpressionChild(equalityExpressionChild);
            if (result == null)
                result = caseExpression(equalityExpressionChild);
            if (result == null)
                result = caseArrayInitializationValue(equalityExpressionChild);
            if (result == null)
                result = caseAnnotationValue(equalityExpressionChild);
            if (result == null)
                result = caseCommentable(equalityExpressionChild);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ExpressionsPackage.INSTANCE_OF_EXPRESSION: {
            InstanceOfExpression instanceOfExpression = (InstanceOfExpression) theEObject;
            T result = caseInstanceOfExpression(instanceOfExpression);
            if (result == null)
                result = caseArrayTypeable(instanceOfExpression);
            if (result == null)
                result = caseTypedElement(instanceOfExpression);
            if (result == null)
                result = caseEqualityExpressionChild(instanceOfExpression);
            if (result == null)
                result = caseAndExpressionChild(instanceOfExpression);
            if (result == null)
                result = caseExclusiveOrExpressionChild(instanceOfExpression);
            if (result == null)
                result = caseInclusiveOrExpressionChild(instanceOfExpression);
            if (result == null)
                result = caseConditionalAndExpressionChild(instanceOfExpression);
            if (result == null)
                result = caseConditionalOrExpressionChild(instanceOfExpression);
            if (result == null)
                result = caseConditionalExpressionChild(instanceOfExpression);
            if (result == null)
                result = caseAssignmentExpressionChild(instanceOfExpression);
            if (result == null)
                result = caseExpression(instanceOfExpression);
            if (result == null)
                result = caseArrayInitializationValue(instanceOfExpression);
            if (result == null)
                result = caseAnnotationValue(instanceOfExpression);
            if (result == null)
                result = caseCommentable(instanceOfExpression);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ExpressionsPackage.INSTANCE_OF_EXPRESSION_CHILD: {
            InstanceOfExpressionChild instanceOfExpressionChild = (InstanceOfExpressionChild) theEObject;
            T result = caseInstanceOfExpressionChild(instanceOfExpressionChild);
            if (result == null)
                result = caseEqualityExpressionChild(instanceOfExpressionChild);
            if (result == null)
                result = caseAndExpressionChild(instanceOfExpressionChild);
            if (result == null)
                result = caseExclusiveOrExpressionChild(instanceOfExpressionChild);
            if (result == null)
                result = caseInclusiveOrExpressionChild(instanceOfExpressionChild);
            if (result == null)
                result = caseConditionalAndExpressionChild(instanceOfExpressionChild);
            if (result == null)
                result = caseConditionalOrExpressionChild(instanceOfExpressionChild);
            if (result == null)
                result = caseConditionalExpressionChild(instanceOfExpressionChild);
            if (result == null)
                result = caseAssignmentExpressionChild(instanceOfExpressionChild);
            if (result == null)
                result = caseExpression(instanceOfExpressionChild);
            if (result == null)
                result = caseArrayInitializationValue(instanceOfExpressionChild);
            if (result == null)
                result = caseAnnotationValue(instanceOfExpressionChild);
            if (result == null)
                result = caseCommentable(instanceOfExpressionChild);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ExpressionsPackage.RELATION_EXPRESSION: {
            RelationExpression relationExpression = (RelationExpression) theEObject;
            T result = caseRelationExpression(relationExpression);
            if (result == null)
                result = caseInstanceOfExpressionChild(relationExpression);
            if (result == null)
                result = caseEqualityExpressionChild(relationExpression);
            if (result == null)
                result = caseAndExpressionChild(relationExpression);
            if (result == null)
                result = caseExclusiveOrExpressionChild(relationExpression);
            if (result == null)
                result = caseInclusiveOrExpressionChild(relationExpression);
            if (result == null)
                result = caseConditionalAndExpressionChild(relationExpression);
            if (result == null)
                result = caseConditionalOrExpressionChild(relationExpression);
            if (result == null)
                result = caseConditionalExpressionChild(relationExpression);
            if (result == null)
                result = caseAssignmentExpressionChild(relationExpression);
            if (result == null)
                result = caseExpression(relationExpression);
            if (result == null)
                result = caseArrayInitializationValue(relationExpression);
            if (result == null)
                result = caseAnnotationValue(relationExpression);
            if (result == null)
                result = caseCommentable(relationExpression);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ExpressionsPackage.RELATION_EXPRESSION_CHILD: {
            RelationExpressionChild relationExpressionChild = (RelationExpressionChild) theEObject;
            T result = caseRelationExpressionChild(relationExpressionChild);
            if (result == null)
                result = caseInstanceOfExpressionChild(relationExpressionChild);
            if (result == null)
                result = caseEqualityExpressionChild(relationExpressionChild);
            if (result == null)
                result = caseAndExpressionChild(relationExpressionChild);
            if (result == null)
                result = caseExclusiveOrExpressionChild(relationExpressionChild);
            if (result == null)
                result = caseInclusiveOrExpressionChild(relationExpressionChild);
            if (result == null)
                result = caseConditionalAndExpressionChild(relationExpressionChild);
            if (result == null)
                result = caseConditionalOrExpressionChild(relationExpressionChild);
            if (result == null)
                result = caseConditionalExpressionChild(relationExpressionChild);
            if (result == null)
                result = caseAssignmentExpressionChild(relationExpressionChild);
            if (result == null)
                result = caseExpression(relationExpressionChild);
            if (result == null)
                result = caseArrayInitializationValue(relationExpressionChild);
            if (result == null)
                result = caseAnnotationValue(relationExpressionChild);
            if (result == null)
                result = caseCommentable(relationExpressionChild);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ExpressionsPackage.SHIFT_EXPRESSION: {
            ShiftExpression shiftExpression = (ShiftExpression) theEObject;
            T result = caseShiftExpression(shiftExpression);
            if (result == null)
                result = caseRelationExpressionChild(shiftExpression);
            if (result == null)
                result = caseInstanceOfExpressionChild(shiftExpression);
            if (result == null)
                result = caseEqualityExpressionChild(shiftExpression);
            if (result == null)
                result = caseAndExpressionChild(shiftExpression);
            if (result == null)
                result = caseExclusiveOrExpressionChild(shiftExpression);
            if (result == null)
                result = caseInclusiveOrExpressionChild(shiftExpression);
            if (result == null)
                result = caseConditionalAndExpressionChild(shiftExpression);
            if (result == null)
                result = caseConditionalOrExpressionChild(shiftExpression);
            if (result == null)
                result = caseConditionalExpressionChild(shiftExpression);
            if (result == null)
                result = caseAssignmentExpressionChild(shiftExpression);
            if (result == null)
                result = caseExpression(shiftExpression);
            if (result == null)
                result = caseArrayInitializationValue(shiftExpression);
            if (result == null)
                result = caseAnnotationValue(shiftExpression);
            if (result == null)
                result = caseCommentable(shiftExpression);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ExpressionsPackage.SHIFT_EXPRESSION_CHILD: {
            ShiftExpressionChild shiftExpressionChild = (ShiftExpressionChild) theEObject;
            T result = caseShiftExpressionChild(shiftExpressionChild);
            if (result == null)
                result = caseRelationExpressionChild(shiftExpressionChild);
            if (result == null)
                result = caseInstanceOfExpressionChild(shiftExpressionChild);
            if (result == null)
                result = caseEqualityExpressionChild(shiftExpressionChild);
            if (result == null)
                result = caseAndExpressionChild(shiftExpressionChild);
            if (result == null)
                result = caseExclusiveOrExpressionChild(shiftExpressionChild);
            if (result == null)
                result = caseInclusiveOrExpressionChild(shiftExpressionChild);
            if (result == null)
                result = caseConditionalAndExpressionChild(shiftExpressionChild);
            if (result == null)
                result = caseConditionalOrExpressionChild(shiftExpressionChild);
            if (result == null)
                result = caseConditionalExpressionChild(shiftExpressionChild);
            if (result == null)
                result = caseAssignmentExpressionChild(shiftExpressionChild);
            if (result == null)
                result = caseExpression(shiftExpressionChild);
            if (result == null)
                result = caseArrayInitializationValue(shiftExpressionChild);
            if (result == null)
                result = caseAnnotationValue(shiftExpressionChild);
            if (result == null)
                result = caseCommentable(shiftExpressionChild);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ExpressionsPackage.ADDITIVE_EXPRESSION: {
            AdditiveExpression additiveExpression = (AdditiveExpression) theEObject;
            T result = caseAdditiveExpression(additiveExpression);
            if (result == null)
                result = caseShiftExpressionChild(additiveExpression);
            if (result == null)
                result = caseRelationExpressionChild(additiveExpression);
            if (result == null)
                result = caseInstanceOfExpressionChild(additiveExpression);
            if (result == null)
                result = caseEqualityExpressionChild(additiveExpression);
            if (result == null)
                result = caseAndExpressionChild(additiveExpression);
            if (result == null)
                result = caseExclusiveOrExpressionChild(additiveExpression);
            if (result == null)
                result = caseInclusiveOrExpressionChild(additiveExpression);
            if (result == null)
                result = caseConditionalAndExpressionChild(additiveExpression);
            if (result == null)
                result = caseConditionalOrExpressionChild(additiveExpression);
            if (result == null)
                result = caseConditionalExpressionChild(additiveExpression);
            if (result == null)
                result = caseAssignmentExpressionChild(additiveExpression);
            if (result == null)
                result = caseExpression(additiveExpression);
            if (result == null)
                result = caseArrayInitializationValue(additiveExpression);
            if (result == null)
                result = caseAnnotationValue(additiveExpression);
            if (result == null)
                result = caseCommentable(additiveExpression);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ExpressionsPackage.ADDITIVE_EXPRESSION_CHILD: {
            AdditiveExpressionChild additiveExpressionChild = (AdditiveExpressionChild) theEObject;
            T result = caseAdditiveExpressionChild(additiveExpressionChild);
            if (result == null)
                result = caseShiftExpressionChild(additiveExpressionChild);
            if (result == null)
                result = caseRelationExpressionChild(additiveExpressionChild);
            if (result == null)
                result = caseInstanceOfExpressionChild(additiveExpressionChild);
            if (result == null)
                result = caseEqualityExpressionChild(additiveExpressionChild);
            if (result == null)
                result = caseAndExpressionChild(additiveExpressionChild);
            if (result == null)
                result = caseExclusiveOrExpressionChild(additiveExpressionChild);
            if (result == null)
                result = caseInclusiveOrExpressionChild(additiveExpressionChild);
            if (result == null)
                result = caseConditionalAndExpressionChild(additiveExpressionChild);
            if (result == null)
                result = caseConditionalOrExpressionChild(additiveExpressionChild);
            if (result == null)
                result = caseConditionalExpressionChild(additiveExpressionChild);
            if (result == null)
                result = caseAssignmentExpressionChild(additiveExpressionChild);
            if (result == null)
                result = caseExpression(additiveExpressionChild);
            if (result == null)
                result = caseArrayInitializationValue(additiveExpressionChild);
            if (result == null)
                result = caseAnnotationValue(additiveExpressionChild);
            if (result == null)
                result = caseCommentable(additiveExpressionChild);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ExpressionsPackage.MULTIPLICATIVE_EXPRESSION: {
            MultiplicativeExpression multiplicativeExpression = (MultiplicativeExpression) theEObject;
            T result = caseMultiplicativeExpression(multiplicativeExpression);
            if (result == null)
                result = caseAdditiveExpressionChild(multiplicativeExpression);
            if (result == null)
                result = caseShiftExpressionChild(multiplicativeExpression);
            if (result == null)
                result = caseRelationExpressionChild(multiplicativeExpression);
            if (result == null)
                result = caseInstanceOfExpressionChild(multiplicativeExpression);
            if (result == null)
                result = caseEqualityExpressionChild(multiplicativeExpression);
            if (result == null)
                result = caseAndExpressionChild(multiplicativeExpression);
            if (result == null)
                result = caseExclusiveOrExpressionChild(multiplicativeExpression);
            if (result == null)
                result = caseInclusiveOrExpressionChild(multiplicativeExpression);
            if (result == null)
                result = caseConditionalAndExpressionChild(multiplicativeExpression);
            if (result == null)
                result = caseConditionalOrExpressionChild(multiplicativeExpression);
            if (result == null)
                result = caseConditionalExpressionChild(multiplicativeExpression);
            if (result == null)
                result = caseAssignmentExpressionChild(multiplicativeExpression);
            if (result == null)
                result = caseExpression(multiplicativeExpression);
            if (result == null)
                result = caseArrayInitializationValue(multiplicativeExpression);
            if (result == null)
                result = caseAnnotationValue(multiplicativeExpression);
            if (result == null)
                result = caseCommentable(multiplicativeExpression);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ExpressionsPackage.MULTIPLICATIVE_EXPRESSION_CHILD: {
            MultiplicativeExpressionChild multiplicativeExpressionChild = (MultiplicativeExpressionChild) theEObject;
            T result = caseMultiplicativeExpressionChild(multiplicativeExpressionChild);
            if (result == null)
                result = caseAdditiveExpressionChild(multiplicativeExpressionChild);
            if (result == null)
                result = caseShiftExpressionChild(multiplicativeExpressionChild);
            if (result == null)
                result = caseRelationExpressionChild(multiplicativeExpressionChild);
            if (result == null)
                result = caseInstanceOfExpressionChild(multiplicativeExpressionChild);
            if (result == null)
                result = caseEqualityExpressionChild(multiplicativeExpressionChild);
            if (result == null)
                result = caseAndExpressionChild(multiplicativeExpressionChild);
            if (result == null)
                result = caseExclusiveOrExpressionChild(multiplicativeExpressionChild);
            if (result == null)
                result = caseInclusiveOrExpressionChild(multiplicativeExpressionChild);
            if (result == null)
                result = caseConditionalAndExpressionChild(multiplicativeExpressionChild);
            if (result == null)
                result = caseConditionalOrExpressionChild(multiplicativeExpressionChild);
            if (result == null)
                result = caseConditionalExpressionChild(multiplicativeExpressionChild);
            if (result == null)
                result = caseAssignmentExpressionChild(multiplicativeExpressionChild);
            if (result == null)
                result = caseExpression(multiplicativeExpressionChild);
            if (result == null)
                result = caseArrayInitializationValue(multiplicativeExpressionChild);
            if (result == null)
                result = caseAnnotationValue(multiplicativeExpressionChild);
            if (result == null)
                result = caseCommentable(multiplicativeExpressionChild);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ExpressionsPackage.UNARY_EXPRESSION: {
            UnaryExpression unaryExpression = (UnaryExpression) theEObject;
            T result = caseUnaryExpression(unaryExpression);
            if (result == null)
                result = caseMultiplicativeExpressionChild(unaryExpression);
            if (result == null)
                result = caseAdditiveExpressionChild(unaryExpression);
            if (result == null)
                result = caseShiftExpressionChild(unaryExpression);
            if (result == null)
                result = caseRelationExpressionChild(unaryExpression);
            if (result == null)
                result = caseInstanceOfExpressionChild(unaryExpression);
            if (result == null)
                result = caseEqualityExpressionChild(unaryExpression);
            if (result == null)
                result = caseAndExpressionChild(unaryExpression);
            if (result == null)
                result = caseExclusiveOrExpressionChild(unaryExpression);
            if (result == null)
                result = caseInclusiveOrExpressionChild(unaryExpression);
            if (result == null)
                result = caseConditionalAndExpressionChild(unaryExpression);
            if (result == null)
                result = caseConditionalOrExpressionChild(unaryExpression);
            if (result == null)
                result = caseConditionalExpressionChild(unaryExpression);
            if (result == null)
                result = caseAssignmentExpressionChild(unaryExpression);
            if (result == null)
                result = caseExpression(unaryExpression);
            if (result == null)
                result = caseArrayInitializationValue(unaryExpression);
            if (result == null)
                result = caseAnnotationValue(unaryExpression);
            if (result == null)
                result = caseCommentable(unaryExpression);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ExpressionsPackage.UNARY_EXPRESSION_CHILD: {
            UnaryExpressionChild unaryExpressionChild = (UnaryExpressionChild) theEObject;
            T result = caseUnaryExpressionChild(unaryExpressionChild);
            if (result == null)
                result = caseMultiplicativeExpressionChild(unaryExpressionChild);
            if (result == null)
                result = caseAdditiveExpressionChild(unaryExpressionChild);
            if (result == null)
                result = caseShiftExpressionChild(unaryExpressionChild);
            if (result == null)
                result = caseRelationExpressionChild(unaryExpressionChild);
            if (result == null)
                result = caseInstanceOfExpressionChild(unaryExpressionChild);
            if (result == null)
                result = caseEqualityExpressionChild(unaryExpressionChild);
            if (result == null)
                result = caseAndExpressionChild(unaryExpressionChild);
            if (result == null)
                result = caseExclusiveOrExpressionChild(unaryExpressionChild);
            if (result == null)
                result = caseInclusiveOrExpressionChild(unaryExpressionChild);
            if (result == null)
                result = caseConditionalAndExpressionChild(unaryExpressionChild);
            if (result == null)
                result = caseConditionalOrExpressionChild(unaryExpressionChild);
            if (result == null)
                result = caseConditionalExpressionChild(unaryExpressionChild);
            if (result == null)
                result = caseAssignmentExpressionChild(unaryExpressionChild);
            if (result == null)
                result = caseExpression(unaryExpressionChild);
            if (result == null)
                result = caseArrayInitializationValue(unaryExpressionChild);
            if (result == null)
                result = caseAnnotationValue(unaryExpressionChild);
            if (result == null)
                result = caseCommentable(unaryExpressionChild);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ExpressionsPackage.UNARY_MODIFICATION_EXPRESSION: {
            UnaryModificationExpression unaryModificationExpression = (UnaryModificationExpression) theEObject;
            T result = caseUnaryModificationExpression(unaryModificationExpression);
            if (result == null)
                result = caseUnaryExpressionChild(unaryModificationExpression);
            if (result == null)
                result = caseMultiplicativeExpressionChild(unaryModificationExpression);
            if (result == null)
                result = caseAdditiveExpressionChild(unaryModificationExpression);
            if (result == null)
                result = caseShiftExpressionChild(unaryModificationExpression);
            if (result == null)
                result = caseRelationExpressionChild(unaryModificationExpression);
            if (result == null)
                result = caseInstanceOfExpressionChild(unaryModificationExpression);
            if (result == null)
                result = caseEqualityExpressionChild(unaryModificationExpression);
            if (result == null)
                result = caseAndExpressionChild(unaryModificationExpression);
            if (result == null)
                result = caseExclusiveOrExpressionChild(unaryModificationExpression);
            if (result == null)
                result = caseInclusiveOrExpressionChild(unaryModificationExpression);
            if (result == null)
                result = caseConditionalAndExpressionChild(unaryModificationExpression);
            if (result == null)
                result = caseConditionalOrExpressionChild(unaryModificationExpression);
            if (result == null)
                result = caseConditionalExpressionChild(unaryModificationExpression);
            if (result == null)
                result = caseAssignmentExpressionChild(unaryModificationExpression);
            if (result == null)
                result = caseExpression(unaryModificationExpression);
            if (result == null)
                result = caseArrayInitializationValue(unaryModificationExpression);
            if (result == null)
                result = caseAnnotationValue(unaryModificationExpression);
            if (result == null)
                result = caseCommentable(unaryModificationExpression);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ExpressionsPackage.PREFIX_UNARY_MODIFICATION_EXPRESSION: {
            PrefixUnaryModificationExpression prefixUnaryModificationExpression = (PrefixUnaryModificationExpression) theEObject;
            T result = casePrefixUnaryModificationExpression(prefixUnaryModificationExpression);
            if (result == null)
                result = caseUnaryModificationExpression(prefixUnaryModificationExpression);
            if (result == null)
                result = caseUnaryExpressionChild(prefixUnaryModificationExpression);
            if (result == null)
                result = caseMultiplicativeExpressionChild(prefixUnaryModificationExpression);
            if (result == null)
                result = caseAdditiveExpressionChild(prefixUnaryModificationExpression);
            if (result == null)
                result = caseShiftExpressionChild(prefixUnaryModificationExpression);
            if (result == null)
                result = caseRelationExpressionChild(prefixUnaryModificationExpression);
            if (result == null)
                result = caseInstanceOfExpressionChild(prefixUnaryModificationExpression);
            if (result == null)
                result = caseEqualityExpressionChild(prefixUnaryModificationExpression);
            if (result == null)
                result = caseAndExpressionChild(prefixUnaryModificationExpression);
            if (result == null)
                result = caseExclusiveOrExpressionChild(prefixUnaryModificationExpression);
            if (result == null)
                result = caseInclusiveOrExpressionChild(prefixUnaryModificationExpression);
            if (result == null)
                result = caseConditionalAndExpressionChild(prefixUnaryModificationExpression);
            if (result == null)
                result = caseConditionalOrExpressionChild(prefixUnaryModificationExpression);
            if (result == null)
                result = caseConditionalExpressionChild(prefixUnaryModificationExpression);
            if (result == null)
                result = caseAssignmentExpressionChild(prefixUnaryModificationExpression);
            if (result == null)
                result = caseExpression(prefixUnaryModificationExpression);
            if (result == null)
                result = caseArrayInitializationValue(prefixUnaryModificationExpression);
            if (result == null)
                result = caseAnnotationValue(prefixUnaryModificationExpression);
            if (result == null)
                result = caseCommentable(prefixUnaryModificationExpression);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ExpressionsPackage.SUFFIX_UNARY_MODIFICATION_EXPRESSION: {
            SuffixUnaryModificationExpression suffixUnaryModificationExpression = (SuffixUnaryModificationExpression) theEObject;
            T result = caseSuffixUnaryModificationExpression(suffixUnaryModificationExpression);
            if (result == null)
                result = caseUnaryModificationExpression(suffixUnaryModificationExpression);
            if (result == null)
                result = caseUnaryExpressionChild(suffixUnaryModificationExpression);
            if (result == null)
                result = caseMultiplicativeExpressionChild(suffixUnaryModificationExpression);
            if (result == null)
                result = caseAdditiveExpressionChild(suffixUnaryModificationExpression);
            if (result == null)
                result = caseShiftExpressionChild(suffixUnaryModificationExpression);
            if (result == null)
                result = caseRelationExpressionChild(suffixUnaryModificationExpression);
            if (result == null)
                result = caseInstanceOfExpressionChild(suffixUnaryModificationExpression);
            if (result == null)
                result = caseEqualityExpressionChild(suffixUnaryModificationExpression);
            if (result == null)
                result = caseAndExpressionChild(suffixUnaryModificationExpression);
            if (result == null)
                result = caseExclusiveOrExpressionChild(suffixUnaryModificationExpression);
            if (result == null)
                result = caseInclusiveOrExpressionChild(suffixUnaryModificationExpression);
            if (result == null)
                result = caseConditionalAndExpressionChild(suffixUnaryModificationExpression);
            if (result == null)
                result = caseConditionalOrExpressionChild(suffixUnaryModificationExpression);
            if (result == null)
                result = caseConditionalExpressionChild(suffixUnaryModificationExpression);
            if (result == null)
                result = caseAssignmentExpressionChild(suffixUnaryModificationExpression);
            if (result == null)
                result = caseExpression(suffixUnaryModificationExpression);
            if (result == null)
                result = caseArrayInitializationValue(suffixUnaryModificationExpression);
            if (result == null)
                result = caseAnnotationValue(suffixUnaryModificationExpression);
            if (result == null)
                result = caseCommentable(suffixUnaryModificationExpression);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ExpressionsPackage.UNARY_MODIFICATION_EXPRESSION_CHILD: {
            UnaryModificationExpressionChild unaryModificationExpressionChild = (UnaryModificationExpressionChild) theEObject;
            T result = caseUnaryModificationExpressionChild(unaryModificationExpressionChild);
            if (result == null)
                result = caseUnaryExpressionChild(unaryModificationExpressionChild);
            if (result == null)
                result = caseMultiplicativeExpressionChild(unaryModificationExpressionChild);
            if (result == null)
                result = caseAdditiveExpressionChild(unaryModificationExpressionChild);
            if (result == null)
                result = caseShiftExpressionChild(unaryModificationExpressionChild);
            if (result == null)
                result = caseRelationExpressionChild(unaryModificationExpressionChild);
            if (result == null)
                result = caseInstanceOfExpressionChild(unaryModificationExpressionChild);
            if (result == null)
                result = caseEqualityExpressionChild(unaryModificationExpressionChild);
            if (result == null)
                result = caseAndExpressionChild(unaryModificationExpressionChild);
            if (result == null)
                result = caseExclusiveOrExpressionChild(unaryModificationExpressionChild);
            if (result == null)
                result = caseInclusiveOrExpressionChild(unaryModificationExpressionChild);
            if (result == null)
                result = caseConditionalAndExpressionChild(unaryModificationExpressionChild);
            if (result == null)
                result = caseConditionalOrExpressionChild(unaryModificationExpressionChild);
            if (result == null)
                result = caseConditionalExpressionChild(unaryModificationExpressionChild);
            if (result == null)
                result = caseAssignmentExpressionChild(unaryModificationExpressionChild);
            if (result == null)
                result = caseExpression(unaryModificationExpressionChild);
            if (result == null)
                result = caseArrayInitializationValue(unaryModificationExpressionChild);
            if (result == null)
                result = caseAnnotationValue(unaryModificationExpressionChild);
            if (result == null)
                result = caseCommentable(unaryModificationExpressionChild);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ExpressionsPackage.CAST_EXPRESSION: {
            CastExpression castExpression = (CastExpression) theEObject;
            T result = caseCastExpression(castExpression);
            if (result == null)
                result = caseTypedElement(castExpression);
            if (result == null)
                result = caseArrayTypeable(castExpression);
            if (result == null)
                result = caseUnaryModificationExpressionChild(castExpression);
            if (result == null)
                result = caseUnaryExpressionChild(castExpression);
            if (result == null)
                result = caseMultiplicativeExpressionChild(castExpression);
            if (result == null)
                result = caseAdditiveExpressionChild(castExpression);
            if (result == null)
                result = caseShiftExpressionChild(castExpression);
            if (result == null)
                result = caseRelationExpressionChild(castExpression);
            if (result == null)
                result = caseInstanceOfExpressionChild(castExpression);
            if (result == null)
                result = caseEqualityExpressionChild(castExpression);
            if (result == null)
                result = caseAndExpressionChild(castExpression);
            if (result == null)
                result = caseExclusiveOrExpressionChild(castExpression);
            if (result == null)
                result = caseInclusiveOrExpressionChild(castExpression);
            if (result == null)
                result = caseConditionalAndExpressionChild(castExpression);
            if (result == null)
                result = caseConditionalOrExpressionChild(castExpression);
            if (result == null)
                result = caseConditionalExpressionChild(castExpression);
            if (result == null)
                result = caseAssignmentExpressionChild(castExpression);
            if (result == null)
                result = caseExpression(castExpression);
            if (result == null)
                result = caseArrayInitializationValue(castExpression);
            if (result == null)
                result = caseAnnotationValue(castExpression);
            if (result == null)
                result = caseCommentable(castExpression);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ExpressionsPackage.PRIMARY_EXPRESSION: {
            PrimaryExpression primaryExpression = (PrimaryExpression) theEObject;
            T result = casePrimaryExpression(primaryExpression);
            if (result == null)
                result = caseUnaryModificationExpressionChild(primaryExpression);
            if (result == null)
                result = caseUnaryExpressionChild(primaryExpression);
            if (result == null)
                result = caseMultiplicativeExpressionChild(primaryExpression);
            if (result == null)
                result = caseAdditiveExpressionChild(primaryExpression);
            if (result == null)
                result = caseShiftExpressionChild(primaryExpression);
            if (result == null)
                result = caseRelationExpressionChild(primaryExpression);
            if (result == null)
                result = caseInstanceOfExpressionChild(primaryExpression);
            if (result == null)
                result = caseEqualityExpressionChild(primaryExpression);
            if (result == null)
                result = caseAndExpressionChild(primaryExpression);
            if (result == null)
                result = caseExclusiveOrExpressionChild(primaryExpression);
            if (result == null)
                result = caseInclusiveOrExpressionChild(primaryExpression);
            if (result == null)
                result = caseConditionalAndExpressionChild(primaryExpression);
            if (result == null)
                result = caseConditionalOrExpressionChild(primaryExpression);
            if (result == null)
                result = caseConditionalExpressionChild(primaryExpression);
            if (result == null)
                result = caseAssignmentExpressionChild(primaryExpression);
            if (result == null)
                result = caseExpression(primaryExpression);
            if (result == null)
                result = caseArrayInitializationValue(primaryExpression);
            if (result == null)
                result = caseAnnotationValue(primaryExpression);
            if (result == null)
                result = caseCommentable(primaryExpression);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ExpressionsPackage.NESTED_EXPRESSION: {
            NestedExpression nestedExpression = (NestedExpression) theEObject;
            T result = caseNestedExpression(nestedExpression);
            if (result == null)
                result = caseReference(nestedExpression);
            if (result == null)
                result = casePrimaryExpression(nestedExpression);
            if (result == null)
                result = caseTypeArgumentable(nestedExpression);
            if (result == null)
                result = caseUnaryModificationExpressionChild(nestedExpression);
            if (result == null)
                result = caseUnaryExpressionChild(nestedExpression);
            if (result == null)
                result = caseMultiplicativeExpressionChild(nestedExpression);
            if (result == null)
                result = caseAdditiveExpressionChild(nestedExpression);
            if (result == null)
                result = caseShiftExpressionChild(nestedExpression);
            if (result == null)
                result = caseRelationExpressionChild(nestedExpression);
            if (result == null)
                result = caseInstanceOfExpressionChild(nestedExpression);
            if (result == null)
                result = caseEqualityExpressionChild(nestedExpression);
            if (result == null)
                result = caseAndExpressionChild(nestedExpression);
            if (result == null)
                result = caseExclusiveOrExpressionChild(nestedExpression);
            if (result == null)
                result = caseInclusiveOrExpressionChild(nestedExpression);
            if (result == null)
                result = caseConditionalAndExpressionChild(nestedExpression);
            if (result == null)
                result = caseConditionalOrExpressionChild(nestedExpression);
            if (result == null)
                result = caseConditionalExpressionChild(nestedExpression);
            if (result == null)
                result = caseAssignmentExpressionChild(nestedExpression);
            if (result == null)
                result = caseExpression(nestedExpression);
            if (result == null)
                result = caseArrayInitializationValue(nestedExpression);
            if (result == null)
                result = caseAnnotationValue(nestedExpression);
            if (result == null)
                result = caseCommentable(nestedExpression);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        default:
            return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Expression List</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Expression List</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExpressionList(ExpressionList object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Assignment Expression</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Assignment Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAssignmentExpression(AssignmentExpression object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Conditional Expression</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Conditional Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConditionalExpression(ConditionalExpression object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Conditional Or Expression</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Conditional Or Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConditionalOrExpression(ConditionalOrExpression object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Conditional And Expression</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Conditional And Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConditionalAndExpression(ConditionalAndExpression object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Inclusive Or Expression</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Inclusive Or Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInclusiveOrExpression(InclusiveOrExpression object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Exclusive Or Expression</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exclusive Or Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExclusiveOrExpression(ExclusiveOrExpression object) {
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
     * Returns the result of interpreting the object as an instance of '<em>And Expression</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>And Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAndExpression(AndExpression object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Equality Expression</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Equality Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEqualityExpression(EqualityExpression object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Instance Of Expression</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Instance Of Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInstanceOfExpression(InstanceOfExpression object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Relation Expression</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Relation Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRelationExpression(RelationExpression object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Shift Expression</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Shift Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseShiftExpression(ShiftExpression object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Additive Expression</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Additive Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAdditiveExpression(AdditiveExpression object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Multiplicative Expression</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Multiplicative Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMultiplicativeExpression(MultiplicativeExpression object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Unary Expression</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Unary Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUnaryExpression(UnaryExpression object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Unary Modification Expression</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Unary Modification Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUnaryModificationExpression(UnaryModificationExpression object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Prefix Unary Modification Expression</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Prefix Unary Modification Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePrefixUnaryModificationExpression(PrefixUnaryModificationExpression object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Suffix Unary Modification Expression</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Suffix Unary Modification Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSuffixUnaryModificationExpression(SuffixUnaryModificationExpression object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Cast Expression</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Cast Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCastExpression(CastExpression object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Nested Expression</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Nested Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNestedExpression(NestedExpression object) {
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
     * Returns the result of interpreting the object as an instance of '<em>For Loop Initializer</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>For Loop Initializer</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseForLoopInitializer(ForLoopInitializer object) {
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

} //ExpressionsSwitch
