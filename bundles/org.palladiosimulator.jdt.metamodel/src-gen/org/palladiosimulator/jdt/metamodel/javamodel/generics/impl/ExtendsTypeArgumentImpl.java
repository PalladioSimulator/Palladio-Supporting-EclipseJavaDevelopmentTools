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

import org.palladiosimulator.jdt.metamodel.javamodel.generics.ExtendsTypeArgument;
import org.palladiosimulator.jdt.metamodel.javamodel.generics.GenericsPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.types.TypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extends Type Argument</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.generics.impl.ExtendsTypeArgumentImpl#getExtendTypes <em>Extend Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtendsTypeArgumentImpl extends TypeArgumentImpl implements ExtendsTypeArgument {
    /**
     * The cached value of the '{@link #getExtendTypes() <em>Extend Types</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExtendTypes()
     * @generated
     * @ordered
     */
    protected EList<TypeReference> extendTypes;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExtendsTypeArgumentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return GenericsPackage.Literals.EXTENDS_TYPE_ARGUMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<TypeReference> getExtendTypes() {
        if (extendTypes == null) {
            extendTypes = new EObjectContainmentEList<TypeReference>(TypeReference.class, this,
                    GenericsPackage.EXTENDS_TYPE_ARGUMENT__EXTEND_TYPES);
        }
        return extendTypes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case GenericsPackage.EXTENDS_TYPE_ARGUMENT__EXTEND_TYPES:
            return ((InternalEList<?>) getExtendTypes()).basicRemove(otherEnd, msgs);
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
        case GenericsPackage.EXTENDS_TYPE_ARGUMENT__EXTEND_TYPES:
            return getExtendTypes();
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
        case GenericsPackage.EXTENDS_TYPE_ARGUMENT__EXTEND_TYPES:
            getExtendTypes().clear();
            getExtendTypes().addAll((Collection<? extends TypeReference>) newValue);
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
        case GenericsPackage.EXTENDS_TYPE_ARGUMENT__EXTEND_TYPES:
            getExtendTypes().clear();
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
        case GenericsPackage.EXTENDS_TYPE_ARGUMENT__EXTEND_TYPES:
            return extendTypes != null && !extendTypes.isEmpty();
        default:
            return super.eIsSet(featureID);
        }
    }

} //ExtendsTypeArgumentImpl
