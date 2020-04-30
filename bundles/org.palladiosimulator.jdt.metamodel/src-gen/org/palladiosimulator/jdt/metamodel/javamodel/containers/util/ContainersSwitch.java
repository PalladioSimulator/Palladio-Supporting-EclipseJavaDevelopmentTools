/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.containers.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.jdt.metamodel.javamodel.containers.ContainersPackage
 * @generated
 */
public class ContainersSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static ContainersPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContainersSwitch() {
        if (modelPackage == null) {
            modelPackage = ContainersPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
        case ContainersPackage.JAVA_ROOT: {
            JavaRoot javaRoot = (JavaRoot) theEObject;
            T result = caseJavaRoot(javaRoot);
            if (result == null)
                result = caseNamedElement(javaRoot);
            if (result == null)
                result = caseNamespaceAwareElement(javaRoot);
            if (result == null)
                result = caseImportingElement(javaRoot);
            if (result == null)
                result = caseCommentable(javaRoot);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ContainersPackage.COMPILATION_UNIT: {
            CompilationUnit compilationUnit = (CompilationUnit) theEObject;
            T result = caseCompilationUnit(compilationUnit);
            if (result == null)
                result = caseJavaRoot(compilationUnit);
            if (result == null)
                result = caseNamedElement(compilationUnit);
            if (result == null)
                result = caseNamespaceAwareElement(compilationUnit);
            if (result == null)
                result = caseImportingElement(compilationUnit);
            if (result == null)
                result = caseCommentable(compilationUnit);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ContainersPackage.PACKAGE: {
            org.palladiosimulator.jdt.metamodel.javamodel.containers.Package package_ = (org.palladiosimulator.jdt.metamodel.javamodel.containers.Package) theEObject;
            T result = casePackage(package_);
            if (result == null)
                result = caseJavaRoot(package_);
            if (result == null)
                result = caseAnnotable(package_);
            if (result == null)
                result = caseNamedElement(package_);
            if (result == null)
                result = caseNamespaceAwareElement(package_);
            if (result == null)
                result = caseImportingElement(package_);
            if (result == null)
                result = caseCommentable(package_);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ContainersPackage.EMPTY_MODEL: {
            EmptyModel emptyModel = (EmptyModel) theEObject;
            T result = caseEmptyModel(emptyModel);
            if (result == null)
                result = caseJavaRoot(emptyModel);
            if (result == null)
                result = caseNamedElement(emptyModel);
            if (result == null)
                result = caseNamespaceAwareElement(emptyModel);
            if (result == null)
                result = caseImportingElement(emptyModel);
            if (result == null)
                result = caseCommentable(emptyModel);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ContainersPackage.PROJECT_ROOT: {
            ProjectRoot projectRoot = (ProjectRoot) theEObject;
            T result = caseProjectRoot(projectRoot);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        default:
            return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Java Root</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Java Root</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseJavaRoot(JavaRoot object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Compilation Unit</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Compilation Unit</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCompilationUnit(CompilationUnit object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Package</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePackage(org.palladiosimulator.jdt.metamodel.javamodel.containers.Package object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Empty Model</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Empty Model</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEmptyModel(EmptyModel object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Project Root</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Project Root</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProjectRoot(ProjectRoot object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Commentable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Commentable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCommentable(Commentable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNamedElement(NamedElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Namespace Aware Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Namespace Aware Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNamespaceAwareElement(NamespaceAwareElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Importing Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Importing Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseImportingElement(ImportingElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Annotable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Annotable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAnnotable(Annotable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(EObject object) {
        return null;
    }

} //ContainersSwitch
