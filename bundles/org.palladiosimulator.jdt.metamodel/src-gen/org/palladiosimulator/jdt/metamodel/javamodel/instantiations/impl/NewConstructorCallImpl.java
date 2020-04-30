/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.instantiations.impl;

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

import org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationValue;

import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayInitializationValue;
import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArraySelector;

import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.AnonymousClass;

import org.palladiosimulator.jdt.metamodel.javamodel.expressions.AdditiveExpressionChild;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.AndExpressionChild;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.AssignmentExpressionChild;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.ConditionalAndExpressionChild;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.ConditionalExpressionChild;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.ConditionalOrExpressionChild;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.EqualityExpressionChild;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExclusiveOrExpressionChild;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.Expression;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExpressionsPackage;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.InclusiveOrExpressionChild;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.InstanceOfExpressionChild;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.MultiplicativeExpressionChild;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.PrimaryExpression;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.RelationExpressionChild;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.ShiftExpressionChild;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.UnaryExpressionChild;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.UnaryModificationExpressionChild;

import org.palladiosimulator.jdt.metamodel.javamodel.generics.CallTypeArgumentable;
import org.palladiosimulator.jdt.metamodel.javamodel.generics.GenericsPackage;
import org.palladiosimulator.jdt.metamodel.javamodel.generics.TypeArgument;
import org.palladiosimulator.jdt.metamodel.javamodel.generics.TypeArgumentable;

import org.palladiosimulator.jdt.metamodel.javamodel.instantiations.Instantiation;
import org.palladiosimulator.jdt.metamodel.javamodel.instantiations.InstantiationsPackage;
import org.palladiosimulator.jdt.metamodel.javamodel.instantiations.NewConstructorCall;

import org.palladiosimulator.jdt.metamodel.javamodel.references.Argumentable;
import org.palladiosimulator.jdt.metamodel.javamodel.references.Reference;
import org.palladiosimulator.jdt.metamodel.javamodel.references.ReferencesPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.types.Type;

import org.palladiosimulator.jdt.metamodel.javamodel.types.impl.TypedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>New Constructor Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.instantiations.impl.NewConstructorCallImpl#getTypeArguments <em>Type Arguments</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.instantiations.impl.NewConstructorCallImpl#getNext <em>Next</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.instantiations.impl.NewConstructorCallImpl#getArraySelectors <em>Array Selectors</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.instantiations.impl.NewConstructorCallImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.instantiations.impl.NewConstructorCallImpl#getCallTypeArguments <em>Call Type Arguments</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.instantiations.impl.NewConstructorCallImpl#getAnonymousClass <em>Anonymous Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NewConstructorCallImpl extends TypedElementImpl implements NewConstructorCall {
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
     * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getArguments()
     * @generated
     * @ordered
     */
    protected EList<Expression> arguments;

    /**
     * The cached value of the '{@link #getCallTypeArguments() <em>Call Type Arguments</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCallTypeArguments()
     * @generated
     * @ordered
     */
    protected EList<TypeArgument> callTypeArguments;

    /**
     * The cached value of the '{@link #getAnonymousClass() <em>Anonymous Class</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAnonymousClass()
     * @generated
     * @ordered
     */
    protected AnonymousClass anonymousClass;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected NewConstructorCallImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return InstantiationsPackage.Literals.NEW_CONSTRUCTOR_CALL;
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
                    InstantiationsPackage.NEW_CONSTRUCTOR_CALL__TYPE_ARGUMENTS);
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
                    InstantiationsPackage.NEW_CONSTRUCTOR_CALL__NEXT, oldNext, newNext);
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
                        EOPPOSITE_FEATURE_BASE - InstantiationsPackage.NEW_CONSTRUCTOR_CALL__NEXT, null, msgs);
            if (newNext != null)
                msgs = ((InternalEObject) newNext).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - InstantiationsPackage.NEW_CONSTRUCTOR_CALL__NEXT, null, msgs);
            msgs = basicSetNext(newNext, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstantiationsPackage.NEW_CONSTRUCTOR_CALL__NEXT,
                    newNext, newNext));
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
                    InstantiationsPackage.NEW_CONSTRUCTOR_CALL__ARRAY_SELECTORS);
        }
        return arraySelectors;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Expression> getArguments() {
        if (arguments == null) {
            arguments = new EObjectContainmentEList<Expression>(Expression.class, this,
                    InstantiationsPackage.NEW_CONSTRUCTOR_CALL__ARGUMENTS);
        }
        return arguments;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<TypeArgument> getCallTypeArguments() {
        if (callTypeArguments == null) {
            callTypeArguments = new EObjectContainmentEList<TypeArgument>(TypeArgument.class, this,
                    InstantiationsPackage.NEW_CONSTRUCTOR_CALL__CALL_TYPE_ARGUMENTS);
        }
        return callTypeArguments;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AnonymousClass getAnonymousClass() {
        return anonymousClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAnonymousClass(AnonymousClass newAnonymousClass, NotificationChain msgs) {
        AnonymousClass oldAnonymousClass = anonymousClass;
        anonymousClass = newAnonymousClass;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    InstantiationsPackage.NEW_CONSTRUCTOR_CALL__ANONYMOUS_CLASS, oldAnonymousClass, newAnonymousClass);
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
    public void setAnonymousClass(AnonymousClass newAnonymousClass) {
        if (newAnonymousClass != anonymousClass) {
            NotificationChain msgs = null;
            if (anonymousClass != null)
                msgs = ((InternalEObject) anonymousClass).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - InstantiationsPackage.NEW_CONSTRUCTOR_CALL__ANONYMOUS_CLASS, null,
                        msgs);
            if (newAnonymousClass != null)
                msgs = ((InternalEObject) newAnonymousClass).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - InstantiationsPackage.NEW_CONSTRUCTOR_CALL__ANONYMOUS_CLASS, null,
                        msgs);
            msgs = basicSetAnonymousClass(newAnonymousClass, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    InstantiationsPackage.NEW_CONSTRUCTOR_CALL__ANONYMOUS_CLASS, newAnonymousClass, newAnonymousClass));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Type> getArgumentTypes() {
        return null;
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
    public Type getType() {
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Type getAlternativeType() {
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Type getOneType(final boolean alternative) {
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public long getArrayDimension() {
        return 0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__TYPE_ARGUMENTS:
            return ((InternalEList<?>) getTypeArguments()).basicRemove(otherEnd, msgs);
        case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__NEXT:
            return basicSetNext(null, msgs);
        case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__ARRAY_SELECTORS:
            return ((InternalEList<?>) getArraySelectors()).basicRemove(otherEnd, msgs);
        case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__ARGUMENTS:
            return ((InternalEList<?>) getArguments()).basicRemove(otherEnd, msgs);
        case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__CALL_TYPE_ARGUMENTS:
            return ((InternalEList<?>) getCallTypeArguments()).basicRemove(otherEnd, msgs);
        case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__ANONYMOUS_CLASS:
            return basicSetAnonymousClass(null, msgs);
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
        case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__TYPE_ARGUMENTS:
            return getTypeArguments();
        case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__NEXT:
            return getNext();
        case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__ARRAY_SELECTORS:
            return getArraySelectors();
        case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__ARGUMENTS:
            return getArguments();
        case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__CALL_TYPE_ARGUMENTS:
            return getCallTypeArguments();
        case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__ANONYMOUS_CLASS:
            return getAnonymousClass();
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
        case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__TYPE_ARGUMENTS:
            getTypeArguments().clear();
            getTypeArguments().addAll((Collection<? extends TypeArgument>) newValue);
            return;
        case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__NEXT:
            setNext((Reference) newValue);
            return;
        case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__ARRAY_SELECTORS:
            getArraySelectors().clear();
            getArraySelectors().addAll((Collection<? extends ArraySelector>) newValue);
            return;
        case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__ARGUMENTS:
            getArguments().clear();
            getArguments().addAll((Collection<? extends Expression>) newValue);
            return;
        case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__CALL_TYPE_ARGUMENTS:
            getCallTypeArguments().clear();
            getCallTypeArguments().addAll((Collection<? extends TypeArgument>) newValue);
            return;
        case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__ANONYMOUS_CLASS:
            setAnonymousClass((AnonymousClass) newValue);
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
        case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__TYPE_ARGUMENTS:
            getTypeArguments().clear();
            return;
        case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__NEXT:
            setNext((Reference) null);
            return;
        case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__ARRAY_SELECTORS:
            getArraySelectors().clear();
            return;
        case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__ARGUMENTS:
            getArguments().clear();
            return;
        case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__CALL_TYPE_ARGUMENTS:
            getCallTypeArguments().clear();
            return;
        case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__ANONYMOUS_CLASS:
            setAnonymousClass((AnonymousClass) null);
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
        case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__TYPE_ARGUMENTS:
            return typeArguments != null && !typeArguments.isEmpty();
        case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__NEXT:
            return next != null;
        case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__ARRAY_SELECTORS:
            return arraySelectors != null && !arraySelectors.isEmpty();
        case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__ARGUMENTS:
            return arguments != null && !arguments.isEmpty();
        case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__CALL_TYPE_ARGUMENTS:
            return callTypeArguments != null && !callTypeArguments.isEmpty();
        case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__ANONYMOUS_CLASS:
            return anonymousClass != null;
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
        if (baseClass == ArrayInitializationValue.class) {
            switch (derivedFeatureID) {
            default:
                return -1;
            }
        }
        if (baseClass == AnnotationValue.class) {
            switch (derivedFeatureID) {
            default:
                return -1;
            }
        }
        if (baseClass == Expression.class) {
            switch (derivedFeatureID) {
            default:
                return -1;
            }
        }
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
            case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__TYPE_ARGUMENTS:
                return GenericsPackage.TYPE_ARGUMENTABLE__TYPE_ARGUMENTS;
            default:
                return -1;
            }
        }
        if (baseClass == Reference.class) {
            switch (derivedFeatureID) {
            case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__NEXT:
                return ReferencesPackage.REFERENCE__NEXT;
            case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__ARRAY_SELECTORS:
                return ReferencesPackage.REFERENCE__ARRAY_SELECTORS;
            default:
                return -1;
            }
        }
        if (baseClass == Argumentable.class) {
            switch (derivedFeatureID) {
            case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__ARGUMENTS:
                return ReferencesPackage.ARGUMENTABLE__ARGUMENTS;
            default:
                return -1;
            }
        }
        if (baseClass == Instantiation.class) {
            switch (derivedFeatureID) {
            default:
                return -1;
            }
        }
        if (baseClass == CallTypeArgumentable.class) {
            switch (derivedFeatureID) {
            case InstantiationsPackage.NEW_CONSTRUCTOR_CALL__CALL_TYPE_ARGUMENTS:
                return GenericsPackage.CALL_TYPE_ARGUMENTABLE__CALL_TYPE_ARGUMENTS;
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
        if (baseClass == ArrayInitializationValue.class) {
            switch (baseFeatureID) {
            default:
                return -1;
            }
        }
        if (baseClass == AnnotationValue.class) {
            switch (baseFeatureID) {
            default:
                return -1;
            }
        }
        if (baseClass == Expression.class) {
            switch (baseFeatureID) {
            default:
                return -1;
            }
        }
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
                return InstantiationsPackage.NEW_CONSTRUCTOR_CALL__TYPE_ARGUMENTS;
            default:
                return -1;
            }
        }
        if (baseClass == Reference.class) {
            switch (baseFeatureID) {
            case ReferencesPackage.REFERENCE__NEXT:
                return InstantiationsPackage.NEW_CONSTRUCTOR_CALL__NEXT;
            case ReferencesPackage.REFERENCE__ARRAY_SELECTORS:
                return InstantiationsPackage.NEW_CONSTRUCTOR_CALL__ARRAY_SELECTORS;
            default:
                return -1;
            }
        }
        if (baseClass == Argumentable.class) {
            switch (baseFeatureID) {
            case ReferencesPackage.ARGUMENTABLE__ARGUMENTS:
                return InstantiationsPackage.NEW_CONSTRUCTOR_CALL__ARGUMENTS;
            default:
                return -1;
            }
        }
        if (baseClass == Instantiation.class) {
            switch (baseFeatureID) {
            default:
                return -1;
            }
        }
        if (baseClass == CallTypeArgumentable.class) {
            switch (baseFeatureID) {
            case GenericsPackage.CALL_TYPE_ARGUMENTABLE__CALL_TYPE_ARGUMENTS:
                return InstantiationsPackage.NEW_CONSTRUCTOR_CALL__CALL_TYPE_ARGUMENTS;
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
        if (baseClass == ArrayInitializationValue.class) {
            switch (baseOperationID) {
            default:
                return -1;
            }
        }
        if (baseClass == AnnotationValue.class) {
            switch (baseOperationID) {
            default:
                return -1;
            }
        }
        if (baseClass == Expression.class) {
            switch (baseOperationID) {
            case ExpressionsPackage.EXPRESSION___GET_TYPE:
                return InstantiationsPackage.NEW_CONSTRUCTOR_CALL___GET_TYPE;
            case ExpressionsPackage.EXPRESSION___GET_ALTERNATIVE_TYPE:
                return InstantiationsPackage.NEW_CONSTRUCTOR_CALL___GET_ALTERNATIVE_TYPE;
            case ExpressionsPackage.EXPRESSION___GET_ONE_TYPE__BOOLEAN:
                return InstantiationsPackage.NEW_CONSTRUCTOR_CALL___GET_ONE_TYPE__BOOLEAN;
            case ExpressionsPackage.EXPRESSION___GET_ARRAY_DIMENSION:
                return InstantiationsPackage.NEW_CONSTRUCTOR_CALL___GET_ARRAY_DIMENSION;
            default:
                return -1;
            }
        }
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
                return InstantiationsPackage.NEW_CONSTRUCTOR_CALL___GET_REFERENCED_TYPE;
            case ReferencesPackage.REFERENCE___GET_PREVIOUS:
                return InstantiationsPackage.NEW_CONSTRUCTOR_CALL___GET_PREVIOUS;
            default:
                return -1;
            }
        }
        if (baseClass == Argumentable.class) {
            switch (baseOperationID) {
            case ReferencesPackage.ARGUMENTABLE___GET_ARGUMENT_TYPES:
                return InstantiationsPackage.NEW_CONSTRUCTOR_CALL___GET_ARGUMENT_TYPES;
            default:
                return -1;
            }
        }
        if (baseClass == Instantiation.class) {
            switch (baseOperationID) {
            default:
                return -1;
            }
        }
        if (baseClass == CallTypeArgumentable.class) {
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
        case InstantiationsPackage.NEW_CONSTRUCTOR_CALL___GET_ARGUMENT_TYPES:
            return getArgumentTypes();
        case InstantiationsPackage.NEW_CONSTRUCTOR_CALL___GET_REFERENCED_TYPE:
            return getReferencedType();
        case InstantiationsPackage.NEW_CONSTRUCTOR_CALL___GET_PREVIOUS:
            return getPrevious();
        case InstantiationsPackage.NEW_CONSTRUCTOR_CALL___GET_TYPE:
            return getType();
        case InstantiationsPackage.NEW_CONSTRUCTOR_CALL___GET_ALTERNATIVE_TYPE:
            return getAlternativeType();
        case InstantiationsPackage.NEW_CONSTRUCTOR_CALL___GET_ONE_TYPE__BOOLEAN:
            return getOneType((Boolean) arguments.get(0));
        case InstantiationsPackage.NEW_CONSTRUCTOR_CALL___GET_ARRAY_DIMENSION:
            return getArrayDimension();
        default:
            return super.eInvoke(operationID, arguments);
        }
    }

} //NewConstructorCallImpl
