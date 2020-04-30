/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.jdt.metamodel.javamodel.expressions.AndExpressionChild;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExpressionsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>And Expression Child</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class AndExpressionChildImpl extends ExclusiveOrExpressionChildImpl implements AndExpressionChild {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AndExpressionChildImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExpressionsPackage.Literals.AND_EXPRESSION_CHILD;
    }

} //AndExpressionChildImpl
