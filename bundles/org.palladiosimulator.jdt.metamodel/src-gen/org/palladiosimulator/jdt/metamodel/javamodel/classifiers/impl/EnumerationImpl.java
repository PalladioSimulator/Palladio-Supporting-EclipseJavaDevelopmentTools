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
import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Enumeration;
import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Implementor;

import org.palladiosimulator.jdt.metamodel.javamodel.members.EnumConstant;

import org.palladiosimulator.jdt.metamodel.javamodel.types.TypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.EnumerationImpl#getImplements <em>Implements</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.EnumerationImpl#getConstants <em>Constants</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumerationImpl extends ConcreteClassifierImpl implements Enumeration {
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
     * The cached value of the '{@link #getConstants() <em>Constants</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConstants()
     * @generated
     * @ordered
     */
    protected EList<EnumConstant> constants;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EnumerationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ClassifiersPackage.Literals.ENUMERATION;
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
                    ClassifiersPackage.ENUMERATION__IMPLEMENTS);
        }
        return implements_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<EnumConstant> getConstants() {
        if (constants == null) {
            constants = new EObjectContainmentEList<EnumConstant>(EnumConstant.class, this,
                    ClassifiersPackage.ENUMERATION__CONSTANTS);
        }
        return constants;
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
    public EnumConstant getContainedConstant(final String name) {
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
        case ClassifiersPackage.ENUMERATION__IMPLEMENTS:
            return ((InternalEList<?>) getImplements()).basicRemove(otherEnd, msgs);
        case ClassifiersPackage.ENUMERATION__CONSTANTS:
            return ((InternalEList<?>) getConstants()).basicRemove(otherEnd, msgs);
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
        case ClassifiersPackage.ENUMERATION__IMPLEMENTS:
            return getImplements();
        case ClassifiersPackage.ENUMERATION__CONSTANTS:
            return getConstants();
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
        case ClassifiersPackage.ENUMERATION__IMPLEMENTS:
            getImplements().clear();
            getImplements().addAll((Collection<? extends TypeReference>) newValue);
            return;
        case ClassifiersPackage.ENUMERATION__CONSTANTS:
            getConstants().clear();
            getConstants().addAll((Collection<? extends EnumConstant>) newValue);
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
        case ClassifiersPackage.ENUMERATION__IMPLEMENTS:
            getImplements().clear();
            return;
        case ClassifiersPackage.ENUMERATION__CONSTANTS:
            getConstants().clear();
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
        case ClassifiersPackage.ENUMERATION__IMPLEMENTS:
            return implements_ != null && !implements_.isEmpty();
        case ClassifiersPackage.ENUMERATION__CONSTANTS:
            return constants != null && !constants.isEmpty();
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
            case ClassifiersPackage.ENUMERATION__IMPLEMENTS:
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
                return ClassifiersPackage.ENUMERATION__IMPLEMENTS;
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
                return ClassifiersPackage.ENUMERATION___GET_ALL_SUPER_CLASSIFIERS;
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
        case ClassifiersPackage.ENUMERATION___GET_ALL_SUPER_CLASSIFIERS:
            return getAllSuperClassifiers();
        case ClassifiersPackage.ENUMERATION___GET_CONTAINED_CONSTANT__STRING:
            return getContainedConstant((String) arguments.get(0));
        default:
            return super.eInvoke(operationID, arguments);
        }
    }

} //EnumerationImpl
