/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.imports.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.palladiosimulator.jdt.metamodel.javamodel.imports.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ImportsFactoryImpl extends EFactoryImpl implements ImportsFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ImportsFactory init() {
        try {
            ImportsFactory theImportsFactory = (ImportsFactory) EPackage.Registry.INSTANCE
                    .getEFactory(ImportsPackage.eNS_URI);
            if (theImportsFactory != null) {
                return theImportsFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ImportsFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ImportsFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
        case ImportsPackage.CLASSIFIER_IMPORT:
            return createClassifierImport();
        case ImportsPackage.PACKAGE_IMPORT:
            return createPackageImport();
        case ImportsPackage.STATIC_CLASSIFIER_IMPORT:
            return createStaticClassifierImport();
        case ImportsPackage.STATIC_MEMBER_IMPORT:
            return createStaticMemberImport();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ClassifierImport createClassifierImport() {
        ClassifierImportImpl classifierImport = new ClassifierImportImpl();
        return classifierImport;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PackageImport createPackageImport() {
        PackageImportImpl packageImport = new PackageImportImpl();
        return packageImport;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public StaticClassifierImport createStaticClassifierImport() {
        StaticClassifierImportImpl staticClassifierImport = new StaticClassifierImportImpl();
        return staticClassifierImport;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public StaticMemberImport createStaticMemberImport() {
        StaticMemberImportImpl staticMemberImport = new StaticMemberImportImpl();
        return staticMemberImport;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ImportsPackage getImportsPackage() {
        return (ImportsPackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ImportsPackage getPackage() {
        return ImportsPackage.eINSTANCE;
    }

} //ImportsFactoryImpl
