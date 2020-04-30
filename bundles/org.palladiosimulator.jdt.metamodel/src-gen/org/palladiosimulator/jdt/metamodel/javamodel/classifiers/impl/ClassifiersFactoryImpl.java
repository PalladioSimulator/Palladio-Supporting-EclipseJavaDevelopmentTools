/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Annotation;
import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.AnonymousClass;
import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.ClassifiersFactory;
import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.ClassifiersPackage;
import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Enumeration;
import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Interface;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClassifiersFactoryImpl extends EFactoryImpl implements ClassifiersFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ClassifiersFactory init() {
        try {
            ClassifiersFactory theClassifiersFactory = (ClassifiersFactory) EPackage.Registry.INSTANCE
                    .getEFactory(ClassifiersPackage.eNS_URI);
            if (theClassifiersFactory != null) {
                return theClassifiersFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ClassifiersFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ClassifiersFactoryImpl() {
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
        case ClassifiersPackage.CLASS:
            return createClass();
        case ClassifiersPackage.INTERFACE:
            return createInterface();
        case ClassifiersPackage.ENUMERATION:
            return createEnumeration();
        case ClassifiersPackage.ANNOTATION:
            return createAnnotation();
        case ClassifiersPackage.ANONYMOUS_CLASS:
            return createAnonymousClass();
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
    public org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Class createClass() {
        ClassImpl class_ = new ClassImpl();
        return class_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Interface createInterface() {
        InterfaceImpl interface_ = new InterfaceImpl();
        return interface_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Enumeration createEnumeration() {
        EnumerationImpl enumeration = new EnumerationImpl();
        return enumeration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Annotation createAnnotation() {
        AnnotationImpl annotation = new AnnotationImpl();
        return annotation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AnonymousClass createAnonymousClass() {
        AnonymousClassImpl anonymousClass = new AnonymousClassImpl();
        return anonymousClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ClassifiersPackage getClassifiersPackage() {
        return (ClassifiersPackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ClassifiersPackage getPackage() {
        return ClassifiersPackage.eINSTANCE;
    }

} //ClassifiersFactoryImpl
