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

import org.palladiosimulator.jdt.metamodel.javamodel.references.ReferencesFactory;

import org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementsFactory;
import org.palladiosimulator.jdt.metamodel.javamodel.statements.StatementsPackage;
import org.palladiosimulator.jdt.metamodel.javamodel.statements.SynchronizedBlock;

/**
 * This is the item provider adapter for a {@link org.palladiosimulator.jdt.metamodel.javamodel.statements.SynchronizedBlock} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SynchronizedBlockItemProvider extends StatementItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SynchronizedBlockItemProvider(AdapterFactory adapterFactory) {
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
            childrenFeatures.add(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__LOCK_PROVIDER);
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
     * This returns SynchronizedBlock.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/SynchronizedBlock"));
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
        return getString("_UI_SynchronizedBlock_type");
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

        switch (notification.getFeatureID(SynchronizedBlock.class)) {
        case StatementsPackage.SYNCHRONIZED_BLOCK__STATEMENTS:
        case StatementsPackage.SYNCHRONIZED_BLOCK__LOCK_PROVIDER:
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

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.STATEMENT_LIST_CONTAINER__STATEMENTS,
                ClassifiersFactory.eINSTANCE.createClass()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.STATEMENT_LIST_CONTAINER__STATEMENTS,
                ClassifiersFactory.eINSTANCE.createInterface()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.STATEMENT_LIST_CONTAINER__STATEMENTS,
                ClassifiersFactory.eINSTANCE.createEnumeration()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.STATEMENT_LIST_CONTAINER__STATEMENTS,
                ClassifiersFactory.eINSTANCE.createAnnotation()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__LOCK_PROVIDER,
                AnnotationsFactory.eINSTANCE.createAnnotationInstance()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__LOCK_PROVIDER,
                ArraysFactory.eINSTANCE.createArrayInstantiationBySize()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__LOCK_PROVIDER,
                ArraysFactory.eINSTANCE.createArrayInstantiationByValuesUntyped()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__LOCK_PROVIDER,
                ArraysFactory.eINSTANCE.createArrayInstantiationByValuesTyped()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__LOCK_PROVIDER,
                ExpressionsFactory.eINSTANCE.createAssignmentExpression()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__LOCK_PROVIDER,
                ExpressionsFactory.eINSTANCE.createConditionalExpression()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__LOCK_PROVIDER,
                ExpressionsFactory.eINSTANCE.createConditionalOrExpression()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__LOCK_PROVIDER,
                ExpressionsFactory.eINSTANCE.createConditionalAndExpression()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__LOCK_PROVIDER,
                ExpressionsFactory.eINSTANCE.createInclusiveOrExpression()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__LOCK_PROVIDER,
                ExpressionsFactory.eINSTANCE.createExclusiveOrExpression()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__LOCK_PROVIDER,
                ExpressionsFactory.eINSTANCE.createAndExpression()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__LOCK_PROVIDER,
                ExpressionsFactory.eINSTANCE.createEqualityExpression()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__LOCK_PROVIDER,
                ExpressionsFactory.eINSTANCE.createInstanceOfExpression()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__LOCK_PROVIDER,
                ExpressionsFactory.eINSTANCE.createRelationExpression()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__LOCK_PROVIDER,
                ExpressionsFactory.eINSTANCE.createShiftExpression()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__LOCK_PROVIDER,
                ExpressionsFactory.eINSTANCE.createAdditiveExpression()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__LOCK_PROVIDER,
                ExpressionsFactory.eINSTANCE.createMultiplicativeExpression()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__LOCK_PROVIDER,
                ExpressionsFactory.eINSTANCE.createUnaryExpression()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__LOCK_PROVIDER,
                ExpressionsFactory.eINSTANCE.createPrefixUnaryModificationExpression()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__LOCK_PROVIDER,
                ExpressionsFactory.eINSTANCE.createSuffixUnaryModificationExpression()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__LOCK_PROVIDER,
                ExpressionsFactory.eINSTANCE.createCastExpression()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__LOCK_PROVIDER,
                ExpressionsFactory.eINSTANCE.createNestedExpression()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__LOCK_PROVIDER,
                InstantiationsFactory.eINSTANCE.createNewConstructorCall()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__LOCK_PROVIDER,
                InstantiationsFactory.eINSTANCE.createExplicitConstructorCall()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__LOCK_PROVIDER,
                LiteralsFactory.eINSTANCE.createBooleanLiteral()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__LOCK_PROVIDER,
                LiteralsFactory.eINSTANCE.createCharacterLiteral()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__LOCK_PROVIDER,
                LiteralsFactory.eINSTANCE.createDecimalFloatLiteral()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__LOCK_PROVIDER,
                LiteralsFactory.eINSTANCE.createHexFloatLiteral()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__LOCK_PROVIDER,
                LiteralsFactory.eINSTANCE.createDecimalDoubleLiteral()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__LOCK_PROVIDER,
                LiteralsFactory.eINSTANCE.createHexDoubleLiteral()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__LOCK_PROVIDER,
                LiteralsFactory.eINSTANCE.createDecimalIntegerLiteral()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__LOCK_PROVIDER,
                LiteralsFactory.eINSTANCE.createHexIntegerLiteral()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__LOCK_PROVIDER,
                LiteralsFactory.eINSTANCE.createOctalIntegerLiteral()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__LOCK_PROVIDER,
                LiteralsFactory.eINSTANCE.createDecimalLongLiteral()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__LOCK_PROVIDER,
                LiteralsFactory.eINSTANCE.createHexLongLiteral()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__LOCK_PROVIDER,
                LiteralsFactory.eINSTANCE.createOctalLongLiteral()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__LOCK_PROVIDER,
                LiteralsFactory.eINSTANCE.createNullLiteral()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__LOCK_PROVIDER,
                ReferencesFactory.eINSTANCE.createIdentifierReference()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__LOCK_PROVIDER,
                ReferencesFactory.eINSTANCE.createMethodCall()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__LOCK_PROVIDER,
                ReferencesFactory.eINSTANCE.createReflectiveClassReference()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__LOCK_PROVIDER,
                ReferencesFactory.eINSTANCE.createPrimitiveTypeReference()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__LOCK_PROVIDER,
                ReferencesFactory.eINSTANCE.createStringReference()));

        newChildDescriptors.add(createChildParameter(StatementsPackage.Literals.SYNCHRONIZED_BLOCK__LOCK_PROVIDER,
                ReferencesFactory.eINSTANCE.createSelfReference()));
    }

}
