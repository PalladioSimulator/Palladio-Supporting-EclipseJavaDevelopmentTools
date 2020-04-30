/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.imports.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.ConcreteClassifier;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.NamedElement;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.impl.NamespaceAwareElementImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.imports.Import;
import org.palladiosimulator.jdt.metamodel.javamodel.imports.ImportsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ImportImpl extends NamespaceAwareElementImpl implements Import {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ImportImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ImportsPackage.Literals.IMPORT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ConcreteClassifier getImportedClassifier(final String name) {
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<ConcreteClassifier> getImportedClassifiers() {
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<NamedElement> getImportedMembers() {
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
        switch (operationID) {
        case ImportsPackage.IMPORT___GET_IMPORTED_CLASSIFIER__STRING:
            return getImportedClassifier((String) arguments.get(0));
        case ImportsPackage.IMPORT___GET_IMPORTED_CLASSIFIERS:
            return getImportedClassifiers();
        case ImportsPackage.IMPORT___GET_IMPORTED_MEMBERS:
            return getImportedMembers();
        default:
            return super.eInvoke(operationID, arguments);
        }
    }

} //ImportImpl
