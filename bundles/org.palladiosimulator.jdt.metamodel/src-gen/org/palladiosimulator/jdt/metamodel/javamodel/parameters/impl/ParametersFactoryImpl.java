/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.parameters.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.palladiosimulator.jdt.metamodel.javamodel.parameters.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ParametersFactoryImpl extends EFactoryImpl implements ParametersFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ParametersFactory init() {
        try {
            ParametersFactory theParametersFactory = (ParametersFactory) EPackage.Registry.INSTANCE
                    .getEFactory(ParametersPackage.eNS_URI);
            if (theParametersFactory != null) {
                return theParametersFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ParametersFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ParametersFactoryImpl() {
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
        case ParametersPackage.ORDINARY_PARAMETER:
            return createOrdinaryParameter();
        case ParametersPackage.VARIABLE_LENGTH_PARAMETER:
            return createVariableLengthParameter();
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
    public OrdinaryParameter createOrdinaryParameter() {
        OrdinaryParameterImpl ordinaryParameter = new OrdinaryParameterImpl();
        return ordinaryParameter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public VariableLengthParameter createVariableLengthParameter() {
        VariableLengthParameterImpl variableLengthParameter = new VariableLengthParameterImpl();
        return variableLengthParameter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ParametersPackage getParametersPackage() {
        return (ParametersPackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ParametersPackage getPackage() {
        return ParametersPackage.eINSTANCE;
    }

} //ParametersFactoryImpl
