/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.containers;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see org.palladiosimulator.jdt.metamodel.javamodel.containers.ContainersFactory
 * @model kind="package"
 * @generated
 */
public interface ContainersPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "containers";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.palladiosimulator.org/javamodel/containers";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "containers";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ContainersPackage eINSTANCE = org.palladiosimulator.jdt.metamodel.javamodel.containers.impl.ContainersPackageImpl
            .init();

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.containers.impl.JavaRootImpl <em>Java Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.containers.impl.JavaRootImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.containers.impl.ContainersPackageImpl#getJavaRoot()
     * @generated
     */
    int JAVA_ROOT = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_ROOT__NAME = CommonsPackage.NAMED_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Namespaces</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_ROOT__NAMESPACES = CommonsPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Imports</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_ROOT__IMPORTS = CommonsPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Java Root</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_ROOT_FEATURE_COUNT = CommonsPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_ROOT___GET_CONCRETE_CLASSIFIER__STRING = CommonsPackage.NAMED_ELEMENT___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_ROOT___GET_CONCRETE_CLASSIFIER_PROXY__STRING = CommonsPackage.NAMED_ELEMENT___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_ROOT___GET_CONCRETE_CLASSIFIERS__STRING_STRING = CommonsPackage.NAMED_ELEMENT___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_ROOT___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = CommonsPackage.NAMED_ELEMENT___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_ROOT___GET_LIB_CLASS__STRING = CommonsPackage.NAMED_ELEMENT___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_ROOT___GET_LIB_INTERFACE__STRING = CommonsPackage.NAMED_ELEMENT___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_ROOT___GET_CLASS_CLASS = CommonsPackage.NAMED_ELEMENT___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_ROOT___GET_OBJECT_CLASS = CommonsPackage.NAMED_ELEMENT___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_ROOT___GET_STRING_CLASS = CommonsPackage.NAMED_ELEMENT___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_ROOT___GET_ANNOTATION_INTERFACE = CommonsPackage.NAMED_ELEMENT___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_ROOT___GET_CONTAINING_ANNOTATION_INSTANCE = CommonsPackage.NAMED_ELEMENT___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_ROOT___GET_CONTAINING_ANONYMOUS_CLASS = CommonsPackage.NAMED_ELEMENT___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_ROOT___GET_CONTAINING_CONCRETE_CLASSIFIER = CommonsPackage.NAMED_ELEMENT___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_ROOT___GET_CONTAINING_COMPILATION_UNIT = CommonsPackage.NAMED_ELEMENT___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_ROOT___GET_CONTAINING_PACKAGE_NAME = CommonsPackage.NAMED_ELEMENT___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_ROOT___GET_CONTAINING_CONTAINER_NAME = CommonsPackage.NAMED_ELEMENT___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_ROOT___GET_PARENT_CONCRETE_CLASSIFIER = CommonsPackage.NAMED_ELEMENT___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_ROOT___GET_PARENT_BY_ETYPE__ECLASS = CommonsPackage.NAMED_ELEMENT___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_ROOT___GET_FIRST_CHILD_BY_ETYPE__ECLASS = CommonsPackage.NAMED_ELEMENT___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_ROOT___GET_PARENT_BY_TYPE__CLASS = CommonsPackage.NAMED_ELEMENT___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_ROOT___GET_FIRST_CHILD_BY_TYPE__CLASS = CommonsPackage.NAMED_ELEMENT___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_ROOT___GET_CHILDREN_BY_ETYPE__ECLASS = CommonsPackage.NAMED_ELEMENT___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_ROOT___GET_CHILDREN_BY_TYPE__CLASS = CommonsPackage.NAMED_ELEMENT___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_ROOT___GET_COMMENTS = CommonsPackage.NAMED_ELEMENT___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_ROOT___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = CommonsPackage.NAMED_ELEMENT___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_ROOT___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = CommonsPackage.NAMED_ELEMENT___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Namespaces As String</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_ROOT___GET_NAMESPACES_AS_STRING = CommonsPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The operation id for the '<em>Get Classifier At Namespaces</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_ROOT___GET_CLASSIFIER_AT_NAMESPACES = CommonsPackage.NAMED_ELEMENT_OPERATION_COUNT + 1;

    /**
     * The operation id for the '<em>Get Default Imports</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_ROOT___GET_DEFAULT_IMPORTS = CommonsPackage.NAMED_ELEMENT_OPERATION_COUNT + 2;

    /**
     * The operation id for the '<em>Get Classifiers In Same Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_ROOT___GET_CLASSIFIERS_IN_SAME_PACKAGE = CommonsPackage.NAMED_ELEMENT_OPERATION_COUNT + 3;

    /**
     * The number of operations of the '<em>Java Root</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JAVA_ROOT_OPERATION_COUNT = CommonsPackage.NAMED_ELEMENT_OPERATION_COUNT + 4;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.containers.impl.CompilationUnitImpl <em>Compilation Unit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.containers.impl.CompilationUnitImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.containers.impl.ContainersPackageImpl#getCompilationUnit()
     * @generated
     */
    int COMPILATION_UNIT = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPILATION_UNIT__NAME = JAVA_ROOT__NAME;

    /**
     * The feature id for the '<em><b>Namespaces</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPILATION_UNIT__NAMESPACES = JAVA_ROOT__NAMESPACES;

    /**
     * The feature id for the '<em><b>Imports</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPILATION_UNIT__IMPORTS = JAVA_ROOT__IMPORTS;

    /**
     * The feature id for the '<em><b>Classifiers</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPILATION_UNIT__CLASSIFIERS = JAVA_ROOT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Compilation Unit</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPILATION_UNIT_FEATURE_COUNT = JAVA_ROOT_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPILATION_UNIT___GET_CONCRETE_CLASSIFIER__STRING = JAVA_ROOT___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPILATION_UNIT___GET_CONCRETE_CLASSIFIER_PROXY__STRING = JAVA_ROOT___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPILATION_UNIT___GET_CONCRETE_CLASSIFIERS__STRING_STRING = JAVA_ROOT___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPILATION_UNIT___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = JAVA_ROOT___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPILATION_UNIT___GET_LIB_CLASS__STRING = JAVA_ROOT___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPILATION_UNIT___GET_LIB_INTERFACE__STRING = JAVA_ROOT___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPILATION_UNIT___GET_CLASS_CLASS = JAVA_ROOT___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPILATION_UNIT___GET_OBJECT_CLASS = JAVA_ROOT___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPILATION_UNIT___GET_STRING_CLASS = JAVA_ROOT___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPILATION_UNIT___GET_ANNOTATION_INTERFACE = JAVA_ROOT___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPILATION_UNIT___GET_CONTAINING_ANNOTATION_INSTANCE = JAVA_ROOT___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPILATION_UNIT___GET_CONTAINING_ANONYMOUS_CLASS = JAVA_ROOT___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPILATION_UNIT___GET_CONTAINING_CONCRETE_CLASSIFIER = JAVA_ROOT___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPILATION_UNIT___GET_CONTAINING_COMPILATION_UNIT = JAVA_ROOT___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPILATION_UNIT___GET_CONTAINING_PACKAGE_NAME = JAVA_ROOT___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPILATION_UNIT___GET_CONTAINING_CONTAINER_NAME = JAVA_ROOT___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPILATION_UNIT___GET_PARENT_CONCRETE_CLASSIFIER = JAVA_ROOT___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPILATION_UNIT___GET_PARENT_BY_ETYPE__ECLASS = JAVA_ROOT___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPILATION_UNIT___GET_FIRST_CHILD_BY_ETYPE__ECLASS = JAVA_ROOT___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPILATION_UNIT___GET_PARENT_BY_TYPE__CLASS = JAVA_ROOT___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPILATION_UNIT___GET_FIRST_CHILD_BY_TYPE__CLASS = JAVA_ROOT___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPILATION_UNIT___GET_CHILDREN_BY_ETYPE__ECLASS = JAVA_ROOT___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPILATION_UNIT___GET_CHILDREN_BY_TYPE__CLASS = JAVA_ROOT___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPILATION_UNIT___GET_COMMENTS = JAVA_ROOT___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPILATION_UNIT___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = JAVA_ROOT___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPILATION_UNIT___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = JAVA_ROOT___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Namespaces As String</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPILATION_UNIT___GET_NAMESPACES_AS_STRING = JAVA_ROOT___GET_NAMESPACES_AS_STRING;

    /**
     * The operation id for the '<em>Get Classifier At Namespaces</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPILATION_UNIT___GET_CLASSIFIER_AT_NAMESPACES = JAVA_ROOT___GET_CLASSIFIER_AT_NAMESPACES;

    /**
     * The operation id for the '<em>Get Default Imports</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPILATION_UNIT___GET_DEFAULT_IMPORTS = JAVA_ROOT___GET_DEFAULT_IMPORTS;

    /**
     * The operation id for the '<em>Get Contained Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPILATION_UNIT___GET_CONTAINED_CLASSIFIER__STRING = JAVA_ROOT_OPERATION_COUNT + 0;

    /**
     * The operation id for the '<em>Get Classifiers In Same Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPILATION_UNIT___GET_CLASSIFIERS_IN_SAME_PACKAGE = JAVA_ROOT_OPERATION_COUNT + 1;

    /**
     * The operation id for the '<em>Get Contained Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPILATION_UNIT___GET_CONTAINED_CLASS = JAVA_ROOT_OPERATION_COUNT + 2;

    /**
     * The operation id for the '<em>Get Contained Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPILATION_UNIT___GET_CONTAINED_INTERFACE = JAVA_ROOT_OPERATION_COUNT + 3;

    /**
     * The operation id for the '<em>Get Contained Annotation</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPILATION_UNIT___GET_CONTAINED_ANNOTATION = JAVA_ROOT_OPERATION_COUNT + 4;

    /**
     * The operation id for the '<em>Get Contained Enumeration</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPILATION_UNIT___GET_CONTAINED_ENUMERATION = JAVA_ROOT_OPERATION_COUNT + 5;

    /**
     * The operation id for the '<em>Add Import</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPILATION_UNIT___ADD_IMPORT__STRING = JAVA_ROOT_OPERATION_COUNT + 6;

    /**
     * The operation id for the '<em>Add Package Import</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPILATION_UNIT___ADD_PACKAGE_IMPORT__STRING = JAVA_ROOT_OPERATION_COUNT + 7;

    /**
     * The number of operations of the '<em>Compilation Unit</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPILATION_UNIT_OPERATION_COUNT = JAVA_ROOT_OPERATION_COUNT + 8;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.containers.impl.PackageImpl <em>Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.containers.impl.PackageImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.containers.impl.ContainersPackageImpl#getPackage()
     * @generated
     */
    int PACKAGE = 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE__NAME = JAVA_ROOT__NAME;

    /**
     * The feature id for the '<em><b>Namespaces</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE__NAMESPACES = JAVA_ROOT__NAMESPACES;

    /**
     * The feature id for the '<em><b>Imports</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE__IMPORTS = JAVA_ROOT__IMPORTS;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE__ANNOTATIONS = JAVA_ROOT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Compilation Units</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE__COMPILATION_UNITS = JAVA_ROOT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Package</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_FEATURE_COUNT = JAVA_ROOT_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE___GET_CONCRETE_CLASSIFIER__STRING = JAVA_ROOT___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE___GET_CONCRETE_CLASSIFIER_PROXY__STRING = JAVA_ROOT___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE___GET_CONCRETE_CLASSIFIERS__STRING_STRING = JAVA_ROOT___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = JAVA_ROOT___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE___GET_LIB_CLASS__STRING = JAVA_ROOT___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE___GET_LIB_INTERFACE__STRING = JAVA_ROOT___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE___GET_CLASS_CLASS = JAVA_ROOT___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE___GET_OBJECT_CLASS = JAVA_ROOT___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE___GET_STRING_CLASS = JAVA_ROOT___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE___GET_ANNOTATION_INTERFACE = JAVA_ROOT___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE___GET_CONTAINING_ANNOTATION_INSTANCE = JAVA_ROOT___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE___GET_CONTAINING_ANONYMOUS_CLASS = JAVA_ROOT___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE___GET_CONTAINING_CONCRETE_CLASSIFIER = JAVA_ROOT___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE___GET_CONTAINING_COMPILATION_UNIT = JAVA_ROOT___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE___GET_CONTAINING_PACKAGE_NAME = JAVA_ROOT___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE___GET_CONTAINING_CONTAINER_NAME = JAVA_ROOT___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE___GET_PARENT_CONCRETE_CLASSIFIER = JAVA_ROOT___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE___GET_PARENT_BY_ETYPE__ECLASS = JAVA_ROOT___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE___GET_FIRST_CHILD_BY_ETYPE__ECLASS = JAVA_ROOT___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE___GET_PARENT_BY_TYPE__CLASS = JAVA_ROOT___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE___GET_FIRST_CHILD_BY_TYPE__CLASS = JAVA_ROOT___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE___GET_CHILDREN_BY_ETYPE__ECLASS = JAVA_ROOT___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE___GET_CHILDREN_BY_TYPE__CLASS = JAVA_ROOT___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE___GET_COMMENTS = JAVA_ROOT___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = JAVA_ROOT___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = JAVA_ROOT___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Classifier At Namespaces</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE___GET_CLASSIFIER_AT_NAMESPACES = JAVA_ROOT___GET_CLASSIFIER_AT_NAMESPACES;

    /**
     * The operation id for the '<em>Get Default Imports</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE___GET_DEFAULT_IMPORTS = JAVA_ROOT___GET_DEFAULT_IMPORTS;

    /**
     * The operation id for the '<em>Get Namespaces As String</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE___GET_NAMESPACES_AS_STRING = JAVA_ROOT_OPERATION_COUNT + 0;

    /**
     * The operation id for the '<em>Get Classifiers In Same Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE___GET_CLASSIFIERS_IN_SAME_PACKAGE = JAVA_ROOT_OPERATION_COUNT + 1;

    /**
     * The number of operations of the '<em>Package</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_OPERATION_COUNT = JAVA_ROOT_OPERATION_COUNT + 2;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.containers.impl.EmptyModelImpl <em>Empty Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.containers.impl.EmptyModelImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.containers.impl.ContainersPackageImpl#getEmptyModel()
     * @generated
     */
    int EMPTY_MODEL = 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPTY_MODEL__NAME = JAVA_ROOT__NAME;

    /**
     * The feature id for the '<em><b>Namespaces</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPTY_MODEL__NAMESPACES = JAVA_ROOT__NAMESPACES;

    /**
     * The feature id for the '<em><b>Imports</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPTY_MODEL__IMPORTS = JAVA_ROOT__IMPORTS;

    /**
     * The number of structural features of the '<em>Empty Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPTY_MODEL_FEATURE_COUNT = JAVA_ROOT_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPTY_MODEL___GET_CONCRETE_CLASSIFIER__STRING = JAVA_ROOT___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPTY_MODEL___GET_CONCRETE_CLASSIFIER_PROXY__STRING = JAVA_ROOT___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPTY_MODEL___GET_CONCRETE_CLASSIFIERS__STRING_STRING = JAVA_ROOT___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPTY_MODEL___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = JAVA_ROOT___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPTY_MODEL___GET_LIB_CLASS__STRING = JAVA_ROOT___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPTY_MODEL___GET_LIB_INTERFACE__STRING = JAVA_ROOT___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPTY_MODEL___GET_CLASS_CLASS = JAVA_ROOT___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPTY_MODEL___GET_OBJECT_CLASS = JAVA_ROOT___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPTY_MODEL___GET_STRING_CLASS = JAVA_ROOT___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPTY_MODEL___GET_ANNOTATION_INTERFACE = JAVA_ROOT___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPTY_MODEL___GET_CONTAINING_ANNOTATION_INSTANCE = JAVA_ROOT___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPTY_MODEL___GET_CONTAINING_ANONYMOUS_CLASS = JAVA_ROOT___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPTY_MODEL___GET_CONTAINING_CONCRETE_CLASSIFIER = JAVA_ROOT___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPTY_MODEL___GET_CONTAINING_COMPILATION_UNIT = JAVA_ROOT___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPTY_MODEL___GET_CONTAINING_PACKAGE_NAME = JAVA_ROOT___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPTY_MODEL___GET_CONTAINING_CONTAINER_NAME = JAVA_ROOT___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPTY_MODEL___GET_PARENT_CONCRETE_CLASSIFIER = JAVA_ROOT___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPTY_MODEL___GET_PARENT_BY_ETYPE__ECLASS = JAVA_ROOT___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPTY_MODEL___GET_FIRST_CHILD_BY_ETYPE__ECLASS = JAVA_ROOT___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPTY_MODEL___GET_PARENT_BY_TYPE__CLASS = JAVA_ROOT___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPTY_MODEL___GET_FIRST_CHILD_BY_TYPE__CLASS = JAVA_ROOT___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPTY_MODEL___GET_CHILDREN_BY_ETYPE__ECLASS = JAVA_ROOT___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPTY_MODEL___GET_CHILDREN_BY_TYPE__CLASS = JAVA_ROOT___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPTY_MODEL___GET_COMMENTS = JAVA_ROOT___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPTY_MODEL___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = JAVA_ROOT___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPTY_MODEL___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = JAVA_ROOT___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Namespaces As String</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPTY_MODEL___GET_NAMESPACES_AS_STRING = JAVA_ROOT___GET_NAMESPACES_AS_STRING;

    /**
     * The operation id for the '<em>Get Classifier At Namespaces</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPTY_MODEL___GET_CLASSIFIER_AT_NAMESPACES = JAVA_ROOT___GET_CLASSIFIER_AT_NAMESPACES;

    /**
     * The operation id for the '<em>Get Default Imports</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPTY_MODEL___GET_DEFAULT_IMPORTS = JAVA_ROOT___GET_DEFAULT_IMPORTS;

    /**
     * The operation id for the '<em>Get Classifiers In Same Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPTY_MODEL___GET_CLASSIFIERS_IN_SAME_PACKAGE = JAVA_ROOT___GET_CLASSIFIERS_IN_SAME_PACKAGE;

    /**
     * The number of operations of the '<em>Empty Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMPTY_MODEL_OPERATION_COUNT = JAVA_ROOT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.containers.impl.ProjectRootImpl <em>Project Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.containers.impl.ProjectRootImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.containers.impl.ContainersPackageImpl#getProjectRoot()
     * @generated
     */
    int PROJECT_ROOT = 4;

    /**
     * The feature id for the '<em><b>Packages</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROJECT_ROOT__PACKAGES = 0;

    /**
     * The feature id for the '<em><b>Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROJECT_ROOT__PATH = 1;

    /**
     * The number of structural features of the '<em>Project Root</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROJECT_ROOT_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Project Root</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROJECT_ROOT_OPERATION_COUNT = 0;

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.containers.JavaRoot <em>Java Root</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Java Root</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.containers.JavaRoot
     * @generated
     */
    EClass getJavaRoot();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.containers.JavaRoot#getClassifiersInSamePackage() <em>Get Classifiers In Same Package</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Classifiers In Same Package</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.containers.JavaRoot#getClassifiersInSamePackage()
     * @generated
     */
    EOperation getJavaRoot__GetClassifiersInSamePackage();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.containers.CompilationUnit <em>Compilation Unit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Compilation Unit</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.containers.CompilationUnit
     * @generated
     */
    EClass getCompilationUnit();

    /**
     * Returns the meta object for the containment reference list '{@link org.palladiosimulator.jdt.metamodel.javamodel.containers.CompilationUnit#getClassifiers <em>Classifiers</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Classifiers</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.containers.CompilationUnit#getClassifiers()
     * @see #getCompilationUnit()
     * @generated
     */
    EReference getCompilationUnit_Classifiers();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.containers.CompilationUnit#getContainedClassifier(java.lang.String) <em>Get Contained Classifier</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Contained Classifier</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.containers.CompilationUnit#getContainedClassifier(java.lang.String)
     * @generated
     */
    EOperation getCompilationUnit__GetContainedClassifier__String();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.containers.CompilationUnit#getClassifiersInSamePackage() <em>Get Classifiers In Same Package</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Classifiers In Same Package</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.containers.CompilationUnit#getClassifiersInSamePackage()
     * @generated
     */
    EOperation getCompilationUnit__GetClassifiersInSamePackage();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.containers.CompilationUnit#getContainedClass() <em>Get Contained Class</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Contained Class</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.containers.CompilationUnit#getContainedClass()
     * @generated
     */
    EOperation getCompilationUnit__GetContainedClass();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.containers.CompilationUnit#getContainedInterface() <em>Get Contained Interface</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Contained Interface</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.containers.CompilationUnit#getContainedInterface()
     * @generated
     */
    EOperation getCompilationUnit__GetContainedInterface();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.containers.CompilationUnit#getContainedAnnotation() <em>Get Contained Annotation</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Contained Annotation</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.containers.CompilationUnit#getContainedAnnotation()
     * @generated
     */
    EOperation getCompilationUnit__GetContainedAnnotation();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.containers.CompilationUnit#getContainedEnumeration() <em>Get Contained Enumeration</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Contained Enumeration</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.containers.CompilationUnit#getContainedEnumeration()
     * @generated
     */
    EOperation getCompilationUnit__GetContainedEnumeration();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.containers.CompilationUnit#addImport(java.lang.String) <em>Add Import</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Add Import</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.containers.CompilationUnit#addImport(java.lang.String)
     * @generated
     */
    EOperation getCompilationUnit__AddImport__String();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.containers.CompilationUnit#addPackageImport(java.lang.String) <em>Add Package Import</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Add Package Import</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.containers.CompilationUnit#addPackageImport(java.lang.String)
     * @generated
     */
    EOperation getCompilationUnit__AddPackageImport__String();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.containers.Package <em>Package</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Package</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.containers.Package
     * @generated
     */
    EClass getPackage();

    /**
     * Returns the meta object for the containment reference list '{@link org.palladiosimulator.jdt.metamodel.javamodel.containers.Package#getCompilationUnits <em>Compilation Units</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Compilation Units</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.containers.Package#getCompilationUnits()
     * @see #getPackage()
     * @generated
     */
    EReference getPackage_CompilationUnits();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.containers.Package#getNamespacesAsString() <em>Get Namespaces As String</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Namespaces As String</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.containers.Package#getNamespacesAsString()
     * @generated
     */
    EOperation getPackage__GetNamespacesAsString();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.containers.Package#getClassifiersInSamePackage() <em>Get Classifiers In Same Package</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Classifiers In Same Package</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.containers.Package#getClassifiersInSamePackage()
     * @generated
     */
    EOperation getPackage__GetClassifiersInSamePackage();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.containers.EmptyModel <em>Empty Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Empty Model</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.containers.EmptyModel
     * @generated
     */
    EClass getEmptyModel();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.containers.ProjectRoot <em>Project Root</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Project Root</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.containers.ProjectRoot
     * @generated
     */
    EClass getProjectRoot();

    /**
     * Returns the meta object for the containment reference list '{@link org.palladiosimulator.jdt.metamodel.javamodel.containers.ProjectRoot#getPackages <em>Packages</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Packages</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.containers.ProjectRoot#getPackages()
     * @see #getProjectRoot()
     * @generated
     */
    EReference getProjectRoot_Packages();

    /**
     * Returns the meta object for the attribute '{@link org.palladiosimulator.jdt.metamodel.javamodel.containers.ProjectRoot#getPath <em>Path</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Path</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.containers.ProjectRoot#getPath()
     * @see #getProjectRoot()
     * @generated
     */
    EAttribute getProjectRoot_Path();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    ContainersFactory getContainersFactory();

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
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.containers.impl.JavaRootImpl <em>Java Root</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.containers.impl.JavaRootImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.containers.impl.ContainersPackageImpl#getJavaRoot()
         * @generated
         */
        EClass JAVA_ROOT = eINSTANCE.getJavaRoot();

        /**
         * The meta object literal for the '<em><b>Get Classifiers In Same Package</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation JAVA_ROOT___GET_CLASSIFIERS_IN_SAME_PACKAGE = eINSTANCE.getJavaRoot__GetClassifiersInSamePackage();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.containers.impl.CompilationUnitImpl <em>Compilation Unit</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.containers.impl.CompilationUnitImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.containers.impl.ContainersPackageImpl#getCompilationUnit()
         * @generated
         */
        EClass COMPILATION_UNIT = eINSTANCE.getCompilationUnit();

        /**
         * The meta object literal for the '<em><b>Classifiers</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPILATION_UNIT__CLASSIFIERS = eINSTANCE.getCompilationUnit_Classifiers();

        /**
         * The meta object literal for the '<em><b>Get Contained Classifier</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation COMPILATION_UNIT___GET_CONTAINED_CLASSIFIER__STRING = eINSTANCE
                .getCompilationUnit__GetContainedClassifier__String();

        /**
         * The meta object literal for the '<em><b>Get Classifiers In Same Package</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation COMPILATION_UNIT___GET_CLASSIFIERS_IN_SAME_PACKAGE = eINSTANCE
                .getCompilationUnit__GetClassifiersInSamePackage();

        /**
         * The meta object literal for the '<em><b>Get Contained Class</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation COMPILATION_UNIT___GET_CONTAINED_CLASS = eINSTANCE.getCompilationUnit__GetContainedClass();

        /**
         * The meta object literal for the '<em><b>Get Contained Interface</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation COMPILATION_UNIT___GET_CONTAINED_INTERFACE = eINSTANCE.getCompilationUnit__GetContainedInterface();

        /**
         * The meta object literal for the '<em><b>Get Contained Annotation</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation COMPILATION_UNIT___GET_CONTAINED_ANNOTATION = eINSTANCE.getCompilationUnit__GetContainedAnnotation();

        /**
         * The meta object literal for the '<em><b>Get Contained Enumeration</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation COMPILATION_UNIT___GET_CONTAINED_ENUMERATION = eINSTANCE
                .getCompilationUnit__GetContainedEnumeration();

        /**
         * The meta object literal for the '<em><b>Add Import</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation COMPILATION_UNIT___ADD_IMPORT__STRING = eINSTANCE.getCompilationUnit__AddImport__String();

        /**
         * The meta object literal for the '<em><b>Add Package Import</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation COMPILATION_UNIT___ADD_PACKAGE_IMPORT__STRING = eINSTANCE
                .getCompilationUnit__AddPackageImport__String();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.containers.impl.PackageImpl <em>Package</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.containers.impl.PackageImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.containers.impl.ContainersPackageImpl#getPackage()
         * @generated
         */
        EClass PACKAGE = eINSTANCE.getPackage();

        /**
         * The meta object literal for the '<em><b>Compilation Units</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PACKAGE__COMPILATION_UNITS = eINSTANCE.getPackage_CompilationUnits();

        /**
         * The meta object literal for the '<em><b>Get Namespaces As String</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation PACKAGE___GET_NAMESPACES_AS_STRING = eINSTANCE.getPackage__GetNamespacesAsString();

        /**
         * The meta object literal for the '<em><b>Get Classifiers In Same Package</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation PACKAGE___GET_CLASSIFIERS_IN_SAME_PACKAGE = eINSTANCE.getPackage__GetClassifiersInSamePackage();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.containers.impl.EmptyModelImpl <em>Empty Model</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.containers.impl.EmptyModelImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.containers.impl.ContainersPackageImpl#getEmptyModel()
         * @generated
         */
        EClass EMPTY_MODEL = eINSTANCE.getEmptyModel();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.containers.impl.ProjectRootImpl <em>Project Root</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.containers.impl.ProjectRootImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.containers.impl.ContainersPackageImpl#getProjectRoot()
         * @generated
         */
        EClass PROJECT_ROOT = eINSTANCE.getProjectRoot();

        /**
         * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROJECT_ROOT__PACKAGES = eINSTANCE.getProjectRoot_Packages();

        /**
         * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROJECT_ROOT__PATH = eINSTANCE.getProjectRoot_Path();

    }

} //ContainersPackage
