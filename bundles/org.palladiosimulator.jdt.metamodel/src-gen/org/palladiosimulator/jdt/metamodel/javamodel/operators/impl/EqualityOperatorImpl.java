/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.operators.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.jdt.metamodel.javamodel.operators.EqualityOperator;
import org.palladiosimulator.jdt.metamodel.javamodel.operators.OperatorsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Equality Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class EqualityOperatorImpl extends OperatorImpl implements EqualityOperator {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EqualityOperatorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return OperatorsPackage.Literals.EQUALITY_OPERATOR;
    }

} //EqualityOperatorImpl
