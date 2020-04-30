/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Classifier;
import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.ClassifiersPackage;
import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.ConcreteClassifier;
import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Implementor;

import org.palladiosimulator.jdt.metamodel.javamodel.types.PrimitiveType;
import org.palladiosimulator.jdt.metamodel.javamodel.types.TypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.ClassImpl#getImplements <em>Implements</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.ClassImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.ClassImpl#getDefaultExtends <em>Default Extends</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassImpl extends ConcreteClassifierImpl
        implements org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Class {
    /**
     * The cached value of the '{@link #getImplements() <em>Implements</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getImplements()
     * @generated
     * @ordered
     */
    protected EList<TypeReference> implements_;

    /**
     * The cached value of the '{@link #getExtends() <em>Extends</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExtends()
     * @generated
     * @ordered
     */
    protected TypeReference extends_;

    /**
     * The cached value of the '{@link #getDefaultExtends() <em>Default Extends</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDefaultExtends()
     * @generated
     * @ordered
     */
    protected TypeReference defaultExtends;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ClassImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ClassifiersPackage.Literals.CLASS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<TypeReference> getImplements() {
        if (implements_ == null) {
            implements_ = new EObjectContainmentEList<TypeReference>(TypeReference.class, this,
                    ClassifiersPackage.CLASS__IMPLEMENTS);
        }
        return implements_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TypeReference getExtends() {
        return extends_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetExtends(TypeReference newExtends, NotificationChain msgs) {
        TypeReference oldExtends = extends_;
        extends_ = newExtends;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    ClassifiersPackage.CLASS__EXTENDS, oldExtends, newExtends);
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
    public void setExtends(TypeReference newExtends) {
        if (newExtends != extends_) {
            NotificationChain msgs = null;
            if (extends_ != null)
                msgs = ((InternalEObject) extends_).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - ClassifiersPackage.CLASS__EXTENDS, null, msgs);
            if (newExtends != null)
                msgs = ((InternalEObject) newExtends).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - ClassifiersPackage.CLASS__EXTENDS, null, msgs);
            msgs = basicSetExtends(newExtends, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ClassifiersPackage.CLASS__EXTENDS, newExtends,
                    newExtends));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TypeReference getDefaultExtends() {
        return defaultExtends;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDefaultExtends(TypeReference newDefaultExtends, NotificationChain msgs) {
        TypeReference oldDefaultExtends = defaultExtends;
        defaultExtends = newDefaultExtends;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    ClassifiersPackage.CLASS__DEFAULT_EXTENDS, oldDefaultExtends, newDefaultExtends);
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
    public void setDefaultExtends(TypeReference newDefaultExtends) {
        if (newDefaultExtends != defaultExtends) {
            NotificationChain msgs = null;
            if (defaultExtends != null)
                msgs = ((InternalEObject) defaultExtends).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - ClassifiersPackage.CLASS__DEFAULT_EXTENDS, null, msgs);
            if (newDefaultExtends != null)
                msgs = ((InternalEObject) newDefaultExtends).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - ClassifiersPackage.CLASS__DEFAULT_EXTENDS, null, msgs);
            msgs = basicSetDefaultExtends(newDefaultExtends, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ClassifiersPackage.CLASS__DEFAULT_EXTENDS,
                    newDefaultExtends, newDefaultExtends));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<ConcreteClassifier> getAllSuperClassifiers() {
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Class getSuperClass() {
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PrimitiveType unWrapPrimitiveType() {
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case ClassifiersPackage.CLASS__IMPLEMENTS:
            return ((InternalEList<?>) getImplements()).basicRemove(otherEnd, msgs);
        case ClassifiersPackage.CLASS__EXTENDS:
            return basicSetExtends(null, msgs);
        case ClassifiersPackage.CLASS__DEFAULT_EXTENDS:
            return basicSetDefaultExtends(null, msgs);
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
        case ClassifiersPackage.CLASS__IMPLEMENTS:
            return getImplements();
        case ClassifiersPackage.CLASS__EXTENDS:
            return getExtends();
        case ClassifiersPackage.CLASS__DEFAULT_EXTENDS:
            return getDefaultExtends();
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
        case ClassifiersPackage.CLASS__IMPLEMENTS:
            getImplements().clear();
            getImplements().addAll((Collection<? extends TypeReference>) newValue);
            return;
        case ClassifiersPackage.CLASS__EXTENDS:
            setExtends((TypeReference) newValue);
            return;
        case ClassifiersPackage.CLASS__DEFAULT_EXTENDS:
            setDefaultExtends((TypeReference) newValue);
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
        case ClassifiersPackage.CLASS__IMPLEMENTS:
            getImplements().clear();
            return;
        case ClassifiersPackage.CLASS__EXTENDS:
            setExtends((TypeReference) null);
            return;
        case ClassifiersPackage.CLASS__DEFAULT_EXTENDS:
            setDefaultExtends((TypeReference) null);
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
        case ClassifiersPackage.CLASS__IMPLEMENTS:
            return implements_ != null && !implements_.isEmpty();
        case ClassifiersPackage.CLASS__EXTENDS:
            return extends_ != null;
        case ClassifiersPackage.CLASS__DEFAULT_EXTENDS:
            return defaultExtends != null;
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
        if (baseClass == Implementor.class) {
            switch (derivedFeatureID) {
            case ClassifiersPackage.CLASS__IMPLEMENTS:
                return ClassifiersPackage.IMPLEMENTOR__IMPLEMENTS;
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
        if (baseClass == Implementor.class) {
            switch (baseFeatureID) {
            case ClassifiersPackage.IMPLEMENTOR__IMPLEMENTS:
                return ClassifiersPackage.CLASS__IMPLEMENTS;
            default:
                return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
        if (baseClass == Classifier.class) {
            switch (baseOperationID) {
            case ClassifiersPackage.CLASSIFIER___GET_ALL_SUPER_CLASSIFIERS:
                return ClassifiersPackage.CLASS___GET_ALL_SUPER_CLASSIFIERS;
            default:
                return super.eDerivedOperationID(baseOperationID, baseClass);
            }
        }
        if (baseClass == Implementor.class) {
            switch (baseOperationID) {
            default:
                return -1;
            }
        }
        return super.eDerivedOperationID(baseOperationID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
        switch (operationID) {
        case ClassifiersPackage.CLASS___GET_ALL_SUPER_CLASSIFIERS:
            return getAllSuperClassifiers();
        case ClassifiersPackage.CLASS___GET_SUPER_CLASS:
            return getSuperClass();
        case ClassifiersPackage.CLASS___UN_WRAP_PRIMITIVE_TYPE:
            return unWrapPrimitiveType();
        default:
            return super.eInvoke(operationID, arguments);
        }
    }

} //ClassImpl
