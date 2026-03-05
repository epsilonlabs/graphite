/**
 */
package flow.provider;


import flow.FlowFactory;
import flow.FlowPackage;

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
 * This is the item provider adapter for a {@link flow.System} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemItemProvider extends PoweredItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemItemProvider(AdapterFactory adapterFactory) {
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

			addStatusPropertyDescriptor(object);
			addUsagePropertyDescriptor(object);
			addOutgoingFlowsPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addTemperaturePropertyDescriptor(object);
			addWeightPropertyDescriptor(object);
			addRoutingRulesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FlowElement_status_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FlowElement_status_feature", "_UI_FlowElement_type"),
				 FlowPackage.Literals.FLOW_ELEMENT__STATUS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Usage feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUsagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FlowElement_usage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FlowElement_usage_feature", "_UI_FlowElement_type"),
				 FlowPackage.Literals.FLOW_ELEMENT__USAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Outgoing Flows feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutgoingFlowsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FlowSource_outgoingFlows_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FlowSource_outgoingFlows_feature", "_UI_FlowSource_type"),
				 FlowPackage.Literals.FLOW_SOURCE__OUTGOING_FLOWS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
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
				 getString("_UI_Named_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Named_name_feature", "_UI_Named_type"),
				 FlowPackage.Literals.NAMED__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Temperature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTemperaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_System_temperature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_System_temperature_feature", "_UI_System_type"),
				 FlowPackage.Literals.SYSTEM__TEMPERATURE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Weight feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWeightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_System_weight_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_System_weight_feature", "_UI_System_type"),
				 FlowPackage.Literals.SYSTEM__WEIGHT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Routing Rules feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRoutingRulesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_System_routingRules_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_System_routingRules_feature", "_UI_System_type"),
				 FlowPackage.Literals.SYSTEM__ROUTING_RULES,
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
			childrenFeatures.add(FlowPackage.Literals.FLOW_SOURCE__OUTGOING_FLOWS);
			childrenFeatures.add(FlowPackage.Literals.SYSTEM__ELEMENTS);
			childrenFeatures.add(FlowPackage.Literals.SYSTEM__POWER_OUTPUTS);
			childrenFeatures.add(FlowPackage.Literals.SYSTEM__POWER_INPUTS);
			childrenFeatures.add(FlowPackage.Literals.SYSTEM__ROUTING_RULES_LIST);
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
	 * This returns System.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/System"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((flow.System)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_System_type") :
			getString("_UI_System_type") + " " + label;
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

		switch (notification.getFeatureID(flow.System.class)) {
			case FlowPackage.SYSTEM__STATUS:
			case FlowPackage.SYSTEM__USAGE:
			case FlowPackage.SYSTEM__NAME:
			case FlowPackage.SYSTEM__TEMPERATURE:
			case FlowPackage.SYSTEM__WEIGHT:
			case FlowPackage.SYSTEM__ROUTING_RULES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case FlowPackage.SYSTEM__OUTGOING_FLOWS:
			case FlowPackage.SYSTEM__ELEMENTS:
			case FlowPackage.SYSTEM__POWER_OUTPUTS:
			case FlowPackage.SYSTEM__POWER_INPUTS:
			case FlowPackage.SYSTEM__ROUTING_RULES_LIST:
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
				(FlowPackage.Literals.FLOW_SOURCE__OUTGOING_FLOWS,
				 FlowFactory.eINSTANCE.createDataFlow()));

		newChildDescriptors.add
			(createChildParameter
				(FlowPackage.Literals.SYSTEM__ELEMENTS,
				 FlowFactory.eINSTANCE.createFan()));

		newChildDescriptors.add
			(createChildParameter
				(FlowPackage.Literals.SYSTEM__ELEMENTS,
				 FlowFactory.eINSTANCE.createSystem()));

		newChildDescriptors.add
			(createChildParameter
				(FlowPackage.Literals.SYSTEM__ELEMENTS,
				 FlowFactory.eINSTANCE.createCompositeProcessor()));

		newChildDescriptors.add
			(createChildParameter
				(FlowPackage.Literals.SYSTEM__ELEMENTS,
				 FlowFactory.eINSTANCE.createDataFlow()));

		newChildDescriptors.add
			(createChildParameter
				(FlowPackage.Literals.SYSTEM__ELEMENTS,
				 FlowFactory.eINSTANCE.createProcessor()));

		newChildDescriptors.add
			(createChildParameter
				(FlowPackage.Literals.SYSTEM__ELEMENTS,
				 FlowFactory.eINSTANCE.createDataSource()));

		newChildDescriptors.add
			(createChildParameter
				(FlowPackage.Literals.SYSTEM__POWER_OUTPUTS,
				 FlowFactory.eINSTANCE.createPowerOutput()));

		newChildDescriptors.add
			(createChildParameter
				(FlowPackage.Literals.SYSTEM__POWER_INPUTS,
				 FlowFactory.eINSTANCE.createPowerInput()));

		newChildDescriptors.add
			(createChildParameter
				(FlowPackage.Literals.SYSTEM__ROUTING_RULES_LIST,
				 FlowFactory.eINSTANCE.createRoutingRule()));
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
			childFeature == FlowPackage.Literals.FLOW_SOURCE__OUTGOING_FLOWS ||
			childFeature == FlowPackage.Literals.SYSTEM__ELEMENTS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
