/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.variables;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.CommonsPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.references.ReferencesPackage;

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
 * @see org.palladiosimulator.jdt.metamodel.javamodel.variables.VariablesFactory
 * @model kind="package"
 * @generated
 */
public interface VariablesPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "variables";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.palladiosimulator.org/javamodel/variables";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "variables";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    VariablesPackage eINSTANCE = org.palladiosimulator.jdt.metamodel.javamodel.variables.impl.VariablesPackageImpl
            .init();

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.variables.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.variables.impl.VariableImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.variables.impl.VariablesPackageImpl#getVariable()
     * @generated
     */
    int VARIABLE = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE__NAME = CommonsPackage.NAMED_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Type Reference</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE__TYPE_REFERENCE = CommonsPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Array Dimensions Before</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE__ARRAY_DIMENSIONS_BEFORE = CommonsPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Array Dimensions After</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE__ARRAY_DIMENSIONS_AFTER = CommonsPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE__TYPE_ARGUMENTS = CommonsPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_FEATURE_COUNT = CommonsPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE___GET_CONCRETE_CLASSIFIER__STRING = CommonsPackage.NAMED_ELEMENT___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE___GET_CONCRETE_CLASSIFIER_PROXY__STRING = CommonsPackage.NAMED_ELEMENT___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE___GET_CONCRETE_CLASSIFIERS__STRING_STRING = CommonsPackage.NAMED_ELEMENT___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = CommonsPackage.NAMED_ELEMENT___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE___GET_LIB_CLASS__STRING = CommonsPackage.NAMED_ELEMENT___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE___GET_LIB_INTERFACE__STRING = CommonsPackage.NAMED_ELEMENT___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE___GET_CLASS_CLASS = CommonsPackage.NAMED_ELEMENT___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE___GET_OBJECT_CLASS = CommonsPackage.NAMED_ELEMENT___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE___GET_STRING_CLASS = CommonsPackage.NAMED_ELEMENT___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE___GET_ANNOTATION_INTERFACE = CommonsPackage.NAMED_ELEMENT___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE___GET_CONTAINING_ANNOTATION_INSTANCE = CommonsPackage.NAMED_ELEMENT___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE___GET_CONTAINING_ANONYMOUS_CLASS = CommonsPackage.NAMED_ELEMENT___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE___GET_CONTAINING_CONCRETE_CLASSIFIER = CommonsPackage.NAMED_ELEMENT___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE___GET_CONTAINING_COMPILATION_UNIT = CommonsPackage.NAMED_ELEMENT___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE___GET_CONTAINING_PACKAGE_NAME = CommonsPackage.NAMED_ELEMENT___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE___GET_CONTAINING_CONTAINER_NAME = CommonsPackage.NAMED_ELEMENT___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE___GET_PARENT_CONCRETE_CLASSIFIER = CommonsPackage.NAMED_ELEMENT___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE___GET_PARENT_BY_ETYPE__ECLASS = CommonsPackage.NAMED_ELEMENT___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE___GET_FIRST_CHILD_BY_ETYPE__ECLASS = CommonsPackage.NAMED_ELEMENT___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE___GET_PARENT_BY_TYPE__CLASS = CommonsPackage.NAMED_ELEMENT___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE___GET_FIRST_CHILD_BY_TYPE__CLASS = CommonsPackage.NAMED_ELEMENT___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE___GET_CHILDREN_BY_ETYPE__ECLASS = CommonsPackage.NAMED_ELEMENT___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE___GET_CHILDREN_BY_TYPE__CLASS = CommonsPackage.NAMED_ELEMENT___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE___GET_COMMENTS = CommonsPackage.NAMED_ELEMENT___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = CommonsPackage.NAMED_ELEMENT___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = CommonsPackage.NAMED_ELEMENT___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE___GET_ARRAY_DIMENSION = CommonsPackage.NAMED_ELEMENT_OPERATION_COUNT + 1;

    /**
     * The operation id for the '<em>Create Method Call Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE___CREATE_METHOD_CALL_STATEMENT__STRING_ELIST = CommonsPackage.NAMED_ELEMENT_OPERATION_COUNT + 2;

    /**
     * The operation id for the '<em>Create Method Call</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE___CREATE_METHOD_CALL__STRING_ELIST = CommonsPackage.NAMED_ELEMENT_OPERATION_COUNT + 3;

    /**
     * The number of operations of the '<em>Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_OPERATION_COUNT = CommonsPackage.NAMED_ELEMENT_OPERATION_COUNT + 4;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.variables.impl.LocalVariableImpl <em>Local Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.variables.impl.LocalVariableImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.variables.impl.VariablesPackageImpl#getLocalVariable()
     * @generated
     */
    int LOCAL_VARIABLE = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_VARIABLE__NAME = VARIABLE__NAME;

    /**
     * The feature id for the '<em><b>Type Reference</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_VARIABLE__TYPE_REFERENCE = VARIABLE__TYPE_REFERENCE;

    /**
     * The feature id for the '<em><b>Array Dimensions Before</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_VARIABLE__ARRAY_DIMENSIONS_BEFORE = VARIABLE__ARRAY_DIMENSIONS_BEFORE;

    /**
     * The feature id for the '<em><b>Array Dimensions After</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_VARIABLE__ARRAY_DIMENSIONS_AFTER = VARIABLE__ARRAY_DIMENSIONS_AFTER;

    /**
     * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_VARIABLE__TYPE_ARGUMENTS = VARIABLE__TYPE_ARGUMENTS;

    /**
     * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_VARIABLE__INITIAL_VALUE = VARIABLE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Annotations And Modifiers</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_VARIABLE__ANNOTATIONS_AND_MODIFIERS = VARIABLE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Additional Local Variables</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_VARIABLE__ADDITIONAL_LOCAL_VARIABLES = VARIABLE_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Local Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 3;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_VARIABLE___GET_CONCRETE_CLASSIFIER__STRING = VARIABLE___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_VARIABLE___GET_CONCRETE_CLASSIFIER_PROXY__STRING = VARIABLE___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_VARIABLE___GET_CONCRETE_CLASSIFIERS__STRING_STRING = VARIABLE___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_VARIABLE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = VARIABLE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_VARIABLE___GET_LIB_CLASS__STRING = VARIABLE___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_VARIABLE___GET_LIB_INTERFACE__STRING = VARIABLE___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_VARIABLE___GET_CLASS_CLASS = VARIABLE___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_VARIABLE___GET_OBJECT_CLASS = VARIABLE___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_VARIABLE___GET_STRING_CLASS = VARIABLE___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_VARIABLE___GET_ANNOTATION_INTERFACE = VARIABLE___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_VARIABLE___GET_CONTAINING_ANNOTATION_INSTANCE = VARIABLE___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_VARIABLE___GET_CONTAINING_ANONYMOUS_CLASS = VARIABLE___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_VARIABLE___GET_CONTAINING_CONCRETE_CLASSIFIER = VARIABLE___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_VARIABLE___GET_CONTAINING_COMPILATION_UNIT = VARIABLE___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_VARIABLE___GET_CONTAINING_PACKAGE_NAME = VARIABLE___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_VARIABLE___GET_CONTAINING_CONTAINER_NAME = VARIABLE___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_VARIABLE___GET_PARENT_CONCRETE_CLASSIFIER = VARIABLE___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_VARIABLE___GET_PARENT_BY_ETYPE__ECLASS = VARIABLE___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_VARIABLE___GET_FIRST_CHILD_BY_ETYPE__ECLASS = VARIABLE___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_VARIABLE___GET_PARENT_BY_TYPE__CLASS = VARIABLE___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_VARIABLE___GET_FIRST_CHILD_BY_TYPE__CLASS = VARIABLE___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_VARIABLE___GET_CHILDREN_BY_ETYPE__ECLASS = VARIABLE___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_VARIABLE___GET_CHILDREN_BY_TYPE__CLASS = VARIABLE___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_VARIABLE___GET_COMMENTS = VARIABLE___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_VARIABLE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = VARIABLE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_VARIABLE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = VARIABLE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_VARIABLE___GET_ARRAY_DIMENSION = VARIABLE___GET_ARRAY_DIMENSION;

    /**
     * The operation id for the '<em>Create Method Call Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_VARIABLE___CREATE_METHOD_CALL_STATEMENT__STRING_ELIST = VARIABLE___CREATE_METHOD_CALL_STATEMENT__STRING_ELIST;

    /**
     * The operation id for the '<em>Create Method Call</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_VARIABLE___CREATE_METHOD_CALL__STRING_ELIST = VARIABLE___CREATE_METHOD_CALL__STRING_ELIST;

    /**
     * The operation id for the '<em>Is Hidden</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_VARIABLE___IS_HIDDEN__COMMENTABLE = VARIABLE_OPERATION_COUNT + 0;

    /**
     * The operation id for the '<em>Is Static</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_VARIABLE___IS_STATIC = VARIABLE_OPERATION_COUNT + 1;

    /**
     * The operation id for the '<em>Remove Modifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_VARIABLE___REMOVE_MODIFIER__CLASS = VARIABLE_OPERATION_COUNT + 2;

    /**
     * The operation id for the '<em>Make Public</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_VARIABLE___MAKE_PUBLIC = VARIABLE_OPERATION_COUNT + 3;

    /**
     * The operation id for the '<em>Make Private</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_VARIABLE___MAKE_PRIVATE = VARIABLE_OPERATION_COUNT + 4;

    /**
     * The operation id for the '<em>Make Protected</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_VARIABLE___MAKE_PROTECTED = VARIABLE_OPERATION_COUNT + 5;

    /**
     * The operation id for the '<em>Get Modifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_VARIABLE___GET_MODIFIERS = VARIABLE_OPERATION_COUNT + 6;

    /**
     * The operation id for the '<em>Remove All Modifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_VARIABLE___REMOVE_ALL_MODIFIERS = VARIABLE_OPERATION_COUNT + 7;

    /**
     * The operation id for the '<em>Has Modifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_VARIABLE___HAS_MODIFIER__CLASS = VARIABLE_OPERATION_COUNT + 8;

    /**
     * The operation id for the '<em>Is Public</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_VARIABLE___IS_PUBLIC = VARIABLE_OPERATION_COUNT + 9;

    /**
     * The operation id for the '<em>Is Private</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_VARIABLE___IS_PRIVATE = VARIABLE_OPERATION_COUNT + 10;

    /**
     * The operation id for the '<em>Is Protected</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_VARIABLE___IS_PROTECTED = VARIABLE_OPERATION_COUNT + 11;

    /**
     * The operation id for the '<em>Add Modifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_VARIABLE___ADD_MODIFIER__MODIFIER = VARIABLE_OPERATION_COUNT + 12;

    /**
     * The operation id for the '<em>Get Annotation Instances</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_VARIABLE___GET_ANNOTATION_INSTANCES = VARIABLE_OPERATION_COUNT + 13;

    /**
     * The number of operations of the '<em>Local Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_VARIABLE_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 14;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.variables.impl.AdditionalLocalVariableImpl <em>Additional Local Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.variables.impl.AdditionalLocalVariableImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.variables.impl.VariablesPackageImpl#getAdditionalLocalVariable()
     * @generated
     */
    int ADDITIONAL_LOCAL_VARIABLE = 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIONAL_LOCAL_VARIABLE__NAME = ReferencesPackage.REFERENCEABLE_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Array Dimensions Before</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIONAL_LOCAL_VARIABLE__ARRAY_DIMENSIONS_BEFORE = ReferencesPackage.REFERENCEABLE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Array Dimensions After</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIONAL_LOCAL_VARIABLE__ARRAY_DIMENSIONS_AFTER = ReferencesPackage.REFERENCEABLE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIONAL_LOCAL_VARIABLE__INITIAL_VALUE = ReferencesPackage.REFERENCEABLE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Additional Local Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIONAL_LOCAL_VARIABLE_FEATURE_COUNT = ReferencesPackage.REFERENCEABLE_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIONAL_LOCAL_VARIABLE___GET_CONCRETE_CLASSIFIER__STRING = ReferencesPackage.REFERENCEABLE_ELEMENT___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIONAL_LOCAL_VARIABLE___GET_CONCRETE_CLASSIFIER_PROXY__STRING = ReferencesPackage.REFERENCEABLE_ELEMENT___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIONAL_LOCAL_VARIABLE___GET_CONCRETE_CLASSIFIERS__STRING_STRING = ReferencesPackage.REFERENCEABLE_ELEMENT___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIONAL_LOCAL_VARIABLE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = ReferencesPackage.REFERENCEABLE_ELEMENT___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIONAL_LOCAL_VARIABLE___GET_LIB_CLASS__STRING = ReferencesPackage.REFERENCEABLE_ELEMENT___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIONAL_LOCAL_VARIABLE___GET_LIB_INTERFACE__STRING = ReferencesPackage.REFERENCEABLE_ELEMENT___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIONAL_LOCAL_VARIABLE___GET_CLASS_CLASS = ReferencesPackage.REFERENCEABLE_ELEMENT___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIONAL_LOCAL_VARIABLE___GET_OBJECT_CLASS = ReferencesPackage.REFERENCEABLE_ELEMENT___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIONAL_LOCAL_VARIABLE___GET_STRING_CLASS = ReferencesPackage.REFERENCEABLE_ELEMENT___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIONAL_LOCAL_VARIABLE___GET_ANNOTATION_INTERFACE = ReferencesPackage.REFERENCEABLE_ELEMENT___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIONAL_LOCAL_VARIABLE___GET_CONTAINING_ANNOTATION_INSTANCE = ReferencesPackage.REFERENCEABLE_ELEMENT___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIONAL_LOCAL_VARIABLE___GET_CONTAINING_ANONYMOUS_CLASS = ReferencesPackage.REFERENCEABLE_ELEMENT___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIONAL_LOCAL_VARIABLE___GET_CONTAINING_CONCRETE_CLASSIFIER = ReferencesPackage.REFERENCEABLE_ELEMENT___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIONAL_LOCAL_VARIABLE___GET_CONTAINING_COMPILATION_UNIT = ReferencesPackage.REFERENCEABLE_ELEMENT___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIONAL_LOCAL_VARIABLE___GET_CONTAINING_PACKAGE_NAME = ReferencesPackage.REFERENCEABLE_ELEMENT___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIONAL_LOCAL_VARIABLE___GET_CONTAINING_CONTAINER_NAME = ReferencesPackage.REFERENCEABLE_ELEMENT___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIONAL_LOCAL_VARIABLE___GET_PARENT_CONCRETE_CLASSIFIER = ReferencesPackage.REFERENCEABLE_ELEMENT___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIONAL_LOCAL_VARIABLE___GET_PARENT_BY_ETYPE__ECLASS = ReferencesPackage.REFERENCEABLE_ELEMENT___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIONAL_LOCAL_VARIABLE___GET_FIRST_CHILD_BY_ETYPE__ECLASS = ReferencesPackage.REFERENCEABLE_ELEMENT___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIONAL_LOCAL_VARIABLE___GET_PARENT_BY_TYPE__CLASS = ReferencesPackage.REFERENCEABLE_ELEMENT___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIONAL_LOCAL_VARIABLE___GET_FIRST_CHILD_BY_TYPE__CLASS = ReferencesPackage.REFERENCEABLE_ELEMENT___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIONAL_LOCAL_VARIABLE___GET_CHILDREN_BY_ETYPE__ECLASS = ReferencesPackage.REFERENCEABLE_ELEMENT___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIONAL_LOCAL_VARIABLE___GET_CHILDREN_BY_TYPE__CLASS = ReferencesPackage.REFERENCEABLE_ELEMENT___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIONAL_LOCAL_VARIABLE___GET_COMMENTS = ReferencesPackage.REFERENCEABLE_ELEMENT___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIONAL_LOCAL_VARIABLE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = ReferencesPackage.REFERENCEABLE_ELEMENT___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIONAL_LOCAL_VARIABLE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = ReferencesPackage.REFERENCEABLE_ELEMENT___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIONAL_LOCAL_VARIABLE___GET_ARRAY_DIMENSION = ReferencesPackage.REFERENCEABLE_ELEMENT_OPERATION_COUNT + 1;

    /**
     * The number of operations of the '<em>Additional Local Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIONAL_LOCAL_VARIABLE_OPERATION_COUNT = ReferencesPackage.REFERENCEABLE_ELEMENT_OPERATION_COUNT + 2;

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.variables.Variable <em>Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Variable</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.variables.Variable
     * @generated
     */
    EClass getVariable();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.variables.Variable#getArrayDimension() <em>Get Array Dimension</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Array Dimension</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.variables.Variable#getArrayDimension()
     * @generated
     */
    EOperation getVariable__GetArrayDimension();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.variables.Variable#createMethodCallStatement(java.lang.String, org.eclipse.emf.common.util.EList) <em>Create Method Call Statement</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Create Method Call Statement</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.variables.Variable#createMethodCallStatement(java.lang.String, org.eclipse.emf.common.util.EList)
     * @generated
     */
    EOperation getVariable__CreateMethodCallStatement__String_EList();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.variables.Variable#createMethodCall(java.lang.String, org.eclipse.emf.common.util.EList) <em>Create Method Call</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Create Method Call</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.variables.Variable#createMethodCall(java.lang.String, org.eclipse.emf.common.util.EList)
     * @generated
     */
    EOperation getVariable__CreateMethodCall__String_EList();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.variables.LocalVariable <em>Local Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Local Variable</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.variables.LocalVariable
     * @generated
     */
    EClass getLocalVariable();

    /**
     * Returns the meta object for the containment reference list '{@link org.palladiosimulator.jdt.metamodel.javamodel.variables.LocalVariable#getAdditionalLocalVariables <em>Additional Local Variables</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Additional Local Variables</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.variables.LocalVariable#getAdditionalLocalVariables()
     * @see #getLocalVariable()
     * @generated
     */
    EReference getLocalVariable_AdditionalLocalVariables();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.variables.AdditionalLocalVariable <em>Additional Local Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Additional Local Variable</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.variables.AdditionalLocalVariable
     * @generated
     */
    EClass getAdditionalLocalVariable();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.variables.AdditionalLocalVariable#getArrayDimension() <em>Get Array Dimension</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Array Dimension</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.variables.AdditionalLocalVariable#getArrayDimension()
     * @generated
     */
    EOperation getAdditionalLocalVariable__GetArrayDimension();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    VariablesFactory getVariablesFactory();

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
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.variables.impl.VariableImpl <em>Variable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.variables.impl.VariableImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.variables.impl.VariablesPackageImpl#getVariable()
         * @generated
         */
        EClass VARIABLE = eINSTANCE.getVariable();

        /**
         * The meta object literal for the '<em><b>Get Array Dimension</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation VARIABLE___GET_ARRAY_DIMENSION = eINSTANCE.getVariable__GetArrayDimension();

        /**
         * The meta object literal for the '<em><b>Create Method Call Statement</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation VARIABLE___CREATE_METHOD_CALL_STATEMENT__STRING_ELIST = eINSTANCE
                .getVariable__CreateMethodCallStatement__String_EList();

        /**
         * The meta object literal for the '<em><b>Create Method Call</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation VARIABLE___CREATE_METHOD_CALL__STRING_ELIST = eINSTANCE
                .getVariable__CreateMethodCall__String_EList();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.variables.impl.LocalVariableImpl <em>Local Variable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.variables.impl.LocalVariableImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.variables.impl.VariablesPackageImpl#getLocalVariable()
         * @generated
         */
        EClass LOCAL_VARIABLE = eINSTANCE.getLocalVariable();

        /**
         * The meta object literal for the '<em><b>Additional Local Variables</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LOCAL_VARIABLE__ADDITIONAL_LOCAL_VARIABLES = eINSTANCE.getLocalVariable_AdditionalLocalVariables();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.variables.impl.AdditionalLocalVariableImpl <em>Additional Local Variable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.variables.impl.AdditionalLocalVariableImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.variables.impl.VariablesPackageImpl#getAdditionalLocalVariable()
         * @generated
         */
        EClass ADDITIONAL_LOCAL_VARIABLE = eINSTANCE.getAdditionalLocalVariable();

        /**
         * The meta object literal for the '<em><b>Get Array Dimension</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation ADDITIONAL_LOCAL_VARIABLE___GET_ARRAY_DIMENSION = eINSTANCE
                .getAdditionalLocalVariable__GetArrayDimension();

    }

} //VariablesPackage
