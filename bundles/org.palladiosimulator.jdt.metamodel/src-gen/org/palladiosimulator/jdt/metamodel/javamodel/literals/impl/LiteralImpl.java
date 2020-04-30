/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.literals.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.jdt.metamodel.javamodel.expressions.Expression;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExpressionsPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.PrimaryExpressionImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.literals.Literal;
import org.palladiosimulator.jdt.metamodel.javamodel.literals.LiteralsPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.types.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class LiteralImpl extends PrimaryExpressionImpl implements Literal {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LiteralImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return LiteralsPackage.Literals.LITERAL;
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
    public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
        if (baseClass == Expression.class) {
            switch (baseOperationID) {
            case ExpressionsPackage.EXPRESSION___GET_ONE_TYPE__BOOLEAN:
                return LiteralsPackage.LITERAL___GET_ONE_TYPE__BOOLEAN;
            default:
                return super.eDerivedOperationID(baseOperationID, baseClass);
            }
        }
        return super.eDerivedOperationID(baseOperationID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
        switch (operationID) {
        case LiteralsPackage.LITERAL___GET_ONE_TYPE__BOOLEAN:
            return getOneType((Boolean) arguments.get(0));
        default:
            return super.eInvoke(operationID, arguments);
        }
    }

} //LiteralImpl
