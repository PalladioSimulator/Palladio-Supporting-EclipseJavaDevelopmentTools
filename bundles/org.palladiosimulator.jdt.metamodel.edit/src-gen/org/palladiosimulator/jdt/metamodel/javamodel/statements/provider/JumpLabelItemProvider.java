/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.statements.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.ClassifiersFactory;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.CommonsPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.statements.JumpLabel;
import org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementsFactory;
import org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementsPackage;

/**
 * This is the item provider adapter for a {@link org.palladiosimulator.jdt.metamodel.javamodel.statements.JumpLabel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class JumpLabelItemProvider extends StatementItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public JumpLabelItemProvider(AdapterFactory adapterFactory) {
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

            addNamePropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                        getResourceLocator(), getString("_UI_NamedElement_name_feature"),
                        getString("_UI_PropertyDescriptor_description", "_UI_NamedElement_name_feature",
                                "_UI_NamedElement_type"),
                        CommonsPackage.Literals.NAMED_ELEMENT__NAME, true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
            childrenFeatures.add(StatementsPackage.Literals.STATEMENT_CONTAINER__STATEMENT);
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
     * This returns JumpLabel.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/JumpLabel"));
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
        String label = ((JumpLabel) object).getName();
        return label == null || label.length() == 0 ? getString("_UI_JumpLabel_type")
                : getString("_UI_JumpLabel_type") + " " + label;
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

        switch (notification.getFeatureID(JumpLabel.class)) {
        case StatementsPackage.JUMP_LABEL__NAME:
            fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
            return;
        case StatementsPackage.JUMP_LABEL__STATEMENT:
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

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.STATEMENT_CONTAINER__STATEMENT,
                StatementsFactory.eINSTANCE.createAssert()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.STATEMENT_CONTAINER__STATEMENT,
                StatementsFactory.eINSTANCE.createBreak()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.STATEMENT_CONTAINER__STATEMENT,
                StatementsFactory.eINSTANCE.createBlock()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.STATEMENT_CONTAINER__STATEMENT,
                StatementsFactory.eINSTANCE.createCondition()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.STATEMENT_CONTAINER__STATEMENT,
                StatementsFactory.eINSTANCE.createContinue()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.STATEMENT_CONTAINER__STATEMENT,
                StatementsFactory.eINSTANCE.createWhileLoop()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.STATEMENT_CONTAINER__STATEMENT,
                StatementsFactory.eINSTANCE.createDoWhileLoop()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.STATEMENT_CONTAINER__STATEMENT,
                StatementsFactory.eINSTANCE.createEmptyStatement()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.STATEMENT_CONTAINER__STATEMENT,
                StatementsFactory.eINSTANCE.createExpressionStatement()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.STATEMENT_CONTAINER__STATEMENT,
                StatementsFactory.eINSTANCE.createForLoop()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.STATEMENT_CONTAINER__STATEMENT,
                StatementsFactory.eINSTANCE.createForEachLoop()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.STATEMENT_CONTAINER__STATEMENT,
                StatementsFactory.eINSTANCE.createJumpLabel()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.STATEMENT_CONTAINER__STATEMENT,
                StatementsFactory.eINSTANCE.createLocalVariableStatement()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.STATEMENT_CONTAINER__STATEMENT,
                StatementsFactory.eINSTANCE.createReturn()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.STATEMENT_CONTAINER__STATEMENT,
                StatementsFactory.eINSTANCE.createSwitch()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.STATEMENT_CONTAINER__STATEMENT,
                StatementsFactory.eINSTANCE.createSynchronizedBlock()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.STATEMENT_CONTAINER__STATEMENT,
                StatementsFactory.eINSTANCE.createThrow()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.STATEMENT_CONTAINER__STATEMENT,
                StatementsFactory.eINSTANCE.createTryBlock()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.STATEMENT_CONTAINER__STATEMENT,
                ClassifiersFactory.eINSTANCE.createClass()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.STATEMENT_CONTAINER__STATEMENT,
                ClassifiersFactory.eINSTANCE.createInterface()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.STATEMENT_CONTAINER__STATEMENT,
                ClassifiersFactory.eINSTANCE.createEnumeration()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.STATEMENT_CONTAINER__STATEMENT,
                ClassifiersFactory.eINSTANCE.createAnnotation()));
    }

}
