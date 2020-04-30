/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.statements;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementsPackage
 * @generated
 */
public interface StatementsFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    StatementsFactory eINSTANCE = org.palladiosimulator.jdt.metamodel.javamodel.statements.impl.StatementsFactoryImpl
            .init();

    /**
     * Returns a new object of class '<em>Assert</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Assert</em>'.
     * @generated
     */
    Assert createAssert();

    /**
     * Returns a new object of class '<em>Break</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Break</em>'.
     * @generated
     */
    Break createBreak();

    /**
     * Returns a new object of class '<em>Block</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Block</em>'.
     * @generated
     */
    Block createBlock();

    /**
     * Returns a new object of class '<em>Catch Block</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Catch Block</em>'.
     * @generated
     */
    CatchBlock createCatchBlock();

    /**
     * Returns a new object of class '<em>Condition</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Condition</em>'.
     * @generated
     */
    Condition createCondition();

    /**
     * Returns a new object of class '<em>Continue</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Continue</em>'.
     * @generated
     */
    Continue createContinue();

    /**
     * Returns a new object of class '<em>Default Switch Case</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Default Switch Case</em>'.
     * @generated
     */
    DefaultSwitchCase createDefaultSwitchCase();

    /**
     * Returns a new object of class '<em>Do While Loop</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Do While Loop</em>'.
     * @generated
     */
    DoWhileLoop createDoWhileLoop();

    /**
     * Returns a new object of class '<em>Empty Statement</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Empty Statement</em>'.
     * @generated
     */
    EmptyStatement createEmptyStatement();

    /**
     * Returns a new object of class '<em>Expression Statement</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Expression Statement</em>'.
     * @generated
     */
    ExpressionStatement createExpressionStatement();

    /**
     * Returns a new object of class '<em>For Loop</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>For Loop</em>'.
     * @generated
     */
    ForLoop createForLoop();

    /**
     * Returns a new object of class '<em>For Each Loop</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>For Each Loop</em>'.
     * @generated
     */
    ForEachLoop createForEachLoop();

    /**
     * Returns a new object of class '<em>Jump Label</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Jump Label</em>'.
     * @generated
     */
    JumpLabel createJumpLabel();

    /**
     * Returns a new object of class '<em>Local Variable Statement</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Local Variable Statement</em>'.
     * @generated
     */
    LocalVariableStatement createLocalVariableStatement();

    /**
     * Returns a new object of class '<em>Normal Switch Case</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Normal Switch Case</em>'.
     * @generated
     */
    NormalSwitchCase createNormalSwitchCase();

    /**
     * Returns a new object of class '<em>Return</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Return</em>'.
     * @generated
     */
    Return createReturn();

    /**
     * Returns a new object of class '<em>Switch</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Switch</em>'.
     * @generated
     */
    Switch createSwitch();

    /**
     * Returns a new object of class '<em>Synchronized Block</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Synchronized Block</em>'.
     * @generated
     */
    SynchronizedBlock createSynchronizedBlock();

    /**
     * Returns a new object of class '<em>Throw</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Throw</em>'.
     * @generated
     */
    Throw createThrow();

    /**
     * Returns a new object of class '<em>Try Block</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Try Block</em>'.
     * @generated
     */
    TryBlock createTryBlock();

    /**
     * Returns a new object of class '<em>While Loop</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>While Loop</em>'.
     * @generated
     */
    WhileLoop createWhileLoop();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    StatementsPackage getStatementsPackage();

} //StatementsFactory
