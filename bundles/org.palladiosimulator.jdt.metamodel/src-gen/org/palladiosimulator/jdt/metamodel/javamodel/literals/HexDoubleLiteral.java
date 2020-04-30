/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.literals;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hex Double Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.HexDoubleLiteral#getHexValue <em>Hex Value</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.LiteralsPackage#getHexDoubleLiteral()
 * @model
 * @generated
 */
public interface HexDoubleLiteral extends DoubleLiteral {
    /**
     * Returns the value of the '<em><b>Hex Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Hex Value</em>' attribute.
     * @see #setHexValue(double)
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.LiteralsPackage#getHexDoubleLiteral_HexValue()
     * @model required="true"
     * @generated
     */
    double getHexValue();

    /**
     * Sets the value of the '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.HexDoubleLiteral#getHexValue <em>Hex Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Hex Value</em>' attribute.
     * @see #getHexValue()
     * @generated
     */
    void setHexValue(double value);

} // HexDoubleLiteral
