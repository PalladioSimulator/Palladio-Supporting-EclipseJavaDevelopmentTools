/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.literals.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.literals.DecimalFloatLiteral;
import org.palladiosimulator.jdt.metamodel.javamodel.literals.LiteralsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decimal Float Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.literals.impl.DecimalFloatLiteralImpl#getDecimalValue <em>Decimal Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DecimalFloatLiteralImpl extends FloatLiteralImpl implements DecimalFloatLiteral {
    /**
     * The default value of the '{@link #getDecimalValue() <em>Decimal Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDecimalValue()
     * @generated
     * @ordered
     */
    protected static final float DECIMAL_VALUE_EDEFAULT = 0.0F;

    /**
     * The cached value of the '{@link #getDecimalValue() <em>Decimal Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDecimalValue()
     * @generated
     * @ordered
     */
    protected float decimalValue = DECIMAL_VALUE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DecimalFloatLiteralImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return LiteralsPackage.Literals.DECIMAL_FLOAT_LITERAL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public float getDecimalValue() {
        return decimalValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDecimalValue(float newDecimalValue) {
        float oldDecimalValue = decimalValue;
        decimalValue = newDecimalValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, LiteralsPackage.DECIMAL_FLOAT_LITERAL__DECIMAL_VALUE,
                    oldDecimalValue, decimalValue));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case LiteralsPackage.DECIMAL_FLOAT_LITERAL__DECIMAL_VALUE:
            return getDecimalValue();
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
        case LiteralsPackage.DECIMAL_FLOAT_LITERAL__DECIMAL_VALUE:
            setDecimalValue((Float) newValue);
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
        case LiteralsPackage.DECIMAL_FLOAT_LITERAL__DECIMAL_VALUE:
            setDecimalValue(DECIMAL_VALUE_EDEFAULT);
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
        case LiteralsPackage.DECIMAL_FLOAT_LITERAL__DECIMAL_VALUE:
            return decimalValue != DECIMAL_VALUE_EDEFAULT;
        default:
            return super.eIsSet(featureID);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy())
            return super.toString();

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (decimalValue: ");
        result.append(decimalValue);
        result.append(')');
        return result.toString();
    }

} //DecimalFloatLiteralImpl
