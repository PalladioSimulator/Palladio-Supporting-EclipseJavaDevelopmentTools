/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.imports;

import org.palladiosimulator.jdt.metamodel.javamodel.modifiers.Static;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Static Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.imports.StaticImport#getStatic <em>Static</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.imports.ImportsPackage#getStaticImport()
 * @model abstract="true"
 * @generated
 */
public interface StaticImport extends Import {
    /**
     * Returns the value of the '<em><b>Static</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Static</em>' containment reference.
     * @see #setStatic(Static)
     * @see org.palladiosimulator.jdt.metamodel.javamodel.imports.ImportsPackage#getStaticImport_Static()
     * @model containment="true" required="true"
     * @generated
     */
    Static getStatic();

    /**
     * Sets the value of the '{@link org.palladiosimulator.jdt.metamodel.javamodel.imports.StaticImport#getStatic <em>Static</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Static</em>' containment reference.
     * @see #getStatic()
     * @generated
     */
    void setStatic(Static value);

} // StaticImport
