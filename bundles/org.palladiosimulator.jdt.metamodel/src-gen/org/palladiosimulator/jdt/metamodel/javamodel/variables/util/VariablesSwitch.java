/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.variables.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayTypeable;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable;
import org.palladiosimulator.jdt.metamodel.javamodel.commons.NamedElement;

import org.palladiosimulator.jdt.metamodel.javamodel.generics.TypeArgumentable;

import org.palladiosimulator.jdt.metamodel.javamodel.instantiations.Initializable;

import org.palladiosimulator.jdt.metamodel.javamodel.modifiers.AnnotableAndModifiable;

import org.palladiosimulator.jdt.metamodel.javamodel.references.ReferenceableElement;

import org.palladiosimulator.jdt.metamodel.javamodel.statements.ForLoopInitializer;

import org.palladiosimulator.jdt.metamodel.javamodel.types.TypedElement;

import org.palladiosimulator.jdt.metamodel.javamodel.variables.*;

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
 * @see org.palladiosimulator.jdt.metamodel.javamodel.variables.VariablesPackage
 * @generated
 */
public class VariablesSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static VariablesPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VariablesSwitch() {
        if (modelPackage == null) {
            modelPackage = VariablesPackage.eINSTANCE;
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
        case VariablesPackage.VARIABLE: {
            Variable variable = (Variable) theEObject;
            T result = caseVariable(variable);
            if (result == null)
                result = caseTypedElement(variable);
            if (result == null)
                result = caseArrayTypeable(variable);
            if (result == null)
                result = caseReferenceableElement(variable);
            if (result == null)
                result = caseTypeArgumentable(variable);
            if (result == null)
                result = caseNamedElement(variable);
            if (result == null)
                result = caseCommentable(variable);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case VariablesPackage.LOCAL_VARIABLE: {
            LocalVariable localVariable = (LocalVariable) theEObject;
            T result = caseLocalVariable(localVariable);
            if (result == null)
                result = caseVariable(localVariable);
            if (result == null)
                result = caseInitializable(localVariable);
            if (result == null)
                result = caseForLoopInitializer(localVariable);
            if (result == null)
                result = caseAnnotableAndModifiable(localVariable);
            if (result == null)
                result = caseTypedElement(localVariable);
            if (result == null)
                result = caseArrayTypeable(localVariable);
            if (result == null)
                result = caseReferenceableElement(localVariable);
            if (result == null)
                result = caseTypeArgumentable(localVariable);
            if (result == null)
                result = caseNamedElement(localVariable);
            if (result == null)
                result = caseCommentable(localVariable);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case VariablesPackage.ADDITIONAL_LOCAL_VARIABLE: {
            AdditionalLocalVariable additionalLocalVariable = (AdditionalLocalVariable) theEObject;
            T result = caseAdditionalLocalVariable(additionalLocalVariable);
            if (result == null)
                result = caseReferenceableElement(additionalLocalVariable);
            if (result == null)
                result = caseArrayTypeable(additionalLocalVariable);
            if (result == null)
                result = caseInitializable(additionalLocalVariable);
            if (result == null)
                result = caseNamedElement(additionalLocalVariable);
            if (result == null)
                result = caseCommentable(additionalLocalVariable);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        default:
            return defaultCase(theEObject);
        }
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
     * Returns the result of interpreting the object as an instance of '<em>Local Variable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Local Variable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLocalVariable(LocalVariable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Additional Local Variable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Additional Local Variable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAdditionalLocalVariable(AdditionalLocalVariable object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Initializable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Initializable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInitializable(Initializable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>For Loop Initializer</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>For Loop Initializer</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseForLoopInitializer(ForLoopInitializer object) {
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

} //VariablesSwitch
