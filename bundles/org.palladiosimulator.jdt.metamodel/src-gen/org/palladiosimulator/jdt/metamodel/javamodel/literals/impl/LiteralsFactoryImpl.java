/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.literals.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.palladiosimulator.jdt.metamodel.javamodel.literals.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LiteralsFactoryImpl extends EFactoryImpl implements LiteralsFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static LiteralsFactory init() {
        try {
            LiteralsFactory theLiteralsFactory = (LiteralsFactory) EPackage.Registry.INSTANCE
                    .getEFactory(LiteralsPackage.eNS_URI);
            if (theLiteralsFactory != null) {
                return theLiteralsFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new LiteralsFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LiteralsFactoryImpl() {
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
        case LiteralsPackage.BOOLEAN_LITERAL:
            return createBooleanLiteral();
        case LiteralsPackage.CHARACTER_LITERAL:
            return createCharacterLiteral();
        case LiteralsPackage.DECIMAL_FLOAT_LITERAL:
            return createDecimalFloatLiteral();
        case LiteralsPackage.HEX_FLOAT_LITERAL:
            return createHexFloatLiteral();
        case LiteralsPackage.DECIMAL_DOUBLE_LITERAL:
            return createDecimalDoubleLiteral();
        case LiteralsPackage.HEX_DOUBLE_LITERAL:
            return createHexDoubleLiteral();
        case LiteralsPackage.DECIMAL_INTEGER_LITERAL:
            return createDecimalIntegerLiteral();
        case LiteralsPackage.HEX_INTEGER_LITERAL:
            return createHexIntegerLiteral();
        case LiteralsPackage.OCTAL_INTEGER_LITERAL:
            return createOctalIntegerLiteral();
        case LiteralsPackage.DECIMAL_LONG_LITERAL:
            return createDecimalLongLiteral();
        case LiteralsPackage.HEX_LONG_LITERAL:
            return createHexLongLiteral();
        case LiteralsPackage.OCTAL_LONG_LITERAL:
            return createOctalLongLiteral();
        case LiteralsPackage.NULL_LITERAL:
            return createNullLiteral();
        case LiteralsPackage.SUPER:
            return createSuper();
        case LiteralsPackage.THIS:
            return createThis();
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
    public BooleanLiteral createBooleanLiteral() {
        BooleanLiteralImpl booleanLiteral = new BooleanLiteralImpl();
        return booleanLiteral;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CharacterLiteral createCharacterLiteral() {
        CharacterLiteralImpl characterLiteral = new CharacterLiteralImpl();
        return characterLiteral;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DecimalFloatLiteral createDecimalFloatLiteral() {
        DecimalFloatLiteralImpl decimalFloatLiteral = new DecimalFloatLiteralImpl();
        return decimalFloatLiteral;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public HexFloatLiteral createHexFloatLiteral() {
        HexFloatLiteralImpl hexFloatLiteral = new HexFloatLiteralImpl();
        return hexFloatLiteral;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DecimalDoubleLiteral createDecimalDoubleLiteral() {
        DecimalDoubleLiteralImpl decimalDoubleLiteral = new DecimalDoubleLiteralImpl();
        return decimalDoubleLiteral;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public HexDoubleLiteral createHexDoubleLiteral() {
        HexDoubleLiteralImpl hexDoubleLiteral = new HexDoubleLiteralImpl();
        return hexDoubleLiteral;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DecimalIntegerLiteral createDecimalIntegerLiteral() {
        DecimalIntegerLiteralImpl decimalIntegerLiteral = new DecimalIntegerLiteralImpl();
        return decimalIntegerLiteral;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public HexIntegerLiteral createHexIntegerLiteral() {
        HexIntegerLiteralImpl hexIntegerLiteral = new HexIntegerLiteralImpl();
        return hexIntegerLiteral;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public OctalIntegerLiteral createOctalIntegerLiteral() {
        OctalIntegerLiteralImpl octalIntegerLiteral = new OctalIntegerLiteralImpl();
        return octalIntegerLiteral;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DecimalLongLiteral createDecimalLongLiteral() {
        DecimalLongLiteralImpl decimalLongLiteral = new DecimalLongLiteralImpl();
        return decimalLongLiteral;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public HexLongLiteral createHexLongLiteral() {
        HexLongLiteralImpl hexLongLiteral = new HexLongLiteralImpl();
        return hexLongLiteral;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public OctalLongLiteral createOctalLongLiteral() {
        OctalLongLiteralImpl octalLongLiteral = new OctalLongLiteralImpl();
        return octalLongLiteral;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NullLiteral createNullLiteral() {
        NullLiteralImpl nullLiteral = new NullLiteralImpl();
        return nullLiteral;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Super createSuper() {
        SuperImpl super_ = new SuperImpl();
        return super_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public This createThis() {
        ThisImpl this_ = new ThisImpl();
        return this_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LiteralsPackage getLiteralsPackage() {
        return (LiteralsPackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static LiteralsPackage getPackage() {
        return LiteralsPackage.eINSTANCE;
    }

} //LiteralsFactoryImpl
