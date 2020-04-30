/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.annotations;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationsPackage
 * @generated
 */
public interface AnnotationsFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    AnnotationsFactory eINSTANCE = org.palladiosimulator.jdt.metamodel.javamodel.annotations.impl.AnnotationsFactoryImpl
            .init();

    /**
     * Returns a new object of class '<em>Annotation Instance</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Annotation Instance</em>'.
     * @generated
     */
    AnnotationInstance createAnnotationInstance();

    /**
     * Returns a new object of class '<em>Single Annotation Parameter</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Single Annotation Parameter</em>'.
     * @generated
     */
    SingleAnnotationParameter createSingleAnnotationParameter();

    /**
     * Returns a new object of class '<em>Annotation Parameter List</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Annotation Parameter List</em>'.
     * @generated
     */
    AnnotationParameterList createAnnotationParameterList();

    /**
     * Returns a new object of class '<em>Annotation Attribute Setting</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Annotation Attribute Setting</em>'.
     * @generated
     */
    AnnotationAttributeSetting createAnnotationAttributeSetting();

    /**
     * Returns a new object of class '<em>Annotation Attribute</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Annotation Attribute</em>'.
     * @generated
     */
    AnnotationAttribute createAnnotationAttribute();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    AnnotationsPackage getAnnotationsPackage();

} //AnnotationsFactory
