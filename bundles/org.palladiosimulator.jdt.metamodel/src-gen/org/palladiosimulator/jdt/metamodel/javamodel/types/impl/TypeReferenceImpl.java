/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.types.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Classifier;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.impl.CommentableImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.references.Reference;

import org.palladiosimulator.jdt.metamodel.javamodel.types.ClassifierReference;
import org.palladiosimulator.jdt.metamodel.javamodel.types.Type;
import org.palladiosimulator.jdt.metamodel.javamodel.types.TypeReference;
import org.palladiosimulator.jdt.metamodel.javamodel.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class TypeReferenceImpl extends CommentableImpl implements TypeReference {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TypeReferenceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TypesPackage.Literals.TYPE_REFERENCE;
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
    public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
        switch (operationID) {
        case TypesPackage.TYPE_REFERENCE___GET_TARGET:
            return getTarget();
        case TypesPackage.TYPE_REFERENCE___SET_TARGET__CLASSIFIER:
            setTarget((Classifier) arguments.get(0));
            return null;
        case TypesPackage.TYPE_REFERENCE___GET_BOUND_TARGET__REFERENCE:
            return getBoundTarget((Reference) arguments.get(0));
        case TypesPackage.TYPE_REFERENCE___GET_PURE_CLASSIFIER_REFERENCE:
            return getPureClassifierReference();
        default:
            return super.eInvoke(operationID, arguments);
        }
    }

} //TypeReferenceImpl
