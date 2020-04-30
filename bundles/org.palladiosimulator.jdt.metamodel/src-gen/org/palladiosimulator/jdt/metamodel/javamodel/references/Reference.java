/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.references;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArraySelector;

import org.palladiosimulator.jdt.metamodel.javamodel.expressions.PrimaryExpression;

import org.palladiosimulator.jdt.metamodel.javamodel.generics.TypeArgumentable;

import org.palladiosimulator.jdt.metamodel.javamodel.types.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.references.Reference#getNext <em>Next</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.references.Reference#getArraySelectors <em>Array Selectors</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.references.ReferencesPackage#getReference()
 * @model abstract="true"
 * @generated
 */
public interface Reference extends PrimaryExpression, TypeArgumentable {
    /**
     * Returns the value of the '<em><b>Next</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Next</em>' containment reference.
     * @see #setNext(Reference)
     * @see org.palladiosimulator.jdt.metamodel.javamodel.references.ReferencesPackage#getReference_Next()
     * @model containment="true"
     * @generated
     */
    Reference getNext();

    /**
     * Sets the value of the '{@link org.palladiosimulator.jdt.metamodel.javamodel.references.Reference#getNext <em>Next</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Next</em>' containment reference.
     * @see #getNext()
     * @generated
     */
    void setNext(Reference value);

    /**
     * Returns the value of the '<em><b>Array Selectors</b></em>' containment reference list.
     * The list contents are of type {@link org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArraySelector}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Array Selectors</em>' containment reference list.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.references.ReferencesPackage#getReference_ArraySelectors()
     * @model containment="true"
     * @generated
     */
    EList<ArraySelector> getArraySelectors();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * <!-- end-model-doc -->
     * @model kind="operation"
     * @generated
     */
    Type getReferencedType();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * <!-- end-model-doc -->
     * @model kind="operation"
     * @generated
     */
    Reference getPrevious();

} // Reference
