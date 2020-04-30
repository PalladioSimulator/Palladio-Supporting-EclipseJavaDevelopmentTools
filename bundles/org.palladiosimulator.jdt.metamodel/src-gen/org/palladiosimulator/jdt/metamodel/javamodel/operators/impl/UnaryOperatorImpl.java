/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.operators.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.jdt.metamodel.javamodel.operators.OperatorsPackage;
import org.palladiosimulator.jdt.metamodel.javamodel.operators.UnaryOperator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unary Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class UnaryOperatorImpl extends OperatorImpl implements UnaryOperator {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected UnaryOperatorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return OperatorsPackage.Literals.UNARY_OPERATOR;
    }

} //UnaryOperatorImpl
