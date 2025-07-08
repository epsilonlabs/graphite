/**
 */
package TestingPackage.provider;


import TestingPackage.NSGAWithCoverageCells;
import TestingPackage.TestingMMFactory;
import TestingPackage.TestingMMPackage;

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
 * This is the item provider adapter for a {@link TestingPackage.NSGAWithCoverageCells} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NSGAWithCoverageCellsItemProvider extends NSGAEvolutionaryAlgorithmItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NSGAWithCoverageCellsItemProvider(AdapterFactory adapterFactory) {
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

			addCoveragePerCellPropertyDescriptor(object);
			addTargetCoverageProportionPropertyDescriptor(object);
			addUseMutationEnhancingCoveragePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Coverage Per Cell feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCoveragePerCellPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NSGAWithCoverageCells_coveragePerCell_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NSGAWithCoverageCells_coveragePerCell_feature", "_UI_NSGAWithCoverageCells_type"),
				 TestingMMPackage.Literals.NSGA_WITH_COVERAGE_CELLS__COVERAGE_PER_CELL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Coverage Proportion feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetCoverageProportionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NSGAWithCoverageCells_targetCoverageProportion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NSGAWithCoverageCells_targetCoverageProportion_feature", "_UI_NSGAWithCoverageCells_type"),
				 TestingMMPackage.Literals.NSGA_WITH_COVERAGE_CELLS__TARGET_COVERAGE_PROPORTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Use Mutation Enhancing Coverage feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUseMutationEnhancingCoveragePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NSGAWithCoverageCells_useMutationEnhancingCoverage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NSGAWithCoverageCells_useMutationEnhancingCoverage_feature", "_UI_NSGAWithCoverageCells_type"),
				 TestingMMPackage.Literals.NSGA_WITH_COVERAGE_CELLS__USE_MUTATION_ENHANCING_COVERAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
			childrenFeatures.add(TestingMMPackage.Literals.NSGA_WITH_COVERAGE_CELLS__DIMENSION_RECORDS);
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
	 * This returns NSGAWithCoverageCells.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/NSGAWithCoverageCells"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		NSGAWithCoverageCells nsgaWithCoverageCells = (NSGAWithCoverageCells)object;
		return getString("_UI_NSGAWithCoverageCells_type") + " " + nsgaWithCoverageCells.getPopulationSize();
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

		switch (notification.getFeatureID(NSGAWithCoverageCells.class)) {
			case TestingMMPackage.NSGA_WITH_COVERAGE_CELLS__COVERAGE_PER_CELL:
			case TestingMMPackage.NSGA_WITH_COVERAGE_CELLS__TARGET_COVERAGE_PROPORTION:
			case TestingMMPackage.NSGA_WITH_COVERAGE_CELLS__USE_MUTATION_ENHANCING_COVERAGE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case TestingMMPackage.NSGA_WITH_COVERAGE_CELLS__DIMENSION_RECORDS:
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
				(TestingMMPackage.Literals.NSGA_WITH_COVERAGE_CELLS__DIMENSION_RECORDS,
				 TestingMMFactory.eINSTANCE.createDimensionInterval()));
	}

}
