/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.references.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.palladiosimulator.jdt.metamodel.javamodel.references.PackageReference;
import org.palladiosimulator.jdt.metamodel.javamodel.references.ReferencesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.references.impl.PackageReferenceImpl#getSubpackages <em>Subpackages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageReferenceImpl extends ReferenceableElementImpl implements PackageReference {
    /**
     * The cached value of the '{@link #getSubpackages() <em>Subpackages</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubpackages()
     * @generated
     * @ordered
     */
    protected EList<PackageReference> subpackages;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PackageReferenceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ReferencesPackage.Literals.PACKAGE_REFERENCE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<PackageReference> getSubpackages() {
        if (subpackages == null) {
            subpackages = new EObjectContainmentEList<PackageReference>(PackageReference.class, this,
                    ReferencesPackage.PACKAGE_REFERENCE__SUBPACKAGES);
        }
        return subpackages;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case ReferencesPackage.PACKAGE_REFERENCE__SUBPACKAGES:
            return ((InternalEList<?>) getSubpackages()).basicRemove(otherEnd, msgs);
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
        case ReferencesPackage.PACKAGE_REFERENCE__SUBPACKAGES:
            return getSubpackages();
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
        case ReferencesPackage.PACKAGE_REFERENCE__SUBPACKAGES:
            getSubpackages().clear();
            getSubpackages().addAll((Collection<? extends PackageReference>) newValue);
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
        case ReferencesPackage.PACKAGE_REFERENCE__SUBPACKAGES:
            getSubpackages().clear();
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
        case ReferencesPackage.PACKAGE_REFERENCE__SUBPACKAGES:
            return subpackages != null && !subpackages.isEmpty();
        default:
            return super.eIsSet(featureID);
        }
    }

} //PackageReferenceImpl
