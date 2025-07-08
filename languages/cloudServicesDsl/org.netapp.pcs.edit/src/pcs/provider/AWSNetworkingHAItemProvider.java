/**
 */
package pcs.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import pcs.AWSNetworkingHA;
import pcs.PcsPackage;

/**
 * This is the item provider adapter for a {@link pcs.AWSNetworkingHA} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AWSNetworkingHAItemProvider extends AWSConfigurationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AWSNetworkingHAItemProvider(AdapterFactory adapterFactory) {
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

			addCvo_haPropertyDescriptor(object);
			addNode1_subnet_idPropertyDescriptor(object);
			addNode2_subnet_idPropertyDescriptor(object);
			addFailover_modePropertyDescriptor(object);
			addMediator_subnet_idPropertyDescriptor(object);
			addMediator_key_pair_namePropertyDescriptor(object);
			addCluster_floating_ipPropertyDescriptor(object);
			addData_floating_ipPropertyDescriptor(object);
			addData_floating_ip2PropertyDescriptor(object);
			addSvm_floating_ipPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Cvo ha feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCvo_haPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AWSNetworkingHA_cvo_ha_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AWSNetworkingHA_cvo_ha_feature", "_UI_AWSNetworkingHA_type"),
				 PcsPackage.Literals.AWS_NETWORKING_HA__CVO_HA,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Node1 subnet id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNode1_subnet_idPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AWSNetworkingHA_node1_subnet_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AWSNetworkingHA_node1_subnet_id_feature", "_UI_AWSNetworkingHA_type"),
				 PcsPackage.Literals.AWS_NETWORKING_HA__NODE1_SUBNET_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Node2 subnet id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNode2_subnet_idPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AWSNetworkingHA_node2_subnet_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AWSNetworkingHA_node2_subnet_id_feature", "_UI_AWSNetworkingHA_type"),
				 PcsPackage.Literals.AWS_NETWORKING_HA__NODE2_SUBNET_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Failover mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFailover_modePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AWSNetworkingHA_failover_mode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AWSNetworkingHA_failover_mode_feature", "_UI_AWSNetworkingHA_type"),
				 PcsPackage.Literals.AWS_NETWORKING_HA__FAILOVER_MODE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mediator subnet id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMediator_subnet_idPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AWSNetworkingHA_mediator_subnet_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AWSNetworkingHA_mediator_subnet_id_feature", "_UI_AWSNetworkingHA_type"),
				 PcsPackage.Literals.AWS_NETWORKING_HA__MEDIATOR_SUBNET_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mediator key pair name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMediator_key_pair_namePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AWSNetworkingHA_mediator_key_pair_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AWSNetworkingHA_mediator_key_pair_name_feature", "_UI_AWSNetworkingHA_type"),
				 PcsPackage.Literals.AWS_NETWORKING_HA__MEDIATOR_KEY_PAIR_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cluster floating ip feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCluster_floating_ipPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AWSNetworkingHA_cluster_floating_ip_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AWSNetworkingHA_cluster_floating_ip_feature", "_UI_AWSNetworkingHA_type"),
				 PcsPackage.Literals.AWS_NETWORKING_HA__CLUSTER_FLOATING_IP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data floating ip feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addData_floating_ipPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AWSNetworkingHA_data_floating_ip_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AWSNetworkingHA_data_floating_ip_feature", "_UI_AWSNetworkingHA_type"),
				 PcsPackage.Literals.AWS_NETWORKING_HA__DATA_FLOATING_IP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data floating ip2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addData_floating_ip2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AWSNetworkingHA_data_floating_ip2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AWSNetworkingHA_data_floating_ip2_feature", "_UI_AWSNetworkingHA_type"),
				 PcsPackage.Literals.AWS_NETWORKING_HA__DATA_FLOATING_IP2,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Svm floating ip feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSvm_floating_ipPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AWSNetworkingHA_svm_floating_ip_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AWSNetworkingHA_svm_floating_ip_feature", "_UI_AWSNetworkingHA_type"),
				 PcsPackage.Literals.AWS_NETWORKING_HA__SVM_FLOATING_IP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns AWSNetworkingHA.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AWSNetworkingHA"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AWSNetworkingHA)object).getMediator_key_pair_name();
		return label == null || label.length() == 0 ?
			getString("_UI_AWSNetworkingHA_type") :
			getString("_UI_AWSNetworkingHA_type") + " " + label;
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

		switch (notification.getFeatureID(AWSNetworkingHA.class)) {
			case PcsPackage.AWS_NETWORKING_HA__NODE1_SUBNET_ID:
			case PcsPackage.AWS_NETWORKING_HA__NODE2_SUBNET_ID:
			case PcsPackage.AWS_NETWORKING_HA__FAILOVER_MODE:
			case PcsPackage.AWS_NETWORKING_HA__MEDIATOR_SUBNET_ID:
			case PcsPackage.AWS_NETWORKING_HA__MEDIATOR_KEY_PAIR_NAME:
			case PcsPackage.AWS_NETWORKING_HA__CLUSTER_FLOATING_IP:
			case PcsPackage.AWS_NETWORKING_HA__DATA_FLOATING_IP:
			case PcsPackage.AWS_NETWORKING_HA__DATA_FLOATING_IP2:
			case PcsPackage.AWS_NETWORKING_HA__SVM_FLOATING_IP:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

}
