/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.containers.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.palladiosimulator.jdt.metamodel.javamodel.annotations.Annotable;
import org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationInstance;
import org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationsPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.ConcreteClassifier;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.CommonsPackage;
import org.palladiosimulator.jdt.metamodel.javamodel.commons.NamespaceAwareElement;

import org.palladiosimulator.jdt.metamodel.javamodel.containers.CompilationUnit;
import org.palladiosimulator.jdt.metamodel.javamodel.containers.ContainersPackage;
import org.palladiosimulator.jdt.metamodel.javamodel.containers.JavaRoot;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.containers.impl.PackageImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.containers.impl.PackageImpl#getCompilationUnits <em>Compilation Units</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageImpl extends JavaRootImpl
        implements org.palladiosimulator.jdt.metamodel.javamodel.containers.Package {
    /**
     * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAnnotations()
     * @generated
     * @ordered
     */
    protected EList<AnnotationInstance> annotations;

    /**
     * The cached value of the '{@link #getCompilationUnits() <em>Compilation Units</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCompilationUnits()
     * @generated
     * @ordered
     */
    protected EList<CompilationUnit> compilationUnits;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PackageImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ContainersPackage.Literals.PACKAGE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<AnnotationInstance> getAnnotations() {
        if (annotations == null) {
            annotations = new EObjectContainmentEList<AnnotationInstance>(AnnotationInstance.class, this,
                    ContainersPackage.PACKAGE__ANNOTATIONS);
        }
        return annotations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<CompilationUnit> getCompilationUnits() {
        if (compilationUnits == null) {
            compilationUnits = new EObjectContainmentEList<CompilationUnit>(CompilationUnit.class, this,
                    ContainersPackage.PACKAGE__COMPILATION_UNITS);
        }
        return compilationUnits;
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
    public EList<ConcreteClassifier> getClassifiersInSamePackage() {
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
        case ContainersPackage.PACKAGE__ANNOTATIONS:
            return ((InternalEList<?>) getAnnotations()).basicRemove(otherEnd, msgs);
        case ContainersPackage.PACKAGE__COMPILATION_UNITS:
            return ((InternalEList<?>) getCompilationUnits()).basicRemove(otherEnd, msgs);
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
        case ContainersPackage.PACKAGE__ANNOTATIONS:
            return getAnnotations();
        case ContainersPackage.PACKAGE__COMPILATION_UNITS:
            return getCompilationUnits();
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
        case ContainersPackage.PACKAGE__ANNOTATIONS:
            getAnnotations().clear();
            getAnnotations().addAll((Collection<? extends AnnotationInstance>) newValue);
            return;
        case ContainersPackage.PACKAGE__COMPILATION_UNITS:
            getCompilationUnits().clear();
            getCompilationUnits().addAll((Collection<? extends CompilationUnit>) newValue);
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
        case ContainersPackage.PACKAGE__ANNOTATIONS:
            getAnnotations().clear();
            return;
        case ContainersPackage.PACKAGE__COMPILATION_UNITS:
            getCompilationUnits().clear();
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
        case ContainersPackage.PACKAGE__ANNOTATIONS:
            return annotations != null && !annotations.isEmpty();
        case ContainersPackage.PACKAGE__COMPILATION_UNITS:
            return compilationUnits != null && !compilationUnits.isEmpty();
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
        if (baseClass == Annotable.class) {
            switch (derivedFeatureID) {
            case ContainersPackage.PACKAGE__ANNOTATIONS:
                return AnnotationsPackage.ANNOTABLE__ANNOTATIONS;
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
        if (baseClass == Annotable.class) {
            switch (baseFeatureID) {
            case AnnotationsPackage.ANNOTABLE__ANNOTATIONS:
                return ContainersPackage.PACKAGE__ANNOTATIONS;
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
                return ContainersPackage.PACKAGE___GET_NAMESPACES_AS_STRING;
            default:
                return super.eDerivedOperationID(baseOperationID, baseClass);
            }
        }
        if (baseClass == JavaRoot.class) {
            switch (baseOperationID) {
            case ContainersPackage.JAVA_ROOT___GET_CLASSIFIERS_IN_SAME_PACKAGE:
                return ContainersPackage.PACKAGE___GET_CLASSIFIERS_IN_SAME_PACKAGE;
            case ContainersPackage.JAVA_ROOT___GET_NAMESPACES_AS_STRING:
                return ContainersPackage.PACKAGE___GET_NAMESPACES_AS_STRING;
            default:
                return super.eDerivedOperationID(baseOperationID, baseClass);
            }
        }
        if (baseClass == Annotable.class) {
            switch (baseOperationID) {
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
        case ContainersPackage.PACKAGE___GET_NAMESPACES_AS_STRING:
            return getNamespacesAsString();
        case ContainersPackage.PACKAGE___GET_CLASSIFIERS_IN_SAME_PACKAGE:
            return getClassifiersInSamePackage();
        default:
            return super.eInvoke(operationID, arguments);
        }
    }

} //PackageImpl
