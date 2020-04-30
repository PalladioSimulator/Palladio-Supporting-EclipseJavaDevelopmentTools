/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.containers.impl;

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

import org.palladiosimulator.jdt.metamodel.javamodel.commons.impl.NamedElementImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.containers.ContainersPackage;
import org.palladiosimulator.jdt.metamodel.javamodel.containers.JavaRoot;

import org.palladiosimulator.jdt.metamodel.javamodel.imports.Import;
import org.palladiosimulator.jdt.metamodel.javamodel.imports.ImportingElement;
import org.palladiosimulator.jdt.metamodel.javamodel.imports.ImportsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.containers.impl.JavaRootImpl#getNamespaces <em>Namespaces</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.containers.impl.JavaRootImpl#getImports <em>Imports</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class JavaRootImpl extends NamedElementImpl implements JavaRoot {
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
     * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getImports()
     * @generated
     * @ordered
     */
    protected EList<Import> imports;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected JavaRootImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ContainersPackage.Literals.JAVA_ROOT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<String> getNamespaces() {
        if (namespaces == null) {
            namespaces = new EDataTypeEList<String>(String.class, this, ContainersPackage.JAVA_ROOT__NAMESPACES);
        }
        return namespaces;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Import> getImports() {
        if (imports == null) {
            imports = new EObjectContainmentEList<Import>(Import.class, this, ContainersPackage.JAVA_ROOT__IMPORTS);
        }
        return imports;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<ConcreteClassifier> getClassifiersInSamePackage() {
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<ConcreteClassifier> getDefaultImports() {
        return null;
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
        case ContainersPackage.JAVA_ROOT__IMPORTS:
            return ((InternalEList<?>) getImports()).basicRemove(otherEnd, msgs);
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
        case ContainersPackage.JAVA_ROOT__NAMESPACES:
            return getNamespaces();
        case ContainersPackage.JAVA_ROOT__IMPORTS:
            return getImports();
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
        case ContainersPackage.JAVA_ROOT__NAMESPACES:
            getNamespaces().clear();
            getNamespaces().addAll((Collection<? extends String>) newValue);
            return;
        case ContainersPackage.JAVA_ROOT__IMPORTS:
            getImports().clear();
            getImports().addAll((Collection<? extends Import>) newValue);
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
        case ContainersPackage.JAVA_ROOT__NAMESPACES:
            getNamespaces().clear();
            return;
        case ContainersPackage.JAVA_ROOT__IMPORTS:
            getImports().clear();
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
        case ContainersPackage.JAVA_ROOT__NAMESPACES:
            return namespaces != null && !namespaces.isEmpty();
        case ContainersPackage.JAVA_ROOT__IMPORTS:
            return imports != null && !imports.isEmpty();
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
            case ContainersPackage.JAVA_ROOT__NAMESPACES:
                return CommonsPackage.NAMESPACE_AWARE_ELEMENT__NAMESPACES;
            default:
                return -1;
            }
        }
        if (baseClass == ImportingElement.class) {
            switch (derivedFeatureID) {
            case ContainersPackage.JAVA_ROOT__IMPORTS:
                return ImportsPackage.IMPORTING_ELEMENT__IMPORTS;
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
                return ContainersPackage.JAVA_ROOT__NAMESPACES;
            default:
                return -1;
            }
        }
        if (baseClass == ImportingElement.class) {
            switch (baseFeatureID) {
            case ImportsPackage.IMPORTING_ELEMENT__IMPORTS:
                return ContainersPackage.JAVA_ROOT__IMPORTS;
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
                return ContainersPackage.JAVA_ROOT___GET_NAMESPACES_AS_STRING;
            case CommonsPackage.NAMESPACE_AWARE_ELEMENT___GET_CLASSIFIER_AT_NAMESPACES:
                return ContainersPackage.JAVA_ROOT___GET_CLASSIFIER_AT_NAMESPACES;
            default:
                return -1;
            }
        }
        if (baseClass == ImportingElement.class) {
            switch (baseOperationID) {
            case ImportsPackage.IMPORTING_ELEMENT___GET_DEFAULT_IMPORTS:
                return ContainersPackage.JAVA_ROOT___GET_DEFAULT_IMPORTS;
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
        case ContainersPackage.JAVA_ROOT___GET_CLASSIFIERS_IN_SAME_PACKAGE:
            return getClassifiersInSamePackage();
        case ContainersPackage.JAVA_ROOT___GET_DEFAULT_IMPORTS:
            return getDefaultImports();
        case ContainersPackage.JAVA_ROOT___GET_NAMESPACES_AS_STRING:
            return getNamespacesAsString();
        case ContainersPackage.JAVA_ROOT___GET_CLASSIFIER_AT_NAMESPACES:
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

} //JavaRootImpl
