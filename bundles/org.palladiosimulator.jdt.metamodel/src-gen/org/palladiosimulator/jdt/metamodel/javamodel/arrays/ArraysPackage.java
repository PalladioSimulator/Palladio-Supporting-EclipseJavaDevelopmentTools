/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.arrays;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArraysFactory
 * @model kind="package"
 * @generated
 */
public interface ArraysPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "arrays";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.palladiosimulator.org/javamodel/arrays";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "arrays";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ArraysPackage eINSTANCE = org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArraysPackageImpl.init();

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArrayTypeableImpl <em>Array Typeable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArrayTypeableImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArraysPackageImpl#getArrayTypeable()
     * @generated
     */
    int ARRAY_TYPEABLE = 0;

    /**
     * The feature id for the '<em><b>Array Dimensions Before</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_TYPEABLE__ARRAY_DIMENSIONS_BEFORE = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Array Dimensions After</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_TYPEABLE__ARRAY_DIMENSIONS_AFTER = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Array Typeable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_TYPEABLE_FEATURE_COUNT = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_TYPEABLE___GET_CONCRETE_CLASSIFIER__STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_TYPEABLE___GET_CONCRETE_CLASSIFIER_PROXY__STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_TYPEABLE___GET_CONCRETE_CLASSIFIERS__STRING_STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_TYPEABLE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_TYPEABLE___GET_LIB_CLASS__STRING = CommonsPackage.COMMENTABLE___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_TYPEABLE___GET_LIB_INTERFACE__STRING = CommonsPackage.COMMENTABLE___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_TYPEABLE___GET_CLASS_CLASS = CommonsPackage.COMMENTABLE___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_TYPEABLE___GET_OBJECT_CLASS = CommonsPackage.COMMENTABLE___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_TYPEABLE___GET_STRING_CLASS = CommonsPackage.COMMENTABLE___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_TYPEABLE___GET_ANNOTATION_INTERFACE = CommonsPackage.COMMENTABLE___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_TYPEABLE___GET_CONTAINING_ANNOTATION_INSTANCE = CommonsPackage.COMMENTABLE___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_TYPEABLE___GET_CONTAINING_ANONYMOUS_CLASS = CommonsPackage.COMMENTABLE___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_TYPEABLE___GET_CONTAINING_CONCRETE_CLASSIFIER = CommonsPackage.COMMENTABLE___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_TYPEABLE___GET_CONTAINING_COMPILATION_UNIT = CommonsPackage.COMMENTABLE___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_TYPEABLE___GET_CONTAINING_PACKAGE_NAME = CommonsPackage.COMMENTABLE___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_TYPEABLE___GET_CONTAINING_CONTAINER_NAME = CommonsPackage.COMMENTABLE___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_TYPEABLE___GET_PARENT_CONCRETE_CLASSIFIER = CommonsPackage.COMMENTABLE___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_TYPEABLE___GET_PARENT_BY_ETYPE__ECLASS = CommonsPackage.COMMENTABLE___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_TYPEABLE___GET_FIRST_CHILD_BY_ETYPE__ECLASS = CommonsPackage.COMMENTABLE___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_TYPEABLE___GET_PARENT_BY_TYPE__CLASS = CommonsPackage.COMMENTABLE___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_TYPEABLE___GET_FIRST_CHILD_BY_TYPE__CLASS = CommonsPackage.COMMENTABLE___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_TYPEABLE___GET_CHILDREN_BY_ETYPE__ECLASS = CommonsPackage.COMMENTABLE___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_TYPEABLE___GET_CHILDREN_BY_TYPE__CLASS = CommonsPackage.COMMENTABLE___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_TYPEABLE___GET_COMMENTS = CommonsPackage.COMMENTABLE___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_TYPEABLE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = CommonsPackage.COMMENTABLE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_TYPEABLE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = CommonsPackage.COMMENTABLE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_TYPEABLE___GET_ARRAY_DIMENSION = CommonsPackage.COMMENTABLE_OPERATION_COUNT + 0;

    /**
     * The number of operations of the '<em>Array Typeable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_TYPEABLE_OPERATION_COUNT = CommonsPackage.COMMENTABLE_OPERATION_COUNT + 1;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArrayDimensionImpl <em>Array Dimension</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArrayDimensionImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArraysPackageImpl#getArrayDimension()
     * @generated
     */
    int ARRAY_DIMENSION = 1;

    /**
     * The number of structural features of the '<em>Array Dimension</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_DIMENSION_FEATURE_COUNT = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_DIMENSION___GET_CONCRETE_CLASSIFIER__STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_DIMENSION___GET_CONCRETE_CLASSIFIER_PROXY__STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_DIMENSION___GET_CONCRETE_CLASSIFIERS__STRING_STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_DIMENSION___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_DIMENSION___GET_LIB_CLASS__STRING = CommonsPackage.COMMENTABLE___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_DIMENSION___GET_LIB_INTERFACE__STRING = CommonsPackage.COMMENTABLE___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_DIMENSION___GET_CLASS_CLASS = CommonsPackage.COMMENTABLE___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_DIMENSION___GET_OBJECT_CLASS = CommonsPackage.COMMENTABLE___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_DIMENSION___GET_STRING_CLASS = CommonsPackage.COMMENTABLE___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_DIMENSION___GET_ANNOTATION_INTERFACE = CommonsPackage.COMMENTABLE___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_DIMENSION___GET_CONTAINING_ANNOTATION_INSTANCE = CommonsPackage.COMMENTABLE___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_DIMENSION___GET_CONTAINING_ANONYMOUS_CLASS = CommonsPackage.COMMENTABLE___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_DIMENSION___GET_CONTAINING_CONCRETE_CLASSIFIER = CommonsPackage.COMMENTABLE___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_DIMENSION___GET_CONTAINING_COMPILATION_UNIT = CommonsPackage.COMMENTABLE___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_DIMENSION___GET_CONTAINING_PACKAGE_NAME = CommonsPackage.COMMENTABLE___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_DIMENSION___GET_CONTAINING_CONTAINER_NAME = CommonsPackage.COMMENTABLE___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_DIMENSION___GET_PARENT_CONCRETE_CLASSIFIER = CommonsPackage.COMMENTABLE___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_DIMENSION___GET_PARENT_BY_ETYPE__ECLASS = CommonsPackage.COMMENTABLE___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_DIMENSION___GET_FIRST_CHILD_BY_ETYPE__ECLASS = CommonsPackage.COMMENTABLE___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_DIMENSION___GET_PARENT_BY_TYPE__CLASS = CommonsPackage.COMMENTABLE___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_DIMENSION___GET_FIRST_CHILD_BY_TYPE__CLASS = CommonsPackage.COMMENTABLE___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_DIMENSION___GET_CHILDREN_BY_ETYPE__ECLASS = CommonsPackage.COMMENTABLE___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_DIMENSION___GET_CHILDREN_BY_TYPE__CLASS = CommonsPackage.COMMENTABLE___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_DIMENSION___GET_COMMENTS = CommonsPackage.COMMENTABLE___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_DIMENSION___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = CommonsPackage.COMMENTABLE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_DIMENSION___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = CommonsPackage.COMMENTABLE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The number of operations of the '<em>Array Dimension</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_DIMENSION_OPERATION_COUNT = CommonsPackage.COMMENTABLE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArrayInitializationValueImpl <em>Array Initialization Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArrayInitializationValueImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArraysPackageImpl#getArrayInitializationValue()
     * @generated
     */
    int ARRAY_INITIALIZATION_VALUE = 3;

    /**
     * The number of structural features of the '<em>Array Initialization Value</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INITIALIZATION_VALUE_FEATURE_COUNT = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INITIALIZATION_VALUE___GET_CONCRETE_CLASSIFIER__STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INITIALIZATION_VALUE___GET_CONCRETE_CLASSIFIER_PROXY__STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INITIALIZATION_VALUE___GET_CONCRETE_CLASSIFIERS__STRING_STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INITIALIZATION_VALUE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INITIALIZATION_VALUE___GET_LIB_CLASS__STRING = CommonsPackage.COMMENTABLE___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INITIALIZATION_VALUE___GET_LIB_INTERFACE__STRING = CommonsPackage.COMMENTABLE___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INITIALIZATION_VALUE___GET_CLASS_CLASS = CommonsPackage.COMMENTABLE___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INITIALIZATION_VALUE___GET_OBJECT_CLASS = CommonsPackage.COMMENTABLE___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INITIALIZATION_VALUE___GET_STRING_CLASS = CommonsPackage.COMMENTABLE___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INITIALIZATION_VALUE___GET_ANNOTATION_INTERFACE = CommonsPackage.COMMENTABLE___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INITIALIZATION_VALUE___GET_CONTAINING_ANNOTATION_INSTANCE = CommonsPackage.COMMENTABLE___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INITIALIZATION_VALUE___GET_CONTAINING_ANONYMOUS_CLASS = CommonsPackage.COMMENTABLE___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INITIALIZATION_VALUE___GET_CONTAINING_CONCRETE_CLASSIFIER = CommonsPackage.COMMENTABLE___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INITIALIZATION_VALUE___GET_CONTAINING_COMPILATION_UNIT = CommonsPackage.COMMENTABLE___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INITIALIZATION_VALUE___GET_CONTAINING_PACKAGE_NAME = CommonsPackage.COMMENTABLE___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INITIALIZATION_VALUE___GET_CONTAINING_CONTAINER_NAME = CommonsPackage.COMMENTABLE___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INITIALIZATION_VALUE___GET_PARENT_CONCRETE_CLASSIFIER = CommonsPackage.COMMENTABLE___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INITIALIZATION_VALUE___GET_PARENT_BY_ETYPE__ECLASS = CommonsPackage.COMMENTABLE___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INITIALIZATION_VALUE___GET_FIRST_CHILD_BY_ETYPE__ECLASS = CommonsPackage.COMMENTABLE___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INITIALIZATION_VALUE___GET_PARENT_BY_TYPE__CLASS = CommonsPackage.COMMENTABLE___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INITIALIZATION_VALUE___GET_FIRST_CHILD_BY_TYPE__CLASS = CommonsPackage.COMMENTABLE___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INITIALIZATION_VALUE___GET_CHILDREN_BY_ETYPE__ECLASS = CommonsPackage.COMMENTABLE___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INITIALIZATION_VALUE___GET_CHILDREN_BY_TYPE__CLASS = CommonsPackage.COMMENTABLE___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INITIALIZATION_VALUE___GET_COMMENTS = CommonsPackage.COMMENTABLE___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INITIALIZATION_VALUE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = CommonsPackage.COMMENTABLE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INITIALIZATION_VALUE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = CommonsPackage.COMMENTABLE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The number of operations of the '<em>Array Initialization Value</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INITIALIZATION_VALUE_OPERATION_COUNT = CommonsPackage.COMMENTABLE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArrayInitializerImpl <em>Array Initializer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArrayInitializerImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArraysPackageImpl#getArrayInitializer()
     * @generated
     */
    int ARRAY_INITIALIZER = 2;

    /**
     * The feature id for the '<em><b>Initial Values</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INITIALIZER__INITIAL_VALUES = ARRAY_INITIALIZATION_VALUE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Array Initializer</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INITIALIZER_FEATURE_COUNT = ARRAY_INITIALIZATION_VALUE_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INITIALIZER___GET_CONCRETE_CLASSIFIER__STRING = ARRAY_INITIALIZATION_VALUE___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INITIALIZER___GET_CONCRETE_CLASSIFIER_PROXY__STRING = ARRAY_INITIALIZATION_VALUE___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INITIALIZER___GET_CONCRETE_CLASSIFIERS__STRING_STRING = ARRAY_INITIALIZATION_VALUE___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INITIALIZER___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = ARRAY_INITIALIZATION_VALUE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INITIALIZER___GET_LIB_CLASS__STRING = ARRAY_INITIALIZATION_VALUE___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INITIALIZER___GET_LIB_INTERFACE__STRING = ARRAY_INITIALIZATION_VALUE___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INITIALIZER___GET_CLASS_CLASS = ARRAY_INITIALIZATION_VALUE___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INITIALIZER___GET_OBJECT_CLASS = ARRAY_INITIALIZATION_VALUE___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INITIALIZER___GET_STRING_CLASS = ARRAY_INITIALIZATION_VALUE___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INITIALIZER___GET_ANNOTATION_INTERFACE = ARRAY_INITIALIZATION_VALUE___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INITIALIZER___GET_CONTAINING_ANNOTATION_INSTANCE = ARRAY_INITIALIZATION_VALUE___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INITIALIZER___GET_CONTAINING_ANONYMOUS_CLASS = ARRAY_INITIALIZATION_VALUE___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INITIALIZER___GET_CONTAINING_CONCRETE_CLASSIFIER = ARRAY_INITIALIZATION_VALUE___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INITIALIZER___GET_CONTAINING_COMPILATION_UNIT = ARRAY_INITIALIZATION_VALUE___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INITIALIZER___GET_CONTAINING_PACKAGE_NAME = ARRAY_INITIALIZATION_VALUE___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INITIALIZER___GET_CONTAINING_CONTAINER_NAME = ARRAY_INITIALIZATION_VALUE___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INITIALIZER___GET_PARENT_CONCRETE_CLASSIFIER = ARRAY_INITIALIZATION_VALUE___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INITIALIZER___GET_PARENT_BY_ETYPE__ECLASS = ARRAY_INITIALIZATION_VALUE___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INITIALIZER___GET_FIRST_CHILD_BY_ETYPE__ECLASS = ARRAY_INITIALIZATION_VALUE___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INITIALIZER___GET_PARENT_BY_TYPE__CLASS = ARRAY_INITIALIZATION_VALUE___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INITIALIZER___GET_FIRST_CHILD_BY_TYPE__CLASS = ARRAY_INITIALIZATION_VALUE___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INITIALIZER___GET_CHILDREN_BY_ETYPE__ECLASS = ARRAY_INITIALIZATION_VALUE___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INITIALIZER___GET_CHILDREN_BY_TYPE__CLASS = ARRAY_INITIALIZATION_VALUE___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INITIALIZER___GET_COMMENTS = ARRAY_INITIALIZATION_VALUE___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INITIALIZER___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = ARRAY_INITIALIZATION_VALUE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INITIALIZER___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = ARRAY_INITIALIZATION_VALUE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The number of operations of the '<em>Array Initializer</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INITIALIZER_OPERATION_COUNT = ARRAY_INITIALIZATION_VALUE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArrayInstantiationImpl <em>Array Instantiation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArrayInstantiationImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArraysPackageImpl#getArrayInstantiation()
     * @generated
     */
    int ARRAY_INSTANTIATION = 4;

    /**
     * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION__TYPE_ARGUMENTS = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Next</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION__NEXT = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Array Selectors</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION__ARRAY_SELECTORS = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Array Instantiation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_FEATURE_COUNT = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 3;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION___GET_CONCRETE_CLASSIFIER__STRING = ExpressionsPackage.EXPRESSION___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION___GET_CONCRETE_CLASSIFIER_PROXY__STRING = ExpressionsPackage.EXPRESSION___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION___GET_CONCRETE_CLASSIFIERS__STRING_STRING = ExpressionsPackage.EXPRESSION___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = ExpressionsPackage.EXPRESSION___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION___GET_LIB_CLASS__STRING = ExpressionsPackage.EXPRESSION___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION___GET_LIB_INTERFACE__STRING = ExpressionsPackage.EXPRESSION___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION___GET_CLASS_CLASS = ExpressionsPackage.EXPRESSION___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION___GET_OBJECT_CLASS = ExpressionsPackage.EXPRESSION___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION___GET_STRING_CLASS = ExpressionsPackage.EXPRESSION___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION___GET_ANNOTATION_INTERFACE = ExpressionsPackage.EXPRESSION___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION___GET_CONTAINING_ANNOTATION_INSTANCE = ExpressionsPackage.EXPRESSION___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION___GET_CONTAINING_ANONYMOUS_CLASS = ExpressionsPackage.EXPRESSION___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION___GET_CONTAINING_CONCRETE_CLASSIFIER = ExpressionsPackage.EXPRESSION___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION___GET_CONTAINING_COMPILATION_UNIT = ExpressionsPackage.EXPRESSION___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION___GET_CONTAINING_PACKAGE_NAME = ExpressionsPackage.EXPRESSION___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION___GET_CONTAINING_CONTAINER_NAME = ExpressionsPackage.EXPRESSION___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION___GET_PARENT_CONCRETE_CLASSIFIER = ExpressionsPackage.EXPRESSION___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION___GET_PARENT_BY_ETYPE__ECLASS = ExpressionsPackage.EXPRESSION___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION___GET_FIRST_CHILD_BY_ETYPE__ECLASS = ExpressionsPackage.EXPRESSION___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION___GET_PARENT_BY_TYPE__CLASS = ExpressionsPackage.EXPRESSION___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION___GET_FIRST_CHILD_BY_TYPE__CLASS = ExpressionsPackage.EXPRESSION___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION___GET_CHILDREN_BY_ETYPE__ECLASS = ExpressionsPackage.EXPRESSION___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION___GET_CHILDREN_BY_TYPE__CLASS = ExpressionsPackage.EXPRESSION___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION___GET_COMMENTS = ExpressionsPackage.EXPRESSION___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = ExpressionsPackage.EXPRESSION___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = ExpressionsPackage.EXPRESSION___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION___GET_TYPE = ExpressionsPackage.EXPRESSION___GET_TYPE;

    /**
     * The operation id for the '<em>Get Alternative Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION___GET_ALTERNATIVE_TYPE = ExpressionsPackage.EXPRESSION___GET_ALTERNATIVE_TYPE;

    /**
     * The operation id for the '<em>Get One Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION___GET_ONE_TYPE__BOOLEAN = ExpressionsPackage.EXPRESSION___GET_ONE_TYPE__BOOLEAN;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION___GET_ARRAY_DIMENSION = ExpressionsPackage.EXPRESSION___GET_ARRAY_DIMENSION;

    /**
     * The operation id for the '<em>Get Referenced Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION___GET_REFERENCED_TYPE = ExpressionsPackage.EXPRESSION_OPERATION_COUNT + 0;

    /**
     * The operation id for the '<em>Get Previous</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION___GET_PREVIOUS = ExpressionsPackage.EXPRESSION_OPERATION_COUNT + 1;

    /**
     * The number of operations of the '<em>Array Instantiation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_OPERATION_COUNT = ExpressionsPackage.EXPRESSION_OPERATION_COUNT + 2;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArrayInstantiationBySizeImpl <em>Array Instantiation By Size</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArrayInstantiationBySizeImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArraysPackageImpl#getArrayInstantiationBySize()
     * @generated
     */
    int ARRAY_INSTANTIATION_BY_SIZE = 5;

    /**
     * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_SIZE__TYPE_ARGUMENTS = ARRAY_INSTANTIATION__TYPE_ARGUMENTS;

    /**
     * The feature id for the '<em><b>Next</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_SIZE__NEXT = ARRAY_INSTANTIATION__NEXT;

    /**
     * The feature id for the '<em><b>Array Selectors</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_SIZE__ARRAY_SELECTORS = ARRAY_INSTANTIATION__ARRAY_SELECTORS;

    /**
     * The feature id for the '<em><b>Type Reference</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_SIZE__TYPE_REFERENCE = ARRAY_INSTANTIATION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Array Dimensions Before</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_SIZE__ARRAY_DIMENSIONS_BEFORE = ARRAY_INSTANTIATION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Array Dimensions After</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_SIZE__ARRAY_DIMENSIONS_AFTER = ARRAY_INSTANTIATION_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Sizes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_SIZE__SIZES = ARRAY_INSTANTIATION_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Array Instantiation By Size</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_SIZE_FEATURE_COUNT = ARRAY_INSTANTIATION_FEATURE_COUNT + 4;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_SIZE___GET_CONCRETE_CLASSIFIER__STRING = ARRAY_INSTANTIATION___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_SIZE___GET_CONCRETE_CLASSIFIER_PROXY__STRING = ARRAY_INSTANTIATION___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_SIZE___GET_CONCRETE_CLASSIFIERS__STRING_STRING = ARRAY_INSTANTIATION___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_SIZE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = ARRAY_INSTANTIATION___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_SIZE___GET_LIB_CLASS__STRING = ARRAY_INSTANTIATION___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_SIZE___GET_LIB_INTERFACE__STRING = ARRAY_INSTANTIATION___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_SIZE___GET_CLASS_CLASS = ARRAY_INSTANTIATION___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_SIZE___GET_OBJECT_CLASS = ARRAY_INSTANTIATION___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_SIZE___GET_STRING_CLASS = ARRAY_INSTANTIATION___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_SIZE___GET_ANNOTATION_INTERFACE = ARRAY_INSTANTIATION___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_SIZE___GET_CONTAINING_ANNOTATION_INSTANCE = ARRAY_INSTANTIATION___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_SIZE___GET_CONTAINING_ANONYMOUS_CLASS = ARRAY_INSTANTIATION___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_SIZE___GET_CONTAINING_CONCRETE_CLASSIFIER = ARRAY_INSTANTIATION___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_SIZE___GET_CONTAINING_COMPILATION_UNIT = ARRAY_INSTANTIATION___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_SIZE___GET_CONTAINING_PACKAGE_NAME = ARRAY_INSTANTIATION___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_SIZE___GET_CONTAINING_CONTAINER_NAME = ARRAY_INSTANTIATION___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_SIZE___GET_PARENT_CONCRETE_CLASSIFIER = ARRAY_INSTANTIATION___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_SIZE___GET_PARENT_BY_ETYPE__ECLASS = ARRAY_INSTANTIATION___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_SIZE___GET_FIRST_CHILD_BY_ETYPE__ECLASS = ARRAY_INSTANTIATION___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_SIZE___GET_PARENT_BY_TYPE__CLASS = ARRAY_INSTANTIATION___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_SIZE___GET_FIRST_CHILD_BY_TYPE__CLASS = ARRAY_INSTANTIATION___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_SIZE___GET_CHILDREN_BY_ETYPE__ECLASS = ARRAY_INSTANTIATION___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_SIZE___GET_CHILDREN_BY_TYPE__CLASS = ARRAY_INSTANTIATION___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_SIZE___GET_COMMENTS = ARRAY_INSTANTIATION___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_SIZE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = ARRAY_INSTANTIATION___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_SIZE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = ARRAY_INSTANTIATION___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_SIZE___GET_TYPE = ARRAY_INSTANTIATION___GET_TYPE;

    /**
     * The operation id for the '<em>Get Alternative Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_SIZE___GET_ALTERNATIVE_TYPE = ARRAY_INSTANTIATION___GET_ALTERNATIVE_TYPE;

    /**
     * The operation id for the '<em>Get One Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_SIZE___GET_ONE_TYPE__BOOLEAN = ARRAY_INSTANTIATION___GET_ONE_TYPE__BOOLEAN;

    /**
     * The operation id for the '<em>Get Referenced Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_SIZE___GET_REFERENCED_TYPE = ARRAY_INSTANTIATION___GET_REFERENCED_TYPE;

    /**
     * The operation id for the '<em>Get Previous</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_SIZE___GET_PREVIOUS = ARRAY_INSTANTIATION___GET_PREVIOUS;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_SIZE___GET_ARRAY_DIMENSION = ARRAY_INSTANTIATION_OPERATION_COUNT + 0;

    /**
     * The number of operations of the '<em>Array Instantiation By Size</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_SIZE_OPERATION_COUNT = ARRAY_INSTANTIATION_OPERATION_COUNT + 1;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArrayInstantiationByValuesImpl <em>Array Instantiation By Values</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArrayInstantiationByValuesImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArraysPackageImpl#getArrayInstantiationByValues()
     * @generated
     */
    int ARRAY_INSTANTIATION_BY_VALUES = 6;

    /**
     * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES__TYPE_ARGUMENTS = ARRAY_INSTANTIATION__TYPE_ARGUMENTS;

    /**
     * The feature id for the '<em><b>Next</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES__NEXT = ARRAY_INSTANTIATION__NEXT;

    /**
     * The feature id for the '<em><b>Array Selectors</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES__ARRAY_SELECTORS = ARRAY_INSTANTIATION__ARRAY_SELECTORS;

    /**
     * The feature id for the '<em><b>Array Initializer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES__ARRAY_INITIALIZER = ARRAY_INSTANTIATION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Array Instantiation By Values</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_FEATURE_COUNT = ARRAY_INSTANTIATION_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES___GET_CONCRETE_CLASSIFIER__STRING = ARRAY_INSTANTIATION___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES___GET_CONCRETE_CLASSIFIER_PROXY__STRING = ARRAY_INSTANTIATION___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES___GET_CONCRETE_CLASSIFIERS__STRING_STRING = ARRAY_INSTANTIATION___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = ARRAY_INSTANTIATION___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES___GET_LIB_CLASS__STRING = ARRAY_INSTANTIATION___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES___GET_LIB_INTERFACE__STRING = ARRAY_INSTANTIATION___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES___GET_CLASS_CLASS = ARRAY_INSTANTIATION___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES___GET_OBJECT_CLASS = ARRAY_INSTANTIATION___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES___GET_STRING_CLASS = ARRAY_INSTANTIATION___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES___GET_ANNOTATION_INTERFACE = ARRAY_INSTANTIATION___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES___GET_CONTAINING_ANNOTATION_INSTANCE = ARRAY_INSTANTIATION___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES___GET_CONTAINING_ANONYMOUS_CLASS = ARRAY_INSTANTIATION___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES___GET_CONTAINING_CONCRETE_CLASSIFIER = ARRAY_INSTANTIATION___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES___GET_CONTAINING_COMPILATION_UNIT = ARRAY_INSTANTIATION___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES___GET_CONTAINING_PACKAGE_NAME = ARRAY_INSTANTIATION___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES___GET_CONTAINING_CONTAINER_NAME = ARRAY_INSTANTIATION___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES___GET_PARENT_CONCRETE_CLASSIFIER = ARRAY_INSTANTIATION___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES___GET_PARENT_BY_ETYPE__ECLASS = ARRAY_INSTANTIATION___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES___GET_FIRST_CHILD_BY_ETYPE__ECLASS = ARRAY_INSTANTIATION___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES___GET_PARENT_BY_TYPE__CLASS = ARRAY_INSTANTIATION___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES___GET_FIRST_CHILD_BY_TYPE__CLASS = ARRAY_INSTANTIATION___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES___GET_CHILDREN_BY_ETYPE__ECLASS = ARRAY_INSTANTIATION___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES___GET_CHILDREN_BY_TYPE__CLASS = ARRAY_INSTANTIATION___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES___GET_COMMENTS = ARRAY_INSTANTIATION___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = ARRAY_INSTANTIATION___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = ARRAY_INSTANTIATION___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES___GET_TYPE = ARRAY_INSTANTIATION___GET_TYPE;

    /**
     * The operation id for the '<em>Get Alternative Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES___GET_ALTERNATIVE_TYPE = ARRAY_INSTANTIATION___GET_ALTERNATIVE_TYPE;

    /**
     * The operation id for the '<em>Get One Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES___GET_ONE_TYPE__BOOLEAN = ARRAY_INSTANTIATION___GET_ONE_TYPE__BOOLEAN;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES___GET_ARRAY_DIMENSION = ARRAY_INSTANTIATION___GET_ARRAY_DIMENSION;

    /**
     * The operation id for the '<em>Get Referenced Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES___GET_REFERENCED_TYPE = ARRAY_INSTANTIATION___GET_REFERENCED_TYPE;

    /**
     * The operation id for the '<em>Get Previous</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES___GET_PREVIOUS = ARRAY_INSTANTIATION___GET_PREVIOUS;

    /**
     * The number of operations of the '<em>Array Instantiation By Values</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_OPERATION_COUNT = ARRAY_INSTANTIATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArrayInstantiationByValuesUntypedImpl <em>Array Instantiation By Values Untyped</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArrayInstantiationByValuesUntypedImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArraysPackageImpl#getArrayInstantiationByValuesUntyped()
     * @generated
     */
    int ARRAY_INSTANTIATION_BY_VALUES_UNTYPED = 7;

    /**
     * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_UNTYPED__TYPE_ARGUMENTS = ARRAY_INSTANTIATION_BY_VALUES__TYPE_ARGUMENTS;

    /**
     * The feature id for the '<em><b>Next</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_UNTYPED__NEXT = ARRAY_INSTANTIATION_BY_VALUES__NEXT;

    /**
     * The feature id for the '<em><b>Array Selectors</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_UNTYPED__ARRAY_SELECTORS = ARRAY_INSTANTIATION_BY_VALUES__ARRAY_SELECTORS;

    /**
     * The feature id for the '<em><b>Array Initializer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_UNTYPED__ARRAY_INITIALIZER = ARRAY_INSTANTIATION_BY_VALUES__ARRAY_INITIALIZER;

    /**
     * The number of structural features of the '<em>Array Instantiation By Values Untyped</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_UNTYPED_FEATURE_COUNT = ARRAY_INSTANTIATION_BY_VALUES_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_UNTYPED___GET_CONCRETE_CLASSIFIER__STRING = ARRAY_INSTANTIATION_BY_VALUES___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_UNTYPED___GET_CONCRETE_CLASSIFIER_PROXY__STRING = ARRAY_INSTANTIATION_BY_VALUES___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_UNTYPED___GET_CONCRETE_CLASSIFIERS__STRING_STRING = ARRAY_INSTANTIATION_BY_VALUES___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_UNTYPED___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = ARRAY_INSTANTIATION_BY_VALUES___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_UNTYPED___GET_LIB_CLASS__STRING = ARRAY_INSTANTIATION_BY_VALUES___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_UNTYPED___GET_LIB_INTERFACE__STRING = ARRAY_INSTANTIATION_BY_VALUES___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_UNTYPED___GET_CLASS_CLASS = ARRAY_INSTANTIATION_BY_VALUES___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_UNTYPED___GET_OBJECT_CLASS = ARRAY_INSTANTIATION_BY_VALUES___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_UNTYPED___GET_STRING_CLASS = ARRAY_INSTANTIATION_BY_VALUES___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_UNTYPED___GET_ANNOTATION_INTERFACE = ARRAY_INSTANTIATION_BY_VALUES___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_UNTYPED___GET_CONTAINING_ANNOTATION_INSTANCE = ARRAY_INSTANTIATION_BY_VALUES___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_UNTYPED___GET_CONTAINING_ANONYMOUS_CLASS = ARRAY_INSTANTIATION_BY_VALUES___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_UNTYPED___GET_CONTAINING_CONCRETE_CLASSIFIER = ARRAY_INSTANTIATION_BY_VALUES___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_UNTYPED___GET_CONTAINING_COMPILATION_UNIT = ARRAY_INSTANTIATION_BY_VALUES___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_UNTYPED___GET_CONTAINING_PACKAGE_NAME = ARRAY_INSTANTIATION_BY_VALUES___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_UNTYPED___GET_CONTAINING_CONTAINER_NAME = ARRAY_INSTANTIATION_BY_VALUES___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_UNTYPED___GET_PARENT_CONCRETE_CLASSIFIER = ARRAY_INSTANTIATION_BY_VALUES___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_UNTYPED___GET_PARENT_BY_ETYPE__ECLASS = ARRAY_INSTANTIATION_BY_VALUES___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_UNTYPED___GET_FIRST_CHILD_BY_ETYPE__ECLASS = ARRAY_INSTANTIATION_BY_VALUES___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_UNTYPED___GET_PARENT_BY_TYPE__CLASS = ARRAY_INSTANTIATION_BY_VALUES___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_UNTYPED___GET_FIRST_CHILD_BY_TYPE__CLASS = ARRAY_INSTANTIATION_BY_VALUES___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_UNTYPED___GET_CHILDREN_BY_ETYPE__ECLASS = ARRAY_INSTANTIATION_BY_VALUES___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_UNTYPED___GET_CHILDREN_BY_TYPE__CLASS = ARRAY_INSTANTIATION_BY_VALUES___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_UNTYPED___GET_COMMENTS = ARRAY_INSTANTIATION_BY_VALUES___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_UNTYPED___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = ARRAY_INSTANTIATION_BY_VALUES___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_UNTYPED___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = ARRAY_INSTANTIATION_BY_VALUES___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_UNTYPED___GET_TYPE = ARRAY_INSTANTIATION_BY_VALUES___GET_TYPE;

    /**
     * The operation id for the '<em>Get Alternative Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_UNTYPED___GET_ALTERNATIVE_TYPE = ARRAY_INSTANTIATION_BY_VALUES___GET_ALTERNATIVE_TYPE;

    /**
     * The operation id for the '<em>Get One Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_UNTYPED___GET_ONE_TYPE__BOOLEAN = ARRAY_INSTANTIATION_BY_VALUES___GET_ONE_TYPE__BOOLEAN;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_UNTYPED___GET_ARRAY_DIMENSION = ARRAY_INSTANTIATION_BY_VALUES___GET_ARRAY_DIMENSION;

    /**
     * The operation id for the '<em>Get Referenced Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_UNTYPED___GET_REFERENCED_TYPE = ARRAY_INSTANTIATION_BY_VALUES___GET_REFERENCED_TYPE;

    /**
     * The operation id for the '<em>Get Previous</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_UNTYPED___GET_PREVIOUS = ARRAY_INSTANTIATION_BY_VALUES___GET_PREVIOUS;

    /**
     * The number of operations of the '<em>Array Instantiation By Values Untyped</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_UNTYPED_OPERATION_COUNT = ARRAY_INSTANTIATION_BY_VALUES_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArrayInstantiationByValuesTypedImpl <em>Array Instantiation By Values Typed</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArrayInstantiationByValuesTypedImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArraysPackageImpl#getArrayInstantiationByValuesTyped()
     * @generated
     */
    int ARRAY_INSTANTIATION_BY_VALUES_TYPED = 8;

    /**
     * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_TYPED__TYPE_ARGUMENTS = ARRAY_INSTANTIATION_BY_VALUES__TYPE_ARGUMENTS;

    /**
     * The feature id for the '<em><b>Next</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_TYPED__NEXT = ARRAY_INSTANTIATION_BY_VALUES__NEXT;

    /**
     * The feature id for the '<em><b>Array Selectors</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_TYPED__ARRAY_SELECTORS = ARRAY_INSTANTIATION_BY_VALUES__ARRAY_SELECTORS;

    /**
     * The feature id for the '<em><b>Array Initializer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_TYPED__ARRAY_INITIALIZER = ARRAY_INSTANTIATION_BY_VALUES__ARRAY_INITIALIZER;

    /**
     * The feature id for the '<em><b>Type Reference</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_TYPED__TYPE_REFERENCE = ARRAY_INSTANTIATION_BY_VALUES_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Array Dimensions Before</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_TYPED__ARRAY_DIMENSIONS_BEFORE = ARRAY_INSTANTIATION_BY_VALUES_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Array Dimensions After</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_TYPED__ARRAY_DIMENSIONS_AFTER = ARRAY_INSTANTIATION_BY_VALUES_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Array Instantiation By Values Typed</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_TYPED_FEATURE_COUNT = ARRAY_INSTANTIATION_BY_VALUES_FEATURE_COUNT + 3;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_TYPED___GET_CONCRETE_CLASSIFIER__STRING = ARRAY_INSTANTIATION_BY_VALUES___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_TYPED___GET_CONCRETE_CLASSIFIER_PROXY__STRING = ARRAY_INSTANTIATION_BY_VALUES___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_TYPED___GET_CONCRETE_CLASSIFIERS__STRING_STRING = ARRAY_INSTANTIATION_BY_VALUES___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_TYPED___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = ARRAY_INSTANTIATION_BY_VALUES___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_TYPED___GET_LIB_CLASS__STRING = ARRAY_INSTANTIATION_BY_VALUES___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_TYPED___GET_LIB_INTERFACE__STRING = ARRAY_INSTANTIATION_BY_VALUES___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_TYPED___GET_CLASS_CLASS = ARRAY_INSTANTIATION_BY_VALUES___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_TYPED___GET_OBJECT_CLASS = ARRAY_INSTANTIATION_BY_VALUES___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_TYPED___GET_STRING_CLASS = ARRAY_INSTANTIATION_BY_VALUES___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_TYPED___GET_ANNOTATION_INTERFACE = ARRAY_INSTANTIATION_BY_VALUES___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_TYPED___GET_CONTAINING_ANNOTATION_INSTANCE = ARRAY_INSTANTIATION_BY_VALUES___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_TYPED___GET_CONTAINING_ANONYMOUS_CLASS = ARRAY_INSTANTIATION_BY_VALUES___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_TYPED___GET_CONTAINING_CONCRETE_CLASSIFIER = ARRAY_INSTANTIATION_BY_VALUES___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_TYPED___GET_CONTAINING_COMPILATION_UNIT = ARRAY_INSTANTIATION_BY_VALUES___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_TYPED___GET_CONTAINING_PACKAGE_NAME = ARRAY_INSTANTIATION_BY_VALUES___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_TYPED___GET_CONTAINING_CONTAINER_NAME = ARRAY_INSTANTIATION_BY_VALUES___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_TYPED___GET_PARENT_CONCRETE_CLASSIFIER = ARRAY_INSTANTIATION_BY_VALUES___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_TYPED___GET_PARENT_BY_ETYPE__ECLASS = ARRAY_INSTANTIATION_BY_VALUES___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_TYPED___GET_FIRST_CHILD_BY_ETYPE__ECLASS = ARRAY_INSTANTIATION_BY_VALUES___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_TYPED___GET_PARENT_BY_TYPE__CLASS = ARRAY_INSTANTIATION_BY_VALUES___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_TYPED___GET_FIRST_CHILD_BY_TYPE__CLASS = ARRAY_INSTANTIATION_BY_VALUES___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_TYPED___GET_CHILDREN_BY_ETYPE__ECLASS = ARRAY_INSTANTIATION_BY_VALUES___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_TYPED___GET_CHILDREN_BY_TYPE__CLASS = ARRAY_INSTANTIATION_BY_VALUES___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_TYPED___GET_COMMENTS = ARRAY_INSTANTIATION_BY_VALUES___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_TYPED___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = ARRAY_INSTANTIATION_BY_VALUES___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_TYPED___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = ARRAY_INSTANTIATION_BY_VALUES___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_TYPED___GET_TYPE = ARRAY_INSTANTIATION_BY_VALUES___GET_TYPE;

    /**
     * The operation id for the '<em>Get Alternative Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_TYPED___GET_ALTERNATIVE_TYPE = ARRAY_INSTANTIATION_BY_VALUES___GET_ALTERNATIVE_TYPE;

    /**
     * The operation id for the '<em>Get One Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_TYPED___GET_ONE_TYPE__BOOLEAN = ARRAY_INSTANTIATION_BY_VALUES___GET_ONE_TYPE__BOOLEAN;

    /**
     * The operation id for the '<em>Get Referenced Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_TYPED___GET_REFERENCED_TYPE = ARRAY_INSTANTIATION_BY_VALUES___GET_REFERENCED_TYPE;

    /**
     * The operation id for the '<em>Get Previous</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_TYPED___GET_PREVIOUS = ARRAY_INSTANTIATION_BY_VALUES___GET_PREVIOUS;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_TYPED___GET_ARRAY_DIMENSION = ARRAY_INSTANTIATION_BY_VALUES_OPERATION_COUNT + 0;

    /**
     * The number of operations of the '<em>Array Instantiation By Values Typed</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_INSTANTIATION_BY_VALUES_TYPED_OPERATION_COUNT = ARRAY_INSTANTIATION_BY_VALUES_OPERATION_COUNT + 1;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArraySelectorImpl <em>Array Selector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArraySelectorImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArraysPackageImpl#getArraySelector()
     * @generated
     */
    int ARRAY_SELECTOR = 9;

    /**
     * The feature id for the '<em><b>Position</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_SELECTOR__POSITION = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Array Selector</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_SELECTOR_FEATURE_COUNT = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_SELECTOR___GET_CONCRETE_CLASSIFIER__STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_SELECTOR___GET_CONCRETE_CLASSIFIER_PROXY__STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_SELECTOR___GET_CONCRETE_CLASSIFIERS__STRING_STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_SELECTOR___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_SELECTOR___GET_LIB_CLASS__STRING = CommonsPackage.COMMENTABLE___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_SELECTOR___GET_LIB_INTERFACE__STRING = CommonsPackage.COMMENTABLE___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_SELECTOR___GET_CLASS_CLASS = CommonsPackage.COMMENTABLE___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_SELECTOR___GET_OBJECT_CLASS = CommonsPackage.COMMENTABLE___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_SELECTOR___GET_STRING_CLASS = CommonsPackage.COMMENTABLE___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_SELECTOR___GET_ANNOTATION_INTERFACE = CommonsPackage.COMMENTABLE___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_SELECTOR___GET_CONTAINING_ANNOTATION_INSTANCE = CommonsPackage.COMMENTABLE___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_SELECTOR___GET_CONTAINING_ANONYMOUS_CLASS = CommonsPackage.COMMENTABLE___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_SELECTOR___GET_CONTAINING_CONCRETE_CLASSIFIER = CommonsPackage.COMMENTABLE___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_SELECTOR___GET_CONTAINING_COMPILATION_UNIT = CommonsPackage.COMMENTABLE___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_SELECTOR___GET_CONTAINING_PACKAGE_NAME = CommonsPackage.COMMENTABLE___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_SELECTOR___GET_CONTAINING_CONTAINER_NAME = CommonsPackage.COMMENTABLE___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_SELECTOR___GET_PARENT_CONCRETE_CLASSIFIER = CommonsPackage.COMMENTABLE___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_SELECTOR___GET_PARENT_BY_ETYPE__ECLASS = CommonsPackage.COMMENTABLE___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_SELECTOR___GET_FIRST_CHILD_BY_ETYPE__ECLASS = CommonsPackage.COMMENTABLE___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_SELECTOR___GET_PARENT_BY_TYPE__CLASS = CommonsPackage.COMMENTABLE___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_SELECTOR___GET_FIRST_CHILD_BY_TYPE__CLASS = CommonsPackage.COMMENTABLE___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_SELECTOR___GET_CHILDREN_BY_ETYPE__ECLASS = CommonsPackage.COMMENTABLE___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_SELECTOR___GET_CHILDREN_BY_TYPE__CLASS = CommonsPackage.COMMENTABLE___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_SELECTOR___GET_COMMENTS = CommonsPackage.COMMENTABLE___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_SELECTOR___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = CommonsPackage.COMMENTABLE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_SELECTOR___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = CommonsPackage.COMMENTABLE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The number of operations of the '<em>Array Selector</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_SELECTOR_OPERATION_COUNT = CommonsPackage.COMMENTABLE_OPERATION_COUNT + 0;

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayTypeable <em>Array Typeable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Array Typeable</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayTypeable
     * @generated
     */
    EClass getArrayTypeable();

    /**
     * Returns the meta object for the containment reference list '{@link org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayTypeable#getArrayDimensionsBefore <em>Array Dimensions Before</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Array Dimensions Before</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayTypeable#getArrayDimensionsBefore()
     * @see #getArrayTypeable()
     * @generated
     */
    EReference getArrayTypeable_ArrayDimensionsBefore();

    /**
     * Returns the meta object for the containment reference list '{@link org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayTypeable#getArrayDimensionsAfter <em>Array Dimensions After</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Array Dimensions After</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayTypeable#getArrayDimensionsAfter()
     * @see #getArrayTypeable()
     * @generated
     */
    EReference getArrayTypeable_ArrayDimensionsAfter();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayTypeable#getArrayDimension() <em>Get Array Dimension</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Array Dimension</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayTypeable#getArrayDimension()
     * @generated
     */
    EOperation getArrayTypeable__GetArrayDimension();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayDimension <em>Array Dimension</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Array Dimension</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayDimension
     * @generated
     */
    EClass getArrayDimension();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayInitializer <em>Array Initializer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Array Initializer</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayInitializer
     * @generated
     */
    EClass getArrayInitializer();

    /**
     * Returns the meta object for the containment reference list '{@link org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayInitializer#getInitialValues <em>Initial Values</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Initial Values</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayInitializer#getInitialValues()
     * @see #getArrayInitializer()
     * @generated
     */
    EReference getArrayInitializer_InitialValues();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayInitializationValue <em>Array Initialization Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Array Initialization Value</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayInitializationValue
     * @generated
     */
    EClass getArrayInitializationValue();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayInstantiation <em>Array Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Array Instantiation</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayInstantiation
     * @generated
     */
    EClass getArrayInstantiation();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayInstantiationBySize <em>Array Instantiation By Size</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Array Instantiation By Size</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayInstantiationBySize
     * @generated
     */
    EClass getArrayInstantiationBySize();

    /**
     * Returns the meta object for the containment reference list '{@link org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayInstantiationBySize#getSizes <em>Sizes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Sizes</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayInstantiationBySize#getSizes()
     * @see #getArrayInstantiationBySize()
     * @generated
     */
    EReference getArrayInstantiationBySize_Sizes();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayInstantiationByValues <em>Array Instantiation By Values</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Array Instantiation By Values</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayInstantiationByValues
     * @generated
     */
    EClass getArrayInstantiationByValues();

    /**
     * Returns the meta object for the containment reference '{@link org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayInstantiationByValues#getArrayInitializer <em>Array Initializer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Array Initializer</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayInstantiationByValues#getArrayInitializer()
     * @see #getArrayInstantiationByValues()
     * @generated
     */
    EReference getArrayInstantiationByValues_ArrayInitializer();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayInstantiationByValuesUntyped <em>Array Instantiation By Values Untyped</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Array Instantiation By Values Untyped</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayInstantiationByValuesUntyped
     * @generated
     */
    EClass getArrayInstantiationByValuesUntyped();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayInstantiationByValuesTyped <em>Array Instantiation By Values Typed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Array Instantiation By Values Typed</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayInstantiationByValuesTyped
     * @generated
     */
    EClass getArrayInstantiationByValuesTyped();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArraySelector <em>Array Selector</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Array Selector</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArraySelector
     * @generated
     */
    EClass getArraySelector();

    /**
     * Returns the meta object for the containment reference '{@link org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArraySelector#getPosition <em>Position</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Position</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArraySelector#getPosition()
     * @see #getArraySelector()
     * @generated
     */
    EReference getArraySelector_Position();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    ArraysFactory getArraysFactory();

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
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArrayTypeableImpl <em>Array Typeable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArrayTypeableImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArraysPackageImpl#getArrayTypeable()
         * @generated
         */
        EClass ARRAY_TYPEABLE = eINSTANCE.getArrayTypeable();

        /**
         * The meta object literal for the '<em><b>Array Dimensions Before</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ARRAY_TYPEABLE__ARRAY_DIMENSIONS_BEFORE = eINSTANCE.getArrayTypeable_ArrayDimensionsBefore();

        /**
         * The meta object literal for the '<em><b>Array Dimensions After</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ARRAY_TYPEABLE__ARRAY_DIMENSIONS_AFTER = eINSTANCE.getArrayTypeable_ArrayDimensionsAfter();

        /**
         * The meta object literal for the '<em><b>Get Array Dimension</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation ARRAY_TYPEABLE___GET_ARRAY_DIMENSION = eINSTANCE.getArrayTypeable__GetArrayDimension();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArrayDimensionImpl <em>Array Dimension</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArrayDimensionImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArraysPackageImpl#getArrayDimension()
         * @generated
         */
        EClass ARRAY_DIMENSION = eINSTANCE.getArrayDimension();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArrayInitializerImpl <em>Array Initializer</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArrayInitializerImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArraysPackageImpl#getArrayInitializer()
         * @generated
         */
        EClass ARRAY_INITIALIZER = eINSTANCE.getArrayInitializer();

        /**
         * The meta object literal for the '<em><b>Initial Values</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ARRAY_INITIALIZER__INITIAL_VALUES = eINSTANCE.getArrayInitializer_InitialValues();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArrayInitializationValueImpl <em>Array Initialization Value</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArrayInitializationValueImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArraysPackageImpl#getArrayInitializationValue()
         * @generated
         */
        EClass ARRAY_INITIALIZATION_VALUE = eINSTANCE.getArrayInitializationValue();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArrayInstantiationImpl <em>Array Instantiation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArrayInstantiationImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArraysPackageImpl#getArrayInstantiation()
         * @generated
         */
        EClass ARRAY_INSTANTIATION = eINSTANCE.getArrayInstantiation();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArrayInstantiationBySizeImpl <em>Array Instantiation By Size</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArrayInstantiationBySizeImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArraysPackageImpl#getArrayInstantiationBySize()
         * @generated
         */
        EClass ARRAY_INSTANTIATION_BY_SIZE = eINSTANCE.getArrayInstantiationBySize();

        /**
         * The meta object literal for the '<em><b>Sizes</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ARRAY_INSTANTIATION_BY_SIZE__SIZES = eINSTANCE.getArrayInstantiationBySize_Sizes();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArrayInstantiationByValuesImpl <em>Array Instantiation By Values</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArrayInstantiationByValuesImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArraysPackageImpl#getArrayInstantiationByValues()
         * @generated
         */
        EClass ARRAY_INSTANTIATION_BY_VALUES = eINSTANCE.getArrayInstantiationByValues();

        /**
         * The meta object literal for the '<em><b>Array Initializer</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ARRAY_INSTANTIATION_BY_VALUES__ARRAY_INITIALIZER = eINSTANCE
                .getArrayInstantiationByValues_ArrayInitializer();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArrayInstantiationByValuesUntypedImpl <em>Array Instantiation By Values Untyped</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArrayInstantiationByValuesUntypedImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArraysPackageImpl#getArrayInstantiationByValuesUntyped()
         * @generated
         */
        EClass ARRAY_INSTANTIATION_BY_VALUES_UNTYPED = eINSTANCE.getArrayInstantiationByValuesUntyped();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArrayInstantiationByValuesTypedImpl <em>Array Instantiation By Values Typed</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArrayInstantiationByValuesTypedImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArraysPackageImpl#getArrayInstantiationByValuesTyped()
         * @generated
         */
        EClass ARRAY_INSTANTIATION_BY_VALUES_TYPED = eINSTANCE.getArrayInstantiationByValuesTyped();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArraySelectorImpl <em>Array Selector</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArraySelectorImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArraysPackageImpl#getArraySelector()
         * @generated
         */
        EClass ARRAY_SELECTOR = eINSTANCE.getArraySelector();

        /**
         * The meta object literal for the '<em><b>Position</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ARRAY_SELECTOR__POSITION = eINSTANCE.getArraySelector_Position();

    }

} //ArraysPackage
