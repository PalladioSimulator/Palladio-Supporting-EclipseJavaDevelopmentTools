/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.members.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationsFactory;

import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.ClassifiersFactory;

import org.palladiosimulator.jdt.metamodel.javamodel.generics.GenericsFactory;
import org.palladiosimulator.jdt.metamodel.javamodel.generics.GenericsPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.members.Constructor;
import org.palladiosimulator.jdt.metamodel.javamodel.members.MembersPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.modifiers.ModifiersFactory;
import org.palladiosimulator.jdt.metamodel.javamodel.modifiers.ModifiersPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.parameters.ParametersFactory;
import org.palladiosimulator.jdt.metamodel.javamodel.parameters.ParametersPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementsFactory;
import org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementsPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.types.TypesFactory;

/**
 * This is the item provider adapter for a {@link org.palladiosimulator.jdt.metamodel.javamodel.members.Constructor} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConstructorItemProvider extends MemberItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConstructorItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
        if (itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

        }
        return itemPropertyDescriptors;
    }

    /**
     * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
     * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
     * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
        if (childrenFeatures == null) {
            super.getChildrenFeatures(object);
            childrenFeatures.add(StatementsPackage.Literals.STATEMENT_LIST_CONTAINER__STATEMENTS);
            childrenFeatures.add(ParametersPackage.Literals.PARAMETRIZABLE__PARAMETERS);
            childrenFeatures.add(GenericsPackage.Literals.TYPE_PARAMETRIZABLE__TYPE_PARAMETERS);
            childrenFeatures.add(MembersPackage.Literals.EXCEPTION_THROWER__EXCEPTIONS);
            childrenFeatures.add(ModifiersPackage.Literals.ANNOTABLE_AND_MODIFIABLE__ANNOTATIONS_AND_MODIFIERS);
        }
        return childrenFeatures;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EStructuralFeature getChildFeature(Object object, Object child) {
        // Check the type of the specified child object and return the proper feature to use for
        // adding (see {@link AddCommand}) it as a child.

        return super.getChildFeature(object, child);
    }

    /**
     * This returns Constructor.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/Constructor"));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected boolean shouldComposeCreationImage() {
        return true;
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((Constructor) object).getName();
        return label == null || label.length() == 0 ? getString("_UI_Constructor_type")
                : getString("_UI_Constructor_type") + " " + label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged(Notification notification) {
        updateChildren(notification);

        switch (notification.getFeatureID(Constructor.class)) {
        case MembersPackage.CONSTRUCTOR__STATEMENTS:
        case MembersPackage.CONSTRUCTOR__PARAMETERS:
        case MembersPackage.CONSTRUCTOR__TYPE_PARAMETERS:
        case MembersPackage.CONSTRUCTOR__EXCEPTIONS:
        case MembersPackage.CONSTRUCTOR__ANNOTATIONS_AND_MODIFIERS:
            fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
            return;
        default:
            super.notifyChanged(notification);
            return;
        }
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.STATEMENT_LIST_CONTAINER__STATEMENTS,
                ClassifiersFactory.eINSTANCE.createClass()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.STATEMENT_LIST_CONTAINER__STATEMENTS,
                ClassifiersFactory.eINSTANCE.createInterface()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.STATEMENT_LIST_CONTAINER__STATEMENTS,
                ClassifiersFactory.eINSTANCE.createEnumeration()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.STATEMENT_LIST_CONTAINER__STATEMENTS,
                ClassifiersFactory.eINSTANCE.createAnnotation()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.STATEMENT_LIST_CONTAINER__STATEMENTS,
                StatementsFactory.eINSTANCE.createAssert()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.STATEMENT_LIST_CONTAINER__STATEMENTS,
                StatementsFactory.eINSTANCE.createBreak()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.STATEMENT_LIST_CONTAINER__STATEMENTS,
                StatementsFactory.eINSTANCE.createBlock()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.STATEMENT_LIST_CONTAINER__STATEMENTS,
                StatementsFactory.eINSTANCE.createCondition()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.STATEMENT_LIST_CONTAINER__STATEMENTS,
                StatementsFactory.eINSTANCE.createContinue()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.STATEMENT_LIST_CONTAINER__STATEMENTS,
                StatementsFactory.eINSTANCE.createWhileLoop()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.STATEMENT_LIST_CONTAINER__STATEMENTS,
                StatementsFactory.eINSTANCE.createDoWhileLoop()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.STATEMENT_LIST_CONTAINER__STATEMENTS,
                StatementsFactory.eINSTANCE.createEmptyStatement()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.STATEMENT_LIST_CONTAINER__STATEMENTS,
                StatementsFactory.eINSTANCE.createExpressionStatement()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.STATEMENT_LIST_CONTAINER__STATEMENTS,
                StatementsFactory.eINSTANCE.createForLoop()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.STATEMENT_LIST_CONTAINER__STATEMENTS,
                StatementsFactory.eINSTANCE.createForEachLoop()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.STATEMENT_LIST_CONTAINER__STATEMENTS,
                StatementsFactory.eINSTANCE.createJumpLabel()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.STATEMENT_LIST_CONTAINER__STATEMENTS,
                StatementsFactory.eINSTANCE.createLocalVariableStatement()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.STATEMENT_LIST_CONTAINER__STATEMENTS,
                StatementsFactory.eINSTANCE.createReturn()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.STATEMENT_LIST_CONTAINER__STATEMENTS,
                StatementsFactory.eINSTANCE.createSwitch()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.STATEMENT_LIST_CONTAINER__STATEMENTS,
                StatementsFactory.eINSTANCE.createSynchronizedBlock()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.STATEMENT_LIST_CONTAINER__STATEMENTS,
                StatementsFactory.eINSTANCE.createThrow()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.STATEMENT_LIST_CONTAINER__STATEMENTS,
                StatementsFactory.eINSTANCE.createTryBlock()));

        newChildDescriptors.add(createChildParameter(ParametersPackage.Literals.PARAMETRIZABLE__PARAMETERS,
                ParametersFactory.eINSTANCE.createOrdinaryParameter()));

        newChildDescriptors.add(createChildParameter(ParametersPackage.Literals.PARAMETRIZABLE__PARAMETERS,
                ParametersFactory.eINSTANCE.createVariableLengthParameter()));

        newChildDescriptors.add(createChildParameter(GenericsPackage.Literals.TYPE_PARAMETRIZABLE__TYPE_PARAMETERS,
                GenericsFactory.eINSTANCE.createTypeParameter()));

        newChildDescriptors.add(createChildParameter(MembersPackage.Literals.EXCEPTION_THROWER__EXCEPTIONS,
                TypesFactory.eINSTANCE.createNamespaceClassifierReference()));

        newChildDescriptors
                .add(createChildParameter(ModifiersPackage.Literals.ANNOTABLE_AND_MODIFIABLE__ANNOTATIONS_AND_MODIFIERS,
                        AnnotationsFactory.eINSTANCE.createAnnotationInstance()));

        newChildDescriptors
                .add(createChildParameter(ModifiersPackage.Literals.ANNOTABLE_AND_MODIFIABLE__ANNOTATIONS_AND_MODIFIERS,
                        ModifiersFactory.eINSTANCE.createAbstract()));

        newChildDescriptors
                .add(createChildParameter(ModifiersPackage.Literals.ANNOTABLE_AND_MODIFIABLE__ANNOTATIONS_AND_MODIFIERS,
                        ModifiersFactory.eINSTANCE.createFinal()));

        newChildDescriptors
                .add(createChildParameter(ModifiersPackage.Literals.ANNOTABLE_AND_MODIFIABLE__ANNOTATIONS_AND_MODIFIERS,
                        ModifiersFactory.eINSTANCE.createNative()));

        newChildDescriptors
                .add(createChildParameter(ModifiersPackage.Literals.ANNOTABLE_AND_MODIFIABLE__ANNOTATIONS_AND_MODIFIERS,
                        ModifiersFactory.eINSTANCE.createProtected()));

        newChildDescriptors
                .add(createChildParameter(ModifiersPackage.Literals.ANNOTABLE_AND_MODIFIABLE__ANNOTATIONS_AND_MODIFIERS,
                        ModifiersFactory.eINSTANCE.createPublic()));

        newChildDescriptors
                .add(createChildParameter(ModifiersPackage.Literals.ANNOTABLE_AND_MODIFIABLE__ANNOTATIONS_AND_MODIFIERS,
                        ModifiersFactory.eINSTANCE.createPrivate()));

        newChildDescriptors
                .add(createChildParameter(ModifiersPackage.Literals.ANNOTABLE_AND_MODIFIABLE__ANNOTATIONS_AND_MODIFIERS,
                        ModifiersFactory.eINSTANCE.createStatic()));

        newChildDescriptors
                .add(createChildParameter(ModifiersPackage.Literals.ANNOTABLE_AND_MODIFIABLE__ANNOTATIONS_AND_MODIFIERS,
                        ModifiersFactory.eINSTANCE.createStrictfp()));

        newChildDescriptors
                .add(createChildParameter(ModifiersPackage.Literals.ANNOTABLE_AND_MODIFIABLE__ANNOTATIONS_AND_MODIFIERS,
                        ModifiersFactory.eINSTANCE.createSynchronized()));

        newChildDescriptors
                .add(createChildParameter(ModifiersPackage.Literals.ANNOTABLE_AND_MODIFIABLE__ANNOTATIONS_AND_MODIFIERS,
                        ModifiersFactory.eINSTANCE.createTransient()));

        newChildDescriptors
                .add(createChildParameter(ModifiersPackage.Literals.ANNOTABLE_AND_MODIFIABLE__ANNOTATIONS_AND_MODIFIERS,
                        ModifiersFactory.eINSTANCE.createVolatile()));
    }

}
