/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.imports.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable;
import org.palladiosimulator.jdt.metamodel.javamodel.commons.NamespaceAwareElement;

import org.palladiosimulator.jdt.metamodel.javamodel.imports.*;

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
 * @see org.palladiosimulator.jdt.metamodel.javamodel.imports.ImportsPackage
 * @generated
 */
public class ImportsSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static ImportsPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ImportsSwitch() {
        if (modelPackage == null) {
            modelPackage = ImportsPackage.eINSTANCE;
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
        case ImportsPackage.IMPORT: {
            Import import_ = (Import) theEObject;
            T result = caseImport(import_);
            if (result == null)
                result = caseNamespaceAwareElement(import_);
            if (result == null)
                result = caseCommentable(import_);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ImportsPackage.IMPORTING_ELEMENT: {
            ImportingElement importingElement = (ImportingElement) theEObject;
            T result = caseImportingElement(importingElement);
            if (result == null)
                result = caseCommentable(importingElement);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ImportsPackage.STATIC_IMPORT: {
            StaticImport staticImport = (StaticImport) theEObject;
            T result = caseStaticImport(staticImport);
            if (result == null)
                result = caseImport(staticImport);
            if (result == null)
                result = caseNamespaceAwareElement(staticImport);
            if (result == null)
                result = caseCommentable(staticImport);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ImportsPackage.CLASSIFIER_IMPORT: {
            ClassifierImport classifierImport = (ClassifierImport) theEObject;
            T result = caseClassifierImport(classifierImport);
            if (result == null)
                result = caseImport(classifierImport);
            if (result == null)
                result = caseNamespaceAwareElement(classifierImport);
            if (result == null)
                result = caseCommentable(classifierImport);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ImportsPackage.PACKAGE_IMPORT: {
            PackageImport packageImport = (PackageImport) theEObject;
            T result = casePackageImport(packageImport);
            if (result == null)
                result = caseImport(packageImport);
            if (result == null)
                result = caseNamespaceAwareElement(packageImport);
            if (result == null)
                result = caseCommentable(packageImport);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ImportsPackage.STATIC_CLASSIFIER_IMPORT: {
            StaticClassifierImport staticClassifierImport = (StaticClassifierImport) theEObject;
            T result = caseStaticClassifierImport(staticClassifierImport);
            if (result == null)
                result = caseStaticImport(staticClassifierImport);
            if (result == null)
                result = caseImport(staticClassifierImport);
            if (result == null)
                result = caseNamespaceAwareElement(staticClassifierImport);
            if (result == null)
                result = caseCommentable(staticClassifierImport);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ImportsPackage.STATIC_MEMBER_IMPORT: {
            StaticMemberImport staticMemberImport = (StaticMemberImport) theEObject;
            T result = caseStaticMemberImport(staticMemberImport);
            if (result == null)
                result = caseStaticImport(staticMemberImport);
            if (result == null)
                result = caseImport(staticMemberImport);
            if (result == null)
                result = caseNamespaceAwareElement(staticMemberImport);
            if (result == null)
                result = caseCommentable(staticMemberImport);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        default:
            return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Import</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseImport(Import object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Static Import</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Static Import</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStaticImport(StaticImport object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Classifier Import</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Classifier Import</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseClassifierImport(ClassifierImport object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Package Import</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Package Import</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePackageImport(PackageImport object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Static Classifier Import</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Static Classifier Import</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStaticClassifierImport(StaticClassifierImport object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Static Member Import</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Static Member Import</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStaticMemberImport(StaticMemberImport object) {
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

} //ImportsSwitch
