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

import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArraysFactory;
import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArraysPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExpressionsFactory;

import org.palladiosimulator.jdt.metamodel.javamodel.generics.GenericsFactory;
import org.palladiosimulator.jdt.metamodel.javamodel.generics.GenericsPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.instantiations.InstantiationsFactory;
import org.palladiosimulator.jdt.metamodel.javamodel.instantiations.InstantiationsPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.literals.LiteralsFactory;

import org.palladiosimulator.jdt.metamodel.javamodel.members.Field;
import org.palladiosimulator.jdt.metamodel.javamodel.members.MembersFactory;
import org.palladiosimulator.jdt.metamodel.javamodel.members.MembersPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.modifiers.ModifiersFactory;
import org.palladiosimulator.jdt.metamodel.javamodel.modifiers.ModifiersPackage;

import org.palladiosimulator.jdt.metamodel.javamodel.references.ReferencesFactory;

import org.palladiosimulator.jdt.metamodel.javamodel.types.TypesFactory;
import org.palladiosimulator.jdt.metamodel.javamodel.types.TypesPackage;

/**
 * This is the item provider adapter for a {@link org.palladiosimulator.jdt.metamodel.javamodel.members.Field} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FieldItemProvider extends MemberItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FieldItemProvider(AdapterFactory adapterFactory) {
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
            childrenFeatures.add(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE);
            childrenFeatures.add(TypesPackage.Literals.TYPED_ELEMENT__TYPE_REFERENCE);
            childrenFeatures.add(ArraysPackage.Literals.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_BEFORE);
            childrenFeatures.add(ArraysPackage.Literals.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_AFTER);
            childrenFeatures.add(GenericsPackage.Literals.TYPE_ARGUMENTABLE__TYPE_ARGUMENTS);
            childrenFeatures.add(ModifiersPackage.Literals.ANNOTABLE_AND_MODIFIABLE__ANNOTATIONS_AND_MODIFIERS);
            childrenFeatures.add(MembersPackage.Literals.FIELD__ADDITIONAL_FIELDS);
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
     * This returns Field.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/Field"));
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
        String label = ((Field) object).getName();
        return label == null || label.length() == 0 ? getString("_UI_Field_type")
                : getString("_UI_Field_type") + " " + label;
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

        switch (notification.getFeatureID(Field.class)) {
        case MembersPackage.FIELD__INITIAL_VALUE:
        case MembersPackage.FIELD__TYPE_REFERENCE:
        case MembersPackage.FIELD__ARRAY_DIMENSIONS_BEFORE:
        case MembersPackage.FIELD__ARRAY_DIMENSIONS_AFTER:
        case MembersPackage.FIELD__TYPE_ARGUMENTS:
        case MembersPackage.FIELD__ANNOTATIONS_AND_MODIFIERS:
        case MembersPackage.FIELD__ADDITIONAL_FIELDS:
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

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                AnnotationsFactory.eINSTANCE.createAnnotationInstance()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                ArraysFactory.eINSTANCE.createArrayInstantiationBySize()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                ArraysFactory.eINSTANCE.createArrayInstantiationByValuesUntyped()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                ArraysFactory.eINSTANCE.createArrayInstantiationByValuesTyped()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                ExpressionsFactory.eINSTANCE.createAssignmentExpression()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                ExpressionsFactory.eINSTANCE.createConditionalExpression()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                ExpressionsFactory.eINSTANCE.createConditionalOrExpression()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                ExpressionsFactory.eINSTANCE.createConditionalAndExpression()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                ExpressionsFactory.eINSTANCE.createInclusiveOrExpression()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                ExpressionsFactory.eINSTANCE.createExclusiveOrExpression()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                ExpressionsFactory.eINSTANCE.createAndExpression()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                ExpressionsFactory.eINSTANCE.createEqualityExpression()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                ExpressionsFactory.eINSTANCE.createInstanceOfExpression()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                ExpressionsFactory.eINSTANCE.createRelationExpression()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                ExpressionsFactory.eINSTANCE.createShiftExpression()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                ExpressionsFactory.eINSTANCE.createAdditiveExpression()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                ExpressionsFactory.eINSTANCE.createMultiplicativeExpression()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                ExpressionsFactory.eINSTANCE.createUnaryExpression()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                ExpressionsFactory.eINSTANCE.createPrefixUnaryModificationExpression()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                ExpressionsFactory.eINSTANCE.createSuffixUnaryModificationExpression()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                ExpressionsFactory.eINSTANCE.createCastExpression()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                ExpressionsFactory.eINSTANCE.createNestedExpression()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                InstantiationsFactory.eINSTANCE.createNewConstructorCall()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                InstantiationsFactory.eINSTANCE.createExplicitConstructorCall()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                LiteralsFactory.eINSTANCE.createBooleanLiteral()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                LiteralsFactory.eINSTANCE.createCharacterLiteral()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                LiteralsFactory.eINSTANCE.createDecimalFloatLiteral()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                LiteralsFactory.eINSTANCE.createHexFloatLiteral()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                LiteralsFactory.eINSTANCE.createDecimalDoubleLiteral()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                LiteralsFactory.eINSTANCE.createHexDoubleLiteral()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                LiteralsFactory.eINSTANCE.createDecimalIntegerLiteral()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                LiteralsFactory.eINSTANCE.createHexIntegerLiteral()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                LiteralsFactory.eINSTANCE.createOctalIntegerLiteral()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                LiteralsFactory.eINSTANCE.createDecimalLongLiteral()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                LiteralsFactory.eINSTANCE.createHexLongLiteral()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                LiteralsFactory.eINSTANCE.createOctalLongLiteral()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                LiteralsFactory.eINSTANCE.createNullLiteral()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                ReferencesFactory.eINSTANCE.createIdentifierReference()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                ReferencesFactory.eINSTANCE.createMethodCall()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                ReferencesFactory.eINSTANCE.createReflectiveClassReference()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                ReferencesFactory.eINSTANCE.createPrimitiveTypeReference()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                ReferencesFactory.eINSTANCE.createStringReference()));

        newChildDescriptors.add(createChildParameter(InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE,
                ReferencesFactory.eINSTANCE.createSelfReference()));

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

        newChildDescriptors.add(createChildParameter(GenericsPackage.Literals.TYPE_ARGUMENTABLE__TYPE_ARGUMENTS,
                GenericsFactory.eINSTANCE.createExtendsTypeArgument()));

        newChildDescriptors.add(createChildParameter(GenericsPackage.Literals.TYPE_ARGUMENTABLE__TYPE_ARGUMENTS,
                GenericsFactory.eINSTANCE.createQualifiedTypeArgument()));

        newChildDescriptors.add(createChildParameter(GenericsPackage.Literals.TYPE_ARGUMENTABLE__TYPE_ARGUMENTS,
                GenericsFactory.eINSTANCE.createSuperTypeArgument()));

        newChildDescriptors.add(createChildParameter(GenericsPackage.Literals.TYPE_ARGUMENTABLE__TYPE_ARGUMENTS,
                GenericsFactory.eINSTANCE.createUnknownTypeArgument()));

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

        newChildDescriptors.add(createChildParameter(MembersPackage.Literals.FIELD__ADDITIONAL_FIELDS,
                MembersFactory.eINSTANCE.createAdditionalField()));
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

        boolean qualify = childFeature == InstantiationsPackage.Literals.INITIALIZABLE__INITIAL_VALUE
                || childFeature == ModifiersPackage.Literals.ANNOTABLE_AND_MODIFIABLE__ANNOTATIONS_AND_MODIFIERS
                || childFeature == ArraysPackage.Literals.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_BEFORE
                || childFeature == ArraysPackage.Literals.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_AFTER;

        if (qualify) {
            return getString("_UI_CreateChild_text2",
                    new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
        }
        return super.getCreateChildText(owner, feature, child, selection);
    }

}
