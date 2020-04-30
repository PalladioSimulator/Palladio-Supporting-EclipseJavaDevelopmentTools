/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.types.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.ConcreteClassifier;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.CommonsPackage;
import org.palladiosimulator.jdt.metamodel.javamodel.commons.NamespaceAwareElement;

import org.palladiosimulator.jdt.metamodel.javamodel.types.ClassifierReference;
import org.palladiosimulator.jdt.metamodel.javamodel.types.NamespaceClassifierReference;
import org.palladiosimulator.jdt.metamodel.javamodel.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Namespace Classifier Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.types.impl.NamespaceClassifierReferenceImpl#getNamespaces <em>Namespaces</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.types.impl.NamespaceClassifierReferenceImpl#getClassifierReferences <em>Classifier References</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NamespaceClassifierReferenceImpl extends TypeReferenceImpl implements NamespaceClassifierReference {
    /**
     * The cached value of the '{@link #getNamespaces() <em>Namespaces</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNamespaces()
     * @generated
     * @ordered
     */
    protected EList<String> namespaces;

    /**
     * The cached value of the '{@link #getClassifierReferences() <em>Classifier References</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getClassifierReferences()
     * @generated
     * @ordered
     */
    protected EList<ClassifierReference> classifierReferences;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected NamespaceClassifierReferenceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TypesPackage.Literals.NAMESPACE_CLASSIFIER_REFERENCE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<String> getNamespaces() {
        if (namespaces == null) {
            namespaces = new EDataTypeEList<String>(String.class, this,
                    TypesPackage.NAMESPACE_CLASSIFIER_REFERENCE__NAMESPACES);
        }
        return namespaces;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<ClassifierReference> getClassifierReferences() {
        if (classifierReferences == null) {
            classifierReferences = new EObjectContainmentEList<ClassifierReference>(ClassifierReference.class, this,
                    TypesPackage.NAMESPACE_CLASSIFIER_REFERENCE__CLASSIFIER_REFERENCES);
        }
        return classifierReferences;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getNamespacesAsString() {
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ConcreteClassifier getClassifierAtNamespaces() {
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
        case TypesPackage.NAMESPACE_CLASSIFIER_REFERENCE__CLASSIFIER_REFERENCES:
            return ((InternalEList<?>) getClassifierReferences()).basicRemove(otherEnd, msgs);
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
        case TypesPackage.NAMESPACE_CLASSIFIER_REFERENCE__NAMESPACES:
            return getNamespaces();
        case TypesPackage.NAMESPACE_CLASSIFIER_REFERENCE__CLASSIFIER_REFERENCES:
            return getClassifierReferences();
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
        case TypesPackage.NAMESPACE_CLASSIFIER_REFERENCE__NAMESPACES:
            getNamespaces().clear();
            getNamespaces().addAll((Collection<? extends String>) newValue);
            return;
        case TypesPackage.NAMESPACE_CLASSIFIER_REFERENCE__CLASSIFIER_REFERENCES:
            getClassifierReferences().clear();
            getClassifierReferences().addAll((Collection<? extends ClassifierReference>) newValue);
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
        case TypesPackage.NAMESPACE_CLASSIFIER_REFERENCE__NAMESPACES:
            getNamespaces().clear();
            return;
        case TypesPackage.NAMESPACE_CLASSIFIER_REFERENCE__CLASSIFIER_REFERENCES:
            getClassifierReferences().clear();
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
        case TypesPackage.NAMESPACE_CLASSIFIER_REFERENCE__NAMESPACES:
            return namespaces != null && !namespaces.isEmpty();
        case TypesPackage.NAMESPACE_CLASSIFIER_REFERENCE__CLASSIFIER_REFERENCES:
            return classifierReferences != null && !classifierReferences.isEmpty();
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
        if (baseClass == NamespaceAwareElement.class) {
            switch (derivedFeatureID) {
            case TypesPackage.NAMESPACE_CLASSIFIER_REFERENCE__NAMESPACES:
                return CommonsPackage.NAMESPACE_AWARE_ELEMENT__NAMESPACES;
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
        if (baseClass == NamespaceAwareElement.class) {
            switch (baseFeatureID) {
            case CommonsPackage.NAMESPACE_AWARE_ELEMENT__NAMESPACES:
                return TypesPackage.NAMESPACE_CLASSIFIER_REFERENCE__NAMESPACES;
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
        if (baseClass == NamespaceAwareElement.class) {
            switch (baseOperationID) {
            case CommonsPackage.NAMESPACE_AWARE_ELEMENT___GET_NAMESPACES_AS_STRING:
                return TypesPackage.NAMESPACE_CLASSIFIER_REFERENCE___GET_NAMESPACES_AS_STRING;
            case CommonsPackage.NAMESPACE_AWARE_ELEMENT___GET_CLASSIFIER_AT_NAMESPACES:
                return TypesPackage.NAMESPACE_CLASSIFIER_REFERENCE___GET_CLASSIFIER_AT_NAMESPACES;
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
        case TypesPackage.NAMESPACE_CLASSIFIER_REFERENCE___GET_NAMESPACES_AS_STRING:
            return getNamespacesAsString();
        case TypesPackage.NAMESPACE_CLASSIFIER_REFERENCE___GET_CLASSIFIER_AT_NAMESPACES:
            return getClassifierAtNamespaces();
        default:
            return super.eInvoke(operationID, arguments);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy())
            return super.toString();

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (namespaces: ");
        result.append(namespaces);
        result.append(')');
        return result.toString();
    }

} //NamespaceClassifierReferenceImpl
