/**
 */
package pcs.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import pcs.Deployment;
import pcs.PcsFactory;
import pcs.PcsPackage;

/**
 * This is the item provider adapter for a {@link pcs.Deployment} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DeploymentItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(PcsPackage.Literals.DEPLOYMENT__ENVIRONMENT);
			childrenFeatures.add(PcsPackage.Literals.DEPLOYMENT__SNAPSHOT_POLICY);
			childrenFeatures.add(PcsPackage.Literals.DEPLOYMENT__PCS);
			childrenFeatures.add(PcsPackage.Literals.DEPLOYMENT__AWSCONFIGURATION);
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
	 * This returns Deployment.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Deployment"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Deployment)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Deployment_type") :
			getString("_UI_Deployment_type") + " " + label;
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

		switch (notification.getFeatureID(Deployment.class)) {
			case PcsPackage.DEPLOYMENT__ENVIRONMENT:
			case PcsPackage.DEPLOYMENT__SNAPSHOT_POLICY:
			case PcsPackage.DEPLOYMENT__PCS:
			case PcsPackage.DEPLOYMENT__AWSCONFIGURATION:
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
				(PcsPackage.Literals.DEPLOYMENT__ENVIRONMENT,
				 PcsFactory.eINSTANCE.createEnvironment()));

		newChildDescriptors.add
			(createChildParameter
				(PcsPackage.Literals.DEPLOYMENT__SNAPSHOT_POLICY,
				 PcsFactory.eINSTANCE.createSnapshotPolicy()));

		newChildDescriptors.add
			(createChildParameter
				(PcsPackage.Literals.DEPLOYMENT__PCS,
				 PcsFactory.eINSTANCE.createSnapMirror()));

		newChildDescriptors.add
			(createChildParameter
				(PcsPackage.Literals.DEPLOYMENT__PCS,
				 PcsFactory.eINSTANCE.createReplicationPolicy()));

		newChildDescriptors.add
			(createChildParameter
				(PcsPackage.Literals.DEPLOYMENT__PCS,
				 PcsFactory.eINSTANCE.createCloudTiering()));

		newChildDescriptors.add
			(createChildParameter
				(PcsPackage.Literals.DEPLOYMENT__PCS,
				 PcsFactory.eINSTANCE.createCloudBackup()));

		newChildDescriptors.add
			(createChildParameter
				(PcsPackage.Literals.DEPLOYMENT__PCS,
				 PcsFactory.eINSTANCE.createCVO()));

		newChildDescriptors.add
			(createChildParameter
				(PcsPackage.Literals.DEPLOYMENT__PCS,
				 PcsFactory.eINSTANCE.createCVO_HA()));

		newChildDescriptors.add
			(createChildParameter
				(PcsPackage.Literals.DEPLOYMENT__AWSCONFIGURATION,
				 PcsFactory.eINSTANCE.createAWSNetworking()));

		newChildDescriptors.add
			(createChildParameter
				(PcsPackage.Literals.DEPLOYMENT__AWSCONFIGURATION,
				 PcsFactory.eINSTANCE.createAWSNetworkingHA()));
	}

}
