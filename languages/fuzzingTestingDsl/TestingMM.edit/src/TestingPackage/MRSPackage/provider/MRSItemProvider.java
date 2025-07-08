/**
 */
package TestingPackage.MRSPackage.provider;


import TestingPackage.MRSPackage.MRS;
import TestingPackage.MRSPackage.MRSPackageFactory;
import TestingPackage.MRSPackage.MRSPackagePackage;

import TestingPackage.provider.TestingMMEditPlugin;

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
 * This is the item provider adapter for a {@link TestingPackage.MRSPackage.MRS} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MRSItemProvider 
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
	public MRSItemProvider(AdapterFactory adapterFactory) {
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

			addLaunchFileLocationPropertyDescriptor(object);
			addLaunchDelaySecondsPropertyDescriptor(object);
			addCustomTerminateFileLocationPropertyDescriptor(object);
			addRecordFileLocationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Launch File Location feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLaunchFileLocationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MRS_launchFileLocation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MRS_launchFileLocation_feature", "_UI_MRS_type"),
				 MRSPackagePackage.Literals.MRS__LAUNCH_FILE_LOCATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Launch Delay Seconds feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLaunchDelaySecondsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MRS_launchDelaySeconds_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MRS_launchDelaySeconds_feature", "_UI_MRS_type"),
				 MRSPackagePackage.Literals.MRS__LAUNCH_DELAY_SECONDS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Custom Terminate File Location feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCustomTerminateFileLocationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MRS_customTerminateFileLocation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MRS_customTerminateFileLocation_feature", "_UI_MRS_type"),
				 MRSPackagePackage.Literals.MRS__CUSTOM_TERMINATE_FILE_LOCATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Record File Location feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRecordFileLocationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MRS_recordFileLocation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MRS_recordFileLocation_feature", "_UI_MRS_type"),
				 MRSPackagePackage.Literals.MRS__RECORD_FILE_LOCATION,
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
			childrenFeatures.add(MRSPackagePackage.Literals.MRS__VARIABLES);
			childrenFeatures.add(MRSPackagePackage.Literals.MRS__NODES);
			childrenFeatures.add(MRSPackagePackage.Literals.MRS__SIMULATOR);
			childrenFeatures.add(MRSPackagePackage.Literals.MRS__PROPERTY_TYPE);
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
	 * This returns MRS.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MRS"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((MRS)object).getLaunchFileLocation();
		return label == null || label.length() == 0 ?
			getString("_UI_MRS_type") :
			getString("_UI_MRS_type") + " " + label;
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

		switch (notification.getFeatureID(MRS.class)) {
			case MRSPackagePackage.MRS__LAUNCH_FILE_LOCATION:
			case MRSPackagePackage.MRS__LAUNCH_DELAY_SECONDS:
			case MRSPackagePackage.MRS__CUSTOM_TERMINATE_FILE_LOCATION:
			case MRSPackagePackage.MRS__RECORD_FILE_LOCATION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case MRSPackagePackage.MRS__VARIABLES:
			case MRSPackagePackage.MRS__NODES:
			case MRSPackagePackage.MRS__SIMULATOR:
			case MRSPackagePackage.MRS__PROPERTY_TYPE:
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
				(MRSPackagePackage.Literals.MRS__VARIABLES,
				 MRSPackageFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(MRSPackagePackage.Literals.MRS__NODES,
				 MRSPackageFactory.eINSTANCE.createNode()));

		newChildDescriptors.add
			(createChildParameter
				(MRSPackagePackage.Literals.MRS__SIMULATOR,
				 MRSPackageFactory.eINSTANCE.createROSSimulator()));

		newChildDescriptors.add
			(createChildParameter
				(MRSPackagePackage.Literals.MRS__SIMULATOR,
				 MRSPackageFactory.eINSTANCE.createMOOSSimulator()));

		newChildDescriptors.add
			(createChildParameter
				(MRSPackagePackage.Literals.MRS__SIMULATOR,
				 MRSPackageFactory.eINSTANCE.createTTSSimulator()));

		newChildDescriptors.add
			(createChildParameter
				(MRSPackagePackage.Literals.MRS__PROPERTY_TYPE,
				 MRSPackageFactory.eINSTANCE.createType()));
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
