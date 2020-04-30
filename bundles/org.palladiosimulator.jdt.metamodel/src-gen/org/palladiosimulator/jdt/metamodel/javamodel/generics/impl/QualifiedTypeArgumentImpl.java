/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.generics.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.generics.GenericsPackage;
import org.palladiosimulator.jdt.metamodel.javamodel.generics.QualifiedTypeArgument;

import org.palladiosimulator.jdt.metamodel.javamodel.types.TypeReference;
import org.palladiosimulator.jdt.metamodel.javamodel.types.TypedElement;
import org.palladiosimulator.jdt.metamodel.javamodel.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qualified Type Argument</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.generics.impl.QualifiedTypeArgumentImpl#getTypeReference <em>Type Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QualifiedTypeArgumentImpl extends TypeArgumentImpl implements QualifiedTypeArgument {
    /**
     * The cached value of the '{@link #getTypeReference() <em>Type Reference</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTypeReference()
     * @generated
     * @ordered
     */
    protected TypeReference typeReference;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected QualifiedTypeArgumentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return GenericsPackage.Literals.QUALIFIED_TYPE_ARGUMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TypeReference getTypeReference() {
        return typeReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTypeReference(TypeReference newTypeReference, NotificationChain msgs) {
        TypeReference oldTypeReference = typeReference;
        typeReference = newTypeReference;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    GenericsPackage.QUALIFIED_TYPE_ARGUMENT__TYPE_REFERENCE, oldTypeReference, newTypeReference);
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
    public void setTypeReference(TypeReference newTypeReference) {
        if (newTypeReference != typeReference) {
            NotificationChain msgs = null;
            if (typeReference != null)
                msgs = ((InternalEObject) typeReference).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - GenericsPackage.QUALIFIED_TYPE_ARGUMENT__TYPE_REFERENCE, null, msgs);
            if (newTypeReference != null)
                msgs = ((InternalEObject) newTypeReference).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - GenericsPackage.QUALIFIED_TYPE_ARGUMENT__TYPE_REFERENCE, null, msgs);
            msgs = basicSetTypeReference(newTypeReference, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    GenericsPackage.QUALIFIED_TYPE_ARGUMENT__TYPE_REFERENCE, newTypeReference, newTypeReference));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case GenericsPackage.QUALIFIED_TYPE_ARGUMENT__TYPE_REFERENCE:
            return basicSetTypeReference(null, msgs);
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
        case GenericsPackage.QUALIFIED_TYPE_ARGUMENT__TYPE_REFERENCE:
            return getTypeReference();
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
        case GenericsPackage.QUALIFIED_TYPE_ARGUMENT__TYPE_REFERENCE:
            setTypeReference((TypeReference) newValue);
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
        case GenericsPackage.QUALIFIED_TYPE_ARGUMENT__TYPE_REFERENCE:
            setTypeReference((TypeReference) null);
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
        case GenericsPackage.QUALIFIED_TYPE_ARGUMENT__TYPE_REFERENCE:
            return typeReference != null;
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
        if (baseClass == TypedElement.class) {
            switch (derivedFeatureID) {
            case GenericsPackage.QUALIFIED_TYPE_ARGUMENT__TYPE_REFERENCE:
                return TypesPackage.TYPED_ELEMENT__TYPE_REFERENCE;
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
        if (baseClass == TypedElement.class) {
            switch (baseFeatureID) {
            case TypesPackage.TYPED_ELEMENT__TYPE_REFERENCE:
                return GenericsPackage.QUALIFIED_TYPE_ARGUMENT__TYPE_REFERENCE;
            default:
                return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //QualifiedTypeArgumentImpl
