/**
 */
package structurizr.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import structurizr.DeploymentNode;
import structurizr.StructurizrFactory;
import structurizr.StructurizrPackage;

/**
 * This is the item provider adapter for a {@link structurizr.DeploymentNode} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DeploymentNodeItemProvider extends C4ElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentNodeItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(StructurizrPackage.Literals.DEPLOYMENT_NODE__TECHNOLOGY);
			childrenFeatures.add(StructurizrPackage.Literals.DEPLOYMENT_NODE__DEPLOYMENT_NODES);
			childrenFeatures.add(StructurizrPackage.Literals.DEPLOYMENT_NODE__INFRASTRUCTURE_NODES);
			childrenFeatures.add(StructurizrPackage.Literals.DEPLOYMENT_NODE__SOFTWARE_SYSTEM_INSTANCES);
			childrenFeatures.add(StructurizrPackage.Literals.DEPLOYMENT_NODE__CONTAINER_INSTANCES);
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
	 * This returns DeploymentNode.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DeploymentNode"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DeploymentNode)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_DeploymentNode_type") :
			getString("_UI_DeploymentNode_type") + " " + label;
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

		switch (notification.getFeatureID(DeploymentNode.class)) {
			case StructurizrPackage.DEPLOYMENT_NODE__TECHNOLOGY:
			case StructurizrPackage.DEPLOYMENT_NODE__DEPLOYMENT_NODES:
			case StructurizrPackage.DEPLOYMENT_NODE__INFRASTRUCTURE_NODES:
			case StructurizrPackage.DEPLOYMENT_NODE__SOFTWARE_SYSTEM_INSTANCES:
			case StructurizrPackage.DEPLOYMENT_NODE__CONTAINER_INSTANCES:
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
				(StructurizrPackage.Literals.DEPLOYMENT_NODE__TECHNOLOGY,
				 StructurizrFactory.eINSTANCE.createTechnology()));

		newChildDescriptors.add
			(createChildParameter
				(StructurizrPackage.Literals.DEPLOYMENT_NODE__DEPLOYMENT_NODES,
				 StructurizrFactory.eINSTANCE.createDeploymentNode()));

		newChildDescriptors.add
			(createChildParameter
				(StructurizrPackage.Literals.DEPLOYMENT_NODE__INFRASTRUCTURE_NODES,
				 StructurizrFactory.eINSTANCE.createInfrastructureNode()));

		newChildDescriptors.add
			(createChildParameter
				(StructurizrPackage.Literals.DEPLOYMENT_NODE__SOFTWARE_SYSTEM_INSTANCES,
				 StructurizrFactory.eINSTANCE.createSoftwareSystemInstance()));

		newChildDescriptors.add
			(createChildParameter
				(StructurizrPackage.Literals.DEPLOYMENT_NODE__CONTAINER_INSTANCES,
				 StructurizrFactory.eINSTANCE.createContainerInstance()));
	}

}
