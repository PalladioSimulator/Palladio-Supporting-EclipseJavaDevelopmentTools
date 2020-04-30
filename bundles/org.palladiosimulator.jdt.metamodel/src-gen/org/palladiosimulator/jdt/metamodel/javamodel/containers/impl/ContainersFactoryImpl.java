/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.containers.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.palladiosimulator.jdt.metamodel.javamodel.containers.CompilationUnit;
import org.palladiosimulator.jdt.metamodel.javamodel.containers.ContainersFactory;
import org.palladiosimulator.jdt.metamodel.javamodel.containers.ContainersPackage;
import org.palladiosimulator.jdt.metamodel.javamodel.containers.EmptyModel;
import org.palladiosimulator.jdt.metamodel.javamodel.containers.ProjectRoot;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContainersFactoryImpl extends EFactoryImpl implements ContainersFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ContainersFactory init() {
        try {
            ContainersFactory theContainersFactory = (ContainersFactory) EPackage.Registry.INSTANCE
                    .getEFactory(ContainersPackage.eNS_URI);
            if (theContainersFactory != null) {
                return theContainersFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ContainersFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContainersFactoryImpl() {
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
        case ContainersPackage.COMPILATION_UNIT:
            return createCompilationUnit();
        case ContainersPackage.PACKAGE:
            return createPackage();
        case ContainersPackage.EMPTY_MODEL:
            return createEmptyModel();
        case ContainersPackage.PROJECT_ROOT:
            return createProjectRoot();
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
    public CompilationUnit createCompilationUnit() {
        CompilationUnitImpl compilationUnit = new CompilationUnitImpl();
        return compilationUnit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public org.palladiosimulator.jdt.metamodel.javamodel.containers.Package createPackage() {
        PackageImpl package_ = new PackageImpl();
        return package_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EmptyModel createEmptyModel() {
        EmptyModelImpl emptyModel = new EmptyModelImpl();
        return emptyModel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ProjectRoot createProjectRoot() {
        ProjectRootImpl projectRoot = new ProjectRootImpl();
        return projectRoot;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ContainersPackage getContainersPackage() {
        return (ContainersPackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ContainersPackage getPackage() {
        return ContainersPackage.eINSTANCE;
    }

} //ContainersFactoryImpl
