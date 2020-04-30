/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.commons.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationInstance;

import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.AnonymousClass;
import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.ConcreteClassifier;
import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Interface;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable;
import org.palladiosimulator.jdt.metamodel.javamodel.commons.CommonsPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.containers.CompilationUnit;

import org.palladiosimulator.jdt.metamodel.javamodel.statements.Statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Commentable</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class CommentableImpl extends MinimalEObjectImpl.Container implements Commentable {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CommentableImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CommonsPackage.Literals.COMMENTABLE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ConcreteClassifier getConcreteClassifier(final String name) {
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ConcreteClassifier getConcreteClassifierProxy(final String name) {
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<ConcreteClassifier> getConcreteClassifiers(final String packageName, final String classifierQuery) {
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<ConcreteClassifier> getConcreteClassifierProxies(final String packageName,
            final String classifierQuery) {
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Class getLibClass(final String name) {
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Interface getLibInterface(final String name) {
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Class getClassClass() {
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Class getObjectClass() {
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public org.palladiosimulator.jdt.metamodel.javamodel.classifiers.Class getStringClass() {
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Interface getAnnotationInterface() {
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AnnotationInstance getContainingAnnotationInstance() {
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AnonymousClass getContainingAnonymousClass() {
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ConcreteClassifier getContainingConcreteClassifier() {
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CompilationUnit getContainingCompilationUnit() {
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<String> getContainingPackageName() {
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<String> getContainingContainerName() {
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ConcreteClassifier getParentConcreteClassifier() {
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject getParentByEType(final EClass type) {
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject getFirstChildByEType(final EClass type) {
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public <T> T getParentByType(final Class<T> type) {
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public <T> T getFirstChildByType(final Class<T> type) {
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<EObject> getChildrenByEType(final EClass type) {
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public <T> EList<T> getChildrenByType(final Class<T> type) {
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<String> getComments() {
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void addBeforeContainingStatement(final Statement statementToAdd) {
        return;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void addAfterContainingStatement(final Statement statementToAdd) {
        return;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
        switch (operationID) {
        case CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIER__STRING:
            return getConcreteClassifier((String) arguments.get(0));
        case CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIER_PROXY__STRING:
            return getConcreteClassifierProxy((String) arguments.get(0));
        case CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIERS__STRING_STRING:
            return getConcreteClassifiers((String) arguments.get(0), (String) arguments.get(1));
        case CommonsPackage.COMMENTABLE___GET_CONCRETE_CLASSIFIER_PROXIES__STRING_STRING:
            return getConcreteClassifierProxies((String) arguments.get(0), (String) arguments.get(1));
        case CommonsPackage.COMMENTABLE___GET_LIB_CLASS__STRING:
            return getLibClass((String) arguments.get(0));
        case CommonsPackage.COMMENTABLE___GET_LIB_INTERFACE__STRING:
            return getLibInterface((String) arguments.get(0));
        case CommonsPackage.COMMENTABLE___GET_CLASS_CLASS:
            return getClassClass();
        case CommonsPackage.COMMENTABLE___GET_OBJECT_CLASS:
            return getObjectClass();
        case CommonsPackage.COMMENTABLE___GET_STRING_CLASS:
            return getStringClass();
        case CommonsPackage.COMMENTABLE___GET_ANNOTATION_INTERFACE:
            return getAnnotationInterface();
        case CommonsPackage.COMMENTABLE___GET_CONTAINING_ANNOTATION_INSTANCE:
            return getContainingAnnotationInstance();
        case CommonsPackage.COMMENTABLE___GET_CONTAINING_ANONYMOUS_CLASS:
            return getContainingAnonymousClass();
        case CommonsPackage.COMMENTABLE___GET_CONTAINING_CONCRETE_CLASSIFIER:
            return getContainingConcreteClassifier();
        case CommonsPackage.COMMENTABLE___GET_CONTAINING_COMPILATION_UNIT:
            return getContainingCompilationUnit();
        case CommonsPackage.COMMENTABLE___GET_CONTAINING_PACKAGE_NAME:
            return getContainingPackageName();
        case CommonsPackage.COMMENTABLE___GET_CONTAINING_CONTAINER_NAME:
            return getContainingContainerName();
        case CommonsPackage.COMMENTABLE___GET_PARENT_CONCRETE_CLASSIFIER:
            return getParentConcreteClassifier();
        case CommonsPackage.COMMENTABLE___GET_PARENT_BY_ETYPE__ECLASS:
            return getParentByEType((EClass) arguments.get(0));
        case CommonsPackage.COMMENTABLE___GET_FIRST_CHILD_BY_ETYPE__ECLASS:
            return getFirstChildByEType((EClass) arguments.get(0));
        case CommonsPackage.COMMENTABLE___GET_PARENT_BY_TYPE__CLASS:
            return getParentByType((Class) arguments.get(0));
        case CommonsPackage.COMMENTABLE___GET_FIRST_CHILD_BY_TYPE__CLASS:
            return getFirstChildByType((Class) arguments.get(0));
        case CommonsPackage.COMMENTABLE___GET_CHILDREN_BY_ETYPE__ECLASS:
            return getChildrenByEType((EClass) arguments.get(0));
        case CommonsPackage.COMMENTABLE___GET_CHILDREN_BY_TYPE__CLASS:
            return getChildrenByType((Class) arguments.get(0));
        case CommonsPackage.COMMENTABLE___GET_COMMENTS:
            return getComments();
        case CommonsPackage.COMMENTABLE___ADD_BEFORE_CONTAINING_STATEMENT__STATEMENT:
            addBeforeContainingStatement((Statement) arguments.get(0));
            return null;
        case CommonsPackage.COMMENTABLE___ADD_AFTER_CONTAINING_STATEMENT__STATEMENT:
            addAfterContainingStatement((Statement) arguments.get(0));
            return null;
        default:
            return super.eInvoke(operationID, arguments);
        }
    }

} //CommentableImpl
