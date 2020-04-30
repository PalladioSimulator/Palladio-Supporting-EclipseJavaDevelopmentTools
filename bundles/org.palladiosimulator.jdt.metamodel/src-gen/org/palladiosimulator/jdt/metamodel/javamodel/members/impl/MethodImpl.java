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

import org.palladiosimulator.jdt.metamodel.javamodel.generics.GenericsPackage;
import org.palladiosimulator.jdt.metamodel.javamodel.generics.TypeParameter;
import org.palladiosimulator.jdt.metamodel.javamodel.generics.TypeParametrizable;

import org.palladiosimulator.jdt.metamodel.javamodel.members.ExceptionThrower;
import org.palladiosimulator.jdt.metamodel.javamodel.members.MembersPackage;
import org.palladiosimulator.jdt.metamodel.javamodel.members.Method;

import org.palladiosimulator.jdt.metamodel.javamodel.modifiers.AnnotableAndModifiable;
import org.palladiosimulator.jdt.metamodel.javamodel.modifiers.AnnotationInstanceOrModifier;
import org.palladiosimulator.jdt.metamodel.javamodel.modifiers.Modifier;
import org.palladiosimulator.jdt.metamodel.javamodel.modifiers.ModifiersPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.parameters.Parameter;
import org.palladiosimulator.jdt.metamodel.javamodel.parameters.ParametersPackage;
import org.palladiosimulator.jdt.metamodel.javamodel.parameters.Parametrizable;

import org.palladiosimulator.jdt.metamodel.javamodel.references.MethodCall;
import org.palladiosimulator.jdt.metamodel.javamodel.references.ReferenceableElement;

import org.palladiosimulator.jdt.metamodel.javamodel.types.NamespaceClassifierReference;
import org.palladiosimulator.jdt.metamodel.javamodel.types.TypeReference;
import org.palladiosimulator.jdt.metamodel.javamodel.types.TypedElement;
import org.palladiosimulator.jdt.metamodel.javamodel.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.members.impl.MethodImpl#getTypeReference <em>Type Reference</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.members.impl.MethodImpl#getArrayDimensionsBefore <em>Array Dimensions Before</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.members.impl.MethodImpl#getArrayDimensionsAfter <em>Array Dimensions After</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.members.impl.MethodImpl#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.members.impl.MethodImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.members.impl.MethodImpl#getExceptions <em>Exceptions</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.members.impl.MethodImpl#getAnnotationsAndModifiers <em>Annotations And Modifiers</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MethodImpl extends MemberImpl implements Method {
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
     * The cached value of the '{@link #getTypeParameters() <em>Type Parameters</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTypeParameters()
     * @generated
     * @ordered
     */
    protected EList<TypeParameter> typeParameters;

    /**
     * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParameters()
     * @generated
     * @ordered
     */
    protected EList<Parameter> parameters;

    /**
     * The cached value of the '{@link #getExceptions() <em>Exceptions</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExceptions()
     * @generated
     * @ordered
     */
    protected EList<NamespaceClassifierReference> exceptions;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MethodImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MembersPackage.Literals.METHOD;
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
                    MembersPackage.METHOD__TYPE_REFERENCE, oldTypeReference, newTypeReference);
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
                        EOPPOSITE_FEATURE_BASE - MembersPackage.METHOD__TYPE_REFERENCE, null, msgs);
            if (newTypeReference != null)
                msgs = ((InternalEObject) newTypeReference).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - MembersPackage.METHOD__TYPE_REFERENCE, null, msgs);
            msgs = basicSetTypeReference(newTypeReference, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MembersPackage.METHOD__TYPE_REFERENCE,
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
                    MembersPackage.METHOD__ARRAY_DIMENSIONS_BEFORE);
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
                    MembersPackage.METHOD__ARRAY_DIMENSIONS_AFTER);
        }
        return arrayDimensionsAfter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<TypeParameter> getTypeParameters() {
        if (typeParameters == null) {
            typeParameters = new EObjectContainmentEList<TypeParameter>(TypeParameter.class, this,
                    MembersPackage.METHOD__TYPE_PARAMETERS);
        }
        return typeParameters;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Parameter> getParameters() {
        if (parameters == null) {
            parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this,
                    MembersPackage.METHOD__PARAMETERS);
        }
        return parameters;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<NamespaceClassifierReference> getExceptions() {
        if (exceptions == null) {
            exceptions = new EObjectContainmentEList<NamespaceClassifierReference>(NamespaceClassifierReference.class,
                    this, MembersPackage.METHOD__EXCEPTIONS);
        }
        return exceptions;
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
                    AnnotationInstanceOrModifier.class, this, MembersPackage.METHOD__ANNOTATIONS_AND_MODIFIERS);
        }
        return annotationsAndModifiers;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isMethodForCall(final MethodCall methodCall, final boolean needsPerfectMatch) {
        return false;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSomeMethodForCall(final MethodCall methodCall) {
        return false;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isBetterMethodForCall(final Method otherMethod, final MethodCall methodCall) {
        return false;
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
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case MembersPackage.METHOD__TYPE_REFERENCE:
            return basicSetTypeReference(null, msgs);
        case MembersPackage.METHOD__ARRAY_DIMENSIONS_BEFORE:
            return ((InternalEList<?>) getArrayDimensionsBefore()).basicRemove(otherEnd, msgs);
        case MembersPackage.METHOD__ARRAY_DIMENSIONS_AFTER:
            return ((InternalEList<?>) getArrayDimensionsAfter()).basicRemove(otherEnd, msgs);
        case MembersPackage.METHOD__TYPE_PARAMETERS:
            return ((InternalEList<?>) getTypeParameters()).basicRemove(otherEnd, msgs);
        case MembersPackage.METHOD__PARAMETERS:
            return ((InternalEList<?>) getParameters()).basicRemove(otherEnd, msgs);
        case MembersPackage.METHOD__EXCEPTIONS:
            return ((InternalEList<?>) getExceptions()).basicRemove(otherEnd, msgs);
        case MembersPackage.METHOD__ANNOTATIONS_AND_MODIFIERS:
            return ((InternalEList<?>) getAnnotationsAndModifiers()).basicRemove(otherEnd, msgs);
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
        case MembersPackage.METHOD__TYPE_REFERENCE:
            return getTypeReference();
        case MembersPackage.METHOD__ARRAY_DIMENSIONS_BEFORE:
            return getArrayDimensionsBefore();
        case MembersPackage.METHOD__ARRAY_DIMENSIONS_AFTER:
            return getArrayDimensionsAfter();
        case MembersPackage.METHOD__TYPE_PARAMETERS:
            return getTypeParameters();
        case MembersPackage.METHOD__PARAMETERS:
            return getParameters();
        case MembersPackage.METHOD__EXCEPTIONS:
            return getExceptions();
        case MembersPackage.METHOD__ANNOTATIONS_AND_MODIFIERS:
            return getAnnotationsAndModifiers();
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
        case MembersPackage.METHOD__TYPE_REFERENCE:
            setTypeReference((TypeReference) newValue);
            return;
        case MembersPackage.METHOD__ARRAY_DIMENSIONS_BEFORE:
            getArrayDimensionsBefore().clear();
            getArrayDimensionsBefore().addAll((Collection<? extends ArrayDimension>) newValue);
            return;
        case MembersPackage.METHOD__ARRAY_DIMENSIONS_AFTER:
            getArrayDimensionsAfter().clear();
            getArrayDimensionsAfter().addAll((Collection<? extends ArrayDimension>) newValue);
            return;
        case MembersPackage.METHOD__TYPE_PARAMETERS:
            getTypeParameters().clear();
            getTypeParameters().addAll((Collection<? extends TypeParameter>) newValue);
            return;
        case MembersPackage.METHOD__PARAMETERS:
            getParameters().clear();
            getParameters().addAll((Collection<? extends Parameter>) newValue);
            return;
        case MembersPackage.METHOD__EXCEPTIONS:
            getExceptions().clear();
            getExceptions().addAll((Collection<? extends NamespaceClassifierReference>) newValue);
            return;
        case MembersPackage.METHOD__ANNOTATIONS_AND_MODIFIERS:
            getAnnotationsAndModifiers().clear();
            getAnnotationsAndModifiers().addAll((Collection<? extends AnnotationInstanceOrModifier>) newValue);
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
        case MembersPackage.METHOD__TYPE_REFERENCE:
            setTypeReference((TypeReference) null);
            return;
        case MembersPackage.METHOD__ARRAY_DIMENSIONS_BEFORE:
            getArrayDimensionsBefore().clear();
            return;
        case MembersPackage.METHOD__ARRAY_DIMENSIONS_AFTER:
            getArrayDimensionsAfter().clear();
            return;
        case MembersPackage.METHOD__TYPE_PARAMETERS:
            getTypeParameters().clear();
            return;
        case MembersPackage.METHOD__PARAMETERS:
            getParameters().clear();
            return;
        case MembersPackage.METHOD__EXCEPTIONS:
            getExceptions().clear();
            return;
        case MembersPackage.METHOD__ANNOTATIONS_AND_MODIFIERS:
            getAnnotationsAndModifiers().clear();
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
        case MembersPackage.METHOD__TYPE_REFERENCE:
            return typeReference != null;
        case MembersPackage.METHOD__ARRAY_DIMENSIONS_BEFORE:
            return arrayDimensionsBefore != null && !arrayDimensionsBefore.isEmpty();
        case MembersPackage.METHOD__ARRAY_DIMENSIONS_AFTER:
            return arrayDimensionsAfter != null && !arrayDimensionsAfter.isEmpty();
        case MembersPackage.METHOD__TYPE_PARAMETERS:
            return typeParameters != null && !typeParameters.isEmpty();
        case MembersPackage.METHOD__PARAMETERS:
            return parameters != null && !parameters.isEmpty();
        case MembersPackage.METHOD__EXCEPTIONS:
            return exceptions != null && !exceptions.isEmpty();
        case MembersPackage.METHOD__ANNOTATIONS_AND_MODIFIERS:
            return annotationsAndModifiers != null && !annotationsAndModifiers.isEmpty();
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
            case MembersPackage.METHOD__TYPE_REFERENCE:
                return TypesPackage.TYPED_ELEMENT__TYPE_REFERENCE;
            default:
                return -1;
            }
        }
        if (baseClass == ArrayTypeable.class) {
            switch (derivedFeatureID) {
            case MembersPackage.METHOD__ARRAY_DIMENSIONS_BEFORE:
                return ArraysPackage.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_BEFORE;
            case MembersPackage.METHOD__ARRAY_DIMENSIONS_AFTER:
                return ArraysPackage.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_AFTER;
            default:
                return -1;
            }
        }
        if (baseClass == TypeParametrizable.class) {
            switch (derivedFeatureID) {
            case MembersPackage.METHOD__TYPE_PARAMETERS:
                return GenericsPackage.TYPE_PARAMETRIZABLE__TYPE_PARAMETERS;
            default:
                return -1;
            }
        }
        if (baseClass == Parametrizable.class) {
            switch (derivedFeatureID) {
            case MembersPackage.METHOD__PARAMETERS:
                return ParametersPackage.PARAMETRIZABLE__PARAMETERS;
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
        if (baseClass == ExceptionThrower.class) {
            switch (derivedFeatureID) {
            case MembersPackage.METHOD__EXCEPTIONS:
                return MembersPackage.EXCEPTION_THROWER__EXCEPTIONS;
            default:
                return -1;
            }
        }
        if (baseClass == AnnotableAndModifiable.class) {
            switch (derivedFeatureID) {
            case MembersPackage.METHOD__ANNOTATIONS_AND_MODIFIERS:
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
        if (baseClass == TypedElement.class) {
            switch (baseFeatureID) {
            case TypesPackage.TYPED_ELEMENT__TYPE_REFERENCE:
                return MembersPackage.METHOD__TYPE_REFERENCE;
            default:
                return -1;
            }
        }
        if (baseClass == ArrayTypeable.class) {
            switch (baseFeatureID) {
            case ArraysPackage.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_BEFORE:
                return MembersPackage.METHOD__ARRAY_DIMENSIONS_BEFORE;
            case ArraysPackage.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_AFTER:
                return MembersPackage.METHOD__ARRAY_DIMENSIONS_AFTER;
            default:
                return -1;
            }
        }
        if (baseClass == TypeParametrizable.class) {
            switch (baseFeatureID) {
            case GenericsPackage.TYPE_PARAMETRIZABLE__TYPE_PARAMETERS:
                return MembersPackage.METHOD__TYPE_PARAMETERS;
            default:
                return -1;
            }
        }
        if (baseClass == Parametrizable.class) {
            switch (baseFeatureID) {
            case ParametersPackage.PARAMETRIZABLE__PARAMETERS:
                return MembersPackage.METHOD__PARAMETERS;
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
        if (baseClass == ExceptionThrower.class) {
            switch (baseFeatureID) {
            case MembersPackage.EXCEPTION_THROWER__EXCEPTIONS:
                return MembersPackage.METHOD__EXCEPTIONS;
            default:
                return -1;
            }
        }
        if (baseClass == AnnotableAndModifiable.class) {
            switch (baseFeatureID) {
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE__ANNOTATIONS_AND_MODIFIERS:
                return MembersPackage.METHOD__ANNOTATIONS_AND_MODIFIERS;
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
                return MembersPackage.METHOD___GET_ARRAY_DIMENSION;
            default:
                return -1;
            }
        }
        if (baseClass == TypeParametrizable.class) {
            switch (baseOperationID) {
            default:
                return -1;
            }
        }
        if (baseClass == Parametrizable.class) {
            switch (baseOperationID) {
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
        if (baseClass == ExceptionThrower.class) {
            switch (baseOperationID) {
            default:
                return -1;
            }
        }
        if (baseClass == AnnotableAndModifiable.class) {
            switch (baseOperationID) {
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___IS_HIDDEN__COMMENTABLE:
                return MembersPackage.METHOD___IS_HIDDEN__COMMENTABLE;
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___IS_STATIC:
                return MembersPackage.METHOD___IS_STATIC;
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___REMOVE_MODIFIER__CLASS:
                return MembersPackage.METHOD___REMOVE_MODIFIER__CLASS;
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___MAKE_PUBLIC:
                return MembersPackage.METHOD___MAKE_PUBLIC;
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___MAKE_PRIVATE:
                return MembersPackage.METHOD___MAKE_PRIVATE;
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___MAKE_PROTECTED:
                return MembersPackage.METHOD___MAKE_PROTECTED;
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___GET_MODIFIERS:
                return MembersPackage.METHOD___GET_MODIFIERS;
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___REMOVE_ALL_MODIFIERS:
                return MembersPackage.METHOD___REMOVE_ALL_MODIFIERS;
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___HAS_MODIFIER__CLASS:
                return MembersPackage.METHOD___HAS_MODIFIER__CLASS;
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___IS_PUBLIC:
                return MembersPackage.METHOD___IS_PUBLIC;
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___IS_PRIVATE:
                return MembersPackage.METHOD___IS_PRIVATE;
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___IS_PROTECTED:
                return MembersPackage.METHOD___IS_PROTECTED;
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___ADD_MODIFIER__MODIFIER:
                return MembersPackage.METHOD___ADD_MODIFIER__MODIFIER;
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___GET_ANNOTATION_INSTANCES:
                return MembersPackage.METHOD___GET_ANNOTATION_INSTANCES;
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
        case MembersPackage.METHOD___IS_METHOD_FOR_CALL__METHODCALL_BOOLEAN:
            return isMethodForCall((MethodCall) arguments.get(0), (Boolean) arguments.get(1));
        case MembersPackage.METHOD___IS_SOME_METHOD_FOR_CALL__METHODCALL:
            return isSomeMethodForCall((MethodCall) arguments.get(0));
        case MembersPackage.METHOD___IS_BETTER_METHOD_FOR_CALL__METHOD_METHODCALL:
            return isBetterMethodForCall((Method) arguments.get(0), (MethodCall) arguments.get(1));
        case MembersPackage.METHOD___GET_ARRAY_DIMENSION:
            return getArrayDimension();
        case MembersPackage.METHOD___IS_HIDDEN__COMMENTABLE:
            return isHidden((Commentable) arguments.get(0));
        case MembersPackage.METHOD___IS_STATIC:
            return isStatic();
        case MembersPackage.METHOD___REMOVE_MODIFIER__CLASS:
            removeModifier((Class<?>) arguments.get(0));
            return null;
        case MembersPackage.METHOD___MAKE_PUBLIC:
            makePublic();
            return null;
        case MembersPackage.METHOD___MAKE_PRIVATE:
            makePrivate();
            return null;
        case MembersPackage.METHOD___MAKE_PROTECTED:
            makeProtected();
            return null;
        case MembersPackage.METHOD___GET_MODIFIERS:
            return getModifiers();
        case MembersPackage.METHOD___REMOVE_ALL_MODIFIERS:
            removeAllModifiers();
            return null;
        case MembersPackage.METHOD___HAS_MODIFIER__CLASS:
            return hasModifier((Class<?>) arguments.get(0));
        case MembersPackage.METHOD___IS_PUBLIC:
            return isPublic();
        case MembersPackage.METHOD___IS_PRIVATE:
            return isPrivate();
        case MembersPackage.METHOD___IS_PROTECTED:
            return isProtected();
        case MembersPackage.METHOD___ADD_MODIFIER__MODIFIER:
            addModifier((Modifier) arguments.get(0));
            return null;
        case MembersPackage.METHOD___GET_ANNOTATION_INSTANCES:
            return getAnnotationInstances();
        default:
            return super.eInvoke(operationID, arguments);
        }
    }

} //MethodImpl
