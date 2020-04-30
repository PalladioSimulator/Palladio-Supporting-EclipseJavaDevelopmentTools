/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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

import org.palladiosimulator.jdt.metamodel.javamodel.expressions.AdditiveExpression;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.AdditiveExpressionChild;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.AndExpression;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.AndExpressionChild;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.AssignmentExpression;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.AssignmentExpressionChild;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.CastExpression;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.ConditionalAndExpression;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.ConditionalAndExpressionChild;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.ConditionalExpression;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.ConditionalExpressionChild;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.ConditionalOrExpression;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.ConditionalOrExpressionChild;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.EqualityExpression;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.EqualityExpressionChild;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExclusiveOrExpression;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExclusiveOrExpressionChild;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.Expression;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExpressionList;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExpressionsFactory;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExpressionsPackage;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.InclusiveOrExpression;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.InclusiveOrExpressionChild;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.InstanceOfExpression;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.InstanceOfExpressionChild;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.MultiplicativeExpression;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.MultiplicativeExpressionChild;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.NestedExpression;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.PrefixUnaryModificationExpression;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.PrimaryExpression;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.RelationExpression;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.RelationExpressionChild;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.ShiftExpression;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.ShiftExpressionChild;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.SuffixUnaryModificationExpression;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.UnaryExpression;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.UnaryExpressionChild;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.UnaryModificationExpression;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.UnaryModificationExpressionChild;

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

import org.palladiosimulator.jdt.metamodel.javamodel.operators.OperatorsPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.operators.impl.OperatorsPackageImpl;

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
public class ExpressionsPackageImpl extends EPackageImpl implements ExpressionsPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass expressionListEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass expressionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass assignmentExpressionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass assignmentExpressionChildEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass conditionalExpressionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass conditionalExpressionChildEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass conditionalOrExpressionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass conditionalOrExpressionChildEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass conditionalAndExpressionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass conditionalAndExpressionChildEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass inclusiveOrExpressionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass inclusiveOrExpressionChildEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass exclusiveOrExpressionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass exclusiveOrExpressionChildEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass andExpressionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass andExpressionChildEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass equalityExpressionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass equalityExpressionChildEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass instanceOfExpressionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass instanceOfExpressionChildEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass relationExpressionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass relationExpressionChildEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass shiftExpressionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass shiftExpressionChildEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass additiveExpressionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass additiveExpressionChildEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass multiplicativeExpressionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass multiplicativeExpressionChildEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass unaryExpressionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass unaryExpressionChildEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass unaryModificationExpressionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass prefixUnaryModificationExpressionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass suffixUnaryModificationExpressionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass unaryModificationExpressionChildEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass castExpressionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass primaryExpressionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nestedExpressionEClass = null;

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
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExpressionsPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private ExpressionsPackageImpl() {
        super(eNS_URI, ExpressionsFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link ExpressionsPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static ExpressionsPackage init() {
        if (isInited)
            return (ExpressionsPackage) EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI);

        // Obtain or create and register package
        Object registeredExpressionsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        ExpressionsPackageImpl theExpressionsPackage = registeredExpressionsPackage instanceof ExpressionsPackageImpl
                ? (ExpressionsPackageImpl) registeredExpressionsPackage
                : new ExpressionsPackageImpl();

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
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OperatorsPackage.eNS_URI);
        OperatorsPackageImpl theOperatorsPackage = (OperatorsPackageImpl) (registeredPackage instanceof OperatorsPackageImpl
                ? registeredPackage
                : OperatorsPackage.eINSTANCE);
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
        theExpressionsPackage.createPackageContents();
        theAnnotationsPackage.createPackageContents();
        theArraysPackage.createPackageContents();
        theClassifiersPackage.createPackageContents();
        theCommonsPackage.createPackageContents();
        theContainersPackage.createPackageContents();
        theGenericsPackage.createPackageContents();
        theImportsPackage.createPackageContents();
        theInstantiationsPackage.createPackageContents();
        theLiteralsPackage.createPackageContents();
        theMembersPackage.createPackageContents();
        theModifiersPackage.createPackageContents();
        theOperatorsPackage.createPackageContents();
        theParametersPackage.createPackageContents();
        theReferencesPackage.createPackageContents();
        theStatementsPackage.createPackageContents();
        theTypesPackage.createPackageContents();
        theVariablesPackage.createPackageContents();

        // Initialize created meta-data
        theExpressionsPackage.initializePackageContents();
        theAnnotationsPackage.initializePackageContents();
        theArraysPackage.initializePackageContents();
        theClassifiersPackage.initializePackageContents();
        theCommonsPackage.initializePackageContents();
        theContainersPackage.initializePackageContents();
        theGenericsPackage.initializePackageContents();
        theImportsPackage.initializePackageContents();
        theInstantiationsPackage.initializePackageContents();
        theLiteralsPackage.initializePackageContents();
        theMembersPackage.initializePackageContents();
        theModifiersPackage.initializePackageContents();
        theOperatorsPackage.initializePackageContents();
        theParametersPackage.initializePackageContents();
        theReferencesPackage.initializePackageContents();
        theStatementsPackage.initializePackageContents();
        theTypesPackage.initializePackageContents();
        theVariablesPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theExpressionsPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(ExpressionsPackage.eNS_URI, theExpressionsPackage);
        return theExpressionsPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getExpressionList() {
        return expressionListEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getExpressionList_Expressions() {
        return (EReference) expressionListEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getExpression() {
        return expressionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getExpression__GetType() {
        return expressionEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getExpression__GetAlternativeType() {
        return expressionEClass.getEOperations().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getExpression__GetOneType__boolean() {
        return expressionEClass.getEOperations().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getExpression__GetArrayDimension() {
        return expressionEClass.getEOperations().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAssignmentExpression() {
        return assignmentExpressionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAssignmentExpression_Child() {
        return (EReference) assignmentExpressionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAssignmentExpression_AssignmentOperator() {
        return (EReference) assignmentExpressionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAssignmentExpression_Value() {
        return (EReference) assignmentExpressionEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAssignmentExpressionChild() {
        return assignmentExpressionChildEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getConditionalExpression() {
        return conditionalExpressionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getConditionalExpression_Child() {
        return (EReference) conditionalExpressionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getConditionalExpression_ExpressionIf() {
        return (EReference) conditionalExpressionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getConditionalExpression_ExpressionElse() {
        return (EReference) conditionalExpressionEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getConditionalExpressionChild() {
        return conditionalExpressionChildEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getConditionalOrExpression() {
        return conditionalOrExpressionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getConditionalOrExpression_Children() {
        return (EReference) conditionalOrExpressionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getConditionalOrExpressionChild() {
        return conditionalOrExpressionChildEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getConditionalAndExpression() {
        return conditionalAndExpressionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getConditionalAndExpression_Children() {
        return (EReference) conditionalAndExpressionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getConditionalAndExpressionChild() {
        return conditionalAndExpressionChildEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getInclusiveOrExpression() {
        return inclusiveOrExpressionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getInclusiveOrExpression_Children() {
        return (EReference) inclusiveOrExpressionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getInclusiveOrExpressionChild() {
        return inclusiveOrExpressionChildEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getExclusiveOrExpression() {
        return exclusiveOrExpressionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getExclusiveOrExpression_Children() {
        return (EReference) exclusiveOrExpressionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getExclusiveOrExpressionChild() {
        return exclusiveOrExpressionChildEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAndExpression() {
        return andExpressionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAndExpression_Children() {
        return (EReference) andExpressionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAndExpressionChild() {
        return andExpressionChildEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEqualityExpression() {
        return equalityExpressionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEqualityExpression_EqualityOperators() {
        return (EReference) equalityExpressionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEqualityExpression_Children() {
        return (EReference) equalityExpressionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEqualityExpressionChild() {
        return equalityExpressionChildEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getInstanceOfExpression() {
        return instanceOfExpressionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getInstanceOfExpression_Child() {
        return (EReference) instanceOfExpressionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getInstanceOfExpressionChild() {
        return instanceOfExpressionChildEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getRelationExpression() {
        return relationExpressionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getRelationExpression_Children() {
        return (EReference) relationExpressionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getRelationExpression_RelationOperators() {
        return (EReference) relationExpressionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getRelationExpressionChild() {
        return relationExpressionChildEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getShiftExpression() {
        return shiftExpressionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getShiftExpression_Children() {
        return (EReference) shiftExpressionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getShiftExpression_ShiftOperators() {
        return (EReference) shiftExpressionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getShiftExpressionChild() {
        return shiftExpressionChildEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAdditiveExpression() {
        return additiveExpressionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAdditiveExpression_Children() {
        return (EReference) additiveExpressionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAdditiveExpression_AdditiveOperators() {
        return (EReference) additiveExpressionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAdditiveExpressionChild() {
        return additiveExpressionChildEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getMultiplicativeExpression() {
        return multiplicativeExpressionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getMultiplicativeExpression_Children() {
        return (EReference) multiplicativeExpressionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getMultiplicativeExpression_MultiplicativeOperators() {
        return (EReference) multiplicativeExpressionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getMultiplicativeExpressionChild() {
        return multiplicativeExpressionChildEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getUnaryExpression() {
        return unaryExpressionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getUnaryExpression_Operators() {
        return (EReference) unaryExpressionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getUnaryExpression_Child() {
        return (EReference) unaryExpressionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getUnaryExpressionChild() {
        return unaryExpressionChildEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getUnaryModificationExpression() {
        return unaryModificationExpressionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getUnaryModificationExpression_Child() {
        return (EReference) unaryModificationExpressionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getUnaryModificationExpression_Operator() {
        return (EReference) unaryModificationExpressionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getPrefixUnaryModificationExpression() {
        return prefixUnaryModificationExpressionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSuffixUnaryModificationExpression() {
        return suffixUnaryModificationExpressionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getUnaryModificationExpressionChild() {
        return unaryModificationExpressionChildEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getCastExpression() {
        return castExpressionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getCastExpression_Child() {
        return (EReference) castExpressionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getPrimaryExpression() {
        return primaryExpressionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getNestedExpression() {
        return nestedExpressionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getNestedExpression_Expression() {
        return (EReference) nestedExpressionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExpressionsFactory getExpressionsFactory() {
        return (ExpressionsFactory) getEFactoryInstance();
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
        expressionListEClass = createEClass(EXPRESSION_LIST);
        createEReference(expressionListEClass, EXPRESSION_LIST__EXPRESSIONS);

        expressionEClass = createEClass(EXPRESSION);
        createEOperation(expressionEClass, EXPRESSION___GET_TYPE);
        createEOperation(expressionEClass, EXPRESSION___GET_ALTERNATIVE_TYPE);
        createEOperation(expressionEClass, EXPRESSION___GET_ONE_TYPE__BOOLEAN);
        createEOperation(expressionEClass, EXPRESSION___GET_ARRAY_DIMENSION);

        assignmentExpressionEClass = createEClass(ASSIGNMENT_EXPRESSION);
        createEReference(assignmentExpressionEClass, ASSIGNMENT_EXPRESSION__CHILD);
        createEReference(assignmentExpressionEClass, ASSIGNMENT_EXPRESSION__ASSIGNMENT_OPERATOR);
        createEReference(assignmentExpressionEClass, ASSIGNMENT_EXPRESSION__VALUE);

        assignmentExpressionChildEClass = createEClass(ASSIGNMENT_EXPRESSION_CHILD);

        conditionalExpressionEClass = createEClass(CONDITIONAL_EXPRESSION);
        createEReference(conditionalExpressionEClass, CONDITIONAL_EXPRESSION__CHILD);
        createEReference(conditionalExpressionEClass, CONDITIONAL_EXPRESSION__EXPRESSION_IF);
        createEReference(conditionalExpressionEClass, CONDITIONAL_EXPRESSION__EXPRESSION_ELSE);

        conditionalExpressionChildEClass = createEClass(CONDITIONAL_EXPRESSION_CHILD);

        conditionalOrExpressionEClass = createEClass(CONDITIONAL_OR_EXPRESSION);
        createEReference(conditionalOrExpressionEClass, CONDITIONAL_OR_EXPRESSION__CHILDREN);

        conditionalOrExpressionChildEClass = createEClass(CONDITIONAL_OR_EXPRESSION_CHILD);

        conditionalAndExpressionEClass = createEClass(CONDITIONAL_AND_EXPRESSION);
        createEReference(conditionalAndExpressionEClass, CONDITIONAL_AND_EXPRESSION__CHILDREN);

        conditionalAndExpressionChildEClass = createEClass(CONDITIONAL_AND_EXPRESSION_CHILD);

        inclusiveOrExpressionEClass = createEClass(INCLUSIVE_OR_EXPRESSION);
        createEReference(inclusiveOrExpressionEClass, INCLUSIVE_OR_EXPRESSION__CHILDREN);

        inclusiveOrExpressionChildEClass = createEClass(INCLUSIVE_OR_EXPRESSION_CHILD);

        exclusiveOrExpressionEClass = createEClass(EXCLUSIVE_OR_EXPRESSION);
        createEReference(exclusiveOrExpressionEClass, EXCLUSIVE_OR_EXPRESSION__CHILDREN);

        exclusiveOrExpressionChildEClass = createEClass(EXCLUSIVE_OR_EXPRESSION_CHILD);

        andExpressionEClass = createEClass(AND_EXPRESSION);
        createEReference(andExpressionEClass, AND_EXPRESSION__CHILDREN);

        andExpressionChildEClass = createEClass(AND_EXPRESSION_CHILD);

        equalityExpressionEClass = createEClass(EQUALITY_EXPRESSION);
        createEReference(equalityExpressionEClass, EQUALITY_EXPRESSION__EQUALITY_OPERATORS);
        createEReference(equalityExpressionEClass, EQUALITY_EXPRESSION__CHILDREN);

        equalityExpressionChildEClass = createEClass(EQUALITY_EXPRESSION_CHILD);

        instanceOfExpressionEClass = createEClass(INSTANCE_OF_EXPRESSION);
        createEReference(instanceOfExpressionEClass, INSTANCE_OF_EXPRESSION__CHILD);

        instanceOfExpressionChildEClass = createEClass(INSTANCE_OF_EXPRESSION_CHILD);

        relationExpressionEClass = createEClass(RELATION_EXPRESSION);
        createEReference(relationExpressionEClass, RELATION_EXPRESSION__CHILDREN);
        createEReference(relationExpressionEClass, RELATION_EXPRESSION__RELATION_OPERATORS);

        relationExpressionChildEClass = createEClass(RELATION_EXPRESSION_CHILD);

        shiftExpressionEClass = createEClass(SHIFT_EXPRESSION);
        createEReference(shiftExpressionEClass, SHIFT_EXPRESSION__CHILDREN);
        createEReference(shiftExpressionEClass, SHIFT_EXPRESSION__SHIFT_OPERATORS);

        shiftExpressionChildEClass = createEClass(SHIFT_EXPRESSION_CHILD);

        additiveExpressionEClass = createEClass(ADDITIVE_EXPRESSION);
        createEReference(additiveExpressionEClass, ADDITIVE_EXPRESSION__CHILDREN);
        createEReference(additiveExpressionEClass, ADDITIVE_EXPRESSION__ADDITIVE_OPERATORS);

        additiveExpressionChildEClass = createEClass(ADDITIVE_EXPRESSION_CHILD);

        multiplicativeExpressionEClass = createEClass(MULTIPLICATIVE_EXPRESSION);
        createEReference(multiplicativeExpressionEClass, MULTIPLICATIVE_EXPRESSION__CHILDREN);
        createEReference(multiplicativeExpressionEClass, MULTIPLICATIVE_EXPRESSION__MULTIPLICATIVE_OPERATORS);

        multiplicativeExpressionChildEClass = createEClass(MULTIPLICATIVE_EXPRESSION_CHILD);

        unaryExpressionEClass = createEClass(UNARY_EXPRESSION);
        createEReference(unaryExpressionEClass, UNARY_EXPRESSION__OPERATORS);
        createEReference(unaryExpressionEClass, UNARY_EXPRESSION__CHILD);

        unaryExpressionChildEClass = createEClass(UNARY_EXPRESSION_CHILD);

        unaryModificationExpressionEClass = createEClass(UNARY_MODIFICATION_EXPRESSION);
        createEReference(unaryModificationExpressionEClass, UNARY_MODIFICATION_EXPRESSION__CHILD);
        createEReference(unaryModificationExpressionEClass, UNARY_MODIFICATION_EXPRESSION__OPERATOR);

        prefixUnaryModificationExpressionEClass = createEClass(PREFIX_UNARY_MODIFICATION_EXPRESSION);

        suffixUnaryModificationExpressionEClass = createEClass(SUFFIX_UNARY_MODIFICATION_EXPRESSION);

        unaryModificationExpressionChildEClass = createEClass(UNARY_MODIFICATION_EXPRESSION_CHILD);

        castExpressionEClass = createEClass(CAST_EXPRESSION);
        createEReference(castExpressionEClass, CAST_EXPRESSION__CHILD);

        primaryExpressionEClass = createEClass(PRIMARY_EXPRESSION);

        nestedExpressionEClass = createEClass(NESTED_EXPRESSION);
        createEReference(nestedExpressionEClass, NESTED_EXPRESSION__EXPRESSION);
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
        StatementsPackage theStatementsPackage = (StatementsPackage) EPackage.Registry.INSTANCE
                .getEPackage(StatementsPackage.eNS_URI);
        ArraysPackage theArraysPackage = (ArraysPackage) EPackage.Registry.INSTANCE.getEPackage(ArraysPackage.eNS_URI);
        AnnotationsPackage theAnnotationsPackage = (AnnotationsPackage) EPackage.Registry.INSTANCE
                .getEPackage(AnnotationsPackage.eNS_URI);
        TypesPackage theTypesPackage = (TypesPackage) EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
        OperatorsPackage theOperatorsPackage = (OperatorsPackage) EPackage.Registry.INSTANCE
                .getEPackage(OperatorsPackage.eNS_URI);
        ReferencesPackage theReferencesPackage = (ReferencesPackage) EPackage.Registry.INSTANCE
                .getEPackage(ReferencesPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        expressionListEClass.getESuperTypes().add(theStatementsPackage.getForLoopInitializer());
        expressionEClass.getESuperTypes().add(theArraysPackage.getArrayInitializationValue());
        expressionEClass.getESuperTypes().add(theAnnotationsPackage.getAnnotationValue());
        assignmentExpressionEClass.getESuperTypes().add(this.getExpression());
        assignmentExpressionChildEClass.getESuperTypes().add(this.getExpression());
        conditionalExpressionEClass.getESuperTypes().add(this.getAssignmentExpressionChild());
        conditionalExpressionChildEClass.getESuperTypes().add(this.getAssignmentExpressionChild());
        conditionalOrExpressionEClass.getESuperTypes().add(this.getConditionalExpressionChild());
        conditionalOrExpressionChildEClass.getESuperTypes().add(this.getConditionalExpressionChild());
        conditionalAndExpressionEClass.getESuperTypes().add(this.getConditionalOrExpressionChild());
        conditionalAndExpressionChildEClass.getESuperTypes().add(this.getConditionalOrExpressionChild());
        inclusiveOrExpressionEClass.getESuperTypes().add(this.getConditionalAndExpressionChild());
        inclusiveOrExpressionChildEClass.getESuperTypes().add(this.getConditionalAndExpressionChild());
        exclusiveOrExpressionEClass.getESuperTypes().add(this.getInclusiveOrExpressionChild());
        exclusiveOrExpressionChildEClass.getESuperTypes().add(this.getInclusiveOrExpressionChild());
        andExpressionEClass.getESuperTypes().add(this.getExclusiveOrExpressionChild());
        andExpressionChildEClass.getESuperTypes().add(this.getExclusiveOrExpressionChild());
        equalityExpressionEClass.getESuperTypes().add(this.getAndExpressionChild());
        equalityExpressionChildEClass.getESuperTypes().add(this.getAndExpressionChild());
        instanceOfExpressionEClass.getESuperTypes().add(theArraysPackage.getArrayTypeable());
        instanceOfExpressionEClass.getESuperTypes().add(theTypesPackage.getTypedElement());
        instanceOfExpressionEClass.getESuperTypes().add(this.getEqualityExpressionChild());
        instanceOfExpressionChildEClass.getESuperTypes().add(this.getEqualityExpressionChild());
        relationExpressionEClass.getESuperTypes().add(this.getInstanceOfExpressionChild());
        relationExpressionChildEClass.getESuperTypes().add(this.getInstanceOfExpressionChild());
        shiftExpressionEClass.getESuperTypes().add(this.getRelationExpressionChild());
        shiftExpressionChildEClass.getESuperTypes().add(this.getRelationExpressionChild());
        additiveExpressionEClass.getESuperTypes().add(this.getShiftExpressionChild());
        additiveExpressionChildEClass.getESuperTypes().add(this.getShiftExpressionChild());
        multiplicativeExpressionEClass.getESuperTypes().add(this.getAdditiveExpressionChild());
        multiplicativeExpressionChildEClass.getESuperTypes().add(this.getAdditiveExpressionChild());
        unaryExpressionEClass.getESuperTypes().add(this.getMultiplicativeExpressionChild());
        unaryExpressionChildEClass.getESuperTypes().add(this.getMultiplicativeExpressionChild());
        unaryModificationExpressionEClass.getESuperTypes().add(this.getUnaryExpressionChild());
        prefixUnaryModificationExpressionEClass.getESuperTypes().add(this.getUnaryModificationExpression());
        suffixUnaryModificationExpressionEClass.getESuperTypes().add(this.getUnaryModificationExpression());
        unaryModificationExpressionChildEClass.getESuperTypes().add(this.getUnaryExpressionChild());
        castExpressionEClass.getESuperTypes().add(theTypesPackage.getTypedElement());
        castExpressionEClass.getESuperTypes().add(theArraysPackage.getArrayTypeable());
        castExpressionEClass.getESuperTypes().add(this.getUnaryModificationExpressionChild());
        primaryExpressionEClass.getESuperTypes().add(this.getUnaryModificationExpressionChild());
        nestedExpressionEClass.getESuperTypes().add(theReferencesPackage.getReference());

        // Initialize classes, features, and operations; add parameters
        initEClass(expressionListEClass, ExpressionList.class, "ExpressionList", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getExpressionList_Expressions(), this.getExpression(), null, "expressions", null, 0, -1,
                ExpressionList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEOperation(getExpression__GetType(), theTypesPackage.getType(), "getType", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEOperation(getExpression__GetAlternativeType(), theTypesPackage.getType(), "getAlternativeType", 0, 1,
                IS_UNIQUE, IS_ORDERED);

        EOperation op = initEOperation(getExpression__GetOneType__boolean(), theTypesPackage.getType(), "getOneType", 0,
                1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEBoolean(), "alternative", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEOperation(getExpression__GetArrayDimension(), ecorePackage.getELong(), "getArrayDimension", 0, 1,
                IS_UNIQUE, IS_ORDERED);

        initEClass(assignmentExpressionEClass, AssignmentExpression.class, "AssignmentExpression", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAssignmentExpression_Child(), this.getAssignmentExpressionChild(), null, "child", null, 1, 1,
                AssignmentExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAssignmentExpression_AssignmentOperator(), theOperatorsPackage.getAssignmentOperator(), null,
                "assignmentOperator", null, 1, 1, AssignmentExpression.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAssignmentExpression_Value(), this.getExpression(), null, "value", null, 1, 1,
                AssignmentExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(assignmentExpressionChildEClass, AssignmentExpressionChild.class, "AssignmentExpressionChild",
                IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(conditionalExpressionEClass, ConditionalExpression.class, "ConditionalExpression", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getConditionalExpression_Child(), this.getConditionalExpressionChild(), null, "child", null, 0,
                1, ConditionalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getConditionalExpression_ExpressionIf(), this.getExpression(), null, "expressionIf", null, 1, 1,
                ConditionalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getConditionalExpression_ExpressionElse(), this.getAssignmentExpressionChild(), null,
                "expressionElse", null, 1, 1, ConditionalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(conditionalExpressionChildEClass, ConditionalExpressionChild.class, "ConditionalExpressionChild",
                IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(conditionalOrExpressionEClass, ConditionalOrExpression.class, "ConditionalOrExpression",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getConditionalOrExpression_Children(), this.getConditionalOrExpressionChild(), null, "children",
                null, 1, -1, ConditionalOrExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(conditionalOrExpressionChildEClass, ConditionalOrExpressionChild.class,
                "ConditionalOrExpressionChild", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(conditionalAndExpressionEClass, ConditionalAndExpression.class, "ConditionalAndExpression",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getConditionalAndExpression_Children(), this.getConditionalAndExpressionChild(), null,
                "children", null, 1, -1, ConditionalAndExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(conditionalAndExpressionChildEClass, ConditionalAndExpressionChild.class,
                "ConditionalAndExpressionChild", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(inclusiveOrExpressionEClass, InclusiveOrExpression.class, "InclusiveOrExpression", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getInclusiveOrExpression_Children(), this.getInclusiveOrExpressionChild(), null, "children",
                null, 1, -1, InclusiveOrExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(inclusiveOrExpressionChildEClass, InclusiveOrExpressionChild.class, "InclusiveOrExpressionChild",
                IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(exclusiveOrExpressionEClass, ExclusiveOrExpression.class, "ExclusiveOrExpression", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getExclusiveOrExpression_Children(), this.getExclusiveOrExpressionChild(), null, "children",
                null, 1, -1, ExclusiveOrExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(exclusiveOrExpressionChildEClass, ExclusiveOrExpressionChild.class, "ExclusiveOrExpressionChild",
                IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(andExpressionEClass, AndExpression.class, "AndExpression", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAndExpression_Children(), this.getAndExpressionChild(), null, "children", null, 1, -1,
                AndExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(andExpressionChildEClass, AndExpressionChild.class, "AndExpressionChild", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(equalityExpressionEClass, EqualityExpression.class, "EqualityExpression", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getEqualityExpression_EqualityOperators(), theOperatorsPackage.getEqualityOperator(), null,
                "equalityOperators", null, 1, -1, EqualityExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEqualityExpression_Children(), this.getEqualityExpressionChild(), null, "children", null, 1,
                -1, EqualityExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(equalityExpressionChildEClass, EqualityExpressionChild.class, "EqualityExpressionChild", IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(instanceOfExpressionEClass, InstanceOfExpression.class, "InstanceOfExpression", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getInstanceOfExpression_Child(), this.getInstanceOfExpressionChild(), null, "child", null, 1, 1,
                InstanceOfExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(instanceOfExpressionChildEClass, InstanceOfExpressionChild.class, "InstanceOfExpressionChild",
                IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(relationExpressionEClass, RelationExpression.class, "RelationExpression", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRelationExpression_Children(), this.getRelationExpressionChild(), null, "children", null, 1,
                -1, RelationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRelationExpression_RelationOperators(), theOperatorsPackage.getRelationOperator(), null,
                "relationOperators", null, 1, -1, RelationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(relationExpressionChildEClass, RelationExpressionChild.class, "RelationExpressionChild", IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(shiftExpressionEClass, ShiftExpression.class, "ShiftExpression", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getShiftExpression_Children(), this.getShiftExpressionChild(), null, "children", null, 1, -1,
                ShiftExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getShiftExpression_ShiftOperators(), theOperatorsPackage.getShiftOperator(), null,
                "shiftOperators", null, 1, -1, ShiftExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(shiftExpressionChildEClass, ShiftExpressionChild.class, "ShiftExpressionChild", IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(additiveExpressionEClass, AdditiveExpression.class, "AdditiveExpression", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAdditiveExpression_Children(), this.getAdditiveExpressionChild(), null, "children", null, 1,
                -1, AdditiveExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAdditiveExpression_AdditiveOperators(), theOperatorsPackage.getAdditiveOperator(), null,
                "additiveOperators", null, 1, -1, AdditiveExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(additiveExpressionChildEClass, AdditiveExpressionChild.class, "AdditiveExpressionChild", IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(multiplicativeExpressionEClass, MultiplicativeExpression.class, "MultiplicativeExpression",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getMultiplicativeExpression_Children(), this.getMultiplicativeExpressionChild(), null,
                "children", null, 1, -1, MultiplicativeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getMultiplicativeExpression_MultiplicativeOperators(),
                theOperatorsPackage.getMultiplicativeOperator(), null, "multiplicativeOperators", null, 1, -1,
                MultiplicativeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(multiplicativeExpressionChildEClass, MultiplicativeExpressionChild.class,
                "MultiplicativeExpressionChild", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(unaryExpressionEClass, UnaryExpression.class, "UnaryExpression", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getUnaryExpression_Operators(), theOperatorsPackage.getUnaryOperator(), null, "operators", null,
                1, -1, UnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getUnaryExpression_Child(), this.getUnaryExpressionChild(), null, "child", null, 1, 1,
                UnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(unaryExpressionChildEClass, UnaryExpressionChild.class, "UnaryExpressionChild", IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(unaryModificationExpressionEClass, UnaryModificationExpression.class, "UnaryModificationExpression",
                IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getUnaryModificationExpression_Child(), this.getUnaryModificationExpressionChild(), null,
                "child", null, 1, 1, UnaryModificationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getUnaryModificationExpression_Operator(), theOperatorsPackage.getUnaryModificationOperator(),
                null, "operator", null, 1, 1, UnaryModificationExpression.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(prefixUnaryModificationExpressionEClass, PrefixUnaryModificationExpression.class,
                "PrefixUnaryModificationExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(suffixUnaryModificationExpressionEClass, SuffixUnaryModificationExpression.class,
                "SuffixUnaryModificationExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(unaryModificationExpressionChildEClass, UnaryModificationExpressionChild.class,
                "UnaryModificationExpressionChild", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(castExpressionEClass, CastExpression.class, "CastExpression", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCastExpression_Child(), this.getMultiplicativeExpressionChild(), null, "child", null, 1, 1,
                CastExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(primaryExpressionEClass, PrimaryExpression.class, "PrimaryExpression", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(nestedExpressionEClass, NestedExpression.class, "NestedExpression", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getNestedExpression_Expression(), this.getExpression(), null, "expression", null, 1, 1,
                NestedExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} //ExpressionsPackageImpl
