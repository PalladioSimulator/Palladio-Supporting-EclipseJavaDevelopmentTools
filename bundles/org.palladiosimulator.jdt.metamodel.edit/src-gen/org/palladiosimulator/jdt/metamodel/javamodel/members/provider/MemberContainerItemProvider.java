/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.members.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationsFactory;

import org.palladiosimulator.jdt.metamodel.javamodel.annotations.provider.JavaModelEditPlugin;

import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.ClassifiersFactory;

import org.palladiosimulator.jdt.metamodel.javamodel.commons.provider.CommentableItemProvider;

import org.palladiosimulator.jdt.metamodel.javamodel.members.MemberContainer;
import org.palladiosimulator.jdt.metamodel.javamodel.members.MembersFactory;
import org.palladiosimulator.jdt.metamodel.javamodel.members.MembersPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementsFactory;

/**
 * This is the item provider adapter for a {@link org.palladiosimulator.jdt.metamodel.javamodel.members.MemberContainer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MemberContainerItemProvider extends CommentableItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MemberContainerItemProvider(AdapterFactory adapterFactory) {
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
            childrenFeatures.add(MembersPackage.Literals.MEMBER_CONTAINER__MEMBERS);
            childrenFeatures.add(MembersPackage.Literals.MEMBER_CONTAINER__DEFAULT_MEMBERS);
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
        return getString("_UI_MemberContainer_type");
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

        switch (notification.getFeatureID(MemberContainer.class)) {
        case MembersPackage.MEMBER_CONTAINER__MEMBERS:
        case MembersPackage.MEMBER_CONTAINER__DEFAULT_MEMBERS:
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

        newChildDescriptors.add(createChildParameter(MembersPackage.Literals.MEMBER_CONTAINER__MEMBERS,
                MembersFactory.eINSTANCE.createConstructor()));

        newChildDescriptors.add(createChildParameter(MembersPackage.Literals.MEMBER_CONTAINER__MEMBERS,
                MembersFactory.eINSTANCE.createEmptyMember()));

        newChildDescriptors.add(createChildParameter(MembersPackage.Literals.MEMBER_CONTAINER__MEMBERS,
                MembersFactory.eINSTANCE.createField()));

        newChildDescriptors.add(createChildParameter(MembersPackage.Literals.MEMBER_CONTAINER__MEMBERS,
                MembersFactory.eINSTANCE.createInterfaceMethod()));

        newChildDescriptors.add(createChildParameter(MembersPackage.Literals.MEMBER_CONTAINER__MEMBERS,
                MembersFactory.eINSTANCE.createClassMethod()));

        newChildDescriptors.add(createChildParameter(MembersPackage.Literals.MEMBER_CONTAINER__MEMBERS,
                AnnotationsFactory.eINSTANCE.createAnnotationAttribute()));

        newChildDescriptors.add(createChildParameter(MembersPackage.Literals.MEMBER_CONTAINER__MEMBERS,
                ClassifiersFactory.eINSTANCE.createClass()));

        newChildDescriptors.add(createChildParameter(MembersPackage.Literals.MEMBER_CONTAINER__MEMBERS,
                ClassifiersFactory.eINSTANCE.createInterface()));

        newChildDescriptors.add(createChildParameter(MembersPackage.Literals.MEMBER_CONTAINER__MEMBERS,
                ClassifiersFactory.eINSTANCE.createEnumeration()));

        newChildDescriptors.add(createChildParameter(MembersPackage.Literals.MEMBER_CONTAINER__MEMBERS,
                ClassifiersFactory.eINSTANCE.createAnnotation()));

        newChildDescriptors.add(createChildParameter(MembersPackage.Literals.MEMBER_CONTAINER__MEMBERS,
                StatementsFactory.eINSTANCE.createBlock()));

        newChildDescriptors.add(createChildParameter(MembersPackage.Literals.MEMBER_CONTAINER__DEFAULT_MEMBERS,
                MembersFactory.eINSTANCE.createConstructor()));

        newChildDescriptors.add(createChildParameter(MembersPackage.Literals.MEMBER_CONTAINER__DEFAULT_MEMBERS,
                MembersFactory.eINSTANCE.createEmptyMember()));

        newChildDescriptors.add(createChildParameter(MembersPackage.Literals.MEMBER_CONTAINER__DEFAULT_MEMBERS,
                MembersFactory.eINSTANCE.createField()));

        newChildDescriptors.add(createChildParameter(MembersPackage.Literals.MEMBER_CONTAINER__DEFAULT_MEMBERS,
                MembersFactory.eINSTANCE.createInterfaceMethod()));

        newChildDescriptors.add(createChildParameter(MembersPackage.Literals.MEMBER_CONTAINER__DEFAULT_MEMBERS,
                MembersFactory.eINSTANCE.createClassMethod()));

        newChildDescriptors.add(createChildParameter(MembersPackage.Literals.MEMBER_CONTAINER__DEFAULT_MEMBERS,
                AnnotationsFactory.eINSTANCE.createAnnotationAttribute()));

        newChildDescriptors.add(createChildParameter(MembersPackage.Literals.MEMBER_CONTAINER__DEFAULT_MEMBERS,
                ClassifiersFactory.eINSTANCE.createClass()));

        newChildDescriptors.add(createChildParameter(MembersPackage.Literals.MEMBER_CONTAINER__DEFAULT_MEMBERS,
                ClassifiersFactory.eINSTANCE.createInterface()));

        newChildDescriptors.add(createChildParameter(MembersPackage.Literals.MEMBER_CONTAINER__DEFAULT_MEMBERS,
                ClassifiersFactory.eINSTANCE.createEnumeration()));

        newChildDescriptors.add(createChildParameter(MembersPackage.Literals.MEMBER_CONTAINER__DEFAULT_MEMBERS,
                ClassifiersFactory.eINSTANCE.createAnnotation()));

        newChildDescriptors.add(createChildParameter(MembersPackage.Literals.MEMBER_CONTAINER__DEFAULT_MEMBERS,
                StatementsFactory.eINSTANCE.createBlock()));
    }

    /**
     * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
        Object childFeature = feature;
        Object childObject = child;

        boolean qualify = childFeature == MembersPackage.Literals.MEMBER_CONTAINER__MEMBERS
                || childFeature == MembersPackage.Literals.MEMBER_CONTAINER__DEFAULT_MEMBERS;

        if (qualify) {
            return getString("_UI_CreateChild_text2",
                    new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
        }
        return super.getCreateChildText(owner, feature, child, selection);
    }

    /**
     * Return the resource locator for this item provider's resources.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        return JavaModelEditPlugin.INSTANCE;
    }

}
