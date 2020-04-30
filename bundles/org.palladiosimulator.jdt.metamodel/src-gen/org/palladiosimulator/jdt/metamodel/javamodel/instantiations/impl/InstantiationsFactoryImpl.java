/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.instantiations.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.palladiosimulator.jdt.metamodel.javamodel.instantiations.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InstantiationsFactoryImpl extends EFactoryImpl implements InstantiationsFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static InstantiationsFactory init() {
        try {
            InstantiationsFactory theInstantiationsFactory = (InstantiationsFactory) EPackage.Registry.INSTANCE
                    .getEFactory(InstantiationsPackage.eNS_URI);
            if (theInstantiationsFactory != null) {
                return theInstantiationsFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new InstantiationsFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InstantiationsFactoryImpl() {
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
        case InstantiationsPackage.NEW_CONSTRUCTOR_CALL:
            return createNewConstructorCall();
        case InstantiationsPackage.EXPLICIT_CONSTRUCTOR_CALL:
            return createExplicitConstructorCall();
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
    public NewConstructorCall createNewConstructorCall() {
        NewConstructorCallImpl newConstructorCall = new NewConstructorCallImpl();
        return newConstructorCall;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExplicitConstructorCall createExplicitConstructorCall() {
        ExplicitConstructorCallImpl explicitConstructorCall = new ExplicitConstructorCallImpl();
        return explicitConstructorCall;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public InstantiationsPackage getInstantiationsPackage() {
        return (InstantiationsPackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static InstantiationsPackage getPackage() {
        return InstantiationsPackage.eINSTANCE;
    }

} //InstantiationsFactoryImpl
