/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.annotations.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationAttributeSetting;
import org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationValue;
import org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationsPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.impl.CommentableImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.members.InterfaceMethod;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation Attribute Setting</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.annotations.impl.AnnotationAttributeSettingImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.annotations.impl.AnnotationAttributeSettingImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnotationAttributeSettingImpl extends CommentableImpl implements AnnotationAttributeSetting {
    /**
     * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAttribute()
     * @generated
     * @ordered
     */
    protected InterfaceMethod attribute;

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
    protected AnnotationAttributeSettingImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AnnotationsPackage.Literals.ANNOTATION_ATTRIBUTE_SETTING;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public InterfaceMethod getAttribute() {
        if (attribute != null && attribute.eIsProxy()) {
            InternalEObject oldAttribute = (InternalEObject) attribute;
            attribute = (InterfaceMethod) eResolveProxy(oldAttribute);
            if (attribute != oldAttribute) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            AnnotationsPackage.ANNOTATION_ATTRIBUTE_SETTING__ATTRIBUTE, oldAttribute, attribute));
            }
        }
        return attribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InterfaceMethod basicGetAttribute() {
        return attribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAttribute(InterfaceMethod newAttribute) {
        InterfaceMethod oldAttribute = attribute;
        attribute = newAttribute;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    AnnotationsPackage.ANNOTATION_ATTRIBUTE_SETTING__ATTRIBUTE, oldAttribute, attribute));
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
                    AnnotationsPackage.ANNOTATION_ATTRIBUTE_SETTING__VALUE, oldValue, newValue);
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
                        EOPPOSITE_FEATURE_BASE - AnnotationsPackage.ANNOTATION_ATTRIBUTE_SETTING__VALUE, null, msgs);
            if (newValue != null)
                msgs = ((InternalEObject) newValue).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - AnnotationsPackage.ANNOTATION_ATTRIBUTE_SETTING__VALUE, null, msgs);
            msgs = basicSetValue(newValue, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    AnnotationsPackage.ANNOTATION_ATTRIBUTE_SETTING__VALUE, newValue, newValue));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case AnnotationsPackage.ANNOTATION_ATTRIBUTE_SETTING__VALUE:
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
        case AnnotationsPackage.ANNOTATION_ATTRIBUTE_SETTING__ATTRIBUTE:
            if (resolve)
                return getAttribute();
            return basicGetAttribute();
        case AnnotationsPackage.ANNOTATION_ATTRIBUTE_SETTING__VALUE:
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
        case AnnotationsPackage.ANNOTATION_ATTRIBUTE_SETTING__ATTRIBUTE:
            setAttribute((InterfaceMethod) newValue);
            return;
        case AnnotationsPackage.ANNOTATION_ATTRIBUTE_SETTING__VALUE:
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
        case AnnotationsPackage.ANNOTATION_ATTRIBUTE_SETTING__ATTRIBUTE:
            setAttribute((InterfaceMethod) null);
            return;
        case AnnotationsPackage.ANNOTATION_ATTRIBUTE_SETTING__VALUE:
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
        case AnnotationsPackage.ANNOTATION_ATTRIBUTE_SETTING__ATTRIBUTE:
            return attribute != null;
        case AnnotationsPackage.ANNOTATION_ATTRIBUTE_SETTING__VALUE:
            return value != null;
        default:
            return super.eIsSet(featureID);
        }
    }

} //AnnotationAttributeSettingImpl
