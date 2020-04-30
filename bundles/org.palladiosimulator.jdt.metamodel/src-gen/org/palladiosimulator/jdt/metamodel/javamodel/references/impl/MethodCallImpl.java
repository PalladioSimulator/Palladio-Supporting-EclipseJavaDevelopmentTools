/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.references.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.palladiosimulator.jdt.metamodel.javamodel.expressions.Expression;

import org.palladiosimulator.jdt.metamodel.javamodel.generics.CallTypeArgumentable;
import org.palladiosimulator.jdt.metamodel.javamodel.generics.GenericsPackage;
import org.palladiosimulator.jdt.metamodel.javamodel.generics.TypeArgument;

import org.palladiosimulator.jdt.metamodel.javamodel.references.Argumentable;
import org.palladiosimulator.jdt.metamodel.javamodel.references.MethodCall;
import org.palladiosimulator.jdt.metamodel.javamodel.references.ReferencesPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.types.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.references.impl.MethodCallImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.references.impl.MethodCallImpl#getCallTypeArguments <em>Call Type Arguments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodCallImpl extends ElementReferenceImpl implements MethodCall {
    /**
     * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getArguments()
     * @generated
     * @ordered
     */
    protected EList<Expression> arguments;

    /**
     * The cached value of the '{@link #getCallTypeArguments() <em>Call Type Arguments</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCallTypeArguments()
     * @generated
     * @ordered
     */
    protected EList<TypeArgument> callTypeArguments;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MethodCallImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ReferencesPackage.Literals.METHOD_CALL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Expression> getArguments() {
        if (arguments == null) {
            arguments = new EObjectContainmentEList<Expression>(Expression.class, this,
                    ReferencesPackage.METHOD_CALL__ARGUMENTS);
        }
        return arguments;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<TypeArgument> getCallTypeArguments() {
        if (callTypeArguments == null) {
            callTypeArguments = new EObjectContainmentEList<TypeArgument>(TypeArgument.class, this,
                    ReferencesPackage.METHOD_CALL__CALL_TYPE_ARGUMENTS);
        }
        return callTypeArguments;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Type> getArgumentTypes() {
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case ReferencesPackage.METHOD_CALL__ARGUMENTS:
            return ((InternalEList<?>) getArguments()).basicRemove(otherEnd, msgs);
        case ReferencesPackage.METHOD_CALL__CALL_TYPE_ARGUMENTS:
            return ((InternalEList<?>) getCallTypeArguments()).basicRemove(otherEnd, msgs);
        default:
            return super.eInverseRemove(otherEnd, featureID, msgs);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case ReferencesPackage.METHOD_CALL__ARGUMENTS:
            return getArguments();
        case ReferencesPackage.METHOD_CALL__CALL_TYPE_ARGUMENTS:
            return getCallTypeArguments();
        default:
            return super.eGet(featureID, resolve, coreType);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case ReferencesPackage.METHOD_CALL__ARGUMENTS:
            getArguments().clear();
            getArguments().addAll((Collection<? extends Expression>) newValue);
            return;
        case ReferencesPackage.METHOD_CALL__CALL_TYPE_ARGUMENTS:
            getCallTypeArguments().clear();
            getCallTypeArguments().addAll((Collection<? extends TypeArgument>) newValue);
            return;
        default:
            super.eSet(featureID, newValue);
            return;
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
        case ReferencesPackage.METHOD_CALL__ARGUMENTS:
            getArguments().clear();
            return;
        case ReferencesPackage.METHOD_CALL__CALL_TYPE_ARGUMENTS:
            getCallTypeArguments().clear();
            return;
        default:
            super.eUnset(featureID);
            return;
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
        case ReferencesPackage.METHOD_CALL__ARGUMENTS:
            return arguments != null && !arguments.isEmpty();
        case ReferencesPackage.METHOD_CALL__CALL_TYPE_ARGUMENTS:
            return callTypeArguments != null && !callTypeArguments.isEmpty();
        default:
            return super.eIsSet(featureID);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == Argumentable.class) {
            switch (derivedFeatureID) {
            case ReferencesPackage.METHOD_CALL__ARGUMENTS:
                return ReferencesPackage.ARGUMENTABLE__ARGUMENTS;
            default:
                return -1;
            }
        }
        if (baseClass == CallTypeArgumentable.class) {
            switch (derivedFeatureID) {
            case ReferencesPackage.METHOD_CALL__CALL_TYPE_ARGUMENTS:
                return GenericsPackage.CALL_TYPE_ARGUMENTABLE__CALL_TYPE_ARGUMENTS;
            default:
                return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == Argumentable.class) {
            switch (baseFeatureID) {
            case ReferencesPackage.ARGUMENTABLE__ARGUMENTS:
                return ReferencesPackage.METHOD_CALL__ARGUMENTS;
            default:
                return -1;
            }
        }
        if (baseClass == CallTypeArgumentable.class) {
            switch (baseFeatureID) {
            case GenericsPackage.CALL_TYPE_ARGUMENTABLE__CALL_TYPE_ARGUMENTS:
                return ReferencesPackage.METHOD_CALL__CALL_TYPE_ARGUMENTS;
            default:
                return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
        if (baseClass == Argumentable.class) {
            switch (baseOperationID) {
            case ReferencesPackage.ARGUMENTABLE___GET_ARGUMENT_TYPES:
                return ReferencesPackage.METHOD_CALL___GET_ARGUMENT_TYPES;
            default:
                return -1;
            }
        }
        if (baseClass == CallTypeArgumentable.class) {
            switch (baseOperationID) {
            default:
                return -1;
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
        case ReferencesPackage.METHOD_CALL___GET_ARGUMENT_TYPES:
            return getArgumentTypes();
        default:
            return super.eInvoke(operationID, arguments);
        }
    }

} //MethodCallImpl
