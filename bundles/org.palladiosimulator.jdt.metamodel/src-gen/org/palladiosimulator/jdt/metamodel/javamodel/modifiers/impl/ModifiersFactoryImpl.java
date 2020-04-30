/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.modifiers.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.palladiosimulator.jdt.metamodel.javamodel.modifiers.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModifiersFactoryImpl extends EFactoryImpl implements ModifiersFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ModifiersFactory init() {
        try {
            ModifiersFactory theModifiersFactory = (ModifiersFactory) EPackage.Registry.INSTANCE
                    .getEFactory(ModifiersPackage.eNS_URI);
            if (theModifiersFactory != null) {
                return theModifiersFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ModifiersFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModifiersFactoryImpl() {
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
        case ModifiersPackage.ABSTRACT:
            return createAbstract();
        case ModifiersPackage.FINAL:
            return createFinal();
        case ModifiersPackage.NATIVE:
            return createNative();
        case ModifiersPackage.PROTECTED:
            return createProtected();
        case ModifiersPackage.PUBLIC:
            return createPublic();
        case ModifiersPackage.PRIVATE:
            return createPrivate();
        case ModifiersPackage.STATIC:
            return createStatic();
        case ModifiersPackage.STRICTFP:
            return createStrictfp();
        case ModifiersPackage.SYNCHRONIZED:
            return createSynchronized();
        case ModifiersPackage.TRANSIENT:
            return createTransient();
        case ModifiersPackage.VOLATILE:
            return createVolatile();
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
    public Abstract createAbstract() {
        AbstractImpl abstract_ = new AbstractImpl();
        return abstract_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Final createFinal() {
        FinalImpl final_ = new FinalImpl();
        return final_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Native createNative() {
        NativeImpl native_ = new NativeImpl();
        return native_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Protected createProtected() {
        ProtectedImpl protected_ = new ProtectedImpl();
        return protected_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Public createPublic() {
        PublicImpl public_ = new PublicImpl();
        return public_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Private createPrivate() {
        PrivateImpl private_ = new PrivateImpl();
        return private_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Static createStatic() {
        StaticImpl static_ = new StaticImpl();
        return static_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Strictfp createStrictfp() {
        StrictfpImpl strictfp_ = new StrictfpImpl();
        return strictfp_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Synchronized createSynchronized() {
        SynchronizedImpl synchronized_ = new SynchronizedImpl();
        return synchronized_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Transient createTransient() {
        TransientImpl transient_ = new TransientImpl();
        return transient_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Volatile createVolatile() {
        VolatileImpl volatile_ = new VolatileImpl();
        return volatile_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ModifiersPackage getModifiersPackage() {
        return (ModifiersPackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ModifiersPackage getPackage() {
        return ModifiersPackage.eINSTANCE;
    }

} //ModifiersFactoryImpl
