/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.palladiosimulator.jdt.metamodel.javamodel.arrays.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArraysFactoryImpl extends EFactoryImpl implements ArraysFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ArraysFactory init() {
        try {
            ArraysFactory theArraysFactory = (ArraysFactory) EPackage.Registry.INSTANCE
                    .getEFactory(ArraysPackage.eNS_URI);
            if (theArraysFactory != null) {
                return theArraysFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ArraysFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ArraysFactoryImpl() {
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
        case ArraysPackage.ARRAY_DIMENSION:
            return createArrayDimension();
        case ArraysPackage.ARRAY_INITIALIZER:
            return createArrayInitializer();
        case ArraysPackage.ARRAY_INSTANTIATION_BY_SIZE:
            return createArrayInstantiationBySize();
        case ArraysPackage.ARRAY_INSTANTIATION_BY_VALUES_UNTYPED:
            return createArrayInstantiationByValuesUntyped();
        case ArraysPackage.ARRAY_INSTANTIATION_BY_VALUES_TYPED:
            return createArrayInstantiationByValuesTyped();
        case ArraysPackage.ARRAY_SELECTOR:
            return createArraySelector();
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
    public ArrayDimension createArrayDimension() {
        ArrayDimensionImpl arrayDimension = new ArrayDimensionImpl();
        return arrayDimension;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ArrayInitializer createArrayInitializer() {
        ArrayInitializerImpl arrayInitializer = new ArrayInitializerImpl();
        return arrayInitializer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ArrayInstantiationBySize createArrayInstantiationBySize() {
        ArrayInstantiationBySizeImpl arrayInstantiationBySize = new ArrayInstantiationBySizeImpl();
        return arrayInstantiationBySize;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ArrayInstantiationByValuesUntyped createArrayInstantiationByValuesUntyped() {
        ArrayInstantiationByValuesUntypedImpl arrayInstantiationByValuesUntyped = new ArrayInstantiationByValuesUntypedImpl();
        return arrayInstantiationByValuesUntyped;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ArrayInstantiationByValuesTyped createArrayInstantiationByValuesTyped() {
        ArrayInstantiationByValuesTypedImpl arrayInstantiationByValuesTyped = new ArrayInstantiationByValuesTypedImpl();
        return arrayInstantiationByValuesTyped;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ArraySelector createArraySelector() {
        ArraySelectorImpl arraySelector = new ArraySelectorImpl();
        return arraySelector;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ArraysPackage getArraysPackage() {
        return (ArraysPackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ArraysPackage getPackage() {
        return ArraysPackage.eINSTANCE;
    }

} //ArraysFactoryImpl
