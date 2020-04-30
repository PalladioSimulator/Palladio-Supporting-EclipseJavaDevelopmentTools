/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.members.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.impl.CommentableImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.members.ExceptionThrower;
import org.palladiosimulator.jdt.metamodel.javamodel.members.MembersPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.types.NamespaceClassifierReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exception Thrower</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.members.impl.ExceptionThrowerImpl#getExceptions <em>Exceptions</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ExceptionThrowerImpl extends CommentableImpl implements ExceptionThrower {
    /**
     * The cached value of the '{@link #getExceptions() <em>Exceptions</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExceptions()
     * @generated
     * @ordered
     */
    protected EList<NamespaceClassifierReference> exceptions;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExceptionThrowerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MembersPackage.Literals.EXCEPTION_THROWER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<NamespaceClassifierReference> getExceptions() {
        if (exceptions == null) {
            exceptions = new EObjectContainmentEList<NamespaceClassifierReference>(NamespaceClassifierReference.class,
                    this, MembersPackage.EXCEPTION_THROWER__EXCEPTIONS);
        }
        return exceptions;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case MembersPackage.EXCEPTION_THROWER__EXCEPTIONS:
            return ((InternalEList<?>) getExceptions()).basicRemove(otherEnd, msgs);
        default:
            return super.eInverseRemove(otherEnd, featureID, msgs);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case MembersPackage.EXCEPTION_THROWER__EXCEPTIONS:
            return getExceptions();
        default:
            return super.eGet(featureID, resolve, coreType);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case MembersPackage.EXCEPTION_THROWER__EXCEPTIONS:
            getExceptions().clear();
            getExceptions().addAll((Collection<? extends NamespaceClassifierReference>) newValue);
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
        case MembersPackage.EXCEPTION_THROWER__EXCEPTIONS:
            getExceptions().clear();
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
        case MembersPackage.EXCEPTION_THROWER__EXCEPTIONS:
            return exceptions != null && !exceptions.isEmpty();
        default:
            return super.eIsSet(featureID);
        }
    }

} //ExceptionThrowerImpl
