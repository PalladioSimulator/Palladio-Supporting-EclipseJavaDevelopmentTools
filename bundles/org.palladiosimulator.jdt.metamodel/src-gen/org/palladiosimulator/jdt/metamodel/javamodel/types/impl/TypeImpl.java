/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.types.impl;

import java.lang.Long;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayTypeable;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.impl.CommentableImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.members.Member;

import org.palladiosimulator.jdt.metamodel.javamodel.types.Type;
import org.palladiosimulator.jdt.metamodel.javamodel.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class TypeImpl extends CommentableImpl implements Type {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TypesPackage.Literals.TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean equalsType(final long arrayDimension, final Type otherType, final long otherArrayDimension) {
        return false;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSuperType(final long arrayDimension, final Type otherType, final ArrayTypeable otherArrayType) {
        return false;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Member> getAllMembers(final Commentable context) {
        // method has to be specified in subclasses
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
        switch (operationID) {
        case TypesPackage.TYPE___EQUALS_TYPE__LONG_TYPE_LONG:
            return equalsType((Long) arguments.get(0), (Type) arguments.get(1), (Long) arguments.get(2));
        case TypesPackage.TYPE___IS_SUPER_TYPE__LONG_TYPE_ARRAYTYPEABLE:
            return isSuperType((Long) arguments.get(0), (Type) arguments.get(1), (ArrayTypeable) arguments.get(2));
        case TypesPackage.TYPE___GET_ALL_MEMBERS__COMMENTABLE:
            return getAllMembers((Commentable) arguments.get(0));
        default:
            return super.eInvoke(operationID, arguments);
        }
    }

} //TypeImpl
