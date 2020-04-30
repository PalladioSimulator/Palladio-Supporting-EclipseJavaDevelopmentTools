/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.operators.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable;

import org.palladiosimulator.jdt.metamodel.javamodel.operators.*;

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
 * @see org.palladiosimulator.jdt.metamodel.javamodel.operators.OperatorsPackage
 * @generated
 */
public class OperatorsSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static OperatorsPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OperatorsSwitch() {
        if (modelPackage == null) {
            modelPackage = OperatorsPackage.eINSTANCE;
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
        case OperatorsPackage.OPERATOR: {
            Operator operator = (Operator) theEObject;
            T result = caseOperator(operator);
            if (result == null)
                result = caseCommentable(operator);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case OperatorsPackage.ADDITIVE_OPERATOR: {
            AdditiveOperator additiveOperator = (AdditiveOperator) theEObject;
            T result = caseAdditiveOperator(additiveOperator);
            if (result == null)
                result = caseOperator(additiveOperator);
            if (result == null)
                result = caseCommentable(additiveOperator);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case OperatorsPackage.ASSIGNMENT_OPERATOR: {
            AssignmentOperator assignmentOperator = (AssignmentOperator) theEObject;
            T result = caseAssignmentOperator(assignmentOperator);
            if (result == null)
                result = caseOperator(assignmentOperator);
            if (result == null)
                result = caseCommentable(assignmentOperator);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case OperatorsPackage.EQUALITY_OPERATOR: {
            EqualityOperator equalityOperator = (EqualityOperator) theEObject;
            T result = caseEqualityOperator(equalityOperator);
            if (result == null)
                result = caseOperator(equalityOperator);
            if (result == null)
                result = caseCommentable(equalityOperator);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case OperatorsPackage.MULTIPLICATIVE_OPERATOR: {
            MultiplicativeOperator multiplicativeOperator = (MultiplicativeOperator) theEObject;
            T result = caseMultiplicativeOperator(multiplicativeOperator);
            if (result == null)
                result = caseOperator(multiplicativeOperator);
            if (result == null)
                result = caseCommentable(multiplicativeOperator);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case OperatorsPackage.RELATION_OPERATOR: {
            RelationOperator relationOperator = (RelationOperator) theEObject;
            T result = caseRelationOperator(relationOperator);
            if (result == null)
                result = caseOperator(relationOperator);
            if (result == null)
                result = caseCommentable(relationOperator);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case OperatorsPackage.SHIFT_OPERATOR: {
            ShiftOperator shiftOperator = (ShiftOperator) theEObject;
            T result = caseShiftOperator(shiftOperator);
            if (result == null)
                result = caseOperator(shiftOperator);
            if (result == null)
                result = caseCommentable(shiftOperator);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case OperatorsPackage.UNARY_OPERATOR: {
            UnaryOperator unaryOperator = (UnaryOperator) theEObject;
            T result = caseUnaryOperator(unaryOperator);
            if (result == null)
                result = caseOperator(unaryOperator);
            if (result == null)
                result = caseCommentable(unaryOperator);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case OperatorsPackage.UNARY_MODIFICATION_OPERATOR: {
            UnaryModificationOperator unaryModificationOperator = (UnaryModificationOperator) theEObject;
            T result = caseUnaryModificationOperator(unaryModificationOperator);
            if (result == null)
                result = caseOperator(unaryModificationOperator);
            if (result == null)
                result = caseCommentable(unaryModificationOperator);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case OperatorsPackage.ASSIGNMENT: {
            Assignment assignment = (Assignment) theEObject;
            T result = caseAssignment(assignment);
            if (result == null)
                result = caseAssignmentOperator(assignment);
            if (result == null)
                result = caseOperator(assignment);
            if (result == null)
                result = caseCommentable(assignment);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case OperatorsPackage.ASSIGNMENT_AND: {
            AssignmentAnd assignmentAnd = (AssignmentAnd) theEObject;
            T result = caseAssignmentAnd(assignmentAnd);
            if (result == null)
                result = caseAssignmentOperator(assignmentAnd);
            if (result == null)
                result = caseOperator(assignmentAnd);
            if (result == null)
                result = caseCommentable(assignmentAnd);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case OperatorsPackage.ASSIGNMENT_DIVISION: {
            AssignmentDivision assignmentDivision = (AssignmentDivision) theEObject;
            T result = caseAssignmentDivision(assignmentDivision);
            if (result == null)
                result = caseAssignmentOperator(assignmentDivision);
            if (result == null)
                result = caseOperator(assignmentDivision);
            if (result == null)
                result = caseCommentable(assignmentDivision);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case OperatorsPackage.ASSIGNMENT_EXCLUSIVE_OR: {
            AssignmentExclusiveOr assignmentExclusiveOr = (AssignmentExclusiveOr) theEObject;
            T result = caseAssignmentExclusiveOr(assignmentExclusiveOr);
            if (result == null)
                result = caseAssignmentOperator(assignmentExclusiveOr);
            if (result == null)
                result = caseOperator(assignmentExclusiveOr);
            if (result == null)
                result = caseCommentable(assignmentExclusiveOr);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case OperatorsPackage.ASSIGNMENT_MINUS: {
            AssignmentMinus assignmentMinus = (AssignmentMinus) theEObject;
            T result = caseAssignmentMinus(assignmentMinus);
            if (result == null)
                result = caseAssignmentOperator(assignmentMinus);
            if (result == null)
                result = caseOperator(assignmentMinus);
            if (result == null)
                result = caseCommentable(assignmentMinus);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case OperatorsPackage.ASSIGNMENT_MODULO: {
            AssignmentModulo assignmentModulo = (AssignmentModulo) theEObject;
            T result = caseAssignmentModulo(assignmentModulo);
            if (result == null)
                result = caseAssignmentOperator(assignmentModulo);
            if (result == null)
                result = caseOperator(assignmentModulo);
            if (result == null)
                result = caseCommentable(assignmentModulo);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case OperatorsPackage.ASSIGNMENT_MULTIPLICATION: {
            AssignmentMultiplication assignmentMultiplication = (AssignmentMultiplication) theEObject;
            T result = caseAssignmentMultiplication(assignmentMultiplication);
            if (result == null)
                result = caseAssignmentOperator(assignmentMultiplication);
            if (result == null)
                result = caseOperator(assignmentMultiplication);
            if (result == null)
                result = caseCommentable(assignmentMultiplication);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case OperatorsPackage.ASSIGNMENT_LEFT_SHIFT: {
            AssignmentLeftShift assignmentLeftShift = (AssignmentLeftShift) theEObject;
            T result = caseAssignmentLeftShift(assignmentLeftShift);
            if (result == null)
                result = caseAssignmentOperator(assignmentLeftShift);
            if (result == null)
                result = caseOperator(assignmentLeftShift);
            if (result == null)
                result = caseCommentable(assignmentLeftShift);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case OperatorsPackage.ASSIGNMENT_OR: {
            AssignmentOr assignmentOr = (AssignmentOr) theEObject;
            T result = caseAssignmentOr(assignmentOr);
            if (result == null)
                result = caseAssignmentOperator(assignmentOr);
            if (result == null)
                result = caseOperator(assignmentOr);
            if (result == null)
                result = caseCommentable(assignmentOr);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case OperatorsPackage.ASSIGNMENT_PLUS: {
            AssignmentPlus assignmentPlus = (AssignmentPlus) theEObject;
            T result = caseAssignmentPlus(assignmentPlus);
            if (result == null)
                result = caseAssignmentOperator(assignmentPlus);
            if (result == null)
                result = caseOperator(assignmentPlus);
            if (result == null)
                result = caseCommentable(assignmentPlus);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case OperatorsPackage.ASSIGNMENT_RIGHT_SHIFT: {
            AssignmentRightShift assignmentRightShift = (AssignmentRightShift) theEObject;
            T result = caseAssignmentRightShift(assignmentRightShift);
            if (result == null)
                result = caseAssignmentOperator(assignmentRightShift);
            if (result == null)
                result = caseOperator(assignmentRightShift);
            if (result == null)
                result = caseCommentable(assignmentRightShift);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case OperatorsPackage.ASSIGNMENT_UNSIGNED_RIGHT_SHIFT: {
            AssignmentUnsignedRightShift assignmentUnsignedRightShift = (AssignmentUnsignedRightShift) theEObject;
            T result = caseAssignmentUnsignedRightShift(assignmentUnsignedRightShift);
            if (result == null)
                result = caseAssignmentOperator(assignmentUnsignedRightShift);
            if (result == null)
                result = caseOperator(assignmentUnsignedRightShift);
            if (result == null)
                result = caseCommentable(assignmentUnsignedRightShift);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case OperatorsPackage.EQUAL: {
            Equal equal = (Equal) theEObject;
            T result = caseEqual(equal);
            if (result == null)
                result = caseEqualityOperator(equal);
            if (result == null)
                result = caseOperator(equal);
            if (result == null)
                result = caseCommentable(equal);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case OperatorsPackage.NOT_EQUAL: {
            NotEqual notEqual = (NotEqual) theEObject;
            T result = caseNotEqual(notEqual);
            if (result == null)
                result = caseEqualityOperator(notEqual);
            if (result == null)
                result = caseOperator(notEqual);
            if (result == null)
                result = caseCommentable(notEqual);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case OperatorsPackage.GREATER_THAN: {
            GreaterThan greaterThan = (GreaterThan) theEObject;
            T result = caseGreaterThan(greaterThan);
            if (result == null)
                result = caseRelationOperator(greaterThan);
            if (result == null)
                result = caseOperator(greaterThan);
            if (result == null)
                result = caseCommentable(greaterThan);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case OperatorsPackage.GREATER_THAN_OR_EQUAL: {
            GreaterThanOrEqual greaterThanOrEqual = (GreaterThanOrEqual) theEObject;
            T result = caseGreaterThanOrEqual(greaterThanOrEqual);
            if (result == null)
                result = caseRelationOperator(greaterThanOrEqual);
            if (result == null)
                result = caseOperator(greaterThanOrEqual);
            if (result == null)
                result = caseCommentable(greaterThanOrEqual);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case OperatorsPackage.LESS_THAN: {
            LessThan lessThan = (LessThan) theEObject;
            T result = caseLessThan(lessThan);
            if (result == null)
                result = caseRelationOperator(lessThan);
            if (result == null)
                result = caseOperator(lessThan);
            if (result == null)
                result = caseCommentable(lessThan);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case OperatorsPackage.LESS_THAN_OR_EQUAL: {
            LessThanOrEqual lessThanOrEqual = (LessThanOrEqual) theEObject;
            T result = caseLessThanOrEqual(lessThanOrEqual);
            if (result == null)
                result = caseRelationOperator(lessThanOrEqual);
            if (result == null)
                result = caseOperator(lessThanOrEqual);
            if (result == null)
                result = caseCommentable(lessThanOrEqual);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case OperatorsPackage.ADDITION: {
            Addition addition = (Addition) theEObject;
            T result = caseAddition(addition);
            if (result == null)
                result = caseAdditiveOperator(addition);
            if (result == null)
                result = caseUnaryOperator(addition);
            if (result == null)
                result = caseOperator(addition);
            if (result == null)
                result = caseCommentable(addition);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case OperatorsPackage.SUBTRACTION: {
            Subtraction subtraction = (Subtraction) theEObject;
            T result = caseSubtraction(subtraction);
            if (result == null)
                result = caseAdditiveOperator(subtraction);
            if (result == null)
                result = caseUnaryOperator(subtraction);
            if (result == null)
                result = caseOperator(subtraction);
            if (result == null)
                result = caseCommentable(subtraction);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case OperatorsPackage.DIVISION: {
            Division division = (Division) theEObject;
            T result = caseDivision(division);
            if (result == null)
                result = caseMultiplicativeOperator(division);
            if (result == null)
                result = caseOperator(division);
            if (result == null)
                result = caseCommentable(division);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case OperatorsPackage.MULTIPLICATION: {
            Multiplication multiplication = (Multiplication) theEObject;
            T result = caseMultiplication(multiplication);
            if (result == null)
                result = caseMultiplicativeOperator(multiplication);
            if (result == null)
                result = caseOperator(multiplication);
            if (result == null)
                result = caseCommentable(multiplication);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case OperatorsPackage.REMAINDER: {
            Remainder remainder = (Remainder) theEObject;
            T result = caseRemainder(remainder);
            if (result == null)
                result = caseMultiplicativeOperator(remainder);
            if (result == null)
                result = caseOperator(remainder);
            if (result == null)
                result = caseCommentable(remainder);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case OperatorsPackage.COMPLEMENT: {
            Complement complement = (Complement) theEObject;
            T result = caseComplement(complement);
            if (result == null)
                result = caseUnaryOperator(complement);
            if (result == null)
                result = caseOperator(complement);
            if (result == null)
                result = caseCommentable(complement);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case OperatorsPackage.MINUS_MINUS: {
            MinusMinus minusMinus = (MinusMinus) theEObject;
            T result = caseMinusMinus(minusMinus);
            if (result == null)
                result = caseUnaryModificationOperator(minusMinus);
            if (result == null)
                result = caseOperator(minusMinus);
            if (result == null)
                result = caseCommentable(minusMinus);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case OperatorsPackage.NEGATE: {
            Negate negate = (Negate) theEObject;
            T result = caseNegate(negate);
            if (result == null)
                result = caseUnaryOperator(negate);
            if (result == null)
                result = caseOperator(negate);
            if (result == null)
                result = caseCommentable(negate);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case OperatorsPackage.PLUS_PLUS: {
            PlusPlus plusPlus = (PlusPlus) theEObject;
            T result = casePlusPlus(plusPlus);
            if (result == null)
                result = caseUnaryModificationOperator(plusPlus);
            if (result == null)
                result = caseOperator(plusPlus);
            if (result == null)
                result = caseCommentable(plusPlus);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case OperatorsPackage.LEFT_SHIFT: {
            LeftShift leftShift = (LeftShift) theEObject;
            T result = caseLeftShift(leftShift);
            if (result == null)
                result = caseShiftOperator(leftShift);
            if (result == null)
                result = caseOperator(leftShift);
            if (result == null)
                result = caseCommentable(leftShift);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case OperatorsPackage.RIGHT_SHIFT: {
            RightShift rightShift = (RightShift) theEObject;
            T result = caseRightShift(rightShift);
            if (result == null)
                result = caseShiftOperator(rightShift);
            if (result == null)
                result = caseOperator(rightShift);
            if (result == null)
                result = caseCommentable(rightShift);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case OperatorsPackage.UNSIGNED_RIGHT_SHIFT: {
            UnsignedRightShift unsignedRightShift = (UnsignedRightShift) theEObject;
            T result = caseUnsignedRightShift(unsignedRightShift);
            if (result == null)
                result = caseShiftOperator(unsignedRightShift);
            if (result == null)
                result = caseOperator(unsignedRightShift);
            if (result == null)
                result = caseCommentable(unsignedRightShift);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        default:
            return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Operator</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Operator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOperator(Operator object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Additive Operator</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Additive Operator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAdditiveOperator(AdditiveOperator object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Assignment Operator</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Assignment Operator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAssignmentOperator(AssignmentOperator object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Equality Operator</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Equality Operator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEqualityOperator(EqualityOperator object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Multiplicative Operator</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Multiplicative Operator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMultiplicativeOperator(MultiplicativeOperator object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Relation Operator</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Relation Operator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRelationOperator(RelationOperator object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Shift Operator</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Shift Operator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseShiftOperator(ShiftOperator object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Unary Operator</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Unary Operator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUnaryOperator(UnaryOperator object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Unary Modification Operator</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Unary Modification Operator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUnaryModificationOperator(UnaryModificationOperator object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Assignment</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Assignment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAssignment(Assignment object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Assignment And</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Assignment And</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAssignmentAnd(AssignmentAnd object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Assignment Division</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Assignment Division</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAssignmentDivision(AssignmentDivision object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Assignment Exclusive Or</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Assignment Exclusive Or</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAssignmentExclusiveOr(AssignmentExclusiveOr object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Assignment Minus</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Assignment Minus</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAssignmentMinus(AssignmentMinus object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Assignment Modulo</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Assignment Modulo</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAssignmentModulo(AssignmentModulo object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Assignment Multiplication</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Assignment Multiplication</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAssignmentMultiplication(AssignmentMultiplication object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Assignment Left Shift</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Assignment Left Shift</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAssignmentLeftShift(AssignmentLeftShift object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Assignment Or</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Assignment Or</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAssignmentOr(AssignmentOr object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Assignment Plus</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Assignment Plus</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAssignmentPlus(AssignmentPlus object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Assignment Right Shift</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Assignment Right Shift</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAssignmentRightShift(AssignmentRightShift object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Assignment Unsigned Right Shift</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Assignment Unsigned Right Shift</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAssignmentUnsignedRightShift(AssignmentUnsignedRightShift object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Equal</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Equal</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEqual(Equal object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Not Equal</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Not Equal</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNotEqual(NotEqual object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Greater Than</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Greater Than</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGreaterThan(GreaterThan object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Greater Than Or Equal</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Greater Than Or Equal</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGreaterThanOrEqual(GreaterThanOrEqual object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Less Than</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Less Than</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLessThan(LessThan object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Less Than Or Equal</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Less Than Or Equal</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLessThanOrEqual(LessThanOrEqual object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Addition</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Addition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAddition(Addition object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Subtraction</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Subtraction</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSubtraction(Subtraction object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Division</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Division</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDivision(Division object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Multiplication</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Multiplication</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMultiplication(Multiplication object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Remainder</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Remainder</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRemainder(Remainder object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Complement</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Complement</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseComplement(Complement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Minus Minus</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Minus Minus</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMinusMinus(MinusMinus object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Negate</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Negate</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNegate(Negate object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Plus Plus</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Plus Plus</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePlusPlus(PlusPlus object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Left Shift</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Left Shift</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLeftShift(LeftShift object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Right Shift</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Right Shift</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRightShift(RightShift object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Unsigned Right Shift</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Unsigned Right Shift</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUnsignedRightShift(UnsignedRightShift object) {
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

} //OperatorsSwitch
