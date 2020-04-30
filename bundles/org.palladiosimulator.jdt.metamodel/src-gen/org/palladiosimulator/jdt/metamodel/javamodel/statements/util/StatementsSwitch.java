/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.statements.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable;
import org.palladiosimulator.jdt.metamodel.javamodel.commons.NamedElement;

import org.palladiosimulator.jdt.metamodel.javamodel.members.Member;

import org.palladiosimulator.jdt.metamodel.javamodel.modifiers.Modifiable;

import org.palladiosimulator.jdt.metamodel.javamodel.statements.*;

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
 * @see org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementsPackage
 * @generated
 */
public class StatementsSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static StatementsPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StatementsSwitch() {
        if (modelPackage == null) {
            modelPackage = StatementsPackage.eINSTANCE;
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
        case StatementsPackage.STATEMENT_CONTAINER: {
            StatementContainer statementContainer = (StatementContainer) theEObject;
            T result = caseStatementContainer(statementContainer);
            if (result == null)
                result = caseCommentable(statementContainer);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case StatementsPackage.STATEMENT_LIST_CONTAINER: {
            StatementListContainer statementListContainer = (StatementListContainer) theEObject;
            T result = caseStatementListContainer(statementListContainer);
            if (result == null)
                result = caseCommentable(statementListContainer);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case StatementsPackage.CONDITIONAL: {
            Conditional conditional = (Conditional) theEObject;
            T result = caseConditional(conditional);
            if (result == null)
                result = caseCommentable(conditional);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case StatementsPackage.FOR_LOOP_INITIALIZER: {
            ForLoopInitializer forLoopInitializer = (ForLoopInitializer) theEObject;
            T result = caseForLoopInitializer(forLoopInitializer);
            if (result == null)
                result = caseCommentable(forLoopInitializer);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case StatementsPackage.STATEMENT: {
            Statement statement = (Statement) theEObject;
            T result = caseStatement(statement);
            if (result == null)
                result = caseCommentable(statement);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case StatementsPackage.SWITCH_CASE: {
            SwitchCase switchCase = (SwitchCase) theEObject;
            T result = caseSwitchCase(switchCase);
            if (result == null)
                result = caseStatementListContainer(switchCase);
            if (result == null)
                result = caseCommentable(switchCase);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case StatementsPackage.ASSERT: {
            Assert assert_ = (Assert) theEObject;
            T result = caseAssert(assert_);
            if (result == null)
                result = caseStatement(assert_);
            if (result == null)
                result = caseConditional(assert_);
            if (result == null)
                result = caseCommentable(assert_);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case StatementsPackage.BREAK: {
            Break break_ = (Break) theEObject;
            T result = caseBreak(break_);
            if (result == null)
                result = caseJump(break_);
            if (result == null)
                result = caseStatement(break_);
            if (result == null)
                result = caseCommentable(break_);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case StatementsPackage.BLOCK: {
            Block block = (Block) theEObject;
            T result = caseBlock(block);
            if (result == null)
                result = caseMember(block);
            if (result == null)
                result = caseStatement(block);
            if (result == null)
                result = caseStatementListContainer(block);
            if (result == null)
                result = caseModifiable(block);
            if (result == null)
                result = caseNamedElement(block);
            if (result == null)
                result = caseCommentable(block);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case StatementsPackage.CATCH_BLOCK: {
            CatchBlock catchBlock = (CatchBlock) theEObject;
            T result = caseCatchBlock(catchBlock);
            if (result == null)
                result = caseStatementListContainer(catchBlock);
            if (result == null)
                result = caseCommentable(catchBlock);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case StatementsPackage.CONDITION: {
            Condition condition = (Condition) theEObject;
            T result = caseCondition(condition);
            if (result == null)
                result = caseStatement(condition);
            if (result == null)
                result = caseStatementContainer(condition);
            if (result == null)
                result = caseConditional(condition);
            if (result == null)
                result = caseCommentable(condition);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case StatementsPackage.CONTINUE: {
            Continue continue_ = (Continue) theEObject;
            T result = caseContinue(continue_);
            if (result == null)
                result = caseJump(continue_);
            if (result == null)
                result = caseStatement(continue_);
            if (result == null)
                result = caseCommentable(continue_);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case StatementsPackage.DEFAULT_SWITCH_CASE: {
            DefaultSwitchCase defaultSwitchCase = (DefaultSwitchCase) theEObject;
            T result = caseDefaultSwitchCase(defaultSwitchCase);
            if (result == null)
                result = caseSwitchCase(defaultSwitchCase);
            if (result == null)
                result = caseStatementListContainer(defaultSwitchCase);
            if (result == null)
                result = caseCommentable(defaultSwitchCase);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case StatementsPackage.DO_WHILE_LOOP: {
            DoWhileLoop doWhileLoop = (DoWhileLoop) theEObject;
            T result = caseDoWhileLoop(doWhileLoop);
            if (result == null)
                result = caseWhileLoop(doWhileLoop);
            if (result == null)
                result = caseStatement(doWhileLoop);
            if (result == null)
                result = caseStatementContainer(doWhileLoop);
            if (result == null)
                result = caseCommentable(doWhileLoop);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case StatementsPackage.EMPTY_STATEMENT: {
            EmptyStatement emptyStatement = (EmptyStatement) theEObject;
            T result = caseEmptyStatement(emptyStatement);
            if (result == null)
                result = caseStatement(emptyStatement);
            if (result == null)
                result = caseCommentable(emptyStatement);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case StatementsPackage.EXPRESSION_STATEMENT: {
            ExpressionStatement expressionStatement = (ExpressionStatement) theEObject;
            T result = caseExpressionStatement(expressionStatement);
            if (result == null)
                result = caseStatement(expressionStatement);
            if (result == null)
                result = caseCommentable(expressionStatement);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case StatementsPackage.FOR_LOOP: {
            ForLoop forLoop = (ForLoop) theEObject;
            T result = caseForLoop(forLoop);
            if (result == null)
                result = caseStatement(forLoop);
            if (result == null)
                result = caseStatementContainer(forLoop);
            if (result == null)
                result = caseConditional(forLoop);
            if (result == null)
                result = caseCommentable(forLoop);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case StatementsPackage.FOR_EACH_LOOP: {
            ForEachLoop forEachLoop = (ForEachLoop) theEObject;
            T result = caseForEachLoop(forEachLoop);
            if (result == null)
                result = caseStatement(forEachLoop);
            if (result == null)
                result = caseStatementContainer(forEachLoop);
            if (result == null)
                result = caseCommentable(forEachLoop);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case StatementsPackage.JUMP: {
            Jump jump = (Jump) theEObject;
            T result = caseJump(jump);
            if (result == null)
                result = caseStatement(jump);
            if (result == null)
                result = caseCommentable(jump);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case StatementsPackage.JUMP_LABEL: {
            JumpLabel jumpLabel = (JumpLabel) theEObject;
            T result = caseJumpLabel(jumpLabel);
            if (result == null)
                result = caseStatement(jumpLabel);
            if (result == null)
                result = caseStatementContainer(jumpLabel);
            if (result == null)
                result = caseNamedElement(jumpLabel);
            if (result == null)
                result = caseCommentable(jumpLabel);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case StatementsPackage.LOCAL_VARIABLE_STATEMENT: {
            LocalVariableStatement localVariableStatement = (LocalVariableStatement) theEObject;
            T result = caseLocalVariableStatement(localVariableStatement);
            if (result == null)
                result = caseStatement(localVariableStatement);
            if (result == null)
                result = caseCommentable(localVariableStatement);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case StatementsPackage.NORMAL_SWITCH_CASE: {
            NormalSwitchCase normalSwitchCase = (NormalSwitchCase) theEObject;
            T result = caseNormalSwitchCase(normalSwitchCase);
            if (result == null)
                result = caseSwitchCase(normalSwitchCase);
            if (result == null)
                result = caseConditional(normalSwitchCase);
            if (result == null)
                result = caseStatementListContainer(normalSwitchCase);
            if (result == null)
                result = caseCommentable(normalSwitchCase);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case StatementsPackage.RETURN: {
            Return return_ = (Return) theEObject;
            T result = caseReturn(return_);
            if (result == null)
                result = caseStatement(return_);
            if (result == null)
                result = caseCommentable(return_);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case StatementsPackage.SWITCH: {
            org.palladiosimulator.jdt.metamodel.javamodel.statements.Switch switch_ = (org.palladiosimulator.jdt.metamodel.javamodel.statements.Switch) theEObject;
            T result = caseSwitch(switch_);
            if (result == null)
                result = caseStatement(switch_);
            if (result == null)
                result = caseCommentable(switch_);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case StatementsPackage.SYNCHRONIZED_BLOCK: {
            SynchronizedBlock synchronizedBlock = (SynchronizedBlock) theEObject;
            T result = caseSynchronizedBlock(synchronizedBlock);
            if (result == null)
                result = caseStatement(synchronizedBlock);
            if (result == null)
                result = caseStatementListContainer(synchronizedBlock);
            if (result == null)
                result = caseCommentable(synchronizedBlock);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case StatementsPackage.THROW: {
            Throw throw_ = (Throw) theEObject;
            T result = caseThrow(throw_);
            if (result == null)
                result = caseStatement(throw_);
            if (result == null)
                result = caseCommentable(throw_);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case StatementsPackage.TRY_BLOCK: {
            TryBlock tryBlock = (TryBlock) theEObject;
            T result = caseTryBlock(tryBlock);
            if (result == null)
                result = caseStatement(tryBlock);
            if (result == null)
                result = caseStatementListContainer(tryBlock);
            if (result == null)
                result = caseCommentable(tryBlock);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case StatementsPackage.WHILE_LOOP: {
            WhileLoop whileLoop = (WhileLoop) theEObject;
            T result = caseWhileLoop(whileLoop);
            if (result == null)
                result = caseStatement(whileLoop);
            if (result == null)
                result = caseStatementContainer(whileLoop);
            if (result == null)
                result = caseCommentable(whileLoop);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        default:
            return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Statement Container</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Statement Container</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStatementContainer(StatementContainer object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Statement List Container</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Statement List Container</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStatementListContainer(StatementListContainer object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Conditional</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Conditional</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConditional(Conditional object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStatement(Statement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Switch Case</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Switch Case</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSwitchCase(SwitchCase object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Assert</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Assert</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAssert(Assert object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Break</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Break</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBreak(Break object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Block</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBlock(Block object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Catch Block</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Catch Block</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCatchBlock(CatchBlock object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCondition(Condition object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Continue</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Continue</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseContinue(Continue object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Default Switch Case</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Default Switch Case</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDefaultSwitchCase(DefaultSwitchCase object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Do While Loop</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Do While Loop</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDoWhileLoop(DoWhileLoop object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Empty Statement</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Empty Statement</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEmptyStatement(EmptyStatement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Expression Statement</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Expression Statement</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExpressionStatement(ExpressionStatement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>For Loop</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>For Loop</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseForLoop(ForLoop object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>For Each Loop</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>For Each Loop</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseForEachLoop(ForEachLoop object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Jump</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Jump</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseJump(Jump object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Jump Label</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Jump Label</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseJumpLabel(JumpLabel object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Local Variable Statement</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Local Variable Statement</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLocalVariableStatement(LocalVariableStatement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Normal Switch Case</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Normal Switch Case</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNormalSwitchCase(NormalSwitchCase object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Return</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Return</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseReturn(Return object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Switch</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Switch</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSwitch(org.palladiosimulator.jdt.metamodel.javamodel.statements.Switch object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Synchronized Block</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Synchronized Block</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSynchronizedBlock(SynchronizedBlock object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Throw</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Throw</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseThrow(Throw object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Try Block</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Try Block</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTryBlock(TryBlock object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>While Loop</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>While Loop</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWhileLoop(WhileLoop object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNamedElement(NamedElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Member</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Member</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMember(Member object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Modifiable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Modifiable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseModifiable(Modifiable object) {
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

} //StatementsSwitch
