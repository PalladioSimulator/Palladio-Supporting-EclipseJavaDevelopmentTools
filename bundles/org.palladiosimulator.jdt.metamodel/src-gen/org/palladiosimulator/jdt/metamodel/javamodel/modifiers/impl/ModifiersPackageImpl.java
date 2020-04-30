/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.modifiers.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
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

import org.palladiosimulator.jdt.metamodel.javamodel.modifiers.Abstract;
import org.palladiosimulator.jdt.metamodel.javamodel.modifiers.AnnotableAndModifiable;
import org.palladiosimulator.jdt.metamodel.javamodel.modifiers.AnnotationInstanceOrModifier;
import org.palladiosimulator.jdt.metamodel.javamodel.modifiers.Final;
import org.palladiosimulator.jdt.metamodel.javamodel.modifiers.Modifiable;
import org.palladiosimulator.jdt.metamodel.javamodel.modifiers.Modifier;
import org.palladiosimulator.jdt.metamodel.javamodel.modifiers.ModifiersFactory;
import org.palladiosimulator.jdt.metamodel.javamodel.modifiers.ModifiersPackage;
import org.palladiosimulator.jdt.metamodel.javamodel.modifiers.Native;
import org.palladiosimulator.jdt.metamodel.javamodel.modifiers.Private;
import org.palladiosimulator.jdt.metamodel.javamodel.modifiers.Protected;
import org.palladiosimulator.jdt.metamodel.javamodel.modifiers.Public;
import org.palladiosimulator.jdt.metamodel.javamodel.modifiers.Static;
import org.palladiosimulator.jdt.metamodel.javamodel.modifiers.Strictfp;
import org.palladiosimulator.jdt.metamodel.javamodel.modifiers.Synchronized;
import org.palladiosimulator.jdt.metamodel.javamodel.modifiers.Transient;
import org.palladiosimulator.jdt.metamodel.javamodel.modifiers.Volatile;

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
public class ModifiersPackageImpl extends EPackageImpl implements ModifiersPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass modifierEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass annotationInstanceOrModifierEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass annotableAndModifiableEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass modifiableEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass abstractEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass finalEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nativeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass protectedEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass publicEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass privateEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass staticEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass strictfpEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass synchronizedEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass transientEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass volatileEClass = null;

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
     * @see org.palladiosimulator.jdt.metamodel.javamodel.modifiers.ModifiersPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private ModifiersPackageImpl() {
        super(eNS_URI, ModifiersFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link ModifiersPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static ModifiersPackage init() {
        if (isInited)
            return (ModifiersPackage) EPackage.Registry.INSTANCE.getEPackage(ModifiersPackage.eNS_URI);

        // Obtain or create and register package
        Object registeredModifiersPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        ModifiersPackageImpl theModifiersPackage = registeredModifiersPackage instanceof ModifiersPackageImpl
                ? (ModifiersPackageImpl) registeredModifiersPackage
                : new ModifiersPackageImpl();

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
        theModifiersPackage.createPackageContents();
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
        theOperatorsPackage.createPackageContents();
        theParametersPackage.createPackageContents();
        theReferencesPackage.createPackageContents();
        theStatementsPackage.createPackageContents();
        theTypesPackage.createPackageContents();
        theVariablesPackage.createPackageContents();

        // Initialize created meta-data
        theModifiersPackage.initializePackageContents();
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
        theOperatorsPackage.initializePackageContents();
        theParametersPackage.initializePackageContents();
        theReferencesPackage.initializePackageContents();
        theStatementsPackage.initializePackageContents();
        theTypesPackage.initializePackageContents();
        theVariablesPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theModifiersPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(ModifiersPackage.eNS_URI, theModifiersPackage);
        return theModifiersPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getModifier() {
        return modifierEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAnnotationInstanceOrModifier() {
        return annotationInstanceOrModifierEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAnnotableAndModifiable() {
        return annotableAndModifiableEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAnnotableAndModifiable_AnnotationsAndModifiers() {
        return (EReference) annotableAndModifiableEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getAnnotableAndModifiable__IsHidden__Commentable() {
        return annotableAndModifiableEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getAnnotableAndModifiable__IsStatic() {
        return annotableAndModifiableEClass.getEOperations().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getAnnotableAndModifiable__RemoveModifier__Class() {
        return annotableAndModifiableEClass.getEOperations().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getAnnotableAndModifiable__MakePublic() {
        return annotableAndModifiableEClass.getEOperations().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getAnnotableAndModifiable__MakePrivate() {
        return annotableAndModifiableEClass.getEOperations().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getAnnotableAndModifiable__MakeProtected() {
        return annotableAndModifiableEClass.getEOperations().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getAnnotableAndModifiable__GetModifiers() {
        return annotableAndModifiableEClass.getEOperations().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getAnnotableAndModifiable__RemoveAllModifiers() {
        return annotableAndModifiableEClass.getEOperations().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getAnnotableAndModifiable__HasModifier__Class() {
        return annotableAndModifiableEClass.getEOperations().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getAnnotableAndModifiable__IsPublic() {
        return annotableAndModifiableEClass.getEOperations().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getAnnotableAndModifiable__IsPrivate() {
        return annotableAndModifiableEClass.getEOperations().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getAnnotableAndModifiable__IsProtected() {
        return annotableAndModifiableEClass.getEOperations().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getAnnotableAndModifiable__AddModifier__Modifier() {
        return annotableAndModifiableEClass.getEOperations().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getAnnotableAndModifiable__GetAnnotationInstances() {
        return annotableAndModifiableEClass.getEOperations().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getModifiable() {
        return modifiableEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getModifiable_Modifiers() {
        return (EReference) modifiableEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAbstract() {
        return abstractEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getFinal() {
        return finalEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getNative() {
        return nativeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getProtected() {
        return protectedEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getPublic() {
        return publicEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getPrivate() {
        return privateEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getStatic() {
        return staticEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getStrictfp() {
        return strictfpEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSynchronized() {
        return synchronizedEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTransient() {
        return transientEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getVolatile() {
        return volatileEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ModifiersFactory getModifiersFactory() {
        return (ModifiersFactory) getEFactoryInstance();
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
        modifierEClass = createEClass(MODIFIER);

        annotationInstanceOrModifierEClass = createEClass(ANNOTATION_INSTANCE_OR_MODIFIER);

        annotableAndModifiableEClass = createEClass(ANNOTABLE_AND_MODIFIABLE);
        createEReference(annotableAndModifiableEClass, ANNOTABLE_AND_MODIFIABLE__ANNOTATIONS_AND_MODIFIERS);
        createEOperation(annotableAndModifiableEClass, ANNOTABLE_AND_MODIFIABLE___IS_HIDDEN__COMMENTABLE);
        createEOperation(annotableAndModifiableEClass, ANNOTABLE_AND_MODIFIABLE___IS_STATIC);
        createEOperation(annotableAndModifiableEClass, ANNOTABLE_AND_MODIFIABLE___REMOVE_MODIFIER__CLASS);
        createEOperation(annotableAndModifiableEClass, ANNOTABLE_AND_MODIFIABLE___MAKE_PUBLIC);
        createEOperation(annotableAndModifiableEClass, ANNOTABLE_AND_MODIFIABLE___MAKE_PRIVATE);
        createEOperation(annotableAndModifiableEClass, ANNOTABLE_AND_MODIFIABLE___MAKE_PROTECTED);
        createEOperation(annotableAndModifiableEClass, ANNOTABLE_AND_MODIFIABLE___GET_MODIFIERS);
        createEOperation(annotableAndModifiableEClass, ANNOTABLE_AND_MODIFIABLE___REMOVE_ALL_MODIFIERS);
        createEOperation(annotableAndModifiableEClass, ANNOTABLE_AND_MODIFIABLE___HAS_MODIFIER__CLASS);
        createEOperation(annotableAndModifiableEClass, ANNOTABLE_AND_MODIFIABLE___IS_PUBLIC);
        createEOperation(annotableAndModifiableEClass, ANNOTABLE_AND_MODIFIABLE___IS_PRIVATE);
        createEOperation(annotableAndModifiableEClass, ANNOTABLE_AND_MODIFIABLE___IS_PROTECTED);
        createEOperation(annotableAndModifiableEClass, ANNOTABLE_AND_MODIFIABLE___ADD_MODIFIER__MODIFIER);
        createEOperation(annotableAndModifiableEClass, ANNOTABLE_AND_MODIFIABLE___GET_ANNOTATION_INSTANCES);

        modifiableEClass = createEClass(MODIFIABLE);
        createEReference(modifiableEClass, MODIFIABLE__MODIFIERS);

        abstractEClass = createEClass(ABSTRACT);

        finalEClass = createEClass(FINAL);

        nativeEClass = createEClass(NATIVE);

        protectedEClass = createEClass(PROTECTED);

        publicEClass = createEClass(PUBLIC);

        privateEClass = createEClass(PRIVATE);

        staticEClass = createEClass(STATIC);

        strictfpEClass = createEClass(STRICTFP);

        synchronizedEClass = createEClass(SYNCHRONIZED);

        transientEClass = createEClass(TRANSIENT);

        volatileEClass = createEClass(VOLATILE);
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

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        modifierEClass.getESuperTypes().add(this.getAnnotationInstanceOrModifier());
        annotationInstanceOrModifierEClass.getESuperTypes().add(theCommonsPackage.getCommentable());
        annotableAndModifiableEClass.getESuperTypes().add(theCommonsPackage.getCommentable());
        modifiableEClass.getESuperTypes().add(theCommonsPackage.getCommentable());
        abstractEClass.getESuperTypes().add(this.getModifier());
        finalEClass.getESuperTypes().add(this.getModifier());
        nativeEClass.getESuperTypes().add(this.getModifier());
        protectedEClass.getESuperTypes().add(this.getModifier());
        publicEClass.getESuperTypes().add(this.getModifier());
        privateEClass.getESuperTypes().add(this.getModifier());
        staticEClass.getESuperTypes().add(this.getModifier());
        strictfpEClass.getESuperTypes().add(this.getModifier());
        synchronizedEClass.getESuperTypes().add(this.getModifier());
        transientEClass.getESuperTypes().add(this.getModifier());
        volatileEClass.getESuperTypes().add(this.getModifier());

        // Initialize classes, features, and operations; add parameters
        initEClass(modifierEClass, Modifier.class, "Modifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(annotationInstanceOrModifierEClass, AnnotationInstanceOrModifier.class,
                "AnnotationInstanceOrModifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(annotableAndModifiableEClass, AnnotableAndModifiable.class, "AnnotableAndModifiable", IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAnnotableAndModifiable_AnnotationsAndModifiers(), this.getAnnotationInstanceOrModifier(),
                null, "annotationsAndModifiers", null, 0, -1, AnnotableAndModifiable.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        EOperation op = initEOperation(getAnnotableAndModifiable__IsHidden__Commentable(), ecorePackage.getEBoolean(),
                "isHidden", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, theCommonsPackage.getCommentable(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEOperation(getAnnotableAndModifiable__IsStatic(), ecorePackage.getEBoolean(), "isStatic", 0, 1, IS_UNIQUE,
                IS_ORDERED);

        op = initEOperation(getAnnotableAndModifiable__RemoveModifier__Class(), null, "removeModifier", 0, 1, IS_UNIQUE,
                IS_ORDERED);
        EGenericType g1 = createEGenericType(ecorePackage.getEJavaClass());
        EGenericType g2 = createEGenericType();
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "modifierType", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEOperation(getAnnotableAndModifiable__MakePublic(), null, "makePublic", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEOperation(getAnnotableAndModifiable__MakePrivate(), null, "makePrivate", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEOperation(getAnnotableAndModifiable__MakeProtected(), null, "makeProtected", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEOperation(getAnnotableAndModifiable__GetModifiers(), this.getModifier(), "getModifiers", 0, -1, IS_UNIQUE,
                IS_ORDERED);

        initEOperation(getAnnotableAndModifiable__RemoveAllModifiers(), null, "removeAllModifiers", 0, 1, IS_UNIQUE,
                IS_ORDERED);

        op = initEOperation(getAnnotableAndModifiable__HasModifier__Class(), ecorePackage.getEBoolean(), "hasModifier",
                0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEJavaClass());
        g2 = createEGenericType();
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "type", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEOperation(getAnnotableAndModifiable__IsPublic(), ecorePackage.getEBoolean(), "isPublic", 0, 1, IS_UNIQUE,
                IS_ORDERED);

        initEOperation(getAnnotableAndModifiable__IsPrivate(), ecorePackage.getEBoolean(), "isPrivate", 0, 1, IS_UNIQUE,
                IS_ORDERED);

        initEOperation(getAnnotableAndModifiable__IsProtected(), ecorePackage.getEBoolean(), "isProtected", 0, 1,
                IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getAnnotableAndModifiable__AddModifier__Modifier(), null, "addModifier", 0, 1, IS_UNIQUE,
                IS_ORDERED);
        addEParameter(op, this.getModifier(), "newModifier", 1, 1, IS_UNIQUE, IS_ORDERED);

        initEOperation(getAnnotableAndModifiable__GetAnnotationInstances(),
                theAnnotationsPackage.getAnnotationInstance(), "getAnnotationInstances", 0, -1, IS_UNIQUE, IS_ORDERED);

        initEClass(modifiableEClass, Modifiable.class, "Modifiable", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getModifiable_Modifiers(), this.getModifier(), null, "modifiers", null, 0, -1, Modifiable.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(abstractEClass, Abstract.class, "Abstract", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(finalEClass, Final.class, "Final", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(nativeEClass, Native.class, "Native", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(protectedEClass, Protected.class, "Protected", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(publicEClass, Public.class, "Public", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(privateEClass, Private.class, "Private", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(staticEClass, Static.class, "Static", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(strictfpEClass, Strictfp.class, "Strictfp", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(synchronizedEClass, Synchronized.class, "Synchronized", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(transientEClass, Transient.class, "Transient", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(volatileEClass, Volatile.class, "Volatile", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        // Create resource
        createResource(eNS_URI);
    }

} //ModifiersPackageImpl
