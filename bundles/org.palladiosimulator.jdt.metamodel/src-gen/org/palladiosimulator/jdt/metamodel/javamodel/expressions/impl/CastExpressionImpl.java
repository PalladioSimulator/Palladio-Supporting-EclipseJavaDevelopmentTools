/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl;

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

import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayDimension;
import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayInitializationValue;
import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayTypeable;
import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArraysPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.expressions.AdditiveExpressionChild;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.AndExpressionChild;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.AssignmentExpressionChild;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.CastExpression;
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
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.RelationExpressionChild;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.ShiftExpressionChild;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.UnaryExpressionChild;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.UnaryModificationExpressionChild;

import org.palladiosimulator.jdt.metamodel.javamodel.types.Type;

import org.palladiosimulator.jdt.metamodel.javamodel.types.impl.TypedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cast Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.CastExpressionImpl#getArrayDimensionsBefore <em>Array Dimensions Before</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.CastExpressionImpl#getArrayDimensionsAfter <em>Array Dimensions After</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.CastExpressionImpl#getChild <em>Child</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CastExpressionImpl extends TypedElementImpl implements CastExpression {
    /**
     * The cached value of the '{@link #getArrayDimensionsBefore() <em>Array Dimensions Before</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getArrayDimensionsBefore()
     * @generated
     * @ordered
     */
    protected EList<ArrayDimension> arrayDimensionsBefore;

    /**
     * The cached value of the '{@link #getArrayDimensionsAfter() <em>Array Dimensions After</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getArrayDimensionsAfter()
     * @generated
     * @ordered
     */
    protected EList<ArrayDimension> arrayDimensionsAfter;

    /**
     * The cached value of the '{@link #getChild() <em>Child</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChild()
     * @generated
     * @ordered
     */
    protected MultiplicativeExpressionChild child;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CastExpressionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExpressionsPackage.Literals.CAST_EXPRESSION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<ArrayDimension> getArrayDimensionsBefore() {
        if (arrayDimensionsBefore == null) {
            arrayDimensionsBefore = new EObjectContainmentEList<ArrayDimension>(ArrayDimension.class, this,
                    ExpressionsPackage.CAST_EXPRESSION__ARRAY_DIMENSIONS_BEFORE);
        }
        return arrayDimensionsBefore;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<ArrayDimension> getArrayDimensionsAfter() {
        if (arrayDimensionsAfter == null) {
            arrayDimensionsAfter = new EObjectContainmentEList<ArrayDimension>(ArrayDimension.class, this,
                    ExpressionsPackage.CAST_EXPRESSION__ARRAY_DIMENSIONS_AFTER);
        }
        return arrayDimensionsAfter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MultiplicativeExpressionChild getChild() {
        return child;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetChild(MultiplicativeExpressionChild newChild, NotificationChain msgs) {
        MultiplicativeExpressionChild oldChild = child;
        child = newChild;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    ExpressionsPackage.CAST_EXPRESSION__CHILD, oldChild, newChild);
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
    public void setChild(MultiplicativeExpressionChild newChild) {
        if (newChild != child) {
            NotificationChain msgs = null;
            if (child != null)
                msgs = ((InternalEObject) child).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - ExpressionsPackage.CAST_EXPRESSION__CHILD, null, msgs);
            if (newChild != null)
                msgs = ((InternalEObject) newChild).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - ExpressionsPackage.CAST_EXPRESSION__CHILD, null, msgs);
            msgs = basicSetChild(newChild, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.CAST_EXPRESSION__CHILD, newChild,
                    newChild));
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
        case ExpressionsPackage.CAST_EXPRESSION__ARRAY_DIMENSIONS_BEFORE:
            return ((InternalEList<?>) getArrayDimensionsBefore()).basicRemove(otherEnd, msgs);
        case ExpressionsPackage.CAST_EXPRESSION__ARRAY_DIMENSIONS_AFTER:
            return ((InternalEList<?>) getArrayDimensionsAfter()).basicRemove(otherEnd, msgs);
        case ExpressionsPackage.CAST_EXPRESSION__CHILD:
            return basicSetChild(null, msgs);
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
        case ExpressionsPackage.CAST_EXPRESSION__ARRAY_DIMENSIONS_BEFORE:
            return getArrayDimensionsBefore();
        case ExpressionsPackage.CAST_EXPRESSION__ARRAY_DIMENSIONS_AFTER:
            return getArrayDimensionsAfter();
        case ExpressionsPackage.CAST_EXPRESSION__CHILD:
            return getChild();
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
        case ExpressionsPackage.CAST_EXPRESSION__ARRAY_DIMENSIONS_BEFORE:
            getArrayDimensionsBefore().clear();
            getArrayDimensionsBefore().addAll((Collection<? extends ArrayDimension>) newValue);
            return;
        case ExpressionsPackage.CAST_EXPRESSION__ARRAY_DIMENSIONS_AFTER:
            getArrayDimensionsAfter().clear();
            getArrayDimensionsAfter().addAll((Collection<? extends ArrayDimension>) newValue);
            return;
        case ExpressionsPackage.CAST_EXPRESSION__CHILD:
            setChild((MultiplicativeExpressionChild) newValue);
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
        case ExpressionsPackage.CAST_EXPRESSION__ARRAY_DIMENSIONS_BEFORE:
            getArrayDimensionsBefore().clear();
            return;
        case ExpressionsPackage.CAST_EXPRESSION__ARRAY_DIMENSIONS_AFTER:
            getArrayDimensionsAfter().clear();
            return;
        case ExpressionsPackage.CAST_EXPRESSION__CHILD:
            setChild((MultiplicativeExpressionChild) null);
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
        case ExpressionsPackage.CAST_EXPRESSION__ARRAY_DIMENSIONS_BEFORE:
            return arrayDimensionsBefore != null && !arrayDimensionsBefore.isEmpty();
        case ExpressionsPackage.CAST_EXPRESSION__ARRAY_DIMENSIONS_AFTER:
            return arrayDimensionsAfter != null && !arrayDimensionsAfter.isEmpty();
        case ExpressionsPackage.CAST_EXPRESSION__CHILD:
            return child != null;
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
        if (baseClass == ArrayTypeable.class) {
            switch (derivedFeatureID) {
            case ExpressionsPackage.CAST_EXPRESSION__ARRAY_DIMENSIONS_BEFORE:
                return ArraysPackage.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_BEFORE;
            case ExpressionsPackage.CAST_EXPRESSION__ARRAY_DIMENSIONS_AFTER:
                return ArraysPackage.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_AFTER;
            default:
                return -1;
            }
        }
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
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == ArrayTypeable.class) {
            switch (baseFeatureID) {
            case ArraysPackage.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_BEFORE:
                return ExpressionsPackage.CAST_EXPRESSION__ARRAY_DIMENSIONS_BEFORE;
            case ArraysPackage.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_AFTER:
                return ExpressionsPackage.CAST_EXPRESSION__ARRAY_DIMENSIONS_AFTER;
            default:
                return -1;
            }
        }
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
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
        if (baseClass == ArrayTypeable.class) {
            switch (baseOperationID) {
            case ArraysPackage.ARRAY_TYPEABLE___GET_ARRAY_DIMENSION:
                return ExpressionsPackage.CAST_EXPRESSION___GET_ARRAY_DIMENSION;
            default:
                return -1;
            }
        }
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
                return ExpressionsPackage.CAST_EXPRESSION___GET_TYPE;
            case ExpressionsPackage.EXPRESSION___GET_ALTERNATIVE_TYPE:
                return ExpressionsPackage.CAST_EXPRESSION___GET_ALTERNATIVE_TYPE;
            case ExpressionsPackage.EXPRESSION___GET_ONE_TYPE__BOOLEAN:
                return ExpressionsPackage.CAST_EXPRESSION___GET_ONE_TYPE__BOOLEAN;
            case ExpressionsPackage.EXPRESSION___GET_ARRAY_DIMENSION:
                return ExpressionsPackage.CAST_EXPRESSION___GET_ARRAY_DIMENSION;
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
        case ExpressionsPackage.CAST_EXPRESSION___GET_TYPE:
            return getType();
        case ExpressionsPackage.CAST_EXPRESSION___GET_ALTERNATIVE_TYPE:
            return getAlternativeType();
        case ExpressionsPackage.CAST_EXPRESSION___GET_ONE_TYPE__BOOLEAN:
            return getOneType((Boolean) arguments.get(0));
        case ExpressionsPackage.CAST_EXPRESSION___GET_ARRAY_DIMENSION:
            return getArrayDimension();
        default:
            return super.eInvoke(operationID, arguments);
        }
    }

} //CastExpressionImpl
