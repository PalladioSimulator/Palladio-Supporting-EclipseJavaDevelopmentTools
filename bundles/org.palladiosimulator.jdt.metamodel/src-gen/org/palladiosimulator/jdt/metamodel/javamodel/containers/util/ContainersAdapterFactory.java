/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.containers.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.jdt.metamodel.javamodel.annotations.Annotable;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable;
import org.palladiosimulator.jdt.metamodel.javamodel.commons.NamedElement;
import org.palladiosimulator.jdt.metamodel.javamodel.commons.NamespaceAwareElement;

import org.palladiosimulator.jdt.metamodel.javamodel.containers.CompilationUnit;
import org.palladiosimulator.jdt.metamodel.javamodel.containers.ContainersPackage;
import org.palladiosimulator.jdt.metamodel.javamodel.containers.EmptyModel;
import org.palladiosimulator.jdt.metamodel.javamodel.containers.JavaRoot;
import org.palladiosimulator.jdt.metamodel.javamodel.containers.ProjectRoot;

import org.palladiosimulator.jdt.metamodel.javamodel.imports.ImportingElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.jdt.metamodel.javamodel.containers.ContainersPackage
 * @generated
 */
public class ContainersAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static ContainersPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContainersAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = ContainersPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject) object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ContainersSwitch<Adapter> modelSwitch = new ContainersSwitch<Adapter>() {
        @Override
        public Adapter caseJavaRoot(JavaRoot object) {
            return createJavaRootAdapter();
        }

        @Override
        public Adapter caseCompilationUnit(CompilationUnit object) {
            return createCompilationUnitAdapter();
        }

        @Override
        public Adapter casePackage(org.palladiosimulator.jdt.metamodel.javamodel.containers.Package object) {
            return createPackageAdapter();
        }

        @Override
        public Adapter caseEmptyModel(EmptyModel object) {
            return createEmptyModelAdapter();
        }

        @Override
        public Adapter caseProjectRoot(ProjectRoot object) {
            return createProjectRootAdapter();
        }

        @Override
        public Adapter caseCommentable(Commentable object) {
            return createCommentableAdapter();
        }

        @Override
        public Adapter caseNamedElement(NamedElement object) {
            return createNamedElementAdapter();
        }

        @Override
        public Adapter caseNamespaceAwareElement(NamespaceAwareElement object) {
            return createNamespaceAwareElementAdapter();
        }

        @Override
        public Adapter caseImportingElement(ImportingElement object) {
            return createImportingElementAdapter();
        }

        @Override
        public Adapter caseAnnotable(Annotable object) {
            return createAnnotableAdapter();
        }

        @Override
        public Adapter defaultCase(EObject object) {
            return createEObjectAdapter();
        }
    };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject) target);
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.containers.JavaRoot <em>Java Root</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.containers.JavaRoot
     * @generated
     */
    public Adapter createJavaRootAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.containers.CompilationUnit <em>Compilation Unit</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.containers.CompilationUnit
     * @generated
     */
    public Adapter createCompilationUnitAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.containers.Package <em>Package</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.containers.Package
     * @generated
     */
    public Adapter createPackageAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.containers.EmptyModel <em>Empty Model</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.containers.EmptyModel
     * @generated
     */
    public Adapter createEmptyModelAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.containers.ProjectRoot <em>Project Root</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.containers.ProjectRoot
     * @generated
     */
    public Adapter createProjectRootAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable <em>Commentable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable
     * @generated
     */
    public Adapter createCommentableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.commons.NamedElement <em>Named Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.commons.NamedElement
     * @generated
     */
    public Adapter createNamedElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.commons.NamespaceAwareElement <em>Namespace Aware Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.commons.NamespaceAwareElement
     * @generated
     */
    public Adapter createNamespaceAwareElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.imports.ImportingElement <em>Importing Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.imports.ImportingElement
     * @generated
     */
    public Adapter createImportingElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.annotations.Annotable <em>Annotable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.annotations.Annotable
     * @generated
     */
    public Adapter createAnnotableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //ContainersAdapterFactory
