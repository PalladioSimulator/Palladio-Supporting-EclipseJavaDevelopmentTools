/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.literals;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.CommonsPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExpressionsPackage;

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
 * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.LiteralsFactory
 * @model kind="package"
 * @generated
 */
public interface LiteralsPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "literals";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.palladiosimulator.org/javamodel/literals";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "literals";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    LiteralsPackage eINSTANCE = org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.LiteralsPackageImpl.init();

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.LiteralImpl <em>Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.LiteralImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.LiteralsPackageImpl#getLiteral()
     * @generated
     */
    int LITERAL = 0;

    /**
     * The number of structural features of the '<em>Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL_FEATURE_COUNT = ExpressionsPackage.PRIMARY_EXPRESSION_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL___GET_CONCRETE_CLASSIFIER__STRING = ExpressionsPackage.PRIMARY_EXPRESSION___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL___GET_CONCRETE_CLASSIFIER_PROXY__STRING = ExpressionsPackage.PRIMARY_EXPRESSION___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL___GET_CONCRETE_CLASSIFIERS__STRING_STRING = ExpressionsPackage.PRIMARY_EXPRESSION___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = ExpressionsPackage.PRIMARY_EXPRESSION___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL___GET_LIB_CLASS__STRING = ExpressionsPackage.PRIMARY_EXPRESSION___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL___GET_LIB_INTERFACE__STRING = ExpressionsPackage.PRIMARY_EXPRESSION___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL___GET_CLASS_CLASS = ExpressionsPackage.PRIMARY_EXPRESSION___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL___GET_OBJECT_CLASS = ExpressionsPackage.PRIMARY_EXPRESSION___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL___GET_STRING_CLASS = ExpressionsPackage.PRIMARY_EXPRESSION___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL___GET_ANNOTATION_INTERFACE = ExpressionsPackage.PRIMARY_EXPRESSION___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL___GET_CONTAINING_ANNOTATION_INSTANCE = ExpressionsPackage.PRIMARY_EXPRESSION___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL___GET_CONTAINING_ANONYMOUS_CLASS = ExpressionsPackage.PRIMARY_EXPRESSION___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL___GET_CONTAINING_CONCRETE_CLASSIFIER = ExpressionsPackage.PRIMARY_EXPRESSION___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL___GET_CONTAINING_COMPILATION_UNIT = ExpressionsPackage.PRIMARY_EXPRESSION___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL___GET_CONTAINING_PACKAGE_NAME = ExpressionsPackage.PRIMARY_EXPRESSION___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL___GET_CONTAINING_CONTAINER_NAME = ExpressionsPackage.PRIMARY_EXPRESSION___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL___GET_PARENT_CONCRETE_CLASSIFIER = ExpressionsPackage.PRIMARY_EXPRESSION___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL___GET_PARENT_BY_ETYPE__ECLASS = ExpressionsPackage.PRIMARY_EXPRESSION___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL___GET_FIRST_CHILD_BY_ETYPE__ECLASS = ExpressionsPackage.PRIMARY_EXPRESSION___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL___GET_PARENT_BY_TYPE__CLASS = ExpressionsPackage.PRIMARY_EXPRESSION___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL___GET_FIRST_CHILD_BY_TYPE__CLASS = ExpressionsPackage.PRIMARY_EXPRESSION___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL___GET_CHILDREN_BY_ETYPE__ECLASS = ExpressionsPackage.PRIMARY_EXPRESSION___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL___GET_CHILDREN_BY_TYPE__CLASS = ExpressionsPackage.PRIMARY_EXPRESSION___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL___GET_COMMENTS = ExpressionsPackage.PRIMARY_EXPRESSION___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = ExpressionsPackage.PRIMARY_EXPRESSION___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = ExpressionsPackage.PRIMARY_EXPRESSION___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL___GET_TYPE = ExpressionsPackage.PRIMARY_EXPRESSION___GET_TYPE;

    /**
     * The operation id for the '<em>Get Alternative Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL___GET_ALTERNATIVE_TYPE = ExpressionsPackage.PRIMARY_EXPRESSION___GET_ALTERNATIVE_TYPE;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL___GET_ARRAY_DIMENSION = ExpressionsPackage.PRIMARY_EXPRESSION___GET_ARRAY_DIMENSION;

    /**
     * The operation id for the '<em>Get One Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL___GET_ONE_TYPE__BOOLEAN = ExpressionsPackage.PRIMARY_EXPRESSION_OPERATION_COUNT + 0;

    /**
     * The number of operations of the '<em>Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL_OPERATION_COUNT = ExpressionsPackage.PRIMARY_EXPRESSION_OPERATION_COUNT + 1;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.SelfImpl <em>Self</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.SelfImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.LiteralsPackageImpl#getSelf()
     * @generated
     */
    int SELF = 1;

    /**
     * The number of structural features of the '<em>Self</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF_FEATURE_COUNT = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF___GET_CONCRETE_CLASSIFIER__STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF___GET_CONCRETE_CLASSIFIER_PROXY__STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF___GET_CONCRETE_CLASSIFIERS__STRING_STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF___GET_LIB_CLASS__STRING = CommonsPackage.COMMENTABLE___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF___GET_LIB_INTERFACE__STRING = CommonsPackage.COMMENTABLE___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF___GET_CLASS_CLASS = CommonsPackage.COMMENTABLE___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF___GET_OBJECT_CLASS = CommonsPackage.COMMENTABLE___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF___GET_STRING_CLASS = CommonsPackage.COMMENTABLE___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF___GET_ANNOTATION_INTERFACE = CommonsPackage.COMMENTABLE___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF___GET_CONTAINING_ANNOTATION_INSTANCE = CommonsPackage.COMMENTABLE___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF___GET_CONTAINING_ANONYMOUS_CLASS = CommonsPackage.COMMENTABLE___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF___GET_CONTAINING_CONCRETE_CLASSIFIER = CommonsPackage.COMMENTABLE___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF___GET_CONTAINING_COMPILATION_UNIT = CommonsPackage.COMMENTABLE___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF___GET_CONTAINING_PACKAGE_NAME = CommonsPackage.COMMENTABLE___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF___GET_CONTAINING_CONTAINER_NAME = CommonsPackage.COMMENTABLE___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF___GET_PARENT_CONCRETE_CLASSIFIER = CommonsPackage.COMMENTABLE___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF___GET_PARENT_BY_ETYPE__ECLASS = CommonsPackage.COMMENTABLE___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF___GET_FIRST_CHILD_BY_ETYPE__ECLASS = CommonsPackage.COMMENTABLE___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF___GET_PARENT_BY_TYPE__CLASS = CommonsPackage.COMMENTABLE___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF___GET_FIRST_CHILD_BY_TYPE__CLASS = CommonsPackage.COMMENTABLE___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF___GET_CHILDREN_BY_ETYPE__ECLASS = CommonsPackage.COMMENTABLE___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF___GET_CHILDREN_BY_TYPE__CLASS = CommonsPackage.COMMENTABLE___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF___GET_COMMENTS = CommonsPackage.COMMENTABLE___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = CommonsPackage.COMMENTABLE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = CommonsPackage.COMMENTABLE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The number of operations of the '<em>Self</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF_OPERATION_COUNT = CommonsPackage.COMMENTABLE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.BooleanLiteralImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.LiteralsPackageImpl#getBooleanLiteral()
     * @generated
     */
    int BOOLEAN_LITERAL = 2;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Boolean Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_LITERAL___GET_CONCRETE_CLASSIFIER__STRING = LITERAL___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_LITERAL___GET_CONCRETE_CLASSIFIER_PROXY__STRING = LITERAL___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_LITERAL___GET_CONCRETE_CLASSIFIERS__STRING_STRING = LITERAL___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_LITERAL___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = LITERAL___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_LITERAL___GET_LIB_CLASS__STRING = LITERAL___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_LITERAL___GET_LIB_INTERFACE__STRING = LITERAL___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_LITERAL___GET_CLASS_CLASS = LITERAL___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_LITERAL___GET_OBJECT_CLASS = LITERAL___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_LITERAL___GET_STRING_CLASS = LITERAL___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_LITERAL___GET_ANNOTATION_INTERFACE = LITERAL___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_LITERAL___GET_CONTAINING_ANNOTATION_INSTANCE = LITERAL___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_LITERAL___GET_CONTAINING_ANONYMOUS_CLASS = LITERAL___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_LITERAL___GET_CONTAINING_CONCRETE_CLASSIFIER = LITERAL___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_LITERAL___GET_CONTAINING_COMPILATION_UNIT = LITERAL___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_LITERAL___GET_CONTAINING_PACKAGE_NAME = LITERAL___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_LITERAL___GET_CONTAINING_CONTAINER_NAME = LITERAL___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_LITERAL___GET_PARENT_CONCRETE_CLASSIFIER = LITERAL___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_LITERAL___GET_PARENT_BY_ETYPE__ECLASS = LITERAL___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_LITERAL___GET_FIRST_CHILD_BY_ETYPE__ECLASS = LITERAL___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_LITERAL___GET_PARENT_BY_TYPE__CLASS = LITERAL___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_LITERAL___GET_FIRST_CHILD_BY_TYPE__CLASS = LITERAL___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_LITERAL___GET_CHILDREN_BY_ETYPE__ECLASS = LITERAL___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_LITERAL___GET_CHILDREN_BY_TYPE__CLASS = LITERAL___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_LITERAL___GET_COMMENTS = LITERAL___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_LITERAL___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = LITERAL___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_LITERAL___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = LITERAL___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_LITERAL___GET_TYPE = LITERAL___GET_TYPE;

    /**
     * The operation id for the '<em>Get Alternative Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_LITERAL___GET_ALTERNATIVE_TYPE = LITERAL___GET_ALTERNATIVE_TYPE;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_LITERAL___GET_ARRAY_DIMENSION = LITERAL___GET_ARRAY_DIMENSION;

    /**
     * The operation id for the '<em>Get One Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_LITERAL___GET_ONE_TYPE__BOOLEAN = LITERAL___GET_ONE_TYPE__BOOLEAN;

    /**
     * The number of operations of the '<em>Boolean Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_LITERAL_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.CharacterLiteralImpl <em>Character Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.CharacterLiteralImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.LiteralsPackageImpl#getCharacterLiteral()
     * @generated
     */
    int CHARACTER_LITERAL = 3;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTER_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Character Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTER_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTER_LITERAL___GET_CONCRETE_CLASSIFIER__STRING = LITERAL___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTER_LITERAL___GET_CONCRETE_CLASSIFIER_PROXY__STRING = LITERAL___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTER_LITERAL___GET_CONCRETE_CLASSIFIERS__STRING_STRING = LITERAL___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTER_LITERAL___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = LITERAL___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTER_LITERAL___GET_LIB_CLASS__STRING = LITERAL___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTER_LITERAL___GET_LIB_INTERFACE__STRING = LITERAL___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTER_LITERAL___GET_CLASS_CLASS = LITERAL___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTER_LITERAL___GET_OBJECT_CLASS = LITERAL___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTER_LITERAL___GET_STRING_CLASS = LITERAL___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTER_LITERAL___GET_ANNOTATION_INTERFACE = LITERAL___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTER_LITERAL___GET_CONTAINING_ANNOTATION_INSTANCE = LITERAL___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTER_LITERAL___GET_CONTAINING_ANONYMOUS_CLASS = LITERAL___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTER_LITERAL___GET_CONTAINING_CONCRETE_CLASSIFIER = LITERAL___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTER_LITERAL___GET_CONTAINING_COMPILATION_UNIT = LITERAL___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTER_LITERAL___GET_CONTAINING_PACKAGE_NAME = LITERAL___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTER_LITERAL___GET_CONTAINING_CONTAINER_NAME = LITERAL___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTER_LITERAL___GET_PARENT_CONCRETE_CLASSIFIER = LITERAL___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTER_LITERAL___GET_PARENT_BY_ETYPE__ECLASS = LITERAL___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTER_LITERAL___GET_FIRST_CHILD_BY_ETYPE__ECLASS = LITERAL___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTER_LITERAL___GET_PARENT_BY_TYPE__CLASS = LITERAL___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTER_LITERAL___GET_FIRST_CHILD_BY_TYPE__CLASS = LITERAL___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTER_LITERAL___GET_CHILDREN_BY_ETYPE__ECLASS = LITERAL___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTER_LITERAL___GET_CHILDREN_BY_TYPE__CLASS = LITERAL___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTER_LITERAL___GET_COMMENTS = LITERAL___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTER_LITERAL___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = LITERAL___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTER_LITERAL___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = LITERAL___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTER_LITERAL___GET_TYPE = LITERAL___GET_TYPE;

    /**
     * The operation id for the '<em>Get Alternative Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTER_LITERAL___GET_ALTERNATIVE_TYPE = LITERAL___GET_ALTERNATIVE_TYPE;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTER_LITERAL___GET_ARRAY_DIMENSION = LITERAL___GET_ARRAY_DIMENSION;

    /**
     * The operation id for the '<em>Get One Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTER_LITERAL___GET_ONE_TYPE__BOOLEAN = LITERAL___GET_ONE_TYPE__BOOLEAN;

    /**
     * The number of operations of the '<em>Character Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTER_LITERAL_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.FloatLiteralImpl <em>Float Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.FloatLiteralImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.LiteralsPackageImpl#getFloatLiteral()
     * @generated
     */
    int FLOAT_LITERAL = 4;

    /**
     * The number of structural features of the '<em>Float Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT_LITERAL___GET_CONCRETE_CLASSIFIER__STRING = LITERAL___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT_LITERAL___GET_CONCRETE_CLASSIFIER_PROXY__STRING = LITERAL___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT_LITERAL___GET_CONCRETE_CLASSIFIERS__STRING_STRING = LITERAL___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT_LITERAL___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = LITERAL___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT_LITERAL___GET_LIB_CLASS__STRING = LITERAL___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT_LITERAL___GET_LIB_INTERFACE__STRING = LITERAL___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT_LITERAL___GET_CLASS_CLASS = LITERAL___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT_LITERAL___GET_OBJECT_CLASS = LITERAL___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT_LITERAL___GET_STRING_CLASS = LITERAL___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT_LITERAL___GET_ANNOTATION_INTERFACE = LITERAL___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT_LITERAL___GET_CONTAINING_ANNOTATION_INSTANCE = LITERAL___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT_LITERAL___GET_CONTAINING_ANONYMOUS_CLASS = LITERAL___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT_LITERAL___GET_CONTAINING_CONCRETE_CLASSIFIER = LITERAL___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT_LITERAL___GET_CONTAINING_COMPILATION_UNIT = LITERAL___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT_LITERAL___GET_CONTAINING_PACKAGE_NAME = LITERAL___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT_LITERAL___GET_CONTAINING_CONTAINER_NAME = LITERAL___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT_LITERAL___GET_PARENT_CONCRETE_CLASSIFIER = LITERAL___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT_LITERAL___GET_PARENT_BY_ETYPE__ECLASS = LITERAL___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT_LITERAL___GET_FIRST_CHILD_BY_ETYPE__ECLASS = LITERAL___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT_LITERAL___GET_PARENT_BY_TYPE__CLASS = LITERAL___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT_LITERAL___GET_FIRST_CHILD_BY_TYPE__CLASS = LITERAL___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT_LITERAL___GET_CHILDREN_BY_ETYPE__ECLASS = LITERAL___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT_LITERAL___GET_CHILDREN_BY_TYPE__CLASS = LITERAL___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT_LITERAL___GET_COMMENTS = LITERAL___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT_LITERAL___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = LITERAL___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT_LITERAL___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = LITERAL___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT_LITERAL___GET_TYPE = LITERAL___GET_TYPE;

    /**
     * The operation id for the '<em>Get Alternative Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT_LITERAL___GET_ALTERNATIVE_TYPE = LITERAL___GET_ALTERNATIVE_TYPE;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT_LITERAL___GET_ARRAY_DIMENSION = LITERAL___GET_ARRAY_DIMENSION;

    /**
     * The operation id for the '<em>Get One Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT_LITERAL___GET_ONE_TYPE__BOOLEAN = LITERAL___GET_ONE_TYPE__BOOLEAN;

    /**
     * The number of operations of the '<em>Float Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT_LITERAL_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.DecimalFloatLiteralImpl <em>Decimal Float Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.DecimalFloatLiteralImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.LiteralsPackageImpl#getDecimalFloatLiteral()
     * @generated
     */
    int DECIMAL_FLOAT_LITERAL = 5;

    /**
     * The feature id for the '<em><b>Decimal Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_FLOAT_LITERAL__DECIMAL_VALUE = FLOAT_LITERAL_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Decimal Float Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_FLOAT_LITERAL_FEATURE_COUNT = FLOAT_LITERAL_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_FLOAT_LITERAL___GET_CONCRETE_CLASSIFIER__STRING = FLOAT_LITERAL___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_FLOAT_LITERAL___GET_CONCRETE_CLASSIFIER_PROXY__STRING = FLOAT_LITERAL___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_FLOAT_LITERAL___GET_CONCRETE_CLASSIFIERS__STRING_STRING = FLOAT_LITERAL___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_FLOAT_LITERAL___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = FLOAT_LITERAL___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_FLOAT_LITERAL___GET_LIB_CLASS__STRING = FLOAT_LITERAL___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_FLOAT_LITERAL___GET_LIB_INTERFACE__STRING = FLOAT_LITERAL___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_FLOAT_LITERAL___GET_CLASS_CLASS = FLOAT_LITERAL___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_FLOAT_LITERAL___GET_OBJECT_CLASS = FLOAT_LITERAL___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_FLOAT_LITERAL___GET_STRING_CLASS = FLOAT_LITERAL___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_FLOAT_LITERAL___GET_ANNOTATION_INTERFACE = FLOAT_LITERAL___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_FLOAT_LITERAL___GET_CONTAINING_ANNOTATION_INSTANCE = FLOAT_LITERAL___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_FLOAT_LITERAL___GET_CONTAINING_ANONYMOUS_CLASS = FLOAT_LITERAL___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_FLOAT_LITERAL___GET_CONTAINING_CONCRETE_CLASSIFIER = FLOAT_LITERAL___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_FLOAT_LITERAL___GET_CONTAINING_COMPILATION_UNIT = FLOAT_LITERAL___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_FLOAT_LITERAL___GET_CONTAINING_PACKAGE_NAME = FLOAT_LITERAL___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_FLOAT_LITERAL___GET_CONTAINING_CONTAINER_NAME = FLOAT_LITERAL___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_FLOAT_LITERAL___GET_PARENT_CONCRETE_CLASSIFIER = FLOAT_LITERAL___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_FLOAT_LITERAL___GET_PARENT_BY_ETYPE__ECLASS = FLOAT_LITERAL___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_FLOAT_LITERAL___GET_FIRST_CHILD_BY_ETYPE__ECLASS = FLOAT_LITERAL___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_FLOAT_LITERAL___GET_PARENT_BY_TYPE__CLASS = FLOAT_LITERAL___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_FLOAT_LITERAL___GET_FIRST_CHILD_BY_TYPE__CLASS = FLOAT_LITERAL___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_FLOAT_LITERAL___GET_CHILDREN_BY_ETYPE__ECLASS = FLOAT_LITERAL___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_FLOAT_LITERAL___GET_CHILDREN_BY_TYPE__CLASS = FLOAT_LITERAL___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_FLOAT_LITERAL___GET_COMMENTS = FLOAT_LITERAL___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_FLOAT_LITERAL___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = FLOAT_LITERAL___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_FLOAT_LITERAL___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = FLOAT_LITERAL___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_FLOAT_LITERAL___GET_TYPE = FLOAT_LITERAL___GET_TYPE;

    /**
     * The operation id for the '<em>Get Alternative Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_FLOAT_LITERAL___GET_ALTERNATIVE_TYPE = FLOAT_LITERAL___GET_ALTERNATIVE_TYPE;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_FLOAT_LITERAL___GET_ARRAY_DIMENSION = FLOAT_LITERAL___GET_ARRAY_DIMENSION;

    /**
     * The operation id for the '<em>Get One Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_FLOAT_LITERAL___GET_ONE_TYPE__BOOLEAN = FLOAT_LITERAL___GET_ONE_TYPE__BOOLEAN;

    /**
     * The number of operations of the '<em>Decimal Float Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_FLOAT_LITERAL_OPERATION_COUNT = FLOAT_LITERAL_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.HexFloatLiteralImpl <em>Hex Float Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.HexFloatLiteralImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.LiteralsPackageImpl#getHexFloatLiteral()
     * @generated
     */
    int HEX_FLOAT_LITERAL = 6;

    /**
     * The feature id for the '<em><b>Hex Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_FLOAT_LITERAL__HEX_VALUE = FLOAT_LITERAL_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Hex Float Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_FLOAT_LITERAL_FEATURE_COUNT = FLOAT_LITERAL_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_FLOAT_LITERAL___GET_CONCRETE_CLASSIFIER__STRING = FLOAT_LITERAL___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_FLOAT_LITERAL___GET_CONCRETE_CLASSIFIER_PROXY__STRING = FLOAT_LITERAL___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_FLOAT_LITERAL___GET_CONCRETE_CLASSIFIERS__STRING_STRING = FLOAT_LITERAL___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_FLOAT_LITERAL___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = FLOAT_LITERAL___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_FLOAT_LITERAL___GET_LIB_CLASS__STRING = FLOAT_LITERAL___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_FLOAT_LITERAL___GET_LIB_INTERFACE__STRING = FLOAT_LITERAL___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_FLOAT_LITERAL___GET_CLASS_CLASS = FLOAT_LITERAL___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_FLOAT_LITERAL___GET_OBJECT_CLASS = FLOAT_LITERAL___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_FLOAT_LITERAL___GET_STRING_CLASS = FLOAT_LITERAL___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_FLOAT_LITERAL___GET_ANNOTATION_INTERFACE = FLOAT_LITERAL___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_FLOAT_LITERAL___GET_CONTAINING_ANNOTATION_INSTANCE = FLOAT_LITERAL___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_FLOAT_LITERAL___GET_CONTAINING_ANONYMOUS_CLASS = FLOAT_LITERAL___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_FLOAT_LITERAL___GET_CONTAINING_CONCRETE_CLASSIFIER = FLOAT_LITERAL___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_FLOAT_LITERAL___GET_CONTAINING_COMPILATION_UNIT = FLOAT_LITERAL___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_FLOAT_LITERAL___GET_CONTAINING_PACKAGE_NAME = FLOAT_LITERAL___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_FLOAT_LITERAL___GET_CONTAINING_CONTAINER_NAME = FLOAT_LITERAL___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_FLOAT_LITERAL___GET_PARENT_CONCRETE_CLASSIFIER = FLOAT_LITERAL___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_FLOAT_LITERAL___GET_PARENT_BY_ETYPE__ECLASS = FLOAT_LITERAL___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_FLOAT_LITERAL___GET_FIRST_CHILD_BY_ETYPE__ECLASS = FLOAT_LITERAL___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_FLOAT_LITERAL___GET_PARENT_BY_TYPE__CLASS = FLOAT_LITERAL___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_FLOAT_LITERAL___GET_FIRST_CHILD_BY_TYPE__CLASS = FLOAT_LITERAL___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_FLOAT_LITERAL___GET_CHILDREN_BY_ETYPE__ECLASS = FLOAT_LITERAL___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_FLOAT_LITERAL___GET_CHILDREN_BY_TYPE__CLASS = FLOAT_LITERAL___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_FLOAT_LITERAL___GET_COMMENTS = FLOAT_LITERAL___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_FLOAT_LITERAL___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = FLOAT_LITERAL___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_FLOAT_LITERAL___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = FLOAT_LITERAL___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_FLOAT_LITERAL___GET_TYPE = FLOAT_LITERAL___GET_TYPE;

    /**
     * The operation id for the '<em>Get Alternative Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_FLOAT_LITERAL___GET_ALTERNATIVE_TYPE = FLOAT_LITERAL___GET_ALTERNATIVE_TYPE;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_FLOAT_LITERAL___GET_ARRAY_DIMENSION = FLOAT_LITERAL___GET_ARRAY_DIMENSION;

    /**
     * The operation id for the '<em>Get One Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_FLOAT_LITERAL___GET_ONE_TYPE__BOOLEAN = FLOAT_LITERAL___GET_ONE_TYPE__BOOLEAN;

    /**
     * The number of operations of the '<em>Hex Float Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_FLOAT_LITERAL_OPERATION_COUNT = FLOAT_LITERAL_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.DoubleLiteralImpl <em>Double Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.DoubleLiteralImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.LiteralsPackageImpl#getDoubleLiteral()
     * @generated
     */
    int DOUBLE_LITERAL = 7;

    /**
     * The number of structural features of the '<em>Double Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE_LITERAL___GET_CONCRETE_CLASSIFIER__STRING = LITERAL___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE_LITERAL___GET_CONCRETE_CLASSIFIER_PROXY__STRING = LITERAL___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE_LITERAL___GET_CONCRETE_CLASSIFIERS__STRING_STRING = LITERAL___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE_LITERAL___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = LITERAL___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE_LITERAL___GET_LIB_CLASS__STRING = LITERAL___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE_LITERAL___GET_LIB_INTERFACE__STRING = LITERAL___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE_LITERAL___GET_CLASS_CLASS = LITERAL___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE_LITERAL___GET_OBJECT_CLASS = LITERAL___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE_LITERAL___GET_STRING_CLASS = LITERAL___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE_LITERAL___GET_ANNOTATION_INTERFACE = LITERAL___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE_LITERAL___GET_CONTAINING_ANNOTATION_INSTANCE = LITERAL___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE_LITERAL___GET_CONTAINING_ANONYMOUS_CLASS = LITERAL___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE_LITERAL___GET_CONTAINING_CONCRETE_CLASSIFIER = LITERAL___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE_LITERAL___GET_CONTAINING_COMPILATION_UNIT = LITERAL___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE_LITERAL___GET_CONTAINING_PACKAGE_NAME = LITERAL___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE_LITERAL___GET_CONTAINING_CONTAINER_NAME = LITERAL___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE_LITERAL___GET_PARENT_CONCRETE_CLASSIFIER = LITERAL___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE_LITERAL___GET_PARENT_BY_ETYPE__ECLASS = LITERAL___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE_LITERAL___GET_FIRST_CHILD_BY_ETYPE__ECLASS = LITERAL___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE_LITERAL___GET_PARENT_BY_TYPE__CLASS = LITERAL___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE_LITERAL___GET_FIRST_CHILD_BY_TYPE__CLASS = LITERAL___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE_LITERAL___GET_CHILDREN_BY_ETYPE__ECLASS = LITERAL___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE_LITERAL___GET_CHILDREN_BY_TYPE__CLASS = LITERAL___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE_LITERAL___GET_COMMENTS = LITERAL___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE_LITERAL___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = LITERAL___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE_LITERAL___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = LITERAL___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE_LITERAL___GET_TYPE = LITERAL___GET_TYPE;

    /**
     * The operation id for the '<em>Get Alternative Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE_LITERAL___GET_ALTERNATIVE_TYPE = LITERAL___GET_ALTERNATIVE_TYPE;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE_LITERAL___GET_ARRAY_DIMENSION = LITERAL___GET_ARRAY_DIMENSION;

    /**
     * The operation id for the '<em>Get One Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE_LITERAL___GET_ONE_TYPE__BOOLEAN = LITERAL___GET_ONE_TYPE__BOOLEAN;

    /**
     * The number of operations of the '<em>Double Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE_LITERAL_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.DecimalDoubleLiteralImpl <em>Decimal Double Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.DecimalDoubleLiteralImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.LiteralsPackageImpl#getDecimalDoubleLiteral()
     * @generated
     */
    int DECIMAL_DOUBLE_LITERAL = 8;

    /**
     * The feature id for the '<em><b>Decimal Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_DOUBLE_LITERAL__DECIMAL_VALUE = DOUBLE_LITERAL_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Decimal Double Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_DOUBLE_LITERAL_FEATURE_COUNT = DOUBLE_LITERAL_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_DOUBLE_LITERAL___GET_CONCRETE_CLASSIFIER__STRING = DOUBLE_LITERAL___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_DOUBLE_LITERAL___GET_CONCRETE_CLASSIFIER_PROXY__STRING = DOUBLE_LITERAL___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_DOUBLE_LITERAL___GET_CONCRETE_CLASSIFIERS__STRING_STRING = DOUBLE_LITERAL___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_DOUBLE_LITERAL___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = DOUBLE_LITERAL___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_DOUBLE_LITERAL___GET_LIB_CLASS__STRING = DOUBLE_LITERAL___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_DOUBLE_LITERAL___GET_LIB_INTERFACE__STRING = DOUBLE_LITERAL___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_DOUBLE_LITERAL___GET_CLASS_CLASS = DOUBLE_LITERAL___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_DOUBLE_LITERAL___GET_OBJECT_CLASS = DOUBLE_LITERAL___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_DOUBLE_LITERAL___GET_STRING_CLASS = DOUBLE_LITERAL___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_DOUBLE_LITERAL___GET_ANNOTATION_INTERFACE = DOUBLE_LITERAL___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_DOUBLE_LITERAL___GET_CONTAINING_ANNOTATION_INSTANCE = DOUBLE_LITERAL___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_DOUBLE_LITERAL___GET_CONTAINING_ANONYMOUS_CLASS = DOUBLE_LITERAL___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_DOUBLE_LITERAL___GET_CONTAINING_CONCRETE_CLASSIFIER = DOUBLE_LITERAL___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_DOUBLE_LITERAL___GET_CONTAINING_COMPILATION_UNIT = DOUBLE_LITERAL___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_DOUBLE_LITERAL___GET_CONTAINING_PACKAGE_NAME = DOUBLE_LITERAL___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_DOUBLE_LITERAL___GET_CONTAINING_CONTAINER_NAME = DOUBLE_LITERAL___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_DOUBLE_LITERAL___GET_PARENT_CONCRETE_CLASSIFIER = DOUBLE_LITERAL___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_DOUBLE_LITERAL___GET_PARENT_BY_ETYPE__ECLASS = DOUBLE_LITERAL___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_DOUBLE_LITERAL___GET_FIRST_CHILD_BY_ETYPE__ECLASS = DOUBLE_LITERAL___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_DOUBLE_LITERAL___GET_PARENT_BY_TYPE__CLASS = DOUBLE_LITERAL___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_DOUBLE_LITERAL___GET_FIRST_CHILD_BY_TYPE__CLASS = DOUBLE_LITERAL___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_DOUBLE_LITERAL___GET_CHILDREN_BY_ETYPE__ECLASS = DOUBLE_LITERAL___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_DOUBLE_LITERAL___GET_CHILDREN_BY_TYPE__CLASS = DOUBLE_LITERAL___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_DOUBLE_LITERAL___GET_COMMENTS = DOUBLE_LITERAL___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_DOUBLE_LITERAL___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = DOUBLE_LITERAL___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_DOUBLE_LITERAL___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = DOUBLE_LITERAL___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_DOUBLE_LITERAL___GET_TYPE = DOUBLE_LITERAL___GET_TYPE;

    /**
     * The operation id for the '<em>Get Alternative Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_DOUBLE_LITERAL___GET_ALTERNATIVE_TYPE = DOUBLE_LITERAL___GET_ALTERNATIVE_TYPE;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_DOUBLE_LITERAL___GET_ARRAY_DIMENSION = DOUBLE_LITERAL___GET_ARRAY_DIMENSION;

    /**
     * The operation id for the '<em>Get One Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_DOUBLE_LITERAL___GET_ONE_TYPE__BOOLEAN = DOUBLE_LITERAL___GET_ONE_TYPE__BOOLEAN;

    /**
     * The number of operations of the '<em>Decimal Double Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_DOUBLE_LITERAL_OPERATION_COUNT = DOUBLE_LITERAL_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.HexDoubleLiteralImpl <em>Hex Double Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.HexDoubleLiteralImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.LiteralsPackageImpl#getHexDoubleLiteral()
     * @generated
     */
    int HEX_DOUBLE_LITERAL = 9;

    /**
     * The feature id for the '<em><b>Hex Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_DOUBLE_LITERAL__HEX_VALUE = DOUBLE_LITERAL_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Hex Double Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_DOUBLE_LITERAL_FEATURE_COUNT = DOUBLE_LITERAL_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_DOUBLE_LITERAL___GET_CONCRETE_CLASSIFIER__STRING = DOUBLE_LITERAL___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_DOUBLE_LITERAL___GET_CONCRETE_CLASSIFIER_PROXY__STRING = DOUBLE_LITERAL___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_DOUBLE_LITERAL___GET_CONCRETE_CLASSIFIERS__STRING_STRING = DOUBLE_LITERAL___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_DOUBLE_LITERAL___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = DOUBLE_LITERAL___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_DOUBLE_LITERAL___GET_LIB_CLASS__STRING = DOUBLE_LITERAL___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_DOUBLE_LITERAL___GET_LIB_INTERFACE__STRING = DOUBLE_LITERAL___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_DOUBLE_LITERAL___GET_CLASS_CLASS = DOUBLE_LITERAL___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_DOUBLE_LITERAL___GET_OBJECT_CLASS = DOUBLE_LITERAL___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_DOUBLE_LITERAL___GET_STRING_CLASS = DOUBLE_LITERAL___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_DOUBLE_LITERAL___GET_ANNOTATION_INTERFACE = DOUBLE_LITERAL___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_DOUBLE_LITERAL___GET_CONTAINING_ANNOTATION_INSTANCE = DOUBLE_LITERAL___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_DOUBLE_LITERAL___GET_CONTAINING_ANONYMOUS_CLASS = DOUBLE_LITERAL___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_DOUBLE_LITERAL___GET_CONTAINING_CONCRETE_CLASSIFIER = DOUBLE_LITERAL___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_DOUBLE_LITERAL___GET_CONTAINING_COMPILATION_UNIT = DOUBLE_LITERAL___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_DOUBLE_LITERAL___GET_CONTAINING_PACKAGE_NAME = DOUBLE_LITERAL___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_DOUBLE_LITERAL___GET_CONTAINING_CONTAINER_NAME = DOUBLE_LITERAL___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_DOUBLE_LITERAL___GET_PARENT_CONCRETE_CLASSIFIER = DOUBLE_LITERAL___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_DOUBLE_LITERAL___GET_PARENT_BY_ETYPE__ECLASS = DOUBLE_LITERAL___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_DOUBLE_LITERAL___GET_FIRST_CHILD_BY_ETYPE__ECLASS = DOUBLE_LITERAL___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_DOUBLE_LITERAL___GET_PARENT_BY_TYPE__CLASS = DOUBLE_LITERAL___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_DOUBLE_LITERAL___GET_FIRST_CHILD_BY_TYPE__CLASS = DOUBLE_LITERAL___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_DOUBLE_LITERAL___GET_CHILDREN_BY_ETYPE__ECLASS = DOUBLE_LITERAL___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_DOUBLE_LITERAL___GET_CHILDREN_BY_TYPE__CLASS = DOUBLE_LITERAL___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_DOUBLE_LITERAL___GET_COMMENTS = DOUBLE_LITERAL___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_DOUBLE_LITERAL___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = DOUBLE_LITERAL___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_DOUBLE_LITERAL___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = DOUBLE_LITERAL___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_DOUBLE_LITERAL___GET_TYPE = DOUBLE_LITERAL___GET_TYPE;

    /**
     * The operation id for the '<em>Get Alternative Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_DOUBLE_LITERAL___GET_ALTERNATIVE_TYPE = DOUBLE_LITERAL___GET_ALTERNATIVE_TYPE;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_DOUBLE_LITERAL___GET_ARRAY_DIMENSION = DOUBLE_LITERAL___GET_ARRAY_DIMENSION;

    /**
     * The operation id for the '<em>Get One Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_DOUBLE_LITERAL___GET_ONE_TYPE__BOOLEAN = DOUBLE_LITERAL___GET_ONE_TYPE__BOOLEAN;

    /**
     * The number of operations of the '<em>Hex Double Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_DOUBLE_LITERAL_OPERATION_COUNT = DOUBLE_LITERAL_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.IntegerLiteralImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.LiteralsPackageImpl#getIntegerLiteral()
     * @generated
     */
    int INTEGER_LITERAL = 10;

    /**
     * The number of structural features of the '<em>Integer Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTEGER_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTEGER_LITERAL___GET_CONCRETE_CLASSIFIER__STRING = LITERAL___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTEGER_LITERAL___GET_CONCRETE_CLASSIFIER_PROXY__STRING = LITERAL___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTEGER_LITERAL___GET_CONCRETE_CLASSIFIERS__STRING_STRING = LITERAL___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTEGER_LITERAL___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = LITERAL___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTEGER_LITERAL___GET_LIB_CLASS__STRING = LITERAL___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTEGER_LITERAL___GET_LIB_INTERFACE__STRING = LITERAL___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTEGER_LITERAL___GET_CLASS_CLASS = LITERAL___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTEGER_LITERAL___GET_OBJECT_CLASS = LITERAL___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTEGER_LITERAL___GET_STRING_CLASS = LITERAL___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTEGER_LITERAL___GET_ANNOTATION_INTERFACE = LITERAL___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTEGER_LITERAL___GET_CONTAINING_ANNOTATION_INSTANCE = LITERAL___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTEGER_LITERAL___GET_CONTAINING_ANONYMOUS_CLASS = LITERAL___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTEGER_LITERAL___GET_CONTAINING_CONCRETE_CLASSIFIER = LITERAL___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTEGER_LITERAL___GET_CONTAINING_COMPILATION_UNIT = LITERAL___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTEGER_LITERAL___GET_CONTAINING_PACKAGE_NAME = LITERAL___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTEGER_LITERAL___GET_CONTAINING_CONTAINER_NAME = LITERAL___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTEGER_LITERAL___GET_PARENT_CONCRETE_CLASSIFIER = LITERAL___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTEGER_LITERAL___GET_PARENT_BY_ETYPE__ECLASS = LITERAL___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTEGER_LITERAL___GET_FIRST_CHILD_BY_ETYPE__ECLASS = LITERAL___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTEGER_LITERAL___GET_PARENT_BY_TYPE__CLASS = LITERAL___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTEGER_LITERAL___GET_FIRST_CHILD_BY_TYPE__CLASS = LITERAL___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTEGER_LITERAL___GET_CHILDREN_BY_ETYPE__ECLASS = LITERAL___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTEGER_LITERAL___GET_CHILDREN_BY_TYPE__CLASS = LITERAL___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTEGER_LITERAL___GET_COMMENTS = LITERAL___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTEGER_LITERAL___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = LITERAL___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTEGER_LITERAL___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = LITERAL___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTEGER_LITERAL___GET_TYPE = LITERAL___GET_TYPE;

    /**
     * The operation id for the '<em>Get Alternative Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTEGER_LITERAL___GET_ALTERNATIVE_TYPE = LITERAL___GET_ALTERNATIVE_TYPE;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTEGER_LITERAL___GET_ARRAY_DIMENSION = LITERAL___GET_ARRAY_DIMENSION;

    /**
     * The operation id for the '<em>Get One Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTEGER_LITERAL___GET_ONE_TYPE__BOOLEAN = LITERAL___GET_ONE_TYPE__BOOLEAN;

    /**
     * The number of operations of the '<em>Integer Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTEGER_LITERAL_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.DecimalIntegerLiteralImpl <em>Decimal Integer Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.DecimalIntegerLiteralImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.LiteralsPackageImpl#getDecimalIntegerLiteral()
     * @generated
     */
    int DECIMAL_INTEGER_LITERAL = 11;

    /**
     * The feature id for the '<em><b>Decimal Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_INTEGER_LITERAL__DECIMAL_VALUE = INTEGER_LITERAL_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Decimal Integer Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_INTEGER_LITERAL_FEATURE_COUNT = INTEGER_LITERAL_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_INTEGER_LITERAL___GET_CONCRETE_CLASSIFIER__STRING = INTEGER_LITERAL___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_INTEGER_LITERAL___GET_CONCRETE_CLASSIFIER_PROXY__STRING = INTEGER_LITERAL___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_INTEGER_LITERAL___GET_CONCRETE_CLASSIFIERS__STRING_STRING = INTEGER_LITERAL___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_INTEGER_LITERAL___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = INTEGER_LITERAL___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_INTEGER_LITERAL___GET_LIB_CLASS__STRING = INTEGER_LITERAL___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_INTEGER_LITERAL___GET_LIB_INTERFACE__STRING = INTEGER_LITERAL___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_INTEGER_LITERAL___GET_CLASS_CLASS = INTEGER_LITERAL___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_INTEGER_LITERAL___GET_OBJECT_CLASS = INTEGER_LITERAL___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_INTEGER_LITERAL___GET_STRING_CLASS = INTEGER_LITERAL___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_INTEGER_LITERAL___GET_ANNOTATION_INTERFACE = INTEGER_LITERAL___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_INTEGER_LITERAL___GET_CONTAINING_ANNOTATION_INSTANCE = INTEGER_LITERAL___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_INTEGER_LITERAL___GET_CONTAINING_ANONYMOUS_CLASS = INTEGER_LITERAL___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_INTEGER_LITERAL___GET_CONTAINING_CONCRETE_CLASSIFIER = INTEGER_LITERAL___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_INTEGER_LITERAL___GET_CONTAINING_COMPILATION_UNIT = INTEGER_LITERAL___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_INTEGER_LITERAL___GET_CONTAINING_PACKAGE_NAME = INTEGER_LITERAL___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_INTEGER_LITERAL___GET_CONTAINING_CONTAINER_NAME = INTEGER_LITERAL___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_INTEGER_LITERAL___GET_PARENT_CONCRETE_CLASSIFIER = INTEGER_LITERAL___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_INTEGER_LITERAL___GET_PARENT_BY_ETYPE__ECLASS = INTEGER_LITERAL___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_INTEGER_LITERAL___GET_FIRST_CHILD_BY_ETYPE__ECLASS = INTEGER_LITERAL___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_INTEGER_LITERAL___GET_PARENT_BY_TYPE__CLASS = INTEGER_LITERAL___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_INTEGER_LITERAL___GET_FIRST_CHILD_BY_TYPE__CLASS = INTEGER_LITERAL___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_INTEGER_LITERAL___GET_CHILDREN_BY_ETYPE__ECLASS = INTEGER_LITERAL___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_INTEGER_LITERAL___GET_CHILDREN_BY_TYPE__CLASS = INTEGER_LITERAL___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_INTEGER_LITERAL___GET_COMMENTS = INTEGER_LITERAL___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_INTEGER_LITERAL___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = INTEGER_LITERAL___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_INTEGER_LITERAL___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = INTEGER_LITERAL___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_INTEGER_LITERAL___GET_TYPE = INTEGER_LITERAL___GET_TYPE;

    /**
     * The operation id for the '<em>Get Alternative Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_INTEGER_LITERAL___GET_ALTERNATIVE_TYPE = INTEGER_LITERAL___GET_ALTERNATIVE_TYPE;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_INTEGER_LITERAL___GET_ARRAY_DIMENSION = INTEGER_LITERAL___GET_ARRAY_DIMENSION;

    /**
     * The operation id for the '<em>Get One Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_INTEGER_LITERAL___GET_ONE_TYPE__BOOLEAN = INTEGER_LITERAL___GET_ONE_TYPE__BOOLEAN;

    /**
     * The number of operations of the '<em>Decimal Integer Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_INTEGER_LITERAL_OPERATION_COUNT = INTEGER_LITERAL_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.HexIntegerLiteralImpl <em>Hex Integer Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.HexIntegerLiteralImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.LiteralsPackageImpl#getHexIntegerLiteral()
     * @generated
     */
    int HEX_INTEGER_LITERAL = 12;

    /**
     * The feature id for the '<em><b>Hex Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_INTEGER_LITERAL__HEX_VALUE = INTEGER_LITERAL_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Hex Integer Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_INTEGER_LITERAL_FEATURE_COUNT = INTEGER_LITERAL_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_INTEGER_LITERAL___GET_CONCRETE_CLASSIFIER__STRING = INTEGER_LITERAL___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_INTEGER_LITERAL___GET_CONCRETE_CLASSIFIER_PROXY__STRING = INTEGER_LITERAL___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_INTEGER_LITERAL___GET_CONCRETE_CLASSIFIERS__STRING_STRING = INTEGER_LITERAL___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_INTEGER_LITERAL___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = INTEGER_LITERAL___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_INTEGER_LITERAL___GET_LIB_CLASS__STRING = INTEGER_LITERAL___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_INTEGER_LITERAL___GET_LIB_INTERFACE__STRING = INTEGER_LITERAL___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_INTEGER_LITERAL___GET_CLASS_CLASS = INTEGER_LITERAL___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_INTEGER_LITERAL___GET_OBJECT_CLASS = INTEGER_LITERAL___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_INTEGER_LITERAL___GET_STRING_CLASS = INTEGER_LITERAL___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_INTEGER_LITERAL___GET_ANNOTATION_INTERFACE = INTEGER_LITERAL___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_INTEGER_LITERAL___GET_CONTAINING_ANNOTATION_INSTANCE = INTEGER_LITERAL___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_INTEGER_LITERAL___GET_CONTAINING_ANONYMOUS_CLASS = INTEGER_LITERAL___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_INTEGER_LITERAL___GET_CONTAINING_CONCRETE_CLASSIFIER = INTEGER_LITERAL___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_INTEGER_LITERAL___GET_CONTAINING_COMPILATION_UNIT = INTEGER_LITERAL___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_INTEGER_LITERAL___GET_CONTAINING_PACKAGE_NAME = INTEGER_LITERAL___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_INTEGER_LITERAL___GET_CONTAINING_CONTAINER_NAME = INTEGER_LITERAL___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_INTEGER_LITERAL___GET_PARENT_CONCRETE_CLASSIFIER = INTEGER_LITERAL___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_INTEGER_LITERAL___GET_PARENT_BY_ETYPE__ECLASS = INTEGER_LITERAL___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_INTEGER_LITERAL___GET_FIRST_CHILD_BY_ETYPE__ECLASS = INTEGER_LITERAL___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_INTEGER_LITERAL___GET_PARENT_BY_TYPE__CLASS = INTEGER_LITERAL___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_INTEGER_LITERAL___GET_FIRST_CHILD_BY_TYPE__CLASS = INTEGER_LITERAL___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_INTEGER_LITERAL___GET_CHILDREN_BY_ETYPE__ECLASS = INTEGER_LITERAL___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_INTEGER_LITERAL___GET_CHILDREN_BY_TYPE__CLASS = INTEGER_LITERAL___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_INTEGER_LITERAL___GET_COMMENTS = INTEGER_LITERAL___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_INTEGER_LITERAL___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = INTEGER_LITERAL___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_INTEGER_LITERAL___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = INTEGER_LITERAL___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_INTEGER_LITERAL___GET_TYPE = INTEGER_LITERAL___GET_TYPE;

    /**
     * The operation id for the '<em>Get Alternative Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_INTEGER_LITERAL___GET_ALTERNATIVE_TYPE = INTEGER_LITERAL___GET_ALTERNATIVE_TYPE;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_INTEGER_LITERAL___GET_ARRAY_DIMENSION = INTEGER_LITERAL___GET_ARRAY_DIMENSION;

    /**
     * The operation id for the '<em>Get One Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_INTEGER_LITERAL___GET_ONE_TYPE__BOOLEAN = INTEGER_LITERAL___GET_ONE_TYPE__BOOLEAN;

    /**
     * The number of operations of the '<em>Hex Integer Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_INTEGER_LITERAL_OPERATION_COUNT = INTEGER_LITERAL_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.OctalIntegerLiteralImpl <em>Octal Integer Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.OctalIntegerLiteralImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.LiteralsPackageImpl#getOctalIntegerLiteral()
     * @generated
     */
    int OCTAL_INTEGER_LITERAL = 13;

    /**
     * The feature id for the '<em><b>Octal Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCTAL_INTEGER_LITERAL__OCTAL_VALUE = INTEGER_LITERAL_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Octal Integer Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCTAL_INTEGER_LITERAL_FEATURE_COUNT = INTEGER_LITERAL_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCTAL_INTEGER_LITERAL___GET_CONCRETE_CLASSIFIER__STRING = INTEGER_LITERAL___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCTAL_INTEGER_LITERAL___GET_CONCRETE_CLASSIFIER_PROXY__STRING = INTEGER_LITERAL___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCTAL_INTEGER_LITERAL___GET_CONCRETE_CLASSIFIERS__STRING_STRING = INTEGER_LITERAL___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCTAL_INTEGER_LITERAL___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = INTEGER_LITERAL___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCTAL_INTEGER_LITERAL___GET_LIB_CLASS__STRING = INTEGER_LITERAL___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCTAL_INTEGER_LITERAL___GET_LIB_INTERFACE__STRING = INTEGER_LITERAL___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCTAL_INTEGER_LITERAL___GET_CLASS_CLASS = INTEGER_LITERAL___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCTAL_INTEGER_LITERAL___GET_OBJECT_CLASS = INTEGER_LITERAL___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCTAL_INTEGER_LITERAL___GET_STRING_CLASS = INTEGER_LITERAL___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCTAL_INTEGER_LITERAL___GET_ANNOTATION_INTERFACE = INTEGER_LITERAL___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCTAL_INTEGER_LITERAL___GET_CONTAINING_ANNOTATION_INSTANCE = INTEGER_LITERAL___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCTAL_INTEGER_LITERAL___GET_CONTAINING_ANONYMOUS_CLASS = INTEGER_LITERAL___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCTAL_INTEGER_LITERAL___GET_CONTAINING_CONCRETE_CLASSIFIER = INTEGER_LITERAL___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCTAL_INTEGER_LITERAL___GET_CONTAINING_COMPILATION_UNIT = INTEGER_LITERAL___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCTAL_INTEGER_LITERAL___GET_CONTAINING_PACKAGE_NAME = INTEGER_LITERAL___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCTAL_INTEGER_LITERAL___GET_CONTAINING_CONTAINER_NAME = INTEGER_LITERAL___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCTAL_INTEGER_LITERAL___GET_PARENT_CONCRETE_CLASSIFIER = INTEGER_LITERAL___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCTAL_INTEGER_LITERAL___GET_PARENT_BY_ETYPE__ECLASS = INTEGER_LITERAL___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCTAL_INTEGER_LITERAL___GET_FIRST_CHILD_BY_ETYPE__ECLASS = INTEGER_LITERAL___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCTAL_INTEGER_LITERAL___GET_PARENT_BY_TYPE__CLASS = INTEGER_LITERAL___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCTAL_INTEGER_LITERAL___GET_FIRST_CHILD_BY_TYPE__CLASS = INTEGER_LITERAL___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCTAL_INTEGER_LITERAL___GET_CHILDREN_BY_ETYPE__ECLASS = INTEGER_LITERAL___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCTAL_INTEGER_LITERAL___GET_CHILDREN_BY_TYPE__CLASS = INTEGER_LITERAL___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCTAL_INTEGER_LITERAL___GET_COMMENTS = INTEGER_LITERAL___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCTAL_INTEGER_LITERAL___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = INTEGER_LITERAL___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCTAL_INTEGER_LITERAL___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = INTEGER_LITERAL___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCTAL_INTEGER_LITERAL___GET_TYPE = INTEGER_LITERAL___GET_TYPE;

    /**
     * The operation id for the '<em>Get Alternative Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCTAL_INTEGER_LITERAL___GET_ALTERNATIVE_TYPE = INTEGER_LITERAL___GET_ALTERNATIVE_TYPE;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCTAL_INTEGER_LITERAL___GET_ARRAY_DIMENSION = INTEGER_LITERAL___GET_ARRAY_DIMENSION;

    /**
     * The operation id for the '<em>Get One Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCTAL_INTEGER_LITERAL___GET_ONE_TYPE__BOOLEAN = INTEGER_LITERAL___GET_ONE_TYPE__BOOLEAN;

    /**
     * The number of operations of the '<em>Octal Integer Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCTAL_INTEGER_LITERAL_OPERATION_COUNT = INTEGER_LITERAL_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.LongLiteralImpl <em>Long Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.LongLiteralImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.LiteralsPackageImpl#getLongLiteral()
     * @generated
     */
    int LONG_LITERAL = 14;

    /**
     * The number of structural features of the '<em>Long Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG_LITERAL___GET_CONCRETE_CLASSIFIER__STRING = LITERAL___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG_LITERAL___GET_CONCRETE_CLASSIFIER_PROXY__STRING = LITERAL___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG_LITERAL___GET_CONCRETE_CLASSIFIERS__STRING_STRING = LITERAL___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG_LITERAL___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = LITERAL___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG_LITERAL___GET_LIB_CLASS__STRING = LITERAL___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG_LITERAL___GET_LIB_INTERFACE__STRING = LITERAL___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG_LITERAL___GET_CLASS_CLASS = LITERAL___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG_LITERAL___GET_OBJECT_CLASS = LITERAL___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG_LITERAL___GET_STRING_CLASS = LITERAL___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG_LITERAL___GET_ANNOTATION_INTERFACE = LITERAL___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG_LITERAL___GET_CONTAINING_ANNOTATION_INSTANCE = LITERAL___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG_LITERAL___GET_CONTAINING_ANONYMOUS_CLASS = LITERAL___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG_LITERAL___GET_CONTAINING_CONCRETE_CLASSIFIER = LITERAL___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG_LITERAL___GET_CONTAINING_COMPILATION_UNIT = LITERAL___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG_LITERAL___GET_CONTAINING_PACKAGE_NAME = LITERAL___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG_LITERAL___GET_CONTAINING_CONTAINER_NAME = LITERAL___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG_LITERAL___GET_PARENT_CONCRETE_CLASSIFIER = LITERAL___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG_LITERAL___GET_PARENT_BY_ETYPE__ECLASS = LITERAL___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG_LITERAL___GET_FIRST_CHILD_BY_ETYPE__ECLASS = LITERAL___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG_LITERAL___GET_PARENT_BY_TYPE__CLASS = LITERAL___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG_LITERAL___GET_FIRST_CHILD_BY_TYPE__CLASS = LITERAL___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG_LITERAL___GET_CHILDREN_BY_ETYPE__ECLASS = LITERAL___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG_LITERAL___GET_CHILDREN_BY_TYPE__CLASS = LITERAL___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG_LITERAL___GET_COMMENTS = LITERAL___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG_LITERAL___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = LITERAL___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG_LITERAL___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = LITERAL___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG_LITERAL___GET_TYPE = LITERAL___GET_TYPE;

    /**
     * The operation id for the '<em>Get Alternative Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG_LITERAL___GET_ALTERNATIVE_TYPE = LITERAL___GET_ALTERNATIVE_TYPE;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG_LITERAL___GET_ARRAY_DIMENSION = LITERAL___GET_ARRAY_DIMENSION;

    /**
     * The operation id for the '<em>Get One Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG_LITERAL___GET_ONE_TYPE__BOOLEAN = LITERAL___GET_ONE_TYPE__BOOLEAN;

    /**
     * The number of operations of the '<em>Long Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG_LITERAL_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.DecimalLongLiteralImpl <em>Decimal Long Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.DecimalLongLiteralImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.LiteralsPackageImpl#getDecimalLongLiteral()
     * @generated
     */
    int DECIMAL_LONG_LITERAL = 15;

    /**
     * The feature id for the '<em><b>Decimal Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_LONG_LITERAL__DECIMAL_VALUE = LONG_LITERAL_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Decimal Long Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_LONG_LITERAL_FEATURE_COUNT = LONG_LITERAL_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_LONG_LITERAL___GET_CONCRETE_CLASSIFIER__STRING = LONG_LITERAL___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_LONG_LITERAL___GET_CONCRETE_CLASSIFIER_PROXY__STRING = LONG_LITERAL___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_LONG_LITERAL___GET_CONCRETE_CLASSIFIERS__STRING_STRING = LONG_LITERAL___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_LONG_LITERAL___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = LONG_LITERAL___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_LONG_LITERAL___GET_LIB_CLASS__STRING = LONG_LITERAL___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_LONG_LITERAL___GET_LIB_INTERFACE__STRING = LONG_LITERAL___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_LONG_LITERAL___GET_CLASS_CLASS = LONG_LITERAL___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_LONG_LITERAL___GET_OBJECT_CLASS = LONG_LITERAL___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_LONG_LITERAL___GET_STRING_CLASS = LONG_LITERAL___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_LONG_LITERAL___GET_ANNOTATION_INTERFACE = LONG_LITERAL___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_LONG_LITERAL___GET_CONTAINING_ANNOTATION_INSTANCE = LONG_LITERAL___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_LONG_LITERAL___GET_CONTAINING_ANONYMOUS_CLASS = LONG_LITERAL___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_LONG_LITERAL___GET_CONTAINING_CONCRETE_CLASSIFIER = LONG_LITERAL___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_LONG_LITERAL___GET_CONTAINING_COMPILATION_UNIT = LONG_LITERAL___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_LONG_LITERAL___GET_CONTAINING_PACKAGE_NAME = LONG_LITERAL___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_LONG_LITERAL___GET_CONTAINING_CONTAINER_NAME = LONG_LITERAL___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_LONG_LITERAL___GET_PARENT_CONCRETE_CLASSIFIER = LONG_LITERAL___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_LONG_LITERAL___GET_PARENT_BY_ETYPE__ECLASS = LONG_LITERAL___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_LONG_LITERAL___GET_FIRST_CHILD_BY_ETYPE__ECLASS = LONG_LITERAL___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_LONG_LITERAL___GET_PARENT_BY_TYPE__CLASS = LONG_LITERAL___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_LONG_LITERAL___GET_FIRST_CHILD_BY_TYPE__CLASS = LONG_LITERAL___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_LONG_LITERAL___GET_CHILDREN_BY_ETYPE__ECLASS = LONG_LITERAL___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_LONG_LITERAL___GET_CHILDREN_BY_TYPE__CLASS = LONG_LITERAL___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_LONG_LITERAL___GET_COMMENTS = LONG_LITERAL___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_LONG_LITERAL___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = LONG_LITERAL___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_LONG_LITERAL___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = LONG_LITERAL___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_LONG_LITERAL___GET_TYPE = LONG_LITERAL___GET_TYPE;

    /**
     * The operation id for the '<em>Get Alternative Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_LONG_LITERAL___GET_ALTERNATIVE_TYPE = LONG_LITERAL___GET_ALTERNATIVE_TYPE;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_LONG_LITERAL___GET_ARRAY_DIMENSION = LONG_LITERAL___GET_ARRAY_DIMENSION;

    /**
     * The operation id for the '<em>Get One Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_LONG_LITERAL___GET_ONE_TYPE__BOOLEAN = LONG_LITERAL___GET_ONE_TYPE__BOOLEAN;

    /**
     * The number of operations of the '<em>Decimal Long Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_LONG_LITERAL_OPERATION_COUNT = LONG_LITERAL_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.HexLongLiteralImpl <em>Hex Long Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.HexLongLiteralImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.LiteralsPackageImpl#getHexLongLiteral()
     * @generated
     */
    int HEX_LONG_LITERAL = 16;

    /**
     * The feature id for the '<em><b>Hex Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_LONG_LITERAL__HEX_VALUE = LONG_LITERAL_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Hex Long Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_LONG_LITERAL_FEATURE_COUNT = LONG_LITERAL_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_LONG_LITERAL___GET_CONCRETE_CLASSIFIER__STRING = LONG_LITERAL___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_LONG_LITERAL___GET_CONCRETE_CLASSIFIER_PROXY__STRING = LONG_LITERAL___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_LONG_LITERAL___GET_CONCRETE_CLASSIFIERS__STRING_STRING = LONG_LITERAL___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_LONG_LITERAL___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = LONG_LITERAL___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_LONG_LITERAL___GET_LIB_CLASS__STRING = LONG_LITERAL___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_LONG_LITERAL___GET_LIB_INTERFACE__STRING = LONG_LITERAL___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_LONG_LITERAL___GET_CLASS_CLASS = LONG_LITERAL___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_LONG_LITERAL___GET_OBJECT_CLASS = LONG_LITERAL___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_LONG_LITERAL___GET_STRING_CLASS = LONG_LITERAL___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_LONG_LITERAL___GET_ANNOTATION_INTERFACE = LONG_LITERAL___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_LONG_LITERAL___GET_CONTAINING_ANNOTATION_INSTANCE = LONG_LITERAL___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_LONG_LITERAL___GET_CONTAINING_ANONYMOUS_CLASS = LONG_LITERAL___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_LONG_LITERAL___GET_CONTAINING_CONCRETE_CLASSIFIER = LONG_LITERAL___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_LONG_LITERAL___GET_CONTAINING_COMPILATION_UNIT = LONG_LITERAL___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_LONG_LITERAL___GET_CONTAINING_PACKAGE_NAME = LONG_LITERAL___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_LONG_LITERAL___GET_CONTAINING_CONTAINER_NAME = LONG_LITERAL___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_LONG_LITERAL___GET_PARENT_CONCRETE_CLASSIFIER = LONG_LITERAL___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_LONG_LITERAL___GET_PARENT_BY_ETYPE__ECLASS = LONG_LITERAL___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_LONG_LITERAL___GET_FIRST_CHILD_BY_ETYPE__ECLASS = LONG_LITERAL___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_LONG_LITERAL___GET_PARENT_BY_TYPE__CLASS = LONG_LITERAL___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_LONG_LITERAL___GET_FIRST_CHILD_BY_TYPE__CLASS = LONG_LITERAL___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_LONG_LITERAL___GET_CHILDREN_BY_ETYPE__ECLASS = LONG_LITERAL___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_LONG_LITERAL___GET_CHILDREN_BY_TYPE__CLASS = LONG_LITERAL___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_LONG_LITERAL___GET_COMMENTS = LONG_LITERAL___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_LONG_LITERAL___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = LONG_LITERAL___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_LONG_LITERAL___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = LONG_LITERAL___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_LONG_LITERAL___GET_TYPE = LONG_LITERAL___GET_TYPE;

    /**
     * The operation id for the '<em>Get Alternative Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_LONG_LITERAL___GET_ALTERNATIVE_TYPE = LONG_LITERAL___GET_ALTERNATIVE_TYPE;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_LONG_LITERAL___GET_ARRAY_DIMENSION = LONG_LITERAL___GET_ARRAY_DIMENSION;

    /**
     * The operation id for the '<em>Get One Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_LONG_LITERAL___GET_ONE_TYPE__BOOLEAN = LONG_LITERAL___GET_ONE_TYPE__BOOLEAN;

    /**
     * The number of operations of the '<em>Hex Long Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEX_LONG_LITERAL_OPERATION_COUNT = LONG_LITERAL_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.OctalLongLiteralImpl <em>Octal Long Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.OctalLongLiteralImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.LiteralsPackageImpl#getOctalLongLiteral()
     * @generated
     */
    int OCTAL_LONG_LITERAL = 17;

    /**
     * The feature id for the '<em><b>Octal Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCTAL_LONG_LITERAL__OCTAL_VALUE = LONG_LITERAL_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Octal Long Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCTAL_LONG_LITERAL_FEATURE_COUNT = LONG_LITERAL_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCTAL_LONG_LITERAL___GET_CONCRETE_CLASSIFIER__STRING = LONG_LITERAL___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCTAL_LONG_LITERAL___GET_CONCRETE_CLASSIFIER_PROXY__STRING = LONG_LITERAL___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCTAL_LONG_LITERAL___GET_CONCRETE_CLASSIFIERS__STRING_STRING = LONG_LITERAL___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCTAL_LONG_LITERAL___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = LONG_LITERAL___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCTAL_LONG_LITERAL___GET_LIB_CLASS__STRING = LONG_LITERAL___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCTAL_LONG_LITERAL___GET_LIB_INTERFACE__STRING = LONG_LITERAL___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCTAL_LONG_LITERAL___GET_CLASS_CLASS = LONG_LITERAL___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCTAL_LONG_LITERAL___GET_OBJECT_CLASS = LONG_LITERAL___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCTAL_LONG_LITERAL___GET_STRING_CLASS = LONG_LITERAL___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCTAL_LONG_LITERAL___GET_ANNOTATION_INTERFACE = LONG_LITERAL___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCTAL_LONG_LITERAL___GET_CONTAINING_ANNOTATION_INSTANCE = LONG_LITERAL___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCTAL_LONG_LITERAL___GET_CONTAINING_ANONYMOUS_CLASS = LONG_LITERAL___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCTAL_LONG_LITERAL___GET_CONTAINING_CONCRETE_CLASSIFIER = LONG_LITERAL___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCTAL_LONG_LITERAL___GET_CONTAINING_COMPILATION_UNIT = LONG_LITERAL___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCTAL_LONG_LITERAL___GET_CONTAINING_PACKAGE_NAME = LONG_LITERAL___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCTAL_LONG_LITERAL___GET_CONTAINING_CONTAINER_NAME = LONG_LITERAL___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCTAL_LONG_LITERAL___GET_PARENT_CONCRETE_CLASSIFIER = LONG_LITERAL___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCTAL_LONG_LITERAL___GET_PARENT_BY_ETYPE__ECLASS = LONG_LITERAL___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCTAL_LONG_LITERAL___GET_FIRST_CHILD_BY_ETYPE__ECLASS = LONG_LITERAL___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCTAL_LONG_LITERAL___GET_PARENT_BY_TYPE__CLASS = LONG_LITERAL___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCTAL_LONG_LITERAL___GET_FIRST_CHILD_BY_TYPE__CLASS = LONG_LITERAL___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCTAL_LONG_LITERAL___GET_CHILDREN_BY_ETYPE__ECLASS = LONG_LITERAL___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCTAL_LONG_LITERAL___GET_CHILDREN_BY_TYPE__CLASS = LONG_LITERAL___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCTAL_LONG_LITERAL___GET_COMMENTS = LONG_LITERAL___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCTAL_LONG_LITERAL___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = LONG_LITERAL___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCTAL_LONG_LITERAL___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = LONG_LITERAL___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCTAL_LONG_LITERAL___GET_TYPE = LONG_LITERAL___GET_TYPE;

    /**
     * The operation id for the '<em>Get Alternative Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCTAL_LONG_LITERAL___GET_ALTERNATIVE_TYPE = LONG_LITERAL___GET_ALTERNATIVE_TYPE;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCTAL_LONG_LITERAL___GET_ARRAY_DIMENSION = LONG_LITERAL___GET_ARRAY_DIMENSION;

    /**
     * The operation id for the '<em>Get One Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCTAL_LONG_LITERAL___GET_ONE_TYPE__BOOLEAN = LONG_LITERAL___GET_ONE_TYPE__BOOLEAN;

    /**
     * The number of operations of the '<em>Octal Long Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OCTAL_LONG_LITERAL_OPERATION_COUNT = LONG_LITERAL_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.NullLiteralImpl <em>Null Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.NullLiteralImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.LiteralsPackageImpl#getNullLiteral()
     * @generated
     */
    int NULL_LITERAL = 18;

    /**
     * The number of structural features of the '<em>Null Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NULL_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NULL_LITERAL___GET_CONCRETE_CLASSIFIER__STRING = LITERAL___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NULL_LITERAL___GET_CONCRETE_CLASSIFIER_PROXY__STRING = LITERAL___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NULL_LITERAL___GET_CONCRETE_CLASSIFIERS__STRING_STRING = LITERAL___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NULL_LITERAL___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = LITERAL___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NULL_LITERAL___GET_LIB_CLASS__STRING = LITERAL___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NULL_LITERAL___GET_LIB_INTERFACE__STRING = LITERAL___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NULL_LITERAL___GET_CLASS_CLASS = LITERAL___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NULL_LITERAL___GET_OBJECT_CLASS = LITERAL___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NULL_LITERAL___GET_STRING_CLASS = LITERAL___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NULL_LITERAL___GET_ANNOTATION_INTERFACE = LITERAL___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NULL_LITERAL___GET_CONTAINING_ANNOTATION_INSTANCE = LITERAL___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NULL_LITERAL___GET_CONTAINING_ANONYMOUS_CLASS = LITERAL___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NULL_LITERAL___GET_CONTAINING_CONCRETE_CLASSIFIER = LITERAL___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NULL_LITERAL___GET_CONTAINING_COMPILATION_UNIT = LITERAL___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NULL_LITERAL___GET_CONTAINING_PACKAGE_NAME = LITERAL___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NULL_LITERAL___GET_CONTAINING_CONTAINER_NAME = LITERAL___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NULL_LITERAL___GET_PARENT_CONCRETE_CLASSIFIER = LITERAL___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NULL_LITERAL___GET_PARENT_BY_ETYPE__ECLASS = LITERAL___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NULL_LITERAL___GET_FIRST_CHILD_BY_ETYPE__ECLASS = LITERAL___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NULL_LITERAL___GET_PARENT_BY_TYPE__CLASS = LITERAL___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NULL_LITERAL___GET_FIRST_CHILD_BY_TYPE__CLASS = LITERAL___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NULL_LITERAL___GET_CHILDREN_BY_ETYPE__ECLASS = LITERAL___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NULL_LITERAL___GET_CHILDREN_BY_TYPE__CLASS = LITERAL___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NULL_LITERAL___GET_COMMENTS = LITERAL___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NULL_LITERAL___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = LITERAL___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NULL_LITERAL___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = LITERAL___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NULL_LITERAL___GET_TYPE = LITERAL___GET_TYPE;

    /**
     * The operation id for the '<em>Get Alternative Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NULL_LITERAL___GET_ALTERNATIVE_TYPE = LITERAL___GET_ALTERNATIVE_TYPE;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NULL_LITERAL___GET_ARRAY_DIMENSION = LITERAL___GET_ARRAY_DIMENSION;

    /**
     * The operation id for the '<em>Get One Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NULL_LITERAL___GET_ONE_TYPE__BOOLEAN = LITERAL___GET_ONE_TYPE__BOOLEAN;

    /**
     * The number of operations of the '<em>Null Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NULL_LITERAL_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.SuperImpl <em>Super</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.SuperImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.LiteralsPackageImpl#getSuper()
     * @generated
     */
    int SUPER = 19;

    /**
     * The number of structural features of the '<em>Super</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPER_FEATURE_COUNT = SELF_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPER___GET_CONCRETE_CLASSIFIER__STRING = SELF___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPER___GET_CONCRETE_CLASSIFIER_PROXY__STRING = SELF___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPER___GET_CONCRETE_CLASSIFIERS__STRING_STRING = SELF___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPER___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = SELF___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPER___GET_LIB_CLASS__STRING = SELF___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPER___GET_LIB_INTERFACE__STRING = SELF___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPER___GET_CLASS_CLASS = SELF___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPER___GET_OBJECT_CLASS = SELF___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPER___GET_STRING_CLASS = SELF___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPER___GET_ANNOTATION_INTERFACE = SELF___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPER___GET_CONTAINING_ANNOTATION_INSTANCE = SELF___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPER___GET_CONTAINING_ANONYMOUS_CLASS = SELF___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPER___GET_CONTAINING_CONCRETE_CLASSIFIER = SELF___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPER___GET_CONTAINING_COMPILATION_UNIT = SELF___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPER___GET_CONTAINING_PACKAGE_NAME = SELF___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPER___GET_CONTAINING_CONTAINER_NAME = SELF___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPER___GET_PARENT_CONCRETE_CLASSIFIER = SELF___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPER___GET_PARENT_BY_ETYPE__ECLASS = SELF___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPER___GET_FIRST_CHILD_BY_ETYPE__ECLASS = SELF___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPER___GET_PARENT_BY_TYPE__CLASS = SELF___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPER___GET_FIRST_CHILD_BY_TYPE__CLASS = SELF___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPER___GET_CHILDREN_BY_ETYPE__ECLASS = SELF___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPER___GET_CHILDREN_BY_TYPE__CLASS = SELF___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPER___GET_COMMENTS = SELF___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPER___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = SELF___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPER___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = SELF___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The number of operations of the '<em>Super</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPER_OPERATION_COUNT = SELF_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.ThisImpl <em>This</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.ThisImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.LiteralsPackageImpl#getThis()
     * @generated
     */
    int THIS = 20;

    /**
     * The number of structural features of the '<em>This</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THIS_FEATURE_COUNT = SELF_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THIS___GET_CONCRETE_CLASSIFIER__STRING = SELF___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THIS___GET_CONCRETE_CLASSIFIER_PROXY__STRING = SELF___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THIS___GET_CONCRETE_CLASSIFIERS__STRING_STRING = SELF___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THIS___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = SELF___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THIS___GET_LIB_CLASS__STRING = SELF___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THIS___GET_LIB_INTERFACE__STRING = SELF___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THIS___GET_CLASS_CLASS = SELF___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THIS___GET_OBJECT_CLASS = SELF___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THIS___GET_STRING_CLASS = SELF___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THIS___GET_ANNOTATION_INTERFACE = SELF___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THIS___GET_CONTAINING_ANNOTATION_INSTANCE = SELF___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THIS___GET_CONTAINING_ANONYMOUS_CLASS = SELF___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THIS___GET_CONTAINING_CONCRETE_CLASSIFIER = SELF___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THIS___GET_CONTAINING_COMPILATION_UNIT = SELF___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THIS___GET_CONTAINING_PACKAGE_NAME = SELF___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THIS___GET_CONTAINING_CONTAINER_NAME = SELF___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THIS___GET_PARENT_CONCRETE_CLASSIFIER = SELF___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THIS___GET_PARENT_BY_ETYPE__ECLASS = SELF___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THIS___GET_FIRST_CHILD_BY_ETYPE__ECLASS = SELF___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THIS___GET_PARENT_BY_TYPE__CLASS = SELF___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THIS___GET_FIRST_CHILD_BY_TYPE__CLASS = SELF___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THIS___GET_CHILDREN_BY_ETYPE__ECLASS = SELF___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THIS___GET_CHILDREN_BY_TYPE__CLASS = SELF___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THIS___GET_COMMENTS = SELF___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THIS___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = SELF___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THIS___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = SELF___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The number of operations of the '<em>This</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THIS_OPERATION_COUNT = SELF_OPERATION_COUNT + 0;

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.Literal <em>Literal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Literal</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.Literal
     * @generated
     */
    EClass getLiteral();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.Literal#getOneType(boolean) <em>Get One Type</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get One Type</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.Literal#getOneType(boolean)
     * @generated
     */
    EOperation getLiteral__GetOneType__boolean();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.Self <em>Self</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Self</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.Self
     * @generated
     */
    EClass getSelf();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.BooleanLiteral <em>Boolean Literal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Boolean Literal</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.BooleanLiteral
     * @generated
     */
    EClass getBooleanLiteral();

    /**
     * Returns the meta object for the attribute '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.BooleanLiteral#isValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.BooleanLiteral#isValue()
     * @see #getBooleanLiteral()
     * @generated
     */
    EAttribute getBooleanLiteral_Value();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.CharacterLiteral <em>Character Literal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Character Literal</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.CharacterLiteral
     * @generated
     */
    EClass getCharacterLiteral();

    /**
     * Returns the meta object for the attribute '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.CharacterLiteral#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.CharacterLiteral#getValue()
     * @see #getCharacterLiteral()
     * @generated
     */
    EAttribute getCharacterLiteral_Value();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.FloatLiteral <em>Float Literal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Float Literal</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.FloatLiteral
     * @generated
     */
    EClass getFloatLiteral();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.DecimalFloatLiteral <em>Decimal Float Literal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Decimal Float Literal</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.DecimalFloatLiteral
     * @generated
     */
    EClass getDecimalFloatLiteral();

    /**
     * Returns the meta object for the attribute '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.DecimalFloatLiteral#getDecimalValue <em>Decimal Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Decimal Value</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.DecimalFloatLiteral#getDecimalValue()
     * @see #getDecimalFloatLiteral()
     * @generated
     */
    EAttribute getDecimalFloatLiteral_DecimalValue();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.HexFloatLiteral <em>Hex Float Literal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Hex Float Literal</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.HexFloatLiteral
     * @generated
     */
    EClass getHexFloatLiteral();

    /**
     * Returns the meta object for the attribute '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.HexFloatLiteral#getHexValue <em>Hex Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Hex Value</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.HexFloatLiteral#getHexValue()
     * @see #getHexFloatLiteral()
     * @generated
     */
    EAttribute getHexFloatLiteral_HexValue();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.DoubleLiteral <em>Double Literal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Double Literal</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.DoubleLiteral
     * @generated
     */
    EClass getDoubleLiteral();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.DecimalDoubleLiteral <em>Decimal Double Literal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Decimal Double Literal</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.DecimalDoubleLiteral
     * @generated
     */
    EClass getDecimalDoubleLiteral();

    /**
     * Returns the meta object for the attribute '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.DecimalDoubleLiteral#getDecimalValue <em>Decimal Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Decimal Value</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.DecimalDoubleLiteral#getDecimalValue()
     * @see #getDecimalDoubleLiteral()
     * @generated
     */
    EAttribute getDecimalDoubleLiteral_DecimalValue();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.HexDoubleLiteral <em>Hex Double Literal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Hex Double Literal</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.HexDoubleLiteral
     * @generated
     */
    EClass getHexDoubleLiteral();

    /**
     * Returns the meta object for the attribute '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.HexDoubleLiteral#getHexValue <em>Hex Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Hex Value</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.HexDoubleLiteral#getHexValue()
     * @see #getHexDoubleLiteral()
     * @generated
     */
    EAttribute getHexDoubleLiteral_HexValue();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.IntegerLiteral <em>Integer Literal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Integer Literal</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.IntegerLiteral
     * @generated
     */
    EClass getIntegerLiteral();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.DecimalIntegerLiteral <em>Decimal Integer Literal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Decimal Integer Literal</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.DecimalIntegerLiteral
     * @generated
     */
    EClass getDecimalIntegerLiteral();

    /**
     * Returns the meta object for the attribute '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.DecimalIntegerLiteral#getDecimalValue <em>Decimal Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Decimal Value</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.DecimalIntegerLiteral#getDecimalValue()
     * @see #getDecimalIntegerLiteral()
     * @generated
     */
    EAttribute getDecimalIntegerLiteral_DecimalValue();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.HexIntegerLiteral <em>Hex Integer Literal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Hex Integer Literal</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.HexIntegerLiteral
     * @generated
     */
    EClass getHexIntegerLiteral();

    /**
     * Returns the meta object for the attribute '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.HexIntegerLiteral#getHexValue <em>Hex Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Hex Value</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.HexIntegerLiteral#getHexValue()
     * @see #getHexIntegerLiteral()
     * @generated
     */
    EAttribute getHexIntegerLiteral_HexValue();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.OctalIntegerLiteral <em>Octal Integer Literal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Octal Integer Literal</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.OctalIntegerLiteral
     * @generated
     */
    EClass getOctalIntegerLiteral();

    /**
     * Returns the meta object for the attribute '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.OctalIntegerLiteral#getOctalValue <em>Octal Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Octal Value</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.OctalIntegerLiteral#getOctalValue()
     * @see #getOctalIntegerLiteral()
     * @generated
     */
    EAttribute getOctalIntegerLiteral_OctalValue();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.LongLiteral <em>Long Literal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Long Literal</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.LongLiteral
     * @generated
     */
    EClass getLongLiteral();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.DecimalLongLiteral <em>Decimal Long Literal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Decimal Long Literal</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.DecimalLongLiteral
     * @generated
     */
    EClass getDecimalLongLiteral();

    /**
     * Returns the meta object for the attribute '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.DecimalLongLiteral#getDecimalValue <em>Decimal Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Decimal Value</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.DecimalLongLiteral#getDecimalValue()
     * @see #getDecimalLongLiteral()
     * @generated
     */
    EAttribute getDecimalLongLiteral_DecimalValue();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.HexLongLiteral <em>Hex Long Literal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Hex Long Literal</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.HexLongLiteral
     * @generated
     */
    EClass getHexLongLiteral();

    /**
     * Returns the meta object for the attribute '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.HexLongLiteral#getHexValue <em>Hex Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Hex Value</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.HexLongLiteral#getHexValue()
     * @see #getHexLongLiteral()
     * @generated
     */
    EAttribute getHexLongLiteral_HexValue();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.OctalLongLiteral <em>Octal Long Literal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Octal Long Literal</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.OctalLongLiteral
     * @generated
     */
    EClass getOctalLongLiteral();

    /**
     * Returns the meta object for the attribute '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.OctalLongLiteral#getOctalValue <em>Octal Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Octal Value</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.OctalLongLiteral#getOctalValue()
     * @see #getOctalLongLiteral()
     * @generated
     */
    EAttribute getOctalLongLiteral_OctalValue();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.NullLiteral <em>Null Literal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Null Literal</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.NullLiteral
     * @generated
     */
    EClass getNullLiteral();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.Super <em>Super</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Super</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.Super
     * @generated
     */
    EClass getSuper();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.This <em>This</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>This</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.This
     * @generated
     */
    EClass getThis();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    LiteralsFactory getLiteralsFactory();

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
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.LiteralImpl <em>Literal</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.LiteralImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.LiteralsPackageImpl#getLiteral()
         * @generated
         */
        EClass LITERAL = eINSTANCE.getLiteral();

        /**
         * The meta object literal for the '<em><b>Get One Type</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation LITERAL___GET_ONE_TYPE__BOOLEAN = eINSTANCE.getLiteral__GetOneType__boolean();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.SelfImpl <em>Self</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.SelfImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.LiteralsPackageImpl#getSelf()
         * @generated
         */
        EClass SELF = eINSTANCE.getSelf();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.BooleanLiteralImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.LiteralsPackageImpl#getBooleanLiteral()
         * @generated
         */
        EClass BOOLEAN_LITERAL = eINSTANCE.getBooleanLiteral();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BOOLEAN_LITERAL__VALUE = eINSTANCE.getBooleanLiteral_Value();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.CharacterLiteralImpl <em>Character Literal</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.CharacterLiteralImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.LiteralsPackageImpl#getCharacterLiteral()
         * @generated
         */
        EClass CHARACTER_LITERAL = eINSTANCE.getCharacterLiteral();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CHARACTER_LITERAL__VALUE = eINSTANCE.getCharacterLiteral_Value();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.FloatLiteralImpl <em>Float Literal</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.FloatLiteralImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.LiteralsPackageImpl#getFloatLiteral()
         * @generated
         */
        EClass FLOAT_LITERAL = eINSTANCE.getFloatLiteral();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.DecimalFloatLiteralImpl <em>Decimal Float Literal</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.DecimalFloatLiteralImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.LiteralsPackageImpl#getDecimalFloatLiteral()
         * @generated
         */
        EClass DECIMAL_FLOAT_LITERAL = eINSTANCE.getDecimalFloatLiteral();

        /**
         * The meta object literal for the '<em><b>Decimal Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DECIMAL_FLOAT_LITERAL__DECIMAL_VALUE = eINSTANCE.getDecimalFloatLiteral_DecimalValue();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.HexFloatLiteralImpl <em>Hex Float Literal</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.HexFloatLiteralImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.LiteralsPackageImpl#getHexFloatLiteral()
         * @generated
         */
        EClass HEX_FLOAT_LITERAL = eINSTANCE.getHexFloatLiteral();

        /**
         * The meta object literal for the '<em><b>Hex Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute HEX_FLOAT_LITERAL__HEX_VALUE = eINSTANCE.getHexFloatLiteral_HexValue();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.DoubleLiteralImpl <em>Double Literal</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.DoubleLiteralImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.LiteralsPackageImpl#getDoubleLiteral()
         * @generated
         */
        EClass DOUBLE_LITERAL = eINSTANCE.getDoubleLiteral();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.DecimalDoubleLiteralImpl <em>Decimal Double Literal</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.DecimalDoubleLiteralImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.LiteralsPackageImpl#getDecimalDoubleLiteral()
         * @generated
         */
        EClass DECIMAL_DOUBLE_LITERAL = eINSTANCE.getDecimalDoubleLiteral();

        /**
         * The meta object literal for the '<em><b>Decimal Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DECIMAL_DOUBLE_LITERAL__DECIMAL_VALUE = eINSTANCE.getDecimalDoubleLiteral_DecimalValue();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.HexDoubleLiteralImpl <em>Hex Double Literal</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.HexDoubleLiteralImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.LiteralsPackageImpl#getHexDoubleLiteral()
         * @generated
         */
        EClass HEX_DOUBLE_LITERAL = eINSTANCE.getHexDoubleLiteral();

        /**
         * The meta object literal for the '<em><b>Hex Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute HEX_DOUBLE_LITERAL__HEX_VALUE = eINSTANCE.getHexDoubleLiteral_HexValue();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.IntegerLiteralImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.LiteralsPackageImpl#getIntegerLiteral()
         * @generated
         */
        EClass INTEGER_LITERAL = eINSTANCE.getIntegerLiteral();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.DecimalIntegerLiteralImpl <em>Decimal Integer Literal</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.DecimalIntegerLiteralImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.LiteralsPackageImpl#getDecimalIntegerLiteral()
         * @generated
         */
        EClass DECIMAL_INTEGER_LITERAL = eINSTANCE.getDecimalIntegerLiteral();

        /**
         * The meta object literal for the '<em><b>Decimal Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DECIMAL_INTEGER_LITERAL__DECIMAL_VALUE = eINSTANCE.getDecimalIntegerLiteral_DecimalValue();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.HexIntegerLiteralImpl <em>Hex Integer Literal</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.HexIntegerLiteralImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.LiteralsPackageImpl#getHexIntegerLiteral()
         * @generated
         */
        EClass HEX_INTEGER_LITERAL = eINSTANCE.getHexIntegerLiteral();

        /**
         * The meta object literal for the '<em><b>Hex Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute HEX_INTEGER_LITERAL__HEX_VALUE = eINSTANCE.getHexIntegerLiteral_HexValue();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.OctalIntegerLiteralImpl <em>Octal Integer Literal</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.OctalIntegerLiteralImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.LiteralsPackageImpl#getOctalIntegerLiteral()
         * @generated
         */
        EClass OCTAL_INTEGER_LITERAL = eINSTANCE.getOctalIntegerLiteral();

        /**
         * The meta object literal for the '<em><b>Octal Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OCTAL_INTEGER_LITERAL__OCTAL_VALUE = eINSTANCE.getOctalIntegerLiteral_OctalValue();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.LongLiteralImpl <em>Long Literal</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.LongLiteralImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.LiteralsPackageImpl#getLongLiteral()
         * @generated
         */
        EClass LONG_LITERAL = eINSTANCE.getLongLiteral();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.DecimalLongLiteralImpl <em>Decimal Long Literal</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.DecimalLongLiteralImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.LiteralsPackageImpl#getDecimalLongLiteral()
         * @generated
         */
        EClass DECIMAL_LONG_LITERAL = eINSTANCE.getDecimalLongLiteral();

        /**
         * The meta object literal for the '<em><b>Decimal Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DECIMAL_LONG_LITERAL__DECIMAL_VALUE = eINSTANCE.getDecimalLongLiteral_DecimalValue();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.HexLongLiteralImpl <em>Hex Long Literal</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.HexLongLiteralImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.LiteralsPackageImpl#getHexLongLiteral()
         * @generated
         */
        EClass HEX_LONG_LITERAL = eINSTANCE.getHexLongLiteral();

        /**
         * The meta object literal for the '<em><b>Hex Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute HEX_LONG_LITERAL__HEX_VALUE = eINSTANCE.getHexLongLiteral_HexValue();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.OctalLongLiteralImpl <em>Octal Long Literal</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.OctalLongLiteralImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.LiteralsPackageImpl#getOctalLongLiteral()
         * @generated
         */
        EClass OCTAL_LONG_LITERAL = eINSTANCE.getOctalLongLiteral();

        /**
         * The meta object literal for the '<em><b>Octal Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OCTAL_LONG_LITERAL__OCTAL_VALUE = eINSTANCE.getOctalLongLiteral_OctalValue();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.NullLiteralImpl <em>Null Literal</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.NullLiteralImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.LiteralsPackageImpl#getNullLiteral()
         * @generated
         */
        EClass NULL_LITERAL = eINSTANCE.getNullLiteral();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.SuperImpl <em>Super</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.SuperImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.LiteralsPackageImpl#getSuper()
         * @generated
         */
        EClass SUPER = eINSTANCE.getSuper();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.ThisImpl <em>This</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.ThisImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.LiteralsPackageImpl#getThis()
         * @generated
         */
        EClass THIS = eINSTANCE.getThis();

    }

} //LiteralsPackage
