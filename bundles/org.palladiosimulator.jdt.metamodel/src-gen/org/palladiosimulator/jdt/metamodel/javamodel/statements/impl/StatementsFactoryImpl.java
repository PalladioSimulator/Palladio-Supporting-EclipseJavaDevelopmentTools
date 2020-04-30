/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.statements.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.palladiosimulator.jdt.metamodel.javamodel.statements.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StatementsFactoryImpl extends EFactoryImpl implements StatementsFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static StatementsFactory init() {
        try {
            StatementsFactory theStatementsFactory = (StatementsFactory) EPackage.Registry.INSTANCE
                    .getEFactory(StatementsPackage.eNS_URI);
            if (theStatementsFactory != null) {
                return theStatementsFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new StatementsFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StatementsFactoryImpl() {
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
        case StatementsPackage.ASSERT:
            return createAssert();
        case StatementsPackage.BREAK:
            return createBreak();
        case StatementsPackage.BLOCK:
            return createBlock();
        case StatementsPackage.CATCH_BLOCK:
            return createCatchBlock();
        case StatementsPackage.CONDITION:
            return createCondition();
        case StatementsPackage.CONTINUE:
            return createContinue();
        case StatementsPackage.DEFAULT_SWITCH_CASE:
            return createDefaultSwitchCase();
        case StatementsPackage.DO_WHILE_LOOP:
            return createDoWhileLoop();
        case StatementsPackage.EMPTY_STATEMENT:
            return createEmptyStatement();
        case StatementsPackage.EXPRESSION_STATEMENT:
            return createExpressionStatement();
        case StatementsPackage.FOR_LOOP:
            return createForLoop();
        case StatementsPackage.FOR_EACH_LOOP:
            return createForEachLoop();
        case StatementsPackage.JUMP_LABEL:
            return createJumpLabel();
        case StatementsPackage.LOCAL_VARIABLE_STATEMENT:
            return createLocalVariableStatement();
        case StatementsPackage.NORMAL_SWITCH_CASE:
            return createNormalSwitchCase();
        case StatementsPackage.RETURN:
            return createReturn();
        case StatementsPackage.SWITCH:
            return createSwitch();
        case StatementsPackage.SYNCHRONIZED_BLOCK:
            return createSynchronizedBlock();
        case StatementsPackage.THROW:
            return createThrow();
        case StatementsPackage.TRY_BLOCK:
            return createTryBlock();
        case StatementsPackage.WHILE_LOOP:
            return createWhileLoop();
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
    public Assert createAssert() {
        AssertImpl assert_ = new AssertImpl();
        return assert_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Break createBreak() {
        BreakImpl break_ = new BreakImpl();
        return break_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Block createBlock() {
        BlockImpl block = new BlockImpl();
        return block;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CatchBlock createCatchBlock() {
        CatchBlockImpl catchBlock = new CatchBlockImpl();
        return catchBlock;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Condition createCondition() {
        ConditionImpl condition = new ConditionImpl();
        return condition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Continue createContinue() {
        ContinueImpl continue_ = new ContinueImpl();
        return continue_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DefaultSwitchCase createDefaultSwitchCase() {
        DefaultSwitchCaseImpl defaultSwitchCase = new DefaultSwitchCaseImpl();
        return defaultSwitchCase;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DoWhileLoop createDoWhileLoop() {
        DoWhileLoopImpl doWhileLoop = new DoWhileLoopImpl();
        return doWhileLoop;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EmptyStatement createEmptyStatement() {
        EmptyStatementImpl emptyStatement = new EmptyStatementImpl();
        return emptyStatement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExpressionStatement createExpressionStatement() {
        ExpressionStatementImpl expressionStatement = new ExpressionStatementImpl();
        return expressionStatement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ForLoop createForLoop() {
        ForLoopImpl forLoop = new ForLoopImpl();
        return forLoop;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ForEachLoop createForEachLoop() {
        ForEachLoopImpl forEachLoop = new ForEachLoopImpl();
        return forEachLoop;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public JumpLabel createJumpLabel() {
        JumpLabelImpl jumpLabel = new JumpLabelImpl();
        return jumpLabel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LocalVariableStatement createLocalVariableStatement() {
        LocalVariableStatementImpl localVariableStatement = new LocalVariableStatementImpl();
        return localVariableStatement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NormalSwitchCase createNormalSwitchCase() {
        NormalSwitchCaseImpl normalSwitchCase = new NormalSwitchCaseImpl();
        return normalSwitchCase;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Return createReturn() {
        ReturnImpl return_ = new ReturnImpl();
        return return_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Switch createSwitch() {
        SwitchImpl switch_ = new SwitchImpl();
        return switch_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SynchronizedBlock createSynchronizedBlock() {
        SynchronizedBlockImpl synchronizedBlock = new SynchronizedBlockImpl();
        return synchronizedBlock;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Throw createThrow() {
        ThrowImpl throw_ = new ThrowImpl();
        return throw_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TryBlock createTryBlock() {
        TryBlockImpl tryBlock = new TryBlockImpl();
        return tryBlock;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WhileLoop createWhileLoop() {
        WhileLoopImpl whileLoop = new WhileLoopImpl();
        return whileLoop;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public StatementsPackage getStatementsPackage() {
        return (StatementsPackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static StatementsPackage getPackage() {
        return StatementsPackage.eINSTANCE;
    }

} //StatementsFactoryImpl
