/**
 */
package org.palladiosimulator.jdt.metamodel.javamodel.statements.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.palladiosimulator.jdt.metamodel.javamodel.annotations.AnnotationsFactory;

import org.palladiosimulator.jdt.metamodel.javamodel.arrays.ArraysFactory;

import org.palladiosimulator.jdt.metamodel.javamodel.classifiers.ClassifiersFactory;

import org.palladiosimulator.jdt.metamodel.javamodel.expressions.ExpressionsFactory;

import org.palladiosimulator.jdt.metamodel.javamodel.instantiations.InstantiationsFactory;

import org.palladiosimulator.jdt.metamodel.javamodel.literals.LiteralsFactory;

import org.palladiosimulator.jdt.metamodel.javamodel.parameters.ParametersFactory;

import org.palladiosimulator.jdt.metamodel.javamodel.references.ReferencesFactory;

import org.palladiosimulator.jdt.metamodel.javamodel.statements.ForEachLoop;
import org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementsFactory;
import org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementsPackage;

/**
 * This is the item provider adapter for a {@link org.palladiosimulator.jdt.metamodel.javamodel.statements.ForEachLoop} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ForEachLoopItemProvider extends StatementItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ForEachLoopItemProvider(AdapterFactory adapterFactory) {
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
            childrenFeatures.add(StatementsPackage.Literals.STATEMENT_CONTAINER__STATEMENT);
            childrenFeatures.add(StatementsPackage.Literals.FOR_EACH_LOOP__NEXT);
            childrenFeatures.add(StatementsPackage.Literals.FOR_EACH_LOOP__COLLECTION);
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
     * This returns ForEachLoop.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/ForEachLoop"));
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
        return getString("_UI_ForEachLoop_type");
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

        switch (notification.getFeatureID(ForEachLoop.class)) {
        case StatementsPackage.FOR_EACH_LOOP__STATEMENT:
        case StatementsPackage.FOR_EACH_LOOP__NEXT:
        case StatementsPackage.FOR_EACH_LOOP__COLLECTION:
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

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.FOR_EACH_LOOP__NEXT,
                ParametersFactory.eINSTANCE.createOrdinaryParameter()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.FOR_EACH_LOOP__COLLECTION,
                AnnotationsFactory.eINSTANCE.createAnnotationInstance()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.FOR_EACH_LOOP__COLLECTION,
                ArraysFactory.eINSTANCE.createArrayInstantiationBySize()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.FOR_EACH_LOOP__COLLECTION,
                ArraysFactory.eINSTANCE.createArrayInstantiationByValuesUntyped()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.FOR_EACH_LOOP__COLLECTION,
                ArraysFactory.eINSTANCE.createArrayInstantiationByValuesTyped()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.FOR_EACH_LOOP__COLLECTION,
                ExpressionsFactory.eINSTANCE.createAssignmentExpression()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.FOR_EACH_LOOP__COLLECTION,
                ExpressionsFactory.eINSTANCE.createConditionalExpression()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.FOR_EACH_LOOP__COLLECTION,
                ExpressionsFactory.eINSTANCE.createConditionalOrExpression()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.FOR_EACH_LOOP__COLLECTION,
                ExpressionsFactory.eINSTANCE.createConditionalAndExpression()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.FOR_EACH_LOOP__COLLECTION,
                ExpressionsFactory.eINSTANCE.createInclusiveOrExpression()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.FOR_EACH_LOOP__COLLECTION,
                ExpressionsFactory.eINSTANCE.createExclusiveOrExpression()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.FOR_EACH_LOOP__COLLECTION,
                ExpressionsFactory.eINSTANCE.createAndExpression()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.FOR_EACH_LOOP__COLLECTION,
                ExpressionsFactory.eINSTANCE.createEqualityExpression()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.FOR_EACH_LOOP__COLLECTION,
                ExpressionsFactory.eINSTANCE.createInstanceOfExpression()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.FOR_EACH_LOOP__COLLECTION,
                ExpressionsFactory.eINSTANCE.createRelationExpression()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.FOR_EACH_LOOP__COLLECTION,
                ExpressionsFactory.eINSTANCE.createShiftExpression()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.FOR_EACH_LOOP__COLLECTION,
                ExpressionsFactory.eINSTANCE.createAdditiveExpression()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.FOR_EACH_LOOP__COLLECTION,
                ExpressionsFactory.eINSTANCE.createMultiplicativeExpression()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.FOR_EACH_LOOP__COLLECTION,
                ExpressionsFactory.eINSTANCE.createUnaryExpression()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.FOR_EACH_LOOP__COLLECTION,
                ExpressionsFactory.eINSTANCE.createPrefixUnaryModificationExpression()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.FOR_EACH_LOOP__COLLECTION,
                ExpressionsFactory.eINSTANCE.createSuffixUnaryModificationExpression()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.FOR_EACH_LOOP__COLLECTION,
                ExpressionsFactory.eINSTANCE.createCastExpression()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.FOR_EACH_LOOP__COLLECTION,
                ExpressionsFactory.eINSTANCE.createNestedExpression()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.FOR_EACH_LOOP__COLLECTION,
                InstantiationsFactory.eINSTANCE.createNewConstructorCall()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.FOR_EACH_LOOP__COLLECTION,
                InstantiationsFactory.eINSTANCE.createExplicitConstructorCall()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.FOR_EACH_LOOP__COLLECTION,
                LiteralsFactory.eINSTANCE.createBooleanLiteral()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.FOR_EACH_LOOP__COLLECTION,
                LiteralsFactory.eINSTANCE.createCharacterLiteral()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.FOR_EACH_LOOP__COLLECTION,
                LiteralsFactory.eINSTANCE.createDecimalFloatLiteral()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.FOR_EACH_LOOP__COLLECTION,
                LiteralsFactory.eINSTANCE.createHexFloatLiteral()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.FOR_EACH_LOOP__COLLECTION,
                LiteralsFactory.eINSTANCE.createDecimalDoubleLiteral()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.FOR_EACH_LOOP__COLLECTION,
                LiteralsFactory.eINSTANCE.createHexDoubleLiteral()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.FOR_EACH_LOOP__COLLECTION,
                LiteralsFactory.eINSTANCE.createDecimalIntegerLiteral()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.FOR_EACH_LOOP__COLLECTION,
                LiteralsFactory.eINSTANCE.createHexIntegerLiteral()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.FOR_EACH_LOOP__COLLECTION,
                LiteralsFactory.eINSTANCE.createOctalIntegerLiteral()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.FOR_EACH_LOOP__COLLECTION,
                LiteralsFactory.eINSTANCE.createDecimalLongLiteral()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.FOR_EACH_LOOP__COLLECTION,
                LiteralsFactory.eINSTANCE.createHexLongLiteral()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.FOR_EACH_LOOP__COLLECTION,
                LiteralsFactory.eINSTANCE.createOctalLongLiteral()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.FOR_EACH_LOOP__COLLECTION,
                LiteralsFactory.eINSTANCE.createNullLiteral()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.FOR_EACH_LOOP__COLLECTION,
                ReferencesFactory.eINSTANCE.createIdentifierReference()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.FOR_EACH_LOOP__COLLECTION,
                ReferencesFactory.eINSTANCE.createMethodCall()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.FOR_EACH_LOOP__COLLECTION,
                ReferencesFactory.eINSTANCE.createReflectiveClassReference()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.FOR_EACH_LOOP__COLLECTION,
                ReferencesFactory.eINSTANCE.createPrimitiveTypeReference()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.FOR_EACH_LOOP__COLLECTION,
                ReferencesFactory.eINSTANCE.createStringReference()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.FOR_EACH_LOOP__COLLECTION,
                ReferencesFactory.eINSTANCE.createSelfReference()));
    }

}
