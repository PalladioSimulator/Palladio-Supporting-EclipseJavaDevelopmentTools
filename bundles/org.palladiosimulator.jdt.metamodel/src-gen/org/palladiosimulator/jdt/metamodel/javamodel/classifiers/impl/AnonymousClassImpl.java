/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.AnonymousClass;
import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.ClassifiersPackage;
import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.ConcreteClassifier;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable;

import org.palladiosimulator.jdt.metamodel.javamodel.members.Constructor;
import org.palladiosimulator.jdt.metamodel.javamodel.members.Field;
import org.palladiosimulator.jdt.metamodel.javamodel.members.Member;
import org.palladiosimulator.jdt.metamodel.javamodel.members.MemberContainer;
import org.palladiosimulator.jdt.metamodel.javamodel.members.MembersPackage;
import org.palladiosimulator.jdt.metamodel.javamodel.members.Method;

import org.palladiosimulator.jdt.metamodel.javamodel.types.Type;
import org.palladiosimulator.jdt.metamodel.javamodel.types.TypesPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.types.impl.TypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Anonymous Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.AnonymousClassImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.AnonymousClassImpl#getDefaultMembers <em>Default Members</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnonymousClassImpl extends TypeImpl implements AnonymousClass {
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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AnonymousClassImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ClassifiersPackage.Literals.ANONYMOUS_CLASS;
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
                    ClassifiersPackage.ANONYMOUS_CLASS__MEMBERS);
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
                    ClassifiersPackage.ANONYMOUS_CLASS__DEFAULT_MEMBERS);
        }
        return defaultMembers;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<ConcreteClassifier> getAllSuperClassifiers() {
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ConcreteClassifier getSuperClassifier() {
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
        case ClassifiersPackage.ANONYMOUS_CLASS__MEMBERS:
            return ((InternalEList<?>) getMembers()).basicRemove(otherEnd, msgs);
        case ClassifiersPackage.ANONYMOUS_CLASS__DEFAULT_MEMBERS:
            return ((InternalEList<?>) getDefaultMembers()).basicRemove(otherEnd, msgs);
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
        case ClassifiersPackage.ANONYMOUS_CLASS__MEMBERS:
            return getMembers();
        case ClassifiersPackage.ANONYMOUS_CLASS__DEFAULT_MEMBERS:
            return getDefaultMembers();
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
        case ClassifiersPackage.ANONYMOUS_CLASS__MEMBERS:
            getMembers().clear();
            getMembers().addAll((Collection<? extends Member>) newValue);
            return;
        case ClassifiersPackage.ANONYMOUS_CLASS__DEFAULT_MEMBERS:
            getDefaultMembers().clear();
            getDefaultMembers().addAll((Collection<? extends Member>) newValue);
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
        case ClassifiersPackage.ANONYMOUS_CLASS__MEMBERS:
            getMembers().clear();
            return;
        case ClassifiersPackage.ANONYMOUS_CLASS__DEFAULT_MEMBERS:
            getDefaultMembers().clear();
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
        case ClassifiersPackage.ANONYMOUS_CLASS__MEMBERS:
            return members != null && !members.isEmpty();
        case ClassifiersPackage.ANONYMOUS_CLASS__DEFAULT_MEMBERS:
            return defaultMembers != null && !defaultMembers.isEmpty();
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
        if (baseClass == MemberContainer.class) {
            switch (derivedFeatureID) {
            case ClassifiersPackage.ANONYMOUS_CLASS__MEMBERS:
                return MembersPackage.MEMBER_CONTAINER__MEMBERS;
            case ClassifiersPackage.ANONYMOUS_CLASS__DEFAULT_MEMBERS:
                return MembersPackage.MEMBER_CONTAINER__DEFAULT_MEMBERS;
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
        if (baseClass == MemberContainer.class) {
            switch (baseFeatureID) {
            case MembersPackage.MEMBER_CONTAINER__MEMBERS:
                return ClassifiersPackage.ANONYMOUS_CLASS__MEMBERS;
            case MembersPackage.MEMBER_CONTAINER__DEFAULT_MEMBERS:
                return ClassifiersPackage.ANONYMOUS_CLASS__DEFAULT_MEMBERS;
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
                return ClassifiersPackage.ANONYMOUS_CLASS___GET_ALL_MEMBERS__COMMENTABLE;
            default:
                return super.eDerivedOperationID(baseOperationID, baseClass);
            }
        }
        if (baseClass == MemberContainer.class) {
            switch (baseOperationID) {
            case MembersPackage.MEMBER_CONTAINER___GET_CONTAINED_CLASSIFIER__STRING:
                return ClassifiersPackage.ANONYMOUS_CLASS___GET_CONTAINED_CLASSIFIER__STRING;
            case MembersPackage.MEMBER_CONTAINER___GET_CONTAINED_FIELD__STRING:
                return ClassifiersPackage.ANONYMOUS_CLASS___GET_CONTAINED_FIELD__STRING;
            case MembersPackage.MEMBER_CONTAINER___GET_CONTAINED_METHOD__STRING:
                return ClassifiersPackage.ANONYMOUS_CLASS___GET_CONTAINED_METHOD__STRING;
            case MembersPackage.MEMBER_CONTAINER___GET_METHODS:
                return ClassifiersPackage.ANONYMOUS_CLASS___GET_METHODS;
            case MembersPackage.MEMBER_CONTAINER___REMOVE_METHODS__STRING:
                return ClassifiersPackage.ANONYMOUS_CLASS___REMOVE_METHODS__STRING;
            case MembersPackage.MEMBER_CONTAINER___GET_MEMBERS_BY_NAME__STRING:
                return ClassifiersPackage.ANONYMOUS_CLASS___GET_MEMBERS_BY_NAME__STRING;
            case MembersPackage.MEMBER_CONTAINER___CREATE_FIELD__STRING_STRING:
                return ClassifiersPackage.ANONYMOUS_CLASS___CREATE_FIELD__STRING_STRING;
            case MembersPackage.MEMBER_CONTAINER___GET_FIELDS:
                return ClassifiersPackage.ANONYMOUS_CLASS___GET_FIELDS;
            case MembersPackage.MEMBER_CONTAINER___GET_CONSTRUCTORS:
                return ClassifiersPackage.ANONYMOUS_CLASS___GET_CONSTRUCTORS;
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
        case ClassifiersPackage.ANONYMOUS_CLASS___GET_ALL_SUPER_CLASSIFIERS:
            return getAllSuperClassifiers();
        case ClassifiersPackage.ANONYMOUS_CLASS___GET_SUPER_CLASSIFIER:
            return getSuperClassifier();
        case ClassifiersPackage.ANONYMOUS_CLASS___GET_ALL_MEMBERS__COMMENTABLE:
            return getAllMembers((Commentable) arguments.get(0));
        case ClassifiersPackage.ANONYMOUS_CLASS___GET_CONTAINED_CLASSIFIER__STRING:
            return getContainedClassifier((String) arguments.get(0));
        case ClassifiersPackage.ANONYMOUS_CLASS___GET_CONTAINED_FIELD__STRING:
            return getContainedField((String) arguments.get(0));
        case ClassifiersPackage.ANONYMOUS_CLASS___GET_CONTAINED_METHOD__STRING:
            return getContainedMethod((String) arguments.get(0));
        case ClassifiersPackage.ANONYMOUS_CLASS___GET_METHODS:
            return getMethods();
        case ClassifiersPackage.ANONYMOUS_CLASS___REMOVE_METHODS__STRING:
            removeMethods((String) arguments.get(0));
            return null;
        case ClassifiersPackage.ANONYMOUS_CLASS___GET_MEMBERS_BY_NAME__STRING:
            return getMembersByName((String) arguments.get(0));
        case ClassifiersPackage.ANONYMOUS_CLASS___CREATE_FIELD__STRING_STRING:
            return createField((String) arguments.get(0), (String) arguments.get(1));
        case ClassifiersPackage.ANONYMOUS_CLASS___GET_FIELDS:
            return getFields();
        case ClassifiersPackage.ANONYMOUS_CLASS___GET_CONSTRUCTORS:
            return getConstructors();
        default:
            return super.eInvoke(operationID, arguments);
        }
    }

} //AnonymousClassImpl
