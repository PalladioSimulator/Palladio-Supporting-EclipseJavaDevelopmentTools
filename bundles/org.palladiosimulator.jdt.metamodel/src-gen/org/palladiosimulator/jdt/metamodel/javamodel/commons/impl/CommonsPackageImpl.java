/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.commons.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationsPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.annotations.impl.AnnotationsPackageImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArraysPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArraysPackageImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.ClassifiersPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.ClassifiersPackageImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable;
import org.palladiosimulator.jdt.metamodel.javamodel.commons.CommonsFactory;
import org.palladiosimulator.jdt.metamodel.javamodel.commons.CommonsPackage;
import org.palladiosimulator.jdt.metamodel.javamodel.commons.NamedElement;
import org.palladiosimulator.jdt.metamodel.javamodel.commons.NamespaceAwareElement;

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
public class CommonsPackageImpl extends EPackageImpl implements CommonsPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass commentableEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass namedElementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass namespaceAwareElementEClass = null;

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
     * @see org.palladiosimulator.jdt.metamodel.javamodel.commons.CommonsPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private CommonsPackageImpl() {
        super(eNS_URI, CommonsFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link CommonsPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static CommonsPackage init() {
        if (isInited)
            return (CommonsPackage) EPackage.Registry.INSTANCE.getEPackage(CommonsPackage.eNS_URI);

        // Obtain or create and register package
        Object registeredCommonsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        CommonsPackageImpl theCommonsPackage = registeredCommonsPackage instanceof CommonsPackageImpl
                ? (CommonsPackageImpl) registeredCommonsPackage
                : new CommonsPackageImpl();

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
        theCommonsPackage.createPackageContents();
        theAnnotationsPackage.createPackageContents();
        theArraysPackage.createPackageContents();
        theClassifiersPackage.createPackageContents();
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
        theCommonsPackage.initializePackageContents();
        theAnnotationsPackage.initializePackageContents();
        theArraysPackage.initializePackageContents();
        theClassifiersPackage.initializePackageContents();
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
        theCommonsPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(CommonsPackage.eNS_URI, theCommonsPackage);
        return theCommonsPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getCommentable() {
        return commentableEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getCommentable__GetConcreteClassifier__String() {
        return commentableEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getCommentable__GetConcreteClassifierProxy__String() {
        return commentableEClass.getEOperations().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getCommentable__GetConcreteClassifiers__String_String() {
        return commentableEClass.getEOperations().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getCommentable__GetConcreteClassifierProxies__String_String() {
        return commentableEClass.getEOperations().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getCommentable__GetLibClass__String() {
        return commentableEClass.getEOperations().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getCommentable__GetLibInterface__String() {
        return commentableEClass.getEOperations().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getCommentable__GetClassClass() {
        return commentableEClass.getEOperations().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getCommentable__GetObjectClass() {
        return commentableEClass.getEOperations().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getCommentable__GetStringClass() {
        return commentableEClass.getEOperations().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getCommentable__GetAnnotationInterface() {
        return commentableEClass.getEOperations().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getCommentable__GetContainingAnnotationInstance() {
        return commentableEClass.getEOperations().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getCommentable__GetContainingAnonymousClass() {
        return commentableEClass.getEOperations().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getCommentable__GetContainingConcreteClassifier() {
        return commentableEClass.getEOperations().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getCommentable__GetContainingCompilationUnit() {
        return commentableEClass.getEOperations().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getCommentable__GetContainingPackageName() {
        return commentableEClass.getEOperations().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getCommentable__GetContainingContainerName() {
        return commentableEClass.getEOperations().get(15);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getCommentable__GetParentConcreteClassifier() {
        return commentableEClass.getEOperations().get(16);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getCommentable__GetParentByEType__EClass() {
        return commentableEClass.getEOperations().get(17);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getCommentable__GetFirstChildByEType__EClass() {
        return commentableEClass.getEOperations().get(18);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getCommentable__GetParentByType__Class() {
        return commentableEClass.getEOperations().get(19);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getCommentable__GetFirstChildByType__Class() {
        return commentableEClass.getEOperations().get(20);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getCommentable__GetChildrenByEType__EClass() {
        return commentableEClass.getEOperations().get(21);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getCommentable__GetChildrenByType__Class() {
        return commentableEClass.getEOperations().get(22);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getCommentable__GetComments() {
        return commentableEClass.getEOperations().get(23);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getCommentable__AddBeforeContainingStatement__Statement() {
        return commentableEClass.getEOperations().get(24);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getCommentable__AddAfterContainingStatement__Statement() {
        return commentableEClass.getEOperations().get(25);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getNamedElement() {
        return namedElementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getNamedElement_Name() {
        return (EAttribute) namedElementEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getNamespaceAwareElement() {
        return namespaceAwareElementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getNamespaceAwareElement_Namespaces() {
        return (EAttribute) namespaceAwareElementEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getNamespaceAwareElement__GetNamespacesAsString() {
        return namespaceAwareElementEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getNamespaceAwareElement__GetClassifierAtNamespaces() {
        return namespaceAwareElementEClass.getEOperations().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CommonsFactory getCommonsFactory() {
        return (CommonsFactory) getEFactoryInstance();
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
        commentableEClass = createEClass(COMMENTABLE);
        createEOperation(commentableEClass, COMMENTABLE___GET_CONCRETE_CLASSIFIER__STRING);
        createEOperation(commentableEClass, COMMENTABLE___GET_CONCRETE_CLASSIFIER_PROXY__STRING);
        createEOperation(commentableEClass, COMMENTABLE___GET_CONCRETE_CLASSIFIERS__STRING_STRING);
        createEOperation(commentableEClass, COMMENTABLE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING);
        createEOperation(commentableEClass, COMMENTABLE___GET_LIB_CLASS__STRING);
        createEOperation(commentableEClass, COMMENTABLE___GET_LIB_INTERFACE__STRING);
        createEOperation(commentableEClass, COMMENTABLE___GET_CLASS_CLASS);
        createEOperation(commentableEClass, COMMENTABLE___GET_OBJECT_CLASS);
        createEOperation(commentableEClass, COMMENTABLE___GET_STRING_CLASS);
        createEOperation(commentableEClass, COMMENTABLE___GET_ANNOTATION_INTERFACE);
        createEOperation(commentableEClass, COMMENTABLE___GET_CONTAINING_ANNOTATION_INSTANCE);
        createEOperation(commentableEClass, COMMENTABLE___GET_CONTAINING_ANONYMOUS_CLASS);
        createEOperation(commentableEClass, COMMENTABLE___GET_CONTAINING_CONCRETE_CLASSIFIER);
        createEOperation(commentableEClass, COMMENTABLE___GET_CONTAINING_COMPILATION_UNIT);
        createEOperation(commentableEClass, COMMENTABLE___GET_CONTAINING_PACKAGE_NAME);
        createEOperation(commentableEClass, COMMENTABLE___GET_CONTAINING_CONTAINER_NAME);
        createEOperation(commentableEClass, COMMENTABLE___GET_PARENT_CONCRETE_CLASSIFIER);
        createEOperation(commentableEClass, COMMENTABLE___GET_PARENT_BY_ETYPE__ECLASS);
        createEOperation(commentableEClass, COMMENTABLE___GET_FIRST_CHILD_BY_ETYPE__ECLASS);
        createEOperation(commentableEClass, COMMENTABLE___GET_PARENT_BY_TYPE__CLASS);
        createEOperation(commentableEClass, COMMENTABLE___GET_FIRST_CHILD_BY_TYPE__CLASS);
        createEOperation(commentableEClass, COMMENTABLE___GET_CHILDREN_BY_ETYPE__ECLASS);
        createEOperation(commentableEClass, COMMENTABLE___GET_CHILDREN_BY_TYPE__CLASS);
        createEOperation(commentableEClass, COMMENTABLE___GET_COMMENTS);
        createEOperation(commentableEClass, COMMENTABLE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT);
        createEOperation(commentableEClass, COMMENTABLE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT);

        namedElementEClass = createEClass(NAMED_ELEMENT);
        createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

        namespaceAwareElementEClass = createEClass(NAMESPACE_AWARE_ELEMENT);
        createEAttribute(namespaceAwareElementEClass, NAMESPACE_AWARE_ELEMENT__NAMESPACES);
        createEOperation(namespaceAwareElementEClass, NAMESPACE_AWARE_ELEMENT___GET_NAMESPACES_AS_STRING);
        createEOperation(namespaceAwareElementEClass, NAMESPACE_AWARE_ELEMENT___GET_CLASSIFIER_AT_NAMESPACES);
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
        ClassifiersPackage theClassifiersPackage = (ClassifiersPackage) EPackage.Registry.INSTANCE
                .getEPackage(ClassifiersPackage.eNS_URI);
        AnnotationsPackage theAnnotationsPackage = (AnnotationsPackage) EPackage.Registry.INSTANCE
                .getEPackage(AnnotationsPackage.eNS_URI);
        ContainersPackage theContainersPackage = (ContainersPackage) EPackage.Registry.INSTANCE
                .getEPackage(ContainersPackage.eNS_URI);
        StatementsPackage theStatementsPackage = (StatementsPackage) EPackage.Registry.INSTANCE
                .getEPackage(StatementsPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        namedElementEClass.getESuperTypes().add(this.getCommentable());
        namespaceAwareElementEClass.getESuperTypes().add(this.getCommentable());

        // Initialize classes, features, and operations; add parameters
        initEClass(commentableEClass, Commentable.class, "Commentable", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        EOperation op = initEOperation(getCommentable__GetConcreteClassifier__String(),
                theClassifiersPackage.getConcreteClassifier(), "getConcreteClassifier", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getCommentable__GetConcreteClassifierProxy__String(),
                theClassifiersPackage.getConcreteClassifier(), "getConcreteClassifierProxy", 0, 1, IS_UNIQUE,
                IS_ORDERED);
        addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getCommentable__GetConcreteClassifiers__String_String(),
                theClassifiersPackage.getConcreteClassifier(), "getConcreteClassifiers", 0, -1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEString(), "packageName", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEString(), "classifierQuery", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getCommentable__GetConcreteClassifierProxies__String_String(),
                theClassifiersPackage.getConcreteClassifier(), "getConcreteClassifierProxies", 0, -1, IS_UNIQUE,
                IS_ORDERED);
        addEParameter(op, ecorePackage.getEString(), "packageName", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEString(), "classifierQuery", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getCommentable__GetLibClass__String(), theClassifiersPackage.getClass_(), "getLibClass", 0,
                1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getCommentable__GetLibInterface__String(), theClassifiersPackage.getInterface(),
                "getLibInterface", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEOperation(getCommentable__GetClassClass(), theClassifiersPackage.getClass_(), "getClassClass", 0, 1,
                IS_UNIQUE, IS_ORDERED);

        initEOperation(getCommentable__GetObjectClass(), theClassifiersPackage.getClass_(), "getObjectClass", 0, 1,
                IS_UNIQUE, IS_ORDERED);

        initEOperation(getCommentable__GetStringClass(), theClassifiersPackage.getClass_(), "getStringClass", 0, 1,
                IS_UNIQUE, IS_ORDERED);

        initEOperation(getCommentable__GetAnnotationInterface(), theClassifiersPackage.getInterface(),
                "getAnnotationInterface", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEOperation(getCommentable__GetContainingAnnotationInstance(), theAnnotationsPackage.getAnnotationInstance(),
                "getContainingAnnotationInstance", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEOperation(getCommentable__GetContainingAnonymousClass(), theClassifiersPackage.getAnonymousClass(),
                "getContainingAnonymousClass", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEOperation(getCommentable__GetContainingConcreteClassifier(), theClassifiersPackage.getConcreteClassifier(),
                "getContainingConcreteClassifier", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEOperation(getCommentable__GetContainingCompilationUnit(), theContainersPackage.getCompilationUnit(),
                "getContainingCompilationUnit", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEOperation(getCommentable__GetContainingPackageName(), ecorePackage.getEString(),
                "getContainingPackageName", 0, -1, IS_UNIQUE, IS_ORDERED);

        initEOperation(getCommentable__GetContainingContainerName(), ecorePackage.getEString(),
                "getContainingContainerName", 0, -1, IS_UNIQUE, IS_ORDERED);

        initEOperation(getCommentable__GetParentConcreteClassifier(), theClassifiersPackage.getConcreteClassifier(),
                "getParentConcreteClassifier", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getCommentable__GetParentByEType__EClass(), ecorePackage.getEObject(), "getParentByEType",
                0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEClass(), "type", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getCommentable__GetFirstChildByEType__EClass(), ecorePackage.getEObject(),
                "getFirstChildByEType", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEClass(), "type", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getCommentable__GetParentByType__Class(), null, "getParentByType", 0, 1, IS_UNIQUE,
                IS_ORDERED);
        ETypeParameter t1 = addETypeParameter(op, "T");
        EGenericType g1 = createEGenericType(ecorePackage.getEJavaClass());
        EGenericType g2 = createEGenericType(t1);
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "type", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(t1);
        initEOperation(op, g1);

        op = initEOperation(getCommentable__GetFirstChildByType__Class(), null, "getFirstChildByType", 0, 1, IS_UNIQUE,
                IS_ORDERED);
        t1 = addETypeParameter(op, "T");
        g1 = createEGenericType(ecorePackage.getEJavaClass());
        g2 = createEGenericType(t1);
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "type", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(t1);
        initEOperation(op, g1);

        op = initEOperation(getCommentable__GetChildrenByEType__EClass(), ecorePackage.getEObject(),
                "getChildrenByEType", 0, -1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEClass(), "type", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getCommentable__GetChildrenByType__Class(), null, "getChildrenByType", 0, -1, IS_UNIQUE,
                IS_ORDERED);
        t1 = addETypeParameter(op, "T");
        g1 = createEGenericType(ecorePackage.getEJavaClass());
        g2 = createEGenericType(t1);
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "type", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(t1);
        initEOperation(op, g1);

        initEOperation(getCommentable__GetComments(), ecorePackage.getEString(), "getComments", 0, -1, IS_UNIQUE,
                IS_ORDERED);

        op = initEOperation(getCommentable__AddBeforeContainingStatement__Statement(), null,
                "addBeforeContainingStatement", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, theStatementsPackage.getStatement(), "statementToAdd", 1, 1, IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getCommentable__AddAfterContainingStatement__Statement(), null,
                "addAfterContainingStatement", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, theStatementsPackage.getStatement(), "statementToAdd", 1, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(namespaceAwareElementEClass, NamespaceAwareElement.class, "NamespaceAwareElement", IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getNamespaceAwareElement_Namespaces(), ecorePackage.getEString(), "namespaces", null, 0, -1,
                NamespaceAwareElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEOperation(getNamespaceAwareElement__GetNamespacesAsString(), ecorePackage.getEString(),
                "getNamespacesAsString", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEOperation(getNamespaceAwareElement__GetClassifierAtNamespaces(),
                theClassifiersPackage.getConcreteClassifier(), "getClassifierAtNamespaces", 0, 1, IS_UNIQUE,
                IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} //CommonsPackageImpl
