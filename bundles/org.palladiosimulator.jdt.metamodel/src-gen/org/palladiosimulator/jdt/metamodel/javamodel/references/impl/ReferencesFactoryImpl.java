/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.references.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.palladiosimulator.jdt.metamodel.javamodel.references.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReferencesFactoryImpl extends EFactoryImpl implements ReferencesFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ReferencesFactory init() {
        try {
            ReferencesFactory theReferencesFactory = (ReferencesFactory) EPackage.Registry.INSTANCE
                    .getEFactory(ReferencesPackage.eNS_URI);
            if (theReferencesFactory != null) {
                return theReferencesFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ReferencesFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ReferencesFactoryImpl() {
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
        case ReferencesPackage.IDENTIFIER_REFERENCE:
            return createIdentifierReference();
        case ReferencesPackage.METHOD_CALL:
            return createMethodCall();
        case ReferencesPackage.REFLECTIVE_CLASS_REFERENCE:
            return createReflectiveClassReference();
        case ReferencesPackage.PRIMITIVE_TYPE_REFERENCE:
            return createPrimitiveTypeReference();
        case ReferencesPackage.STRING_REFERENCE:
            return createStringReference();
        case ReferencesPackage.SELF_REFERENCE:
            return createSelfReference();
        case ReferencesPackage.PACKAGE_REFERENCE:
            return createPackageReference();
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
    public IdentifierReference createIdentifierReference() {
        IdentifierReferenceImpl identifierReference = new IdentifierReferenceImpl();
        return identifierReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MethodCall createMethodCall() {
        MethodCallImpl methodCall = new MethodCallImpl();
        return methodCall;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ReflectiveClassReference createReflectiveClassReference() {
        ReflectiveClassReferenceImpl reflectiveClassReference = new ReflectiveClassReferenceImpl();
        return reflectiveClassReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PrimitiveTypeReference createPrimitiveTypeReference() {
        PrimitiveTypeReferenceImpl primitiveTypeReference = new PrimitiveTypeReferenceImpl();
        return primitiveTypeReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public StringReference createStringReference() {
        StringReferenceImpl stringReference = new StringReferenceImpl();
        return stringReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SelfReference createSelfReference() {
        SelfReferenceImpl selfReference = new SelfReferenceImpl();
        return selfReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PackageReference createPackageReference() {
        PackageReferenceImpl packageReference = new PackageReferenceImpl();
        return packageReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ReferencesPackage getReferencesPackage() {
        return (ReferencesPackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ReferencesPackage getPackage() {
        return ReferencesPackage.eINSTANCE;
    }

} //ReferencesFactoryImpl
