/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.references.impl;

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

import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArraySelector;

import org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.PrimaryExpressionImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.generics.GenericsPackage;
import org.palladiosimulator.jdt.metamodel.javamodel.generics.TypeArgument;
import org.palladiosimulator.jdt.metamodel.javamodel.generics.TypeArgumentable;

import org.palladiosimulator.jdt.metamodel.javamodel.references.Reference;
import org.palladiosimulator.jdt.metamodel.javamodel.references.ReferencesPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.types.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.references.impl.ReferenceImpl#getTypeArguments <em>Type Arguments</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.references.impl.ReferenceImpl#getNext <em>Next</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.references.impl.ReferenceImpl#getArraySelectors <em>Array Selectors</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ReferenceImpl extends PrimaryExpressionImpl implements Reference {
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
     * The cached value of the '{@link #getNext() <em>Next</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNext()
     * @generated
     * @ordered
     */
    protected Reference next;

    /**
     * The cached value of the '{@link #getArraySelectors() <em>Array Selectors</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getArraySelectors()
     * @generated
     * @ordered
     */
    protected EList<ArraySelector> arraySelectors;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ReferenceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ReferencesPackage.Literals.REFERENCE;
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
                    ReferencesPackage.REFERENCE__TYPE_ARGUMENTS);
        }
        return typeArguments;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Reference getNext() {
        return next;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetNext(Reference newNext, NotificationChain msgs) {
        Reference oldNext = next;
        next = newNext;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    ReferencesPackage.REFERENCE__NEXT, oldNext, newNext);
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
    public void setNext(Reference newNext) {
        if (newNext != next) {
            NotificationChain msgs = null;
            if (next != null)
                msgs = ((InternalEObject) next).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - ReferencesPackage.REFERENCE__NEXT, null, msgs);
            if (newNext != null)
                msgs = ((InternalEObject) newNext).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - ReferencesPackage.REFERENCE__NEXT, null, msgs);
            msgs = basicSetNext(newNext, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ReferencesPackage.REFERENCE__NEXT, newNext, newNext));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<ArraySelector> getArraySelectors() {
        if (arraySelectors == null) {
            arraySelectors = new EObjectContainmentEList<ArraySelector>(ArraySelector.class, this,
                    ReferencesPackage.REFERENCE__ARRAY_SELECTORS);
        }
        return arraySelectors;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Type getReferencedType() {
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Reference getPrevious() {
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
        case ReferencesPackage.REFERENCE__TYPE_ARGUMENTS:
            return ((InternalEList<?>) getTypeArguments()).basicRemove(otherEnd, msgs);
        case ReferencesPackage.REFERENCE__NEXT:
            return basicSetNext(null, msgs);
        case ReferencesPackage.REFERENCE__ARRAY_SELECTORS:
            return ((InternalEList<?>) getArraySelectors()).basicRemove(otherEnd, msgs);
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
        case ReferencesPackage.REFERENCE__TYPE_ARGUMENTS:
            return getTypeArguments();
        case ReferencesPackage.REFERENCE__NEXT:
            return getNext();
        case ReferencesPackage.REFERENCE__ARRAY_SELECTORS:
            return getArraySelectors();
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
        case ReferencesPackage.REFERENCE__TYPE_ARGUMENTS:
            getTypeArguments().clear();
            getTypeArguments().addAll((Collection<? extends TypeArgument>) newValue);
            return;
        case ReferencesPackage.REFERENCE__NEXT:
            setNext((Reference) newValue);
            return;
        case ReferencesPackage.REFERENCE__ARRAY_SELECTORS:
            getArraySelectors().clear();
            getArraySelectors().addAll((Collection<? extends ArraySelector>) newValue);
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
        case ReferencesPackage.REFERENCE__TYPE_ARGUMENTS:
            getTypeArguments().clear();
            return;
        case ReferencesPackage.REFERENCE__NEXT:
            setNext((Reference) null);
            return;
        case ReferencesPackage.REFERENCE__ARRAY_SELECTORS:
            getArraySelectors().clear();
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
        case ReferencesPackage.REFERENCE__TYPE_ARGUMENTS:
            return typeArguments != null && !typeArguments.isEmpty();
        case ReferencesPackage.REFERENCE__NEXT:
            return next != null;
        case ReferencesPackage.REFERENCE__ARRAY_SELECTORS:
            return arraySelectors != null && !arraySelectors.isEmpty();
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
            case ReferencesPackage.REFERENCE__TYPE_ARGUMENTS:
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
                return ReferencesPackage.REFERENCE__TYPE_ARGUMENTS;
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
    public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
        switch (operationID) {
        case ReferencesPackage.REFERENCE___GET_REFERENCED_TYPE:
            return getReferencedType();
        case ReferencesPackage.REFERENCE___GET_PREVIOUS:
            return getPrevious();
        default:
            return super.eInvoke(operationID, arguments);
        }
    }

} //ReferenceImpl
