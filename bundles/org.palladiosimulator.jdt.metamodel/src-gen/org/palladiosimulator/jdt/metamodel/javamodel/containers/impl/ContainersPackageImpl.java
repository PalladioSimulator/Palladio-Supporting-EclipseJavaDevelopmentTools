/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.containers.impl;

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

import org.palladiosimulator.jdt.metamodel.javamodel.containers.CompilationUnit;
import org.palladiosimulator.jdt.metamodel.javamodel.containers.ContainersFactory;
import org.palladiosimulator.jdt.metamodel.javamodel.containers.ContainersPackage;
import org.palladiosimulator.jdt.metamodel.javamodel.containers.EmptyModel;
import org.palladiosimulator.jdt.metamodel.javamodel.containers.JavaRoot;
import org.palladiosimulator.jdt.metamodel.javamodel.containers.ProjectRoot;

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
public class ContainersPackageImpl extends EPackageImpl implements ContainersPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass javaRootEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass compilationUnitEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass packageEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass emptyModelEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass projectRootEClass = null;

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
     * @see org.palladiosimulator.jdt.metamodel.javamodel.containers.ContainersPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private ContainersPackageImpl() {
        super(eNS_URI, ContainersFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link ContainersPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static ContainersPackage init() {
        if (isInited)
            return (ContainersPackage) EPackage.Registry.INSTANCE.getEPackage(ContainersPackage.eNS_URI);

        // Obtain or create and register package
        Object registeredContainersPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        ContainersPackageImpl theContainersPackage = registeredContainersPackage instanceof ContainersPackageImpl
                ? (ContainersPackageImpl) registeredContainersPackage
                : new ContainersPackageImpl();

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
        theContainersPackage.createPackageContents();
        theAnnotationsPackage.createPackageContents();
        theArraysPackage.createPackageContents();
        theClassifiersPackage.createPackageContents();
        theCommonsPackage.createPackageContents();
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
        theContainersPackage.initializePackageContents();
        theAnnotationsPackage.initializePackageContents();
        theArraysPackage.initializePackageContents();
        theClassifiersPackage.initializePackageContents();
        theCommonsPackage.initializePackageContents();
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
        theContainersPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(ContainersPackage.eNS_URI, theContainersPackage);
        return theContainersPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getJavaRoot() {
        return javaRootEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getJavaRoot__GetClassifiersInSamePackage() {
        return javaRootEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getCompilationUnit() {
        return compilationUnitEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getCompilationUnit_Classifiers() {
        return (EReference) compilationUnitEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getCompilationUnit__GetContainedClassifier__String() {
        return compilationUnitEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getCompilationUnit__GetClassifiersInSamePackage() {
        return compilationUnitEClass.getEOperations().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getCompilationUnit__GetContainedClass() {
        return compilationUnitEClass.getEOperations().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getCompilationUnit__GetContainedInterface() {
        return compilationUnitEClass.getEOperations().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getCompilationUnit__GetContainedAnnotation() {
        return compilationUnitEClass.getEOperations().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getCompilationUnit__GetContainedEnumeration() {
        return compilationUnitEClass.getEOperations().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getCompilationUnit__AddImport__String() {
        return compilationUnitEClass.getEOperations().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getCompilationUnit__AddPackageImport__String() {
        return compilationUnitEClass.getEOperations().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getPackage() {
        return packageEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getPackage_CompilationUnits() {
        return (EReference) packageEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getPackage__GetNamespacesAsString() {
        return packageEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getPackage__GetClassifiersInSamePackage() {
        return packageEClass.getEOperations().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEmptyModel() {
        return emptyModelEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getProjectRoot() {
        return projectRootEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getProjectRoot_Packages() {
        return (EReference) projectRootEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getProjectRoot_Path() {
        return (EAttribute) projectRootEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ContainersFactory getContainersFactory() {
        return (ContainersFactory) getEFactoryInstance();
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
        javaRootEClass = createEClass(JAVA_ROOT);
        createEOperation(javaRootEClass, JAVA_ROOT___GET_CLASSIFIERS_IN_SAME_PACKAGE);

        compilationUnitEClass = createEClass(COMPILATION_UNIT);
        createEReference(compilationUnitEClass, COMPILATION_UNIT__CLASSIFIERS);
        createEOperation(compilationUnitEClass, COMPILATION_UNIT___GET_CONTAINED_CLASSIFIER__STRING);
        createEOperation(compilationUnitEClass, COMPILATION_UNIT___GET_CLASSIFIERS_IN_SAME_PACKAGE);
        createEOperation(compilationUnitEClass, COMPILATION_UNIT___GET_CONTAINED_CLASS);
        createEOperation(compilationUnitEClass, COMPILATION_UNIT___GET_CONTAINED_INTERFACE);
        createEOperation(compilationUnitEClass, COMPILATION_UNIT___GET_CONTAINED_ANNOTATION);
        createEOperation(compilationUnitEClass, COMPILATION_UNIT___GET_CONTAINED_ENUMERATION);
        createEOperation(compilationUnitEClass, COMPILATION_UNIT___ADD_IMPORT__STRING);
        createEOperation(compilationUnitEClass, COMPILATION_UNIT___ADD_PACKAGE_IMPORT__STRING);

        packageEClass = createEClass(PACKAGE);
        createEReference(packageEClass, PACKAGE__COMPILATION_UNITS);
        createEOperation(packageEClass, PACKAGE___GET_NAMESPACES_AS_STRING);
        createEOperation(packageEClass, PACKAGE___GET_CLASSIFIERS_IN_SAME_PACKAGE);

        emptyModelEClass = createEClass(EMPTY_MODEL);

        projectRootEClass = createEClass(PROJECT_ROOT);
        createEReference(projectRootEClass, PROJECT_ROOT__PACKAGES);
        createEAttribute(projectRootEClass, PROJECT_ROOT__PATH);
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
        ImportsPackage theImportsPackage = (ImportsPackage) EPackage.Registry.INSTANCE
                .getEPackage(ImportsPackage.eNS_URI);
        ClassifiersPackage theClassifiersPackage = (ClassifiersPackage) EPackage.Registry.INSTANCE
                .getEPackage(ClassifiersPackage.eNS_URI);
        AnnotationsPackage theAnnotationsPackage = (AnnotationsPackage) EPackage.Registry.INSTANCE
                .getEPackage(AnnotationsPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        javaRootEClass.getESuperTypes().add(theCommonsPackage.getNamedElement());
        javaRootEClass.getESuperTypes().add(theCommonsPackage.getNamespaceAwareElement());
        javaRootEClass.getESuperTypes().add(theImportsPackage.getImportingElement());
        compilationUnitEClass.getESuperTypes().add(this.getJavaRoot());
        packageEClass.getESuperTypes().add(this.getJavaRoot());
        packageEClass.getESuperTypes().add(theAnnotationsPackage.getAnnotable());
        emptyModelEClass.getESuperTypes().add(this.getJavaRoot());

        // Initialize classes, features, and operations; add parameters
        initEClass(javaRootEClass, JavaRoot.class, "JavaRoot", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEOperation(getJavaRoot__GetClassifiersInSamePackage(), theClassifiersPackage.getConcreteClassifier(),
                "getClassifiersInSamePackage", 0, -1, IS_UNIQUE, IS_ORDERED);

        initEClass(compilationUnitEClass, CompilationUnit.class, "CompilationUnit", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCompilationUnit_Classifiers(), theClassifiersPackage.getConcreteClassifier(), null,
                "classifiers", null, 1, -1, CompilationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        EOperation op = initEOperation(getCompilationUnit__GetContainedClassifier__String(),
                theClassifiersPackage.getConcreteClassifier(), "getContainedClassifier", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEOperation(getCompilationUnit__GetClassifiersInSamePackage(), theClassifiersPackage.getConcreteClassifier(),
                "getClassifiersInSamePackage", 0, -1, IS_UNIQUE, IS_ORDERED);

        initEOperation(getCompilationUnit__GetContainedClass(), theClassifiersPackage.getClass_(), "getContainedClass",
                0, 1, IS_UNIQUE, IS_ORDERED);

        initEOperation(getCompilationUnit__GetContainedInterface(), theClassifiersPackage.getInterface(),
                "getContainedInterface", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEOperation(getCompilationUnit__GetContainedAnnotation(), theClassifiersPackage.getAnnotation(),
                "getContainedAnnotation", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEOperation(getCompilationUnit__GetContainedEnumeration(), theClassifiersPackage.getEnumeration(),
                "getContainedEnumeration", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getCompilationUnit__AddImport__String(), null, "addImport", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEString(), "nameOfClassToImport", 1, 1, IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getCompilationUnit__AddPackageImport__String(), null, "addPackageImport", 0, 1, IS_UNIQUE,
                IS_ORDERED);
        addEParameter(op, ecorePackage.getEString(), "packageName", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(packageEClass, org.palladiosimulator.jdt.metamodel.javamodel.containers.Package.class, "Package",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getPackage_CompilationUnits(), this.getCompilationUnit(), null, "compilationUnits", null, 0, -1,
                org.palladiosimulator.jdt.metamodel.javamodel.containers.Package.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEOperation(getPackage__GetNamespacesAsString(), ecorePackage.getEString(), "getNamespacesAsString", 0, 1,
                IS_UNIQUE, IS_ORDERED);

        initEOperation(getPackage__GetClassifiersInSamePackage(), theClassifiersPackage.getConcreteClassifier(),
                "getClassifiersInSamePackage", 0, -1, IS_UNIQUE, IS_ORDERED);

        initEClass(emptyModelEClass, EmptyModel.class, "EmptyModel", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(projectRootEClass, ProjectRoot.class, "ProjectRoot", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getProjectRoot_Packages(), this.getPackage(), null, "packages", null, 0, -1, ProjectRoot.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProjectRoot_Path(), ecorePackage.getEString(), "path", "", 0, 1, ProjectRoot.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} //ContainersPackageImpl
