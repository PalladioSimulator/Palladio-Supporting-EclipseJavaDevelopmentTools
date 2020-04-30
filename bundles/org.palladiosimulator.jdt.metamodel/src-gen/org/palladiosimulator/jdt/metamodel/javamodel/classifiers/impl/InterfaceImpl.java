/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Classifier;
import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.ClassifiersPackage;
import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.ConcreteClassifier;
import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Interface;

import org.palladiosimulator.jdt.metamodel.javamodel.types.TypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.InterfaceImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.InterfaceImpl#getDefaultExtends <em>Default Extends</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceImpl extends ConcreteClassifierImpl implements Interface {
    /**
     * The cached value of the '{@link #getExtends() <em>Extends</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExtends()
     * @generated
     * @ordered
     */
    protected EList<TypeReference> extends_;

    /**
     * The cached value of the '{@link #getDefaultExtends() <em>Default Extends</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDefaultExtends()
     * @generated
     * @ordered
     */
    protected EList<TypeReference> defaultExtends;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected InterfaceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ClassifiersPackage.Literals.INTERFACE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<TypeReference> getExtends() {
        if (extends_ == null) {
            extends_ = new EObjectContainmentEList<TypeReference>(TypeReference.class, this,
                    ClassifiersPackage.INTERFACE__EXTENDS);
        }
        return extends_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<TypeReference> getDefaultExtends() {
        if (defaultExtends == null) {
            defaultExtends = new EObjectContainmentEList<TypeReference>(TypeReference.class, this,
                    ClassifiersPackage.INTERFACE__DEFAULT_EXTENDS);
        }
        return defaultExtends;
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
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case ClassifiersPackage.INTERFACE__EXTENDS:
            return ((InternalEList<?>) getExtends()).basicRemove(otherEnd, msgs);
        case ClassifiersPackage.INTERFACE__DEFAULT_EXTENDS:
            return ((InternalEList<?>) getDefaultExtends()).basicRemove(otherEnd, msgs);
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
        case ClassifiersPackage.INTERFACE__EXTENDS:
            return getExtends();
        case ClassifiersPackage.INTERFACE__DEFAULT_EXTENDS:
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
        case ClassifiersPackage.INTERFACE__EXTENDS:
            getExtends().clear();
            getExtends().addAll((Collection<? extends TypeReference>) newValue);
            return;
        case ClassifiersPackage.INTERFACE__DEFAULT_EXTENDS:
            getDefaultExtends().clear();
            getDefaultExtends().addAll((Collection<? extends TypeReference>) newValue);
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
        case ClassifiersPackage.INTERFACE__EXTENDS:
            getExtends().clear();
            return;
        case ClassifiersPackage.INTERFACE__DEFAULT_EXTENDS:
            getDefaultExtends().clear();
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
        case ClassifiersPackage.INTERFACE__EXTENDS:
            return extends_ != null && !extends_.isEmpty();
        case ClassifiersPackage.INTERFACE__DEFAULT_EXTENDS:
            return defaultExtends != null && !defaultExtends.isEmpty();
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
    public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
        if (baseClass == Classifier.class) {
            switch (baseOperationID) {
            case ClassifiersPackage.CLASSIFIER___GET_ALL_SUPER_CLASSIFIERS:
                return ClassifiersPackage.INTERFACE___GET_ALL_SUPER_CLASSIFIERS;
            default:
                return super.eDerivedOperationID(baseOperationID, baseClass);
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
        case ClassifiersPackage.INTERFACE___GET_ALL_SUPER_CLASSIFIERS:
            return getAllSuperClassifiers();
        default:
            return super.eInvoke(operationID, arguments);
        }
    }

} //InterfaceImpl
