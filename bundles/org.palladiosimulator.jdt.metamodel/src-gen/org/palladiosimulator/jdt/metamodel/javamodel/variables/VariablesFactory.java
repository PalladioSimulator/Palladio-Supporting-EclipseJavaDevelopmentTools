/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.variables;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.jdt.metamodel.javamodel.variables.VariablesPackage
 * @generated
 */
public interface VariablesFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    VariablesFactory eINSTANCE = org.palladiosimulator.jdt.metamodel.javamodel.variables.impl.VariablesFactoryImpl
            .init();

    /**
     * Returns a new object of class '<em>Local Variable</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Local Variable</em>'.
     * @generated
     */
    LocalVariable createLocalVariable();

    /**
     * Returns a new object of class '<em>Additional Local Variable</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Additional Local Variable</em>'.
     * @generated
     */
    AdditionalLocalVariable createAdditionalLocalVariable();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    VariablesPackage getVariablesPackage();

} //VariablesFactory
