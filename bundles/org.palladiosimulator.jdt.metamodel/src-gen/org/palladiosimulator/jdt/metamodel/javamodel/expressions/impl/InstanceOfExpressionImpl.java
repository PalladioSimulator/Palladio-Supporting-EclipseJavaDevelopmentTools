/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationValue;

import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayInitializationValue;
import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayTypeable;
import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArraysPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArrayTypeableImpl;

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
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.InstanceOfExpression;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.InstanceOfExpressionChild;

import org.palladiosimulator.jdt.metamodel.javamodel.types.Type;
import org.palladiosimulator.jdt.metamodel.javamodel.types.TypeReference;
import org.palladiosimulator.jdt.metamodel.javamodel.types.TypedElement;
import org.palladiosimulator.jdt.metamodel.javamodel.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance Of Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.InstanceOfExpressionImpl#getTypeReference <em>Type Reference</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.InstanceOfExpressionImpl#getChild <em>Child</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstanceOfExpressionImpl extends ArrayTypeableImpl implements InstanceOfExpression {
    /**
     * The cached value of the '{@link #getTypeReference() <em>Type Reference</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTypeReference()
     * @generated
     * @ordered
     */
    protected TypeReference typeReference;

    /**
     * The cached value of the '{@link #getChild() <em>Child</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChild()
     * @generated
     * @ordered
     */
    protected InstanceOfExpressionChild child;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected InstanceOfExpressionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExpressionsPackage.Literals.INSTANCE_OF_EXPRESSION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TypeReference getTypeReference() {
        return typeReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTypeReference(TypeReference newTypeReference, NotificationChain msgs) {
        TypeReference oldTypeReference = typeReference;
        typeReference = newTypeReference;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    ExpressionsPackage.INSTANCE_OF_EXPRESSION__TYPE_REFERENCE, oldTypeReference, newTypeReference);
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
    public void setTypeReference(TypeReference newTypeReference) {
        if (newTypeReference != typeReference) {
            NotificationChain msgs = null;
            if (typeReference != null)
                msgs = ((InternalEObject) typeReference).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - ExpressionsPackage.INSTANCE_OF_EXPRESSION__TYPE_REFERENCE, null, msgs);
            if (newTypeReference != null)
                msgs = ((InternalEObject) newTypeReference).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - ExpressionsPackage.INSTANCE_OF_EXPRESSION__TYPE_REFERENCE, null, msgs);
            msgs = basicSetTypeReference(newTypeReference, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    ExpressionsPackage.INSTANCE_OF_EXPRESSION__TYPE_REFERENCE, newTypeReference, newTypeReference));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public InstanceOfExpressionChild getChild() {
        return child;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetChild(InstanceOfExpressionChild newChild, NotificationChain msgs) {
        InstanceOfExpressionChild oldChild = child;
        child = newChild;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    ExpressionsPackage.INSTANCE_OF_EXPRESSION__CHILD, oldChild, newChild);
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
    public void setChild(InstanceOfExpressionChild newChild) {
        if (newChild != child) {
            NotificationChain msgs = null;
            if (child != null)
                msgs = ((InternalEObject) child).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - ExpressionsPackage.INSTANCE_OF_EXPRESSION__CHILD, null, msgs);
            if (newChild != null)
                msgs = ((InternalEObject) newChild).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - ExpressionsPackage.INSTANCE_OF_EXPRESSION__CHILD, null, msgs);
            msgs = basicSetChild(newChild, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.INSTANCE_OF_EXPRESSION__CHILD,
                    newChild, newChild));
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
        case ExpressionsPackage.INSTANCE_OF_EXPRESSION__TYPE_REFERENCE:
            return basicSetTypeReference(null, msgs);
        case ExpressionsPackage.INSTANCE_OF_EXPRESSION__CHILD:
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
        case ExpressionsPackage.INSTANCE_OF_EXPRESSION__TYPE_REFERENCE:
            return getTypeReference();
        case ExpressionsPackage.INSTANCE_OF_EXPRESSION__CHILD:
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
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case ExpressionsPackage.INSTANCE_OF_EXPRESSION__TYPE_REFERENCE:
            setTypeReference((TypeReference) newValue);
            return;
        case ExpressionsPackage.INSTANCE_OF_EXPRESSION__CHILD:
            setChild((InstanceOfExpressionChild) newValue);
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
        case ExpressionsPackage.INSTANCE_OF_EXPRESSION__TYPE_REFERENCE:
            setTypeReference((TypeReference) null);
            return;
        case ExpressionsPackage.INSTANCE_OF_EXPRESSION__CHILD:
            setChild((InstanceOfExpressionChild) null);
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
        case ExpressionsPackage.INSTANCE_OF_EXPRESSION__TYPE_REFERENCE:
            return typeReference != null;
        case ExpressionsPackage.INSTANCE_OF_EXPRESSION__CHILD:
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
        if (baseClass == TypedElement.class) {
            switch (derivedFeatureID) {
            case ExpressionsPackage.INSTANCE_OF_EXPRESSION__TYPE_REFERENCE:
                return TypesPackage.TYPED_ELEMENT__TYPE_REFERENCE;
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
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == TypedElement.class) {
            switch (baseFeatureID) {
            case TypesPackage.TYPED_ELEMENT__TYPE_REFERENCE:
                return ExpressionsPackage.INSTANCE_OF_EXPRESSION__TYPE_REFERENCE;
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
                return ExpressionsPackage.INSTANCE_OF_EXPRESSION___GET_ARRAY_DIMENSION;
            default:
                return super.eDerivedOperationID(baseOperationID, baseClass);
            }
        }
        if (baseClass == TypedElement.class) {
            switch (baseOperationID) {
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
                return ExpressionsPackage.INSTANCE_OF_EXPRESSION___GET_TYPE;
            case ExpressionsPackage.EXPRESSION___GET_ALTERNATIVE_TYPE:
                return ExpressionsPackage.INSTANCE_OF_EXPRESSION___GET_ALTERNATIVE_TYPE;
            case ExpressionsPackage.EXPRESSION___GET_ONE_TYPE__BOOLEAN:
                return ExpressionsPackage.INSTANCE_OF_EXPRESSION___GET_ONE_TYPE__BOOLEAN;
            case ExpressionsPackage.EXPRESSION___GET_ARRAY_DIMENSION:
                return ExpressionsPackage.INSTANCE_OF_EXPRESSION___GET_ARRAY_DIMENSION;
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
        case ExpressionsPackage.INSTANCE_OF_EXPRESSION___GET_TYPE:
            return getType();
        case ExpressionsPackage.INSTANCE_OF_EXPRESSION___GET_ALTERNATIVE_TYPE:
            return getAlternativeType();
        case ExpressionsPackage.INSTANCE_OF_EXPRESSION___GET_ONE_TYPE__BOOLEAN:
            return getOneType((Boolean) arguments.get(0));
        case ExpressionsPackage.INSTANCE_OF_EXPRESSION___GET_ARRAY_DIMENSION:
            return getArrayDimension();
        default:
            return super.eInvoke(operationID, arguments);
        }
    }

} //InstanceOfExpressionImpl
