/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.parameters;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.CommonsPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.variables.VariablesPackage;

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
 * @see org.palladiosimulator.jdt.metamodel.javamodel.parameters.ParametersFactory
 * @model kind="package"
 * @generated
 */
public interface ParametersPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "parameters";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.palladiosimulator.org/javamodel/parameters";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "parameters";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ParametersPackage eINSTANCE = org.palladiosimulator.jdt.metamodel.javamodel.parameters.impl.ParametersPackageImpl
            .init();

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.parameters.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.parameters.impl.ParameterImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.parameters.impl.ParametersPackageImpl#getParameter()
     * @generated
     */
    int PARAMETER = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER__NAME = VariablesPackage.VARIABLE__NAME;

    /**
     * The feature id for the '<em><b>Type Reference</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER__TYPE_REFERENCE = VariablesPackage.VARIABLE__TYPE_REFERENCE;

    /**
     * The feature id for the '<em><b>Array Dimensions Before</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER__ARRAY_DIMENSIONS_BEFORE = VariablesPackage.VARIABLE__ARRAY_DIMENSIONS_BEFORE;

    /**
     * The feature id for the '<em><b>Array Dimensions After</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER__ARRAY_DIMENSIONS_AFTER = VariablesPackage.VARIABLE__ARRAY_DIMENSIONS_AFTER;

    /**
     * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER__TYPE_ARGUMENTS = VariablesPackage.VARIABLE__TYPE_ARGUMENTS;

    /**
     * The feature id for the '<em><b>Annotations And Modifiers</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER__ANNOTATIONS_AND_MODIFIERS = VariablesPackage.VARIABLE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Parameter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_FEATURE_COUNT = VariablesPackage.VARIABLE_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER___GET_CONCRETE_CLASSIFIER__STRING = VariablesPackage.VARIABLE___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER___GET_CONCRETE_CLASSIFIER_PROXY__STRING = VariablesPackage.VARIABLE___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER___GET_CONCRETE_CLASSIFIERS__STRING_STRING = VariablesPackage.VARIABLE___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = VariablesPackage.VARIABLE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER___GET_LIB_CLASS__STRING = VariablesPackage.VARIABLE___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER___GET_LIB_INTERFACE__STRING = VariablesPackage.VARIABLE___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER___GET_CLASS_CLASS = VariablesPackage.VARIABLE___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER___GET_OBJECT_CLASS = VariablesPackage.VARIABLE___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER___GET_STRING_CLASS = VariablesPackage.VARIABLE___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER___GET_ANNOTATION_INTERFACE = VariablesPackage.VARIABLE___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER___GET_CONTAINING_ANNOTATION_INSTANCE = VariablesPackage.VARIABLE___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER___GET_CONTAINING_ANONYMOUS_CLASS = VariablesPackage.VARIABLE___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER___GET_CONTAINING_CONCRETE_CLASSIFIER = VariablesPackage.VARIABLE___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER___GET_CONTAINING_COMPILATION_UNIT = VariablesPackage.VARIABLE___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER___GET_CONTAINING_PACKAGE_NAME = VariablesPackage.VARIABLE___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER___GET_CONTAINING_CONTAINER_NAME = VariablesPackage.VARIABLE___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER___GET_PARENT_CONCRETE_CLASSIFIER = VariablesPackage.VARIABLE___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER___GET_PARENT_BY_ETYPE__ECLASS = VariablesPackage.VARIABLE___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER___GET_FIRST_CHILD_BY_ETYPE__ECLASS = VariablesPackage.VARIABLE___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER___GET_PARENT_BY_TYPE__CLASS = VariablesPackage.VARIABLE___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER___GET_FIRST_CHILD_BY_TYPE__CLASS = VariablesPackage.VARIABLE___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER___GET_CHILDREN_BY_ETYPE__ECLASS = VariablesPackage.VARIABLE___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER___GET_CHILDREN_BY_TYPE__CLASS = VariablesPackage.VARIABLE___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER___GET_COMMENTS = VariablesPackage.VARIABLE___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = VariablesPackage.VARIABLE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = VariablesPackage.VARIABLE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER___GET_ARRAY_DIMENSION = VariablesPackage.VARIABLE___GET_ARRAY_DIMENSION;

    /**
     * The operation id for the '<em>Create Method Call Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER___CREATE_METHOD_CALL_STATEMENT__STRING_ELIST = VariablesPackage.VARIABLE___CREATE_METHOD_CALL_STATEMENT__STRING_ELIST;

    /**
     * The operation id for the '<em>Create Method Call</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER___CREATE_METHOD_CALL__STRING_ELIST = VariablesPackage.VARIABLE___CREATE_METHOD_CALL__STRING_ELIST;

    /**
     * The operation id for the '<em>Is Hidden</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER___IS_HIDDEN__COMMENTABLE = VariablesPackage.VARIABLE_OPERATION_COUNT + 0;

    /**
     * The operation id for the '<em>Is Static</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER___IS_STATIC = VariablesPackage.VARIABLE_OPERATION_COUNT + 1;

    /**
     * The operation id for the '<em>Remove Modifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER___REMOVE_MODIFIER__CLASS = VariablesPackage.VARIABLE_OPERATION_COUNT + 2;

    /**
     * The operation id for the '<em>Make Public</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER___MAKE_PUBLIC = VariablesPackage.VARIABLE_OPERATION_COUNT + 3;

    /**
     * The operation id for the '<em>Make Private</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER___MAKE_PRIVATE = VariablesPackage.VARIABLE_OPERATION_COUNT + 4;

    /**
     * The operation id for the '<em>Make Protected</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER___MAKE_PROTECTED = VariablesPackage.VARIABLE_OPERATION_COUNT + 5;

    /**
     * The operation id for the '<em>Get Modifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER___GET_MODIFIERS = VariablesPackage.VARIABLE_OPERATION_COUNT + 6;

    /**
     * The operation id for the '<em>Remove All Modifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER___REMOVE_ALL_MODIFIERS = VariablesPackage.VARIABLE_OPERATION_COUNT + 7;

    /**
     * The operation id for the '<em>Has Modifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER___HAS_MODIFIER__CLASS = VariablesPackage.VARIABLE_OPERATION_COUNT + 8;

    /**
     * The operation id for the '<em>Is Public</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER___IS_PUBLIC = VariablesPackage.VARIABLE_OPERATION_COUNT + 9;

    /**
     * The operation id for the '<em>Is Private</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER___IS_PRIVATE = VariablesPackage.VARIABLE_OPERATION_COUNT + 10;

    /**
     * The operation id for the '<em>Is Protected</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER___IS_PROTECTED = VariablesPackage.VARIABLE_OPERATION_COUNT + 11;

    /**
     * The operation id for the '<em>Add Modifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER___ADD_MODIFIER__MODIFIER = VariablesPackage.VARIABLE_OPERATION_COUNT + 12;

    /**
     * The operation id for the '<em>Get Annotation Instances</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER___GET_ANNOTATION_INSTANCES = VariablesPackage.VARIABLE_OPERATION_COUNT + 13;

    /**
     * The number of operations of the '<em>Parameter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_OPERATION_COUNT = VariablesPackage.VARIABLE_OPERATION_COUNT + 14;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.parameters.impl.ParametrizableImpl <em>Parametrizable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.parameters.impl.ParametrizableImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.parameters.impl.ParametersPackageImpl#getParametrizable()
     * @generated
     */
    int PARAMETRIZABLE = 1;

    /**
     * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETRIZABLE__PARAMETERS = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Parametrizable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETRIZABLE_FEATURE_COUNT = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETRIZABLE___GET_CONCRETE_CLASSIFIER__STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETRIZABLE___GET_CONCRETE_CLASSIFIER_PROXY__STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETRIZABLE___GET_CONCRETE_CLASSIFIERS__STRING_STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETRIZABLE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETRIZABLE___GET_LIB_CLASS__STRING = CommonsPackage.COMMENTABLE___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETRIZABLE___GET_LIB_INTERFACE__STRING = CommonsPackage.COMMENTABLE___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETRIZABLE___GET_CLASS_CLASS = CommonsPackage.COMMENTABLE___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETRIZABLE___GET_OBJECT_CLASS = CommonsPackage.COMMENTABLE___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETRIZABLE___GET_STRING_CLASS = CommonsPackage.COMMENTABLE___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETRIZABLE___GET_ANNOTATION_INTERFACE = CommonsPackage.COMMENTABLE___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETRIZABLE___GET_CONTAINING_ANNOTATION_INSTANCE = CommonsPackage.COMMENTABLE___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETRIZABLE___GET_CONTAINING_ANONYMOUS_CLASS = CommonsPackage.COMMENTABLE___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETRIZABLE___GET_CONTAINING_CONCRETE_CLASSIFIER = CommonsPackage.COMMENTABLE___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETRIZABLE___GET_CONTAINING_COMPILATION_UNIT = CommonsPackage.COMMENTABLE___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETRIZABLE___GET_CONTAINING_PACKAGE_NAME = CommonsPackage.COMMENTABLE___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETRIZABLE___GET_CONTAINING_CONTAINER_NAME = CommonsPackage.COMMENTABLE___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETRIZABLE___GET_PARENT_CONCRETE_CLASSIFIER = CommonsPackage.COMMENTABLE___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETRIZABLE___GET_PARENT_BY_ETYPE__ECLASS = CommonsPackage.COMMENTABLE___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETRIZABLE___GET_FIRST_CHILD_BY_ETYPE__ECLASS = CommonsPackage.COMMENTABLE___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETRIZABLE___GET_PARENT_BY_TYPE__CLASS = CommonsPackage.COMMENTABLE___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETRIZABLE___GET_FIRST_CHILD_BY_TYPE__CLASS = CommonsPackage.COMMENTABLE___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETRIZABLE___GET_CHILDREN_BY_ETYPE__ECLASS = CommonsPackage.COMMENTABLE___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETRIZABLE___GET_CHILDREN_BY_TYPE__CLASS = CommonsPackage.COMMENTABLE___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETRIZABLE___GET_COMMENTS = CommonsPackage.COMMENTABLE___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETRIZABLE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = CommonsPackage.COMMENTABLE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETRIZABLE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = CommonsPackage.COMMENTABLE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The number of operations of the '<em>Parametrizable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETRIZABLE_OPERATION_COUNT = CommonsPackage.COMMENTABLE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.parameters.impl.OrdinaryParameterImpl <em>Ordinary Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.parameters.impl.OrdinaryParameterImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.parameters.impl.ParametersPackageImpl#getOrdinaryParameter()
     * @generated
     */
    int ORDINARY_PARAMETER = 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORDINARY_PARAMETER__NAME = PARAMETER__NAME;

    /**
     * The feature id for the '<em><b>Type Reference</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORDINARY_PARAMETER__TYPE_REFERENCE = PARAMETER__TYPE_REFERENCE;

    /**
     * The feature id for the '<em><b>Array Dimensions Before</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORDINARY_PARAMETER__ARRAY_DIMENSIONS_BEFORE = PARAMETER__ARRAY_DIMENSIONS_BEFORE;

    /**
     * The feature id for the '<em><b>Array Dimensions After</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORDINARY_PARAMETER__ARRAY_DIMENSIONS_AFTER = PARAMETER__ARRAY_DIMENSIONS_AFTER;

    /**
     * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORDINARY_PARAMETER__TYPE_ARGUMENTS = PARAMETER__TYPE_ARGUMENTS;

    /**
     * The feature id for the '<em><b>Annotations And Modifiers</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORDINARY_PARAMETER__ANNOTATIONS_AND_MODIFIERS = PARAMETER__ANNOTATIONS_AND_MODIFIERS;

    /**
     * The number of structural features of the '<em>Ordinary Parameter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORDINARY_PARAMETER_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORDINARY_PARAMETER___GET_CONCRETE_CLASSIFIER__STRING = PARAMETER___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORDINARY_PARAMETER___GET_CONCRETE_CLASSIFIER_PROXY__STRING = PARAMETER___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORDINARY_PARAMETER___GET_CONCRETE_CLASSIFIERS__STRING_STRING = PARAMETER___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORDINARY_PARAMETER___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = PARAMETER___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORDINARY_PARAMETER___GET_LIB_CLASS__STRING = PARAMETER___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORDINARY_PARAMETER___GET_LIB_INTERFACE__STRING = PARAMETER___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORDINARY_PARAMETER___GET_CLASS_CLASS = PARAMETER___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORDINARY_PARAMETER___GET_OBJECT_CLASS = PARAMETER___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORDINARY_PARAMETER___GET_STRING_CLASS = PARAMETER___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORDINARY_PARAMETER___GET_ANNOTATION_INTERFACE = PARAMETER___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORDINARY_PARAMETER___GET_CONTAINING_ANNOTATION_INSTANCE = PARAMETER___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORDINARY_PARAMETER___GET_CONTAINING_ANONYMOUS_CLASS = PARAMETER___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORDINARY_PARAMETER___GET_CONTAINING_CONCRETE_CLASSIFIER = PARAMETER___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORDINARY_PARAMETER___GET_CONTAINING_COMPILATION_UNIT = PARAMETER___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORDINARY_PARAMETER___GET_CONTAINING_PACKAGE_NAME = PARAMETER___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORDINARY_PARAMETER___GET_CONTAINING_CONTAINER_NAME = PARAMETER___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORDINARY_PARAMETER___GET_PARENT_CONCRETE_CLASSIFIER = PARAMETER___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORDINARY_PARAMETER___GET_PARENT_BY_ETYPE__ECLASS = PARAMETER___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORDINARY_PARAMETER___GET_FIRST_CHILD_BY_ETYPE__ECLASS = PARAMETER___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORDINARY_PARAMETER___GET_PARENT_BY_TYPE__CLASS = PARAMETER___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORDINARY_PARAMETER___GET_FIRST_CHILD_BY_TYPE__CLASS = PARAMETER___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORDINARY_PARAMETER___GET_CHILDREN_BY_ETYPE__ECLASS = PARAMETER___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORDINARY_PARAMETER___GET_CHILDREN_BY_TYPE__CLASS = PARAMETER___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORDINARY_PARAMETER___GET_COMMENTS = PARAMETER___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORDINARY_PARAMETER___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = PARAMETER___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORDINARY_PARAMETER___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = PARAMETER___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORDINARY_PARAMETER___GET_ARRAY_DIMENSION = PARAMETER___GET_ARRAY_DIMENSION;

    /**
     * The operation id for the '<em>Create Method Call Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORDINARY_PARAMETER___CREATE_METHOD_CALL_STATEMENT__STRING_ELIST = PARAMETER___CREATE_METHOD_CALL_STATEMENT__STRING_ELIST;

    /**
     * The operation id for the '<em>Create Method Call</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORDINARY_PARAMETER___CREATE_METHOD_CALL__STRING_ELIST = PARAMETER___CREATE_METHOD_CALL__STRING_ELIST;

    /**
     * The operation id for the '<em>Is Hidden</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORDINARY_PARAMETER___IS_HIDDEN__COMMENTABLE = PARAMETER___IS_HIDDEN__COMMENTABLE;

    /**
     * The operation id for the '<em>Is Static</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORDINARY_PARAMETER___IS_STATIC = PARAMETER___IS_STATIC;

    /**
     * The operation id for the '<em>Remove Modifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORDINARY_PARAMETER___REMOVE_MODIFIER__CLASS = PARAMETER___REMOVE_MODIFIER__CLASS;

    /**
     * The operation id for the '<em>Make Public</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORDINARY_PARAMETER___MAKE_PUBLIC = PARAMETER___MAKE_PUBLIC;

    /**
     * The operation id for the '<em>Make Private</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORDINARY_PARAMETER___MAKE_PRIVATE = PARAMETER___MAKE_PRIVATE;

    /**
     * The operation id for the '<em>Make Protected</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORDINARY_PARAMETER___MAKE_PROTECTED = PARAMETER___MAKE_PROTECTED;

    /**
     * The operation id for the '<em>Get Modifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORDINARY_PARAMETER___GET_MODIFIERS = PARAMETER___GET_MODIFIERS;

    /**
     * The operation id for the '<em>Remove All Modifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORDINARY_PARAMETER___REMOVE_ALL_MODIFIERS = PARAMETER___REMOVE_ALL_MODIFIERS;

    /**
     * The operation id for the '<em>Has Modifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORDINARY_PARAMETER___HAS_MODIFIER__CLASS = PARAMETER___HAS_MODIFIER__CLASS;

    /**
     * The operation id for the '<em>Is Public</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORDINARY_PARAMETER___IS_PUBLIC = PARAMETER___IS_PUBLIC;

    /**
     * The operation id for the '<em>Is Private</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORDINARY_PARAMETER___IS_PRIVATE = PARAMETER___IS_PRIVATE;

    /**
     * The operation id for the '<em>Is Protected</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORDINARY_PARAMETER___IS_PROTECTED = PARAMETER___IS_PROTECTED;

    /**
     * The operation id for the '<em>Add Modifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORDINARY_PARAMETER___ADD_MODIFIER__MODIFIER = PARAMETER___ADD_MODIFIER__MODIFIER;

    /**
     * The operation id for the '<em>Get Annotation Instances</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORDINARY_PARAMETER___GET_ANNOTATION_INSTANCES = PARAMETER___GET_ANNOTATION_INSTANCES;

    /**
     * The number of operations of the '<em>Ordinary Parameter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ORDINARY_PARAMETER_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.parameters.impl.VariableLengthParameterImpl <em>Variable Length Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.parameters.impl.VariableLengthParameterImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.parameters.impl.ParametersPackageImpl#getVariableLengthParameter()
     * @generated
     */
    int VARIABLE_LENGTH_PARAMETER = 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_LENGTH_PARAMETER__NAME = PARAMETER__NAME;

    /**
     * The feature id for the '<em><b>Type Reference</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_LENGTH_PARAMETER__TYPE_REFERENCE = PARAMETER__TYPE_REFERENCE;

    /**
     * The feature id for the '<em><b>Array Dimensions Before</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_LENGTH_PARAMETER__ARRAY_DIMENSIONS_BEFORE = PARAMETER__ARRAY_DIMENSIONS_BEFORE;

    /**
     * The feature id for the '<em><b>Array Dimensions After</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_LENGTH_PARAMETER__ARRAY_DIMENSIONS_AFTER = PARAMETER__ARRAY_DIMENSIONS_AFTER;

    /**
     * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_LENGTH_PARAMETER__TYPE_ARGUMENTS = PARAMETER__TYPE_ARGUMENTS;

    /**
     * The feature id for the '<em><b>Annotations And Modifiers</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_LENGTH_PARAMETER__ANNOTATIONS_AND_MODIFIERS = PARAMETER__ANNOTATIONS_AND_MODIFIERS;

    /**
     * The number of structural features of the '<em>Variable Length Parameter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_LENGTH_PARAMETER_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_LENGTH_PARAMETER___GET_CONCRETE_CLASSIFIER__STRING = PARAMETER___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_LENGTH_PARAMETER___GET_CONCRETE_CLASSIFIER_PROXY__STRING = PARAMETER___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_LENGTH_PARAMETER___GET_CONCRETE_CLASSIFIERS__STRING_STRING = PARAMETER___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_LENGTH_PARAMETER___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = PARAMETER___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_LENGTH_PARAMETER___GET_LIB_CLASS__STRING = PARAMETER___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_LENGTH_PARAMETER___GET_LIB_INTERFACE__STRING = PARAMETER___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_LENGTH_PARAMETER___GET_CLASS_CLASS = PARAMETER___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_LENGTH_PARAMETER___GET_OBJECT_CLASS = PARAMETER___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_LENGTH_PARAMETER___GET_STRING_CLASS = PARAMETER___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_LENGTH_PARAMETER___GET_ANNOTATION_INTERFACE = PARAMETER___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_LENGTH_PARAMETER___GET_CONTAINING_ANNOTATION_INSTANCE = PARAMETER___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_LENGTH_PARAMETER___GET_CONTAINING_ANONYMOUS_CLASS = PARAMETER___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_LENGTH_PARAMETER___GET_CONTAINING_CONCRETE_CLASSIFIER = PARAMETER___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_LENGTH_PARAMETER___GET_CONTAINING_COMPILATION_UNIT = PARAMETER___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_LENGTH_PARAMETER___GET_CONTAINING_PACKAGE_NAME = PARAMETER___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_LENGTH_PARAMETER___GET_CONTAINING_CONTAINER_NAME = PARAMETER___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_LENGTH_PARAMETER___GET_PARENT_CONCRETE_CLASSIFIER = PARAMETER___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_LENGTH_PARAMETER___GET_PARENT_BY_ETYPE__ECLASS = PARAMETER___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_LENGTH_PARAMETER___GET_FIRST_CHILD_BY_ETYPE__ECLASS = PARAMETER___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_LENGTH_PARAMETER___GET_PARENT_BY_TYPE__CLASS = PARAMETER___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_LENGTH_PARAMETER___GET_FIRST_CHILD_BY_TYPE__CLASS = PARAMETER___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_LENGTH_PARAMETER___GET_CHILDREN_BY_ETYPE__ECLASS = PARAMETER___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_LENGTH_PARAMETER___GET_CHILDREN_BY_TYPE__CLASS = PARAMETER___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_LENGTH_PARAMETER___GET_COMMENTS = PARAMETER___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_LENGTH_PARAMETER___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = PARAMETER___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_LENGTH_PARAMETER___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = PARAMETER___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_LENGTH_PARAMETER___GET_ARRAY_DIMENSION = PARAMETER___GET_ARRAY_DIMENSION;

    /**
     * The operation id for the '<em>Create Method Call Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_LENGTH_PARAMETER___CREATE_METHOD_CALL_STATEMENT__STRING_ELIST = PARAMETER___CREATE_METHOD_CALL_STATEMENT__STRING_ELIST;

    /**
     * The operation id for the '<em>Create Method Call</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_LENGTH_PARAMETER___CREATE_METHOD_CALL__STRING_ELIST = PARAMETER___CREATE_METHOD_CALL__STRING_ELIST;

    /**
     * The operation id for the '<em>Is Hidden</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_LENGTH_PARAMETER___IS_HIDDEN__COMMENTABLE = PARAMETER___IS_HIDDEN__COMMENTABLE;

    /**
     * The operation id for the '<em>Is Static</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_LENGTH_PARAMETER___IS_STATIC = PARAMETER___IS_STATIC;

    /**
     * The operation id for the '<em>Remove Modifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_LENGTH_PARAMETER___REMOVE_MODIFIER__CLASS = PARAMETER___REMOVE_MODIFIER__CLASS;

    /**
     * The operation id for the '<em>Make Public</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_LENGTH_PARAMETER___MAKE_PUBLIC = PARAMETER___MAKE_PUBLIC;

    /**
     * The operation id for the '<em>Make Private</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_LENGTH_PARAMETER___MAKE_PRIVATE = PARAMETER___MAKE_PRIVATE;

    /**
     * The operation id for the '<em>Make Protected</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_LENGTH_PARAMETER___MAKE_PROTECTED = PARAMETER___MAKE_PROTECTED;

    /**
     * The operation id for the '<em>Get Modifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_LENGTH_PARAMETER___GET_MODIFIERS = PARAMETER___GET_MODIFIERS;

    /**
     * The operation id for the '<em>Remove All Modifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_LENGTH_PARAMETER___REMOVE_ALL_MODIFIERS = PARAMETER___REMOVE_ALL_MODIFIERS;

    /**
     * The operation id for the '<em>Has Modifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_LENGTH_PARAMETER___HAS_MODIFIER__CLASS = PARAMETER___HAS_MODIFIER__CLASS;

    /**
     * The operation id for the '<em>Is Public</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_LENGTH_PARAMETER___IS_PUBLIC = PARAMETER___IS_PUBLIC;

    /**
     * The operation id for the '<em>Is Private</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_LENGTH_PARAMETER___IS_PRIVATE = PARAMETER___IS_PRIVATE;

    /**
     * The operation id for the '<em>Is Protected</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_LENGTH_PARAMETER___IS_PROTECTED = PARAMETER___IS_PROTECTED;

    /**
     * The operation id for the '<em>Add Modifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_LENGTH_PARAMETER___ADD_MODIFIER__MODIFIER = PARAMETER___ADD_MODIFIER__MODIFIER;

    /**
     * The operation id for the '<em>Get Annotation Instances</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_LENGTH_PARAMETER___GET_ANNOTATION_INSTANCES = PARAMETER___GET_ANNOTATION_INSTANCES;

    /**
     * The number of operations of the '<em>Variable Length Parameter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_LENGTH_PARAMETER_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 0;

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.parameters.Parameter <em>Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Parameter</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.parameters.Parameter
     * @generated
     */
    EClass getParameter();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.parameters.Parametrizable <em>Parametrizable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Parametrizable</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.parameters.Parametrizable
     * @generated
     */
    EClass getParametrizable();

    /**
     * Returns the meta object for the containment reference list '{@link org.palladiosimulator.jdt.metamodel.javamodel.parameters.Parametrizable#getParameters <em>Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Parameters</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.parameters.Parametrizable#getParameters()
     * @see #getParametrizable()
     * @generated
     */
    EReference getParametrizable_Parameters();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.parameters.OrdinaryParameter <em>Ordinary Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Ordinary Parameter</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.parameters.OrdinaryParameter
     * @generated
     */
    EClass getOrdinaryParameter();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.parameters.VariableLengthParameter <em>Variable Length Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Variable Length Parameter</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.parameters.VariableLengthParameter
     * @generated
     */
    EClass getVariableLengthParameter();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    ParametersFactory getParametersFactory();

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
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.parameters.impl.ParameterImpl <em>Parameter</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.parameters.impl.ParameterImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.parameters.impl.ParametersPackageImpl#getParameter()
         * @generated
         */
        EClass PARAMETER = eINSTANCE.getParameter();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.parameters.impl.ParametrizableImpl <em>Parametrizable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.parameters.impl.ParametrizableImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.parameters.impl.ParametersPackageImpl#getParametrizable()
         * @generated
         */
        EClass PARAMETRIZABLE = eINSTANCE.getParametrizable();

        /**
         * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PARAMETRIZABLE__PARAMETERS = eINSTANCE.getParametrizable_Parameters();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.parameters.impl.OrdinaryParameterImpl <em>Ordinary Parameter</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.parameters.impl.OrdinaryParameterImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.parameters.impl.ParametersPackageImpl#getOrdinaryParameter()
         * @generated
         */
        EClass ORDINARY_PARAMETER = eINSTANCE.getOrdinaryParameter();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.parameters.impl.VariableLengthParameterImpl <em>Variable Length Parameter</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.parameters.impl.VariableLengthParameterImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.parameters.impl.ParametersPackageImpl#getVariableLengthParameter()
         * @generated
         */
        EClass VARIABLE_LENGTH_PARAMETER = eINSTANCE.getVariableLengthParameter();

    }

} //ParametersPackage
