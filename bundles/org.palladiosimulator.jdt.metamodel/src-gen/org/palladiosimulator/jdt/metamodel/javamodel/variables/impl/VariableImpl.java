/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.variables.impl;

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

import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayDimension;
import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayTypeable;
import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArraysPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.impl.NamedElementImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.expressions.Expression;

import org.palladiosimulator.jdt.metamodel.javamodel.generics.GenericsPackage;
import org.palladiosimulator.jdt.metamodel.javamodel.generics.TypeArgument;
import org.palladiosimulator.jdt.metamodel.javamodel.generics.TypeArgumentable;

import org.palladiosimulator.jdt.metamodel.javamodel.references.ReferenceableElement;

import org.palladiosimulator.jdt.metamodel.javamodel.statements.Statement;

import org.palladiosimulator.jdt.metamodel.javamodel.types.TypeReference;
import org.palladiosimulator.jdt.metamodel.javamodel.types.TypedElement;
import org.palladiosimulator.jdt.metamodel.javamodel.types.TypesPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.variables.Variable;
import org.palladiosimulator.jdt.metamodel.javamodel.variables.VariablesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.variables.impl.VariableImpl#getTypeReference <em>Type Reference</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.variables.impl.VariableImpl#getArrayDimensionsBefore <em>Array Dimensions Before</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.variables.impl.VariableImpl#getArrayDimensionsAfter <em>Array Dimensions After</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.variables.impl.VariableImpl#getTypeArguments <em>Type Arguments</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class VariableImpl extends NamedElementImpl implements Variable {
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
     * The cached value of the '{@link #getTypeArguments() <em>Type Arguments</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTypeArguments()
     * @generated
     * @ordered
     */
    protected EList<TypeArgument> typeArguments;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected VariableImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return VariablesPackage.Literals.VARIABLE;
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
                    VariablesPackage.VARIABLE__TYPE_REFERENCE, oldTypeReference, newTypeReference);
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
                        EOPPOSITE_FEATURE_BASE - VariablesPackage.VARIABLE__TYPE_REFERENCE, null, msgs);
            if (newTypeReference != null)
                msgs = ((InternalEObject) newTypeReference).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - VariablesPackage.VARIABLE__TYPE_REFERENCE, null, msgs);
            msgs = basicSetTypeReference(newTypeReference, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VariablesPackage.VARIABLE__TYPE_REFERENCE,
                    newTypeReference, newTypeReference));
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
                    VariablesPackage.VARIABLE__ARRAY_DIMENSIONS_BEFORE);
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
                    VariablesPackage.VARIABLE__ARRAY_DIMENSIONS_AFTER);
        }
        return arrayDimensionsAfter;
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
                    VariablesPackage.VARIABLE__TYPE_ARGUMENTS);
        }
        return typeArguments;
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
    public Statement createMethodCallStatement(final String methodName, final EList<Expression> arguments) {
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Expression createMethodCall(final String methodName, final EList<Expression> arguments) {
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
        case VariablesPackage.VARIABLE__TYPE_REFERENCE:
            return basicSetTypeReference(null, msgs);
        case VariablesPackage.VARIABLE__ARRAY_DIMENSIONS_BEFORE:
            return ((InternalEList<?>) getArrayDimensionsBefore()).basicRemove(otherEnd, msgs);
        case VariablesPackage.VARIABLE__ARRAY_DIMENSIONS_AFTER:
            return ((InternalEList<?>) getArrayDimensionsAfter()).basicRemove(otherEnd, msgs);
        case VariablesPackage.VARIABLE__TYPE_ARGUMENTS:
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
        case VariablesPackage.VARIABLE__TYPE_REFERENCE:
            return getTypeReference();
        case VariablesPackage.VARIABLE__ARRAY_DIMENSIONS_BEFORE:
            return getArrayDimensionsBefore();
        case VariablesPackage.VARIABLE__ARRAY_DIMENSIONS_AFTER:
            return getArrayDimensionsAfter();
        case VariablesPackage.VARIABLE__TYPE_ARGUMENTS:
            return getTypeArguments();
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
        case VariablesPackage.VARIABLE__TYPE_REFERENCE:
            setTypeReference((TypeReference) newValue);
            return;
        case VariablesPackage.VARIABLE__ARRAY_DIMENSIONS_BEFORE:
            getArrayDimensionsBefore().clear();
            getArrayDimensionsBefore().addAll((Collection<? extends ArrayDimension>) newValue);
            return;
        case VariablesPackage.VARIABLE__ARRAY_DIMENSIONS_AFTER:
            getArrayDimensionsAfter().clear();
            getArrayDimensionsAfter().addAll((Collection<? extends ArrayDimension>) newValue);
            return;
        case VariablesPackage.VARIABLE__TYPE_ARGUMENTS:
            getTypeArguments().clear();
            getTypeArguments().addAll((Collection<? extends TypeArgument>) newValue);
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
        case VariablesPackage.VARIABLE__TYPE_REFERENCE:
            setTypeReference((TypeReference) null);
            return;
        case VariablesPackage.VARIABLE__ARRAY_DIMENSIONS_BEFORE:
            getArrayDimensionsBefore().clear();
            return;
        case VariablesPackage.VARIABLE__ARRAY_DIMENSIONS_AFTER:
            getArrayDimensionsAfter().clear();
            return;
        case VariablesPackage.VARIABLE__TYPE_ARGUMENTS:
            getTypeArguments().clear();
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
        case VariablesPackage.VARIABLE__TYPE_REFERENCE:
            return typeReference != null;
        case VariablesPackage.VARIABLE__ARRAY_DIMENSIONS_BEFORE:
            return arrayDimensionsBefore != null && !arrayDimensionsBefore.isEmpty();
        case VariablesPackage.VARIABLE__ARRAY_DIMENSIONS_AFTER:
            return arrayDimensionsAfter != null && !arrayDimensionsAfter.isEmpty();
        case VariablesPackage.VARIABLE__TYPE_ARGUMENTS:
            return typeArguments != null && !typeArguments.isEmpty();
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
            case VariablesPackage.VARIABLE__TYPE_REFERENCE:
                return TypesPackage.TYPED_ELEMENT__TYPE_REFERENCE;
            default:
                return -1;
            }
        }
        if (baseClass == ArrayTypeable.class) {
            switch (derivedFeatureID) {
            case VariablesPackage.VARIABLE__ARRAY_DIMENSIONS_BEFORE:
                return ArraysPackage.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_BEFORE;
            case VariablesPackage.VARIABLE__ARRAY_DIMENSIONS_AFTER:
                return ArraysPackage.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_AFTER;
            default:
                return -1;
            }
        }
        if (baseClass == ReferenceableElement.class) {
            switch (derivedFeatureID) {
            default:
                return -1;
            }
        }
        if (baseClass == TypeArgumentable.class) {
            switch (derivedFeatureID) {
            case VariablesPackage.VARIABLE__TYPE_ARGUMENTS:
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
        if (baseClass == TypedElement.class) {
            switch (baseFeatureID) {
            case TypesPackage.TYPED_ELEMENT__TYPE_REFERENCE:
                return VariablesPackage.VARIABLE__TYPE_REFERENCE;
            default:
                return -1;
            }
        }
        if (baseClass == ArrayTypeable.class) {
            switch (baseFeatureID) {
            case ArraysPackage.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_BEFORE:
                return VariablesPackage.VARIABLE__ARRAY_DIMENSIONS_BEFORE;
            case ArraysPackage.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_AFTER:
                return VariablesPackage.VARIABLE__ARRAY_DIMENSIONS_AFTER;
            default:
                return -1;
            }
        }
        if (baseClass == ReferenceableElement.class) {
            switch (baseFeatureID) {
            default:
                return -1;
            }
        }
        if (baseClass == TypeArgumentable.class) {
            switch (baseFeatureID) {
            case GenericsPackage.TYPE_ARGUMENTABLE__TYPE_ARGUMENTS:
                return VariablesPackage.VARIABLE__TYPE_ARGUMENTS;
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
        if (baseClass == TypedElement.class) {
            switch (baseOperationID) {
            default:
                return -1;
            }
        }
        if (baseClass == ArrayTypeable.class) {
            switch (baseOperationID) {
            case ArraysPackage.ARRAY_TYPEABLE___GET_ARRAY_DIMENSION:
                return VariablesPackage.VARIABLE___GET_ARRAY_DIMENSION;
            default:
                return -1;
            }
        }
        if (baseClass == ReferenceableElement.class) {
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
        return super.eDerivedOperationID(baseOperationID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    @SuppressWarnings("unchecked")
    public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
        switch (operationID) {
        case VariablesPackage.VARIABLE___GET_ARRAY_DIMENSION:
            return getArrayDimension();
        case VariablesPackage.VARIABLE___CREATE_METHOD_CALL_STATEMENT__STRING_ELIST:
            return createMethodCallStatement((String) arguments.get(0), (EList<Expression>) arguments.get(1));
        case VariablesPackage.VARIABLE___CREATE_METHOD_CALL__STRING_ELIST:
            return createMethodCall((String) arguments.get(0), (EList<Expression>) arguments.get(1));
        default:
            return super.eInvoke(operationID, arguments);
        }
    }

} //VariableImpl
