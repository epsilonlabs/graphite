/**
 */
package TestingPackage.provider;


import TestingPackage.FuzzingOperations.FuzzingOperationsFactory;

import TestingPackage.Metrics.MetricsFactory;

import TestingPackage.Test;
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
 * This is the item provider adapter for a {@link TestingPackage.Test} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TestItemProvider 
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
	public TestItemProvider(AdapterFactory adapterFactory) {
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
			addDevelopedFromPropertyDescriptor(object);
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
				 getString("_UI_Test_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Test_name_feature", "_UI_Test_type"),
				 TestingMMPackage.Literals.TEST__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Developed From feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDevelopedFromPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Test_developedFrom_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Test_developedFrom_feature", "_UI_Test_type"),
				 TestingMMPackage.Literals.TEST__DEVELOPED_FROM,
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
			childrenFeatures.add(TestingMMPackage.Literals.TEST__OPERATIONS);
			childrenFeatures.add(TestingMMPackage.Literals.TEST__METRICS);
			childrenFeatures.add(TestingMMPackage.Literals.TEST__DEBUG_FLAGS);
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
	 * This returns Test.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Test"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Test)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Test_type") :
			getString("_UI_Test_type") + " " + label;
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

		switch (notification.getFeatureID(Test.class)) {
			case TestingMMPackage.TEST__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case TestingMMPackage.TEST__OPERATIONS:
			case TestingMMPackage.TEST__METRICS:
			case TestingMMPackage.TEST__DEBUG_FLAGS:
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
				(TestingMMPackage.Literals.TEST__OPERATIONS,
				 FuzzingOperationsFactory.eINSTANCE.createOfflineFuzzingOperation()));

		newChildDescriptors.add
			(createChildParameter
				(TestingMMPackage.Literals.TEST__OPERATIONS,
				 FuzzingOperationsFactory.eINSTANCE.createCustomFuzzingOperation()));

		newChildDescriptors.add
			(createChildParameter
				(TestingMMPackage.Literals.TEST__OPERATIONS,
				 FuzzingOperationsFactory.eINSTANCE.createCustomOfflineFuzzingOperation()));

		newChildDescriptors.add
			(createChildParameter
				(TestingMMPackage.Literals.TEST__OPERATIONS,
				 FuzzingOperationsFactory.eINSTANCE.createFuzzTestingOperation()));

		newChildDescriptors.add
			(createChildParameter
				(TestingMMPackage.Literals.TEST__OPERATIONS,
				 FuzzingOperationsFactory.eINSTANCE.createComponentOperation()));

		newChildDescriptors.add
			(createChildParameter
				(TestingMMPackage.Literals.TEST__OPERATIONS,
				 FuzzingOperationsFactory.eINSTANCE.createComponentPropertyOperation()));

		newChildDescriptors.add
			(createChildParameter
				(TestingMMPackage.Literals.TEST__OPERATIONS,
				 FuzzingOperationsFactory.eINSTANCE.createComponentSubPropertyOperation()));

		newChildDescriptors.add
			(createChildParameter
				(TestingMMPackage.Literals.TEST__OPERATIONS,
				 FuzzingOperationsFactory.eINSTANCE.createVariableOperation()));

		newChildDescriptors.add
			(createChildParameter
				(TestingMMPackage.Literals.TEST__OPERATIONS,
				 FuzzingOperationsFactory.eINSTANCE.createRandomValueFuzzingOperation()));

		newChildDescriptors.add
			(createChildParameter
				(TestingMMPackage.Literals.TEST__OPERATIONS,
				 FuzzingOperationsFactory.eINSTANCE.createRandomValueFromSetOperation()));

		newChildDescriptors.add
			(createChildParameter
				(TestingMMPackage.Literals.TEST__OPERATIONS,
				 FuzzingOperationsFactory.eINSTANCE.createNetworkFuzzingOperation()));

		newChildDescriptors.add
			(createChildParameter
				(TestingMMPackage.Literals.TEST__OPERATIONS,
				 FuzzingOperationsFactory.eINSTANCE.createBlackholeNetworkOperation()));

		newChildDescriptors.add
			(createChildParameter
				(TestingMMPackage.Literals.TEST__OPERATIONS,
				 FuzzingOperationsFactory.eINSTANCE.createLatencyNetworkOperation()));

		newChildDescriptors.add
			(createChildParameter
				(TestingMMPackage.Literals.TEST__OPERATIONS,
				 FuzzingOperationsFactory.eINSTANCE.createPacketLossNetworkOperation()));

		newChildDescriptors.add
			(createChildParameter
				(TestingMMPackage.Literals.TEST__METRICS,
				 MetricsFactory.eINSTANCE.createMetricInstance()));

		newChildDescriptors.add
			(createChildParameter
				(TestingMMPackage.Literals.TEST__DEBUG_FLAGS,
				 TestingMMFactory.eINSTANCE.createPassiveMonitorOnly()));
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
