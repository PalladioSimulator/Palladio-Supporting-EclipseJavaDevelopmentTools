/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.generics.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.palladiosimulator.jdt.metamodel.javamodel.generics.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GenericsFactoryImpl extends EFactoryImpl implements GenericsFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static GenericsFactory init() {
        try {
            GenericsFactory theGenericsFactory = (GenericsFactory) EPackage.Registry.INSTANCE
                    .getEFactory(GenericsPackage.eNS_URI);
            if (theGenericsFactory != null) {
                return theGenericsFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new GenericsFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GenericsFactoryImpl() {
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
        case GenericsPackage.EXTENDS_TYPE_ARGUMENT:
            return createExtendsTypeArgument();
        case GenericsPackage.QUALIFIED_TYPE_ARGUMENT:
            return createQualifiedTypeArgument();
        case GenericsPackage.SUPER_TYPE_ARGUMENT:
            return createSuperTypeArgument();
        case GenericsPackage.TYPE_PARAMETER:
            return createTypeParameter();
        case GenericsPackage.UNKNOWN_TYPE_ARGUMENT:
            return createUnknownTypeArgument();
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
    public ExtendsTypeArgument createExtendsTypeArgument() {
        ExtendsTypeArgumentImpl extendsTypeArgument = new ExtendsTypeArgumentImpl();
        return extendsTypeArgument;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public QualifiedTypeArgument createQualifiedTypeArgument() {
        QualifiedTypeArgumentImpl qualifiedTypeArgument = new QualifiedTypeArgumentImpl();
        return qualifiedTypeArgument;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SuperTypeArgument createSuperTypeArgument() {
        SuperTypeArgumentImpl superTypeArgument = new SuperTypeArgumentImpl();
        return superTypeArgument;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TypeParameter createTypeParameter() {
        TypeParameterImpl typeParameter = new TypeParameterImpl();
        return typeParameter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public UnknownTypeArgument createUnknownTypeArgument() {
        UnknownTypeArgumentImpl unknownTypeArgument = new UnknownTypeArgumentImpl();
        return unknownTypeArgument;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GenericsPackage getGenericsPackage() {
        return (GenericsPackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static GenericsPackage getPackage() {
        return GenericsPackage.eINSTANCE;
    }

} //GenericsFactoryImpl
