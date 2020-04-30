/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.literals;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Character Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.CharacterLiteral#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.LiteralsPackage#getCharacterLiteral()
 * @model
 * @generated
 */
public interface CharacterLiteral extends Literal {
    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see #setValue(char)
     * @see org.palladiosimulator.jdt.metamodel.javamodel.literals.LiteralsPackage#getCharacterLiteral_Value()
     * @model required="true"
     * @generated
     */
    char getValue();

    /**
     * Sets the value of the '{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.CharacterLiteral#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue(char value);

} // CharacterLiteral
