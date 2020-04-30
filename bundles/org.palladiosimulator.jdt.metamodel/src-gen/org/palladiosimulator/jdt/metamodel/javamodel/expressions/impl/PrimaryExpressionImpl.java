/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExpressionsPackage;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.PrimaryExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class PrimaryExpressionImpl extends UnaryModificationExpressionChildImpl implements PrimaryExpression {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PrimaryExpressionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExpressionsPackage.Literals.PRIMARY_EXPRESSION;
    }

} //PrimaryExpressionImpl
