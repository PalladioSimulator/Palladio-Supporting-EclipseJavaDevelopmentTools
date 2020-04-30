/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.literals.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.impl.CommentableImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.literals.LiteralsPackage;
import org.palladiosimulator.jdt.metamodel.javamodel.literals.Self;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Self</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class SelfImpl extends CommentableImpl implements Self {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SelfImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return LiteralsPackage.Literals.SELF;
    }

} //SelfImpl
