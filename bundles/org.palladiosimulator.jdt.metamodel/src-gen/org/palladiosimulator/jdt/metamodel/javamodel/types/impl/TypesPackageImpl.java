/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.types.impl;

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

import org.palladiosimulator.jdt.metamodel.javamodel.references.ReferencesPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.references.impl.ReferencesPackageImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementsPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.statements.impl.StatementsPackageImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.types.Char;
import org.palladiosimulator.jdt.metamodel.javamodel.types.ClassifierReference;
import org.palladiosimulator.jdt.metamodel.javamodel.types.Int;
import org.palladiosimulator.jdt.metamodel.javamodel.types.NamespaceClassifierReference;
import org.palladiosimulator.jdt.metamodel.javamodel.types.PrimitiveType;
import org.palladiosimulator.jdt.metamodel.javamodel.types.Type;
import org.palladiosimulator.jdt.metamodel.javamodel.types.TypeReference;
import org.palladiosimulator.jdt.metamodel.javamodel.types.TypedElement;
import org.palladiosimulator.jdt.metamodel.javamodel.types.TypesFactory;
import org.palladiosimulator.jdt.metamodel.javamodel.types.TypesPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.variables.VariablesPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.variables.impl.VariablesPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypesPackageImpl extends EPackageImpl implements TypesPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass typeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass typedElementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass typeReferenceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass classifierReferenceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass namespaceClassifierReferenceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass primitiveTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass booleanEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass byteEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass charEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass doubleEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass floatEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass intEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass longEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass shortEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass voidEClass = null;

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
     * @see org.palladiosimulator.jdt.metamodel.javamodel.types.TypesPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private TypesPackageImpl() {
        super(eNS_URI, TypesFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link TypesPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static TypesPackage init() {
        if (isInited)
            return (TypesPackage) EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

        // Obtain or create and register package
        Object registeredTypesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        TypesPackageImpl theTypesPackage = registeredTypesPackage instanceof TypesPackageImpl
                ? (TypesPackageImpl) registeredTypesPackage
                : new TypesPackageImpl();

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
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ReferencesPackage.eNS_URI);
        ReferencesPackageImpl theReferencesPackage = (ReferencesPackageImpl) (registeredPackage instanceof ReferencesPackageImpl
                ? registeredPackage
                : ReferencesPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StatementsPackage.eNS_URI);
        StatementsPackageImpl theStatementsPackage = (StatementsPackageImpl) (registeredPackage instanceof StatementsPackageImpl
                ? registeredPackage
                : StatementsPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(VariablesPackage.eNS_URI);
        VariablesPackageImpl theVariablesPackage = (VariablesPackageImpl) (registeredPackage instanceof VariablesPackageImpl
                ? registeredPackage
                : VariablesPackage.eINSTANCE);

        // Create package meta-data objects
        theTypesPackage.createPackageContents();
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
        theVariablesPackage.createPackageContents();

        // Initialize created meta-data
        theTypesPackage.initializePackageContents();
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
        theVariablesPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theTypesPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(TypesPackage.eNS_URI, theTypesPackage);
        return theTypesPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getType() {
        return typeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getType__EqualsType__long_Type_long() {
        return typeEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getType__IsSuperType__long_Type_ArrayTypeable() {
        return typeEClass.getEOperations().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getType__GetAllMembers__Commentable() {
        return typeEClass.getEOperations().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTypedElement() {
        return typedElementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTypedElement_TypeReference() {
        return (EReference) typedElementEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTypeReference() {
        return typeReferenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getTypeReference__GetTarget() {
        return typeReferenceEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getTypeReference__SetTarget__Classifier() {
        return typeReferenceEClass.getEOperations().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getTypeReference__GetBoundTarget__Reference() {
        return typeReferenceEClass.getEOperations().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getTypeReference__GetPureClassifierReference() {
        return typeReferenceEClass.getEOperations().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getClassifierReference() {
        return classifierReferenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getClassifierReference_Target() {
        return (EReference) classifierReferenceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getNamespaceClassifierReference() {
        return namespaceClassifierReferenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getNamespaceClassifierReference_ClassifierReferences() {
        return (EReference) namespaceClassifierReferenceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getPrimitiveType() {
        return primitiveTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getPrimitiveType__GetAllMembers__Commentable() {
        return primitiveTypeEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getPrimitiveType__WrapPrimitiveType() {
        return primitiveTypeEClass.getEOperations().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getBoolean() {
        return booleanEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getByte() {
        return byteEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getChar() {
        return charEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getDouble() {
        return doubleEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getFloat() {
        return floatEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getInt() {
        return intEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getLong() {
        return longEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getShort() {
        return shortEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getVoid() {
        return voidEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TypesFactory getTypesFactory() {
        return (TypesFactory) getEFactoryInstance();
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
        typeEClass = createEClass(TYPE);
        createEOperation(typeEClass, TYPE___EQUALS_TYPE__LONG_TYPE_LONG);
        createEOperation(typeEClass, TYPE___IS_SUPER_TYPE__LONG_TYPE_ARRAYTYPEABLE);
        createEOperation(typeEClass, TYPE___GET_ALL_MEMBERS__COMMENTABLE);

        typedElementEClass = createEClass(TYPED_ELEMENT);
        createEReference(typedElementEClass, TYPED_ELEMENT__TYPE_REFERENCE);

        typeReferenceEClass = createEClass(TYPE_REFERENCE);
        createEOperation(typeReferenceEClass, TYPE_REFERENCE___GET_TARGET);
        createEOperation(typeReferenceEClass, TYPE_REFERENCE___SET_TARGET__CLASSIFIER);
        createEOperation(typeReferenceEClass, TYPE_REFERENCE___GET_BOUND_TARGET__REFERENCE);
        createEOperation(typeReferenceEClass, TYPE_REFERENCE___GET_PURE_CLASSIFIER_REFERENCE);

        classifierReferenceEClass = createEClass(CLASSIFIER_REFERENCE);
        createEReference(classifierReferenceEClass, CLASSIFIER_REFERENCE__TARGET);

        namespaceClassifierReferenceEClass = createEClass(NAMESPACE_CLASSIFIER_REFERENCE);
        createEReference(namespaceClassifierReferenceEClass, NAMESPACE_CLASSIFIER_REFERENCE__CLASSIFIER_REFERENCES);

        primitiveTypeEClass = createEClass(PRIMITIVE_TYPE);
        createEOperation(primitiveTypeEClass, PRIMITIVE_TYPE___GET_ALL_MEMBERS__COMMENTABLE);
        createEOperation(primitiveTypeEClass, PRIMITIVE_TYPE___WRAP_PRIMITIVE_TYPE);

        booleanEClass = createEClass(BOOLEAN);

        byteEClass = createEClass(BYTE);

        charEClass = createEClass(CHAR);

        doubleEClass = createEClass(DOUBLE);

        floatEClass = createEClass(FLOAT);

        intEClass = createEClass(INT);

        longEClass = createEClass(LONG);

        shortEClass = createEClass(SHORT);

        voidEClass = createEClass(VOID);
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
        ArraysPackage theArraysPackage = (ArraysPackage) EPackage.Registry.INSTANCE.getEPackage(ArraysPackage.eNS_URI);
        MembersPackage theMembersPackage = (MembersPackage) EPackage.Registry.INSTANCE
                .getEPackage(MembersPackage.eNS_URI);
        ClassifiersPackage theClassifiersPackage = (ClassifiersPackage) EPackage.Registry.INSTANCE
                .getEPackage(ClassifiersPackage.eNS_URI);
        ReferencesPackage theReferencesPackage = (ReferencesPackage) EPackage.Registry.INSTANCE
                .getEPackage(ReferencesPackage.eNS_URI);
        GenericsPackage theGenericsPackage = (GenericsPackage) EPackage.Registry.INSTANCE
                .getEPackage(GenericsPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        typeEClass.getESuperTypes().add(theCommonsPackage.getCommentable());
        typedElementEClass.getESuperTypes().add(theCommonsPackage.getCommentable());
        typeReferenceEClass.getESuperTypes().add(theCommonsPackage.getCommentable());
        classifierReferenceEClass.getESuperTypes().add(this.getTypeReference());
        classifierReferenceEClass.getESuperTypes().add(theGenericsPackage.getTypeArgumentable());
        namespaceClassifierReferenceEClass.getESuperTypes().add(this.getTypeReference());
        namespaceClassifierReferenceEClass.getESuperTypes().add(theCommonsPackage.getNamespaceAwareElement());
        primitiveTypeEClass.getESuperTypes().add(this.getType());
        primitiveTypeEClass.getESuperTypes().add(this.getTypeReference());
        booleanEClass.getESuperTypes().add(this.getPrimitiveType());
        byteEClass.getESuperTypes().add(this.getPrimitiveType());
        charEClass.getESuperTypes().add(this.getPrimitiveType());
        doubleEClass.getESuperTypes().add(this.getPrimitiveType());
        floatEClass.getESuperTypes().add(this.getPrimitiveType());
        intEClass.getESuperTypes().add(this.getPrimitiveType());
        longEClass.getESuperTypes().add(this.getPrimitiveType());
        shortEClass.getESuperTypes().add(this.getPrimitiveType());
        voidEClass.getESuperTypes().add(this.getPrimitiveType());

        // Initialize classes, features, and operations; add parameters
        initEClass(typeEClass, Type.class, "Type", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        EOperation op = initEOperation(getType__EqualsType__long_Type_long(), ecorePackage.getEBoolean(), "equalsType",
                0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getELong(), "arrayDimension", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, this.getType(), "otherType", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getELong(), "otherArrayDimension", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getType__IsSuperType__long_Type_ArrayTypeable(), ecorePackage.getEBoolean(), "isSuperType",
                0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getELong(), "arrayDimension", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, this.getType(), "otherType", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, theArraysPackage.getArrayTypeable(), "otherArrayType", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getType__GetAllMembers__Commentable(), theMembersPackage.getMember(), "getAllMembers", 0,
                -1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, theCommonsPackage.getCommentable(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(typedElementEClass, TypedElement.class, "TypedElement", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTypedElement_TypeReference(), this.getTypeReference(), null, "typeReference", null, 1, 1,
                TypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(typeReferenceEClass, TypeReference.class, "TypeReference", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEOperation(getTypeReference__GetTarget(), this.getType(), "getTarget", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getTypeReference__SetTarget__Classifier(), null, "setTarget", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, theClassifiersPackage.getClassifier(), "type", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getTypeReference__GetBoundTarget__Reference(), this.getType(), "getBoundTarget", 0, 1,
                IS_UNIQUE, IS_ORDERED);
        addEParameter(op, theReferencesPackage.getReference(), "reference", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEOperation(getTypeReference__GetPureClassifierReference(), this.getClassifierReference(),
                "getPureClassifierReference", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(classifierReferenceEClass, ClassifierReference.class, "ClassifierReference", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getClassifierReference_Target(), theClassifiersPackage.getClassifier(), null, "target", null, 1,
                1, ClassifierReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(namespaceClassifierReferenceEClass, NamespaceClassifierReference.class,
                "NamespaceClassifierReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getNamespaceClassifierReference_ClassifierReferences(), this.getClassifierReference(), null,
                "classifierReferences", null, 1, -1, NamespaceClassifierReference.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(primitiveTypeEClass, PrimitiveType.class, "PrimitiveType", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        op = initEOperation(getPrimitiveType__GetAllMembers__Commentable(), theMembersPackage.getMember(),
                "getAllMembers", 0, -1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, theCommonsPackage.getCommentable(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEOperation(getPrimitiveType__WrapPrimitiveType(), theClassifiersPackage.getClass_(), "wrapPrimitiveType", 0,
                1, IS_UNIQUE, IS_ORDERED);

        initEClass(booleanEClass, org.palladiosimulator.jdt.metamodel.javamodel.types.Boolean.class, "Boolean",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(byteEClass, org.palladiosimulator.jdt.metamodel.javamodel.types.Byte.class, "Byte", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(charEClass, Char.class, "Char", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(doubleEClass, org.palladiosimulator.jdt.metamodel.javamodel.types.Double.class, "Double",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(floatEClass, org.palladiosimulator.jdt.metamodel.javamodel.types.Float.class, "Float", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(intEClass, Int.class, "Int", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(longEClass, org.palladiosimulator.jdt.metamodel.javamodel.types.Long.class, "Long", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(shortEClass, org.palladiosimulator.jdt.metamodel.javamodel.types.Short.class, "Short", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(voidEClass, org.palladiosimulator.jdt.metamodel.javamodel.types.Void.class, "Void", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        // Create resource
        createResource(eNS_URI);
    }

} //TypesPackageImpl
