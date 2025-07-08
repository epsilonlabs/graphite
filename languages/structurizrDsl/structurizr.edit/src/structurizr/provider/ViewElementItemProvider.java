/**
 */
package structurizr.provider;


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

import structurizr.StructurizrFactory;
import structurizr.StructurizrPackage;
import structurizr.ViewElement;

/**
 * This is the item provider adapter for a {@link structurizr.ViewElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ViewElementItemProvider 
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
	public ViewElementItemProvider(AdapterFactory adapterFactory) {
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

			addKeyPropertyDescriptor(object);
			addTitlePropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addIncludeExpressionPropertyDescriptor(object);
			addExcludeExpressionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Key feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKeyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ViewElement_key_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ViewElement_key_feature", "_UI_ViewElement_type"),
				 StructurizrPackage.Literals.VIEW_ELEMENT__KEY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ViewElement_title_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ViewElement_title_feature", "_UI_ViewElement_type"),
				 StructurizrPackage.Literals.VIEW_ELEMENT__TITLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ViewElement_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ViewElement_description_feature", "_UI_ViewElement_type"),
				 StructurizrPackage.Literals.VIEW_ELEMENT__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Include Expression feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncludeExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ViewElement_includeExpression_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ViewElement_includeExpression_feature", "_UI_ViewElement_type"),
				 StructurizrPackage.Literals.VIEW_ELEMENT__INCLUDE_EXPRESSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Exclude Expression feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExcludeExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ViewElement_excludeExpression_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ViewElement_excludeExpression_feature", "_UI_ViewElement_type"),
				 StructurizrPackage.Literals.VIEW_ELEMENT__EXCLUDE_EXPRESSION,
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
			childrenFeatures.add(StructurizrPackage.Literals.VIEW_ELEMENT__AUTO_LAYOUT);
			childrenFeatures.add(StructurizrPackage.Literals.VIEW_ELEMENT__PROPERTIES);
			childrenFeatures.add(StructurizrPackage.Literals.VIEW_ELEMENT__INCLUDE);
			childrenFeatures.add(StructurizrPackage.Literals.VIEW_ELEMENT__EXCLUDE);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ViewElement)object).getKey();
		return label == null || label.length() == 0 ?
			getString("_UI_ViewElement_type") :
			getString("_UI_ViewElement_type") + " " + label;
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

		switch (notification.getFeatureID(ViewElement.class)) {
			case StructurizrPackage.VIEW_ELEMENT__KEY:
			case StructurizrPackage.VIEW_ELEMENT__TITLE:
			case StructurizrPackage.VIEW_ELEMENT__DESCRIPTION:
			case StructurizrPackage.VIEW_ELEMENT__INCLUDE_EXPRESSION:
			case StructurizrPackage.VIEW_ELEMENT__EXCLUDE_EXPRESSION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case StructurizrPackage.VIEW_ELEMENT__AUTO_LAYOUT:
			case StructurizrPackage.VIEW_ELEMENT__PROPERTIES:
			case StructurizrPackage.VIEW_ELEMENT__INCLUDE:
			case StructurizrPackage.VIEW_ELEMENT__EXCLUDE:
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
				(StructurizrPackage.Literals.VIEW_ELEMENT__AUTO_LAYOUT,
				 StructurizrFactory.eINSTANCE.createAutoLayout()));

		newChildDescriptors.add
			(createChildParameter
				(StructurizrPackage.Literals.VIEW_ELEMENT__PROPERTIES,
				 StructurizrFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(StructurizrPackage.Literals.VIEW_ELEMENT__INCLUDE,
				 StructurizrFactory.eINSTANCE.createNoFilterCondition()));

		newChildDescriptors.add
			(createChildParameter
				(StructurizrPackage.Literals.VIEW_ELEMENT__INCLUDE,
				 StructurizrFactory.eINSTANCE.createCompositeCondition()));

		newChildDescriptors.add
			(createChildParameter
				(StructurizrPackage.Literals.VIEW_ELEMENT__INCLUDE,
				 StructurizrFactory.eINSTANCE.createElementTagCondition()));

		newChildDescriptors.add
			(createChildParameter
				(StructurizrPackage.Literals.VIEW_ELEMENT__INCLUDE,
				 StructurizrFactory.eINSTANCE.createElementTechnologyCondition()));

		newChildDescriptors.add
			(createChildParameter
				(StructurizrPackage.Literals.VIEW_ELEMENT__INCLUDE,
				 StructurizrFactory.eINSTANCE.createElementTypeCondition()));

		newChildDescriptors.add
			(createChildParameter
				(StructurizrPackage.Literals.VIEW_ELEMENT__INCLUDE,
				 StructurizrFactory.eINSTANCE.createElementPropertyCondition()));

		newChildDescriptors.add
			(createChildParameter
				(StructurizrPackage.Literals.VIEW_ELEMENT__INCLUDE,
				 StructurizrFactory.eINSTANCE.createElementParentCondition()));

		newChildDescriptors.add
			(createChildParameter
				(StructurizrPackage.Literals.VIEW_ELEMENT__INCLUDE,
				 StructurizrFactory.eINSTANCE.createRelationshipTagCondition()));

		newChildDescriptors.add
			(createChildParameter
				(StructurizrPackage.Literals.VIEW_ELEMENT__INCLUDE,
				 StructurizrFactory.eINSTANCE.createRelationshipPropertyCondition()));

		newChildDescriptors.add
			(createChildParameter
				(StructurizrPackage.Literals.VIEW_ELEMENT__INCLUDE,
				 StructurizrFactory.eINSTANCE.createRelationshipSourceCondition()));

		newChildDescriptors.add
			(createChildParameter
				(StructurizrPackage.Literals.VIEW_ELEMENT__INCLUDE,
				 StructurizrFactory.eINSTANCE.createRelationshipDestinationCondition()));

		newChildDescriptors.add
			(createChildParameter
				(StructurizrPackage.Literals.VIEW_ELEMENT__EXCLUDE,
				 StructurizrFactory.eINSTANCE.createNoFilterCondition()));

		newChildDescriptors.add
			(createChildParameter
				(StructurizrPackage.Literals.VIEW_ELEMENT__EXCLUDE,
				 StructurizrFactory.eINSTANCE.createCompositeCondition()));

		newChildDescriptors.add
			(createChildParameter
				(StructurizrPackage.Literals.VIEW_ELEMENT__EXCLUDE,
				 StructurizrFactory.eINSTANCE.createElementTagCondition()));

		newChildDescriptors.add
			(createChildParameter
				(StructurizrPackage.Literals.VIEW_ELEMENT__EXCLUDE,
				 StructurizrFactory.eINSTANCE.createElementTechnologyCondition()));

		newChildDescriptors.add
			(createChildParameter
				(StructurizrPackage.Literals.VIEW_ELEMENT__EXCLUDE,
				 StructurizrFactory.eINSTANCE.createElementTypeCondition()));

		newChildDescriptors.add
			(createChildParameter
				(StructurizrPackage.Literals.VIEW_ELEMENT__EXCLUDE,
				 StructurizrFactory.eINSTANCE.createElementPropertyCondition()));

		newChildDescriptors.add
			(createChildParameter
				(StructurizrPackage.Literals.VIEW_ELEMENT__EXCLUDE,
				 StructurizrFactory.eINSTANCE.createElementParentCondition()));

		newChildDescriptors.add
			(createChildParameter
				(StructurizrPackage.Literals.VIEW_ELEMENT__EXCLUDE,
				 StructurizrFactory.eINSTANCE.createRelationshipTagCondition()));

		newChildDescriptors.add
			(createChildParameter
				(StructurizrPackage.Literals.VIEW_ELEMENT__EXCLUDE,
				 StructurizrFactory.eINSTANCE.createRelationshipPropertyCondition()));

		newChildDescriptors.add
			(createChildParameter
				(StructurizrPackage.Literals.VIEW_ELEMENT__EXCLUDE,
				 StructurizrFactory.eINSTANCE.createRelationshipSourceCondition()));

		newChildDescriptors.add
			(createChildParameter
				(StructurizrPackage.Literals.VIEW_ELEMENT__EXCLUDE,
				 StructurizrFactory.eINSTANCE.createRelationshipDestinationCondition()));
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
			childFeature == StructurizrPackage.Literals.VIEW_ELEMENT__INCLUDE ||
			childFeature == StructurizrPackage.Literals.VIEW_ELEMENT__EXCLUDE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return StructurizrEditPlugin.INSTANCE;
	}

}
