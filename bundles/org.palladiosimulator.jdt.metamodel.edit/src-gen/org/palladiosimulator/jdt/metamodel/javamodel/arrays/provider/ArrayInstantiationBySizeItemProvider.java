/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.arrays.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationsFactory;

import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayInstantiationBySize;
import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArraysFactory;
import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArraysPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExpressionsFactory;

import org.palladiosimulator.jdt.metamodel.javamodel.instantiations.InstantiationsFactory;

import org.palladiosimulator.jdt.metamodel.javamodel.literals.LiteralsFactory;

import org.palladiosimulator.jdt.metamodel.javamodel.references.ReferencesFactory;
import org.palladiosimulator.jdt.metamodel.javamodel.references.ReferencesPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.types.TypesFactory;
import org.palladiosimulator.jdt.metamodel.javamodel.types.TypesPackage;

/**
 * This is the item provider adapter for a {@link org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArrayInstantiationBySize} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ArrayInstantiationBySizeItemProvider extends ArrayInstantiationItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ArrayInstantiationBySizeItemProvider(AdapterFactory adapterFactory) {
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
            childrenFeatures.add(TypesPackage.Literals.TYPED_ELEMENT__TYPE_REFERENCE);
            childrenFeatures.add(ArraysPackage.Literals.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_BEFORE);
            childrenFeatures.add(ArraysPackage.Literals.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_AFTER);
            childrenFeatures.add(ArraysPackage.Literals.ARRAY_INSTANTIATION_BY_SIZE__SIZES);
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
     * This returns ArrayInstantiationBySize.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/ArrayInstantiationBySize"));
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
        return getString("_UI_ArrayInstantiationBySize_type");
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

        switch (notification.getFeatureID(ArrayInstantiationBySize.class)) {
        case ArraysPackage.ARRAY_INSTANTIATION_BY_SIZE__TYPE_REFERENCE:
        case ArraysPackage.ARRAY_INSTANTIATION_BY_SIZE__ARRAY_DIMENSIONS_BEFORE:
        case ArraysPackage.ARRAY_INSTANTIATION_BY_SIZE__ARRAY_DIMENSIONS_AFTER:
        case ArraysPackage.ARRAY_INSTANTIATION_BY_SIZE__SIZES:
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

        newChildDescriptors.add(createChildParameter(TypesPackage.Literals.TYPED_ELEMENT__TYPE_REFERENCE,
                TypesFactory.eINSTANCE.createClassifierReference()));

        newChildDescriptors.add(createChildParameter(TypesPackage.Literals.TYPED_ELEMENT__TYPE_REFERENCE,
                TypesFactory.eINSTANCE.createNamespaceClassifierReference()));

        newChildDescriptors.add(createChildParameter(TypesPackage.Literals.TYPED_ELEMENT__TYPE_REFERENCE,
                TypesFactory.eINSTANCE.createBoolean()));

        newChildDescriptors.add(createChildParameter(TypesPackage.Literals.TYPED_ELEMENT__TYPE_REFERENCE,
                TypesFactory.eINSTANCE.createByte()));

        newChildDescriptors.add(createChildParameter(TypesPackage.Literals.TYPED_ELEMENT__TYPE_REFERENCE,
                TypesFactory.eINSTANCE.createChar()));

        newChildDescriptors.add(createChildParameter(TypesPackage.Literals.TYPED_ELEMENT__TYPE_REFERENCE,
                TypesFactory.eINSTANCE.createDouble()));

        newChildDescriptors.add(createChildParameter(TypesPackage.Literals.TYPED_ELEMENT__TYPE_REFERENCE,
                TypesFactory.eINSTANCE.createFloat()));

        newChildDescriptors.add(createChildParameter(TypesPackage.Literals.TYPED_ELEMENT__TYPE_REFERENCE,
                TypesFactory.eINSTANCE.createInt()));

        newChildDescriptors.add(createChildParameter(TypesPackage.Literals.TYPED_ELEMENT__TYPE_REFERENCE,
                TypesFactory.eINSTANCE.createLong()));

        newChildDescriptors.add(createChildParameter(TypesPackage.Literals.TYPED_ELEMENT__TYPE_REFERENCE,
                TypesFactory.eINSTANCE.createShort()));

        newChildDescriptors.add(createChildParameter(TypesPackage.Literals.TYPED_ELEMENT__TYPE_REFERENCE,
                TypesFactory.eINSTANCE.createVoid()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_BEFORE,
                ArraysFactory.eINSTANCE.createArrayDimension()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_AFTER,
                ArraysFactory.eINSTANCE.createArrayDimension()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INSTANTIATION_BY_SIZE__SIZES,
                ArraysFactory.eINSTANCE.createArrayInstantiationBySize()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INSTANTIATION_BY_SIZE__SIZES,
                ArraysFactory.eINSTANCE.createArrayInstantiationByValuesUntyped()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INSTANTIATION_BY_SIZE__SIZES,
                ArraysFactory.eINSTANCE.createArrayInstantiationByValuesTyped()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INSTANTIATION_BY_SIZE__SIZES,
                AnnotationsFactory.eINSTANCE.createAnnotationInstance()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INSTANTIATION_BY_SIZE__SIZES,
                ExpressionsFactory.eINSTANCE.createAssignmentExpression()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INSTANTIATION_BY_SIZE__SIZES,
                ExpressionsFactory.eINSTANCE.createConditionalExpression()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INSTANTIATION_BY_SIZE__SIZES,
                ExpressionsFactory.eINSTANCE.createConditionalOrExpression()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INSTANTIATION_BY_SIZE__SIZES,
                ExpressionsFactory.eINSTANCE.createConditionalAndExpression()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INSTANTIATION_BY_SIZE__SIZES,
                ExpressionsFactory.eINSTANCE.createInclusiveOrExpression()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INSTANTIATION_BY_SIZE__SIZES,
                ExpressionsFactory.eINSTANCE.createExclusiveOrExpression()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INSTANTIATION_BY_SIZE__SIZES,
                ExpressionsFactory.eINSTANCE.createAndExpression()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INSTANTIATION_BY_SIZE__SIZES,
                ExpressionsFactory.eINSTANCE.createEqualityExpression()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INSTANTIATION_BY_SIZE__SIZES,
                ExpressionsFactory.eINSTANCE.createInstanceOfExpression()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INSTANTIATION_BY_SIZE__SIZES,
                ExpressionsFactory.eINSTANCE.createRelationExpression()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INSTANTIATION_BY_SIZE__SIZES,
                ExpressionsFactory.eINSTANCE.createShiftExpression()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INSTANTIATION_BY_SIZE__SIZES,
                ExpressionsFactory.eINSTANCE.createAdditiveExpression()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INSTANTIATION_BY_SIZE__SIZES,
                ExpressionsFactory.eINSTANCE.createMultiplicativeExpression()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INSTANTIATION_BY_SIZE__SIZES,
                ExpressionsFactory.eINSTANCE.createUnaryExpression()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INSTANTIATION_BY_SIZE__SIZES,
                ExpressionsFactory.eINSTANCE.createPrefixUnaryModificationExpression()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INSTANTIATION_BY_SIZE__SIZES,
                ExpressionsFactory.eINSTANCE.createSuffixUnaryModificationExpression()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INSTANTIATION_BY_SIZE__SIZES,
                ExpressionsFactory.eINSTANCE.createCastExpression()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INSTANTIATION_BY_SIZE__SIZES,
                ExpressionsFactory.eINSTANCE.createNestedExpression()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INSTANTIATION_BY_SIZE__SIZES,
                InstantiationsFactory.eINSTANCE.createNewConstructorCall()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INSTANTIATION_BY_SIZE__SIZES,
                InstantiationsFactory.eINSTANCE.createExplicitConstructorCall()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INSTANTIATION_BY_SIZE__SIZES,
                LiteralsFactory.eINSTANCE.createBooleanLiteral()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INSTANTIATION_BY_SIZE__SIZES,
                LiteralsFactory.eINSTANCE.createCharacterLiteral()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INSTANTIATION_BY_SIZE__SIZES,
                LiteralsFactory.eINSTANCE.createDecimalFloatLiteral()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INSTANTIATION_BY_SIZE__SIZES,
                LiteralsFactory.eINSTANCE.createHexFloatLiteral()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INSTANTIATION_BY_SIZE__SIZES,
                LiteralsFactory.eINSTANCE.createDecimalDoubleLiteral()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INSTANTIATION_BY_SIZE__SIZES,
                LiteralsFactory.eINSTANCE.createHexDoubleLiteral()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INSTANTIATION_BY_SIZE__SIZES,
                LiteralsFactory.eINSTANCE.createDecimalIntegerLiteral()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INSTANTIATION_BY_SIZE__SIZES,
                LiteralsFactory.eINSTANCE.createHexIntegerLiteral()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INSTANTIATION_BY_SIZE__SIZES,
                LiteralsFactory.eINSTANCE.createOctalIntegerLiteral()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INSTANTIATION_BY_SIZE__SIZES,
                LiteralsFactory.eINSTANCE.createDecimalLongLiteral()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INSTANTIATION_BY_SIZE__SIZES,
                LiteralsFactory.eINSTANCE.createHexLongLiteral()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INSTANTIATION_BY_SIZE__SIZES,
                LiteralsFactory.eINSTANCE.createOctalLongLiteral()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INSTANTIATION_BY_SIZE__SIZES,
                LiteralsFactory.eINSTANCE.createNullLiteral()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INSTANTIATION_BY_SIZE__SIZES,
                ReferencesFactory.eINSTANCE.createIdentifierReference()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INSTANTIATION_BY_SIZE__SIZES,
                ReferencesFactory.eINSTANCE.createMethodCall()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INSTANTIATION_BY_SIZE__SIZES,
                ReferencesFactory.eINSTANCE.createReflectiveClassReference()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INSTANTIATION_BY_SIZE__SIZES,
                ReferencesFactory.eINSTANCE.createPrimitiveTypeReference()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INSTANTIATION_BY_SIZE__SIZES,
                ReferencesFactory.eINSTANCE.createStringReference()));

        newChildDescriptors.add(createChildParameter(ArraysPackage.Literals.ARRAY_INSTANTIATION_BY_SIZE__SIZES,
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

        boolean qualify = childFeature == ReferencesPackage.Literals.REFERENCE__NEXT
                || childFeature == ArraysPackage.Literals.ARRAY_INSTANTIATION_BY_SIZE__SIZES
                || childFeature == ArraysPackage.Literals.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_BEFORE
                || childFeature == ArraysPackage.Literals.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_AFTER;

        if (qualify) {
            return getString("_UI_CreateChild_text2",
                    new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
        }
        return super.getCreateChildText(owner, feature, child, selection);
    }

}
