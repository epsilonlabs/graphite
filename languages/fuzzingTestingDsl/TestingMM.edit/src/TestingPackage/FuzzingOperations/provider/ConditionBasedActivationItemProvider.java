/**
 */
package TestingPackage.FuzzingOperations.provider;


import TestingPackage.FuzzingOperations.ConditionBasedActivation;
import TestingPackage.FuzzingOperations.FuzzingOperationsPackage;

import TestingPackage.StandardGrammar.StandardGrammarFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link TestingPackage.FuzzingOperations.ConditionBasedActivation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConditionBasedActivationItemProvider extends ActivationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionBasedActivationItemProvider(AdapterFactory adapterFactory) {
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

			addMaximumActivationsPropertyDescriptor(object);
			addStartingExpressionPropertyDescriptor(object);
			addEndingExpressionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Maximum Activations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaximumActivationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConditionBasedActivation_maximumActivations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConditionBasedActivation_maximumActivations_feature", "_UI_ConditionBasedActivation_type"),
				 FuzzingOperationsPackage.Literals.CONDITION_BASED_ACTIVATION__MAXIMUM_ACTIVATIONS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Starting Expression feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStartingExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConditionBasedActivation_startingExpression_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConditionBasedActivation_startingExpression_feature", "_UI_ConditionBasedActivation_type"),
				 FuzzingOperationsPackage.Literals.CONDITION_BASED_ACTIVATION__STARTING_EXPRESSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ending Expression feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEndingExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConditionBasedActivation_endingExpression_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConditionBasedActivation_endingExpression_feature", "_UI_ConditionBasedActivation_type"),
				 FuzzingOperationsPackage.Literals.CONDITION_BASED_ACTIVATION__ENDING_EXPRESSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
			childrenFeatures.add(FuzzingOperationsPackage.Literals.CONDITION_BASED_ACTIVATION__STARTING);
			childrenFeatures.add(FuzzingOperationsPackage.Literals.CONDITION_BASED_ACTIVATION__ENDING);
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
	 * This returns ConditionBasedActivation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ConditionBasedActivation"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		ConditionBasedActivation conditionBasedActivation = (ConditionBasedActivation)object;
		return getString("_UI_ConditionBasedActivation_type") + " " + conditionBasedActivation.getMaximumActivations();
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

		switch (notification.getFeatureID(ConditionBasedActivation.class)) {
			case FuzzingOperationsPackage.CONDITION_BASED_ACTIVATION__MAXIMUM_ACTIVATIONS:
			case FuzzingOperationsPackage.CONDITION_BASED_ACTIVATION__STARTING_EXPRESSION:
			case FuzzingOperationsPackage.CONDITION_BASED_ACTIVATION__ENDING_EXPRESSION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case FuzzingOperationsPackage.CONDITION_BASED_ACTIVATION__STARTING:
			case FuzzingOperationsPackage.CONDITION_BASED_ACTIVATION__ENDING:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
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

		newChildDescriptors.add
			(createChildParameter
				(FuzzingOperationsPackage.Literals.CONDITION_BASED_ACTIVATION__STARTING,
				 StandardGrammarFactory.eINSTANCE.createCondition()));

		newChildDescriptors.add
			(createChildParameter
				(FuzzingOperationsPackage.Literals.CONDITION_BASED_ACTIVATION__ENDING,
				 StandardGrammarFactory.eINSTANCE.createCondition()));
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

		boolean qualify =
			childFeature == FuzzingOperationsPackage.Literals.CONDITION_BASED_ACTIVATION__STARTING ||
			childFeature == FuzzingOperationsPackage.Literals.CONDITION_BASED_ACTIVATION__ENDING;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
