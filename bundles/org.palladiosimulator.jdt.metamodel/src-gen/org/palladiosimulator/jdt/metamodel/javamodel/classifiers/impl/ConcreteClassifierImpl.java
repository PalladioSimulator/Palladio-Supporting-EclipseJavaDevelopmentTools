/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl;

import java.lang.Class;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationInstance;

import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.ClassifiersPackage;
import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.ConcreteClassifier;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable;

import org.palladiosimulator.jdt.metamodel.javamodel.generics.GenericsPackage;
import org.palladiosimulator.jdt.metamodel.javamodel.generics.TypeParameter;
import org.palladiosimulator.jdt.metamodel.javamodel.generics.TypeParametrizable;

import org.palladiosimulator.jdt.metamodel.javamodel.members.Constructor;
import org.palladiosimulator.jdt.metamodel.javamodel.members.Field;
import org.palladiosimulator.jdt.metamodel.javamodel.members.Member;
import org.palladiosimulator.jdt.metamodel.javamodel.members.MemberContainer;
import org.palladiosimulator.jdt.metamodel.javamodel.members.MembersPackage;
import org.palladiosimulator.jdt.metamodel.javamodel.members.Method;

import org.palladiosimulator.jdt.metamodel.javamodel.modifiers.AnnotableAndModifiable;
import org.palladiosimulator.jdt.metamodel.javamodel.modifiers.AnnotationInstanceOrModifier;
import org.palladiosimulator.jdt.metamodel.javamodel.modifiers.Modifier;
import org.palladiosimulator.jdt.metamodel.javamodel.modifiers.ModifiersPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.statements.Statement;

import org.palladiosimulator.jdt.metamodel.javamodel.types.ClassifierReference;
import org.palladiosimulator.jdt.metamodel.javamodel.types.Type;
import org.palladiosimulator.jdt.metamodel.javamodel.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concrete Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.ConcreteClassifierImpl#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.ConcreteClassifierImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.ConcreteClassifierImpl#getDefaultMembers <em>Default Members</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.ConcreteClassifierImpl#getAnnotationsAndModifiers <em>Annotations And Modifiers</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ConcreteClassifierImpl extends ClassifierImpl implements ConcreteClassifier {
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
     * The cached value of the '{@link #getMembers() <em>Members</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMembers()
     * @generated
     * @ordered
     */
    protected EList<Member> members;

    /**
     * The cached value of the '{@link #getDefaultMembers() <em>Default Members</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDefaultMembers()
     * @generated
     * @ordered
     */
    protected EList<Member> defaultMembers;

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
    protected ConcreteClassifierImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ClassifiersPackage.Literals.CONCRETE_CLASSIFIER;
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
                    ClassifiersPackage.CONCRETE_CLASSIFIER__TYPE_PARAMETERS);
        }
        return typeParameters;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Member> getMembers() {
        if (members == null) {
            members = new EObjectContainmentEList<Member>(Member.class, this,
                    ClassifiersPackage.CONCRETE_CLASSIFIER__MEMBERS);
        }
        return members;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Member> getDefaultMembers() {
        if (defaultMembers == null) {
            defaultMembers = new EObjectContainmentEList<Member>(Member.class, this,
                    ClassifiersPackage.CONCRETE_CLASSIFIER__DEFAULT_MEMBERS);
        }
        return defaultMembers;
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
                    AnnotationInstanceOrModifier.class, this,
                    ClassifiersPackage.CONCRETE_CLASSIFIER__ANNOTATIONS_AND_MODIFIERS);
        }
        return annotationsAndModifiers;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<ConcreteClassifier> getInnerClassifiers() {
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<ConcreteClassifier> getAllInnerClassifiers() {
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<ClassifierReference> getSuperTypeReferences() {
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Member> getAllMembers(final Commentable context) {
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getQualifiedName() {
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isJavaLangObject(final ConcreteClassifier clazz) {
        return false;
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
    public ConcreteClassifier getContainedClassifier(final String name) {
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Field getContainedField(final String name) {
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Method getContainedMethod(final String name) {
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Method> getMethods() {
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void removeMethods(final String name) {
        return;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Member> getMembersByName(final String name) {
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Field createField(final String name, final String qualifiedTypeName) {
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Field> getFields() {
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Constructor> getConstructors() {
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
        case ClassifiersPackage.CONCRETE_CLASSIFIER__TYPE_PARAMETERS:
            return ((InternalEList<?>) getTypeParameters()).basicRemove(otherEnd, msgs);
        case ClassifiersPackage.CONCRETE_CLASSIFIER__MEMBERS:
            return ((InternalEList<?>) getMembers()).basicRemove(otherEnd, msgs);
        case ClassifiersPackage.CONCRETE_CLASSIFIER__DEFAULT_MEMBERS:
            return ((InternalEList<?>) getDefaultMembers()).basicRemove(otherEnd, msgs);
        case ClassifiersPackage.CONCRETE_CLASSIFIER__ANNOTATIONS_AND_MODIFIERS:
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
        case ClassifiersPackage.CONCRETE_CLASSIFIER__TYPE_PARAMETERS:
            return getTypeParameters();
        case ClassifiersPackage.CONCRETE_CLASSIFIER__MEMBERS:
            return getMembers();
        case ClassifiersPackage.CONCRETE_CLASSIFIER__DEFAULT_MEMBERS:
            return getDefaultMembers();
        case ClassifiersPackage.CONCRETE_CLASSIFIER__ANNOTATIONS_AND_MODIFIERS:
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
        case ClassifiersPackage.CONCRETE_CLASSIFIER__TYPE_PARAMETERS:
            getTypeParameters().clear();
            getTypeParameters().addAll((Collection<? extends TypeParameter>) newValue);
            return;
        case ClassifiersPackage.CONCRETE_CLASSIFIER__MEMBERS:
            getMembers().clear();
            getMembers().addAll((Collection<? extends Member>) newValue);
            return;
        case ClassifiersPackage.CONCRETE_CLASSIFIER__DEFAULT_MEMBERS:
            getDefaultMembers().clear();
            getDefaultMembers().addAll((Collection<? extends Member>) newValue);
            return;
        case ClassifiersPackage.CONCRETE_CLASSIFIER__ANNOTATIONS_AND_MODIFIERS:
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
        case ClassifiersPackage.CONCRETE_CLASSIFIER__TYPE_PARAMETERS:
            getTypeParameters().clear();
            return;
        case ClassifiersPackage.CONCRETE_CLASSIFIER__MEMBERS:
            getMembers().clear();
            return;
        case ClassifiersPackage.CONCRETE_CLASSIFIER__DEFAULT_MEMBERS:
            getDefaultMembers().clear();
            return;
        case ClassifiersPackage.CONCRETE_CLASSIFIER__ANNOTATIONS_AND_MODIFIERS:
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
        case ClassifiersPackage.CONCRETE_CLASSIFIER__TYPE_PARAMETERS:
            return typeParameters != null && !typeParameters.isEmpty();
        case ClassifiersPackage.CONCRETE_CLASSIFIER__MEMBERS:
            return members != null && !members.isEmpty();
        case ClassifiersPackage.CONCRETE_CLASSIFIER__DEFAULT_MEMBERS:
            return defaultMembers != null && !defaultMembers.isEmpty();
        case ClassifiersPackage.CONCRETE_CLASSIFIER__ANNOTATIONS_AND_MODIFIERS:
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
        if (baseClass == TypeParametrizable.class) {
            switch (derivedFeatureID) {
            case ClassifiersPackage.CONCRETE_CLASSIFIER__TYPE_PARAMETERS:
                return GenericsPackage.TYPE_PARAMETRIZABLE__TYPE_PARAMETERS;
            default:
                return -1;
            }
        }
        if (baseClass == MemberContainer.class) {
            switch (derivedFeatureID) {
            case ClassifiersPackage.CONCRETE_CLASSIFIER__MEMBERS:
                return MembersPackage.MEMBER_CONTAINER__MEMBERS;
            case ClassifiersPackage.CONCRETE_CLASSIFIER__DEFAULT_MEMBERS:
                return MembersPackage.MEMBER_CONTAINER__DEFAULT_MEMBERS;
            default:
                return -1;
            }
        }
        if (baseClass == Member.class) {
            switch (derivedFeatureID) {
            default:
                return -1;
            }
        }
        if (baseClass == Statement.class) {
            switch (derivedFeatureID) {
            default:
                return -1;
            }
        }
        if (baseClass == AnnotableAndModifiable.class) {
            switch (derivedFeatureID) {
            case ClassifiersPackage.CONCRETE_CLASSIFIER__ANNOTATIONS_AND_MODIFIERS:
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
        if (baseClass == TypeParametrizable.class) {
            switch (baseFeatureID) {
            case GenericsPackage.TYPE_PARAMETRIZABLE__TYPE_PARAMETERS:
                return ClassifiersPackage.CONCRETE_CLASSIFIER__TYPE_PARAMETERS;
            default:
                return -1;
            }
        }
        if (baseClass == MemberContainer.class) {
            switch (baseFeatureID) {
            case MembersPackage.MEMBER_CONTAINER__MEMBERS:
                return ClassifiersPackage.CONCRETE_CLASSIFIER__MEMBERS;
            case MembersPackage.MEMBER_CONTAINER__DEFAULT_MEMBERS:
                return ClassifiersPackage.CONCRETE_CLASSIFIER__DEFAULT_MEMBERS;
            default:
                return -1;
            }
        }
        if (baseClass == Member.class) {
            switch (baseFeatureID) {
            default:
                return -1;
            }
        }
        if (baseClass == Statement.class) {
            switch (baseFeatureID) {
            default:
                return -1;
            }
        }
        if (baseClass == AnnotableAndModifiable.class) {
            switch (baseFeatureID) {
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE__ANNOTATIONS_AND_MODIFIERS:
                return ClassifiersPackage.CONCRETE_CLASSIFIER__ANNOTATIONS_AND_MODIFIERS;
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
        if (baseClass == Type.class) {
            switch (baseOperationID) {
            case TypesPackage.TYPE___GET_ALL_MEMBERS__COMMENTABLE:
                return ClassifiersPackage.CONCRETE_CLASSIFIER___GET_ALL_MEMBERS__COMMENTABLE;
            default:
                return super.eDerivedOperationID(baseOperationID, baseClass);
            }
        }
        if (baseClass == TypeParametrizable.class) {
            switch (baseOperationID) {
            default:
                return -1;
            }
        }
        if (baseClass == MemberContainer.class) {
            switch (baseOperationID) {
            case MembersPackage.MEMBER_CONTAINER___GET_CONTAINED_CLASSIFIER__STRING:
                return ClassifiersPackage.CONCRETE_CLASSIFIER___GET_CONTAINED_CLASSIFIER__STRING;
            case MembersPackage.MEMBER_CONTAINER___GET_CONTAINED_FIELD__STRING:
                return ClassifiersPackage.CONCRETE_CLASSIFIER___GET_CONTAINED_FIELD__STRING;
            case MembersPackage.MEMBER_CONTAINER___GET_CONTAINED_METHOD__STRING:
                return ClassifiersPackage.CONCRETE_CLASSIFIER___GET_CONTAINED_METHOD__STRING;
            case MembersPackage.MEMBER_CONTAINER___GET_METHODS:
                return ClassifiersPackage.CONCRETE_CLASSIFIER___GET_METHODS;
            case MembersPackage.MEMBER_CONTAINER___REMOVE_METHODS__STRING:
                return ClassifiersPackage.CONCRETE_CLASSIFIER___REMOVE_METHODS__STRING;
            case MembersPackage.MEMBER_CONTAINER___GET_MEMBERS_BY_NAME__STRING:
                return ClassifiersPackage.CONCRETE_CLASSIFIER___GET_MEMBERS_BY_NAME__STRING;
            case MembersPackage.MEMBER_CONTAINER___CREATE_FIELD__STRING_STRING:
                return ClassifiersPackage.CONCRETE_CLASSIFIER___CREATE_FIELD__STRING_STRING;
            case MembersPackage.MEMBER_CONTAINER___GET_FIELDS:
                return ClassifiersPackage.CONCRETE_CLASSIFIER___GET_FIELDS;
            case MembersPackage.MEMBER_CONTAINER___GET_CONSTRUCTORS:
                return ClassifiersPackage.CONCRETE_CLASSIFIER___GET_CONSTRUCTORS;
            default:
                return -1;
            }
        }
        if (baseClass == Member.class) {
            switch (baseOperationID) {
            default:
                return -1;
            }
        }
        if (baseClass == Statement.class) {
            switch (baseOperationID) {
            default:
                return -1;
            }
        }
        if (baseClass == AnnotableAndModifiable.class) {
            switch (baseOperationID) {
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___IS_HIDDEN__COMMENTABLE:
                return ClassifiersPackage.CONCRETE_CLASSIFIER___IS_HIDDEN__COMMENTABLE;
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___IS_STATIC:
                return ClassifiersPackage.CONCRETE_CLASSIFIER___IS_STATIC;
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___REMOVE_MODIFIER__CLASS:
                return ClassifiersPackage.CONCRETE_CLASSIFIER___REMOVE_MODIFIER__CLASS;
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___MAKE_PUBLIC:
                return ClassifiersPackage.CONCRETE_CLASSIFIER___MAKE_PUBLIC;
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___MAKE_PRIVATE:
                return ClassifiersPackage.CONCRETE_CLASSIFIER___MAKE_PRIVATE;
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___MAKE_PROTECTED:
                return ClassifiersPackage.CONCRETE_CLASSIFIER___MAKE_PROTECTED;
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___GET_MODIFIERS:
                return ClassifiersPackage.CONCRETE_CLASSIFIER___GET_MODIFIERS;
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___REMOVE_ALL_MODIFIERS:
                return ClassifiersPackage.CONCRETE_CLASSIFIER___REMOVE_ALL_MODIFIERS;
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___HAS_MODIFIER__CLASS:
                return ClassifiersPackage.CONCRETE_CLASSIFIER___HAS_MODIFIER__CLASS;
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___IS_PUBLIC:
                return ClassifiersPackage.CONCRETE_CLASSIFIER___IS_PUBLIC;
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___IS_PRIVATE:
                return ClassifiersPackage.CONCRETE_CLASSIFIER___IS_PRIVATE;
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___IS_PROTECTED:
                return ClassifiersPackage.CONCRETE_CLASSIFIER___IS_PROTECTED;
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___ADD_MODIFIER__MODIFIER:
                return ClassifiersPackage.CONCRETE_CLASSIFIER___ADD_MODIFIER__MODIFIER;
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___GET_ANNOTATION_INSTANCES:
                return ClassifiersPackage.CONCRETE_CLASSIFIER___GET_ANNOTATION_INSTANCES;
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
        case ClassifiersPackage.CONCRETE_CLASSIFIER___GET_INNER_CLASSIFIERS:
            return getInnerClassifiers();
        case ClassifiersPackage.CONCRETE_CLASSIFIER___GET_ALL_INNER_CLASSIFIERS:
            return getAllInnerClassifiers();
        case ClassifiersPackage.CONCRETE_CLASSIFIER___GET_SUPER_TYPE_REFERENCES:
            return getSuperTypeReferences();
        case ClassifiersPackage.CONCRETE_CLASSIFIER___GET_ALL_MEMBERS__COMMENTABLE:
            return getAllMembers((Commentable) arguments.get(0));
        case ClassifiersPackage.CONCRETE_CLASSIFIER___GET_QUALIFIED_NAME:
            return getQualifiedName();
        case ClassifiersPackage.CONCRETE_CLASSIFIER___IS_JAVA_LANG_OBJECT__CONCRETECLASSIFIER:
            return isJavaLangObject((ConcreteClassifier) arguments.get(0));
        case ClassifiersPackage.CONCRETE_CLASSIFIER___IS_HIDDEN__COMMENTABLE:
            return isHidden((Commentable) arguments.get(0));
        case ClassifiersPackage.CONCRETE_CLASSIFIER___IS_STATIC:
            return isStatic();
        case ClassifiersPackage.CONCRETE_CLASSIFIER___REMOVE_MODIFIER__CLASS:
            removeModifier((Class<?>) arguments.get(0));
            return null;
        case ClassifiersPackage.CONCRETE_CLASSIFIER___MAKE_PUBLIC:
            makePublic();
            return null;
        case ClassifiersPackage.CONCRETE_CLASSIFIER___MAKE_PRIVATE:
            makePrivate();
            return null;
        case ClassifiersPackage.CONCRETE_CLASSIFIER___MAKE_PROTECTED:
            makeProtected();
            return null;
        case ClassifiersPackage.CONCRETE_CLASSIFIER___GET_MODIFIERS:
            return getModifiers();
        case ClassifiersPackage.CONCRETE_CLASSIFIER___REMOVE_ALL_MODIFIERS:
            removeAllModifiers();
            return null;
        case ClassifiersPackage.CONCRETE_CLASSIFIER___HAS_MODIFIER__CLASS:
            return hasModifier((Class<?>) arguments.get(0));
        case ClassifiersPackage.CONCRETE_CLASSIFIER___IS_PUBLIC:
            return isPublic();
        case ClassifiersPackage.CONCRETE_CLASSIFIER___IS_PRIVATE:
            return isPrivate();
        case ClassifiersPackage.CONCRETE_CLASSIFIER___IS_PROTECTED:
            return isProtected();
        case ClassifiersPackage.CONCRETE_CLASSIFIER___ADD_MODIFIER__MODIFIER:
            addModifier((Modifier) arguments.get(0));
            return null;
        case ClassifiersPackage.CONCRETE_CLASSIFIER___GET_ANNOTATION_INSTANCES:
            return getAnnotationInstances();
        case ClassifiersPackage.CONCRETE_CLASSIFIER___GET_CONTAINED_CLASSIFIER__STRING:
            return getContainedClassifier((String) arguments.get(0));
        case ClassifiersPackage.CONCRETE_CLASSIFIER___GET_CONTAINED_FIELD__STRING:
            return getContainedField((String) arguments.get(0));
        case ClassifiersPackage.CONCRETE_CLASSIFIER___GET_CONTAINED_METHOD__STRING:
            return getContainedMethod((String) arguments.get(0));
        case ClassifiersPackage.CONCRETE_CLASSIFIER___GET_METHODS:
            return getMethods();
        case ClassifiersPackage.CONCRETE_CLASSIFIER___REMOVE_METHODS__STRING:
            removeMethods((String) arguments.get(0));
            return null;
        case ClassifiersPackage.CONCRETE_CLASSIFIER___GET_MEMBERS_BY_NAME__STRING:
            return getMembersByName((String) arguments.get(0));
        case ClassifiersPackage.CONCRETE_CLASSIFIER___CREATE_FIELD__STRING_STRING:
            return createField((String) arguments.get(0), (String) arguments.get(1));
        case ClassifiersPackage.CONCRETE_CLASSIFIER___GET_FIELDS:
            return getFields();
        case ClassifiersPackage.CONCRETE_CLASSIFIER___GET_CONSTRUCTORS:
            return getConstructors();
        default:
            return super.eInvoke(operationID, arguments);
        }
    }

} //ConcreteClassifierImpl
