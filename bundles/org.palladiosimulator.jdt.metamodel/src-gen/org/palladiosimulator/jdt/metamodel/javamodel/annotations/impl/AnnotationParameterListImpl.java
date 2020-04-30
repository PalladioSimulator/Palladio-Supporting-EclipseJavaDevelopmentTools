/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.annotations.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationAttributeSetting;
import org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationParameterList;
import org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation Parameter List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.annotations.impl.AnnotationParameterListImpl#getSettings <em>Settings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnotationParameterListImpl extends AnnotationParameterImpl implements AnnotationParameterList {
    /**
     * The cached value of the '{@link #getSettings() <em>Settings</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSettings()
     * @generated
     * @ordered
     */
    protected EList<AnnotationAttributeSetting> settings;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AnnotationParameterListImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AnnotationsPackage.Literals.ANNOTATION_PARAMETER_LIST;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<AnnotationAttributeSetting> getSettings() {
        if (settings == null) {
            settings = new EObjectContainmentEList<AnnotationAttributeSetting>(AnnotationAttributeSetting.class, this,
                    AnnotationsPackage.ANNOTATION_PARAMETER_LIST__SETTINGS);
        }
        return settings;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case AnnotationsPackage.ANNOTATION_PARAMETER_LIST__SETTINGS:
            return ((InternalEList<?>) getSettings()).basicRemove(otherEnd, msgs);
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
        case AnnotationsPackage.ANNOTATION_PARAMETER_LIST__SETTINGS:
            return getSettings();
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
        case AnnotationsPackage.ANNOTATION_PARAMETER_LIST__SETTINGS:
            getSettings().clear();
            getSettings().addAll((Collection<? extends AnnotationAttributeSetting>) newValue);
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
        case AnnotationsPackage.ANNOTATION_PARAMETER_LIST__SETTINGS:
            getSettings().clear();
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
        case AnnotationsPackage.ANNOTATION_PARAMETER_LIST__SETTINGS:
            return settings != null && !settings.isEmpty();
        default:
            return super.eIsSet(featureID);
        }
    }

} //AnnotationParameterListImpl
