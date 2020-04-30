/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.annotations.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.annotations.Annotable;
import org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationAttribute;
import org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationAttributeSetting;
import org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationInstance;
import org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationParameter;
import org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationParameterList;
import org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationValue;
import org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationsFactory;
import org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationsPackage;
import org.palladiosimulator.jdt.metamodel.javamodel.annotations.SingleAnnotationParameter;

import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArraysPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArraysPackageImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.ClassifiersPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.ClassifiersPackageImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.CommonsPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.impl.CommonsPackageImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.containers.ContainersPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.containers.impl.ContainersPackageImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExpressionsPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.generics.GenericsPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.generics.impl.GenericsPackageImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.imports.ImportsPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.imports.impl.ImportsPackageImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.instantiations.InstantiationsPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.instantiations.impl.InstantiationsPackageImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.literals.LiteralsPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.LiteralsPackageImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.members.MembersPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.members.impl.MembersPackageImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.modifiers.ModifiersPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.modifiers.impl.ModifiersPackageImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.operators.OperatorsPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.operators.impl.OperatorsPackageImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.parameters.ParametersPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.parameters.impl.ParametersPackageImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.references.ReferencesPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.references.impl.ReferencesPackageImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementsPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.statements.impl.StatementsPackageImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.types.TypesPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.types.impl.TypesPackageImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.variables.VariablesPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.variables.impl.VariablesPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnnotationsPackageImpl extends EPackageImpl implements AnnotationsPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass annotableEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass annotationInstanceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass annotationParameterEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass singleAnnotationParameterEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass annotationParameterListEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass annotationAttributeSettingEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass annotationValueEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass annotationAttributeEClass = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationsPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private AnnotationsPackageImpl() {
        super(eNS_URI, AnnotationsFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     *
     * <p>This method is used to initialize {@link AnnotationsPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static AnnotationsPackage init() {
        if (isInited)
            return (AnnotationsPackage) EPackage.Registry.INSTANCE.getEPackage(AnnotationsPackage.eNS_URI);

        // Obtain or create and register package
        Object registeredAnnotationsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        AnnotationsPackageImpl theAnnotationsPackage = registeredAnnotationsPackage instanceof AnnotationsPackageImpl
                ? (AnnotationsPackageImpl) registeredAnnotationsPackage
                : new AnnotationsPackageImpl();

        isInited = true;

        // Obtain or create and register interdependencies
        Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ArraysPackage.eNS_URI);
        ArraysPackageImpl theArraysPackage = (ArraysPackageImpl) (registeredPackage instanceof ArraysPackageImpl
                ? registeredPackage
                : ArraysPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ClassifiersPackage.eNS_URI);
        ClassifiersPackageImpl theClassifiersPackage = (ClassifiersPackageImpl) (registeredPackage instanceof ClassifiersPackageImpl
                ? registeredPackage
                : ClassifiersPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CommonsPackage.eNS_URI);
        CommonsPackageImpl theCommonsPackage = (CommonsPackageImpl) (registeredPackage instanceof CommonsPackageImpl
                ? registeredPackage
                : CommonsPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ContainersPackage.eNS_URI);
        ContainersPackageImpl theContainersPackage = (ContainersPackageImpl) (registeredPackage instanceof ContainersPackageImpl
                ? registeredPackage
                : ContainersPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI);
        ExpressionsPackageImpl theExpressionsPackage = (ExpressionsPackageImpl) (registeredPackage instanceof ExpressionsPackageImpl
                ? registeredPackage
                : ExpressionsPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GenericsPackage.eNS_URI);
        GenericsPackageImpl theGenericsPackage = (GenericsPackageImpl) (registeredPackage instanceof GenericsPackageImpl
                ? registeredPackage
                : GenericsPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ImportsPackage.eNS_URI);
        ImportsPackageImpl theImportsPackage = (ImportsPackageImpl) (registeredPackage instanceof ImportsPackageImpl
                ? registeredPackage
                : ImportsPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(InstantiationsPackage.eNS_URI);
        InstantiationsPackageImpl theInstantiationsPackage = (InstantiationsPackageImpl) (registeredPackage instanceof InstantiationsPackageImpl
                ? registeredPackage
                : InstantiationsPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LiteralsPackage.eNS_URI);
        LiteralsPackageImpl theLiteralsPackage = (LiteralsPackageImpl) (registeredPackage instanceof LiteralsPackageImpl
                ? registeredPackage
                : LiteralsPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MembersPackage.eNS_URI);
        MembersPackageImpl theMembersPackage = (MembersPackageImpl) (registeredPackage instanceof MembersPackageImpl
                ? registeredPackage
                : MembersPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ModifiersPackage.eNS_URI);
        ModifiersPackageImpl theModifiersPackage = (ModifiersPackageImpl) (registeredPackage instanceof ModifiersPackageImpl
                ? registeredPackage
                : ModifiersPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OperatorsPackage.eNS_URI);
        OperatorsPackageImpl theOperatorsPackage = (OperatorsPackageImpl) (registeredPackage instanceof OperatorsPackageImpl
                ? registeredPackage
                : OperatorsPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ParametersPackage.eNS_URI);
        ParametersPackageImpl theParametersPackage = (ParametersPackageImpl) (registeredPackage instanceof ParametersPackageImpl
                ? registeredPackage
                : ParametersPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ReferencesPackage.eNS_URI);
        ReferencesPackageImpl theReferencesPackage = (ReferencesPackageImpl) (registeredPackage instanceof ReferencesPackageImpl
                ? registeredPackage
                : ReferencesPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StatementsPackage.eNS_URI);
        StatementsPackageImpl theStatementsPackage = (StatementsPackageImpl) (registeredPackage instanceof StatementsPackageImpl
                ? registeredPackage
                : StatementsPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
        TypesPackageImpl theTypesPackage = (TypesPackageImpl) (registeredPackage instanceof TypesPackageImpl
                ? registeredPackage
                : TypesPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(VariablesPackage.eNS_URI);
        VariablesPackageImpl theVariablesPackage = (VariablesPackageImpl) (registeredPackage instanceof VariablesPackageImpl
                ? registeredPackage
                : VariablesPackage.eINSTANCE);

        // Create package meta-data objects
        theAnnotationsPackage.createPackageContents();
        theArraysPackage.createPackageContents();
        theClassifiersPackage.createPackageContents();
        theCommonsPackage.createPackageContents();
        theContainersPackage.createPackageContents();
        theExpressionsPackage.createPackageContents();
        theGenericsPackage.createPackageContents();
        theImportsPackage.createPackageContents();
        theInstantiationsPackage.createPackageContents();
        theLiteralsPackage.createPackageContents();
        theMembersPackage.createPackageContents();
        theModifiersPackage.createPackageContents();
        theOperatorsPackage.createPackageContents();
        theParametersPackage.createPackageContents();
        theReferencesPackage.createPackageContents();
        theStatementsPackage.createPackageContents();
        theTypesPackage.createPackageContents();
        theVariablesPackage.createPackageContents();

        // Initialize created meta-data
        theAnnotationsPackage.initializePackageContents();
        theArraysPackage.initializePackageContents();
        theClassifiersPackage.initializePackageContents();
        theCommonsPackage.initializePackageContents();
        theContainersPackage.initializePackageContents();
        theExpressionsPackage.initializePackageContents();
        theGenericsPackage.initializePackageContents();
        theImportsPackage.initializePackageContents();
        theInstantiationsPackage.initializePackageContents();
        theLiteralsPackage.initializePackageContents();
        theMembersPackage.initializePackageContents();
        theModifiersPackage.initializePackageContents();
        theOperatorsPackage.initializePackageContents();
        theParametersPackage.initializePackageContents();
        theReferencesPackage.initializePackageContents();
        theStatementsPackage.initializePackageContents();
        theTypesPackage.initializePackageContents();
        theVariablesPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theAnnotationsPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(AnnotationsPackage.eNS_URI, theAnnotationsPackage);
        return theAnnotationsPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAnnotable() {
        return annotableEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAnnotable_Annotations() {
        return (EReference) annotableEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAnnotationInstance() {
        return annotationInstanceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAnnotationInstance_Annotation() {
        return (EReference) annotationInstanceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAnnotationInstance_Parameter() {
        return (EReference) annotationInstanceEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAnnotationParameter() {
        return annotationParameterEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSingleAnnotationParameter() {
        return singleAnnotationParameterEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSingleAnnotationParameter_Value() {
        return (EReference) singleAnnotationParameterEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAnnotationParameterList() {
        return annotationParameterListEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAnnotationParameterList_Settings() {
        return (EReference) annotationParameterListEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAnnotationAttributeSetting() {
        return annotationAttributeSettingEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAnnotationAttributeSetting_Attribute() {
        return (EReference) annotationAttributeSettingEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAnnotationAttributeSetting_Value() {
        return (EReference) annotationAttributeSettingEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAnnotationValue() {
        return annotationValueEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAnnotationAttribute() {
        return annotationAttributeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAnnotationAttribute_DefaultValue() {
        return (EReference) annotationAttributeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AnnotationsFactory getAnnotationsFactory() {
        return (AnnotationsFactory) getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated)
            return;
        isCreated = true;

        // Create classes and their features
        annotableEClass = createEClass(ANNOTABLE);
        createEReference(annotableEClass, ANNOTABLE__ANNOTATIONS);

        annotationInstanceEClass = createEClass(ANNOTATION_INSTANCE);
        createEReference(annotationInstanceEClass, ANNOTATION_INSTANCE__ANNOTATION);
        createEReference(annotationInstanceEClass, ANNOTATION_INSTANCE__PARAMETER);

        annotationParameterEClass = createEClass(ANNOTATION_PARAMETER);

        singleAnnotationParameterEClass = createEClass(SINGLE_ANNOTATION_PARAMETER);
        createEReference(singleAnnotationParameterEClass, SINGLE_ANNOTATION_PARAMETER__VALUE);

        annotationParameterListEClass = createEClass(ANNOTATION_PARAMETER_LIST);
        createEReference(annotationParameterListEClass, ANNOTATION_PARAMETER_LIST__SETTINGS);

        annotationAttributeSettingEClass = createEClass(ANNOTATION_ATTRIBUTE_SETTING);
        createEReference(annotationAttributeSettingEClass, ANNOTATION_ATTRIBUTE_SETTING__ATTRIBUTE);
        createEReference(annotationAttributeSettingEClass, ANNOTATION_ATTRIBUTE_SETTING__VALUE);

        annotationValueEClass = createEClass(ANNOTATION_VALUE);

        annotationAttributeEClass = createEClass(ANNOTATION_ATTRIBUTE);
        createEReference(annotationAttributeEClass, ANNOTATION_ATTRIBUTE__DEFAULT_VALUE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized)
            return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Obtain other dependent packages
        CommonsPackage theCommonsPackage = (CommonsPackage) EPackage.Registry.INSTANCE
                .getEPackage(CommonsPackage.eNS_URI);
        ReferencesPackage theReferencesPackage = (ReferencesPackage) EPackage.Registry.INSTANCE
                .getEPackage(ReferencesPackage.eNS_URI);
        ModifiersPackage theModifiersPackage = (ModifiersPackage) EPackage.Registry.INSTANCE
                .getEPackage(ModifiersPackage.eNS_URI);
        ClassifiersPackage theClassifiersPackage = (ClassifiersPackage) EPackage.Registry.INSTANCE
                .getEPackage(ClassifiersPackage.eNS_URI);
        MembersPackage theMembersPackage = (MembersPackage) EPackage.Registry.INSTANCE
                .getEPackage(MembersPackage.eNS_URI);
        ExpressionsPackage theExpressionsPackage = (ExpressionsPackage) EPackage.Registry.INSTANCE
                .getEPackage(ExpressionsPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        annotableEClass.getESuperTypes().add(theCommonsPackage.getCommentable());
        annotationInstanceEClass.getESuperTypes().add(theReferencesPackage.getReference());
        annotationInstanceEClass.getESuperTypes().add(theModifiersPackage.getAnnotationInstanceOrModifier());
        annotationInstanceEClass.getESuperTypes().add(theCommonsPackage.getNamespaceAwareElement());
        annotationParameterEClass.getESuperTypes().add(theCommonsPackage.getCommentable());
        singleAnnotationParameterEClass.getESuperTypes().add(this.getAnnotationParameter());
        annotationParameterListEClass.getESuperTypes().add(this.getAnnotationParameter());
        annotationAttributeSettingEClass.getESuperTypes().add(theCommonsPackage.getCommentable());
        annotationValueEClass.getESuperTypes().add(theCommonsPackage.getCommentable());
        annotationAttributeEClass.getESuperTypes().add(theMembersPackage.getInterfaceMethod());

        // Initialize classes, features, and operations; add parameters
        initEClass(annotableEClass, Annotable.class, "Annotable", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAnnotable_Annotations(), this.getAnnotationInstance(), null, "annotations", null, 0, -1,
                Annotable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(annotationInstanceEClass, AnnotationInstance.class, "AnnotationInstance", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAnnotationInstance_Annotation(), theClassifiersPackage.getClassifier(), null, "annotation",
                null, 1, 1, AnnotationInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAnnotationInstance_Parameter(), this.getAnnotationParameter(), null, "parameter", null, 0, 1,
                AnnotationInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(annotationParameterEClass, AnnotationParameter.class, "AnnotationParameter", IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(singleAnnotationParameterEClass, SingleAnnotationParameter.class, "SingleAnnotationParameter",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSingleAnnotationParameter_Value(), this.getAnnotationValue(), null, "value", null, 1, 1,
                SingleAnnotationParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(annotationParameterListEClass, AnnotationParameterList.class, "AnnotationParameterList",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAnnotationParameterList_Settings(), this.getAnnotationAttributeSetting(), null, "settings",
                null, 0, -1, AnnotationParameterList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(annotationAttributeSettingEClass, AnnotationAttributeSetting.class, "AnnotationAttributeSetting",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAnnotationAttributeSetting_Attribute(), theMembersPackage.getInterfaceMethod(), null,
                "attribute", null, 1, 1, AnnotationAttributeSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAnnotationAttributeSetting_Value(), this.getAnnotationValue(), null, "value", null, 1, 1,
                AnnotationAttributeSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(annotationValueEClass, AnnotationValue.class, "AnnotationValue", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(annotationAttributeEClass, AnnotationAttribute.class, "AnnotationAttribute", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAnnotationAttribute_DefaultValue(), theExpressionsPackage.getExpression(), null,
                "defaultValue", null, 1, 1, AnnotationAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} //AnnotationsPackageImpl
