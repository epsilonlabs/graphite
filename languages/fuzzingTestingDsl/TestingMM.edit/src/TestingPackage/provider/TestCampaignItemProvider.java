/**
 */
package TestingPackage.provider;


import TestingPackage.TestCampaign;
import TestingPackage.TestingMMFactory;
import TestingPackage.TestingMMPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link TestingPackage.TestCampaign} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TestCampaignItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestCampaignItemProvider(AdapterFactory adapterFactory) {
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
			addMetricsPropertyDescriptor(object);
			addConditionMetricsPropertyDescriptor(object);
			addIncludedOperationsPropertyDescriptor(object);
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
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TestCampaign_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TestCampaign_name_feature", "_UI_TestCampaign_type"),
				 TestingMMPackage.Literals.TEST_CAMPAIGN__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Metrics feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMetricsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TestCampaign_metrics_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TestCampaign_metrics_feature", "_UI_TestCampaign_type"),
				 TestingMMPackage.Literals.TEST_CAMPAIGN__METRICS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Condition Metrics feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConditionMetricsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TestCampaign_conditionMetrics_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TestCampaign_conditionMetrics_feature", "_UI_TestCampaign_type"),
				 TestingMMPackage.Literals.TEST_CAMPAIGN__CONDITION_METRICS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Included Operations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncludedOperationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TestCampaign_includedOperations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TestCampaign_includedOperations_feature", "_UI_TestCampaign_type"),
				 TestingMMPackage.Literals.TEST_CAMPAIGN__INCLUDED_OPERATIONS,
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(TestingMMPackage.Literals.TEST_CAMPAIGN__ACTIVATION_GENERATION);
			childrenFeatures.add(TestingMMPackage.Literals.TEST_CAMPAIGN__APPROACH);
			childrenFeatures.add(TestingMMPackage.Literals.TEST_CAMPAIGN__PERFORMED_TESTS);
			childrenFeatures.add(TestingMMPackage.Literals.TEST_CAMPAIGN__RESULT_SETS);
			childrenFeatures.add(TestingMMPackage.Literals.TEST_CAMPAIGN__END_TRIGGER);
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
	 * This returns TestCampaign.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TestCampaign"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TestCampaign)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_TestCampaign_type") :
			getString("_UI_TestCampaign_type") + " " + label;
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

		switch (notification.getFeatureID(TestCampaign.class)) {
			case TestingMMPackage.TEST_CAMPAIGN__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case TestingMMPackage.TEST_CAMPAIGN__ACTIVATION_GENERATION:
			case TestingMMPackage.TEST_CAMPAIGN__APPROACH:
			case TestingMMPackage.TEST_CAMPAIGN__PERFORMED_TESTS:
			case TestingMMPackage.TEST_CAMPAIGN__RESULT_SETS:
			case TestingMMPackage.TEST_CAMPAIGN__END_TRIGGER:
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
				(TestingMMPackage.Literals.TEST_CAMPAIGN__ACTIVATION_GENERATION,
				 TestingMMFactory.eINSTANCE.createTimeBasedActivationGenerationMethod()));

		newChildDescriptors.add
			(createChildParameter
				(TestingMMPackage.Literals.TEST_CAMPAIGN__ACTIVATION_GENERATION,
				 TestingMMFactory.eINSTANCE.createConditionBasedActivationGenerationMethod()));

		newChildDescriptors.add
			(createChildParameter
				(TestingMMPackage.Literals.TEST_CAMPAIGN__APPROACH,
				 TestingMMFactory.eINSTANCE.createRandomTestGeneration()));

		newChildDescriptors.add
			(createChildParameter
				(TestingMMPackage.Literals.TEST_CAMPAIGN__APPROACH,
				 TestingMMFactory.eINSTANCE.createNSGAEvolutionaryAlgorithm()));

		newChildDescriptors.add
			(createChildParameter
				(TestingMMPackage.Literals.TEST_CAMPAIGN__APPROACH,
				 TestingMMFactory.eINSTANCE.createNSGAWithCoverageCells()));

		newChildDescriptors.add
			(createChildParameter
				(TestingMMPackage.Literals.TEST_CAMPAIGN__APPROACH,
				 TestingMMFactory.eINSTANCE.createRepeatedExecution()));

		newChildDescriptors.add
			(createChildParameter
				(TestingMMPackage.Literals.TEST_CAMPAIGN__PERFORMED_TESTS,
				 TestingMMFactory.eINSTANCE.createTest()));

		newChildDescriptors.add
			(createChildParameter
				(TestingMMPackage.Literals.TEST_CAMPAIGN__RESULT_SETS,
				 TestingMMFactory.eINSTANCE.createCampaignResultSet()));

		newChildDescriptors.add
			(createChildParameter
				(TestingMMPackage.Literals.TEST_CAMPAIGN__END_TRIGGER,
				 TestingMMFactory.eINSTANCE.createTimeBasedEnd()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return TestingMMEditPlugin.INSTANCE;
	}

}
