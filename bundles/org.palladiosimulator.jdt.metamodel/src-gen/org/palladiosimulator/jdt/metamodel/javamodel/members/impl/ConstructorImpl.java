/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.members.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationInstance;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable;

import org.palladiosimulator.jdt.metamodel.javamodel.generics.GenericsPackage;
import org.palladiosimulator.jdt.metamodel.javamodel.generics.TypeParameter;
import org.palladiosimulator.jdt.metamodel.javamodel.generics.TypeParametrizable;

import org.palladiosimulator.jdt.metamodel.javamodel.members.Constructor;
import org.palladiosimulator.jdt.metamodel.javamodel.members.ExceptionThrower;
import org.palladiosimulator.jdt.metamodel.javamodel.members.MembersPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.modifiers.AnnotableAndModifiable;
import org.palladiosimulator.jdt.metamodel.javamodel.modifiers.AnnotationInstanceOrModifier;
import org.palladiosimulator.jdt.metamodel.javamodel.modifiers.Modifier;
import org.palladiosimulator.jdt.metamodel.javamodel.modifiers.ModifiersPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.parameters.Parameter;
import org.palladiosimulator.jdt.metamodel.javamodel.parameters.ParametersPackage;
import org.palladiosimulator.jdt.metamodel.javamodel.parameters.Parametrizable;

import org.palladiosimulator.jdt.metamodel.javamodel.statements.Statement;
import org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementListContainer;
import org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementsPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.types.NamespaceClassifierReference;

import org.palladiosimulator.jdt.metamodel.javamodel.variables.LocalVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constructor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.members.impl.ConstructorImpl#getStatements <em>Statements</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.members.impl.ConstructorImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.members.impl.ConstructorImpl#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.members.impl.ConstructorImpl#getExceptions <em>Exceptions</em>}</li>
 *   <li>{@link org.palladiosimulator.jdt.metamodel.javamodel.members.impl.ConstructorImpl#getAnnotationsAndModifiers <em>Annotations And Modifiers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstructorImpl extends MemberImpl implements Constructor {
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
     * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParameters()
     * @generated
     * @ordered
     */
    protected EList<Parameter> parameters;

    /**
     * The cached value of the '{@link #getTypeParameters() <em>Type Parameters</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTypeParameters()
     * @generated
     * @ordered
     */
    protected EList<TypeParameter> typeParameters;

    /**
     * The cached value of the '{@link #getExceptions() <em>Exceptions</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExceptions()
     * @generated
     * @ordered
     */
    protected EList<NamespaceClassifierReference> exceptions;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ConstructorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MembersPackage.Literals.CONSTRUCTOR;
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
                    MembersPackage.CONSTRUCTOR__STATEMENTS);
        }
        return statements;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Parameter> getParameters() {
        if (parameters == null) {
            parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this,
                    MembersPackage.CONSTRUCTOR__PARAMETERS);
        }
        return parameters;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<TypeParameter> getTypeParameters() {
        if (typeParameters == null) {
            typeParameters = new EObjectContainmentEList<TypeParameter>(TypeParameter.class, this,
                    MembersPackage.CONSTRUCTOR__TYPE_PARAMETERS);
        }
        return typeParameters;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<NamespaceClassifierReference> getExceptions() {
        if (exceptions == null) {
            exceptions = new EObjectContainmentEList<NamespaceClassifierReference>(NamespaceClassifierReference.class,
                    this, MembersPackage.CONSTRUCTOR__EXCEPTIONS);
        }
        return exceptions;
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
                    AnnotationInstanceOrModifier.class, this, MembersPackage.CONSTRUCTOR__ANNOTATIONS_AND_MODIFIERS);
        }
        return annotationsAndModifiers;
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
        case MembersPackage.CONSTRUCTOR__STATEMENTS:
            return ((InternalEList<?>) getStatements()).basicRemove(otherEnd, msgs);
        case MembersPackage.CONSTRUCTOR__PARAMETERS:
            return ((InternalEList<?>) getParameters()).basicRemove(otherEnd, msgs);
        case MembersPackage.CONSTRUCTOR__TYPE_PARAMETERS:
            return ((InternalEList<?>) getTypeParameters()).basicRemove(otherEnd, msgs);
        case MembersPackage.CONSTRUCTOR__EXCEPTIONS:
            return ((InternalEList<?>) getExceptions()).basicRemove(otherEnd, msgs);
        case MembersPackage.CONSTRUCTOR__ANNOTATIONS_AND_MODIFIERS:
            return ((InternalEList<?>) getAnnotationsAndModifiers()).basicRemove(otherEnd, msgs);
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
        case MembersPackage.CONSTRUCTOR__STATEMENTS:
            return getStatements();
        case MembersPackage.CONSTRUCTOR__PARAMETERS:
            return getParameters();
        case MembersPackage.CONSTRUCTOR__TYPE_PARAMETERS:
            return getTypeParameters();
        case MembersPackage.CONSTRUCTOR__EXCEPTIONS:
            return getExceptions();
        case MembersPackage.CONSTRUCTOR__ANNOTATIONS_AND_MODIFIERS:
            return getAnnotationsAndModifiers();
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
        case MembersPackage.CONSTRUCTOR__STATEMENTS:
            getStatements().clear();
            getStatements().addAll((Collection<? extends Statement>) newValue);
            return;
        case MembersPackage.CONSTRUCTOR__PARAMETERS:
            getParameters().clear();
            getParameters().addAll((Collection<? extends Parameter>) newValue);
            return;
        case MembersPackage.CONSTRUCTOR__TYPE_PARAMETERS:
            getTypeParameters().clear();
            getTypeParameters().addAll((Collection<? extends TypeParameter>) newValue);
            return;
        case MembersPackage.CONSTRUCTOR__EXCEPTIONS:
            getExceptions().clear();
            getExceptions().addAll((Collection<? extends NamespaceClassifierReference>) newValue);
            return;
        case MembersPackage.CONSTRUCTOR__ANNOTATIONS_AND_MODIFIERS:
            getAnnotationsAndModifiers().clear();
            getAnnotationsAndModifiers().addAll((Collection<? extends AnnotationInstanceOrModifier>) newValue);
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
        case MembersPackage.CONSTRUCTOR__STATEMENTS:
            getStatements().clear();
            return;
        case MembersPackage.CONSTRUCTOR__PARAMETERS:
            getParameters().clear();
            return;
        case MembersPackage.CONSTRUCTOR__TYPE_PARAMETERS:
            getTypeParameters().clear();
            return;
        case MembersPackage.CONSTRUCTOR__EXCEPTIONS:
            getExceptions().clear();
            return;
        case MembersPackage.CONSTRUCTOR__ANNOTATIONS_AND_MODIFIERS:
            getAnnotationsAndModifiers().clear();
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
        case MembersPackage.CONSTRUCTOR__STATEMENTS:
            return statements != null && !statements.isEmpty();
        case MembersPackage.CONSTRUCTOR__PARAMETERS:
            return parameters != null && !parameters.isEmpty();
        case MembersPackage.CONSTRUCTOR__TYPE_PARAMETERS:
            return typeParameters != null && !typeParameters.isEmpty();
        case MembersPackage.CONSTRUCTOR__EXCEPTIONS:
            return exceptions != null && !exceptions.isEmpty();
        case MembersPackage.CONSTRUCTOR__ANNOTATIONS_AND_MODIFIERS:
            return annotationsAndModifiers != null && !annotationsAndModifiers.isEmpty();
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
            case MembersPackage.CONSTRUCTOR__STATEMENTS:
                return StatementsPackage.STATEMENT_LIST_CONTAINER__STATEMENTS;
            default:
                return -1;
            }
        }
        if (baseClass == Parametrizable.class) {
            switch (derivedFeatureID) {
            case MembersPackage.CONSTRUCTOR__PARAMETERS:
                return ParametersPackage.PARAMETRIZABLE__PARAMETERS;
            default:
                return -1;
            }
        }
        if (baseClass == TypeParametrizable.class) {
            switch (derivedFeatureID) {
            case MembersPackage.CONSTRUCTOR__TYPE_PARAMETERS:
                return GenericsPackage.TYPE_PARAMETRIZABLE__TYPE_PARAMETERS;
            default:
                return -1;
            }
        }
        if (baseClass == ExceptionThrower.class) {
            switch (derivedFeatureID) {
            case MembersPackage.CONSTRUCTOR__EXCEPTIONS:
                return MembersPackage.EXCEPTION_THROWER__EXCEPTIONS;
            default:
                return -1;
            }
        }
        if (baseClass == AnnotableAndModifiable.class) {
            switch (derivedFeatureID) {
            case MembersPackage.CONSTRUCTOR__ANNOTATIONS_AND_MODIFIERS:
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
        if (baseClass == StatementListContainer.class) {
            switch (baseFeatureID) {
            case StatementsPackage.STATEMENT_LIST_CONTAINER__STATEMENTS:
                return MembersPackage.CONSTRUCTOR__STATEMENTS;
            default:
                return -1;
            }
        }
        if (baseClass == Parametrizable.class) {
            switch (baseFeatureID) {
            case ParametersPackage.PARAMETRIZABLE__PARAMETERS:
                return MembersPackage.CONSTRUCTOR__PARAMETERS;
            default:
                return -1;
            }
        }
        if (baseClass == TypeParametrizable.class) {
            switch (baseFeatureID) {
            case GenericsPackage.TYPE_PARAMETRIZABLE__TYPE_PARAMETERS:
                return MembersPackage.CONSTRUCTOR__TYPE_PARAMETERS;
            default:
                return -1;
            }
        }
        if (baseClass == ExceptionThrower.class) {
            switch (baseFeatureID) {
            case MembersPackage.EXCEPTION_THROWER__EXCEPTIONS:
                return MembersPackage.CONSTRUCTOR__EXCEPTIONS;
            default:
                return -1;
            }
        }
        if (baseClass == AnnotableAndModifiable.class) {
            switch (baseFeatureID) {
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE__ANNOTATIONS_AND_MODIFIERS:
                return MembersPackage.CONSTRUCTOR__ANNOTATIONS_AND_MODIFIERS;
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
                return MembersPackage.CONSTRUCTOR___GET_LOCAL_VARIABLE__STRING;
            default:
                return -1;
            }
        }
        if (baseClass == Parametrizable.class) {
            switch (baseOperationID) {
            default:
                return -1;
            }
        }
        if (baseClass == TypeParametrizable.class) {
            switch (baseOperationID) {
            default:
                return -1;
            }
        }
        if (baseClass == ExceptionThrower.class) {
            switch (baseOperationID) {
            default:
                return -1;
            }
        }
        if (baseClass == AnnotableAndModifiable.class) {
            switch (baseOperationID) {
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___IS_HIDDEN__COMMENTABLE:
                return MembersPackage.CONSTRUCTOR___IS_HIDDEN__COMMENTABLE;
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___IS_STATIC:
                return MembersPackage.CONSTRUCTOR___IS_STATIC;
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___REMOVE_MODIFIER__CLASS:
                return MembersPackage.CONSTRUCTOR___REMOVE_MODIFIER__CLASS;
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___MAKE_PUBLIC:
                return MembersPackage.CONSTRUCTOR___MAKE_PUBLIC;
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___MAKE_PRIVATE:
                return MembersPackage.CONSTRUCTOR___MAKE_PRIVATE;
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___MAKE_PROTECTED:
                return MembersPackage.CONSTRUCTOR___MAKE_PROTECTED;
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___GET_MODIFIERS:
                return MembersPackage.CONSTRUCTOR___GET_MODIFIERS;
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___REMOVE_ALL_MODIFIERS:
                return MembersPackage.CONSTRUCTOR___REMOVE_ALL_MODIFIERS;
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___HAS_MODIFIER__CLASS:
                return MembersPackage.CONSTRUCTOR___HAS_MODIFIER__CLASS;
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___IS_PUBLIC:
                return MembersPackage.CONSTRUCTOR___IS_PUBLIC;
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___IS_PRIVATE:
                return MembersPackage.CONSTRUCTOR___IS_PRIVATE;
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___IS_PROTECTED:
                return MembersPackage.CONSTRUCTOR___IS_PROTECTED;
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___ADD_MODIFIER__MODIFIER:
                return MembersPackage.CONSTRUCTOR___ADD_MODIFIER__MODIFIER;
            case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE___GET_ANNOTATION_INSTANCES:
                return MembersPackage.CONSTRUCTOR___GET_ANNOTATION_INSTANCES;
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
        case MembersPackage.CONSTRUCTOR___IS_HIDDEN__COMMENTABLE:
            return isHidden((Commentable) arguments.get(0));
        case MembersPackage.CONSTRUCTOR___IS_STATIC:
            return isStatic();
        case MembersPackage.CONSTRUCTOR___REMOVE_MODIFIER__CLASS:
            removeModifier((Class<?>) arguments.get(0));
            return null;
        case MembersPackage.CONSTRUCTOR___MAKE_PUBLIC:
            makePublic();
            return null;
        case MembersPackage.CONSTRUCTOR___MAKE_PRIVATE:
            makePrivate();
            return null;
        case MembersPackage.CONSTRUCTOR___MAKE_PROTECTED:
            makeProtected();
            return null;
        case MembersPackage.CONSTRUCTOR___GET_MODIFIERS:
            return getModifiers();
        case MembersPackage.CONSTRUCTOR___REMOVE_ALL_MODIFIERS:
            removeAllModifiers();
            return null;
        case MembersPackage.CONSTRUCTOR___HAS_MODIFIER__CLASS:
            return hasModifier((Class<?>) arguments.get(0));
        case MembersPackage.CONSTRUCTOR___IS_PUBLIC:
            return isPublic();
        case MembersPackage.CONSTRUCTOR___IS_PRIVATE:
            return isPrivate();
        case MembersPackage.CONSTRUCTOR___IS_PROTECTED:
            return isProtected();
        case MembersPackage.CONSTRUCTOR___ADD_MODIFIER__MODIFIER:
            addModifier((Modifier) arguments.get(0));
            return null;
        case MembersPackage.CONSTRUCTOR___GET_ANNOTATION_INSTANCES:
            return getAnnotationInstances();
        case MembersPackage.CONSTRUCTOR___GET_LOCAL_VARIABLE__STRING:
            return getLocalVariable((String) arguments.get(0));
        default:
            return super.eInvoke(operationID, arguments);
        }
    }

} //ConstructorImpl
