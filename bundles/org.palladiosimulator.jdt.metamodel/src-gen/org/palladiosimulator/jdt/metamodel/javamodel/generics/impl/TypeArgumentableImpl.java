/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.generics.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.impl.CommentableImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.generics.GenericsPackage;
import org.palladiosimulator.jdt.metamodel.javamodel.generics.TypeArgument;
import org.palladiosimulator.jdt.metamodel.javamodel.generics.TypeArgumentable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Argumentable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.generics.impl.TypeArgumentableImpl#getTypeArguments <em>Type Arguments</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TypeArgumentableImpl extends CommentableImpl implements TypeArgumentable {
    /**
     * The cached value of the '{@link #getTypeArguments() <em>Type Arguments</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTypeArguments()
     * @generated
     * @ordered
     */
    protected EList<TypeArgument> typeArguments;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TypeArgumentableImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return GenericsPackage.Literals.TYPE_ARGUMENTABLE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<TypeArgument> getTypeArguments() {
        if (typeArguments == null) {
            typeArguments = new EObjectContainmentEList<TypeArgument>(TypeArgument.class, this,
                    GenericsPackage.TYPE_ARGUMENTABLE__TYPE_ARGUMENTS);
        }
        return typeArguments;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case GenericsPackage.TYPE_ARGUMENTABLE__TYPE_ARGUMENTS:
            return ((InternalEList<?>) getTypeArguments()).basicRemove(otherEnd, msgs);
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
        case GenericsPackage.TYPE_ARGUMENTABLE__TYPE_ARGUMENTS:
            return getTypeArguments();
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
        case GenericsPackage.TYPE_ARGUMENTABLE__TYPE_ARGUMENTS:
            getTypeArguments().clear();
            getTypeArguments().addAll((Collection<? extends TypeArgument>) newValue);
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
        case GenericsPackage.TYPE_ARGUMENTABLE__TYPE_ARGUMENTS:
            getTypeArguments().clear();
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
        case GenericsPackage.TYPE_ARGUMENTABLE__TYPE_ARGUMENTS:
            return typeArguments != null && !typeArguments.isEmpty();
        default:
            return super.eIsSet(featureID);
        }
    }

} //TypeArgumentableImpl
