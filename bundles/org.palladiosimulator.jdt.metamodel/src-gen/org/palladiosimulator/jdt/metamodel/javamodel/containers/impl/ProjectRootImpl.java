/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.containers.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.palladiosimulator.jdt.metamodel.javamodel.containers.ContainersPackage;
import org.palladiosimulator.jdt.metamodel.javamodel.containers.ProjectRoot;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.containers.impl.ProjectRootImpl#getPackages <em>Packages</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.containers.impl.ProjectRootImpl#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectRootImpl extends MinimalEObjectImpl.Container implements ProjectRoot {
    /**
     * The cached value of the '{@link #getPackages() <em>Packages</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPackages()
     * @generated
     * @ordered
     */
    protected EList<org.palladiosimulator.jdt.metamodel.javamodel.containers.Package> packages;

    /**
     * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPath()
     * @generated
     * @ordered
     */
    protected static final String PATH_EDEFAULT = "";

    /**
     * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPath()
     * @generated
     * @ordered
     */
    protected String path = PATH_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ProjectRootImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ContainersPackage.Literals.PROJECT_ROOT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<org.palladiosimulator.jdt.metamodel.javamodel.containers.Package> getPackages() {
        if (packages == null) {
            packages = new EObjectContainmentEList<org.palladiosimulator.jdt.metamodel.javamodel.containers.Package>(
                    org.palladiosimulator.jdt.metamodel.javamodel.containers.Package.class, this,
                    ContainersPackage.PROJECT_ROOT__PACKAGES);
        }
        return packages;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getPath() {
        return path;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPath(String newPath) {
        String oldPath = path;
        path = newPath;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ContainersPackage.PROJECT_ROOT__PATH, oldPath, path));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case ContainersPackage.PROJECT_ROOT__PACKAGES:
            return ((InternalEList<?>) getPackages()).basicRemove(otherEnd, msgs);
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
        case ContainersPackage.PROJECT_ROOT__PACKAGES:
            return getPackages();
        case ContainersPackage.PROJECT_ROOT__PATH:
            return getPath();
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
        case ContainersPackage.PROJECT_ROOT__PACKAGES:
            getPackages().clear();
            getPackages().addAll(
                    (Collection<? extends org.palladiosimulator.jdt.metamodel.javamodel.containers.Package>) newValue);
            return;
        case ContainersPackage.PROJECT_ROOT__PATH:
            setPath((String) newValue);
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
        case ContainersPackage.PROJECT_ROOT__PACKAGES:
            getPackages().clear();
            return;
        case ContainersPackage.PROJECT_ROOT__PATH:
            setPath(PATH_EDEFAULT);
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
        case ContainersPackage.PROJECT_ROOT__PACKAGES:
            return packages != null && !packages.isEmpty();
        case ContainersPackage.PROJECT_ROOT__PATH:
            return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
        default:
            return super.eIsSet(featureID);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy())
            return super.toString();

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (path: ");
        result.append(path);
        result.append(')');
        return result.toString();
    }

} //ProjectRootImpl
