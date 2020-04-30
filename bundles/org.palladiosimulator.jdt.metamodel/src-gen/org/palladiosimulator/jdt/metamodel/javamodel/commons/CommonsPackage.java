/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.commons;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.palladiosimulator.jdt.metamodel.javamodel.commons.CommonsFactory
 * @model kind="package"
 * @generated
 */
public interface CommonsPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "commons";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.palladiosimulator.org/javamodel/commons";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "commons";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    CommonsPackage eINSTANCE = org.palladiosimulator.jdt.metamodel.javamodel.commons.impl.CommonsPackageImpl.init();

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.commons.impl.CommentableImpl <em>Commentable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.commons.impl.CommentableImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.commons.impl.CommonsPackageImpl#getCommentable()
     * @generated
     */
    int COMMENTABLE = 0;

    /**
     * The number of structural features of the '<em>Commentable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENTABLE_FEATURE_COUNT = 0;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENTABLE___GET_CONCRETE_CLASSIFIER__STRING = 0;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENTABLE___GET_CONCRETE_CLASSIFIER_PROXY__STRING = 1;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENTABLE___GET_CONCRETE_CLASSIFIERS__STRING_STRING = 2;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENTABLE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = 3;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENTABLE___GET_LIB_CLASS__STRING = 4;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENTABLE___GET_LIB_INTERFACE__STRING = 5;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENTABLE___GET_CLASS_CLASS = 6;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENTABLE___GET_OBJECT_CLASS = 7;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENTABLE___GET_STRING_CLASS = 8;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENTABLE___GET_ANNOTATION_INTERFACE = 9;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENTABLE___GET_CONTAINING_ANNOTATION_INSTANCE = 10;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENTABLE___GET_CONTAINING_ANONYMOUS_CLASS = 11;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENTABLE___GET_CONTAINING_CONCRETE_CLASSIFIER = 12;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENTABLE___GET_CONTAINING_COMPILATION_UNIT = 13;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENTABLE___GET_CONTAINING_PACKAGE_NAME = 14;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENTABLE___GET_CONTAINING_CONTAINER_NAME = 15;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENTABLE___GET_PARENT_CONCRETE_CLASSIFIER = 16;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENTABLE___GET_PARENT_BY_ETYPE__ECLASS = 17;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENTABLE___GET_FIRST_CHILD_BY_ETYPE__ECLASS = 18;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENTABLE___GET_PARENT_BY_TYPE__CLASS = 19;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENTABLE___GET_FIRST_CHILD_BY_TYPE__CLASS = 20;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENTABLE___GET_CHILDREN_BY_ETYPE__ECLASS = 21;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENTABLE___GET_CHILDREN_BY_TYPE__CLASS = 22;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENTABLE___GET_COMMENTS = 23;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENTABLE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = 24;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENTABLE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = 25;

    /**
     * The number of operations of the '<em>Commentable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENTABLE_OPERATION_COUNT = 26;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.commons.impl.NamedElementImpl <em>Named Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.commons.impl.NamedElementImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.commons.impl.CommonsPackageImpl#getNamedElement()
     * @generated
     */
    int NAMED_ELEMENT = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_ELEMENT__NAME = COMMENTABLE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Named Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_ELEMENT_FEATURE_COUNT = COMMENTABLE_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_ELEMENT___GET_CONCRETE_CLASSIFIER__STRING = COMMENTABLE___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_ELEMENT___GET_CONCRETE_CLASSIFIER_PROXY__STRING = COMMENTABLE___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_ELEMENT___GET_CONCRETE_CLASSIFIERS__STRING_STRING = COMMENTABLE___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_ELEMENT___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = COMMENTABLE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_ELEMENT___GET_LIB_CLASS__STRING = COMMENTABLE___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_ELEMENT___GET_LIB_INTERFACE__STRING = COMMENTABLE___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_ELEMENT___GET_CLASS_CLASS = COMMENTABLE___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_ELEMENT___GET_OBJECT_CLASS = COMMENTABLE___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_ELEMENT___GET_STRING_CLASS = COMMENTABLE___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_ELEMENT___GET_ANNOTATION_INTERFACE = COMMENTABLE___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_ELEMENT___GET_CONTAINING_ANNOTATION_INSTANCE = COMMENTABLE___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_ELEMENT___GET_CONTAINING_ANONYMOUS_CLASS = COMMENTABLE___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_ELEMENT___GET_CONTAINING_CONCRETE_CLASSIFIER = COMMENTABLE___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_ELEMENT___GET_CONTAINING_COMPILATION_UNIT = COMMENTABLE___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_ELEMENT___GET_CONTAINING_PACKAGE_NAME = COMMENTABLE___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_ELEMENT___GET_CONTAINING_CONTAINER_NAME = COMMENTABLE___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_ELEMENT___GET_PARENT_CONCRETE_CLASSIFIER = COMMENTABLE___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_ELEMENT___GET_PARENT_BY_ETYPE__ECLASS = COMMENTABLE___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_ELEMENT___GET_FIRST_CHILD_BY_ETYPE__ECLASS = COMMENTABLE___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_ELEMENT___GET_PARENT_BY_TYPE__CLASS = COMMENTABLE___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_ELEMENT___GET_FIRST_CHILD_BY_TYPE__CLASS = COMMENTABLE___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_ELEMENT___GET_CHILDREN_BY_ETYPE__ECLASS = COMMENTABLE___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_ELEMENT___GET_CHILDREN_BY_TYPE__CLASS = COMMENTABLE___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_ELEMENT___GET_COMMENTS = COMMENTABLE___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_ELEMENT___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = COMMENTABLE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_ELEMENT___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = COMMENTABLE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The number of operations of the '<em>Named Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_ELEMENT_OPERATION_COUNT = COMMENTABLE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.commons.impl.NamespaceAwareElementImpl <em>Namespace Aware Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.commons.impl.NamespaceAwareElementImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.commons.impl.CommonsPackageImpl#getNamespaceAwareElement()
     * @generated
     */
    int NAMESPACE_AWARE_ELEMENT = 2;

    /**
     * The feature id for the '<em><b>Namespaces</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_AWARE_ELEMENT__NAMESPACES = COMMENTABLE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Namespace Aware Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_AWARE_ELEMENT_FEATURE_COUNT = COMMENTABLE_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_AWARE_ELEMENT___GET_CONCRETE_CLASSIFIER__STRING = COMMENTABLE___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_AWARE_ELEMENT___GET_CONCRETE_CLASSIFIER_PROXY__STRING = COMMENTABLE___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_AWARE_ELEMENT___GET_CONCRETE_CLASSIFIERS__STRING_STRING = COMMENTABLE___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_AWARE_ELEMENT___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = COMMENTABLE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_AWARE_ELEMENT___GET_LIB_CLASS__STRING = COMMENTABLE___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_AWARE_ELEMENT___GET_LIB_INTERFACE__STRING = COMMENTABLE___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_AWARE_ELEMENT___GET_CLASS_CLASS = COMMENTABLE___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_AWARE_ELEMENT___GET_OBJECT_CLASS = COMMENTABLE___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_AWARE_ELEMENT___GET_STRING_CLASS = COMMENTABLE___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_AWARE_ELEMENT___GET_ANNOTATION_INTERFACE = COMMENTABLE___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_AWARE_ELEMENT___GET_CONTAINING_ANNOTATION_INSTANCE = COMMENTABLE___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_AWARE_ELEMENT___GET_CONTAINING_ANONYMOUS_CLASS = COMMENTABLE___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_AWARE_ELEMENT___GET_CONTAINING_CONCRETE_CLASSIFIER = COMMENTABLE___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_AWARE_ELEMENT___GET_CONTAINING_COMPILATION_UNIT = COMMENTABLE___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_AWARE_ELEMENT___GET_CONTAINING_PACKAGE_NAME = COMMENTABLE___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_AWARE_ELEMENT___GET_CONTAINING_CONTAINER_NAME = COMMENTABLE___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_AWARE_ELEMENT___GET_PARENT_CONCRETE_CLASSIFIER = COMMENTABLE___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_AWARE_ELEMENT___GET_PARENT_BY_ETYPE__ECLASS = COMMENTABLE___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_AWARE_ELEMENT___GET_FIRST_CHILD_BY_ETYPE__ECLASS = COMMENTABLE___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_AWARE_ELEMENT___GET_PARENT_BY_TYPE__CLASS = COMMENTABLE___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_AWARE_ELEMENT___GET_FIRST_CHILD_BY_TYPE__CLASS = COMMENTABLE___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_AWARE_ELEMENT___GET_CHILDREN_BY_ETYPE__ECLASS = COMMENTABLE___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_AWARE_ELEMENT___GET_CHILDREN_BY_TYPE__CLASS = COMMENTABLE___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_AWARE_ELEMENT___GET_COMMENTS = COMMENTABLE___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_AWARE_ELEMENT___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = COMMENTABLE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_AWARE_ELEMENT___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = COMMENTABLE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Namespaces As String</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_AWARE_ELEMENT___GET_NAMESPACES_AS_STRING = COMMENTABLE_OPERATION_COUNT + 0;

    /**
     * The operation id for the '<em>Get Classifier At Namespaces</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_AWARE_ELEMENT___GET_CLASSIFIER_AT_NAMESPACES = COMMENTABLE_OPERATION_COUNT + 1;

    /**
     * The number of operations of the '<em>Namespace Aware Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_AWARE_ELEMENT_OPERATION_COUNT = COMMENTABLE_OPERATION_COUNT + 2;

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable <em>Commentable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Commentable</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable
     * @generated
     */
    EClass getCommentable();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable#getConcreteClassifier(java.lang.String) <em>Get Concrete Classifier</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Concrete Classifier</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable#getConcreteClassifier(java.lang.String)
     * @generated
     */
    EOperation getCommentable__GetConcreteClassifier__String();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable#getConcreteClassifierProxy(java.lang.String) <em>Get Concrete Classifier Proxy</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable#getConcreteClassifierProxy(java.lang.String)
     * @generated
     */
    EOperation getCommentable__GetConcreteClassifierProxy__String();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable#getConcreteClassifiers(java.lang.String, java.lang.String) <em>Get Concrete Classifiers</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Concrete Classifiers</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable#getConcreteClassifiers(java.lang.String, java.lang.String)
     * @generated
     */
    EOperation getCommentable__GetConcreteClassifiers__String_String();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable#getConcreteClassifierProxies(java.lang.String, java.lang.String) <em>Get Concrete Classifier Proxies</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable#getConcreteClassifierProxies(java.lang.String, java.lang.String)
     * @generated
     */
    EOperation getCommentable__GetConcreteClassifierProxies__String_String();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable#getLibClass(java.lang.String) <em>Get Lib Class</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Lib Class</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable#getLibClass(java.lang.String)
     * @generated
     */
    EOperation getCommentable__GetLibClass__String();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable#getLibInterface(java.lang.String) <em>Get Lib Interface</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Lib Interface</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable#getLibInterface(java.lang.String)
     * @generated
     */
    EOperation getCommentable__GetLibInterface__String();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable#getClassClass() <em>Get Class Class</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Class Class</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable#getClassClass()
     * @generated
     */
    EOperation getCommentable__GetClassClass();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable#getObjectClass() <em>Get Object Class</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Object Class</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable#getObjectClass()
     * @generated
     */
    EOperation getCommentable__GetObjectClass();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable#getStringClass() <em>Get String Class</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get String Class</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable#getStringClass()
     * @generated
     */
    EOperation getCommentable__GetStringClass();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable#getAnnotationInterface() <em>Get Annotation Interface</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Annotation Interface</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable#getAnnotationInterface()
     * @generated
     */
    EOperation getCommentable__GetAnnotationInterface();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable#getContainingAnnotationInstance() <em>Get Containing Annotation Instance</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Containing Annotation Instance</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable#getContainingAnnotationInstance()
     * @generated
     */
    EOperation getCommentable__GetContainingAnnotationInstance();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable#getContainingAnonymousClass() <em>Get Containing Anonymous Class</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Containing Anonymous Class</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable#getContainingAnonymousClass()
     * @generated
     */
    EOperation getCommentable__GetContainingAnonymousClass();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable#getContainingConcreteClassifier() <em>Get Containing Concrete Classifier</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Containing Concrete Classifier</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable#getContainingConcreteClassifier()
     * @generated
     */
    EOperation getCommentable__GetContainingConcreteClassifier();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable#getContainingCompilationUnit() <em>Get Containing Compilation Unit</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Containing Compilation Unit</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable#getContainingCompilationUnit()
     * @generated
     */
    EOperation getCommentable__GetContainingCompilationUnit();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable#getContainingPackageName() <em>Get Containing Package Name</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Containing Package Name</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable#getContainingPackageName()
     * @generated
     */
    EOperation getCommentable__GetContainingPackageName();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable#getContainingContainerName() <em>Get Containing Container Name</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Containing Container Name</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable#getContainingContainerName()
     * @generated
     */
    EOperation getCommentable__GetContainingContainerName();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable#getParentConcreteClassifier() <em>Get Parent Concrete Classifier</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Parent Concrete Classifier</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable#getParentConcreteClassifier()
     * @generated
     */
    EOperation getCommentable__GetParentConcreteClassifier();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable#getParentByEType(org.eclipse.emf.ecore.EClass) <em>Get Parent By EType</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Parent By EType</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable#getParentByEType(org.eclipse.emf.ecore.EClass)
     * @generated
     */
    EOperation getCommentable__GetParentByEType__EClass();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable#getFirstChildByEType(org.eclipse.emf.ecore.EClass) <em>Get First Child By EType</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get First Child By EType</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable#getFirstChildByEType(org.eclipse.emf.ecore.EClass)
     * @generated
     */
    EOperation getCommentable__GetFirstChildByEType__EClass();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable#getParentByType(java.lang.Class) <em>Get Parent By Type</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Parent By Type</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable#getParentByType(java.lang.Class)
     * @generated
     */
    EOperation getCommentable__GetParentByType__Class();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable#getFirstChildByType(java.lang.Class) <em>Get First Child By Type</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get First Child By Type</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable#getFirstChildByType(java.lang.Class)
     * @generated
     */
    EOperation getCommentable__GetFirstChildByType__Class();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable#getChildrenByEType(org.eclipse.emf.ecore.EClass) <em>Get Children By EType</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Children By EType</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable#getChildrenByEType(org.eclipse.emf.ecore.EClass)
     * @generated
     */
    EOperation getCommentable__GetChildrenByEType__EClass();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable#getChildrenByType(java.lang.Class) <em>Get Children By Type</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Children By Type</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable#getChildrenByType(java.lang.Class)
     * @generated
     */
    EOperation getCommentable__GetChildrenByType__Class();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable#getComments() <em>Get Comments</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Comments</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable#getComments()
     * @generated
     */
    EOperation getCommentable__GetComments();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable#addBeforeContainingStatement(org.palladiosimulator.jdt.metamodel.javamodel.statements.Statement) <em>Add Before Containing Statement</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Add Before Containing Statement</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable#addBeforeContainingStatement(org.palladiosimulator.jdt.metamodel.javamodel.statements.Statement)
     * @generated
     */
    EOperation getCommentable__AddBeforeContainingStatement__Statement();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable#addAfterContainingStatement(org.palladiosimulator.jdt.metamodel.javamodel.statements.Statement) <em>Add After Containing Statement</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Add After Containing Statement</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable#addAfterContainingStatement(org.palladiosimulator.jdt.metamodel.javamodel.statements.Statement)
     * @generated
     */
    EOperation getCommentable__AddAfterContainingStatement__Statement();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.commons.NamedElement <em>Named Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Named Element</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.commons.NamedElement
     * @generated
     */
    EClass getNamedElement();

    /**
     * Returns the meta object for the attribute '{@link org.palladiosimulator.jdt.metamodel.javamodel.commons.NamedElement#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.commons.NamedElement#getName()
     * @see #getNamedElement()
     * @generated
     */
    EAttribute getNamedElement_Name();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.commons.NamespaceAwareElement <em>Namespace Aware Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Namespace Aware Element</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.commons.NamespaceAwareElement
     * @generated
     */
    EClass getNamespaceAwareElement();

    /**
     * Returns the meta object for the attribute list '{@link org.palladiosimulator.jdt.metamodel.javamodel.commons.NamespaceAwareElement#getNamespaces <em>Namespaces</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Namespaces</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.commons.NamespaceAwareElement#getNamespaces()
     * @see #getNamespaceAwareElement()
     * @generated
     */
    EAttribute getNamespaceAwareElement_Namespaces();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.commons.NamespaceAwareElement#getNamespacesAsString() <em>Get Namespaces As String</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Namespaces As String</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.commons.NamespaceAwareElement#getNamespacesAsString()
     * @generated
     */
    EOperation getNamespaceAwareElement__GetNamespacesAsString();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.commons.NamespaceAwareElement#getClassifierAtNamespaces() <em>Get Classifier At Namespaces</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Classifier At Namespaces</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.commons.NamespaceAwareElement#getClassifierAtNamespaces()
     * @generated
     */
    EOperation getNamespaceAwareElement__GetClassifierAtNamespaces();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    CommonsFactory getCommonsFactory();

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
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.commons.impl.CommentableImpl <em>Commentable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.commons.impl.CommentableImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.commons.impl.CommonsPackageImpl#getCommentable()
         * @generated
         */
        EClass COMMENTABLE = eINSTANCE.getCommentable();

        /**
         * The meta object literal for the '<em><b>Get Concrete Classifier</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation COMMENTABLE___GET_CONCRETE_CLASSIFIER__STRING = eINSTANCE
                .getCommentable__GetConcreteClassifier__String();

        /**
         * The meta object literal for the '<em><b>Get Concrete Classifier Proxy</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation COMMENTABLE___GET_CONCRETE_CLASSIFIER_PROXY__STRING = eINSTANCE
                .getCommentable__GetConcreteClassifierProxy__String();

        /**
         * The meta object literal for the '<em><b>Get Concrete Classifiers</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation COMMENTABLE___GET_CONCRETE_CLASSIFIERS__STRING_STRING = eINSTANCE
                .getCommentable__GetConcreteClassifiers__String_String();

        /**
         * The meta object literal for the '<em><b>Get Concrete Classifier Proxies</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation COMMENTABLE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = eINSTANCE
                .getCommentable__GetConcreteClassifierProxies__String_String();

        /**
         * The meta object literal for the '<em><b>Get Lib Class</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation COMMENTABLE___GET_LIB_CLASS__STRING = eINSTANCE.getCommentable__GetLibClass__String();

        /**
         * The meta object literal for the '<em><b>Get Lib Interface</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation COMMENTABLE___GET_LIB_INTERFACE__STRING = eINSTANCE.getCommentable__GetLibInterface__String();

        /**
         * The meta object literal for the '<em><b>Get Class Class</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation COMMENTABLE___GET_CLASS_CLASS = eINSTANCE.getCommentable__GetClassClass();

        /**
         * The meta object literal for the '<em><b>Get Object Class</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation COMMENTABLE___GET_OBJECT_CLASS = eINSTANCE.getCommentable__GetObjectClass();

        /**
         * The meta object literal for the '<em><b>Get String Class</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation COMMENTABLE___GET_STRING_CLASS = eINSTANCE.getCommentable__GetStringClass();

        /**
         * The meta object literal for the '<em><b>Get Annotation Interface</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation COMMENTABLE___GET_ANNOTATION_INTERFACE = eINSTANCE.getCommentable__GetAnnotationInterface();

        /**
         * The meta object literal for the '<em><b>Get Containing Annotation Instance</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation COMMENTABLE___GET_CONTAINING_ANNOTATION_INSTANCE = eINSTANCE
                .getCommentable__GetContainingAnnotationInstance();

        /**
         * The meta object literal for the '<em><b>Get Containing Anonymous Class</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation COMMENTABLE___GET_CONTAINING_ANONYMOUS_CLASS = eINSTANCE
                .getCommentable__GetContainingAnonymousClass();

        /**
         * The meta object literal for the '<em><b>Get Containing Concrete Classifier</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation COMMENTABLE___GET_CONTAINING_CONCRETE_CLASSIFIER = eINSTANCE
                .getCommentable__GetContainingConcreteClassifier();

        /**
         * The meta object literal for the '<em><b>Get Containing Compilation Unit</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation COMMENTABLE___GET_CONTAINING_COMPILATION_UNIT = eINSTANCE
                .getCommentable__GetContainingCompilationUnit();

        /**
         * The meta object literal for the '<em><b>Get Containing Package Name</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation COMMENTABLE___GET_CONTAINING_PACKAGE_NAME = eINSTANCE.getCommentable__GetContainingPackageName();

        /**
         * The meta object literal for the '<em><b>Get Containing Container Name</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation COMMENTABLE___GET_CONTAINING_CONTAINER_NAME = eINSTANCE.getCommentable__GetContainingContainerName();

        /**
         * The meta object literal for the '<em><b>Get Parent Concrete Classifier</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation COMMENTABLE___GET_PARENT_CONCRETE_CLASSIFIER = eINSTANCE
                .getCommentable__GetParentConcreteClassifier();

        /**
         * The meta object literal for the '<em><b>Get Parent By EType</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation COMMENTABLE___GET_PARENT_BY_ETYPE__ECLASS = eINSTANCE.getCommentable__GetParentByEType__EClass();

        /**
         * The meta object literal for the '<em><b>Get First Child By EType</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation COMMENTABLE___GET_FIRST_CHILD_BY_ETYPE__ECLASS = eINSTANCE
                .getCommentable__GetFirstChildByEType__EClass();

        /**
         * The meta object literal for the '<em><b>Get Parent By Type</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation COMMENTABLE___GET_PARENT_BY_TYPE__CLASS = eINSTANCE.getCommentable__GetParentByType__Class();

        /**
         * The meta object literal for the '<em><b>Get First Child By Type</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation COMMENTABLE___GET_FIRST_CHILD_BY_TYPE__CLASS = eINSTANCE
                .getCommentable__GetFirstChildByType__Class();

        /**
         * The meta object literal for the '<em><b>Get Children By EType</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation COMMENTABLE___GET_CHILDREN_BY_ETYPE__ECLASS = eINSTANCE.getCommentable__GetChildrenByEType__EClass();

        /**
         * The meta object literal for the '<em><b>Get Children By Type</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation COMMENTABLE___GET_CHILDREN_BY_TYPE__CLASS = eINSTANCE.getCommentable__GetChildrenByType__Class();

        /**
         * The meta object literal for the '<em><b>Get Comments</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation COMMENTABLE___GET_COMMENTS = eINSTANCE.getCommentable__GetComments();

        /**
         * The meta object literal for the '<em><b>Add Before Containing Statement</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation COMMENTABLE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = eINSTANCE
                .getCommentable__AddBeforeContainingStatement__Statement();

        /**
         * The meta object literal for the '<em><b>Add After Containing Statement</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation COMMENTABLE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = eINSTANCE
                .getCommentable__AddAfterContainingStatement__Statement();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.commons.impl.NamedElementImpl <em>Named Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.commons.impl.NamedElementImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.commons.impl.CommonsPackageImpl#getNamedElement()
         * @generated
         */
        EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.commons.impl.NamespaceAwareElementImpl <em>Namespace Aware Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.commons.impl.NamespaceAwareElementImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.commons.impl.CommonsPackageImpl#getNamespaceAwareElement()
         * @generated
         */
        EClass NAMESPACE_AWARE_ELEMENT = eINSTANCE.getNamespaceAwareElement();

        /**
         * The meta object literal for the '<em><b>Namespaces</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NAMESPACE_AWARE_ELEMENT__NAMESPACES = eINSTANCE.getNamespaceAwareElement_Namespaces();

        /**
         * The meta object literal for the '<em><b>Get Namespaces As String</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation NAMESPACE_AWARE_ELEMENT___GET_NAMESPACES_AS_STRING = eINSTANCE
                .getNamespaceAwareElement__GetNamespacesAsString();

        /**
         * The meta object literal for the '<em><b>Get Classifier At Namespaces</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation NAMESPACE_AWARE_ELEMENT___GET_CLASSIFIER_AT_NAMESPACES = eINSTANCE
                .getNamespaceAwareElement__GetClassifierAtNamespaces();

    }

} //CommonsPackage
