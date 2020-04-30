/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.literals;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decimal Integer Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.DecimalIntegerLiteral#getDecimalValue <em>Decimal Value</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.LiteralsPackage#getDecimalIntegerLiteral()
 * @model
 * @generated
 */
public interface DecimalIntegerLiteral extends IntegerLiteral {
    /**
     * Returns the value of the '<em><b>Decimal Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Decimal Value</em>' attribute.
     * @see #setDecimalValue(BigInteger)
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.LiteralsPackage#getDecimalIntegerLiteral_DecimalValue()
     * @model required="true"
     * @generated
     */
    BigInteger getDecimalValue();

    /**
     * Sets the value of the '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.DecimalIntegerLiteral#getDecimalValue <em>Decimal Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Decimal Value</em>' attribute.
     * @see #getDecimalValue()
     * @generated
     */
    void setDecimalValue(BigInteger value);

} // DecimalIntegerLiteral
