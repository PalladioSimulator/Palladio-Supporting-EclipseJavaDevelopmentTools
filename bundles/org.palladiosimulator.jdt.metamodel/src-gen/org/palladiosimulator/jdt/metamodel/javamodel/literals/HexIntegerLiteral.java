/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.literals;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hex Integer Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.HexIntegerLiteral#getHexValue <em>Hex Value</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.LiteralsPackage#getHexIntegerLiteral()
 * @model
 * @generated
 */
public interface HexIntegerLiteral extends IntegerLiteral {
    /**
     * Returns the value of the '<em><b>Hex Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Hex Value</em>' attribute.
     * @see #setHexValue(BigInteger)
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.LiteralsPackage#getHexIntegerLiteral_HexValue()
     * @model required="true"
     * @generated
     */
    BigInteger getHexValue();

    /**
     * Sets the value of the '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.HexIntegerLiteral#getHexValue <em>Hex Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Hex Value</em>' attribute.
     * @see #getHexValue()
     * @generated
     */
    void setHexValue(BigInteger value);

} // HexIntegerLiteral
