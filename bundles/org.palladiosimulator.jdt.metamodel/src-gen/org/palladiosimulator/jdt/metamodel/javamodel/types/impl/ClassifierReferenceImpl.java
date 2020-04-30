/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.types.impl;

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

import org.palladiosimulator.jdt.metamodel.javamodel.generics.GenericsPackage;
import org.palladiosimulator.jdt.metamodel.javamodel.generics.TypeArgument;
import org.palladiosimulator.jdt.metamodel.javamodel.generics.TypeArgumentable;

import org.palladiosimulator.jdt.metamodel.javamodel.types.ClassifierReference;
import org.palladiosimulator.jdt.metamodel.javamodel.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classifier Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.types.impl.ClassifierReferenceImpl#getTypeArguments <em>Type Arguments</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.types.impl.ClassifierReferenceImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassifierReferenceImpl extends TypeReferenceImpl implements ClassifierReference {
    /**
     * The cached value of the '{@link #getTypeArguments() <em>Type Arguments</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTypeArguments()
     * @generated
     * @ordered
     */
    protected EList<TypeArgument> typeArguments;

    /**
     * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTarget()
     * @generated
     * @ordered
     */
    protected Classifier target;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ClassifierReferenceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TypesPackage.Literals.CLASSIFIER_REFERENCE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<TypeArgument> getTypeArguments() {
        if (typeArguments == null) {
            typeArguments = new EObjectContainmentEList<TypeArgument>(TypeArgument.class, this,
                    TypesPackage.CLASSIFIER_REFERENCE__TYPE_ARGUMENTS);
        }
        return typeArguments;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Classifier getTarget() {
        if (target != null && target.eIsProxy()) {
            InternalEObject oldTarget = (InternalEObject) target;
            target = (Classifier) eResolveProxy(oldTarget);
            if (target != oldTarget) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesPackage.CLASSIFIER_REFERENCE__TARGET,
                            oldTarget, target));
            }
        }
        return target;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Classifier basicGetTarget() {
        return target;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTarget(Classifier newTarget) {
        Classifier oldTarget = target;
        target = newTarget;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.CLASSIFIER_REFERENCE__TARGET, oldTarget,
                    target));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case TypesPackage.CLASSIFIER_REFERENCE__TYPE_ARGUMENTS:
            return ((InternalEList<?>) getTypeArguments()).basicRemove(otherEnd, msgs);
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
        case TypesPackage.CLASSIFIER_REFERENCE__TYPE_ARGUMENTS:
            return getTypeArguments();
        case TypesPackage.CLASSIFIER_REFERENCE__TARGET:
            if (resolve)
                return getTarget();
            return basicGetTarget();
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
        case TypesPackage.CLASSIFIER_REFERENCE__TYPE_ARGUMENTS:
            getTypeArguments().clear();
            getTypeArguments().addAll((Collection<? extends TypeArgument>) newValue);
            return;
        case TypesPackage.CLASSIFIER_REFERENCE__TARGET:
            setTarget((Classifier) newValue);
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
        case TypesPackage.CLASSIFIER_REFERENCE__TYPE_ARGUMENTS:
            getTypeArguments().clear();
            return;
        case TypesPackage.CLASSIFIER_REFERENCE__TARGET:
            setTarget((Classifier) null);
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
        case TypesPackage.CLASSIFIER_REFERENCE__TYPE_ARGUMENTS:
            return typeArguments != null && !typeArguments.isEmpty();
        case TypesPackage.CLASSIFIER_REFERENCE__TARGET:
            return target != null;
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
        if (baseClass == TypeArgumentable.class) {
            switch (derivedFeatureID) {
            case TypesPackage.CLASSIFIER_REFERENCE__TYPE_ARGUMENTS:
                return GenericsPackage.TYPE_ARGUMENTABLE__TYPE_ARGUMENTS;
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
        if (baseClass == TypeArgumentable.class) {
            switch (baseFeatureID) {
            case GenericsPackage.TYPE_ARGUMENTABLE__TYPE_ARGUMENTS:
                return TypesPackage.CLASSIFIER_REFERENCE__TYPE_ARGUMENTS;
            default:
                return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //ClassifierReferenceImpl
