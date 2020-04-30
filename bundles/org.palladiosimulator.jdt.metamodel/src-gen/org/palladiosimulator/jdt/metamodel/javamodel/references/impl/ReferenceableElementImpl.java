/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.references.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.impl.NamedElementImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.references.ReferenceableElement;
import org.palladiosimulator.jdt.metamodel.javamodel.references.ReferencesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Referenceable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ReferenceableElementImpl extends NamedElementImpl implements ReferenceableElement {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ReferenceableElementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ReferencesPackage.Literals.REFERENCEABLE_ELEMENT;
    }

} //ReferenceableElementImpl
