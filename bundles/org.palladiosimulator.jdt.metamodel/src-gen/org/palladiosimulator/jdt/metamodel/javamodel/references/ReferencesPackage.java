/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.references;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see org.palladiosimulator.jdt.metamodel.javamodel.references.ReferencesFactory
 * @model kind="package"
 * @generated
 */
public interface ReferencesPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "references";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.palladiosimulator.org/javamodel/references";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "references";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ReferencesPackage eINSTANCE = org.palladiosimulator.jdt.metamodel.javamodel.references.impl.ReferencesPackageImpl
            .init();

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.references.impl.ReferenceImpl <em>Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.references.impl.ReferenceImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.references.impl.ReferencesPackageImpl#getReference()
     * @generated
     */
    int REFERENCE = 0;

    /**
     * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE__TYPE_ARGUMENTS = ExpressionsPackage.PRIMARY_EXPRESSION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Next</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE__NEXT = ExpressionsPackage.PRIMARY_EXPRESSION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Array Selectors</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE__ARRAY_SELECTORS = ExpressionsPackage.PRIMARY_EXPRESSION_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_FEATURE_COUNT = ExpressionsPackage.PRIMARY_EXPRESSION_FEATURE_COUNT + 3;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE___GET_CONCRETE_CLASSIFIER__STRING = ExpressionsPackage.PRIMARY_EXPRESSION___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE___GET_CONCRETE_CLASSIFIER_PROXY__STRING = ExpressionsPackage.PRIMARY_EXPRESSION___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE___GET_CONCRETE_CLASSIFIERS__STRING_STRING = ExpressionsPackage.PRIMARY_EXPRESSION___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = ExpressionsPackage.PRIMARY_EXPRESSION___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE___GET_LIB_CLASS__STRING = ExpressionsPackage.PRIMARY_EXPRESSION___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE___GET_LIB_INTERFACE__STRING = ExpressionsPackage.PRIMARY_EXPRESSION___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE___GET_CLASS_CLASS = ExpressionsPackage.PRIMARY_EXPRESSION___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE___GET_OBJECT_CLASS = ExpressionsPackage.PRIMARY_EXPRESSION___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE___GET_STRING_CLASS = ExpressionsPackage.PRIMARY_EXPRESSION___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE___GET_ANNOTATION_INTERFACE = ExpressionsPackage.PRIMARY_EXPRESSION___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE___GET_CONTAINING_ANNOTATION_INSTANCE = ExpressionsPackage.PRIMARY_EXPRESSION___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE___GET_CONTAINING_ANONYMOUS_CLASS = ExpressionsPackage.PRIMARY_EXPRESSION___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE___GET_CONTAINING_CONCRETE_CLASSIFIER = ExpressionsPackage.PRIMARY_EXPRESSION___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE___GET_CONTAINING_COMPILATION_UNIT = ExpressionsPackage.PRIMARY_EXPRESSION___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE___GET_CONTAINING_PACKAGE_NAME = ExpressionsPackage.PRIMARY_EXPRESSION___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE___GET_CONTAINING_CONTAINER_NAME = ExpressionsPackage.PRIMARY_EXPRESSION___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE___GET_PARENT_CONCRETE_CLASSIFIER = ExpressionsPackage.PRIMARY_EXPRESSION___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE___GET_PARENT_BY_ETYPE__ECLASS = ExpressionsPackage.PRIMARY_EXPRESSION___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE___GET_FIRST_CHILD_BY_ETYPE__ECLASS = ExpressionsPackage.PRIMARY_EXPRESSION___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE___GET_PARENT_BY_TYPE__CLASS = ExpressionsPackage.PRIMARY_EXPRESSION___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE___GET_FIRST_CHILD_BY_TYPE__CLASS = ExpressionsPackage.PRIMARY_EXPRESSION___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE___GET_CHILDREN_BY_ETYPE__ECLASS = ExpressionsPackage.PRIMARY_EXPRESSION___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE___GET_CHILDREN_BY_TYPE__CLASS = ExpressionsPackage.PRIMARY_EXPRESSION___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE___GET_COMMENTS = ExpressionsPackage.PRIMARY_EXPRESSION___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = ExpressionsPackage.PRIMARY_EXPRESSION___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = ExpressionsPackage.PRIMARY_EXPRESSION___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE___GET_TYPE = ExpressionsPackage.PRIMARY_EXPRESSION___GET_TYPE;

    /**
     * The operation id for the '<em>Get Alternative Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE___GET_ALTERNATIVE_TYPE = ExpressionsPackage.PRIMARY_EXPRESSION___GET_ALTERNATIVE_TYPE;

    /**
     * The operation id for the '<em>Get One Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE___GET_ONE_TYPE__BOOLEAN = ExpressionsPackage.PRIMARY_EXPRESSION___GET_ONE_TYPE__BOOLEAN;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE___GET_ARRAY_DIMENSION = ExpressionsPackage.PRIMARY_EXPRESSION___GET_ARRAY_DIMENSION;

    /**
     * The operation id for the '<em>Get Referenced Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE___GET_REFERENCED_TYPE = ExpressionsPackage.PRIMARY_EXPRESSION_OPERATION_COUNT + 0;

    /**
     * The operation id for the '<em>Get Previous</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE___GET_PREVIOUS = ExpressionsPackage.PRIMARY_EXPRESSION_OPERATION_COUNT + 1;

    /**
     * The number of operations of the '<em>Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_OPERATION_COUNT = ExpressionsPackage.PRIMARY_EXPRESSION_OPERATION_COUNT + 2;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.references.impl.ArgumentableImpl <em>Argumentable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.references.impl.ArgumentableImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.references.impl.ReferencesPackageImpl#getArgumentable()
     * @generated
     */
    int ARGUMENTABLE = 1;

    /**
     * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARGUMENTABLE__ARGUMENTS = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Argumentable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARGUMENTABLE_FEATURE_COUNT = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARGUMENTABLE___GET_CONCRETE_CLASSIFIER__STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARGUMENTABLE___GET_CONCRETE_CLASSIFIER_PROXY__STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARGUMENTABLE___GET_CONCRETE_CLASSIFIERS__STRING_STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARGUMENTABLE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARGUMENTABLE___GET_LIB_CLASS__STRING = CommonsPackage.COMMENTABLE___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARGUMENTABLE___GET_LIB_INTERFACE__STRING = CommonsPackage.COMMENTABLE___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARGUMENTABLE___GET_CLASS_CLASS = CommonsPackage.COMMENTABLE___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARGUMENTABLE___GET_OBJECT_CLASS = CommonsPackage.COMMENTABLE___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARGUMENTABLE___GET_STRING_CLASS = CommonsPackage.COMMENTABLE___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARGUMENTABLE___GET_ANNOTATION_INTERFACE = CommonsPackage.COMMENTABLE___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARGUMENTABLE___GET_CONTAINING_ANNOTATION_INSTANCE = CommonsPackage.COMMENTABLE___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARGUMENTABLE___GET_CONTAINING_ANONYMOUS_CLASS = CommonsPackage.COMMENTABLE___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARGUMENTABLE___GET_CONTAINING_CONCRETE_CLASSIFIER = CommonsPackage.COMMENTABLE___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARGUMENTABLE___GET_CONTAINING_COMPILATION_UNIT = CommonsPackage.COMMENTABLE___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARGUMENTABLE___GET_CONTAINING_PACKAGE_NAME = CommonsPackage.COMMENTABLE___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARGUMENTABLE___GET_CONTAINING_CONTAINER_NAME = CommonsPackage.COMMENTABLE___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARGUMENTABLE___GET_PARENT_CONCRETE_CLASSIFIER = CommonsPackage.COMMENTABLE___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARGUMENTABLE___GET_PARENT_BY_ETYPE__ECLASS = CommonsPackage.COMMENTABLE___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARGUMENTABLE___GET_FIRST_CHILD_BY_ETYPE__ECLASS = CommonsPackage.COMMENTABLE___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARGUMENTABLE___GET_PARENT_BY_TYPE__CLASS = CommonsPackage.COMMENTABLE___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARGUMENTABLE___GET_FIRST_CHILD_BY_TYPE__CLASS = CommonsPackage.COMMENTABLE___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARGUMENTABLE___GET_CHILDREN_BY_ETYPE__ECLASS = CommonsPackage.COMMENTABLE___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARGUMENTABLE___GET_CHILDREN_BY_TYPE__CLASS = CommonsPackage.COMMENTABLE___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARGUMENTABLE___GET_COMMENTS = CommonsPackage.COMMENTABLE___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARGUMENTABLE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = CommonsPackage.COMMENTABLE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARGUMENTABLE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = CommonsPackage.COMMENTABLE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Argument Types</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARGUMENTABLE___GET_ARGUMENT_TYPES = CommonsPackage.COMMENTABLE_OPERATION_COUNT + 0;

    /**
     * The number of operations of the '<em>Argumentable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARGUMENTABLE_OPERATION_COUNT = CommonsPackage.COMMENTABLE_OPERATION_COUNT + 1;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.references.impl.ReferenceableElementImpl <em>Referenceable Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.references.impl.ReferenceableElementImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.references.impl.ReferencesPackageImpl#getReferenceableElement()
     * @generated
     */
    int REFERENCEABLE_ELEMENT = 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCEABLE_ELEMENT__NAME = CommonsPackage.NAMED_ELEMENT__NAME;

    /**
     * The number of structural features of the '<em>Referenceable Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCEABLE_ELEMENT_FEATURE_COUNT = CommonsPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCEABLE_ELEMENT___GET_CONCRETE_CLASSIFIER__STRING = CommonsPackage.NAMED_ELEMENT___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCEABLE_ELEMENT___GET_CONCRETE_CLASSIFIER_PROXY__STRING = CommonsPackage.NAMED_ELEMENT___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCEABLE_ELEMENT___GET_CONCRETE_CLASSIFIERS__STRING_STRING = CommonsPackage.NAMED_ELEMENT___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCEABLE_ELEMENT___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = CommonsPackage.NAMED_ELEMENT___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCEABLE_ELEMENT___GET_LIB_CLASS__STRING = CommonsPackage.NAMED_ELEMENT___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCEABLE_ELEMENT___GET_LIB_INTERFACE__STRING = CommonsPackage.NAMED_ELEMENT___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCEABLE_ELEMENT___GET_CLASS_CLASS = CommonsPackage.NAMED_ELEMENT___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCEABLE_ELEMENT___GET_OBJECT_CLASS = CommonsPackage.NAMED_ELEMENT___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCEABLE_ELEMENT___GET_STRING_CLASS = CommonsPackage.NAMED_ELEMENT___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCEABLE_ELEMENT___GET_ANNOTATION_INTERFACE = CommonsPackage.NAMED_ELEMENT___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCEABLE_ELEMENT___GET_CONTAINING_ANNOTATION_INSTANCE = CommonsPackage.NAMED_ELEMENT___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCEABLE_ELEMENT___GET_CONTAINING_ANONYMOUS_CLASS = CommonsPackage.NAMED_ELEMENT___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCEABLE_ELEMENT___GET_CONTAINING_CONCRETE_CLASSIFIER = CommonsPackage.NAMED_ELEMENT___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCEABLE_ELEMENT___GET_CONTAINING_COMPILATION_UNIT = CommonsPackage.NAMED_ELEMENT___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCEABLE_ELEMENT___GET_CONTAINING_PACKAGE_NAME = CommonsPackage.NAMED_ELEMENT___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCEABLE_ELEMENT___GET_CONTAINING_CONTAINER_NAME = CommonsPackage.NAMED_ELEMENT___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCEABLE_ELEMENT___GET_PARENT_CONCRETE_CLASSIFIER = CommonsPackage.NAMED_ELEMENT___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCEABLE_ELEMENT___GET_PARENT_BY_ETYPE__ECLASS = CommonsPackage.NAMED_ELEMENT___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCEABLE_ELEMENT___GET_FIRST_CHILD_BY_ETYPE__ECLASS = CommonsPackage.NAMED_ELEMENT___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCEABLE_ELEMENT___GET_PARENT_BY_TYPE__CLASS = CommonsPackage.NAMED_ELEMENT___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCEABLE_ELEMENT___GET_FIRST_CHILD_BY_TYPE__CLASS = CommonsPackage.NAMED_ELEMENT___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCEABLE_ELEMENT___GET_CHILDREN_BY_ETYPE__ECLASS = CommonsPackage.NAMED_ELEMENT___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCEABLE_ELEMENT___GET_CHILDREN_BY_TYPE__CLASS = CommonsPackage.NAMED_ELEMENT___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCEABLE_ELEMENT___GET_COMMENTS = CommonsPackage.NAMED_ELEMENT___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCEABLE_ELEMENT___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = CommonsPackage.NAMED_ELEMENT___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCEABLE_ELEMENT___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = CommonsPackage.NAMED_ELEMENT___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The number of operations of the '<em>Referenceable Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCEABLE_ELEMENT_OPERATION_COUNT = CommonsPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.references.impl.ElementReferenceImpl <em>Element Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.references.impl.ElementReferenceImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.references.impl.ReferencesPackageImpl#getElementReference()
     * @generated
     */
    int ELEMENT_REFERENCE = 3;

    /**
     * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_REFERENCE__TYPE_ARGUMENTS = REFERENCE__TYPE_ARGUMENTS;

    /**
     * The feature id for the '<em><b>Next</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_REFERENCE__NEXT = REFERENCE__NEXT;

    /**
     * The feature id for the '<em><b>Array Selectors</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_REFERENCE__ARRAY_SELECTORS = REFERENCE__ARRAY_SELECTORS;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_REFERENCE__TARGET = REFERENCE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Element Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_REFERENCE_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_REFERENCE___GET_CONCRETE_CLASSIFIER__STRING = REFERENCE___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_REFERENCE___GET_CONCRETE_CLASSIFIER_PROXY__STRING = REFERENCE___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_REFERENCE___GET_CONCRETE_CLASSIFIERS__STRING_STRING = REFERENCE___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_REFERENCE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = REFERENCE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_REFERENCE___GET_LIB_CLASS__STRING = REFERENCE___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_REFERENCE___GET_LIB_INTERFACE__STRING = REFERENCE___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_REFERENCE___GET_CLASS_CLASS = REFERENCE___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_REFERENCE___GET_OBJECT_CLASS = REFERENCE___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_REFERENCE___GET_STRING_CLASS = REFERENCE___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_REFERENCE___GET_ANNOTATION_INTERFACE = REFERENCE___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_REFERENCE___GET_CONTAINING_ANNOTATION_INSTANCE = REFERENCE___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_REFERENCE___GET_CONTAINING_ANONYMOUS_CLASS = REFERENCE___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_REFERENCE___GET_CONTAINING_CONCRETE_CLASSIFIER = REFERENCE___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_REFERENCE___GET_CONTAINING_COMPILATION_UNIT = REFERENCE___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_REFERENCE___GET_CONTAINING_PACKAGE_NAME = REFERENCE___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_REFERENCE___GET_CONTAINING_CONTAINER_NAME = REFERENCE___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_REFERENCE___GET_PARENT_CONCRETE_CLASSIFIER = REFERENCE___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_REFERENCE___GET_PARENT_BY_ETYPE__ECLASS = REFERENCE___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_REFERENCE___GET_FIRST_CHILD_BY_ETYPE__ECLASS = REFERENCE___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_REFERENCE___GET_PARENT_BY_TYPE__CLASS = REFERENCE___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_REFERENCE___GET_FIRST_CHILD_BY_TYPE__CLASS = REFERENCE___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_REFERENCE___GET_CHILDREN_BY_ETYPE__ECLASS = REFERENCE___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_REFERENCE___GET_CHILDREN_BY_TYPE__CLASS = REFERENCE___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_REFERENCE___GET_COMMENTS = REFERENCE___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_REFERENCE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = REFERENCE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_REFERENCE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = REFERENCE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_REFERENCE___GET_TYPE = REFERENCE___GET_TYPE;

    /**
     * The operation id for the '<em>Get Alternative Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_REFERENCE___GET_ALTERNATIVE_TYPE = REFERENCE___GET_ALTERNATIVE_TYPE;

    /**
     * The operation id for the '<em>Get One Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_REFERENCE___GET_ONE_TYPE__BOOLEAN = REFERENCE___GET_ONE_TYPE__BOOLEAN;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_REFERENCE___GET_ARRAY_DIMENSION = REFERENCE___GET_ARRAY_DIMENSION;

    /**
     * The operation id for the '<em>Get Referenced Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_REFERENCE___GET_REFERENCED_TYPE = REFERENCE___GET_REFERENCED_TYPE;

    /**
     * The operation id for the '<em>Get Previous</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_REFERENCE___GET_PREVIOUS = REFERENCE___GET_PREVIOUS;

    /**
     * The number of operations of the '<em>Element Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_REFERENCE_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.references.impl.IdentifierReferenceImpl <em>Identifier Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.references.impl.IdentifierReferenceImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.references.impl.ReferencesPackageImpl#getIdentifierReference()
     * @generated
     */
    int IDENTIFIER_REFERENCE = 4;

    /**
     * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTIFIER_REFERENCE__TYPE_ARGUMENTS = ELEMENT_REFERENCE__TYPE_ARGUMENTS;

    /**
     * The feature id for the '<em><b>Next</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTIFIER_REFERENCE__NEXT = ELEMENT_REFERENCE__NEXT;

    /**
     * The feature id for the '<em><b>Array Selectors</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTIFIER_REFERENCE__ARRAY_SELECTORS = ELEMENT_REFERENCE__ARRAY_SELECTORS;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTIFIER_REFERENCE__TARGET = ELEMENT_REFERENCE__TARGET;

    /**
     * The number of structural features of the '<em>Identifier Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTIFIER_REFERENCE_FEATURE_COUNT = ELEMENT_REFERENCE_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTIFIER_REFERENCE___GET_CONCRETE_CLASSIFIER__STRING = ELEMENT_REFERENCE___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTIFIER_REFERENCE___GET_CONCRETE_CLASSIFIER_PROXY__STRING = ELEMENT_REFERENCE___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTIFIER_REFERENCE___GET_CONCRETE_CLASSIFIERS__STRING_STRING = ELEMENT_REFERENCE___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTIFIER_REFERENCE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = ELEMENT_REFERENCE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTIFIER_REFERENCE___GET_LIB_CLASS__STRING = ELEMENT_REFERENCE___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTIFIER_REFERENCE___GET_LIB_INTERFACE__STRING = ELEMENT_REFERENCE___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTIFIER_REFERENCE___GET_CLASS_CLASS = ELEMENT_REFERENCE___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTIFIER_REFERENCE___GET_OBJECT_CLASS = ELEMENT_REFERENCE___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTIFIER_REFERENCE___GET_STRING_CLASS = ELEMENT_REFERENCE___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTIFIER_REFERENCE___GET_ANNOTATION_INTERFACE = ELEMENT_REFERENCE___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTIFIER_REFERENCE___GET_CONTAINING_ANNOTATION_INSTANCE = ELEMENT_REFERENCE___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTIFIER_REFERENCE___GET_CONTAINING_ANONYMOUS_CLASS = ELEMENT_REFERENCE___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTIFIER_REFERENCE___GET_CONTAINING_CONCRETE_CLASSIFIER = ELEMENT_REFERENCE___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTIFIER_REFERENCE___GET_CONTAINING_COMPILATION_UNIT = ELEMENT_REFERENCE___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTIFIER_REFERENCE___GET_CONTAINING_PACKAGE_NAME = ELEMENT_REFERENCE___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTIFIER_REFERENCE___GET_CONTAINING_CONTAINER_NAME = ELEMENT_REFERENCE___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTIFIER_REFERENCE___GET_PARENT_CONCRETE_CLASSIFIER = ELEMENT_REFERENCE___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTIFIER_REFERENCE___GET_PARENT_BY_ETYPE__ECLASS = ELEMENT_REFERENCE___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTIFIER_REFERENCE___GET_FIRST_CHILD_BY_ETYPE__ECLASS = ELEMENT_REFERENCE___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTIFIER_REFERENCE___GET_PARENT_BY_TYPE__CLASS = ELEMENT_REFERENCE___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTIFIER_REFERENCE___GET_FIRST_CHILD_BY_TYPE__CLASS = ELEMENT_REFERENCE___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTIFIER_REFERENCE___GET_CHILDREN_BY_ETYPE__ECLASS = ELEMENT_REFERENCE___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTIFIER_REFERENCE___GET_CHILDREN_BY_TYPE__CLASS = ELEMENT_REFERENCE___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTIFIER_REFERENCE___GET_COMMENTS = ELEMENT_REFERENCE___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTIFIER_REFERENCE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = ELEMENT_REFERENCE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTIFIER_REFERENCE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = ELEMENT_REFERENCE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTIFIER_REFERENCE___GET_TYPE = ELEMENT_REFERENCE___GET_TYPE;

    /**
     * The operation id for the '<em>Get Alternative Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTIFIER_REFERENCE___GET_ALTERNATIVE_TYPE = ELEMENT_REFERENCE___GET_ALTERNATIVE_TYPE;

    /**
     * The operation id for the '<em>Get One Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTIFIER_REFERENCE___GET_ONE_TYPE__BOOLEAN = ELEMENT_REFERENCE___GET_ONE_TYPE__BOOLEAN;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTIFIER_REFERENCE___GET_ARRAY_DIMENSION = ELEMENT_REFERENCE___GET_ARRAY_DIMENSION;

    /**
     * The operation id for the '<em>Get Referenced Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTIFIER_REFERENCE___GET_REFERENCED_TYPE = ELEMENT_REFERENCE___GET_REFERENCED_TYPE;

    /**
     * The operation id for the '<em>Get Previous</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTIFIER_REFERENCE___GET_PREVIOUS = ELEMENT_REFERENCE___GET_PREVIOUS;

    /**
     * The number of operations of the '<em>Identifier Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTIFIER_REFERENCE_OPERATION_COUNT = ELEMENT_REFERENCE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.references.impl.MethodCallImpl <em>Method Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.references.impl.MethodCallImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.references.impl.ReferencesPackageImpl#getMethodCall()
     * @generated
     */
    int METHOD_CALL = 5;

    /**
     * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_CALL__TYPE_ARGUMENTS = ELEMENT_REFERENCE__TYPE_ARGUMENTS;

    /**
     * The feature id for the '<em><b>Next</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_CALL__NEXT = ELEMENT_REFERENCE__NEXT;

    /**
     * The feature id for the '<em><b>Array Selectors</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_CALL__ARRAY_SELECTORS = ELEMENT_REFERENCE__ARRAY_SELECTORS;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_CALL__TARGET = ELEMENT_REFERENCE__TARGET;

    /**
     * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_CALL__ARGUMENTS = ELEMENT_REFERENCE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Call Type Arguments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_CALL__CALL_TYPE_ARGUMENTS = ELEMENT_REFERENCE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Method Call</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_CALL_FEATURE_COUNT = ELEMENT_REFERENCE_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_CALL___GET_CONCRETE_CLASSIFIER__STRING = ELEMENT_REFERENCE___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_CALL___GET_CONCRETE_CLASSIFIER_PROXY__STRING = ELEMENT_REFERENCE___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_CALL___GET_CONCRETE_CLASSIFIERS__STRING_STRING = ELEMENT_REFERENCE___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_CALL___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = ELEMENT_REFERENCE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_CALL___GET_LIB_CLASS__STRING = ELEMENT_REFERENCE___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_CALL___GET_LIB_INTERFACE__STRING = ELEMENT_REFERENCE___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_CALL___GET_CLASS_CLASS = ELEMENT_REFERENCE___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_CALL___GET_OBJECT_CLASS = ELEMENT_REFERENCE___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_CALL___GET_STRING_CLASS = ELEMENT_REFERENCE___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_CALL___GET_ANNOTATION_INTERFACE = ELEMENT_REFERENCE___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_CALL___GET_CONTAINING_ANNOTATION_INSTANCE = ELEMENT_REFERENCE___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_CALL___GET_CONTAINING_ANONYMOUS_CLASS = ELEMENT_REFERENCE___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_CALL___GET_CONTAINING_CONCRETE_CLASSIFIER = ELEMENT_REFERENCE___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_CALL___GET_CONTAINING_COMPILATION_UNIT = ELEMENT_REFERENCE___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_CALL___GET_CONTAINING_PACKAGE_NAME = ELEMENT_REFERENCE___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_CALL___GET_CONTAINING_CONTAINER_NAME = ELEMENT_REFERENCE___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_CALL___GET_PARENT_CONCRETE_CLASSIFIER = ELEMENT_REFERENCE___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_CALL___GET_PARENT_BY_ETYPE__ECLASS = ELEMENT_REFERENCE___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_CALL___GET_FIRST_CHILD_BY_ETYPE__ECLASS = ELEMENT_REFERENCE___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_CALL___GET_PARENT_BY_TYPE__CLASS = ELEMENT_REFERENCE___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_CALL___GET_FIRST_CHILD_BY_TYPE__CLASS = ELEMENT_REFERENCE___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_CALL___GET_CHILDREN_BY_ETYPE__ECLASS = ELEMENT_REFERENCE___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_CALL___GET_CHILDREN_BY_TYPE__CLASS = ELEMENT_REFERENCE___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_CALL___GET_COMMENTS = ELEMENT_REFERENCE___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_CALL___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = ELEMENT_REFERENCE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_CALL___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = ELEMENT_REFERENCE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_CALL___GET_TYPE = ELEMENT_REFERENCE___GET_TYPE;

    /**
     * The operation id for the '<em>Get Alternative Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_CALL___GET_ALTERNATIVE_TYPE = ELEMENT_REFERENCE___GET_ALTERNATIVE_TYPE;

    /**
     * The operation id for the '<em>Get One Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_CALL___GET_ONE_TYPE__BOOLEAN = ELEMENT_REFERENCE___GET_ONE_TYPE__BOOLEAN;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_CALL___GET_ARRAY_DIMENSION = ELEMENT_REFERENCE___GET_ARRAY_DIMENSION;

    /**
     * The operation id for the '<em>Get Referenced Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_CALL___GET_REFERENCED_TYPE = ELEMENT_REFERENCE___GET_REFERENCED_TYPE;

    /**
     * The operation id for the '<em>Get Previous</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_CALL___GET_PREVIOUS = ELEMENT_REFERENCE___GET_PREVIOUS;

    /**
     * The operation id for the '<em>Get Argument Types</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_CALL___GET_ARGUMENT_TYPES = ELEMENT_REFERENCE_OPERATION_COUNT + 0;

    /**
     * The number of operations of the '<em>Method Call</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD_CALL_OPERATION_COUNT = ELEMENT_REFERENCE_OPERATION_COUNT + 1;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.references.impl.ReflectiveClassReferenceImpl <em>Reflective Class Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.references.impl.ReflectiveClassReferenceImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.references.impl.ReferencesPackageImpl#getReflectiveClassReference()
     * @generated
     */
    int REFLECTIVE_CLASS_REFERENCE = 6;

    /**
     * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFLECTIVE_CLASS_REFERENCE__TYPE_ARGUMENTS = REFERENCE__TYPE_ARGUMENTS;

    /**
     * The feature id for the '<em><b>Next</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFLECTIVE_CLASS_REFERENCE__NEXT = REFERENCE__NEXT;

    /**
     * The feature id for the '<em><b>Array Selectors</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFLECTIVE_CLASS_REFERENCE__ARRAY_SELECTORS = REFERENCE__ARRAY_SELECTORS;

    /**
     * The number of structural features of the '<em>Reflective Class Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFLECTIVE_CLASS_REFERENCE_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFLECTIVE_CLASS_REFERENCE___GET_CONCRETE_CLASSIFIER__STRING = REFERENCE___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFLECTIVE_CLASS_REFERENCE___GET_CONCRETE_CLASSIFIER_PROXY__STRING = REFERENCE___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFLECTIVE_CLASS_REFERENCE___GET_CONCRETE_CLASSIFIERS__STRING_STRING = REFERENCE___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFLECTIVE_CLASS_REFERENCE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = REFERENCE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFLECTIVE_CLASS_REFERENCE___GET_LIB_CLASS__STRING = REFERENCE___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFLECTIVE_CLASS_REFERENCE___GET_LIB_INTERFACE__STRING = REFERENCE___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFLECTIVE_CLASS_REFERENCE___GET_CLASS_CLASS = REFERENCE___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFLECTIVE_CLASS_REFERENCE___GET_OBJECT_CLASS = REFERENCE___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFLECTIVE_CLASS_REFERENCE___GET_STRING_CLASS = REFERENCE___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFLECTIVE_CLASS_REFERENCE___GET_ANNOTATION_INTERFACE = REFERENCE___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFLECTIVE_CLASS_REFERENCE___GET_CONTAINING_ANNOTATION_INSTANCE = REFERENCE___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFLECTIVE_CLASS_REFERENCE___GET_CONTAINING_ANONYMOUS_CLASS = REFERENCE___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFLECTIVE_CLASS_REFERENCE___GET_CONTAINING_CONCRETE_CLASSIFIER = REFERENCE___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFLECTIVE_CLASS_REFERENCE___GET_CONTAINING_COMPILATION_UNIT = REFERENCE___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFLECTIVE_CLASS_REFERENCE___GET_CONTAINING_PACKAGE_NAME = REFERENCE___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFLECTIVE_CLASS_REFERENCE___GET_CONTAINING_CONTAINER_NAME = REFERENCE___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFLECTIVE_CLASS_REFERENCE___GET_PARENT_CONCRETE_CLASSIFIER = REFERENCE___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFLECTIVE_CLASS_REFERENCE___GET_PARENT_BY_ETYPE__ECLASS = REFERENCE___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFLECTIVE_CLASS_REFERENCE___GET_FIRST_CHILD_BY_ETYPE__ECLASS = REFERENCE___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFLECTIVE_CLASS_REFERENCE___GET_PARENT_BY_TYPE__CLASS = REFERENCE___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFLECTIVE_CLASS_REFERENCE___GET_FIRST_CHILD_BY_TYPE__CLASS = REFERENCE___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFLECTIVE_CLASS_REFERENCE___GET_CHILDREN_BY_ETYPE__ECLASS = REFERENCE___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFLECTIVE_CLASS_REFERENCE___GET_CHILDREN_BY_TYPE__CLASS = REFERENCE___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFLECTIVE_CLASS_REFERENCE___GET_COMMENTS = REFERENCE___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFLECTIVE_CLASS_REFERENCE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = REFERENCE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFLECTIVE_CLASS_REFERENCE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = REFERENCE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFLECTIVE_CLASS_REFERENCE___GET_TYPE = REFERENCE___GET_TYPE;

    /**
     * The operation id for the '<em>Get Alternative Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFLECTIVE_CLASS_REFERENCE___GET_ALTERNATIVE_TYPE = REFERENCE___GET_ALTERNATIVE_TYPE;

    /**
     * The operation id for the '<em>Get One Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFLECTIVE_CLASS_REFERENCE___GET_ONE_TYPE__BOOLEAN = REFERENCE___GET_ONE_TYPE__BOOLEAN;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFLECTIVE_CLASS_REFERENCE___GET_ARRAY_DIMENSION = REFERENCE___GET_ARRAY_DIMENSION;

    /**
     * The operation id for the '<em>Get Referenced Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFLECTIVE_CLASS_REFERENCE___GET_REFERENCED_TYPE = REFERENCE___GET_REFERENCED_TYPE;

    /**
     * The operation id for the '<em>Get Previous</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFLECTIVE_CLASS_REFERENCE___GET_PREVIOUS = REFERENCE___GET_PREVIOUS;

    /**
     * The number of operations of the '<em>Reflective Class Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFLECTIVE_CLASS_REFERENCE_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.references.impl.PrimitiveTypeReferenceImpl <em>Primitive Type Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.references.impl.PrimitiveTypeReferenceImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.references.impl.ReferencesPackageImpl#getPrimitiveTypeReference()
     * @generated
     */
    int PRIMITIVE_TYPE_REFERENCE = 7;

    /**
     * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE_REFERENCE__TYPE_ARGUMENTS = REFERENCE__TYPE_ARGUMENTS;

    /**
     * The feature id for the '<em><b>Next</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE_REFERENCE__NEXT = REFERENCE__NEXT;

    /**
     * The feature id for the '<em><b>Array Selectors</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE_REFERENCE__ARRAY_SELECTORS = REFERENCE__ARRAY_SELECTORS;

    /**
     * The feature id for the '<em><b>Primitive Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE_REFERENCE__PRIMITIVE_TYPE = REFERENCE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Primitive Type Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE_REFERENCE_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE_REFERENCE___GET_CONCRETE_CLASSIFIER__STRING = REFERENCE___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE_REFERENCE___GET_CONCRETE_CLASSIFIER_PROXY__STRING = REFERENCE___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE_REFERENCE___GET_CONCRETE_CLASSIFIERS__STRING_STRING = REFERENCE___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE_REFERENCE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = REFERENCE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE_REFERENCE___GET_LIB_CLASS__STRING = REFERENCE___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE_REFERENCE___GET_LIB_INTERFACE__STRING = REFERENCE___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE_REFERENCE___GET_CLASS_CLASS = REFERENCE___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE_REFERENCE___GET_OBJECT_CLASS = REFERENCE___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE_REFERENCE___GET_STRING_CLASS = REFERENCE___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE_REFERENCE___GET_ANNOTATION_INTERFACE = REFERENCE___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE_REFERENCE___GET_CONTAINING_ANNOTATION_INSTANCE = REFERENCE___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE_REFERENCE___GET_CONTAINING_ANONYMOUS_CLASS = REFERENCE___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE_REFERENCE___GET_CONTAINING_CONCRETE_CLASSIFIER = REFERENCE___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE_REFERENCE___GET_CONTAINING_COMPILATION_UNIT = REFERENCE___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE_REFERENCE___GET_CONTAINING_PACKAGE_NAME = REFERENCE___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE_REFERENCE___GET_CONTAINING_CONTAINER_NAME = REFERENCE___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE_REFERENCE___GET_PARENT_CONCRETE_CLASSIFIER = REFERENCE___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE_REFERENCE___GET_PARENT_BY_ETYPE__ECLASS = REFERENCE___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE_REFERENCE___GET_FIRST_CHILD_BY_ETYPE__ECLASS = REFERENCE___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE_REFERENCE___GET_PARENT_BY_TYPE__CLASS = REFERENCE___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE_REFERENCE___GET_FIRST_CHILD_BY_TYPE__CLASS = REFERENCE___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE_REFERENCE___GET_CHILDREN_BY_ETYPE__ECLASS = REFERENCE___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE_REFERENCE___GET_CHILDREN_BY_TYPE__CLASS = REFERENCE___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE_REFERENCE___GET_COMMENTS = REFERENCE___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE_REFERENCE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = REFERENCE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE_REFERENCE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = REFERENCE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE_REFERENCE___GET_TYPE = REFERENCE___GET_TYPE;

    /**
     * The operation id for the '<em>Get Alternative Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE_REFERENCE___GET_ALTERNATIVE_TYPE = REFERENCE___GET_ALTERNATIVE_TYPE;

    /**
     * The operation id for the '<em>Get One Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE_REFERENCE___GET_ONE_TYPE__BOOLEAN = REFERENCE___GET_ONE_TYPE__BOOLEAN;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE_REFERENCE___GET_ARRAY_DIMENSION = REFERENCE___GET_ARRAY_DIMENSION;

    /**
     * The operation id for the '<em>Get Referenced Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE_REFERENCE___GET_REFERENCED_TYPE = REFERENCE___GET_REFERENCED_TYPE;

    /**
     * The operation id for the '<em>Get Previous</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE_REFERENCE___GET_PREVIOUS = REFERENCE___GET_PREVIOUS;

    /**
     * The number of operations of the '<em>Primitive Type Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPE_REFERENCE_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.references.impl.StringReferenceImpl <em>String Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.references.impl.StringReferenceImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.references.impl.ReferencesPackageImpl#getStringReference()
     * @generated
     */
    int STRING_REFERENCE = 8;

    /**
     * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_REFERENCE__TYPE_ARGUMENTS = REFERENCE__TYPE_ARGUMENTS;

    /**
     * The feature id for the '<em><b>Next</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_REFERENCE__NEXT = REFERENCE__NEXT;

    /**
     * The feature id for the '<em><b>Array Selectors</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_REFERENCE__ARRAY_SELECTORS = REFERENCE__ARRAY_SELECTORS;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_REFERENCE__VALUE = REFERENCE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>String Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_REFERENCE_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_REFERENCE___GET_CONCRETE_CLASSIFIER__STRING = REFERENCE___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_REFERENCE___GET_CONCRETE_CLASSIFIER_PROXY__STRING = REFERENCE___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_REFERENCE___GET_CONCRETE_CLASSIFIERS__STRING_STRING = REFERENCE___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_REFERENCE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = REFERENCE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_REFERENCE___GET_LIB_CLASS__STRING = REFERENCE___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_REFERENCE___GET_LIB_INTERFACE__STRING = REFERENCE___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_REFERENCE___GET_CLASS_CLASS = REFERENCE___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_REFERENCE___GET_OBJECT_CLASS = REFERENCE___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_REFERENCE___GET_STRING_CLASS = REFERENCE___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_REFERENCE___GET_ANNOTATION_INTERFACE = REFERENCE___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_REFERENCE___GET_CONTAINING_ANNOTATION_INSTANCE = REFERENCE___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_REFERENCE___GET_CONTAINING_ANONYMOUS_CLASS = REFERENCE___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_REFERENCE___GET_CONTAINING_CONCRETE_CLASSIFIER = REFERENCE___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_REFERENCE___GET_CONTAINING_COMPILATION_UNIT = REFERENCE___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_REFERENCE___GET_CONTAINING_PACKAGE_NAME = REFERENCE___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_REFERENCE___GET_CONTAINING_CONTAINER_NAME = REFERENCE___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_REFERENCE___GET_PARENT_CONCRETE_CLASSIFIER = REFERENCE___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_REFERENCE___GET_PARENT_BY_ETYPE__ECLASS = REFERENCE___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_REFERENCE___GET_FIRST_CHILD_BY_ETYPE__ECLASS = REFERENCE___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_REFERENCE___GET_PARENT_BY_TYPE__CLASS = REFERENCE___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_REFERENCE___GET_FIRST_CHILD_BY_TYPE__CLASS = REFERENCE___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_REFERENCE___GET_CHILDREN_BY_ETYPE__ECLASS = REFERENCE___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_REFERENCE___GET_CHILDREN_BY_TYPE__CLASS = REFERENCE___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_REFERENCE___GET_COMMENTS = REFERENCE___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_REFERENCE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = REFERENCE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_REFERENCE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = REFERENCE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_REFERENCE___GET_TYPE = REFERENCE___GET_TYPE;

    /**
     * The operation id for the '<em>Get Alternative Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_REFERENCE___GET_ALTERNATIVE_TYPE = REFERENCE___GET_ALTERNATIVE_TYPE;

    /**
     * The operation id for the '<em>Get One Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_REFERENCE___GET_ONE_TYPE__BOOLEAN = REFERENCE___GET_ONE_TYPE__BOOLEAN;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_REFERENCE___GET_ARRAY_DIMENSION = REFERENCE___GET_ARRAY_DIMENSION;

    /**
     * The operation id for the '<em>Get Referenced Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_REFERENCE___GET_REFERENCED_TYPE = REFERENCE___GET_REFERENCED_TYPE;

    /**
     * The operation id for the '<em>Get Previous</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_REFERENCE___GET_PREVIOUS = REFERENCE___GET_PREVIOUS;

    /**
     * The number of operations of the '<em>String Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_REFERENCE_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.references.impl.SelfReferenceImpl <em>Self Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.references.impl.SelfReferenceImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.references.impl.ReferencesPackageImpl#getSelfReference()
     * @generated
     */
    int SELF_REFERENCE = 9;

    /**
     * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF_REFERENCE__TYPE_ARGUMENTS = REFERENCE__TYPE_ARGUMENTS;

    /**
     * The feature id for the '<em><b>Next</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF_REFERENCE__NEXT = REFERENCE__NEXT;

    /**
     * The feature id for the '<em><b>Array Selectors</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF_REFERENCE__ARRAY_SELECTORS = REFERENCE__ARRAY_SELECTORS;

    /**
     * The feature id for the '<em><b>Self</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF_REFERENCE__SELF = REFERENCE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Self Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF_REFERENCE_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF_REFERENCE___GET_CONCRETE_CLASSIFIER__STRING = REFERENCE___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF_REFERENCE___GET_CONCRETE_CLASSIFIER_PROXY__STRING = REFERENCE___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF_REFERENCE___GET_CONCRETE_CLASSIFIERS__STRING_STRING = REFERENCE___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF_REFERENCE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = REFERENCE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF_REFERENCE___GET_LIB_CLASS__STRING = REFERENCE___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF_REFERENCE___GET_LIB_INTERFACE__STRING = REFERENCE___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF_REFERENCE___GET_CLASS_CLASS = REFERENCE___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF_REFERENCE___GET_OBJECT_CLASS = REFERENCE___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF_REFERENCE___GET_STRING_CLASS = REFERENCE___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF_REFERENCE___GET_ANNOTATION_INTERFACE = REFERENCE___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF_REFERENCE___GET_CONTAINING_ANNOTATION_INSTANCE = REFERENCE___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF_REFERENCE___GET_CONTAINING_ANONYMOUS_CLASS = REFERENCE___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF_REFERENCE___GET_CONTAINING_CONCRETE_CLASSIFIER = REFERENCE___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF_REFERENCE___GET_CONTAINING_COMPILATION_UNIT = REFERENCE___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF_REFERENCE___GET_CONTAINING_PACKAGE_NAME = REFERENCE___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF_REFERENCE___GET_CONTAINING_CONTAINER_NAME = REFERENCE___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF_REFERENCE___GET_PARENT_CONCRETE_CLASSIFIER = REFERENCE___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF_REFERENCE___GET_PARENT_BY_ETYPE__ECLASS = REFERENCE___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF_REFERENCE___GET_FIRST_CHILD_BY_ETYPE__ECLASS = REFERENCE___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF_REFERENCE___GET_PARENT_BY_TYPE__CLASS = REFERENCE___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF_REFERENCE___GET_FIRST_CHILD_BY_TYPE__CLASS = REFERENCE___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF_REFERENCE___GET_CHILDREN_BY_ETYPE__ECLASS = REFERENCE___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF_REFERENCE___GET_CHILDREN_BY_TYPE__CLASS = REFERENCE___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF_REFERENCE___GET_COMMENTS = REFERENCE___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF_REFERENCE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = REFERENCE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF_REFERENCE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = REFERENCE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Get Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF_REFERENCE___GET_TYPE = REFERENCE___GET_TYPE;

    /**
     * The operation id for the '<em>Get Alternative Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF_REFERENCE___GET_ALTERNATIVE_TYPE = REFERENCE___GET_ALTERNATIVE_TYPE;

    /**
     * The operation id for the '<em>Get One Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF_REFERENCE___GET_ONE_TYPE__BOOLEAN = REFERENCE___GET_ONE_TYPE__BOOLEAN;

    /**
     * The operation id for the '<em>Get Array Dimension</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF_REFERENCE___GET_ARRAY_DIMENSION = REFERENCE___GET_ARRAY_DIMENSION;

    /**
     * The operation id for the '<em>Get Referenced Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF_REFERENCE___GET_REFERENCED_TYPE = REFERENCE___GET_REFERENCED_TYPE;

    /**
     * The operation id for the '<em>Get Previous</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF_REFERENCE___GET_PREVIOUS = REFERENCE___GET_PREVIOUS;

    /**
     * The number of operations of the '<em>Self Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF_REFERENCE_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.references.impl.PackageReferenceImpl <em>Package Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.jdt.metamodel.javamodel.references.impl.PackageReferenceImpl
     * @see org.palladiosimulator.jdt.metamodel.javamodel.references.impl.ReferencesPackageImpl#getPackageReference()
     * @generated
     */
    int PACKAGE_REFERENCE = 10;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_REFERENCE__NAME = REFERENCEABLE_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Subpackages</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_REFERENCE__SUBPACKAGES = REFERENCEABLE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Package Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_REFERENCE_FEATURE_COUNT = REFERENCEABLE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_REFERENCE___GET_CONCRETE_CLASSIFIER__STRING = REFERENCEABLE_ELEMENT___GET_CONCRETE_CLASSIFIER__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_REFERENCE___GET_CONCRETE_CLASSIFIER_PROXY__STRING = REFERENCEABLE_ELEMENT___GET_CONCRETE_CLASSIFIER_PROXY__STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifiers</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_REFERENCE___GET_CONCRETE_CLASSIFIERS__STRING_STRING = REFERENCEABLE_ELEMENT___GET_CONCRETE_CLASSIFIERS__STRING_STRING;

    /**
     * The operation id for the '<em>Get Concrete Classifier Proxies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_REFERENCE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING = REFERENCEABLE_ELEMENT___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING;

    /**
     * The operation id for the '<em>Get Lib Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_REFERENCE___GET_LIB_CLASS__STRING = REFERENCEABLE_ELEMENT___GET_LIB_CLASS__STRING;

    /**
     * The operation id for the '<em>Get Lib Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_REFERENCE___GET_LIB_INTERFACE__STRING = REFERENCEABLE_ELEMENT___GET_LIB_INTERFACE__STRING;

    /**
     * The operation id for the '<em>Get Class Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_REFERENCE___GET_CLASS_CLASS = REFERENCEABLE_ELEMENT___GET_CLASS_CLASS;

    /**
     * The operation id for the '<em>Get Object Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_REFERENCE___GET_OBJECT_CLASS = REFERENCEABLE_ELEMENT___GET_OBJECT_CLASS;

    /**
     * The operation id for the '<em>Get String Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_REFERENCE___GET_STRING_CLASS = REFERENCEABLE_ELEMENT___GET_STRING_CLASS;

    /**
     * The operation id for the '<em>Get Annotation Interface</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_REFERENCE___GET_ANNOTATION_INTERFACE = REFERENCEABLE_ELEMENT___GET_ANNOTATION_INTERFACE;

    /**
     * The operation id for the '<em>Get Containing Annotation Instance</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_REFERENCE___GET_CONTAINING_ANNOTATION_INSTANCE = REFERENCEABLE_ELEMENT___GET_CONTAINING_ANNOTATION_INSTANCE;

    /**
     * The operation id for the '<em>Get Containing Anonymous Class</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_REFERENCE___GET_CONTAINING_ANONYMOUS_CLASS = REFERENCEABLE_ELEMENT___GET_CONTAINING_ANONYMOUS_CLASS;

    /**
     * The operation id for the '<em>Get Containing Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_REFERENCE___GET_CONTAINING_CONCRETE_CLASSIFIER = REFERENCEABLE_ELEMENT___GET_CONTAINING_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Containing Compilation Unit</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_REFERENCE___GET_CONTAINING_COMPILATION_UNIT = REFERENCEABLE_ELEMENT___GET_CONTAINING_COMPILATION_UNIT;

    /**
     * The operation id for the '<em>Get Containing Package Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_REFERENCE___GET_CONTAINING_PACKAGE_NAME = REFERENCEABLE_ELEMENT___GET_CONTAINING_PACKAGE_NAME;

    /**
     * The operation id for the '<em>Get Containing Container Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_REFERENCE___GET_CONTAINING_CONTAINER_NAME = REFERENCEABLE_ELEMENT___GET_CONTAINING_CONTAINER_NAME;

    /**
     * The operation id for the '<em>Get Parent Concrete Classifier</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_REFERENCE___GET_PARENT_CONCRETE_CLASSIFIER = REFERENCEABLE_ELEMENT___GET_PARENT_CONCRETE_CLASSIFIER;

    /**
     * The operation id for the '<em>Get Parent By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_REFERENCE___GET_PARENT_BY_ETYPE__ECLASS = REFERENCEABLE_ELEMENT___GET_PARENT_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get First Child By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_REFERENCE___GET_FIRST_CHILD_BY_ETYPE__ECLASS = REFERENCEABLE_ELEMENT___GET_FIRST_CHILD_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Parent By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_REFERENCE___GET_PARENT_BY_TYPE__CLASS = REFERENCEABLE_ELEMENT___GET_PARENT_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get First Child By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_REFERENCE___GET_FIRST_CHILD_BY_TYPE__CLASS = REFERENCEABLE_ELEMENT___GET_FIRST_CHILD_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Children By EType</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_REFERENCE___GET_CHILDREN_BY_ETYPE__ECLASS = REFERENCEABLE_ELEMENT___GET_CHILDREN_BY_ETYPE__ECLASS;

    /**
     * The operation id for the '<em>Get Children By Type</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_REFERENCE___GET_CHILDREN_BY_TYPE__CLASS = REFERENCEABLE_ELEMENT___GET_CHILDREN_BY_TYPE__CLASS;

    /**
     * The operation id for the '<em>Get Comments</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_REFERENCE___GET_COMMENTS = REFERENCEABLE_ELEMENT___GET_COMMENTS;

    /**
     * The operation id for the '<em>Add Before Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_REFERENCE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT = REFERENCEABLE_ELEMENT___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The operation id for the '<em>Add After Containing Statement</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_REFERENCE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT = REFERENCEABLE_ELEMENT___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT;

    /**
     * The number of operations of the '<em>Package Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_REFERENCE_OPERATION_COUNT = REFERENCEABLE_ELEMENT_OPERATION_COUNT + 0;

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.references.Reference <em>Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Reference</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.references.Reference
     * @generated
     */
    EClass getReference();

    /**
     * Returns the meta object for the containment reference '{@link org.palladiosimulator.jdt.metamodel.javamodel.references.Reference#getNext <em>Next</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Next</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.references.Reference#getNext()
     * @see #getReference()
     * @generated
     */
    EReference getReference_Next();

    /**
     * Returns the meta object for the containment reference list '{@link org.palladiosimulator.jdt.metamodel.javamodel.references.Reference#getArraySelectors <em>Array Selectors</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Array Selectors</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.references.Reference#getArraySelectors()
     * @see #getReference()
     * @generated
     */
    EReference getReference_ArraySelectors();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.references.Reference#getReferencedType() <em>Get Referenced Type</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Referenced Type</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.references.Reference#getReferencedType()
     * @generated
     */
    EOperation getReference__GetReferencedType();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.references.Reference#getPrevious() <em>Get Previous</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Previous</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.references.Reference#getPrevious()
     * @generated
     */
    EOperation getReference__GetPrevious();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.references.Argumentable <em>Argumentable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Argumentable</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.references.Argumentable
     * @generated
     */
    EClass getArgumentable();

    /**
     * Returns the meta object for the containment reference list '{@link org.palladiosimulator.jdt.metamodel.javamodel.references.Argumentable#getArguments <em>Arguments</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Arguments</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.references.Argumentable#getArguments()
     * @see #getArgumentable()
     * @generated
     */
    EReference getArgumentable_Arguments();

    /**
     * Returns the meta object for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.references.Argumentable#getArgumentTypes() <em>Get Argument Types</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Argument Types</em>' operation.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.references.Argumentable#getArgumentTypes()
     * @generated
     */
    EOperation getArgumentable__GetArgumentTypes();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.references.ReferenceableElement <em>Referenceable Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Referenceable Element</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.references.ReferenceableElement
     * @generated
     */
    EClass getReferenceableElement();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.references.ElementReference <em>Element Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Element Reference</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.references.ElementReference
     * @generated
     */
    EClass getElementReference();

    /**
     * Returns the meta object for the reference '{@link org.palladiosimulator.jdt.metamodel.javamodel.references.ElementReference#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Target</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.references.ElementReference#getTarget()
     * @see #getElementReference()
     * @generated
     */
    EReference getElementReference_Target();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.references.IdentifierReference <em>Identifier Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Identifier Reference</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.references.IdentifierReference
     * @generated
     */
    EClass getIdentifierReference();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.references.MethodCall <em>Method Call</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Method Call</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.references.MethodCall
     * @generated
     */
    EClass getMethodCall();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.references.ReflectiveClassReference <em>Reflective Class Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Reflective Class Reference</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.references.ReflectiveClassReference
     * @generated
     */
    EClass getReflectiveClassReference();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.references.PrimitiveTypeReference <em>Primitive Type Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Primitive Type Reference</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.references.PrimitiveTypeReference
     * @generated
     */
    EClass getPrimitiveTypeReference();

    /**
     * Returns the meta object for the containment reference '{@link org.palladiosimulator.jdt.metamodel.javamodel.references.PrimitiveTypeReference#getPrimitiveType <em>Primitive Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Primitive Type</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.references.PrimitiveTypeReference#getPrimitiveType()
     * @see #getPrimitiveTypeReference()
     * @generated
     */
    EReference getPrimitiveTypeReference_PrimitiveType();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.references.StringReference <em>String Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>String Reference</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.references.StringReference
     * @generated
     */
    EClass getStringReference();

    /**
     * Returns the meta object for the attribute '{@link org.palladiosimulator.jdt.metamodel.javamodel.references.StringReference#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.references.StringReference#getValue()
     * @see #getStringReference()
     * @generated
     */
    EAttribute getStringReference_Value();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.references.SelfReference <em>Self Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Self Reference</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.references.SelfReference
     * @generated
     */
    EClass getSelfReference();

    /**
     * Returns the meta object for the containment reference '{@link org.palladiosimulator.jdt.metamodel.javamodel.references.SelfReference#getSelf <em>Self</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Self</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.references.SelfReference#getSelf()
     * @see #getSelfReference()
     * @generated
     */
    EReference getSelfReference_Self();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.jdt.metamodel.javamodel.references.PackageReference <em>Package Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Package Reference</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.references.PackageReference
     * @generated
     */
    EClass getPackageReference();

    /**
     * Returns the meta object for the containment reference list '{@link org.palladiosimulator.jdt.metamodel.javamodel.references.PackageReference#getSubpackages <em>Subpackages</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Subpackages</em>'.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.references.PackageReference#getSubpackages()
     * @see #getPackageReference()
     * @generated
     */
    EReference getPackageReference_Subpackages();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    ReferencesFactory getReferencesFactory();

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
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.references.impl.ReferenceImpl <em>Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.references.impl.ReferenceImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.references.impl.ReferencesPackageImpl#getReference()
         * @generated
         */
        EClass REFERENCE = eINSTANCE.getReference();

        /**
         * The meta object literal for the '<em><b>Next</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference REFERENCE__NEXT = eINSTANCE.getReference_Next();

        /**
         * The meta object literal for the '<em><b>Array Selectors</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference REFERENCE__ARRAY_SELECTORS = eINSTANCE.getReference_ArraySelectors();

        /**
         * The meta object literal for the '<em><b>Get Referenced Type</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation REFERENCE___GET_REFERENCED_TYPE = eINSTANCE.getReference__GetReferencedType();

        /**
         * The meta object literal for the '<em><b>Get Previous</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation REFERENCE___GET_PREVIOUS = eINSTANCE.getReference__GetPrevious();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.references.impl.ArgumentableImpl <em>Argumentable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.references.impl.ArgumentableImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.references.impl.ReferencesPackageImpl#getArgumentable()
         * @generated
         */
        EClass ARGUMENTABLE = eINSTANCE.getArgumentable();

        /**
         * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ARGUMENTABLE__ARGUMENTS = eINSTANCE.getArgumentable_Arguments();

        /**
         * The meta object literal for the '<em><b>Get Argument Types</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation ARGUMENTABLE___GET_ARGUMENT_TYPES = eINSTANCE.getArgumentable__GetArgumentTypes();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.references.impl.ReferenceableElementImpl <em>Referenceable Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.references.impl.ReferenceableElementImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.references.impl.ReferencesPackageImpl#getReferenceableElement()
         * @generated
         */
        EClass REFERENCEABLE_ELEMENT = eINSTANCE.getReferenceableElement();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.references.impl.ElementReferenceImpl <em>Element Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.references.impl.ElementReferenceImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.references.impl.ReferencesPackageImpl#getElementReference()
         * @generated
         */
        EClass ELEMENT_REFERENCE = eINSTANCE.getElementReference();

        /**
         * The meta object literal for the '<em><b>Target</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ELEMENT_REFERENCE__TARGET = eINSTANCE.getElementReference_Target();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.references.impl.IdentifierReferenceImpl <em>Identifier Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.references.impl.IdentifierReferenceImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.references.impl.ReferencesPackageImpl#getIdentifierReference()
         * @generated
         */
        EClass IDENTIFIER_REFERENCE = eINSTANCE.getIdentifierReference();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.references.impl.MethodCallImpl <em>Method Call</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.references.impl.MethodCallImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.references.impl.ReferencesPackageImpl#getMethodCall()
         * @generated
         */
        EClass METHOD_CALL = eINSTANCE.getMethodCall();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.references.impl.ReflectiveClassReferenceImpl <em>Reflective Class Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.references.impl.ReflectiveClassReferenceImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.references.impl.ReferencesPackageImpl#getReflectiveClassReference()
         * @generated
         */
        EClass REFLECTIVE_CLASS_REFERENCE = eINSTANCE.getReflectiveClassReference();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.references.impl.PrimitiveTypeReferenceImpl <em>Primitive Type Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.references.impl.PrimitiveTypeReferenceImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.references.impl.ReferencesPackageImpl#getPrimitiveTypeReference()
         * @generated
         */
        EClass PRIMITIVE_TYPE_REFERENCE = eINSTANCE.getPrimitiveTypeReference();

        /**
         * The meta object literal for the '<em><b>Primitive Type</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PRIMITIVE_TYPE_REFERENCE__PRIMITIVE_TYPE = eINSTANCE.getPrimitiveTypeReference_PrimitiveType();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.references.impl.StringReferenceImpl <em>String Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.references.impl.StringReferenceImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.references.impl.ReferencesPackageImpl#getStringReference()
         * @generated
         */
        EClass STRING_REFERENCE = eINSTANCE.getStringReference();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STRING_REFERENCE__VALUE = eINSTANCE.getStringReference_Value();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.references.impl.SelfReferenceImpl <em>Self Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.references.impl.SelfReferenceImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.references.impl.ReferencesPackageImpl#getSelfReference()
         * @generated
         */
        EClass SELF_REFERENCE = eINSTANCE.getSelfReference();

        /**
         * The meta object literal for the '<em><b>Self</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SELF_REFERENCE__SELF = eINSTANCE.getSelfReference_Self();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.jdt.metamodel.javamodel.references.impl.PackageReferenceImpl <em>Package Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.jdt.metamodel.javamodel.references.impl.PackageReferenceImpl
         * @see org.palladiosimulator.jdt.metamodel.javamodel.references.impl.ReferencesPackageImpl#getPackageReference()
         * @generated
         */
        EClass PACKAGE_REFERENCE = eINSTANCE.getPackageReference();

        /**
         * The meta object literal for the '<em><b>Subpackages</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PACKAGE_REFERENCE__SUBPACKAGES = eINSTANCE.getPackageReference_Subpackages();

    }

} //ReferencesPackage
