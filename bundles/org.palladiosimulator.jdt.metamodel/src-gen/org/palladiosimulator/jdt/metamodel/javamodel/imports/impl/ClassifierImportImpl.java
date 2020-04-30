/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.imports.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.ConcreteClassifier;

import org.palladiosimulator.jdt.metamodel.javamodel.imports.ClassifierImport;
import org.palladiosimulator.jdt.metamodel.javamodel.imports.ImportsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classifier Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.imports.impl.ClassifierImportImpl#getClassifier <em>Classifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassifierImportImpl extends ImportImpl implements ClassifierImport {
    /**
     * The cached value of the '{@link #getClassifier() <em>Classifier</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getClassifier()
     * @generated
     * @ordered
     */
    protected ConcreteClassifier classifier;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ClassifierImportImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ImportsPackage.Literals.CLASSIFIER_IMPORT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ConcreteClassifier getClassifier() {
        if (classifier != null && classifier.eIsProxy()) {
            InternalEObject oldClassifier = (InternalEObject) classifier;
            classifier = (ConcreteClassifier) eResolveProxy(oldClassifier);
            if (classifier != oldClassifier) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            ImportsPackage.CLASSIFIER_IMPORT__CLASSIFIER, oldClassifier, classifier));
            }
        }
        return classifier;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConcreteClassifier basicGetClassifier() {
        return classifier;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setClassifier(ConcreteClassifier newClassifier) {
        ConcreteClassifier oldClassifier = classifier;
        classifier = newClassifier;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImportsPackage.CLASSIFIER_IMPORT__CLASSIFIER,
                    oldClassifier, classifier));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case ImportsPackage.CLASSIFIER_IMPORT__CLASSIFIER:
            if (resolve)
                return getClassifier();
            return basicGetClassifier();
        default:
            return super.eGet(featureID, resolve, coreType);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case ImportsPackage.CLASSIFIER_IMPORT__CLASSIFIER:
            setClassifier((ConcreteClassifier) newValue);
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
        case ImportsPackage.CLASSIFIER_IMPORT__CLASSIFIER:
            setClassifier((ConcreteClassifier) null);
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
        case ImportsPackage.CLASSIFIER_IMPORT__CLASSIFIER:
            return classifier != null;
        default:
            return super.eIsSet(featureID);
        }
    }

} //ClassifierImportImpl
