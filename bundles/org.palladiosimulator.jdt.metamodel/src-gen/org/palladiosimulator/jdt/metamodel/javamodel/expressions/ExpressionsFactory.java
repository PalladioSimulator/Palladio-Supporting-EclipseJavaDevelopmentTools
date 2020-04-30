/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.expressions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExpressionsPackage
 * @generated
 */
public interface ExpressionsFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ExpressionsFactory eINSTANCE = org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsFactoryImpl
            .init();

    /**
     * Returns a new object of class '<em>Expression List</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Expression List</em>'.
     * @generated
     */
    ExpressionList createExpressionList();

    /**
     * Returns a new object of class '<em>Assignment Expression</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Assignment Expression</em>'.
     * @generated
     */
    AssignmentExpression createAssignmentExpression();

    /**
     * Returns a new object of class '<em>Conditional Expression</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Conditional Expression</em>'.
     * @generated
     */
    ConditionalExpression createConditionalExpression();

    /**
     * Returns a new object of class '<em>Conditional Or Expression</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Conditional Or Expression</em>'.
     * @generated
     */
    ConditionalOrExpression createConditionalOrExpression();

    /**
     * Returns a new object of class '<em>Conditional And Expression</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Conditional And Expression</em>'.
     * @generated
     */
    ConditionalAndExpression createConditionalAndExpression();

    /**
     * Returns a new object of class '<em>Inclusive Or Expression</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Inclusive Or Expression</em>'.
     * @generated
     */
    InclusiveOrExpression createInclusiveOrExpression();

    /**
     * Returns a new object of class '<em>Exclusive Or Expression</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exclusive Or Expression</em>'.
     * @generated
     */
    ExclusiveOrExpression createExclusiveOrExpression();

    /**
     * Returns a new object of class '<em>And Expression</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>And Expression</em>'.
     * @generated
     */
    AndExpression createAndExpression();

    /**
     * Returns a new object of class '<em>Equality Expression</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Equality Expression</em>'.
     * @generated
     */
    EqualityExpression createEqualityExpression();

    /**
     * Returns a new object of class '<em>Instance Of Expression</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Instance Of Expression</em>'.
     * @generated
     */
    InstanceOfExpression createInstanceOfExpression();

    /**
     * Returns a new object of class '<em>Relation Expression</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Relation Expression</em>'.
     * @generated
     */
    RelationExpression createRelationExpression();

    /**
     * Returns a new object of class '<em>Shift Expression</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Shift Expression</em>'.
     * @generated
     */
    ShiftExpression createShiftExpression();

    /**
     * Returns a new object of class '<em>Additive Expression</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Additive Expression</em>'.
     * @generated
     */
    AdditiveExpression createAdditiveExpression();

    /**
     * Returns a new object of class '<em>Multiplicative Expression</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Multiplicative Expression</em>'.
     * @generated
     */
    MultiplicativeExpression createMultiplicativeExpression();

    /**
     * Returns a new object of class '<em>Unary Expression</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Unary Expression</em>'.
     * @generated
     */
    UnaryExpression createUnaryExpression();

    /**
     * Returns a new object of class '<em>Prefix Unary Modification Expression</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Prefix Unary Modification Expression</em>'.
     * @generated
     */
    PrefixUnaryModificationExpression createPrefixUnaryModificationExpression();

    /**
     * Returns a new object of class '<em>Suffix Unary Modification Expression</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Suffix Unary Modification Expression</em>'.
     * @generated
     */
    SuffixUnaryModificationExpression createSuffixUnaryModificationExpression();

    /**
     * Returns a new object of class '<em>Cast Expression</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Cast Expression</em>'.
     * @generated
     */
    CastExpression createCastExpression();

    /**
     * Returns a new object of class '<em>Nested Expression</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Nested Expression</em>'.
     * @generated
     */
    NestedExpression createNestedExpression();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    ExpressionsPackage getExpressionsPackage();

} //ExpressionsFactory
