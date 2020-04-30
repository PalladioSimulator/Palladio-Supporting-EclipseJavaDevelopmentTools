/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.statements.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.palladiosimulator.jdt.metamodel.javamodel.statements.Block;
import org.palladiosimulator.jdt.metamodel.javamodel.statements.CatchBlock;
import org.palladiosimulator.jdt.metamodel.javamodel.statements.Statement;
import org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementListContainer;
import org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementsPackage;
import org.palladiosimulator.jdt.metamodel.javamodel.statements.TryBlock;

import org.palladiosimulator.jdt.metamodel.javamodel.variables.LocalVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Try Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.statements.impl.TryBlockImpl#getStatements <em>Statements</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.statements.impl.TryBlockImpl#getCatcheBlocks <em>Catche Blocks</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.statements.impl.TryBlockImpl#getFinallyBlock <em>Finally Block</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TryBlockImpl extends StatementImpl implements TryBlock {
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
     * The cached value of the '{@link #getCatcheBlocks() <em>Catche Blocks</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCatcheBlocks()
     * @generated
     * @ordered
     */
    protected EList<CatchBlock> catcheBlocks;

    /**
     * The cached value of the '{@link #getFinallyBlock() <em>Finally Block</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFinallyBlock()
     * @generated
     * @ordered
     */
    protected Block finallyBlock;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TryBlockImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return StatementsPackage.Literals.TRY_BLOCK;
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
                    StatementsPackage.TRY_BLOCK__STATEMENTS);
        }
        return statements;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<CatchBlock> getCatcheBlocks() {
        if (catcheBlocks == null) {
            catcheBlocks = new EObjectContainmentEList<CatchBlock>(CatchBlock.class, this,
                    StatementsPackage.TRY_BLOCK__CATCHE_BLOCKS);
        }
        return catcheBlocks;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Block getFinallyBlock() {
        return finallyBlock;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetFinallyBlock(Block newFinallyBlock, NotificationChain msgs) {
        Block oldFinallyBlock = finallyBlock;
        finallyBlock = newFinallyBlock;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    StatementsPackage.TRY_BLOCK__FINALLY_BLOCK, oldFinallyBlock, newFinallyBlock);
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
    public void setFinallyBlock(Block newFinallyBlock) {
        if (newFinallyBlock != finallyBlock) {
            NotificationChain msgs = null;
            if (finallyBlock != null)
                msgs = ((InternalEObject) finallyBlock).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - StatementsPackage.TRY_BLOCK__FINALLY_BLOCK, null, msgs);
            if (newFinallyBlock != null)
                msgs = ((InternalEObject) newFinallyBlock).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - StatementsPackage.TRY_BLOCK__FINALLY_BLOCK, null, msgs);
            msgs = basicSetFinallyBlock(newFinallyBlock, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.TRY_BLOCK__FINALLY_BLOCK,
                    newFinallyBlock, newFinallyBlock));
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
        case StatementsPackage.TRY_BLOCK__STATEMENTS:
            return ((InternalEList<?>) getStatements()).basicRemove(otherEnd, msgs);
        case StatementsPackage.TRY_BLOCK__CATCHE_BLOCKS:
            return ((InternalEList<?>) getCatcheBlocks()).basicRemove(otherEnd, msgs);
        case StatementsPackage.TRY_BLOCK__FINALLY_BLOCK:
            return basicSetFinallyBlock(null, msgs);
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
        case StatementsPackage.TRY_BLOCK__STATEMENTS:
            return getStatements();
        case StatementsPackage.TRY_BLOCK__CATCHE_BLOCKS:
            return getCatcheBlocks();
        case StatementsPackage.TRY_BLOCK__FINALLY_BLOCK:
            return getFinallyBlock();
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
        case StatementsPackage.TRY_BLOCK__STATEMENTS:
            getStatements().clear();
            getStatements().addAll((Collection<? extends Statement>) newValue);
            return;
        case StatementsPackage.TRY_BLOCK__CATCHE_BLOCKS:
            getCatcheBlocks().clear();
            getCatcheBlocks().addAll((Collection<? extends CatchBlock>) newValue);
            return;
        case StatementsPackage.TRY_BLOCK__FINALLY_BLOCK:
            setFinallyBlock((Block) newValue);
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
        case StatementsPackage.TRY_BLOCK__STATEMENTS:
            getStatements().clear();
            return;
        case StatementsPackage.TRY_BLOCK__CATCHE_BLOCKS:
            getCatcheBlocks().clear();
            return;
        case StatementsPackage.TRY_BLOCK__FINALLY_BLOCK:
            setFinallyBlock((Block) null);
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
        case StatementsPackage.TRY_BLOCK__STATEMENTS:
            return statements != null && !statements.isEmpty();
        case StatementsPackage.TRY_BLOCK__CATCHE_BLOCKS:
            return catcheBlocks != null && !catcheBlocks.isEmpty();
        case StatementsPackage.TRY_BLOCK__FINALLY_BLOCK:
            return finallyBlock != null;
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
        if (baseClass == StatementListContainer.class) {
            switch (derivedFeatureID) {
            case StatementsPackage.TRY_BLOCK__STATEMENTS:
                return StatementsPackage.STATEMENT_LIST_CONTAINER__STATEMENTS;
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
        if (baseClass == StatementListContainer.class) {
            switch (baseFeatureID) {
            case StatementsPackage.STATEMENT_LIST_CONTAINER__STATEMENTS:
                return StatementsPackage.TRY_BLOCK__STATEMENTS;
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
        if (baseClass == StatementListContainer.class) {
            switch (baseOperationID) {
            case StatementsPackage.STATEMENT_LIST_CONTAINER___GET_LOCAL_VARIABLE__STRING:
                return StatementsPackage.TRY_BLOCK___GET_LOCAL_VARIABLE__STRING;
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
        case StatementsPackage.TRY_BLOCK___GET_LOCAL_VARIABLE__STRING:
            return getLocalVariable((String) arguments.get(0));
        default:
            return super.eInvoke(operationID, arguments);
        }
    }

} //TryBlockImpl
