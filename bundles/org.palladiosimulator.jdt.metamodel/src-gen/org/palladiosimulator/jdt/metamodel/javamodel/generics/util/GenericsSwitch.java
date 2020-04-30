/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.generics.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayTypeable;

import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Classifier;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable;
import org.palladiosimulator.jdt.metamodel.javamodel.commons.NamedElement;

import org.palladiosimulator.jdt.metamodel.javamodel.generics.*;

import org.palladiosimulator.jdt.metamodel.javamodel.references.ReferenceableElement;

import org.palladiosimulator.jdt.metamodel.javamodel.types.Type;
import org.palladiosimulator.jdt.metamodel.javamodel.types.TypedElement;

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
 * @see org.palladiosimulator.jdt.metamodel.javamodel.generics.GenericsPackage
 * @generated
 */
public class GenericsSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static GenericsPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GenericsSwitch() {
        if (modelPackage == null) {
            modelPackage = GenericsPackage.eINSTANCE;
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
        case GenericsPackage.TYPE_ARGUMENT: {
            TypeArgument typeArgument = (TypeArgument) theEObject;
            T result = caseTypeArgument(typeArgument);
            if (result == null)
                result = caseArrayTypeable(typeArgument);
            if (result == null)
                result = caseCommentable(typeArgument);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case GenericsPackage.TYPE_ARGUMENTABLE: {
            TypeArgumentable typeArgumentable = (TypeArgumentable) theEObject;
            T result = caseTypeArgumentable(typeArgumentable);
            if (result == null)
                result = caseCommentable(typeArgumentable);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case GenericsPackage.CALL_TYPE_ARGUMENTABLE: {
            CallTypeArgumentable callTypeArgumentable = (CallTypeArgumentable) theEObject;
            T result = caseCallTypeArgumentable(callTypeArgumentable);
            if (result == null)
                result = caseCommentable(callTypeArgumentable);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case GenericsPackage.TYPE_PARAMETRIZABLE: {
            TypeParametrizable typeParametrizable = (TypeParametrizable) theEObject;
            T result = caseTypeParametrizable(typeParametrizable);
            if (result == null)
                result = caseCommentable(typeParametrizable);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case GenericsPackage.EXTENDS_TYPE_ARGUMENT: {
            ExtendsTypeArgument extendsTypeArgument = (ExtendsTypeArgument) theEObject;
            T result = caseExtendsTypeArgument(extendsTypeArgument);
            if (result == null)
                result = caseTypeArgument(extendsTypeArgument);
            if (result == null)
                result = caseArrayTypeable(extendsTypeArgument);
            if (result == null)
                result = caseCommentable(extendsTypeArgument);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case GenericsPackage.QUALIFIED_TYPE_ARGUMENT: {
            QualifiedTypeArgument qualifiedTypeArgument = (QualifiedTypeArgument) theEObject;
            T result = caseQualifiedTypeArgument(qualifiedTypeArgument);
            if (result == null)
                result = caseTypeArgument(qualifiedTypeArgument);
            if (result == null)
                result = caseTypedElement(qualifiedTypeArgument);
            if (result == null)
                result = caseArrayTypeable(qualifiedTypeArgument);
            if (result == null)
                result = caseCommentable(qualifiedTypeArgument);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case GenericsPackage.SUPER_TYPE_ARGUMENT: {
            SuperTypeArgument superTypeArgument = (SuperTypeArgument) theEObject;
            T result = caseSuperTypeArgument(superTypeArgument);
            if (result == null)
                result = caseTypeArgument(superTypeArgument);
            if (result == null)
                result = caseArrayTypeable(superTypeArgument);
            if (result == null)
                result = caseCommentable(superTypeArgument);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case GenericsPackage.TYPE_PARAMETER: {
            TypeParameter typeParameter = (TypeParameter) theEObject;
            T result = caseTypeParameter(typeParameter);
            if (result == null)
                result = caseClassifier(typeParameter);
            if (result == null)
                result = caseType(typeParameter);
            if (result == null)
                result = caseReferenceableElement(typeParameter);
            if (result == null)
                result = caseNamedElement(typeParameter);
            if (result == null)
                result = caseCommentable(typeParameter);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case GenericsPackage.UNKNOWN_TYPE_ARGUMENT: {
            UnknownTypeArgument unknownTypeArgument = (UnknownTypeArgument) theEObject;
            T result = caseUnknownTypeArgument(unknownTypeArgument);
            if (result == null)
                result = caseTypeArgument(unknownTypeArgument);
            if (result == null)
                result = caseArrayTypeable(unknownTypeArgument);
            if (result == null)
                result = caseCommentable(unknownTypeArgument);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        default:
            return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Type Argument</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Type Argument</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTypeArgument(TypeArgument object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Type Argumentable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Type Argumentable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTypeArgumentable(TypeArgumentable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Call Type Argumentable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Call Type Argumentable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCallTypeArgumentable(CallTypeArgumentable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Type Parametrizable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Type Parametrizable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTypeParametrizable(TypeParametrizable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Extends Type Argument</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Extends Type Argument</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExtendsTypeArgument(ExtendsTypeArgument object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Qualified Type Argument</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Qualified Type Argument</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseQualifiedTypeArgument(QualifiedTypeArgument object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Super Type Argument</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Super Type Argument</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSuperTypeArgument(SuperTypeArgument object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Type Parameter</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Type Parameter</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTypeParameter(TypeParameter object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Unknown Type Argument</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Unknown Type Argument</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUnknownTypeArgument(UnknownTypeArgument object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Array Typeable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Array Typeable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseArrayTypeable(ArrayTypeable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Typed Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Typed Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTypedElement(TypedElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseType(Type object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Referenceable Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Referenceable Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseReferenceableElement(ReferenceableElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Classifier</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Classifier</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseClassifier(Classifier object) {
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

} //GenericsSwitch
