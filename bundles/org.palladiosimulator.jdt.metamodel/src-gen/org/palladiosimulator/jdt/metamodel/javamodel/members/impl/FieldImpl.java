/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.members.impl;

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

import org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationInstance;

import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayDimension;
import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayTypeable;
import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArraysPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable;

import org.palladiosimulator.jdt.metamodel.javamodel.expressions.Expression;

import org.palladiosimulator.jdt.metamodel.javamodel.generics.GenericsPackage;
import org.palladiosimulator.jdt.metamodel.javamodel.generics.TypeArgument;
import org.palladiosimulator.jdt.metamodel.javamodel.generics.TypeArgumentable;

import org.palladiosimulator.jdt.metamodel.javamodel.instantiations.Initializable;
import org.palladiosimulator.jdt.metamodel.javamodel.instantiations.InstantiationsPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.members.AdditionalField;
import org.palladiosimulator.jdt.metamodel.javamodel.members.Field;
import org.palladiosimulator.jdt.metamodel.javamodel.members.MembersPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.modifiers.AnnotableAndModifiable;
import org.palladiosimulator.jdt.metamodel.javamodel.modifiers.AnnotationInstanceOrModifier;
import org.palladiosimulator.jdt.metamodel.javamodel.modifiers.Modifier;
import org.palladiosimulator.jdt.metamodel.javamodel.modifiers.ModifiersPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.references.ReferenceableElement;

import org.palladiosimulator.jdt.metamodel.javamodel.statements.Statement;

import org.palladiosimulator.jdt.metamodel.javamodel.types.TypeReference;
import org.palladiosimulator.jdt.metamodel.javamodel.types.TypedElement;
import org.palladiosimulator.jdt.metamodel.javamodel.types.TypesPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.variables.Variable;
import org.palladiosimulator.jdt.metamodel.javamodel.variables.VariablesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.members.impl.FieldImpl#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.members.impl.FieldImpl#getTypeReference <em>Type Reference</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.members.impl.FieldImpl#getArrayDimensionsBefore <em>Array Dimensions Before</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.members.impl.FieldImpl#getArrayDimensionsAfter <em>Array Dimensions After</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.members.impl.FieldImpl#getTypeArguments <em>Type Arguments</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.members.impl.FieldImpl#getAnnotationsAndModifiers <em>Annotations And Modifiers</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.members.impl.FieldImpl#getAdditionalFields <em>Additional Fields</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FieldImpl extends MemberImpl implements Field {
    /**
     * The cached value of the '{@link #getInitialValue() <em>Initial Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInitialValue()
     * @generated
     * @ordered
     */
    protected Expression initialValue;

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
     * The cached value of the '{@link #getAnnotationsAndModifiers() <em>Annotations And Modifiers</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAnnotationsAndModifiers()
     * @generated
     * @ordered
     */
    protected EList<AnnotationInstanceOrModifier> annotationsAndModifiers;

    /**
     * The cached value of the '{@link #getAdditionalFields() <em>Additional Fields</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAdditionalFields()
     * @generated
     * @ordered
     */
    protected EList<AdditionalField> additionalFields;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FieldImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MembersPackage.Literals.FIELD;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Expression getInitialValue() {
        return initialValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInitialValue(Expression newInitialValue, NotificationChain msgs) {
        Expression oldInitialValue = initialValue;
        initialValue = newInitialValue;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    MembersPackage.FIELD__INITIAL_VALUE, oldInitialValue, newInitialValue);
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
    public void setInitialValue(Expression newInitialValue) {
        if (newInitialValue != initialValue) {
            NotificationChain msgs = null;
            if (initialValue != null)
                msgs = ((InternalEObject) initialValue).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - MembersPackage.FIELD__INITIAL_VALUE, null, msgs);
            if (newInitialValue != null)
                msgs = ((InternalEObject) newInitialValue).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - MembersPackage.FIELD__INITIAL_VALUE, null, msgs);
            msgs = basicSetInitialValue(newInitialValue, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MembersPackage.FIELD__INITIAL_VALUE, newInitialValue,
                    newInitialValue));
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
                    MembersPackage.FIELD__TYPE_REFERENCE, oldTypeReference, newTypeReference);
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
                        EOPPOSITE_FEATURE_BASE - MembersPackage.FIELD__TYPE_REFERENCE, null, msgs);
            if (newTypeReference != null)
                msgs = ((InternalEObject) newTypeReference).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - MembersPackage.FIELD__TYPE_REFERENCE, null, msgs);
            msgs = basicSetTypeReference(newTypeReference, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MembersPackage.FIELD__TYPE_REFERENCE,
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
                    MembersPackage.FIELD__ARRAY_DIMENSIONS_BEFORE);
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
                    MembersPackage.FIELD__ARRAY_DIMENSIONS_AFTER);
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
                    MembersPackage.FIELD__TYPE_ARGUMENTS);
        }
        return typeArguments;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<AnnotationInstanceOrModifier> getAnnotationsAndModifiers() {
        if (annotationsAndModifiers == null) {
            annotationsAndModifiers = new EObjectContainmentEList<AnnotationInstanceOrModifier>(
                    AnnotationInstanceOrModifier.class, this, MembersPackage.FIELD__ANNOTATIONS_AND_MODIFIERS);
        }
        return annotationsAndModifiers;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<AdditionalField> getAdditionalFields() {
        if (additionalFields == null) {
            additionalFields = new EObjectContainmentEList<AdditionalField>(AdditionalField.class, this,
                    MembersPackage.FIELD__ADDITIONAL_FIELDS);
        }
        return additionalFields;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isHidden(final Commentable context) {
        return false;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isStatic() {
        return false;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void removeModifier(final Class<?> modifierType) {
        return;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void makePublic() {
        return;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void makePrivate() {
        return;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void makeProtected() {
        return;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Modifier> getModifiers() {
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void removeAllModifiers() {
        return;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean hasModifier(final Class<?> type) {
        return false;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isPublic() {
        return false;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isPrivate() {
        return false;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isProtected() {
        return false;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void addModifier(final Modifier newModifier) {
        return;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<AnnotationInstance> getAnnotationInstances() {
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
        case MembersPackage.FIELD__INITIAL_VALUE:
            return basicSetInitialValue(null, msgs);
        case MembersPackage.FIELD__TYPE_REFERENCE:
            return basicSetTypeReference(null, msgs);
        case MembersPackage.FIELD__ARRAY_DIMENSIONS_BEFORE:
            return ((InternalEList<?>) getArrayDimensionsBefore()).basicRemove(otherEnd, msgs);
        case MembersPackage.FIELD__ARRAY_DIMENSIONS_AFTER:
            return ((InternalEList<?>) getArrayDimensionsAfter()).basicRemove(otherEnd, msgs);
        case MembersPackage.FIELD__TYPE_ARGUMENTS:
            return ((InternalEList<?>) getTypeArguments()).basicRemove(otherEnd, msgs);
        case MembersPackage.FIELD__ANNOTATIONS_AND_MODIFIERS:
            return ((InternalEList<?>) getAnnotationsAndModifiers()).basicRemove(otherEnd, msgs);
        case MembersPackage.FIELD__ADDITIONAL_FIELDS:
            return ((InternalEList<?>) getAdditionalFields()).basicRemove(otherEnd, msgs);
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
        case MembersPackage.FIELD__INITIAL_VALUE:
            return getInitialValue();
        case MembersPackage.FIELD__TYPE_REFERENCE:
            return getTypeReference();
        case MembersPackage.FIELD__ARRAY_DIMENSIONS_BEFORE:
            return getArrayDimensionsBefore();
        case MembersPackage.FIELD__ARRAY_DIMENSIONS_AFTER:
            return getArrayDimensionsAfter();
        case MembersPackage.FIELD__TYPE_ARGUMENTS:
            return getTypeArguments();
        case MembersPackage.FIELD__ANNOTATIONS_AND_MODIFIERS:
            return getAnnotationsAndModifiers();
        case MembersPackage.FIELD__ADDITIONAL_FIELDS:
            return getAdditionalFields();
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
        case MembersPackage.FIELD__INITIAL_VALUE:
            setInitialValue((Expression) newValue);
            return;
        case MembersPackage.FIELD__TYPE_REFERENCE:
            setTypeReference((TypeReference) newValue);
            return;
        case MembersPackage.FIELD__ARRAY_DIMENSIONS_BEFORE:
            getArrayDimensionsBefore().clear();
            getArrayDimensionsBefore().addAll((Collection<? extends ArrayDimension>) newValue);
            return;
        case MembersPackage.FIELD__ARRAY_DIMENSIONS_AFTER:
            getArrayDimensionsAfter().clear();
            getArrayDimensionsAfter().addAll((Collection<? extends ArrayDimension>) newValue);
            return;
        case MembersPackage.FIELD__TYPE_ARGUMENTS:
            getTypeArguments().clear();
            getTypeArguments().addAll((Collection<? extends TypeArgument>) newValue);
            return;
        case MembersPackage.FIELD__ANNOTATIONS_AND_MODIFIERS:
            getAnnotationsAndModifiers().clear();
            getAnnotationsAndModifiers().addAll((Collection<? extends AnnotationInstanceOrModifier>) newValue);
            return;
        case MembersPackage.FIELD__ADDITIONAL_FIELDS:
            getAdditionalFields().clear();
            getAdditionalFields().addAll((Collection<? extends AdditionalField>) newValue);
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
        case MembersPackage.FIELD__INITIAL_VALUE:
            setInitialValue((Expression) null);
            return;
        case MembersPackage.FIELD__TYPE_REFERENCE:
            setTypeReference((TypeReference) null);
            return;
        case MembersPackage.FIELD__ARRAY_DIMENSIONS_BEFORE:
            getArrayDimensionsBefore().clear();
            return;
        case MembersPackage.FIELD__ARRAY_DIMENSIONS_AFTER:
            getArrayDimensionsAfter().clear();
            return;
        case MembersPackage.FIELD__TYPE_ARGUMENTS:
            getTypeArguments().clear();
            return;
        case MembersPackage.FIELD__ANNOTATIONS_AND_MODIFIERS:
            getAnnotationsAndModifiers().clear();
            return;
        case MembersPackage.FIELD__ADDITIONAL_FIELDS:
            getAdditionalFields().clear();
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
        case MembersPackage.FIELD__INITIAL_VALUE:
            return initialValue != null;
        case MembersPackage.FIELD__TYPE_REFERENCE:
            return typeReference != null;
        case MembersPackage.FIELD__ARRAY_DIMENSIONS_BEFORE:
            return arrayDimensionsBefore != null && !arrayDimensionsBefore.isEmpty();
        case MembersPackage.FIELD__ARRAY_DIMENSIONS_AFTER:
            return arrayDimensionsAfter != null && !arrayDimensionsAfter.isEmpty();
        case MembersPackage.FIELD__TYPE_ARGUMENTS:
            return typeArguments != null && !typeArguments.isEmpty();
        case MembersPackage.FIELD__ANNOTATIONS_AND_MODIFIERS:
            return annotationsAndModifiers != null && !annotationsAndModifiers.isEmpty();
        case MembersPackage.FIELD__ADDITIONAL_FIELDS:
            return additionalFields != null && !additionalFields.isEmpty();
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
        if (baseClass == Initializable.class) {
            switch (derivedFeatureID) {
            case MembersPackage.FIELD__INITIAL_VALUE:
                return InstantiationsPackage.INITIALIZABLE__INITIAL_VALUE;
            default:
                return -1;
            }
        }
        if (baseClass == TypedElement.class) {
            switch (derivedFeatureID) {
            case MembersPackage.FIELD__TYPE_REFERENCE:
                return TypesPackage.TYPED_ELEMENT__TYPE_REFERENCE;
            default:
                return -1;
            }
        }
        if (baseClass == ArrayTypeable.class) {
            switch (derivedFeatureID) {
            case MembersPackage.FIELD__ARRAY_DIMENSIONS_BEFORE:
                return ArraysPackage.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_BEFORE;
            case MembersPackage.FIELD__ARRAY_DIMENSIONS_AFTER:
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
            case MembersPackage.FIELD__TYPE_ARGUMENTS:
                return GenericsPackage.TYPE_ARGUMENTABLE__TYPE_ARGUMENTS;
            default:
                return -1;
            }
        }
        if (baseClass == Variable.class) {
            switch (derivedFeatureID) {
            default:
                return -1;
            }
        }
        if (baseClass == AnnotableAndModifiable.class) {
            switch (derivedFeatureID) {
            case MembersPackage.FIELD__ANNOTATIONS_AND_MODIFIERS:
                return ModifiersPackage.ANNOTABLE_AND_MODIFIABLE__ANNOTATIONS_AND_MODIFIERS;
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
        if (baseClass == Initializable.class) {
            switch (baseFeatureID) {
            case InstantiationsPackage.INITIALIZABLE__INITIAL_VALUE:
                return MembersPackage.FIELD__INITIAL_VALUE;
            default:
                return -1;
            }
        }
        if (baseClass == TypedElement.class) {
            switch (baseFeatureID) {
            case TypesPackage.TYPED_ELEMENT__TYPE_REFERENCE:
                return MembersPackage.FIELD__TYPE_REFERENCE;
            default:
                return -1;
            }
        }
        if (baseClass == ArrayTypeable.class) {
            switch (baseFeatureID) {
            case ArraysPackage.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_BEFORE:
                return MembersPackage.FIELD__ARRAY_DIMENSIONS_BEFORE;
            case ArraysPackage.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_AFTER:
                return MembersPackage.FIELD__ARRAY_DIMENSIONS_AFTER;
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
                return MembersPackage.FIELD__TYPE_ARGUMENTS;
            default:
                return -1;
            }
        }
        if (baseClass == Variable.class) {
            switch (baseFeatureID) {
            default:
                return -1;
            }
        }
        if (baseClass == AnnotableAndModifiable.class) {
            switch (baseFeatureID) {
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE__ANNOTATIONS_AND_MODIFIERS:
                return MembersPackage.FIELD__ANNOTATIONS_AND_MODIFIERS;
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
        if (baseClass == Initializable.class) {
            switch (baseOperationID) {
            default:
                return -1;
            }
        }
        if (baseClass == TypedElement.class) {
            switch (baseOperationID) {
            default:
                return -1;
            }
        }
        if (baseClass == ArrayTypeable.class) {
            switch (baseOperationID) {
            case ArraysPackage.ARRAY_TYPEABLE___GET_ARRAY_DIMENSION:
                return MembersPackage.FIELD___GET_ARRAY_DIMENSION;
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
        if (baseClass == Variable.class) {
            switch (baseOperationID) {
            case VariablesPackage.VARIABLE___GET_ARRAY_DIMENSION:
                return MembersPackage.FIELD___GET_ARRAY_DIMENSION;
            case VariablesPackage.VARIABLE___CREATE_METHOD_CALL_STATEMENT__STRING_ELIST:
                return MembersPackage.FIELD___CREATE_METHOD_CALL_STATEMENT__STRING_ELIST;
            case VariablesPackage.VARIABLE___CREATE_METHOD_CALL__STRING_ELIST:
                return MembersPackage.FIELD___CREATE_METHOD_CALL__STRING_ELIST;
            default:
                return -1;
            }
        }
        if (baseClass == AnnotableAndModifiable.class) {
            switch (baseOperationID) {
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___IS_HIDDEN__COMMENTABLE:
                return MembersPackage.FIELD___IS_HIDDEN__COMMENTABLE;
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___IS_STATIC:
                return MembersPackage.FIELD___IS_STATIC;
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___REMOVE_MODIFIER__CLASS:
                return MembersPackage.FIELD___REMOVE_MODIFIER__CLASS;
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___MAKE_PUBLIC:
                return MembersPackage.FIELD___MAKE_PUBLIC;
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___MAKE_PRIVATE:
                return MembersPackage.FIELD___MAKE_PRIVATE;
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___MAKE_PROTECTED:
                return MembersPackage.FIELD___MAKE_PROTECTED;
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___GET_MODIFIERS:
                return MembersPackage.FIELD___GET_MODIFIERS;
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___REMOVE_ALL_MODIFIERS:
                return MembersPackage.FIELD___REMOVE_ALL_MODIFIERS;
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___HAS_MODIFIER__CLASS:
                return MembersPackage.FIELD___HAS_MODIFIER__CLASS;
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___IS_PUBLIC:
                return MembersPackage.FIELD___IS_PUBLIC;
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___IS_PRIVATE:
                return MembersPackage.FIELD___IS_PRIVATE;
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___IS_PROTECTED:
                return MembersPackage.FIELD___IS_PROTECTED;
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___ADD_MODIFIER__MODIFIER:
                return MembersPackage.FIELD___ADD_MODIFIER__MODIFIER;
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___GET_ANNOTATION_INSTANCES:
                return MembersPackage.FIELD___GET_ANNOTATION_INSTANCES;
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
        case MembersPackage.FIELD___IS_HIDDEN__COMMENTABLE:
            return isHidden((Commentable) arguments.get(0));
        case MembersPackage.FIELD___IS_STATIC:
            return isStatic();
        case MembersPackage.FIELD___REMOVE_MODIFIER__CLASS:
            removeModifier((Class<?>) arguments.get(0));
            return null;
        case MembersPackage.FIELD___MAKE_PUBLIC:
            makePublic();
            return null;
        case MembersPackage.FIELD___MAKE_PRIVATE:
            makePrivate();
            return null;
        case MembersPackage.FIELD___MAKE_PROTECTED:
            makeProtected();
            return null;
        case MembersPackage.FIELD___GET_MODIFIERS:
            return getModifiers();
        case MembersPackage.FIELD___REMOVE_ALL_MODIFIERS:
            removeAllModifiers();
            return null;
        case MembersPackage.FIELD___HAS_MODIFIER__CLASS:
            return hasModifier((Class<?>) arguments.get(0));
        case MembersPackage.FIELD___IS_PUBLIC:
            return isPublic();
        case MembersPackage.FIELD___IS_PRIVATE:
            return isPrivate();
        case MembersPackage.FIELD___IS_PROTECTED:
            return isProtected();
        case MembersPackage.FIELD___ADD_MODIFIER__MODIFIER:
            addModifier((Modifier) arguments.get(0));
            return null;
        case MembersPackage.FIELD___GET_ANNOTATION_INSTANCES:
            return getAnnotationInstances();
        case MembersPackage.FIELD___GET_ARRAY_DIMENSION:
            return getArrayDimension();
        case MembersPackage.FIELD___CREATE_METHOD_CALL_STATEMENT__STRING_ELIST:
            return createMethodCallStatement((String) arguments.get(0), (EList<Expression>) arguments.get(1));
        case MembersPackage.FIELD___CREATE_METHOD_CALL__STRING_ELIST:
            return createMethodCall((String) arguments.get(0), (EList<Expression>) arguments.get(1));
        default:
            return super.eInvoke(operationID, arguments);
        }
    }

} //FieldImpl
