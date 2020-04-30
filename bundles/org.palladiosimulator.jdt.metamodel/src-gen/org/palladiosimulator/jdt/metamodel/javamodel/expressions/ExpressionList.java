/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.expressions;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.jdt.metamodel.javamodel.statements.ForLoopInitializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExpressionList#getExpressions <em>Expressions</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExpressionsPackage#getExpressionList()
 * @model
 * @generated
 */
public interface ExpressionList extends ForLoopInitializer {
    /**
     * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
     * The list contents are of type {@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.Expression}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Expressions</em>' containment reference list.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExpressionsPackage#getExpressionList_Expressions()
     * @model containment="true"
     * @generated
     */
    EList<Expression> getExpressions();

} // ExpressionList
