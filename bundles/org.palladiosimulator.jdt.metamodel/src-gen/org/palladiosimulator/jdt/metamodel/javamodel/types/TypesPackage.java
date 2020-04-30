/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.types;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.palladiosimulator.jdt.metamodel.javamodel.types.TypesFactory
 * @model kind="package"
 * @generated
 */
public interface TypesPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "types";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.palladiosimulator.org/javamodel/types";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "types";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    TypesPackage eINSTANCE = org.palladiosimulator.jdt.metamodel.javamodel.types.impl.TypesPackageImpl.init();

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.types.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.types.impl.TypeImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.types.impl.TypesPackageImpl#getType()
     * @generated
     */
    int TYPE = 0;

    /**
     * The number of structural features of the '<em>Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_FEATURE_COUNT = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE___GET_CONCRETE_CLASSIFIER__STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE___GET_CONCRETE_CLASSIFIER_PROXY__STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE___GET_CONCRETE_CLASSIFIERS__STRING_STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE___GET_LIB_CLASS__STRING = CommonsPackage.COMMENTABLE___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE___GET_LIB_INTERFACE__STRING = CommonsPackage.COMMENTABLE___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE___GET_CLASS_CLASS = CommonsPackage.COMMENTABLE___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE___GET_OBJECT_CLASS = CommonsPackage.COMMENTABLE___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE___GET_STRING_CLASS = CommonsPackage.COMMENTABLE___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE___GET_ANNOTATION_INTERFACE = CommonsPackage.COMMENTABLE___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE___GET_CONTAINING_ANNOTATION_INSTANCE = CommonsPackage.COMMENTABLE___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE___GET_CONTAINING_ANONYMOUS_CLASS = CommonsPackage.COMMENTABLE___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE___GET_CONTAINING_CONCRETE_CLASSIFIER = CommonsPackage.COMMENTABLE___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE___GET_CONTAINING_COMPILATION_UNIT = CommonsPackage.COMMENTABLE___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE___GET_CONTAINING_PACKAGE_NAME = CommonsPackage.COMMENTABLE___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE___GET_CONTAINING_CONTAINER_NAME = CommonsPackage.COMMENTABLE___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE___GET_PARENT_CONCRETE_CLASSIFIER = CommonsPackage.COMMENTABLE___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE___GET_PARENT_BY_ETYPE__ECLASS = CommonsPackage.COMMENTABLE___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE___GET_FIRST_CHILD_BY_ETYPE__ECLASS = CommonsPackage.COMMENTABLE___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE___GET_PARENT_BY_TYPE__CLASS = CommonsPackage.COMMENTABLE___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE___GET_FIRST_CHILD_BY_TYPE__CLASS = CommonsPackage.COMMENTABLE___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE___GET_CHILDREN_BY_ETYPE__ECLASS = CommonsPackage.COMMENTABLE___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE___GET_CHILDREN_BY_TYPE__CLASS = CommonsPackage.COMMENTABLE___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE___GET_COMMENTS = CommonsPackage.COMMENTABLE___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = CommonsPackage.COMMENTABLE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = CommonsPackage.COMMENTABLE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Equals Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE___EQUALS_TYPE__LONG_TYPE_LONG = CommonsPackage.COMMENTABLE_OPERATION_COUNT + 0;

    /**
     * The operation id for the '<em>Is Super Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE___IS_SUPER_TYPE__LONG_TYPE_ARRAYTYPEABLE = CommonsPackage.COMMENTABLE_OPERATION_COUNT + 1;

    /**
     * The operation id for the '<em>Get All Members</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE___GET_ALL_MEMBERS__COMMENTABLE = CommonsPackage.COMMENTABLE_OPERATION_COUNT + 2;

    /**
     * The number of operations of the '<em>Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_OPERATION_COUNT = CommonsPackage.COMMENTABLE_OPERATION_COUNT + 3;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.types.impl.TypedElementImpl <em>Typed Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.types.impl.TypedElementImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.types.impl.TypesPackageImpl#getTypedElement()
     * @generated
     */
    int TYPED_ELEMENT = 1;

    /**
     * The feature id for the '<em><b>Type Reference</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPED_ELEMENT__TYPE_REFERENCE = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Typed Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPED_ELEMENT_FEATURE_COUNT = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPED_ELEMENT___GET_CONCRETE_CLASSIFIER__STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPED_ELEMENT___GET_CONCRETE_CLASSIFIER_PROXY__STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPED_ELEMENT___GET_CONCRETE_CLASSIFIERS__STRING_STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPED_ELEMENT___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPED_ELEMENT___GET_LIB_CLASS__STRING = CommonsPackage.COMMENTABLE___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPED_ELEMENT___GET_LIB_INTERFACE__STRING = CommonsPackage.COMMENTABLE___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPED_ELEMENT___GET_CLASS_CLASS = CommonsPackage.COMMENTABLE___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPED_ELEMENT___GET_OBJECT_CLASS = CommonsPackage.COMMENTABLE___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPED_ELEMENT___GET_STRING_CLASS = CommonsPackage.COMMENTABLE___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPED_ELEMENT___GET_ANNOTATION_INTERFACE = CommonsPackage.COMMENTABLE___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPED_ELEMENT___GET_CONTAINING_ANNOTATION_INSTANCE = CommonsPackage.COMMENTABLE___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPED_ELEMENT___GET_CONTAINING_ANONYMOUS_CLASS = CommonsPackage.COMMENTABLE___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPED_ELEMENT___GET_CONTAINING_CONCRETE_CLASSIFIER = CommonsPackage.COMMENTABLE___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPED_ELEMENT___GET_CONTAINING_COMPILATION_UNIT = CommonsPackage.COMMENTABLE___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPED_ELEMENT___GET_CONTAINING_PACKAGE_NAME = CommonsPackage.COMMENTABLE___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPED_ELEMENT___GET_CONTAINING_CONTAINER_NAME = CommonsPackage.COMMENTABLE___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPED_ELEMENT___GET_PARENT_CONCRETE_CLASSIFIER = CommonsPackage.COMMENTABLE___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPED_ELEMENT___GET_PARENT_BY_ETYPE__ECLASS = CommonsPackage.COMMENTABLE___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPED_ELEMENT___GET_FIRST_CHILD_BY_ETYPE__ECLASS = CommonsPackage.COMMENTABLE___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPED_ELEMENT___GET_PARENT_BY_TYPE__CLASS = CommonsPackage.COMMENTABLE___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPED_ELEMENT___GET_FIRST_CHILD_BY_TYPE__CLASS = CommonsPackage.COMMENTABLE___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPED_ELEMENT___GET_CHILDREN_BY_ETYPE__ECLASS = CommonsPackage.COMMENTABLE___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPED_ELEMENT___GET_CHILDREN_BY_TYPE__CLASS = CommonsPackage.COMMENTABLE___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPED_ELEMENT___GET_COMMENTS = CommonsPackage.COMMENTABLE___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPED_ELEMENT___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = CommonsPackage.COMMENTABLE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPED_ELEMENT___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = CommonsPackage.COMMENTABLE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The number of operations of the '<em>Typed Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPED_ELEMENT_OPERATION_COUNT = CommonsPackage.COMMENTABLE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.types.impl.TypeReferenceImpl <em>Type Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.types.impl.TypeReferenceImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.types.impl.TypesPackageImpl#getTypeReference()
     * @generated
     */
    int TYPE_REFERENCE = 2;

    /**
     * The number of structural features of the '<em>Type Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_REFERENCE_FEATURE_COUNT = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_REFERENCE___GET_CONCRETE_CLASSIFIER__STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_REFERENCE___GET_CONCRETE_CLASSIFIER_PROXY__STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_REFERENCE___GET_CONCRETE_CLASSIFIERS__STRING_STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_REFERENCE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_REFERENCE___GET_LIB_CLASS__STRING = CommonsPackage.COMMENTABLE___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_REFERENCE___GET_LIB_INTERFACE__STRING = CommonsPackage.COMMENTABLE___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_REFERENCE___GET_CLASS_CLASS = CommonsPackage.COMMENTABLE___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_REFERENCE___GET_OBJECT_CLASS = CommonsPackage.COMMENTABLE___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_REFERENCE___GET_STRING_CLASS = CommonsPackage.COMMENTABLE___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_REFERENCE___GET_ANNOTATION_INTERFACE = CommonsPackage.COMMENTABLE___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_REFERENCE___GET_CONTAINING_ANNOTATION_INSTANCE = CommonsPackage.COMMENTABLE___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_REFERENCE___GET_CONTAINING_ANONYMOUS_CLASS = CommonsPackage.COMMENTABLE___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_REFERENCE___GET_CONTAINING_CONCRETE_CLASSIFIER = CommonsPackage.COMMENTABLE___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_REFERENCE___GET_CONTAINING_COMPILATION_UNIT = CommonsPackage.COMMENTABLE___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_REFERENCE___GET_CONTAINING_PACKAGE_NAME = CommonsPackage.COMMENTABLE___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_REFERENCE___GET_CONTAINING_CONTAINER_NAME = CommonsPackage.COMMENTABLE___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_REFERENCE___GET_PARENT_CONCRETE_CLASSIFIER = CommonsPackage.COMMENTABLE___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_REFERENCE___GET_PARENT_BY_ETYPE__ECLASS = CommonsPackage.COMMENTABLE___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_REFERENCE___GET_FIRST_CHILD_BY_ETYPE__ECLASS = CommonsPackage.COMMENTABLE___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_REFERENCE___GET_PARENT_BY_TYPE__CLASS = CommonsPackage.COMMENTABLE___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_REFERENCE___GET_FIRST_CHILD_BY_TYPE__CLASS = CommonsPackage.COMMENTABLE___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_REFERENCE___GET_CHILDREN_BY_ETYPE__ECLASS = CommonsPackage.COMMENTABLE___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_REFERENCE___GET_CHILDREN_BY_TYPE__CLASS = CommonsPackage.COMMENTABLE___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_REFERENCE___GET_COMMENTS = CommonsPackage.COMMENTABLE___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_REFERENCE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = CommonsPackage.COMMENTABLE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_REFERENCE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = CommonsPackage.COMMENTABLE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Target</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_REFERENCE___GET_TARGET = CommonsPackage.COMMENTABLE_OPERATION_COUNT + 0;

    /**
     * The operation id for the '<em>Set Target</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_REFERENCE___SET_TARGET__CLASSIFIER = CommonsPackage.COMMENTABLE_OPERATION_COUNT + 1;

    /**
     * The operation id for the '<em>Get Bound Target</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_REFERENCE___GET_BOUND_TARGET__REFERENCE = CommonsPackage.COMMENTABLE_OPERATION_COUNT + 2;

    /**
     * The operation id for the '<em>Get Pure Classifier Reference</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_REFERENCE___GET_PURE_CLASSIFIER_REFERENCE = CommonsPackage.COMMENTABLE_OPERATION_COUNT + 3;

    /**
     * The number of operations of the '<em>Type Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_REFERENCE_OPERATION_COUNT = CommonsPackage.COMMENTABLE_OPERATION_COUNT + 4;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.types.impl.ClassifierReferenceImpl <em>Classifier Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.types.impl.ClassifierReferenceImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.types.impl.TypesPackageImpl#getClassifierReference()
     * @generated
     */
    int CLASSIFIER_REFERENCE = 3;

    /**
     * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_REFERENCE__TYPE_ARGUMENTS = TYPE_REFERENCE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_REFERENCE__TARGET = TYPE_REFERENCE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Classifier Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_REFERENCE_FEATURE_COUNT = TYPE_REFERENCE_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_REFERENCE___GET_CONCRETE_CLASSIFIER__STRING = TYPE_REFERENCE___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_REFERENCE___GET_CONCRETE_CLASSIFIER_PROXY__STRING = TYPE_REFERENCE___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_REFERENCE___GET_CONCRETE_CLASSIFIERS__STRING_STRING = TYPE_REFERENCE___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_REFERENCE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = TYPE_REFERENCE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_REFERENCE___GET_LIB_CLASS__STRING = TYPE_REFERENCE___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_REFERENCE___GET_LIB_INTERFACE__STRING = TYPE_REFERENCE___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_REFERENCE___GET_CLASS_CLASS = TYPE_REFERENCE___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_REFERENCE___GET_OBJECT_CLASS = TYPE_REFERENCE___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_REFERENCE___GET_STRING_CLASS = TYPE_REFERENCE___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_REFERENCE___GET_ANNOTATION_INTERFACE = TYPE_REFERENCE___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_REFERENCE___GET_CONTAINING_ANNOTATION_INSTANCE = TYPE_REFERENCE___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_REFERENCE___GET_CONTAINING_ANONYMOUS_CLASS = TYPE_REFERENCE___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_REFERENCE___GET_CONTAINING_CONCRETE_CLASSIFIER = TYPE_REFERENCE___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_REFERENCE___GET_CONTAINING_COMPILATION_UNIT = TYPE_REFERENCE___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_REFERENCE___GET_CONTAINING_PACKAGE_NAME = TYPE_REFERENCE___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_REFERENCE___GET_CONTAINING_CONTAINER_NAME = TYPE_REFERENCE___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_REFERENCE___GET_PARENT_CONCRETE_CLASSIFIER = TYPE_REFERENCE___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_REFERENCE___GET_PARENT_BY_ETYPE__ECLASS = TYPE_REFERENCE___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_REFERENCE___GET_FIRST_CHILD_BY_ETYPE__ECLASS = TYPE_REFERENCE___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_REFERENCE___GET_PARENT_BY_TYPE__CLASS = TYPE_REFERENCE___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_REFERENCE___GET_FIRST_CHILD_BY_TYPE__CLASS = TYPE_REFERENCE___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_REFERENCE___GET_CHILDREN_BY_ETYPE__ECLASS = TYPE_REFERENCE___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_REFERENCE___GET_CHILDREN_BY_TYPE__CLASS = TYPE_REFERENCE___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_REFERENCE___GET_COMMENTS = TYPE_REFERENCE___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_REFERENCE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = TYPE_REFERENCE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_REFERENCE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = TYPE_REFERENCE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Target</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_REFERENCE___GET_TARGET = TYPE_REFERENCE___GET_TARGET;

    /**
     * The operation id for the '<em>Set Target</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_REFERENCE___SET_TARGET__CLASSIFIER = TYPE_REFERENCE___SET_TARGET__CLASSIFIER;

    /**
     * The operation id for the '<em>Get Bound Target</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_REFERENCE___GET_BOUND_TARGET__REFERENCE = TYPE_REFERENCE___GET_BOUND_TARGET__REFERENCE;

    /**
     * The operation id for the '<em>Get Pure Classifier Reference</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_REFERENCE___GET_PURE_CLASSIFIER_REFERENCE = TYPE_REFERENCE___GET_PURE_CLASSIFIER_REFERENCE;

    /**
     * The number of operations of the '<em>Classifier Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_REFERENCE_OPERATION_COUNT = TYPE_REFERENCE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.types.impl.NamespaceClassifierReferenceImpl <em>Namespace Classifier Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.types.impl.NamespaceClassifierReferenceImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.types.impl.TypesPackageImpl#getNamespaceClassifierReference()
     * @generated
     */
    int NAMESPACE_CLASSIFIER_REFERENCE = 4;

    /**
     * The feature id for the '<em><b>Namespaces</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_CLASSIFIER_REFERENCE__NAMESPACES = TYPE_REFERENCE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Classifier References</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_CLASSIFIER_REFERENCE__CLASSIFIER_REFERENCES = TYPE_REFERENCE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Namespace Classifier Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_CLASSIFIER_REFERENCE_FEATURE_COUNT = TYPE_REFERENCE_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_CLASSIFIER_REFERENCE___GET_CONCRETE_CLASSIFIER__STRING = TYPE_REFERENCE___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_CLASSIFIER_REFERENCE___GET_CONCRETE_CLASSIFIER_PROXY__STRING = TYPE_REFERENCE___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_CLASSIFIER_REFERENCE___GET_CONCRETE_CLASSIFIERS__STRING_STRING = TYPE_REFERENCE___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_CLASSIFIER_REFERENCE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = TYPE_REFERENCE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_CLASSIFIER_REFERENCE___GET_LIB_CLASS__STRING = TYPE_REFERENCE___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_CLASSIFIER_REFERENCE___GET_LIB_INTERFACE__STRING = TYPE_REFERENCE___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_CLASSIFIER_REFERENCE___GET_CLASS_CLASS = TYPE_REFERENCE___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_CLASSIFIER_REFERENCE___GET_OBJECT_CLASS = TYPE_REFERENCE___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_CLASSIFIER_REFERENCE___GET_STRING_CLASS = TYPE_REFERENCE___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_CLASSIFIER_REFERENCE___GET_ANNOTATION_INTERFACE = TYPE_REFERENCE___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_CLASSIFIER_REFERENCE___GET_CONTAINING_ANNOTATION_INSTANCE = TYPE_REFERENCE___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_CLASSIFIER_REFERENCE___GET_CONTAINING_ANONYMOUS_CLASS = TYPE_REFERENCE___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_CLASSIFIER_REFERENCE___GET_CONTAINING_CONCRETE_CLASSIFIER = TYPE_REFERENCE___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_CLASSIFIER_REFERENCE___GET_CONTAINING_COMPILATION_UNIT = TYPE_REFERENCE___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_CLASSIFIER_REFERENCE___GET_CONTAINING_PACKAGE_NAME = TYPE_REFERENCE___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_CLASSIFIER_REFERENCE___GET_CONTAINING_CONTAINER_NAME = TYPE_REFERENCE___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_CLASSIFIER_REFERENCE___GET_PARENT_CONCRETE_CLASSIFIER = TYPE_REFERENCE___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_CLASSIFIER_REFERENCE___GET_PARENT_BY_ETYPE__ECLASS = TYPE_REFERENCE___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_CLASSIFIER_REFERENCE___GET_FIRST_CHILD_BY_ETYPE__ECLASS = TYPE_REFERENCE___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_CLASSIFIER_REFERENCE___GET_PARENT_BY_TYPE__CLASS = TYPE_REFERENCE___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_CLASSIFIER_REFERENCE___GET_FIRST_CHILD_BY_TYPE__CLASS = TYPE_REFERENCE___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_CLASSIFIER_REFERENCE___GET_CHILDREN_BY_ETYPE__ECLASS = TYPE_REFERENCE___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_CLASSIFIER_REFERENCE___GET_CHILDREN_BY_TYPE__CLASS = TYPE_REFERENCE___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_CLASSIFIER_REFERENCE___GET_COMMENTS = TYPE_REFERENCE___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_CLASSIFIER_REFERENCE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = TYPE_REFERENCE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_CLASSIFIER_REFERENCE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = TYPE_REFERENCE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Target</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_CLASSIFIER_REFERENCE___GET_TARGET = TYPE_REFERENCE___GET_TARGET;

    /**
     * The operation id for the '<em>Set Target</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_CLASSIFIER_REFERENCE___SET_TARGET__CLASSIFIER = TYPE_REFERENCE___SET_TARGET__CLASSIFIER;

    /**
     * The operation id for the '<em>Get Bound Target</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_CLASSIFIER_REFERENCE___GET_BOUND_TARGET__REFERENCE = TYPE_REFERENCE___GET_BOUND_TARGET__REFERENCE;

    /**
     * The operation id for the '<em>Get Pure Classifier Reference</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_CLASSIFIER_REFERENCE___GET_PURE_CLASSIFIER_REFERENCE = TYPE_REFERENCE___GET_PURE_CLASSIFIER_REFERENCE;

    /**
     * The operation id for the '<em>Get Namespaces As String</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_CLASSIFIER_REFERENCE___GET_NAMESPACES_AS_STRING = TYPE_REFERENCE_OPERATION_COUNT + 0;

    /**
     * The operation id for the '<em>Get Classifier At Namespaces</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_CLASSIFIER_REFERENCE___GET_CLASSIFIER_AT_NAMESPACES = TYPE_REFERENCE_OPERATION_COUNT + 1;

    /**
     * The number of operations of the '<em>Namespace Classifier Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_CLASSIFIER_REFERENCE_OPERATION_COUNT = TYPE_REFERENCE_OPERATION_COUNT + 2;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.types.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.types.impl.PrimitiveTypeImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.types.impl.TypesPackageImpl#getPrimitiveType()
     * @generated
     */
    int PRIMITIVE_TYPE = 5;

    /**
     * The number of structural features of the '<em>Primitive Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE___GET_CONCRETE_CLASSIFIER__STRING = TYPE___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE___GET_CONCRETE_CLASSIFIER_PROXY__STRING = TYPE___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE___GET_CONCRETE_CLASSIFIERS__STRING_STRING = TYPE___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = TYPE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE___GET_LIB_CLASS__STRING = TYPE___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE___GET_LIB_INTERFACE__STRING = TYPE___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE___GET_CLASS_CLASS = TYPE___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE___GET_OBJECT_CLASS = TYPE___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE___GET_STRING_CLASS = TYPE___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE___GET_ANNOTATION_INTERFACE = TYPE___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE___GET_CONTAINING_ANNOTATION_INSTANCE = TYPE___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE___GET_CONTAINING_ANONYMOUS_CLASS = TYPE___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE___GET_CONTAINING_CONCRETE_CLASSIFIER = TYPE___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE___GET_CONTAINING_COMPILATION_UNIT = TYPE___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE___GET_CONTAINING_PACKAGE_NAME = TYPE___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE___GET_CONTAINING_CONTAINER_NAME = TYPE___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE___GET_PARENT_CONCRETE_CLASSIFIER = TYPE___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE___GET_PARENT_BY_ETYPE__ECLASS = TYPE___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE___GET_FIRST_CHILD_BY_ETYPE__ECLASS = TYPE___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE___GET_PARENT_BY_TYPE__CLASS = TYPE___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE___GET_FIRST_CHILD_BY_TYPE__CLASS = TYPE___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE___GET_CHILDREN_BY_ETYPE__ECLASS = TYPE___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE___GET_CHILDREN_BY_TYPE__CLASS = TYPE___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE___GET_COMMENTS = TYPE___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = TYPE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = TYPE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Equals Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE___EQUALS_TYPE__LONG_TYPE_LONG = TYPE___EQUALS_TYPE__LONG_TYPE_LONG;

    /**
     * The operation id for the '<em>Is Super Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE___IS_SUPER_TYPE__LONG_TYPE_ARRAYTYPEABLE = TYPE___IS_SUPER_TYPE__LONG_TYPE_ARRAYTYPEABLE;

    /**
     * The operation id for the '<em>Get Target</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE___GET_TARGET = TYPE_OPERATION_COUNT + 0;

    /**
     * The operation id for the '<em>Set Target</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE___SET_TARGET__CLASSIFIER = TYPE_OPERATION_COUNT + 1;

    /**
     * The operation id for the '<em>Get Bound Target</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE___GET_BOUND_TARGET__REFERENCE = TYPE_OPERATION_COUNT + 2;

    /**
     * The operation id for the '<em>Get Pure Classifier Reference</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE___GET_PURE_CLASSIFIER_REFERENCE = TYPE_OPERATION_COUNT + 3;

    /**
     * The operation id for the '<em>Get All Members</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE___GET_ALL_MEMBERS__COMMENTABLE = TYPE_OPERATION_COUNT + 4;

    /**
     * The operation id for the '<em>Wrap Primitive Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE___WRAP_PRIMITIVE_TYPE = TYPE_OPERATION_COUNT + 5;

    /**
     * The number of operations of the '<em>Primitive Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 6;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.types.impl.BooleanImpl <em>Boolean</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.types.impl.BooleanImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.types.impl.TypesPackageImpl#getBoolean()
     * @generated
     */
    int BOOLEAN = 6;

    /**
     * The number of structural features of the '<em>Boolean</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN___GET_CONCRETE_CLASSIFIER__STRING = PRIMITIVE_TYPE___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN___GET_CONCRETE_CLASSIFIER_PROXY__STRING = PRIMITIVE_TYPE___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN___GET_CONCRETE_CLASSIFIERS__STRING_STRING = PRIMITIVE_TYPE___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = PRIMITIVE_TYPE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN___GET_LIB_CLASS__STRING = PRIMITIVE_TYPE___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN___GET_LIB_INTERFACE__STRING = PRIMITIVE_TYPE___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN___GET_CLASS_CLASS = PRIMITIVE_TYPE___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN___GET_OBJECT_CLASS = PRIMITIVE_TYPE___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN___GET_STRING_CLASS = PRIMITIVE_TYPE___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN___GET_ANNOTATION_INTERFACE = PRIMITIVE_TYPE___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN___GET_CONTAINING_ANNOTATION_INSTANCE = PRIMITIVE_TYPE___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN___GET_CONTAINING_ANONYMOUS_CLASS = PRIMITIVE_TYPE___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN___GET_CONTAINING_CONCRETE_CLASSIFIER = PRIMITIVE_TYPE___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN___GET_CONTAINING_COMPILATION_UNIT = PRIMITIVE_TYPE___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN___GET_CONTAINING_PACKAGE_NAME = PRIMITIVE_TYPE___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN___GET_CONTAINING_CONTAINER_NAME = PRIMITIVE_TYPE___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN___GET_PARENT_CONCRETE_CLASSIFIER = PRIMITIVE_TYPE___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN___GET_PARENT_BY_ETYPE__ECLASS = PRIMITIVE_TYPE___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN___GET_FIRST_CHILD_BY_ETYPE__ECLASS = PRIMITIVE_TYPE___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN___GET_PARENT_BY_TYPE__CLASS = PRIMITIVE_TYPE___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN___GET_FIRST_CHILD_BY_TYPE__CLASS = PRIMITIVE_TYPE___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN___GET_CHILDREN_BY_ETYPE__ECLASS = PRIMITIVE_TYPE___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN___GET_CHILDREN_BY_TYPE__CLASS = PRIMITIVE_TYPE___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN___GET_COMMENTS = PRIMITIVE_TYPE___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = PRIMITIVE_TYPE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = PRIMITIVE_TYPE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Equals Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN___EQUALS_TYPE__LONG_TYPE_LONG = PRIMITIVE_TYPE___EQUALS_TYPE__LONG_TYPE_LONG;

    /**
     * The operation id for the '<em>Is Super Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN___IS_SUPER_TYPE__LONG_TYPE_ARRAYTYPEABLE = PRIMITIVE_TYPE___IS_SUPER_TYPE__LONG_TYPE_ARRAYTYPEABLE;

    /**
     * The operation id for the '<em>Get Target</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN___GET_TARGET = PRIMITIVE_TYPE___GET_TARGET;

    /**
     * The operation id for the '<em>Set Target</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN___SET_TARGET__CLASSIFIER = PRIMITIVE_TYPE___SET_TARGET__CLASSIFIER;

    /**
     * The operation id for the '<em>Get Bound Target</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN___GET_BOUND_TARGET__REFERENCE = PRIMITIVE_TYPE___GET_BOUND_TARGET__REFERENCE;

    /**
     * The operation id for the '<em>Get Pure Classifier Reference</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN___GET_PURE_CLASSIFIER_REFERENCE = PRIMITIVE_TYPE___GET_PURE_CLASSIFIER_REFERENCE;

    /**
     * The operation id for the '<em>Get All Members</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN___GET_ALL_MEMBERS__COMMENTABLE = PRIMITIVE_TYPE___GET_ALL_MEMBERS__COMMENTABLE;

    /**
     * The operation id for the '<em>Wrap Primitive Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN___WRAP_PRIMITIVE_TYPE = PRIMITIVE_TYPE___WRAP_PRIMITIVE_TYPE;

    /**
     * The number of operations of the '<em>Boolean</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.types.impl.ByteImpl <em>Byte</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.types.impl.ByteImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.types.impl.TypesPackageImpl#getByte()
     * @generated
     */
    int BYTE = 7;

    /**
     * The number of structural features of the '<em>Byte</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BYTE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BYTE___GET_CONCRETE_CLASSIFIER__STRING = PRIMITIVE_TYPE___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BYTE___GET_CONCRETE_CLASSIFIER_PROXY__STRING = PRIMITIVE_TYPE___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BYTE___GET_CONCRETE_CLASSIFIERS__STRING_STRING = PRIMITIVE_TYPE___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BYTE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = PRIMITIVE_TYPE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BYTE___GET_LIB_CLASS__STRING = PRIMITIVE_TYPE___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BYTE___GET_LIB_INTERFACE__STRING = PRIMITIVE_TYPE___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BYTE___GET_CLASS_CLASS = PRIMITIVE_TYPE___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BYTE___GET_OBJECT_CLASS = PRIMITIVE_TYPE___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BYTE___GET_STRING_CLASS = PRIMITIVE_TYPE___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BYTE___GET_ANNOTATION_INTERFACE = PRIMITIVE_TYPE___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BYTE___GET_CONTAINING_ANNOTATION_INSTANCE = PRIMITIVE_TYPE___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BYTE___GET_CONTAINING_ANONYMOUS_CLASS = PRIMITIVE_TYPE___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BYTE___GET_CONTAINING_CONCRETE_CLASSIFIER = PRIMITIVE_TYPE___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BYTE___GET_CONTAINING_COMPILATION_UNIT = PRIMITIVE_TYPE___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BYTE___GET_CONTAINING_PACKAGE_NAME = PRIMITIVE_TYPE___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BYTE___GET_CONTAINING_CONTAINER_NAME = PRIMITIVE_TYPE___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BYTE___GET_PARENT_CONCRETE_CLASSIFIER = PRIMITIVE_TYPE___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BYTE___GET_PARENT_BY_ETYPE__ECLASS = PRIMITIVE_TYPE___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BYTE___GET_FIRST_CHILD_BY_ETYPE__ECLASS = PRIMITIVE_TYPE___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BYTE___GET_PARENT_BY_TYPE__CLASS = PRIMITIVE_TYPE___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BYTE___GET_FIRST_CHILD_BY_TYPE__CLASS = PRIMITIVE_TYPE___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BYTE___GET_CHILDREN_BY_ETYPE__ECLASS = PRIMITIVE_TYPE___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BYTE___GET_CHILDREN_BY_TYPE__CLASS = PRIMITIVE_TYPE___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BYTE___GET_COMMENTS = PRIMITIVE_TYPE___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BYTE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = PRIMITIVE_TYPE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BYTE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = PRIMITIVE_TYPE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Equals Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BYTE___EQUALS_TYPE__LONG_TYPE_LONG = PRIMITIVE_TYPE___EQUALS_TYPE__LONG_TYPE_LONG;

    /**
     * The operation id for the '<em>Is Super Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BYTE___IS_SUPER_TYPE__LONG_TYPE_ARRAYTYPEABLE = PRIMITIVE_TYPE___IS_SUPER_TYPE__LONG_TYPE_ARRAYTYPEABLE;

    /**
     * The operation id for the '<em>Get Target</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BYTE___GET_TARGET = PRIMITIVE_TYPE___GET_TARGET;

    /**
     * The operation id for the '<em>Set Target</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BYTE___SET_TARGET__CLASSIFIER = PRIMITIVE_TYPE___SET_TARGET__CLASSIFIER;

    /**
     * The operation id for the '<em>Get Bound Target</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BYTE___GET_BOUND_TARGET__REFERENCE = PRIMITIVE_TYPE___GET_BOUND_TARGET__REFERENCE;

    /**
     * The operation id for the '<em>Get Pure Classifier Reference</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BYTE___GET_PURE_CLASSIFIER_REFERENCE = PRIMITIVE_TYPE___GET_PURE_CLASSIFIER_REFERENCE;

    /**
     * The operation id for the '<em>Get All Members</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BYTE___GET_ALL_MEMBERS__COMMENTABLE = PRIMITIVE_TYPE___GET_ALL_MEMBERS__COMMENTABLE;

    /**
     * The operation id for the '<em>Wrap Primitive Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BYTE___WRAP_PRIMITIVE_TYPE = PRIMITIVE_TYPE___WRAP_PRIMITIVE_TYPE;

    /**
     * The number of operations of the '<em>Byte</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BYTE_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.types.impl.CharImpl <em>Char</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.types.impl.CharImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.types.impl.TypesPackageImpl#getChar()
     * @generated
     */
    int CHAR = 8;

    /**
     * The number of structural features of the '<em>Char</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHAR_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHAR___GET_CONCRETE_CLASSIFIER__STRING = PRIMITIVE_TYPE___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHAR___GET_CONCRETE_CLASSIFIER_PROXY__STRING = PRIMITIVE_TYPE___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHAR___GET_CONCRETE_CLASSIFIERS__STRING_STRING = PRIMITIVE_TYPE___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHAR___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = PRIMITIVE_TYPE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHAR___GET_LIB_CLASS__STRING = PRIMITIVE_TYPE___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHAR___GET_LIB_INTERFACE__STRING = PRIMITIVE_TYPE___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHAR___GET_CLASS_CLASS = PRIMITIVE_TYPE___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHAR___GET_OBJECT_CLASS = PRIMITIVE_TYPE___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHAR___GET_STRING_CLASS = PRIMITIVE_TYPE___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHAR___GET_ANNOTATION_INTERFACE = PRIMITIVE_TYPE___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHAR___GET_CONTAINING_ANNOTATION_INSTANCE = PRIMITIVE_TYPE___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHAR___GET_CONTAINING_ANONYMOUS_CLASS = PRIMITIVE_TYPE___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHAR___GET_CONTAINING_CONCRETE_CLASSIFIER = PRIMITIVE_TYPE___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHAR___GET_CONTAINING_COMPILATION_UNIT = PRIMITIVE_TYPE___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHAR___GET_CONTAINING_PACKAGE_NAME = PRIMITIVE_TYPE___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHAR___GET_CONTAINING_CONTAINER_NAME = PRIMITIVE_TYPE___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHAR___GET_PARENT_CONCRETE_CLASSIFIER = PRIMITIVE_TYPE___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHAR___GET_PARENT_BY_ETYPE__ECLASS = PRIMITIVE_TYPE___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHAR___GET_FIRST_CHILD_BY_ETYPE__ECLASS = PRIMITIVE_TYPE___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHAR___GET_PARENT_BY_TYPE__CLASS = PRIMITIVE_TYPE___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHAR___GET_FIRST_CHILD_BY_TYPE__CLASS = PRIMITIVE_TYPE___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHAR___GET_CHILDREN_BY_ETYPE__ECLASS = PRIMITIVE_TYPE___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHAR___GET_CHILDREN_BY_TYPE__CLASS = PRIMITIVE_TYPE___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHAR___GET_COMMENTS = PRIMITIVE_TYPE___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHAR___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = PRIMITIVE_TYPE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHAR___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = PRIMITIVE_TYPE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Equals Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHAR___EQUALS_TYPE__LONG_TYPE_LONG = PRIMITIVE_TYPE___EQUALS_TYPE__LONG_TYPE_LONG;

    /**
     * The operation id for the '<em>Is Super Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHAR___IS_SUPER_TYPE__LONG_TYPE_ARRAYTYPEABLE = PRIMITIVE_TYPE___IS_SUPER_TYPE__LONG_TYPE_ARRAYTYPEABLE;

    /**
     * The operation id for the '<em>Get Target</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHAR___GET_TARGET = PRIMITIVE_TYPE___GET_TARGET;

    /**
     * The operation id for the '<em>Set Target</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHAR___SET_TARGET__CLASSIFIER = PRIMITIVE_TYPE___SET_TARGET__CLASSIFIER;

    /**
     * The operation id for the '<em>Get Bound Target</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHAR___GET_BOUND_TARGET__REFERENCE = PRIMITIVE_TYPE___GET_BOUND_TARGET__REFERENCE;

    /**
     * The operation id for the '<em>Get Pure Classifier Reference</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHAR___GET_PURE_CLASSIFIER_REFERENCE = PRIMITIVE_TYPE___GET_PURE_CLASSIFIER_REFERENCE;

    /**
     * The operation id for the '<em>Get All Members</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHAR___GET_ALL_MEMBERS__COMMENTABLE = PRIMITIVE_TYPE___GET_ALL_MEMBERS__COMMENTABLE;

    /**
     * The operation id for the '<em>Wrap Primitive Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHAR___WRAP_PRIMITIVE_TYPE = PRIMITIVE_TYPE___WRAP_PRIMITIVE_TYPE;

    /**
     * The number of operations of the '<em>Char</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHAR_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.types.impl.DoubleImpl <em>Double</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.types.impl.DoubleImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.types.impl.TypesPackageImpl#getDouble()
     * @generated
     */
    int DOUBLE = 9;

    /**
     * The number of structural features of the '<em>Double</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE___GET_CONCRETE_CLASSIFIER__STRING = PRIMITIVE_TYPE___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE___GET_CONCRETE_CLASSIFIER_PROXY__STRING = PRIMITIVE_TYPE___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE___GET_CONCRETE_CLASSIFIERS__STRING_STRING = PRIMITIVE_TYPE___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = PRIMITIVE_TYPE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE___GET_LIB_CLASS__STRING = PRIMITIVE_TYPE___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE___GET_LIB_INTERFACE__STRING = PRIMITIVE_TYPE___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE___GET_CLASS_CLASS = PRIMITIVE_TYPE___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE___GET_OBJECT_CLASS = PRIMITIVE_TYPE___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE___GET_STRING_CLASS = PRIMITIVE_TYPE___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE___GET_ANNOTATION_INTERFACE = PRIMITIVE_TYPE___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE___GET_CONTAINING_ANNOTATION_INSTANCE = PRIMITIVE_TYPE___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE___GET_CONTAINING_ANONYMOUS_CLASS = PRIMITIVE_TYPE___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE___GET_CONTAINING_CONCRETE_CLASSIFIER = PRIMITIVE_TYPE___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE___GET_CONTAINING_COMPILATION_UNIT = PRIMITIVE_TYPE___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE___GET_CONTAINING_PACKAGE_NAME = PRIMITIVE_TYPE___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE___GET_CONTAINING_CONTAINER_NAME = PRIMITIVE_TYPE___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE___GET_PARENT_CONCRETE_CLASSIFIER = PRIMITIVE_TYPE___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE___GET_PARENT_BY_ETYPE__ECLASS = PRIMITIVE_TYPE___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE___GET_FIRST_CHILD_BY_ETYPE__ECLASS = PRIMITIVE_TYPE___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE___GET_PARENT_BY_TYPE__CLASS = PRIMITIVE_TYPE___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE___GET_FIRST_CHILD_BY_TYPE__CLASS = PRIMITIVE_TYPE___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE___GET_CHILDREN_BY_ETYPE__ECLASS = PRIMITIVE_TYPE___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE___GET_CHILDREN_BY_TYPE__CLASS = PRIMITIVE_TYPE___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE___GET_COMMENTS = PRIMITIVE_TYPE___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = PRIMITIVE_TYPE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = PRIMITIVE_TYPE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Equals Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE___EQUALS_TYPE__LONG_TYPE_LONG = PRIMITIVE_TYPE___EQUALS_TYPE__LONG_TYPE_LONG;

    /**
     * The operation id for the '<em>Is Super Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE___IS_SUPER_TYPE__LONG_TYPE_ARRAYTYPEABLE = PRIMITIVE_TYPE___IS_SUPER_TYPE__LONG_TYPE_ARRAYTYPEABLE;

    /**
     * The operation id for the '<em>Get Target</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE___GET_TARGET = PRIMITIVE_TYPE___GET_TARGET;

    /**
     * The operation id for the '<em>Set Target</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE___SET_TARGET__CLASSIFIER = PRIMITIVE_TYPE___SET_TARGET__CLASSIFIER;

    /**
     * The operation id for the '<em>Get Bound Target</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE___GET_BOUND_TARGET__REFERENCE = PRIMITIVE_TYPE___GET_BOUND_TARGET__REFERENCE;

    /**
     * The operation id for the '<em>Get Pure Classifier Reference</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE___GET_PURE_CLASSIFIER_REFERENCE = PRIMITIVE_TYPE___GET_PURE_CLASSIFIER_REFERENCE;

    /**
     * The operation id for the '<em>Get All Members</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE___GET_ALL_MEMBERS__COMMENTABLE = PRIMITIVE_TYPE___GET_ALL_MEMBERS__COMMENTABLE;

    /**
     * The operation id for the '<em>Wrap Primitive Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE___WRAP_PRIMITIVE_TYPE = PRIMITIVE_TYPE___WRAP_PRIMITIVE_TYPE;

    /**
     * The number of operations of the '<em>Double</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOUBLE_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.types.impl.FloatImpl <em>Float</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.types.impl.FloatImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.types.impl.TypesPackageImpl#getFloat()
     * @generated
     */
    int FLOAT = 10;

    /**
     * The number of structural features of the '<em>Float</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT___GET_CONCRETE_CLASSIFIER__STRING = PRIMITIVE_TYPE___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT___GET_CONCRETE_CLASSIFIER_PROXY__STRING = PRIMITIVE_TYPE___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT___GET_CONCRETE_CLASSIFIERS__STRING_STRING = PRIMITIVE_TYPE___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = PRIMITIVE_TYPE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT___GET_LIB_CLASS__STRING = PRIMITIVE_TYPE___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT___GET_LIB_INTERFACE__STRING = PRIMITIVE_TYPE___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT___GET_CLASS_CLASS = PRIMITIVE_TYPE___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT___GET_OBJECT_CLASS = PRIMITIVE_TYPE___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT___GET_STRING_CLASS = PRIMITIVE_TYPE___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT___GET_ANNOTATION_INTERFACE = PRIMITIVE_TYPE___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT___GET_CONTAINING_ANNOTATION_INSTANCE = PRIMITIVE_TYPE___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT___GET_CONTAINING_ANONYMOUS_CLASS = PRIMITIVE_TYPE___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT___GET_CONTAINING_CONCRETE_CLASSIFIER = PRIMITIVE_TYPE___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT___GET_CONTAINING_COMPILATION_UNIT = PRIMITIVE_TYPE___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT___GET_CONTAINING_PACKAGE_NAME = PRIMITIVE_TYPE___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT___GET_CONTAINING_CONTAINER_NAME = PRIMITIVE_TYPE___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT___GET_PARENT_CONCRETE_CLASSIFIER = PRIMITIVE_TYPE___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT___GET_PARENT_BY_ETYPE__ECLASS = PRIMITIVE_TYPE___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT___GET_FIRST_CHILD_BY_ETYPE__ECLASS = PRIMITIVE_TYPE___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT___GET_PARENT_BY_TYPE__CLASS = PRIMITIVE_TYPE___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT___GET_FIRST_CHILD_BY_TYPE__CLASS = PRIMITIVE_TYPE___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT___GET_CHILDREN_BY_ETYPE__ECLASS = PRIMITIVE_TYPE___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT___GET_CHILDREN_BY_TYPE__CLASS = PRIMITIVE_TYPE___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT___GET_COMMENTS = PRIMITIVE_TYPE___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = PRIMITIVE_TYPE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = PRIMITIVE_TYPE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Equals Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT___EQUALS_TYPE__LONG_TYPE_LONG = PRIMITIVE_TYPE___EQUALS_TYPE__LONG_TYPE_LONG;

    /**
     * The operation id for the '<em>Is Super Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT___IS_SUPER_TYPE__LONG_TYPE_ARRAYTYPEABLE = PRIMITIVE_TYPE___IS_SUPER_TYPE__LONG_TYPE_ARRAYTYPEABLE;

    /**
     * The operation id for the '<em>Get Target</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT___GET_TARGET = PRIMITIVE_TYPE___GET_TARGET;

    /**
     * The operation id for the '<em>Set Target</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT___SET_TARGET__CLASSIFIER = PRIMITIVE_TYPE___SET_TARGET__CLASSIFIER;

    /**
     * The operation id for the '<em>Get Bound Target</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT___GET_BOUND_TARGET__REFERENCE = PRIMITIVE_TYPE___GET_BOUND_TARGET__REFERENCE;

    /**
     * The operation id for the '<em>Get Pure Classifier Reference</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT___GET_PURE_CLASSIFIER_REFERENCE = PRIMITIVE_TYPE___GET_PURE_CLASSIFIER_REFERENCE;

    /**
     * The operation id for the '<em>Get All Members</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT___GET_ALL_MEMBERS__COMMENTABLE = PRIMITIVE_TYPE___GET_ALL_MEMBERS__COMMENTABLE;

    /**
     * The operation id for the '<em>Wrap Primitive Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT___WRAP_PRIMITIVE_TYPE = PRIMITIVE_TYPE___WRAP_PRIMITIVE_TYPE;

    /**
     * The number of operations of the '<em>Float</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.types.impl.IntImpl <em>Int</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.types.impl.IntImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.types.impl.TypesPackageImpl#getInt()
     * @generated
     */
    int INT = 11;

    /**
     * The number of structural features of the '<em>Int</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INT_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INT___GET_CONCRETE_CLASSIFIER__STRING = PRIMITIVE_TYPE___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INT___GET_CONCRETE_CLASSIFIER_PROXY__STRING = PRIMITIVE_TYPE___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INT___GET_CONCRETE_CLASSIFIERS__STRING_STRING = PRIMITIVE_TYPE___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INT___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = PRIMITIVE_TYPE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INT___GET_LIB_CLASS__STRING = PRIMITIVE_TYPE___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INT___GET_LIB_INTERFACE__STRING = PRIMITIVE_TYPE___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INT___GET_CLASS_CLASS = PRIMITIVE_TYPE___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INT___GET_OBJECT_CLASS = PRIMITIVE_TYPE___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INT___GET_STRING_CLASS = PRIMITIVE_TYPE___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INT___GET_ANNOTATION_INTERFACE = PRIMITIVE_TYPE___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INT___GET_CONTAINING_ANNOTATION_INSTANCE = PRIMITIVE_TYPE___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INT___GET_CONTAINING_ANONYMOUS_CLASS = PRIMITIVE_TYPE___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INT___GET_CONTAINING_CONCRETE_CLASSIFIER = PRIMITIVE_TYPE___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INT___GET_CONTAINING_COMPILATION_UNIT = PRIMITIVE_TYPE___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INT___GET_CONTAINING_PACKAGE_NAME = PRIMITIVE_TYPE___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INT___GET_CONTAINING_CONTAINER_NAME = PRIMITIVE_TYPE___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INT___GET_PARENT_CONCRETE_CLASSIFIER = PRIMITIVE_TYPE___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INT___GET_PARENT_BY_ETYPE__ECLASS = PRIMITIVE_TYPE___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INT___GET_FIRST_CHILD_BY_ETYPE__ECLASS = PRIMITIVE_TYPE___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INT___GET_PARENT_BY_TYPE__CLASS = PRIMITIVE_TYPE___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INT___GET_FIRST_CHILD_BY_TYPE__CLASS = PRIMITIVE_TYPE___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INT___GET_CHILDREN_BY_ETYPE__ECLASS = PRIMITIVE_TYPE___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INT___GET_CHILDREN_BY_TYPE__CLASS = PRIMITIVE_TYPE___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INT___GET_COMMENTS = PRIMITIVE_TYPE___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INT___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = PRIMITIVE_TYPE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INT___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = PRIMITIVE_TYPE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Equals Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INT___EQUALS_TYPE__LONG_TYPE_LONG = PRIMITIVE_TYPE___EQUALS_TYPE__LONG_TYPE_LONG;

    /**
     * The operation id for the '<em>Is Super Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INT___IS_SUPER_TYPE__LONG_TYPE_ARRAYTYPEABLE = PRIMITIVE_TYPE___IS_SUPER_TYPE__LONG_TYPE_ARRAYTYPEABLE;

    /**
     * The operation id for the '<em>Get Target</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INT___GET_TARGET = PRIMITIVE_TYPE___GET_TARGET;

    /**
     * The operation id for the '<em>Set Target</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INT___SET_TARGET__CLASSIFIER = PRIMITIVE_TYPE___SET_TARGET__CLASSIFIER;

    /**
     * The operation id for the '<em>Get Bound Target</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INT___GET_BOUND_TARGET__REFERENCE = PRIMITIVE_TYPE___GET_BOUND_TARGET__REFERENCE;

    /**
     * The operation id for the '<em>Get Pure Classifier Reference</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INT___GET_PURE_CLASSIFIER_REFERENCE = PRIMITIVE_TYPE___GET_PURE_CLASSIFIER_REFERENCE;

    /**
     * The operation id for the '<em>Get All Members</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INT___GET_ALL_MEMBERS__COMMENTABLE = PRIMITIVE_TYPE___GET_ALL_MEMBERS__COMMENTABLE;

    /**
     * The operation id for the '<em>Wrap Primitive Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INT___WRAP_PRIMITIVE_TYPE = PRIMITIVE_TYPE___WRAP_PRIMITIVE_TYPE;

    /**
     * The number of operations of the '<em>Int</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INT_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.types.impl.LongImpl <em>Long</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.types.impl.LongImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.types.impl.TypesPackageImpl#getLong()
     * @generated
     */
    int LONG = 12;

    /**
     * The number of structural features of the '<em>Long</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG___GET_CONCRETE_CLASSIFIER__STRING = PRIMITIVE_TYPE___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG___GET_CONCRETE_CLASSIFIER_PROXY__STRING = PRIMITIVE_TYPE___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG___GET_CONCRETE_CLASSIFIERS__STRING_STRING = PRIMITIVE_TYPE___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = PRIMITIVE_TYPE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG___GET_LIB_CLASS__STRING = PRIMITIVE_TYPE___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG___GET_LIB_INTERFACE__STRING = PRIMITIVE_TYPE___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG___GET_CLASS_CLASS = PRIMITIVE_TYPE___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG___GET_OBJECT_CLASS = PRIMITIVE_TYPE___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG___GET_STRING_CLASS = PRIMITIVE_TYPE___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG___GET_ANNOTATION_INTERFACE = PRIMITIVE_TYPE___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG___GET_CONTAINING_ANNOTATION_INSTANCE = PRIMITIVE_TYPE___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG___GET_CONTAINING_ANONYMOUS_CLASS = PRIMITIVE_TYPE___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG___GET_CONTAINING_CONCRETE_CLASSIFIER = PRIMITIVE_TYPE___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG___GET_CONTAINING_COMPILATION_UNIT = PRIMITIVE_TYPE___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG___GET_CONTAINING_PACKAGE_NAME = PRIMITIVE_TYPE___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG___GET_CONTAINING_CONTAINER_NAME = PRIMITIVE_TYPE___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG___GET_PARENT_CONCRETE_CLASSIFIER = PRIMITIVE_TYPE___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG___GET_PARENT_BY_ETYPE__ECLASS = PRIMITIVE_TYPE___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG___GET_FIRST_CHILD_BY_ETYPE__ECLASS = PRIMITIVE_TYPE___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG___GET_PARENT_BY_TYPE__CLASS = PRIMITIVE_TYPE___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG___GET_FIRST_CHILD_BY_TYPE__CLASS = PRIMITIVE_TYPE___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG___GET_CHILDREN_BY_ETYPE__ECLASS = PRIMITIVE_TYPE___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG___GET_CHILDREN_BY_TYPE__CLASS = PRIMITIVE_TYPE___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG___GET_COMMENTS = PRIMITIVE_TYPE___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = PRIMITIVE_TYPE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = PRIMITIVE_TYPE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Equals Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG___EQUALS_TYPE__LONG_TYPE_LONG = PRIMITIVE_TYPE___EQUALS_TYPE__LONG_TYPE_LONG;

    /**
     * The operation id for the '<em>Is Super Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG___IS_SUPER_TYPE__LONG_TYPE_ARRAYTYPEABLE = PRIMITIVE_TYPE___IS_SUPER_TYPE__LONG_TYPE_ARRAYTYPEABLE;

    /**
     * The operation id for the '<em>Get Target</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG___GET_TARGET = PRIMITIVE_TYPE___GET_TARGET;

    /**
     * The operation id for the '<em>Set Target</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG___SET_TARGET__CLASSIFIER = PRIMITIVE_TYPE___SET_TARGET__CLASSIFIER;

    /**
     * The operation id for the '<em>Get Bound Target</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG___GET_BOUND_TARGET__REFERENCE = PRIMITIVE_TYPE___GET_BOUND_TARGET__REFERENCE;

    /**
     * The operation id for the '<em>Get Pure Classifier Reference</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG___GET_PURE_CLASSIFIER_REFERENCE = PRIMITIVE_TYPE___GET_PURE_CLASSIFIER_REFERENCE;

    /**
     * The operation id for the '<em>Get All Members</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG___GET_ALL_MEMBERS__COMMENTABLE = PRIMITIVE_TYPE___GET_ALL_MEMBERS__COMMENTABLE;

    /**
     * The operation id for the '<em>Wrap Primitive Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG___WRAP_PRIMITIVE_TYPE = PRIMITIVE_TYPE___WRAP_PRIMITIVE_TYPE;

    /**
     * The number of operations of the '<em>Long</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LONG_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.types.impl.ShortImpl <em>Short</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.types.impl.ShortImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.types.impl.TypesPackageImpl#getShort()
     * @generated
     */
    int SHORT = 13;

    /**
     * The number of structural features of the '<em>Short</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHORT_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHORT___GET_CONCRETE_CLASSIFIER__STRING = PRIMITIVE_TYPE___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHORT___GET_CONCRETE_CLASSIFIER_PROXY__STRING = PRIMITIVE_TYPE___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHORT___GET_CONCRETE_CLASSIFIERS__STRING_STRING = PRIMITIVE_TYPE___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHORT___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = PRIMITIVE_TYPE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHORT___GET_LIB_CLASS__STRING = PRIMITIVE_TYPE___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHORT___GET_LIB_INTERFACE__STRING = PRIMITIVE_TYPE___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHORT___GET_CLASS_CLASS = PRIMITIVE_TYPE___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHORT___GET_OBJECT_CLASS = PRIMITIVE_TYPE___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHORT___GET_STRING_CLASS = PRIMITIVE_TYPE___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHORT___GET_ANNOTATION_INTERFACE = PRIMITIVE_TYPE___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHORT___GET_CONTAINING_ANNOTATION_INSTANCE = PRIMITIVE_TYPE___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHORT___GET_CONTAINING_ANONYMOUS_CLASS = PRIMITIVE_TYPE___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHORT___GET_CONTAINING_CONCRETE_CLASSIFIER = PRIMITIVE_TYPE___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHORT___GET_CONTAINING_COMPILATION_UNIT = PRIMITIVE_TYPE___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHORT___GET_CONTAINING_PACKAGE_NAME = PRIMITIVE_TYPE___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHORT___GET_CONTAINING_CONTAINER_NAME = PRIMITIVE_TYPE___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHORT___GET_PARENT_CONCRETE_CLASSIFIER = PRIMITIVE_TYPE___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHORT___GET_PARENT_BY_ETYPE__ECLASS = PRIMITIVE_TYPE___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHORT___GET_FIRST_CHILD_BY_ETYPE__ECLASS = PRIMITIVE_TYPE___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHORT___GET_PARENT_BY_TYPE__CLASS = PRIMITIVE_TYPE___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHORT___GET_FIRST_CHILD_BY_TYPE__CLASS = PRIMITIVE_TYPE___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHORT___GET_CHILDREN_BY_ETYPE__ECLASS = PRIMITIVE_TYPE___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHORT___GET_CHILDREN_BY_TYPE__CLASS = PRIMITIVE_TYPE___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHORT___GET_COMMENTS = PRIMITIVE_TYPE___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHORT___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = PRIMITIVE_TYPE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHORT___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = PRIMITIVE_TYPE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Equals Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHORT___EQUALS_TYPE__LONG_TYPE_LONG = PRIMITIVE_TYPE___EQUALS_TYPE__LONG_TYPE_LONG;

    /**
     * The operation id for the '<em>Is Super Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHORT___IS_SUPER_TYPE__LONG_TYPE_ARRAYTYPEABLE = PRIMITIVE_TYPE___IS_SUPER_TYPE__LONG_TYPE_ARRAYTYPEABLE;

    /**
     * The operation id for the '<em>Get Target</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHORT___GET_TARGET = PRIMITIVE_TYPE___GET_TARGET;

    /**
     * The operation id for the '<em>Set Target</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHORT___SET_TARGET__CLASSIFIER = PRIMITIVE_TYPE___SET_TARGET__CLASSIFIER;

    /**
     * The operation id for the '<em>Get Bound Target</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHORT___GET_BOUND_TARGET__REFERENCE = PRIMITIVE_TYPE___GET_BOUND_TARGET__REFERENCE;

    /**
     * The operation id for the '<em>Get Pure Classifier Reference</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHORT___GET_PURE_CLASSIFIER_REFERENCE = PRIMITIVE_TYPE___GET_PURE_CLASSIFIER_REFERENCE;

    /**
     * The operation id for the '<em>Get All Members</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHORT___GET_ALL_MEMBERS__COMMENTABLE = PRIMITIVE_TYPE___GET_ALL_MEMBERS__COMMENTABLE;

    /**
     * The operation id for the '<em>Wrap Primitive Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHORT___WRAP_PRIMITIVE_TYPE = PRIMITIVE_TYPE___WRAP_PRIMITIVE_TYPE;

    /**
     * The number of operations of the '<em>Short</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHORT_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.types.impl.VoidImpl <em>Void</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.types.impl.VoidImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.types.impl.TypesPackageImpl#getVoid()
     * @generated
     */
    int VOID = 14;

    /**
     * The number of structural features of the '<em>Void</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOID_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOID___GET_CONCRETE_CLASSIFIER__STRING = PRIMITIVE_TYPE___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOID___GET_CONCRETE_CLASSIFIER_PROXY__STRING = PRIMITIVE_TYPE___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOID___GET_CONCRETE_CLASSIFIERS__STRING_STRING = PRIMITIVE_TYPE___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOID___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = PRIMITIVE_TYPE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOID___GET_LIB_CLASS__STRING = PRIMITIVE_TYPE___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOID___GET_LIB_INTERFACE__STRING = PRIMITIVE_TYPE___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOID___GET_CLASS_CLASS = PRIMITIVE_TYPE___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOID___GET_OBJECT_CLASS = PRIMITIVE_TYPE___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOID___GET_STRING_CLASS = PRIMITIVE_TYPE___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOID___GET_ANNOTATION_INTERFACE = PRIMITIVE_TYPE___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOID___GET_CONTAINING_ANNOTATION_INSTANCE = PRIMITIVE_TYPE___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOID___GET_CONTAINING_ANONYMOUS_CLASS = PRIMITIVE_TYPE___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOID___GET_CONTAINING_CONCRETE_CLASSIFIER = PRIMITIVE_TYPE___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOID___GET_CONTAINING_COMPILATION_UNIT = PRIMITIVE_TYPE___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOID___GET_CONTAINING_PACKAGE_NAME = PRIMITIVE_TYPE___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOID___GET_CONTAINING_CONTAINER_NAME = PRIMITIVE_TYPE___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOID___GET_PARENT_CONCRETE_CLASSIFIER = PRIMITIVE_TYPE___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOID___GET_PARENT_BY_ETYPE__ECLASS = PRIMITIVE_TYPE___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOID___GET_FIRST_CHILD_BY_ETYPE__ECLASS = PRIMITIVE_TYPE___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOID___GET_PARENT_BY_TYPE__CLASS = PRIMITIVE_TYPE___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOID___GET_FIRST_CHILD_BY_TYPE__CLASS = PRIMITIVE_TYPE___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOID___GET_CHILDREN_BY_ETYPE__ECLASS = PRIMITIVE_TYPE___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOID___GET_CHILDREN_BY_TYPE__CLASS = PRIMITIVE_TYPE___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOID___GET_COMMENTS = PRIMITIVE_TYPE___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOID___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = PRIMITIVE_TYPE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOID___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = PRIMITIVE_TYPE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Equals Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOID___EQUALS_TYPE__LONG_TYPE_LONG = PRIMITIVE_TYPE___EQUALS_TYPE__LONG_TYPE_LONG;

    /**
     * The operation id for the '<em>Is Super Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOID___IS_SUPER_TYPE__LONG_TYPE_ARRAYTYPEABLE = PRIMITIVE_TYPE___IS_SUPER_TYPE__LONG_TYPE_ARRAYTYPEABLE;

    /**
     * The operation id for the '<em>Get Target</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOID___GET_TARGET = PRIMITIVE_TYPE___GET_TARGET;

    /**
     * The operation id for the '<em>Set Target</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOID___SET_TARGET__CLASSIFIER = PRIMITIVE_TYPE___SET_TARGET__CLASSIFIER;

    /**
     * The operation id for the '<em>Get Bound Target</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOID___GET_BOUND_TARGET__REFERENCE = PRIMITIVE_TYPE___GET_BOUND_TARGET__REFERENCE;

    /**
     * The operation id for the '<em>Get Pure Classifier Reference</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOID___GET_PURE_CLASSIFIER_REFERENCE = PRIMITIVE_TYPE___GET_PURE_CLASSIFIER_REFERENCE;

    /**
     * The operation id for the '<em>Get All Members</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOID___GET_ALL_MEMBERS__COMMENTABLE = PRIMITIVE_TYPE___GET_ALL_MEMBERS__COMMENTABLE;

    /**
     * The operation id for the '<em>Wrap Primitive Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOID___WRAP_PRIMITIVE_TYPE = PRIMITIVE_TYPE___WRAP_PRIMITIVE_TYPE;

    /**
     * The number of operations of the '<em>Void</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOID_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.types.Type <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Type</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.types.Type
     * @generated
     */
    EClass getType();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.types.Type#equalsType(long, org.palladiosimulator.jdt.metamodel.javamodel.types.Type, long) <em>Equals Type</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Equals Type</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.types.Type#equalsType(long, org.palladiosimulator.jdt.metamodel.javamodel.types.Type, long)
     * @generated
     */
    EOperation getType__EqualsType__long_Type_long();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.types.Type#isSuperType(long, org.palladiosimulator.jdt.metamodel.javamodel.types.Type, org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayTypeable) <em>Is Super Type</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Is Super Type</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.types.Type#isSuperType(long, org.palladiosimulator.jdt.metamodel.javamodel.types.Type, org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayTypeable)
     * @generated
     */
    EOperation getType__IsSuperType__long_Type_ArrayTypeable();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.types.Type#getAllMembers(org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable) <em>Get All Members</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get All Members</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.types.Type#getAllMembers(org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable)
     * @generated
     */
    EOperation getType__GetAllMembers__Commentable();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.types.TypedElement <em>Typed Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Typed Element</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.types.TypedElement
     * @generated
     */
    EClass getTypedElement();

    /**
     * Returns the meta object for the containment reference '{@link org.palladiosimulator.jdt.metamodel.javamodel.types.TypedElement#getTypeReference <em>Type Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Type Reference</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.types.TypedElement#getTypeReference()
     * @see #getTypedElement()
     * @generated
     */
    EReference getTypedElement_TypeReference();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.types.TypeReference <em>Type Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Type Reference</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.types.TypeReference
     * @generated
     */
    EClass getTypeReference();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.types.TypeReference#getTarget() <em>Get Target</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Target</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.types.TypeReference#getTarget()
     * @generated
     */
    EOperation getTypeReference__GetTarget();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.types.TypeReference#setTarget(org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Classifier) <em>Set Target</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Set Target</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.types.TypeReference#setTarget(org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Classifier)
     * @generated
     */
    EOperation getTypeReference__SetTarget__Classifier();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.types.TypeReference#getBoundTarget(org.palladiosimulator.jdt.metamodel.javamodel.references.Reference) <em>Get Bound Target</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Bound Target</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.types.TypeReference#getBoundTarget(org.palladiosimulator.jdt.metamodel.javamodel.references.Reference)
     * @generated
     */
    EOperation getTypeReference__GetBoundTarget__Reference();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.types.TypeReference#getPureClassifierReference() <em>Get Pure Classifier Reference</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Pure Classifier Reference</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.types.TypeReference#getPureClassifierReference()
     * @generated
     */
    EOperation getTypeReference__GetPureClassifierReference();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.types.ClassifierReference <em>Classifier Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Classifier Reference</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.types.ClassifierReference
     * @generated
     */
    EClass getClassifierReference();

    /**
     * Returns the meta object for the reference '{@link org.palladiosimulator.jdt.metamodel.javamodel.types.ClassifierReference#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Target</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.types.ClassifierReference#getTarget()
     * @see #getClassifierReference()
     * @generated
     */
    EReference getClassifierReference_Target();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.types.NamespaceClassifierReference <em>Namespace Classifier Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Namespace Classifier Reference</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.types.NamespaceClassifierReference
     * @generated
     */
    EClass getNamespaceClassifierReference();

    /**
     * Returns the meta object for the containment reference list '{@link org.palladiosimulator.jdt.metamodel.javamodel.types.NamespaceClassifierReference#getClassifierReferences <em>Classifier References</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Classifier References</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.types.NamespaceClassifierReference#getClassifierReferences()
     * @see #getNamespaceClassifierReference()
     * @generated
     */
    EReference getNamespaceClassifierReference_ClassifierReferences();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.types.PrimitiveType <em>Primitive Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Primitive Type</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.types.PrimitiveType
     * @generated
     */
    EClass getPrimitiveType();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.types.PrimitiveType#getAllMembers(org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable) <em>Get All Members</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get All Members</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.types.PrimitiveType#getAllMembers(org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable)
     * @generated
     */
    EOperation getPrimitiveType__GetAllMembers__Commentable();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.types.PrimitiveType#wrapPrimitiveType() <em>Wrap Primitive Type</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Wrap Primitive Type</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.types.PrimitiveType#wrapPrimitiveType()
     * @generated
     */
    EOperation getPrimitiveType__WrapPrimitiveType();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.types.Boolean <em>Boolean</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Boolean</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.types.Boolean
     * @generated
     */
    EClass getBoolean();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.types.Byte <em>Byte</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Byte</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.types.Byte
     * @generated
     */
    EClass getByte();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.types.Char <em>Char</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Char</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.types.Char
     * @generated
     */
    EClass getChar();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.types.Double <em>Double</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Double</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.types.Double
     * @generated
     */
    EClass getDouble();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.types.Float <em>Float</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Float</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.types.Float
     * @generated
     */
    EClass getFloat();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.types.Int <em>Int</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Int</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.types.Int
     * @generated
     */
    EClass getInt();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.types.Long <em>Long</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Long</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.types.Long
     * @generated
     */
    EClass getLong();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.types.Short <em>Short</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Short</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.types.Short
     * @generated
     */
    EClass getShort();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.types.Void <em>Void</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Void</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.types.Void
     * @generated
     */
    EClass getVoid();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    TypesFactory getTypesFactory();

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
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.types.impl.TypeImpl <em>Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.types.impl.TypeImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.types.impl.TypesPackageImpl#getType()
         * @generated
         */
        EClass TYPE = eINSTANCE.getType();

        /**
         * The meta object literal for the '<em><b>Equals Type</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation TYPE___EQUALS_TYPE__LONG_TYPE_LONG = eINSTANCE.getType__EqualsType__long_Type_long();

        /**
         * The meta object literal for the '<em><b>Is Super Type</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation TYPE___IS_SUPER_TYPE__LONG_TYPE_ARRAYTYPEABLE = eINSTANCE
                .getType__IsSuperType__long_Type_ArrayTypeable();

        /**
         * The meta object literal for the '<em><b>Get All Members</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation TYPE___GET_ALL_MEMBERS__COMMENTABLE = eINSTANCE.getType__GetAllMembers__Commentable();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.types.impl.TypedElementImpl <em>Typed Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.types.impl.TypedElementImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.types.impl.TypesPackageImpl#getTypedElement()
         * @generated
         */
        EClass TYPED_ELEMENT = eINSTANCE.getTypedElement();

        /**
         * The meta object literal for the '<em><b>Type Reference</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TYPED_ELEMENT__TYPE_REFERENCE = eINSTANCE.getTypedElement_TypeReference();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.types.impl.TypeReferenceImpl <em>Type Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.types.impl.TypeReferenceImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.types.impl.TypesPackageImpl#getTypeReference()
         * @generated
         */
        EClass TYPE_REFERENCE = eINSTANCE.getTypeReference();

        /**
         * The meta object literal for the '<em><b>Get Target</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation TYPE_REFERENCE___GET_TARGET = eINSTANCE.getTypeReference__GetTarget();

        /**
         * The meta object literal for the '<em><b>Set Target</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation TYPE_REFERENCE___SET_TARGET__CLASSIFIER = eINSTANCE.getTypeReference__SetTarget__Classifier();

        /**
         * The meta object literal for the '<em><b>Get Bound Target</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation TYPE_REFERENCE___GET_BOUND_TARGET__REFERENCE = eINSTANCE
                .getTypeReference__GetBoundTarget__Reference();

        /**
         * The meta object literal for the '<em><b>Get Pure Classifier Reference</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation TYPE_REFERENCE___GET_PURE_CLASSIFIER_REFERENCE = eINSTANCE
                .getTypeReference__GetPureClassifierReference();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.types.impl.ClassifierReferenceImpl <em>Classifier Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.types.impl.ClassifierReferenceImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.types.impl.TypesPackageImpl#getClassifierReference()
         * @generated
         */
        EClass CLASSIFIER_REFERENCE = eINSTANCE.getClassifierReference();

        /**
         * The meta object literal for the '<em><b>Target</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CLASSIFIER_REFERENCE__TARGET = eINSTANCE.getClassifierReference_Target();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.types.impl.NamespaceClassifierReferenceImpl <em>Namespace Classifier Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.types.impl.NamespaceClassifierReferenceImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.types.impl.TypesPackageImpl#getNamespaceClassifierReference()
         * @generated
         */
        EClass NAMESPACE_CLASSIFIER_REFERENCE = eINSTANCE.getNamespaceClassifierReference();

        /**
         * The meta object literal for the '<em><b>Classifier References</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NAMESPACE_CLASSIFIER_REFERENCE__CLASSIFIER_REFERENCES = eINSTANCE
                .getNamespaceClassifierReference_ClassifierReferences();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.types.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.types.impl.PrimitiveTypeImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.types.impl.TypesPackageImpl#getPrimitiveType()
         * @generated
         */
        EClass PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

        /**
         * The meta object literal for the '<em><b>Get All Members</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation PRIMITIVE_TYPE___GET_ALL_MEMBERS__COMMENTABLE = eINSTANCE
                .getPrimitiveType__GetAllMembers__Commentable();

        /**
         * The meta object literal for the '<em><b>Wrap Primitive Type</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation PRIMITIVE_TYPE___WRAP_PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType__WrapPrimitiveType();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.types.impl.BooleanImpl <em>Boolean</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.types.impl.BooleanImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.types.impl.TypesPackageImpl#getBoolean()
         * @generated
         */
        EClass BOOLEAN = eINSTANCE.getBoolean();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.types.impl.ByteImpl <em>Byte</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.types.impl.ByteImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.types.impl.TypesPackageImpl#getByte()
         * @generated
         */
        EClass BYTE = eINSTANCE.getByte();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.types.impl.CharImpl <em>Char</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.types.impl.CharImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.types.impl.TypesPackageImpl#getChar()
         * @generated
         */
        EClass CHAR = eINSTANCE.getChar();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.types.impl.DoubleImpl <em>Double</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.types.impl.DoubleImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.types.impl.TypesPackageImpl#getDouble()
         * @generated
         */
        EClass DOUBLE = eINSTANCE.getDouble();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.types.impl.FloatImpl <em>Float</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.types.impl.FloatImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.types.impl.TypesPackageImpl#getFloat()
         * @generated
         */
        EClass FLOAT = eINSTANCE.getFloat();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.types.impl.IntImpl <em>Int</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.types.impl.IntImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.types.impl.TypesPackageImpl#getInt()
         * @generated
         */
        EClass INT = eINSTANCE.getInt();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.types.impl.LongImpl <em>Long</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.types.impl.LongImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.types.impl.TypesPackageImpl#getLong()
         * @generated
         */
        EClass LONG = eINSTANCE.getLong();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.types.impl.ShortImpl <em>Short</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.types.impl.ShortImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.types.impl.TypesPackageImpl#getShort()
         * @generated
         */
        EClass SHORT = eINSTANCE.getShort();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.types.impl.VoidImpl <em>Void</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.types.impl.VoidImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.types.impl.TypesPackageImpl#getVoid()
         * @generated
         */
        EClass VOID = eINSTANCE.getVoid();

    }

} //TypesPackage
