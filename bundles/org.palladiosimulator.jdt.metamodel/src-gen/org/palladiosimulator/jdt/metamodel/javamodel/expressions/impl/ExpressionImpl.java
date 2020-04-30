/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArrayInitializationValueImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.expressions.Expression;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExpressionsPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.types.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ExpressionImpl extends ArrayInitializationValueImpl implements Expression {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExpressionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExpressionsPackage.Literals.EXPRESSION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Type getType() {
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Type getAlternativeType() {
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Type getOneType(final boolean alternative) {
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public long getArrayDimension() {
        return 0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
        switch (operationID) {
        case ExpressionsPackage.EXPRESSION___GET_TYPE:
            return getType();
        case ExpressionsPackage.EXPRESSION___GET_ALTERNATIVE_TYPE:
            return getAlternativeType();
        case ExpressionsPackage.EXPRESSION___GET_ONE_TYPE__BOOLEAN:
            return getOneType((Boolean) arguments.get(0));
        case ExpressionsPackage.EXPRESSION___GET_ARRAY_DIMENSION:
            return getArrayDimension();
        default:
            return super.eInvoke(operationID, arguments);
        }
    }

} //ExpressionImpl
