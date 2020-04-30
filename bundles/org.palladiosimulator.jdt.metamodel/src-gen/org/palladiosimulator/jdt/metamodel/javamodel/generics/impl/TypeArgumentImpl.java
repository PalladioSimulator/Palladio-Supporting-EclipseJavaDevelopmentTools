/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.generics.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.jdt.metamodel.javamodel.arrays.impl.ArrayTypeableImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.generics.GenericsPackage;
import org.palladiosimulator.jdt.metamodel.javamodel.generics.TypeArgument;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class TypeArgumentImpl extends ArrayTypeableImpl implements TypeArgument {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TypeArgumentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return GenericsPackage.Literals.TYPE_ARGUMENT;
    }

} //TypeArgumentImpl
