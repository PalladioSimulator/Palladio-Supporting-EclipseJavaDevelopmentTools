/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.expressions.AssignmentExpressionChild;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.ConditionalExpression;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.ConditionalExpressionChild;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.Expression;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExpressionsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ConditionalExpressionImpl#getChild <em>Child</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ConditionalExpressionImpl#getExpressionIf <em>Expression If</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.ConditionalExpressionImpl#getExpressionElse <em>Expression Else</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionalExpressionImpl extends AssignmentExpressionChildImpl implements ConditionalExpression {
    /**
     * The cached value of the '{@link #getChild() <em>Child</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChild()
     * @generated
     * @ordered
     */
    protected ConditionalExpressionChild child;

    /**
     * The cached value of the '{@link #getExpressionIf() <em>Expression If</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExpressionIf()
     * @generated
     * @ordered
     */
    protected Expression expressionIf;

    /**
     * The cached value of the '{@link #getExpressionElse() <em>Expression Else</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExpressionElse()
     * @generated
     * @ordered
     */
    protected AssignmentExpressionChild expressionElse;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ConditionalExpressionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExpressionsPackage.Literals.CONDITIONAL_EXPRESSION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ConditionalExpressionChild getChild() {
        return child;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetChild(ConditionalExpressionChild newChild, NotificationChain msgs) {
        ConditionalExpressionChild oldChild = child;
        child = newChild;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    ExpressionsPackage.CONDITIONAL_EXPRESSION__CHILD, oldChild, newChild);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setChild(ConditionalExpressionChild newChild) {
        if (newChild != child) {
            NotificationChain msgs = null;
            if (child != null)
                msgs = ((InternalEObject) child).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - ExpressionsPackage.CONDITIONAL_EXPRESSION__CHILD, null, msgs);
            if (newChild != null)
                msgs = ((InternalEObject) newChild).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - ExpressionsPackage.CONDITIONAL_EXPRESSION__CHILD, null, msgs);
            msgs = basicSetChild(newChild, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.CONDITIONAL_EXPRESSION__CHILD,
                    newChild, newChild));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Expression getExpressionIf() {
        return expressionIf;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetExpressionIf(Expression newExpressionIf, NotificationChain msgs) {
        Expression oldExpressionIf = expressionIf;
        expressionIf = newExpressionIf;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_IF, oldExpressionIf, newExpressionIf);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setExpressionIf(Expression newExpressionIf) {
        if (newExpressionIf != expressionIf) {
            NotificationChain msgs = null;
            if (expressionIf != null)
                msgs = ((InternalEObject) expressionIf).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_IF, null, msgs);
            if (newExpressionIf != null)
                msgs = ((InternalEObject) newExpressionIf).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_IF, null, msgs);
            msgs = basicSetExpressionIf(newExpressionIf, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_IF, newExpressionIf, newExpressionIf));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AssignmentExpressionChild getExpressionElse() {
        return expressionElse;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetExpressionElse(AssignmentExpressionChild newExpressionElse,
            NotificationChain msgs) {
        AssignmentExpressionChild oldExpressionElse = expressionElse;
        expressionElse = newExpressionElse;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_ELSE, oldExpressionElse, newExpressionElse);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setExpressionElse(AssignmentExpressionChild newExpressionElse) {
        if (newExpressionElse != expressionElse) {
            NotificationChain msgs = null;
            if (expressionElse != null)
                msgs = ((InternalEObject) expressionElse).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_ELSE, null,
                        msgs);
            if (newExpressionElse != null)
                msgs = ((InternalEObject) newExpressionElse).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_ELSE, null,
                        msgs);
            msgs = basicSetExpressionElse(newExpressionElse, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_ELSE, newExpressionElse, newExpressionElse));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case ExpressionsPackage.CONDITIONAL_EXPRESSION__CHILD:
            return basicSetChild(null, msgs);
        case ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_IF:
            return basicSetExpressionIf(null, msgs);
        case ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_ELSE:
            return basicSetExpressionElse(null, msgs);
        default:
            return super.eInverseRemove(otherEnd, featureID, msgs);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case ExpressionsPackage.CONDITIONAL_EXPRESSION__CHILD:
            return getChild();
        case ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_IF:
            return getExpressionIf();
        case ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_ELSE:
            return getExpressionElse();
        default:
            return super.eGet(featureID, resolve, coreType);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case ExpressionsPackage.CONDITIONAL_EXPRESSION__CHILD:
            setChild((ConditionalExpressionChild) newValue);
            return;
        case ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_IF:
            setExpressionIf((Expression) newValue);
            return;
        case ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_ELSE:
            setExpressionElse((AssignmentExpressionChild) newValue);
            return;
        default:
            super.eSet(featureID, newValue);
            return;
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
        case ExpressionsPackage.CONDITIONAL_EXPRESSION__CHILD:
            setChild((ConditionalExpressionChild) null);
            return;
        case ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_IF:
            setExpressionIf((Expression) null);
            return;
        case ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_ELSE:
            setExpressionElse((AssignmentExpressionChild) null);
            return;
        default:
            super.eUnset(featureID);
            return;
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
        case ExpressionsPackage.CONDITIONAL_EXPRESSION__CHILD:
            return child != null;
        case ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_IF:
            return expressionIf != null;
        case ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_ELSE:
            return expressionElse != null;
        default:
            return super.eIsSet(featureID);
        }
    }

} //ConditionalExpressionImpl
