/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.references;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable;

import org.palladiosimulator.jdt.metamodel.javamodel.expressions.Expression;

import org.palladiosimulator.jdt.metamodel.javamodel.types.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Argumentable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.references.Argumentable#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.references.ReferencesPackage#getArgumentable()
 * @model abstract="true"
 * @generated
 */
public interface Argumentable extends Commentable {
    /**
     * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
     * The list contents are of type {@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.Expression}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Arguments</em>' containment reference list.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.references.ReferencesPackage#getArgumentable_Arguments()
     * @model containment="true"
     * @generated
     */
    EList<Expression> getArguments();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * <!-- end-model-doc -->
     * @model kind="operation"
     * @generated
     */
    EList<Type> getArgumentTypes();

} // Argumentable
