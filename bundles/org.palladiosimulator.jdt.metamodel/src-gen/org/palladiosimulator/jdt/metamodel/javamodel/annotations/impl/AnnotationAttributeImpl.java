/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.annotations.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationAttribute;
import org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationsPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.expressions.Expression;

import org.palladiosimulator.jdt.metamodel.javamodel.members.impl.InterfaceMethodImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.annotations.impl.AnnotationAttributeImpl#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnotationAttributeImpl extends InterfaceMethodImpl implements AnnotationAttribute {
    /**
     * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDefaultValue()
     * @generated
     * @ordered
     */
    protected Expression defaultValue;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AnnotationAttributeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AnnotationsPackage.Literals.ANNOTATION_ATTRIBUTE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Expression getDefaultValue() {
        return defaultValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDefaultValue(Expression newDefaultValue, NotificationChain msgs) {
        Expression oldDefaultValue = defaultValue;
        defaultValue = newDefaultValue;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    AnnotationsPackage.ANNOTATION_ATTRIBUTE__DEFAULT_VALUE, oldDefaultValue, newDefaultValue);
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
    public void setDefaultValue(Expression newDefaultValue) {
        if (newDefaultValue != defaultValue) {
            NotificationChain msgs = null;
            if (defaultValue != null)
                msgs = ((InternalEObject) defaultValue).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - AnnotationsPackage.ANNOTATION_ATTRIBUTE__DEFAULT_VALUE, null, msgs);
            if (newDefaultValue != null)
                msgs = ((InternalEObject) newDefaultValue).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - AnnotationsPackage.ANNOTATION_ATTRIBUTE__DEFAULT_VALUE, null, msgs);
            msgs = basicSetDefaultValue(newDefaultValue, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    AnnotationsPackage.ANNOTATION_ATTRIBUTE__DEFAULT_VALUE, newDefaultValue, newDefaultValue));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case AnnotationsPackage.ANNOTATION_ATTRIBUTE__DEFAULT_VALUE:
            return basicSetDefaultValue(null, msgs);
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
        case AnnotationsPackage.ANNOTATION_ATTRIBUTE__DEFAULT_VALUE:
            return getDefaultValue();
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
        case AnnotationsPackage.ANNOTATION_ATTRIBUTE__DEFAULT_VALUE:
            setDefaultValue((Expression) newValue);
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
        case AnnotationsPackage.ANNOTATION_ATTRIBUTE__DEFAULT_VALUE:
            setDefaultValue((Expression) null);
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
        case AnnotationsPackage.ANNOTATION_ATTRIBUTE__DEFAULT_VALUE:
            return defaultValue != null;
        default:
            return super.eIsSet(featureID);
        }
    }

} //AnnotationAttributeImpl
