/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.classifiers;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.CommonsPackage;

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
 * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.ClassifiersFactory
 * @model kind="package"
 * @generated
 */
public interface ClassifiersPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "classifiers";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.palladiosimulator.org/javamodel/classifiers";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "classifiers";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ClassifiersPackage eINSTANCE = org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.ClassifiersPackageImpl
            .init();

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.ClassifierImpl <em>Classifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.ClassifierImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.ClassifiersPackageImpl#getClassifier()
     * @generated
     */
    int CLASSIFIER = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER__NAME = TypesPackage.TYPE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Classifier</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_FEATURE_COUNT = TypesPackage.TYPE_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER___GET_CONCRETE_CLASSIFIER__STRING = TypesPackage.TYPE___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER___GET_CONCRETE_CLASSIFIER_PROXY__STRING = TypesPackage.TYPE___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER___GET_CONCRETE_CLASSIFIERS__STRING_STRING = TypesPackage.TYPE___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = TypesPackage.TYPE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER___GET_LIB_CLASS__STRING = TypesPackage.TYPE___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER___GET_LIB_INTERFACE__STRING = TypesPackage.TYPE___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER___GET_CLASS_CLASS = TypesPackage.TYPE___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER___GET_OBJECT_CLASS = TypesPackage.TYPE___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER___GET_STRING_CLASS = TypesPackage.TYPE___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER___GET_ANNOTATION_INTERFACE = TypesPackage.TYPE___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER___GET_CONTAINING_ANNOTATION_INSTANCE = TypesPackage.TYPE___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER___GET_CONTAINING_ANONYMOUS_CLASS = TypesPackage.TYPE___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER___GET_CONTAINING_CONCRETE_CLASSIFIER = TypesPackage.TYPE___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER___GET_CONTAINING_COMPILATION_UNIT = TypesPackage.TYPE___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER___GET_CONTAINING_PACKAGE_NAME = TypesPackage.TYPE___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER___GET_CONTAINING_CONTAINER_NAME = TypesPackage.TYPE___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER___GET_PARENT_CONCRETE_CLASSIFIER = TypesPackage.TYPE___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER___GET_PARENT_BY_ETYPE__ECLASS = TypesPackage.TYPE___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER___GET_FIRST_CHILD_BY_ETYPE__ECLASS = TypesPackage.TYPE___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER___GET_PARENT_BY_TYPE__CLASS = TypesPackage.TYPE___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER___GET_FIRST_CHILD_BY_TYPE__CLASS = TypesPackage.TYPE___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER___GET_CHILDREN_BY_ETYPE__ECLASS = TypesPackage.TYPE___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER___GET_CHILDREN_BY_TYPE__CLASS = TypesPackage.TYPE___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER___GET_COMMENTS = TypesPackage.TYPE___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = TypesPackage.TYPE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = TypesPackage.TYPE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Equals Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER___EQUALS_TYPE__LONG_TYPE_LONG = TypesPackage.TYPE___EQUALS_TYPE__LONG_TYPE_LONG;

    /**
     * The operation id for the '<em>Is Super Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER___IS_SUPER_TYPE__LONG_TYPE_ARRAYTYPEABLE = TypesPackage.TYPE___IS_SUPER_TYPE__LONG_TYPE_ARRAYTYPEABLE;

    /**
     * The operation id for the '<em>Get All Members</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER___GET_ALL_MEMBERS__COMMENTABLE = TypesPackage.TYPE___GET_ALL_MEMBERS__COMMENTABLE;

    /**
     * The operation id for the '<em>Get All Super Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER___GET_ALL_SUPER_CLASSIFIERS = TypesPackage.TYPE_OPERATION_COUNT + 0;

    /**
     * The operation id for the '<em>Add Import</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER___ADD_IMPORT__STRING = TypesPackage.TYPE_OPERATION_COUNT + 1;

    /**
     * The operation id for the '<em>Add Package Import</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER___ADD_PACKAGE_IMPORT__STRING = TypesPackage.TYPE_OPERATION_COUNT + 2;

    /**
     * The number of operations of the '<em>Classifier</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_OPERATION_COUNT = TypesPackage.TYPE_OPERATION_COUNT + 3;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.ConcreteClassifierImpl <em>Concrete Classifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.ConcreteClassifierImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.ClassifiersPackageImpl#getConcreteClassifier()
     * @generated
     */
    int CONCRETE_CLASSIFIER = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCRETE_CLASSIFIER__NAME = CLASSIFIER__NAME;

    /**
     * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCRETE_CLASSIFIER__TYPE_PARAMETERS = CLASSIFIER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Members</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCRETE_CLASSIFIER__MEMBERS = CLASSIFIER_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Default Members</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCRETE_CLASSIFIER__DEFAULT_MEMBERS = CLASSIFIER_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Annotations And Modifiers</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCRETE_CLASSIFIER__ANNOTATIONS_AND_MODIFIERS = CLASSIFIER_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Concrete Classifier</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCRETE_CLASSIFIER_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 4;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCRETE_CLASSIFIER___GET_CONCRETE_CLASSIFIER__STRING = CLASSIFIER___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCRETE_CLASSIFIER___GET_CONCRETE_CLASSIFIER_PROXY__STRING = CLASSIFIER___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCRETE_CLASSIFIER___GET_CONCRETE_CLASSIFIERS__STRING_STRING = CLASSIFIER___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCRETE_CLASSIFIER___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = CLASSIFIER___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCRETE_CLASSIFIER___GET_LIB_CLASS__STRING = CLASSIFIER___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCRETE_CLASSIFIER___GET_LIB_INTERFACE__STRING = CLASSIFIER___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCRETE_CLASSIFIER___GET_CLASS_CLASS = CLASSIFIER___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCRETE_CLASSIFIER___GET_OBJECT_CLASS = CLASSIFIER___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCRETE_CLASSIFIER___GET_STRING_CLASS = CLASSIFIER___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCRETE_CLASSIFIER___GET_ANNOTATION_INTERFACE = CLASSIFIER___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCRETE_CLASSIFIER___GET_CONTAINING_ANNOTATION_INSTANCE = CLASSIFIER___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCRETE_CLASSIFIER___GET_CONTAINING_ANONYMOUS_CLASS = CLASSIFIER___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCRETE_CLASSIFIER___GET_CONTAINING_CONCRETE_CLASSIFIER = CLASSIFIER___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCRETE_CLASSIFIER___GET_CONTAINING_COMPILATION_UNIT = CLASSIFIER___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCRETE_CLASSIFIER___GET_CONTAINING_PACKAGE_NAME = CLASSIFIER___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCRETE_CLASSIFIER___GET_CONTAINING_CONTAINER_NAME = CLASSIFIER___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCRETE_CLASSIFIER___GET_PARENT_CONCRETE_CLASSIFIER = CLASSIFIER___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCRETE_CLASSIFIER___GET_PARENT_BY_ETYPE__ECLASS = CLASSIFIER___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCRETE_CLASSIFIER___GET_FIRST_CHILD_BY_ETYPE__ECLASS = CLASSIFIER___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCRETE_CLASSIFIER___GET_PARENT_BY_TYPE__CLASS = CLASSIFIER___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCRETE_CLASSIFIER___GET_FIRST_CHILD_BY_TYPE__CLASS = CLASSIFIER___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCRETE_CLASSIFIER___GET_CHILDREN_BY_ETYPE__ECLASS = CLASSIFIER___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCRETE_CLASSIFIER___GET_CHILDREN_BY_TYPE__CLASS = CLASSIFIER___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCRETE_CLASSIFIER___GET_COMMENTS = CLASSIFIER___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCRETE_CLASSIFIER___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = CLASSIFIER___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCRETE_CLASSIFIER___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = CLASSIFIER___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Equals Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCRETE_CLASSIFIER___EQUALS_TYPE__LONG_TYPE_LONG = CLASSIFIER___EQUALS_TYPE__LONG_TYPE_LONG;

    /**
     * The operation id for the '<em>Is Super Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCRETE_CLASSIFIER___IS_SUPER_TYPE__LONG_TYPE_ARRAYTYPEABLE = CLASSIFIER___IS_SUPER_TYPE__LONG_TYPE_ARRAYTYPEABLE;

    /**
     * The operation id for the '<em>Get All Super Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCRETE_CLASSIFIER___GET_ALL_SUPER_CLASSIFIERS = CLASSIFIER___GET_ALL_SUPER_CLASSIFIERS;

    /**
     * The operation id for the '<em>Add Import</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCRETE_CLASSIFIER___ADD_IMPORT__STRING = CLASSIFIER___ADD_IMPORT__STRING;

    /**
     * The operation id for the '<em>Add Package Import</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCRETE_CLASSIFIER___ADD_PACKAGE_IMPORT__STRING = CLASSIFIER___ADD_PACKAGE_IMPORT__STRING;

    /**
     * The operation id for the '<em>Get Contained Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCRETE_CLASSIFIER___GET_CONTAINED_CLASSIFIER__STRING = CLASSIFIER_OPERATION_COUNT + 0;

    /**
     * The operation id for the '<em>Get Contained Field</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCRETE_CLASSIFIER___GET_CONTAINED_FIELD__STRING = CLASSIFIER_OPERATION_COUNT + 1;

    /**
     * The operation id for the '<em>Get Contained Method</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCRETE_CLASSIFIER___GET_CONTAINED_METHOD__STRING = CLASSIFIER_OPERATION_COUNT + 2;

    /**
     * The operation id for the '<em>Get Methods</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCRETE_CLASSIFIER___GET_METHODS = CLASSIFIER_OPERATION_COUNT + 3;

    /**
     * The operation id for the '<em>Remove Methods</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCRETE_CLASSIFIER___REMOVE_METHODS__STRING = CLASSIFIER_OPERATION_COUNT + 4;

    /**
     * The operation id for the '<em>Get Members By Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCRETE_CLASSIFIER___GET_MEMBERS_BY_NAME__STRING = CLASSIFIER_OPERATION_COUNT + 5;

    /**
     * The operation id for the '<em>Create Field</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCRETE_CLASSIFIER___CREATE_FIELD__STRING_STRING = CLASSIFIER_OPERATION_COUNT + 6;

    /**
     * The operation id for the '<em>Get Fields</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCRETE_CLASSIFIER___GET_FIELDS = CLASSIFIER_OPERATION_COUNT + 7;

    /**
     * The operation id for the '<em>Get Constructors</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCRETE_CLASSIFIER___GET_CONSTRUCTORS = CLASSIFIER_OPERATION_COUNT + 8;

    /**
     * The operation id for the '<em>Is Hidden</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCRETE_CLASSIFIER___IS_HIDDEN__COMMENTABLE = CLASSIFIER_OPERATION_COUNT + 9;

    /**
     * The operation id for the '<em>Is Static</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCRETE_CLASSIFIER___IS_STATIC = CLASSIFIER_OPERATION_COUNT + 10;

    /**
     * The operation id for the '<em>Remove Modifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCRETE_CLASSIFIER___REMOVE_MODIFIER__CLASS = CLASSIFIER_OPERATION_COUNT + 11;

    /**
     * The operation id for the '<em>Make Public</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCRETE_CLASSIFIER___MAKE_PUBLIC = CLASSIFIER_OPERATION_COUNT + 12;

    /**
     * The operation id for the '<em>Make Private</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCRETE_CLASSIFIER___MAKE_PRIVATE = CLASSIFIER_OPERATION_COUNT + 13;

    /**
     * The operation id for the '<em>Make Protected</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCRETE_CLASSIFIER___MAKE_PROTECTED = CLASSIFIER_OPERATION_COUNT + 14;

    /**
     * The operation id for the '<em>Get Modifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCRETE_CLASSIFIER___GET_MODIFIERS = CLASSIFIER_OPERATION_COUNT + 15;

    /**
     * The operation id for the '<em>Remove All Modifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCRETE_CLASSIFIER___REMOVE_ALL_MODIFIERS = CLASSIFIER_OPERATION_COUNT + 16;

    /**
     * The operation id for the '<em>Has Modifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCRETE_CLASSIFIER___HAS_MODIFIER__CLASS = CLASSIFIER_OPERATION_COUNT + 17;

    /**
     * The operation id for the '<em>Is Public</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCRETE_CLASSIFIER___IS_PUBLIC = CLASSIFIER_OPERATION_COUNT + 18;

    /**
     * The operation id for the '<em>Is Private</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCRETE_CLASSIFIER___IS_PRIVATE = CLASSIFIER_OPERATION_COUNT + 19;

    /**
     * The operation id for the '<em>Is Protected</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCRETE_CLASSIFIER___IS_PROTECTED = CLASSIFIER_OPERATION_COUNT + 20;

    /**
     * The operation id for the '<em>Add Modifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCRETE_CLASSIFIER___ADD_MODIFIER__MODIFIER = CLASSIFIER_OPERATION_COUNT + 21;

    /**
     * The operation id for the '<em>Get Annotation Instances</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCRETE_CLASSIFIER___GET_ANNOTATION_INSTANCES = CLASSIFIER_OPERATION_COUNT + 22;

    /**
     * The operation id for the '<em>Get Inner Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCRETE_CLASSIFIER___GET_INNER_CLASSIFIERS = CLASSIFIER_OPERATION_COUNT + 23;

    /**
     * The operation id for the '<em>Get All Inner Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCRETE_CLASSIFIER___GET_ALL_INNER_CLASSIFIERS = CLASSIFIER_OPERATION_COUNT + 24;

    /**
     * The operation id for the '<em>Get Super Type References</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCRETE_CLASSIFIER___GET_SUPER_TYPE_REFERENCES = CLASSIFIER_OPERATION_COUNT + 25;

    /**
     * The operation id for the '<em>Get All Members</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCRETE_CLASSIFIER___GET_ALL_MEMBERS__COMMENTABLE = CLASSIFIER_OPERATION_COUNT + 26;

    /**
     * The operation id for the '<em>Get Qualified Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCRETE_CLASSIFIER___GET_QUALIFIED_NAME = CLASSIFIER_OPERATION_COUNT + 27;

    /**
     * The operation id for the '<em>Is Java Lang Object</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCRETE_CLASSIFIER___IS_JAVA_LANG_OBJECT__CONCRETECLASSIFIER = CLASSIFIER_OPERATION_COUNT + 28;

    /**
     * The number of operations of the '<em>Concrete Classifier</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCRETE_CLASSIFIER_OPERATION_COUNT = CLASSIFIER_OPERATION_COUNT + 29;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.ImplementorImpl <em>Implementor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.ImplementorImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.ClassifiersPackageImpl#getImplementor()
     * @generated
     */
    int IMPLEMENTOR = 2;

    /**
     * The feature id for the '<em><b>Implements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLEMENTOR__IMPLEMENTS = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Implementor</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLEMENTOR_FEATURE_COUNT = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLEMENTOR___GET_CONCRETE_CLASSIFIER__STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLEMENTOR___GET_CONCRETE_CLASSIFIER_PROXY__STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLEMENTOR___GET_CONCRETE_CLASSIFIERS__STRING_STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLEMENTOR___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLEMENTOR___GET_LIB_CLASS__STRING = CommonsPackage.COMMENTABLE___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLEMENTOR___GET_LIB_INTERFACE__STRING = CommonsPackage.COMMENTABLE___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLEMENTOR___GET_CLASS_CLASS = CommonsPackage.COMMENTABLE___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLEMENTOR___GET_OBJECT_CLASS = CommonsPackage.COMMENTABLE___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLEMENTOR___GET_STRING_CLASS = CommonsPackage.COMMENTABLE___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLEMENTOR___GET_ANNOTATION_INTERFACE = CommonsPackage.COMMENTABLE___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLEMENTOR___GET_CONTAINING_ANNOTATION_INSTANCE = CommonsPackage.COMMENTABLE___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLEMENTOR___GET_CONTAINING_ANONYMOUS_CLASS = CommonsPackage.COMMENTABLE___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLEMENTOR___GET_CONTAINING_CONCRETE_CLASSIFIER = CommonsPackage.COMMENTABLE___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLEMENTOR___GET_CONTAINING_COMPILATION_UNIT = CommonsPackage.COMMENTABLE___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLEMENTOR___GET_CONTAINING_PACKAGE_NAME = CommonsPackage.COMMENTABLE___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLEMENTOR___GET_CONTAINING_CONTAINER_NAME = CommonsPackage.COMMENTABLE___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLEMENTOR___GET_PARENT_CONCRETE_CLASSIFIER = CommonsPackage.COMMENTABLE___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLEMENTOR___GET_PARENT_BY_ETYPE__ECLASS = CommonsPackage.COMMENTABLE___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLEMENTOR___GET_FIRST_CHILD_BY_ETYPE__ECLASS = CommonsPackage.COMMENTABLE___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLEMENTOR___GET_PARENT_BY_TYPE__CLASS = CommonsPackage.COMMENTABLE___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLEMENTOR___GET_FIRST_CHILD_BY_TYPE__CLASS = CommonsPackage.COMMENTABLE___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLEMENTOR___GET_CHILDREN_BY_ETYPE__ECLASS = CommonsPackage.COMMENTABLE___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLEMENTOR___GET_CHILDREN_BY_TYPE__CLASS = CommonsPackage.COMMENTABLE___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLEMENTOR___GET_COMMENTS = CommonsPackage.COMMENTABLE___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLEMENTOR___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = CommonsPackage.COMMENTABLE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLEMENTOR___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = CommonsPackage.COMMENTABLE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The number of operations of the '<em>Implementor</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLEMENTOR_OPERATION_COUNT = CommonsPackage.COMMENTABLE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.ClassImpl <em>Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.ClassImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.ClassifiersPackageImpl#getClass_()
     * @generated
     */
    int CLASS = 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS__NAME = CONCRETE_CLASSIFIER__NAME;

    /**
     * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS__TYPE_PARAMETERS = CONCRETE_CLASSIFIER__TYPE_PARAMETERS;

    /**
     * The feature id for the '<em><b>Members</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS__MEMBERS = CONCRETE_CLASSIFIER__MEMBERS;

    /**
     * The feature id for the '<em><b>Default Members</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS__DEFAULT_MEMBERS = CONCRETE_CLASSIFIER__DEFAULT_MEMBERS;

    /**
     * The feature id for the '<em><b>Annotations And Modifiers</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS__ANNOTATIONS_AND_MODIFIERS = CONCRETE_CLASSIFIER__ANNOTATIONS_AND_MODIFIERS;

    /**
     * The feature id for the '<em><b>Implements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS__IMPLEMENTS = CONCRETE_CLASSIFIER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Extends</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS__EXTENDS = CONCRETE_CLASSIFIER_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Default Extends</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS__DEFAULT_EXTENDS = CONCRETE_CLASSIFIER_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Class</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_FEATURE_COUNT = CONCRETE_CLASSIFIER_FEATURE_COUNT + 3;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS___GET_CONCRETE_CLASSIFIER__STRING = CONCRETE_CLASSIFIER___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS___GET_CONCRETE_CLASSIFIER_PROXY__STRING = CONCRETE_CLASSIFIER___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS___GET_CONCRETE_CLASSIFIERS__STRING_STRING = CONCRETE_CLASSIFIER___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = CONCRETE_CLASSIFIER___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS___GET_LIB_CLASS__STRING = CONCRETE_CLASSIFIER___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS___GET_LIB_INTERFACE__STRING = CONCRETE_CLASSIFIER___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS___GET_CLASS_CLASS = CONCRETE_CLASSIFIER___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS___GET_OBJECT_CLASS = CONCRETE_CLASSIFIER___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS___GET_STRING_CLASS = CONCRETE_CLASSIFIER___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS___GET_ANNOTATION_INTERFACE = CONCRETE_CLASSIFIER___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS___GET_CONTAINING_ANNOTATION_INSTANCE = CONCRETE_CLASSIFIER___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS___GET_CONTAINING_ANONYMOUS_CLASS = CONCRETE_CLASSIFIER___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS___GET_CONTAINING_CONCRETE_CLASSIFIER = CONCRETE_CLASSIFIER___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS___GET_CONTAINING_COMPILATION_UNIT = CONCRETE_CLASSIFIER___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS___GET_CONTAINING_PACKAGE_NAME = CONCRETE_CLASSIFIER___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS___GET_CONTAINING_CONTAINER_NAME = CONCRETE_CLASSIFIER___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS___GET_PARENT_CONCRETE_CLASSIFIER = CONCRETE_CLASSIFIER___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS___GET_PARENT_BY_ETYPE__ECLASS = CONCRETE_CLASSIFIER___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS___GET_FIRST_CHILD_BY_ETYPE__ECLASS = CONCRETE_CLASSIFIER___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS___GET_PARENT_BY_TYPE__CLASS = CONCRETE_CLASSIFIER___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS___GET_FIRST_CHILD_BY_TYPE__CLASS = CONCRETE_CLASSIFIER___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS___GET_CHILDREN_BY_ETYPE__ECLASS = CONCRETE_CLASSIFIER___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS___GET_CHILDREN_BY_TYPE__CLASS = CONCRETE_CLASSIFIER___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS___GET_COMMENTS = CONCRETE_CLASSIFIER___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = CONCRETE_CLASSIFIER___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = CONCRETE_CLASSIFIER___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Equals Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS___EQUALS_TYPE__LONG_TYPE_LONG = CONCRETE_CLASSIFIER___EQUALS_TYPE__LONG_TYPE_LONG;

    /**
     * The operation id for the '<em>Is Super Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS___IS_SUPER_TYPE__LONG_TYPE_ARRAYTYPEABLE = CONCRETE_CLASSIFIER___IS_SUPER_TYPE__LONG_TYPE_ARRAYTYPEABLE;

    /**
     * The operation id for the '<em>Add Import</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS___ADD_IMPORT__STRING = CONCRETE_CLASSIFIER___ADD_IMPORT__STRING;

    /**
     * The operation id for the '<em>Add Package Import</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS___ADD_PACKAGE_IMPORT__STRING = CONCRETE_CLASSIFIER___ADD_PACKAGE_IMPORT__STRING;

    /**
     * The operation id for the '<em>Get Contained Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS___GET_CONTAINED_CLASSIFIER__STRING = CONCRETE_CLASSIFIER___GET_CONTAINED_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Contained Field</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS___GET_CONTAINED_FIELD__STRING = CONCRETE_CLASSIFIER___GET_CONTAINED_FIELD__STRING;

    /**
     * The operation id for the '<em>Get Contained Method</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS___GET_CONTAINED_METHOD__STRING = CONCRETE_CLASSIFIER___GET_CONTAINED_METHOD__STRING;

    /**
     * The operation id for the '<em>Get Methods</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS___GET_METHODS = CONCRETE_CLASSIFIER___GET_METHODS;

    /**
     * The operation id for the '<em>Remove Methods</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS___REMOVE_METHODS__STRING = CONCRETE_CLASSIFIER___REMOVE_METHODS__STRING;

    /**
     * The operation id for the '<em>Get Members By Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS___GET_MEMBERS_BY_NAME__STRING = CONCRETE_CLASSIFIER___GET_MEMBERS_BY_NAME__STRING;

    /**
     * The operation id for the '<em>Create Field</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS___CREATE_FIELD__STRING_STRING = CONCRETE_CLASSIFIER___CREATE_FIELD__STRING_STRING;

    /**
     * The operation id for the '<em>Get Fields</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS___GET_FIELDS = CONCRETE_CLASSIFIER___GET_FIELDS;

    /**
     * The operation id for the '<em>Get Constructors</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS___GET_CONSTRUCTORS = CONCRETE_CLASSIFIER___GET_CONSTRUCTORS;

    /**
     * The operation id for the '<em>Is Hidden</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS___IS_HIDDEN__COMMENTABLE = CONCRETE_CLASSIFIER___IS_HIDDEN__COMMENTABLE;

    /**
     * The operation id for the '<em>Is Static</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS___IS_STATIC = CONCRETE_CLASSIFIER___IS_STATIC;

    /**
     * The operation id for the '<em>Remove Modifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS___REMOVE_MODIFIER__CLASS = CONCRETE_CLASSIFIER___REMOVE_MODIFIER__CLASS;

    /**
     * The operation id for the '<em>Make Public</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS___MAKE_PUBLIC = CONCRETE_CLASSIFIER___MAKE_PUBLIC;

    /**
     * The operation id for the '<em>Make Private</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS___MAKE_PRIVATE = CONCRETE_CLASSIFIER___MAKE_PRIVATE;

    /**
     * The operation id for the '<em>Make Protected</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS___MAKE_PROTECTED = CONCRETE_CLASSIFIER___MAKE_PROTECTED;

    /**
     * The operation id for the '<em>Get Modifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS___GET_MODIFIERS = CONCRETE_CLASSIFIER___GET_MODIFIERS;

    /**
     * The operation id for the '<em>Remove All Modifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS___REMOVE_ALL_MODIFIERS = CONCRETE_CLASSIFIER___REMOVE_ALL_MODIFIERS;

    /**
     * The operation id for the '<em>Has Modifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS___HAS_MODIFIER__CLASS = CONCRETE_CLASSIFIER___HAS_MODIFIER__CLASS;

    /**
     * The operation id for the '<em>Is Public</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS___IS_PUBLIC = CONCRETE_CLASSIFIER___IS_PUBLIC;

    /**
     * The operation id for the '<em>Is Private</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS___IS_PRIVATE = CONCRETE_CLASSIFIER___IS_PRIVATE;

    /**
     * The operation id for the '<em>Is Protected</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS___IS_PROTECTED = CONCRETE_CLASSIFIER___IS_PROTECTED;

    /**
     * The operation id for the '<em>Add Modifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS___ADD_MODIFIER__MODIFIER = CONCRETE_CLASSIFIER___ADD_MODIFIER__MODIFIER;

    /**
     * The operation id for the '<em>Get Annotation Instances</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS___GET_ANNOTATION_INSTANCES = CONCRETE_CLASSIFIER___GET_ANNOTATION_INSTANCES;

    /**
     * The operation id for the '<em>Get Inner Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS___GET_INNER_CLASSIFIERS = CONCRETE_CLASSIFIER___GET_INNER_CLASSIFIERS;

    /**
     * The operation id for the '<em>Get All Inner Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS___GET_ALL_INNER_CLASSIFIERS = CONCRETE_CLASSIFIER___GET_ALL_INNER_CLASSIFIERS;

    /**
     * The operation id for the '<em>Get Super Type References</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS___GET_SUPER_TYPE_REFERENCES = CONCRETE_CLASSIFIER___GET_SUPER_TYPE_REFERENCES;

    /**
     * The operation id for the '<em>Get All Members</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS___GET_ALL_MEMBERS__COMMENTABLE = CONCRETE_CLASSIFIER___GET_ALL_MEMBERS__COMMENTABLE;

    /**
     * The operation id for the '<em>Get Qualified Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS___GET_QUALIFIED_NAME = CONCRETE_CLASSIFIER___GET_QUALIFIED_NAME;

    /**
     * The operation id for the '<em>Is Java Lang Object</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS___IS_JAVA_LANG_OBJECT__CONCRETECLASSIFIER = CONCRETE_CLASSIFIER___IS_JAVA_LANG_OBJECT__CONCRETECLASSIFIER;

    /**
     * The operation id for the '<em>Get All Super Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS___GET_ALL_SUPER_CLASSIFIERS = CONCRETE_CLASSIFIER_OPERATION_COUNT + 0;

    /**
     * The operation id for the '<em>Get Super Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS___GET_SUPER_CLASS = CONCRETE_CLASSIFIER_OPERATION_COUNT + 1;

    /**
     * The operation id for the '<em>Un Wrap Primitive Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS___UN_WRAP_PRIMITIVE_TYPE = CONCRETE_CLASSIFIER_OPERATION_COUNT + 2;

    /**
     * The number of operations of the '<em>Class</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_OPERATION_COUNT = CONCRETE_CLASSIFIER_OPERATION_COUNT + 3;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.InterfaceImpl <em>Interface</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.InterfaceImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.ClassifiersPackageImpl#getInterface()
     * @generated
     */
    int INTERFACE = 4;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE__NAME = CONCRETE_CLASSIFIER__NAME;

    /**
     * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE__TYPE_PARAMETERS = CONCRETE_CLASSIFIER__TYPE_PARAMETERS;

    /**
     * The feature id for the '<em><b>Members</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE__MEMBERS = CONCRETE_CLASSIFIER__MEMBERS;

    /**
     * The feature id for the '<em><b>Default Members</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE__DEFAULT_MEMBERS = CONCRETE_CLASSIFIER__DEFAULT_MEMBERS;

    /**
     * The feature id for the '<em><b>Annotations And Modifiers</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE__ANNOTATIONS_AND_MODIFIERS = CONCRETE_CLASSIFIER__ANNOTATIONS_AND_MODIFIERS;

    /**
     * The feature id for the '<em><b>Extends</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE__EXTENDS = CONCRETE_CLASSIFIER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Default Extends</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE__DEFAULT_EXTENDS = CONCRETE_CLASSIFIER_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Interface</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_FEATURE_COUNT = CONCRETE_CLASSIFIER_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE___GET_CONCRETE_CLASSIFIER__STRING = CONCRETE_CLASSIFIER___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE___GET_CONCRETE_CLASSIFIER_PROXY__STRING = CONCRETE_CLASSIFIER___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE___GET_CONCRETE_CLASSIFIERS__STRING_STRING = CONCRETE_CLASSIFIER___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = CONCRETE_CLASSIFIER___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE___GET_LIB_CLASS__STRING = CONCRETE_CLASSIFIER___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE___GET_LIB_INTERFACE__STRING = CONCRETE_CLASSIFIER___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE___GET_CLASS_CLASS = CONCRETE_CLASSIFIER___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE___GET_OBJECT_CLASS = CONCRETE_CLASSIFIER___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE___GET_STRING_CLASS = CONCRETE_CLASSIFIER___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE___GET_ANNOTATION_INTERFACE = CONCRETE_CLASSIFIER___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE___GET_CONTAINING_ANNOTATION_INSTANCE = CONCRETE_CLASSIFIER___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE___GET_CONTAINING_ANONYMOUS_CLASS = CONCRETE_CLASSIFIER___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE___GET_CONTAINING_CONCRETE_CLASSIFIER = CONCRETE_CLASSIFIER___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE___GET_CONTAINING_COMPILATION_UNIT = CONCRETE_CLASSIFIER___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE___GET_CONTAINING_PACKAGE_NAME = CONCRETE_CLASSIFIER___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE___GET_CONTAINING_CONTAINER_NAME = CONCRETE_CLASSIFIER___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE___GET_PARENT_CONCRETE_CLASSIFIER = CONCRETE_CLASSIFIER___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE___GET_PARENT_BY_ETYPE__ECLASS = CONCRETE_CLASSIFIER___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE___GET_FIRST_CHILD_BY_ETYPE__ECLASS = CONCRETE_CLASSIFIER___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE___GET_PARENT_BY_TYPE__CLASS = CONCRETE_CLASSIFIER___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE___GET_FIRST_CHILD_BY_TYPE__CLASS = CONCRETE_CLASSIFIER___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE___GET_CHILDREN_BY_ETYPE__ECLASS = CONCRETE_CLASSIFIER___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE___GET_CHILDREN_BY_TYPE__CLASS = CONCRETE_CLASSIFIER___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE___GET_COMMENTS = CONCRETE_CLASSIFIER___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = CONCRETE_CLASSIFIER___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = CONCRETE_CLASSIFIER___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Equals Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE___EQUALS_TYPE__LONG_TYPE_LONG = CONCRETE_CLASSIFIER___EQUALS_TYPE__LONG_TYPE_LONG;

    /**
     * The operation id for the '<em>Is Super Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE___IS_SUPER_TYPE__LONG_TYPE_ARRAYTYPEABLE = CONCRETE_CLASSIFIER___IS_SUPER_TYPE__LONG_TYPE_ARRAYTYPEABLE;

    /**
     * The operation id for the '<em>Add Import</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE___ADD_IMPORT__STRING = CONCRETE_CLASSIFIER___ADD_IMPORT__STRING;

    /**
     * The operation id for the '<em>Add Package Import</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE___ADD_PACKAGE_IMPORT__STRING = CONCRETE_CLASSIFIER___ADD_PACKAGE_IMPORT__STRING;

    /**
     * The operation id for the '<em>Get Contained Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE___GET_CONTAINED_CLASSIFIER__STRING = CONCRETE_CLASSIFIER___GET_CONTAINED_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Contained Field</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE___GET_CONTAINED_FIELD__STRING = CONCRETE_CLASSIFIER___GET_CONTAINED_FIELD__STRING;

    /**
     * The operation id for the '<em>Get Contained Method</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE___GET_CONTAINED_METHOD__STRING = CONCRETE_CLASSIFIER___GET_CONTAINED_METHOD__STRING;

    /**
     * The operation id for the '<em>Get Methods</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE___GET_METHODS = CONCRETE_CLASSIFIER___GET_METHODS;

    /**
     * The operation id for the '<em>Remove Methods</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE___REMOVE_METHODS__STRING = CONCRETE_CLASSIFIER___REMOVE_METHODS__STRING;

    /**
     * The operation id for the '<em>Get Members By Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE___GET_MEMBERS_BY_NAME__STRING = CONCRETE_CLASSIFIER___GET_MEMBERS_BY_NAME__STRING;

    /**
     * The operation id for the '<em>Create Field</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE___CREATE_FIELD__STRING_STRING = CONCRETE_CLASSIFIER___CREATE_FIELD__STRING_STRING;

    /**
     * The operation id for the '<em>Get Fields</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE___GET_FIELDS = CONCRETE_CLASSIFIER___GET_FIELDS;

    /**
     * The operation id for the '<em>Get Constructors</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE___GET_CONSTRUCTORS = CONCRETE_CLASSIFIER___GET_CONSTRUCTORS;

    /**
     * The operation id for the '<em>Is Hidden</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE___IS_HIDDEN__COMMENTABLE = CONCRETE_CLASSIFIER___IS_HIDDEN__COMMENTABLE;

    /**
     * The operation id for the '<em>Is Static</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE___IS_STATIC = CONCRETE_CLASSIFIER___IS_STATIC;

    /**
     * The operation id for the '<em>Remove Modifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE___REMOVE_MODIFIER__CLASS = CONCRETE_CLASSIFIER___REMOVE_MODIFIER__CLASS;

    /**
     * The operation id for the '<em>Make Public</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE___MAKE_PUBLIC = CONCRETE_CLASSIFIER___MAKE_PUBLIC;

    /**
     * The operation id for the '<em>Make Private</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE___MAKE_PRIVATE = CONCRETE_CLASSIFIER___MAKE_PRIVATE;

    /**
     * The operation id for the '<em>Make Protected</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE___MAKE_PROTECTED = CONCRETE_CLASSIFIER___MAKE_PROTECTED;

    /**
     * The operation id for the '<em>Get Modifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE___GET_MODIFIERS = CONCRETE_CLASSIFIER___GET_MODIFIERS;

    /**
     * The operation id for the '<em>Remove All Modifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE___REMOVE_ALL_MODIFIERS = CONCRETE_CLASSIFIER___REMOVE_ALL_MODIFIERS;

    /**
     * The operation id for the '<em>Has Modifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE___HAS_MODIFIER__CLASS = CONCRETE_CLASSIFIER___HAS_MODIFIER__CLASS;

    /**
     * The operation id for the '<em>Is Public</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE___IS_PUBLIC = CONCRETE_CLASSIFIER___IS_PUBLIC;

    /**
     * The operation id for the '<em>Is Private</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE___IS_PRIVATE = CONCRETE_CLASSIFIER___IS_PRIVATE;

    /**
     * The operation id for the '<em>Is Protected</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE___IS_PROTECTED = CONCRETE_CLASSIFIER___IS_PROTECTED;

    /**
     * The operation id for the '<em>Add Modifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE___ADD_MODIFIER__MODIFIER = CONCRETE_CLASSIFIER___ADD_MODIFIER__MODIFIER;

    /**
     * The operation id for the '<em>Get Annotation Instances</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE___GET_ANNOTATION_INSTANCES = CONCRETE_CLASSIFIER___GET_ANNOTATION_INSTANCES;

    /**
     * The operation id for the '<em>Get Inner Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE___GET_INNER_CLASSIFIERS = CONCRETE_CLASSIFIER___GET_INNER_CLASSIFIERS;

    /**
     * The operation id for the '<em>Get All Inner Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE___GET_ALL_INNER_CLASSIFIERS = CONCRETE_CLASSIFIER___GET_ALL_INNER_CLASSIFIERS;

    /**
     * The operation id for the '<em>Get Super Type References</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE___GET_SUPER_TYPE_REFERENCES = CONCRETE_CLASSIFIER___GET_SUPER_TYPE_REFERENCES;

    /**
     * The operation id for the '<em>Get All Members</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE___GET_ALL_MEMBERS__COMMENTABLE = CONCRETE_CLASSIFIER___GET_ALL_MEMBERS__COMMENTABLE;

    /**
     * The operation id for the '<em>Get Qualified Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE___GET_QUALIFIED_NAME = CONCRETE_CLASSIFIER___GET_QUALIFIED_NAME;

    /**
     * The operation id for the '<em>Is Java Lang Object</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE___IS_JAVA_LANG_OBJECT__CONCRETECLASSIFIER = CONCRETE_CLASSIFIER___IS_JAVA_LANG_OBJECT__CONCRETECLASSIFIER;

    /**
     * The operation id for the '<em>Get All Super Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE___GET_ALL_SUPER_CLASSIFIERS = CONCRETE_CLASSIFIER_OPERATION_COUNT + 0;

    /**
     * The number of operations of the '<em>Interface</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_OPERATION_COUNT = CONCRETE_CLASSIFIER_OPERATION_COUNT + 1;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.EnumerationImpl <em>Enumeration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.EnumerationImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.ClassifiersPackageImpl#getEnumeration()
     * @generated
     */
    int ENUMERATION = 5;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION__NAME = CONCRETE_CLASSIFIER__NAME;

    /**
     * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION__TYPE_PARAMETERS = CONCRETE_CLASSIFIER__TYPE_PARAMETERS;

    /**
     * The feature id for the '<em><b>Members</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION__MEMBERS = CONCRETE_CLASSIFIER__MEMBERS;

    /**
     * The feature id for the '<em><b>Default Members</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION__DEFAULT_MEMBERS = CONCRETE_CLASSIFIER__DEFAULT_MEMBERS;

    /**
     * The feature id for the '<em><b>Annotations And Modifiers</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION__ANNOTATIONS_AND_MODIFIERS = CONCRETE_CLASSIFIER__ANNOTATIONS_AND_MODIFIERS;

    /**
     * The feature id for the '<em><b>Implements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION__IMPLEMENTS = CONCRETE_CLASSIFIER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Constants</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION__CONSTANTS = CONCRETE_CLASSIFIER_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Enumeration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION_FEATURE_COUNT = CONCRETE_CLASSIFIER_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION___GET_CONCRETE_CLASSIFIER__STRING = CONCRETE_CLASSIFIER___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION___GET_CONCRETE_CLASSIFIER_PROXY__STRING = CONCRETE_CLASSIFIER___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION___GET_CONCRETE_CLASSIFIERS__STRING_STRING = CONCRETE_CLASSIFIER___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = CONCRETE_CLASSIFIER___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION___GET_LIB_CLASS__STRING = CONCRETE_CLASSIFIER___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION___GET_LIB_INTERFACE__STRING = CONCRETE_CLASSIFIER___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION___GET_CLASS_CLASS = CONCRETE_CLASSIFIER___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION___GET_OBJECT_CLASS = CONCRETE_CLASSIFIER___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION___GET_STRING_CLASS = CONCRETE_CLASSIFIER___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION___GET_ANNOTATION_INTERFACE = CONCRETE_CLASSIFIER___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION___GET_CONTAINING_ANNOTATION_INSTANCE = CONCRETE_CLASSIFIER___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION___GET_CONTAINING_ANONYMOUS_CLASS = CONCRETE_CLASSIFIER___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION___GET_CONTAINING_CONCRETE_CLASSIFIER = CONCRETE_CLASSIFIER___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION___GET_CONTAINING_COMPILATION_UNIT = CONCRETE_CLASSIFIER___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION___GET_CONTAINING_PACKAGE_NAME = CONCRETE_CLASSIFIER___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION___GET_CONTAINING_CONTAINER_NAME = CONCRETE_CLASSIFIER___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION___GET_PARENT_CONCRETE_CLASSIFIER = CONCRETE_CLASSIFIER___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION___GET_PARENT_BY_ETYPE__ECLASS = CONCRETE_CLASSIFIER___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION___GET_FIRST_CHILD_BY_ETYPE__ECLASS = CONCRETE_CLASSIFIER___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION___GET_PARENT_BY_TYPE__CLASS = CONCRETE_CLASSIFIER___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION___GET_FIRST_CHILD_BY_TYPE__CLASS = CONCRETE_CLASSIFIER___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION___GET_CHILDREN_BY_ETYPE__ECLASS = CONCRETE_CLASSIFIER___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION___GET_CHILDREN_BY_TYPE__CLASS = CONCRETE_CLASSIFIER___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION___GET_COMMENTS = CONCRETE_CLASSIFIER___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = CONCRETE_CLASSIFIER___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = CONCRETE_CLASSIFIER___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Equals Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION___EQUALS_TYPE__LONG_TYPE_LONG = CONCRETE_CLASSIFIER___EQUALS_TYPE__LONG_TYPE_LONG;

    /**
     * The operation id for the '<em>Is Super Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION___IS_SUPER_TYPE__LONG_TYPE_ARRAYTYPEABLE = CONCRETE_CLASSIFIER___IS_SUPER_TYPE__LONG_TYPE_ARRAYTYPEABLE;

    /**
     * The operation id for the '<em>Add Import</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION___ADD_IMPORT__STRING = CONCRETE_CLASSIFIER___ADD_IMPORT__STRING;

    /**
     * The operation id for the '<em>Add Package Import</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION___ADD_PACKAGE_IMPORT__STRING = CONCRETE_CLASSIFIER___ADD_PACKAGE_IMPORT__STRING;

    /**
     * The operation id for the '<em>Get Contained Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION___GET_CONTAINED_CLASSIFIER__STRING = CONCRETE_CLASSIFIER___GET_CONTAINED_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Contained Field</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION___GET_CONTAINED_FIELD__STRING = CONCRETE_CLASSIFIER___GET_CONTAINED_FIELD__STRING;

    /**
     * The operation id for the '<em>Get Contained Method</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION___GET_CONTAINED_METHOD__STRING = CONCRETE_CLASSIFIER___GET_CONTAINED_METHOD__STRING;

    /**
     * The operation id for the '<em>Get Methods</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION___GET_METHODS = CONCRETE_CLASSIFIER___GET_METHODS;

    /**
     * The operation id for the '<em>Remove Methods</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION___REMOVE_METHODS__STRING = CONCRETE_CLASSIFIER___REMOVE_METHODS__STRING;

    /**
     * The operation id for the '<em>Get Members By Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION___GET_MEMBERS_BY_NAME__STRING = CONCRETE_CLASSIFIER___GET_MEMBERS_BY_NAME__STRING;

    /**
     * The operation id for the '<em>Create Field</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION___CREATE_FIELD__STRING_STRING = CONCRETE_CLASSIFIER___CREATE_FIELD__STRING_STRING;

    /**
     * The operation id for the '<em>Get Fields</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION___GET_FIELDS = CONCRETE_CLASSIFIER___GET_FIELDS;

    /**
     * The operation id for the '<em>Get Constructors</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION___GET_CONSTRUCTORS = CONCRETE_CLASSIFIER___GET_CONSTRUCTORS;

    /**
     * The operation id for the '<em>Is Hidden</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION___IS_HIDDEN__COMMENTABLE = CONCRETE_CLASSIFIER___IS_HIDDEN__COMMENTABLE;

    /**
     * The operation id for the '<em>Is Static</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION___IS_STATIC = CONCRETE_CLASSIFIER___IS_STATIC;

    /**
     * The operation id for the '<em>Remove Modifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION___REMOVE_MODIFIER__CLASS = CONCRETE_CLASSIFIER___REMOVE_MODIFIER__CLASS;

    /**
     * The operation id for the '<em>Make Public</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION___MAKE_PUBLIC = CONCRETE_CLASSIFIER___MAKE_PUBLIC;

    /**
     * The operation id for the '<em>Make Private</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION___MAKE_PRIVATE = CONCRETE_CLASSIFIER___MAKE_PRIVATE;

    /**
     * The operation id for the '<em>Make Protected</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION___MAKE_PROTECTED = CONCRETE_CLASSIFIER___MAKE_PROTECTED;

    /**
     * The operation id for the '<em>Get Modifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION___GET_MODIFIERS = CONCRETE_CLASSIFIER___GET_MODIFIERS;

    /**
     * The operation id for the '<em>Remove All Modifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION___REMOVE_ALL_MODIFIERS = CONCRETE_CLASSIFIER___REMOVE_ALL_MODIFIERS;

    /**
     * The operation id for the '<em>Has Modifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION___HAS_MODIFIER__CLASS = CONCRETE_CLASSIFIER___HAS_MODIFIER__CLASS;

    /**
     * The operation id for the '<em>Is Public</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION___IS_PUBLIC = CONCRETE_CLASSIFIER___IS_PUBLIC;

    /**
     * The operation id for the '<em>Is Private</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION___IS_PRIVATE = CONCRETE_CLASSIFIER___IS_PRIVATE;

    /**
     * The operation id for the '<em>Is Protected</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION___IS_PROTECTED = CONCRETE_CLASSIFIER___IS_PROTECTED;

    /**
     * The operation id for the '<em>Add Modifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION___ADD_MODIFIER__MODIFIER = CONCRETE_CLASSIFIER___ADD_MODIFIER__MODIFIER;

    /**
     * The operation id for the '<em>Get Annotation Instances</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION___GET_ANNOTATION_INSTANCES = CONCRETE_CLASSIFIER___GET_ANNOTATION_INSTANCES;

    /**
     * The operation id for the '<em>Get Inner Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION___GET_INNER_CLASSIFIERS = CONCRETE_CLASSIFIER___GET_INNER_CLASSIFIERS;

    /**
     * The operation id for the '<em>Get All Inner Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION___GET_ALL_INNER_CLASSIFIERS = CONCRETE_CLASSIFIER___GET_ALL_INNER_CLASSIFIERS;

    /**
     * The operation id for the '<em>Get Super Type References</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION___GET_SUPER_TYPE_REFERENCES = CONCRETE_CLASSIFIER___GET_SUPER_TYPE_REFERENCES;

    /**
     * The operation id for the '<em>Get All Members</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION___GET_ALL_MEMBERS__COMMENTABLE = CONCRETE_CLASSIFIER___GET_ALL_MEMBERS__COMMENTABLE;

    /**
     * The operation id for the '<em>Get Qualified Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION___GET_QUALIFIED_NAME = CONCRETE_CLASSIFIER___GET_QUALIFIED_NAME;

    /**
     * The operation id for the '<em>Is Java Lang Object</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION___IS_JAVA_LANG_OBJECT__CONCRETECLASSIFIER = CONCRETE_CLASSIFIER___IS_JAVA_LANG_OBJECT__CONCRETECLASSIFIER;

    /**
     * The operation id for the '<em>Get All Super Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION___GET_ALL_SUPER_CLASSIFIERS = CONCRETE_CLASSIFIER_OPERATION_COUNT + 0;

    /**
     * The operation id for the '<em>Get Contained Constant</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION___GET_CONTAINED_CONSTANT__STRING = CONCRETE_CLASSIFIER_OPERATION_COUNT + 1;

    /**
     * The number of operations of the '<em>Enumeration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION_OPERATION_COUNT = CONCRETE_CLASSIFIER_OPERATION_COUNT + 2;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.AnnotationImpl <em>Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.AnnotationImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.ClassifiersPackageImpl#getAnnotation()
     * @generated
     */
    int ANNOTATION = 6;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION__NAME = CONCRETE_CLASSIFIER__NAME;

    /**
     * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION__TYPE_PARAMETERS = CONCRETE_CLASSIFIER__TYPE_PARAMETERS;

    /**
     * The feature id for the '<em><b>Members</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION__MEMBERS = CONCRETE_CLASSIFIER__MEMBERS;

    /**
     * The feature id for the '<em><b>Default Members</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION__DEFAULT_MEMBERS = CONCRETE_CLASSIFIER__DEFAULT_MEMBERS;

    /**
     * The feature id for the '<em><b>Annotations And Modifiers</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION__ANNOTATIONS_AND_MODIFIERS = CONCRETE_CLASSIFIER__ANNOTATIONS_AND_MODIFIERS;

    /**
     * The number of structural features of the '<em>Annotation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION_FEATURE_COUNT = CONCRETE_CLASSIFIER_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION___GET_CONCRETE_CLASSIFIER__STRING = CONCRETE_CLASSIFIER___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION___GET_CONCRETE_CLASSIFIER_PROXY__STRING = CONCRETE_CLASSIFIER___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION___GET_CONCRETE_CLASSIFIERS__STRING_STRING = CONCRETE_CLASSIFIER___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = CONCRETE_CLASSIFIER___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION___GET_LIB_CLASS__STRING = CONCRETE_CLASSIFIER___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION___GET_LIB_INTERFACE__STRING = CONCRETE_CLASSIFIER___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION___GET_CLASS_CLASS = CONCRETE_CLASSIFIER___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION___GET_OBJECT_CLASS = CONCRETE_CLASSIFIER___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION___GET_STRING_CLASS = CONCRETE_CLASSIFIER___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION___GET_ANNOTATION_INTERFACE = CONCRETE_CLASSIFIER___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION___GET_CONTAINING_ANNOTATION_INSTANCE = CONCRETE_CLASSIFIER___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION___GET_CONTAINING_ANONYMOUS_CLASS = CONCRETE_CLASSIFIER___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION___GET_CONTAINING_CONCRETE_CLASSIFIER = CONCRETE_CLASSIFIER___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION___GET_CONTAINING_COMPILATION_UNIT = CONCRETE_CLASSIFIER___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION___GET_CONTAINING_PACKAGE_NAME = CONCRETE_CLASSIFIER___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION___GET_CONTAINING_CONTAINER_NAME = CONCRETE_CLASSIFIER___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION___GET_PARENT_CONCRETE_CLASSIFIER = CONCRETE_CLASSIFIER___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION___GET_PARENT_BY_ETYPE__ECLASS = CONCRETE_CLASSIFIER___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION___GET_FIRST_CHILD_BY_ETYPE__ECLASS = CONCRETE_CLASSIFIER___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION___GET_PARENT_BY_TYPE__CLASS = CONCRETE_CLASSIFIER___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION___GET_FIRST_CHILD_BY_TYPE__CLASS = CONCRETE_CLASSIFIER___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION___GET_CHILDREN_BY_ETYPE__ECLASS = CONCRETE_CLASSIFIER___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION___GET_CHILDREN_BY_TYPE__CLASS = CONCRETE_CLASSIFIER___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION___GET_COMMENTS = CONCRETE_CLASSIFIER___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = CONCRETE_CLASSIFIER___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = CONCRETE_CLASSIFIER___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Equals Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION___EQUALS_TYPE__LONG_TYPE_LONG = CONCRETE_CLASSIFIER___EQUALS_TYPE__LONG_TYPE_LONG;

    /**
     * The operation id for the '<em>Is Super Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION___IS_SUPER_TYPE__LONG_TYPE_ARRAYTYPEABLE = CONCRETE_CLASSIFIER___IS_SUPER_TYPE__LONG_TYPE_ARRAYTYPEABLE;

    /**
     * The operation id for the '<em>Add Import</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION___ADD_IMPORT__STRING = CONCRETE_CLASSIFIER___ADD_IMPORT__STRING;

    /**
     * The operation id for the '<em>Add Package Import</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION___ADD_PACKAGE_IMPORT__STRING = CONCRETE_CLASSIFIER___ADD_PACKAGE_IMPORT__STRING;

    /**
     * The operation id for the '<em>Get Contained Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION___GET_CONTAINED_CLASSIFIER__STRING = CONCRETE_CLASSIFIER___GET_CONTAINED_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Contained Field</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION___GET_CONTAINED_FIELD__STRING = CONCRETE_CLASSIFIER___GET_CONTAINED_FIELD__STRING;

    /**
     * The operation id for the '<em>Get Contained Method</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION___GET_CONTAINED_METHOD__STRING = CONCRETE_CLASSIFIER___GET_CONTAINED_METHOD__STRING;

    /**
     * The operation id for the '<em>Get Methods</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION___GET_METHODS = CONCRETE_CLASSIFIER___GET_METHODS;

    /**
     * The operation id for the '<em>Remove Methods</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION___REMOVE_METHODS__STRING = CONCRETE_CLASSIFIER___REMOVE_METHODS__STRING;

    /**
     * The operation id for the '<em>Get Members By Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION___GET_MEMBERS_BY_NAME__STRING = CONCRETE_CLASSIFIER___GET_MEMBERS_BY_NAME__STRING;

    /**
     * The operation id for the '<em>Create Field</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION___CREATE_FIELD__STRING_STRING = CONCRETE_CLASSIFIER___CREATE_FIELD__STRING_STRING;

    /**
     * The operation id for the '<em>Get Fields</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION___GET_FIELDS = CONCRETE_CLASSIFIER___GET_FIELDS;

    /**
     * The operation id for the '<em>Get Constructors</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION___GET_CONSTRUCTORS = CONCRETE_CLASSIFIER___GET_CONSTRUCTORS;

    /**
     * The operation id for the '<em>Is Hidden</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION___IS_HIDDEN__COMMENTABLE = CONCRETE_CLASSIFIER___IS_HIDDEN__COMMENTABLE;

    /**
     * The operation id for the '<em>Is Static</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION___IS_STATIC = CONCRETE_CLASSIFIER___IS_STATIC;

    /**
     * The operation id for the '<em>Remove Modifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION___REMOVE_MODIFIER__CLASS = CONCRETE_CLASSIFIER___REMOVE_MODIFIER__CLASS;

    /**
     * The operation id for the '<em>Make Public</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION___MAKE_PUBLIC = CONCRETE_CLASSIFIER___MAKE_PUBLIC;

    /**
     * The operation id for the '<em>Make Private</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION___MAKE_PRIVATE = CONCRETE_CLASSIFIER___MAKE_PRIVATE;

    /**
     * The operation id for the '<em>Make Protected</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION___MAKE_PROTECTED = CONCRETE_CLASSIFIER___MAKE_PROTECTED;

    /**
     * The operation id for the '<em>Get Modifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION___GET_MODIFIERS = CONCRETE_CLASSIFIER___GET_MODIFIERS;

    /**
     * The operation id for the '<em>Remove All Modifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION___REMOVE_ALL_MODIFIERS = CONCRETE_CLASSIFIER___REMOVE_ALL_MODIFIERS;

    /**
     * The operation id for the '<em>Has Modifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION___HAS_MODIFIER__CLASS = CONCRETE_CLASSIFIER___HAS_MODIFIER__CLASS;

    /**
     * The operation id for the '<em>Is Public</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION___IS_PUBLIC = CONCRETE_CLASSIFIER___IS_PUBLIC;

    /**
     * The operation id for the '<em>Is Private</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION___IS_PRIVATE = CONCRETE_CLASSIFIER___IS_PRIVATE;

    /**
     * The operation id for the '<em>Is Protected</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION___IS_PROTECTED = CONCRETE_CLASSIFIER___IS_PROTECTED;

    /**
     * The operation id for the '<em>Add Modifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION___ADD_MODIFIER__MODIFIER = CONCRETE_CLASSIFIER___ADD_MODIFIER__MODIFIER;

    /**
     * The operation id for the '<em>Get Annotation Instances</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION___GET_ANNOTATION_INSTANCES = CONCRETE_CLASSIFIER___GET_ANNOTATION_INSTANCES;

    /**
     * The operation id for the '<em>Get Inner Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION___GET_INNER_CLASSIFIERS = CONCRETE_CLASSIFIER___GET_INNER_CLASSIFIERS;

    /**
     * The operation id for the '<em>Get All Inner Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION___GET_ALL_INNER_CLASSIFIERS = CONCRETE_CLASSIFIER___GET_ALL_INNER_CLASSIFIERS;

    /**
     * The operation id for the '<em>Get Super Type References</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION___GET_SUPER_TYPE_REFERENCES = CONCRETE_CLASSIFIER___GET_SUPER_TYPE_REFERENCES;

    /**
     * The operation id for the '<em>Get All Members</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION___GET_ALL_MEMBERS__COMMENTABLE = CONCRETE_CLASSIFIER___GET_ALL_MEMBERS__COMMENTABLE;

    /**
     * The operation id for the '<em>Get Qualified Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION___GET_QUALIFIED_NAME = CONCRETE_CLASSIFIER___GET_QUALIFIED_NAME;

    /**
     * The operation id for the '<em>Is Java Lang Object</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION___IS_JAVA_LANG_OBJECT__CONCRETECLASSIFIER = CONCRETE_CLASSIFIER___IS_JAVA_LANG_OBJECT__CONCRETECLASSIFIER;

    /**
     * The operation id for the '<em>Get All Super Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION___GET_ALL_SUPER_CLASSIFIERS = CONCRETE_CLASSIFIER_OPERATION_COUNT + 0;

    /**
     * The number of operations of the '<em>Annotation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION_OPERATION_COUNT = CONCRETE_CLASSIFIER_OPERATION_COUNT + 1;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.AnonymousClassImpl <em>Anonymous Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.AnonymousClassImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.ClassifiersPackageImpl#getAnonymousClass()
     * @generated
     */
    int ANONYMOUS_CLASS = 7;

    /**
     * The feature id for the '<em><b>Members</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANONYMOUS_CLASS__MEMBERS = TypesPackage.TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Default Members</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANONYMOUS_CLASS__DEFAULT_MEMBERS = TypesPackage.TYPE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Anonymous Class</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANONYMOUS_CLASS_FEATURE_COUNT = TypesPackage.TYPE_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANONYMOUS_CLASS___GET_CONCRETE_CLASSIFIER__STRING = TypesPackage.TYPE___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANONYMOUS_CLASS___GET_CONCRETE_CLASSIFIER_PROXY__STRING = TypesPackage.TYPE___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANONYMOUS_CLASS___GET_CONCRETE_CLASSIFIERS__STRING_STRING = TypesPackage.TYPE___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANONYMOUS_CLASS___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = TypesPackage.TYPE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANONYMOUS_CLASS___GET_LIB_CLASS__STRING = TypesPackage.TYPE___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANONYMOUS_CLASS___GET_LIB_INTERFACE__STRING = TypesPackage.TYPE___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANONYMOUS_CLASS___GET_CLASS_CLASS = TypesPackage.TYPE___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANONYMOUS_CLASS___GET_OBJECT_CLASS = TypesPackage.TYPE___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANONYMOUS_CLASS___GET_STRING_CLASS = TypesPackage.TYPE___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANONYMOUS_CLASS___GET_ANNOTATION_INTERFACE = TypesPackage.TYPE___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANONYMOUS_CLASS___GET_CONTAINING_ANNOTATION_INSTANCE = TypesPackage.TYPE___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANONYMOUS_CLASS___GET_CONTAINING_ANONYMOUS_CLASS = TypesPackage.TYPE___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANONYMOUS_CLASS___GET_CONTAINING_CONCRETE_CLASSIFIER = TypesPackage.TYPE___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANONYMOUS_CLASS___GET_CONTAINING_COMPILATION_UNIT = TypesPackage.TYPE___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANONYMOUS_CLASS___GET_CONTAINING_PACKAGE_NAME = TypesPackage.TYPE___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANONYMOUS_CLASS___GET_CONTAINING_CONTAINER_NAME = TypesPackage.TYPE___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANONYMOUS_CLASS___GET_PARENT_CONCRETE_CLASSIFIER = TypesPackage.TYPE___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANONYMOUS_CLASS___GET_PARENT_BY_ETYPE__ECLASS = TypesPackage.TYPE___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANONYMOUS_CLASS___GET_FIRST_CHILD_BY_ETYPE__ECLASS = TypesPackage.TYPE___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANONYMOUS_CLASS___GET_PARENT_BY_TYPE__CLASS = TypesPackage.TYPE___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANONYMOUS_CLASS___GET_FIRST_CHILD_BY_TYPE__CLASS = TypesPackage.TYPE___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANONYMOUS_CLASS___GET_CHILDREN_BY_ETYPE__ECLASS = TypesPackage.TYPE___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANONYMOUS_CLASS___GET_CHILDREN_BY_TYPE__CLASS = TypesPackage.TYPE___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANONYMOUS_CLASS___GET_COMMENTS = TypesPackage.TYPE___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANONYMOUS_CLASS___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = TypesPackage.TYPE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANONYMOUS_CLASS___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = TypesPackage.TYPE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Equals Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANONYMOUS_CLASS___EQUALS_TYPE__LONG_TYPE_LONG = TypesPackage.TYPE___EQUALS_TYPE__LONG_TYPE_LONG;

    /**
     * The operation id for the '<em>Is Super Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANONYMOUS_CLASS___IS_SUPER_TYPE__LONG_TYPE_ARRAYTYPEABLE = TypesPackage.TYPE___IS_SUPER_TYPE__LONG_TYPE_ARRAYTYPEABLE;

    /**
     * The operation id for the '<em>Get Contained Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANONYMOUS_CLASS___GET_CONTAINED_CLASSIFIER__STRING = TypesPackage.TYPE_OPERATION_COUNT + 0;

    /**
     * The operation id for the '<em>Get Contained Field</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANONYMOUS_CLASS___GET_CONTAINED_FIELD__STRING = TypesPackage.TYPE_OPERATION_COUNT + 1;

    /**
     * The operation id for the '<em>Get Contained Method</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANONYMOUS_CLASS___GET_CONTAINED_METHOD__STRING = TypesPackage.TYPE_OPERATION_COUNT + 2;

    /**
     * The operation id for the '<em>Get Methods</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANONYMOUS_CLASS___GET_METHODS = TypesPackage.TYPE_OPERATION_COUNT + 3;

    /**
     * The operation id for the '<em>Remove Methods</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANONYMOUS_CLASS___REMOVE_METHODS__STRING = TypesPackage.TYPE_OPERATION_COUNT + 4;

    /**
     * The operation id for the '<em>Get Members By Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANONYMOUS_CLASS___GET_MEMBERS_BY_NAME__STRING = TypesPackage.TYPE_OPERATION_COUNT + 5;

    /**
     * The operation id for the '<em>Create Field</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANONYMOUS_CLASS___CREATE_FIELD__STRING_STRING = TypesPackage.TYPE_OPERATION_COUNT + 6;

    /**
     * The operation id for the '<em>Get Fields</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANONYMOUS_CLASS___GET_FIELDS = TypesPackage.TYPE_OPERATION_COUNT + 7;

    /**
     * The operation id for the '<em>Get Constructors</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANONYMOUS_CLASS___GET_CONSTRUCTORS = TypesPackage.TYPE_OPERATION_COUNT + 8;

    /**
     * The operation id for the '<em>Get All Super Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANONYMOUS_CLASS___GET_ALL_SUPER_CLASSIFIERS = TypesPackage.TYPE_OPERATION_COUNT + 9;

    /**
     * The operation id for the '<em>Get Super Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANONYMOUS_CLASS___GET_SUPER_CLASSIFIER = TypesPackage.TYPE_OPERATION_COUNT + 10;

    /**
     * The operation id for the '<em>Get All Members</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANONYMOUS_CLASS___GET_ALL_MEMBERS__COMMENTABLE = TypesPackage.TYPE_OPERATION_COUNT + 11;

    /**
     * The number of operations of the '<em>Anonymous Class</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANONYMOUS_CLASS_OPERATION_COUNT = TypesPackage.TYPE_OPERATION_COUNT + 12;

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Classifier <em>Classifier</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Classifier</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Classifier
     * @generated
     */
    EClass getClassifier();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Classifier#getAllSuperClassifiers() <em>Get All Super Classifiers</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get All Super Classifiers</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Classifier#getAllSuperClassifiers()
     * @generated
     */
    EOperation getClassifier__GetAllSuperClassifiers();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Classifier#addImport(java.lang.String) <em>Add Import</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Add Import</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Classifier#addImport(java.lang.String)
     * @generated
     */
    EOperation getClassifier__AddImport__String();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Classifier#addPackageImport(java.lang.String) <em>Add Package Import</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Add Package Import</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Classifier#addPackageImport(java.lang.String)
     * @generated
     */
    EOperation getClassifier__AddPackageImport__String();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.classifiers.ConcreteClassifier <em>Concrete Classifier</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Concrete Classifier</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.ConcreteClassifier
     * @generated
     */
    EClass getConcreteClassifier();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.classifiers.ConcreteClassifier#getInnerClassifiers() <em>Get Inner Classifiers</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Inner Classifiers</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.ConcreteClassifier#getInnerClassifiers()
     * @generated
     */
    EOperation getConcreteClassifier__GetInnerClassifiers();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.classifiers.ConcreteClassifier#getAllInnerClassifiers() <em>Get All Inner Classifiers</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get All Inner Classifiers</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.ConcreteClassifier#getAllInnerClassifiers()
     * @generated
     */
    EOperation getConcreteClassifier__GetAllInnerClassifiers();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.classifiers.ConcreteClassifier#getSuperTypeReferences() <em>Get Super Type References</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Super Type References</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.ConcreteClassifier#getSuperTypeReferences()
     * @generated
     */
    EOperation getConcreteClassifier__GetSuperTypeReferences();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.classifiers.ConcreteClassifier#getAllMembers(org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable) <em>Get All Members</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get All Members</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.ConcreteClassifier#getAllMembers(org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable)
     * @generated
     */
    EOperation getConcreteClassifier__GetAllMembers__Commentable();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.classifiers.ConcreteClassifier#getQualifiedName() <em>Get Qualified Name</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Qualified Name</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.ConcreteClassifier#getQualifiedName()
     * @generated
     */
    EOperation getConcreteClassifier__GetQualifiedName();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.classifiers.ConcreteClassifier#isJavaLangObject(org.palladiosimulator.jdt.metamodel.javamodel.classifiers.ConcreteClassifier) <em>Is Java Lang Object</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Is Java Lang Object</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.ConcreteClassifier#isJavaLangObject(org.palladiosimulator.jdt.metamodel.javamodel.classifiers.ConcreteClassifier)
     * @generated
     */
    EOperation getConcreteClassifier__IsJavaLangObject__ConcreteClassifier();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Implementor <em>Implementor</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Implementor</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Implementor
     * @generated
     */
    EClass getImplementor();

    /**
     * Returns the meta object for the containment reference list '{@link org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Implementor#getImplements <em>Implements</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Implements</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Implementor#getImplements()
     * @see #getImplementor()
     * @generated
     */
    EReference getImplementor_Implements();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Class <em>Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Class</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Class
     * @generated
     */
    EClass getClass_();

    /**
     * Returns the meta object for the containment reference '{@link org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Class#getExtends <em>Extends</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Extends</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Class#getExtends()
     * @see #getClass_()
     * @generated
     */
    EReference getClass_Extends();

    /**
     * Returns the meta object for the containment reference '{@link org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Class#getDefaultExtends <em>Default Extends</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Default Extends</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Class#getDefaultExtends()
     * @see #getClass_()
     * @generated
     */
    EReference getClass_DefaultExtends();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Class#getAllSuperClassifiers() <em>Get All Super Classifiers</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get All Super Classifiers</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Class#getAllSuperClassifiers()
     * @generated
     */
    EOperation getClass__GetAllSuperClassifiers();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Class#getSuperClass() <em>Get Super Class</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Super Class</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Class#getSuperClass()
     * @generated
     */
    EOperation getClass__GetSuperClass();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Class#unWrapPrimitiveType() <em>Un Wrap Primitive Type</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Un Wrap Primitive Type</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Class#unWrapPrimitiveType()
     * @generated
     */
    EOperation getClass__UnWrapPrimitiveType();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Interface <em>Interface</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Interface</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Interface
     * @generated
     */
    EClass getInterface();

    /**
     * Returns the meta object for the containment reference list '{@link org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Interface#getExtends <em>Extends</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Extends</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Interface#getExtends()
     * @see #getInterface()
     * @generated
     */
    EReference getInterface_Extends();

    /**
     * Returns the meta object for the containment reference list '{@link org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Interface#getDefaultExtends <em>Default Extends</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Default Extends</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Interface#getDefaultExtends()
     * @see #getInterface()
     * @generated
     */
    EReference getInterface_DefaultExtends();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Interface#getAllSuperClassifiers() <em>Get All Super Classifiers</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get All Super Classifiers</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Interface#getAllSuperClassifiers()
     * @generated
     */
    EOperation getInterface__GetAllSuperClassifiers();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Enumeration <em>Enumeration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Enumeration</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Enumeration
     * @generated
     */
    EClass getEnumeration();

    /**
     * Returns the meta object for the containment reference list '{@link org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Enumeration#getConstants <em>Constants</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Constants</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Enumeration#getConstants()
     * @see #getEnumeration()
     * @generated
     */
    EReference getEnumeration_Constants();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Enumeration#getAllSuperClassifiers() <em>Get All Super Classifiers</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get All Super Classifiers</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Enumeration#getAllSuperClassifiers()
     * @generated
     */
    EOperation getEnumeration__GetAllSuperClassifiers();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Enumeration#getContainedConstant(java.lang.String) <em>Get Contained Constant</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Contained Constant</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Enumeration#getContainedConstant(java.lang.String)
     * @generated
     */
    EOperation getEnumeration__GetContainedConstant__String();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Annotation <em>Annotation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Annotation</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Annotation
     * @generated
     */
    EClass getAnnotation();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Annotation#getAllSuperClassifiers() <em>Get All Super Classifiers</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get All Super Classifiers</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Annotation#getAllSuperClassifiers()
     * @generated
     */
    EOperation getAnnotation__GetAllSuperClassifiers();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.classifiers.AnonymousClass <em>Anonymous Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Anonymous Class</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.AnonymousClass
     * @generated
     */
    EClass getAnonymousClass();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.classifiers.AnonymousClass#getAllSuperClassifiers() <em>Get All Super Classifiers</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get All Super Classifiers</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.AnonymousClass#getAllSuperClassifiers()
     * @generated
     */
    EOperation getAnonymousClass__GetAllSuperClassifiers();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.classifiers.AnonymousClass#getSuperClassifier() <em>Get Super Classifier</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Super Classifier</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.AnonymousClass#getSuperClassifier()
     * @generated
     */
    EOperation getAnonymousClass__GetSuperClassifier();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.classifiers.AnonymousClass#getAllMembers(org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable) <em>Get All Members</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get All Members</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.AnonymousClass#getAllMembers(org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable)
     * @generated
     */
    EOperation getAnonymousClass__GetAllMembers__Commentable();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    ClassifiersFactory getClassifiersFactory();

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
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.ClassifierImpl <em>Classifier</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.ClassifierImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.ClassifiersPackageImpl#getClassifier()
         * @generated
         */
        EClass CLASSIFIER = eINSTANCE.getClassifier();

        /**
         * The meta object literal for the '<em><b>Get All Super Classifiers</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation CLASSIFIER___GET_ALL_SUPER_CLASSIFIERS = eINSTANCE.getClassifier__GetAllSuperClassifiers();

        /**
         * The meta object literal for the '<em><b>Add Import</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation CLASSIFIER___ADD_IMPORT__STRING = eINSTANCE.getClassifier__AddImport__String();

        /**
         * The meta object literal for the '<em><b>Add Package Import</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation CLASSIFIER___ADD_PACKAGE_IMPORT__STRING = eINSTANCE.getClassifier__AddPackageImport__String();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.ConcreteClassifierImpl <em>Concrete Classifier</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.ConcreteClassifierImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.ClassifiersPackageImpl#getConcreteClassifier()
         * @generated
         */
        EClass CONCRETE_CLASSIFIER = eINSTANCE.getConcreteClassifier();

        /**
         * The meta object literal for the '<em><b>Get Inner Classifiers</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation CONCRETE_CLASSIFIER___GET_INNER_CLASSIFIERS = eINSTANCE.getConcreteClassifier__GetInnerClassifiers();

        /**
         * The meta object literal for the '<em><b>Get All Inner Classifiers</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation CONCRETE_CLASSIFIER___GET_ALL_INNER_CLASSIFIERS = eINSTANCE
                .getConcreteClassifier__GetAllInnerClassifiers();

        /**
         * The meta object literal for the '<em><b>Get Super Type References</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation CONCRETE_CLASSIFIER___GET_SUPER_TYPE_REFERENCES = eINSTANCE
                .getConcreteClassifier__GetSuperTypeReferences();

        /**
         * The meta object literal for the '<em><b>Get All Members</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation CONCRETE_CLASSIFIER___GET_ALL_MEMBERS__COMMENTABLE = eINSTANCE
                .getConcreteClassifier__GetAllMembers__Commentable();

        /**
         * The meta object literal for the '<em><b>Get Qualified Name</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation CONCRETE_CLASSIFIER___GET_QUALIFIED_NAME = eINSTANCE.getConcreteClassifier__GetQualifiedName();

        /**
         * The meta object literal for the '<em><b>Is Java Lang Object</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation CONCRETE_CLASSIFIER___IS_JAVA_LANG_OBJECT__CONCRETECLASSIFIER = eINSTANCE
                .getConcreteClassifier__IsJavaLangObject__ConcreteClassifier();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.ImplementorImpl <em>Implementor</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.ImplementorImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.ClassifiersPackageImpl#getImplementor()
         * @generated
         */
        EClass IMPLEMENTOR = eINSTANCE.getImplementor();

        /**
         * The meta object literal for the '<em><b>Implements</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference IMPLEMENTOR__IMPLEMENTS = eINSTANCE.getImplementor_Implements();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.ClassImpl <em>Class</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.ClassImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.ClassifiersPackageImpl#getClass_()
         * @generated
         */
        EClass CLASS = eINSTANCE.getClass_();

        /**
         * The meta object literal for the '<em><b>Extends</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CLASS__EXTENDS = eINSTANCE.getClass_Extends();

        /**
         * The meta object literal for the '<em><b>Default Extends</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CLASS__DEFAULT_EXTENDS = eINSTANCE.getClass_DefaultExtends();

        /**
         * The meta object literal for the '<em><b>Get All Super Classifiers</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation CLASS___GET_ALL_SUPER_CLASSIFIERS = eINSTANCE.getClass__GetAllSuperClassifiers();

        /**
         * The meta object literal for the '<em><b>Get Super Class</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation CLASS___GET_SUPER_CLASS = eINSTANCE.getClass__GetSuperClass();

        /**
         * The meta object literal for the '<em><b>Un Wrap Primitive Type</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation CLASS___UN_WRAP_PRIMITIVE_TYPE = eINSTANCE.getClass__UnWrapPrimitiveType();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.InterfaceImpl <em>Interface</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.InterfaceImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.ClassifiersPackageImpl#getInterface()
         * @generated
         */
        EClass INTERFACE = eINSTANCE.getInterface();

        /**
         * The meta object literal for the '<em><b>Extends</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INTERFACE__EXTENDS = eINSTANCE.getInterface_Extends();

        /**
         * The meta object literal for the '<em><b>Default Extends</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INTERFACE__DEFAULT_EXTENDS = eINSTANCE.getInterface_DefaultExtends();

        /**
         * The meta object literal for the '<em><b>Get All Super Classifiers</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation INTERFACE___GET_ALL_SUPER_CLASSIFIERS = eINSTANCE.getInterface__GetAllSuperClassifiers();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.EnumerationImpl <em>Enumeration</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.EnumerationImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.ClassifiersPackageImpl#getEnumeration()
         * @generated
         */
        EClass ENUMERATION = eINSTANCE.getEnumeration();

        /**
         * The meta object literal for the '<em><b>Constants</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENUMERATION__CONSTANTS = eINSTANCE.getEnumeration_Constants();

        /**
         * The meta object literal for the '<em><b>Get All Super Classifiers</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation ENUMERATION___GET_ALL_SUPER_CLASSIFIERS = eINSTANCE.getEnumeration__GetAllSuperClassifiers();

        /**
         * The meta object literal for the '<em><b>Get Contained Constant</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation ENUMERATION___GET_CONTAINED_CONSTANT__STRING = eINSTANCE
                .getEnumeration__GetContainedConstant__String();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.AnnotationImpl <em>Annotation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.AnnotationImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.ClassifiersPackageImpl#getAnnotation()
         * @generated
         */
        EClass ANNOTATION = eINSTANCE.getAnnotation();

        /**
         * The meta object literal for the '<em><b>Get All Super Classifiers</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation ANNOTATION___GET_ALL_SUPER_CLASSIFIERS = eINSTANCE.getAnnotation__GetAllSuperClassifiers();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.AnonymousClassImpl <em>Anonymous Class</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.AnonymousClassImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.classifiers.impl.ClassifiersPackageImpl#getAnonymousClass()
         * @generated
         */
        EClass ANONYMOUS_CLASS = eINSTANCE.getAnonymousClass();

        /**
         * The meta object literal for the '<em><b>Get All Super Classifiers</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation ANONYMOUS_CLASS___GET_ALL_SUPER_CLASSIFIERS = eINSTANCE.getAnonymousClass__GetAllSuperClassifiers();

        /**
         * The meta object literal for the '<em><b>Get Super Classifier</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation ANONYMOUS_CLASS___GET_SUPER_CLASSIFIER = eINSTANCE.getAnonymousClass__GetSuperClassifier();

        /**
         * The meta object literal for the '<em><b>Get All Members</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation ANONYMOUS_CLASS___GET_ALL_MEMBERS__COMMENTABLE = eINSTANCE
                .getAnonymousClass__GetAllMembers__Commentable();

    }

} //ClassifiersPackage
