/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExpressionsPackage;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.UnaryExpressionChild;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unary Expression Child</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class UnaryExpressionChildImpl extends MultiplicativeExpressionChildImpl
        implements UnaryExpressionChild {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected UnaryExpressionChildImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExpressionsPackage.Literals.UNARY_EXPRESSION_CHILD;
    }

} //UnaryExpressionChildImpl
