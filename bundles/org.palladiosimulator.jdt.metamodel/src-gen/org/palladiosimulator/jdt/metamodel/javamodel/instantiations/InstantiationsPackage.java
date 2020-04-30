/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.instantiations;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.CommonsPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.references.ReferencesPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.jdt.metamodel.javamodel.instantiations.InstantiationsFactory
 * @model kind="package"
 * @generated
 */
public interface InstantiationsPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "instantiations";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.palladiosimulator.org/javamodel/instantiations";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "instantiations";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    InstantiationsPackage eINSTANCE = org.palladiosimulator.jdt.metamodel.javamodel.instantiations.impl.InstantiationsPackageImpl
            .init();

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.instantiations.impl.InitializableImpl <em>Initializable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.instantiations.impl.InitializableImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.instantiations.impl.InstantiationsPackageImpl#getInitializable()
     * @generated
     */
    int INITIALIZABLE = 0;

    /**
     * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITIALIZABLE__INITIAL_VALUE = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Initializable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITIALIZABLE_FEATURE_COUNT = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITIALIZABLE___GET_CONCRETE_CLASSIFIER__STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITIALIZABLE___GET_CONCRETE_CLASSIFIER_PROXY__STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITIALIZABLE___GET_CONCRETE_CLASSIFIERS__STRING_STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITIALIZABLE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITIALIZABLE___GET_LIB_CLASS__STRING = CommonsPackage.COMMENTABLE___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITIALIZABLE___GET_LIB_INTERFACE__STRING = CommonsPackage.COMMENTABLE___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITIALIZABLE___GET_CLASS_CLASS = CommonsPackage.COMMENTABLE___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITIALIZABLE___GET_OBJECT_CLASS = CommonsPackage.COMMENTABLE___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITIALIZABLE___GET_STRING_CLASS = CommonsPackage.COMMENTABLE___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITIALIZABLE___GET_ANNOTATION_INTERFACE = CommonsPackage.COMMENTABLE___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITIALIZABLE___GET_CONTAINING_ANNOTATION_INSTANCE = CommonsPackage.COMMENTABLE___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITIALIZABLE___GET_CONTAINING_ANONYMOUS_CLASS = CommonsPackage.COMMENTABLE___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITIALIZABLE___GET_CONTAINING_CONCRETE_CLASSIFIER = CommonsPackage.COMMENTABLE___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITIALIZABLE___GET_CONTAINING_COMPILATION_UNIT = CommonsPackage.COMMENTABLE___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITIALIZABLE___GET_CONTAINING_PACKAGE_NAME = CommonsPackage.COMMENTABLE___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITIALIZABLE___GET_CONTAINING_CONTAINER_NAME = CommonsPackage.COMMENTABLE___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITIALIZABLE___GET_PARENT_CONCRETE_CLASSIFIER = CommonsPackage.COMMENTABLE___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITIALIZABLE___GET_PARENT_BY_ETYPE__ECLASS = CommonsPackage.COMMENTABLE___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITIALIZABLE___GET_FIRST_CHILD_BY_ETYPE__ECLASS = CommonsPackage.COMMENTABLE___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITIALIZABLE___GET_PARENT_BY_TYPE__CLASS = CommonsPackage.COMMENTABLE___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITIALIZABLE___GET_FIRST_CHILD_BY_TYPE__CLASS = CommonsPackage.COMMENTABLE___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITIALIZABLE___GET_CHILDREN_BY_ETYPE__ECLASS = CommonsPackage.COMMENTABLE___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITIALIZABLE___GET_CHILDREN_BY_TYPE__CLASS = CommonsPackage.COMMENTABLE___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITIALIZABLE___GET_COMMENTS = CommonsPackage.COMMENTABLE___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITIALIZABLE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = CommonsPackage.COMMENTABLE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITIALIZABLE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = CommonsPackage.COMMENTABLE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The number of operations of the '<em>Initializable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITIALIZABLE_OPERATION_COUNT = CommonsPackage.COMMENTABLE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.instantiations.impl.InstantiationImpl <em>Instantiation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.instantiations.impl.InstantiationImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.instantiations.impl.InstantiationsPackageImpl#getInstantiation()
     * @generated
     */
    int INSTANTIATION = 1;

    /**
     * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANTIATION__TYPE_ARGUMENTS = ReferencesPackage.REFERENCE__TYPE_ARGUMENTS;

    /**
     * The feature id for the '<em><b>Next</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANTIATION__NEXT = ReferencesPackage.REFERENCE__NEXT;

    /**
     * The feature id for the '<em><b>Array Selectors</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANTIATION__ARRAY_SELECTORS = ReferencesPackage.REFERENCE__ARRAY_SELECTORS;

    /**
     * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANTIATION__ARGUMENTS = ReferencesPackage.REFERENCE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Instantiation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANTIATION_FEATURE_COUNT = ReferencesPackage.REFERENCE_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANTIATION___GET_CONCRETE_CLASSIFIER__STRING = ReferencesPackage.REFERENCE___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANTIATION___GET_CONCRETE_CLASSIFIER_PROXY__STRING = ReferencesPackage.REFERENCE___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANTIATION___GET_CONCRETE_CLASSIFIERS__STRING_STRING = ReferencesPackage.REFERENCE___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANTIATION___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = ReferencesPackage.REFERENCE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANTIATION___GET_LIB_CLASS__STRING = ReferencesPackage.REFERENCE___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANTIATION___GET_LIB_INTERFACE__STRING = ReferencesPackage.REFERENCE___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANTIATION___GET_CLASS_CLASS = ReferencesPackage.REFERENCE___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANTIATION___GET_OBJECT_CLASS = ReferencesPackage.REFERENCE___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANTIATION___GET_STRING_CLASS = ReferencesPackage.REFERENCE___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANTIATION___GET_ANNOTATION_INTERFACE = ReferencesPackage.REFERENCE___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANTIATION___GET_CONTAINING_ANNOTATION_INSTANCE = ReferencesPackage.REFERENCE___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANTIATION___GET_CONTAINING_ANONYMOUS_CLASS = ReferencesPackage.REFERENCE___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANTIATION___GET_CONTAINING_CONCRETE_CLASSIFIER = ReferencesPackage.REFERENCE___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANTIATION___GET_CONTAINING_COMPILATION_UNIT = ReferencesPackage.REFERENCE___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANTIATION___GET_CONTAINING_PACKAGE_NAME = ReferencesPackage.REFERENCE___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANTIATION___GET_CONTAINING_CONTAINER_NAME = ReferencesPackage.REFERENCE___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANTIATION___GET_PARENT_CONCRETE_CLASSIFIER = ReferencesPackage.REFERENCE___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANTIATION___GET_PARENT_BY_ETYPE__ECLASS = ReferencesPackage.REFERENCE___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANTIATION___GET_FIRST_CHILD_BY_ETYPE__ECLASS = ReferencesPackage.REFERENCE___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANTIATION___GET_PARENT_BY_TYPE__CLASS = ReferencesPackage.REFERENCE___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANTIATION___GET_FIRST_CHILD_BY_TYPE__CLASS = ReferencesPackage.REFERENCE___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANTIATION___GET_CHILDREN_BY_ETYPE__ECLASS = ReferencesPackage.REFERENCE___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANTIATION___GET_CHILDREN_BY_TYPE__CLASS = ReferencesPackage.REFERENCE___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANTIATION___GET_COMMENTS = ReferencesPackage.REFERENCE___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANTIATION___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = ReferencesPackage.REFERENCE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANTIATION___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = ReferencesPackage.REFERENCE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANTIATION___GET_TYPE = ReferencesPackage.REFERENCE___GET_TYPE;

    /**
     * The operation id for the '<em>Get Alternative Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANTIATION___GET_ALTERNATIVE_TYPE = ReferencesPackage.REFERENCE___GET_ALTERNATIVE_TYPE;

    /**
     * The operation id for the '<em>Get One Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANTIATION___GET_ONE_TYPE__BOOLEAN = ReferencesPackage.REFERENCE___GET_ONE_TYPE__BOOLEAN;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANTIATION___GET_ARRAY_DIMENSION = ReferencesPackage.REFERENCE___GET_ARRAY_DIMENSION;

    /**
     * The operation id for the '<em>Get Referenced Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANTIATION___GET_REFERENCED_TYPE = ReferencesPackage.REFERENCE___GET_REFERENCED_TYPE;

    /**
     * The operation id for the '<em>Get Previous</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANTIATION___GET_PREVIOUS = ReferencesPackage.REFERENCE___GET_PREVIOUS;

    /**
     * The operation id for the '<em>Get Argument Types</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANTIATION___GET_ARGUMENT_TYPES = ReferencesPackage.REFERENCE_OPERATION_COUNT + 0;

    /**
     * The number of operations of the '<em>Instantiation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANTIATION_OPERATION_COUNT = ReferencesPackage.REFERENCE_OPERATION_COUNT + 1;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.instantiations.impl.NewConstructorCallImpl <em>New Constructor Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.instantiations.impl.NewConstructorCallImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.instantiations.impl.InstantiationsPackageImpl#getNewConstructorCall()
     * @generated
     */
    int NEW_CONSTRUCTOR_CALL = 2;

    /**
     * The feature id for the '<em><b>Type Reference</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEW_CONSTRUCTOR_CALL__TYPE_REFERENCE = TypesPackage.TYPED_ELEMENT__TYPE_REFERENCE;

    /**
     * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEW_CONSTRUCTOR_CALL__TYPE_ARGUMENTS = TypesPackage.TYPED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Next</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEW_CONSTRUCTOR_CALL__NEXT = TypesPackage.TYPED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Array Selectors</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEW_CONSTRUCTOR_CALL__ARRAY_SELECTORS = TypesPackage.TYPED_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEW_CONSTRUCTOR_CALL__ARGUMENTS = TypesPackage.TYPED_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Call Type Arguments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEW_CONSTRUCTOR_CALL__CALL_TYPE_ARGUMENTS = TypesPackage.TYPED_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Anonymous Class</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEW_CONSTRUCTOR_CALL__ANONYMOUS_CLASS = TypesPackage.TYPED_ELEMENT_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>New Constructor Call</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEW_CONSTRUCTOR_CALL_FEATURE_COUNT = TypesPackage.TYPED_ELEMENT_FEATURE_COUNT + 6;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEW_CONSTRUCTOR_CALL___GET_CONCRETE_CLASSIFIER__STRING = TypesPackage.TYPED_ELEMENT___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEW_CONSTRUCTOR_CALL___GET_CONCRETE_CLASSIFIER_PROXY__STRING = TypesPackage.TYPED_ELEMENT___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEW_CONSTRUCTOR_CALL___GET_CONCRETE_CLASSIFIERS__STRING_STRING = TypesPackage.TYPED_ELEMENT___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEW_CONSTRUCTOR_CALL___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = TypesPackage.TYPED_ELEMENT___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEW_CONSTRUCTOR_CALL___GET_LIB_CLASS__STRING = TypesPackage.TYPED_ELEMENT___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEW_CONSTRUCTOR_CALL___GET_LIB_INTERFACE__STRING = TypesPackage.TYPED_ELEMENT___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEW_CONSTRUCTOR_CALL___GET_CLASS_CLASS = TypesPackage.TYPED_ELEMENT___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEW_CONSTRUCTOR_CALL___GET_OBJECT_CLASS = TypesPackage.TYPED_ELEMENT___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEW_CONSTRUCTOR_CALL___GET_STRING_CLASS = TypesPackage.TYPED_ELEMENT___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEW_CONSTRUCTOR_CALL___GET_ANNOTATION_INTERFACE = TypesPackage.TYPED_ELEMENT___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEW_CONSTRUCTOR_CALL___GET_CONTAINING_ANNOTATION_INSTANCE = TypesPackage.TYPED_ELEMENT___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEW_CONSTRUCTOR_CALL___GET_CONTAINING_ANONYMOUS_CLASS = TypesPackage.TYPED_ELEMENT___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEW_CONSTRUCTOR_CALL___GET_CONTAINING_CONCRETE_CLASSIFIER = TypesPackage.TYPED_ELEMENT___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEW_CONSTRUCTOR_CALL___GET_CONTAINING_COMPILATION_UNIT = TypesPackage.TYPED_ELEMENT___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEW_CONSTRUCTOR_CALL___GET_CONTAINING_PACKAGE_NAME = TypesPackage.TYPED_ELEMENT___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEW_CONSTRUCTOR_CALL___GET_CONTAINING_CONTAINER_NAME = TypesPackage.TYPED_ELEMENT___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEW_CONSTRUCTOR_CALL___GET_PARENT_CONCRETE_CLASSIFIER = TypesPackage.TYPED_ELEMENT___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEW_CONSTRUCTOR_CALL___GET_PARENT_BY_ETYPE__ECLASS = TypesPackage.TYPED_ELEMENT___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEW_CONSTRUCTOR_CALL___GET_FIRST_CHILD_BY_ETYPE__ECLASS = TypesPackage.TYPED_ELEMENT___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEW_CONSTRUCTOR_CALL___GET_PARENT_BY_TYPE__CLASS = TypesPackage.TYPED_ELEMENT___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEW_CONSTRUCTOR_CALL___GET_FIRST_CHILD_BY_TYPE__CLASS = TypesPackage.TYPED_ELEMENT___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEW_CONSTRUCTOR_CALL___GET_CHILDREN_BY_ETYPE__ECLASS = TypesPackage.TYPED_ELEMENT___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEW_CONSTRUCTOR_CALL___GET_CHILDREN_BY_TYPE__CLASS = TypesPackage.TYPED_ELEMENT___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEW_CONSTRUCTOR_CALL___GET_COMMENTS = TypesPackage.TYPED_ELEMENT___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEW_CONSTRUCTOR_CALL___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = TypesPackage.TYPED_ELEMENT___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEW_CONSTRUCTOR_CALL___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = TypesPackage.TYPED_ELEMENT___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEW_CONSTRUCTOR_CALL___GET_TYPE = TypesPackage.TYPED_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The operation id for the '<em>Get Alternative Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEW_CONSTRUCTOR_CALL___GET_ALTERNATIVE_TYPE = TypesPackage.TYPED_ELEMENT_OPERATION_COUNT + 1;

    /**
     * The operation id for the '<em>Get One Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEW_CONSTRUCTOR_CALL___GET_ONE_TYPE__BOOLEAN = TypesPackage.TYPED_ELEMENT_OPERATION_COUNT + 2;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEW_CONSTRUCTOR_CALL___GET_ARRAY_DIMENSION = TypesPackage.TYPED_ELEMENT_OPERATION_COUNT + 3;

    /**
     * The operation id for the '<em>Get Referenced Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEW_CONSTRUCTOR_CALL___GET_REFERENCED_TYPE = TypesPackage.TYPED_ELEMENT_OPERATION_COUNT + 4;

    /**
     * The operation id for the '<em>Get Previous</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEW_CONSTRUCTOR_CALL___GET_PREVIOUS = TypesPackage.TYPED_ELEMENT_OPERATION_COUNT + 5;

    /**
     * The operation id for the '<em>Get Argument Types</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEW_CONSTRUCTOR_CALL___GET_ARGUMENT_TYPES = TypesPackage.TYPED_ELEMENT_OPERATION_COUNT + 6;

    /**
     * The number of operations of the '<em>New Constructor Call</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEW_CONSTRUCTOR_CALL_OPERATION_COUNT = TypesPackage.TYPED_ELEMENT_OPERATION_COUNT + 7;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.instantiations.impl.ExplicitConstructorCallImpl <em>Explicit Constructor Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.instantiations.impl.ExplicitConstructorCallImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.instantiations.impl.InstantiationsPackageImpl#getExplicitConstructorCall()
     * @generated
     */
    int EXPLICIT_CONSTRUCTOR_CALL = 3;

    /**
     * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_CONSTRUCTOR_CALL__TYPE_ARGUMENTS = INSTANTIATION__TYPE_ARGUMENTS;

    /**
     * The feature id for the '<em><b>Next</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_CONSTRUCTOR_CALL__NEXT = INSTANTIATION__NEXT;

    /**
     * The feature id for the '<em><b>Array Selectors</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_CONSTRUCTOR_CALL__ARRAY_SELECTORS = INSTANTIATION__ARRAY_SELECTORS;

    /**
     * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_CONSTRUCTOR_CALL__ARGUMENTS = INSTANTIATION__ARGUMENTS;

    /**
     * The feature id for the '<em><b>Call Target</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_CONSTRUCTOR_CALL__CALL_TARGET = INSTANTIATION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Explicit Constructor Call</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_CONSTRUCTOR_CALL_FEATURE_COUNT = INSTANTIATION_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_CONSTRUCTOR_CALL___GET_CONCRETE_CLASSIFIER__STRING = INSTANTIATION___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_CONSTRUCTOR_CALL___GET_CONCRETE_CLASSIFIER_PROXY__STRING = INSTANTIATION___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_CONSTRUCTOR_CALL___GET_CONCRETE_CLASSIFIERS__STRING_STRING = INSTANTIATION___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_CONSTRUCTOR_CALL___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = INSTANTIATION___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_CONSTRUCTOR_CALL___GET_LIB_CLASS__STRING = INSTANTIATION___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_CONSTRUCTOR_CALL___GET_LIB_INTERFACE__STRING = INSTANTIATION___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_CONSTRUCTOR_CALL___GET_CLASS_CLASS = INSTANTIATION___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_CONSTRUCTOR_CALL___GET_OBJECT_CLASS = INSTANTIATION___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_CONSTRUCTOR_CALL___GET_STRING_CLASS = INSTANTIATION___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_CONSTRUCTOR_CALL___GET_ANNOTATION_INTERFACE = INSTANTIATION___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_CONSTRUCTOR_CALL___GET_CONTAINING_ANNOTATION_INSTANCE = INSTANTIATION___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_CONSTRUCTOR_CALL___GET_CONTAINING_ANONYMOUS_CLASS = INSTANTIATION___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_CONSTRUCTOR_CALL___GET_CONTAINING_CONCRETE_CLASSIFIER = INSTANTIATION___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_CONSTRUCTOR_CALL___GET_CONTAINING_COMPILATION_UNIT = INSTANTIATION___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_CONSTRUCTOR_CALL___GET_CONTAINING_PACKAGE_NAME = INSTANTIATION___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_CONSTRUCTOR_CALL___GET_CONTAINING_CONTAINER_NAME = INSTANTIATION___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_CONSTRUCTOR_CALL___GET_PARENT_CONCRETE_CLASSIFIER = INSTANTIATION___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_CONSTRUCTOR_CALL___GET_PARENT_BY_ETYPE__ECLASS = INSTANTIATION___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_CONSTRUCTOR_CALL___GET_FIRST_CHILD_BY_ETYPE__ECLASS = INSTANTIATION___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_CONSTRUCTOR_CALL___GET_PARENT_BY_TYPE__CLASS = INSTANTIATION___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_CONSTRUCTOR_CALL___GET_FIRST_CHILD_BY_TYPE__CLASS = INSTANTIATION___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_CONSTRUCTOR_CALL___GET_CHILDREN_BY_ETYPE__ECLASS = INSTANTIATION___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_CONSTRUCTOR_CALL___GET_CHILDREN_BY_TYPE__CLASS = INSTANTIATION___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_CONSTRUCTOR_CALL___GET_COMMENTS = INSTANTIATION___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_CONSTRUCTOR_CALL___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = INSTANTIATION___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_CONSTRUCTOR_CALL___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = INSTANTIATION___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_CONSTRUCTOR_CALL___GET_TYPE = INSTANTIATION___GET_TYPE;

    /**
     * The operation id for the '<em>Get Alternative Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_CONSTRUCTOR_CALL___GET_ALTERNATIVE_TYPE = INSTANTIATION___GET_ALTERNATIVE_TYPE;

    /**
     * The operation id for the '<em>Get One Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_CONSTRUCTOR_CALL___GET_ONE_TYPE__BOOLEAN = INSTANTIATION___GET_ONE_TYPE__BOOLEAN;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_CONSTRUCTOR_CALL___GET_ARRAY_DIMENSION = INSTANTIATION___GET_ARRAY_DIMENSION;

    /**
     * The operation id for the '<em>Get Referenced Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_CONSTRUCTOR_CALL___GET_REFERENCED_TYPE = INSTANTIATION___GET_REFERENCED_TYPE;

    /**
     * The operation id for the '<em>Get Previous</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_CONSTRUCTOR_CALL___GET_PREVIOUS = INSTANTIATION___GET_PREVIOUS;

    /**
     * The operation id for the '<em>Get Argument Types</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_CONSTRUCTOR_CALL___GET_ARGUMENT_TYPES = INSTANTIATION___GET_ARGUMENT_TYPES;

    /**
     * The number of operations of the '<em>Explicit Constructor Call</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_CONSTRUCTOR_CALL_OPERATION_COUNT = INSTANTIATION_OPERATION_COUNT + 0;

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.instantiations.Initializable <em>Initializable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Initializable</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.instantiations.Initializable
     * @generated
     */
    EClass getInitializable();

    /**
     * Returns the meta object for the containment reference '{@link org.palladiosimulator.jdt.metamodel.javamodel.instantiations.Initializable#getInitialValue <em>Initial Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Initial Value</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.instantiations.Initializable#getInitialValue()
     * @see #getInitializable()
     * @generated
     */
    EReference getInitializable_InitialValue();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.instantiations.Instantiation <em>Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Instantiation</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.instantiations.Instantiation
     * @generated
     */
    EClass getInstantiation();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.instantiations.NewConstructorCall <em>New Constructor Call</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>New Constructor Call</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.instantiations.NewConstructorCall
     * @generated
     */
    EClass getNewConstructorCall();

    /**
     * Returns the meta object for the containment reference '{@link org.palladiosimulator.jdt.metamodel.javamodel.instantiations.NewConstructorCall#getAnonymousClass <em>Anonymous Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Anonymous Class</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.instantiations.NewConstructorCall#getAnonymousClass()
     * @see #getNewConstructorCall()
     * @generated
     */
    EReference getNewConstructorCall_AnonymousClass();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.instantiations.ExplicitConstructorCall <em>Explicit Constructor Call</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Explicit Constructor Call</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.instantiations.ExplicitConstructorCall
     * @generated
     */
    EClass getExplicitConstructorCall();

    /**
     * Returns the meta object for the containment reference '{@link org.palladiosimulator.jdt.metamodel.javamodel.instantiations.ExplicitConstructorCall#getCallTarget <em>Call Target</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Call Target</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.instantiations.ExplicitConstructorCall#getCallTarget()
     * @see #getExplicitConstructorCall()
     * @generated
     */
    EReference getExplicitConstructorCall_CallTarget();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    InstantiationsFactory getInstantiationsFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.instantiations.impl.InitializableImpl <em>Initializable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.instantiations.impl.InitializableImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.instantiations.impl.InstantiationsPackageImpl#getInitializable()
         * @generated
         */
        EClass INITIALIZABLE = eINSTANCE.getInitializable();

        /**
         * The meta object literal for the '<em><b>Initial Value</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INITIALIZABLE__INITIAL_VALUE = eINSTANCE.getInitializable_InitialValue();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.instantiations.impl.InstantiationImpl <em>Instantiation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.instantiations.impl.InstantiationImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.instantiations.impl.InstantiationsPackageImpl#getInstantiation()
         * @generated
         */
        EClass INSTANTIATION = eINSTANCE.getInstantiation();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.instantiations.impl.NewConstructorCallImpl <em>New Constructor Call</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.instantiations.impl.NewConstructorCallImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.instantiations.impl.InstantiationsPackageImpl#getNewConstructorCall()
         * @generated
         */
        EClass NEW_CONSTRUCTOR_CALL = eINSTANCE.getNewConstructorCall();

        /**
         * The meta object literal for the '<em><b>Anonymous Class</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NEW_CONSTRUCTOR_CALL__ANONYMOUS_CLASS = eINSTANCE.getNewConstructorCall_AnonymousClass();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.instantiations.impl.ExplicitConstructorCallImpl <em>Explicit Constructor Call</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.instantiations.impl.ExplicitConstructorCallImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.instantiations.impl.InstantiationsPackageImpl#getExplicitConstructorCall()
         * @generated
         */
        EClass EXPLICIT_CONSTRUCTOR_CALL = eINSTANCE.getExplicitConstructorCall();

        /**
         * The meta object literal for the '<em><b>Call Target</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EXPLICIT_CONSTRUCTOR_CALL__CALL_TARGET = eINSTANCE.getExplicitConstructorCall_CallTarget();

    }

} //InstantiationsPackage
