/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.variables.impl;

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

import org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationInstance;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable;

import org.palladiosimulator.jdt.metamodel.javamodel.expressions.Expression;

import org.palladiosimulator.jdt.metamodel.javamodel.instantiations.Initializable;
import org.palladiosimulator.jdt.metamodel.javamodel.instantiations.InstantiationsPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.modifiers.AnnotableAndModifiable;
import org.palladiosimulator.jdt.metamodel.javamodel.modifiers.AnnotationInstanceOrModifier;
import org.palladiosimulator.jdt.metamodel.javamodel.modifiers.Modifier;
import org.palladiosimulator.jdt.metamodel.javamodel.modifiers.ModifiersPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.statements.ForLoopInitializer;

import org.palladiosimulator.jdt.metamodel.javamodel.variables.AdditionalLocalVariable;
import org.palladiosimulator.jdt.metamodel.javamodel.variables.LocalVariable;
import org.palladiosimulator.jdt.metamodel.javamodel.variables.VariablesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.variables.impl.LocalVariableImpl#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.variables.impl.LocalVariableImpl#getAnnotationsAndModifiers <em>Annotations And Modifiers</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.variables.impl.LocalVariableImpl#getAdditionalLocalVariables <em>Additional Local Variables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocalVariableImpl extends VariableImpl implements LocalVariable {
    /**
     * The cached value of the '{@link #getInitialValue() <em>Initial Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInitialValue()
     * @generated
     * @ordered
     */
    protected Expression initialValue;

    /**
     * The cached value of the '{@link #getAnnotationsAndModifiers() <em>Annotations And Modifiers</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAnnotationsAndModifiers()
     * @generated
     * @ordered
     */
    protected EList<AnnotationInstanceOrModifier> annotationsAndModifiers;

    /**
     * The cached value of the '{@link #getAdditionalLocalVariables() <em>Additional Local Variables</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAdditionalLocalVariables()
     * @generated
     * @ordered
     */
    protected EList<AdditionalLocalVariable> additionalLocalVariables;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LocalVariableImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return VariablesPackage.Literals.LOCAL_VARIABLE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Expression getInitialValue() {
        return initialValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInitialValue(Expression newInitialValue, NotificationChain msgs) {
        Expression oldInitialValue = initialValue;
        initialValue = newInitialValue;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    VariablesPackage.LOCAL_VARIABLE__INITIAL_VALUE, oldInitialValue, newInitialValue);
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
    public void setInitialValue(Expression newInitialValue) {
        if (newInitialValue != initialValue) {
            NotificationChain msgs = null;
            if (initialValue != null)
                msgs = ((InternalEObject) initialValue).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - VariablesPackage.LOCAL_VARIABLE__INITIAL_VALUE, null, msgs);
            if (newInitialValue != null)
                msgs = ((InternalEObject) newInitialValue).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - VariablesPackage.LOCAL_VARIABLE__INITIAL_VALUE, null, msgs);
            msgs = basicSetInitialValue(newInitialValue, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VariablesPackage.LOCAL_VARIABLE__INITIAL_VALUE,
                    newInitialValue, newInitialValue));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<AnnotationInstanceOrModifier> getAnnotationsAndModifiers() {
        if (annotationsAndModifiers == null) {
            annotationsAndModifiers = new EObjectContainmentEList<AnnotationInstanceOrModifier>(
                    AnnotationInstanceOrModifier.class, this,
                    VariablesPackage.LOCAL_VARIABLE__ANNOTATIONS_AND_MODIFIERS);
        }
        return annotationsAndModifiers;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<AdditionalLocalVariable> getAdditionalLocalVariables() {
        if (additionalLocalVariables == null) {
            additionalLocalVariables = new EObjectContainmentEList<AdditionalLocalVariable>(
                    AdditionalLocalVariable.class, this, VariablesPackage.LOCAL_VARIABLE__ADDITIONAL_LOCAL_VARIABLES);
        }
        return additionalLocalVariables;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isHidden(final Commentable context) {
        return false;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isStatic() {
        return false;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void removeModifier(final Class<?> modifierType) {
        return;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void makePublic() {
        return;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void makePrivate() {
        return;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void makeProtected() {
        return;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Modifier> getModifiers() {
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void removeAllModifiers() {
        return;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean hasModifier(final Class<?> type) {
        return false;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isPublic() {
        return false;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isPrivate() {
        return false;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isProtected() {
        return false;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void addModifier(final Modifier newModifier) {
        return;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<AnnotationInstance> getAnnotationInstances() {
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
        case VariablesPackage.LOCAL_VARIABLE__INITIAL_VALUE:
            return basicSetInitialValue(null, msgs);
        case VariablesPackage.LOCAL_VARIABLE__ANNOTATIONS_AND_MODIFIERS:
            return ((InternalEList<?>) getAnnotationsAndModifiers()).basicRemove(otherEnd, msgs);
        case VariablesPackage.LOCAL_VARIABLE__ADDITIONAL_LOCAL_VARIABLES:
            return ((InternalEList<?>) getAdditionalLocalVariables()).basicRemove(otherEnd, msgs);
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
        case VariablesPackage.LOCAL_VARIABLE__INITIAL_VALUE:
            return getInitialValue();
        case VariablesPackage.LOCAL_VARIABLE__ANNOTATIONS_AND_MODIFIERS:
            return getAnnotationsAndModifiers();
        case VariablesPackage.LOCAL_VARIABLE__ADDITIONAL_LOCAL_VARIABLES:
            return getAdditionalLocalVariables();
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
        case VariablesPackage.LOCAL_VARIABLE__INITIAL_VALUE:
            setInitialValue((Expression) newValue);
            return;
        case VariablesPackage.LOCAL_VARIABLE__ANNOTATIONS_AND_MODIFIERS:
            getAnnotationsAndModifiers().clear();
            getAnnotationsAndModifiers().addAll((Collection<? extends AnnotationInstanceOrModifier>) newValue);
            return;
        case VariablesPackage.LOCAL_VARIABLE__ADDITIONAL_LOCAL_VARIABLES:
            getAdditionalLocalVariables().clear();
            getAdditionalLocalVariables().addAll((Collection<? extends AdditionalLocalVariable>) newValue);
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
        case VariablesPackage.LOCAL_VARIABLE__INITIAL_VALUE:
            setInitialValue((Expression) null);
            return;
        case VariablesPackage.LOCAL_VARIABLE__ANNOTATIONS_AND_MODIFIERS:
            getAnnotationsAndModifiers().clear();
            return;
        case VariablesPackage.LOCAL_VARIABLE__ADDITIONAL_LOCAL_VARIABLES:
            getAdditionalLocalVariables().clear();
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
        case VariablesPackage.LOCAL_VARIABLE__INITIAL_VALUE:
            return initialValue != null;
        case VariablesPackage.LOCAL_VARIABLE__ANNOTATIONS_AND_MODIFIERS:
            return annotationsAndModifiers != null && !annotationsAndModifiers.isEmpty();
        case VariablesPackage.LOCAL_VARIABLE__ADDITIONAL_LOCAL_VARIABLES:
            return additionalLocalVariables != null && !additionalLocalVariables.isEmpty();
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
        if (baseClass == Initializable.class) {
            switch (derivedFeatureID) {
            case VariablesPackage.LOCAL_VARIABLE__INITIAL_VALUE:
                return InstantiationsPackage.INITIALIZABLE__INITIAL_VALUE;
            default:
                return -1;
            }
        }
        if (baseClass == ForLoopInitializer.class) {
            switch (derivedFeatureID) {
            default:
                return -1;
            }
        }
        if (baseClass == AnnotableAndModifiable.class) {
            switch (derivedFeatureID) {
            case VariablesPackage.LOCAL_VARIABLE__ANNOTATIONS_AND_MODIFIERS:
                return ModifiersPackage.ANNOTABLE_AND_MODIFIABLE__ANNOTATIONS_AND_MODIFIERS;
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
        if (baseClass == Initializable.class) {
            switch (baseFeatureID) {
            case InstantiationsPackage.INITIALIZABLE__INITIAL_VALUE:
                return VariablesPackage.LOCAL_VARIABLE__INITIAL_VALUE;
            default:
                return -1;
            }
        }
        if (baseClass == ForLoopInitializer.class) {
            switch (baseFeatureID) {
            default:
                return -1;
            }
        }
        if (baseClass == AnnotableAndModifiable.class) {
            switch (baseFeatureID) {
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE__ANNOTATIONS_AND_MODIFIERS:
                return VariablesPackage.LOCAL_VARIABLE__ANNOTATIONS_AND_MODIFIERS;
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
        if (baseClass == Initializable.class) {
            switch (baseOperationID) {
            default:
                return -1;
            }
        }
        if (baseClass == ForLoopInitializer.class) {
            switch (baseOperationID) {
            default:
                return -1;
            }
        }
        if (baseClass == AnnotableAndModifiable.class) {
            switch (baseOperationID) {
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___IS_HIDDEN__COMMENTABLE:
                return VariablesPackage.LOCAL_VARIABLE___IS_HIDDEN__COMMENTABLE;
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___IS_STATIC:
                return VariablesPackage.LOCAL_VARIABLE___IS_STATIC;
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___REMOVE_MODIFIER__CLASS:
                return VariablesPackage.LOCAL_VARIABLE___REMOVE_MODIFIER__CLASS;
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___MAKE_PUBLIC:
                return VariablesPackage.LOCAL_VARIABLE___MAKE_PUBLIC;
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___MAKE_PRIVATE:
                return VariablesPackage.LOCAL_VARIABLE___MAKE_PRIVATE;
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___MAKE_PROTECTED:
                return VariablesPackage.LOCAL_VARIABLE___MAKE_PROTECTED;
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___GET_MODIFIERS:
                return VariablesPackage.LOCAL_VARIABLE___GET_MODIFIERS;
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___REMOVE_ALL_MODIFIERS:
                return VariablesPackage.LOCAL_VARIABLE___REMOVE_ALL_MODIFIERS;
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___HAS_MODIFIER__CLASS:
                return VariablesPackage.LOCAL_VARIABLE___HAS_MODIFIER__CLASS;
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___IS_PUBLIC:
                return VariablesPackage.LOCAL_VARIABLE___IS_PUBLIC;
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___IS_PRIVATE:
                return VariablesPackage.LOCAL_VARIABLE___IS_PRIVATE;
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___IS_PROTECTED:
                return VariablesPackage.LOCAL_VARIABLE___IS_PROTECTED;
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___ADD_MODIFIER__MODIFIER:
                return VariablesPackage.LOCAL_VARIABLE___ADD_MODIFIER__MODIFIER;
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___GET_ANNOTATION_INSTANCES:
                return VariablesPackage.LOCAL_VARIABLE___GET_ANNOTATION_INSTANCES;
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
        case VariablesPackage.LOCAL_VARIABLE___IS_HIDDEN__COMMENTABLE:
            return isHidden((Commentable) arguments.get(0));
        case VariablesPackage.LOCAL_VARIABLE___IS_STATIC:
            return isStatic();
        case VariablesPackage.LOCAL_VARIABLE___REMOVE_MODIFIER__CLASS:
            removeModifier((Class<?>) arguments.get(0));
            return null;
        case VariablesPackage.LOCAL_VARIABLE___MAKE_PUBLIC:
            makePublic();
            return null;
        case VariablesPackage.LOCAL_VARIABLE___MAKE_PRIVATE:
            makePrivate();
            return null;
        case VariablesPackage.LOCAL_VARIABLE___MAKE_PROTECTED:
            makeProtected();
            return null;
        case VariablesPackage.LOCAL_VARIABLE___GET_MODIFIERS:
            return getModifiers();
        case VariablesPackage.LOCAL_VARIABLE___REMOVE_ALL_MODIFIERS:
            removeAllModifiers();
            return null;
        case VariablesPackage.LOCAL_VARIABLE___HAS_MODIFIER__CLASS:
            return hasModifier((Class<?>) arguments.get(0));
        case VariablesPackage.LOCAL_VARIABLE___IS_PUBLIC:
            return isPublic();
        case VariablesPackage.LOCAL_VARIABLE___IS_PRIVATE:
            return isPrivate();
        case VariablesPackage.LOCAL_VARIABLE___IS_PROTECTED:
            return isProtected();
        case VariablesPackage.LOCAL_VARIABLE___ADD_MODIFIER__MODIFIER:
            addModifier((Modifier) arguments.get(0));
            return null;
        case VariablesPackage.LOCAL_VARIABLE___GET_ANNOTATION_INSTANCES:
            return getAnnotationInstances();
        default:
            return super.eInvoke(operationID, arguments);
        }
    }

} //LocalVariableImpl
