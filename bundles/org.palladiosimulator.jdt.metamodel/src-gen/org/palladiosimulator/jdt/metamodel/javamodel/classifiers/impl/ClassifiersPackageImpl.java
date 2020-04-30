/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationsPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.annotations.impl.AnnotationsPackageImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArraysPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArraysPackageImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Annotation;
import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.AnonymousClass;
import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Classifier;
import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.ClassifiersFactory;
import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.ClassifiersPackage;
import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.ConcreteClassifier;
import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Enumeration;
import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Implementor;
import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Interface;

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
public class ClassifiersPackageImpl extends EPackageImpl implements ClassifiersPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass classifierEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass concreteClassifierEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass implementorEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass classEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass interfaceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass enumerationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass annotationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass anonymousClassEClass = null;

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
     * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.ClassifiersPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private ClassifiersPackageImpl() {
        super(eNS_URI, ClassifiersFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link ClassifiersPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static ClassifiersPackage init() {
        if (isInited)
            return (ClassifiersPackage) EPackage.Registry.INSTANCE.getEPackage(ClassifiersPackage.eNS_URI);

        // Obtain or create and register package
        Object registeredClassifiersPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        ClassifiersPackageImpl theClassifiersPackage = registeredClassifiersPackage instanceof ClassifiersPackageImpl
                ? (ClassifiersPackageImpl) registeredClassifiersPackage
                : new ClassifiersPackageImpl();

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
        theClassifiersPackage.createPackageContents();
        theAnnotationsPackage.createPackageContents();
        theArraysPackage.createPackageContents();
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
        theClassifiersPackage.initializePackageContents();
        theAnnotationsPackage.initializePackageContents();
        theArraysPackage.initializePackageContents();
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
        theClassifiersPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(ClassifiersPackage.eNS_URI, theClassifiersPackage);
        return theClassifiersPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getClassifier() {
        return classifierEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getClassifier__GetAllSuperClassifiers() {
        return classifierEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getClassifier__AddImport__String() {
        return classifierEClass.getEOperations().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getClassifier__AddPackageImport__String() {
        return classifierEClass.getEOperations().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getConcreteClassifier() {
        return concreteClassifierEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getConcreteClassifier__GetInnerClassifiers() {
        return concreteClassifierEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getConcreteClassifier__GetAllInnerClassifiers() {
        return concreteClassifierEClass.getEOperations().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getConcreteClassifier__GetSuperTypeReferences() {
        return concreteClassifierEClass.getEOperations().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getConcreteClassifier__GetAllMembers__Commentable() {
        return concreteClassifierEClass.getEOperations().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getConcreteClassifier__GetQualifiedName() {
        return concreteClassifierEClass.getEOperations().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getConcreteClassifier__IsJavaLangObject__ConcreteClassifier() {
        return concreteClassifierEClass.getEOperations().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getImplementor() {
        return implementorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getImplementor_Implements() {
        return (EReference) implementorEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getClass_() {
        return classEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getClass_Extends() {
        return (EReference) classEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getClass_DefaultExtends() {
        return (EReference) classEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getClass__GetAllSuperClassifiers() {
        return classEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getClass__GetSuperClass() {
        return classEClass.getEOperations().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getClass__UnWrapPrimitiveType() {
        return classEClass.getEOperations().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getInterface() {
        return interfaceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getInterface_Extends() {
        return (EReference) interfaceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getInterface_DefaultExtends() {
        return (EReference) interfaceEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getInterface__GetAllSuperClassifiers() {
        return interfaceEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEnumeration() {
        return enumerationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEnumeration_Constants() {
        return (EReference) enumerationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getEnumeration__GetAllSuperClassifiers() {
        return enumerationEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getEnumeration__GetContainedConstant__String() {
        return enumerationEClass.getEOperations().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAnnotation() {
        return annotationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getAnnotation__GetAllSuperClassifiers() {
        return annotationEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAnonymousClass() {
        return anonymousClassEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getAnonymousClass__GetAllSuperClassifiers() {
        return anonymousClassEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getAnonymousClass__GetSuperClassifier() {
        return anonymousClassEClass.getEOperations().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getAnonymousClass__GetAllMembers__Commentable() {
        return anonymousClassEClass.getEOperations().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ClassifiersFactory getClassifiersFactory() {
        return (ClassifiersFactory) getEFactoryInstance();
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
        classifierEClass = createEClass(CLASSIFIER);
        createEOperation(classifierEClass, CLASSIFIER___GET_ALL_SUPER_CLASSIFIERS);
        createEOperation(classifierEClass, CLASSIFIER___ADD_IMPORT__STRING);
        createEOperation(classifierEClass, CLASSIFIER___ADD_PACKAGE_IMPORT__STRING);

        concreteClassifierEClass = createEClass(CONCRETE_CLASSIFIER);
        createEOperation(concreteClassifierEClass, CONCRETE_CLASSIFIER___GET_INNER_CLASSIFIERS);
        createEOperation(concreteClassifierEClass, CONCRETE_CLASSIFIER___GET_ALL_INNER_CLASSIFIERS);
        createEOperation(concreteClassifierEClass, CONCRETE_CLASSIFIER___GET_SUPER_TYPE_REFERENCES);
        createEOperation(concreteClassifierEClass, CONCRETE_CLASSIFIER___GET_ALL_MEMBERS__COMMENTABLE);
        createEOperation(concreteClassifierEClass, CONCRETE_CLASSIFIER___GET_QUALIFIED_NAME);
        createEOperation(concreteClassifierEClass, CONCRETE_CLASSIFIER___IS_JAVA_LANG_OBJECT__CONCRETECLASSIFIER);

        implementorEClass = createEClass(IMPLEMENTOR);
        createEReference(implementorEClass, IMPLEMENTOR__IMPLEMENTS);

        classEClass = createEClass(CLASS);
        createEReference(classEClass, CLASS__EXTENDS);
        createEReference(classEClass, CLASS__DEFAULT_EXTENDS);
        createEOperation(classEClass, CLASS___GET_ALL_SUPER_CLASSIFIERS);
        createEOperation(classEClass, CLASS___GET_SUPER_CLASS);
        createEOperation(classEClass, CLASS___UN_WRAP_PRIMITIVE_TYPE);

        interfaceEClass = createEClass(INTERFACE);
        createEReference(interfaceEClass, INTERFACE__EXTENDS);
        createEReference(interfaceEClass, INTERFACE__DEFAULT_EXTENDS);
        createEOperation(interfaceEClass, INTERFACE___GET_ALL_SUPER_CLASSIFIERS);

        enumerationEClass = createEClass(ENUMERATION);
        createEReference(enumerationEClass, ENUMERATION__CONSTANTS);
        createEOperation(enumerationEClass, ENUMERATION___GET_ALL_SUPER_CLASSIFIERS);
        createEOperation(enumerationEClass, ENUMERATION___GET_CONTAINED_CONSTANT__STRING);

        annotationEClass = createEClass(ANNOTATION);
        createEOperation(annotationEClass, ANNOTATION___GET_ALL_SUPER_CLASSIFIERS);

        anonymousClassEClass = createEClass(ANONYMOUS_CLASS);
        createEOperation(anonymousClassEClass, ANONYMOUS_CLASS___GET_ALL_SUPER_CLASSIFIERS);
        createEOperation(anonymousClassEClass, ANONYMOUS_CLASS___GET_SUPER_CLASSIFIER);
        createEOperation(anonymousClassEClass, ANONYMOUS_CLASS___GET_ALL_MEMBERS__COMMENTABLE);
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
        TypesPackage theTypesPackage = (TypesPackage) EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
        ReferencesPackage theReferencesPackage = (ReferencesPackage) EPackage.Registry.INSTANCE
                .getEPackage(ReferencesPackage.eNS_URI);
        GenericsPackage theGenericsPackage = (GenericsPackage) EPackage.Registry.INSTANCE
                .getEPackage(GenericsPackage.eNS_URI);
        MembersPackage theMembersPackage = (MembersPackage) EPackage.Registry.INSTANCE
                .getEPackage(MembersPackage.eNS_URI);
        StatementsPackage theStatementsPackage = (StatementsPackage) EPackage.Registry.INSTANCE
                .getEPackage(StatementsPackage.eNS_URI);
        ModifiersPackage theModifiersPackage = (ModifiersPackage) EPackage.Registry.INSTANCE
                .getEPackage(ModifiersPackage.eNS_URI);
        CommonsPackage theCommonsPackage = (CommonsPackage) EPackage.Registry.INSTANCE
                .getEPackage(CommonsPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        classifierEClass.getESuperTypes().add(theTypesPackage.getType());
        classifierEClass.getESuperTypes().add(theReferencesPackage.getReferenceableElement());
        concreteClassifierEClass.getESuperTypes().add(this.getClassifier());
        concreteClassifierEClass.getESuperTypes().add(theGenericsPackage.getTypeParametrizable());
        concreteClassifierEClass.getESuperTypes().add(theMembersPackage.getMemberContainer());
        concreteClassifierEClass.getESuperTypes().add(theMembersPackage.getMember());
        concreteClassifierEClass.getESuperTypes().add(theStatementsPackage.getStatement());
        concreteClassifierEClass.getESuperTypes().add(theModifiersPackage.getAnnotableAndModifiable());
        implementorEClass.getESuperTypes().add(theCommonsPackage.getCommentable());
        classEClass.getESuperTypes().add(this.getConcreteClassifier());
        classEClass.getESuperTypes().add(this.getImplementor());
        interfaceEClass.getESuperTypes().add(this.getConcreteClassifier());
        enumerationEClass.getESuperTypes().add(this.getConcreteClassifier());
        enumerationEClass.getESuperTypes().add(this.getImplementor());
        annotationEClass.getESuperTypes().add(this.getConcreteClassifier());
        anonymousClassEClass.getESuperTypes().add(theTypesPackage.getType());
        anonymousClassEClass.getESuperTypes().add(theMembersPackage.getMemberContainer());

        // Initialize classes, features, and operations; add parameters
        initEClass(classifierEClass, Classifier.class, "Classifier", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEOperation(getClassifier__GetAllSuperClassifiers(), this.getConcreteClassifier(), "getAllSuperClassifiers",
                0, -1, IS_UNIQUE, IS_ORDERED);

        EOperation op = initEOperation(getClassifier__AddImport__String(), null, "addImport", 0, 1, IS_UNIQUE,
                IS_ORDERED);
        addEParameter(op, ecorePackage.getEString(), "nameOfClassToImport", 1, 1, IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getClassifier__AddPackageImport__String(), null, "addPackageImport", 0, 1, IS_UNIQUE,
                IS_ORDERED);
        addEParameter(op, ecorePackage.getEString(), "packageName", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(concreteClassifierEClass, ConcreteClassifier.class, "ConcreteClassifier", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEOperation(getConcreteClassifier__GetInnerClassifiers(), this.getConcreteClassifier(),
                "getInnerClassifiers", 0, -1, IS_UNIQUE, IS_ORDERED);

        initEOperation(getConcreteClassifier__GetAllInnerClassifiers(), this.getConcreteClassifier(),
                "getAllInnerClassifiers", 0, -1, IS_UNIQUE, IS_ORDERED);

        initEOperation(getConcreteClassifier__GetSuperTypeReferences(), theTypesPackage.getClassifierReference(),
                "getSuperTypeReferences", 0, -1, IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getConcreteClassifier__GetAllMembers__Commentable(), theMembersPackage.getMember(),
                "getAllMembers", 0, -1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, theCommonsPackage.getCommentable(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEOperation(getConcreteClassifier__GetQualifiedName(), ecorePackage.getEString(), "getQualifiedName", 1, 1,
                IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getConcreteClassifier__IsJavaLangObject__ConcreteClassifier(), ecorePackage.getEBoolean(),
                "isJavaLangObject", 1, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, this.getConcreteClassifier(), "clazz", 1, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(implementorEClass, Implementor.class, "Implementor", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getImplementor_Implements(), theTypesPackage.getTypeReference(), null, "implements", null, 0, -1,
                Implementor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(classEClass, org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Class.class, "Class",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getClass_Extends(), theTypesPackage.getTypeReference(), null, "extends", null, 0, 1,
                org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Class.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getClass_DefaultExtends(), theTypesPackage.getTypeReference(), null, "defaultExtends", null, 0,
                1, org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Class.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEOperation(getClass__GetAllSuperClassifiers(), this.getConcreteClassifier(), "getAllSuperClassifiers", 0,
                -1, IS_UNIQUE, IS_ORDERED);

        initEOperation(getClass__GetSuperClass(), this.getClass_(), "getSuperClass", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEOperation(getClass__UnWrapPrimitiveType(), theTypesPackage.getPrimitiveType(), "unWrapPrimitiveType", 0, 1,
                IS_UNIQUE, IS_ORDERED);

        initEClass(interfaceEClass, Interface.class, "Interface", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getInterface_Extends(), theTypesPackage.getTypeReference(), null, "extends", null, 0, -1,
                Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getInterface_DefaultExtends(), theTypesPackage.getTypeReference(), null, "defaultExtends", null,
                0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEOperation(getInterface__GetAllSuperClassifiers(), this.getConcreteClassifier(), "getAllSuperClassifiers",
                0, -1, IS_UNIQUE, IS_ORDERED);

        initEClass(enumerationEClass, Enumeration.class, "Enumeration", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getEnumeration_Constants(), theMembersPackage.getEnumConstant(), null, "constants", null, 0, -1,
                Enumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEOperation(getEnumeration__GetAllSuperClassifiers(), this.getConcreteClassifier(), "getAllSuperClassifiers",
                0, -1, IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getEnumeration__GetContainedConstant__String(), theMembersPackage.getEnumConstant(),
                "getContainedConstant", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEOperation(getAnnotation__GetAllSuperClassifiers(), this.getConcreteClassifier(), "getAllSuperClassifiers",
                0, -1, IS_UNIQUE, IS_ORDERED);

        initEClass(anonymousClassEClass, AnonymousClass.class, "AnonymousClass", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEOperation(getAnonymousClass__GetAllSuperClassifiers(), this.getConcreteClassifier(),
                "getAllSuperClassifiers", 0, -1, IS_UNIQUE, IS_ORDERED);

        initEOperation(getAnonymousClass__GetSuperClassifier(), this.getConcreteClassifier(), "getSuperClassifier", 0,
                1, IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getAnonymousClass__GetAllMembers__Commentable(), theMembersPackage.getMember(),
                "getAllMembers", 0, -1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, theCommonsPackage.getCommentable(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} //ClassifiersPackageImpl
