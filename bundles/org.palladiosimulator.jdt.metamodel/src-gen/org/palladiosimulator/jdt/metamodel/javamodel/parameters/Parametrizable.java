/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.parameters;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parametrizable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.parameters.Parametrizable#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.parameters.ParametersPackage#getParametrizable()
 * @model abstract="true"
 * @generated
 */
public interface Parametrizable extends Commentable {
    /**
     * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
     * The list contents are of type {@link org.palladiosimulator.jdt.metamodel.javamodel.parameters.Parameter}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parameters</em>' containment reference list.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.parameters.ParametersPackage#getParametrizable_Parameters()
     * @model containment="true"
     * @generated
     */
    EList<Parameter> getParameters();

} // Parametrizable
