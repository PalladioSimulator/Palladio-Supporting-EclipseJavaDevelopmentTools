/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.members.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.jdt.metamodel.javamodel.annotations.Annotable;

import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayTypeable;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable;
import org.palladiosimulator.jdt.metamodel.javamodel.commons.NamedElement;

import org.palladiosimulator.jdt.metamodel.javamodel.generics.TypeArgumentable;
import org.palladiosimulator.jdt.metamodel.javamodel.generics.TypeParametrizable;

import org.palladiosimulator.jdt.metamodel.javamodel.instantiations.Initializable;

import org.palladiosimulator.jdt.metamodel.javamodel.members.*;

import org.palladiosimulator.jdt.metamodel.javamodel.modifiers.AnnotableAndModifiable;

import org.palladiosimulator.jdt.metamodel.javamodel.parameters.Parametrizable;

import org.palladiosimulator.jdt.metamodel.javamodel.references.Argumentable;
import org.palladiosimulator.jdt.metamodel.javamodel.references.ReferenceableElement;

import org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementListContainer;

import org.palladiosimulator.jdt.metamodel.javamodel.types.TypedElement;

import org.palladiosimulator.jdt.metamodel.javamodel.variables.Variable;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.jdt.metamodel.javamodel.members.MembersPackage
 * @generated
 */
public class MembersAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static MembersPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MembersAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = MembersPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject) object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MembersSwitch<Adapter> modelSwitch = new MembersSwitch<Adapter>() {
        @Override
        public Adapter caseExceptionThrower(ExceptionThrower object) {
            return createExceptionThrowerAdapter();
        }

        @Override
        public Adapter caseMember(Member object) {
            return createMemberAdapter();
        }

        @Override
        public Adapter caseMemberContainer(MemberContainer object) {
            return createMemberContainerAdapter();
        }

        @Override
        public Adapter caseAdditionalField(AdditionalField object) {
            return createAdditionalFieldAdapter();
        }

        @Override
        public Adapter caseConstructor(Constructor object) {
            return createConstructorAdapter();
        }

        @Override
        public Adapter caseEmptyMember(EmptyMember object) {
            return createEmptyMemberAdapter();
        }

        @Override
        public Adapter caseField(Field object) {
            return createFieldAdapter();
        }

        @Override
        public Adapter caseMethod(Method object) {
            return createMethodAdapter();
        }

        @Override
        public Adapter caseInterfaceMethod(InterfaceMethod object) {
            return createInterfaceMethodAdapter();
        }

        @Override
        public Adapter caseClassMethod(ClassMethod object) {
            return createClassMethodAdapter();
        }

        @Override
        public Adapter caseEnumConstant(EnumConstant object) {
            return createEnumConstantAdapter();
        }

        @Override
        public Adapter caseCommentable(Commentable object) {
            return createCommentableAdapter();
        }

        @Override
        public Adapter caseNamedElement(NamedElement object) {
            return createNamedElementAdapter();
        }

        @Override
        public Adapter caseReferenceableElement(ReferenceableElement object) {
            return createReferenceableElementAdapter();
        }

        @Override
        public Adapter caseArrayTypeable(ArrayTypeable object) {
            return createArrayTypeableAdapter();
        }

        @Override
        public Adapter caseInitializable(Initializable object) {
            return createInitializableAdapter();
        }

        @Override
        public Adapter caseStatementListContainer(StatementListContainer object) {
            return createStatementListContainerAdapter();
        }

        @Override
        public Adapter caseParametrizable(Parametrizable object) {
            return createParametrizableAdapter();
        }

        @Override
        public Adapter caseTypeParametrizable(TypeParametrizable object) {
            return createTypeParametrizableAdapter();
        }

        @Override
        public Adapter caseAnnotableAndModifiable(AnnotableAndModifiable object) {
            return createAnnotableAndModifiableAdapter();
        }

        @Override
        public Adapter caseTypedElement(TypedElement object) {
            return createTypedElementAdapter();
        }

        @Override
        public Adapter caseTypeArgumentable(TypeArgumentable object) {
            return createTypeArgumentableAdapter();
        }

        @Override
        public Adapter caseVariable(Variable object) {
            return createVariableAdapter();
        }

        @Override
        public Adapter caseArgumentable(Argumentable object) {
            return createArgumentableAdapter();
        }

        @Override
        public Adapter caseAnnotable(Annotable object) {
            return createAnnotableAdapter();
        }

        @Override
        public Adapter defaultCase(EObject object) {
            return createEObjectAdapter();
        }
    };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject) target);
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.members.ExceptionThrower <em>Exception Thrower</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.members.ExceptionThrower
     * @generated
     */
    public Adapter createExceptionThrowerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.members.Member <em>Member</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.members.Member
     * @generated
     */
    public Adapter createMemberAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.members.MemberContainer <em>Member Container</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.members.MemberContainer
     * @generated
     */
    public Adapter createMemberContainerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.members.AdditionalField <em>Additional Field</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.members.AdditionalField
     * @generated
     */
    public Adapter createAdditionalFieldAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.members.Constructor <em>Constructor</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.members.Constructor
     * @generated
     */
    public Adapter createConstructorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.members.EmptyMember <em>Empty Member</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.members.EmptyMember
     * @generated
     */
    public Adapter createEmptyMemberAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.members.Field <em>Field</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.members.Field
     * @generated
     */
    public Adapter createFieldAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.members.Method <em>Method</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.members.Method
     * @generated
     */
    public Adapter createMethodAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.members.InterfaceMethod <em>Interface Method</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.members.InterfaceMethod
     * @generated
     */
    public Adapter createInterfaceMethodAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.members.ClassMethod <em>Class Method</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.members.ClassMethod
     * @generated
     */
    public Adapter createClassMethodAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.members.EnumConstant <em>Enum Constant</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.members.EnumConstant
     * @generated
     */
    public Adapter createEnumConstantAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable <em>Commentable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.commons.Commentable
     * @generated
     */
    public Adapter createCommentableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.commons.NamedElement <em>Named Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.commons.NamedElement
     * @generated
     */
    public Adapter createNamedElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.references.ReferenceableElement <em>Referenceable Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.references.ReferenceableElement
     * @generated
     */
    public Adapter createReferenceableElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayTypeable <em>Array Typeable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayTypeable
     * @generated
     */
    public Adapter createArrayTypeableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.instantiations.Initializable <em>Initializable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.instantiations.Initializable
     * @generated
     */
    public Adapter createInitializableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementListContainer <em>Statement List Container</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementListContainer
     * @generated
     */
    public Adapter createStatementListContainerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.parameters.Parametrizable <em>Parametrizable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.parameters.Parametrizable
     * @generated
     */
    public Adapter createParametrizableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.generics.TypeParametrizable <em>Type Parametrizable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.generics.TypeParametrizable
     * @generated
     */
    public Adapter createTypeParametrizableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.modifiers.AnnotableAndModifiable <em>Annotable And Modifiable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.modifiers.AnnotableAndModifiable
     * @generated
     */
    public Adapter createAnnotableAndModifiableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.types.TypedElement <em>Typed Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.types.TypedElement
     * @generated
     */
    public Adapter createTypedElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.generics.TypeArgumentable <em>Type Argumentable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.generics.TypeArgumentable
     * @generated
     */
    public Adapter createTypeArgumentableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.variables.Variable <em>Variable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.variables.Variable
     * @generated
     */
    public Adapter createVariableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.references.Argumentable <em>Argumentable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.references.Argumentable
     * @generated
     */
    public Adapter createArgumentableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.jdt.metamodel.javamodel.annotations.Annotable <em>Annotable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.jdt.metamodel.javamodel.annotations.Annotable
     * @generated
     */
    public Adapter createAnnotableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //MembersAdapterFactory
