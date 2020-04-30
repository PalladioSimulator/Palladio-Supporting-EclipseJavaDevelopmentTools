/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.imports;

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
 * @see org.palladiosimulator.jdt.metamodel.javamodel.imports.ImportsFactory
 * @model kind="package"
 * @generated
 */
public interface ImportsPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "imports";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.palladiosimulator.org/javamodel/imports";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "imports";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ImportsPackage eINSTANCE = org.palladiosimulator.jdt.metamodel.javamodel.imports.impl.ImportsPackageImpl.init();

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.imports.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.imports.impl.ImportImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.imports.impl.ImportsPackageImpl#getImport()
     * @generated
     */
    int IMPORT = 0;

    /**
     * The feature id for the '<em><b>Namespaces</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT__NAMESPACES = CommonsPackage.NAMESPACE_AWARE_ELEMENT__NAMESPACES;

    /**
     * The number of structural features of the '<em>Import</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT_FEATURE_COUNT = CommonsPackage.NAMESPACE_AWARE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT___GET_CONCRETE_CLASSIFIER__STRING = CommonsPackage.NAMESPACE_AWARE_ELEMENT___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT___GET_CONCRETE_CLASSIFIER_PROXY__STRING = CommonsPackage.NAMESPACE_AWARE_ELEMENT___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT___GET_CONCRETE_CLASSIFIERS__STRING_STRING = CommonsPackage.NAMESPACE_AWARE_ELEMENT___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = CommonsPackage.NAMESPACE_AWARE_ELEMENT___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT___GET_LIB_CLASS__STRING = CommonsPackage.NAMESPACE_AWARE_ELEMENT___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT___GET_LIB_INTERFACE__STRING = CommonsPackage.NAMESPACE_AWARE_ELEMENT___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT___GET_CLASS_CLASS = CommonsPackage.NAMESPACE_AWARE_ELEMENT___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT___GET_OBJECT_CLASS = CommonsPackage.NAMESPACE_AWARE_ELEMENT___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT___GET_STRING_CLASS = CommonsPackage.NAMESPACE_AWARE_ELEMENT___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT___GET_ANNOTATION_INTERFACE = CommonsPackage.NAMESPACE_AWARE_ELEMENT___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT___GET_CONTAINING_ANNOTATION_INSTANCE = CommonsPackage.NAMESPACE_AWARE_ELEMENT___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT___GET_CONTAINING_ANONYMOUS_CLASS = CommonsPackage.NAMESPACE_AWARE_ELEMENT___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT___GET_CONTAINING_CONCRETE_CLASSIFIER = CommonsPackage.NAMESPACE_AWARE_ELEMENT___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT___GET_CONTAINING_COMPILATION_UNIT = CommonsPackage.NAMESPACE_AWARE_ELEMENT___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT___GET_CONTAINING_PACKAGE_NAME = CommonsPackage.NAMESPACE_AWARE_ELEMENT___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT___GET_CONTAINING_CONTAINER_NAME = CommonsPackage.NAMESPACE_AWARE_ELEMENT___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT___GET_PARENT_CONCRETE_CLASSIFIER = CommonsPackage.NAMESPACE_AWARE_ELEMENT___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT___GET_PARENT_BY_ETYPE__ECLASS = CommonsPackage.NAMESPACE_AWARE_ELEMENT___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT___GET_FIRST_CHILD_BY_ETYPE__ECLASS = CommonsPackage.NAMESPACE_AWARE_ELEMENT___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT___GET_PARENT_BY_TYPE__CLASS = CommonsPackage.NAMESPACE_AWARE_ELEMENT___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT___GET_FIRST_CHILD_BY_TYPE__CLASS = CommonsPackage.NAMESPACE_AWARE_ELEMENT___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT___GET_CHILDREN_BY_ETYPE__ECLASS = CommonsPackage.NAMESPACE_AWARE_ELEMENT___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT___GET_CHILDREN_BY_TYPE__CLASS = CommonsPackage.NAMESPACE_AWARE_ELEMENT___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT___GET_COMMENTS = CommonsPackage.NAMESPACE_AWARE_ELEMENT___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = CommonsPackage.NAMESPACE_AWARE_ELEMENT___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = CommonsPackage.NAMESPACE_AWARE_ELEMENT___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Namespaces As String</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT___GET_NAMESPACES_AS_STRING = CommonsPackage.NAMESPACE_AWARE_ELEMENT___GET_NAMESPACES_AS_STRING;

    /**
     * The operation id for the '<em>Get Classifier At Namespaces</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT___GET_CLASSIFIER_AT_NAMESPACES = CommonsPackage.NAMESPACE_AWARE_ELEMENT___GET_CLASSIFIER_AT_NAMESPACES;

    /**
     * The operation id for the '<em>Get Imported Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT___GET_IMPORTED_CLASSIFIER__STRING = CommonsPackage.NAMESPACE_AWARE_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The operation id for the '<em>Get Imported Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT___GET_IMPORTED_CLASSIFIERS = CommonsPackage.NAMESPACE_AWARE_ELEMENT_OPERATION_COUNT + 1;

    /**
     * The operation id for the '<em>Get Imported Members</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT___GET_IMPORTED_MEMBERS = CommonsPackage.NAMESPACE_AWARE_ELEMENT_OPERATION_COUNT + 2;

    /**
     * The number of operations of the '<em>Import</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT_OPERATION_COUNT = CommonsPackage.NAMESPACE_AWARE_ELEMENT_OPERATION_COUNT + 3;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.imports.impl.ImportingElementImpl <em>Importing Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.imports.impl.ImportingElementImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.imports.impl.ImportsPackageImpl#getImportingElement()
     * @generated
     */
    int IMPORTING_ELEMENT = 1;

    /**
     * The feature id for the '<em><b>Imports</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORTING_ELEMENT__IMPORTS = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Importing Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORTING_ELEMENT_FEATURE_COUNT = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORTING_ELEMENT___GET_CONCRETE_CLASSIFIER__STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORTING_ELEMENT___GET_CONCRETE_CLASSIFIER_PROXY__STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORTING_ELEMENT___GET_CONCRETE_CLASSIFIERS__STRING_STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORTING_ELEMENT___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORTING_ELEMENT___GET_LIB_CLASS__STRING = CommonsPackage.COMMENTABLE___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORTING_ELEMENT___GET_LIB_INTERFACE__STRING = CommonsPackage.COMMENTABLE___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORTING_ELEMENT___GET_CLASS_CLASS = CommonsPackage.COMMENTABLE___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORTING_ELEMENT___GET_OBJECT_CLASS = CommonsPackage.COMMENTABLE___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORTING_ELEMENT___GET_STRING_CLASS = CommonsPackage.COMMENTABLE___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORTING_ELEMENT___GET_ANNOTATION_INTERFACE = CommonsPackage.COMMENTABLE___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORTING_ELEMENT___GET_CONTAINING_ANNOTATION_INSTANCE = CommonsPackage.COMMENTABLE___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORTING_ELEMENT___GET_CONTAINING_ANONYMOUS_CLASS = CommonsPackage.COMMENTABLE___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORTING_ELEMENT___GET_CONTAINING_CONCRETE_CLASSIFIER = CommonsPackage.COMMENTABLE___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORTING_ELEMENT___GET_CONTAINING_COMPILATION_UNIT = CommonsPackage.COMMENTABLE___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORTING_ELEMENT___GET_CONTAINING_PACKAGE_NAME = CommonsPackage.COMMENTABLE___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORTING_ELEMENT___GET_CONTAINING_CONTAINER_NAME = CommonsPackage.COMMENTABLE___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORTING_ELEMENT___GET_PARENT_CONCRETE_CLASSIFIER = CommonsPackage.COMMENTABLE___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORTING_ELEMENT___GET_PARENT_BY_ETYPE__ECLASS = CommonsPackage.COMMENTABLE___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORTING_ELEMENT___GET_FIRST_CHILD_BY_ETYPE__ECLASS = CommonsPackage.COMMENTABLE___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORTING_ELEMENT___GET_PARENT_BY_TYPE__CLASS = CommonsPackage.COMMENTABLE___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORTING_ELEMENT___GET_FIRST_CHILD_BY_TYPE__CLASS = CommonsPackage.COMMENTABLE___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORTING_ELEMENT___GET_CHILDREN_BY_ETYPE__ECLASS = CommonsPackage.COMMENTABLE___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORTING_ELEMENT___GET_CHILDREN_BY_TYPE__CLASS = CommonsPackage.COMMENTABLE___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORTING_ELEMENT___GET_COMMENTS = CommonsPackage.COMMENTABLE___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORTING_ELEMENT___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = CommonsPackage.COMMENTABLE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORTING_ELEMENT___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = CommonsPackage.COMMENTABLE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Default Imports</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORTING_ELEMENT___GET_DEFAULT_IMPORTS = CommonsPackage.COMMENTABLE_OPERATION_COUNT + 0;

    /**
     * The number of operations of the '<em>Importing Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORTING_ELEMENT_OPERATION_COUNT = CommonsPackage.COMMENTABLE_OPERATION_COUNT + 1;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.imports.impl.StaticImportImpl <em>Static Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.imports.impl.StaticImportImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.imports.impl.ImportsPackageImpl#getStaticImport()
     * @generated
     */
    int STATIC_IMPORT = 2;

    /**
     * The feature id for the '<em><b>Namespaces</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_IMPORT__NAMESPACES = IMPORT__NAMESPACES;

    /**
     * The feature id for the '<em><b>Static</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_IMPORT__STATIC = IMPORT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Static Import</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_IMPORT_FEATURE_COUNT = IMPORT_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_IMPORT___GET_CONCRETE_CLASSIFIER__STRING = IMPORT___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_IMPORT___GET_CONCRETE_CLASSIFIER_PROXY__STRING = IMPORT___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_IMPORT___GET_CONCRETE_CLASSIFIERS__STRING_STRING = IMPORT___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_IMPORT___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = IMPORT___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_IMPORT___GET_LIB_CLASS__STRING = IMPORT___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_IMPORT___GET_LIB_INTERFACE__STRING = IMPORT___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_IMPORT___GET_CLASS_CLASS = IMPORT___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_IMPORT___GET_OBJECT_CLASS = IMPORT___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_IMPORT___GET_STRING_CLASS = IMPORT___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_IMPORT___GET_ANNOTATION_INTERFACE = IMPORT___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_IMPORT___GET_CONTAINING_ANNOTATION_INSTANCE = IMPORT___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_IMPORT___GET_CONTAINING_ANONYMOUS_CLASS = IMPORT___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_IMPORT___GET_CONTAINING_CONCRETE_CLASSIFIER = IMPORT___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_IMPORT___GET_CONTAINING_COMPILATION_UNIT = IMPORT___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_IMPORT___GET_CONTAINING_PACKAGE_NAME = IMPORT___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_IMPORT___GET_CONTAINING_CONTAINER_NAME = IMPORT___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_IMPORT___GET_PARENT_CONCRETE_CLASSIFIER = IMPORT___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_IMPORT___GET_PARENT_BY_ETYPE__ECLASS = IMPORT___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_IMPORT___GET_FIRST_CHILD_BY_ETYPE__ECLASS = IMPORT___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_IMPORT___GET_PARENT_BY_TYPE__CLASS = IMPORT___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_IMPORT___GET_FIRST_CHILD_BY_TYPE__CLASS = IMPORT___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_IMPORT___GET_CHILDREN_BY_ETYPE__ECLASS = IMPORT___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_IMPORT___GET_CHILDREN_BY_TYPE__CLASS = IMPORT___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_IMPORT___GET_COMMENTS = IMPORT___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_IMPORT___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = IMPORT___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_IMPORT___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = IMPORT___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Namespaces As String</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_IMPORT___GET_NAMESPACES_AS_STRING = IMPORT___GET_NAMESPACES_AS_STRING;

    /**
     * The operation id for the '<em>Get Classifier At Namespaces</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_IMPORT___GET_CLASSIFIER_AT_NAMESPACES = IMPORT___GET_CLASSIFIER_AT_NAMESPACES;

    /**
     * The operation id for the '<em>Get Imported Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_IMPORT___GET_IMPORTED_CLASSIFIER__STRING = IMPORT___GET_IMPORTED_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Imported Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_IMPORT___GET_IMPORTED_CLASSIFIERS = IMPORT___GET_IMPORTED_CLASSIFIERS;

    /**
     * The operation id for the '<em>Get Imported Members</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_IMPORT___GET_IMPORTED_MEMBERS = IMPORT___GET_IMPORTED_MEMBERS;

    /**
     * The number of operations of the '<em>Static Import</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_IMPORT_OPERATION_COUNT = IMPORT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.imports.impl.ClassifierImportImpl <em>Classifier Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.imports.impl.ClassifierImportImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.imports.impl.ImportsPackageImpl#getClassifierImport()
     * @generated
     */
    int CLASSIFIER_IMPORT = 3;

    /**
     * The feature id for the '<em><b>Namespaces</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_IMPORT__NAMESPACES = IMPORT__NAMESPACES;

    /**
     * The feature id for the '<em><b>Classifier</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_IMPORT__CLASSIFIER = IMPORT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Classifier Import</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_IMPORT_FEATURE_COUNT = IMPORT_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_IMPORT___GET_CONCRETE_CLASSIFIER__STRING = IMPORT___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_IMPORT___GET_CONCRETE_CLASSIFIER_PROXY__STRING = IMPORT___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_IMPORT___GET_CONCRETE_CLASSIFIERS__STRING_STRING = IMPORT___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_IMPORT___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = IMPORT___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_IMPORT___GET_LIB_CLASS__STRING = IMPORT___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_IMPORT___GET_LIB_INTERFACE__STRING = IMPORT___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_IMPORT___GET_CLASS_CLASS = IMPORT___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_IMPORT___GET_OBJECT_CLASS = IMPORT___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_IMPORT___GET_STRING_CLASS = IMPORT___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_IMPORT___GET_ANNOTATION_INTERFACE = IMPORT___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_IMPORT___GET_CONTAINING_ANNOTATION_INSTANCE = IMPORT___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_IMPORT___GET_CONTAINING_ANONYMOUS_CLASS = IMPORT___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_IMPORT___GET_CONTAINING_CONCRETE_CLASSIFIER = IMPORT___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_IMPORT___GET_CONTAINING_COMPILATION_UNIT = IMPORT___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_IMPORT___GET_CONTAINING_PACKAGE_NAME = IMPORT___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_IMPORT___GET_CONTAINING_CONTAINER_NAME = IMPORT___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_IMPORT___GET_PARENT_CONCRETE_CLASSIFIER = IMPORT___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_IMPORT___GET_PARENT_BY_ETYPE__ECLASS = IMPORT___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_IMPORT___GET_FIRST_CHILD_BY_ETYPE__ECLASS = IMPORT___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_IMPORT___GET_PARENT_BY_TYPE__CLASS = IMPORT___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_IMPORT___GET_FIRST_CHILD_BY_TYPE__CLASS = IMPORT___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_IMPORT___GET_CHILDREN_BY_ETYPE__ECLASS = IMPORT___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_IMPORT___GET_CHILDREN_BY_TYPE__CLASS = IMPORT___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_IMPORT___GET_COMMENTS = IMPORT___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_IMPORT___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = IMPORT___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_IMPORT___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = IMPORT___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Namespaces As String</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_IMPORT___GET_NAMESPACES_AS_STRING = IMPORT___GET_NAMESPACES_AS_STRING;

    /**
     * The operation id for the '<em>Get Classifier At Namespaces</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_IMPORT___GET_CLASSIFIER_AT_NAMESPACES = IMPORT___GET_CLASSIFIER_AT_NAMESPACES;

    /**
     * The operation id for the '<em>Get Imported Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_IMPORT___GET_IMPORTED_CLASSIFIER__STRING = IMPORT___GET_IMPORTED_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Imported Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_IMPORT___GET_IMPORTED_CLASSIFIERS = IMPORT___GET_IMPORTED_CLASSIFIERS;

    /**
     * The operation id for the '<em>Get Imported Members</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_IMPORT___GET_IMPORTED_MEMBERS = IMPORT___GET_IMPORTED_MEMBERS;

    /**
     * The number of operations of the '<em>Classifier Import</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_IMPORT_OPERATION_COUNT = IMPORT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.imports.impl.PackageImportImpl <em>Package Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.imports.impl.PackageImportImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.imports.impl.ImportsPackageImpl#getPackageImport()
     * @generated
     */
    int PACKAGE_IMPORT = 4;

    /**
     * The feature id for the '<em><b>Namespaces</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_IMPORT__NAMESPACES = IMPORT__NAMESPACES;

    /**
     * The number of structural features of the '<em>Package Import</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_IMPORT_FEATURE_COUNT = IMPORT_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_IMPORT___GET_CONCRETE_CLASSIFIER__STRING = IMPORT___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_IMPORT___GET_CONCRETE_CLASSIFIER_PROXY__STRING = IMPORT___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_IMPORT___GET_CONCRETE_CLASSIFIERS__STRING_STRING = IMPORT___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_IMPORT___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = IMPORT___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_IMPORT___GET_LIB_CLASS__STRING = IMPORT___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_IMPORT___GET_LIB_INTERFACE__STRING = IMPORT___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_IMPORT___GET_CLASS_CLASS = IMPORT___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_IMPORT___GET_OBJECT_CLASS = IMPORT___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_IMPORT___GET_STRING_CLASS = IMPORT___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_IMPORT___GET_ANNOTATION_INTERFACE = IMPORT___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_IMPORT___GET_CONTAINING_ANNOTATION_INSTANCE = IMPORT___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_IMPORT___GET_CONTAINING_ANONYMOUS_CLASS = IMPORT___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_IMPORT___GET_CONTAINING_CONCRETE_CLASSIFIER = IMPORT___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_IMPORT___GET_CONTAINING_COMPILATION_UNIT = IMPORT___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_IMPORT___GET_CONTAINING_PACKAGE_NAME = IMPORT___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_IMPORT___GET_CONTAINING_CONTAINER_NAME = IMPORT___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_IMPORT___GET_PARENT_CONCRETE_CLASSIFIER = IMPORT___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_IMPORT___GET_PARENT_BY_ETYPE__ECLASS = IMPORT___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_IMPORT___GET_FIRST_CHILD_BY_ETYPE__ECLASS = IMPORT___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_IMPORT___GET_PARENT_BY_TYPE__CLASS = IMPORT___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_IMPORT___GET_FIRST_CHILD_BY_TYPE__CLASS = IMPORT___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_IMPORT___GET_CHILDREN_BY_ETYPE__ECLASS = IMPORT___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_IMPORT___GET_CHILDREN_BY_TYPE__CLASS = IMPORT___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_IMPORT___GET_COMMENTS = IMPORT___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_IMPORT___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = IMPORT___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_IMPORT___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = IMPORT___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Namespaces As String</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_IMPORT___GET_NAMESPACES_AS_STRING = IMPORT___GET_NAMESPACES_AS_STRING;

    /**
     * The operation id for the '<em>Get Classifier At Namespaces</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_IMPORT___GET_CLASSIFIER_AT_NAMESPACES = IMPORT___GET_CLASSIFIER_AT_NAMESPACES;

    /**
     * The operation id for the '<em>Get Imported Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_IMPORT___GET_IMPORTED_CLASSIFIER__STRING = IMPORT___GET_IMPORTED_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Imported Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_IMPORT___GET_IMPORTED_CLASSIFIERS = IMPORT___GET_IMPORTED_CLASSIFIERS;

    /**
     * The operation id for the '<em>Get Imported Members</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_IMPORT___GET_IMPORTED_MEMBERS = IMPORT___GET_IMPORTED_MEMBERS;

    /**
     * The number of operations of the '<em>Package Import</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_IMPORT_OPERATION_COUNT = IMPORT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.imports.impl.StaticClassifierImportImpl <em>Static Classifier Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.imports.impl.StaticClassifierImportImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.imports.impl.ImportsPackageImpl#getStaticClassifierImport()
     * @generated
     */
    int STATIC_CLASSIFIER_IMPORT = 5;

    /**
     * The feature id for the '<em><b>Namespaces</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_CLASSIFIER_IMPORT__NAMESPACES = STATIC_IMPORT__NAMESPACES;

    /**
     * The feature id for the '<em><b>Static</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_CLASSIFIER_IMPORT__STATIC = STATIC_IMPORT__STATIC;

    /**
     * The number of structural features of the '<em>Static Classifier Import</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_CLASSIFIER_IMPORT_FEATURE_COUNT = STATIC_IMPORT_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_CLASSIFIER_IMPORT___GET_CONCRETE_CLASSIFIER__STRING = STATIC_IMPORT___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_CLASSIFIER_IMPORT___GET_CONCRETE_CLASSIFIER_PROXY__STRING = STATIC_IMPORT___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_CLASSIFIER_IMPORT___GET_CONCRETE_CLASSIFIERS__STRING_STRING = STATIC_IMPORT___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_CLASSIFIER_IMPORT___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = STATIC_IMPORT___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_CLASSIFIER_IMPORT___GET_LIB_CLASS__STRING = STATIC_IMPORT___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_CLASSIFIER_IMPORT___GET_LIB_INTERFACE__STRING = STATIC_IMPORT___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_CLASSIFIER_IMPORT___GET_CLASS_CLASS = STATIC_IMPORT___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_CLASSIFIER_IMPORT___GET_OBJECT_CLASS = STATIC_IMPORT___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_CLASSIFIER_IMPORT___GET_STRING_CLASS = STATIC_IMPORT___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_CLASSIFIER_IMPORT___GET_ANNOTATION_INTERFACE = STATIC_IMPORT___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_CLASSIFIER_IMPORT___GET_CONTAINING_ANNOTATION_INSTANCE = STATIC_IMPORT___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_CLASSIFIER_IMPORT___GET_CONTAINING_ANONYMOUS_CLASS = STATIC_IMPORT___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_CLASSIFIER_IMPORT___GET_CONTAINING_CONCRETE_CLASSIFIER = STATIC_IMPORT___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_CLASSIFIER_IMPORT___GET_CONTAINING_COMPILATION_UNIT = STATIC_IMPORT___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_CLASSIFIER_IMPORT___GET_CONTAINING_PACKAGE_NAME = STATIC_IMPORT___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_CLASSIFIER_IMPORT___GET_CONTAINING_CONTAINER_NAME = STATIC_IMPORT___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_CLASSIFIER_IMPORT___GET_PARENT_CONCRETE_CLASSIFIER = STATIC_IMPORT___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_CLASSIFIER_IMPORT___GET_PARENT_BY_ETYPE__ECLASS = STATIC_IMPORT___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_CLASSIFIER_IMPORT___GET_FIRST_CHILD_BY_ETYPE__ECLASS = STATIC_IMPORT___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_CLASSIFIER_IMPORT___GET_PARENT_BY_TYPE__CLASS = STATIC_IMPORT___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_CLASSIFIER_IMPORT___GET_FIRST_CHILD_BY_TYPE__CLASS = STATIC_IMPORT___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_CLASSIFIER_IMPORT___GET_CHILDREN_BY_ETYPE__ECLASS = STATIC_IMPORT___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_CLASSIFIER_IMPORT___GET_CHILDREN_BY_TYPE__CLASS = STATIC_IMPORT___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_CLASSIFIER_IMPORT___GET_COMMENTS = STATIC_IMPORT___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_CLASSIFIER_IMPORT___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = STATIC_IMPORT___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_CLASSIFIER_IMPORT___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = STATIC_IMPORT___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Namespaces As String</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_CLASSIFIER_IMPORT___GET_NAMESPACES_AS_STRING = STATIC_IMPORT___GET_NAMESPACES_AS_STRING;

    /**
     * The operation id for the '<em>Get Classifier At Namespaces</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_CLASSIFIER_IMPORT___GET_CLASSIFIER_AT_NAMESPACES = STATIC_IMPORT___GET_CLASSIFIER_AT_NAMESPACES;

    /**
     * The operation id for the '<em>Get Imported Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_CLASSIFIER_IMPORT___GET_IMPORTED_CLASSIFIER__STRING = STATIC_IMPORT___GET_IMPORTED_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Imported Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_CLASSIFIER_IMPORT___GET_IMPORTED_CLASSIFIERS = STATIC_IMPORT___GET_IMPORTED_CLASSIFIERS;

    /**
     * The operation id for the '<em>Get Imported Members</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_CLASSIFIER_IMPORT___GET_IMPORTED_MEMBERS = STATIC_IMPORT___GET_IMPORTED_MEMBERS;

    /**
     * The number of operations of the '<em>Static Classifier Import</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_CLASSIFIER_IMPORT_OPERATION_COUNT = STATIC_IMPORT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.imports.impl.StaticMemberImportImpl <em>Static Member Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.imports.impl.StaticMemberImportImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.imports.impl.ImportsPackageImpl#getStaticMemberImport()
     * @generated
     */
    int STATIC_MEMBER_IMPORT = 6;

    /**
     * The feature id for the '<em><b>Namespaces</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_MEMBER_IMPORT__NAMESPACES = STATIC_IMPORT__NAMESPACES;

    /**
     * The feature id for the '<em><b>Static</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_MEMBER_IMPORT__STATIC = STATIC_IMPORT__STATIC;

    /**
     * The feature id for the '<em><b>Static Members</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_MEMBER_IMPORT__STATIC_MEMBERS = STATIC_IMPORT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Static Member Import</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_MEMBER_IMPORT_FEATURE_COUNT = STATIC_IMPORT_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_MEMBER_IMPORT___GET_CONCRETE_CLASSIFIER__STRING = STATIC_IMPORT___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_MEMBER_IMPORT___GET_CONCRETE_CLASSIFIER_PROXY__STRING = STATIC_IMPORT___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_MEMBER_IMPORT___GET_CONCRETE_CLASSIFIERS__STRING_STRING = STATIC_IMPORT___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_MEMBER_IMPORT___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = STATIC_IMPORT___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_MEMBER_IMPORT___GET_LIB_CLASS__STRING = STATIC_IMPORT___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_MEMBER_IMPORT___GET_LIB_INTERFACE__STRING = STATIC_IMPORT___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_MEMBER_IMPORT___GET_CLASS_CLASS = STATIC_IMPORT___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_MEMBER_IMPORT___GET_OBJECT_CLASS = STATIC_IMPORT___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_MEMBER_IMPORT___GET_STRING_CLASS = STATIC_IMPORT___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_MEMBER_IMPORT___GET_ANNOTATION_INTERFACE = STATIC_IMPORT___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_MEMBER_IMPORT___GET_CONTAINING_ANNOTATION_INSTANCE = STATIC_IMPORT___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_MEMBER_IMPORT___GET_CONTAINING_ANONYMOUS_CLASS = STATIC_IMPORT___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_MEMBER_IMPORT___GET_CONTAINING_CONCRETE_CLASSIFIER = STATIC_IMPORT___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_MEMBER_IMPORT___GET_CONTAINING_COMPILATION_UNIT = STATIC_IMPORT___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_MEMBER_IMPORT___GET_CONTAINING_PACKAGE_NAME = STATIC_IMPORT___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_MEMBER_IMPORT___GET_CONTAINING_CONTAINER_NAME = STATIC_IMPORT___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_MEMBER_IMPORT___GET_PARENT_CONCRETE_CLASSIFIER = STATIC_IMPORT___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_MEMBER_IMPORT___GET_PARENT_BY_ETYPE__ECLASS = STATIC_IMPORT___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_MEMBER_IMPORT___GET_FIRST_CHILD_BY_ETYPE__ECLASS = STATIC_IMPORT___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_MEMBER_IMPORT___GET_PARENT_BY_TYPE__CLASS = STATIC_IMPORT___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_MEMBER_IMPORT___GET_FIRST_CHILD_BY_TYPE__CLASS = STATIC_IMPORT___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_MEMBER_IMPORT___GET_CHILDREN_BY_ETYPE__ECLASS = STATIC_IMPORT___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_MEMBER_IMPORT___GET_CHILDREN_BY_TYPE__CLASS = STATIC_IMPORT___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_MEMBER_IMPORT___GET_COMMENTS = STATIC_IMPORT___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_MEMBER_IMPORT___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = STATIC_IMPORT___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_MEMBER_IMPORT___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = STATIC_IMPORT___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Namespaces As String</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_MEMBER_IMPORT___GET_NAMESPACES_AS_STRING = STATIC_IMPORT___GET_NAMESPACES_AS_STRING;

    /**
     * The operation id for the '<em>Get Classifier At Namespaces</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_MEMBER_IMPORT___GET_CLASSIFIER_AT_NAMESPACES = STATIC_IMPORT___GET_CLASSIFIER_AT_NAMESPACES;

    /**
     * The operation id for the '<em>Get Imported Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_MEMBER_IMPORT___GET_IMPORTED_CLASSIFIER__STRING = STATIC_IMPORT___GET_IMPORTED_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Imported Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_MEMBER_IMPORT___GET_IMPORTED_CLASSIFIERS = STATIC_IMPORT___GET_IMPORTED_CLASSIFIERS;

    /**
     * The operation id for the '<em>Get Imported Members</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_MEMBER_IMPORT___GET_IMPORTED_MEMBERS = STATIC_IMPORT___GET_IMPORTED_MEMBERS;

    /**
     * The number of operations of the '<em>Static Member Import</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_MEMBER_IMPORT_OPERATION_COUNT = STATIC_IMPORT_OPERATION_COUNT + 0;

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.imports.Import <em>Import</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Import</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.imports.Import
     * @generated
     */
    EClass getImport();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.imports.Import#getImportedClassifier(java.lang.String) <em>Get Imported Classifier</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Imported Classifier</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.imports.Import#getImportedClassifier(java.lang.String)
     * @generated
     */
    EOperation getImport__GetImportedClassifier__String();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.imports.Import#getImportedClassifiers() <em>Get Imported Classifiers</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Imported Classifiers</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.imports.Import#getImportedClassifiers()
     * @generated
     */
    EOperation getImport__GetImportedClassifiers();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.imports.Import#getImportedMembers() <em>Get Imported Members</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Imported Members</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.imports.Import#getImportedMembers()
     * @generated
     */
    EOperation getImport__GetImportedMembers();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.imports.ImportingElement <em>Importing Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Importing Element</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.imports.ImportingElement
     * @generated
     */
    EClass getImportingElement();

    /**
     * Returns the meta object for the containment reference list '{@link org.palladiosimulator.jdt.metamodel.javamodel.imports.ImportingElement#getImports <em>Imports</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Imports</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.imports.ImportingElement#getImports()
     * @see #getImportingElement()
     * @generated
     */
    EReference getImportingElement_Imports();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.imports.ImportingElement#getDefaultImports() <em>Get Default Imports</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Default Imports</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.imports.ImportingElement#getDefaultImports()
     * @generated
     */
    EOperation getImportingElement__GetDefaultImports();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.imports.StaticImport <em>Static Import</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Static Import</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.imports.StaticImport
     * @generated
     */
    EClass getStaticImport();

    /**
     * Returns the meta object for the containment reference '{@link org.palladiosimulator.jdt.metamodel.javamodel.imports.StaticImport#getStatic <em>Static</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Static</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.imports.StaticImport#getStatic()
     * @see #getStaticImport()
     * @generated
     */
    EReference getStaticImport_Static();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.imports.ClassifierImport <em>Classifier Import</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Classifier Import</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.imports.ClassifierImport
     * @generated
     */
    EClass getClassifierImport();

    /**
     * Returns the meta object for the reference '{@link org.palladiosimulator.jdt.metamodel.javamodel.imports.ClassifierImport#getClassifier <em>Classifier</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Classifier</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.imports.ClassifierImport#getClassifier()
     * @see #getClassifierImport()
     * @generated
     */
    EReference getClassifierImport_Classifier();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.imports.PackageImport <em>Package Import</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Package Import</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.imports.PackageImport
     * @generated
     */
    EClass getPackageImport();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.imports.StaticClassifierImport <em>Static Classifier Import</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Static Classifier Import</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.imports.StaticClassifierImport
     * @generated
     */
    EClass getStaticClassifierImport();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.imports.StaticMemberImport <em>Static Member Import</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Static Member Import</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.imports.StaticMemberImport
     * @generated
     */
    EClass getStaticMemberImport();

    /**
     * Returns the meta object for the reference list '{@link org.palladiosimulator.jdt.metamodel.javamodel.imports.StaticMemberImport#getStaticMembers <em>Static Members</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Static Members</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.imports.StaticMemberImport#getStaticMembers()
     * @see #getStaticMemberImport()
     * @generated
     */
    EReference getStaticMemberImport_StaticMembers();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    ImportsFactory getImportsFactory();

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
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.imports.impl.ImportImpl <em>Import</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.imports.impl.ImportImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.imports.impl.ImportsPackageImpl#getImport()
         * @generated
         */
        EClass IMPORT = eINSTANCE.getImport();

        /**
         * The meta object literal for the '<em><b>Get Imported Classifier</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation IMPORT___GET_IMPORTED_CLASSIFIER__STRING = eINSTANCE.getImport__GetImportedClassifier__String();

        /**
         * The meta object literal for the '<em><b>Get Imported Classifiers</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation IMPORT___GET_IMPORTED_CLASSIFIERS = eINSTANCE.getImport__GetImportedClassifiers();

        /**
         * The meta object literal for the '<em><b>Get Imported Members</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation IMPORT___GET_IMPORTED_MEMBERS = eINSTANCE.getImport__GetImportedMembers();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.imports.impl.ImportingElementImpl <em>Importing Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.imports.impl.ImportingElementImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.imports.impl.ImportsPackageImpl#getImportingElement()
         * @generated
         */
        EClass IMPORTING_ELEMENT = eINSTANCE.getImportingElement();

        /**
         * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference IMPORTING_ELEMENT__IMPORTS = eINSTANCE.getImportingElement_Imports();

        /**
         * The meta object literal for the '<em><b>Get Default Imports</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation IMPORTING_ELEMENT___GET_DEFAULT_IMPORTS = eINSTANCE.getImportingElement__GetDefaultImports();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.imports.impl.StaticImportImpl <em>Static Import</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.imports.impl.StaticImportImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.imports.impl.ImportsPackageImpl#getStaticImport()
         * @generated
         */
        EClass STATIC_IMPORT = eINSTANCE.getStaticImport();

        /**
         * The meta object literal for the '<em><b>Static</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference STATIC_IMPORT__STATIC = eINSTANCE.getStaticImport_Static();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.imports.impl.ClassifierImportImpl <em>Classifier Import</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.imports.impl.ClassifierImportImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.imports.impl.ImportsPackageImpl#getClassifierImport()
         * @generated
         */
        EClass CLASSIFIER_IMPORT = eINSTANCE.getClassifierImport();

        /**
         * The meta object literal for the '<em><b>Classifier</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CLASSIFIER_IMPORT__CLASSIFIER = eINSTANCE.getClassifierImport_Classifier();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.imports.impl.PackageImportImpl <em>Package Import</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.imports.impl.PackageImportImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.imports.impl.ImportsPackageImpl#getPackageImport()
         * @generated
         */
        EClass PACKAGE_IMPORT = eINSTANCE.getPackageImport();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.imports.impl.StaticClassifierImportImpl <em>Static Classifier Import</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.imports.impl.StaticClassifierImportImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.imports.impl.ImportsPackageImpl#getStaticClassifierImport()
         * @generated
         */
        EClass STATIC_CLASSIFIER_IMPORT = eINSTANCE.getStaticClassifierImport();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.imports.impl.StaticMemberImportImpl <em>Static Member Import</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.imports.impl.StaticMemberImportImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.imports.impl.ImportsPackageImpl#getStaticMemberImport()
         * @generated
         */
        EClass STATIC_MEMBER_IMPORT = eINSTANCE.getStaticMemberImport();

        /**
         * The meta object literal for the '<em><b>Static Members</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference STATIC_MEMBER_IMPORT__STATIC_MEMBERS = eINSTANCE.getStaticMemberImport_StaticMembers();

    }

} //ImportsPackage
