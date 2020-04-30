/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.literals;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Octal Long Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.OctalLongLiteral#getOctalValue <em>Octal Value</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.LiteralsPackage#getOctalLongLiteral()
 * @model
 * @generated
 */
public interface OctalLongLiteral extends LongLiteral {
    /**
     * Returns the value of the '<em><b>Octal Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Octal Value</em>' attribute.
     * @see #setOctalValue(BigInteger)
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.LiteralsPackage#getOctalLongLiteral_OctalValue()
     * @model required="true"
     * @generated
     */
    BigInteger getOctalValue();

    /**
     * Sets the value of the '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.OctalLongLiteral#getOctalValue <em>Octal Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Octal Value</em>' attribute.
     * @see #getOctalValue()
     * @generated
     */
    void setOctalValue(BigInteger value);

} // OctalLongLiteral
