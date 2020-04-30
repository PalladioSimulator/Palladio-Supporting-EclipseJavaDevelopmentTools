/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.modifiers.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.jdt.metamodel.javamodel.modifiers.Modifier;
import org.palladiosimulator.jdt.metamodel.javamodel.modifiers.ModifiersPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ModifierImpl extends AnnotationInstanceOrModifierImpl implements Modifier {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ModifierImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ModifiersPackage.Literals.MODIFIER;
    }

} //ModifierImpl
