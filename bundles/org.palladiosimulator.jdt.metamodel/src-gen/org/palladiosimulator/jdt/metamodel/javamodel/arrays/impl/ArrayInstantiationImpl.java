/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl;

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

import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayInstantiation;
import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArraySelector;
import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArraysPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.expressions.AdditiveExpressionChild;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.AndExpressionChild;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.AssignmentExpressionChild;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.ConditionalAndExpressionChild;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.ConditionalExpressionChild;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.ConditionalOrExpressionChild;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.EqualityExpressionChild;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExclusiveOrExpressionChild;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.InclusiveOrExpressionChild;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.InstanceOfExpressionChild;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.MultiplicativeExpressionChild;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.PrimaryExpression;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.RelationExpressionChild;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.ShiftExpressionChild;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.UnaryExpressionChild;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.UnaryModificationExpressionChild;

import org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.generics.GenericsPackage;
import org.palladiosimulator.jdt.metamodel.javamodel.generics.TypeArgument;
import org.palladiosimulator.jdt.metamodel.javamodel.generics.TypeArgumentable;

import org.palladiosimulator.jdt.metamodel.javamodel.references.Reference;
import org.palladiosimulator.jdt.metamodel.javamodel.references.ReferencesPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.types.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Instantiation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArrayInstantiationImpl#getTypeArguments <em>Type Arguments</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArrayInstantiationImpl#getNext <em>Next</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArrayInstantiationImpl#getArraySelectors <em>Array Selectors</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ArrayInstantiationImpl extends ExpressionImpl implements ArrayInstantiation {
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
    protected ArrayInstantiationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ArraysPackage.Literals.ARRAY_INSTANTIATION;
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
                    ArraysPackage.ARRAY_INSTANTIATION__TYPE_ARGUMENTS);
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
                    ArraysPackage.ARRAY_INSTANTIATION__NEXT, oldNext, newNext);
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
                        EOPPOSITE_FEATURE_BASE - ArraysPackage.ARRAY_INSTANTIATION__NEXT, null, msgs);
            if (newNext != null)
                msgs = ((InternalEObject) newNext).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - ArraysPackage.ARRAY_INSTANTIATION__NEXT, null, msgs);
            msgs = basicSetNext(newNext, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ArraysPackage.ARRAY_INSTANTIATION__NEXT, newNext,
                    newNext));
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
                    ArraysPackage.ARRAY_INSTANTIATION__ARRAY_SELECTORS);
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
        case ArraysPackage.ARRAY_INSTANTIATION__TYPE_ARGUMENTS:
            return ((InternalEList<?>) getTypeArguments()).basicRemove(otherEnd, msgs);
        case ArraysPackage.ARRAY_INSTANTIATION__NEXT:
            return basicSetNext(null, msgs);
        case ArraysPackage.ARRAY_INSTANTIATION__ARRAY_SELECTORS:
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
        case ArraysPackage.ARRAY_INSTANTIATION__TYPE_ARGUMENTS:
            return getTypeArguments();
        case ArraysPackage.ARRAY_INSTANTIATION__NEXT:
            return getNext();
        case ArraysPackage.ARRAY_INSTANTIATION__ARRAY_SELECTORS:
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
        case ArraysPackage.ARRAY_INSTANTIATION__TYPE_ARGUMENTS:
            getTypeArguments().clear();
            getTypeArguments().addAll((Collection<? extends TypeArgument>) newValue);
            return;
        case ArraysPackage.ARRAY_INSTANTIATION__NEXT:
            setNext((Reference) newValue);
            return;
        case ArraysPackage.ARRAY_INSTANTIATION__ARRAY_SELECTORS:
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
        case ArraysPackage.ARRAY_INSTANTIATION__TYPE_ARGUMENTS:
            getTypeArguments().clear();
            return;
        case ArraysPackage.ARRAY_INSTANTIATION__NEXT:
            setNext((Reference) null);
            return;
        case ArraysPackage.ARRAY_INSTANTIATION__ARRAY_SELECTORS:
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
        case ArraysPackage.ARRAY_INSTANTIATION__TYPE_ARGUMENTS:
            return typeArguments != null && !typeArguments.isEmpty();
        case ArraysPackage.ARRAY_INSTANTIATION__NEXT:
            return next != null;
        case ArraysPackage.ARRAY_INSTANTIATION__ARRAY_SELECTORS:
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
        if (baseClass == AssignmentExpressionChild.class) {
            switch (derivedFeatureID) {
            default:
                return -1;
            }
        }
        if (baseClass == ConditionalExpressionChild.class) {
            switch (derivedFeatureID) {
            default:
                return -1;
            }
        }
        if (baseClass == ConditionalOrExpressionChild.class) {
            switch (derivedFeatureID) {
            default:
                return -1;
            }
        }
        if (baseClass == ConditionalAndExpressionChild.class) {
            switch (derivedFeatureID) {
            default:
                return -1;
            }
        }
        if (baseClass == InclusiveOrExpressionChild.class) {
            switch (derivedFeatureID) {
            default:
                return -1;
            }
        }
        if (baseClass == ExclusiveOrExpressionChild.class) {
            switch (derivedFeatureID) {
            default:
                return -1;
            }
        }
        if (baseClass == AndExpressionChild.class) {
            switch (derivedFeatureID) {
            default:
                return -1;
            }
        }
        if (baseClass == EqualityExpressionChild.class) {
            switch (derivedFeatureID) {
            default:
                return -1;
            }
        }
        if (baseClass == InstanceOfExpressionChild.class) {
            switch (derivedFeatureID) {
            default:
                return -1;
            }
        }
        if (baseClass == RelationExpressionChild.class) {
            switch (derivedFeatureID) {
            default:
                return -1;
            }
        }
        if (baseClass == ShiftExpressionChild.class) {
            switch (derivedFeatureID) {
            default:
                return -1;
            }
        }
        if (baseClass == AdditiveExpressionChild.class) {
            switch (derivedFeatureID) {
            default:
                return -1;
            }
        }
        if (baseClass == MultiplicativeExpressionChild.class) {
            switch (derivedFeatureID) {
            default:
                return -1;
            }
        }
        if (baseClass == UnaryExpressionChild.class) {
            switch (derivedFeatureID) {
            default:
                return -1;
            }
        }
        if (baseClass == UnaryModificationExpressionChild.class) {
            switch (derivedFeatureID) {
            default:
                return -1;
            }
        }
        if (baseClass == PrimaryExpression.class) {
            switch (derivedFeatureID) {
            default:
                return -1;
            }
        }
        if (baseClass == TypeArgumentable.class) {
            switch (derivedFeatureID) {
            case ArraysPackage.ARRAY_INSTANTIATION__TYPE_ARGUMENTS:
                return GenericsPackage.TYPE_ARGUMENTABLE__TYPE_ARGUMENTS;
            default:
                return -1;
            }
        }
        if (baseClass == Reference.class) {
            switch (derivedFeatureID) {
            case ArraysPackage.ARRAY_INSTANTIATION__NEXT:
                return ReferencesPackage.REFERENCE__NEXT;
            case ArraysPackage.ARRAY_INSTANTIATION__ARRAY_SELECTORS:
                return ReferencesPackage.REFERENCE__ARRAY_SELECTORS;
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
        if (baseClass == AssignmentExpressionChild.class) {
            switch (baseFeatureID) {
            default:
                return -1;
            }
        }
        if (baseClass == ConditionalExpressionChild.class) {
            switch (baseFeatureID) {
            default:
                return -1;
            }
        }
        if (baseClass == ConditionalOrExpressionChild.class) {
            switch (baseFeatureID) {
            default:
                return -1;
            }
        }
        if (baseClass == ConditionalAndExpressionChild.class) {
            switch (baseFeatureID) {
            default:
                return -1;
            }
        }
        if (baseClass == InclusiveOrExpressionChild.class) {
            switch (baseFeatureID) {
            default:
                return -1;
            }
        }
        if (baseClass == ExclusiveOrExpressionChild.class) {
            switch (baseFeatureID) {
            default:
                return -1;
            }
        }
        if (baseClass == AndExpressionChild.class) {
            switch (baseFeatureID) {
            default:
                return -1;
            }
        }
        if (baseClass == EqualityExpressionChild.class) {
            switch (baseFeatureID) {
            default:
                return -1;
            }
        }
        if (baseClass == InstanceOfExpressionChild.class) {
            switch (baseFeatureID) {
            default:
                return -1;
            }
        }
        if (baseClass == RelationExpressionChild.class) {
            switch (baseFeatureID) {
            default:
                return -1;
            }
        }
        if (baseClass == ShiftExpressionChild.class) {
            switch (baseFeatureID) {
            default:
                return -1;
            }
        }
        if (baseClass == AdditiveExpressionChild.class) {
            switch (baseFeatureID) {
            default:
                return -1;
            }
        }
        if (baseClass == MultiplicativeExpressionChild.class) {
            switch (baseFeatureID) {
            default:
                return -1;
            }
        }
        if (baseClass == UnaryExpressionChild.class) {
            switch (baseFeatureID) {
            default:
                return -1;
            }
        }
        if (baseClass == UnaryModificationExpressionChild.class) {
            switch (baseFeatureID) {
            default:
                return -1;
            }
        }
        if (baseClass == PrimaryExpression.class) {
            switch (baseFeatureID) {
            default:
                return -1;
            }
        }
        if (baseClass == TypeArgumentable.class) {
            switch (baseFeatureID) {
            case GenericsPackage.TYPE_ARGUMENTABLE__TYPE_ARGUMENTS:
                return ArraysPackage.ARRAY_INSTANTIATION__TYPE_ARGUMENTS;
            default:
                return -1;
            }
        }
        if (baseClass == Reference.class) {
            switch (baseFeatureID) {
            case ReferencesPackage.REFERENCE__NEXT:
                return ArraysPackage.ARRAY_INSTANTIATION__NEXT;
            case ReferencesPackage.REFERENCE__ARRAY_SELECTORS:
                return ArraysPackage.ARRAY_INSTANTIATION__ARRAY_SELECTORS;
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
        if (baseClass == AssignmentExpressionChild.class) {
            switch (baseOperationID) {
            default:
                return -1;
            }
        }
        if (baseClass == ConditionalExpressionChild.class) {
            switch (baseOperationID) {
            default:
                return -1;
            }
        }
        if (baseClass == ConditionalOrExpressionChild.class) {
            switch (baseOperationID) {
            default:
                return -1;
            }
        }
        if (baseClass == ConditionalAndExpressionChild.class) {
            switch (baseOperationID) {
            default:
                return -1;
            }
        }
        if (baseClass == InclusiveOrExpressionChild.class) {
            switch (baseOperationID) {
            default:
                return -1;
            }
        }
        if (baseClass == ExclusiveOrExpressionChild.class) {
            switch (baseOperationID) {
            default:
                return -1;
            }
        }
        if (baseClass == AndExpressionChild.class) {
            switch (baseOperationID) {
            default:
                return -1;
            }
        }
        if (baseClass == EqualityExpressionChild.class) {
            switch (baseOperationID) {
            default:
                return -1;
            }
        }
        if (baseClass == InstanceOfExpressionChild.class) {
            switch (baseOperationID) {
            default:
                return -1;
            }
        }
        if (baseClass == RelationExpressionChild.class) {
            switch (baseOperationID) {
            default:
                return -1;
            }
        }
        if (baseClass == ShiftExpressionChild.class) {
            switch (baseOperationID) {
            default:
                return -1;
            }
        }
        if (baseClass == AdditiveExpressionChild.class) {
            switch (baseOperationID) {
            default:
                return -1;
            }
        }
        if (baseClass == MultiplicativeExpressionChild.class) {
            switch (baseOperationID) {
            default:
                return -1;
            }
        }
        if (baseClass == UnaryExpressionChild.class) {
            switch (baseOperationID) {
            default:
                return -1;
            }
        }
        if (baseClass == UnaryModificationExpressionChild.class) {
            switch (baseOperationID) {
            default:
                return -1;
            }
        }
        if (baseClass == PrimaryExpression.class) {
            switch (baseOperationID) {
            default:
                return -1;
            }
        }
        if (baseClass == TypeArgumentable.class) {
            switch (baseOperationID) {
            default:
                return -1;
            }
        }
        if (baseClass == Reference.class) {
            switch (baseOperationID) {
            case ReferencesPackage.REFERENCE___GET_REFERENCED_TYPE:
                return ArraysPackage.ARRAY_INSTANTIATION___GET_REFERENCED_TYPE;
            case ReferencesPackage.REFERENCE___GET_PREVIOUS:
                return ArraysPackage.ARRAY_INSTANTIATION___GET_PREVIOUS;
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
        case ArraysPackage.ARRAY_INSTANTIATION___GET_REFERENCED_TYPE:
            return getReferencedType();
        case ArraysPackage.ARRAY_INSTANTIATION___GET_PREVIOUS:
            return getPrevious();
        default:
            return super.eInvoke(operationID, arguments);
        }
    }

} //ArrayInstantiationImpl
