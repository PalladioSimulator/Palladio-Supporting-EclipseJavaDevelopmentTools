/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.generics;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArraysPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.ClassifiersPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.CommonsPackage;

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
 * @see org.palladiosimulator.jdt.metamodel.javamodel.generics.GenericsFactory
 * @model kind="package"
 * @generated
 */
public interface GenericsPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "generics";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.palladiosimulator.org/javamodel/generics";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "generics";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    GenericsPackage eINSTANCE = org.palladiosimulator.jdt.metamodel.javamodel.generics.impl.GenericsPackageImpl.init();

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.generics.impl.TypeArgumentImpl <em>Type Argument</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.generics.impl.TypeArgumentImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.generics.impl.GenericsPackageImpl#getTypeArgument()
     * @generated
     */
    int TYPE_ARGUMENT = 0;

    /**
     * The feature id for the '<em><b>Array Dimensions Before</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_ARGUMENT__ARRAY_DIMENSIONS_BEFORE = ArraysPackage.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_BEFORE;

    /**
     * The feature id for the '<em><b>Array Dimensions After</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_ARGUMENT__ARRAY_DIMENSIONS_AFTER = ArraysPackage.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_AFTER;

    /**
     * The number of structural features of the '<em>Type Argument</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_ARGUMENT_FEATURE_COUNT = ArraysPackage.ARRAY_TYPEABLE_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_ARGUMENT___GET_CONCRETE_CLASSIFIER__STRING = ArraysPackage.ARRAY_TYPEABLE___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_ARGUMENT___GET_CONCRETE_CLASSIFIER_PROXY__STRING = ArraysPackage.ARRAY_TYPEABLE___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_ARGUMENT___GET_CONCRETE_CLASSIFIERS__STRING_STRING = ArraysPackage.ARRAY_TYPEABLE___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_ARGUMENT___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = ArraysPackage.ARRAY_TYPEABLE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_ARGUMENT___GET_LIB_CLASS__STRING = ArraysPackage.ARRAY_TYPEABLE___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_ARGUMENT___GET_LIB_INTERFACE__STRING = ArraysPackage.ARRAY_TYPEABLE___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_ARGUMENT___GET_CLASS_CLASS = ArraysPackage.ARRAY_TYPEABLE___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_ARGUMENT___GET_OBJECT_CLASS = ArraysPackage.ARRAY_TYPEABLE___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_ARGUMENT___GET_STRING_CLASS = ArraysPackage.ARRAY_TYPEABLE___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_ARGUMENT___GET_ANNOTATION_INTERFACE = ArraysPackage.ARRAY_TYPEABLE___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_ARGUMENT___GET_CONTAINING_ANNOTATION_INSTANCE = ArraysPackage.ARRAY_TYPEABLE___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_ARGUMENT___GET_CONTAINING_ANONYMOUS_CLASS = ArraysPackage.ARRAY_TYPEABLE___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_ARGUMENT___GET_CONTAINING_CONCRETE_CLASSIFIER = ArraysPackage.ARRAY_TYPEABLE___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_ARGUMENT___GET_CONTAINING_COMPILATION_UNIT = ArraysPackage.ARRAY_TYPEABLE___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_ARGUMENT___GET_CONTAINING_PACKAGE_NAME = ArraysPackage.ARRAY_TYPEABLE___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_ARGUMENT___GET_CONTAINING_CONTAINER_NAME = ArraysPackage.ARRAY_TYPEABLE___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_ARGUMENT___GET_PARENT_CONCRETE_CLASSIFIER = ArraysPackage.ARRAY_TYPEABLE___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_ARGUMENT___GET_PARENT_BY_ETYPE__ECLASS = ArraysPackage.ARRAY_TYPEABLE___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_ARGUMENT___GET_FIRST_CHILD_BY_ETYPE__ECLASS = ArraysPackage.ARRAY_TYPEABLE___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_ARGUMENT___GET_PARENT_BY_TYPE__CLASS = ArraysPackage.ARRAY_TYPEABLE___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_ARGUMENT___GET_FIRST_CHILD_BY_TYPE__CLASS = ArraysPackage.ARRAY_TYPEABLE___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_ARGUMENT___GET_CHILDREN_BY_ETYPE__ECLASS = ArraysPackage.ARRAY_TYPEABLE___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_ARGUMENT___GET_CHILDREN_BY_TYPE__CLASS = ArraysPackage.ARRAY_TYPEABLE___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_ARGUMENT___GET_COMMENTS = ArraysPackage.ARRAY_TYPEABLE___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_ARGUMENT___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = ArraysPackage.ARRAY_TYPEABLE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_ARGUMENT___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = ArraysPackage.ARRAY_TYPEABLE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_ARGUMENT___GET_ARRAY_DIMENSION = ArraysPackage.ARRAY_TYPEABLE___GET_ARRAY_DIMENSION;

    /**
     * The number of operations of the '<em>Type Argument</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_ARGUMENT_OPERATION_COUNT = ArraysPackage.ARRAY_TYPEABLE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.generics.impl.TypeArgumentableImpl <em>Type Argumentable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.generics.impl.TypeArgumentableImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.generics.impl.GenericsPackageImpl#getTypeArgumentable()
     * @generated
     */
    int TYPE_ARGUMENTABLE = 1;

    /**
     * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_ARGUMENTABLE__TYPE_ARGUMENTS = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Type Argumentable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_ARGUMENTABLE_FEATURE_COUNT = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_ARGUMENTABLE___GET_CONCRETE_CLASSIFIER__STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_ARGUMENTABLE___GET_CONCRETE_CLASSIFIER_PROXY__STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_ARGUMENTABLE___GET_CONCRETE_CLASSIFIERS__STRING_STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_ARGUMENTABLE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_ARGUMENTABLE___GET_LIB_CLASS__STRING = CommonsPackage.COMMENTABLE___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_ARGUMENTABLE___GET_LIB_INTERFACE__STRING = CommonsPackage.COMMENTABLE___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_ARGUMENTABLE___GET_CLASS_CLASS = CommonsPackage.COMMENTABLE___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_ARGUMENTABLE___GET_OBJECT_CLASS = CommonsPackage.COMMENTABLE___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_ARGUMENTABLE___GET_STRING_CLASS = CommonsPackage.COMMENTABLE___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_ARGUMENTABLE___GET_ANNOTATION_INTERFACE = CommonsPackage.COMMENTABLE___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_ARGUMENTABLE___GET_CONTAINING_ANNOTATION_INSTANCE = CommonsPackage.COMMENTABLE___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_ARGUMENTABLE___GET_CONTAINING_ANONYMOUS_CLASS = CommonsPackage.COMMENTABLE___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_ARGUMENTABLE___GET_CONTAINING_CONCRETE_CLASSIFIER = CommonsPackage.COMMENTABLE___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_ARGUMENTABLE___GET_CONTAINING_COMPILATION_UNIT = CommonsPackage.COMMENTABLE___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_ARGUMENTABLE___GET_CONTAINING_PACKAGE_NAME = CommonsPackage.COMMENTABLE___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_ARGUMENTABLE___GET_CONTAINING_CONTAINER_NAME = CommonsPackage.COMMENTABLE___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_ARGUMENTABLE___GET_PARENT_CONCRETE_CLASSIFIER = CommonsPackage.COMMENTABLE___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_ARGUMENTABLE___GET_PARENT_BY_ETYPE__ECLASS = CommonsPackage.COMMENTABLE___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_ARGUMENTABLE___GET_FIRST_CHILD_BY_ETYPE__ECLASS = CommonsPackage.COMMENTABLE___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_ARGUMENTABLE___GET_PARENT_BY_TYPE__CLASS = CommonsPackage.COMMENTABLE___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_ARGUMENTABLE___GET_FIRST_CHILD_BY_TYPE__CLASS = CommonsPackage.COMMENTABLE___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_ARGUMENTABLE___GET_CHILDREN_BY_ETYPE__ECLASS = CommonsPackage.COMMENTABLE___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_ARGUMENTABLE___GET_CHILDREN_BY_TYPE__CLASS = CommonsPackage.COMMENTABLE___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_ARGUMENTABLE___GET_COMMENTS = CommonsPackage.COMMENTABLE___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_ARGUMENTABLE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = CommonsPackage.COMMENTABLE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_ARGUMENTABLE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = CommonsPackage.COMMENTABLE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The number of operations of the '<em>Type Argumentable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_ARGUMENTABLE_OPERATION_COUNT = CommonsPackage.COMMENTABLE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.generics.impl.CallTypeArgumentableImpl <em>Call Type Argumentable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.generics.impl.CallTypeArgumentableImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.generics.impl.GenericsPackageImpl#getCallTypeArgumentable()
     * @generated
     */
    int CALL_TYPE_ARGUMENTABLE = 2;

    /**
     * The feature id for the '<em><b>Call Type Arguments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_TYPE_ARGUMENTABLE__CALL_TYPE_ARGUMENTS = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Call Type Argumentable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_TYPE_ARGUMENTABLE_FEATURE_COUNT = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_TYPE_ARGUMENTABLE___GET_CONCRETE_CLASSIFIER__STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_TYPE_ARGUMENTABLE___GET_CONCRETE_CLASSIFIER_PROXY__STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_TYPE_ARGUMENTABLE___GET_CONCRETE_CLASSIFIERS__STRING_STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_TYPE_ARGUMENTABLE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_TYPE_ARGUMENTABLE___GET_LIB_CLASS__STRING = CommonsPackage.COMMENTABLE___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_TYPE_ARGUMENTABLE___GET_LIB_INTERFACE__STRING = CommonsPackage.COMMENTABLE___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_TYPE_ARGUMENTABLE___GET_CLASS_CLASS = CommonsPackage.COMMENTABLE___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_TYPE_ARGUMENTABLE___GET_OBJECT_CLASS = CommonsPackage.COMMENTABLE___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_TYPE_ARGUMENTABLE___GET_STRING_CLASS = CommonsPackage.COMMENTABLE___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_TYPE_ARGUMENTABLE___GET_ANNOTATION_INTERFACE = CommonsPackage.COMMENTABLE___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_TYPE_ARGUMENTABLE___GET_CONTAINING_ANNOTATION_INSTANCE = CommonsPackage.COMMENTABLE___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_TYPE_ARGUMENTABLE___GET_CONTAINING_ANONYMOUS_CLASS = CommonsPackage.COMMENTABLE___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_TYPE_ARGUMENTABLE___GET_CONTAINING_CONCRETE_CLASSIFIER = CommonsPackage.COMMENTABLE___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_TYPE_ARGUMENTABLE___GET_CONTAINING_COMPILATION_UNIT = CommonsPackage.COMMENTABLE___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_TYPE_ARGUMENTABLE___GET_CONTAINING_PACKAGE_NAME = CommonsPackage.COMMENTABLE___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_TYPE_ARGUMENTABLE___GET_CONTAINING_CONTAINER_NAME = CommonsPackage.COMMENTABLE___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_TYPE_ARGUMENTABLE___GET_PARENT_CONCRETE_CLASSIFIER = CommonsPackage.COMMENTABLE___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_TYPE_ARGUMENTABLE___GET_PARENT_BY_ETYPE__ECLASS = CommonsPackage.COMMENTABLE___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_TYPE_ARGUMENTABLE___GET_FIRST_CHILD_BY_ETYPE__ECLASS = CommonsPackage.COMMENTABLE___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_TYPE_ARGUMENTABLE___GET_PARENT_BY_TYPE__CLASS = CommonsPackage.COMMENTABLE___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_TYPE_ARGUMENTABLE___GET_FIRST_CHILD_BY_TYPE__CLASS = CommonsPackage.COMMENTABLE___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_TYPE_ARGUMENTABLE___GET_CHILDREN_BY_ETYPE__ECLASS = CommonsPackage.COMMENTABLE___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_TYPE_ARGUMENTABLE___GET_CHILDREN_BY_TYPE__CLASS = CommonsPackage.COMMENTABLE___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_TYPE_ARGUMENTABLE___GET_COMMENTS = CommonsPackage.COMMENTABLE___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_TYPE_ARGUMENTABLE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = CommonsPackage.COMMENTABLE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_TYPE_ARGUMENTABLE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = CommonsPackage.COMMENTABLE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The number of operations of the '<em>Call Type Argumentable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_TYPE_ARGUMENTABLE_OPERATION_COUNT = CommonsPackage.COMMENTABLE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.generics.impl.TypeParametrizableImpl <em>Type Parametrizable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.generics.impl.TypeParametrizableImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.generics.impl.GenericsPackageImpl#getTypeParametrizable()
     * @generated
     */
    int TYPE_PARAMETRIZABLE = 3;

    /**
     * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETRIZABLE__TYPE_PARAMETERS = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Type Parametrizable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETRIZABLE_FEATURE_COUNT = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETRIZABLE___GET_CONCRETE_CLASSIFIER__STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETRIZABLE___GET_CONCRETE_CLASSIFIER_PROXY__STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETRIZABLE___GET_CONCRETE_CLASSIFIERS__STRING_STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETRIZABLE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETRIZABLE___GET_LIB_CLASS__STRING = CommonsPackage.COMMENTABLE___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETRIZABLE___GET_LIB_INTERFACE__STRING = CommonsPackage.COMMENTABLE___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETRIZABLE___GET_CLASS_CLASS = CommonsPackage.COMMENTABLE___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETRIZABLE___GET_OBJECT_CLASS = CommonsPackage.COMMENTABLE___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETRIZABLE___GET_STRING_CLASS = CommonsPackage.COMMENTABLE___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETRIZABLE___GET_ANNOTATION_INTERFACE = CommonsPackage.COMMENTABLE___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETRIZABLE___GET_CONTAINING_ANNOTATION_INSTANCE = CommonsPackage.COMMENTABLE___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETRIZABLE___GET_CONTAINING_ANONYMOUS_CLASS = CommonsPackage.COMMENTABLE___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETRIZABLE___GET_CONTAINING_CONCRETE_CLASSIFIER = CommonsPackage.COMMENTABLE___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETRIZABLE___GET_CONTAINING_COMPILATION_UNIT = CommonsPackage.COMMENTABLE___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETRIZABLE___GET_CONTAINING_PACKAGE_NAME = CommonsPackage.COMMENTABLE___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETRIZABLE___GET_CONTAINING_CONTAINER_NAME = CommonsPackage.COMMENTABLE___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETRIZABLE___GET_PARENT_CONCRETE_CLASSIFIER = CommonsPackage.COMMENTABLE___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETRIZABLE___GET_PARENT_BY_ETYPE__ECLASS = CommonsPackage.COMMENTABLE___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETRIZABLE___GET_FIRST_CHILD_BY_ETYPE__ECLASS = CommonsPackage.COMMENTABLE___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETRIZABLE___GET_PARENT_BY_TYPE__CLASS = CommonsPackage.COMMENTABLE___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETRIZABLE___GET_FIRST_CHILD_BY_TYPE__CLASS = CommonsPackage.COMMENTABLE___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETRIZABLE___GET_CHILDREN_BY_ETYPE__ECLASS = CommonsPackage.COMMENTABLE___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETRIZABLE___GET_CHILDREN_BY_TYPE__CLASS = CommonsPackage.COMMENTABLE___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETRIZABLE___GET_COMMENTS = CommonsPackage.COMMENTABLE___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETRIZABLE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = CommonsPackage.COMMENTABLE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETRIZABLE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = CommonsPackage.COMMENTABLE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The number of operations of the '<em>Type Parametrizable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETRIZABLE_OPERATION_COUNT = CommonsPackage.COMMENTABLE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.generics.impl.ExtendsTypeArgumentImpl <em>Extends Type Argument</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.generics.impl.ExtendsTypeArgumentImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.generics.impl.GenericsPackageImpl#getExtendsTypeArgument()
     * @generated
     */
    int EXTENDS_TYPE_ARGUMENT = 4;

    /**
     * The feature id for the '<em><b>Array Dimensions Before</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDS_TYPE_ARGUMENT__ARRAY_DIMENSIONS_BEFORE = TYPE_ARGUMENT__ARRAY_DIMENSIONS_BEFORE;

    /**
     * The feature id for the '<em><b>Array Dimensions After</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDS_TYPE_ARGUMENT__ARRAY_DIMENSIONS_AFTER = TYPE_ARGUMENT__ARRAY_DIMENSIONS_AFTER;

    /**
     * The feature id for the '<em><b>Extend Types</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDS_TYPE_ARGUMENT__EXTEND_TYPES = TYPE_ARGUMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Extends Type Argument</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDS_TYPE_ARGUMENT_FEATURE_COUNT = TYPE_ARGUMENT_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDS_TYPE_ARGUMENT___GET_CONCRETE_CLASSIFIER__STRING = TYPE_ARGUMENT___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDS_TYPE_ARGUMENT___GET_CONCRETE_CLASSIFIER_PROXY__STRING = TYPE_ARGUMENT___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDS_TYPE_ARGUMENT___GET_CONCRETE_CLASSIFIERS__STRING_STRING = TYPE_ARGUMENT___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDS_TYPE_ARGUMENT___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = TYPE_ARGUMENT___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDS_TYPE_ARGUMENT___GET_LIB_CLASS__STRING = TYPE_ARGUMENT___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDS_TYPE_ARGUMENT___GET_LIB_INTERFACE__STRING = TYPE_ARGUMENT___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDS_TYPE_ARGUMENT___GET_CLASS_CLASS = TYPE_ARGUMENT___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDS_TYPE_ARGUMENT___GET_OBJECT_CLASS = TYPE_ARGUMENT___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDS_TYPE_ARGUMENT___GET_STRING_CLASS = TYPE_ARGUMENT___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDS_TYPE_ARGUMENT___GET_ANNOTATION_INTERFACE = TYPE_ARGUMENT___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDS_TYPE_ARGUMENT___GET_CONTAINING_ANNOTATION_INSTANCE = TYPE_ARGUMENT___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDS_TYPE_ARGUMENT___GET_CONTAINING_ANONYMOUS_CLASS = TYPE_ARGUMENT___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDS_TYPE_ARGUMENT___GET_CONTAINING_CONCRETE_CLASSIFIER = TYPE_ARGUMENT___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDS_TYPE_ARGUMENT___GET_CONTAINING_COMPILATION_UNIT = TYPE_ARGUMENT___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDS_TYPE_ARGUMENT___GET_CONTAINING_PACKAGE_NAME = TYPE_ARGUMENT___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDS_TYPE_ARGUMENT___GET_CONTAINING_CONTAINER_NAME = TYPE_ARGUMENT___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDS_TYPE_ARGUMENT___GET_PARENT_CONCRETE_CLASSIFIER = TYPE_ARGUMENT___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDS_TYPE_ARGUMENT___GET_PARENT_BY_ETYPE__ECLASS = TYPE_ARGUMENT___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDS_TYPE_ARGUMENT___GET_FIRST_CHILD_BY_ETYPE__ECLASS = TYPE_ARGUMENT___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDS_TYPE_ARGUMENT___GET_PARENT_BY_TYPE__CLASS = TYPE_ARGUMENT___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDS_TYPE_ARGUMENT___GET_FIRST_CHILD_BY_TYPE__CLASS = TYPE_ARGUMENT___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDS_TYPE_ARGUMENT___GET_CHILDREN_BY_ETYPE__ECLASS = TYPE_ARGUMENT___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDS_TYPE_ARGUMENT___GET_CHILDREN_BY_TYPE__CLASS = TYPE_ARGUMENT___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDS_TYPE_ARGUMENT___GET_COMMENTS = TYPE_ARGUMENT___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDS_TYPE_ARGUMENT___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = TYPE_ARGUMENT___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDS_TYPE_ARGUMENT___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = TYPE_ARGUMENT___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDS_TYPE_ARGUMENT___GET_ARRAY_DIMENSION = TYPE_ARGUMENT___GET_ARRAY_DIMENSION;

    /**
     * The number of operations of the '<em>Extends Type Argument</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDS_TYPE_ARGUMENT_OPERATION_COUNT = TYPE_ARGUMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.generics.impl.QualifiedTypeArgumentImpl <em>Qualified Type Argument</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.generics.impl.QualifiedTypeArgumentImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.generics.impl.GenericsPackageImpl#getQualifiedTypeArgument()
     * @generated
     */
    int QUALIFIED_TYPE_ARGUMENT = 5;

    /**
     * The feature id for the '<em><b>Array Dimensions Before</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALIFIED_TYPE_ARGUMENT__ARRAY_DIMENSIONS_BEFORE = TYPE_ARGUMENT__ARRAY_DIMENSIONS_BEFORE;

    /**
     * The feature id for the '<em><b>Array Dimensions After</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALIFIED_TYPE_ARGUMENT__ARRAY_DIMENSIONS_AFTER = TYPE_ARGUMENT__ARRAY_DIMENSIONS_AFTER;

    /**
     * The feature id for the '<em><b>Type Reference</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALIFIED_TYPE_ARGUMENT__TYPE_REFERENCE = TYPE_ARGUMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Qualified Type Argument</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALIFIED_TYPE_ARGUMENT_FEATURE_COUNT = TYPE_ARGUMENT_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALIFIED_TYPE_ARGUMENT___GET_CONCRETE_CLASSIFIER__STRING = TYPE_ARGUMENT___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALIFIED_TYPE_ARGUMENT___GET_CONCRETE_CLASSIFIER_PROXY__STRING = TYPE_ARGUMENT___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALIFIED_TYPE_ARGUMENT___GET_CONCRETE_CLASSIFIERS__STRING_STRING = TYPE_ARGUMENT___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALIFIED_TYPE_ARGUMENT___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = TYPE_ARGUMENT___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALIFIED_TYPE_ARGUMENT___GET_LIB_CLASS__STRING = TYPE_ARGUMENT___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALIFIED_TYPE_ARGUMENT___GET_LIB_INTERFACE__STRING = TYPE_ARGUMENT___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALIFIED_TYPE_ARGUMENT___GET_CLASS_CLASS = TYPE_ARGUMENT___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALIFIED_TYPE_ARGUMENT___GET_OBJECT_CLASS = TYPE_ARGUMENT___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALIFIED_TYPE_ARGUMENT___GET_STRING_CLASS = TYPE_ARGUMENT___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALIFIED_TYPE_ARGUMENT___GET_ANNOTATION_INTERFACE = TYPE_ARGUMENT___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALIFIED_TYPE_ARGUMENT___GET_CONTAINING_ANNOTATION_INSTANCE = TYPE_ARGUMENT___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALIFIED_TYPE_ARGUMENT___GET_CONTAINING_ANONYMOUS_CLASS = TYPE_ARGUMENT___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALIFIED_TYPE_ARGUMENT___GET_CONTAINING_CONCRETE_CLASSIFIER = TYPE_ARGUMENT___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALIFIED_TYPE_ARGUMENT___GET_CONTAINING_COMPILATION_UNIT = TYPE_ARGUMENT___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALIFIED_TYPE_ARGUMENT___GET_CONTAINING_PACKAGE_NAME = TYPE_ARGUMENT___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALIFIED_TYPE_ARGUMENT___GET_CONTAINING_CONTAINER_NAME = TYPE_ARGUMENT___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALIFIED_TYPE_ARGUMENT___GET_PARENT_CONCRETE_CLASSIFIER = TYPE_ARGUMENT___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALIFIED_TYPE_ARGUMENT___GET_PARENT_BY_ETYPE__ECLASS = TYPE_ARGUMENT___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALIFIED_TYPE_ARGUMENT___GET_FIRST_CHILD_BY_ETYPE__ECLASS = TYPE_ARGUMENT___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALIFIED_TYPE_ARGUMENT___GET_PARENT_BY_TYPE__CLASS = TYPE_ARGUMENT___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALIFIED_TYPE_ARGUMENT___GET_FIRST_CHILD_BY_TYPE__CLASS = TYPE_ARGUMENT___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALIFIED_TYPE_ARGUMENT___GET_CHILDREN_BY_ETYPE__ECLASS = TYPE_ARGUMENT___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALIFIED_TYPE_ARGUMENT___GET_CHILDREN_BY_TYPE__CLASS = TYPE_ARGUMENT___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALIFIED_TYPE_ARGUMENT___GET_COMMENTS = TYPE_ARGUMENT___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALIFIED_TYPE_ARGUMENT___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = TYPE_ARGUMENT___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALIFIED_TYPE_ARGUMENT___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = TYPE_ARGUMENT___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALIFIED_TYPE_ARGUMENT___GET_ARRAY_DIMENSION = TYPE_ARGUMENT___GET_ARRAY_DIMENSION;

    /**
     * The number of operations of the '<em>Qualified Type Argument</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALIFIED_TYPE_ARGUMENT_OPERATION_COUNT = TYPE_ARGUMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.generics.impl.SuperTypeArgumentImpl <em>Super Type Argument</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.generics.impl.SuperTypeArgumentImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.generics.impl.GenericsPackageImpl#getSuperTypeArgument()
     * @generated
     */
    int SUPER_TYPE_ARGUMENT = 6;

    /**
     * The feature id for the '<em><b>Array Dimensions Before</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPER_TYPE_ARGUMENT__ARRAY_DIMENSIONS_BEFORE = TYPE_ARGUMENT__ARRAY_DIMENSIONS_BEFORE;

    /**
     * The feature id for the '<em><b>Array Dimensions After</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPER_TYPE_ARGUMENT__ARRAY_DIMENSIONS_AFTER = TYPE_ARGUMENT__ARRAY_DIMENSIONS_AFTER;

    /**
     * The feature id for the '<em><b>Super Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPER_TYPE_ARGUMENT__SUPER_TYPE = TYPE_ARGUMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Super Type Argument</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPER_TYPE_ARGUMENT_FEATURE_COUNT = TYPE_ARGUMENT_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPER_TYPE_ARGUMENT___GET_CONCRETE_CLASSIFIER__STRING = TYPE_ARGUMENT___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPER_TYPE_ARGUMENT___GET_CONCRETE_CLASSIFIER_PROXY__STRING = TYPE_ARGUMENT___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPER_TYPE_ARGUMENT___GET_CONCRETE_CLASSIFIERS__STRING_STRING = TYPE_ARGUMENT___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPER_TYPE_ARGUMENT___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = TYPE_ARGUMENT___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPER_TYPE_ARGUMENT___GET_LIB_CLASS__STRING = TYPE_ARGUMENT___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPER_TYPE_ARGUMENT___GET_LIB_INTERFACE__STRING = TYPE_ARGUMENT___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPER_TYPE_ARGUMENT___GET_CLASS_CLASS = TYPE_ARGUMENT___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPER_TYPE_ARGUMENT___GET_OBJECT_CLASS = TYPE_ARGUMENT___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPER_TYPE_ARGUMENT___GET_STRING_CLASS = TYPE_ARGUMENT___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPER_TYPE_ARGUMENT___GET_ANNOTATION_INTERFACE = TYPE_ARGUMENT___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPER_TYPE_ARGUMENT___GET_CONTAINING_ANNOTATION_INSTANCE = TYPE_ARGUMENT___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPER_TYPE_ARGUMENT___GET_CONTAINING_ANONYMOUS_CLASS = TYPE_ARGUMENT___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPER_TYPE_ARGUMENT___GET_CONTAINING_CONCRETE_CLASSIFIER = TYPE_ARGUMENT___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPER_TYPE_ARGUMENT___GET_CONTAINING_COMPILATION_UNIT = TYPE_ARGUMENT___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPER_TYPE_ARGUMENT___GET_CONTAINING_PACKAGE_NAME = TYPE_ARGUMENT___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPER_TYPE_ARGUMENT___GET_CONTAINING_CONTAINER_NAME = TYPE_ARGUMENT___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPER_TYPE_ARGUMENT___GET_PARENT_CONCRETE_CLASSIFIER = TYPE_ARGUMENT___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPER_TYPE_ARGUMENT___GET_PARENT_BY_ETYPE__ECLASS = TYPE_ARGUMENT___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPER_TYPE_ARGUMENT___GET_FIRST_CHILD_BY_ETYPE__ECLASS = TYPE_ARGUMENT___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPER_TYPE_ARGUMENT___GET_PARENT_BY_TYPE__CLASS = TYPE_ARGUMENT___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPER_TYPE_ARGUMENT___GET_FIRST_CHILD_BY_TYPE__CLASS = TYPE_ARGUMENT___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPER_TYPE_ARGUMENT___GET_CHILDREN_BY_ETYPE__ECLASS = TYPE_ARGUMENT___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPER_TYPE_ARGUMENT___GET_CHILDREN_BY_TYPE__CLASS = TYPE_ARGUMENT___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPER_TYPE_ARGUMENT___GET_COMMENTS = TYPE_ARGUMENT___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPER_TYPE_ARGUMENT___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = TYPE_ARGUMENT___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPER_TYPE_ARGUMENT___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = TYPE_ARGUMENT___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPER_TYPE_ARGUMENT___GET_ARRAY_DIMENSION = TYPE_ARGUMENT___GET_ARRAY_DIMENSION;

    /**
     * The number of operations of the '<em>Super Type Argument</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPER_TYPE_ARGUMENT_OPERATION_COUNT = TYPE_ARGUMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.generics.impl.TypeParameterImpl <em>Type Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.generics.impl.TypeParameterImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.generics.impl.GenericsPackageImpl#getTypeParameter()
     * @generated
     */
    int TYPE_PARAMETER = 7;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETER__NAME = ClassifiersPackage.CLASSIFIER__NAME;

    /**
     * The feature id for the '<em><b>Extend Types</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETER__EXTEND_TYPES = ClassifiersPackage.CLASSIFIER_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Type Parameter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETER_FEATURE_COUNT = ClassifiersPackage.CLASSIFIER_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETER___GET_CONCRETE_CLASSIFIER__STRING = ClassifiersPackage.CLASSIFIER___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETER___GET_CONCRETE_CLASSIFIER_PROXY__STRING = ClassifiersPackage.CLASSIFIER___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETER___GET_CONCRETE_CLASSIFIERS__STRING_STRING = ClassifiersPackage.CLASSIFIER___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETER___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = ClassifiersPackage.CLASSIFIER___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETER___GET_LIB_CLASS__STRING = ClassifiersPackage.CLASSIFIER___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETER___GET_LIB_INTERFACE__STRING = ClassifiersPackage.CLASSIFIER___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETER___GET_CLASS_CLASS = ClassifiersPackage.CLASSIFIER___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETER___GET_OBJECT_CLASS = ClassifiersPackage.CLASSIFIER___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETER___GET_STRING_CLASS = ClassifiersPackage.CLASSIFIER___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETER___GET_ANNOTATION_INTERFACE = ClassifiersPackage.CLASSIFIER___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETER___GET_CONTAINING_ANNOTATION_INSTANCE = ClassifiersPackage.CLASSIFIER___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETER___GET_CONTAINING_ANONYMOUS_CLASS = ClassifiersPackage.CLASSIFIER___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETER___GET_CONTAINING_CONCRETE_CLASSIFIER = ClassifiersPackage.CLASSIFIER___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETER___GET_CONTAINING_COMPILATION_UNIT = ClassifiersPackage.CLASSIFIER___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETER___GET_CONTAINING_PACKAGE_NAME = ClassifiersPackage.CLASSIFIER___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETER___GET_CONTAINING_CONTAINER_NAME = ClassifiersPackage.CLASSIFIER___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETER___GET_PARENT_CONCRETE_CLASSIFIER = ClassifiersPackage.CLASSIFIER___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETER___GET_PARENT_BY_ETYPE__ECLASS = ClassifiersPackage.CLASSIFIER___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETER___GET_FIRST_CHILD_BY_ETYPE__ECLASS = ClassifiersPackage.CLASSIFIER___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETER___GET_PARENT_BY_TYPE__CLASS = ClassifiersPackage.CLASSIFIER___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETER___GET_FIRST_CHILD_BY_TYPE__CLASS = ClassifiersPackage.CLASSIFIER___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETER___GET_CHILDREN_BY_ETYPE__ECLASS = ClassifiersPackage.CLASSIFIER___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETER___GET_CHILDREN_BY_TYPE__CLASS = ClassifiersPackage.CLASSIFIER___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETER___GET_COMMENTS = ClassifiersPackage.CLASSIFIER___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETER___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = ClassifiersPackage.CLASSIFIER___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETER___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = ClassifiersPackage.CLASSIFIER___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Equals Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETER___EQUALS_TYPE__LONG_TYPE_LONG = ClassifiersPackage.CLASSIFIER___EQUALS_TYPE__LONG_TYPE_LONG;

    /**
     * The operation id for the '<em>Is Super Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETER___IS_SUPER_TYPE__LONG_TYPE_ARRAYTYPEABLE = ClassifiersPackage.CLASSIFIER___IS_SUPER_TYPE__LONG_TYPE_ARRAYTYPEABLE;

    /**
     * The operation id for the '<em>Add Import</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETER___ADD_IMPORT__STRING = ClassifiersPackage.CLASSIFIER___ADD_IMPORT__STRING;

    /**
     * The operation id for the '<em>Add Package Import</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETER___ADD_PACKAGE_IMPORT__STRING = ClassifiersPackage.CLASSIFIER___ADD_PACKAGE_IMPORT__STRING;

    /**
     * The operation id for the '<em>Get All Super Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETER___GET_ALL_SUPER_CLASSIFIERS = ClassifiersPackage.CLASSIFIER_OPERATION_COUNT + 0;

    /**
     * The operation id for the '<em>Get All Members</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETER___GET_ALL_MEMBERS__COMMENTABLE = ClassifiersPackage.CLASSIFIER_OPERATION_COUNT + 1;

    /**
     * The operation id for the '<em>Get Bound Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETER___GET_BOUND_TYPE__TYPEREFERENCE_REFERENCE = ClassifiersPackage.CLASSIFIER_OPERATION_COUNT + 2;

    /**
     * The number of operations of the '<em>Type Parameter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_PARAMETER_OPERATION_COUNT = ClassifiersPackage.CLASSIFIER_OPERATION_COUNT + 3;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.generics.impl.UnknownTypeArgumentImpl <em>Unknown Type Argument</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.generics.impl.UnknownTypeArgumentImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.generics.impl.GenericsPackageImpl#getUnknownTypeArgument()
     * @generated
     */
    int UNKNOWN_TYPE_ARGUMENT = 8;

    /**
     * The feature id for the '<em><b>Array Dimensions Before</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNKNOWN_TYPE_ARGUMENT__ARRAY_DIMENSIONS_BEFORE = TYPE_ARGUMENT__ARRAY_DIMENSIONS_BEFORE;

    /**
     * The feature id for the '<em><b>Array Dimensions After</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNKNOWN_TYPE_ARGUMENT__ARRAY_DIMENSIONS_AFTER = TYPE_ARGUMENT__ARRAY_DIMENSIONS_AFTER;

    /**
     * The number of structural features of the '<em>Unknown Type Argument</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNKNOWN_TYPE_ARGUMENT_FEATURE_COUNT = TYPE_ARGUMENT_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNKNOWN_TYPE_ARGUMENT___GET_CONCRETE_CLASSIFIER__STRING = TYPE_ARGUMENT___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNKNOWN_TYPE_ARGUMENT___GET_CONCRETE_CLASSIFIER_PROXY__STRING = TYPE_ARGUMENT___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNKNOWN_TYPE_ARGUMENT___GET_CONCRETE_CLASSIFIERS__STRING_STRING = TYPE_ARGUMENT___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNKNOWN_TYPE_ARGUMENT___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = TYPE_ARGUMENT___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNKNOWN_TYPE_ARGUMENT___GET_LIB_CLASS__STRING = TYPE_ARGUMENT___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNKNOWN_TYPE_ARGUMENT___GET_LIB_INTERFACE__STRING = TYPE_ARGUMENT___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNKNOWN_TYPE_ARGUMENT___GET_CLASS_CLASS = TYPE_ARGUMENT___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNKNOWN_TYPE_ARGUMENT___GET_OBJECT_CLASS = TYPE_ARGUMENT___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNKNOWN_TYPE_ARGUMENT___GET_STRING_CLASS = TYPE_ARGUMENT___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNKNOWN_TYPE_ARGUMENT___GET_ANNOTATION_INTERFACE = TYPE_ARGUMENT___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNKNOWN_TYPE_ARGUMENT___GET_CONTAINING_ANNOTATION_INSTANCE = TYPE_ARGUMENT___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNKNOWN_TYPE_ARGUMENT___GET_CONTAINING_ANONYMOUS_CLASS = TYPE_ARGUMENT___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNKNOWN_TYPE_ARGUMENT___GET_CONTAINING_CONCRETE_CLASSIFIER = TYPE_ARGUMENT___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNKNOWN_TYPE_ARGUMENT___GET_CONTAINING_COMPILATION_UNIT = TYPE_ARGUMENT___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNKNOWN_TYPE_ARGUMENT___GET_CONTAINING_PACKAGE_NAME = TYPE_ARGUMENT___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNKNOWN_TYPE_ARGUMENT___GET_CONTAINING_CONTAINER_NAME = TYPE_ARGUMENT___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNKNOWN_TYPE_ARGUMENT___GET_PARENT_CONCRETE_CLASSIFIER = TYPE_ARGUMENT___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNKNOWN_TYPE_ARGUMENT___GET_PARENT_BY_ETYPE__ECLASS = TYPE_ARGUMENT___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNKNOWN_TYPE_ARGUMENT___GET_FIRST_CHILD_BY_ETYPE__ECLASS = TYPE_ARGUMENT___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNKNOWN_TYPE_ARGUMENT___GET_PARENT_BY_TYPE__CLASS = TYPE_ARGUMENT___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNKNOWN_TYPE_ARGUMENT___GET_FIRST_CHILD_BY_TYPE__CLASS = TYPE_ARGUMENT___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNKNOWN_TYPE_ARGUMENT___GET_CHILDREN_BY_ETYPE__ECLASS = TYPE_ARGUMENT___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNKNOWN_TYPE_ARGUMENT___GET_CHILDREN_BY_TYPE__CLASS = TYPE_ARGUMENT___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNKNOWN_TYPE_ARGUMENT___GET_COMMENTS = TYPE_ARGUMENT___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNKNOWN_TYPE_ARGUMENT___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = TYPE_ARGUMENT___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNKNOWN_TYPE_ARGUMENT___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = TYPE_ARGUMENT___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNKNOWN_TYPE_ARGUMENT___GET_ARRAY_DIMENSION = TYPE_ARGUMENT___GET_ARRAY_DIMENSION;

    /**
     * The number of operations of the '<em>Unknown Type Argument</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNKNOWN_TYPE_ARGUMENT_OPERATION_COUNT = TYPE_ARGUMENT_OPERATION_COUNT + 0;

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.generics.TypeArgument <em>Type Argument</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Type Argument</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.generics.TypeArgument
     * @generated
     */
    EClass getTypeArgument();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.generics.TypeArgumentable <em>Type Argumentable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Type Argumentable</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.generics.TypeArgumentable
     * @generated
     */
    EClass getTypeArgumentable();

    /**
     * Returns the meta object for the containment reference list '{@link org.palladiosimulator.jdt.metamodel.javamodel.generics.TypeArgumentable#getTypeArguments <em>Type Arguments</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Type Arguments</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.generics.TypeArgumentable#getTypeArguments()
     * @see #getTypeArgumentable()
     * @generated
     */
    EReference getTypeArgumentable_TypeArguments();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.generics.CallTypeArgumentable <em>Call Type Argumentable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Call Type Argumentable</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.generics.CallTypeArgumentable
     * @generated
     */
    EClass getCallTypeArgumentable();

    /**
     * Returns the meta object for the containment reference list '{@link org.palladiosimulator.jdt.metamodel.javamodel.generics.CallTypeArgumentable#getCallTypeArguments <em>Call Type Arguments</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Call Type Arguments</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.generics.CallTypeArgumentable#getCallTypeArguments()
     * @see #getCallTypeArgumentable()
     * @generated
     */
    EReference getCallTypeArgumentable_CallTypeArguments();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.generics.TypeParametrizable <em>Type Parametrizable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Type Parametrizable</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.generics.TypeParametrizable
     * @generated
     */
    EClass getTypeParametrizable();

    /**
     * Returns the meta object for the containment reference list '{@link org.palladiosimulator.jdt.metamodel.javamodel.generics.TypeParametrizable#getTypeParameters <em>Type Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Type Parameters</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.generics.TypeParametrizable#getTypeParameters()
     * @see #getTypeParametrizable()
     * @generated
     */
    EReference getTypeParametrizable_TypeParameters();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.generics.ExtendsTypeArgument <em>Extends Type Argument</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Extends Type Argument</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.generics.ExtendsTypeArgument
     * @generated
     */
    EClass getExtendsTypeArgument();

    /**
     * Returns the meta object for the containment reference list '{@link org.palladiosimulator.jdt.metamodel.javamodel.generics.ExtendsTypeArgument#getExtendTypes <em>Extend Types</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Extend Types</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.generics.ExtendsTypeArgument#getExtendTypes()
     * @see #getExtendsTypeArgument()
     * @generated
     */
    EReference getExtendsTypeArgument_ExtendTypes();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.generics.QualifiedTypeArgument <em>Qualified Type Argument</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Qualified Type Argument</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.generics.QualifiedTypeArgument
     * @generated
     */
    EClass getQualifiedTypeArgument();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.generics.SuperTypeArgument <em>Super Type Argument</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Super Type Argument</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.generics.SuperTypeArgument
     * @generated
     */
    EClass getSuperTypeArgument();

    /**
     * Returns the meta object for the containment reference '{@link org.palladiosimulator.jdt.metamodel.javamodel.generics.SuperTypeArgument#getSuperType <em>Super Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Super Type</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.generics.SuperTypeArgument#getSuperType()
     * @see #getSuperTypeArgument()
     * @generated
     */
    EReference getSuperTypeArgument_SuperType();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.generics.TypeParameter <em>Type Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Type Parameter</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.generics.TypeParameter
     * @generated
     */
    EClass getTypeParameter();

    /**
     * Returns the meta object for the containment reference list '{@link org.palladiosimulator.jdt.metamodel.javamodel.generics.TypeParameter#getExtendTypes <em>Extend Types</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Extend Types</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.generics.TypeParameter#getExtendTypes()
     * @see #getTypeParameter()
     * @generated
     */
    EReference getTypeParameter_ExtendTypes();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.generics.TypeParameter#getAllSuperClassifiers() <em>Get All Super Classifiers</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get All Super Classifiers</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.generics.TypeParameter#getAllSuperClassifiers()
     * @generated
     */
    EOperation getTypeParameter__GetAllSuperClassifiers();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.generics.TypeParameter#getAllMembers(org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable) <em>Get All Members</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get All Members</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.generics.TypeParameter#getAllMembers(org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable)
     * @generated
     */
    EOperation getTypeParameter__GetAllMembers__Commentable();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.generics.TypeParameter#getBoundType(org.palladiosimulator.jdt.metamodel.javamodel.types.TypeReference, org.palladiosimulator.jdt.metamodel.javamodel.references.Reference) <em>Get Bound Type</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Bound Type</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.generics.TypeParameter#getBoundType(org.palladiosimulator.jdt.metamodel.javamodel.types.TypeReference, org.palladiosimulator.jdt.metamodel.javamodel.references.Reference)
     * @generated
     */
    EOperation getTypeParameter__GetBoundType__TypeReference_Reference();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.generics.UnknownTypeArgument <em>Unknown Type Argument</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Unknown Type Argument</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.generics.UnknownTypeArgument
     * @generated
     */
    EClass getUnknownTypeArgument();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    GenericsFactory getGenericsFactory();

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
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.generics.impl.TypeArgumentImpl <em>Type Argument</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.generics.impl.TypeArgumentImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.generics.impl.GenericsPackageImpl#getTypeArgument()
         * @generated
         */
        EClass TYPE_ARGUMENT = eINSTANCE.getTypeArgument();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.generics.impl.TypeArgumentableImpl <em>Type Argumentable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.generics.impl.TypeArgumentableImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.generics.impl.GenericsPackageImpl#getTypeArgumentable()
         * @generated
         */
        EClass TYPE_ARGUMENTABLE = eINSTANCE.getTypeArgumentable();

        /**
         * The meta object literal for the '<em><b>Type Arguments</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TYPE_ARGUMENTABLE__TYPE_ARGUMENTS = eINSTANCE.getTypeArgumentable_TypeArguments();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.generics.impl.CallTypeArgumentableImpl <em>Call Type Argumentable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.generics.impl.CallTypeArgumentableImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.generics.impl.GenericsPackageImpl#getCallTypeArgumentable()
         * @generated
         */
        EClass CALL_TYPE_ARGUMENTABLE = eINSTANCE.getCallTypeArgumentable();

        /**
         * The meta object literal for the '<em><b>Call Type Arguments</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CALL_TYPE_ARGUMENTABLE__CALL_TYPE_ARGUMENTS = eINSTANCE.getCallTypeArgumentable_CallTypeArguments();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.generics.impl.TypeParametrizableImpl <em>Type Parametrizable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.generics.impl.TypeParametrizableImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.generics.impl.GenericsPackageImpl#getTypeParametrizable()
         * @generated
         */
        EClass TYPE_PARAMETRIZABLE = eINSTANCE.getTypeParametrizable();

        /**
         * The meta object literal for the '<em><b>Type Parameters</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TYPE_PARAMETRIZABLE__TYPE_PARAMETERS = eINSTANCE.getTypeParametrizable_TypeParameters();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.generics.impl.ExtendsTypeArgumentImpl <em>Extends Type Argument</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.generics.impl.ExtendsTypeArgumentImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.generics.impl.GenericsPackageImpl#getExtendsTypeArgument()
         * @generated
         */
        EClass EXTENDS_TYPE_ARGUMENT = eINSTANCE.getExtendsTypeArgument();

        /**
         * The meta object literal for the '<em><b>Extend Types</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EXTENDS_TYPE_ARGUMENT__EXTEND_TYPES = eINSTANCE.getExtendsTypeArgument_ExtendTypes();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.generics.impl.QualifiedTypeArgumentImpl <em>Qualified Type Argument</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.generics.impl.QualifiedTypeArgumentImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.generics.impl.GenericsPackageImpl#getQualifiedTypeArgument()
         * @generated
         */
        EClass QUALIFIED_TYPE_ARGUMENT = eINSTANCE.getQualifiedTypeArgument();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.generics.impl.SuperTypeArgumentImpl <em>Super Type Argument</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.generics.impl.SuperTypeArgumentImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.generics.impl.GenericsPackageImpl#getSuperTypeArgument()
         * @generated
         */
        EClass SUPER_TYPE_ARGUMENT = eINSTANCE.getSuperTypeArgument();

        /**
         * The meta object literal for the '<em><b>Super Type</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SUPER_TYPE_ARGUMENT__SUPER_TYPE = eINSTANCE.getSuperTypeArgument_SuperType();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.generics.impl.TypeParameterImpl <em>Type Parameter</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.generics.impl.TypeParameterImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.generics.impl.GenericsPackageImpl#getTypeParameter()
         * @generated
         */
        EClass TYPE_PARAMETER = eINSTANCE.getTypeParameter();

        /**
         * The meta object literal for the '<em><b>Extend Types</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TYPE_PARAMETER__EXTEND_TYPES = eINSTANCE.getTypeParameter_ExtendTypes();

        /**
         * The meta object literal for the '<em><b>Get All Super Classifiers</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation TYPE_PARAMETER___GET_ALL_SUPER_CLASSIFIERS = eINSTANCE.getTypeParameter__GetAllSuperClassifiers();

        /**
         * The meta object literal for the '<em><b>Get All Members</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation TYPE_PARAMETER___GET_ALL_MEMBERS__COMMENTABLE = eINSTANCE
                .getTypeParameter__GetAllMembers__Commentable();

        /**
         * The meta object literal for the '<em><b>Get Bound Type</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation TYPE_PARAMETER___GET_BOUND_TYPE__TYPEREFERENCE_REFERENCE = eINSTANCE
                .getTypeParameter__GetBoundType__TypeReference_Reference();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.generics.impl.UnknownTypeArgumentImpl <em>Unknown Type Argument</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.generics.impl.UnknownTypeArgumentImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.generics.impl.GenericsPackageImpl#getUnknownTypeArgument()
         * @generated
         */
        EClass UNKNOWN_TYPE_ARGUMENT = eINSTANCE.getUnknownTypeArgument();

    }

} //GenericsPackage
