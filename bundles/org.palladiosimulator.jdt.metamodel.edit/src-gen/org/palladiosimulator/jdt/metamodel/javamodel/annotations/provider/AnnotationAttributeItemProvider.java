/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.annotations.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationAttribute;
import org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationsFactory;
import org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationsPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArraysFactory;
import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArraysPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExpressionsFactory;

import org.palladiosimulator.jdt.metamodel.javamodel.instantiations.InstantiationsFactory;

import org.palladiosimulator.jdt.metamodel.javamodel.literals.LiteralsFactory;

import org.palladiosimulator.jdt.metamodel.javamodel.members.MembersPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.members.provider.InterfaceMethodItemProvider;

import org.palladiosimulator.jdt.metamodel.javamodel.modifiers.ModifiersPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.references.ReferencesFactory;

import org.palladiosimulator.jdt.metamodel.javamodel.types.TypesPackage;

/**
 * This is the item provider adapter for a {@link org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationAttribute} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AnnotationAttributeItemProvider extends InterfaceMethodItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AnnotationAttributeItemProvider(AdapterFactory adapterFactory) {
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
            childrenFeatures.add(AnnotationsPackage.Literals.ANNOTATION_ATTRIBUTE__DEFAULT_VALUE);
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
     * This returns AnnotationAttribute.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/AnnotationAttribute"));
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
        String label = ((AnnotationAttribute) object).getName();
        return label == null || label.length() == 0 ? getString("_UI_AnnotationAttribute_type")
                : getString("_UI_AnnotationAttribute_type") + " " + label;
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

        switch (notification.getFeatureID(AnnotationAttribute.class)) {
        case AnnotationsPackage.ANNOTATION_ATTRIBUTE__DEFAULT_VALUE:
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

        newChildDescriptors.add(createChildParameter(AnnotationsPackage.Literals.ANNOTATION_ATTRIBUTE__DEFAULT_VALUE,
                AnnotationsFactory.eINSTANCE.createAnnotationInstance()));

        newChildDescriptors.add(createChildParameter(AnnotationsPackage.Literals.ANNOTATION_ATTRIBUTE__DEFAULT_VALUE,
                ArraysFactory.eINSTANCE.createArrayInstantiationBySize()));

        newChildDescriptors.add(createChildParameter(AnnotationsPackage.Literals.ANNOTATION_ATTRIBUTE__DEFAULT_VALUE,
                ArraysFactory.eINSTANCE.createArrayInstantiationByValuesUntyped()));

        newChildDescriptors.add(createChildParameter(AnnotationsPackage.Literals.ANNOTATION_ATTRIBUTE__DEFAULT_VALUE,
                ArraysFactory.eINSTANCE.createArrayInstantiationByValuesTyped()));

        newChildDescriptors.add(createChildParameter(AnnotationsPackage.Literals.ANNOTATION_ATTRIBUTE__DEFAULT_VALUE,
                ExpressionsFactory.eINSTANCE.createAssignmentExpression()));

        newChildDescriptors.add(createChildParameter(AnnotationsPackage.Literals.ANNOTATION_ATTRIBUTE__DEFAULT_VALUE,
                ExpressionsFactory.eINSTANCE.createConditionalExpression()));

        newChildDescriptors.add(createChildParameter(AnnotationsPackage.Literals.ANNOTATION_ATTRIBUTE__DEFAULT_VALUE,
                ExpressionsFactory.eINSTANCE.createConditionalOrExpression()));

        newChildDescriptors.add(createChildParameter(AnnotationsPackage.Literals.ANNOTATION_ATTRIBUTE__DEFAULT_VALUE,
                ExpressionsFactory.eINSTANCE.createConditionalAndExpression()));

        newChildDescriptors.add(createChildParameter(AnnotationsPackage.Literals.ANNOTATION_ATTRIBUTE__DEFAULT_VALUE,
                ExpressionsFactory.eINSTANCE.createInclusiveOrExpression()));

        newChildDescriptors.add(createChildParameter(AnnotationsPackage.Literals.ANNOTATION_ATTRIBUTE__DEFAULT_VALUE,
                ExpressionsFactory.eINSTANCE.createExclusiveOrExpression()));

        newChildDescriptors.add(createChildParameter(AnnotationsPackage.Literals.ANNOTATION_ATTRIBUTE__DEFAULT_VALUE,
                ExpressionsFactory.eINSTANCE.createAndExpression()));

        newChildDescriptors.add(createChildParameter(AnnotationsPackage.Literals.ANNOTATION_ATTRIBUTE__DEFAULT_VALUE,
                ExpressionsFactory.eINSTANCE.createEqualityExpression()));

        newChildDescriptors.add(createChildParameter(AnnotationsPackage.Literals.ANNOTATION_ATTRIBUTE__DEFAULT_VALUE,
                ExpressionsFactory.eINSTANCE.createInstanceOfExpression()));

        newChildDescriptors.add(createChildParameter(AnnotationsPackage.Literals.ANNOTATION_ATTRIBUTE__DEFAULT_VALUE,
                ExpressionsFactory.eINSTANCE.createRelationExpression()));

        newChildDescriptors.add(createChildParameter(AnnotationsPackage.Literals.ANNOTATION_ATTRIBUTE__DEFAULT_VALUE,
                ExpressionsFactory.eINSTANCE.createShiftExpression()));

        newChildDescriptors.add(createChildParameter(AnnotationsPackage.Literals.ANNOTATION_ATTRIBUTE__DEFAULT_VALUE,
                ExpressionsFactory.eINSTANCE.createAdditiveExpression()));

        newChildDescriptors.add(createChildParameter(AnnotationsPackage.Literals.ANNOTATION_ATTRIBUTE__DEFAULT_VALUE,
                ExpressionsFactory.eINSTANCE.createMultiplicativeExpression()));

        newChildDescriptors.add(createChildParameter(AnnotationsPackage.Literals.ANNOTATION_ATTRIBUTE__DEFAULT_VALUE,
                ExpressionsFactory.eINSTANCE.createUnaryExpression()));

        newChildDescriptors.add(createChildParameter(AnnotationsPackage.Literals.ANNOTATION_ATTRIBUTE__DEFAULT_VALUE,
                ExpressionsFactory.eINSTANCE.createPrefixUnaryModificationExpression()));

        newChildDescriptors.add(createChildParameter(AnnotationsPackage.Literals.ANNOTATION_ATTRIBUTE__DEFAULT_VALUE,
                ExpressionsFactory.eINSTANCE.createSuffixUnaryModificationExpression()));

        newChildDescriptors.add(createChildParameter(AnnotationsPackage.Literals.ANNOTATION_ATTRIBUTE__DEFAULT_VALUE,
                ExpressionsFactory.eINSTANCE.createCastExpression()));

        newChildDescriptors.add(createChildParameter(AnnotationsPackage.Literals.ANNOTATION_ATTRIBUTE__DEFAULT_VALUE,
                ExpressionsFactory.eINSTANCE.createNestedExpression()));

        newChildDescriptors.add(createChildParameter(AnnotationsPackage.Literals.ANNOTATION_ATTRIBUTE__DEFAULT_VALUE,
                InstantiationsFactory.eINSTANCE.createNewConstructorCall()));

        newChildDescriptors.add(createChildParameter(AnnotationsPackage.Literals.ANNOTATION_ATTRIBUTE__DEFAULT_VALUE,
                InstantiationsFactory.eINSTANCE.createExplicitConstructorCall()));

        newChildDescriptors.add(createChildParameter(AnnotationsPackage.Literals.ANNOTATION_ATTRIBUTE__DEFAULT_VALUE,
                LiteralsFactory.eINSTANCE.createBooleanLiteral()));

        newChildDescriptors.add(createChildParameter(AnnotationsPackage.Literals.ANNOTATION_ATTRIBUTE__DEFAULT_VALUE,
                LiteralsFactory.eINSTANCE.createCharacterLiteral()));

        newChildDescriptors.add(createChildParameter(AnnotationsPackage.Literals.ANNOTATION_ATTRIBUTE__DEFAULT_VALUE,
                LiteralsFactory.eINSTANCE.createDecimalFloatLiteral()));

        newChildDescriptors.add(createChildParameter(AnnotationsPackage.Literals.ANNOTATION_ATTRIBUTE__DEFAULT_VALUE,
                LiteralsFactory.eINSTANCE.createHexFloatLiteral()));

        newChildDescriptors.add(createChildParameter(AnnotationsPackage.Literals.ANNOTATION_ATTRIBUTE__DEFAULT_VALUE,
                LiteralsFactory.eINSTANCE.createDecimalDoubleLiteral()));

        newChildDescriptors.add(createChildParameter(AnnotationsPackage.Literals.ANNOTATION_ATTRIBUTE__DEFAULT_VALUE,
                LiteralsFactory.eINSTANCE.createHexDoubleLiteral()));

        newChildDescriptors.add(createChildParameter(AnnotationsPackage.Literals.ANNOTATION_ATTRIBUTE__DEFAULT_VALUE,
                LiteralsFactory.eINSTANCE.createDecimalIntegerLiteral()));

        newChildDescriptors.add(createChildParameter(AnnotationsPackage.Literals.ANNOTATION_ATTRIBUTE__DEFAULT_VALUE,
                LiteralsFactory.eINSTANCE.createHexIntegerLiteral()));

        newChildDescriptors.add(createChildParameter(AnnotationsPackage.Literals.ANNOTATION_ATTRIBUTE__DEFAULT_VALUE,
                LiteralsFactory.eINSTANCE.createOctalIntegerLiteral()));

        newChildDescriptors.add(createChildParameter(AnnotationsPackage.Literals.ANNOTATION_ATTRIBUTE__DEFAULT_VALUE,
                LiteralsFactory.eINSTANCE.createDecimalLongLiteral()));

        newChildDescriptors.add(createChildParameter(AnnotationsPackage.Literals.ANNOTATION_ATTRIBUTE__DEFAULT_VALUE,
                LiteralsFactory.eINSTANCE.createHexLongLiteral()));

        newChildDescriptors.add(createChildParameter(AnnotationsPackage.Literals.ANNOTATION_ATTRIBUTE__DEFAULT_VALUE,
                LiteralsFactory.eINSTANCE.createOctalLongLiteral()));

        newChildDescriptors.add(createChildParameter(AnnotationsPackage.Literals.ANNOTATION_ATTRIBUTE__DEFAULT_VALUE,
                LiteralsFactory.eINSTANCE.createNullLiteral()));

        newChildDescriptors.add(createChildParameter(AnnotationsPackage.Literals.ANNOTATION_ATTRIBUTE__DEFAULT_VALUE,
                ReferencesFactory.eINSTANCE.createIdentifierReference()));

        newChildDescriptors.add(createChildParameter(AnnotationsPackage.Literals.ANNOTATION_ATTRIBUTE__DEFAULT_VALUE,
                ReferencesFactory.eINSTANCE.createMethodCall()));

        newChildDescriptors.add(createChildParameter(AnnotationsPackage.Literals.ANNOTATION_ATTRIBUTE__DEFAULT_VALUE,
                ReferencesFactory.eINSTANCE.createReflectiveClassReference()));

        newChildDescriptors.add(createChildParameter(AnnotationsPackage.Literals.ANNOTATION_ATTRIBUTE__DEFAULT_VALUE,
                ReferencesFactory.eINSTANCE.createPrimitiveTypeReference()));

        newChildDescriptors.add(createChildParameter(AnnotationsPackage.Literals.ANNOTATION_ATTRIBUTE__DEFAULT_VALUE,
                ReferencesFactory.eINSTANCE.createStringReference()));

        newChildDescriptors.add(createChildParameter(AnnotationsPackage.Literals.ANNOTATION_ATTRIBUTE__DEFAULT_VALUE,
                ReferencesFactory.eINSTANCE.createSelfReference()));
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

        boolean qualify = childFeature == TypesPackage.Literals.TYPED_ELEMENT__TYPE_REFERENCE
                || childFeature == MembersPackage.Literals.EXCEPTION_THROWER__EXCEPTIONS
                || childFeature == ArraysPackage.Literals.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_BEFORE
                || childFeature == ArraysPackage.Literals.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_AFTER
                || childFeature == ModifiersPackage.Literals.ANNOTABLE_AND_MODIFIABLE__ANNOTATIONS_AND_MODIFIERS
                || childFeature == AnnotationsPackage.Literals.ANNOTATION_ATTRIBUTE__DEFAULT_VALUE;

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
