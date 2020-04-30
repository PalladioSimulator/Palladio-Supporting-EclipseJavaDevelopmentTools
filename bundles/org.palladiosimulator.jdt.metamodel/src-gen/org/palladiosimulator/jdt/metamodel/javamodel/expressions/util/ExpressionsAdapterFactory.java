/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.expressions.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationValue;

import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayInitializationValue;
import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayTypeable;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable;

import org.palladiosimulator.jdt.metamodel.javamodel.expressions.*;

import org.palladiosimulator.jdt.metamodel.javamodel.generics.TypeArgumentable;

import org.palladiosimulator.jdt.metamodel.javamodel.references.Reference;

import org.palladiosimulator.jdt.metamodel.javamodel.statements.ForLoopInitializer;

import org.palladiosimulator.jdt.metamodel.javamodel.types.TypedElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExpressionsPackage
 * @generated
 */
public class ExpressionsAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static ExpressionsPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExpressionsAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = ExpressionsPackage.eINSTANCE;
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
    protected ExpressionsSwitch<Adapter> modelSwitch = new ExpressionsSwitch<Adapter>() {
        @Override
        public Adapter caseExpressionList(ExpressionList object) {
            return createExpressionListAdapter();
        }

        @Override
        public Adapter caseExpression(Expression object) {
            return createExpressionAdapter();
        }

        @Override
        public Adapter caseAssignmentExpression(AssignmentExpression object) {
            return createAssignmentExpressionAdapter();
        }

        @Override
        public Adapter caseAssignmentExpressionChild(AssignmentExpressionChild object) {
            return createAssignmentExpressionChildAdapter();
        }

        @Override
        public Adapter caseConditionalExpression(ConditionalExpression object) {
            return createConditionalExpressionAdapter();
        }

        @Override
        public Adapter caseConditionalExpressionChild(ConditionalExpressionChild object) {
            return createConditionalExpressionChildAdapter();
        }

        @Override
        public Adapter caseConditionalOrExpression(ConditionalOrExpression object) {
            return createConditionalOrExpressionAdapter();
        }

        @Override
        public Adapter caseConditionalOrExpressionChild(ConditionalOrExpressionChild object) {
            return createConditionalOrExpressionChildAdapter();
        }

        @Override
        public Adapter caseConditionalAndExpression(ConditionalAndExpression object) {
            return createConditionalAndExpressionAdapter();
        }

        @Override
        public Adapter caseConditionalAndExpressionChild(ConditionalAndExpressionChild object) {
            return createConditionalAndExpressionChildAdapter();
        }

        @Override
        public Adapter caseInclusiveOrExpression(InclusiveOrExpression object) {
            return createInclusiveOrExpressionAdapter();
        }

        @Override
        public Adapter caseInclusiveOrExpressionChild(InclusiveOrExpressionChild object) {
            return createInclusiveOrExpressionChildAdapter();
        }

        @Override
        public Adapter caseExclusiveOrExpression(ExclusiveOrExpression object) {
            return createExclusiveOrExpressionAdapter();
        }

        @Override
        public Adapter caseExclusiveOrExpressionChild(ExclusiveOrExpressionChild object) {
            return createExclusiveOrExpressionChildAdapter();
        }

        @Override
        public Adapter caseAndExpression(AndExpression object) {
            return createAndExpressionAdapter();
        }

        @Override
        public Adapter caseAndExpressionChild(AndExpressionChild object) {
            return createAndExpressionChildAdapter();
        }

        @Override
        public Adapter caseEqualityExpression(EqualityExpression object) {
            return createEqualityExpressionAdapter();
        }

        @Override
        public Adapter caseEqualityExpressionChild(EqualityExpressionChild object) {
            return createEqualityExpressionChildAdapter();
        }

        @Override
        public Adapter caseInstanceOfExpression(InstanceOfExpression object) {
            return createInstanceOfExpressionAdapter();
        }

        @Override
        public Adapter caseInstanceOfExpressionChild(InstanceOfExpressionChild object) {
            return createInstanceOfExpressionChildAdapter();
        }

        @Override
        public Adapter caseRelationExpression(RelationExpression object) {
            return createRelationExpressionAdapter();
        }

        @Override
        public Adapter caseRelationExpressionChild(RelationExpressionChild object) {
            return createRelationExpressionChildAdapter();
        }

        @Override
        public Adapter caseShiftExpression(ShiftExpression object) {
            return createShiftExpressionAdapter();
        }

        @Override
        public Adapter caseShiftExpressionChild(ShiftExpressionChild object) {
            return createShiftExpressionChildAdapter();
        }

        @Override
        public Adapter caseAdditiveExpression(AdditiveExpression object) {
            return createAdditiveExpressionAdapter();
        }

        @Override
        public Adapter caseAdditiveExpressionChild(AdditiveExpressionChild object) {
            return createAdditiveExpressionChildAdapter();
        }

        @Override
        public Adapter caseMultiplicativeExpression(MultiplicativeExpression object) {
            return createMultiplicativeExpressionAdapter();
        }

        @Override
        public Adapter caseMultiplicativeExpressionChild(MultiplicativeExpressionChild object) {
            return createMultiplicativeExpressionChildAdapter();
        }

        @Override
        public Adapter caseUnaryExpression(UnaryExpression object) {
            return createUnaryExpressionAdapter();
        }

        @Override
        public Adapter caseUnaryExpressionChild(UnaryExpressionChild object) {
            return createUnaryExpressionChildAdapter();
        }

        @Override
        public Adapter caseUnaryModificationExpression(UnaryModificationExpression object) {
            return createUnaryModificationExpressionAdapter();
        }

        @Override
        public Adapter casePrefixUnaryModificationExpression(PrefixUnaryModificationExpression object) {
            return createPrefixUnaryModificationExpressionAdapter();
        }

        @Override
        public Adapter caseSuffixUnaryModificationExpression(SuffixUnaryModificationExpression object) {
            return createSuffixUnaryModificationExpressionAdapter();
        }

        @Override
        public Adapter caseUnaryModificationExpressionChild(UnaryModificationExpressionChild object) {
            return createUnaryModificationExpressionChildAdapter();
        }

        @Override
        public Adapter caseCastExpression(CastExpression object) {
            return createCastExpressionAdapter();
        }

        @Override
        public Adapter casePrimaryExpression(PrimaryExpression object) {
            return createPrimaryExpressionAdapter();
        }

        @Override
        public Adapter caseNestedExpression(NestedExpression object) {
            return createNestedExpressionAdapter();
        }

        @Override
        public Adapter caseCommentable(Commentable object) {
            return createCommentableAdapter();
        }

        @Override
        public Adapter caseForLoopInitializer(ForLoopInitializer object) {
            return createForLoopInitializerAdapter();
        }

        @Override
        public Adapter caseArrayInitializationValue(ArrayInitializationValue object) {
            return createArrayInitializationValueAdapter();
        }

        @Override
        public Adapter caseAnnotationValue(AnnotationValue object) {
            return createAnnotationValueAdapter();
        }

        @Override
        public Adapter caseArrayTypeable(ArrayTypeable object) {
            return createArrayTypeableAdapter();
        }

        @Override
        public Adapter caseTypedElement(TypedElement object) {
            return createTypedElementAdapter();
        }

        @Override
        public Adapter caseTypeArgumentable(TypeArgumentable object) {
            return createTypeArgumentableAdapter();
        }

        @Override
        public Adapter caseReference(Reference object) {
            return createReferenceAdapter();
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
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExpressionList <em>Expression List</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExpressionList
     * @generated
     */
    public Adapter createExpressionListAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.Expression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.Expression
     * @generated
     */
    public Adapter createExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.AssignmentExpression <em>Assignment Expression</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.AssignmentExpression
     * @generated
     */
    public Adapter createAssignmentExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.AssignmentExpressionChild <em>Assignment Expression Child</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.AssignmentExpressionChild
     * @generated
     */
    public Adapter createAssignmentExpressionChildAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.ConditionalExpression <em>Conditional Expression</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.ConditionalExpression
     * @generated
     */
    public Adapter createConditionalExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.ConditionalExpressionChild <em>Conditional Expression Child</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.ConditionalExpressionChild
     * @generated
     */
    public Adapter createConditionalExpressionChildAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.ConditionalOrExpression <em>Conditional Or Expression</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.ConditionalOrExpression
     * @generated
     */
    public Adapter createConditionalOrExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.ConditionalOrExpressionChild <em>Conditional Or Expression Child</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.ConditionalOrExpressionChild
     * @generated
     */
    public Adapter createConditionalOrExpressionChildAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.ConditionalAndExpression <em>Conditional And Expression</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.ConditionalAndExpression
     * @generated
     */
    public Adapter createConditionalAndExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.ConditionalAndExpressionChild <em>Conditional And Expression Child</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.ConditionalAndExpressionChild
     * @generated
     */
    public Adapter createConditionalAndExpressionChildAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.InclusiveOrExpression <em>Inclusive Or Expression</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.InclusiveOrExpression
     * @generated
     */
    public Adapter createInclusiveOrExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.InclusiveOrExpressionChild <em>Inclusive Or Expression Child</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.InclusiveOrExpressionChild
     * @generated
     */
    public Adapter createInclusiveOrExpressionChildAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExclusiveOrExpression <em>Exclusive Or Expression</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExclusiveOrExpression
     * @generated
     */
    public Adapter createExclusiveOrExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExclusiveOrExpressionChild <em>Exclusive Or Expression Child</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExclusiveOrExpressionChild
     * @generated
     */
    public Adapter createExclusiveOrExpressionChildAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.AndExpression <em>And Expression</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.AndExpression
     * @generated
     */
    public Adapter createAndExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.AndExpressionChild <em>And Expression Child</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.AndExpressionChild
     * @generated
     */
    public Adapter createAndExpressionChildAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.EqualityExpression <em>Equality Expression</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.EqualityExpression
     * @generated
     */
    public Adapter createEqualityExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.EqualityExpressionChild <em>Equality Expression Child</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.EqualityExpressionChild
     * @generated
     */
    public Adapter createEqualityExpressionChildAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.InstanceOfExpression <em>Instance Of Expression</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.InstanceOfExpression
     * @generated
     */
    public Adapter createInstanceOfExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.InstanceOfExpressionChild <em>Instance Of Expression Child</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.InstanceOfExpressionChild
     * @generated
     */
    public Adapter createInstanceOfExpressionChildAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.RelationExpression <em>Relation Expression</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.RelationExpression
     * @generated
     */
    public Adapter createRelationExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.RelationExpressionChild <em>Relation Expression Child</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.RelationExpressionChild
     * @generated
     */
    public Adapter createRelationExpressionChildAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.ShiftExpression <em>Shift Expression</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.ShiftExpression
     * @generated
     */
    public Adapter createShiftExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.ShiftExpressionChild <em>Shift Expression Child</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.ShiftExpressionChild
     * @generated
     */
    public Adapter createShiftExpressionChildAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.AdditiveExpression <em>Additive Expression</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.AdditiveExpression
     * @generated
     */
    public Adapter createAdditiveExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.AdditiveExpressionChild <em>Additive Expression Child</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.AdditiveExpressionChild
     * @generated
     */
    public Adapter createAdditiveExpressionChildAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.MultiplicativeExpression <em>Multiplicative Expression</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.MultiplicativeExpression
     * @generated
     */
    public Adapter createMultiplicativeExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.MultiplicativeExpressionChild <em>Multiplicative Expression Child</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.MultiplicativeExpressionChild
     * @generated
     */
    public Adapter createMultiplicativeExpressionChildAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.UnaryExpression <em>Unary Expression</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.UnaryExpression
     * @generated
     */
    public Adapter createUnaryExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.UnaryExpressionChild <em>Unary Expression Child</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.UnaryExpressionChild
     * @generated
     */
    public Adapter createUnaryExpressionChildAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.UnaryModificationExpression <em>Unary Modification Expression</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.UnaryModificationExpression
     * @generated
     */
    public Adapter createUnaryModificationExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.PrefixUnaryModificationExpression <em>Prefix Unary Modification Expression</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.PrefixUnaryModificationExpression
     * @generated
     */
    public Adapter createPrefixUnaryModificationExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.SuffixUnaryModificationExpression <em>Suffix Unary Modification Expression</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.SuffixUnaryModificationExpression
     * @generated
     */
    public Adapter createSuffixUnaryModificationExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.UnaryModificationExpressionChild <em>Unary Modification Expression Child</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.UnaryModificationExpressionChild
     * @generated
     */
    public Adapter createUnaryModificationExpressionChildAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.CastExpression <em>Cast Expression</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.CastExpression
     * @generated
     */
    public Adapter createCastExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.PrimaryExpression <em>Primary Expression</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.PrimaryExpression
     * @generated
     */
    public Adapter createPrimaryExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.NestedExpression <em>Nested Expression</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.NestedExpression
     * @generated
     */
    public Adapter createNestedExpressionAdapter() {
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
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.statements.ForLoopInitializer <em>For Loop Initializer</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.statements.ForLoopInitializer
     * @generated
     */
    public Adapter createForLoopInitializerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayInitializationValue <em>Array Initialization Value</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayInitializationValue
     * @generated
     */
    public Adapter createArrayInitializationValueAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationValue <em>Annotation Value</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationValue
     * @generated
     */
    public Adapter createAnnotationValueAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayTypeable <em>Array Typeable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayTypeable
     * @generated
     */
    public Adapter createArrayTypeableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.types.TypedElement <em>Typed Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.types.TypedElement
     * @generated
     */
    public Adapter createTypedElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.generics.TypeArgumentable <em>Type Argumentable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.generics.TypeArgumentable
     * @generated
     */
    public Adapter createTypeArgumentableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.references.Reference <em>Reference</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.references.Reference
     * @generated
     */
    public Adapter createReferenceAdapter() {
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

} //ExpressionsAdapterFactory
