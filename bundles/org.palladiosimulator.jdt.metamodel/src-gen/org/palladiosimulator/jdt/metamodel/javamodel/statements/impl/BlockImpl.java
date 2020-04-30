/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.statements.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.palladiosimulator.jdt.metamodel.javamodel.members.impl.MemberImpl;

import org.palladiosimulator.jdt.metamodel.javamodel.modifiers.Modifiable;
import org.palladiosimulator.jdt.metamodel.javamodel.modifiers.Modifier;
import org.palladiosimulator.jdt.metamodel.javamodel.modifiers.ModifiersPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.statements.Block;
import org.palladiosimulator.jdt.metamodel.javamodel.statements.Statement;
import org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementListContainer;
import org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementsPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.variables.LocalVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.statements.impl.BlockImpl#getStatements <em>Statements</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.statements.impl.BlockImpl#getModifiers <em>Modifiers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BlockImpl extends MemberImpl implements Block {
    /**
     * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStatements()
     * @generated
     * @ordered
     */
    protected EList<Statement> statements;

    /**
     * The cached value of the '{@link #getModifiers() <em>Modifiers</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModifiers()
     * @generated
     * @ordered
     */
    protected EList<Modifier> modifiers;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BlockImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return StatementsPackage.Literals.BLOCK;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Statement> getStatements() {
        if (statements == null) {
            statements = new EObjectContainmentEList<Statement>(Statement.class, this,
                    StatementsPackage.BLOCK__STATEMENTS);
        }
        return statements;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Modifier> getModifiers() {
        if (modifiers == null) {
            modifiers = new EObjectContainmentEList<Modifier>(Modifier.class, this, StatementsPackage.BLOCK__MODIFIERS);
        }
        return modifiers;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LocalVariable getLocalVariable(final String name) {
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case StatementsPackage.BLOCK__STATEMENTS:
            return ((InternalEList<?>) getStatements()).basicRemove(otherEnd, msgs);
        case StatementsPackage.BLOCK__MODIFIERS:
            return ((InternalEList<?>) getModifiers()).basicRemove(otherEnd, msgs);
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
        case StatementsPackage.BLOCK__STATEMENTS:
            return getStatements();
        case StatementsPackage.BLOCK__MODIFIERS:
            return getModifiers();
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
        case StatementsPackage.BLOCK__STATEMENTS:
            getStatements().clear();
            getStatements().addAll((Collection<? extends Statement>) newValue);
            return;
        case StatementsPackage.BLOCK__MODIFIERS:
            getModifiers().clear();
            getModifiers().addAll((Collection<? extends Modifier>) newValue);
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
        case StatementsPackage.BLOCK__STATEMENTS:
            getStatements().clear();
            return;
        case StatementsPackage.BLOCK__MODIFIERS:
            getModifiers().clear();
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
        case StatementsPackage.BLOCK__STATEMENTS:
            return statements != null && !statements.isEmpty();
        case StatementsPackage.BLOCK__MODIFIERS:
            return modifiers != null && !modifiers.isEmpty();
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
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == Statement.class) {
            switch (derivedFeatureID) {
            default:
                return -1;
            }
        }
        if (baseClass == StatementListContainer.class) {
            switch (derivedFeatureID) {
            case StatementsPackage.BLOCK__STATEMENTS:
                return StatementsPackage.STATEMENT_LIST_CONTAINER__STATEMENTS;
            default:
                return -1;
            }
        }
        if (baseClass == Modifiable.class) {
            switch (derivedFeatureID) {
            case StatementsPackage.BLOCK__MODIFIERS:
                return ModifiersPackage.MODIFIABLE__MODIFIERS;
            default:
                return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == Statement.class) {
            switch (baseFeatureID) {
            default:
                return -1;
            }
        }
        if (baseClass == StatementListContainer.class) {
            switch (baseFeatureID) {
            case StatementsPackage.STATEMENT_LIST_CONTAINER__STATEMENTS:
                return StatementsPackage.BLOCK__STATEMENTS;
            default:
                return -1;
            }
        }
        if (baseClass == Modifiable.class) {
            switch (baseFeatureID) {
            case ModifiersPackage.MODIFIABLE__MODIFIERS:
                return StatementsPackage.BLOCK__MODIFIERS;
            default:
                return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
        if (baseClass == Statement.class) {
            switch (baseOperationID) {
            default:
                return -1;
            }
        }
        if (baseClass == StatementListContainer.class) {
            switch (baseOperationID) {
            case StatementsPackage.STATEMENT_LIST_CONTAINER___GET_LOCAL_VARIABLE__STRING:
                return StatementsPackage.BLOCK___GET_LOCAL_VARIABLE__STRING;
            default:
                return -1;
            }
        }
        if (baseClass == Modifiable.class) {
            switch (baseOperationID) {
            default:
                return -1;
            }
        }
        return super.eDerivedOperationID(baseOperationID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
        switch (operationID) {
        case StatementsPackage.BLOCK___GET_LOCAL_VARIABLE__STRING:
            return getLocalVariable((String) arguments.get(0));
        default:
            return super.eInvoke(operationID, arguments);
        }
    }

} //BlockImpl
