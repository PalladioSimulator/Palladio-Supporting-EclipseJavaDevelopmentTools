/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.literals;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decimal Float Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.DecimalFloatLiteral#getDecimalValue <em>Decimal Value</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.LiteralsPackage#getDecimalFloatLiteral()
 * @model
 * @generated
 */
public interface DecimalFloatLiteral extends FloatLiteral {
    /**
     * Returns the value of the '<em><b>Decimal Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Decimal Value</em>' attribute.
     * @see #setDecimalValue(float)
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.LiteralsPackage#getDecimalFloatLiteral_DecimalValue()
     * @model required="true"
     * @generated
     */
    float getDecimalValue();

    /**
     * Sets the value of the '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.DecimalFloatLiteral#getDecimalValue <em>Decimal Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Decimal Value</em>' attribute.
     * @see #getDecimalValue()
     * @generated
     */
    void setDecimalValue(float value);

} // DecimalFloatLiteral
