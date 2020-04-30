/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.operators.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.jdt.metamodel.javamodel.operators.AssignmentOperator;
import org.palladiosimulator.jdt.metamodel.javamodel.operators.OperatorsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assignment Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class AssignmentOperatorImpl extends OperatorImpl implements AssignmentOperator {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AssignmentOperatorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return OperatorsPackage.Literals.ASSIGNMENT_OPERATOR;
    }

} //AssignmentOperatorImpl
