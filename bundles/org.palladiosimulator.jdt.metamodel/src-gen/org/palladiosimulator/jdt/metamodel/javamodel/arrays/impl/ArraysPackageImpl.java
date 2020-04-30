/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationsPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.annotations.impl.AnnotationsPackageImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayDimension;
import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayInitializationValue;
import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayInitializer;
import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayInstantiation;
import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayInstantiationBySize;
import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayInstantiationByValues;
import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayInstantiationByValuesTyped;
import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayInstantiationByValuesUntyped;
import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArraySelector;
import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayTypeable;
import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArraysFactory;
import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArraysPackage;

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
public class ArraysPackageImpl extends EPackageImpl implements ArraysPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass arrayTypeableEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass arrayDimensionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass arrayInitializerEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass arrayInitializationValueEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass arrayInstantiationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass arrayInstantiationBySizeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass arrayInstantiationByValuesEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass arrayInstantiationByValuesUntypedEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass arrayInstantiationByValuesTypedEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass arraySelectorEClass = null;

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
     * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArraysPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private ArraysPackageImpl() {
        super(eNS_URI, ArraysFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link ArraysPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static ArraysPackage init() {
        if (isInited)
            return (ArraysPackage) EPackage.Registry.INSTANCE.getEPackage(ArraysPackage.eNS_URI);

        // Obtain or create and register package
        Object registeredArraysPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        ArraysPackageImpl theArraysPackage = registeredArraysPackage instanceof ArraysPackageImpl
                ? (ArraysPackageImpl) registeredArraysPackage
                : new ArraysPackageImpl();

        isInited = true;

        // Obtain or create and register interdependencies
        Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AnnotationsPackage.eNS_URI);
        AnnotationsPackageImpl theAnnotationsPackage = (AnnotationsPackageImpl) (registeredPackage instanceof AnnotationsPackageImpl
                ? registeredPackage
                : AnnotationsPackage.eINSTANCE);
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
        theArraysPackage.createPackageContents();
        theAnnotationsPackage.createPackageContents();
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
        theArraysPackage.initializePackageContents();
        theAnnotationsPackage.initializePackageContents();
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
        theArraysPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(ArraysPackage.eNS_URI, theArraysPackage);
        return theArraysPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getArrayTypeable() {
        return arrayTypeableEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getArrayTypeable_ArrayDimensionsBefore() {
        return (EReference) arrayTypeableEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getArrayTypeable_ArrayDimensionsAfter() {
        return (EReference) arrayTypeableEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getArrayTypeable__GetArrayDimension() {
        return arrayTypeableEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getArrayDimension() {
        return arrayDimensionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getArrayInitializer() {
        return arrayInitializerEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getArrayInitializer_InitialValues() {
        return (EReference) arrayInitializerEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getArrayInitializationValue() {
        return arrayInitializationValueEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getArrayInstantiation() {
        return arrayInstantiationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getArrayInstantiationBySize() {
        return arrayInstantiationBySizeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getArrayInstantiationBySize_Sizes() {
        return (EReference) arrayInstantiationBySizeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getArrayInstantiationByValues() {
        return arrayInstantiationByValuesEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getArrayInstantiationByValues_ArrayInitializer() {
        return (EReference) arrayInstantiationByValuesEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getArrayInstantiationByValuesUntyped() {
        return arrayInstantiationByValuesUntypedEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getArrayInstantiationByValuesTyped() {
        return arrayInstantiationByValuesTypedEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getArraySelector() {
        return arraySelectorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getArraySelector_Position() {
        return (EReference) arraySelectorEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ArraysFactory getArraysFactory() {
        return (ArraysFactory) getEFactoryInstance();
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
        arrayTypeableEClass = createEClass(ARRAY_TYPEABLE);
        createEReference(arrayTypeableEClass, ARRAY_TYPEABLE__ARRAY_DIMENSIONS_BEFORE);
        createEReference(arrayTypeableEClass, ARRAY_TYPEABLE__ARRAY_DIMENSIONS_AFTER);
        createEOperation(arrayTypeableEClass, ARRAY_TYPEABLE___GET_ARRAY_DIMENSION);

        arrayDimensionEClass = createEClass(ARRAY_DIMENSION);

        arrayInitializerEClass = createEClass(ARRAY_INITIALIZER);
        createEReference(arrayInitializerEClass, ARRAY_INITIALIZER__INITIAL_VALUES);

        arrayInitializationValueEClass = createEClass(ARRAY_INITIALIZATION_VALUE);

        arrayInstantiationEClass = createEClass(ARRAY_INSTANTIATION);

        arrayInstantiationBySizeEClass = createEClass(ARRAY_INSTANTIATION_BY_SIZE);
        createEReference(arrayInstantiationBySizeEClass, ARRAY_INSTANTIATION_BY_SIZE__SIZES);

        arrayInstantiationByValuesEClass = createEClass(ARRAY_INSTANTIATION_BY_VALUES);
        createEReference(arrayInstantiationByValuesEClass, ARRAY_INSTANTIATION_BY_VALUES__ARRAY_INITIALIZER);

        arrayInstantiationByValuesUntypedEClass = createEClass(ARRAY_INSTANTIATION_BY_VALUES_UNTYPED);

        arrayInstantiationByValuesTypedEClass = createEClass(ARRAY_INSTANTIATION_BY_VALUES_TYPED);

        arraySelectorEClass = createEClass(ARRAY_SELECTOR);
        createEReference(arraySelectorEClass, ARRAY_SELECTOR__POSITION);
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
        AnnotationsPackage theAnnotationsPackage = (AnnotationsPackage) EPackage.Registry.INSTANCE
                .getEPackage(AnnotationsPackage.eNS_URI);
        ExpressionsPackage theExpressionsPackage = (ExpressionsPackage) EPackage.Registry.INSTANCE
                .getEPackage(ExpressionsPackage.eNS_URI);
        ReferencesPackage theReferencesPackage = (ReferencesPackage) EPackage.Registry.INSTANCE
                .getEPackage(ReferencesPackage.eNS_URI);
        TypesPackage theTypesPackage = (TypesPackage) EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        arrayTypeableEClass.getESuperTypes().add(theCommonsPackage.getCommentable());
        arrayDimensionEClass.getESuperTypes().add(theCommonsPackage.getCommentable());
        arrayInitializerEClass.getESuperTypes().add(this.getArrayInitializationValue());
        arrayInitializerEClass.getESuperTypes().add(theAnnotationsPackage.getAnnotationValue());
        arrayInitializationValueEClass.getESuperTypes().add(theCommonsPackage.getCommentable());
        arrayInstantiationEClass.getESuperTypes().add(theExpressionsPackage.getExpression());
        arrayInstantiationEClass.getESuperTypes().add(theReferencesPackage.getReference());
        arrayInstantiationBySizeEClass.getESuperTypes().add(this.getArrayInstantiation());
        arrayInstantiationBySizeEClass.getESuperTypes().add(theTypesPackage.getTypedElement());
        arrayInstantiationBySizeEClass.getESuperTypes().add(this.getArrayTypeable());
        arrayInstantiationByValuesEClass.getESuperTypes().add(this.getArrayInstantiation());
        arrayInstantiationByValuesUntypedEClass.getESuperTypes().add(this.getArrayInstantiationByValues());
        arrayInstantiationByValuesTypedEClass.getESuperTypes().add(this.getArrayInstantiationByValues());
        arrayInstantiationByValuesTypedEClass.getESuperTypes().add(theTypesPackage.getTypedElement());
        arrayInstantiationByValuesTypedEClass.getESuperTypes().add(this.getArrayTypeable());
        arraySelectorEClass.getESuperTypes().add(theCommonsPackage.getCommentable());

        // Initialize classes, features, and operations; add parameters
        initEClass(arrayTypeableEClass, ArrayTypeable.class, "ArrayTypeable", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getArrayTypeable_ArrayDimensionsBefore(), this.getArrayDimension(), null,
                "arrayDimensionsBefore", null, 0, -1, ArrayTypeable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getArrayTypeable_ArrayDimensionsAfter(), this.getArrayDimension(), null, "arrayDimensionsAfter",
                null, 0, -1, ArrayTypeable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEOperation(getArrayTypeable__GetArrayDimension(), ecorePackage.getELong(), "getArrayDimension", 0, 1,
                IS_UNIQUE, IS_ORDERED);

        initEClass(arrayDimensionEClass, ArrayDimension.class, "ArrayDimension", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(arrayInitializerEClass, ArrayInitializer.class, "ArrayInitializer", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getArrayInitializer_InitialValues(), this.getArrayInitializationValue(), null, "initialValues",
                null, 0, -1, ArrayInitializer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(arrayInitializationValueEClass, ArrayInitializationValue.class, "ArrayInitializationValue",
                IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(arrayInstantiationEClass, ArrayInstantiation.class, "ArrayInstantiation", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(arrayInstantiationBySizeEClass, ArrayInstantiationBySize.class, "ArrayInstantiationBySize",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getArrayInstantiationBySize_Sizes(), theExpressionsPackage.getExpression(), null, "sizes", null,
                1, -1, ArrayInstantiationBySize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(arrayInstantiationByValuesEClass, ArrayInstantiationByValues.class, "ArrayInstantiationByValues",
                IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getArrayInstantiationByValues_ArrayInitializer(), this.getArrayInitializer(), null,
                "arrayInitializer", null, 1, 1, ArrayInstantiationByValues.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(arrayInstantiationByValuesUntypedEClass, ArrayInstantiationByValuesUntyped.class,
                "ArrayInstantiationByValuesUntyped", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(arrayInstantiationByValuesTypedEClass, ArrayInstantiationByValuesTyped.class,
                "ArrayInstantiationByValuesTyped", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(arraySelectorEClass, ArraySelector.class, "ArraySelector", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getArraySelector_Position(), theExpressionsPackage.getExpression(), null, "position", null, 0, 1,
                ArraySelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} //ArraysPackageImpl
