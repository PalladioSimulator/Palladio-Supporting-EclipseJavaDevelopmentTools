/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.members;

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
 * @see org.palladiosimulator.jdt.metamodel.javamodel.members.MembersFactory
 * @model kind="package"
 * @generated
 */
public interface MembersPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "members";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.palladiosimulator.org/javamodel/members";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "members";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    MembersPackage eINSTANCE = org.palladiosimulator.jdt.metamodel.javamodel.members.impl.MembersPackageImpl.init();

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.members.impl.ExceptionThrowerImpl <em>Exception Thrower</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.members.impl.ExceptionThrowerImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.members.impl.MembersPackageImpl#getExceptionThrower()
     * @generated
     */
    int EXCEPTION_THROWER = 0;

    /**
     * The feature id for the '<em><b>Exceptions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCEPTION_THROWER__EXCEPTIONS = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Exception Thrower</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCEPTION_THROWER_FEATURE_COUNT = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCEPTION_THROWER___GET_CONCRETE_CLASSIFIER__STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCEPTION_THROWER___GET_CONCRETE_CLASSIFIER_PROXY__STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCEPTION_THROWER___GET_CONCRETE_CLASSIFIERS__STRING_STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCEPTION_THROWER___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCEPTION_THROWER___GET_LIB_CLASS__STRING = CommonsPackage.COMMENTABLE___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCEPTION_THROWER___GET_LIB_INTERFACE__STRING = CommonsPackage.COMMENTABLE___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCEPTION_THROWER___GET_CLASS_CLASS = CommonsPackage.COMMENTABLE___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCEPTION_THROWER___GET_OBJECT_CLASS = CommonsPackage.COMMENTABLE___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCEPTION_THROWER___GET_STRING_CLASS = CommonsPackage.COMMENTABLE___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCEPTION_THROWER___GET_ANNOTATION_INTERFACE = CommonsPackage.COMMENTABLE___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCEPTION_THROWER___GET_CONTAINING_ANNOTATION_INSTANCE = CommonsPackage.COMMENTABLE___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCEPTION_THROWER___GET_CONTAINING_ANONYMOUS_CLASS = CommonsPackage.COMMENTABLE___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCEPTION_THROWER___GET_CONTAINING_CONCRETE_CLASSIFIER = CommonsPackage.COMMENTABLE___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCEPTION_THROWER___GET_CONTAINING_COMPILATION_UNIT = CommonsPackage.COMMENTABLE___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCEPTION_THROWER___GET_CONTAINING_PACKAGE_NAME = CommonsPackage.COMMENTABLE___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCEPTION_THROWER___GET_CONTAINING_CONTAINER_NAME = CommonsPackage.COMMENTABLE___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCEPTION_THROWER___GET_PARENT_CONCRETE_CLASSIFIER = CommonsPackage.COMMENTABLE___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCEPTION_THROWER___GET_PARENT_BY_ETYPE__ECLASS = CommonsPackage.COMMENTABLE___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCEPTION_THROWER___GET_FIRST_CHILD_BY_ETYPE__ECLASS = CommonsPackage.COMMENTABLE___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCEPTION_THROWER___GET_PARENT_BY_TYPE__CLASS = CommonsPackage.COMMENTABLE___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCEPTION_THROWER___GET_FIRST_CHILD_BY_TYPE__CLASS = CommonsPackage.COMMENTABLE___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCEPTION_THROWER___GET_CHILDREN_BY_ETYPE__ECLASS = CommonsPackage.COMMENTABLE___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCEPTION_THROWER___GET_CHILDREN_BY_TYPE__CLASS = CommonsPackage.COMMENTABLE___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCEPTION_THROWER___GET_COMMENTS = CommonsPackage.COMMENTABLE___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCEPTION_THROWER___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = CommonsPackage.COMMENTABLE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCEPTION_THROWER___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = CommonsPackage.COMMENTABLE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The number of operations of the '<em>Exception Thrower</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCEPTION_THROWER_OPERATION_COUNT = CommonsPackage.COMMENTABLE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.members.impl.MemberImpl <em>Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.members.impl.MemberImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.members.impl.MembersPackageImpl#getMember()
     * @generated
     */
    int MEMBER = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER__NAME = CommonsPackage.NAMED_ELEMENT__NAME;

    /**
     * The number of structural features of the '<em>Member</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_FEATURE_COUNT = CommonsPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER___GET_CONCRETE_CLASSIFIER__STRING = CommonsPackage.NAMED_ELEMENT___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER___GET_CONCRETE_CLASSIFIER_PROXY__STRING = CommonsPackage.NAMED_ELEMENT___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER___GET_CONCRETE_CLASSIFIERS__STRING_STRING = CommonsPackage.NAMED_ELEMENT___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = CommonsPackage.NAMED_ELEMENT___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER___GET_LIB_CLASS__STRING = CommonsPackage.NAMED_ELEMENT___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER___GET_LIB_INTERFACE__STRING = CommonsPackage.NAMED_ELEMENT___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER___GET_CLASS_CLASS = CommonsPackage.NAMED_ELEMENT___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER___GET_OBJECT_CLASS = CommonsPackage.NAMED_ELEMENT___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER___GET_STRING_CLASS = CommonsPackage.NAMED_ELEMENT___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER___GET_ANNOTATION_INTERFACE = CommonsPackage.NAMED_ELEMENT___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER___GET_CONTAINING_ANNOTATION_INSTANCE = CommonsPackage.NAMED_ELEMENT___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER___GET_CONTAINING_ANONYMOUS_CLASS = CommonsPackage.NAMED_ELEMENT___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER___GET_CONTAINING_CONCRETE_CLASSIFIER = CommonsPackage.NAMED_ELEMENT___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER___GET_CONTAINING_COMPILATION_UNIT = CommonsPackage.NAMED_ELEMENT___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER___GET_CONTAINING_PACKAGE_NAME = CommonsPackage.NAMED_ELEMENT___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER___GET_CONTAINING_CONTAINER_NAME = CommonsPackage.NAMED_ELEMENT___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER___GET_PARENT_CONCRETE_CLASSIFIER = CommonsPackage.NAMED_ELEMENT___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER___GET_PARENT_BY_ETYPE__ECLASS = CommonsPackage.NAMED_ELEMENT___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER___GET_FIRST_CHILD_BY_ETYPE__ECLASS = CommonsPackage.NAMED_ELEMENT___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER___GET_PARENT_BY_TYPE__CLASS = CommonsPackage.NAMED_ELEMENT___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER___GET_FIRST_CHILD_BY_TYPE__CLASS = CommonsPackage.NAMED_ELEMENT___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER___GET_CHILDREN_BY_ETYPE__ECLASS = CommonsPackage.NAMED_ELEMENT___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER___GET_CHILDREN_BY_TYPE__CLASS = CommonsPackage.NAMED_ELEMENT___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER___GET_COMMENTS = CommonsPackage.NAMED_ELEMENT___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = CommonsPackage.NAMED_ELEMENT___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = CommonsPackage.NAMED_ELEMENT___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The number of operations of the '<em>Member</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_OPERATION_COUNT = CommonsPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.members.impl.MemberContainerImpl <em>Member Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.members.impl.MemberContainerImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.members.impl.MembersPackageImpl#getMemberContainer()
     * @generated
     */
    int MEMBER_CONTAINER = 2;

    /**
     * The feature id for the '<em><b>Members</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_CONTAINER__MEMBERS = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Default Members</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_CONTAINER__DEFAULT_MEMBERS = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Member Container</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_CONTAINER_FEATURE_COUNT = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_CONTAINER___GET_CONCRETE_CLASSIFIER__STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_CONTAINER___GET_CONCRETE_CLASSIFIER_PROXY__STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_CONTAINER___GET_CONCRETE_CLASSIFIERS__STRING_STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_CONTAINER___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_CONTAINER___GET_LIB_CLASS__STRING = CommonsPackage.COMMENTABLE___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_CONTAINER___GET_LIB_INTERFACE__STRING = CommonsPackage.COMMENTABLE___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_CONTAINER___GET_CLASS_CLASS = CommonsPackage.COMMENTABLE___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_CONTAINER___GET_OBJECT_CLASS = CommonsPackage.COMMENTABLE___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_CONTAINER___GET_STRING_CLASS = CommonsPackage.COMMENTABLE___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_CONTAINER___GET_ANNOTATION_INTERFACE = CommonsPackage.COMMENTABLE___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_CONTAINER___GET_CONTAINING_ANNOTATION_INSTANCE = CommonsPackage.COMMENTABLE___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_CONTAINER___GET_CONTAINING_ANONYMOUS_CLASS = CommonsPackage.COMMENTABLE___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_CONTAINER___GET_CONTAINING_CONCRETE_CLASSIFIER = CommonsPackage.COMMENTABLE___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_CONTAINER___GET_CONTAINING_COMPILATION_UNIT = CommonsPackage.COMMENTABLE___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_CONTAINER___GET_CONTAINING_PACKAGE_NAME = CommonsPackage.COMMENTABLE___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_CONTAINER___GET_CONTAINING_CONTAINER_NAME = CommonsPackage.COMMENTABLE___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_CONTAINER___GET_PARENT_CONCRETE_CLASSIFIER = CommonsPackage.COMMENTABLE___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_CONTAINER___GET_PARENT_BY_ETYPE__ECLASS = CommonsPackage.COMMENTABLE___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_CONTAINER___GET_FIRST_CHILD_BY_ETYPE__ECLASS = CommonsPackage.COMMENTABLE___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_CONTAINER___GET_PARENT_BY_TYPE__CLASS = CommonsPackage.COMMENTABLE___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_CONTAINER___GET_FIRST_CHILD_BY_TYPE__CLASS = CommonsPackage.COMMENTABLE___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_CONTAINER___GET_CHILDREN_BY_ETYPE__ECLASS = CommonsPackage.COMMENTABLE___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_CONTAINER___GET_CHILDREN_BY_TYPE__CLASS = CommonsPackage.COMMENTABLE___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_CONTAINER___GET_COMMENTS = CommonsPackage.COMMENTABLE___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_CONTAINER___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = CommonsPackage.COMMENTABLE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_CONTAINER___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = CommonsPackage.COMMENTABLE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Contained Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_CONTAINER___GET_CONTAINED_CLASSIFIER__STRING = CommonsPackage.COMMENTABLE_OPERATION_COUNT + 0;

    /**
     * The operation id for the '<em>Get Contained Field</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_CONTAINER___GET_CONTAINED_FIELD__STRING = CommonsPackage.COMMENTABLE_OPERATION_COUNT + 1;

    /**
     * The operation id for the '<em>Get Contained Method</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_CONTAINER___GET_CONTAINED_METHOD__STRING = CommonsPackage.COMMENTABLE_OPERATION_COUNT + 2;

    /**
     * The operation id for the '<em>Get Methods</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_CONTAINER___GET_METHODS = CommonsPackage.COMMENTABLE_OPERATION_COUNT + 3;

    /**
     * The operation id for the '<em>Remove Methods</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_CONTAINER___REMOVE_METHODS__STRING = CommonsPackage.COMMENTABLE_OPERATION_COUNT + 4;

    /**
     * The operation id for the '<em>Get Members By Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_CONTAINER___GET_MEMBERS_BY_NAME__STRING = CommonsPackage.COMMENTABLE_OPERATION_COUNT + 5;

    /**
     * The operation id for the '<em>Create Field</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_CONTAINER___CREATE_FIELD__STRING_STRING = CommonsPackage.COMMENTABLE_OPERATION_COUNT + 6;

    /**
     * The operation id for the '<em>Get Fields</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_CONTAINER___GET_FIELDS = CommonsPackage.COMMENTABLE_OPERATION_COUNT + 7;

    /**
     * The operation id for the '<em>Get Constructors</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_CONTAINER___GET_CONSTRUCTORS = CommonsPackage.COMMENTABLE_OPERATION_COUNT + 8;

    /**
     * The number of operations of the '<em>Member Container</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_CONTAINER_OPERATION_COUNT = CommonsPackage.COMMENTABLE_OPERATION_COUNT + 9;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.members.impl.AdditionalFieldImpl <em>Additional Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.members.impl.AdditionalFieldImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.members.impl.MembersPackageImpl#getAdditionalField()
     * @generated
     */
    int ADDITIONAL_FIELD = 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIONAL_FIELD__NAME = ReferencesPackage.REFERENCEABLE_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Array Dimensions Before</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIONAL_FIELD__ARRAY_DIMENSIONS_BEFORE = ReferencesPackage.REFERENCEABLE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Array Dimensions After</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIONAL_FIELD__ARRAY_DIMENSIONS_AFTER = ReferencesPackage.REFERENCEABLE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIONAL_FIELD__INITIAL_VALUE = ReferencesPackage.REFERENCEABLE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Additional Field</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIONAL_FIELD_FEATURE_COUNT = ReferencesPackage.REFERENCEABLE_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIONAL_FIELD___GET_CONCRETE_CLASSIFIER__STRING = ReferencesPackage.REFERENCEABLE_ELEMENT___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIONAL_FIELD___GET_CONCRETE_CLASSIFIER_PROXY__STRING = ReferencesPackage.REFERENCEABLE_ELEMENT___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIONAL_FIELD___GET_CONCRETE_CLASSIFIERS__STRING_STRING = ReferencesPackage.REFERENCEABLE_ELEMENT___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIONAL_FIELD___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = ReferencesPackage.REFERENCEABLE_ELEMENT___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIONAL_FIELD___GET_LIB_CLASS__STRING = ReferencesPackage.REFERENCEABLE_ELEMENT___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIONAL_FIELD___GET_LIB_INTERFACE__STRING = ReferencesPackage.REFERENCEABLE_ELEMENT___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIONAL_FIELD___GET_CLASS_CLASS = ReferencesPackage.REFERENCEABLE_ELEMENT___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIONAL_FIELD___GET_OBJECT_CLASS = ReferencesPackage.REFERENCEABLE_ELEMENT___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIONAL_FIELD___GET_STRING_CLASS = ReferencesPackage.REFERENCEABLE_ELEMENT___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIONAL_FIELD___GET_ANNOTATION_INTERFACE = ReferencesPackage.REFERENCEABLE_ELEMENT___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIONAL_FIELD___GET_CONTAINING_ANNOTATION_INSTANCE = ReferencesPackage.REFERENCEABLE_ELEMENT___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIONAL_FIELD___GET_CONTAINING_ANONYMOUS_CLASS = ReferencesPackage.REFERENCEABLE_ELEMENT___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIONAL_FIELD___GET_CONTAINING_CONCRETE_CLASSIFIER = ReferencesPackage.REFERENCEABLE_ELEMENT___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIONAL_FIELD___GET_CONTAINING_COMPILATION_UNIT = ReferencesPackage.REFERENCEABLE_ELEMENT___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIONAL_FIELD___GET_CONTAINING_PACKAGE_NAME = ReferencesPackage.REFERENCEABLE_ELEMENT___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIONAL_FIELD___GET_CONTAINING_CONTAINER_NAME = ReferencesPackage.REFERENCEABLE_ELEMENT___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIONAL_FIELD___GET_PARENT_CONCRETE_CLASSIFIER = ReferencesPackage.REFERENCEABLE_ELEMENT___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIONAL_FIELD___GET_PARENT_BY_ETYPE__ECLASS = ReferencesPackage.REFERENCEABLE_ELEMENT___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIONAL_FIELD___GET_FIRST_CHILD_BY_ETYPE__ECLASS = ReferencesPackage.REFERENCEABLE_ELEMENT___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIONAL_FIELD___GET_PARENT_BY_TYPE__CLASS = ReferencesPackage.REFERENCEABLE_ELEMENT___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIONAL_FIELD___GET_FIRST_CHILD_BY_TYPE__CLASS = ReferencesPackage.REFERENCEABLE_ELEMENT___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIONAL_FIELD___GET_CHILDREN_BY_ETYPE__ECLASS = ReferencesPackage.REFERENCEABLE_ELEMENT___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIONAL_FIELD___GET_CHILDREN_BY_TYPE__CLASS = ReferencesPackage.REFERENCEABLE_ELEMENT___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIONAL_FIELD___GET_COMMENTS = ReferencesPackage.REFERENCEABLE_ELEMENT___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIONAL_FIELD___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = ReferencesPackage.REFERENCEABLE_ELEMENT___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIONAL_FIELD___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = ReferencesPackage.REFERENCEABLE_ELEMENT___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIONAL_FIELD___GET_ARRAY_DIMENSION = ReferencesPackage.REFERENCEABLE_ELEMENT_OPERATION_COUNT + 1;

    /**
     * The number of operations of the '<em>Additional Field</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDITIONAL_FIELD_OPERATION_COUNT = ReferencesPackage.REFERENCEABLE_ELEMENT_OPERATION_COUNT + 2;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.members.impl.ConstructorImpl <em>Constructor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.members.impl.ConstructorImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.members.impl.MembersPackageImpl#getConstructor()
     * @generated
     */
    int CONSTRUCTOR = 4;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR__NAME = MEMBER__NAME;

    /**
     * The feature id for the '<em><b>Statements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR__STATEMENTS = MEMBER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR__PARAMETERS = MEMBER_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR__TYPE_PARAMETERS = MEMBER_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Exceptions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR__EXCEPTIONS = MEMBER_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Annotations And Modifiers</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR__ANNOTATIONS_AND_MODIFIERS = MEMBER_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Constructor</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 5;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR___GET_CONCRETE_CLASSIFIER__STRING = MEMBER___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR___GET_CONCRETE_CLASSIFIER_PROXY__STRING = MEMBER___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR___GET_CONCRETE_CLASSIFIERS__STRING_STRING = MEMBER___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = MEMBER___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR___GET_LIB_CLASS__STRING = MEMBER___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR___GET_LIB_INTERFACE__STRING = MEMBER___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR___GET_CLASS_CLASS = MEMBER___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR___GET_OBJECT_CLASS = MEMBER___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR___GET_STRING_CLASS = MEMBER___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR___GET_ANNOTATION_INTERFACE = MEMBER___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR___GET_CONTAINING_ANNOTATION_INSTANCE = MEMBER___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR___GET_CONTAINING_ANONYMOUS_CLASS = MEMBER___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR___GET_CONTAINING_CONCRETE_CLASSIFIER = MEMBER___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR___GET_CONTAINING_COMPILATION_UNIT = MEMBER___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR___GET_CONTAINING_PACKAGE_NAME = MEMBER___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR___GET_CONTAINING_CONTAINER_NAME = MEMBER___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR___GET_PARENT_CONCRETE_CLASSIFIER = MEMBER___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR___GET_PARENT_BY_ETYPE__ECLASS = MEMBER___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR___GET_FIRST_CHILD_BY_ETYPE__ECLASS = MEMBER___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR___GET_PARENT_BY_TYPE__CLASS = MEMBER___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR___GET_FIRST_CHILD_BY_TYPE__CLASS = MEMBER___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR___GET_CHILDREN_BY_ETYPE__ECLASS = MEMBER___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR___GET_CHILDREN_BY_TYPE__CLASS = MEMBER___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR___GET_COMMENTS = MEMBER___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = MEMBER___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = MEMBER___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Local Variable</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR___GET_LOCAL_VARIABLE__STRING = MEMBER_OPERATION_COUNT + 0;

    /**
     * The operation id for the '<em>Is Hidden</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR___IS_HIDDEN__COMMENTABLE = MEMBER_OPERATION_COUNT + 1;

    /**
     * The operation id for the '<em>Is Static</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR___IS_STATIC = MEMBER_OPERATION_COUNT + 2;

    /**
     * The operation id for the '<em>Remove Modifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR___REMOVE_MODIFIER__CLASS = MEMBER_OPERATION_COUNT + 3;

    /**
     * The operation id for the '<em>Make Public</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR___MAKE_PUBLIC = MEMBER_OPERATION_COUNT + 4;

    /**
     * The operation id for the '<em>Make Private</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR___MAKE_PRIVATE = MEMBER_OPERATION_COUNT + 5;

    /**
     * The operation id for the '<em>Make Protected</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR___MAKE_PROTECTED = MEMBER_OPERATION_COUNT + 6;

    /**
     * The operation id for the '<em>Get Modifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR___GET_MODIFIERS = MEMBER_OPERATION_COUNT + 7;

    /**
     * The operation id for the '<em>Remove All Modifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR___REMOVE_ALL_MODIFIERS = MEMBER_OPERATION_COUNT + 8;

    /**
     * The operation id for the '<em>Has Modifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR___HAS_MODIFIER__CLASS = MEMBER_OPERATION_COUNT + 9;

    /**
     * The operation id for the '<em>Is Public</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR___IS_PUBLIC = MEMBER_OPERATION_COUNT + 10;

    /**
     * The operation id for the '<em>Is Private</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR___IS_PRIVATE = MEMBER_OPERATION_COUNT + 11;

    /**
     * The operation id for the '<em>Is Protected</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR___IS_PROTECTED = MEMBER_OPERATION_COUNT + 12;

    /**
     * The operation id for the '<em>Add Modifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR___ADD_MODIFIER__MODIFIER = MEMBER_OPERATION_COUNT + 13;

    /**
     * The operation id for the '<em>Get Annotation Instances</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR___GET_ANNOTATION_INSTANCES = MEMBER_OPERATION_COUNT + 14;

    /**
     * The number of operations of the '<em>Constructor</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR_OPERATION_COUNT = MEMBER_OPERATION_COUNT + 15;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.members.impl.EmptyMemberImpl <em>Empty Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.members.impl.EmptyMemberImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.members.impl.MembersPackageImpl#getEmptyMember()
     * @generated
     */
    int EMPTY_MEMBER = 5;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPTY_MEMBER__NAME = MEMBER__NAME;

    /**
     * The number of structural features of the '<em>Empty Member</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPTY_MEMBER_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPTY_MEMBER___GET_CONCRETE_CLASSIFIER__STRING = MEMBER___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPTY_MEMBER___GET_CONCRETE_CLASSIFIER_PROXY__STRING = MEMBER___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPTY_MEMBER___GET_CONCRETE_CLASSIFIERS__STRING_STRING = MEMBER___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPTY_MEMBER___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = MEMBER___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPTY_MEMBER___GET_LIB_CLASS__STRING = MEMBER___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPTY_MEMBER___GET_LIB_INTERFACE__STRING = MEMBER___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPTY_MEMBER___GET_CLASS_CLASS = MEMBER___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPTY_MEMBER___GET_OBJECT_CLASS = MEMBER___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPTY_MEMBER___GET_STRING_CLASS = MEMBER___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPTY_MEMBER___GET_ANNOTATION_INTERFACE = MEMBER___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPTY_MEMBER___GET_CONTAINING_ANNOTATION_INSTANCE = MEMBER___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPTY_MEMBER___GET_CONTAINING_ANONYMOUS_CLASS = MEMBER___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPTY_MEMBER___GET_CONTAINING_CONCRETE_CLASSIFIER = MEMBER___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPTY_MEMBER___GET_CONTAINING_COMPILATION_UNIT = MEMBER___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPTY_MEMBER___GET_CONTAINING_PACKAGE_NAME = MEMBER___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPTY_MEMBER___GET_CONTAINING_CONTAINER_NAME = MEMBER___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPTY_MEMBER___GET_PARENT_CONCRETE_CLASSIFIER = MEMBER___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPTY_MEMBER___GET_PARENT_BY_ETYPE__ECLASS = MEMBER___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPTY_MEMBER___GET_FIRST_CHILD_BY_ETYPE__ECLASS = MEMBER___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPTY_MEMBER___GET_PARENT_BY_TYPE__CLASS = MEMBER___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPTY_MEMBER___GET_FIRST_CHILD_BY_TYPE__CLASS = MEMBER___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPTY_MEMBER___GET_CHILDREN_BY_ETYPE__ECLASS = MEMBER___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPTY_MEMBER___GET_CHILDREN_BY_TYPE__CLASS = MEMBER___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPTY_MEMBER___GET_COMMENTS = MEMBER___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPTY_MEMBER___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = MEMBER___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPTY_MEMBER___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = MEMBER___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The number of operations of the '<em>Empty Member</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPTY_MEMBER_OPERATION_COUNT = MEMBER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.members.impl.FieldImpl <em>Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.members.impl.FieldImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.members.impl.MembersPackageImpl#getField()
     * @generated
     */
    int FIELD = 6;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD__NAME = MEMBER__NAME;

    /**
     * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD__INITIAL_VALUE = MEMBER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Type Reference</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD__TYPE_REFERENCE = MEMBER_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Array Dimensions Before</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD__ARRAY_DIMENSIONS_BEFORE = MEMBER_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Array Dimensions After</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD__ARRAY_DIMENSIONS_AFTER = MEMBER_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD__TYPE_ARGUMENTS = MEMBER_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Annotations And Modifiers</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD__ANNOTATIONS_AND_MODIFIERS = MEMBER_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Additional Fields</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD__ADDITIONAL_FIELDS = MEMBER_FEATURE_COUNT + 6;

    /**
     * The number of structural features of the '<em>Field</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 7;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD___GET_CONCRETE_CLASSIFIER__STRING = MEMBER___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD___GET_CONCRETE_CLASSIFIER_PROXY__STRING = MEMBER___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD___GET_CONCRETE_CLASSIFIERS__STRING_STRING = MEMBER___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = MEMBER___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD___GET_LIB_CLASS__STRING = MEMBER___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD___GET_LIB_INTERFACE__STRING = MEMBER___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD___GET_CLASS_CLASS = MEMBER___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD___GET_OBJECT_CLASS = MEMBER___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD___GET_STRING_CLASS = MEMBER___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD___GET_ANNOTATION_INTERFACE = MEMBER___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD___GET_CONTAINING_ANNOTATION_INSTANCE = MEMBER___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD___GET_CONTAINING_ANONYMOUS_CLASS = MEMBER___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD___GET_CONTAINING_CONCRETE_CLASSIFIER = MEMBER___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD___GET_CONTAINING_COMPILATION_UNIT = MEMBER___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD___GET_CONTAINING_PACKAGE_NAME = MEMBER___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD___GET_CONTAINING_CONTAINER_NAME = MEMBER___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD___GET_PARENT_CONCRETE_CLASSIFIER = MEMBER___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD___GET_PARENT_BY_ETYPE__ECLASS = MEMBER___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD___GET_FIRST_CHILD_BY_ETYPE__ECLASS = MEMBER___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD___GET_PARENT_BY_TYPE__CLASS = MEMBER___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD___GET_FIRST_CHILD_BY_TYPE__CLASS = MEMBER___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD___GET_CHILDREN_BY_ETYPE__ECLASS = MEMBER___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD___GET_CHILDREN_BY_TYPE__CLASS = MEMBER___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD___GET_COMMENTS = MEMBER___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = MEMBER___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = MEMBER___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD___GET_ARRAY_DIMENSION = MEMBER_OPERATION_COUNT + 1;

    /**
     * The operation id for the '<em>Create Method Call Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD___CREATE_METHOD_CALL_STATEMENT__STRING_ELIST = MEMBER_OPERATION_COUNT + 2;

    /**
     * The operation id for the '<em>Create Method Call</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD___CREATE_METHOD_CALL__STRING_ELIST = MEMBER_OPERATION_COUNT + 3;

    /**
     * The operation id for the '<em>Is Hidden</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD___IS_HIDDEN__COMMENTABLE = MEMBER_OPERATION_COUNT + 4;

    /**
     * The operation id for the '<em>Is Static</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD___IS_STATIC = MEMBER_OPERATION_COUNT + 5;

    /**
     * The operation id for the '<em>Remove Modifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD___REMOVE_MODIFIER__CLASS = MEMBER_OPERATION_COUNT + 6;

    /**
     * The operation id for the '<em>Make Public</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD___MAKE_PUBLIC = MEMBER_OPERATION_COUNT + 7;

    /**
     * The operation id for the '<em>Make Private</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD___MAKE_PRIVATE = MEMBER_OPERATION_COUNT + 8;

    /**
     * The operation id for the '<em>Make Protected</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD___MAKE_PROTECTED = MEMBER_OPERATION_COUNT + 9;

    /**
     * The operation id for the '<em>Get Modifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD___GET_MODIFIERS = MEMBER_OPERATION_COUNT + 10;

    /**
     * The operation id for the '<em>Remove All Modifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD___REMOVE_ALL_MODIFIERS = MEMBER_OPERATION_COUNT + 11;

    /**
     * The operation id for the '<em>Has Modifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD___HAS_MODIFIER__CLASS = MEMBER_OPERATION_COUNT + 12;

    /**
     * The operation id for the '<em>Is Public</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD___IS_PUBLIC = MEMBER_OPERATION_COUNT + 13;

    /**
     * The operation id for the '<em>Is Private</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD___IS_PRIVATE = MEMBER_OPERATION_COUNT + 14;

    /**
     * The operation id for the '<em>Is Protected</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD___IS_PROTECTED = MEMBER_OPERATION_COUNT + 15;

    /**
     * The operation id for the '<em>Add Modifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD___ADD_MODIFIER__MODIFIER = MEMBER_OPERATION_COUNT + 16;

    /**
     * The operation id for the '<em>Get Annotation Instances</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD___GET_ANNOTATION_INSTANCES = MEMBER_OPERATION_COUNT + 17;

    /**
     * The number of operations of the '<em>Field</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD_OPERATION_COUNT = MEMBER_OPERATION_COUNT + 18;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.members.impl.MethodImpl <em>Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.members.impl.MethodImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.members.impl.MembersPackageImpl#getMethod()
     * @generated
     */
    int METHOD = 7;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD__NAME = MEMBER__NAME;

    /**
     * The feature id for the '<em><b>Type Reference</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD__TYPE_REFERENCE = MEMBER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Array Dimensions Before</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD__ARRAY_DIMENSIONS_BEFORE = MEMBER_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Array Dimensions After</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD__ARRAY_DIMENSIONS_AFTER = MEMBER_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD__TYPE_PARAMETERS = MEMBER_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD__PARAMETERS = MEMBER_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Exceptions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD__EXCEPTIONS = MEMBER_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Annotations And Modifiers</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD__ANNOTATIONS_AND_MODIFIERS = MEMBER_FEATURE_COUNT + 6;

    /**
     * The number of structural features of the '<em>Method</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 7;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD___GET_CONCRETE_CLASSIFIER__STRING = MEMBER___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD___GET_CONCRETE_CLASSIFIER_PROXY__STRING = MEMBER___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD___GET_CONCRETE_CLASSIFIERS__STRING_STRING = MEMBER___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = MEMBER___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD___GET_LIB_CLASS__STRING = MEMBER___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD___GET_LIB_INTERFACE__STRING = MEMBER___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD___GET_CLASS_CLASS = MEMBER___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD___GET_OBJECT_CLASS = MEMBER___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD___GET_STRING_CLASS = MEMBER___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD___GET_ANNOTATION_INTERFACE = MEMBER___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD___GET_CONTAINING_ANNOTATION_INSTANCE = MEMBER___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD___GET_CONTAINING_ANONYMOUS_CLASS = MEMBER___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD___GET_CONTAINING_CONCRETE_CLASSIFIER = MEMBER___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD___GET_CONTAINING_COMPILATION_UNIT = MEMBER___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD___GET_CONTAINING_PACKAGE_NAME = MEMBER___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD___GET_CONTAINING_CONTAINER_NAME = MEMBER___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD___GET_PARENT_CONCRETE_CLASSIFIER = MEMBER___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD___GET_PARENT_BY_ETYPE__ECLASS = MEMBER___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD___GET_FIRST_CHILD_BY_ETYPE__ECLASS = MEMBER___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD___GET_PARENT_BY_TYPE__CLASS = MEMBER___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD___GET_FIRST_CHILD_BY_TYPE__CLASS = MEMBER___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD___GET_CHILDREN_BY_ETYPE__ECLASS = MEMBER___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD___GET_CHILDREN_BY_TYPE__CLASS = MEMBER___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD___GET_COMMENTS = MEMBER___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = MEMBER___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = MEMBER___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Is Hidden</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD___IS_HIDDEN__COMMENTABLE = MEMBER_OPERATION_COUNT + 1;

    /**
     * The operation id for the '<em>Is Static</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD___IS_STATIC = MEMBER_OPERATION_COUNT + 2;

    /**
     * The operation id for the '<em>Remove Modifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD___REMOVE_MODIFIER__CLASS = MEMBER_OPERATION_COUNT + 3;

    /**
     * The operation id for the '<em>Make Public</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD___MAKE_PUBLIC = MEMBER_OPERATION_COUNT + 4;

    /**
     * The operation id for the '<em>Make Private</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD___MAKE_PRIVATE = MEMBER_OPERATION_COUNT + 5;

    /**
     * The operation id for the '<em>Make Protected</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD___MAKE_PROTECTED = MEMBER_OPERATION_COUNT + 6;

    /**
     * The operation id for the '<em>Get Modifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD___GET_MODIFIERS = MEMBER_OPERATION_COUNT + 7;

    /**
     * The operation id for the '<em>Remove All Modifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD___REMOVE_ALL_MODIFIERS = MEMBER_OPERATION_COUNT + 8;

    /**
     * The operation id for the '<em>Has Modifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD___HAS_MODIFIER__CLASS = MEMBER_OPERATION_COUNT + 9;

    /**
     * The operation id for the '<em>Is Public</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD___IS_PUBLIC = MEMBER_OPERATION_COUNT + 10;

    /**
     * The operation id for the '<em>Is Private</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD___IS_PRIVATE = MEMBER_OPERATION_COUNT + 11;

    /**
     * The operation id for the '<em>Is Protected</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD___IS_PROTECTED = MEMBER_OPERATION_COUNT + 12;

    /**
     * The operation id for the '<em>Add Modifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD___ADD_MODIFIER__MODIFIER = MEMBER_OPERATION_COUNT + 13;

    /**
     * The operation id for the '<em>Get Annotation Instances</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD___GET_ANNOTATION_INSTANCES = MEMBER_OPERATION_COUNT + 14;

    /**
     * The operation id for the '<em>Is Method For Call</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD___IS_METHOD_FOR_CALL__METHODCALL_BOOLEAN = MEMBER_OPERATION_COUNT + 15;

    /**
     * The operation id for the '<em>Is Some Method For Call</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD___IS_SOME_METHOD_FOR_CALL__METHODCALL = MEMBER_OPERATION_COUNT + 16;

    /**
     * The operation id for the '<em>Is Better Method For Call</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD___IS_BETTER_METHOD_FOR_CALL__METHOD_METHODCALL = MEMBER_OPERATION_COUNT + 17;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD___GET_ARRAY_DIMENSION = MEMBER_OPERATION_COUNT + 18;

    /**
     * The number of operations of the '<em>Method</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_OPERATION_COUNT = MEMBER_OPERATION_COUNT + 19;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.members.impl.InterfaceMethodImpl <em>Interface Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.members.impl.InterfaceMethodImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.members.impl.MembersPackageImpl#getInterfaceMethod()
     * @generated
     */
    int INTERFACE_METHOD = 8;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_METHOD__NAME = METHOD__NAME;

    /**
     * The feature id for the '<em><b>Type Reference</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_METHOD__TYPE_REFERENCE = METHOD__TYPE_REFERENCE;

    /**
     * The feature id for the '<em><b>Array Dimensions Before</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_METHOD__ARRAY_DIMENSIONS_BEFORE = METHOD__ARRAY_DIMENSIONS_BEFORE;

    /**
     * The feature id for the '<em><b>Array Dimensions After</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_METHOD__ARRAY_DIMENSIONS_AFTER = METHOD__ARRAY_DIMENSIONS_AFTER;

    /**
     * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_METHOD__TYPE_PARAMETERS = METHOD__TYPE_PARAMETERS;

    /**
     * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_METHOD__PARAMETERS = METHOD__PARAMETERS;

    /**
     * The feature id for the '<em><b>Exceptions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_METHOD__EXCEPTIONS = METHOD__EXCEPTIONS;

    /**
     * The feature id for the '<em><b>Annotations And Modifiers</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_METHOD__ANNOTATIONS_AND_MODIFIERS = METHOD__ANNOTATIONS_AND_MODIFIERS;

    /**
     * The number of structural features of the '<em>Interface Method</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_METHOD_FEATURE_COUNT = METHOD_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_METHOD___GET_CONCRETE_CLASSIFIER__STRING = METHOD___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_METHOD___GET_CONCRETE_CLASSIFIER_PROXY__STRING = METHOD___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_METHOD___GET_CONCRETE_CLASSIFIERS__STRING_STRING = METHOD___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_METHOD___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = METHOD___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_METHOD___GET_LIB_CLASS__STRING = METHOD___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_METHOD___GET_LIB_INTERFACE__STRING = METHOD___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_METHOD___GET_CLASS_CLASS = METHOD___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_METHOD___GET_OBJECT_CLASS = METHOD___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_METHOD___GET_STRING_CLASS = METHOD___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_METHOD___GET_ANNOTATION_INTERFACE = METHOD___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_METHOD___GET_CONTAINING_ANNOTATION_INSTANCE = METHOD___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_METHOD___GET_CONTAINING_ANONYMOUS_CLASS = METHOD___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_METHOD___GET_CONTAINING_CONCRETE_CLASSIFIER = METHOD___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_METHOD___GET_CONTAINING_COMPILATION_UNIT = METHOD___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_METHOD___GET_CONTAINING_PACKAGE_NAME = METHOD___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_METHOD___GET_CONTAINING_CONTAINER_NAME = METHOD___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_METHOD___GET_PARENT_CONCRETE_CLASSIFIER = METHOD___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_METHOD___GET_PARENT_BY_ETYPE__ECLASS = METHOD___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_METHOD___GET_FIRST_CHILD_BY_ETYPE__ECLASS = METHOD___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_METHOD___GET_PARENT_BY_TYPE__CLASS = METHOD___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_METHOD___GET_FIRST_CHILD_BY_TYPE__CLASS = METHOD___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_METHOD___GET_CHILDREN_BY_ETYPE__ECLASS = METHOD___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_METHOD___GET_CHILDREN_BY_TYPE__CLASS = METHOD___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_METHOD___GET_COMMENTS = METHOD___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_METHOD___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = METHOD___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_METHOD___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = METHOD___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Is Hidden</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_METHOD___IS_HIDDEN__COMMENTABLE = METHOD___IS_HIDDEN__COMMENTABLE;

    /**
     * The operation id for the '<em>Is Static</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_METHOD___IS_STATIC = METHOD___IS_STATIC;

    /**
     * The operation id for the '<em>Remove Modifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_METHOD___REMOVE_MODIFIER__CLASS = METHOD___REMOVE_MODIFIER__CLASS;

    /**
     * The operation id for the '<em>Make Public</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_METHOD___MAKE_PUBLIC = METHOD___MAKE_PUBLIC;

    /**
     * The operation id for the '<em>Make Private</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_METHOD___MAKE_PRIVATE = METHOD___MAKE_PRIVATE;

    /**
     * The operation id for the '<em>Make Protected</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_METHOD___MAKE_PROTECTED = METHOD___MAKE_PROTECTED;

    /**
     * The operation id for the '<em>Get Modifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_METHOD___GET_MODIFIERS = METHOD___GET_MODIFIERS;

    /**
     * The operation id for the '<em>Remove All Modifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_METHOD___REMOVE_ALL_MODIFIERS = METHOD___REMOVE_ALL_MODIFIERS;

    /**
     * The operation id for the '<em>Has Modifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_METHOD___HAS_MODIFIER__CLASS = METHOD___HAS_MODIFIER__CLASS;

    /**
     * The operation id for the '<em>Is Public</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_METHOD___IS_PUBLIC = METHOD___IS_PUBLIC;

    /**
     * The operation id for the '<em>Is Private</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_METHOD___IS_PRIVATE = METHOD___IS_PRIVATE;

    /**
     * The operation id for the '<em>Is Protected</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_METHOD___IS_PROTECTED = METHOD___IS_PROTECTED;

    /**
     * The operation id for the '<em>Add Modifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_METHOD___ADD_MODIFIER__MODIFIER = METHOD___ADD_MODIFIER__MODIFIER;

    /**
     * The operation id for the '<em>Get Annotation Instances</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_METHOD___GET_ANNOTATION_INSTANCES = METHOD___GET_ANNOTATION_INSTANCES;

    /**
     * The operation id for the '<em>Is Method For Call</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_METHOD___IS_METHOD_FOR_CALL__METHODCALL_BOOLEAN = METHOD___IS_METHOD_FOR_CALL__METHODCALL_BOOLEAN;

    /**
     * The operation id for the '<em>Is Some Method For Call</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_METHOD___IS_SOME_METHOD_FOR_CALL__METHODCALL = METHOD___IS_SOME_METHOD_FOR_CALL__METHODCALL;

    /**
     * The operation id for the '<em>Is Better Method For Call</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_METHOD___IS_BETTER_METHOD_FOR_CALL__METHOD_METHODCALL = METHOD___IS_BETTER_METHOD_FOR_CALL__METHOD_METHODCALL;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_METHOD___GET_ARRAY_DIMENSION = METHOD___GET_ARRAY_DIMENSION;

    /**
     * The number of operations of the '<em>Interface Method</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_METHOD_OPERATION_COUNT = METHOD_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.members.impl.ClassMethodImpl <em>Class Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.members.impl.ClassMethodImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.members.impl.MembersPackageImpl#getClassMethod()
     * @generated
     */
    int CLASS_METHOD = 9;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_METHOD__NAME = METHOD__NAME;

    /**
     * The feature id for the '<em><b>Type Reference</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_METHOD__TYPE_REFERENCE = METHOD__TYPE_REFERENCE;

    /**
     * The feature id for the '<em><b>Array Dimensions Before</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_METHOD__ARRAY_DIMENSIONS_BEFORE = METHOD__ARRAY_DIMENSIONS_BEFORE;

    /**
     * The feature id for the '<em><b>Array Dimensions After</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_METHOD__ARRAY_DIMENSIONS_AFTER = METHOD__ARRAY_DIMENSIONS_AFTER;

    /**
     * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_METHOD__TYPE_PARAMETERS = METHOD__TYPE_PARAMETERS;

    /**
     * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_METHOD__PARAMETERS = METHOD__PARAMETERS;

    /**
     * The feature id for the '<em><b>Exceptions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_METHOD__EXCEPTIONS = METHOD__EXCEPTIONS;

    /**
     * The feature id for the '<em><b>Annotations And Modifiers</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_METHOD__ANNOTATIONS_AND_MODIFIERS = METHOD__ANNOTATIONS_AND_MODIFIERS;

    /**
     * The feature id for the '<em><b>Statements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_METHOD__STATEMENTS = METHOD_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Class Method</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_METHOD_FEATURE_COUNT = METHOD_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_METHOD___GET_CONCRETE_CLASSIFIER__STRING = METHOD___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_METHOD___GET_CONCRETE_CLASSIFIER_PROXY__STRING = METHOD___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_METHOD___GET_CONCRETE_CLASSIFIERS__STRING_STRING = METHOD___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_METHOD___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = METHOD___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_METHOD___GET_LIB_CLASS__STRING = METHOD___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_METHOD___GET_LIB_INTERFACE__STRING = METHOD___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_METHOD___GET_CLASS_CLASS = METHOD___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_METHOD___GET_OBJECT_CLASS = METHOD___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_METHOD___GET_STRING_CLASS = METHOD___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_METHOD___GET_ANNOTATION_INTERFACE = METHOD___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_METHOD___GET_CONTAINING_ANNOTATION_INSTANCE = METHOD___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_METHOD___GET_CONTAINING_ANONYMOUS_CLASS = METHOD___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_METHOD___GET_CONTAINING_CONCRETE_CLASSIFIER = METHOD___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_METHOD___GET_CONTAINING_COMPILATION_UNIT = METHOD___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_METHOD___GET_CONTAINING_PACKAGE_NAME = METHOD___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_METHOD___GET_CONTAINING_CONTAINER_NAME = METHOD___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_METHOD___GET_PARENT_CONCRETE_CLASSIFIER = METHOD___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_METHOD___GET_PARENT_BY_ETYPE__ECLASS = METHOD___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_METHOD___GET_FIRST_CHILD_BY_ETYPE__ECLASS = METHOD___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_METHOD___GET_PARENT_BY_TYPE__CLASS = METHOD___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_METHOD___GET_FIRST_CHILD_BY_TYPE__CLASS = METHOD___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_METHOD___GET_CHILDREN_BY_ETYPE__ECLASS = METHOD___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_METHOD___GET_CHILDREN_BY_TYPE__CLASS = METHOD___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_METHOD___GET_COMMENTS = METHOD___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_METHOD___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = METHOD___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_METHOD___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = METHOD___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Is Hidden</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_METHOD___IS_HIDDEN__COMMENTABLE = METHOD___IS_HIDDEN__COMMENTABLE;

    /**
     * The operation id for the '<em>Is Static</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_METHOD___IS_STATIC = METHOD___IS_STATIC;

    /**
     * The operation id for the '<em>Remove Modifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_METHOD___REMOVE_MODIFIER__CLASS = METHOD___REMOVE_MODIFIER__CLASS;

    /**
     * The operation id for the '<em>Make Public</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_METHOD___MAKE_PUBLIC = METHOD___MAKE_PUBLIC;

    /**
     * The operation id for the '<em>Make Private</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_METHOD___MAKE_PRIVATE = METHOD___MAKE_PRIVATE;

    /**
     * The operation id for the '<em>Make Protected</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_METHOD___MAKE_PROTECTED = METHOD___MAKE_PROTECTED;

    /**
     * The operation id for the '<em>Get Modifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_METHOD___GET_MODIFIERS = METHOD___GET_MODIFIERS;

    /**
     * The operation id for the '<em>Remove All Modifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_METHOD___REMOVE_ALL_MODIFIERS = METHOD___REMOVE_ALL_MODIFIERS;

    /**
     * The operation id for the '<em>Has Modifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_METHOD___HAS_MODIFIER__CLASS = METHOD___HAS_MODIFIER__CLASS;

    /**
     * The operation id for the '<em>Is Public</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_METHOD___IS_PUBLIC = METHOD___IS_PUBLIC;

    /**
     * The operation id for the '<em>Is Private</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_METHOD___IS_PRIVATE = METHOD___IS_PRIVATE;

    /**
     * The operation id for the '<em>Is Protected</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_METHOD___IS_PROTECTED = METHOD___IS_PROTECTED;

    /**
     * The operation id for the '<em>Add Modifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_METHOD___ADD_MODIFIER__MODIFIER = METHOD___ADD_MODIFIER__MODIFIER;

    /**
     * The operation id for the '<em>Get Annotation Instances</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_METHOD___GET_ANNOTATION_INSTANCES = METHOD___GET_ANNOTATION_INSTANCES;

    /**
     * The operation id for the '<em>Is Method For Call</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_METHOD___IS_METHOD_FOR_CALL__METHODCALL_BOOLEAN = METHOD___IS_METHOD_FOR_CALL__METHODCALL_BOOLEAN;

    /**
     * The operation id for the '<em>Is Some Method For Call</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_METHOD___IS_SOME_METHOD_FOR_CALL__METHODCALL = METHOD___IS_SOME_METHOD_FOR_CALL__METHODCALL;

    /**
     * The operation id for the '<em>Is Better Method For Call</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_METHOD___IS_BETTER_METHOD_FOR_CALL__METHOD_METHODCALL = METHOD___IS_BETTER_METHOD_FOR_CALL__METHOD_METHODCALL;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_METHOD___GET_ARRAY_DIMENSION = METHOD___GET_ARRAY_DIMENSION;

    /**
     * The operation id for the '<em>Get Local Variable</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_METHOD___GET_LOCAL_VARIABLE__STRING = METHOD_OPERATION_COUNT + 0;

    /**
     * The number of operations of the '<em>Class Method</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_METHOD_OPERATION_COUNT = METHOD_OPERATION_COUNT + 1;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.members.impl.EnumConstantImpl <em>Enum Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.members.impl.EnumConstantImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.members.impl.MembersPackageImpl#getEnumConstant()
     * @generated
     */
    int ENUM_CONSTANT = 10;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_CONSTANT__NAME = ReferencesPackage.REFERENCEABLE_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_CONSTANT__ARGUMENTS = ReferencesPackage.REFERENCEABLE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_CONSTANT__ANNOTATIONS = ReferencesPackage.REFERENCEABLE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Anonymous Class</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_CONSTANT__ANONYMOUS_CLASS = ReferencesPackage.REFERENCEABLE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Enum Constant</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_CONSTANT_FEATURE_COUNT = ReferencesPackage.REFERENCEABLE_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_CONSTANT___GET_CONCRETE_CLASSIFIER__STRING = ReferencesPackage.REFERENCEABLE_ELEMENT___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_CONSTANT___GET_CONCRETE_CLASSIFIER_PROXY__STRING = ReferencesPackage.REFERENCEABLE_ELEMENT___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_CONSTANT___GET_CONCRETE_CLASSIFIERS__STRING_STRING = ReferencesPackage.REFERENCEABLE_ELEMENT___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_CONSTANT___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = ReferencesPackage.REFERENCEABLE_ELEMENT___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_CONSTANT___GET_LIB_CLASS__STRING = ReferencesPackage.REFERENCEABLE_ELEMENT___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_CONSTANT___GET_LIB_INTERFACE__STRING = ReferencesPackage.REFERENCEABLE_ELEMENT___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_CONSTANT___GET_CLASS_CLASS = ReferencesPackage.REFERENCEABLE_ELEMENT___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_CONSTANT___GET_OBJECT_CLASS = ReferencesPackage.REFERENCEABLE_ELEMENT___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_CONSTANT___GET_STRING_CLASS = ReferencesPackage.REFERENCEABLE_ELEMENT___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_CONSTANT___GET_ANNOTATION_INTERFACE = ReferencesPackage.REFERENCEABLE_ELEMENT___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_CONSTANT___GET_CONTAINING_ANNOTATION_INSTANCE = ReferencesPackage.REFERENCEABLE_ELEMENT___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_CONSTANT___GET_CONTAINING_ANONYMOUS_CLASS = ReferencesPackage.REFERENCEABLE_ELEMENT___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_CONSTANT___GET_CONTAINING_CONCRETE_CLASSIFIER = ReferencesPackage.REFERENCEABLE_ELEMENT___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_CONSTANT___GET_CONTAINING_COMPILATION_UNIT = ReferencesPackage.REFERENCEABLE_ELEMENT___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_CONSTANT___GET_CONTAINING_PACKAGE_NAME = ReferencesPackage.REFERENCEABLE_ELEMENT___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_CONSTANT___GET_CONTAINING_CONTAINER_NAME = ReferencesPackage.REFERENCEABLE_ELEMENT___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_CONSTANT___GET_PARENT_CONCRETE_CLASSIFIER = ReferencesPackage.REFERENCEABLE_ELEMENT___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_CONSTANT___GET_PARENT_BY_ETYPE__ECLASS = ReferencesPackage.REFERENCEABLE_ELEMENT___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_CONSTANT___GET_FIRST_CHILD_BY_ETYPE__ECLASS = ReferencesPackage.REFERENCEABLE_ELEMENT___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_CONSTANT___GET_PARENT_BY_TYPE__CLASS = ReferencesPackage.REFERENCEABLE_ELEMENT___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_CONSTANT___GET_FIRST_CHILD_BY_TYPE__CLASS = ReferencesPackage.REFERENCEABLE_ELEMENT___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_CONSTANT___GET_CHILDREN_BY_ETYPE__ECLASS = ReferencesPackage.REFERENCEABLE_ELEMENT___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_CONSTANT___GET_CHILDREN_BY_TYPE__CLASS = ReferencesPackage.REFERENCEABLE_ELEMENT___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_CONSTANT___GET_COMMENTS = ReferencesPackage.REFERENCEABLE_ELEMENT___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_CONSTANT___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = ReferencesPackage.REFERENCEABLE_ELEMENT___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_CONSTANT___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = ReferencesPackage.REFERENCEABLE_ELEMENT___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Argument Types</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_CONSTANT___GET_ARGUMENT_TYPES = ReferencesPackage.REFERENCEABLE_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The number of operations of the '<em>Enum Constant</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_CONSTANT_OPERATION_COUNT = ReferencesPackage.REFERENCEABLE_ELEMENT_OPERATION_COUNT + 1;

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.members.ExceptionThrower <em>Exception Thrower</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Exception Thrower</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.members.ExceptionThrower
     * @generated
     */
    EClass getExceptionThrower();

    /**
     * Returns the meta object for the containment reference list '{@link org.palladiosimulator.jdt.metamodel.javamodel.members.ExceptionThrower#getExceptions <em>Exceptions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Exceptions</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.members.ExceptionThrower#getExceptions()
     * @see #getExceptionThrower()
     * @generated
     */
    EReference getExceptionThrower_Exceptions();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.members.Member <em>Member</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Member</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.members.Member
     * @generated
     */
    EClass getMember();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.members.MemberContainer <em>Member Container</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Member Container</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.members.MemberContainer
     * @generated
     */
    EClass getMemberContainer();

    /**
     * Returns the meta object for the containment reference list '{@link org.palladiosimulator.jdt.metamodel.javamodel.members.MemberContainer#getMembers <em>Members</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Members</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.members.MemberContainer#getMembers()
     * @see #getMemberContainer()
     * @generated
     */
    EReference getMemberContainer_Members();

    /**
     * Returns the meta object for the containment reference list '{@link org.palladiosimulator.jdt.metamodel.javamodel.members.MemberContainer#getDefaultMembers <em>Default Members</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Default Members</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.members.MemberContainer#getDefaultMembers()
     * @see #getMemberContainer()
     * @generated
     */
    EReference getMemberContainer_DefaultMembers();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.members.MemberContainer#getContainedClassifier(java.lang.String) <em>Get Contained Classifier</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Contained Classifier</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.members.MemberContainer#getContainedClassifier(java.lang.String)
     * @generated
     */
    EOperation getMemberContainer__GetContainedClassifier__String();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.members.MemberContainer#getContainedField(java.lang.String) <em>Get Contained Field</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Contained Field</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.members.MemberContainer#getContainedField(java.lang.String)
     * @generated
     */
    EOperation getMemberContainer__GetContainedField__String();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.members.MemberContainer#getContainedMethod(java.lang.String) <em>Get Contained Method</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Contained Method</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.members.MemberContainer#getContainedMethod(java.lang.String)
     * @generated
     */
    EOperation getMemberContainer__GetContainedMethod__String();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.members.MemberContainer#getMethods() <em>Get Methods</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Methods</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.members.MemberContainer#getMethods()
     * @generated
     */
    EOperation getMemberContainer__GetMethods();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.members.MemberContainer#removeMethods(java.lang.String) <em>Remove Methods</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Remove Methods</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.members.MemberContainer#removeMethods(java.lang.String)
     * @generated
     */
    EOperation getMemberContainer__RemoveMethods__String();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.members.MemberContainer#getMembersByName(java.lang.String) <em>Get Members By Name</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Members By Name</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.members.MemberContainer#getMembersByName(java.lang.String)
     * @generated
     */
    EOperation getMemberContainer__GetMembersByName__String();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.members.MemberContainer#createField(java.lang.String, java.lang.String) <em>Create Field</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Create Field</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.members.MemberContainer#createField(java.lang.String, java.lang.String)
     * @generated
     */
    EOperation getMemberContainer__CreateField__String_String();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.members.MemberContainer#getFields() <em>Get Fields</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Fields</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.members.MemberContainer#getFields()
     * @generated
     */
    EOperation getMemberContainer__GetFields();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.members.MemberContainer#getConstructors() <em>Get Constructors</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Constructors</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.members.MemberContainer#getConstructors()
     * @generated
     */
    EOperation getMemberContainer__GetConstructors();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.members.AdditionalField <em>Additional Field</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Additional Field</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.members.AdditionalField
     * @generated
     */
    EClass getAdditionalField();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.members.AdditionalField#getArrayDimension() <em>Get Array Dimension</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Array Dimension</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.members.AdditionalField#getArrayDimension()
     * @generated
     */
    EOperation getAdditionalField__GetArrayDimension();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.members.Constructor <em>Constructor</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Constructor</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.members.Constructor
     * @generated
     */
    EClass getConstructor();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.members.EmptyMember <em>Empty Member</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Empty Member</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.members.EmptyMember
     * @generated
     */
    EClass getEmptyMember();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.members.Field <em>Field</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Field</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.members.Field
     * @generated
     */
    EClass getField();

    /**
     * Returns the meta object for the containment reference list '{@link org.palladiosimulator.jdt.metamodel.javamodel.members.Field#getAdditionalFields <em>Additional Fields</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Additional Fields</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.members.Field#getAdditionalFields()
     * @see #getField()
     * @generated
     */
    EReference getField_AdditionalFields();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.members.Method <em>Method</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Method</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.members.Method
     * @generated
     */
    EClass getMethod();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.members.Method#isMethodForCall(org.palladiosimulator.jdt.metamodel.javamodel.references.MethodCall, boolean) <em>Is Method For Call</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Is Method For Call</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.members.Method#isMethodForCall(org.palladiosimulator.jdt.metamodel.javamodel.references.MethodCall, boolean)
     * @generated
     */
    EOperation getMethod__IsMethodForCall__MethodCall_boolean();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.members.Method#isSomeMethodForCall(org.palladiosimulator.jdt.metamodel.javamodel.references.MethodCall) <em>Is Some Method For Call</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Is Some Method For Call</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.members.Method#isSomeMethodForCall(org.palladiosimulator.jdt.metamodel.javamodel.references.MethodCall)
     * @generated
     */
    EOperation getMethod__IsSomeMethodForCall__MethodCall();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.members.Method#isBetterMethodForCall(org.palladiosimulator.jdt.metamodel.javamodel.members.Method, org.palladiosimulator.jdt.metamodel.javamodel.references.MethodCall) <em>Is Better Method For Call</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Is Better Method For Call</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.members.Method#isBetterMethodForCall(org.palladiosimulator.jdt.metamodel.javamodel.members.Method, org.palladiosimulator.jdt.metamodel.javamodel.references.MethodCall)
     * @generated
     */
    EOperation getMethod__IsBetterMethodForCall__Method_MethodCall();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.members.Method#getArrayDimension() <em>Get Array Dimension</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Array Dimension</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.members.Method#getArrayDimension()
     * @generated
     */
    EOperation getMethod__GetArrayDimension();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.members.InterfaceMethod <em>Interface Method</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Interface Method</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.members.InterfaceMethod
     * @generated
     */
    EClass getInterfaceMethod();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.members.ClassMethod <em>Class Method</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Class Method</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.members.ClassMethod
     * @generated
     */
    EClass getClassMethod();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.members.EnumConstant <em>Enum Constant</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Enum Constant</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.members.EnumConstant
     * @generated
     */
    EClass getEnumConstant();

    /**
     * Returns the meta object for the containment reference '{@link org.palladiosimulator.jdt.metamodel.javamodel.members.EnumConstant#getAnonymousClass <em>Anonymous Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Anonymous Class</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.members.EnumConstant#getAnonymousClass()
     * @see #getEnumConstant()
     * @generated
     */
    EReference getEnumConstant_AnonymousClass();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    MembersFactory getMembersFactory();

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
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.members.impl.ExceptionThrowerImpl <em>Exception Thrower</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.members.impl.ExceptionThrowerImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.members.impl.MembersPackageImpl#getExceptionThrower()
         * @generated
         */
        EClass EXCEPTION_THROWER = eINSTANCE.getExceptionThrower();

        /**
         * The meta object literal for the '<em><b>Exceptions</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EXCEPTION_THROWER__EXCEPTIONS = eINSTANCE.getExceptionThrower_Exceptions();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.members.impl.MemberImpl <em>Member</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.members.impl.MemberImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.members.impl.MembersPackageImpl#getMember()
         * @generated
         */
        EClass MEMBER = eINSTANCE.getMember();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.members.impl.MemberContainerImpl <em>Member Container</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.members.impl.MemberContainerImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.members.impl.MembersPackageImpl#getMemberContainer()
         * @generated
         */
        EClass MEMBER_CONTAINER = eINSTANCE.getMemberContainer();

        /**
         * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MEMBER_CONTAINER__MEMBERS = eINSTANCE.getMemberContainer_Members();

        /**
         * The meta object literal for the '<em><b>Default Members</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MEMBER_CONTAINER__DEFAULT_MEMBERS = eINSTANCE.getMemberContainer_DefaultMembers();

        /**
         * The meta object literal for the '<em><b>Get Contained Classifier</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation MEMBER_CONTAINER___GET_CONTAINED_CLASSIFIER__STRING = eINSTANCE
                .getMemberContainer__GetContainedClassifier__String();

        /**
         * The meta object literal for the '<em><b>Get Contained Field</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation MEMBER_CONTAINER___GET_CONTAINED_FIELD__STRING = eINSTANCE
                .getMemberContainer__GetContainedField__String();

        /**
         * The meta object literal for the '<em><b>Get Contained Method</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation MEMBER_CONTAINER___GET_CONTAINED_METHOD__STRING = eINSTANCE
                .getMemberContainer__GetContainedMethod__String();

        /**
         * The meta object literal for the '<em><b>Get Methods</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation MEMBER_CONTAINER___GET_METHODS = eINSTANCE.getMemberContainer__GetMethods();

        /**
         * The meta object literal for the '<em><b>Remove Methods</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation MEMBER_CONTAINER___REMOVE_METHODS__STRING = eINSTANCE.getMemberContainer__RemoveMethods__String();

        /**
         * The meta object literal for the '<em><b>Get Members By Name</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation MEMBER_CONTAINER___GET_MEMBERS_BY_NAME__STRING = eINSTANCE
                .getMemberContainer__GetMembersByName__String();

        /**
         * The meta object literal for the '<em><b>Create Field</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation MEMBER_CONTAINER___CREATE_FIELD__STRING_STRING = eINSTANCE
                .getMemberContainer__CreateField__String_String();

        /**
         * The meta object literal for the '<em><b>Get Fields</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation MEMBER_CONTAINER___GET_FIELDS = eINSTANCE.getMemberContainer__GetFields();

        /**
         * The meta object literal for the '<em><b>Get Constructors</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation MEMBER_CONTAINER___GET_CONSTRUCTORS = eINSTANCE.getMemberContainer__GetConstructors();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.members.impl.AdditionalFieldImpl <em>Additional Field</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.members.impl.AdditionalFieldImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.members.impl.MembersPackageImpl#getAdditionalField()
         * @generated
         */
        EClass ADDITIONAL_FIELD = eINSTANCE.getAdditionalField();

        /**
         * The meta object literal for the '<em><b>Get Array Dimension</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation ADDITIONAL_FIELD___GET_ARRAY_DIMENSION = eINSTANCE.getAdditionalField__GetArrayDimension();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.members.impl.ConstructorImpl <em>Constructor</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.members.impl.ConstructorImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.members.impl.MembersPackageImpl#getConstructor()
         * @generated
         */
        EClass CONSTRUCTOR = eINSTANCE.getConstructor();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.members.impl.EmptyMemberImpl <em>Empty Member</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.members.impl.EmptyMemberImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.members.impl.MembersPackageImpl#getEmptyMember()
         * @generated
         */
        EClass EMPTY_MEMBER = eINSTANCE.getEmptyMember();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.members.impl.FieldImpl <em>Field</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.members.impl.FieldImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.members.impl.MembersPackageImpl#getField()
         * @generated
         */
        EClass FIELD = eINSTANCE.getField();

        /**
         * The meta object literal for the '<em><b>Additional Fields</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FIELD__ADDITIONAL_FIELDS = eINSTANCE.getField_AdditionalFields();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.members.impl.MethodImpl <em>Method</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.members.impl.MethodImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.members.impl.MembersPackageImpl#getMethod()
         * @generated
         */
        EClass METHOD = eINSTANCE.getMethod();

        /**
         * The meta object literal for the '<em><b>Is Method For Call</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation METHOD___IS_METHOD_FOR_CALL__METHODCALL_BOOLEAN = eINSTANCE
                .getMethod__IsMethodForCall__MethodCall_boolean();

        /**
         * The meta object literal for the '<em><b>Is Some Method For Call</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation METHOD___IS_SOME_METHOD_FOR_CALL__METHODCALL = eINSTANCE
                .getMethod__IsSomeMethodForCall__MethodCall();

        /**
         * The meta object literal for the '<em><b>Is Better Method For Call</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation METHOD___IS_BETTER_METHOD_FOR_CALL__METHOD_METHODCALL = eINSTANCE
                .getMethod__IsBetterMethodForCall__Method_MethodCall();

        /**
         * The meta object literal for the '<em><b>Get Array Dimension</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation METHOD___GET_ARRAY_DIMENSION = eINSTANCE.getMethod__GetArrayDimension();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.members.impl.InterfaceMethodImpl <em>Interface Method</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.members.impl.InterfaceMethodImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.members.impl.MembersPackageImpl#getInterfaceMethod()
         * @generated
         */
        EClass INTERFACE_METHOD = eINSTANCE.getInterfaceMethod();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.members.impl.ClassMethodImpl <em>Class Method</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.members.impl.ClassMethodImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.members.impl.MembersPackageImpl#getClassMethod()
         * @generated
         */
        EClass CLASS_METHOD = eINSTANCE.getClassMethod();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.members.impl.EnumConstantImpl <em>Enum Constant</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.members.impl.EnumConstantImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.members.impl.MembersPackageImpl#getEnumConstant()
         * @generated
         */
        EClass ENUM_CONSTANT = eINSTANCE.getEnumConstant();

        /**
         * The meta object literal for the '<em><b>Anonymous Class</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENUM_CONSTANT__ANONYMOUS_CLASS = eINSTANCE.getEnumConstant_AnonymousClass();

    }

} //MembersPackage
