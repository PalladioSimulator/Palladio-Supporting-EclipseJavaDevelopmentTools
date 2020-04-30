/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.operators.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationsPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.annotations.impl.AnnotationsPackageImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArraysPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArraysPackageImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.ClassifiersPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.ClassifiersPackageImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.CommonsPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.impl.CommonsPackageImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.containers.ContainersPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.containers.impl.ContainersPackageImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExpressionsPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.generics.GenericsPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.generics.impl.GenericsPackageImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.imports.ImportsPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.imports.impl.ImportsPackageImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.instantiations.InstantiationsPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.instantiations.impl.InstantiationsPackageImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.literals.LiteralsPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.LiteralsPackageImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.members.MembersPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.members.impl.MembersPackageImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.modifiers.ModifiersPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.modifiers.impl.ModifiersPackageImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.operators.Addition;
import org.palladiosimulator.jdt.metamodel.javamodel.operators.AdditiveOperator;
import org.palladiosimulator.jdt.metamodel.javamodel.operators.Assignment;
import org.palladiosimulator.jdt.metamodel.javamodel.operators.AssignmentAnd;
import org.palladiosimulator.jdt.metamodel.javamodel.operators.AssignmentDivision;
import org.palladiosimulator.jdt.metamodel.javamodel.operators.AssignmentExclusiveOr;
import org.palladiosimulator.jdt.metamodel.javamodel.operators.AssignmentLeftShift;
import org.palladiosimulator.jdt.metamodel.javamodel.operators.AssignmentMinus;
import org.palladiosimulator.jdt.metamodel.javamodel.operators.AssignmentModulo;
import org.palladiosimulator.jdt.metamodel.javamodel.operators.AssignmentMultiplication;
import org.palladiosimulator.jdt.metamodel.javamodel.operators.AssignmentOperator;
import org.palladiosimulator.jdt.metamodel.javamodel.operators.AssignmentOr;
import org.palladiosimulator.jdt.metamodel.javamodel.operators.AssignmentPlus;
import org.palladiosimulator.jdt.metamodel.javamodel.operators.AssignmentRightShift;
import org.palladiosimulator.jdt.metamodel.javamodel.operators.AssignmentUnsignedRightShift;
import org.palladiosimulator.jdt.metamodel.javamodel.operators.Complement;
import org.palladiosimulator.jdt.metamodel.javamodel.operators.Division;
import org.palladiosimulator.jdt.metamodel.javamodel.operators.Equal;
import org.palladiosimulator.jdt.metamodel.javamodel.operators.EqualityOperator;
import org.palladiosimulator.jdt.metamodel.javamodel.operators.GreaterThan;
import org.palladiosimulator.jdt.metamodel.javamodel.operators.GreaterThanOrEqual;
import org.palladiosimulator.jdt.metamodel.javamodel.operators.LeftShift;
import org.palladiosimulator.jdt.metamodel.javamodel.operators.LessThan;
import org.palladiosimulator.jdt.metamodel.javamodel.operators.LessThanOrEqual;
import org.palladiosimulator.jdt.metamodel.javamodel.operators.MinusMinus;
import org.palladiosimulator.jdt.metamodel.javamodel.operators.Multiplication;
import org.palladiosimulator.jdt.metamodel.javamodel.operators.MultiplicativeOperator;
import org.palladiosimulator.jdt.metamodel.javamodel.operators.Negate;
import org.palladiosimulator.jdt.metamodel.javamodel.operators.NotEqual;
import org.palladiosimulator.jdt.metamodel.javamodel.operators.Operator;
import org.palladiosimulator.jdt.metamodel.javamodel.operators.OperatorsFactory;
import org.palladiosimulator.jdt.metamodel.javamodel.operators.OperatorsPackage;
import org.palladiosimulator.jdt.metamodel.javamodel.operators.PlusPlus;
import org.palladiosimulator.jdt.metamodel.javamodel.operators.RelationOperator;
import org.palladiosimulator.jdt.metamodel.javamodel.operators.Remainder;
import org.palladiosimulator.jdt.metamodel.javamodel.operators.RightShift;
import org.palladiosimulator.jdt.metamodel.javamodel.operators.ShiftOperator;
import org.palladiosimulator.jdt.metamodel.javamodel.operators.Subtraction;
import org.palladiosimulator.jdt.metamodel.javamodel.operators.UnaryModificationOperator;
import org.palladiosimulator.jdt.metamodel.javamodel.operators.UnaryOperator;
import org.palladiosimulator.jdt.metamodel.javamodel.operators.UnsignedRightShift;

import org.palladiosimulator.jdt.metamodel.javamodel.parameters.ParametersPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.parameters.impl.ParametersPackageImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.references.ReferencesPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.references.impl.ReferencesPackageImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementsPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.statements.impl.StatementsPackageImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.types.TypesPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.types.impl.TypesPackageImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.variables.VariablesPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.variables.impl.VariablesPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OperatorsPackageImpl extends EPackageImpl implements OperatorsPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass operatorEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass additiveOperatorEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass assignmentOperatorEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass equalityOperatorEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass multiplicativeOperatorEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass relationOperatorEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass shiftOperatorEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass unaryOperatorEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass unaryModificationOperatorEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass assignmentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass assignmentAndEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass assignmentDivisionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass assignmentExclusiveOrEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass assignmentMinusEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass assignmentModuloEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass assignmentMultiplicationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass assignmentLeftShiftEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass assignmentOrEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass assignmentPlusEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass assignmentRightShiftEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass assignmentUnsignedRightShiftEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass equalEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass notEqualEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass greaterThanEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass greaterThanOrEqualEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass lessThanEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass lessThanOrEqualEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass additionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass subtractionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass divisionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass multiplicationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass remainderEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass complementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass minusMinusEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass negateEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass plusPlusEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass leftShiftEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass rightShiftEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass unsignedRightShiftEClass = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.palladiosimulator.jdt.metamodel.javamodel.operators.OperatorsPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private OperatorsPackageImpl() {
        super(eNS_URI, OperatorsFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     *
     * <p>This method is used to initialize {@link OperatorsPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static OperatorsPackage init() {
        if (isInited)
            return (OperatorsPackage) EPackage.Registry.INSTANCE.getEPackage(OperatorsPackage.eNS_URI);

        // Obtain or create and register package
        Object registeredOperatorsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        OperatorsPackageImpl theOperatorsPackage = registeredOperatorsPackage instanceof OperatorsPackageImpl
                ? (OperatorsPackageImpl) registeredOperatorsPackage
                : new OperatorsPackageImpl();

        isInited = true;

        // Obtain or create and register interdependencies
        Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AnnotationsPackage.eNS_URI);
        AnnotationsPackageImpl theAnnotationsPackage = (AnnotationsPackageImpl) (registeredPackage instanceof AnnotationsPackageImpl
                ? registeredPackage
                : AnnotationsPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ArraysPackage.eNS_URI);
        ArraysPackageImpl theArraysPackage = (ArraysPackageImpl) (registeredPackage instanceof ArraysPackageImpl
                ? registeredPackage
                : ArraysPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ClassifiersPackage.eNS_URI);
        ClassifiersPackageImpl theClassifiersPackage = (ClassifiersPackageImpl) (registeredPackage instanceof ClassifiersPackageImpl
                ? registeredPackage
                : ClassifiersPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CommonsPackage.eNS_URI);
        CommonsPackageImpl theCommonsPackage = (CommonsPackageImpl) (registeredPackage instanceof CommonsPackageImpl
                ? registeredPackage
                : CommonsPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ContainersPackage.eNS_URI);
        ContainersPackageImpl theContainersPackage = (ContainersPackageImpl) (registeredPackage instanceof ContainersPackageImpl
                ? registeredPackage
                : ContainersPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI);
        ExpressionsPackageImpl theExpressionsPackage = (ExpressionsPackageImpl) (registeredPackage instanceof ExpressionsPackageImpl
                ? registeredPackage
                : ExpressionsPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GenericsPackage.eNS_URI);
        GenericsPackageImpl theGenericsPackage = (GenericsPackageImpl) (registeredPackage instanceof GenericsPackageImpl
                ? registeredPackage
                : GenericsPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ImportsPackage.eNS_URI);
        ImportsPackageImpl theImportsPackage = (ImportsPackageImpl) (registeredPackage instanceof ImportsPackageImpl
                ? registeredPackage
                : ImportsPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(InstantiationsPackage.eNS_URI);
        InstantiationsPackageImpl theInstantiationsPackage = (InstantiationsPackageImpl) (registeredPackage instanceof InstantiationsPackageImpl
                ? registeredPackage
                : InstantiationsPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LiteralsPackage.eNS_URI);
        LiteralsPackageImpl theLiteralsPackage = (LiteralsPackageImpl) (registeredPackage instanceof LiteralsPackageImpl
                ? registeredPackage
                : LiteralsPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MembersPackage.eNS_URI);
        MembersPackageImpl theMembersPackage = (MembersPackageImpl) (registeredPackage instanceof MembersPackageImpl
                ? registeredPackage
                : MembersPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ModifiersPackage.eNS_URI);
        ModifiersPackageImpl theModifiersPackage = (ModifiersPackageImpl) (registeredPackage instanceof ModifiersPackageImpl
                ? registeredPackage
                : ModifiersPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ParametersPackage.eNS_URI);
        ParametersPackageImpl theParametersPackage = (ParametersPackageImpl) (registeredPackage instanceof ParametersPackageImpl
                ? registeredPackage
                : ParametersPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ReferencesPackage.eNS_URI);
        ReferencesPackageImpl theReferencesPackage = (ReferencesPackageImpl) (registeredPackage instanceof ReferencesPackageImpl
                ? registeredPackage
                : ReferencesPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StatementsPackage.eNS_URI);
        StatementsPackageImpl theStatementsPackage = (StatementsPackageImpl) (registeredPackage instanceof StatementsPackageImpl
                ? registeredPackage
                : StatementsPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
        TypesPackageImpl theTypesPackage = (TypesPackageImpl) (registeredPackage instanceof TypesPackageImpl
                ? registeredPackage
                : TypesPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(VariablesPackage.eNS_URI);
        VariablesPackageImpl theVariablesPackage = (VariablesPackageImpl) (registeredPackage instanceof VariablesPackageImpl
                ? registeredPackage
                : VariablesPackage.eINSTANCE);

        // Create package meta-data objects
        theOperatorsPackage.createPackageContents();
        theAnnotationsPackage.createPackageContents();
        theArraysPackage.createPackageContents();
        theClassifiersPackage.createPackageContents();
        theCommonsPackage.createPackageContents();
        theContainersPackage.createPackageContents();
        theExpressionsPackage.createPackageContents();
        theGenericsPackage.createPackageContents();
        theImportsPackage.createPackageContents();
        theInstantiationsPackage.createPackageContents();
        theLiteralsPackage.createPackageContents();
        theMembersPackage.createPackageContents();
        theModifiersPackage.createPackageContents();
        theParametersPackage.createPackageContents();
        theReferencesPackage.createPackageContents();
        theStatementsPackage.createPackageContents();
        theTypesPackage.createPackageContents();
        theVariablesPackage.createPackageContents();

        // Initialize created meta-data
        theOperatorsPackage.initializePackageContents();
        theAnnotationsPackage.initializePackageContents();
        theArraysPackage.initializePackageContents();
        theClassifiersPackage.initializePackageContents();
        theCommonsPackage.initializePackageContents();
        theContainersPackage.initializePackageContents();
        theExpressionsPackage.initializePackageContents();
        theGenericsPackage.initializePackageContents();
        theImportsPackage.initializePackageContents();
        theInstantiationsPackage.initializePackageContents();
        theLiteralsPackage.initializePackageContents();
        theMembersPackage.initializePackageContents();
        theModifiersPackage.initializePackageContents();
        theParametersPackage.initializePackageContents();
        theReferencesPackage.initializePackageContents();
        theStatementsPackage.initializePackageContents();
        theTypesPackage.initializePackageContents();
        theVariablesPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theOperatorsPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(OperatorsPackage.eNS_URI, theOperatorsPackage);
        return theOperatorsPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getOperator() {
        return operatorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAdditiveOperator() {
        return additiveOperatorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAssignmentOperator() {
        return assignmentOperatorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEqualityOperator() {
        return equalityOperatorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getMultiplicativeOperator() {
        return multiplicativeOperatorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getRelationOperator() {
        return relationOperatorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getShiftOperator() {
        return shiftOperatorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getUnaryOperator() {
        return unaryOperatorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getUnaryModificationOperator() {
        return unaryModificationOperatorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAssignment() {
        return assignmentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAssignmentAnd() {
        return assignmentAndEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAssignmentDivision() {
        return assignmentDivisionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAssignmentExclusiveOr() {
        return assignmentExclusiveOrEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAssignmentMinus() {
        return assignmentMinusEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAssignmentModulo() {
        return assignmentModuloEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAssignmentMultiplication() {
        return assignmentMultiplicationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAssignmentLeftShift() {
        return assignmentLeftShiftEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAssignmentOr() {
        return assignmentOrEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAssignmentPlus() {
        return assignmentPlusEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAssignmentRightShift() {
        return assignmentRightShiftEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAssignmentUnsignedRightShift() {
        return assignmentUnsignedRightShiftEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEqual() {
        return equalEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getNotEqual() {
        return notEqualEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getGreaterThan() {
        return greaterThanEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getGreaterThanOrEqual() {
        return greaterThanOrEqualEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getLessThan() {
        return lessThanEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getLessThanOrEqual() {
        return lessThanOrEqualEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAddition() {
        return additionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSubtraction() {
        return subtractionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getDivision() {
        return divisionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getMultiplication() {
        return multiplicationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getRemainder() {
        return remainderEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getComplement() {
        return complementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getMinusMinus() {
        return minusMinusEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getNegate() {
        return negateEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getPlusPlus() {
        return plusPlusEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getLeftShift() {
        return leftShiftEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getRightShift() {
        return rightShiftEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getUnsignedRightShift() {
        return unsignedRightShiftEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public OperatorsFactory getOperatorsFactory() {
        return (OperatorsFactory) getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated)
            return;
        isCreated = true;

        // Create classes and their features
        operatorEClass = createEClass(OPERATOR);

        additiveOperatorEClass = createEClass(ADDITIVE_OPERATOR);

        assignmentOperatorEClass = createEClass(ASSIGNMENT_OPERATOR);

        equalityOperatorEClass = createEClass(EQUALITY_OPERATOR);

        multiplicativeOperatorEClass = createEClass(MULTIPLICATIVE_OPERATOR);

        relationOperatorEClass = createEClass(RELATION_OPERATOR);

        shiftOperatorEClass = createEClass(SHIFT_OPERATOR);

        unaryOperatorEClass = createEClass(UNARY_OPERATOR);

        unaryModificationOperatorEClass = createEClass(UNARY_MODIFICATION_OPERATOR);

        assignmentEClass = createEClass(ASSIGNMENT);

        assignmentAndEClass = createEClass(ASSIGNMENT_AND);

        assignmentDivisionEClass = createEClass(ASSIGNMENT_DIVISION);

        assignmentExclusiveOrEClass = createEClass(ASSIGNMENT_EXCLUSIVE_OR);

        assignmentMinusEClass = createEClass(ASSIGNMENT_MINUS);

        assignmentModuloEClass = createEClass(ASSIGNMENT_MODULO);

        assignmentMultiplicationEClass = createEClass(ASSIGNMENT_MULTIPLICATION);

        assignmentLeftShiftEClass = createEClass(ASSIGNMENT_LEFT_SHIFT);

        assignmentOrEClass = createEClass(ASSIGNMENT_OR);

        assignmentPlusEClass = createEClass(ASSIGNMENT_PLUS);

        assignmentRightShiftEClass = createEClass(ASSIGNMENT_RIGHT_SHIFT);

        assignmentUnsignedRightShiftEClass = createEClass(ASSIGNMENT_UNSIGNED_RIGHT_SHIFT);

        equalEClass = createEClass(EQUAL);

        notEqualEClass = createEClass(NOT_EQUAL);

        greaterThanEClass = createEClass(GREATER_THAN);

        greaterThanOrEqualEClass = createEClass(GREATER_THAN_OR_EQUAL);

        lessThanEClass = createEClass(LESS_THAN);

        lessThanOrEqualEClass = createEClass(LESS_THAN_OR_EQUAL);

        additionEClass = createEClass(ADDITION);

        subtractionEClass = createEClass(SUBTRACTION);

        divisionEClass = createEClass(DIVISION);

        multiplicationEClass = createEClass(MULTIPLICATION);

        remainderEClass = createEClass(REMAINDER);

        complementEClass = createEClass(COMPLEMENT);

        minusMinusEClass = createEClass(MINUS_MINUS);

        negateEClass = createEClass(NEGATE);

        plusPlusEClass = createEClass(PLUS_PLUS);

        leftShiftEClass = createEClass(LEFT_SHIFT);

        rightShiftEClass = createEClass(RIGHT_SHIFT);

        unsignedRightShiftEClass = createEClass(UNSIGNED_RIGHT_SHIFT);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized)
            return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Obtain other dependent packages
        CommonsPackage theCommonsPackage = (CommonsPackage) EPackage.Registry.INSTANCE
                .getEPackage(CommonsPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        operatorEClass.getESuperTypes().add(theCommonsPackage.getCommentable());
        additiveOperatorEClass.getESuperTypes().add(this.getOperator());
        assignmentOperatorEClass.getESuperTypes().add(this.getOperator());
        equalityOperatorEClass.getESuperTypes().add(this.getOperator());
        multiplicativeOperatorEClass.getESuperTypes().add(this.getOperator());
        relationOperatorEClass.getESuperTypes().add(this.getOperator());
        shiftOperatorEClass.getESuperTypes().add(this.getOperator());
        unaryOperatorEClass.getESuperTypes().add(this.getOperator());
        unaryModificationOperatorEClass.getESuperTypes().add(this.getOperator());
        assignmentEClass.getESuperTypes().add(this.getAssignmentOperator());
        assignmentAndEClass.getESuperTypes().add(this.getAssignmentOperator());
        assignmentDivisionEClass.getESuperTypes().add(this.getAssignmentOperator());
        assignmentExclusiveOrEClass.getESuperTypes().add(this.getAssignmentOperator());
        assignmentMinusEClass.getESuperTypes().add(this.getAssignmentOperator());
        assignmentModuloEClass.getESuperTypes().add(this.getAssignmentOperator());
        assignmentMultiplicationEClass.getESuperTypes().add(this.getAssignmentOperator());
        assignmentLeftShiftEClass.getESuperTypes().add(this.getAssignmentOperator());
        assignmentOrEClass.getESuperTypes().add(this.getAssignmentOperator());
        assignmentPlusEClass.getESuperTypes().add(this.getAssignmentOperator());
        assignmentRightShiftEClass.getESuperTypes().add(this.getAssignmentOperator());
        assignmentUnsignedRightShiftEClass.getESuperTypes().add(this.getAssignmentOperator());
        equalEClass.getESuperTypes().add(this.getEqualityOperator());
        notEqualEClass.getESuperTypes().add(this.getEqualityOperator());
        greaterThanEClass.getESuperTypes().add(this.getRelationOperator());
        greaterThanOrEqualEClass.getESuperTypes().add(this.getRelationOperator());
        lessThanEClass.getESuperTypes().add(this.getRelationOperator());
        lessThanOrEqualEClass.getESuperTypes().add(this.getRelationOperator());
        additionEClass.getESuperTypes().add(this.getAdditiveOperator());
        additionEClass.getESuperTypes().add(this.getUnaryOperator());
        subtractionEClass.getESuperTypes().add(this.getAdditiveOperator());
        subtractionEClass.getESuperTypes().add(this.getUnaryOperator());
        divisionEClass.getESuperTypes().add(this.getMultiplicativeOperator());
        multiplicationEClass.getESuperTypes().add(this.getMultiplicativeOperator());
        remainderEClass.getESuperTypes().add(this.getMultiplicativeOperator());
        complementEClass.getESuperTypes().add(this.getUnaryOperator());
        minusMinusEClass.getESuperTypes().add(this.getUnaryModificationOperator());
        negateEClass.getESuperTypes().add(this.getUnaryOperator());
        plusPlusEClass.getESuperTypes().add(this.getUnaryModificationOperator());
        leftShiftEClass.getESuperTypes().add(this.getShiftOperator());
        rightShiftEClass.getESuperTypes().add(this.getShiftOperator());
        unsignedRightShiftEClass.getESuperTypes().add(this.getShiftOperator());

        // Initialize classes, features, and operations; add parameters
        initEClass(operatorEClass, Operator.class, "Operator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(additiveOperatorEClass, AdditiveOperator.class, "AdditiveOperator", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(assignmentOperatorEClass, AssignmentOperator.class, "AssignmentOperator", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(equalityOperatorEClass, EqualityOperator.class, "EqualityOperator", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(multiplicativeOperatorEClass, MultiplicativeOperator.class, "MultiplicativeOperator", IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(relationOperatorEClass, RelationOperator.class, "RelationOperator", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(shiftOperatorEClass, ShiftOperator.class, "ShiftOperator", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(unaryOperatorEClass, UnaryOperator.class, "UnaryOperator", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(unaryModificationOperatorEClass, UnaryModificationOperator.class, "UnaryModificationOperator",
                IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(assignmentEClass, Assignment.class, "Assignment", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(assignmentAndEClass, AssignmentAnd.class, "AssignmentAnd", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(assignmentDivisionEClass, AssignmentDivision.class, "AssignmentDivision", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(assignmentExclusiveOrEClass, AssignmentExclusiveOr.class, "AssignmentExclusiveOr", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(assignmentMinusEClass, AssignmentMinus.class, "AssignmentMinus", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(assignmentModuloEClass, AssignmentModulo.class, "AssignmentModulo", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(assignmentMultiplicationEClass, AssignmentMultiplication.class, "AssignmentMultiplication",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(assignmentLeftShiftEClass, AssignmentLeftShift.class, "AssignmentLeftShift", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(assignmentOrEClass, AssignmentOr.class, "AssignmentOr", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(assignmentPlusEClass, AssignmentPlus.class, "AssignmentPlus", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(assignmentRightShiftEClass, AssignmentRightShift.class, "AssignmentRightShift", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(assignmentUnsignedRightShiftEClass, AssignmentUnsignedRightShift.class,
                "AssignmentUnsignedRightShift", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(equalEClass, Equal.class, "Equal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(notEqualEClass, NotEqual.class, "NotEqual", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(greaterThanEClass, GreaterThan.class, "GreaterThan", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(greaterThanOrEqualEClass, GreaterThanOrEqual.class, "GreaterThanOrEqual", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(lessThanEClass, LessThan.class, "LessThan", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(lessThanOrEqualEClass, LessThanOrEqual.class, "LessThanOrEqual", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(additionEClass, Addition.class, "Addition", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(subtractionEClass, Subtraction.class, "Subtraction", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(divisionEClass, Division.class, "Division", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(multiplicationEClass, Multiplication.class, "Multiplication", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(remainderEClass, Remainder.class, "Remainder", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(complementEClass, Complement.class, "Complement", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(minusMinusEClass, MinusMinus.class, "MinusMinus", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(negateEClass, Negate.class, "Negate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(plusPlusEClass, PlusPlus.class, "PlusPlus", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(leftShiftEClass, LeftShift.class, "LeftShift", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(rightShiftEClass, RightShift.class, "RightShift", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(unsignedRightShiftEClass, UnsignedRightShift.class, "UnsignedRightShift", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        // Create resource
        createResource(eNS_URI);
    }

} //OperatorsPackageImpl
