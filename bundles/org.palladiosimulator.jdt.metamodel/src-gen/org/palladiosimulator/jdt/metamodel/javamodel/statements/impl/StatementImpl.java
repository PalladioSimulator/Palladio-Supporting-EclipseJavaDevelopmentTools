/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.statements.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.impl.CommentableImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.statements.Statement;
import org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class StatementImpl extends CommentableImpl implements Statement {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected StatementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return StatementsPackage.Literals.STATEMENT;
    }

} //StatementImpl
