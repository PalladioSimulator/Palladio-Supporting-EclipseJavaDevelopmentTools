/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.expressions;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArraysPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.references.ReferencesPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementsPackage;

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
 * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExpressionsFactory
 * @model kind="package"
 * @generated
 */
public interface ExpressionsPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "expressions";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.palladiosimulator.org/javamodel/expressions";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "expressions";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ExpressionsPackage eINSTANCE = org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl
            .init();

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionListImpl <em>Expression List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionListImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getExpressionList()
     * @generated
     */
    int EXPRESSION_LIST = 0;

    /**
     * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION_LIST__EXPRESSIONS = StatementsPackage.FOR_LOOP_INITIALIZER_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Expression List</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION_LIST_FEATURE_COUNT = StatementsPackage.FOR_LOOP_INITIALIZER_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION_LIST___GET_CONCRETE_CLASSIFIER__STRING = StatementsPackage.FOR_LOOP_INITIALIZER___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION_LIST___GET_CONCRETE_CLASSIFIER_PROXY__STRING = StatementsPackage.FOR_LOOP_INITIALIZER___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION_LIST___GET_CONCRETE_CLASSIFIERS__STRING_STRING = StatementsPackage.FOR_LOOP_INITIALIZER___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION_LIST___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = StatementsPackage.FOR_LOOP_INITIALIZER___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION_LIST___GET_LIB_CLASS__STRING = StatementsPackage.FOR_LOOP_INITIALIZER___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION_LIST___GET_LIB_INTERFACE__STRING = StatementsPackage.FOR_LOOP_INITIALIZER___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION_LIST___GET_CLASS_CLASS = StatementsPackage.FOR_LOOP_INITIALIZER___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION_LIST___GET_OBJECT_CLASS = StatementsPackage.FOR_LOOP_INITIALIZER___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION_LIST___GET_STRING_CLASS = StatementsPackage.FOR_LOOP_INITIALIZER___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION_LIST___GET_ANNOTATION_INTERFACE = StatementsPackage.FOR_LOOP_INITIALIZER___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION_LIST___GET_CONTAINING_ANNOTATION_INSTANCE = StatementsPackage.FOR_LOOP_INITIALIZER___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION_LIST___GET_CONTAINING_ANONYMOUS_CLASS = StatementsPackage.FOR_LOOP_INITIALIZER___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION_LIST___GET_CONTAINING_CONCRETE_CLASSIFIER = StatementsPackage.FOR_LOOP_INITIALIZER___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION_LIST___GET_CONTAINING_COMPILATION_UNIT = StatementsPackage.FOR_LOOP_INITIALIZER___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION_LIST___GET_CONTAINING_PACKAGE_NAME = StatementsPackage.FOR_LOOP_INITIALIZER___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION_LIST___GET_CONTAINING_CONTAINER_NAME = StatementsPackage.FOR_LOOP_INITIALIZER___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION_LIST___GET_PARENT_CONCRETE_CLASSIFIER = StatementsPackage.FOR_LOOP_INITIALIZER___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION_LIST___GET_PARENT_BY_ETYPE__ECLASS = StatementsPackage.FOR_LOOP_INITIALIZER___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION_LIST___GET_FIRST_CHILD_BY_ETYPE__ECLASS = StatementsPackage.FOR_LOOP_INITIALIZER___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION_LIST___GET_PARENT_BY_TYPE__CLASS = StatementsPackage.FOR_LOOP_INITIALIZER___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION_LIST___GET_FIRST_CHILD_BY_TYPE__CLASS = StatementsPackage.FOR_LOOP_INITIALIZER___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION_LIST___GET_CHILDREN_BY_ETYPE__ECLASS = StatementsPackage.FOR_LOOP_INITIALIZER___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION_LIST___GET_CHILDREN_BY_TYPE__CLASS = StatementsPackage.FOR_LOOP_INITIALIZER___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION_LIST___GET_COMMENTS = StatementsPackage.FOR_LOOP_INITIALIZER___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION_LIST___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = StatementsPackage.FOR_LOOP_INITIALIZER___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION_LIST___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = StatementsPackage.FOR_LOOP_INITIALIZER___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The number of operations of the '<em>Expression List</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION_LIST_OPERATION_COUNT = StatementsPackage.FOR_LOOP_INITIALIZER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getExpression()
     * @generated
     */
    int EXPRESSION = 1;

    /**
     * The number of structural features of the '<em>Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION_FEATURE_COUNT = ArraysPackage.ARRAY_INITIALIZATION_VALUE_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION___GET_CONCRETE_CLASSIFIER__STRING = ArraysPackage.ARRAY_INITIALIZATION_VALUE___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION___GET_CONCRETE_CLASSIFIER_PROXY__STRING = ArraysPackage.ARRAY_INITIALIZATION_VALUE___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION___GET_CONCRETE_CLASSIFIERS__STRING_STRING = ArraysPackage.ARRAY_INITIALIZATION_VALUE___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = ArraysPackage.ARRAY_INITIALIZATION_VALUE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION___GET_LIB_CLASS__STRING = ArraysPackage.ARRAY_INITIALIZATION_VALUE___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION___GET_LIB_INTERFACE__STRING = ArraysPackage.ARRAY_INITIALIZATION_VALUE___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION___GET_CLASS_CLASS = ArraysPackage.ARRAY_INITIALIZATION_VALUE___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION___GET_OBJECT_CLASS = ArraysPackage.ARRAY_INITIALIZATION_VALUE___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION___GET_STRING_CLASS = ArraysPackage.ARRAY_INITIALIZATION_VALUE___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION___GET_ANNOTATION_INTERFACE = ArraysPackage.ARRAY_INITIALIZATION_VALUE___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION___GET_CONTAINING_ANNOTATION_INSTANCE = ArraysPackage.ARRAY_INITIALIZATION_VALUE___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION___GET_CONTAINING_ANONYMOUS_CLASS = ArraysPackage.ARRAY_INITIALIZATION_VALUE___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION___GET_CONTAINING_CONCRETE_CLASSIFIER = ArraysPackage.ARRAY_INITIALIZATION_VALUE___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION___GET_CONTAINING_COMPILATION_UNIT = ArraysPackage.ARRAY_INITIALIZATION_VALUE___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION___GET_CONTAINING_PACKAGE_NAME = ArraysPackage.ARRAY_INITIALIZATION_VALUE___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION___GET_CONTAINING_CONTAINER_NAME = ArraysPackage.ARRAY_INITIALIZATION_VALUE___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION___GET_PARENT_CONCRETE_CLASSIFIER = ArraysPackage.ARRAY_INITIALIZATION_VALUE___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION___GET_PARENT_BY_ETYPE__ECLASS = ArraysPackage.ARRAY_INITIALIZATION_VALUE___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION___GET_FIRST_CHILD_BY_ETYPE__ECLASS = ArraysPackage.ARRAY_INITIALIZATION_VALUE___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION___GET_PARENT_BY_TYPE__CLASS = ArraysPackage.ARRAY_INITIALIZATION_VALUE___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION___GET_FIRST_CHILD_BY_TYPE__CLASS = ArraysPackage.ARRAY_INITIALIZATION_VALUE___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION___GET_CHILDREN_BY_ETYPE__ECLASS = ArraysPackage.ARRAY_INITIALIZATION_VALUE___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION___GET_CHILDREN_BY_TYPE__CLASS = ArraysPackage.ARRAY_INITIALIZATION_VALUE___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION___GET_COMMENTS = ArraysPackage.ARRAY_INITIALIZATION_VALUE___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = ArraysPackage.ARRAY_INITIALIZATION_VALUE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = ArraysPackage.ARRAY_INITIALIZATION_VALUE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION___GET_TYPE = ArraysPackage.ARRAY_INITIALIZATION_VALUE_OPERATION_COUNT + 0;

    /**
     * The operation id for the '<em>Get Alternative Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION___GET_ALTERNATIVE_TYPE = ArraysPackage.ARRAY_INITIALIZATION_VALUE_OPERATION_COUNT + 1;

    /**
     * The operation id for the '<em>Get One Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION___GET_ONE_TYPE__BOOLEAN = ArraysPackage.ARRAY_INITIALIZATION_VALUE_OPERATION_COUNT + 2;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION___GET_ARRAY_DIMENSION = ArraysPackage.ARRAY_INITIALIZATION_VALUE_OPERATION_COUNT + 3;

    /**
     * The number of operations of the '<em>Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION_OPERATION_COUNT = ArraysPackage.ARRAY_INITIALIZATION_VALUE_OPERATION_COUNT + 4;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.AssignmentExpressionImpl <em>Assignment Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.AssignmentExpressionImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getAssignmentExpression()
     * @generated
     */
    int ASSIGNMENT_EXPRESSION = 2;

    /**
     * The feature id for the '<em><b>Child</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_EXPRESSION__CHILD = EXPRESSION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Assignment Operator</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_EXPRESSION__ASSIGNMENT_OPERATOR = EXPRESSION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_EXPRESSION__VALUE = EXPRESSION_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Assignment Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_EXPRESSION___GET_CONCRETE_CLASSIFIER__STRING = EXPRESSION___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_EXPRESSION___GET_CONCRETE_CLASSIFIER_PROXY__STRING = EXPRESSION___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_EXPRESSION___GET_CONCRETE_CLASSIFIERS__STRING_STRING = EXPRESSION___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_EXPRESSION___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = EXPRESSION___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_EXPRESSION___GET_LIB_CLASS__STRING = EXPRESSION___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_EXPRESSION___GET_LIB_INTERFACE__STRING = EXPRESSION___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_EXPRESSION___GET_CLASS_CLASS = EXPRESSION___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_EXPRESSION___GET_OBJECT_CLASS = EXPRESSION___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_EXPRESSION___GET_STRING_CLASS = EXPRESSION___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_EXPRESSION___GET_ANNOTATION_INTERFACE = EXPRESSION___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_EXPRESSION___GET_CONTAINING_ANNOTATION_INSTANCE = EXPRESSION___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_EXPRESSION___GET_CONTAINING_ANONYMOUS_CLASS = EXPRESSION___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_EXPRESSION___GET_CONTAINING_CONCRETE_CLASSIFIER = EXPRESSION___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_EXPRESSION___GET_CONTAINING_COMPILATION_UNIT = EXPRESSION___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_EXPRESSION___GET_CONTAINING_PACKAGE_NAME = EXPRESSION___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_EXPRESSION___GET_CONTAINING_CONTAINER_NAME = EXPRESSION___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_EXPRESSION___GET_PARENT_CONCRETE_CLASSIFIER = EXPRESSION___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_EXPRESSION___GET_PARENT_BY_ETYPE__ECLASS = EXPRESSION___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_EXPRESSION___GET_FIRST_CHILD_BY_ETYPE__ECLASS = EXPRESSION___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_EXPRESSION___GET_PARENT_BY_TYPE__CLASS = EXPRESSION___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_EXPRESSION___GET_FIRST_CHILD_BY_TYPE__CLASS = EXPRESSION___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_EXPRESSION___GET_CHILDREN_BY_ETYPE__ECLASS = EXPRESSION___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_EXPRESSION___GET_CHILDREN_BY_TYPE__CLASS = EXPRESSION___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_EXPRESSION___GET_COMMENTS = EXPRESSION___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_EXPRESSION___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = EXPRESSION___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_EXPRESSION___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = EXPRESSION___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_EXPRESSION___GET_TYPE = EXPRESSION___GET_TYPE;

    /**
     * The operation id for the '<em>Get Alternative Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_EXPRESSION___GET_ALTERNATIVE_TYPE = EXPRESSION___GET_ALTERNATIVE_TYPE;

    /**
     * The operation id for the '<em>Get One Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_EXPRESSION___GET_ONE_TYPE__BOOLEAN = EXPRESSION___GET_ONE_TYPE__BOOLEAN;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_EXPRESSION___GET_ARRAY_DIMENSION = EXPRESSION___GET_ARRAY_DIMENSION;

    /**
     * The number of operations of the '<em>Assignment Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.AssignmentExpressionChildImpl <em>Assignment Expression Child</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.AssignmentExpressionChildImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getAssignmentExpressionChild()
     * @generated
     */
    int ASSIGNMENT_EXPRESSION_CHILD = 3;

    /**
     * The number of structural features of the '<em>Assignment Expression Child</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_EXPRESSION_CHILD_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER__STRING = EXPRESSION___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXY__STRING = EXPRESSION___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIERS__STRING_STRING = EXPRESSION___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = EXPRESSION___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_EXPRESSION_CHILD___GET_LIB_CLASS__STRING = EXPRESSION___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_EXPRESSION_CHILD___GET_LIB_INTERFACE__STRING = EXPRESSION___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_EXPRESSION_CHILD___GET_CLASS_CLASS = EXPRESSION___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_EXPRESSION_CHILD___GET_OBJECT_CLASS = EXPRESSION___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_EXPRESSION_CHILD___GET_STRING_CLASS = EXPRESSION___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_EXPRESSION_CHILD___GET_ANNOTATION_INTERFACE = EXPRESSION___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_EXPRESSION_CHILD___GET_CONTAINING_ANNOTATION_INSTANCE = EXPRESSION___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_EXPRESSION_CHILD___GET_CONTAINING_ANONYMOUS_CLASS = EXPRESSION___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_EXPRESSION_CHILD___GET_CONTAINING_CONCRETE_CLASSIFIER = EXPRESSION___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_EXPRESSION_CHILD___GET_CONTAINING_COMPILATION_UNIT = EXPRESSION___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_EXPRESSION_CHILD___GET_CONTAINING_PACKAGE_NAME = EXPRESSION___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_EXPRESSION_CHILD___GET_CONTAINING_CONTAINER_NAME = EXPRESSION___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_EXPRESSION_CHILD___GET_PARENT_CONCRETE_CLASSIFIER = EXPRESSION___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_EXPRESSION_CHILD___GET_PARENT_BY_ETYPE__ECLASS = EXPRESSION___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_ETYPE__ECLASS = EXPRESSION___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_EXPRESSION_CHILD___GET_PARENT_BY_TYPE__CLASS = EXPRESSION___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_TYPE__CLASS = EXPRESSION___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_EXPRESSION_CHILD___GET_CHILDREN_BY_ETYPE__ECLASS = EXPRESSION___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_EXPRESSION_CHILD___GET_CHILDREN_BY_TYPE__CLASS = EXPRESSION___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_EXPRESSION_CHILD___GET_COMMENTS = EXPRESSION___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_EXPRESSION_CHILD___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = EXPRESSION___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_EXPRESSION_CHILD___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = EXPRESSION___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_EXPRESSION_CHILD___GET_TYPE = EXPRESSION___GET_TYPE;

    /**
     * The operation id for the '<em>Get Alternative Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_EXPRESSION_CHILD___GET_ALTERNATIVE_TYPE = EXPRESSION___GET_ALTERNATIVE_TYPE;

    /**
     * The operation id for the '<em>Get One Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_EXPRESSION_CHILD___GET_ONE_TYPE__BOOLEAN = EXPRESSION___GET_ONE_TYPE__BOOLEAN;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_EXPRESSION_CHILD___GET_ARRAY_DIMENSION = EXPRESSION___GET_ARRAY_DIMENSION;

    /**
     * The number of operations of the '<em>Assignment Expression Child</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_EXPRESSION_CHILD_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ConditionalExpressionImpl <em>Conditional Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ConditionalExpressionImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getConditionalExpression()
     * @generated
     */
    int CONDITIONAL_EXPRESSION = 4;

    /**
     * The feature id for the '<em><b>Child</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPRESSION__CHILD = ASSIGNMENT_EXPRESSION_CHILD_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Expression If</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPRESSION__EXPRESSION_IF = ASSIGNMENT_EXPRESSION_CHILD_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Expression Else</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPRESSION__EXPRESSION_ELSE = ASSIGNMENT_EXPRESSION_CHILD_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Conditional Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPRESSION_FEATURE_COUNT = ASSIGNMENT_EXPRESSION_CHILD_FEATURE_COUNT + 3;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPRESSION___GET_CONCRETE_CLASSIFIER__STRING = ASSIGNMENT_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPRESSION___GET_CONCRETE_CLASSIFIER_PROXY__STRING = ASSIGNMENT_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPRESSION___GET_CONCRETE_CLASSIFIERS__STRING_STRING = ASSIGNMENT_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPRESSION___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = ASSIGNMENT_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPRESSION___GET_LIB_CLASS__STRING = ASSIGNMENT_EXPRESSION_CHILD___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPRESSION___GET_LIB_INTERFACE__STRING = ASSIGNMENT_EXPRESSION_CHILD___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPRESSION___GET_CLASS_CLASS = ASSIGNMENT_EXPRESSION_CHILD___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPRESSION___GET_OBJECT_CLASS = ASSIGNMENT_EXPRESSION_CHILD___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPRESSION___GET_STRING_CLASS = ASSIGNMENT_EXPRESSION_CHILD___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPRESSION___GET_ANNOTATION_INTERFACE = ASSIGNMENT_EXPRESSION_CHILD___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPRESSION___GET_CONTAINING_ANNOTATION_INSTANCE = ASSIGNMENT_EXPRESSION_CHILD___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPRESSION___GET_CONTAINING_ANONYMOUS_CLASS = ASSIGNMENT_EXPRESSION_CHILD___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPRESSION___GET_CONTAINING_CONCRETE_CLASSIFIER = ASSIGNMENT_EXPRESSION_CHILD___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPRESSION___GET_CONTAINING_COMPILATION_UNIT = ASSIGNMENT_EXPRESSION_CHILD___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPRESSION___GET_CONTAINING_PACKAGE_NAME = ASSIGNMENT_EXPRESSION_CHILD___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPRESSION___GET_CONTAINING_CONTAINER_NAME = ASSIGNMENT_EXPRESSION_CHILD___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPRESSION___GET_PARENT_CONCRETE_CLASSIFIER = ASSIGNMENT_EXPRESSION_CHILD___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPRESSION___GET_PARENT_BY_ETYPE__ECLASS = ASSIGNMENT_EXPRESSION_CHILD___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPRESSION___GET_FIRST_CHILD_BY_ETYPE__ECLASS = ASSIGNMENT_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPRESSION___GET_PARENT_BY_TYPE__CLASS = ASSIGNMENT_EXPRESSION_CHILD___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPRESSION___GET_FIRST_CHILD_BY_TYPE__CLASS = ASSIGNMENT_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPRESSION___GET_CHILDREN_BY_ETYPE__ECLASS = ASSIGNMENT_EXPRESSION_CHILD___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPRESSION___GET_CHILDREN_BY_TYPE__CLASS = ASSIGNMENT_EXPRESSION_CHILD___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPRESSION___GET_COMMENTS = ASSIGNMENT_EXPRESSION_CHILD___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPRESSION___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = ASSIGNMENT_EXPRESSION_CHILD___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPRESSION___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = ASSIGNMENT_EXPRESSION_CHILD___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPRESSION___GET_TYPE = ASSIGNMENT_EXPRESSION_CHILD___GET_TYPE;

    /**
     * The operation id for the '<em>Get Alternative Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPRESSION___GET_ALTERNATIVE_TYPE = ASSIGNMENT_EXPRESSION_CHILD___GET_ALTERNATIVE_TYPE;

    /**
     * The operation id for the '<em>Get One Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPRESSION___GET_ONE_TYPE__BOOLEAN = ASSIGNMENT_EXPRESSION_CHILD___GET_ONE_TYPE__BOOLEAN;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPRESSION___GET_ARRAY_DIMENSION = ASSIGNMENT_EXPRESSION_CHILD___GET_ARRAY_DIMENSION;

    /**
     * The number of operations of the '<em>Conditional Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPRESSION_OPERATION_COUNT = ASSIGNMENT_EXPRESSION_CHILD_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ConditionalExpressionChildImpl <em>Conditional Expression Child</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ConditionalExpressionChildImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getConditionalExpressionChild()
     * @generated
     */
    int CONDITIONAL_EXPRESSION_CHILD = 5;

    /**
     * The number of structural features of the '<em>Conditional Expression Child</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPRESSION_CHILD_FEATURE_COUNT = ASSIGNMENT_EXPRESSION_CHILD_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER__STRING = ASSIGNMENT_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXY__STRING = ASSIGNMENT_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIERS__STRING_STRING = ASSIGNMENT_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = ASSIGNMENT_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPRESSION_CHILD___GET_LIB_CLASS__STRING = ASSIGNMENT_EXPRESSION_CHILD___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPRESSION_CHILD___GET_LIB_INTERFACE__STRING = ASSIGNMENT_EXPRESSION_CHILD___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPRESSION_CHILD___GET_CLASS_CLASS = ASSIGNMENT_EXPRESSION_CHILD___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPRESSION_CHILD___GET_OBJECT_CLASS = ASSIGNMENT_EXPRESSION_CHILD___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPRESSION_CHILD___GET_STRING_CLASS = ASSIGNMENT_EXPRESSION_CHILD___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPRESSION_CHILD___GET_ANNOTATION_INTERFACE = ASSIGNMENT_EXPRESSION_CHILD___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPRESSION_CHILD___GET_CONTAINING_ANNOTATION_INSTANCE = ASSIGNMENT_EXPRESSION_CHILD___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPRESSION_CHILD___GET_CONTAINING_ANONYMOUS_CLASS = ASSIGNMENT_EXPRESSION_CHILD___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPRESSION_CHILD___GET_CONTAINING_CONCRETE_CLASSIFIER = ASSIGNMENT_EXPRESSION_CHILD___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPRESSION_CHILD___GET_CONTAINING_COMPILATION_UNIT = ASSIGNMENT_EXPRESSION_CHILD___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPRESSION_CHILD___GET_CONTAINING_PACKAGE_NAME = ASSIGNMENT_EXPRESSION_CHILD___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPRESSION_CHILD___GET_CONTAINING_CONTAINER_NAME = ASSIGNMENT_EXPRESSION_CHILD___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPRESSION_CHILD___GET_PARENT_CONCRETE_CLASSIFIER = ASSIGNMENT_EXPRESSION_CHILD___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPRESSION_CHILD___GET_PARENT_BY_ETYPE__ECLASS = ASSIGNMENT_EXPRESSION_CHILD___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_ETYPE__ECLASS = ASSIGNMENT_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPRESSION_CHILD___GET_PARENT_BY_TYPE__CLASS = ASSIGNMENT_EXPRESSION_CHILD___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_TYPE__CLASS = ASSIGNMENT_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPRESSION_CHILD___GET_CHILDREN_BY_ETYPE__ECLASS = ASSIGNMENT_EXPRESSION_CHILD___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPRESSION_CHILD___GET_CHILDREN_BY_TYPE__CLASS = ASSIGNMENT_EXPRESSION_CHILD___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPRESSION_CHILD___GET_COMMENTS = ASSIGNMENT_EXPRESSION_CHILD___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPRESSION_CHILD___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = ASSIGNMENT_EXPRESSION_CHILD___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPRESSION_CHILD___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = ASSIGNMENT_EXPRESSION_CHILD___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPRESSION_CHILD___GET_TYPE = ASSIGNMENT_EXPRESSION_CHILD___GET_TYPE;

    /**
     * The operation id for the '<em>Get Alternative Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPRESSION_CHILD___GET_ALTERNATIVE_TYPE = ASSIGNMENT_EXPRESSION_CHILD___GET_ALTERNATIVE_TYPE;

    /**
     * The operation id for the '<em>Get One Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPRESSION_CHILD___GET_ONE_TYPE__BOOLEAN = ASSIGNMENT_EXPRESSION_CHILD___GET_ONE_TYPE__BOOLEAN;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPRESSION_CHILD___GET_ARRAY_DIMENSION = ASSIGNMENT_EXPRESSION_CHILD___GET_ARRAY_DIMENSION;

    /**
     * The number of operations of the '<em>Conditional Expression Child</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EXPRESSION_CHILD_OPERATION_COUNT = ASSIGNMENT_EXPRESSION_CHILD_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ConditionalOrExpressionImpl <em>Conditional Or Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ConditionalOrExpressionImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getConditionalOrExpression()
     * @generated
     */
    int CONDITIONAL_OR_EXPRESSION = 6;

    /**
     * The feature id for the '<em><b>Children</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_OR_EXPRESSION__CHILDREN = CONDITIONAL_EXPRESSION_CHILD_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Conditional Or Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_OR_EXPRESSION_FEATURE_COUNT = CONDITIONAL_EXPRESSION_CHILD_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_OR_EXPRESSION___GET_CONCRETE_CLASSIFIER__STRING = CONDITIONAL_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_OR_EXPRESSION___GET_CONCRETE_CLASSIFIER_PROXY__STRING = CONDITIONAL_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_OR_EXPRESSION___GET_CONCRETE_CLASSIFIERS__STRING_STRING = CONDITIONAL_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_OR_EXPRESSION___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = CONDITIONAL_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_OR_EXPRESSION___GET_LIB_CLASS__STRING = CONDITIONAL_EXPRESSION_CHILD___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_OR_EXPRESSION___GET_LIB_INTERFACE__STRING = CONDITIONAL_EXPRESSION_CHILD___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_OR_EXPRESSION___GET_CLASS_CLASS = CONDITIONAL_EXPRESSION_CHILD___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_OR_EXPRESSION___GET_OBJECT_CLASS = CONDITIONAL_EXPRESSION_CHILD___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_OR_EXPRESSION___GET_STRING_CLASS = CONDITIONAL_EXPRESSION_CHILD___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_OR_EXPRESSION___GET_ANNOTATION_INTERFACE = CONDITIONAL_EXPRESSION_CHILD___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_OR_EXPRESSION___GET_CONTAINING_ANNOTATION_INSTANCE = CONDITIONAL_EXPRESSION_CHILD___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_OR_EXPRESSION___GET_CONTAINING_ANONYMOUS_CLASS = CONDITIONAL_EXPRESSION_CHILD___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_OR_EXPRESSION___GET_CONTAINING_CONCRETE_CLASSIFIER = CONDITIONAL_EXPRESSION_CHILD___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_OR_EXPRESSION___GET_CONTAINING_COMPILATION_UNIT = CONDITIONAL_EXPRESSION_CHILD___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_OR_EXPRESSION___GET_CONTAINING_PACKAGE_NAME = CONDITIONAL_EXPRESSION_CHILD___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_OR_EXPRESSION___GET_CONTAINING_CONTAINER_NAME = CONDITIONAL_EXPRESSION_CHILD___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_OR_EXPRESSION___GET_PARENT_CONCRETE_CLASSIFIER = CONDITIONAL_EXPRESSION_CHILD___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_OR_EXPRESSION___GET_PARENT_BY_ETYPE__ECLASS = CONDITIONAL_EXPRESSION_CHILD___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_OR_EXPRESSION___GET_FIRST_CHILD_BY_ETYPE__ECLASS = CONDITIONAL_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_OR_EXPRESSION___GET_PARENT_BY_TYPE__CLASS = CONDITIONAL_EXPRESSION_CHILD___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_OR_EXPRESSION___GET_FIRST_CHILD_BY_TYPE__CLASS = CONDITIONAL_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_OR_EXPRESSION___GET_CHILDREN_BY_ETYPE__ECLASS = CONDITIONAL_EXPRESSION_CHILD___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_OR_EXPRESSION___GET_CHILDREN_BY_TYPE__CLASS = CONDITIONAL_EXPRESSION_CHILD___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_OR_EXPRESSION___GET_COMMENTS = CONDITIONAL_EXPRESSION_CHILD___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_OR_EXPRESSION___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = CONDITIONAL_EXPRESSION_CHILD___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_OR_EXPRESSION___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = CONDITIONAL_EXPRESSION_CHILD___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_OR_EXPRESSION___GET_TYPE = CONDITIONAL_EXPRESSION_CHILD___GET_TYPE;

    /**
     * The operation id for the '<em>Get Alternative Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_OR_EXPRESSION___GET_ALTERNATIVE_TYPE = CONDITIONAL_EXPRESSION_CHILD___GET_ALTERNATIVE_TYPE;

    /**
     * The operation id for the '<em>Get One Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_OR_EXPRESSION___GET_ONE_TYPE__BOOLEAN = CONDITIONAL_EXPRESSION_CHILD___GET_ONE_TYPE__BOOLEAN;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_OR_EXPRESSION___GET_ARRAY_DIMENSION = CONDITIONAL_EXPRESSION_CHILD___GET_ARRAY_DIMENSION;

    /**
     * The number of operations of the '<em>Conditional Or Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_OR_EXPRESSION_OPERATION_COUNT = CONDITIONAL_EXPRESSION_CHILD_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ConditionalOrExpressionChildImpl <em>Conditional Or Expression Child</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ConditionalOrExpressionChildImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getConditionalOrExpressionChild()
     * @generated
     */
    int CONDITIONAL_OR_EXPRESSION_CHILD = 7;

    /**
     * The number of structural features of the '<em>Conditional Or Expression Child</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_OR_EXPRESSION_CHILD_FEATURE_COUNT = CONDITIONAL_EXPRESSION_CHILD_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_OR_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER__STRING = CONDITIONAL_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_OR_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXY__STRING = CONDITIONAL_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_OR_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIERS__STRING_STRING = CONDITIONAL_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_OR_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = CONDITIONAL_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_OR_EXPRESSION_CHILD___GET_LIB_CLASS__STRING = CONDITIONAL_EXPRESSION_CHILD___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_OR_EXPRESSION_CHILD___GET_LIB_INTERFACE__STRING = CONDITIONAL_EXPRESSION_CHILD___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_OR_EXPRESSION_CHILD___GET_CLASS_CLASS = CONDITIONAL_EXPRESSION_CHILD___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_OR_EXPRESSION_CHILD___GET_OBJECT_CLASS = CONDITIONAL_EXPRESSION_CHILD___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_OR_EXPRESSION_CHILD___GET_STRING_CLASS = CONDITIONAL_EXPRESSION_CHILD___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_OR_EXPRESSION_CHILD___GET_ANNOTATION_INTERFACE = CONDITIONAL_EXPRESSION_CHILD___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_OR_EXPRESSION_CHILD___GET_CONTAINING_ANNOTATION_INSTANCE = CONDITIONAL_EXPRESSION_CHILD___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_OR_EXPRESSION_CHILD___GET_CONTAINING_ANONYMOUS_CLASS = CONDITIONAL_EXPRESSION_CHILD___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_OR_EXPRESSION_CHILD___GET_CONTAINING_CONCRETE_CLASSIFIER = CONDITIONAL_EXPRESSION_CHILD___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_OR_EXPRESSION_CHILD___GET_CONTAINING_COMPILATION_UNIT = CONDITIONAL_EXPRESSION_CHILD___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_OR_EXPRESSION_CHILD___GET_CONTAINING_PACKAGE_NAME = CONDITIONAL_EXPRESSION_CHILD___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_OR_EXPRESSION_CHILD___GET_CONTAINING_CONTAINER_NAME = CONDITIONAL_EXPRESSION_CHILD___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_OR_EXPRESSION_CHILD___GET_PARENT_CONCRETE_CLASSIFIER = CONDITIONAL_EXPRESSION_CHILD___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_OR_EXPRESSION_CHILD___GET_PARENT_BY_ETYPE__ECLASS = CONDITIONAL_EXPRESSION_CHILD___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_OR_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_ETYPE__ECLASS = CONDITIONAL_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_OR_EXPRESSION_CHILD___GET_PARENT_BY_TYPE__CLASS = CONDITIONAL_EXPRESSION_CHILD___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_OR_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_TYPE__CLASS = CONDITIONAL_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_OR_EXPRESSION_CHILD___GET_CHILDREN_BY_ETYPE__ECLASS = CONDITIONAL_EXPRESSION_CHILD___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_OR_EXPRESSION_CHILD___GET_CHILDREN_BY_TYPE__CLASS = CONDITIONAL_EXPRESSION_CHILD___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_OR_EXPRESSION_CHILD___GET_COMMENTS = CONDITIONAL_EXPRESSION_CHILD___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_OR_EXPRESSION_CHILD___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = CONDITIONAL_EXPRESSION_CHILD___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_OR_EXPRESSION_CHILD___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = CONDITIONAL_EXPRESSION_CHILD___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_OR_EXPRESSION_CHILD___GET_TYPE = CONDITIONAL_EXPRESSION_CHILD___GET_TYPE;

    /**
     * The operation id for the '<em>Get Alternative Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_OR_EXPRESSION_CHILD___GET_ALTERNATIVE_TYPE = CONDITIONAL_EXPRESSION_CHILD___GET_ALTERNATIVE_TYPE;

    /**
     * The operation id for the '<em>Get One Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_OR_EXPRESSION_CHILD___GET_ONE_TYPE__BOOLEAN = CONDITIONAL_EXPRESSION_CHILD___GET_ONE_TYPE__BOOLEAN;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_OR_EXPRESSION_CHILD___GET_ARRAY_DIMENSION = CONDITIONAL_EXPRESSION_CHILD___GET_ARRAY_DIMENSION;

    /**
     * The number of operations of the '<em>Conditional Or Expression Child</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_OR_EXPRESSION_CHILD_OPERATION_COUNT = CONDITIONAL_EXPRESSION_CHILD_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ConditionalAndExpressionImpl <em>Conditional And Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ConditionalAndExpressionImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getConditionalAndExpression()
     * @generated
     */
    int CONDITIONAL_AND_EXPRESSION = 8;

    /**
     * The feature id for the '<em><b>Children</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_AND_EXPRESSION__CHILDREN = CONDITIONAL_OR_EXPRESSION_CHILD_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Conditional And Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_AND_EXPRESSION_FEATURE_COUNT = CONDITIONAL_OR_EXPRESSION_CHILD_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_AND_EXPRESSION___GET_CONCRETE_CLASSIFIER__STRING = CONDITIONAL_OR_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_AND_EXPRESSION___GET_CONCRETE_CLASSIFIER_PROXY__STRING = CONDITIONAL_OR_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_AND_EXPRESSION___GET_CONCRETE_CLASSIFIERS__STRING_STRING = CONDITIONAL_OR_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_AND_EXPRESSION___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = CONDITIONAL_OR_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_AND_EXPRESSION___GET_LIB_CLASS__STRING = CONDITIONAL_OR_EXPRESSION_CHILD___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_AND_EXPRESSION___GET_LIB_INTERFACE__STRING = CONDITIONAL_OR_EXPRESSION_CHILD___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_AND_EXPRESSION___GET_CLASS_CLASS = CONDITIONAL_OR_EXPRESSION_CHILD___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_AND_EXPRESSION___GET_OBJECT_CLASS = CONDITIONAL_OR_EXPRESSION_CHILD___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_AND_EXPRESSION___GET_STRING_CLASS = CONDITIONAL_OR_EXPRESSION_CHILD___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_AND_EXPRESSION___GET_ANNOTATION_INTERFACE = CONDITIONAL_OR_EXPRESSION_CHILD___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_AND_EXPRESSION___GET_CONTAINING_ANNOTATION_INSTANCE = CONDITIONAL_OR_EXPRESSION_CHILD___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_AND_EXPRESSION___GET_CONTAINING_ANONYMOUS_CLASS = CONDITIONAL_OR_EXPRESSION_CHILD___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_AND_EXPRESSION___GET_CONTAINING_CONCRETE_CLASSIFIER = CONDITIONAL_OR_EXPRESSION_CHILD___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_AND_EXPRESSION___GET_CONTAINING_COMPILATION_UNIT = CONDITIONAL_OR_EXPRESSION_CHILD___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_AND_EXPRESSION___GET_CONTAINING_PACKAGE_NAME = CONDITIONAL_OR_EXPRESSION_CHILD___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_AND_EXPRESSION___GET_CONTAINING_CONTAINER_NAME = CONDITIONAL_OR_EXPRESSION_CHILD___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_AND_EXPRESSION___GET_PARENT_CONCRETE_CLASSIFIER = CONDITIONAL_OR_EXPRESSION_CHILD___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_AND_EXPRESSION___GET_PARENT_BY_ETYPE__ECLASS = CONDITIONAL_OR_EXPRESSION_CHILD___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_AND_EXPRESSION___GET_FIRST_CHILD_BY_ETYPE__ECLASS = CONDITIONAL_OR_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_AND_EXPRESSION___GET_PARENT_BY_TYPE__CLASS = CONDITIONAL_OR_EXPRESSION_CHILD___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_AND_EXPRESSION___GET_FIRST_CHILD_BY_TYPE__CLASS = CONDITIONAL_OR_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_AND_EXPRESSION___GET_CHILDREN_BY_ETYPE__ECLASS = CONDITIONAL_OR_EXPRESSION_CHILD___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_AND_EXPRESSION___GET_CHILDREN_BY_TYPE__CLASS = CONDITIONAL_OR_EXPRESSION_CHILD___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_AND_EXPRESSION___GET_COMMENTS = CONDITIONAL_OR_EXPRESSION_CHILD___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_AND_EXPRESSION___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = CONDITIONAL_OR_EXPRESSION_CHILD___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_AND_EXPRESSION___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = CONDITIONAL_OR_EXPRESSION_CHILD___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_AND_EXPRESSION___GET_TYPE = CONDITIONAL_OR_EXPRESSION_CHILD___GET_TYPE;

    /**
     * The operation id for the '<em>Get Alternative Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_AND_EXPRESSION___GET_ALTERNATIVE_TYPE = CONDITIONAL_OR_EXPRESSION_CHILD___GET_ALTERNATIVE_TYPE;

    /**
     * The operation id for the '<em>Get One Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_AND_EXPRESSION___GET_ONE_TYPE__BOOLEAN = CONDITIONAL_OR_EXPRESSION_CHILD___GET_ONE_TYPE__BOOLEAN;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_AND_EXPRESSION___GET_ARRAY_DIMENSION = CONDITIONAL_OR_EXPRESSION_CHILD___GET_ARRAY_DIMENSION;

    /**
     * The number of operations of the '<em>Conditional And Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_AND_EXPRESSION_OPERATION_COUNT = CONDITIONAL_OR_EXPRESSION_CHILD_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ConditionalAndExpressionChildImpl <em>Conditional And Expression Child</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ConditionalAndExpressionChildImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getConditionalAndExpressionChild()
     * @generated
     */
    int CONDITIONAL_AND_EXPRESSION_CHILD = 9;

    /**
     * The number of structural features of the '<em>Conditional And Expression Child</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_AND_EXPRESSION_CHILD_FEATURE_COUNT = CONDITIONAL_OR_EXPRESSION_CHILD_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_AND_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER__STRING = CONDITIONAL_OR_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_AND_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXY__STRING = CONDITIONAL_OR_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_AND_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIERS__STRING_STRING = CONDITIONAL_OR_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_AND_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = CONDITIONAL_OR_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_AND_EXPRESSION_CHILD___GET_LIB_CLASS__STRING = CONDITIONAL_OR_EXPRESSION_CHILD___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_AND_EXPRESSION_CHILD___GET_LIB_INTERFACE__STRING = CONDITIONAL_OR_EXPRESSION_CHILD___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_AND_EXPRESSION_CHILD___GET_CLASS_CLASS = CONDITIONAL_OR_EXPRESSION_CHILD___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_AND_EXPRESSION_CHILD___GET_OBJECT_CLASS = CONDITIONAL_OR_EXPRESSION_CHILD___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_AND_EXPRESSION_CHILD___GET_STRING_CLASS = CONDITIONAL_OR_EXPRESSION_CHILD___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_AND_EXPRESSION_CHILD___GET_ANNOTATION_INTERFACE = CONDITIONAL_OR_EXPRESSION_CHILD___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_AND_EXPRESSION_CHILD___GET_CONTAINING_ANNOTATION_INSTANCE = CONDITIONAL_OR_EXPRESSION_CHILD___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_AND_EXPRESSION_CHILD___GET_CONTAINING_ANONYMOUS_CLASS = CONDITIONAL_OR_EXPRESSION_CHILD___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_AND_EXPRESSION_CHILD___GET_CONTAINING_CONCRETE_CLASSIFIER = CONDITIONAL_OR_EXPRESSION_CHILD___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_AND_EXPRESSION_CHILD___GET_CONTAINING_COMPILATION_UNIT = CONDITIONAL_OR_EXPRESSION_CHILD___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_AND_EXPRESSION_CHILD___GET_CONTAINING_PACKAGE_NAME = CONDITIONAL_OR_EXPRESSION_CHILD___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_AND_EXPRESSION_CHILD___GET_CONTAINING_CONTAINER_NAME = CONDITIONAL_OR_EXPRESSION_CHILD___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_AND_EXPRESSION_CHILD___GET_PARENT_CONCRETE_CLASSIFIER = CONDITIONAL_OR_EXPRESSION_CHILD___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_AND_EXPRESSION_CHILD___GET_PARENT_BY_ETYPE__ECLASS = CONDITIONAL_OR_EXPRESSION_CHILD___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_AND_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_ETYPE__ECLASS = CONDITIONAL_OR_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_AND_EXPRESSION_CHILD___GET_PARENT_BY_TYPE__CLASS = CONDITIONAL_OR_EXPRESSION_CHILD___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_AND_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_TYPE__CLASS = CONDITIONAL_OR_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_AND_EXPRESSION_CHILD___GET_CHILDREN_BY_ETYPE__ECLASS = CONDITIONAL_OR_EXPRESSION_CHILD___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_AND_EXPRESSION_CHILD___GET_CHILDREN_BY_TYPE__CLASS = CONDITIONAL_OR_EXPRESSION_CHILD___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_AND_EXPRESSION_CHILD___GET_COMMENTS = CONDITIONAL_OR_EXPRESSION_CHILD___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_AND_EXPRESSION_CHILD___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = CONDITIONAL_OR_EXPRESSION_CHILD___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_AND_EXPRESSION_CHILD___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = CONDITIONAL_OR_EXPRESSION_CHILD___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_AND_EXPRESSION_CHILD___GET_TYPE = CONDITIONAL_OR_EXPRESSION_CHILD___GET_TYPE;

    /**
     * The operation id for the '<em>Get Alternative Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_AND_EXPRESSION_CHILD___GET_ALTERNATIVE_TYPE = CONDITIONAL_OR_EXPRESSION_CHILD___GET_ALTERNATIVE_TYPE;

    /**
     * The operation id for the '<em>Get One Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_AND_EXPRESSION_CHILD___GET_ONE_TYPE__BOOLEAN = CONDITIONAL_OR_EXPRESSION_CHILD___GET_ONE_TYPE__BOOLEAN;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_AND_EXPRESSION_CHILD___GET_ARRAY_DIMENSION = CONDITIONAL_OR_EXPRESSION_CHILD___GET_ARRAY_DIMENSION;

    /**
     * The number of operations of the '<em>Conditional And Expression Child</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_AND_EXPRESSION_CHILD_OPERATION_COUNT = CONDITIONAL_OR_EXPRESSION_CHILD_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.InclusiveOrExpressionImpl <em>Inclusive Or Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.InclusiveOrExpressionImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getInclusiveOrExpression()
     * @generated
     */
    int INCLUSIVE_OR_EXPRESSION = 10;

    /**
     * The feature id for the '<em><b>Children</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_OR_EXPRESSION__CHILDREN = CONDITIONAL_AND_EXPRESSION_CHILD_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Inclusive Or Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_OR_EXPRESSION_FEATURE_COUNT = CONDITIONAL_AND_EXPRESSION_CHILD_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_OR_EXPRESSION___GET_CONCRETE_CLASSIFIER__STRING = CONDITIONAL_AND_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_OR_EXPRESSION___GET_CONCRETE_CLASSIFIER_PROXY__STRING = CONDITIONAL_AND_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_OR_EXPRESSION___GET_CONCRETE_CLASSIFIERS__STRING_STRING = CONDITIONAL_AND_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_OR_EXPRESSION___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = CONDITIONAL_AND_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_OR_EXPRESSION___GET_LIB_CLASS__STRING = CONDITIONAL_AND_EXPRESSION_CHILD___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_OR_EXPRESSION___GET_LIB_INTERFACE__STRING = CONDITIONAL_AND_EXPRESSION_CHILD___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_OR_EXPRESSION___GET_CLASS_CLASS = CONDITIONAL_AND_EXPRESSION_CHILD___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_OR_EXPRESSION___GET_OBJECT_CLASS = CONDITIONAL_AND_EXPRESSION_CHILD___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_OR_EXPRESSION___GET_STRING_CLASS = CONDITIONAL_AND_EXPRESSION_CHILD___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_OR_EXPRESSION___GET_ANNOTATION_INTERFACE = CONDITIONAL_AND_EXPRESSION_CHILD___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_OR_EXPRESSION___GET_CONTAINING_ANNOTATION_INSTANCE = CONDITIONAL_AND_EXPRESSION_CHILD___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_OR_EXPRESSION___GET_CONTAINING_ANONYMOUS_CLASS = CONDITIONAL_AND_EXPRESSION_CHILD___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_OR_EXPRESSION___GET_CONTAINING_CONCRETE_CLASSIFIER = CONDITIONAL_AND_EXPRESSION_CHILD___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_OR_EXPRESSION___GET_CONTAINING_COMPILATION_UNIT = CONDITIONAL_AND_EXPRESSION_CHILD___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_OR_EXPRESSION___GET_CONTAINING_PACKAGE_NAME = CONDITIONAL_AND_EXPRESSION_CHILD___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_OR_EXPRESSION___GET_CONTAINING_CONTAINER_NAME = CONDITIONAL_AND_EXPRESSION_CHILD___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_OR_EXPRESSION___GET_PARENT_CONCRETE_CLASSIFIER = CONDITIONAL_AND_EXPRESSION_CHILD___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_OR_EXPRESSION___GET_PARENT_BY_ETYPE__ECLASS = CONDITIONAL_AND_EXPRESSION_CHILD___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_OR_EXPRESSION___GET_FIRST_CHILD_BY_ETYPE__ECLASS = CONDITIONAL_AND_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_OR_EXPRESSION___GET_PARENT_BY_TYPE__CLASS = CONDITIONAL_AND_EXPRESSION_CHILD___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_OR_EXPRESSION___GET_FIRST_CHILD_BY_TYPE__CLASS = CONDITIONAL_AND_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_OR_EXPRESSION___GET_CHILDREN_BY_ETYPE__ECLASS = CONDITIONAL_AND_EXPRESSION_CHILD___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_OR_EXPRESSION___GET_CHILDREN_BY_TYPE__CLASS = CONDITIONAL_AND_EXPRESSION_CHILD___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_OR_EXPRESSION___GET_COMMENTS = CONDITIONAL_AND_EXPRESSION_CHILD___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_OR_EXPRESSION___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = CONDITIONAL_AND_EXPRESSION_CHILD___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_OR_EXPRESSION___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = CONDITIONAL_AND_EXPRESSION_CHILD___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_OR_EXPRESSION___GET_TYPE = CONDITIONAL_AND_EXPRESSION_CHILD___GET_TYPE;

    /**
     * The operation id for the '<em>Get Alternative Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_OR_EXPRESSION___GET_ALTERNATIVE_TYPE = CONDITIONAL_AND_EXPRESSION_CHILD___GET_ALTERNATIVE_TYPE;

    /**
     * The operation id for the '<em>Get One Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_OR_EXPRESSION___GET_ONE_TYPE__BOOLEAN = CONDITIONAL_AND_EXPRESSION_CHILD___GET_ONE_TYPE__BOOLEAN;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_OR_EXPRESSION___GET_ARRAY_DIMENSION = CONDITIONAL_AND_EXPRESSION_CHILD___GET_ARRAY_DIMENSION;

    /**
     * The number of operations of the '<em>Inclusive Or Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_OR_EXPRESSION_OPERATION_COUNT = CONDITIONAL_AND_EXPRESSION_CHILD_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.InclusiveOrExpressionChildImpl <em>Inclusive Or Expression Child</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.InclusiveOrExpressionChildImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getInclusiveOrExpressionChild()
     * @generated
     */
    int INCLUSIVE_OR_EXPRESSION_CHILD = 11;

    /**
     * The number of structural features of the '<em>Inclusive Or Expression Child</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_OR_EXPRESSION_CHILD_FEATURE_COUNT = CONDITIONAL_AND_EXPRESSION_CHILD_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_OR_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER__STRING = CONDITIONAL_AND_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_OR_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXY__STRING = CONDITIONAL_AND_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_OR_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIERS__STRING_STRING = CONDITIONAL_AND_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_OR_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = CONDITIONAL_AND_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_OR_EXPRESSION_CHILD___GET_LIB_CLASS__STRING = CONDITIONAL_AND_EXPRESSION_CHILD___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_OR_EXPRESSION_CHILD___GET_LIB_INTERFACE__STRING = CONDITIONAL_AND_EXPRESSION_CHILD___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_OR_EXPRESSION_CHILD___GET_CLASS_CLASS = CONDITIONAL_AND_EXPRESSION_CHILD___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_OR_EXPRESSION_CHILD___GET_OBJECT_CLASS = CONDITIONAL_AND_EXPRESSION_CHILD___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_OR_EXPRESSION_CHILD___GET_STRING_CLASS = CONDITIONAL_AND_EXPRESSION_CHILD___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_OR_EXPRESSION_CHILD___GET_ANNOTATION_INTERFACE = CONDITIONAL_AND_EXPRESSION_CHILD___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_OR_EXPRESSION_CHILD___GET_CONTAINING_ANNOTATION_INSTANCE = CONDITIONAL_AND_EXPRESSION_CHILD___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_OR_EXPRESSION_CHILD___GET_CONTAINING_ANONYMOUS_CLASS = CONDITIONAL_AND_EXPRESSION_CHILD___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_OR_EXPRESSION_CHILD___GET_CONTAINING_CONCRETE_CLASSIFIER = CONDITIONAL_AND_EXPRESSION_CHILD___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_OR_EXPRESSION_CHILD___GET_CONTAINING_COMPILATION_UNIT = CONDITIONAL_AND_EXPRESSION_CHILD___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_OR_EXPRESSION_CHILD___GET_CONTAINING_PACKAGE_NAME = CONDITIONAL_AND_EXPRESSION_CHILD___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_OR_EXPRESSION_CHILD___GET_CONTAINING_CONTAINER_NAME = CONDITIONAL_AND_EXPRESSION_CHILD___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_OR_EXPRESSION_CHILD___GET_PARENT_CONCRETE_CLASSIFIER = CONDITIONAL_AND_EXPRESSION_CHILD___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_OR_EXPRESSION_CHILD___GET_PARENT_BY_ETYPE__ECLASS = CONDITIONAL_AND_EXPRESSION_CHILD___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_OR_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_ETYPE__ECLASS = CONDITIONAL_AND_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_OR_EXPRESSION_CHILD___GET_PARENT_BY_TYPE__CLASS = CONDITIONAL_AND_EXPRESSION_CHILD___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_OR_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_TYPE__CLASS = CONDITIONAL_AND_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_OR_EXPRESSION_CHILD___GET_CHILDREN_BY_ETYPE__ECLASS = CONDITIONAL_AND_EXPRESSION_CHILD___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_OR_EXPRESSION_CHILD___GET_CHILDREN_BY_TYPE__CLASS = CONDITIONAL_AND_EXPRESSION_CHILD___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_OR_EXPRESSION_CHILD___GET_COMMENTS = CONDITIONAL_AND_EXPRESSION_CHILD___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_OR_EXPRESSION_CHILD___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = CONDITIONAL_AND_EXPRESSION_CHILD___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_OR_EXPRESSION_CHILD___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = CONDITIONAL_AND_EXPRESSION_CHILD___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_OR_EXPRESSION_CHILD___GET_TYPE = CONDITIONAL_AND_EXPRESSION_CHILD___GET_TYPE;

    /**
     * The operation id for the '<em>Get Alternative Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_OR_EXPRESSION_CHILD___GET_ALTERNATIVE_TYPE = CONDITIONAL_AND_EXPRESSION_CHILD___GET_ALTERNATIVE_TYPE;

    /**
     * The operation id for the '<em>Get One Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_OR_EXPRESSION_CHILD___GET_ONE_TYPE__BOOLEAN = CONDITIONAL_AND_EXPRESSION_CHILD___GET_ONE_TYPE__BOOLEAN;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_OR_EXPRESSION_CHILD___GET_ARRAY_DIMENSION = CONDITIONAL_AND_EXPRESSION_CHILD___GET_ARRAY_DIMENSION;

    /**
     * The number of operations of the '<em>Inclusive Or Expression Child</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_OR_EXPRESSION_CHILD_OPERATION_COUNT = CONDITIONAL_AND_EXPRESSION_CHILD_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExclusiveOrExpressionImpl <em>Exclusive Or Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExclusiveOrExpressionImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getExclusiveOrExpression()
     * @generated
     */
    int EXCLUSIVE_OR_EXPRESSION = 12;

    /**
     * The feature id for the '<em><b>Children</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_OR_EXPRESSION__CHILDREN = INCLUSIVE_OR_EXPRESSION_CHILD_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Exclusive Or Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_OR_EXPRESSION_FEATURE_COUNT = INCLUSIVE_OR_EXPRESSION_CHILD_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_OR_EXPRESSION___GET_CONCRETE_CLASSIFIER__STRING = INCLUSIVE_OR_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_OR_EXPRESSION___GET_CONCRETE_CLASSIFIER_PROXY__STRING = INCLUSIVE_OR_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_OR_EXPRESSION___GET_CONCRETE_CLASSIFIERS__STRING_STRING = INCLUSIVE_OR_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_OR_EXPRESSION___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = INCLUSIVE_OR_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_OR_EXPRESSION___GET_LIB_CLASS__STRING = INCLUSIVE_OR_EXPRESSION_CHILD___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_OR_EXPRESSION___GET_LIB_INTERFACE__STRING = INCLUSIVE_OR_EXPRESSION_CHILD___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_OR_EXPRESSION___GET_CLASS_CLASS = INCLUSIVE_OR_EXPRESSION_CHILD___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_OR_EXPRESSION___GET_OBJECT_CLASS = INCLUSIVE_OR_EXPRESSION_CHILD___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_OR_EXPRESSION___GET_STRING_CLASS = INCLUSIVE_OR_EXPRESSION_CHILD___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_OR_EXPRESSION___GET_ANNOTATION_INTERFACE = INCLUSIVE_OR_EXPRESSION_CHILD___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_OR_EXPRESSION___GET_CONTAINING_ANNOTATION_INSTANCE = INCLUSIVE_OR_EXPRESSION_CHILD___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_OR_EXPRESSION___GET_CONTAINING_ANONYMOUS_CLASS = INCLUSIVE_OR_EXPRESSION_CHILD___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_OR_EXPRESSION___GET_CONTAINING_CONCRETE_CLASSIFIER = INCLUSIVE_OR_EXPRESSION_CHILD___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_OR_EXPRESSION___GET_CONTAINING_COMPILATION_UNIT = INCLUSIVE_OR_EXPRESSION_CHILD___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_OR_EXPRESSION___GET_CONTAINING_PACKAGE_NAME = INCLUSIVE_OR_EXPRESSION_CHILD___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_OR_EXPRESSION___GET_CONTAINING_CONTAINER_NAME = INCLUSIVE_OR_EXPRESSION_CHILD___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_OR_EXPRESSION___GET_PARENT_CONCRETE_CLASSIFIER = INCLUSIVE_OR_EXPRESSION_CHILD___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_OR_EXPRESSION___GET_PARENT_BY_ETYPE__ECLASS = INCLUSIVE_OR_EXPRESSION_CHILD___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_OR_EXPRESSION___GET_FIRST_CHILD_BY_ETYPE__ECLASS = INCLUSIVE_OR_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_OR_EXPRESSION___GET_PARENT_BY_TYPE__CLASS = INCLUSIVE_OR_EXPRESSION_CHILD___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_OR_EXPRESSION___GET_FIRST_CHILD_BY_TYPE__CLASS = INCLUSIVE_OR_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_OR_EXPRESSION___GET_CHILDREN_BY_ETYPE__ECLASS = INCLUSIVE_OR_EXPRESSION_CHILD___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_OR_EXPRESSION___GET_CHILDREN_BY_TYPE__CLASS = INCLUSIVE_OR_EXPRESSION_CHILD___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_OR_EXPRESSION___GET_COMMENTS = INCLUSIVE_OR_EXPRESSION_CHILD___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_OR_EXPRESSION___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = INCLUSIVE_OR_EXPRESSION_CHILD___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_OR_EXPRESSION___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = INCLUSIVE_OR_EXPRESSION_CHILD___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_OR_EXPRESSION___GET_TYPE = INCLUSIVE_OR_EXPRESSION_CHILD___GET_TYPE;

    /**
     * The operation id for the '<em>Get Alternative Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_OR_EXPRESSION___GET_ALTERNATIVE_TYPE = INCLUSIVE_OR_EXPRESSION_CHILD___GET_ALTERNATIVE_TYPE;

    /**
     * The operation id for the '<em>Get One Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_OR_EXPRESSION___GET_ONE_TYPE__BOOLEAN = INCLUSIVE_OR_EXPRESSION_CHILD___GET_ONE_TYPE__BOOLEAN;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_OR_EXPRESSION___GET_ARRAY_DIMENSION = INCLUSIVE_OR_EXPRESSION_CHILD___GET_ARRAY_DIMENSION;

    /**
     * The number of operations of the '<em>Exclusive Or Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_OR_EXPRESSION_OPERATION_COUNT = INCLUSIVE_OR_EXPRESSION_CHILD_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExclusiveOrExpressionChildImpl <em>Exclusive Or Expression Child</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExclusiveOrExpressionChildImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getExclusiveOrExpressionChild()
     * @generated
     */
    int EXCLUSIVE_OR_EXPRESSION_CHILD = 13;

    /**
     * The number of structural features of the '<em>Exclusive Or Expression Child</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_OR_EXPRESSION_CHILD_FEATURE_COUNT = INCLUSIVE_OR_EXPRESSION_CHILD_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_OR_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER__STRING = INCLUSIVE_OR_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_OR_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXY__STRING = INCLUSIVE_OR_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_OR_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIERS__STRING_STRING = INCLUSIVE_OR_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_OR_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = INCLUSIVE_OR_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_OR_EXPRESSION_CHILD___GET_LIB_CLASS__STRING = INCLUSIVE_OR_EXPRESSION_CHILD___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_OR_EXPRESSION_CHILD___GET_LIB_INTERFACE__STRING = INCLUSIVE_OR_EXPRESSION_CHILD___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_OR_EXPRESSION_CHILD___GET_CLASS_CLASS = INCLUSIVE_OR_EXPRESSION_CHILD___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_OR_EXPRESSION_CHILD___GET_OBJECT_CLASS = INCLUSIVE_OR_EXPRESSION_CHILD___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_OR_EXPRESSION_CHILD___GET_STRING_CLASS = INCLUSIVE_OR_EXPRESSION_CHILD___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_OR_EXPRESSION_CHILD___GET_ANNOTATION_INTERFACE = INCLUSIVE_OR_EXPRESSION_CHILD___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_OR_EXPRESSION_CHILD___GET_CONTAINING_ANNOTATION_INSTANCE = INCLUSIVE_OR_EXPRESSION_CHILD___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_OR_EXPRESSION_CHILD___GET_CONTAINING_ANONYMOUS_CLASS = INCLUSIVE_OR_EXPRESSION_CHILD___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_OR_EXPRESSION_CHILD___GET_CONTAINING_CONCRETE_CLASSIFIER = INCLUSIVE_OR_EXPRESSION_CHILD___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_OR_EXPRESSION_CHILD___GET_CONTAINING_COMPILATION_UNIT = INCLUSIVE_OR_EXPRESSION_CHILD___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_OR_EXPRESSION_CHILD___GET_CONTAINING_PACKAGE_NAME = INCLUSIVE_OR_EXPRESSION_CHILD___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_OR_EXPRESSION_CHILD___GET_CONTAINING_CONTAINER_NAME = INCLUSIVE_OR_EXPRESSION_CHILD___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_OR_EXPRESSION_CHILD___GET_PARENT_CONCRETE_CLASSIFIER = INCLUSIVE_OR_EXPRESSION_CHILD___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_OR_EXPRESSION_CHILD___GET_PARENT_BY_ETYPE__ECLASS = INCLUSIVE_OR_EXPRESSION_CHILD___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_OR_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_ETYPE__ECLASS = INCLUSIVE_OR_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_OR_EXPRESSION_CHILD___GET_PARENT_BY_TYPE__CLASS = INCLUSIVE_OR_EXPRESSION_CHILD___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_OR_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_TYPE__CLASS = INCLUSIVE_OR_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_OR_EXPRESSION_CHILD___GET_CHILDREN_BY_ETYPE__ECLASS = INCLUSIVE_OR_EXPRESSION_CHILD___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_OR_EXPRESSION_CHILD___GET_CHILDREN_BY_TYPE__CLASS = INCLUSIVE_OR_EXPRESSION_CHILD___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_OR_EXPRESSION_CHILD___GET_COMMENTS = INCLUSIVE_OR_EXPRESSION_CHILD___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_OR_EXPRESSION_CHILD___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = INCLUSIVE_OR_EXPRESSION_CHILD___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_OR_EXPRESSION_CHILD___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = INCLUSIVE_OR_EXPRESSION_CHILD___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_OR_EXPRESSION_CHILD___GET_TYPE = INCLUSIVE_OR_EXPRESSION_CHILD___GET_TYPE;

    /**
     * The operation id for the '<em>Get Alternative Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_OR_EXPRESSION_CHILD___GET_ALTERNATIVE_TYPE = INCLUSIVE_OR_EXPRESSION_CHILD___GET_ALTERNATIVE_TYPE;

    /**
     * The operation id for the '<em>Get One Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_OR_EXPRESSION_CHILD___GET_ONE_TYPE__BOOLEAN = INCLUSIVE_OR_EXPRESSION_CHILD___GET_ONE_TYPE__BOOLEAN;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_OR_EXPRESSION_CHILD___GET_ARRAY_DIMENSION = INCLUSIVE_OR_EXPRESSION_CHILD___GET_ARRAY_DIMENSION;

    /**
     * The number of operations of the '<em>Exclusive Or Expression Child</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_OR_EXPRESSION_CHILD_OPERATION_COUNT = INCLUSIVE_OR_EXPRESSION_CHILD_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.AndExpressionImpl <em>And Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.AndExpressionImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getAndExpression()
     * @generated
     */
    int AND_EXPRESSION = 14;

    /**
     * The feature id for the '<em><b>Children</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_EXPRESSION__CHILDREN = EXCLUSIVE_OR_EXPRESSION_CHILD_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>And Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_EXPRESSION_FEATURE_COUNT = EXCLUSIVE_OR_EXPRESSION_CHILD_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_EXPRESSION___GET_CONCRETE_CLASSIFIER__STRING = EXCLUSIVE_OR_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_EXPRESSION___GET_CONCRETE_CLASSIFIER_PROXY__STRING = EXCLUSIVE_OR_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_EXPRESSION___GET_CONCRETE_CLASSIFIERS__STRING_STRING = EXCLUSIVE_OR_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_EXPRESSION___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = EXCLUSIVE_OR_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_EXPRESSION___GET_LIB_CLASS__STRING = EXCLUSIVE_OR_EXPRESSION_CHILD___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_EXPRESSION___GET_LIB_INTERFACE__STRING = EXCLUSIVE_OR_EXPRESSION_CHILD___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_EXPRESSION___GET_CLASS_CLASS = EXCLUSIVE_OR_EXPRESSION_CHILD___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_EXPRESSION___GET_OBJECT_CLASS = EXCLUSIVE_OR_EXPRESSION_CHILD___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_EXPRESSION___GET_STRING_CLASS = EXCLUSIVE_OR_EXPRESSION_CHILD___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_EXPRESSION___GET_ANNOTATION_INTERFACE = EXCLUSIVE_OR_EXPRESSION_CHILD___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_EXPRESSION___GET_CONTAINING_ANNOTATION_INSTANCE = EXCLUSIVE_OR_EXPRESSION_CHILD___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_EXPRESSION___GET_CONTAINING_ANONYMOUS_CLASS = EXCLUSIVE_OR_EXPRESSION_CHILD___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_EXPRESSION___GET_CONTAINING_CONCRETE_CLASSIFIER = EXCLUSIVE_OR_EXPRESSION_CHILD___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_EXPRESSION___GET_CONTAINING_COMPILATION_UNIT = EXCLUSIVE_OR_EXPRESSION_CHILD___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_EXPRESSION___GET_CONTAINING_PACKAGE_NAME = EXCLUSIVE_OR_EXPRESSION_CHILD___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_EXPRESSION___GET_CONTAINING_CONTAINER_NAME = EXCLUSIVE_OR_EXPRESSION_CHILD___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_EXPRESSION___GET_PARENT_CONCRETE_CLASSIFIER = EXCLUSIVE_OR_EXPRESSION_CHILD___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_EXPRESSION___GET_PARENT_BY_ETYPE__ECLASS = EXCLUSIVE_OR_EXPRESSION_CHILD___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_EXPRESSION___GET_FIRST_CHILD_BY_ETYPE__ECLASS = EXCLUSIVE_OR_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_EXPRESSION___GET_PARENT_BY_TYPE__CLASS = EXCLUSIVE_OR_EXPRESSION_CHILD___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_EXPRESSION___GET_FIRST_CHILD_BY_TYPE__CLASS = EXCLUSIVE_OR_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_EXPRESSION___GET_CHILDREN_BY_ETYPE__ECLASS = EXCLUSIVE_OR_EXPRESSION_CHILD___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_EXPRESSION___GET_CHILDREN_BY_TYPE__CLASS = EXCLUSIVE_OR_EXPRESSION_CHILD___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_EXPRESSION___GET_COMMENTS = EXCLUSIVE_OR_EXPRESSION_CHILD___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_EXPRESSION___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = EXCLUSIVE_OR_EXPRESSION_CHILD___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_EXPRESSION___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = EXCLUSIVE_OR_EXPRESSION_CHILD___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_EXPRESSION___GET_TYPE = EXCLUSIVE_OR_EXPRESSION_CHILD___GET_TYPE;

    /**
     * The operation id for the '<em>Get Alternative Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_EXPRESSION___GET_ALTERNATIVE_TYPE = EXCLUSIVE_OR_EXPRESSION_CHILD___GET_ALTERNATIVE_TYPE;

    /**
     * The operation id for the '<em>Get One Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_EXPRESSION___GET_ONE_TYPE__BOOLEAN = EXCLUSIVE_OR_EXPRESSION_CHILD___GET_ONE_TYPE__BOOLEAN;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_EXPRESSION___GET_ARRAY_DIMENSION = EXCLUSIVE_OR_EXPRESSION_CHILD___GET_ARRAY_DIMENSION;

    /**
     * The number of operations of the '<em>And Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_EXPRESSION_OPERATION_COUNT = EXCLUSIVE_OR_EXPRESSION_CHILD_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.AndExpressionChildImpl <em>And Expression Child</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.AndExpressionChildImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getAndExpressionChild()
     * @generated
     */
    int AND_EXPRESSION_CHILD = 15;

    /**
     * The number of structural features of the '<em>And Expression Child</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_EXPRESSION_CHILD_FEATURE_COUNT = EXCLUSIVE_OR_EXPRESSION_CHILD_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER__STRING = EXCLUSIVE_OR_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXY__STRING = EXCLUSIVE_OR_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIERS__STRING_STRING = EXCLUSIVE_OR_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = EXCLUSIVE_OR_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_EXPRESSION_CHILD___GET_LIB_CLASS__STRING = EXCLUSIVE_OR_EXPRESSION_CHILD___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_EXPRESSION_CHILD___GET_LIB_INTERFACE__STRING = EXCLUSIVE_OR_EXPRESSION_CHILD___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_EXPRESSION_CHILD___GET_CLASS_CLASS = EXCLUSIVE_OR_EXPRESSION_CHILD___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_EXPRESSION_CHILD___GET_OBJECT_CLASS = EXCLUSIVE_OR_EXPRESSION_CHILD___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_EXPRESSION_CHILD___GET_STRING_CLASS = EXCLUSIVE_OR_EXPRESSION_CHILD___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_EXPRESSION_CHILD___GET_ANNOTATION_INTERFACE = EXCLUSIVE_OR_EXPRESSION_CHILD___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_EXPRESSION_CHILD___GET_CONTAINING_ANNOTATION_INSTANCE = EXCLUSIVE_OR_EXPRESSION_CHILD___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_EXPRESSION_CHILD___GET_CONTAINING_ANONYMOUS_CLASS = EXCLUSIVE_OR_EXPRESSION_CHILD___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_EXPRESSION_CHILD___GET_CONTAINING_CONCRETE_CLASSIFIER = EXCLUSIVE_OR_EXPRESSION_CHILD___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_EXPRESSION_CHILD___GET_CONTAINING_COMPILATION_UNIT = EXCLUSIVE_OR_EXPRESSION_CHILD___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_EXPRESSION_CHILD___GET_CONTAINING_PACKAGE_NAME = EXCLUSIVE_OR_EXPRESSION_CHILD___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_EXPRESSION_CHILD___GET_CONTAINING_CONTAINER_NAME = EXCLUSIVE_OR_EXPRESSION_CHILD___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_EXPRESSION_CHILD___GET_PARENT_CONCRETE_CLASSIFIER = EXCLUSIVE_OR_EXPRESSION_CHILD___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_EXPRESSION_CHILD___GET_PARENT_BY_ETYPE__ECLASS = EXCLUSIVE_OR_EXPRESSION_CHILD___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_ETYPE__ECLASS = EXCLUSIVE_OR_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_EXPRESSION_CHILD___GET_PARENT_BY_TYPE__CLASS = EXCLUSIVE_OR_EXPRESSION_CHILD___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_TYPE__CLASS = EXCLUSIVE_OR_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_EXPRESSION_CHILD___GET_CHILDREN_BY_ETYPE__ECLASS = EXCLUSIVE_OR_EXPRESSION_CHILD___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_EXPRESSION_CHILD___GET_CHILDREN_BY_TYPE__CLASS = EXCLUSIVE_OR_EXPRESSION_CHILD___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_EXPRESSION_CHILD___GET_COMMENTS = EXCLUSIVE_OR_EXPRESSION_CHILD___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_EXPRESSION_CHILD___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = EXCLUSIVE_OR_EXPRESSION_CHILD___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_EXPRESSION_CHILD___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = EXCLUSIVE_OR_EXPRESSION_CHILD___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_EXPRESSION_CHILD___GET_TYPE = EXCLUSIVE_OR_EXPRESSION_CHILD___GET_TYPE;

    /**
     * The operation id for the '<em>Get Alternative Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_EXPRESSION_CHILD___GET_ALTERNATIVE_TYPE = EXCLUSIVE_OR_EXPRESSION_CHILD___GET_ALTERNATIVE_TYPE;

    /**
     * The operation id for the '<em>Get One Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_EXPRESSION_CHILD___GET_ONE_TYPE__BOOLEAN = EXCLUSIVE_OR_EXPRESSION_CHILD___GET_ONE_TYPE__BOOLEAN;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_EXPRESSION_CHILD___GET_ARRAY_DIMENSION = EXCLUSIVE_OR_EXPRESSION_CHILD___GET_ARRAY_DIMENSION;

    /**
     * The number of operations of the '<em>And Expression Child</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_EXPRESSION_CHILD_OPERATION_COUNT = EXCLUSIVE_OR_EXPRESSION_CHILD_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.EqualityExpressionImpl <em>Equality Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.EqualityExpressionImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getEqualityExpression()
     * @generated
     */
    int EQUALITY_EXPRESSION = 16;

    /**
     * The feature id for the '<em><b>Equality Operators</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUALITY_EXPRESSION__EQUALITY_OPERATORS = AND_EXPRESSION_CHILD_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Children</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUALITY_EXPRESSION__CHILDREN = AND_EXPRESSION_CHILD_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Equality Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUALITY_EXPRESSION_FEATURE_COUNT = AND_EXPRESSION_CHILD_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUALITY_EXPRESSION___GET_CONCRETE_CLASSIFIER__STRING = AND_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUALITY_EXPRESSION___GET_CONCRETE_CLASSIFIER_PROXY__STRING = AND_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUALITY_EXPRESSION___GET_CONCRETE_CLASSIFIERS__STRING_STRING = AND_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUALITY_EXPRESSION___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = AND_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUALITY_EXPRESSION___GET_LIB_CLASS__STRING = AND_EXPRESSION_CHILD___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUALITY_EXPRESSION___GET_LIB_INTERFACE__STRING = AND_EXPRESSION_CHILD___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUALITY_EXPRESSION___GET_CLASS_CLASS = AND_EXPRESSION_CHILD___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUALITY_EXPRESSION___GET_OBJECT_CLASS = AND_EXPRESSION_CHILD___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUALITY_EXPRESSION___GET_STRING_CLASS = AND_EXPRESSION_CHILD___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUALITY_EXPRESSION___GET_ANNOTATION_INTERFACE = AND_EXPRESSION_CHILD___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUALITY_EXPRESSION___GET_CONTAINING_ANNOTATION_INSTANCE = AND_EXPRESSION_CHILD___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUALITY_EXPRESSION___GET_CONTAINING_ANONYMOUS_CLASS = AND_EXPRESSION_CHILD___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUALITY_EXPRESSION___GET_CONTAINING_CONCRETE_CLASSIFIER = AND_EXPRESSION_CHILD___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUALITY_EXPRESSION___GET_CONTAINING_COMPILATION_UNIT = AND_EXPRESSION_CHILD___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUALITY_EXPRESSION___GET_CONTAINING_PACKAGE_NAME = AND_EXPRESSION_CHILD___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUALITY_EXPRESSION___GET_CONTAINING_CONTAINER_NAME = AND_EXPRESSION_CHILD___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUALITY_EXPRESSION___GET_PARENT_CONCRETE_CLASSIFIER = AND_EXPRESSION_CHILD___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUALITY_EXPRESSION___GET_PARENT_BY_ETYPE__ECLASS = AND_EXPRESSION_CHILD___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUALITY_EXPRESSION___GET_FIRST_CHILD_BY_ETYPE__ECLASS = AND_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUALITY_EXPRESSION___GET_PARENT_BY_TYPE__CLASS = AND_EXPRESSION_CHILD___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUALITY_EXPRESSION___GET_FIRST_CHILD_BY_TYPE__CLASS = AND_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUALITY_EXPRESSION___GET_CHILDREN_BY_ETYPE__ECLASS = AND_EXPRESSION_CHILD___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUALITY_EXPRESSION___GET_CHILDREN_BY_TYPE__CLASS = AND_EXPRESSION_CHILD___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUALITY_EXPRESSION___GET_COMMENTS = AND_EXPRESSION_CHILD___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUALITY_EXPRESSION___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = AND_EXPRESSION_CHILD___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUALITY_EXPRESSION___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = AND_EXPRESSION_CHILD___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUALITY_EXPRESSION___GET_TYPE = AND_EXPRESSION_CHILD___GET_TYPE;

    /**
     * The operation id for the '<em>Get Alternative Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUALITY_EXPRESSION___GET_ALTERNATIVE_TYPE = AND_EXPRESSION_CHILD___GET_ALTERNATIVE_TYPE;

    /**
     * The operation id for the '<em>Get One Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUALITY_EXPRESSION___GET_ONE_TYPE__BOOLEAN = AND_EXPRESSION_CHILD___GET_ONE_TYPE__BOOLEAN;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUALITY_EXPRESSION___GET_ARRAY_DIMENSION = AND_EXPRESSION_CHILD___GET_ARRAY_DIMENSION;

    /**
     * The number of operations of the '<em>Equality Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUALITY_EXPRESSION_OPERATION_COUNT = AND_EXPRESSION_CHILD_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.EqualityExpressionChildImpl <em>Equality Expression Child</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.EqualityExpressionChildImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getEqualityExpressionChild()
     * @generated
     */
    int EQUALITY_EXPRESSION_CHILD = 17;

    /**
     * The number of structural features of the '<em>Equality Expression Child</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUALITY_EXPRESSION_CHILD_FEATURE_COUNT = AND_EXPRESSION_CHILD_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUALITY_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER__STRING = AND_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUALITY_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXY__STRING = AND_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUALITY_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIERS__STRING_STRING = AND_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUALITY_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = AND_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUALITY_EXPRESSION_CHILD___GET_LIB_CLASS__STRING = AND_EXPRESSION_CHILD___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUALITY_EXPRESSION_CHILD___GET_LIB_INTERFACE__STRING = AND_EXPRESSION_CHILD___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUALITY_EXPRESSION_CHILD___GET_CLASS_CLASS = AND_EXPRESSION_CHILD___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUALITY_EXPRESSION_CHILD___GET_OBJECT_CLASS = AND_EXPRESSION_CHILD___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUALITY_EXPRESSION_CHILD___GET_STRING_CLASS = AND_EXPRESSION_CHILD___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUALITY_EXPRESSION_CHILD___GET_ANNOTATION_INTERFACE = AND_EXPRESSION_CHILD___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUALITY_EXPRESSION_CHILD___GET_CONTAINING_ANNOTATION_INSTANCE = AND_EXPRESSION_CHILD___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUALITY_EXPRESSION_CHILD___GET_CONTAINING_ANONYMOUS_CLASS = AND_EXPRESSION_CHILD___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUALITY_EXPRESSION_CHILD___GET_CONTAINING_CONCRETE_CLASSIFIER = AND_EXPRESSION_CHILD___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUALITY_EXPRESSION_CHILD___GET_CONTAINING_COMPILATION_UNIT = AND_EXPRESSION_CHILD___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUALITY_EXPRESSION_CHILD___GET_CONTAINING_PACKAGE_NAME = AND_EXPRESSION_CHILD___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUALITY_EXPRESSION_CHILD___GET_CONTAINING_CONTAINER_NAME = AND_EXPRESSION_CHILD___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUALITY_EXPRESSION_CHILD___GET_PARENT_CONCRETE_CLASSIFIER = AND_EXPRESSION_CHILD___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUALITY_EXPRESSION_CHILD___GET_PARENT_BY_ETYPE__ECLASS = AND_EXPRESSION_CHILD___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUALITY_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_ETYPE__ECLASS = AND_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUALITY_EXPRESSION_CHILD___GET_PARENT_BY_TYPE__CLASS = AND_EXPRESSION_CHILD___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUALITY_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_TYPE__CLASS = AND_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUALITY_EXPRESSION_CHILD___GET_CHILDREN_BY_ETYPE__ECLASS = AND_EXPRESSION_CHILD___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUALITY_EXPRESSION_CHILD___GET_CHILDREN_BY_TYPE__CLASS = AND_EXPRESSION_CHILD___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUALITY_EXPRESSION_CHILD___GET_COMMENTS = AND_EXPRESSION_CHILD___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUALITY_EXPRESSION_CHILD___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = AND_EXPRESSION_CHILD___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUALITY_EXPRESSION_CHILD___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = AND_EXPRESSION_CHILD___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUALITY_EXPRESSION_CHILD___GET_TYPE = AND_EXPRESSION_CHILD___GET_TYPE;

    /**
     * The operation id for the '<em>Get Alternative Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUALITY_EXPRESSION_CHILD___GET_ALTERNATIVE_TYPE = AND_EXPRESSION_CHILD___GET_ALTERNATIVE_TYPE;

    /**
     * The operation id for the '<em>Get One Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUALITY_EXPRESSION_CHILD___GET_ONE_TYPE__BOOLEAN = AND_EXPRESSION_CHILD___GET_ONE_TYPE__BOOLEAN;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUALITY_EXPRESSION_CHILD___GET_ARRAY_DIMENSION = AND_EXPRESSION_CHILD___GET_ARRAY_DIMENSION;

    /**
     * The number of operations of the '<em>Equality Expression Child</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUALITY_EXPRESSION_CHILD_OPERATION_COUNT = AND_EXPRESSION_CHILD_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.InstanceOfExpressionImpl <em>Instance Of Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.InstanceOfExpressionImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getInstanceOfExpression()
     * @generated
     */
    int INSTANCE_OF_EXPRESSION = 18;

    /**
     * The feature id for the '<em><b>Array Dimensions Before</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPRESSION__ARRAY_DIMENSIONS_BEFORE = ArraysPackage.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_BEFORE;

    /**
     * The feature id for the '<em><b>Array Dimensions After</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPRESSION__ARRAY_DIMENSIONS_AFTER = ArraysPackage.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_AFTER;

    /**
     * The feature id for the '<em><b>Type Reference</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPRESSION__TYPE_REFERENCE = ArraysPackage.ARRAY_TYPEABLE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Child</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPRESSION__CHILD = ArraysPackage.ARRAY_TYPEABLE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Instance Of Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPRESSION_FEATURE_COUNT = ArraysPackage.ARRAY_TYPEABLE_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPRESSION___GET_CONCRETE_CLASSIFIER__STRING = ArraysPackage.ARRAY_TYPEABLE___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPRESSION___GET_CONCRETE_CLASSIFIER_PROXY__STRING = ArraysPackage.ARRAY_TYPEABLE___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPRESSION___GET_CONCRETE_CLASSIFIERS__STRING_STRING = ArraysPackage.ARRAY_TYPEABLE___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPRESSION___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = ArraysPackage.ARRAY_TYPEABLE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPRESSION___GET_LIB_CLASS__STRING = ArraysPackage.ARRAY_TYPEABLE___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPRESSION___GET_LIB_INTERFACE__STRING = ArraysPackage.ARRAY_TYPEABLE___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPRESSION___GET_CLASS_CLASS = ArraysPackage.ARRAY_TYPEABLE___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPRESSION___GET_OBJECT_CLASS = ArraysPackage.ARRAY_TYPEABLE___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPRESSION___GET_STRING_CLASS = ArraysPackage.ARRAY_TYPEABLE___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPRESSION___GET_ANNOTATION_INTERFACE = ArraysPackage.ARRAY_TYPEABLE___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPRESSION___GET_CONTAINING_ANNOTATION_INSTANCE = ArraysPackage.ARRAY_TYPEABLE___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPRESSION___GET_CONTAINING_ANONYMOUS_CLASS = ArraysPackage.ARRAY_TYPEABLE___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPRESSION___GET_CONTAINING_CONCRETE_CLASSIFIER = ArraysPackage.ARRAY_TYPEABLE___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPRESSION___GET_CONTAINING_COMPILATION_UNIT = ArraysPackage.ARRAY_TYPEABLE___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPRESSION___GET_CONTAINING_PACKAGE_NAME = ArraysPackage.ARRAY_TYPEABLE___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPRESSION___GET_CONTAINING_CONTAINER_NAME = ArraysPackage.ARRAY_TYPEABLE___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPRESSION___GET_PARENT_CONCRETE_CLASSIFIER = ArraysPackage.ARRAY_TYPEABLE___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPRESSION___GET_PARENT_BY_ETYPE__ECLASS = ArraysPackage.ARRAY_TYPEABLE___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPRESSION___GET_FIRST_CHILD_BY_ETYPE__ECLASS = ArraysPackage.ARRAY_TYPEABLE___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPRESSION___GET_PARENT_BY_TYPE__CLASS = ArraysPackage.ARRAY_TYPEABLE___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPRESSION___GET_FIRST_CHILD_BY_TYPE__CLASS = ArraysPackage.ARRAY_TYPEABLE___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPRESSION___GET_CHILDREN_BY_ETYPE__ECLASS = ArraysPackage.ARRAY_TYPEABLE___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPRESSION___GET_CHILDREN_BY_TYPE__CLASS = ArraysPackage.ARRAY_TYPEABLE___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPRESSION___GET_COMMENTS = ArraysPackage.ARRAY_TYPEABLE___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPRESSION___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = ArraysPackage.ARRAY_TYPEABLE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPRESSION___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = ArraysPackage.ARRAY_TYPEABLE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPRESSION___GET_TYPE = ArraysPackage.ARRAY_TYPEABLE_OPERATION_COUNT + 0;

    /**
     * The operation id for the '<em>Get Alternative Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPRESSION___GET_ALTERNATIVE_TYPE = ArraysPackage.ARRAY_TYPEABLE_OPERATION_COUNT + 1;

    /**
     * The operation id for the '<em>Get One Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPRESSION___GET_ONE_TYPE__BOOLEAN = ArraysPackage.ARRAY_TYPEABLE_OPERATION_COUNT + 2;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPRESSION___GET_ARRAY_DIMENSION = ArraysPackage.ARRAY_TYPEABLE_OPERATION_COUNT + 3;

    /**
     * The number of operations of the '<em>Instance Of Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPRESSION_OPERATION_COUNT = ArraysPackage.ARRAY_TYPEABLE_OPERATION_COUNT + 4;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.InstanceOfExpressionChildImpl <em>Instance Of Expression Child</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.InstanceOfExpressionChildImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getInstanceOfExpressionChild()
     * @generated
     */
    int INSTANCE_OF_EXPRESSION_CHILD = 19;

    /**
     * The number of structural features of the '<em>Instance Of Expression Child</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPRESSION_CHILD_FEATURE_COUNT = EQUALITY_EXPRESSION_CHILD_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER__STRING = EQUALITY_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXY__STRING = EQUALITY_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIERS__STRING_STRING = EQUALITY_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = EQUALITY_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPRESSION_CHILD___GET_LIB_CLASS__STRING = EQUALITY_EXPRESSION_CHILD___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPRESSION_CHILD___GET_LIB_INTERFACE__STRING = EQUALITY_EXPRESSION_CHILD___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPRESSION_CHILD___GET_CLASS_CLASS = EQUALITY_EXPRESSION_CHILD___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPRESSION_CHILD___GET_OBJECT_CLASS = EQUALITY_EXPRESSION_CHILD___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPRESSION_CHILD___GET_STRING_CLASS = EQUALITY_EXPRESSION_CHILD___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPRESSION_CHILD___GET_ANNOTATION_INTERFACE = EQUALITY_EXPRESSION_CHILD___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPRESSION_CHILD___GET_CONTAINING_ANNOTATION_INSTANCE = EQUALITY_EXPRESSION_CHILD___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPRESSION_CHILD___GET_CONTAINING_ANONYMOUS_CLASS = EQUALITY_EXPRESSION_CHILD___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPRESSION_CHILD___GET_CONTAINING_CONCRETE_CLASSIFIER = EQUALITY_EXPRESSION_CHILD___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPRESSION_CHILD___GET_CONTAINING_COMPILATION_UNIT = EQUALITY_EXPRESSION_CHILD___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPRESSION_CHILD___GET_CONTAINING_PACKAGE_NAME = EQUALITY_EXPRESSION_CHILD___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPRESSION_CHILD___GET_CONTAINING_CONTAINER_NAME = EQUALITY_EXPRESSION_CHILD___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPRESSION_CHILD___GET_PARENT_CONCRETE_CLASSIFIER = EQUALITY_EXPRESSION_CHILD___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPRESSION_CHILD___GET_PARENT_BY_ETYPE__ECLASS = EQUALITY_EXPRESSION_CHILD___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_ETYPE__ECLASS = EQUALITY_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPRESSION_CHILD___GET_PARENT_BY_TYPE__CLASS = EQUALITY_EXPRESSION_CHILD___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_TYPE__CLASS = EQUALITY_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPRESSION_CHILD___GET_CHILDREN_BY_ETYPE__ECLASS = EQUALITY_EXPRESSION_CHILD___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPRESSION_CHILD___GET_CHILDREN_BY_TYPE__CLASS = EQUALITY_EXPRESSION_CHILD___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPRESSION_CHILD___GET_COMMENTS = EQUALITY_EXPRESSION_CHILD___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPRESSION_CHILD___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = EQUALITY_EXPRESSION_CHILD___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPRESSION_CHILD___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = EQUALITY_EXPRESSION_CHILD___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPRESSION_CHILD___GET_TYPE = EQUALITY_EXPRESSION_CHILD___GET_TYPE;

    /**
     * The operation id for the '<em>Get Alternative Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPRESSION_CHILD___GET_ALTERNATIVE_TYPE = EQUALITY_EXPRESSION_CHILD___GET_ALTERNATIVE_TYPE;

    /**
     * The operation id for the '<em>Get One Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPRESSION_CHILD___GET_ONE_TYPE__BOOLEAN = EQUALITY_EXPRESSION_CHILD___GET_ONE_TYPE__BOOLEAN;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPRESSION_CHILD___GET_ARRAY_DIMENSION = EQUALITY_EXPRESSION_CHILD___GET_ARRAY_DIMENSION;

    /**
     * The number of operations of the '<em>Instance Of Expression Child</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_OF_EXPRESSION_CHILD_OPERATION_COUNT = EQUALITY_EXPRESSION_CHILD_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.RelationExpressionImpl <em>Relation Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.RelationExpressionImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getRelationExpression()
     * @generated
     */
    int RELATION_EXPRESSION = 20;

    /**
     * The feature id for the '<em><b>Children</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_EXPRESSION__CHILDREN = INSTANCE_OF_EXPRESSION_CHILD_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Relation Operators</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_EXPRESSION__RELATION_OPERATORS = INSTANCE_OF_EXPRESSION_CHILD_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Relation Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_EXPRESSION_FEATURE_COUNT = INSTANCE_OF_EXPRESSION_CHILD_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_EXPRESSION___GET_CONCRETE_CLASSIFIER__STRING = INSTANCE_OF_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_EXPRESSION___GET_CONCRETE_CLASSIFIER_PROXY__STRING = INSTANCE_OF_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_EXPRESSION___GET_CONCRETE_CLASSIFIERS__STRING_STRING = INSTANCE_OF_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_EXPRESSION___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = INSTANCE_OF_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_EXPRESSION___GET_LIB_CLASS__STRING = INSTANCE_OF_EXPRESSION_CHILD___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_EXPRESSION___GET_LIB_INTERFACE__STRING = INSTANCE_OF_EXPRESSION_CHILD___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_EXPRESSION___GET_CLASS_CLASS = INSTANCE_OF_EXPRESSION_CHILD___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_EXPRESSION___GET_OBJECT_CLASS = INSTANCE_OF_EXPRESSION_CHILD___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_EXPRESSION___GET_STRING_CLASS = INSTANCE_OF_EXPRESSION_CHILD___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_EXPRESSION___GET_ANNOTATION_INTERFACE = INSTANCE_OF_EXPRESSION_CHILD___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_EXPRESSION___GET_CONTAINING_ANNOTATION_INSTANCE = INSTANCE_OF_EXPRESSION_CHILD___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_EXPRESSION___GET_CONTAINING_ANONYMOUS_CLASS = INSTANCE_OF_EXPRESSION_CHILD___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_EXPRESSION___GET_CONTAINING_CONCRETE_CLASSIFIER = INSTANCE_OF_EXPRESSION_CHILD___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_EXPRESSION___GET_CONTAINING_COMPILATION_UNIT = INSTANCE_OF_EXPRESSION_CHILD___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_EXPRESSION___GET_CONTAINING_PACKAGE_NAME = INSTANCE_OF_EXPRESSION_CHILD___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_EXPRESSION___GET_CONTAINING_CONTAINER_NAME = INSTANCE_OF_EXPRESSION_CHILD___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_EXPRESSION___GET_PARENT_CONCRETE_CLASSIFIER = INSTANCE_OF_EXPRESSION_CHILD___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_EXPRESSION___GET_PARENT_BY_ETYPE__ECLASS = INSTANCE_OF_EXPRESSION_CHILD___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_EXPRESSION___GET_FIRST_CHILD_BY_ETYPE__ECLASS = INSTANCE_OF_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_EXPRESSION___GET_PARENT_BY_TYPE__CLASS = INSTANCE_OF_EXPRESSION_CHILD___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_EXPRESSION___GET_FIRST_CHILD_BY_TYPE__CLASS = INSTANCE_OF_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_EXPRESSION___GET_CHILDREN_BY_ETYPE__ECLASS = INSTANCE_OF_EXPRESSION_CHILD___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_EXPRESSION___GET_CHILDREN_BY_TYPE__CLASS = INSTANCE_OF_EXPRESSION_CHILD___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_EXPRESSION___GET_COMMENTS = INSTANCE_OF_EXPRESSION_CHILD___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_EXPRESSION___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = INSTANCE_OF_EXPRESSION_CHILD___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_EXPRESSION___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = INSTANCE_OF_EXPRESSION_CHILD___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_EXPRESSION___GET_TYPE = INSTANCE_OF_EXPRESSION_CHILD___GET_TYPE;

    /**
     * The operation id for the '<em>Get Alternative Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_EXPRESSION___GET_ALTERNATIVE_TYPE = INSTANCE_OF_EXPRESSION_CHILD___GET_ALTERNATIVE_TYPE;

    /**
     * The operation id for the '<em>Get One Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_EXPRESSION___GET_ONE_TYPE__BOOLEAN = INSTANCE_OF_EXPRESSION_CHILD___GET_ONE_TYPE__BOOLEAN;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_EXPRESSION___GET_ARRAY_DIMENSION = INSTANCE_OF_EXPRESSION_CHILD___GET_ARRAY_DIMENSION;

    /**
     * The number of operations of the '<em>Relation Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_EXPRESSION_OPERATION_COUNT = INSTANCE_OF_EXPRESSION_CHILD_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.RelationExpressionChildImpl <em>Relation Expression Child</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.RelationExpressionChildImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getRelationExpressionChild()
     * @generated
     */
    int RELATION_EXPRESSION_CHILD = 21;

    /**
     * The number of structural features of the '<em>Relation Expression Child</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_EXPRESSION_CHILD_FEATURE_COUNT = INSTANCE_OF_EXPRESSION_CHILD_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER__STRING = INSTANCE_OF_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXY__STRING = INSTANCE_OF_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIERS__STRING_STRING = INSTANCE_OF_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = INSTANCE_OF_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_EXPRESSION_CHILD___GET_LIB_CLASS__STRING = INSTANCE_OF_EXPRESSION_CHILD___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_EXPRESSION_CHILD___GET_LIB_INTERFACE__STRING = INSTANCE_OF_EXPRESSION_CHILD___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_EXPRESSION_CHILD___GET_CLASS_CLASS = INSTANCE_OF_EXPRESSION_CHILD___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_EXPRESSION_CHILD___GET_OBJECT_CLASS = INSTANCE_OF_EXPRESSION_CHILD___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_EXPRESSION_CHILD___GET_STRING_CLASS = INSTANCE_OF_EXPRESSION_CHILD___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_EXPRESSION_CHILD___GET_ANNOTATION_INTERFACE = INSTANCE_OF_EXPRESSION_CHILD___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_EXPRESSION_CHILD___GET_CONTAINING_ANNOTATION_INSTANCE = INSTANCE_OF_EXPRESSION_CHILD___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_EXPRESSION_CHILD___GET_CONTAINING_ANONYMOUS_CLASS = INSTANCE_OF_EXPRESSION_CHILD___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_EXPRESSION_CHILD___GET_CONTAINING_CONCRETE_CLASSIFIER = INSTANCE_OF_EXPRESSION_CHILD___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_EXPRESSION_CHILD___GET_CONTAINING_COMPILATION_UNIT = INSTANCE_OF_EXPRESSION_CHILD___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_EXPRESSION_CHILD___GET_CONTAINING_PACKAGE_NAME = INSTANCE_OF_EXPRESSION_CHILD___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_EXPRESSION_CHILD___GET_CONTAINING_CONTAINER_NAME = INSTANCE_OF_EXPRESSION_CHILD___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_EXPRESSION_CHILD___GET_PARENT_CONCRETE_CLASSIFIER = INSTANCE_OF_EXPRESSION_CHILD___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_EXPRESSION_CHILD___GET_PARENT_BY_ETYPE__ECLASS = INSTANCE_OF_EXPRESSION_CHILD___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_ETYPE__ECLASS = INSTANCE_OF_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_EXPRESSION_CHILD___GET_PARENT_BY_TYPE__CLASS = INSTANCE_OF_EXPRESSION_CHILD___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_TYPE__CLASS = INSTANCE_OF_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_EXPRESSION_CHILD___GET_CHILDREN_BY_ETYPE__ECLASS = INSTANCE_OF_EXPRESSION_CHILD___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_EXPRESSION_CHILD___GET_CHILDREN_BY_TYPE__CLASS = INSTANCE_OF_EXPRESSION_CHILD___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_EXPRESSION_CHILD___GET_COMMENTS = INSTANCE_OF_EXPRESSION_CHILD___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_EXPRESSION_CHILD___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = INSTANCE_OF_EXPRESSION_CHILD___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_EXPRESSION_CHILD___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = INSTANCE_OF_EXPRESSION_CHILD___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_EXPRESSION_CHILD___GET_TYPE = INSTANCE_OF_EXPRESSION_CHILD___GET_TYPE;

    /**
     * The operation id for the '<em>Get Alternative Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_EXPRESSION_CHILD___GET_ALTERNATIVE_TYPE = INSTANCE_OF_EXPRESSION_CHILD___GET_ALTERNATIVE_TYPE;

    /**
     * The operation id for the '<em>Get One Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_EXPRESSION_CHILD___GET_ONE_TYPE__BOOLEAN = INSTANCE_OF_EXPRESSION_CHILD___GET_ONE_TYPE__BOOLEAN;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_EXPRESSION_CHILD___GET_ARRAY_DIMENSION = INSTANCE_OF_EXPRESSION_CHILD___GET_ARRAY_DIMENSION;

    /**
     * The number of operations of the '<em>Relation Expression Child</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_EXPRESSION_CHILD_OPERATION_COUNT = INSTANCE_OF_EXPRESSION_CHILD_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ShiftExpressionImpl <em>Shift Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ShiftExpressionImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getShiftExpression()
     * @generated
     */
    int SHIFT_EXPRESSION = 22;

    /**
     * The feature id for the '<em><b>Children</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHIFT_EXPRESSION__CHILDREN = RELATION_EXPRESSION_CHILD_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Shift Operators</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHIFT_EXPRESSION__SHIFT_OPERATORS = RELATION_EXPRESSION_CHILD_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Shift Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHIFT_EXPRESSION_FEATURE_COUNT = RELATION_EXPRESSION_CHILD_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHIFT_EXPRESSION___GET_CONCRETE_CLASSIFIER__STRING = RELATION_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHIFT_EXPRESSION___GET_CONCRETE_CLASSIFIER_PROXY__STRING = RELATION_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHIFT_EXPRESSION___GET_CONCRETE_CLASSIFIERS__STRING_STRING = RELATION_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHIFT_EXPRESSION___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = RELATION_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHIFT_EXPRESSION___GET_LIB_CLASS__STRING = RELATION_EXPRESSION_CHILD___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHIFT_EXPRESSION___GET_LIB_INTERFACE__STRING = RELATION_EXPRESSION_CHILD___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHIFT_EXPRESSION___GET_CLASS_CLASS = RELATION_EXPRESSION_CHILD___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHIFT_EXPRESSION___GET_OBJECT_CLASS = RELATION_EXPRESSION_CHILD___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHIFT_EXPRESSION___GET_STRING_CLASS = RELATION_EXPRESSION_CHILD___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHIFT_EXPRESSION___GET_ANNOTATION_INTERFACE = RELATION_EXPRESSION_CHILD___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHIFT_EXPRESSION___GET_CONTAINING_ANNOTATION_INSTANCE = RELATION_EXPRESSION_CHILD___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHIFT_EXPRESSION___GET_CONTAINING_ANONYMOUS_CLASS = RELATION_EXPRESSION_CHILD___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHIFT_EXPRESSION___GET_CONTAINING_CONCRETE_CLASSIFIER = RELATION_EXPRESSION_CHILD___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHIFT_EXPRESSION___GET_CONTAINING_COMPILATION_UNIT = RELATION_EXPRESSION_CHILD___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHIFT_EXPRESSION___GET_CONTAINING_PACKAGE_NAME = RELATION_EXPRESSION_CHILD___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHIFT_EXPRESSION___GET_CONTAINING_CONTAINER_NAME = RELATION_EXPRESSION_CHILD___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHIFT_EXPRESSION___GET_PARENT_CONCRETE_CLASSIFIER = RELATION_EXPRESSION_CHILD___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHIFT_EXPRESSION___GET_PARENT_BY_ETYPE__ECLASS = RELATION_EXPRESSION_CHILD___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHIFT_EXPRESSION___GET_FIRST_CHILD_BY_ETYPE__ECLASS = RELATION_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHIFT_EXPRESSION___GET_PARENT_BY_TYPE__CLASS = RELATION_EXPRESSION_CHILD___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHIFT_EXPRESSION___GET_FIRST_CHILD_BY_TYPE__CLASS = RELATION_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHIFT_EXPRESSION___GET_CHILDREN_BY_ETYPE__ECLASS = RELATION_EXPRESSION_CHILD___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHIFT_EXPRESSION___GET_CHILDREN_BY_TYPE__CLASS = RELATION_EXPRESSION_CHILD___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHIFT_EXPRESSION___GET_COMMENTS = RELATION_EXPRESSION_CHILD___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHIFT_EXPRESSION___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = RELATION_EXPRESSION_CHILD___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHIFT_EXPRESSION___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = RELATION_EXPRESSION_CHILD___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHIFT_EXPRESSION___GET_TYPE = RELATION_EXPRESSION_CHILD___GET_TYPE;

    /**
     * The operation id for the '<em>Get Alternative Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHIFT_EXPRESSION___GET_ALTERNATIVE_TYPE = RELATION_EXPRESSION_CHILD___GET_ALTERNATIVE_TYPE;

    /**
     * The operation id for the '<em>Get One Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHIFT_EXPRESSION___GET_ONE_TYPE__BOOLEAN = RELATION_EXPRESSION_CHILD___GET_ONE_TYPE__BOOLEAN;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHIFT_EXPRESSION___GET_ARRAY_DIMENSION = RELATION_EXPRESSION_CHILD___GET_ARRAY_DIMENSION;

    /**
     * The number of operations of the '<em>Shift Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHIFT_EXPRESSION_OPERATION_COUNT = RELATION_EXPRESSION_CHILD_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ShiftExpressionChildImpl <em>Shift Expression Child</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ShiftExpressionChildImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getShiftExpressionChild()
     * @generated
     */
    int SHIFT_EXPRESSION_CHILD = 23;

    /**
     * The number of structural features of the '<em>Shift Expression Child</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHIFT_EXPRESSION_CHILD_FEATURE_COUNT = RELATION_EXPRESSION_CHILD_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHIFT_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER__STRING = RELATION_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHIFT_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXY__STRING = RELATION_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHIFT_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIERS__STRING_STRING = RELATION_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHIFT_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = RELATION_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHIFT_EXPRESSION_CHILD___GET_LIB_CLASS__STRING = RELATION_EXPRESSION_CHILD___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHIFT_EXPRESSION_CHILD___GET_LIB_INTERFACE__STRING = RELATION_EXPRESSION_CHILD___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHIFT_EXPRESSION_CHILD___GET_CLASS_CLASS = RELATION_EXPRESSION_CHILD___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHIFT_EXPRESSION_CHILD___GET_OBJECT_CLASS = RELATION_EXPRESSION_CHILD___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHIFT_EXPRESSION_CHILD___GET_STRING_CLASS = RELATION_EXPRESSION_CHILD___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHIFT_EXPRESSION_CHILD___GET_ANNOTATION_INTERFACE = RELATION_EXPRESSION_CHILD___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHIFT_EXPRESSION_CHILD___GET_CONTAINING_ANNOTATION_INSTANCE = RELATION_EXPRESSION_CHILD___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHIFT_EXPRESSION_CHILD___GET_CONTAINING_ANONYMOUS_CLASS = RELATION_EXPRESSION_CHILD___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHIFT_EXPRESSION_CHILD___GET_CONTAINING_CONCRETE_CLASSIFIER = RELATION_EXPRESSION_CHILD___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHIFT_EXPRESSION_CHILD___GET_CONTAINING_COMPILATION_UNIT = RELATION_EXPRESSION_CHILD___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHIFT_EXPRESSION_CHILD___GET_CONTAINING_PACKAGE_NAME = RELATION_EXPRESSION_CHILD___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHIFT_EXPRESSION_CHILD___GET_CONTAINING_CONTAINER_NAME = RELATION_EXPRESSION_CHILD___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHIFT_EXPRESSION_CHILD___GET_PARENT_CONCRETE_CLASSIFIER = RELATION_EXPRESSION_CHILD___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHIFT_EXPRESSION_CHILD___GET_PARENT_BY_ETYPE__ECLASS = RELATION_EXPRESSION_CHILD___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHIFT_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_ETYPE__ECLASS = RELATION_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHIFT_EXPRESSION_CHILD___GET_PARENT_BY_TYPE__CLASS = RELATION_EXPRESSION_CHILD___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHIFT_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_TYPE__CLASS = RELATION_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHIFT_EXPRESSION_CHILD___GET_CHILDREN_BY_ETYPE__ECLASS = RELATION_EXPRESSION_CHILD___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHIFT_EXPRESSION_CHILD___GET_CHILDREN_BY_TYPE__CLASS = RELATION_EXPRESSION_CHILD___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHIFT_EXPRESSION_CHILD___GET_COMMENTS = RELATION_EXPRESSION_CHILD___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHIFT_EXPRESSION_CHILD___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = RELATION_EXPRESSION_CHILD___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHIFT_EXPRESSION_CHILD___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = RELATION_EXPRESSION_CHILD___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHIFT_EXPRESSION_CHILD___GET_TYPE = RELATION_EXPRESSION_CHILD___GET_TYPE;

    /**
     * The operation id for the '<em>Get Alternative Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHIFT_EXPRESSION_CHILD___GET_ALTERNATIVE_TYPE = RELATION_EXPRESSION_CHILD___GET_ALTERNATIVE_TYPE;

    /**
     * The operation id for the '<em>Get One Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHIFT_EXPRESSION_CHILD___GET_ONE_TYPE__BOOLEAN = RELATION_EXPRESSION_CHILD___GET_ONE_TYPE__BOOLEAN;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHIFT_EXPRESSION_CHILD___GET_ARRAY_DIMENSION = RELATION_EXPRESSION_CHILD___GET_ARRAY_DIMENSION;

    /**
     * The number of operations of the '<em>Shift Expression Child</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHIFT_EXPRESSION_CHILD_OPERATION_COUNT = RELATION_EXPRESSION_CHILD_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.AdditiveExpressionImpl <em>Additive Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.AdditiveExpressionImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getAdditiveExpression()
     * @generated
     */
    int ADDITIVE_EXPRESSION = 24;

    /**
     * The feature id for the '<em><b>Children</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIVE_EXPRESSION__CHILDREN = SHIFT_EXPRESSION_CHILD_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Additive Operators</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIVE_EXPRESSION__ADDITIVE_OPERATORS = SHIFT_EXPRESSION_CHILD_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Additive Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIVE_EXPRESSION_FEATURE_COUNT = SHIFT_EXPRESSION_CHILD_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIVE_EXPRESSION___GET_CONCRETE_CLASSIFIER__STRING = SHIFT_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIVE_EXPRESSION___GET_CONCRETE_CLASSIFIER_PROXY__STRING = SHIFT_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIVE_EXPRESSION___GET_CONCRETE_CLASSIFIERS__STRING_STRING = SHIFT_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIVE_EXPRESSION___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = SHIFT_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIVE_EXPRESSION___GET_LIB_CLASS__STRING = SHIFT_EXPRESSION_CHILD___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIVE_EXPRESSION___GET_LIB_INTERFACE__STRING = SHIFT_EXPRESSION_CHILD___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIVE_EXPRESSION___GET_CLASS_CLASS = SHIFT_EXPRESSION_CHILD___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIVE_EXPRESSION___GET_OBJECT_CLASS = SHIFT_EXPRESSION_CHILD___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIVE_EXPRESSION___GET_STRING_CLASS = SHIFT_EXPRESSION_CHILD___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIVE_EXPRESSION___GET_ANNOTATION_INTERFACE = SHIFT_EXPRESSION_CHILD___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIVE_EXPRESSION___GET_CONTAINING_ANNOTATION_INSTANCE = SHIFT_EXPRESSION_CHILD___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIVE_EXPRESSION___GET_CONTAINING_ANONYMOUS_CLASS = SHIFT_EXPRESSION_CHILD___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIVE_EXPRESSION___GET_CONTAINING_CONCRETE_CLASSIFIER = SHIFT_EXPRESSION_CHILD___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIVE_EXPRESSION___GET_CONTAINING_COMPILATION_UNIT = SHIFT_EXPRESSION_CHILD___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIVE_EXPRESSION___GET_CONTAINING_PACKAGE_NAME = SHIFT_EXPRESSION_CHILD___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIVE_EXPRESSION___GET_CONTAINING_CONTAINER_NAME = SHIFT_EXPRESSION_CHILD___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIVE_EXPRESSION___GET_PARENT_CONCRETE_CLASSIFIER = SHIFT_EXPRESSION_CHILD___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIVE_EXPRESSION___GET_PARENT_BY_ETYPE__ECLASS = SHIFT_EXPRESSION_CHILD___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIVE_EXPRESSION___GET_FIRST_CHILD_BY_ETYPE__ECLASS = SHIFT_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIVE_EXPRESSION___GET_PARENT_BY_TYPE__CLASS = SHIFT_EXPRESSION_CHILD___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIVE_EXPRESSION___GET_FIRST_CHILD_BY_TYPE__CLASS = SHIFT_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIVE_EXPRESSION___GET_CHILDREN_BY_ETYPE__ECLASS = SHIFT_EXPRESSION_CHILD___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIVE_EXPRESSION___GET_CHILDREN_BY_TYPE__CLASS = SHIFT_EXPRESSION_CHILD___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIVE_EXPRESSION___GET_COMMENTS = SHIFT_EXPRESSION_CHILD___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIVE_EXPRESSION___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = SHIFT_EXPRESSION_CHILD___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIVE_EXPRESSION___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = SHIFT_EXPRESSION_CHILD___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIVE_EXPRESSION___GET_TYPE = SHIFT_EXPRESSION_CHILD___GET_TYPE;

    /**
     * The operation id for the '<em>Get Alternative Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIVE_EXPRESSION___GET_ALTERNATIVE_TYPE = SHIFT_EXPRESSION_CHILD___GET_ALTERNATIVE_TYPE;

    /**
     * The operation id for the '<em>Get One Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIVE_EXPRESSION___GET_ONE_TYPE__BOOLEAN = SHIFT_EXPRESSION_CHILD___GET_ONE_TYPE__BOOLEAN;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIVE_EXPRESSION___GET_ARRAY_DIMENSION = SHIFT_EXPRESSION_CHILD___GET_ARRAY_DIMENSION;

    /**
     * The number of operations of the '<em>Additive Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIVE_EXPRESSION_OPERATION_COUNT = SHIFT_EXPRESSION_CHILD_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.AdditiveExpressionChildImpl <em>Additive Expression Child</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.AdditiveExpressionChildImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getAdditiveExpressionChild()
     * @generated
     */
    int ADDITIVE_EXPRESSION_CHILD = 25;

    /**
     * The number of structural features of the '<em>Additive Expression Child</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIVE_EXPRESSION_CHILD_FEATURE_COUNT = SHIFT_EXPRESSION_CHILD_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIVE_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER__STRING = SHIFT_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIVE_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXY__STRING = SHIFT_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIVE_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIERS__STRING_STRING = SHIFT_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIVE_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = SHIFT_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIVE_EXPRESSION_CHILD___GET_LIB_CLASS__STRING = SHIFT_EXPRESSION_CHILD___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIVE_EXPRESSION_CHILD___GET_LIB_INTERFACE__STRING = SHIFT_EXPRESSION_CHILD___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIVE_EXPRESSION_CHILD___GET_CLASS_CLASS = SHIFT_EXPRESSION_CHILD___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIVE_EXPRESSION_CHILD___GET_OBJECT_CLASS = SHIFT_EXPRESSION_CHILD___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIVE_EXPRESSION_CHILD___GET_STRING_CLASS = SHIFT_EXPRESSION_CHILD___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIVE_EXPRESSION_CHILD___GET_ANNOTATION_INTERFACE = SHIFT_EXPRESSION_CHILD___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIVE_EXPRESSION_CHILD___GET_CONTAINING_ANNOTATION_INSTANCE = SHIFT_EXPRESSION_CHILD___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIVE_EXPRESSION_CHILD___GET_CONTAINING_ANONYMOUS_CLASS = SHIFT_EXPRESSION_CHILD___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIVE_EXPRESSION_CHILD___GET_CONTAINING_CONCRETE_CLASSIFIER = SHIFT_EXPRESSION_CHILD___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIVE_EXPRESSION_CHILD___GET_CONTAINING_COMPILATION_UNIT = SHIFT_EXPRESSION_CHILD___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIVE_EXPRESSION_CHILD___GET_CONTAINING_PACKAGE_NAME = SHIFT_EXPRESSION_CHILD___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIVE_EXPRESSION_CHILD___GET_CONTAINING_CONTAINER_NAME = SHIFT_EXPRESSION_CHILD___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIVE_EXPRESSION_CHILD___GET_PARENT_CONCRETE_CLASSIFIER = SHIFT_EXPRESSION_CHILD___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIVE_EXPRESSION_CHILD___GET_PARENT_BY_ETYPE__ECLASS = SHIFT_EXPRESSION_CHILD___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIVE_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_ETYPE__ECLASS = SHIFT_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIVE_EXPRESSION_CHILD___GET_PARENT_BY_TYPE__CLASS = SHIFT_EXPRESSION_CHILD___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIVE_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_TYPE__CLASS = SHIFT_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIVE_EXPRESSION_CHILD___GET_CHILDREN_BY_ETYPE__ECLASS = SHIFT_EXPRESSION_CHILD___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIVE_EXPRESSION_CHILD___GET_CHILDREN_BY_TYPE__CLASS = SHIFT_EXPRESSION_CHILD___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIVE_EXPRESSION_CHILD___GET_COMMENTS = SHIFT_EXPRESSION_CHILD___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIVE_EXPRESSION_CHILD___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = SHIFT_EXPRESSION_CHILD___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIVE_EXPRESSION_CHILD___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = SHIFT_EXPRESSION_CHILD___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIVE_EXPRESSION_CHILD___GET_TYPE = SHIFT_EXPRESSION_CHILD___GET_TYPE;

    /**
     * The operation id for the '<em>Get Alternative Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIVE_EXPRESSION_CHILD___GET_ALTERNATIVE_TYPE = SHIFT_EXPRESSION_CHILD___GET_ALTERNATIVE_TYPE;

    /**
     * The operation id for the '<em>Get One Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIVE_EXPRESSION_CHILD___GET_ONE_TYPE__BOOLEAN = SHIFT_EXPRESSION_CHILD___GET_ONE_TYPE__BOOLEAN;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIVE_EXPRESSION_CHILD___GET_ARRAY_DIMENSION = SHIFT_EXPRESSION_CHILD___GET_ARRAY_DIMENSION;

    /**
     * The number of operations of the '<em>Additive Expression Child</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIVE_EXPRESSION_CHILD_OPERATION_COUNT = SHIFT_EXPRESSION_CHILD_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.MultiplicativeExpressionImpl <em>Multiplicative Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.MultiplicativeExpressionImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getMultiplicativeExpression()
     * @generated
     */
    int MULTIPLICATIVE_EXPRESSION = 26;

    /**
     * The feature id for the '<em><b>Children</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICATIVE_EXPRESSION__CHILDREN = ADDITIVE_EXPRESSION_CHILD_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Multiplicative Operators</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICATIVE_EXPRESSION__MULTIPLICATIVE_OPERATORS = ADDITIVE_EXPRESSION_CHILD_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Multiplicative Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICATIVE_EXPRESSION_FEATURE_COUNT = ADDITIVE_EXPRESSION_CHILD_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICATIVE_EXPRESSION___GET_CONCRETE_CLASSIFIER__STRING = ADDITIVE_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICATIVE_EXPRESSION___GET_CONCRETE_CLASSIFIER_PROXY__STRING = ADDITIVE_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICATIVE_EXPRESSION___GET_CONCRETE_CLASSIFIERS__STRING_STRING = ADDITIVE_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICATIVE_EXPRESSION___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = ADDITIVE_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICATIVE_EXPRESSION___GET_LIB_CLASS__STRING = ADDITIVE_EXPRESSION_CHILD___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICATIVE_EXPRESSION___GET_LIB_INTERFACE__STRING = ADDITIVE_EXPRESSION_CHILD___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICATIVE_EXPRESSION___GET_CLASS_CLASS = ADDITIVE_EXPRESSION_CHILD___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICATIVE_EXPRESSION___GET_OBJECT_CLASS = ADDITIVE_EXPRESSION_CHILD___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICATIVE_EXPRESSION___GET_STRING_CLASS = ADDITIVE_EXPRESSION_CHILD___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICATIVE_EXPRESSION___GET_ANNOTATION_INTERFACE = ADDITIVE_EXPRESSION_CHILD___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICATIVE_EXPRESSION___GET_CONTAINING_ANNOTATION_INSTANCE = ADDITIVE_EXPRESSION_CHILD___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICATIVE_EXPRESSION___GET_CONTAINING_ANONYMOUS_CLASS = ADDITIVE_EXPRESSION_CHILD___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICATIVE_EXPRESSION___GET_CONTAINING_CONCRETE_CLASSIFIER = ADDITIVE_EXPRESSION_CHILD___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICATIVE_EXPRESSION___GET_CONTAINING_COMPILATION_UNIT = ADDITIVE_EXPRESSION_CHILD___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICATIVE_EXPRESSION___GET_CONTAINING_PACKAGE_NAME = ADDITIVE_EXPRESSION_CHILD___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICATIVE_EXPRESSION___GET_CONTAINING_CONTAINER_NAME = ADDITIVE_EXPRESSION_CHILD___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICATIVE_EXPRESSION___GET_PARENT_CONCRETE_CLASSIFIER = ADDITIVE_EXPRESSION_CHILD___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICATIVE_EXPRESSION___GET_PARENT_BY_ETYPE__ECLASS = ADDITIVE_EXPRESSION_CHILD___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICATIVE_EXPRESSION___GET_FIRST_CHILD_BY_ETYPE__ECLASS = ADDITIVE_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICATIVE_EXPRESSION___GET_PARENT_BY_TYPE__CLASS = ADDITIVE_EXPRESSION_CHILD___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICATIVE_EXPRESSION___GET_FIRST_CHILD_BY_TYPE__CLASS = ADDITIVE_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICATIVE_EXPRESSION___GET_CHILDREN_BY_ETYPE__ECLASS = ADDITIVE_EXPRESSION_CHILD___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICATIVE_EXPRESSION___GET_CHILDREN_BY_TYPE__CLASS = ADDITIVE_EXPRESSION_CHILD___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICATIVE_EXPRESSION___GET_COMMENTS = ADDITIVE_EXPRESSION_CHILD___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICATIVE_EXPRESSION___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = ADDITIVE_EXPRESSION_CHILD___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICATIVE_EXPRESSION___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = ADDITIVE_EXPRESSION_CHILD___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICATIVE_EXPRESSION___GET_TYPE = ADDITIVE_EXPRESSION_CHILD___GET_TYPE;

    /**
     * The operation id for the '<em>Get Alternative Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICATIVE_EXPRESSION___GET_ALTERNATIVE_TYPE = ADDITIVE_EXPRESSION_CHILD___GET_ALTERNATIVE_TYPE;

    /**
     * The operation id for the '<em>Get One Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICATIVE_EXPRESSION___GET_ONE_TYPE__BOOLEAN = ADDITIVE_EXPRESSION_CHILD___GET_ONE_TYPE__BOOLEAN;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICATIVE_EXPRESSION___GET_ARRAY_DIMENSION = ADDITIVE_EXPRESSION_CHILD___GET_ARRAY_DIMENSION;

    /**
     * The number of operations of the '<em>Multiplicative Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICATIVE_EXPRESSION_OPERATION_COUNT = ADDITIVE_EXPRESSION_CHILD_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.MultiplicativeExpressionChildImpl <em>Multiplicative Expression Child</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.MultiplicativeExpressionChildImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getMultiplicativeExpressionChild()
     * @generated
     */
    int MULTIPLICATIVE_EXPRESSION_CHILD = 27;

    /**
     * The number of structural features of the '<em>Multiplicative Expression Child</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICATIVE_EXPRESSION_CHILD_FEATURE_COUNT = ADDITIVE_EXPRESSION_CHILD_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICATIVE_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER__STRING = ADDITIVE_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICATIVE_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXY__STRING = ADDITIVE_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICATIVE_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIERS__STRING_STRING = ADDITIVE_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICATIVE_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = ADDITIVE_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICATIVE_EXPRESSION_CHILD___GET_LIB_CLASS__STRING = ADDITIVE_EXPRESSION_CHILD___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICATIVE_EXPRESSION_CHILD___GET_LIB_INTERFACE__STRING = ADDITIVE_EXPRESSION_CHILD___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICATIVE_EXPRESSION_CHILD___GET_CLASS_CLASS = ADDITIVE_EXPRESSION_CHILD___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICATIVE_EXPRESSION_CHILD___GET_OBJECT_CLASS = ADDITIVE_EXPRESSION_CHILD___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICATIVE_EXPRESSION_CHILD___GET_STRING_CLASS = ADDITIVE_EXPRESSION_CHILD___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICATIVE_EXPRESSION_CHILD___GET_ANNOTATION_INTERFACE = ADDITIVE_EXPRESSION_CHILD___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICATIVE_EXPRESSION_CHILD___GET_CONTAINING_ANNOTATION_INSTANCE = ADDITIVE_EXPRESSION_CHILD___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICATIVE_EXPRESSION_CHILD___GET_CONTAINING_ANONYMOUS_CLASS = ADDITIVE_EXPRESSION_CHILD___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICATIVE_EXPRESSION_CHILD___GET_CONTAINING_CONCRETE_CLASSIFIER = ADDITIVE_EXPRESSION_CHILD___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICATIVE_EXPRESSION_CHILD___GET_CONTAINING_COMPILATION_UNIT = ADDITIVE_EXPRESSION_CHILD___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICATIVE_EXPRESSION_CHILD___GET_CONTAINING_PACKAGE_NAME = ADDITIVE_EXPRESSION_CHILD___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICATIVE_EXPRESSION_CHILD___GET_CONTAINING_CONTAINER_NAME = ADDITIVE_EXPRESSION_CHILD___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICATIVE_EXPRESSION_CHILD___GET_PARENT_CONCRETE_CLASSIFIER = ADDITIVE_EXPRESSION_CHILD___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICATIVE_EXPRESSION_CHILD___GET_PARENT_BY_ETYPE__ECLASS = ADDITIVE_EXPRESSION_CHILD___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICATIVE_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_ETYPE__ECLASS = ADDITIVE_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICATIVE_EXPRESSION_CHILD___GET_PARENT_BY_TYPE__CLASS = ADDITIVE_EXPRESSION_CHILD___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICATIVE_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_TYPE__CLASS = ADDITIVE_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICATIVE_EXPRESSION_CHILD___GET_CHILDREN_BY_ETYPE__ECLASS = ADDITIVE_EXPRESSION_CHILD___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICATIVE_EXPRESSION_CHILD___GET_CHILDREN_BY_TYPE__CLASS = ADDITIVE_EXPRESSION_CHILD___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICATIVE_EXPRESSION_CHILD___GET_COMMENTS = ADDITIVE_EXPRESSION_CHILD___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICATIVE_EXPRESSION_CHILD___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = ADDITIVE_EXPRESSION_CHILD___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICATIVE_EXPRESSION_CHILD___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = ADDITIVE_EXPRESSION_CHILD___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICATIVE_EXPRESSION_CHILD___GET_TYPE = ADDITIVE_EXPRESSION_CHILD___GET_TYPE;

    /**
     * The operation id for the '<em>Get Alternative Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICATIVE_EXPRESSION_CHILD___GET_ALTERNATIVE_TYPE = ADDITIVE_EXPRESSION_CHILD___GET_ALTERNATIVE_TYPE;

    /**
     * The operation id for the '<em>Get One Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICATIVE_EXPRESSION_CHILD___GET_ONE_TYPE__BOOLEAN = ADDITIVE_EXPRESSION_CHILD___GET_ONE_TYPE__BOOLEAN;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICATIVE_EXPRESSION_CHILD___GET_ARRAY_DIMENSION = ADDITIVE_EXPRESSION_CHILD___GET_ARRAY_DIMENSION;

    /**
     * The number of operations of the '<em>Multiplicative Expression Child</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICATIVE_EXPRESSION_CHILD_OPERATION_COUNT = ADDITIVE_EXPRESSION_CHILD_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.UnaryExpressionImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getUnaryExpression()
     * @generated
     */
    int UNARY_EXPRESSION = 28;

    /**
     * The feature id for the '<em><b>Operators</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPRESSION__OPERATORS = MULTIPLICATIVE_EXPRESSION_CHILD_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Child</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPRESSION__CHILD = MULTIPLICATIVE_EXPRESSION_CHILD_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Unary Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPRESSION_FEATURE_COUNT = MULTIPLICATIVE_EXPRESSION_CHILD_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPRESSION___GET_CONCRETE_CLASSIFIER__STRING = MULTIPLICATIVE_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPRESSION___GET_CONCRETE_CLASSIFIER_PROXY__STRING = MULTIPLICATIVE_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPRESSION___GET_CONCRETE_CLASSIFIERS__STRING_STRING = MULTIPLICATIVE_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPRESSION___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = MULTIPLICATIVE_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPRESSION___GET_LIB_CLASS__STRING = MULTIPLICATIVE_EXPRESSION_CHILD___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPRESSION___GET_LIB_INTERFACE__STRING = MULTIPLICATIVE_EXPRESSION_CHILD___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPRESSION___GET_CLASS_CLASS = MULTIPLICATIVE_EXPRESSION_CHILD___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPRESSION___GET_OBJECT_CLASS = MULTIPLICATIVE_EXPRESSION_CHILD___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPRESSION___GET_STRING_CLASS = MULTIPLICATIVE_EXPRESSION_CHILD___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPRESSION___GET_ANNOTATION_INTERFACE = MULTIPLICATIVE_EXPRESSION_CHILD___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPRESSION___GET_CONTAINING_ANNOTATION_INSTANCE = MULTIPLICATIVE_EXPRESSION_CHILD___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPRESSION___GET_CONTAINING_ANONYMOUS_CLASS = MULTIPLICATIVE_EXPRESSION_CHILD___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPRESSION___GET_CONTAINING_CONCRETE_CLASSIFIER = MULTIPLICATIVE_EXPRESSION_CHILD___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPRESSION___GET_CONTAINING_COMPILATION_UNIT = MULTIPLICATIVE_EXPRESSION_CHILD___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPRESSION___GET_CONTAINING_PACKAGE_NAME = MULTIPLICATIVE_EXPRESSION_CHILD___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPRESSION___GET_CONTAINING_CONTAINER_NAME = MULTIPLICATIVE_EXPRESSION_CHILD___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPRESSION___GET_PARENT_CONCRETE_CLASSIFIER = MULTIPLICATIVE_EXPRESSION_CHILD___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPRESSION___GET_PARENT_BY_ETYPE__ECLASS = MULTIPLICATIVE_EXPRESSION_CHILD___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPRESSION___GET_FIRST_CHILD_BY_ETYPE__ECLASS = MULTIPLICATIVE_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPRESSION___GET_PARENT_BY_TYPE__CLASS = MULTIPLICATIVE_EXPRESSION_CHILD___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPRESSION___GET_FIRST_CHILD_BY_TYPE__CLASS = MULTIPLICATIVE_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPRESSION___GET_CHILDREN_BY_ETYPE__ECLASS = MULTIPLICATIVE_EXPRESSION_CHILD___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPRESSION___GET_CHILDREN_BY_TYPE__CLASS = MULTIPLICATIVE_EXPRESSION_CHILD___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPRESSION___GET_COMMENTS = MULTIPLICATIVE_EXPRESSION_CHILD___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPRESSION___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = MULTIPLICATIVE_EXPRESSION_CHILD___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPRESSION___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = MULTIPLICATIVE_EXPRESSION_CHILD___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPRESSION___GET_TYPE = MULTIPLICATIVE_EXPRESSION_CHILD___GET_TYPE;

    /**
     * The operation id for the '<em>Get Alternative Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPRESSION___GET_ALTERNATIVE_TYPE = MULTIPLICATIVE_EXPRESSION_CHILD___GET_ALTERNATIVE_TYPE;

    /**
     * The operation id for the '<em>Get One Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPRESSION___GET_ONE_TYPE__BOOLEAN = MULTIPLICATIVE_EXPRESSION_CHILD___GET_ONE_TYPE__BOOLEAN;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPRESSION___GET_ARRAY_DIMENSION = MULTIPLICATIVE_EXPRESSION_CHILD___GET_ARRAY_DIMENSION;

    /**
     * The number of operations of the '<em>Unary Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPRESSION_OPERATION_COUNT = MULTIPLICATIVE_EXPRESSION_CHILD_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.UnaryExpressionChildImpl <em>Unary Expression Child</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.UnaryExpressionChildImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getUnaryExpressionChild()
     * @generated
     */
    int UNARY_EXPRESSION_CHILD = 29;

    /**
     * The number of structural features of the '<em>Unary Expression Child</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPRESSION_CHILD_FEATURE_COUNT = MULTIPLICATIVE_EXPRESSION_CHILD_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER__STRING = MULTIPLICATIVE_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXY__STRING = MULTIPLICATIVE_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIERS__STRING_STRING = MULTIPLICATIVE_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = MULTIPLICATIVE_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPRESSION_CHILD___GET_LIB_CLASS__STRING = MULTIPLICATIVE_EXPRESSION_CHILD___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPRESSION_CHILD___GET_LIB_INTERFACE__STRING = MULTIPLICATIVE_EXPRESSION_CHILD___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPRESSION_CHILD___GET_CLASS_CLASS = MULTIPLICATIVE_EXPRESSION_CHILD___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPRESSION_CHILD___GET_OBJECT_CLASS = MULTIPLICATIVE_EXPRESSION_CHILD___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPRESSION_CHILD___GET_STRING_CLASS = MULTIPLICATIVE_EXPRESSION_CHILD___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPRESSION_CHILD___GET_ANNOTATION_INTERFACE = MULTIPLICATIVE_EXPRESSION_CHILD___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPRESSION_CHILD___GET_CONTAINING_ANNOTATION_INSTANCE = MULTIPLICATIVE_EXPRESSION_CHILD___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPRESSION_CHILD___GET_CONTAINING_ANONYMOUS_CLASS = MULTIPLICATIVE_EXPRESSION_CHILD___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPRESSION_CHILD___GET_CONTAINING_CONCRETE_CLASSIFIER = MULTIPLICATIVE_EXPRESSION_CHILD___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPRESSION_CHILD___GET_CONTAINING_COMPILATION_UNIT = MULTIPLICATIVE_EXPRESSION_CHILD___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPRESSION_CHILD___GET_CONTAINING_PACKAGE_NAME = MULTIPLICATIVE_EXPRESSION_CHILD___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPRESSION_CHILD___GET_CONTAINING_CONTAINER_NAME = MULTIPLICATIVE_EXPRESSION_CHILD___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPRESSION_CHILD___GET_PARENT_CONCRETE_CLASSIFIER = MULTIPLICATIVE_EXPRESSION_CHILD___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPRESSION_CHILD___GET_PARENT_BY_ETYPE__ECLASS = MULTIPLICATIVE_EXPRESSION_CHILD___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_ETYPE__ECLASS = MULTIPLICATIVE_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPRESSION_CHILD___GET_PARENT_BY_TYPE__CLASS = MULTIPLICATIVE_EXPRESSION_CHILD___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_TYPE__CLASS = MULTIPLICATIVE_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPRESSION_CHILD___GET_CHILDREN_BY_ETYPE__ECLASS = MULTIPLICATIVE_EXPRESSION_CHILD___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPRESSION_CHILD___GET_CHILDREN_BY_TYPE__CLASS = MULTIPLICATIVE_EXPRESSION_CHILD___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPRESSION_CHILD___GET_COMMENTS = MULTIPLICATIVE_EXPRESSION_CHILD___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPRESSION_CHILD___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = MULTIPLICATIVE_EXPRESSION_CHILD___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPRESSION_CHILD___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = MULTIPLICATIVE_EXPRESSION_CHILD___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPRESSION_CHILD___GET_TYPE = MULTIPLICATIVE_EXPRESSION_CHILD___GET_TYPE;

    /**
     * The operation id for the '<em>Get Alternative Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPRESSION_CHILD___GET_ALTERNATIVE_TYPE = MULTIPLICATIVE_EXPRESSION_CHILD___GET_ALTERNATIVE_TYPE;

    /**
     * The operation id for the '<em>Get One Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPRESSION_CHILD___GET_ONE_TYPE__BOOLEAN = MULTIPLICATIVE_EXPRESSION_CHILD___GET_ONE_TYPE__BOOLEAN;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPRESSION_CHILD___GET_ARRAY_DIMENSION = MULTIPLICATIVE_EXPRESSION_CHILD___GET_ARRAY_DIMENSION;

    /**
     * The number of operations of the '<em>Unary Expression Child</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_EXPRESSION_CHILD_OPERATION_COUNT = MULTIPLICATIVE_EXPRESSION_CHILD_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.UnaryModificationExpressionImpl <em>Unary Modification Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.UnaryModificationExpressionImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getUnaryModificationExpression()
     * @generated
     */
    int UNARY_MODIFICATION_EXPRESSION = 30;

    /**
     * The feature id for the '<em><b>Child</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_MODIFICATION_EXPRESSION__CHILD = UNARY_EXPRESSION_CHILD_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Operator</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_MODIFICATION_EXPRESSION__OPERATOR = UNARY_EXPRESSION_CHILD_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Unary Modification Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_MODIFICATION_EXPRESSION_FEATURE_COUNT = UNARY_EXPRESSION_CHILD_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_MODIFICATION_EXPRESSION___GET_CONCRETE_CLASSIFIER__STRING = UNARY_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_MODIFICATION_EXPRESSION___GET_CONCRETE_CLASSIFIER_PROXY__STRING = UNARY_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_MODIFICATION_EXPRESSION___GET_CONCRETE_CLASSIFIERS__STRING_STRING = UNARY_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_MODIFICATION_EXPRESSION___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = UNARY_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_MODIFICATION_EXPRESSION___GET_LIB_CLASS__STRING = UNARY_EXPRESSION_CHILD___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_MODIFICATION_EXPRESSION___GET_LIB_INTERFACE__STRING = UNARY_EXPRESSION_CHILD___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_MODIFICATION_EXPRESSION___GET_CLASS_CLASS = UNARY_EXPRESSION_CHILD___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_MODIFICATION_EXPRESSION___GET_OBJECT_CLASS = UNARY_EXPRESSION_CHILD___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_MODIFICATION_EXPRESSION___GET_STRING_CLASS = UNARY_EXPRESSION_CHILD___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_MODIFICATION_EXPRESSION___GET_ANNOTATION_INTERFACE = UNARY_EXPRESSION_CHILD___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_MODIFICATION_EXPRESSION___GET_CONTAINING_ANNOTATION_INSTANCE = UNARY_EXPRESSION_CHILD___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_MODIFICATION_EXPRESSION___GET_CONTAINING_ANONYMOUS_CLASS = UNARY_EXPRESSION_CHILD___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_MODIFICATION_EXPRESSION___GET_CONTAINING_CONCRETE_CLASSIFIER = UNARY_EXPRESSION_CHILD___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_MODIFICATION_EXPRESSION___GET_CONTAINING_COMPILATION_UNIT = UNARY_EXPRESSION_CHILD___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_MODIFICATION_EXPRESSION___GET_CONTAINING_PACKAGE_NAME = UNARY_EXPRESSION_CHILD___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_MODIFICATION_EXPRESSION___GET_CONTAINING_CONTAINER_NAME = UNARY_EXPRESSION_CHILD___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_MODIFICATION_EXPRESSION___GET_PARENT_CONCRETE_CLASSIFIER = UNARY_EXPRESSION_CHILD___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_MODIFICATION_EXPRESSION___GET_PARENT_BY_ETYPE__ECLASS = UNARY_EXPRESSION_CHILD___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_MODIFICATION_EXPRESSION___GET_FIRST_CHILD_BY_ETYPE__ECLASS = UNARY_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_MODIFICATION_EXPRESSION___GET_PARENT_BY_TYPE__CLASS = UNARY_EXPRESSION_CHILD___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_MODIFICATION_EXPRESSION___GET_FIRST_CHILD_BY_TYPE__CLASS = UNARY_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_MODIFICATION_EXPRESSION___GET_CHILDREN_BY_ETYPE__ECLASS = UNARY_EXPRESSION_CHILD___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_MODIFICATION_EXPRESSION___GET_CHILDREN_BY_TYPE__CLASS = UNARY_EXPRESSION_CHILD___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_MODIFICATION_EXPRESSION___GET_COMMENTS = UNARY_EXPRESSION_CHILD___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_MODIFICATION_EXPRESSION___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = UNARY_EXPRESSION_CHILD___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_MODIFICATION_EXPRESSION___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = UNARY_EXPRESSION_CHILD___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_MODIFICATION_EXPRESSION___GET_TYPE = UNARY_EXPRESSION_CHILD___GET_TYPE;

    /**
     * The operation id for the '<em>Get Alternative Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_MODIFICATION_EXPRESSION___GET_ALTERNATIVE_TYPE = UNARY_EXPRESSION_CHILD___GET_ALTERNATIVE_TYPE;

    /**
     * The operation id for the '<em>Get One Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_MODIFICATION_EXPRESSION___GET_ONE_TYPE__BOOLEAN = UNARY_EXPRESSION_CHILD___GET_ONE_TYPE__BOOLEAN;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_MODIFICATION_EXPRESSION___GET_ARRAY_DIMENSION = UNARY_EXPRESSION_CHILD___GET_ARRAY_DIMENSION;

    /**
     * The number of operations of the '<em>Unary Modification Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_MODIFICATION_EXPRESSION_OPERATION_COUNT = UNARY_EXPRESSION_CHILD_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.PrefixUnaryModificationExpressionImpl <em>Prefix Unary Modification Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.PrefixUnaryModificationExpressionImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getPrefixUnaryModificationExpression()
     * @generated
     */
    int PREFIX_UNARY_MODIFICATION_EXPRESSION = 31;

    /**
     * The feature id for the '<em><b>Child</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PREFIX_UNARY_MODIFICATION_EXPRESSION__CHILD = UNARY_MODIFICATION_EXPRESSION__CHILD;

    /**
     * The feature id for the '<em><b>Operator</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PREFIX_UNARY_MODIFICATION_EXPRESSION__OPERATOR = UNARY_MODIFICATION_EXPRESSION__OPERATOR;

    /**
     * The number of structural features of the '<em>Prefix Unary Modification Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PREFIX_UNARY_MODIFICATION_EXPRESSION_FEATURE_COUNT = UNARY_MODIFICATION_EXPRESSION_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PREFIX_UNARY_MODIFICATION_EXPRESSION___GET_CONCRETE_CLASSIFIER__STRING = UNARY_MODIFICATION_EXPRESSION___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PREFIX_UNARY_MODIFICATION_EXPRESSION___GET_CONCRETE_CLASSIFIER_PROXY__STRING = UNARY_MODIFICATION_EXPRESSION___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PREFIX_UNARY_MODIFICATION_EXPRESSION___GET_CONCRETE_CLASSIFIERS__STRING_STRING = UNARY_MODIFICATION_EXPRESSION___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PREFIX_UNARY_MODIFICATION_EXPRESSION___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = UNARY_MODIFICATION_EXPRESSION___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PREFIX_UNARY_MODIFICATION_EXPRESSION___GET_LIB_CLASS__STRING = UNARY_MODIFICATION_EXPRESSION___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PREFIX_UNARY_MODIFICATION_EXPRESSION___GET_LIB_INTERFACE__STRING = UNARY_MODIFICATION_EXPRESSION___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PREFIX_UNARY_MODIFICATION_EXPRESSION___GET_CLASS_CLASS = UNARY_MODIFICATION_EXPRESSION___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PREFIX_UNARY_MODIFICATION_EXPRESSION___GET_OBJECT_CLASS = UNARY_MODIFICATION_EXPRESSION___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PREFIX_UNARY_MODIFICATION_EXPRESSION___GET_STRING_CLASS = UNARY_MODIFICATION_EXPRESSION___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PREFIX_UNARY_MODIFICATION_EXPRESSION___GET_ANNOTATION_INTERFACE = UNARY_MODIFICATION_EXPRESSION___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PREFIX_UNARY_MODIFICATION_EXPRESSION___GET_CONTAINING_ANNOTATION_INSTANCE = UNARY_MODIFICATION_EXPRESSION___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PREFIX_UNARY_MODIFICATION_EXPRESSION___GET_CONTAINING_ANONYMOUS_CLASS = UNARY_MODIFICATION_EXPRESSION___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PREFIX_UNARY_MODIFICATION_EXPRESSION___GET_CONTAINING_CONCRETE_CLASSIFIER = UNARY_MODIFICATION_EXPRESSION___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PREFIX_UNARY_MODIFICATION_EXPRESSION___GET_CONTAINING_COMPILATION_UNIT = UNARY_MODIFICATION_EXPRESSION___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PREFIX_UNARY_MODIFICATION_EXPRESSION___GET_CONTAINING_PACKAGE_NAME = UNARY_MODIFICATION_EXPRESSION___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PREFIX_UNARY_MODIFICATION_EXPRESSION___GET_CONTAINING_CONTAINER_NAME = UNARY_MODIFICATION_EXPRESSION___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PREFIX_UNARY_MODIFICATION_EXPRESSION___GET_PARENT_CONCRETE_CLASSIFIER = UNARY_MODIFICATION_EXPRESSION___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PREFIX_UNARY_MODIFICATION_EXPRESSION___GET_PARENT_BY_ETYPE__ECLASS = UNARY_MODIFICATION_EXPRESSION___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PREFIX_UNARY_MODIFICATION_EXPRESSION___GET_FIRST_CHILD_BY_ETYPE__ECLASS = UNARY_MODIFICATION_EXPRESSION___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PREFIX_UNARY_MODIFICATION_EXPRESSION___GET_PARENT_BY_TYPE__CLASS = UNARY_MODIFICATION_EXPRESSION___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PREFIX_UNARY_MODIFICATION_EXPRESSION___GET_FIRST_CHILD_BY_TYPE__CLASS = UNARY_MODIFICATION_EXPRESSION___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PREFIX_UNARY_MODIFICATION_EXPRESSION___GET_CHILDREN_BY_ETYPE__ECLASS = UNARY_MODIFICATION_EXPRESSION___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PREFIX_UNARY_MODIFICATION_EXPRESSION___GET_CHILDREN_BY_TYPE__CLASS = UNARY_MODIFICATION_EXPRESSION___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PREFIX_UNARY_MODIFICATION_EXPRESSION___GET_COMMENTS = UNARY_MODIFICATION_EXPRESSION___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PREFIX_UNARY_MODIFICATION_EXPRESSION___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = UNARY_MODIFICATION_EXPRESSION___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PREFIX_UNARY_MODIFICATION_EXPRESSION___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = UNARY_MODIFICATION_EXPRESSION___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PREFIX_UNARY_MODIFICATION_EXPRESSION___GET_TYPE = UNARY_MODIFICATION_EXPRESSION___GET_TYPE;

    /**
     * The operation id for the '<em>Get Alternative Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PREFIX_UNARY_MODIFICATION_EXPRESSION___GET_ALTERNATIVE_TYPE = UNARY_MODIFICATION_EXPRESSION___GET_ALTERNATIVE_TYPE;

    /**
     * The operation id for the '<em>Get One Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PREFIX_UNARY_MODIFICATION_EXPRESSION___GET_ONE_TYPE__BOOLEAN = UNARY_MODIFICATION_EXPRESSION___GET_ONE_TYPE__BOOLEAN;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PREFIX_UNARY_MODIFICATION_EXPRESSION___GET_ARRAY_DIMENSION = UNARY_MODIFICATION_EXPRESSION___GET_ARRAY_DIMENSION;

    /**
     * The number of operations of the '<em>Prefix Unary Modification Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PREFIX_UNARY_MODIFICATION_EXPRESSION_OPERATION_COUNT = UNARY_MODIFICATION_EXPRESSION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.SuffixUnaryModificationExpressionImpl <em>Suffix Unary Modification Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.SuffixUnaryModificationExpressionImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getSuffixUnaryModificationExpression()
     * @generated
     */
    int SUFFIX_UNARY_MODIFICATION_EXPRESSION = 32;

    /**
     * The feature id for the '<em><b>Child</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUFFIX_UNARY_MODIFICATION_EXPRESSION__CHILD = UNARY_MODIFICATION_EXPRESSION__CHILD;

    /**
     * The feature id for the '<em><b>Operator</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUFFIX_UNARY_MODIFICATION_EXPRESSION__OPERATOR = UNARY_MODIFICATION_EXPRESSION__OPERATOR;

    /**
     * The number of structural features of the '<em>Suffix Unary Modification Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUFFIX_UNARY_MODIFICATION_EXPRESSION_FEATURE_COUNT = UNARY_MODIFICATION_EXPRESSION_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUFFIX_UNARY_MODIFICATION_EXPRESSION___GET_CONCRETE_CLASSIFIER__STRING = UNARY_MODIFICATION_EXPRESSION___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUFFIX_UNARY_MODIFICATION_EXPRESSION___GET_CONCRETE_CLASSIFIER_PROXY__STRING = UNARY_MODIFICATION_EXPRESSION___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUFFIX_UNARY_MODIFICATION_EXPRESSION___GET_CONCRETE_CLASSIFIERS__STRING_STRING = UNARY_MODIFICATION_EXPRESSION___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUFFIX_UNARY_MODIFICATION_EXPRESSION___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = UNARY_MODIFICATION_EXPRESSION___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUFFIX_UNARY_MODIFICATION_EXPRESSION___GET_LIB_CLASS__STRING = UNARY_MODIFICATION_EXPRESSION___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUFFIX_UNARY_MODIFICATION_EXPRESSION___GET_LIB_INTERFACE__STRING = UNARY_MODIFICATION_EXPRESSION___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUFFIX_UNARY_MODIFICATION_EXPRESSION___GET_CLASS_CLASS = UNARY_MODIFICATION_EXPRESSION___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUFFIX_UNARY_MODIFICATION_EXPRESSION___GET_OBJECT_CLASS = UNARY_MODIFICATION_EXPRESSION___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUFFIX_UNARY_MODIFICATION_EXPRESSION___GET_STRING_CLASS = UNARY_MODIFICATION_EXPRESSION___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUFFIX_UNARY_MODIFICATION_EXPRESSION___GET_ANNOTATION_INTERFACE = UNARY_MODIFICATION_EXPRESSION___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUFFIX_UNARY_MODIFICATION_EXPRESSION___GET_CONTAINING_ANNOTATION_INSTANCE = UNARY_MODIFICATION_EXPRESSION___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUFFIX_UNARY_MODIFICATION_EXPRESSION___GET_CONTAINING_ANONYMOUS_CLASS = UNARY_MODIFICATION_EXPRESSION___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUFFIX_UNARY_MODIFICATION_EXPRESSION___GET_CONTAINING_CONCRETE_CLASSIFIER = UNARY_MODIFICATION_EXPRESSION___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUFFIX_UNARY_MODIFICATION_EXPRESSION___GET_CONTAINING_COMPILATION_UNIT = UNARY_MODIFICATION_EXPRESSION___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUFFIX_UNARY_MODIFICATION_EXPRESSION___GET_CONTAINING_PACKAGE_NAME = UNARY_MODIFICATION_EXPRESSION___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUFFIX_UNARY_MODIFICATION_EXPRESSION___GET_CONTAINING_CONTAINER_NAME = UNARY_MODIFICATION_EXPRESSION___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUFFIX_UNARY_MODIFICATION_EXPRESSION___GET_PARENT_CONCRETE_CLASSIFIER = UNARY_MODIFICATION_EXPRESSION___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUFFIX_UNARY_MODIFICATION_EXPRESSION___GET_PARENT_BY_ETYPE__ECLASS = UNARY_MODIFICATION_EXPRESSION___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUFFIX_UNARY_MODIFICATION_EXPRESSION___GET_FIRST_CHILD_BY_ETYPE__ECLASS = UNARY_MODIFICATION_EXPRESSION___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUFFIX_UNARY_MODIFICATION_EXPRESSION___GET_PARENT_BY_TYPE__CLASS = UNARY_MODIFICATION_EXPRESSION___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUFFIX_UNARY_MODIFICATION_EXPRESSION___GET_FIRST_CHILD_BY_TYPE__CLASS = UNARY_MODIFICATION_EXPRESSION___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUFFIX_UNARY_MODIFICATION_EXPRESSION___GET_CHILDREN_BY_ETYPE__ECLASS = UNARY_MODIFICATION_EXPRESSION___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUFFIX_UNARY_MODIFICATION_EXPRESSION___GET_CHILDREN_BY_TYPE__CLASS = UNARY_MODIFICATION_EXPRESSION___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUFFIX_UNARY_MODIFICATION_EXPRESSION___GET_COMMENTS = UNARY_MODIFICATION_EXPRESSION___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUFFIX_UNARY_MODIFICATION_EXPRESSION___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = UNARY_MODIFICATION_EXPRESSION___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUFFIX_UNARY_MODIFICATION_EXPRESSION___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = UNARY_MODIFICATION_EXPRESSION___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUFFIX_UNARY_MODIFICATION_EXPRESSION___GET_TYPE = UNARY_MODIFICATION_EXPRESSION___GET_TYPE;

    /**
     * The operation id for the '<em>Get Alternative Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUFFIX_UNARY_MODIFICATION_EXPRESSION___GET_ALTERNATIVE_TYPE = UNARY_MODIFICATION_EXPRESSION___GET_ALTERNATIVE_TYPE;

    /**
     * The operation id for the '<em>Get One Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUFFIX_UNARY_MODIFICATION_EXPRESSION___GET_ONE_TYPE__BOOLEAN = UNARY_MODIFICATION_EXPRESSION___GET_ONE_TYPE__BOOLEAN;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUFFIX_UNARY_MODIFICATION_EXPRESSION___GET_ARRAY_DIMENSION = UNARY_MODIFICATION_EXPRESSION___GET_ARRAY_DIMENSION;

    /**
     * The number of operations of the '<em>Suffix Unary Modification Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUFFIX_UNARY_MODIFICATION_EXPRESSION_OPERATION_COUNT = UNARY_MODIFICATION_EXPRESSION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.UnaryModificationExpressionChildImpl <em>Unary Modification Expression Child</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.UnaryModificationExpressionChildImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getUnaryModificationExpressionChild()
     * @generated
     */
    int UNARY_MODIFICATION_EXPRESSION_CHILD = 33;

    /**
     * The number of structural features of the '<em>Unary Modification Expression Child</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_MODIFICATION_EXPRESSION_CHILD_FEATURE_COUNT = UNARY_EXPRESSION_CHILD_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_MODIFICATION_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER__STRING = UNARY_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_MODIFICATION_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXY__STRING = UNARY_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_MODIFICATION_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIERS__STRING_STRING = UNARY_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_MODIFICATION_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = UNARY_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_MODIFICATION_EXPRESSION_CHILD___GET_LIB_CLASS__STRING = UNARY_EXPRESSION_CHILD___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_MODIFICATION_EXPRESSION_CHILD___GET_LIB_INTERFACE__STRING = UNARY_EXPRESSION_CHILD___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_MODIFICATION_EXPRESSION_CHILD___GET_CLASS_CLASS = UNARY_EXPRESSION_CHILD___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_MODIFICATION_EXPRESSION_CHILD___GET_OBJECT_CLASS = UNARY_EXPRESSION_CHILD___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_MODIFICATION_EXPRESSION_CHILD___GET_STRING_CLASS = UNARY_EXPRESSION_CHILD___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_MODIFICATION_EXPRESSION_CHILD___GET_ANNOTATION_INTERFACE = UNARY_EXPRESSION_CHILD___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_MODIFICATION_EXPRESSION_CHILD___GET_CONTAINING_ANNOTATION_INSTANCE = UNARY_EXPRESSION_CHILD___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_MODIFICATION_EXPRESSION_CHILD___GET_CONTAINING_ANONYMOUS_CLASS = UNARY_EXPRESSION_CHILD___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_MODIFICATION_EXPRESSION_CHILD___GET_CONTAINING_CONCRETE_CLASSIFIER = UNARY_EXPRESSION_CHILD___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_MODIFICATION_EXPRESSION_CHILD___GET_CONTAINING_COMPILATION_UNIT = UNARY_EXPRESSION_CHILD___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_MODIFICATION_EXPRESSION_CHILD___GET_CONTAINING_PACKAGE_NAME = UNARY_EXPRESSION_CHILD___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_MODIFICATION_EXPRESSION_CHILD___GET_CONTAINING_CONTAINER_NAME = UNARY_EXPRESSION_CHILD___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_MODIFICATION_EXPRESSION_CHILD___GET_PARENT_CONCRETE_CLASSIFIER = UNARY_EXPRESSION_CHILD___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_MODIFICATION_EXPRESSION_CHILD___GET_PARENT_BY_ETYPE__ECLASS = UNARY_EXPRESSION_CHILD___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_MODIFICATION_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_ETYPE__ECLASS = UNARY_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_MODIFICATION_EXPRESSION_CHILD___GET_PARENT_BY_TYPE__CLASS = UNARY_EXPRESSION_CHILD___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_MODIFICATION_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_TYPE__CLASS = UNARY_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_MODIFICATION_EXPRESSION_CHILD___GET_CHILDREN_BY_ETYPE__ECLASS = UNARY_EXPRESSION_CHILD___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_MODIFICATION_EXPRESSION_CHILD___GET_CHILDREN_BY_TYPE__CLASS = UNARY_EXPRESSION_CHILD___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_MODIFICATION_EXPRESSION_CHILD___GET_COMMENTS = UNARY_EXPRESSION_CHILD___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_MODIFICATION_EXPRESSION_CHILD___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = UNARY_EXPRESSION_CHILD___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_MODIFICATION_EXPRESSION_CHILD___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = UNARY_EXPRESSION_CHILD___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_MODIFICATION_EXPRESSION_CHILD___GET_TYPE = UNARY_EXPRESSION_CHILD___GET_TYPE;

    /**
     * The operation id for the '<em>Get Alternative Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_MODIFICATION_EXPRESSION_CHILD___GET_ALTERNATIVE_TYPE = UNARY_EXPRESSION_CHILD___GET_ALTERNATIVE_TYPE;

    /**
     * The operation id for the '<em>Get One Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_MODIFICATION_EXPRESSION_CHILD___GET_ONE_TYPE__BOOLEAN = UNARY_EXPRESSION_CHILD___GET_ONE_TYPE__BOOLEAN;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_MODIFICATION_EXPRESSION_CHILD___GET_ARRAY_DIMENSION = UNARY_EXPRESSION_CHILD___GET_ARRAY_DIMENSION;

    /**
     * The number of operations of the '<em>Unary Modification Expression Child</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNARY_MODIFICATION_EXPRESSION_CHILD_OPERATION_COUNT = UNARY_EXPRESSION_CHILD_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.CastExpressionImpl <em>Cast Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.CastExpressionImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getCastExpression()
     * @generated
     */
    int CAST_EXPRESSION = 34;

    /**
     * The feature id for the '<em><b>Type Reference</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAST_EXPRESSION__TYPE_REFERENCE = TypesPackage.TYPED_ELEMENT__TYPE_REFERENCE;

    /**
     * The feature id for the '<em><b>Array Dimensions Before</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAST_EXPRESSION__ARRAY_DIMENSIONS_BEFORE = TypesPackage.TYPED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Array Dimensions After</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAST_EXPRESSION__ARRAY_DIMENSIONS_AFTER = TypesPackage.TYPED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Child</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAST_EXPRESSION__CHILD = TypesPackage.TYPED_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Cast Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAST_EXPRESSION_FEATURE_COUNT = TypesPackage.TYPED_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAST_EXPRESSION___GET_CONCRETE_CLASSIFIER__STRING = TypesPackage.TYPED_ELEMENT___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAST_EXPRESSION___GET_CONCRETE_CLASSIFIER_PROXY__STRING = TypesPackage.TYPED_ELEMENT___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAST_EXPRESSION___GET_CONCRETE_CLASSIFIERS__STRING_STRING = TypesPackage.TYPED_ELEMENT___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAST_EXPRESSION___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = TypesPackage.TYPED_ELEMENT___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAST_EXPRESSION___GET_LIB_CLASS__STRING = TypesPackage.TYPED_ELEMENT___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAST_EXPRESSION___GET_LIB_INTERFACE__STRING = TypesPackage.TYPED_ELEMENT___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAST_EXPRESSION___GET_CLASS_CLASS = TypesPackage.TYPED_ELEMENT___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAST_EXPRESSION___GET_OBJECT_CLASS = TypesPackage.TYPED_ELEMENT___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAST_EXPRESSION___GET_STRING_CLASS = TypesPackage.TYPED_ELEMENT___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAST_EXPRESSION___GET_ANNOTATION_INTERFACE = TypesPackage.TYPED_ELEMENT___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAST_EXPRESSION___GET_CONTAINING_ANNOTATION_INSTANCE = TypesPackage.TYPED_ELEMENT___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAST_EXPRESSION___GET_CONTAINING_ANONYMOUS_CLASS = TypesPackage.TYPED_ELEMENT___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAST_EXPRESSION___GET_CONTAINING_CONCRETE_CLASSIFIER = TypesPackage.TYPED_ELEMENT___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAST_EXPRESSION___GET_CONTAINING_COMPILATION_UNIT = TypesPackage.TYPED_ELEMENT___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAST_EXPRESSION___GET_CONTAINING_PACKAGE_NAME = TypesPackage.TYPED_ELEMENT___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAST_EXPRESSION___GET_CONTAINING_CONTAINER_NAME = TypesPackage.TYPED_ELEMENT___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAST_EXPRESSION___GET_PARENT_CONCRETE_CLASSIFIER = TypesPackage.TYPED_ELEMENT___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAST_EXPRESSION___GET_PARENT_BY_ETYPE__ECLASS = TypesPackage.TYPED_ELEMENT___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAST_EXPRESSION___GET_FIRST_CHILD_BY_ETYPE__ECLASS = TypesPackage.TYPED_ELEMENT___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAST_EXPRESSION___GET_PARENT_BY_TYPE__CLASS = TypesPackage.TYPED_ELEMENT___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAST_EXPRESSION___GET_FIRST_CHILD_BY_TYPE__CLASS = TypesPackage.TYPED_ELEMENT___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAST_EXPRESSION___GET_CHILDREN_BY_ETYPE__ECLASS = TypesPackage.TYPED_ELEMENT___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAST_EXPRESSION___GET_CHILDREN_BY_TYPE__CLASS = TypesPackage.TYPED_ELEMENT___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAST_EXPRESSION___GET_COMMENTS = TypesPackage.TYPED_ELEMENT___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAST_EXPRESSION___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = TypesPackage.TYPED_ELEMENT___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAST_EXPRESSION___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = TypesPackage.TYPED_ELEMENT___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAST_EXPRESSION___GET_TYPE = TypesPackage.TYPED_ELEMENT_OPERATION_COUNT + 1;

    /**
     * The operation id for the '<em>Get Alternative Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAST_EXPRESSION___GET_ALTERNATIVE_TYPE = TypesPackage.TYPED_ELEMENT_OPERATION_COUNT + 2;

    /**
     * The operation id for the '<em>Get One Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAST_EXPRESSION___GET_ONE_TYPE__BOOLEAN = TypesPackage.TYPED_ELEMENT_OPERATION_COUNT + 3;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAST_EXPRESSION___GET_ARRAY_DIMENSION = TypesPackage.TYPED_ELEMENT_OPERATION_COUNT + 4;

    /**
     * The number of operations of the '<em>Cast Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAST_EXPRESSION_OPERATION_COUNT = TypesPackage.TYPED_ELEMENT_OPERATION_COUNT + 5;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.PrimaryExpressionImpl <em>Primary Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.PrimaryExpressionImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getPrimaryExpression()
     * @generated
     */
    int PRIMARY_EXPRESSION = 35;

    /**
     * The number of structural features of the '<em>Primary Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMARY_EXPRESSION_FEATURE_COUNT = UNARY_MODIFICATION_EXPRESSION_CHILD_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMARY_EXPRESSION___GET_CONCRETE_CLASSIFIER__STRING = UNARY_MODIFICATION_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMARY_EXPRESSION___GET_CONCRETE_CLASSIFIER_PROXY__STRING = UNARY_MODIFICATION_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMARY_EXPRESSION___GET_CONCRETE_CLASSIFIERS__STRING_STRING = UNARY_MODIFICATION_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMARY_EXPRESSION___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = UNARY_MODIFICATION_EXPRESSION_CHILD___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMARY_EXPRESSION___GET_LIB_CLASS__STRING = UNARY_MODIFICATION_EXPRESSION_CHILD___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMARY_EXPRESSION___GET_LIB_INTERFACE__STRING = UNARY_MODIFICATION_EXPRESSION_CHILD___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMARY_EXPRESSION___GET_CLASS_CLASS = UNARY_MODIFICATION_EXPRESSION_CHILD___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMARY_EXPRESSION___GET_OBJECT_CLASS = UNARY_MODIFICATION_EXPRESSION_CHILD___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMARY_EXPRESSION___GET_STRING_CLASS = UNARY_MODIFICATION_EXPRESSION_CHILD___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMARY_EXPRESSION___GET_ANNOTATION_INTERFACE = UNARY_MODIFICATION_EXPRESSION_CHILD___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMARY_EXPRESSION___GET_CONTAINING_ANNOTATION_INSTANCE = UNARY_MODIFICATION_EXPRESSION_CHILD___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMARY_EXPRESSION___GET_CONTAINING_ANONYMOUS_CLASS = UNARY_MODIFICATION_EXPRESSION_CHILD___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMARY_EXPRESSION___GET_CONTAINING_CONCRETE_CLASSIFIER = UNARY_MODIFICATION_EXPRESSION_CHILD___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMARY_EXPRESSION___GET_CONTAINING_COMPILATION_UNIT = UNARY_MODIFICATION_EXPRESSION_CHILD___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMARY_EXPRESSION___GET_CONTAINING_PACKAGE_NAME = UNARY_MODIFICATION_EXPRESSION_CHILD___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMARY_EXPRESSION___GET_CONTAINING_CONTAINER_NAME = UNARY_MODIFICATION_EXPRESSION_CHILD___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMARY_EXPRESSION___GET_PARENT_CONCRETE_CLASSIFIER = UNARY_MODIFICATION_EXPRESSION_CHILD___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMARY_EXPRESSION___GET_PARENT_BY_ETYPE__ECLASS = UNARY_MODIFICATION_EXPRESSION_CHILD___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMARY_EXPRESSION___GET_FIRST_CHILD_BY_ETYPE__ECLASS = UNARY_MODIFICATION_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMARY_EXPRESSION___GET_PARENT_BY_TYPE__CLASS = UNARY_MODIFICATION_EXPRESSION_CHILD___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMARY_EXPRESSION___GET_FIRST_CHILD_BY_TYPE__CLASS = UNARY_MODIFICATION_EXPRESSION_CHILD___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMARY_EXPRESSION___GET_CHILDREN_BY_ETYPE__ECLASS = UNARY_MODIFICATION_EXPRESSION_CHILD___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMARY_EXPRESSION___GET_CHILDREN_BY_TYPE__CLASS = UNARY_MODIFICATION_EXPRESSION_CHILD___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMARY_EXPRESSION___GET_COMMENTS = UNARY_MODIFICATION_EXPRESSION_CHILD___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMARY_EXPRESSION___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = UNARY_MODIFICATION_EXPRESSION_CHILD___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMARY_EXPRESSION___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = UNARY_MODIFICATION_EXPRESSION_CHILD___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMARY_EXPRESSION___GET_TYPE = UNARY_MODIFICATION_EXPRESSION_CHILD___GET_TYPE;

    /**
     * The operation id for the '<em>Get Alternative Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMARY_EXPRESSION___GET_ALTERNATIVE_TYPE = UNARY_MODIFICATION_EXPRESSION_CHILD___GET_ALTERNATIVE_TYPE;

    /**
     * The operation id for the '<em>Get One Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMARY_EXPRESSION___GET_ONE_TYPE__BOOLEAN = UNARY_MODIFICATION_EXPRESSION_CHILD___GET_ONE_TYPE__BOOLEAN;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMARY_EXPRESSION___GET_ARRAY_DIMENSION = UNARY_MODIFICATION_EXPRESSION_CHILD___GET_ARRAY_DIMENSION;

    /**
     * The number of operations of the '<em>Primary Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMARY_EXPRESSION_OPERATION_COUNT = UNARY_MODIFICATION_EXPRESSION_CHILD_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.NestedExpressionImpl <em>Nested Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.NestedExpressionImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getNestedExpression()
     * @generated
     */
    int NESTED_EXPRESSION = 36;

    /**
     * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NESTED_EXPRESSION__TYPE_ARGUMENTS = ReferencesPackage.REFERENCE__TYPE_ARGUMENTS;

    /**
     * The feature id for the '<em><b>Next</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NESTED_EXPRESSION__NEXT = ReferencesPackage.REFERENCE__NEXT;

    /**
     * The feature id for the '<em><b>Array Selectors</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NESTED_EXPRESSION__ARRAY_SELECTORS = ReferencesPackage.REFERENCE__ARRAY_SELECTORS;

    /**
     * The feature id for the '<em><b>Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NESTED_EXPRESSION__EXPRESSION = ReferencesPackage.REFERENCE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Nested Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NESTED_EXPRESSION_FEATURE_COUNT = ReferencesPackage.REFERENCE_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NESTED_EXPRESSION___GET_CONCRETE_CLASSIFIER__STRING = ReferencesPackage.REFERENCE___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NESTED_EXPRESSION___GET_CONCRETE_CLASSIFIER_PROXY__STRING = ReferencesPackage.REFERENCE___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NESTED_EXPRESSION___GET_CONCRETE_CLASSIFIERS__STRING_STRING = ReferencesPackage.REFERENCE___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NESTED_EXPRESSION___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = ReferencesPackage.REFERENCE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NESTED_EXPRESSION___GET_LIB_CLASS__STRING = ReferencesPackage.REFERENCE___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NESTED_EXPRESSION___GET_LIB_INTERFACE__STRING = ReferencesPackage.REFERENCE___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NESTED_EXPRESSION___GET_CLASS_CLASS = ReferencesPackage.REFERENCE___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NESTED_EXPRESSION___GET_OBJECT_CLASS = ReferencesPackage.REFERENCE___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NESTED_EXPRESSION___GET_STRING_CLASS = ReferencesPackage.REFERENCE___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NESTED_EXPRESSION___GET_ANNOTATION_INTERFACE = ReferencesPackage.REFERENCE___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NESTED_EXPRESSION___GET_CONTAINING_ANNOTATION_INSTANCE = ReferencesPackage.REFERENCE___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NESTED_EXPRESSION___GET_CONTAINING_ANONYMOUS_CLASS = ReferencesPackage.REFERENCE___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NESTED_EXPRESSION___GET_CONTAINING_CONCRETE_CLASSIFIER = ReferencesPackage.REFERENCE___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NESTED_EXPRESSION___GET_CONTAINING_COMPILATION_UNIT = ReferencesPackage.REFERENCE___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NESTED_EXPRESSION___GET_CONTAINING_PACKAGE_NAME = ReferencesPackage.REFERENCE___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NESTED_EXPRESSION___GET_CONTAINING_CONTAINER_NAME = ReferencesPackage.REFERENCE___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NESTED_EXPRESSION___GET_PARENT_CONCRETE_CLASSIFIER = ReferencesPackage.REFERENCE___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NESTED_EXPRESSION___GET_PARENT_BY_ETYPE__ECLASS = ReferencesPackage.REFERENCE___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NESTED_EXPRESSION___GET_FIRST_CHILD_BY_ETYPE__ECLASS = ReferencesPackage.REFERENCE___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NESTED_EXPRESSION___GET_PARENT_BY_TYPE__CLASS = ReferencesPackage.REFERENCE___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NESTED_EXPRESSION___GET_FIRST_CHILD_BY_TYPE__CLASS = ReferencesPackage.REFERENCE___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NESTED_EXPRESSION___GET_CHILDREN_BY_ETYPE__ECLASS = ReferencesPackage.REFERENCE___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NESTED_EXPRESSION___GET_CHILDREN_BY_TYPE__CLASS = ReferencesPackage.REFERENCE___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NESTED_EXPRESSION___GET_COMMENTS = ReferencesPackage.REFERENCE___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NESTED_EXPRESSION___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = ReferencesPackage.REFERENCE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NESTED_EXPRESSION___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = ReferencesPackage.REFERENCE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NESTED_EXPRESSION___GET_TYPE = ReferencesPackage.REFERENCE___GET_TYPE;

    /**
     * The operation id for the '<em>Get Alternative Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NESTED_EXPRESSION___GET_ALTERNATIVE_TYPE = ReferencesPackage.REFERENCE___GET_ALTERNATIVE_TYPE;

    /**
     * The operation id for the '<em>Get One Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NESTED_EXPRESSION___GET_ONE_TYPE__BOOLEAN = ReferencesPackage.REFERENCE___GET_ONE_TYPE__BOOLEAN;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NESTED_EXPRESSION___GET_ARRAY_DIMENSION = ReferencesPackage.REFERENCE___GET_ARRAY_DIMENSION;

    /**
     * The operation id for the '<em>Get Referenced Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NESTED_EXPRESSION___GET_REFERENCED_TYPE = ReferencesPackage.REFERENCE___GET_REFERENCED_TYPE;

    /**
     * The operation id for the '<em>Get Previous</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NESTED_EXPRESSION___GET_PREVIOUS = ReferencesPackage.REFERENCE___GET_PREVIOUS;

    /**
     * The number of operations of the '<em>Nested Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NESTED_EXPRESSION_OPERATION_COUNT = ReferencesPackage.REFERENCE_OPERATION_COUNT + 0;

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExpressionList <em>Expression List</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Expression List</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExpressionList
     * @generated
     */
    EClass getExpressionList();

    /**
     * Returns the meta object for the containment reference list '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExpressionList#getExpressions <em>Expressions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Expressions</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExpressionList#getExpressions()
     * @see #getExpressionList()
     * @generated
     */
    EReference getExpressionList_Expressions();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.Expression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Expression</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.Expression
     * @generated
     */
    EClass getExpression();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.Expression#getType() <em>Get Type</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Type</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.Expression#getType()
     * @generated
     */
    EOperation getExpression__GetType();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.Expression#getAlternativeType() <em>Get Alternative Type</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Alternative Type</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.Expression#getAlternativeType()
     * @generated
     */
    EOperation getExpression__GetAlternativeType();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.Expression#getOneType(boolean) <em>Get One Type</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get One Type</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.Expression#getOneType(boolean)
     * @generated
     */
    EOperation getExpression__GetOneType__boolean();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.Expression#getArrayDimension() <em>Get Array Dimension</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Array Dimension</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.Expression#getArrayDimension()
     * @generated
     */
    EOperation getExpression__GetArrayDimension();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.AssignmentExpression <em>Assignment Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Assignment Expression</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.AssignmentExpression
     * @generated
     */
    EClass getAssignmentExpression();

    /**
     * Returns the meta object for the containment reference '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.AssignmentExpression#getChild <em>Child</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Child</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.AssignmentExpression#getChild()
     * @see #getAssignmentExpression()
     * @generated
     */
    EReference getAssignmentExpression_Child();

    /**
     * Returns the meta object for the containment reference '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.AssignmentExpression#getAssignmentOperator <em>Assignment Operator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Assignment Operator</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.AssignmentExpression#getAssignmentOperator()
     * @see #getAssignmentExpression()
     * @generated
     */
    EReference getAssignmentExpression_AssignmentOperator();

    /**
     * Returns the meta object for the containment reference '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.AssignmentExpression#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Value</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.AssignmentExpression#getValue()
     * @see #getAssignmentExpression()
     * @generated
     */
    EReference getAssignmentExpression_Value();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.AssignmentExpressionChild <em>Assignment Expression Child</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Assignment Expression Child</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.AssignmentExpressionChild
     * @generated
     */
    EClass getAssignmentExpressionChild();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.ConditionalExpression <em>Conditional Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Conditional Expression</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.ConditionalExpression
     * @generated
     */
    EClass getConditionalExpression();

    /**
     * Returns the meta object for the containment reference '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.ConditionalExpression#getChild <em>Child</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Child</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.ConditionalExpression#getChild()
     * @see #getConditionalExpression()
     * @generated
     */
    EReference getConditionalExpression_Child();

    /**
     * Returns the meta object for the containment reference '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.ConditionalExpression#getExpressionIf <em>Expression If</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Expression If</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.ConditionalExpression#getExpressionIf()
     * @see #getConditionalExpression()
     * @generated
     */
    EReference getConditionalExpression_ExpressionIf();

    /**
     * Returns the meta object for the containment reference '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.ConditionalExpression#getExpressionElse <em>Expression Else</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Expression Else</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.ConditionalExpression#getExpressionElse()
     * @see #getConditionalExpression()
     * @generated
     */
    EReference getConditionalExpression_ExpressionElse();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.ConditionalExpressionChild <em>Conditional Expression Child</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Conditional Expression Child</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.ConditionalExpressionChild
     * @generated
     */
    EClass getConditionalExpressionChild();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.ConditionalOrExpression <em>Conditional Or Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Conditional Or Expression</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.ConditionalOrExpression
     * @generated
     */
    EClass getConditionalOrExpression();

    /**
     * Returns the meta object for the containment reference list '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.ConditionalOrExpression#getChildren <em>Children</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Children</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.ConditionalOrExpression#getChildren()
     * @see #getConditionalOrExpression()
     * @generated
     */
    EReference getConditionalOrExpression_Children();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.ConditionalOrExpressionChild <em>Conditional Or Expression Child</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Conditional Or Expression Child</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.ConditionalOrExpressionChild
     * @generated
     */
    EClass getConditionalOrExpressionChild();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.ConditionalAndExpression <em>Conditional And Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Conditional And Expression</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.ConditionalAndExpression
     * @generated
     */
    EClass getConditionalAndExpression();

    /**
     * Returns the meta object for the containment reference list '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.ConditionalAndExpression#getChildren <em>Children</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Children</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.ConditionalAndExpression#getChildren()
     * @see #getConditionalAndExpression()
     * @generated
     */
    EReference getConditionalAndExpression_Children();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.ConditionalAndExpressionChild <em>Conditional And Expression Child</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Conditional And Expression Child</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.ConditionalAndExpressionChild
     * @generated
     */
    EClass getConditionalAndExpressionChild();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.InclusiveOrExpression <em>Inclusive Or Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Inclusive Or Expression</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.InclusiveOrExpression
     * @generated
     */
    EClass getInclusiveOrExpression();

    /**
     * Returns the meta object for the containment reference list '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.InclusiveOrExpression#getChildren <em>Children</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Children</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.InclusiveOrExpression#getChildren()
     * @see #getInclusiveOrExpression()
     * @generated
     */
    EReference getInclusiveOrExpression_Children();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.InclusiveOrExpressionChild <em>Inclusive Or Expression Child</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Inclusive Or Expression Child</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.InclusiveOrExpressionChild
     * @generated
     */
    EClass getInclusiveOrExpressionChild();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExclusiveOrExpression <em>Exclusive Or Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Exclusive Or Expression</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExclusiveOrExpression
     * @generated
     */
    EClass getExclusiveOrExpression();

    /**
     * Returns the meta object for the containment reference list '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExclusiveOrExpression#getChildren <em>Children</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Children</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExclusiveOrExpression#getChildren()
     * @see #getExclusiveOrExpression()
     * @generated
     */
    EReference getExclusiveOrExpression_Children();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExclusiveOrExpressionChild <em>Exclusive Or Expression Child</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Exclusive Or Expression Child</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExclusiveOrExpressionChild
     * @generated
     */
    EClass getExclusiveOrExpressionChild();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.AndExpression <em>And Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>And Expression</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.AndExpression
     * @generated
     */
    EClass getAndExpression();

    /**
     * Returns the meta object for the containment reference list '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.AndExpression#getChildren <em>Children</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Children</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.AndExpression#getChildren()
     * @see #getAndExpression()
     * @generated
     */
    EReference getAndExpression_Children();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.AndExpressionChild <em>And Expression Child</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>And Expression Child</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.AndExpressionChild
     * @generated
     */
    EClass getAndExpressionChild();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.EqualityExpression <em>Equality Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Equality Expression</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.EqualityExpression
     * @generated
     */
    EClass getEqualityExpression();

    /**
     * Returns the meta object for the containment reference list '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.EqualityExpression#getEqualityOperators <em>Equality Operators</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Equality Operators</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.EqualityExpression#getEqualityOperators()
     * @see #getEqualityExpression()
     * @generated
     */
    EReference getEqualityExpression_EqualityOperators();

    /**
     * Returns the meta object for the containment reference list '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.EqualityExpression#getChildren <em>Children</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Children</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.EqualityExpression#getChildren()
     * @see #getEqualityExpression()
     * @generated
     */
    EReference getEqualityExpression_Children();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.EqualityExpressionChild <em>Equality Expression Child</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Equality Expression Child</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.EqualityExpressionChild
     * @generated
     */
    EClass getEqualityExpressionChild();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.InstanceOfExpression <em>Instance Of Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Instance Of Expression</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.InstanceOfExpression
     * @generated
     */
    EClass getInstanceOfExpression();

    /**
     * Returns the meta object for the containment reference '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.InstanceOfExpression#getChild <em>Child</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Child</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.InstanceOfExpression#getChild()
     * @see #getInstanceOfExpression()
     * @generated
     */
    EReference getInstanceOfExpression_Child();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.InstanceOfExpressionChild <em>Instance Of Expression Child</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Instance Of Expression Child</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.InstanceOfExpressionChild
     * @generated
     */
    EClass getInstanceOfExpressionChild();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.RelationExpression <em>Relation Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Relation Expression</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.RelationExpression
     * @generated
     */
    EClass getRelationExpression();

    /**
     * Returns the meta object for the containment reference list '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.RelationExpression#getChildren <em>Children</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Children</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.RelationExpression#getChildren()
     * @see #getRelationExpression()
     * @generated
     */
    EReference getRelationExpression_Children();

    /**
     * Returns the meta object for the containment reference list '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.RelationExpression#getRelationOperators <em>Relation Operators</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Relation Operators</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.RelationExpression#getRelationOperators()
     * @see #getRelationExpression()
     * @generated
     */
    EReference getRelationExpression_RelationOperators();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.RelationExpressionChild <em>Relation Expression Child</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Relation Expression Child</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.RelationExpressionChild
     * @generated
     */
    EClass getRelationExpressionChild();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.ShiftExpression <em>Shift Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Shift Expression</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.ShiftExpression
     * @generated
     */
    EClass getShiftExpression();

    /**
     * Returns the meta object for the containment reference list '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.ShiftExpression#getChildren <em>Children</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Children</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.ShiftExpression#getChildren()
     * @see #getShiftExpression()
     * @generated
     */
    EReference getShiftExpression_Children();

    /**
     * Returns the meta object for the containment reference list '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.ShiftExpression#getShiftOperators <em>Shift Operators</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Shift Operators</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.ShiftExpression#getShiftOperators()
     * @see #getShiftExpression()
     * @generated
     */
    EReference getShiftExpression_ShiftOperators();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.ShiftExpressionChild <em>Shift Expression Child</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Shift Expression Child</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.ShiftExpressionChild
     * @generated
     */
    EClass getShiftExpressionChild();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.AdditiveExpression <em>Additive Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Additive Expression</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.AdditiveExpression
     * @generated
     */
    EClass getAdditiveExpression();

    /**
     * Returns the meta object for the containment reference list '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.AdditiveExpression#getChildren <em>Children</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Children</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.AdditiveExpression#getChildren()
     * @see #getAdditiveExpression()
     * @generated
     */
    EReference getAdditiveExpression_Children();

    /**
     * Returns the meta object for the containment reference list '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.AdditiveExpression#getAdditiveOperators <em>Additive Operators</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Additive Operators</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.AdditiveExpression#getAdditiveOperators()
     * @see #getAdditiveExpression()
     * @generated
     */
    EReference getAdditiveExpression_AdditiveOperators();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.AdditiveExpressionChild <em>Additive Expression Child</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Additive Expression Child</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.AdditiveExpressionChild
     * @generated
     */
    EClass getAdditiveExpressionChild();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.MultiplicativeExpression <em>Multiplicative Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Multiplicative Expression</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.MultiplicativeExpression
     * @generated
     */
    EClass getMultiplicativeExpression();

    /**
     * Returns the meta object for the containment reference list '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.MultiplicativeExpression#getChildren <em>Children</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Children</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.MultiplicativeExpression#getChildren()
     * @see #getMultiplicativeExpression()
     * @generated
     */
    EReference getMultiplicativeExpression_Children();

    /**
     * Returns the meta object for the containment reference list '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.MultiplicativeExpression#getMultiplicativeOperators <em>Multiplicative Operators</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Multiplicative Operators</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.MultiplicativeExpression#getMultiplicativeOperators()
     * @see #getMultiplicativeExpression()
     * @generated
     */
    EReference getMultiplicativeExpression_MultiplicativeOperators();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.MultiplicativeExpressionChild <em>Multiplicative Expression Child</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Multiplicative Expression Child</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.MultiplicativeExpressionChild
     * @generated
     */
    EClass getMultiplicativeExpressionChild();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.UnaryExpression <em>Unary Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Unary Expression</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.UnaryExpression
     * @generated
     */
    EClass getUnaryExpression();

    /**
     * Returns the meta object for the containment reference list '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.UnaryExpression#getOperators <em>Operators</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Operators</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.UnaryExpression#getOperators()
     * @see #getUnaryExpression()
     * @generated
     */
    EReference getUnaryExpression_Operators();

    /**
     * Returns the meta object for the containment reference '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.UnaryExpression#getChild <em>Child</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Child</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.UnaryExpression#getChild()
     * @see #getUnaryExpression()
     * @generated
     */
    EReference getUnaryExpression_Child();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.UnaryExpressionChild <em>Unary Expression Child</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Unary Expression Child</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.UnaryExpressionChild
     * @generated
     */
    EClass getUnaryExpressionChild();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.UnaryModificationExpression <em>Unary Modification Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Unary Modification Expression</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.UnaryModificationExpression
     * @generated
     */
    EClass getUnaryModificationExpression();

    /**
     * Returns the meta object for the containment reference '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.UnaryModificationExpression#getChild <em>Child</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Child</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.UnaryModificationExpression#getChild()
     * @see #getUnaryModificationExpression()
     * @generated
     */
    EReference getUnaryModificationExpression_Child();

    /**
     * Returns the meta object for the containment reference '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.UnaryModificationExpression#getOperator <em>Operator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Operator</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.UnaryModificationExpression#getOperator()
     * @see #getUnaryModificationExpression()
     * @generated
     */
    EReference getUnaryModificationExpression_Operator();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.PrefixUnaryModificationExpression <em>Prefix Unary Modification Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Prefix Unary Modification Expression</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.PrefixUnaryModificationExpression
     * @generated
     */
    EClass getPrefixUnaryModificationExpression();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.SuffixUnaryModificationExpression <em>Suffix Unary Modification Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Suffix Unary Modification Expression</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.SuffixUnaryModificationExpression
     * @generated
     */
    EClass getSuffixUnaryModificationExpression();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.UnaryModificationExpressionChild <em>Unary Modification Expression Child</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Unary Modification Expression Child</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.UnaryModificationExpressionChild
     * @generated
     */
    EClass getUnaryModificationExpressionChild();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.CastExpression <em>Cast Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Cast Expression</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.CastExpression
     * @generated
     */
    EClass getCastExpression();

    /**
     * Returns the meta object for the containment reference '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.CastExpression#getChild <em>Child</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Child</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.CastExpression#getChild()
     * @see #getCastExpression()
     * @generated
     */
    EReference getCastExpression_Child();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.PrimaryExpression <em>Primary Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Primary Expression</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.PrimaryExpression
     * @generated
     */
    EClass getPrimaryExpression();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.NestedExpression <em>Nested Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Nested Expression</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.NestedExpression
     * @generated
     */
    EClass getNestedExpression();

    /**
     * Returns the meta object for the containment reference '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.NestedExpression#getExpression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Expression</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.NestedExpression#getExpression()
     * @see #getNestedExpression()
     * @generated
     */
    EReference getNestedExpression_Expression();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    ExpressionsFactory getExpressionsFactory();

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
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionListImpl <em>Expression List</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionListImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getExpressionList()
         * @generated
         */
        EClass EXPRESSION_LIST = eINSTANCE.getExpressionList();

        /**
         * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EXPRESSION_LIST__EXPRESSIONS = eINSTANCE.getExpressionList_Expressions();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionImpl <em>Expression</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getExpression()
         * @generated
         */
        EClass EXPRESSION = eINSTANCE.getExpression();

        /**
         * The meta object literal for the '<em><b>Get Type</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation EXPRESSION___GET_TYPE = eINSTANCE.getExpression__GetType();

        /**
         * The meta object literal for the '<em><b>Get Alternative Type</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation EXPRESSION___GET_ALTERNATIVE_TYPE = eINSTANCE.getExpression__GetAlternativeType();

        /**
         * The meta object literal for the '<em><b>Get One Type</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation EXPRESSION___GET_ONE_TYPE__BOOLEAN = eINSTANCE.getExpression__GetOneType__boolean();

        /**
         * The meta object literal for the '<em><b>Get Array Dimension</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation EXPRESSION___GET_ARRAY_DIMENSION = eINSTANCE.getExpression__GetArrayDimension();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.AssignmentExpressionImpl <em>Assignment Expression</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.AssignmentExpressionImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getAssignmentExpression()
         * @generated
         */
        EClass ASSIGNMENT_EXPRESSION = eINSTANCE.getAssignmentExpression();

        /**
         * The meta object literal for the '<em><b>Child</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ASSIGNMENT_EXPRESSION__CHILD = eINSTANCE.getAssignmentExpression_Child();

        /**
         * The meta object literal for the '<em><b>Assignment Operator</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ASSIGNMENT_EXPRESSION__ASSIGNMENT_OPERATOR = eINSTANCE.getAssignmentExpression_AssignmentOperator();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ASSIGNMENT_EXPRESSION__VALUE = eINSTANCE.getAssignmentExpression_Value();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.AssignmentExpressionChildImpl <em>Assignment Expression Child</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.AssignmentExpressionChildImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getAssignmentExpressionChild()
         * @generated
         */
        EClass ASSIGNMENT_EXPRESSION_CHILD = eINSTANCE.getAssignmentExpressionChild();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ConditionalExpressionImpl <em>Conditional Expression</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ConditionalExpressionImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getConditionalExpression()
         * @generated
         */
        EClass CONDITIONAL_EXPRESSION = eINSTANCE.getConditionalExpression();

        /**
         * The meta object literal for the '<em><b>Child</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONDITIONAL_EXPRESSION__CHILD = eINSTANCE.getConditionalExpression_Child();

        /**
         * The meta object literal for the '<em><b>Expression If</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONDITIONAL_EXPRESSION__EXPRESSION_IF = eINSTANCE.getConditionalExpression_ExpressionIf();

        /**
         * The meta object literal for the '<em><b>Expression Else</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONDITIONAL_EXPRESSION__EXPRESSION_ELSE = eINSTANCE.getConditionalExpression_ExpressionElse();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ConditionalExpressionChildImpl <em>Conditional Expression Child</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ConditionalExpressionChildImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getConditionalExpressionChild()
         * @generated
         */
        EClass CONDITIONAL_EXPRESSION_CHILD = eINSTANCE.getConditionalExpressionChild();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ConditionalOrExpressionImpl <em>Conditional Or Expression</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ConditionalOrExpressionImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getConditionalOrExpression()
         * @generated
         */
        EClass CONDITIONAL_OR_EXPRESSION = eINSTANCE.getConditionalOrExpression();

        /**
         * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONDITIONAL_OR_EXPRESSION__CHILDREN = eINSTANCE.getConditionalOrExpression_Children();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ConditionalOrExpressionChildImpl <em>Conditional Or Expression Child</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ConditionalOrExpressionChildImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getConditionalOrExpressionChild()
         * @generated
         */
        EClass CONDITIONAL_OR_EXPRESSION_CHILD = eINSTANCE.getConditionalOrExpressionChild();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ConditionalAndExpressionImpl <em>Conditional And Expression</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ConditionalAndExpressionImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getConditionalAndExpression()
         * @generated
         */
        EClass CONDITIONAL_AND_EXPRESSION = eINSTANCE.getConditionalAndExpression();

        /**
         * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONDITIONAL_AND_EXPRESSION__CHILDREN = eINSTANCE.getConditionalAndExpression_Children();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ConditionalAndExpressionChildImpl <em>Conditional And Expression Child</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ConditionalAndExpressionChildImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getConditionalAndExpressionChild()
         * @generated
         */
        EClass CONDITIONAL_AND_EXPRESSION_CHILD = eINSTANCE.getConditionalAndExpressionChild();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.InclusiveOrExpressionImpl <em>Inclusive Or Expression</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.InclusiveOrExpressionImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getInclusiveOrExpression()
         * @generated
         */
        EClass INCLUSIVE_OR_EXPRESSION = eINSTANCE.getInclusiveOrExpression();

        /**
         * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INCLUSIVE_OR_EXPRESSION__CHILDREN = eINSTANCE.getInclusiveOrExpression_Children();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.InclusiveOrExpressionChildImpl <em>Inclusive Or Expression Child</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.InclusiveOrExpressionChildImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getInclusiveOrExpressionChild()
         * @generated
         */
        EClass INCLUSIVE_OR_EXPRESSION_CHILD = eINSTANCE.getInclusiveOrExpressionChild();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExclusiveOrExpressionImpl <em>Exclusive Or Expression</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExclusiveOrExpressionImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getExclusiveOrExpression()
         * @generated
         */
        EClass EXCLUSIVE_OR_EXPRESSION = eINSTANCE.getExclusiveOrExpression();

        /**
         * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EXCLUSIVE_OR_EXPRESSION__CHILDREN = eINSTANCE.getExclusiveOrExpression_Children();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExclusiveOrExpressionChildImpl <em>Exclusive Or Expression Child</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExclusiveOrExpressionChildImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getExclusiveOrExpressionChild()
         * @generated
         */
        EClass EXCLUSIVE_OR_EXPRESSION_CHILD = eINSTANCE.getExclusiveOrExpressionChild();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.AndExpressionImpl <em>And Expression</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.AndExpressionImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getAndExpression()
         * @generated
         */
        EClass AND_EXPRESSION = eINSTANCE.getAndExpression();

        /**
         * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference AND_EXPRESSION__CHILDREN = eINSTANCE.getAndExpression_Children();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.AndExpressionChildImpl <em>And Expression Child</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.AndExpressionChildImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getAndExpressionChild()
         * @generated
         */
        EClass AND_EXPRESSION_CHILD = eINSTANCE.getAndExpressionChild();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.EqualityExpressionImpl <em>Equality Expression</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.EqualityExpressionImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getEqualityExpression()
         * @generated
         */
        EClass EQUALITY_EXPRESSION = eINSTANCE.getEqualityExpression();

        /**
         * The meta object literal for the '<em><b>Equality Operators</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EQUALITY_EXPRESSION__EQUALITY_OPERATORS = eINSTANCE.getEqualityExpression_EqualityOperators();

        /**
         * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EQUALITY_EXPRESSION__CHILDREN = eINSTANCE.getEqualityExpression_Children();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.EqualityExpressionChildImpl <em>Equality Expression Child</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.EqualityExpressionChildImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getEqualityExpressionChild()
         * @generated
         */
        EClass EQUALITY_EXPRESSION_CHILD = eINSTANCE.getEqualityExpressionChild();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.InstanceOfExpressionImpl <em>Instance Of Expression</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.InstanceOfExpressionImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getInstanceOfExpression()
         * @generated
         */
        EClass INSTANCE_OF_EXPRESSION = eINSTANCE.getInstanceOfExpression();

        /**
         * The meta object literal for the '<em><b>Child</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INSTANCE_OF_EXPRESSION__CHILD = eINSTANCE.getInstanceOfExpression_Child();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.InstanceOfExpressionChildImpl <em>Instance Of Expression Child</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.InstanceOfExpressionChildImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getInstanceOfExpressionChild()
         * @generated
         */
        EClass INSTANCE_OF_EXPRESSION_CHILD = eINSTANCE.getInstanceOfExpressionChild();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.RelationExpressionImpl <em>Relation Expression</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.RelationExpressionImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getRelationExpression()
         * @generated
         */
        EClass RELATION_EXPRESSION = eINSTANCE.getRelationExpression();

        /**
         * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RELATION_EXPRESSION__CHILDREN = eINSTANCE.getRelationExpression_Children();

        /**
         * The meta object literal for the '<em><b>Relation Operators</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RELATION_EXPRESSION__RELATION_OPERATORS = eINSTANCE.getRelationExpression_RelationOperators();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.RelationExpressionChildImpl <em>Relation Expression Child</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.RelationExpressionChildImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getRelationExpressionChild()
         * @generated
         */
        EClass RELATION_EXPRESSION_CHILD = eINSTANCE.getRelationExpressionChild();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ShiftExpressionImpl <em>Shift Expression</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ShiftExpressionImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getShiftExpression()
         * @generated
         */
        EClass SHIFT_EXPRESSION = eINSTANCE.getShiftExpression();

        /**
         * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SHIFT_EXPRESSION__CHILDREN = eINSTANCE.getShiftExpression_Children();

        /**
         * The meta object literal for the '<em><b>Shift Operators</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SHIFT_EXPRESSION__SHIFT_OPERATORS = eINSTANCE.getShiftExpression_ShiftOperators();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ShiftExpressionChildImpl <em>Shift Expression Child</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ShiftExpressionChildImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getShiftExpressionChild()
         * @generated
         */
        EClass SHIFT_EXPRESSION_CHILD = eINSTANCE.getShiftExpressionChild();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.AdditiveExpressionImpl <em>Additive Expression</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.AdditiveExpressionImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getAdditiveExpression()
         * @generated
         */
        EClass ADDITIVE_EXPRESSION = eINSTANCE.getAdditiveExpression();

        /**
         * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ADDITIVE_EXPRESSION__CHILDREN = eINSTANCE.getAdditiveExpression_Children();

        /**
         * The meta object literal for the '<em><b>Additive Operators</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ADDITIVE_EXPRESSION__ADDITIVE_OPERATORS = eINSTANCE.getAdditiveExpression_AdditiveOperators();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.AdditiveExpressionChildImpl <em>Additive Expression Child</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.AdditiveExpressionChildImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getAdditiveExpressionChild()
         * @generated
         */
        EClass ADDITIVE_EXPRESSION_CHILD = eINSTANCE.getAdditiveExpressionChild();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.MultiplicativeExpressionImpl <em>Multiplicative Expression</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.MultiplicativeExpressionImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getMultiplicativeExpression()
         * @generated
         */
        EClass MULTIPLICATIVE_EXPRESSION = eINSTANCE.getMultiplicativeExpression();

        /**
         * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MULTIPLICATIVE_EXPRESSION__CHILDREN = eINSTANCE.getMultiplicativeExpression_Children();

        /**
         * The meta object literal for the '<em><b>Multiplicative Operators</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MULTIPLICATIVE_EXPRESSION__MULTIPLICATIVE_OPERATORS = eINSTANCE
                .getMultiplicativeExpression_MultiplicativeOperators();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.MultiplicativeExpressionChildImpl <em>Multiplicative Expression Child</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.MultiplicativeExpressionChildImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getMultiplicativeExpressionChild()
         * @generated
         */
        EClass MULTIPLICATIVE_EXPRESSION_CHILD = eINSTANCE.getMultiplicativeExpressionChild();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.UnaryExpressionImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getUnaryExpression()
         * @generated
         */
        EClass UNARY_EXPRESSION = eINSTANCE.getUnaryExpression();

        /**
         * The meta object literal for the '<em><b>Operators</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference UNARY_EXPRESSION__OPERATORS = eINSTANCE.getUnaryExpression_Operators();

        /**
         * The meta object literal for the '<em><b>Child</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference UNARY_EXPRESSION__CHILD = eINSTANCE.getUnaryExpression_Child();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.UnaryExpressionChildImpl <em>Unary Expression Child</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.UnaryExpressionChildImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getUnaryExpressionChild()
         * @generated
         */
        EClass UNARY_EXPRESSION_CHILD = eINSTANCE.getUnaryExpressionChild();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.UnaryModificationExpressionImpl <em>Unary Modification Expression</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.UnaryModificationExpressionImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getUnaryModificationExpression()
         * @generated
         */
        EClass UNARY_MODIFICATION_EXPRESSION = eINSTANCE.getUnaryModificationExpression();

        /**
         * The meta object literal for the '<em><b>Child</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference UNARY_MODIFICATION_EXPRESSION__CHILD = eINSTANCE.getUnaryModificationExpression_Child();

        /**
         * The meta object literal for the '<em><b>Operator</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference UNARY_MODIFICATION_EXPRESSION__OPERATOR = eINSTANCE.getUnaryModificationExpression_Operator();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.PrefixUnaryModificationExpressionImpl <em>Prefix Unary Modification Expression</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.PrefixUnaryModificationExpressionImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getPrefixUnaryModificationExpression()
         * @generated
         */
        EClass PREFIX_UNARY_MODIFICATION_EXPRESSION = eINSTANCE.getPrefixUnaryModificationExpression();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.SuffixUnaryModificationExpressionImpl <em>Suffix Unary Modification Expression</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.SuffixUnaryModificationExpressionImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getSuffixUnaryModificationExpression()
         * @generated
         */
        EClass SUFFIX_UNARY_MODIFICATION_EXPRESSION = eINSTANCE.getSuffixUnaryModificationExpression();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.UnaryModificationExpressionChildImpl <em>Unary Modification Expression Child</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.UnaryModificationExpressionChildImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getUnaryModificationExpressionChild()
         * @generated
         */
        EClass UNARY_MODIFICATION_EXPRESSION_CHILD = eINSTANCE.getUnaryModificationExpressionChild();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.CastExpressionImpl <em>Cast Expression</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.CastExpressionImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getCastExpression()
         * @generated
         */
        EClass CAST_EXPRESSION = eINSTANCE.getCastExpression();

        /**
         * The meta object literal for the '<em><b>Child</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAST_EXPRESSION__CHILD = eINSTANCE.getCastExpression_Child();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.PrimaryExpressionImpl <em>Primary Expression</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.PrimaryExpressionImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getPrimaryExpression()
         * @generated
         */
        EClass PRIMARY_EXPRESSION = eINSTANCE.getPrimaryExpression();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.NestedExpressionImpl <em>Nested Expression</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.NestedExpressionImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ExpressionsPackageImpl#getNestedExpression()
         * @generated
         */
        EClass NESTED_EXPRESSION = eINSTANCE.getNestedExpression();

        /**
         * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NESTED_EXPRESSION__EXPRESSION = eINSTANCE.getNestedExpression_Expression();

    }

} //ExpressionsPackage
