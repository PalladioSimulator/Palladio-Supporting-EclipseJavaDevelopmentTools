/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.variables.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.palladiosimulator.jdt.metamodel.javamodel.variables.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VariablesFactoryImpl extends EFactoryImpl implements VariablesFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static VariablesFactory init() {
        try {
            VariablesFactory theVariablesFactory = (VariablesFactory) EPackage.Registry.INSTANCE
                    .getEFactory(VariablesPackage.eNS_URI);
            if (theVariablesFactory != null) {
                return theVariablesFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new VariablesFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VariablesFactoryImpl() {
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
        case VariablesPackage.LOCAL_VARIABLE:
            return createLocalVariable();
        case VariablesPackage.ADDITIONAL_LOCAL_VARIABLE:
            return createAdditionalLocalVariable();
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
    public LocalVariable createLocalVariable() {
        LocalVariableImpl localVariable = new LocalVariableImpl();
        return localVariable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AdditionalLocalVariable createAdditionalLocalVariable() {
        AdditionalLocalVariableImpl additionalLocalVariable = new AdditionalLocalVariableImpl();
        return additionalLocalVariable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public VariablesPackage getVariablesPackage() {
        return (VariablesPackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static VariablesPackage getPackage() {
        return VariablesPackage.eINSTANCE;
    }

} //VariablesFactoryImpl
