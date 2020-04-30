/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.operators.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.jdt.metamodel.javamodel.operators.NotEqual;
import org.palladiosimulator.jdt.metamodel.javamodel.operators.OperatorsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Not Equal</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class NotEqualImpl extends EqualityOperatorImpl implements NotEqual {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected NotEqualImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return OperatorsPackage.Literals.NOT_EQUAL;
    }

} //NotEqualImpl
