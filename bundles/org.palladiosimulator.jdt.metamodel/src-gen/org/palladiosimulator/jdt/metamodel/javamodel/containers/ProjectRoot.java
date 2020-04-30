/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.containers;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.containers.ProjectRoot#getPackages <em>Packages</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.containers.ProjectRoot#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.containers.ContainersPackage#getProjectRoot()
 * @model
 * @generated
 */
public interface ProjectRoot extends EObject {
    /**
     * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
     * The list contents are of type {@link org.palladiosimulator.jdt.metamodel.javamodel.containers.Package}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Packages</em>' containment reference list.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.containers.ContainersPackage#getProjectRoot_Packages()
     * @model containment="true"
     * @generated
     */
    EList<org.palladiosimulator.jdt.metamodel.javamodel.containers.Package> getPackages();

    /**
     * Returns the value of the '<em><b>Path</b></em>' attribute.
     * The default value is <code>""</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Path</em>' attribute.
     * @see #setPath(String)
     * @see org.palladiosimulator.jdt.metamodel.javamodel.containers.ContainersPackage#getProjectRoot_Path()
     * @model default=""
     * @generated
     */
    String getPath();

    /**
     * Sets the value of the '{@link org.palladiosimulator.jdt.metamodel.javamodel.containers.ProjectRoot#getPath <em>Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Path</em>' attribute.
     * @see #getPath()
     * @generated
     */
    void setPath(String value);

} // ProjectRoot
