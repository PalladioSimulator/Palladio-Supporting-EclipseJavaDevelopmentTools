/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.operators.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.palladiosimulator.jdt.metamodel.javamodel.operators.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OperatorsFactoryImpl extends EFactoryImpl implements OperatorsFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static OperatorsFactory init() {
        try {
            OperatorsFactory theOperatorsFactory = (OperatorsFactory) EPackage.Registry.INSTANCE
                    .getEFactory(OperatorsPackage.eNS_URI);
            if (theOperatorsFactory != null) {
                return theOperatorsFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new OperatorsFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OperatorsFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
        case OperatorsPackage.ASSIGNMENT:
            return createAssignment();
        case OperatorsPackage.ASSIGNMENT_AND:
            return createAssignmentAnd();
        case OperatorsPackage.ASSIGNMENT_DIVISION:
            return createAssignmentDivision();
        case OperatorsPackage.ASSIGNMENT_EXCLUSIVE_OR:
            return createAssignmentExclusiveOr();
        case OperatorsPackage.ASSIGNMENT_MINUS:
            return createAssignmentMinus();
        case OperatorsPackage.ASSIGNMENT_MODULO:
            return createAssignmentModulo();
        case OperatorsPackage.ASSIGNMENT_MULTIPLICATION:
            return createAssignmentMultiplication();
        case OperatorsPackage.ASSIGNMENT_LEFT_SHIFT:
            return createAssignmentLeftShift();
        case OperatorsPackage.ASSIGNMENT_OR:
            return createAssignmentOr();
        case OperatorsPackage.ASSIGNMENT_PLUS:
            return createAssignmentPlus();
        case OperatorsPackage.ASSIGNMENT_RIGHT_SHIFT:
            return createAssignmentRightShift();
        case OperatorsPackage.ASSIGNMENT_UNSIGNED_RIGHT_SHIFT:
            return createAssignmentUnsignedRightShift();
        case OperatorsPackage.EQUAL:
            return createEqual();
        case OperatorsPackage.NOT_EQUAL:
            return createNotEqual();
        case OperatorsPackage.GREATER_THAN:
            return createGreaterThan();
        case OperatorsPackage.GREATER_THAN_OR_EQUAL:
            return createGreaterThanOrEqual();
        case OperatorsPackage.LESS_THAN:
            return createLessThan();
        case OperatorsPackage.LESS_THAN_OR_EQUAL:
            return createLessThanOrEqual();
        case OperatorsPackage.ADDITION:
            return createAddition();
        case OperatorsPackage.SUBTRACTION:
            return createSubtraction();
        case OperatorsPackage.DIVISION:
            return createDivision();
        case OperatorsPackage.MULTIPLICATION:
            return createMultiplication();
        case OperatorsPackage.REMAINDER:
            return createRemainder();
        case OperatorsPackage.COMPLEMENT:
            return createComplement();
        case OperatorsPackage.MINUS_MINUS:
            return createMinusMinus();
        case OperatorsPackage.NEGATE:
            return createNegate();
        case OperatorsPackage.PLUS_PLUS:
            return createPlusPlus();
        case OperatorsPackage.LEFT_SHIFT:
            return createLeftShift();
        case OperatorsPackage.RIGHT_SHIFT:
            return createRightShift();
        case OperatorsPackage.UNSIGNED_RIGHT_SHIFT:
            return createUnsignedRightShift();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Assignment createAssignment() {
        AssignmentImpl assignment = new AssignmentImpl();
        return assignment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AssignmentAnd createAssignmentAnd() {
        AssignmentAndImpl assignmentAnd = new AssignmentAndImpl();
        return assignmentAnd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AssignmentDivision createAssignmentDivision() {
        AssignmentDivisionImpl assignmentDivision = new AssignmentDivisionImpl();
        return assignmentDivision;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AssignmentExclusiveOr createAssignmentExclusiveOr() {
        AssignmentExclusiveOrImpl assignmentExclusiveOr = new AssignmentExclusiveOrImpl();
        return assignmentExclusiveOr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AssignmentMinus createAssignmentMinus() {
        AssignmentMinusImpl assignmentMinus = new AssignmentMinusImpl();
        return assignmentMinus;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AssignmentModulo createAssignmentModulo() {
        AssignmentModuloImpl assignmentModulo = new AssignmentModuloImpl();
        return assignmentModulo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AssignmentMultiplication createAssignmentMultiplication() {
        AssignmentMultiplicationImpl assignmentMultiplication = new AssignmentMultiplicationImpl();
        return assignmentMultiplication;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AssignmentLeftShift createAssignmentLeftShift() {
        AssignmentLeftShiftImpl assignmentLeftShift = new AssignmentLeftShiftImpl();
        return assignmentLeftShift;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AssignmentOr createAssignmentOr() {
        AssignmentOrImpl assignmentOr = new AssignmentOrImpl();
        return assignmentOr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AssignmentPlus createAssignmentPlus() {
        AssignmentPlusImpl assignmentPlus = new AssignmentPlusImpl();
        return assignmentPlus;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AssignmentRightShift createAssignmentRightShift() {
        AssignmentRightShiftImpl assignmentRightShift = new AssignmentRightShiftImpl();
        return assignmentRightShift;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AssignmentUnsignedRightShift createAssignmentUnsignedRightShift() {
        AssignmentUnsignedRightShiftImpl assignmentUnsignedRightShift = new AssignmentUnsignedRightShiftImpl();
        return assignmentUnsignedRightShift;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Equal createEqual() {
        EqualImpl equal = new EqualImpl();
        return equal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotEqual createNotEqual() {
        NotEqualImpl notEqual = new NotEqualImpl();
        return notEqual;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GreaterThan createGreaterThan() {
        GreaterThanImpl greaterThan = new GreaterThanImpl();
        return greaterThan;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GreaterThanOrEqual createGreaterThanOrEqual() {
        GreaterThanOrEqualImpl greaterThanOrEqual = new GreaterThanOrEqualImpl();
        return greaterThanOrEqual;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LessThan createLessThan() {
        LessThanImpl lessThan = new LessThanImpl();
        return lessThan;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LessThanOrEqual createLessThanOrEqual() {
        LessThanOrEqualImpl lessThanOrEqual = new LessThanOrEqualImpl();
        return lessThanOrEqual;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Addition createAddition() {
        AdditionImpl addition = new AdditionImpl();
        return addition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Subtraction createSubtraction() {
        SubtractionImpl subtraction = new SubtractionImpl();
        return subtraction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Division createDivision() {
        DivisionImpl division = new DivisionImpl();
        return division;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Multiplication createMultiplication() {
        MultiplicationImpl multiplication = new MultiplicationImpl();
        return multiplication;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Remainder createRemainder() {
        RemainderImpl remainder = new RemainderImpl();
        return remainder;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Complement createComplement() {
        ComplementImpl complement = new ComplementImpl();
        return complement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MinusMinus createMinusMinus() {
        MinusMinusImpl minusMinus = new MinusMinusImpl();
        return minusMinus;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Negate createNegate() {
        NegateImpl negate = new NegateImpl();
        return negate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PlusPlus createPlusPlus() {
        PlusPlusImpl plusPlus = new PlusPlusImpl();
        return plusPlus;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LeftShift createLeftShift() {
        LeftShiftImpl leftShift = new LeftShiftImpl();
        return leftShift;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RightShift createRightShift() {
        RightShiftImpl rightShift = new RightShiftImpl();
        return rightShift;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public UnsignedRightShift createUnsignedRightShift() {
        UnsignedRightShiftImpl unsignedRightShift = new UnsignedRightShiftImpl();
        return unsignedRightShift;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public OperatorsPackage getOperatorsPackage() {
        return (OperatorsPackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static OperatorsPackage getPackage() {
        return OperatorsPackage.eINSTANCE;
    }

} //OperatorsFactoryImpl
