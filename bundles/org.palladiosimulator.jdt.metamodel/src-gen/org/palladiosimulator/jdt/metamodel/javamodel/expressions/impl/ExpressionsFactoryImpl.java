/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.palladiosimulator.jdt.metamodel.javamodel.expressions.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExpressionsFactoryImpl extends EFactoryImpl implements ExpressionsFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ExpressionsFactory init() {
        try {
            ExpressionsFactory theExpressionsFactory = (ExpressionsFactory) EPackage.Registry.INSTANCE
                    .getEFactory(ExpressionsPackage.eNS_URI);
            if (theExpressionsFactory != null) {
                return theExpressionsFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ExpressionsFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExpressionsFactoryImpl() {
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
        case ExpressionsPackage.EXPRESSION_LIST:
            return createExpressionList();
        case ExpressionsPackage.ASSIGNMENT_EXPRESSION:
            return createAssignmentExpression();
        case ExpressionsPackage.CONDITIONAL_EXPRESSION:
            return createConditionalExpression();
        case ExpressionsPackage.CONDITIONAL_OR_EXPRESSION:
            return createConditionalOrExpression();
        case ExpressionsPackage.CONDITIONAL_AND_EXPRESSION:
            return createConditionalAndExpression();
        case ExpressionsPackage.INCLUSIVE_OR_EXPRESSION:
            return createInclusiveOrExpression();
        case ExpressionsPackage.EXCLUSIVE_OR_EXPRESSION:
            return createExclusiveOrExpression();
        case ExpressionsPackage.AND_EXPRESSION:
            return createAndExpression();
        case ExpressionsPackage.EQUALITY_EXPRESSION:
            return createEqualityExpression();
        case ExpressionsPackage.INSTANCE_OF_EXPRESSION:
            return createInstanceOfExpression();
        case ExpressionsPackage.RELATION_EXPRESSION:
            return createRelationExpression();
        case ExpressionsPackage.SHIFT_EXPRESSION:
            return createShiftExpression();
        case ExpressionsPackage.ADDITIVE_EXPRESSION:
            return createAdditiveExpression();
        case ExpressionsPackage.MULTIPLICATIVE_EXPRESSION:
            return createMultiplicativeExpression();
        case ExpressionsPackage.UNARY_EXPRESSION:
            return createUnaryExpression();
        case ExpressionsPackage.PREFIX_UNARY_MODIFICATION_EXPRESSION:
            return createPrefixUnaryModificationExpression();
        case ExpressionsPackage.SUFFIX_UNARY_MODIFICATION_EXPRESSION:
            return createSuffixUnaryModificationExpression();
        case ExpressionsPackage.CAST_EXPRESSION:
            return createCastExpression();
        case ExpressionsPackage.NESTED_EXPRESSION:
            return createNestedExpression();
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
    public ExpressionList createExpressionList() {
        ExpressionListImpl expressionList = new ExpressionListImpl();
        return expressionList;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AssignmentExpression createAssignmentExpression() {
        AssignmentExpressionImpl assignmentExpression = new AssignmentExpressionImpl();
        return assignmentExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ConditionalExpression createConditionalExpression() {
        ConditionalExpressionImpl conditionalExpression = new ConditionalExpressionImpl();
        return conditionalExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ConditionalOrExpression createConditionalOrExpression() {
        ConditionalOrExpressionImpl conditionalOrExpression = new ConditionalOrExpressionImpl();
        return conditionalOrExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ConditionalAndExpression createConditionalAndExpression() {
        ConditionalAndExpressionImpl conditionalAndExpression = new ConditionalAndExpressionImpl();
        return conditionalAndExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public InclusiveOrExpression createInclusiveOrExpression() {
        InclusiveOrExpressionImpl inclusiveOrExpression = new InclusiveOrExpressionImpl();
        return inclusiveOrExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExclusiveOrExpression createExclusiveOrExpression() {
        ExclusiveOrExpressionImpl exclusiveOrExpression = new ExclusiveOrExpressionImpl();
        return exclusiveOrExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AndExpression createAndExpression() {
        AndExpressionImpl andExpression = new AndExpressionImpl();
        return andExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EqualityExpression createEqualityExpression() {
        EqualityExpressionImpl equalityExpression = new EqualityExpressionImpl();
        return equalityExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public InstanceOfExpression createInstanceOfExpression() {
        InstanceOfExpressionImpl instanceOfExpression = new InstanceOfExpressionImpl();
        return instanceOfExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RelationExpression createRelationExpression() {
        RelationExpressionImpl relationExpression = new RelationExpressionImpl();
        return relationExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ShiftExpression createShiftExpression() {
        ShiftExpressionImpl shiftExpression = new ShiftExpressionImpl();
        return shiftExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AdditiveExpression createAdditiveExpression() {
        AdditiveExpressionImpl additiveExpression = new AdditiveExpressionImpl();
        return additiveExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MultiplicativeExpression createMultiplicativeExpression() {
        MultiplicativeExpressionImpl multiplicativeExpression = new MultiplicativeExpressionImpl();
        return multiplicativeExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public UnaryExpression createUnaryExpression() {
        UnaryExpressionImpl unaryExpression = new UnaryExpressionImpl();
        return unaryExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PrefixUnaryModificationExpression createPrefixUnaryModificationExpression() {
        PrefixUnaryModificationExpressionImpl prefixUnaryModificationExpression = new PrefixUnaryModificationExpressionImpl();
        return prefixUnaryModificationExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SuffixUnaryModificationExpression createSuffixUnaryModificationExpression() {
        SuffixUnaryModificationExpressionImpl suffixUnaryModificationExpression = new SuffixUnaryModificationExpressionImpl();
        return suffixUnaryModificationExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CastExpression createCastExpression() {
        CastExpressionImpl castExpression = new CastExpressionImpl();
        return castExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NestedExpression createNestedExpression() {
        NestedExpressionImpl nestedExpression = new NestedExpressionImpl();
        return nestedExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExpressionsPackage getExpressionsPackage() {
        return (ExpressionsPackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ExpressionsPackage getPackage() {
        return ExpressionsPackage.eINSTANCE;
    }

} //ExpressionsFactoryImpl
