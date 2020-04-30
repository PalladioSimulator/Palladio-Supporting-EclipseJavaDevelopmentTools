/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.expressions.AssignmentExpression;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.AssignmentExpressionChild;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.Expression;
import org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExpressionsPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.operators.AssignmentOperator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assignment Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.AssignmentExpressionImpl#getChild <em>Child</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.AssignmentExpressionImpl#getAssignmentOperator <em>Assignment Operator</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.expressions.impl.AssignmentExpressionImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssignmentExpressionImpl extends ExpressionImpl implements AssignmentExpression {
    /**
     * The cached value of the '{@link #getChild() <em>Child</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChild()
     * @generated
     * @ordered
     */
    protected AssignmentExpressionChild child;

    /**
     * The cached value of the '{@link #getAssignmentOperator() <em>Assignment Operator</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAssignmentOperator()
     * @generated
     * @ordered
     */
    protected AssignmentOperator assignmentOperator;

    /**
     * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected Expression value;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AssignmentExpressionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AssignmentExpressionChild getChild() {
        return child;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetChild(AssignmentExpressionChild newChild, NotificationChain msgs) {
        AssignmentExpressionChild oldChild = child;
        child = newChild;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    ExpressionsPackage.ASSIGNMENT_EXPRESSION__CHILD, oldChild, newChild);
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
    public void setChild(AssignmentExpressionChild newChild) {
        if (newChild != child) {
            NotificationChain msgs = null;
            if (child != null)
                msgs = ((InternalEObject) child).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - ExpressionsPackage.ASSIGNMENT_EXPRESSION__CHILD, null, msgs);
            if (newChild != null)
                msgs = ((InternalEObject) newChild).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - ExpressionsPackage.ASSIGNMENT_EXPRESSION__CHILD, null, msgs);
            msgs = basicSetChild(newChild, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.ASSIGNMENT_EXPRESSION__CHILD,
                    newChild, newChild));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AssignmentOperator getAssignmentOperator() {
        return assignmentOperator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAssignmentOperator(AssignmentOperator newAssignmentOperator,
            NotificationChain msgs) {
        AssignmentOperator oldAssignmentOperator = assignmentOperator;
        assignmentOperator = newAssignmentOperator;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    ExpressionsPackage.ASSIGNMENT_EXPRESSION__ASSIGNMENT_OPERATOR, oldAssignmentOperator,
                    newAssignmentOperator);
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
    public void setAssignmentOperator(AssignmentOperator newAssignmentOperator) {
        if (newAssignmentOperator != assignmentOperator) {
            NotificationChain msgs = null;
            if (assignmentOperator != null)
                msgs = ((InternalEObject) assignmentOperator).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - ExpressionsPackage.ASSIGNMENT_EXPRESSION__ASSIGNMENT_OPERATOR, null,
                        msgs);
            if (newAssignmentOperator != null)
                msgs = ((InternalEObject) newAssignmentOperator).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - ExpressionsPackage.ASSIGNMENT_EXPRESSION__ASSIGNMENT_OPERATOR, null,
                        msgs);
            msgs = basicSetAssignmentOperator(newAssignmentOperator, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    ExpressionsPackage.ASSIGNMENT_EXPRESSION__ASSIGNMENT_OPERATOR, newAssignmentOperator,
                    newAssignmentOperator));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Expression getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetValue(Expression newValue, NotificationChain msgs) {
        Expression oldValue = value;
        value = newValue;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    ExpressionsPackage.ASSIGNMENT_EXPRESSION__VALUE, oldValue, newValue);
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
    public void setValue(Expression newValue) {
        if (newValue != value) {
            NotificationChain msgs = null;
            if (value != null)
                msgs = ((InternalEObject) value).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - ExpressionsPackage.ASSIGNMENT_EXPRESSION__VALUE, null, msgs);
            if (newValue != null)
                msgs = ((InternalEObject) newValue).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - ExpressionsPackage.ASSIGNMENT_EXPRESSION__VALUE, null, msgs);
            msgs = basicSetValue(newValue, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.ASSIGNMENT_EXPRESSION__VALUE,
                    newValue, newValue));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case ExpressionsPackage.ASSIGNMENT_EXPRESSION__CHILD:
            return basicSetChild(null, msgs);
        case ExpressionsPackage.ASSIGNMENT_EXPRESSION__ASSIGNMENT_OPERATOR:
            return basicSetAssignmentOperator(null, msgs);
        case ExpressionsPackage.ASSIGNMENT_EXPRESSION__VALUE:
            return basicSetValue(null, msgs);
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
        case ExpressionsPackage.ASSIGNMENT_EXPRESSION__CHILD:
            return getChild();
        case ExpressionsPackage.ASSIGNMENT_EXPRESSION__ASSIGNMENT_OPERATOR:
            return getAssignmentOperator();
        case ExpressionsPackage.ASSIGNMENT_EXPRESSION__VALUE:
            return getValue();
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
        case ExpressionsPackage.ASSIGNMENT_EXPRESSION__CHILD:
            setChild((AssignmentExpressionChild) newValue);
            return;
        case ExpressionsPackage.ASSIGNMENT_EXPRESSION__ASSIGNMENT_OPERATOR:
            setAssignmentOperator((AssignmentOperator) newValue);
            return;
        case ExpressionsPackage.ASSIGNMENT_EXPRESSION__VALUE:
            setValue((Expression) newValue);
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
        case ExpressionsPackage.ASSIGNMENT_EXPRESSION__CHILD:
            setChild((AssignmentExpressionChild) null);
            return;
        case ExpressionsPackage.ASSIGNMENT_EXPRESSION__ASSIGNMENT_OPERATOR:
            setAssignmentOperator((AssignmentOperator) null);
            return;
        case ExpressionsPackage.ASSIGNMENT_EXPRESSION__VALUE:
            setValue((Expression) null);
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
        case ExpressionsPackage.ASSIGNMENT_EXPRESSION__CHILD:
            return child != null;
        case ExpressionsPackage.ASSIGNMENT_EXPRESSION__ASSIGNMENT_OPERATOR:
            return assignmentOperator != null;
        case ExpressionsPackage.ASSIGNMENT_EXPRESSION__VALUE:
            return value != null;
        default:
            return super.eIsSet(featureID);
        }
    }

} //AssignmentExpressionImpl
