/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.references.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationsPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.annotations.impl.AnnotationsPackageImpl;

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

import org.palladiosimulator.jdt.metamodel.javamodel.references.Argumentable;
import org.palladiosimulator.jdt.metamodel.javamodel.references.ElementReference;
import org.palladiosimulator.jdt.metamodel.javamodel.references.IdentifierReference;
import org.palladiosimulator.jdt.metamodel.javamodel.references.MethodCall;
import org.palladiosimulator.jdt.metamodel.javamodel.references.PackageReference;
import org.palladiosimulator.jdt.metamodel.javamodel.references.PrimitiveTypeReference;
import org.palladiosimulator.jdt.metamodel.javamodel.references.Reference;
import org.palladiosimulator.jdt.metamodel.javamodel.references.ReferenceableElement;
import org.palladiosimulator.jdt.metamodel.javamodel.references.ReferencesFactory;
import org.palladiosimulator.jdt.metamodel.javamodel.references.ReferencesPackage;
import org.palladiosimulator.jdt.metamodel.javamodel.references.ReflectiveClassReference;
import org.palladiosimulator.jdt.metamodel.javamodel.references.SelfReference;
import org.palladiosimulator.jdt.metamodel.javamodel.references.StringReference;

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
public class ReferencesPackageImpl extends EPackageImpl implements ReferencesPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass referenceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass argumentableEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass referenceableElementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass elementReferenceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass identifierReferenceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass methodCallEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass reflectiveClassReferenceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass primitiveTypeReferenceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass stringReferenceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass selfReferenceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass packageReferenceEClass = null;

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
     * @see org.palladiosimulator.jdt.metamodel.javamodel.references.ReferencesPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private ReferencesPackageImpl() {
        super(eNS_URI, ReferencesFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link ReferencesPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static ReferencesPackage init() {
        if (isInited)
            return (ReferencesPackage) EPackage.Registry.INSTANCE.getEPackage(ReferencesPackage.eNS_URI);

        // Obtain or create and register package
        Object registeredReferencesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        ReferencesPackageImpl theReferencesPackage = registeredReferencesPackage instanceof ReferencesPackageImpl
                ? (ReferencesPackageImpl) registeredReferencesPackage
                : new ReferencesPackageImpl();

        isInited = true;

        // Obtain or create and register interdependencies
        Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AnnotationsPackage.eNS_URI);
        AnnotationsPackageImpl theAnnotationsPackage = (AnnotationsPackageImpl) (registeredPackage instanceof AnnotationsPackageImpl
                ? registeredPackage
                : AnnotationsPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ArraysPackage.eNS_URI);
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
        theReferencesPackage.createPackageContents();
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
        theStatementsPackage.createPackageContents();
        theTypesPackage.createPackageContents();
        theVariablesPackage.createPackageContents();

        // Initialize created meta-data
        theReferencesPackage.initializePackageContents();
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
        theStatementsPackage.initializePackageContents();
        theTypesPackage.initializePackageContents();
        theVariablesPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theReferencesPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(ReferencesPackage.eNS_URI, theReferencesPackage);
        return theReferencesPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getReference() {
        return referenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getReference_Next() {
        return (EReference) referenceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getReference_ArraySelectors() {
        return (EReference) referenceEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getReference__GetReferencedType() {
        return referenceEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getReference__GetPrevious() {
        return referenceEClass.getEOperations().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getArgumentable() {
        return argumentableEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getArgumentable_Arguments() {
        return (EReference) argumentableEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getArgumentable__GetArgumentTypes() {
        return argumentableEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getReferenceableElement() {
        return referenceableElementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getElementReference() {
        return elementReferenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getElementReference_Target() {
        return (EReference) elementReferenceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getIdentifierReference() {
        return identifierReferenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getMethodCall() {
        return methodCallEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getReflectiveClassReference() {
        return reflectiveClassReferenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getPrimitiveTypeReference() {
        return primitiveTypeReferenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getPrimitiveTypeReference_PrimitiveType() {
        return (EReference) primitiveTypeReferenceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getStringReference() {
        return stringReferenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getStringReference_Value() {
        return (EAttribute) stringReferenceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSelfReference() {
        return selfReferenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSelfReference_Self() {
        return (EReference) selfReferenceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getPackageReference() {
        return packageReferenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getPackageReference_Subpackages() {
        return (EReference) packageReferenceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ReferencesFactory getReferencesFactory() {
        return (ReferencesFactory) getEFactoryInstance();
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
        referenceEClass = createEClass(REFERENCE);
        createEReference(referenceEClass, REFERENCE__NEXT);
        createEReference(referenceEClass, REFERENCE__ARRAY_SELECTORS);
        createEOperation(referenceEClass, REFERENCE___GET_REFERENCED_TYPE);
        createEOperation(referenceEClass, REFERENCE___GET_PREVIOUS);

        argumentableEClass = createEClass(ARGUMENTABLE);
        createEReference(argumentableEClass, ARGUMENTABLE__ARGUMENTS);
        createEOperation(argumentableEClass, ARGUMENTABLE___GET_ARGUMENT_TYPES);

        referenceableElementEClass = createEClass(REFERENCEABLE_ELEMENT);

        elementReferenceEClass = createEClass(ELEMENT_REFERENCE);
        createEReference(elementReferenceEClass, ELEMENT_REFERENCE__TARGET);

        identifierReferenceEClass = createEClass(IDENTIFIER_REFERENCE);

        methodCallEClass = createEClass(METHOD_CALL);

        reflectiveClassReferenceEClass = createEClass(REFLECTIVE_CLASS_REFERENCE);

        primitiveTypeReferenceEClass = createEClass(PRIMITIVE_TYPE_REFERENCE);
        createEReference(primitiveTypeReferenceEClass, PRIMITIVE_TYPE_REFERENCE__PRIMITIVE_TYPE);

        stringReferenceEClass = createEClass(STRING_REFERENCE);
        createEAttribute(stringReferenceEClass, STRING_REFERENCE__VALUE);

        selfReferenceEClass = createEClass(SELF_REFERENCE);
        createEReference(selfReferenceEClass, SELF_REFERENCE__SELF);

        packageReferenceEClass = createEClass(PACKAGE_REFERENCE);
        createEReference(packageReferenceEClass, PACKAGE_REFERENCE__SUBPACKAGES);
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
        ExpressionsPackage theExpressionsPackage = (ExpressionsPackage) EPackage.Registry.INSTANCE
                .getEPackage(ExpressionsPackage.eNS_URI);
        GenericsPackage theGenericsPackage = (GenericsPackage) EPackage.Registry.INSTANCE
                .getEPackage(GenericsPackage.eNS_URI);
        ArraysPackage theArraysPackage = (ArraysPackage) EPackage.Registry.INSTANCE.getEPackage(ArraysPackage.eNS_URI);
        TypesPackage theTypesPackage = (TypesPackage) EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
        CommonsPackage theCommonsPackage = (CommonsPackage) EPackage.Registry.INSTANCE
                .getEPackage(CommonsPackage.eNS_URI);
        LiteralsPackage theLiteralsPackage = (LiteralsPackage) EPackage.Registry.INSTANCE
                .getEPackage(LiteralsPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        referenceEClass.getESuperTypes().add(theExpressionsPackage.getPrimaryExpression());
        referenceEClass.getESuperTypes().add(theGenericsPackage.getTypeArgumentable());
        argumentableEClass.getESuperTypes().add(theCommonsPackage.getCommentable());
        referenceableElementEClass.getESuperTypes().add(theCommonsPackage.getNamedElement());
        elementReferenceEClass.getESuperTypes().add(this.getReference());
        identifierReferenceEClass.getESuperTypes().add(this.getElementReference());
        methodCallEClass.getESuperTypes().add(this.getElementReference());
        methodCallEClass.getESuperTypes().add(this.getArgumentable());
        methodCallEClass.getESuperTypes().add(theGenericsPackage.getCallTypeArgumentable());
        reflectiveClassReferenceEClass.getESuperTypes().add(this.getReference());
        primitiveTypeReferenceEClass.getESuperTypes().add(this.getReference());
        stringReferenceEClass.getESuperTypes().add(this.getReference());
        selfReferenceEClass.getESuperTypes().add(this.getReference());
        packageReferenceEClass.getESuperTypes().add(this.getReferenceableElement());

        // Initialize classes, features, and operations; add parameters
        initEClass(referenceEClass, Reference.class, "Reference", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getReference_Next(), this.getReference(), null, "next", null, 0, 1, Reference.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getReference_ArraySelectors(), theArraysPackage.getArraySelector(), null, "arraySelectors", null,
                0, -1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEOperation(getReference__GetReferencedType(), theTypesPackage.getType(), "getReferencedType", 0, 1,
                IS_UNIQUE, IS_ORDERED);

        initEOperation(getReference__GetPrevious(), this.getReference(), "getPrevious", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(argumentableEClass, Argumentable.class, "Argumentable", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getArgumentable_Arguments(), theExpressionsPackage.getExpression(), null, "arguments", null, 0,
                -1, Argumentable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEOperation(getArgumentable__GetArgumentTypes(), theTypesPackage.getType(), "getArgumentTypes", 0, -1,
                IS_UNIQUE, IS_ORDERED);

        initEClass(referenceableElementEClass, ReferenceableElement.class, "ReferenceableElement", IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(elementReferenceEClass, ElementReference.class, "ElementReference", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getElementReference_Target(), this.getReferenceableElement(), null, "target", null, 1, 1,
                ElementReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(identifierReferenceEClass, IdentifierReference.class, "IdentifierReference", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(methodCallEClass, MethodCall.class, "MethodCall", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(reflectiveClassReferenceEClass, ReflectiveClassReference.class, "ReflectiveClassReference",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(primitiveTypeReferenceEClass, PrimitiveTypeReference.class, "PrimitiveTypeReference", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getPrimitiveTypeReference_PrimitiveType(), theTypesPackage.getPrimitiveType(), null,
                "primitiveType", null, 1, 1, PrimitiveTypeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(stringReferenceEClass, StringReference.class, "StringReference", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getStringReference_Value(), ecorePackage.getEString(), "value", null, 1, 1,
                StringReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        initEClass(selfReferenceEClass, SelfReference.class, "SelfReference", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSelfReference_Self(), theLiteralsPackage.getSelf(), null, "self", null, 1, 1,
                SelfReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(packageReferenceEClass, PackageReference.class, "PackageReference", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getPackageReference_Subpackages(), this.getPackageReference(), null, "subpackages", null, 0, -1,
                PackageReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} //ReferencesPackageImpl
