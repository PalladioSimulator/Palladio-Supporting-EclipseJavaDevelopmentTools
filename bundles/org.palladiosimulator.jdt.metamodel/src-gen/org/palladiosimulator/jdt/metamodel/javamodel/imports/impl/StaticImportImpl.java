/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.imports.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.imports.ImportsPackage;
import org.palladiosimulator.jdt.metamodel.javamodel.imports.StaticImport;

import org.palladiosimulator.jdt.metamodel.javamodel.modifiers.Static;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Static Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.imports.impl.StaticImportImpl#getStatic <em>Static</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class StaticImportImpl extends ImportImpl implements StaticImport {
    /**
     * The cached value of the '{@link #getStatic() <em>Static</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStatic()
     * @generated
     * @ordered
     */
    protected Static static_;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected StaticImportImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ImportsPackage.Literals.STATIC_IMPORT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Static getStatic() {
        return static_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetStatic(Static newStatic, NotificationChain msgs) {
        Static oldStatic = static_;
        static_ = newStatic;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    ImportsPackage.STATIC_IMPORT__STATIC, oldStatic, newStatic);
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
    public void setStatic(Static newStatic) {
        if (newStatic != static_) {
            NotificationChain msgs = null;
            if (static_ != null)
                msgs = ((InternalEObject) static_).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - ImportsPackage.STATIC_IMPORT__STATIC, null, msgs);
            if (newStatic != null)
                msgs = ((InternalEObject) newStatic).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - ImportsPackage.STATIC_IMPORT__STATIC, null, msgs);
            msgs = basicSetStatic(newStatic, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImportsPackage.STATIC_IMPORT__STATIC, newStatic,
                    newStatic));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case ImportsPackage.STATIC_IMPORT__STATIC:
            return basicSetStatic(null, msgs);
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
        case ImportsPackage.STATIC_IMPORT__STATIC:
            return getStatic();
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
        case ImportsPackage.STATIC_IMPORT__STATIC:
            setStatic((Static) newValue);
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
        case ImportsPackage.STATIC_IMPORT__STATIC:
            setStatic((Static) null);
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
        case ImportsPackage.STATIC_IMPORT__STATIC:
            return static_ != null;
        default:
            return super.eIsSet(featureID);
        }
    }

} //StaticImportImpl
