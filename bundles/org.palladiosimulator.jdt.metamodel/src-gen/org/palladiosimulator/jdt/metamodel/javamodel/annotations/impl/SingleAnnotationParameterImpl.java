/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.annotations.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationValue;
import org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationsPackage;
import org.palladiosimulator.jdt.metamodel.javamodel.annotations.SingleAnnotationParameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Annotation Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.annotations.impl.SingleAnnotationParameterImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SingleAnnotationParameterImpl extends AnnotationParameterImpl implements SingleAnnotationParameter {
    /**
     * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected AnnotationValue value;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SingleAnnotationParameterImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AnnotationsPackage.Literals.SINGLE_ANNOTATION_PARAMETER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AnnotationValue getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetValue(AnnotationValue newValue, NotificationChain msgs) {
        AnnotationValue oldValue = value;
        value = newValue;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    AnnotationsPackage.SINGLE_ANNOTATION_PARAMETER__VALUE, oldValue, newValue);
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
    public void setValue(AnnotationValue newValue) {
        if (newValue != value) {
            NotificationChain msgs = null;
            if (value != null)
                msgs = ((InternalEObject) value).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - AnnotationsPackage.SINGLE_ANNOTATION_PARAMETER__VALUE, null, msgs);
            if (newValue != null)
                msgs = ((InternalEObject) newValue).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - AnnotationsPackage.SINGLE_ANNOTATION_PARAMETER__VALUE, null, msgs);
            msgs = basicSetValue(newValue, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsPackage.SINGLE_ANNOTATION_PARAMETER__VALUE,
                    newValue, newValue));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case AnnotationsPackage.SINGLE_ANNOTATION_PARAMETER__VALUE:
            return basicSetValue(null, msgs);
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
        case AnnotationsPackage.SINGLE_ANNOTATION_PARAMETER__VALUE:
            return getValue();
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
        case AnnotationsPackage.SINGLE_ANNOTATION_PARAMETER__VALUE:
            setValue((AnnotationValue) newValue);
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
        case AnnotationsPackage.SINGLE_ANNOTATION_PARAMETER__VALUE:
            setValue((AnnotationValue) null);
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
        case AnnotationsPackage.SINGLE_ANNOTATION_PARAMETER__VALUE:
            return value != null;
        default:
            return super.eIsSet(featureID);
        }
    }

} //SingleAnnotationParameterImpl
