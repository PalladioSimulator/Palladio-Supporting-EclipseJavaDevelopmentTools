/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.statements.impl;

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

import org.palladiosimulator.jdt.metamodel.javamodel.operators.OperatorsPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.operators.impl.OperatorsPackageImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.parameters.ParametersPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.parameters.impl.ParametersPackageImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.references.ReferencesPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.references.impl.ReferencesPackageImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.statements.Assert;
import org.palladiosimulator.jdt.metamodel.javamodel.statements.Block;
import org.palladiosimulator.jdt.metamodel.javamodel.statements.Break;
import org.palladiosimulator.jdt.metamodel.javamodel.statements.CatchBlock;
import org.palladiosimulator.jdt.metamodel.javamodel.statements.Condition;
import org.palladiosimulator.jdt.metamodel.javamodel.statements.Conditional;
import org.palladiosimulator.jdt.metamodel.javamodel.statements.Continue;
import org.palladiosimulator.jdt.metamodel.javamodel.statements.DefaultSwitchCase;
import org.palladiosimulator.jdt.metamodel.javamodel.statements.DoWhileLoop;
import org.palladiosimulator.jdt.metamodel.javamodel.statements.EmptyStatement;
import org.palladiosimulator.jdt.metamodel.javamodel.statements.ExpressionStatement;
import org.palladiosimulator.jdt.metamodel.javamodel.statements.ForEachLoop;
import org.palladiosimulator.jdt.metamodel.javamodel.statements.ForLoop;
import org.palladiosimulator.jdt.metamodel.javamodel.statements.ForLoopInitializer;
import org.palladiosimulator.jdt.metamodel.javamodel.statements.Jump;
import org.palladiosimulator.jdt.metamodel.javamodel.statements.JumpLabel;
import org.palladiosimulator.jdt.metamodel.javamodel.statements.LocalVariableStatement;
import org.palladiosimulator.jdt.metamodel.javamodel.statements.NormalSwitchCase;
import org.palladiosimulator.jdt.metamodel.javamodel.statements.Return;
import org.palladiosimulator.jdt.metamodel.javamodel.statements.Statement;
import org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementContainer;
import org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementListContainer;
import org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementsFactory;
import org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementsPackage;
import org.palladiosimulator.jdt.metamodel.javamodel.statements.Switch;
import org.palladiosimulator.jdt.metamodel.javamodel.statements.SwitchCase;
import org.palladiosimulator.jdt.metamodel.javamodel.statements.SynchronizedBlock;
import org.palladiosimulator.jdt.metamodel.javamodel.statements.Throw;
import org.palladiosimulator.jdt.metamodel.javamodel.statements.TryBlock;
import org.palladiosimulator.jdt.metamodel.javamodel.statements.WhileLoop;

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
public class StatementsPackageImpl extends EPackageImpl implements StatementsPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass statementContainerEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass statementListContainerEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass conditionalEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass forLoopInitializerEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass statementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass switchCaseEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass assertEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass breakEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass blockEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass catchBlockEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass conditionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass continueEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass defaultSwitchCaseEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass doWhileLoopEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass emptyStatementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass expressionStatementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass forLoopEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass forEachLoopEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass jumpEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass jumpLabelEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass localVariableStatementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass normalSwitchCaseEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass returnEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass switchEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass synchronizedBlockEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass throwEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tryBlockEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass whileLoopEClass = null;

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
     * @see org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementsPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private StatementsPackageImpl() {
        super(eNS_URI, StatementsFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link StatementsPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static StatementsPackage init() {
        if (isInited)
            return (StatementsPackage) EPackage.Registry.INSTANCE.getEPackage(StatementsPackage.eNS_URI);

        // Obtain or create and register package
        Object registeredStatementsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        StatementsPackageImpl theStatementsPackage = registeredStatementsPackage instanceof StatementsPackageImpl
                ? (StatementsPackageImpl) registeredStatementsPackage
                : new StatementsPackageImpl();

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
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
        TypesPackageImpl theTypesPackage = (TypesPackageImpl) (registeredPackage instanceof TypesPackageImpl
                ? registeredPackage
                : TypesPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(VariablesPackage.eNS_URI);
        VariablesPackageImpl theVariablesPackage = (VariablesPackageImpl) (registeredPackage instanceof VariablesPackageImpl
                ? registeredPackage
                : VariablesPackage.eINSTANCE);

        // Create package meta-data objects
        theStatementsPackage.createPackageContents();
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
        theOperatorsPackage.createPackageContents();
        theParametersPackage.createPackageContents();
        theReferencesPackage.createPackageContents();
        theTypesPackage.createPackageContents();
        theVariablesPackage.createPackageContents();

        // Initialize created meta-data
        theStatementsPackage.initializePackageContents();
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
        theOperatorsPackage.initializePackageContents();
        theParametersPackage.initializePackageContents();
        theReferencesPackage.initializePackageContents();
        theTypesPackage.initializePackageContents();
        theVariablesPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theStatementsPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(StatementsPackage.eNS_URI, theStatementsPackage);
        return theStatementsPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getStatementContainer() {
        return statementContainerEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getStatementContainer_Statement() {
        return (EReference) statementContainerEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getStatementListContainer() {
        return statementListContainerEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getStatementListContainer_Statements() {
        return (EReference) statementListContainerEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getStatementListContainer__GetLocalVariable__String() {
        return statementListContainerEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getConditional() {
        return conditionalEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getConditional_Condition() {
        return (EReference) conditionalEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getForLoopInitializer() {
        return forLoopInitializerEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getStatement() {
        return statementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSwitchCase() {
        return switchCaseEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAssert() {
        return assertEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAssert_ErrorMessage() {
        return (EReference) assertEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getBreak() {
        return breakEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getBlock() {
        return blockEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getCatchBlock() {
        return catchBlockEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getCatchBlock_Parameter() {
        return (EReference) catchBlockEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getCondition() {
        return conditionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getCondition_ElseStatement() {
        return (EReference) conditionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getContinue() {
        return continueEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getDefaultSwitchCase() {
        return defaultSwitchCaseEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getDoWhileLoop() {
        return doWhileLoopEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEmptyStatement() {
        return emptyStatementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getExpressionStatement() {
        return expressionStatementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getExpressionStatement_Expression() {
        return (EReference) expressionStatementEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getForLoop() {
        return forLoopEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getForLoop_Init() {
        return (EReference) forLoopEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getForLoop_Updates() {
        return (EReference) forLoopEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getForEachLoop() {
        return forEachLoopEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getForEachLoop_Next() {
        return (EReference) forEachLoopEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getForEachLoop_Collection() {
        return (EReference) forEachLoopEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getJump() {
        return jumpEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getJump_Target() {
        return (EReference) jumpEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getJumpLabel() {
        return jumpLabelEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getLocalVariableStatement() {
        return localVariableStatementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLocalVariableStatement_Variable() {
        return (EReference) localVariableStatementEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getNormalSwitchCase() {
        return normalSwitchCaseEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getReturn() {
        return returnEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getReturn_ReturnValue() {
        return (EReference) returnEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSwitch() {
        return switchEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSwitch_Cases() {
        return (EReference) switchEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSwitch_Variable() {
        return (EReference) switchEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSynchronizedBlock() {
        return synchronizedBlockEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSynchronizedBlock_LockProvider() {
        return (EReference) synchronizedBlockEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getThrow() {
        return throwEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getThrow_Throwable() {
        return (EReference) throwEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTryBlock() {
        return tryBlockEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTryBlock_CatcheBlocks() {
        return (EReference) tryBlockEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTryBlock_FinallyBlock() {
        return (EReference) tryBlockEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getWhileLoop() {
        return whileLoopEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getWhileLoop_Condition() {
        return (EReference) whileLoopEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public StatementsFactory getStatementsFactory() {
        return (StatementsFactory) getEFactoryInstance();
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
        statementContainerEClass = createEClass(STATEMENT_CONTAINER);
        createEReference(statementContainerEClass, STATEMENT_CONTAINER__STATEMENT);

        statementListContainerEClass = createEClass(STATEMENT_LIST_CONTAINER);
        createEReference(statementListContainerEClass, STATEMENT_LIST_CONTAINER__STATEMENTS);
        createEOperation(statementListContainerEClass, STATEMENT_LIST_CONTAINER___GET_LOCAL_VARIABLE__STRING);

        conditionalEClass = createEClass(CONDITIONAL);
        createEReference(conditionalEClass, CONDITIONAL__CONDITION);

        forLoopInitializerEClass = createEClass(FOR_LOOP_INITIALIZER);

        statementEClass = createEClass(STATEMENT);

        switchCaseEClass = createEClass(SWITCH_CASE);

        assertEClass = createEClass(ASSERT);
        createEReference(assertEClass, ASSERT__ERROR_MESSAGE);

        breakEClass = createEClass(BREAK);

        blockEClass = createEClass(BLOCK);

        catchBlockEClass = createEClass(CATCH_BLOCK);
        createEReference(catchBlockEClass, CATCH_BLOCK__PARAMETER);

        conditionEClass = createEClass(CONDITION);
        createEReference(conditionEClass, CONDITION__ELSE_STATEMENT);

        continueEClass = createEClass(CONTINUE);

        defaultSwitchCaseEClass = createEClass(DEFAULT_SWITCH_CASE);

        doWhileLoopEClass = createEClass(DO_WHILE_LOOP);

        emptyStatementEClass = createEClass(EMPTY_STATEMENT);

        expressionStatementEClass = createEClass(EXPRESSION_STATEMENT);
        createEReference(expressionStatementEClass, EXPRESSION_STATEMENT__EXPRESSION);

        forLoopEClass = createEClass(FOR_LOOP);
        createEReference(forLoopEClass, FOR_LOOP__INIT);
        createEReference(forLoopEClass, FOR_LOOP__UPDATES);

        forEachLoopEClass = createEClass(FOR_EACH_LOOP);
        createEReference(forEachLoopEClass, FOR_EACH_LOOP__NEXT);
        createEReference(forEachLoopEClass, FOR_EACH_LOOP__COLLECTION);

        jumpEClass = createEClass(JUMP);
        createEReference(jumpEClass, JUMP__TARGET);

        jumpLabelEClass = createEClass(JUMP_LABEL);

        localVariableStatementEClass = createEClass(LOCAL_VARIABLE_STATEMENT);
        createEReference(localVariableStatementEClass, LOCAL_VARIABLE_STATEMENT__VARIABLE);

        normalSwitchCaseEClass = createEClass(NORMAL_SWITCH_CASE);

        returnEClass = createEClass(RETURN);
        createEReference(returnEClass, RETURN__RETURN_VALUE);

        switchEClass = createEClass(SWITCH);
        createEReference(switchEClass, SWITCH__CASES);
        createEReference(switchEClass, SWITCH__VARIABLE);

        synchronizedBlockEClass = createEClass(SYNCHRONIZED_BLOCK);
        createEReference(synchronizedBlockEClass, SYNCHRONIZED_BLOCK__LOCK_PROVIDER);

        throwEClass = createEClass(THROW);
        createEReference(throwEClass, THROW__THROWABLE);

        tryBlockEClass = createEClass(TRY_BLOCK);
        createEReference(tryBlockEClass, TRY_BLOCK__CATCHE_BLOCKS);
        createEReference(tryBlockEClass, TRY_BLOCK__FINALLY_BLOCK);

        whileLoopEClass = createEClass(WHILE_LOOP);
        createEReference(whileLoopEClass, WHILE_LOOP__CONDITION);
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
        VariablesPackage theVariablesPackage = (VariablesPackage) EPackage.Registry.INSTANCE
                .getEPackage(VariablesPackage.eNS_URI);
        ExpressionsPackage theExpressionsPackage = (ExpressionsPackage) EPackage.Registry.INSTANCE
                .getEPackage(ExpressionsPackage.eNS_URI);
        MembersPackage theMembersPackage = (MembersPackage) EPackage.Registry.INSTANCE
                .getEPackage(MembersPackage.eNS_URI);
        ModifiersPackage theModifiersPackage = (ModifiersPackage) EPackage.Registry.INSTANCE
                .getEPackage(ModifiersPackage.eNS_URI);
        ParametersPackage theParametersPackage = (ParametersPackage) EPackage.Registry.INSTANCE
                .getEPackage(ParametersPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        statementContainerEClass.getESuperTypes().add(theCommonsPackage.getCommentable());
        statementListContainerEClass.getESuperTypes().add(theCommonsPackage.getCommentable());
        conditionalEClass.getESuperTypes().add(theCommonsPackage.getCommentable());
        forLoopInitializerEClass.getESuperTypes().add(theCommonsPackage.getCommentable());
        statementEClass.getESuperTypes().add(theCommonsPackage.getCommentable());
        switchCaseEClass.getESuperTypes().add(this.getStatementListContainer());
        assertEClass.getESuperTypes().add(this.getStatement());
        assertEClass.getESuperTypes().add(this.getConditional());
        breakEClass.getESuperTypes().add(this.getJump());
        blockEClass.getESuperTypes().add(theMembersPackage.getMember());
        blockEClass.getESuperTypes().add(this.getStatement());
        blockEClass.getESuperTypes().add(this.getStatementListContainer());
        blockEClass.getESuperTypes().add(theModifiersPackage.getModifiable());
        catchBlockEClass.getESuperTypes().add(this.getStatementListContainer());
        conditionEClass.getESuperTypes().add(this.getStatement());
        conditionEClass.getESuperTypes().add(this.getStatementContainer());
        conditionEClass.getESuperTypes().add(this.getConditional());
        continueEClass.getESuperTypes().add(this.getJump());
        defaultSwitchCaseEClass.getESuperTypes().add(this.getSwitchCase());
        doWhileLoopEClass.getESuperTypes().add(this.getWhileLoop());
        emptyStatementEClass.getESuperTypes().add(this.getStatement());
        expressionStatementEClass.getESuperTypes().add(this.getStatement());
        forLoopEClass.getESuperTypes().add(this.getStatement());
        forLoopEClass.getESuperTypes().add(this.getStatementContainer());
        forLoopEClass.getESuperTypes().add(this.getConditional());
        forEachLoopEClass.getESuperTypes().add(this.getStatement());
        forEachLoopEClass.getESuperTypes().add(this.getStatementContainer());
        jumpEClass.getESuperTypes().add(this.getStatement());
        jumpLabelEClass.getESuperTypes().add(this.getStatement());
        jumpLabelEClass.getESuperTypes().add(this.getStatementContainer());
        jumpLabelEClass.getESuperTypes().add(theCommonsPackage.getNamedElement());
        localVariableStatementEClass.getESuperTypes().add(this.getStatement());
        normalSwitchCaseEClass.getESuperTypes().add(this.getSwitchCase());
        normalSwitchCaseEClass.getESuperTypes().add(this.getConditional());
        returnEClass.getESuperTypes().add(this.getStatement());
        switchEClass.getESuperTypes().add(this.getStatement());
        synchronizedBlockEClass.getESuperTypes().add(this.getStatement());
        synchronizedBlockEClass.getESuperTypes().add(this.getStatementListContainer());
        throwEClass.getESuperTypes().add(this.getStatement());
        tryBlockEClass.getESuperTypes().add(this.getStatement());
        tryBlockEClass.getESuperTypes().add(this.getStatementListContainer());
        whileLoopEClass.getESuperTypes().add(this.getStatement());
        whileLoopEClass.getESuperTypes().add(this.getStatementContainer());

        // Initialize classes, features, and operations; add parameters
        initEClass(statementContainerEClass, StatementContainer.class, "StatementContainer", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getStatementContainer_Statement(), this.getStatement(), null, "statement", null, 1, 1,
                StatementContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(statementListContainerEClass, StatementListContainer.class, "StatementListContainer", IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getStatementListContainer_Statements(), this.getStatement(), null, "statements", null, 0, -1,
                StatementListContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        EOperation op = initEOperation(getStatementListContainer__GetLocalVariable__String(),
                theVariablesPackage.getLocalVariable(), "getLocalVariable", 1, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(conditionalEClass, Conditional.class, "Conditional", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getConditional_Condition(), theExpressionsPackage.getExpression(), null, "condition", null, 0, 1,
                Conditional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(forLoopInitializerEClass, ForLoopInitializer.class, "ForLoopInitializer", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(statementEClass, Statement.class, "Statement", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(switchCaseEClass, SwitchCase.class, "SwitchCase", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(assertEClass, Assert.class, "Assert", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAssert_ErrorMessage(), theExpressionsPackage.getExpression(), null, "errorMessage", null, 0,
                1, Assert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(breakEClass, Break.class, "Break", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(blockEClass, Block.class, "Block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(catchBlockEClass, CatchBlock.class, "CatchBlock", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCatchBlock_Parameter(), theParametersPackage.getOrdinaryParameter(), null, "parameter", null,
                1, 1, CatchBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCondition_ElseStatement(), this.getStatement(), null, "elseStatement", null, 0, 1,
                Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(continueEClass, Continue.class, "Continue", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(defaultSwitchCaseEClass, DefaultSwitchCase.class, "DefaultSwitchCase", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(doWhileLoopEClass, DoWhileLoop.class, "DoWhileLoop", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(emptyStatementEClass, EmptyStatement.class, "EmptyStatement", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(expressionStatementEClass, ExpressionStatement.class, "ExpressionStatement", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getExpressionStatement_Expression(), theExpressionsPackage.getExpression(), null, "expression",
                null, 1, 1, ExpressionStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(forLoopEClass, ForLoop.class, "ForLoop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getForLoop_Init(), this.getForLoopInitializer(), null, "init", null, 0, 1, ForLoop.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getForLoop_Updates(), theExpressionsPackage.getExpression(), null, "updates", null, 0, -1,
                ForLoop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(forEachLoopEClass, ForEachLoop.class, "ForEachLoop", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getForEachLoop_Next(), theParametersPackage.getOrdinaryParameter(), null, "next", null, 1, 1,
                ForEachLoop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getForEachLoop_Collection(), theExpressionsPackage.getExpression(), null, "collection", null, 1,
                1, ForEachLoop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(jumpEClass, Jump.class, "Jump", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getJump_Target(), this.getJumpLabel(), null, "target", null, 0, 1, Jump.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED);

        initEClass(jumpLabelEClass, JumpLabel.class, "JumpLabel", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(localVariableStatementEClass, LocalVariableStatement.class, "LocalVariableStatement", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getLocalVariableStatement_Variable(), theVariablesPackage.getLocalVariable(), null, "variable",
                null, 1, 1, LocalVariableStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(normalSwitchCaseEClass, NormalSwitchCase.class, "NormalSwitchCase", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(returnEClass, Return.class, "Return", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getReturn_ReturnValue(), theExpressionsPackage.getExpression(), null, "returnValue", null, 0, 1,
                Return.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(switchEClass, Switch.class, "Switch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSwitch_Cases(), this.getSwitchCase(), null, "cases", null, 0, -1, Switch.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED);
        initEReference(getSwitch_Variable(), theExpressionsPackage.getExpression(), null, "variable", null, 1, 1,
                Switch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(synchronizedBlockEClass, SynchronizedBlock.class, "SynchronizedBlock", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSynchronizedBlock_LockProvider(), theExpressionsPackage.getExpression(), null, "lockProvider",
                null, 1, 1, SynchronizedBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(throwEClass, Throw.class, "Throw", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getThrow_Throwable(), theExpressionsPackage.getExpression(), null, "throwable", null, 1, 1,
                Throw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(tryBlockEClass, TryBlock.class, "TryBlock", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTryBlock_CatcheBlocks(), this.getCatchBlock(), null, "catcheBlocks", null, 0, -1,
                TryBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTryBlock_FinallyBlock(), this.getBlock(), null, "finallyBlock", null, 0, 1, TryBlock.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(whileLoopEClass, WhileLoop.class, "WhileLoop", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getWhileLoop_Condition(), theExpressionsPackage.getExpression(), null, "condition", null, 1, 1,
                WhileLoop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} //StatementsPackageImpl
