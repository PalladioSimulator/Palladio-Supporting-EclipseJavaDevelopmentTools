/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.operators.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable;

import org.palladiosimulator.jdt.metamodel.javamodel.operators.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.jdt.metamodel.javamodel.operators.OperatorsPackage
 * @generated
 */
public class OperatorsAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static OperatorsPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OperatorsAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = OperatorsPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject) object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OperatorsSwitch<Adapter> modelSwitch = new OperatorsSwitch<Adapter>() {
        @Override
        public Adapter caseOperator(Operator object) {
            return createOperatorAdapter();
        }

        @Override
        public Adapter caseAdditiveOperator(AdditiveOperator object) {
            return createAdditiveOperatorAdapter();
        }

        @Override
        public Adapter caseAssignmentOperator(AssignmentOperator object) {
            return createAssignmentOperatorAdapter();
        }

        @Override
        public Adapter caseEqualityOperator(EqualityOperator object) {
            return createEqualityOperatorAdapter();
        }

        @Override
        public Adapter caseMultiplicativeOperator(MultiplicativeOperator object) {
            return createMultiplicativeOperatorAdapter();
        }

        @Override
        public Adapter caseRelationOperator(RelationOperator object) {
            return createRelationOperatorAdapter();
        }

        @Override
        public Adapter caseShiftOperator(ShiftOperator object) {
            return createShiftOperatorAdapter();
        }

        @Override
        public Adapter caseUnaryOperator(UnaryOperator object) {
            return createUnaryOperatorAdapter();
        }

        @Override
        public Adapter caseUnaryModificationOperator(UnaryModificationOperator object) {
            return createUnaryModificationOperatorAdapter();
        }

        @Override
        public Adapter caseAssignment(Assignment object) {
            return createAssignmentAdapter();
        }

        @Override
        public Adapter caseAssignmentAnd(AssignmentAnd object) {
            return createAssignmentAndAdapter();
        }

        @Override
        public Adapter caseAssignmentDivision(AssignmentDivision object) {
            return createAssignmentDivisionAdapter();
        }

        @Override
        public Adapter caseAssignmentExclusiveOr(AssignmentExclusiveOr object) {
            return createAssignmentExclusiveOrAdapter();
        }

        @Override
        public Adapter caseAssignmentMinus(AssignmentMinus object) {
            return createAssignmentMinusAdapter();
        }

        @Override
        public Adapter caseAssignmentModulo(AssignmentModulo object) {
            return createAssignmentModuloAdapter();
        }

        @Override
        public Adapter caseAssignmentMultiplication(AssignmentMultiplication object) {
            return createAssignmentMultiplicationAdapter();
        }

        @Override
        public Adapter caseAssignmentLeftShift(AssignmentLeftShift object) {
            return createAssignmentLeftShiftAdapter();
        }

        @Override
        public Adapter caseAssignmentOr(AssignmentOr object) {
            return createAssignmentOrAdapter();
        }

        @Override
        public Adapter caseAssignmentPlus(AssignmentPlus object) {
            return createAssignmentPlusAdapter();
        }

        @Override
        public Adapter caseAssignmentRightShift(AssignmentRightShift object) {
            return createAssignmentRightShiftAdapter();
        }

        @Override
        public Adapter caseAssignmentUnsignedRightShift(AssignmentUnsignedRightShift object) {
            return createAssignmentUnsignedRightShiftAdapter();
        }

        @Override
        public Adapter caseEqual(Equal object) {
            return createEqualAdapter();
        }

        @Override
        public Adapter caseNotEqual(NotEqual object) {
            return createNotEqualAdapter();
        }

        @Override
        public Adapter caseGreaterThan(GreaterThan object) {
            return createGreaterThanAdapter();
        }

        @Override
        public Adapter caseGreaterThanOrEqual(GreaterThanOrEqual object) {
            return createGreaterThanOrEqualAdapter();
        }

        @Override
        public Adapter caseLessThan(LessThan object) {
            return createLessThanAdapter();
        }

        @Override
        public Adapter caseLessThanOrEqual(LessThanOrEqual object) {
            return createLessThanOrEqualAdapter();
        }

        @Override
        public Adapter caseAddition(Addition object) {
            return createAdditionAdapter();
        }

        @Override
        public Adapter caseSubtraction(Subtraction object) {
            return createSubtractionAdapter();
        }

        @Override
        public Adapter caseDivision(Division object) {
            return createDivisionAdapter();
        }

        @Override
        public Adapter caseMultiplication(Multiplication object) {
            return createMultiplicationAdapter();
        }

        @Override
        public Adapter caseRemainder(Remainder object) {
            return createRemainderAdapter();
        }

        @Override
        public Adapter caseComplement(Complement object) {
            return createComplementAdapter();
        }

        @Override
        public Adapter caseMinusMinus(MinusMinus object) {
            return createMinusMinusAdapter();
        }

        @Override
        public Adapter caseNegate(Negate object) {
            return createNegateAdapter();
        }

        @Override
        public Adapter casePlusPlus(PlusPlus object) {
            return createPlusPlusAdapter();
        }

        @Override
        public Adapter caseLeftShift(LeftShift object) {
            return createLeftShiftAdapter();
        }

        @Override
        public Adapter caseRightShift(RightShift object) {
            return createRightShiftAdapter();
        }

        @Override
        public Adapter caseUnsignedRightShift(UnsignedRightShift object) {
            return createUnsignedRightShiftAdapter();
        }

        @Override
        public Adapter caseCommentable(Commentable object) {
            return createCommentableAdapter();
        }

        @Override
        public Adapter defaultCase(EObject object) {
            return createEObjectAdapter();
        }
    };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject) target);
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.operators.Operator <em>Operator</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.operators.Operator
     * @generated
     */
    public Adapter createOperatorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.operators.AdditiveOperator <em>Additive Operator</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.operators.AdditiveOperator
     * @generated
     */
    public Adapter createAdditiveOperatorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.operators.AssignmentOperator <em>Assignment Operator</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.operators.AssignmentOperator
     * @generated
     */
    public Adapter createAssignmentOperatorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.operators.EqualityOperator <em>Equality Operator</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.operators.EqualityOperator
     * @generated
     */
    public Adapter createEqualityOperatorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.operators.MultiplicativeOperator <em>Multiplicative Operator</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.operators.MultiplicativeOperator
     * @generated
     */
    public Adapter createMultiplicativeOperatorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.operators.RelationOperator <em>Relation Operator</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.operators.RelationOperator
     * @generated
     */
    public Adapter createRelationOperatorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.operators.ShiftOperator <em>Shift Operator</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.operators.ShiftOperator
     * @generated
     */
    public Adapter createShiftOperatorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.operators.UnaryOperator <em>Unary Operator</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.operators.UnaryOperator
     * @generated
     */
    public Adapter createUnaryOperatorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.operators.UnaryModificationOperator <em>Unary Modification Operator</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.operators.UnaryModificationOperator
     * @generated
     */
    public Adapter createUnaryModificationOperatorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.operators.Assignment <em>Assignment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.operators.Assignment
     * @generated
     */
    public Adapter createAssignmentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.operators.AssignmentAnd <em>Assignment And</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.operators.AssignmentAnd
     * @generated
     */
    public Adapter createAssignmentAndAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.operators.AssignmentDivision <em>Assignment Division</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.operators.AssignmentDivision
     * @generated
     */
    public Adapter createAssignmentDivisionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.operators.AssignmentExclusiveOr <em>Assignment Exclusive Or</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.operators.AssignmentExclusiveOr
     * @generated
     */
    public Adapter createAssignmentExclusiveOrAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.operators.AssignmentMinus <em>Assignment Minus</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.operators.AssignmentMinus
     * @generated
     */
    public Adapter createAssignmentMinusAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.operators.AssignmentModulo <em>Assignment Modulo</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.operators.AssignmentModulo
     * @generated
     */
    public Adapter createAssignmentModuloAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.operators.AssignmentMultiplication <em>Assignment Multiplication</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.operators.AssignmentMultiplication
     * @generated
     */
    public Adapter createAssignmentMultiplicationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.operators.AssignmentLeftShift <em>Assignment Left Shift</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.operators.AssignmentLeftShift
     * @generated
     */
    public Adapter createAssignmentLeftShiftAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.operators.AssignmentOr <em>Assignment Or</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.operators.AssignmentOr
     * @generated
     */
    public Adapter createAssignmentOrAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.operators.AssignmentPlus <em>Assignment Plus</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.operators.AssignmentPlus
     * @generated
     */
    public Adapter createAssignmentPlusAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.operators.AssignmentRightShift <em>Assignment Right Shift</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.operators.AssignmentRightShift
     * @generated
     */
    public Adapter createAssignmentRightShiftAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.operators.AssignmentUnsignedRightShift <em>Assignment Unsigned Right Shift</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.operators.AssignmentUnsignedRightShift
     * @generated
     */
    public Adapter createAssignmentUnsignedRightShiftAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.operators.Equal <em>Equal</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.operators.Equal
     * @generated
     */
    public Adapter createEqualAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.operators.NotEqual <em>Not Equal</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.operators.NotEqual
     * @generated
     */
    public Adapter createNotEqualAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.operators.GreaterThan <em>Greater Than</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.operators.GreaterThan
     * @generated
     */
    public Adapter createGreaterThanAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.operators.GreaterThanOrEqual <em>Greater Than Or Equal</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.operators.GreaterThanOrEqual
     * @generated
     */
    public Adapter createGreaterThanOrEqualAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.operators.LessThan <em>Less Than</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.operators.LessThan
     * @generated
     */
    public Adapter createLessThanAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.operators.LessThanOrEqual <em>Less Than Or Equal</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.operators.LessThanOrEqual
     * @generated
     */
    public Adapter createLessThanOrEqualAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.operators.Addition <em>Addition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.operators.Addition
     * @generated
     */
    public Adapter createAdditionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.operators.Subtraction <em>Subtraction</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.operators.Subtraction
     * @generated
     */
    public Adapter createSubtractionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.operators.Division <em>Division</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.operators.Division
     * @generated
     */
    public Adapter createDivisionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.operators.Multiplication <em>Multiplication</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.operators.Multiplication
     * @generated
     */
    public Adapter createMultiplicationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.operators.Remainder <em>Remainder</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.operators.Remainder
     * @generated
     */
    public Adapter createRemainderAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.operators.Complement <em>Complement</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.operators.Complement
     * @generated
     */
    public Adapter createComplementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.operators.MinusMinus <em>Minus Minus</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.operators.MinusMinus
     * @generated
     */
    public Adapter createMinusMinusAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.operators.Negate <em>Negate</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.operators.Negate
     * @generated
     */
    public Adapter createNegateAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.operators.PlusPlus <em>Plus Plus</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.operators.PlusPlus
     * @generated
     */
    public Adapter createPlusPlusAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.operators.LeftShift <em>Left Shift</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.operators.LeftShift
     * @generated
     */
    public Adapter createLeftShiftAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.operators.RightShift <em>Right Shift</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.operators.RightShift
     * @generated
     */
    public Adapter createRightShiftAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.operators.UnsignedRightShift <em>Unsigned Right Shift</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.operators.UnsignedRightShift
     * @generated
     */
    public Adapter createUnsignedRightShiftAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable <em>Commentable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable
     * @generated
     */
    public Adapter createCommentableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //OperatorsAdapterFactory
