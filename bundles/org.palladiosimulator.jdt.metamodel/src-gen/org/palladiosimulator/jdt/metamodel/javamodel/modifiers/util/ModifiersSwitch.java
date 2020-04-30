/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.modifiers.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable;

import org.palladiosimulator.jdt.metamodel.javamodel.modifiers.*;

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
 * @see org.palladiosimulator.jdt.metamodel.javamodel.modifiers.ModifiersPackage
 * @generated
 */
public class ModifiersSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static ModifiersPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModifiersSwitch() {
        if (modelPackage == null) {
            modelPackage = ModifiersPackage.eINSTANCE;
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
        case ModifiersPackage.MODIFIER: {
            Modifier modifier = (Modifier) theEObject;
            T result = caseModifier(modifier);
            if (result == null)
                result = caseAnnotationInstanceOrModifier(modifier);
            if (result == null)
                result = caseCommentable(modifier);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ModifiersPackage.ANNOTATION_INSTANCE_OR_MODIFIER: {
            AnnotationInstanceOrModifier annotationInstanceOrModifier = (AnnotationInstanceOrModifier) theEObject;
            T result = caseAnnotationInstanceOrModifier(annotationInstanceOrModifier);
            if (result == null)
                result = caseCommentable(annotationInstanceOrModifier);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE: {
            AnnotableAndModifiable annotableAndModifiable = (AnnotableAndModifiable) theEObject;
            T result = caseAnnotableAndModifiable(annotableAndModifiable);
            if (result == null)
                result = caseCommentable(annotableAndModifiable);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ModifiersPackage.MODIFIABLE: {
            Modifiable modifiable = (Modifiable) theEObject;
            T result = caseModifiable(modifiable);
            if (result == null)
                result = caseCommentable(modifiable);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ModifiersPackage.ABSTRACT: {
            Abstract abstract_ = (Abstract) theEObject;
            T result = caseAbstract(abstract_);
            if (result == null)
                result = caseModifier(abstract_);
            if (result == null)
                result = caseAnnotationInstanceOrModifier(abstract_);
            if (result == null)
                result = caseCommentable(abstract_);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ModifiersPackage.FINAL: {
            Final final_ = (Final) theEObject;
            T result = caseFinal(final_);
            if (result == null)
                result = caseModifier(final_);
            if (result == null)
                result = caseAnnotationInstanceOrModifier(final_);
            if (result == null)
                result = caseCommentable(final_);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ModifiersPackage.NATIVE: {
            Native native_ = (Native) theEObject;
            T result = caseNative(native_);
            if (result == null)
                result = caseModifier(native_);
            if (result == null)
                result = caseAnnotationInstanceOrModifier(native_);
            if (result == null)
                result = caseCommentable(native_);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ModifiersPackage.PROTECTED: {
            Protected protected_ = (Protected) theEObject;
            T result = caseProtected(protected_);
            if (result == null)
                result = caseModifier(protected_);
            if (result == null)
                result = caseAnnotationInstanceOrModifier(protected_);
            if (result == null)
                result = caseCommentable(protected_);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ModifiersPackage.PUBLIC: {
            Public public_ = (Public) theEObject;
            T result = casePublic(public_);
            if (result == null)
                result = caseModifier(public_);
            if (result == null)
                result = caseAnnotationInstanceOrModifier(public_);
            if (result == null)
                result = caseCommentable(public_);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ModifiersPackage.PRIVATE: {
            Private private_ = (Private) theEObject;
            T result = casePrivate(private_);
            if (result == null)
                result = caseModifier(private_);
            if (result == null)
                result = caseAnnotationInstanceOrModifier(private_);
            if (result == null)
                result = caseCommentable(private_);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ModifiersPackage.STATIC: {
            Static static_ = (Static) theEObject;
            T result = caseStatic(static_);
            if (result == null)
                result = caseModifier(static_);
            if (result == null)
                result = caseAnnotationInstanceOrModifier(static_);
            if (result == null)
                result = caseCommentable(static_);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ModifiersPackage.STRICTFP: {
            Strictfp strictfp_ = (Strictfp) theEObject;
            T result = caseStrictfp(strictfp_);
            if (result == null)
                result = caseModifier(strictfp_);
            if (result == null)
                result = caseAnnotationInstanceOrModifier(strictfp_);
            if (result == null)
                result = caseCommentable(strictfp_);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ModifiersPackage.SYNCHRONIZED: {
            Synchronized synchronized_ = (Synchronized) theEObject;
            T result = caseSynchronized(synchronized_);
            if (result == null)
                result = caseModifier(synchronized_);
            if (result == null)
                result = caseAnnotationInstanceOrModifier(synchronized_);
            if (result == null)
                result = caseCommentable(synchronized_);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ModifiersPackage.TRANSIENT: {
            Transient transient_ = (Transient) theEObject;
            T result = caseTransient(transient_);
            if (result == null)
                result = caseModifier(transient_);
            if (result == null)
                result = caseAnnotationInstanceOrModifier(transient_);
            if (result == null)
                result = caseCommentable(transient_);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ModifiersPackage.VOLATILE: {
            Volatile volatile_ = (Volatile) theEObject;
            T result = caseVolatile(volatile_);
            if (result == null)
                result = caseModifier(volatile_);
            if (result == null)
                result = caseAnnotationInstanceOrModifier(volatile_);
            if (result == null)
                result = caseCommentable(volatile_);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        default:
            return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Modifier</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Modifier</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseModifier(Modifier object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Annotation Instance Or Modifier</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Annotation Instance Or Modifier</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAnnotationInstanceOrModifier(AnnotationInstanceOrModifier object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Modifiable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Modifiable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseModifiable(Modifiable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Abstract</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbstract(Abstract object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Final</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Final</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFinal(Final object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Native</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Native</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNative(Native object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Protected</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Protected</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProtected(Protected object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Public</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Public</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePublic(Public object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Private</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Private</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePrivate(Private object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Static</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Static</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStatic(Static object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Strictfp</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Strictfp</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStrictfp(Strictfp object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Synchronized</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Synchronized</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSynchronized(Synchronized object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Transient</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Transient</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTransient(Transient object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Volatile</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Volatile</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVolatile(Volatile object) {
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

} //ModifiersSwitch
