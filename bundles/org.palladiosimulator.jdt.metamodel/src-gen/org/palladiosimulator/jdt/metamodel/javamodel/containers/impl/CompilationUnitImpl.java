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

import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Annotation;
import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.ConcreteClassifier;
import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Enumeration;
import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Interface;

import org.palladiosimulator.jdt.metamodel.javamodel.containers.CompilationUnit;
import org.palladiosimulator.jdt.metamodel.javamodel.containers.ContainersPackage;
import org.palladiosimulator.jdt.metamodel.javamodel.containers.JavaRoot;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compilation Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.containers.impl.CompilationUnitImpl#getClassifiers <em>Classifiers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompilationUnitImpl extends JavaRootImpl implements CompilationUnit {
    /**
     * The cached value of the '{@link #getClassifiers() <em>Classifiers</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getClassifiers()
     * @generated
     * @ordered
     */
    protected EList<ConcreteClassifier> classifiers;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CompilationUnitImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ContainersPackage.Literals.COMPILATION_UNIT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<ConcreteClassifier> getClassifiers() {
        if (classifiers == null) {
            classifiers = new EObjectContainmentEList<ConcreteClassifier>(ConcreteClassifier.class, this,
                    ContainersPackage.COMPILATION_UNIT__CLASSIFIERS);
        }
        return classifiers;
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
    public EList<ConcreteClassifier> getClassifiersInSamePackage() {
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Class getContainedClass() {
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Interface getContainedInterface() {
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Annotation getContainedAnnotation() {
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Enumeration getContainedEnumeration() {
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void addImport(final String nameOfClassToImport) {
        return;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void addPackageImport(final String packageName) {
        return;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case ContainersPackage.COMPILATION_UNIT__CLASSIFIERS:
            return ((InternalEList<?>) getClassifiers()).basicRemove(otherEnd, msgs);
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
        case ContainersPackage.COMPILATION_UNIT__CLASSIFIERS:
            return getClassifiers();
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
        case ContainersPackage.COMPILATION_UNIT__CLASSIFIERS:
            getClassifiers().clear();
            getClassifiers().addAll((Collection<? extends ConcreteClassifier>) newValue);
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
        case ContainersPackage.COMPILATION_UNIT__CLASSIFIERS:
            getClassifiers().clear();
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
        case ContainersPackage.COMPILATION_UNIT__CLASSIFIERS:
            return classifiers != null && !classifiers.isEmpty();
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
        if (baseClass == JavaRoot.class) {
            switch (baseOperationID) {
            case ContainersPackage.JAVA_ROOT___GET_CLASSIFIERS_IN_SAME_PACKAGE:
                return ContainersPackage.COMPILATION_UNIT___GET_CLASSIFIERS_IN_SAME_PACKAGE;
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
        case ContainersPackage.COMPILATION_UNIT___GET_CONTAINED_CLASSIFIER__STRING:
            return getContainedClassifier((String) arguments.get(0));
        case ContainersPackage.COMPILATION_UNIT___GET_CLASSIFIERS_IN_SAME_PACKAGE:
            return getClassifiersInSamePackage();
        case ContainersPackage.COMPILATION_UNIT___GET_CONTAINED_CLASS:
            return getContainedClass();
        case ContainersPackage.COMPILATION_UNIT___GET_CONTAINED_INTERFACE:
            return getContainedInterface();
        case ContainersPackage.COMPILATION_UNIT___GET_CONTAINED_ANNOTATION:
            return getContainedAnnotation();
        case ContainersPackage.COMPILATION_UNIT___GET_CONTAINED_ENUMERATION:
            return getContainedEnumeration();
        case ContainersPackage.COMPILATION_UNIT___ADD_IMPORT__STRING:
            addImport((String) arguments.get(0));
            return null;
        case ContainersPackage.COMPILATION_UNIT___ADD_PACKAGE_IMPORT__STRING:
            addPackageImport((String) arguments.get(0));
            return null;
        default:
            return super.eInvoke(operationID, arguments);
        }
    }

} //CompilationUnitImpl
