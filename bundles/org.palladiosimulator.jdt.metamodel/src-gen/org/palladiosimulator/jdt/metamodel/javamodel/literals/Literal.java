/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.literals;

import org.palladiosimulator.jdt.metamodel.javamodel.expressions.PrimaryExpression;

import org.palladiosimulator.jdt.metamodel.javamodel.types.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.LiteralsPackage#getLiteral()
 * @model abstract="true"
 * @generated
 */
public interface Literal extends PrimaryExpression {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    Type getOneType(boolean alternative);

} // Literal
