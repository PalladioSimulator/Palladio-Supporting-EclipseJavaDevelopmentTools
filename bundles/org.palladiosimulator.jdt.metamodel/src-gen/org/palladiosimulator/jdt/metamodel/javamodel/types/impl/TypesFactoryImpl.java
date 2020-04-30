/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.types.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.palladiosimulator.jdt.metamodel.javamodel.types.Char;
import org.palladiosimulator.jdt.metamodel.javamodel.types.ClassifierReference;
import org.palladiosimulator.jdt.metamodel.javamodel.types.Int;
import org.palladiosimulator.jdt.metamodel.javamodel.types.NamespaceClassifierReference;
import org.palladiosimulator.jdt.metamodel.javamodel.types.TypesFactory;
import org.palladiosimulator.jdt.metamodel.javamodel.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypesFactoryImpl extends EFactoryImpl implements TypesFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static TypesFactory init() {
        try {
            TypesFactory theTypesFactory = (TypesFactory) EPackage.Registry.INSTANCE.getEFactory(TypesPackage.eNS_URI);
            if (theTypesFactory != null) {
                return theTypesFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new TypesFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TypesFactoryImpl() {
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
        case TypesPackage.CLASSIFIER_REFERENCE:
            return createClassifierReference();
        case TypesPackage.NAMESPACE_CLASSIFIER_REFERENCE:
            return createNamespaceClassifierReference();
        case TypesPackage.BOOLEAN:
            return createBoolean();
        case TypesPackage.BYTE:
            return createByte();
        case TypesPackage.CHAR:
            return createChar();
        case TypesPackage.DOUBLE:
            return createDouble();
        case TypesPackage.FLOAT:
            return createFloat();
        case TypesPackage.INT:
            return createInt();
        case TypesPackage.LONG:
            return createLong();
        case TypesPackage.SHORT:
            return createShort();
        case TypesPackage.VOID:
            return createVoid();
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
    public ClassifierReference createClassifierReference() {
        ClassifierReferenceImpl classifierReference = new ClassifierReferenceImpl();
        return classifierReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NamespaceClassifierReference createNamespaceClassifierReference() {
        NamespaceClassifierReferenceImpl namespaceClassifierReference = new NamespaceClassifierReferenceImpl();
        return namespaceClassifierReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public org.palladiosimulator.jdt.metamodel.javamodel.types.Boolean createBoolean() {
        BooleanImpl boolean_ = new BooleanImpl();
        return boolean_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public org.palladiosimulator.jdt.metamodel.javamodel.types.Byte createByte() {
        ByteImpl byte_ = new ByteImpl();
        return byte_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Char createChar() {
        CharImpl char_ = new CharImpl();
        return char_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public org.palladiosimulator.jdt.metamodel.javamodel.types.Double createDouble() {
        DoubleImpl double_ = new DoubleImpl();
        return double_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public org.palladiosimulator.jdt.metamodel.javamodel.types.Float createFloat() {
        FloatImpl float_ = new FloatImpl();
        return float_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Int createInt() {
        IntImpl int_ = new IntImpl();
        return int_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public org.palladiosimulator.jdt.metamodel.javamodel.types.Long createLong() {
        LongImpl long_ = new LongImpl();
        return long_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public org.palladiosimulator.jdt.metamodel.javamodel.types.Short createShort() {
        ShortImpl short_ = new ShortImpl();
        return short_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public org.palladiosimulator.jdt.metamodel.javamodel.types.Void createVoid() {
        VoidImpl void_ = new VoidImpl();
        return void_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TypesPackage getTypesPackage() {
        return (TypesPackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static TypesPackage getPackage() {
        return TypesPackage.eINSTANCE;
    }

} //TypesFactoryImpl
