/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.literals.util;

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

import org.palladiosimulator.jdt.metamodel.javamodel.literals.*;

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
 * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.LiteralsPackage
 * @generated
 */
public class LiteralsSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static LiteralsPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LiteralsSwitch() {
        if (modelPackage == null) {
            modelPackage = LiteralsPackage.eINSTANCE;
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
        case LiteralsPackage.LITERAL: {
            Literal literal = (Literal) theEObject;
            T result = caseLiteral(literal);
            if (result == null)
                result = casePrimaryExpression(literal);
            if (result == null)
                result = caseUnaryModificationExpressionChild(literal);
            if (result == null)
                result = caseUnaryExpressionChild(literal);
            if (result == null)
                result = caseMultiplicativeExpressionChild(literal);
            if (result == null)
                result = caseAdditiveExpressionChild(literal);
            if (result == null)
                result = caseShiftExpressionChild(literal);
            if (result == null)
                result = caseRelationExpressionChild(literal);
            if (result == null)
                result = caseInstanceOfExpressionChild(literal);
            if (result == null)
                result = caseEqualityExpressionChild(literal);
            if (result == null)
                result = caseAndExpressionChild(literal);
            if (result == null)
                result = caseExclusiveOrExpressionChild(literal);
            if (result == null)
                result = caseInclusiveOrExpressionChild(literal);
            if (result == null)
                result = caseConditionalAndExpressionChild(literal);
            if (result == null)
                result = caseConditionalOrExpressionChild(literal);
            if (result == null)
                result = caseConditionalExpressionChild(literal);
            if (result == null)
                result = caseAssignmentExpressionChild(literal);
            if (result == null)
                result = caseExpression(literal);
            if (result == null)
                result = caseArrayInitializationValue(literal);
            if (result == null)
                result = caseAnnotationValue(literal);
            if (result == null)
                result = caseCommentable(literal);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case LiteralsPackage.SELF: {
            Self self = (Self) theEObject;
            T result = caseSelf(self);
            if (result == null)
                result = caseCommentable(self);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case LiteralsPackage.BOOLEAN_LITERAL: {
            BooleanLiteral booleanLiteral = (BooleanLiteral) theEObject;
            T result = caseBooleanLiteral(booleanLiteral);
            if (result == null)
                result = caseLiteral(booleanLiteral);
            if (result == null)
                result = casePrimaryExpression(booleanLiteral);
            if (result == null)
                result = caseUnaryModificationExpressionChild(booleanLiteral);
            if (result == null)
                result = caseUnaryExpressionChild(booleanLiteral);
            if (result == null)
                result = caseMultiplicativeExpressionChild(booleanLiteral);
            if (result == null)
                result = caseAdditiveExpressionChild(booleanLiteral);
            if (result == null)
                result = caseShiftExpressionChild(booleanLiteral);
            if (result == null)
                result = caseRelationExpressionChild(booleanLiteral);
            if (result == null)
                result = caseInstanceOfExpressionChild(booleanLiteral);
            if (result == null)
                result = caseEqualityExpressionChild(booleanLiteral);
            if (result == null)
                result = caseAndExpressionChild(booleanLiteral);
            if (result == null)
                result = caseExclusiveOrExpressionChild(booleanLiteral);
            if (result == null)
                result = caseInclusiveOrExpressionChild(booleanLiteral);
            if (result == null)
                result = caseConditionalAndExpressionChild(booleanLiteral);
            if (result == null)
                result = caseConditionalOrExpressionChild(booleanLiteral);
            if (result == null)
                result = caseConditionalExpressionChild(booleanLiteral);
            if (result == null)
                result = caseAssignmentExpressionChild(booleanLiteral);
            if (result == null)
                result = caseExpression(booleanLiteral);
            if (result == null)
                result = caseArrayInitializationValue(booleanLiteral);
            if (result == null)
                result = caseAnnotationValue(booleanLiteral);
            if (result == null)
                result = caseCommentable(booleanLiteral);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case LiteralsPackage.CHARACTER_LITERAL: {
            CharacterLiteral characterLiteral = (CharacterLiteral) theEObject;
            T result = caseCharacterLiteral(characterLiteral);
            if (result == null)
                result = caseLiteral(characterLiteral);
            if (result == null)
                result = casePrimaryExpression(characterLiteral);
            if (result == null)
                result = caseUnaryModificationExpressionChild(characterLiteral);
            if (result == null)
                result = caseUnaryExpressionChild(characterLiteral);
            if (result == null)
                result = caseMultiplicativeExpressionChild(characterLiteral);
            if (result == null)
                result = caseAdditiveExpressionChild(characterLiteral);
            if (result == null)
                result = caseShiftExpressionChild(characterLiteral);
            if (result == null)
                result = caseRelationExpressionChild(characterLiteral);
            if (result == null)
                result = caseInstanceOfExpressionChild(characterLiteral);
            if (result == null)
                result = caseEqualityExpressionChild(characterLiteral);
            if (result == null)
                result = caseAndExpressionChild(characterLiteral);
            if (result == null)
                result = caseExclusiveOrExpressionChild(characterLiteral);
            if (result == null)
                result = caseInclusiveOrExpressionChild(characterLiteral);
            if (result == null)
                result = caseConditionalAndExpressionChild(characterLiteral);
            if (result == null)
                result = caseConditionalOrExpressionChild(characterLiteral);
            if (result == null)
                result = caseConditionalExpressionChild(characterLiteral);
            if (result == null)
                result = caseAssignmentExpressionChild(characterLiteral);
            if (result == null)
                result = caseExpression(characterLiteral);
            if (result == null)
                result = caseArrayInitializationValue(characterLiteral);
            if (result == null)
                result = caseAnnotationValue(characterLiteral);
            if (result == null)
                result = caseCommentable(characterLiteral);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case LiteralsPackage.FLOAT_LITERAL: {
            FloatLiteral floatLiteral = (FloatLiteral) theEObject;
            T result = caseFloatLiteral(floatLiteral);
            if (result == null)
                result = caseLiteral(floatLiteral);
            if (result == null)
                result = casePrimaryExpression(floatLiteral);
            if (result == null)
                result = caseUnaryModificationExpressionChild(floatLiteral);
            if (result == null)
                result = caseUnaryExpressionChild(floatLiteral);
            if (result == null)
                result = caseMultiplicativeExpressionChild(floatLiteral);
            if (result == null)
                result = caseAdditiveExpressionChild(floatLiteral);
            if (result == null)
                result = caseShiftExpressionChild(floatLiteral);
            if (result == null)
                result = caseRelationExpressionChild(floatLiteral);
            if (result == null)
                result = caseInstanceOfExpressionChild(floatLiteral);
            if (result == null)
                result = caseEqualityExpressionChild(floatLiteral);
            if (result == null)
                result = caseAndExpressionChild(floatLiteral);
            if (result == null)
                result = caseExclusiveOrExpressionChild(floatLiteral);
            if (result == null)
                result = caseInclusiveOrExpressionChild(floatLiteral);
            if (result == null)
                result = caseConditionalAndExpressionChild(floatLiteral);
            if (result == null)
                result = caseConditionalOrExpressionChild(floatLiteral);
            if (result == null)
                result = caseConditionalExpressionChild(floatLiteral);
            if (result == null)
                result = caseAssignmentExpressionChild(floatLiteral);
            if (result == null)
                result = caseExpression(floatLiteral);
            if (result == null)
                result = caseArrayInitializationValue(floatLiteral);
            if (result == null)
                result = caseAnnotationValue(floatLiteral);
            if (result == null)
                result = caseCommentable(floatLiteral);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case LiteralsPackage.DECIMAL_FLOAT_LITERAL: {
            DecimalFloatLiteral decimalFloatLiteral = (DecimalFloatLiteral) theEObject;
            T result = caseDecimalFloatLiteral(decimalFloatLiteral);
            if (result == null)
                result = caseFloatLiteral(decimalFloatLiteral);
            if (result == null)
                result = caseLiteral(decimalFloatLiteral);
            if (result == null)
                result = casePrimaryExpression(decimalFloatLiteral);
            if (result == null)
                result = caseUnaryModificationExpressionChild(decimalFloatLiteral);
            if (result == null)
                result = caseUnaryExpressionChild(decimalFloatLiteral);
            if (result == null)
                result = caseMultiplicativeExpressionChild(decimalFloatLiteral);
            if (result == null)
                result = caseAdditiveExpressionChild(decimalFloatLiteral);
            if (result == null)
                result = caseShiftExpressionChild(decimalFloatLiteral);
            if (result == null)
                result = caseRelationExpressionChild(decimalFloatLiteral);
            if (result == null)
                result = caseInstanceOfExpressionChild(decimalFloatLiteral);
            if (result == null)
                result = caseEqualityExpressionChild(decimalFloatLiteral);
            if (result == null)
                result = caseAndExpressionChild(decimalFloatLiteral);
            if (result == null)
                result = caseExclusiveOrExpressionChild(decimalFloatLiteral);
            if (result == null)
                result = caseInclusiveOrExpressionChild(decimalFloatLiteral);
            if (result == null)
                result = caseConditionalAndExpressionChild(decimalFloatLiteral);
            if (result == null)
                result = caseConditionalOrExpressionChild(decimalFloatLiteral);
            if (result == null)
                result = caseConditionalExpressionChild(decimalFloatLiteral);
            if (result == null)
                result = caseAssignmentExpressionChild(decimalFloatLiteral);
            if (result == null)
                result = caseExpression(decimalFloatLiteral);
            if (result == null)
                result = caseArrayInitializationValue(decimalFloatLiteral);
            if (result == null)
                result = caseAnnotationValue(decimalFloatLiteral);
            if (result == null)
                result = caseCommentable(decimalFloatLiteral);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case LiteralsPackage.HEX_FLOAT_LITERAL: {
            HexFloatLiteral hexFloatLiteral = (HexFloatLiteral) theEObject;
            T result = caseHexFloatLiteral(hexFloatLiteral);
            if (result == null)
                result = caseFloatLiteral(hexFloatLiteral);
            if (result == null)
                result = caseLiteral(hexFloatLiteral);
            if (result == null)
                result = casePrimaryExpression(hexFloatLiteral);
            if (result == null)
                result = caseUnaryModificationExpressionChild(hexFloatLiteral);
            if (result == null)
                result = caseUnaryExpressionChild(hexFloatLiteral);
            if (result == null)
                result = caseMultiplicativeExpressionChild(hexFloatLiteral);
            if (result == null)
                result = caseAdditiveExpressionChild(hexFloatLiteral);
            if (result == null)
                result = caseShiftExpressionChild(hexFloatLiteral);
            if (result == null)
                result = caseRelationExpressionChild(hexFloatLiteral);
            if (result == null)
                result = caseInstanceOfExpressionChild(hexFloatLiteral);
            if (result == null)
                result = caseEqualityExpressionChild(hexFloatLiteral);
            if (result == null)
                result = caseAndExpressionChild(hexFloatLiteral);
            if (result == null)
                result = caseExclusiveOrExpressionChild(hexFloatLiteral);
            if (result == null)
                result = caseInclusiveOrExpressionChild(hexFloatLiteral);
            if (result == null)
                result = caseConditionalAndExpressionChild(hexFloatLiteral);
            if (result == null)
                result = caseConditionalOrExpressionChild(hexFloatLiteral);
            if (result == null)
                result = caseConditionalExpressionChild(hexFloatLiteral);
            if (result == null)
                result = caseAssignmentExpressionChild(hexFloatLiteral);
            if (result == null)
                result = caseExpression(hexFloatLiteral);
            if (result == null)
                result = caseArrayInitializationValue(hexFloatLiteral);
            if (result == null)
                result = caseAnnotationValue(hexFloatLiteral);
            if (result == null)
                result = caseCommentable(hexFloatLiteral);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case LiteralsPackage.DOUBLE_LITERAL: {
            DoubleLiteral doubleLiteral = (DoubleLiteral) theEObject;
            T result = caseDoubleLiteral(doubleLiteral);
            if (result == null)
                result = caseLiteral(doubleLiteral);
            if (result == null)
                result = casePrimaryExpression(doubleLiteral);
            if (result == null)
                result = caseUnaryModificationExpressionChild(doubleLiteral);
            if (result == null)
                result = caseUnaryExpressionChild(doubleLiteral);
            if (result == null)
                result = caseMultiplicativeExpressionChild(doubleLiteral);
            if (result == null)
                result = caseAdditiveExpressionChild(doubleLiteral);
            if (result == null)
                result = caseShiftExpressionChild(doubleLiteral);
            if (result == null)
                result = caseRelationExpressionChild(doubleLiteral);
            if (result == null)
                result = caseInstanceOfExpressionChild(doubleLiteral);
            if (result == null)
                result = caseEqualityExpressionChild(doubleLiteral);
            if (result == null)
                result = caseAndExpressionChild(doubleLiteral);
            if (result == null)
                result = caseExclusiveOrExpressionChild(doubleLiteral);
            if (result == null)
                result = caseInclusiveOrExpressionChild(doubleLiteral);
            if (result == null)
                result = caseConditionalAndExpressionChild(doubleLiteral);
            if (result == null)
                result = caseConditionalOrExpressionChild(doubleLiteral);
            if (result == null)
                result = caseConditionalExpressionChild(doubleLiteral);
            if (result == null)
                result = caseAssignmentExpressionChild(doubleLiteral);
            if (result == null)
                result = caseExpression(doubleLiteral);
            if (result == null)
                result = caseArrayInitializationValue(doubleLiteral);
            if (result == null)
                result = caseAnnotationValue(doubleLiteral);
            if (result == null)
                result = caseCommentable(doubleLiteral);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case LiteralsPackage.DECIMAL_DOUBLE_LITERAL: {
            DecimalDoubleLiteral decimalDoubleLiteral = (DecimalDoubleLiteral) theEObject;
            T result = caseDecimalDoubleLiteral(decimalDoubleLiteral);
            if (result == null)
                result = caseDoubleLiteral(decimalDoubleLiteral);
            if (result == null)
                result = caseLiteral(decimalDoubleLiteral);
            if (result == null)
                result = casePrimaryExpression(decimalDoubleLiteral);
            if (result == null)
                result = caseUnaryModificationExpressionChild(decimalDoubleLiteral);
            if (result == null)
                result = caseUnaryExpressionChild(decimalDoubleLiteral);
            if (result == null)
                result = caseMultiplicativeExpressionChild(decimalDoubleLiteral);
            if (result == null)
                result = caseAdditiveExpressionChild(decimalDoubleLiteral);
            if (result == null)
                result = caseShiftExpressionChild(decimalDoubleLiteral);
            if (result == null)
                result = caseRelationExpressionChild(decimalDoubleLiteral);
            if (result == null)
                result = caseInstanceOfExpressionChild(decimalDoubleLiteral);
            if (result == null)
                result = caseEqualityExpressionChild(decimalDoubleLiteral);
            if (result == null)
                result = caseAndExpressionChild(decimalDoubleLiteral);
            if (result == null)
                result = caseExclusiveOrExpressionChild(decimalDoubleLiteral);
            if (result == null)
                result = caseInclusiveOrExpressionChild(decimalDoubleLiteral);
            if (result == null)
                result = caseConditionalAndExpressionChild(decimalDoubleLiteral);
            if (result == null)
                result = caseConditionalOrExpressionChild(decimalDoubleLiteral);
            if (result == null)
                result = caseConditionalExpressionChild(decimalDoubleLiteral);
            if (result == null)
                result = caseAssignmentExpressionChild(decimalDoubleLiteral);
            if (result == null)
                result = caseExpression(decimalDoubleLiteral);
            if (result == null)
                result = caseArrayInitializationValue(decimalDoubleLiteral);
            if (result == null)
                result = caseAnnotationValue(decimalDoubleLiteral);
            if (result == null)
                result = caseCommentable(decimalDoubleLiteral);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case LiteralsPackage.HEX_DOUBLE_LITERAL: {
            HexDoubleLiteral hexDoubleLiteral = (HexDoubleLiteral) theEObject;
            T result = caseHexDoubleLiteral(hexDoubleLiteral);
            if (result == null)
                result = caseDoubleLiteral(hexDoubleLiteral);
            if (result == null)
                result = caseLiteral(hexDoubleLiteral);
            if (result == null)
                result = casePrimaryExpression(hexDoubleLiteral);
            if (result == null)
                result = caseUnaryModificationExpressionChild(hexDoubleLiteral);
            if (result == null)
                result = caseUnaryExpressionChild(hexDoubleLiteral);
            if (result == null)
                result = caseMultiplicativeExpressionChild(hexDoubleLiteral);
            if (result == null)
                result = caseAdditiveExpressionChild(hexDoubleLiteral);
            if (result == null)
                result = caseShiftExpressionChild(hexDoubleLiteral);
            if (result == null)
                result = caseRelationExpressionChild(hexDoubleLiteral);
            if (result == null)
                result = caseInstanceOfExpressionChild(hexDoubleLiteral);
            if (result == null)
                result = caseEqualityExpressionChild(hexDoubleLiteral);
            if (result == null)
                result = caseAndExpressionChild(hexDoubleLiteral);
            if (result == null)
                result = caseExclusiveOrExpressionChild(hexDoubleLiteral);
            if (result == null)
                result = caseInclusiveOrExpressionChild(hexDoubleLiteral);
            if (result == null)
                result = caseConditionalAndExpressionChild(hexDoubleLiteral);
            if (result == null)
                result = caseConditionalOrExpressionChild(hexDoubleLiteral);
            if (result == null)
                result = caseConditionalExpressionChild(hexDoubleLiteral);
            if (result == null)
                result = caseAssignmentExpressionChild(hexDoubleLiteral);
            if (result == null)
                result = caseExpression(hexDoubleLiteral);
            if (result == null)
                result = caseArrayInitializationValue(hexDoubleLiteral);
            if (result == null)
                result = caseAnnotationValue(hexDoubleLiteral);
            if (result == null)
                result = caseCommentable(hexDoubleLiteral);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case LiteralsPackage.INTEGER_LITERAL: {
            IntegerLiteral integerLiteral = (IntegerLiteral) theEObject;
            T result = caseIntegerLiteral(integerLiteral);
            if (result == null)
                result = caseLiteral(integerLiteral);
            if (result == null)
                result = casePrimaryExpression(integerLiteral);
            if (result == null)
                result = caseUnaryModificationExpressionChild(integerLiteral);
            if (result == null)
                result = caseUnaryExpressionChild(integerLiteral);
            if (result == null)
                result = caseMultiplicativeExpressionChild(integerLiteral);
            if (result == null)
                result = caseAdditiveExpressionChild(integerLiteral);
            if (result == null)
                result = caseShiftExpressionChild(integerLiteral);
            if (result == null)
                result = caseRelationExpressionChild(integerLiteral);
            if (result == null)
                result = caseInstanceOfExpressionChild(integerLiteral);
            if (result == null)
                result = caseEqualityExpressionChild(integerLiteral);
            if (result == null)
                result = caseAndExpressionChild(integerLiteral);
            if (result == null)
                result = caseExclusiveOrExpressionChild(integerLiteral);
            if (result == null)
                result = caseInclusiveOrExpressionChild(integerLiteral);
            if (result == null)
                result = caseConditionalAndExpressionChild(integerLiteral);
            if (result == null)
                result = caseConditionalOrExpressionChild(integerLiteral);
            if (result == null)
                result = caseConditionalExpressionChild(integerLiteral);
            if (result == null)
                result = caseAssignmentExpressionChild(integerLiteral);
            if (result == null)
                result = caseExpression(integerLiteral);
            if (result == null)
                result = caseArrayInitializationValue(integerLiteral);
            if (result == null)
                result = caseAnnotationValue(integerLiteral);
            if (result == null)
                result = caseCommentable(integerLiteral);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case LiteralsPackage.DECIMAL_INTEGER_LITERAL: {
            DecimalIntegerLiteral decimalIntegerLiteral = (DecimalIntegerLiteral) theEObject;
            T result = caseDecimalIntegerLiteral(decimalIntegerLiteral);
            if (result == null)
                result = caseIntegerLiteral(decimalIntegerLiteral);
            if (result == null)
                result = caseLiteral(decimalIntegerLiteral);
            if (result == null)
                result = casePrimaryExpression(decimalIntegerLiteral);
            if (result == null)
                result = caseUnaryModificationExpressionChild(decimalIntegerLiteral);
            if (result == null)
                result = caseUnaryExpressionChild(decimalIntegerLiteral);
            if (result == null)
                result = caseMultiplicativeExpressionChild(decimalIntegerLiteral);
            if (result == null)
                result = caseAdditiveExpressionChild(decimalIntegerLiteral);
            if (result == null)
                result = caseShiftExpressionChild(decimalIntegerLiteral);
            if (result == null)
                result = caseRelationExpressionChild(decimalIntegerLiteral);
            if (result == null)
                result = caseInstanceOfExpressionChild(decimalIntegerLiteral);
            if (result == null)
                result = caseEqualityExpressionChild(decimalIntegerLiteral);
            if (result == null)
                result = caseAndExpressionChild(decimalIntegerLiteral);
            if (result == null)
                result = caseExclusiveOrExpressionChild(decimalIntegerLiteral);
            if (result == null)
                result = caseInclusiveOrExpressionChild(decimalIntegerLiteral);
            if (result == null)
                result = caseConditionalAndExpressionChild(decimalIntegerLiteral);
            if (result == null)
                result = caseConditionalOrExpressionChild(decimalIntegerLiteral);
            if (result == null)
                result = caseConditionalExpressionChild(decimalIntegerLiteral);
            if (result == null)
                result = caseAssignmentExpressionChild(decimalIntegerLiteral);
            if (result == null)
                result = caseExpression(decimalIntegerLiteral);
            if (result == null)
                result = caseArrayInitializationValue(decimalIntegerLiteral);
            if (result == null)
                result = caseAnnotationValue(decimalIntegerLiteral);
            if (result == null)
                result = caseCommentable(decimalIntegerLiteral);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case LiteralsPackage.HEX_INTEGER_LITERAL: {
            HexIntegerLiteral hexIntegerLiteral = (HexIntegerLiteral) theEObject;
            T result = caseHexIntegerLiteral(hexIntegerLiteral);
            if (result == null)
                result = caseIntegerLiteral(hexIntegerLiteral);
            if (result == null)
                result = caseLiteral(hexIntegerLiteral);
            if (result == null)
                result = casePrimaryExpression(hexIntegerLiteral);
            if (result == null)
                result = caseUnaryModificationExpressionChild(hexIntegerLiteral);
            if (result == null)
                result = caseUnaryExpressionChild(hexIntegerLiteral);
            if (result == null)
                result = caseMultiplicativeExpressionChild(hexIntegerLiteral);
            if (result == null)
                result = caseAdditiveExpressionChild(hexIntegerLiteral);
            if (result == null)
                result = caseShiftExpressionChild(hexIntegerLiteral);
            if (result == null)
                result = caseRelationExpressionChild(hexIntegerLiteral);
            if (result == null)
                result = caseInstanceOfExpressionChild(hexIntegerLiteral);
            if (result == null)
                result = caseEqualityExpressionChild(hexIntegerLiteral);
            if (result == null)
                result = caseAndExpressionChild(hexIntegerLiteral);
            if (result == null)
                result = caseExclusiveOrExpressionChild(hexIntegerLiteral);
            if (result == null)
                result = caseInclusiveOrExpressionChild(hexIntegerLiteral);
            if (result == null)
                result = caseConditionalAndExpressionChild(hexIntegerLiteral);
            if (result == null)
                result = caseConditionalOrExpressionChild(hexIntegerLiteral);
            if (result == null)
                result = caseConditionalExpressionChild(hexIntegerLiteral);
            if (result == null)
                result = caseAssignmentExpressionChild(hexIntegerLiteral);
            if (result == null)
                result = caseExpression(hexIntegerLiteral);
            if (result == null)
                result = caseArrayInitializationValue(hexIntegerLiteral);
            if (result == null)
                result = caseAnnotationValue(hexIntegerLiteral);
            if (result == null)
                result = caseCommentable(hexIntegerLiteral);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case LiteralsPackage.OCTAL_INTEGER_LITERAL: {
            OctalIntegerLiteral octalIntegerLiteral = (OctalIntegerLiteral) theEObject;
            T result = caseOctalIntegerLiteral(octalIntegerLiteral);
            if (result == null)
                result = caseIntegerLiteral(octalIntegerLiteral);
            if (result == null)
                result = caseLiteral(octalIntegerLiteral);
            if (result == null)
                result = casePrimaryExpression(octalIntegerLiteral);
            if (result == null)
                result = caseUnaryModificationExpressionChild(octalIntegerLiteral);
            if (result == null)
                result = caseUnaryExpressionChild(octalIntegerLiteral);
            if (result == null)
                result = caseMultiplicativeExpressionChild(octalIntegerLiteral);
            if (result == null)
                result = caseAdditiveExpressionChild(octalIntegerLiteral);
            if (result == null)
                result = caseShiftExpressionChild(octalIntegerLiteral);
            if (result == null)
                result = caseRelationExpressionChild(octalIntegerLiteral);
            if (result == null)
                result = caseInstanceOfExpressionChild(octalIntegerLiteral);
            if (result == null)
                result = caseEqualityExpressionChild(octalIntegerLiteral);
            if (result == null)
                result = caseAndExpressionChild(octalIntegerLiteral);
            if (result == null)
                result = caseExclusiveOrExpressionChild(octalIntegerLiteral);
            if (result == null)
                result = caseInclusiveOrExpressionChild(octalIntegerLiteral);
            if (result == null)
                result = caseConditionalAndExpressionChild(octalIntegerLiteral);
            if (result == null)
                result = caseConditionalOrExpressionChild(octalIntegerLiteral);
            if (result == null)
                result = caseConditionalExpressionChild(octalIntegerLiteral);
            if (result == null)
                result = caseAssignmentExpressionChild(octalIntegerLiteral);
            if (result == null)
                result = caseExpression(octalIntegerLiteral);
            if (result == null)
                result = caseArrayInitializationValue(octalIntegerLiteral);
            if (result == null)
                result = caseAnnotationValue(octalIntegerLiteral);
            if (result == null)
                result = caseCommentable(octalIntegerLiteral);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case LiteralsPackage.LONG_LITERAL: {
            LongLiteral longLiteral = (LongLiteral) theEObject;
            T result = caseLongLiteral(longLiteral);
            if (result == null)
                result = caseLiteral(longLiteral);
            if (result == null)
                result = casePrimaryExpression(longLiteral);
            if (result == null)
                result = caseUnaryModificationExpressionChild(longLiteral);
            if (result == null)
                result = caseUnaryExpressionChild(longLiteral);
            if (result == null)
                result = caseMultiplicativeExpressionChild(longLiteral);
            if (result == null)
                result = caseAdditiveExpressionChild(longLiteral);
            if (result == null)
                result = caseShiftExpressionChild(longLiteral);
            if (result == null)
                result = caseRelationExpressionChild(longLiteral);
            if (result == null)
                result = caseInstanceOfExpressionChild(longLiteral);
            if (result == null)
                result = caseEqualityExpressionChild(longLiteral);
            if (result == null)
                result = caseAndExpressionChild(longLiteral);
            if (result == null)
                result = caseExclusiveOrExpressionChild(longLiteral);
            if (result == null)
                result = caseInclusiveOrExpressionChild(longLiteral);
            if (result == null)
                result = caseConditionalAndExpressionChild(longLiteral);
            if (result == null)
                result = caseConditionalOrExpressionChild(longLiteral);
            if (result == null)
                result = caseConditionalExpressionChild(longLiteral);
            if (result == null)
                result = caseAssignmentExpressionChild(longLiteral);
            if (result == null)
                result = caseExpression(longLiteral);
            if (result == null)
                result = caseArrayInitializationValue(longLiteral);
            if (result == null)
                result = caseAnnotationValue(longLiteral);
            if (result == null)
                result = caseCommentable(longLiteral);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case LiteralsPackage.DECIMAL_LONG_LITERAL: {
            DecimalLongLiteral decimalLongLiteral = (DecimalLongLiteral) theEObject;
            T result = caseDecimalLongLiteral(decimalLongLiteral);
            if (result == null)
                result = caseLongLiteral(decimalLongLiteral);
            if (result == null)
                result = caseLiteral(decimalLongLiteral);
            if (result == null)
                result = casePrimaryExpression(decimalLongLiteral);
            if (result == null)
                result = caseUnaryModificationExpressionChild(decimalLongLiteral);
            if (result == null)
                result = caseUnaryExpressionChild(decimalLongLiteral);
            if (result == null)
                result = caseMultiplicativeExpressionChild(decimalLongLiteral);
            if (result == null)
                result = caseAdditiveExpressionChild(decimalLongLiteral);
            if (result == null)
                result = caseShiftExpressionChild(decimalLongLiteral);
            if (result == null)
                result = caseRelationExpressionChild(decimalLongLiteral);
            if (result == null)
                result = caseInstanceOfExpressionChild(decimalLongLiteral);
            if (result == null)
                result = caseEqualityExpressionChild(decimalLongLiteral);
            if (result == null)
                result = caseAndExpressionChild(decimalLongLiteral);
            if (result == null)
                result = caseExclusiveOrExpressionChild(decimalLongLiteral);
            if (result == null)
                result = caseInclusiveOrExpressionChild(decimalLongLiteral);
            if (result == null)
                result = caseConditionalAndExpressionChild(decimalLongLiteral);
            if (result == null)
                result = caseConditionalOrExpressionChild(decimalLongLiteral);
            if (result == null)
                result = caseConditionalExpressionChild(decimalLongLiteral);
            if (result == null)
                result = caseAssignmentExpressionChild(decimalLongLiteral);
            if (result == null)
                result = caseExpression(decimalLongLiteral);
            if (result == null)
                result = caseArrayInitializationValue(decimalLongLiteral);
            if (result == null)
                result = caseAnnotationValue(decimalLongLiteral);
            if (result == null)
                result = caseCommentable(decimalLongLiteral);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case LiteralsPackage.HEX_LONG_LITERAL: {
            HexLongLiteral hexLongLiteral = (HexLongLiteral) theEObject;
            T result = caseHexLongLiteral(hexLongLiteral);
            if (result == null)
                result = caseLongLiteral(hexLongLiteral);
            if (result == null)
                result = caseLiteral(hexLongLiteral);
            if (result == null)
                result = casePrimaryExpression(hexLongLiteral);
            if (result == null)
                result = caseUnaryModificationExpressionChild(hexLongLiteral);
            if (result == null)
                result = caseUnaryExpressionChild(hexLongLiteral);
            if (result == null)
                result = caseMultiplicativeExpressionChild(hexLongLiteral);
            if (result == null)
                result = caseAdditiveExpressionChild(hexLongLiteral);
            if (result == null)
                result = caseShiftExpressionChild(hexLongLiteral);
            if (result == null)
                result = caseRelationExpressionChild(hexLongLiteral);
            if (result == null)
                result = caseInstanceOfExpressionChild(hexLongLiteral);
            if (result == null)
                result = caseEqualityExpressionChild(hexLongLiteral);
            if (result == null)
                result = caseAndExpressionChild(hexLongLiteral);
            if (result == null)
                result = caseExclusiveOrExpressionChild(hexLongLiteral);
            if (result == null)
                result = caseInclusiveOrExpressionChild(hexLongLiteral);
            if (result == null)
                result = caseConditionalAndExpressionChild(hexLongLiteral);
            if (result == null)
                result = caseConditionalOrExpressionChild(hexLongLiteral);
            if (result == null)
                result = caseConditionalExpressionChild(hexLongLiteral);
            if (result == null)
                result = caseAssignmentExpressionChild(hexLongLiteral);
            if (result == null)
                result = caseExpression(hexLongLiteral);
            if (result == null)
                result = caseArrayInitializationValue(hexLongLiteral);
            if (result == null)
                result = caseAnnotationValue(hexLongLiteral);
            if (result == null)
                result = caseCommentable(hexLongLiteral);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case LiteralsPackage.OCTAL_LONG_LITERAL: {
            OctalLongLiteral octalLongLiteral = (OctalLongLiteral) theEObject;
            T result = caseOctalLongLiteral(octalLongLiteral);
            if (result == null)
                result = caseLongLiteral(octalLongLiteral);
            if (result == null)
                result = caseLiteral(octalLongLiteral);
            if (result == null)
                result = casePrimaryExpression(octalLongLiteral);
            if (result == null)
                result = caseUnaryModificationExpressionChild(octalLongLiteral);
            if (result == null)
                result = caseUnaryExpressionChild(octalLongLiteral);
            if (result == null)
                result = caseMultiplicativeExpressionChild(octalLongLiteral);
            if (result == null)
                result = caseAdditiveExpressionChild(octalLongLiteral);
            if (result == null)
                result = caseShiftExpressionChild(octalLongLiteral);
            if (result == null)
                result = caseRelationExpressionChild(octalLongLiteral);
            if (result == null)
                result = caseInstanceOfExpressionChild(octalLongLiteral);
            if (result == null)
                result = caseEqualityExpressionChild(octalLongLiteral);
            if (result == null)
                result = caseAndExpressionChild(octalLongLiteral);
            if (result == null)
                result = caseExclusiveOrExpressionChild(octalLongLiteral);
            if (result == null)
                result = caseInclusiveOrExpressionChild(octalLongLiteral);
            if (result == null)
                result = caseConditionalAndExpressionChild(octalLongLiteral);
            if (result == null)
                result = caseConditionalOrExpressionChild(octalLongLiteral);
            if (result == null)
                result = caseConditionalExpressionChild(octalLongLiteral);
            if (result == null)
                result = caseAssignmentExpressionChild(octalLongLiteral);
            if (result == null)
                result = caseExpression(octalLongLiteral);
            if (result == null)
                result = caseArrayInitializationValue(octalLongLiteral);
            if (result == null)
                result = caseAnnotationValue(octalLongLiteral);
            if (result == null)
                result = caseCommentable(octalLongLiteral);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case LiteralsPackage.NULL_LITERAL: {
            NullLiteral nullLiteral = (NullLiteral) theEObject;
            T result = caseNullLiteral(nullLiteral);
            if (result == null)
                result = caseLiteral(nullLiteral);
            if (result == null)
                result = casePrimaryExpression(nullLiteral);
            if (result == null)
                result = caseUnaryModificationExpressionChild(nullLiteral);
            if (result == null)
                result = caseUnaryExpressionChild(nullLiteral);
            if (result == null)
                result = caseMultiplicativeExpressionChild(nullLiteral);
            if (result == null)
                result = caseAdditiveExpressionChild(nullLiteral);
            if (result == null)
                result = caseShiftExpressionChild(nullLiteral);
            if (result == null)
                result = caseRelationExpressionChild(nullLiteral);
            if (result == null)
                result = caseInstanceOfExpressionChild(nullLiteral);
            if (result == null)
                result = caseEqualityExpressionChild(nullLiteral);
            if (result == null)
                result = caseAndExpressionChild(nullLiteral);
            if (result == null)
                result = caseExclusiveOrExpressionChild(nullLiteral);
            if (result == null)
                result = caseInclusiveOrExpressionChild(nullLiteral);
            if (result == null)
                result = caseConditionalAndExpressionChild(nullLiteral);
            if (result == null)
                result = caseConditionalOrExpressionChild(nullLiteral);
            if (result == null)
                result = caseConditionalExpressionChild(nullLiteral);
            if (result == null)
                result = caseAssignmentExpressionChild(nullLiteral);
            if (result == null)
                result = caseExpression(nullLiteral);
            if (result == null)
                result = caseArrayInitializationValue(nullLiteral);
            if (result == null)
                result = caseAnnotationValue(nullLiteral);
            if (result == null)
                result = caseCommentable(nullLiteral);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case LiteralsPackage.SUPER: {
            Super super_ = (Super) theEObject;
            T result = caseSuper(super_);
            if (result == null)
                result = caseSelf(super_);
            if (result == null)
                result = caseCommentable(super_);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case LiteralsPackage.THIS: {
            This this_ = (This) theEObject;
            T result = caseThis(this_);
            if (result == null)
                result = caseSelf(this_);
            if (result == null)
                result = caseCommentable(this_);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        default:
            return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Literal</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Literal</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLiteral(Literal object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Self</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Self</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSelf(Self object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBooleanLiteral(BooleanLiteral object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Character Literal</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Character Literal</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCharacterLiteral(CharacterLiteral object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Float Literal</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Float Literal</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFloatLiteral(FloatLiteral object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Decimal Float Literal</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Decimal Float Literal</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDecimalFloatLiteral(DecimalFloatLiteral object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Hex Float Literal</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Hex Float Literal</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseHexFloatLiteral(HexFloatLiteral object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Double Literal</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Double Literal</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDoubleLiteral(DoubleLiteral object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Decimal Double Literal</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Decimal Double Literal</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDecimalDoubleLiteral(DecimalDoubleLiteral object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Hex Double Literal</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Hex Double Literal</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseHexDoubleLiteral(HexDoubleLiteral object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Integer Literal</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Integer Literal</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIntegerLiteral(IntegerLiteral object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Decimal Integer Literal</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Decimal Integer Literal</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDecimalIntegerLiteral(DecimalIntegerLiteral object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Hex Integer Literal</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Hex Integer Literal</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseHexIntegerLiteral(HexIntegerLiteral object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Octal Integer Literal</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Octal Integer Literal</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOctalIntegerLiteral(OctalIntegerLiteral object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Long Literal</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Long Literal</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLongLiteral(LongLiteral object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Decimal Long Literal</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Decimal Long Literal</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDecimalLongLiteral(DecimalLongLiteral object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Hex Long Literal</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Hex Long Literal</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseHexLongLiteral(HexLongLiteral object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Octal Long Literal</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Octal Long Literal</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOctalLongLiteral(OctalLongLiteral object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Null Literal</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Null Literal</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNullLiteral(NullLiteral object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Super</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Super</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSuper(Super object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>This</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>This</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseThis(This object) {
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

} //LiteralsSwitch
