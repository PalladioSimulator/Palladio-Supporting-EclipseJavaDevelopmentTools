/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.parameters.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayTypeable;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable;
import org.palladiosimulator.jdt.metamodel.javamodel.commons.NamedElement;

import org.palladiosimulator.jdt.metamodel.javamodel.generics.TypeArgumentable;

import org.palladiosimulator.jdt.metamodel.javamodel.modifiers.AnnotableAndModifiable;

import org.palladiosimulator.jdt.metamodel.javamodel.parameters.*;

import org.palladiosimulator.jdt.metamodel.javamodel.references.ReferenceableElement;

import org.palladiosimulator.jdt.metamodel.javamodel.types.TypedElement;

import org.palladiosimulator.jdt.metamodel.javamodel.variables.Variable;

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
 * @see org.palladiosimulator.jdt.metamodel.javamodel.parameters.ParametersPackage
 * @generated
 */
public class ParametersSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static ParametersPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ParametersSwitch() {
        if (modelPackage == null) {
            modelPackage = ParametersPackage.eINSTANCE;
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
        case ParametersPackage.PARAMETER: {
            Parameter parameter = (Parameter) theEObject;
            T result = caseParameter(parameter);
            if (result == null)
                result = caseVariable(parameter);
            if (result == null)
                result = caseAnnotableAndModifiable(parameter);
            if (result == null)
                result = caseTypedElement(parameter);
            if (result == null)
                result = caseArrayTypeable(parameter);
            if (result == null)
                result = caseReferenceableElement(parameter);
            if (result == null)
                result = caseTypeArgumentable(parameter);
            if (result == null)
                result = caseNamedElement(parameter);
            if (result == null)
                result = caseCommentable(parameter);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ParametersPackage.PARAMETRIZABLE: {
            Parametrizable parametrizable = (Parametrizable) theEObject;
            T result = caseParametrizable(parametrizable);
            if (result == null)
                result = caseCommentable(parametrizable);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ParametersPackage.ORDINARY_PARAMETER: {
            OrdinaryParameter ordinaryParameter = (OrdinaryParameter) theEObject;
            T result = caseOrdinaryParameter(ordinaryParameter);
            if (result == null)
                result = caseParameter(ordinaryParameter);
            if (result == null)
                result = caseVariable(ordinaryParameter);
            if (result == null)
                result = caseAnnotableAndModifiable(ordinaryParameter);
            if (result == null)
                result = caseTypedElement(ordinaryParameter);
            if (result == null)
                result = caseArrayTypeable(ordinaryParameter);
            if (result == null)
                result = caseReferenceableElement(ordinaryParameter);
            if (result == null)
                result = caseTypeArgumentable(ordinaryParameter);
            if (result == null)
                result = caseNamedElement(ordinaryParameter);
            if (result == null)
                result = caseCommentable(ordinaryParameter);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ParametersPackage.VARIABLE_LENGTH_PARAMETER: {
            VariableLengthParameter variableLengthParameter = (VariableLengthParameter) theEObject;
            T result = caseVariableLengthParameter(variableLengthParameter);
            if (result == null)
                result = caseParameter(variableLengthParameter);
            if (result == null)
                result = caseVariable(variableLengthParameter);
            if (result == null)
                result = caseAnnotableAndModifiable(variableLengthParameter);
            if (result == null)
                result = caseTypedElement(variableLengthParameter);
            if (result == null)
                result = caseArrayTypeable(variableLengthParameter);
            if (result == null)
                result = caseReferenceableElement(variableLengthParameter);
            if (result == null)
                result = caseTypeArgumentable(variableLengthParameter);
            if (result == null)
                result = caseNamedElement(variableLengthParameter);
            if (result == null)
                result = caseCommentable(variableLengthParameter);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        default:
            return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseParameter(Parameter object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Parametrizable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Parametrizable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseParametrizable(Parametrizable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Ordinary Parameter</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Ordinary Parameter</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOrdinaryParameter(OrdinaryParameter object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Variable Length Parameter</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Variable Length Parameter</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVariableLengthParameter(VariableLengthParameter object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVariable(Variable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Annotable And Modifiable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Annotable And Modifiable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAnnotableAndModifiable(AnnotableAndModifiable object) {
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

} //ParametersSwitch
