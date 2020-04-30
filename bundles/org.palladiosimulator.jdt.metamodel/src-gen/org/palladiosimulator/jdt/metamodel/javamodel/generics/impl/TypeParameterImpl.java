/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.generics.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Classifier;
import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.ClassifiersPackage;
import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.ConcreteClassifier;

import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.ClassifierImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable;

import org.palladiosimulator.jdt.metamodel.javamodel.generics.GenericsPackage;
import org.palladiosimulator.jdt.metamodel.javamodel.generics.TypeParameter;

import org.palladiosimulator.jdt.metamodel.javamodel.members.Member;

import org.palladiosimulator.jdt.metamodel.javamodel.references.Reference;

import org.palladiosimulator.jdt.metamodel.javamodel.types.Type;
import org.palladiosimulator.jdt.metamodel.javamodel.types.TypeReference;
import org.palladiosimulator.jdt.metamodel.javamodel.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.generics.impl.TypeParameterImpl#getExtendTypes <em>Extend Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeParameterImpl extends ClassifierImpl implements TypeParameter {
    /**
     * The cached value of the '{@link #getExtendTypes() <em>Extend Types</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExtendTypes()
     * @generated
     * @ordered
     */
    protected EList<TypeReference> extendTypes;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TypeParameterImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return GenericsPackage.Literals.TYPE_PARAMETER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<TypeReference> getExtendTypes() {
        if (extendTypes == null) {
            extendTypes = new EObjectContainmentEList<TypeReference>(TypeReference.class, this,
                    GenericsPackage.TYPE_PARAMETER__EXTEND_TYPES);
        }
        return extendTypes;
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
    public EList<Member> getAllMembers(final Commentable context) {
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Type getBoundType(final TypeReference typeReference, final Reference reference) {
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
        case GenericsPackage.TYPE_PARAMETER__EXTEND_TYPES:
            return ((InternalEList<?>) getExtendTypes()).basicRemove(otherEnd, msgs);
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
        case GenericsPackage.TYPE_PARAMETER__EXTEND_TYPES:
            return getExtendTypes();
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
        case GenericsPackage.TYPE_PARAMETER__EXTEND_TYPES:
            getExtendTypes().clear();
            getExtendTypes().addAll((Collection<? extends TypeReference>) newValue);
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
        case GenericsPackage.TYPE_PARAMETER__EXTEND_TYPES:
            getExtendTypes().clear();
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
        case GenericsPackage.TYPE_PARAMETER__EXTEND_TYPES:
            return extendTypes != null && !extendTypes.isEmpty();
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
    public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
        if (baseClass == Type.class) {
            switch (baseOperationID) {
            case TypesPackage.TYPE___GET_ALL_MEMBERS__COMMENTABLE:
                return GenericsPackage.TYPE_PARAMETER___GET_ALL_MEMBERS__COMMENTABLE;
            default:
                return super.eDerivedOperationID(baseOperationID, baseClass);
            }
        }
        if (baseClass == Classifier.class) {
            switch (baseOperationID) {
            case ClassifiersPackage.CLASSIFIER___GET_ALL_SUPER_CLASSIFIERS:
                return GenericsPackage.TYPE_PARAMETER___GET_ALL_SUPER_CLASSIFIERS;
            default:
                return super.eDerivedOperationID(baseOperationID, baseClass);
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
        case GenericsPackage.TYPE_PARAMETER___GET_ALL_SUPER_CLASSIFIERS:
            return getAllSuperClassifiers();
        case GenericsPackage.TYPE_PARAMETER___GET_ALL_MEMBERS__COMMENTABLE:
            return getAllMembers((Commentable) arguments.get(0));
        case GenericsPackage.TYPE_PARAMETER___GET_BOUND_TYPE__TYPEREFERENCE_REFERENCE:
            return getBoundType((TypeReference) arguments.get(0), (Reference) arguments.get(1));
        default:
            return super.eInvoke(operationID, arguments);
        }
    }

} //TypeParameterImpl
