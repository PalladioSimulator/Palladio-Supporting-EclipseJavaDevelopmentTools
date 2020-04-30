/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.members.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.ConcreteClassifier;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.impl.CommentableImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.members.Constructor;
import org.palladiosimulator.jdt.metamodel.javamodel.members.Field;
import org.palladiosimulator.jdt.metamodel.javamodel.members.Member;
import org.palladiosimulator.jdt.metamodel.javamodel.members.MemberContainer;
import org.palladiosimulator.jdt.metamodel.javamodel.members.MembersPackage;
import org.palladiosimulator.jdt.metamodel.javamodel.members.Method;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Member Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.members.impl.MemberContainerImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.members.impl.MemberContainerImpl#getDefaultMembers <em>Default Members</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MemberContainerImpl extends CommentableImpl implements MemberContainer {
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
    protected MemberContainerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MembersPackage.Literals.MEMBER_CONTAINER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Member> getMembers() {
        if (members == null) {
            members = new EObjectContainmentEList<Member>(Member.class, this, MembersPackage.MEMBER_CONTAINER__MEMBERS);
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
                    MembersPackage.MEMBER_CONTAINER__DEFAULT_MEMBERS);
        }
        return defaultMembers;
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
        case MembersPackage.MEMBER_CONTAINER__MEMBERS:
            return ((InternalEList<?>) getMembers()).basicRemove(otherEnd, msgs);
        case MembersPackage.MEMBER_CONTAINER__DEFAULT_MEMBERS:
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
        case MembersPackage.MEMBER_CONTAINER__MEMBERS:
            return getMembers();
        case MembersPackage.MEMBER_CONTAINER__DEFAULT_MEMBERS:
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
        case MembersPackage.MEMBER_CONTAINER__MEMBERS:
            getMembers().clear();
            getMembers().addAll((Collection<? extends Member>) newValue);
            return;
        case MembersPackage.MEMBER_CONTAINER__DEFAULT_MEMBERS:
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
        case MembersPackage.MEMBER_CONTAINER__MEMBERS:
            getMembers().clear();
            return;
        case MembersPackage.MEMBER_CONTAINER__DEFAULT_MEMBERS:
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
        case MembersPackage.MEMBER_CONTAINER__MEMBERS:
            return members != null && !members.isEmpty();
        case MembersPackage.MEMBER_CONTAINER__DEFAULT_MEMBERS:
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
    public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
        switch (operationID) {
        case MembersPackage.MEMBER_CONTAINER___GET_CONTAINED_CLASSIFIER__STRING:
            return getContainedClassifier((String) arguments.get(0));
        case MembersPackage.MEMBER_CONTAINER___GET_CONTAINED_FIELD__STRING:
            return getContainedField((String) arguments.get(0));
        case MembersPackage.MEMBER_CONTAINER___GET_CONTAINED_METHOD__STRING:
            return getContainedMethod((String) arguments.get(0));
        case MembersPackage.MEMBER_CONTAINER___GET_METHODS:
            return getMethods();
        case MembersPackage.MEMBER_CONTAINER___REMOVE_METHODS__STRING:
            removeMethods((String) arguments.get(0));
            return null;
        case MembersPackage.MEMBER_CONTAINER___GET_MEMBERS_BY_NAME__STRING:
            return getMembersByName((String) arguments.get(0));
        case MembersPackage.MEMBER_CONTAINER___CREATE_FIELD__STRING_STRING:
            return createField((String) arguments.get(0), (String) arguments.get(1));
        case MembersPackage.MEMBER_CONTAINER___GET_FIELDS:
            return getFields();
        case MembersPackage.MEMBER_CONTAINER___GET_CONSTRUCTORS:
            return getConstructors();
        default:
            return super.eInvoke(operationID, arguments);
        }
    }

} //MemberContainerImpl
