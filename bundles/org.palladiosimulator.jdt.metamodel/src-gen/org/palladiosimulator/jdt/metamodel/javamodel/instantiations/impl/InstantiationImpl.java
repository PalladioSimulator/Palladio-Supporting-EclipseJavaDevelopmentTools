/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.instantiations.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.palladiosimulator.jdt.metamodel.javamodel.expressions.Expression;

import org.palladiosimulator.jdt.metamodel.javamodel.instantiations.Instantiation;
import org.palladiosimulator.jdt.metamodel.javamodel.instantiations.InstantiationsPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.references.Argumentable;
import org.palladiosimulator.jdt.metamodel.javamodel.references.ReferencesPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.references.impl.ReferenceImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.types.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instantiation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.instantiations.impl.InstantiationImpl#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class InstantiationImpl extends ReferenceImpl implements Instantiation {
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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected InstantiationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return InstantiationsPackage.Literals.INSTANTIATION;
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
                    InstantiationsPackage.INSTANTIATION__ARGUMENTS);
        }
        return arguments;
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
        case InstantiationsPackage.INSTANTIATION__ARGUMENTS:
            return ((InternalEList<?>) getArguments()).basicRemove(otherEnd, msgs);
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
        case InstantiationsPackage.INSTANTIATION__ARGUMENTS:
            return getArguments();
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
        case InstantiationsPackage.INSTANTIATION__ARGUMENTS:
            getArguments().clear();
            getArguments().addAll((Collection<? extends Expression>) newValue);
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
        case InstantiationsPackage.INSTANTIATION__ARGUMENTS:
            getArguments().clear();
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
        case InstantiationsPackage.INSTANTIATION__ARGUMENTS:
            return arguments != null && !arguments.isEmpty();
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
            case InstantiationsPackage.INSTANTIATION__ARGUMENTS:
                return ReferencesPackage.ARGUMENTABLE__ARGUMENTS;
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
                return InstantiationsPackage.INSTANTIATION__ARGUMENTS;
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
                return InstantiationsPackage.INSTANTIATION___GET_ARGUMENT_TYPES;
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
        case InstantiationsPackage.INSTANTIATION___GET_ARGUMENT_TYPES:
            return getArgumentTypes();
        default:
            return super.eInvoke(operationID, arguments);
        }
    }

} //InstantiationImpl
