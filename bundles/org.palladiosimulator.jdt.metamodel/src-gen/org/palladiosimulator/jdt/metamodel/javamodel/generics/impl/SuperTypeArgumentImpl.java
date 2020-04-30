/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.generics.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.generics.GenericsPackage;
import org.palladiosimulator.jdt.metamodel.javamodel.generics.SuperTypeArgument;

import org.palladiosimulator.jdt.metamodel.javamodel.types.TypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Super Type Argument</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.generics.impl.SuperTypeArgumentImpl#getSuperType <em>Super Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SuperTypeArgumentImpl extends TypeArgumentImpl implements SuperTypeArgument {
    /**
     * The cached value of the '{@link #getSuperType() <em>Super Type</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSuperType()
     * @generated
     * @ordered
     */
    protected TypeReference superType;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SuperTypeArgumentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return GenericsPackage.Literals.SUPER_TYPE_ARGUMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TypeReference getSuperType() {
        return superType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSuperType(TypeReference newSuperType, NotificationChain msgs) {
        TypeReference oldSuperType = superType;
        superType = newSuperType;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    GenericsPackage.SUPER_TYPE_ARGUMENT__SUPER_TYPE, oldSuperType, newSuperType);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSuperType(TypeReference newSuperType) {
        if (newSuperType != superType) {
            NotificationChain msgs = null;
            if (superType != null)
                msgs = ((InternalEObject) superType).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - GenericsPackage.SUPER_TYPE_ARGUMENT__SUPER_TYPE, null, msgs);
            if (newSuperType != null)
                msgs = ((InternalEObject) newSuperType).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - GenericsPackage.SUPER_TYPE_ARGUMENT__SUPER_TYPE, null, msgs);
            msgs = basicSetSuperType(newSuperType, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GenericsPackage.SUPER_TYPE_ARGUMENT__SUPER_TYPE,
                    newSuperType, newSuperType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case GenericsPackage.SUPER_TYPE_ARGUMENT__SUPER_TYPE:
            return basicSetSuperType(null, msgs);
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
        case GenericsPackage.SUPER_TYPE_ARGUMENT__SUPER_TYPE:
            return getSuperType();
        default:
            return super.eGet(featureID, resolve, coreType);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case GenericsPackage.SUPER_TYPE_ARGUMENT__SUPER_TYPE:
            setSuperType((TypeReference) newValue);
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
        case GenericsPackage.SUPER_TYPE_ARGUMENT__SUPER_TYPE:
            setSuperType((TypeReference) null);
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
        case GenericsPackage.SUPER_TYPE_ARGUMENT__SUPER_TYPE:
            return superType != null;
        default:
            return super.eIsSet(featureID);
        }
    }

} //SuperTypeArgumentImpl
