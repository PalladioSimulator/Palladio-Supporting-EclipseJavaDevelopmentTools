/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.statements.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.palladiosimulator.jdt.metamodel.javamodel.expressions.Expression;

import org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementsPackage;
import org.palladiosimulator.jdt.metamodel.javamodel.statements.Switch;
import org.palladiosimulator.jdt.metamodel.javamodel.statements.SwitchCase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.statements.impl.SwitchImpl#getCases <em>Cases</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.statements.impl.SwitchImpl#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SwitchImpl extends StatementImpl implements Switch {
    /**
     * The cached value of the '{@link #getCases() <em>Cases</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCases()
     * @generated
     * @ordered
     */
    protected EList<SwitchCase> cases;

    /**
     * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVariable()
     * @generated
     * @ordered
     */
    protected Expression variable;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SwitchImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return StatementsPackage.Literals.SWITCH;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<SwitchCase> getCases() {
        if (cases == null) {
            cases = new EObjectContainmentEList<SwitchCase>(SwitchCase.class, this, StatementsPackage.SWITCH__CASES);
        }
        return cases;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Expression getVariable() {
        return variable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetVariable(Expression newVariable, NotificationChain msgs) {
        Expression oldVariable = variable;
        variable = newVariable;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    StatementsPackage.SWITCH__VARIABLE, oldVariable, newVariable);
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
    public void setVariable(Expression newVariable) {
        if (newVariable != variable) {
            NotificationChain msgs = null;
            if (variable != null)
                msgs = ((InternalEObject) variable).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - StatementsPackage.SWITCH__VARIABLE, null, msgs);
            if (newVariable != null)
                msgs = ((InternalEObject) newVariable).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - StatementsPackage.SWITCH__VARIABLE, null, msgs);
            msgs = basicSetVariable(newVariable, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.SWITCH__VARIABLE, newVariable,
                    newVariable));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case StatementsPackage.SWITCH__CASES:
            return ((InternalEList<?>) getCases()).basicRemove(otherEnd, msgs);
        case StatementsPackage.SWITCH__VARIABLE:
            return basicSetVariable(null, msgs);
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
        case StatementsPackage.SWITCH__CASES:
            return getCases();
        case StatementsPackage.SWITCH__VARIABLE:
            return getVariable();
        default:
            return super.eGet(featureID, resolve, coreType);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case StatementsPackage.SWITCH__CASES:
            getCases().clear();
            getCases().addAll((Collection<? extends SwitchCase>) newValue);
            return;
        case StatementsPackage.SWITCH__VARIABLE:
            setVariable((Expression) newValue);
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
        case StatementsPackage.SWITCH__CASES:
            getCases().clear();
            return;
        case StatementsPackage.SWITCH__VARIABLE:
            setVariable((Expression) null);
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
        case StatementsPackage.SWITCH__CASES:
            return cases != null && !cases.isEmpty();
        case StatementsPackage.SWITCH__VARIABLE:
            return variable != null;
        default:
            return super.eIsSet(featureID);
        }
    }

} //SwitchImpl
