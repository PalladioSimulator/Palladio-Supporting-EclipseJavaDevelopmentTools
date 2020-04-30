/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.types.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Classifier;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable;

import org.palladiosimulator.jdt.metamodel.javamodel.members.Member;

import org.palladiosimulator.jdt.metamodel.javamodel.references.Reference;

import org.palladiosimulator.jdt.metamodel.javamodel.types.ClassifierReference;
import org.palladiosimulator.jdt.metamodel.javamodel.types.PrimitiveType;
import org.palladiosimulator.jdt.metamodel.javamodel.types.Type;
import org.palladiosimulator.jdt.metamodel.javamodel.types.TypeReference;
import org.palladiosimulator.jdt.metamodel.javamodel.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primitive Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class PrimitiveTypeImpl extends TypeImpl implements PrimitiveType {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PrimitiveTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TypesPackage.Literals.PRIMITIVE_TYPE;
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
    public org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Class wrapPrimitiveType() {
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Type getTarget() {
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTarget(final Classifier type) {
        return;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Type getBoundTarget(final Reference reference) {
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ClassifierReference getPureClassifierReference() {
        return null;
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
                return TypesPackage.PRIMITIVE_TYPE___GET_ALL_MEMBERS__COMMENTABLE;
            default:
                return super.eDerivedOperationID(baseOperationID, baseClass);
            }
        }
        if (baseClass == TypeReference.class) {
            switch (baseOperationID) {
            case TypesPackage.TYPE_REFERENCE___GET_TARGET:
                return TypesPackage.PRIMITIVE_TYPE___GET_TARGET;
            case TypesPackage.TYPE_REFERENCE___SET_TARGET__CLASSIFIER:
                return TypesPackage.PRIMITIVE_TYPE___SET_TARGET__CLASSIFIER;
            case TypesPackage.TYPE_REFERENCE___GET_BOUND_TARGET__REFERENCE:
                return TypesPackage.PRIMITIVE_TYPE___GET_BOUND_TARGET__REFERENCE;
            case TypesPackage.TYPE_REFERENCE___GET_PURE_CLASSIFIER_REFERENCE:
                return TypesPackage.PRIMITIVE_TYPE___GET_PURE_CLASSIFIER_REFERENCE;
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
        case TypesPackage.PRIMITIVE_TYPE___GET_ALL_MEMBERS__COMMENTABLE:
            return getAllMembers((Commentable) arguments.get(0));
        case TypesPackage.PRIMITIVE_TYPE___WRAP_PRIMITIVE_TYPE:
            return wrapPrimitiveType();
        case TypesPackage.PRIMITIVE_TYPE___GET_TARGET:
            return getTarget();
        case TypesPackage.PRIMITIVE_TYPE___SET_TARGET__CLASSIFIER:
            setTarget((Classifier) arguments.get(0));
            return null;
        case TypesPackage.PRIMITIVE_TYPE___GET_BOUND_TARGET__REFERENCE:
            return getBoundTarget((Reference) arguments.get(0));
        case TypesPackage.PRIMITIVE_TYPE___GET_PURE_CLASSIFIER_REFERENCE:
            return getPureClassifierReference();
        default:
            return super.eInvoke(operationID, arguments);
        }
    }

} //PrimitiveTypeImpl
