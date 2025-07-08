package structurizr.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import graphite.shared.Settings;
import structurizr.CompositeCondition;
import structurizr.ConditionComparisonOperation;
import structurizr.ElementTagCondition;
import structurizr.ElementTypeCondition;
import structurizr.FilterType;
import structurizr.Person;
import structurizr.RelationshipDestinationCondition;
import structurizr.StructurizrFactory;
import structurizr.StructurizrPackage;
import structurizr.Tag;
import structurizr.Workspace;
import structurizr.impl.StructurizrFactoryImpl;
import structurizr.impl.XtextContainerViewImpl;

import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;


public class ModifyingDerivedElementsTests {
	
	private EmfModel model;
	private Workspace workspace;
	
	@Before
	public void setup() throws Exception {
		Settings.setMergeDerivedModelElements(false);
 		model = new EmfModel();
 		model.setMetamodelUris((Arrays.asList(StructurizrPackage.eINSTANCE.getNsURI()))); 		
 		model.setModelFile(new File(TestsData.MODEL).getAbsolutePath());
 		model.setReadOnLoad(true);
 		model.setStoredOnDisposal(false);
 		model.load();
 		workspace = (Workspace)model.getResource().getContents().get(0);
	}
	
	@After
	public void teardown() {
	    if (model != null) {
	    	model.getResource().unload();
	    }
	}
	
	@Test
	public void changeElementReferenceValue() {
		assertTrue("First view is XtextContainerViewImpl", workspace.getViews().getViewElements().get(0) instanceof XtextContainerViewImpl);
		XtextContainerViewImpl containerView = (XtextContainerViewImpl) workspace.getViews().getViewElements().get(0);
		assertEquals("ContainerView has the initial expected exclude", "{(relationship.destination==psql) && {(element.tag==personOptional) || {(relationship.source!=twx) && }}}", containerView.getExcludeExpression());
		assertTrue("Exclude condition is CompositeCondition", containerView.getExclude() instanceof CompositeCondition);
		assertTrue("Left element of Exclude condition is RelationshipDestinationCondition", ((CompositeCondition)containerView.getExclude()).getLeft() instanceof RelationshipDestinationCondition);
		Person person = workspace.getModel().getPersons().get(0);
		RelationshipDestinationCondition relationshipDestinationCondition = (RelationshipDestinationCondition)((CompositeCondition)containerView.getExclude()).getLeft();
		relationshipDestinationCondition.setDestination(person);
		assertEquals("ContainerView has the final expected exclude", "{ ( relationship . destination ==p1 ) && { ( element . tag ==personOptional ) || { ( relationship . source !=twx ) && } } }", containerView.getExcludeExpression());
	}
	
	@Test
	public void changeElementLiteralValue() {
		assertTrue("First view is XtextContainerViewImpl", workspace.getViews().getViewElements().get(0) instanceof XtextContainerViewImpl);
		XtextContainerViewImpl containerView = (XtextContainerViewImpl) workspace.getViews().getViewElements().get(0);
		assertEquals("ContainerView has the initial expected exclude", "{(relationship.destination==psql) && {(element.tag==personOptional) || {(relationship.source!=twx) && }}}", containerView.getExcludeExpression());
		assertTrue("Exclude condition is CompositeCondition", containerView.getExclude() instanceof CompositeCondition);
		assertTrue("Left element of Exclude condition is RelationshipDestinationCondition", ((CompositeCondition)containerView.getExclude()).getLeft() instanceof RelationshipDestinationCondition);
		RelationshipDestinationCondition relationshipDestinationCondition = (RelationshipDestinationCondition)((CompositeCondition)containerView.getExclude()).getLeft();
		relationshipDestinationCondition.setComparisonOperation(ConditionComparisonOperation.NOT_EQUALS);
		assertEquals("ContainerView has the final expected exclude", "{ ( relationship . destination !=psql ) && { ( element . tag ==personOptional ) || { ( relationship . source !=twx ) && } } }", containerView.getExcludeExpression());	
	}
	
	@Test
	public void setReferenceToNull() {
		assertTrue("First view is XtextContainerViewImpl", workspace.getViews().getViewElements().get(0) instanceof XtextContainerViewImpl);
		XtextContainerViewImpl containerView = (XtextContainerViewImpl) workspace.getViews().getViewElements().get(0);
		assertEquals("ContainerView has the initial expected exclude", "{(relationship.destination==psql) && {(element.tag==personOptional) || {(relationship.source!=twx) && }}}", containerView.getExcludeExpression());
		assertTrue("Exclude condition is CompositeCondition", containerView.getExclude() instanceof CompositeCondition);
		assertTrue("Left element of Exclude condition is RelationshipDestinationCondition", ((CompositeCondition)containerView.getExclude()).getLeft() instanceof RelationshipDestinationCondition);
		RelationshipDestinationCondition relationshipDestinationCondition = (RelationshipDestinationCondition)((CompositeCondition)containerView.getExclude()).getLeft();
		relationshipDestinationCondition.setDestination(null);
		assertEquals("ContainerView has the final expected exclude", "{ ( relationship . destination == ) && { ( element . tag ==personOptional ) || { ( relationship . source !=twx ) && } } }", containerView.getExcludeExpression());	
	}
		
	@Test
	public void removeFromReferencesList() {
		assertTrue("First view is XtextContainerViewImpl", workspace.getViews().getViewElements().get(0) instanceof XtextContainerViewImpl);
		XtextContainerViewImpl containerView = (XtextContainerViewImpl) workspace.getViews().getViewElements().get(0);
		assertEquals("ContainerView has the initial expected exclude", "{(relationship.destination==psql) && {(element.tag==personOptional) || {(relationship.source!=twx) && }}}", containerView.getExcludeExpression());
		assertTrue("Exclude condition is CompositeCondition", containerView.getExclude() instanceof CompositeCondition);
		assertTrue("Right element of Exclude condition is CompositeCondition", ((CompositeCondition)containerView.getExclude()).getRight() instanceof CompositeCondition);
		CompositeCondition compositeCondition = (CompositeCondition)((CompositeCondition)containerView.getExclude()).getRight();
		assertTrue("Left element of CompositeCondition is ElementTagCondition", compositeCondition.getLeft() instanceof ElementTagCondition);		
		((ElementTagCondition)compositeCondition.getLeft()).getTags().remove(0);
		assertEquals("ContainerView has the final expected exclude", "{ ( relationship . destination ==psql ) && { ( element . tag == ) || { ( relationship . source !=twx ) && } } }", containerView.getExcludeExpression());
	}
	
	@Test
	public void addToReferencesList() {
		assertTrue("First view is XtextContainerViewImpl", workspace.getViews().getViewElements().get(0) instanceof XtextContainerViewImpl);
		XtextContainerViewImpl containerView = (XtextContainerViewImpl) workspace.getViews().getViewElements().get(0);
		assertEquals("ContainerView has the initial expected exclude", "{(relationship.destination==psql) && {(element.tag==personOptional) || {(relationship.source!=twx) && }}}", containerView.getExcludeExpression());
		assertTrue("Exclude condition is CompositeCondition", containerView.getExclude() instanceof CompositeCondition);
		assertTrue("Right element of Exclude condition is CompositeCondition", ((CompositeCondition)containerView.getExclude()).getRight() instanceof CompositeCondition);
		CompositeCondition compositeCondition = (CompositeCondition)((CompositeCondition)containerView.getExclude()).getRight();
		assertTrue("Left element of CompositeCondition is ElementTagCondition", compositeCondition.getLeft() instanceof ElementTagCondition);		
		Tag tag = workspace.getModel().getPersons().get(0).getTags().get(0);
		((ElementTagCondition)compositeCondition.getLeft()).getTags().add(tag);
		assertEquals("ContainerView has the final expected exclude", "{ ( relationship . destination ==psql ) && { ( element . tag ==personOptional , personMain ) || { ( relationship . source !=twx ) && } } }", containerView.getExcludeExpression());
	}

	@Test
	public void deleteElement() {
		assertTrue("First view is XtextContainerViewImpl", workspace.getViews().getViewElements().get(0) instanceof XtextContainerViewImpl);
		XtextContainerViewImpl containerView = (XtextContainerViewImpl) workspace.getViews().getViewElements().get(0);
		assertEquals("ContainerView has the initial expected exclude", "{(relationship.destination==psql) && {(element.tag==personOptional) || {(relationship.source!=twx) && }}}", containerView.getExcludeExpression());
		assertTrue("Exclude condition is CompositeCondition", containerView.getExclude() instanceof CompositeCondition);
		assertTrue("Left element of Exclude condition is RelationshipDestinationCondition", ((CompositeCondition)containerView.getExclude()).getLeft() instanceof RelationshipDestinationCondition);
		RelationshipDestinationCondition relationshipDestinationCondition = (RelationshipDestinationCondition)((CompositeCondition)containerView.getExclude()).getLeft();
		try {
			model.deleteElement(relationshipDestinationCondition);
		} catch (EolRuntimeException e) {
			e.printStackTrace();
		}
		assertEquals("ContainerView has the final expected exclude", "{ && { ( element . tag ==personOptional ) || { ( relationship . source !=twx ) && } } }", containerView.getExcludeExpression());
	}
	
	@Test
	public void deleteInnerElement() {
		assertTrue("First view is XtextContainerViewImpl", workspace.getViews().getViewElements().get(0) instanceof XtextContainerViewImpl);
		XtextContainerViewImpl containerView = (XtextContainerViewImpl) workspace.getViews().getViewElements().get(0);
		assertEquals("ContainerView has the initial expected exclude", "{(relationship.destination==psql) && {(element.tag==personOptional) || {(relationship.source!=twx) && }}}", containerView.getExcludeExpression());
		assertTrue("Exclude condition is CompositeCondition", containerView.getExclude() instanceof CompositeCondition);
		assertTrue("Right element of Exclude condition is CompositeCondition", ((CompositeCondition)containerView.getExclude()).getRight() instanceof CompositeCondition);
		CompositeCondition compositeCondition = (CompositeCondition)((CompositeCondition)containerView.getExclude()).getRight();
		try {
			model.deleteElement(compositeCondition.getRight());
		} catch (EolRuntimeException e) {
			e.printStackTrace();
		}
		assertEquals("ContainerView has the final expected exclude", "{ ( relationship . destination ==psql ) && { ( element . tag ==personOptional ) || } }", containerView.getExcludeExpression());
	}
	
	@Test
	public void deleteEntireCondition() {
		assertTrue("First view is XtextContainerViewImpl", workspace.getViews().getViewElements().get(0) instanceof XtextContainerViewImpl);
		XtextContainerViewImpl containerView = (XtextContainerViewImpl) workspace.getViews().getViewElements().get(0);
		assertEquals("ContainerView has the initial expected exclude", "{(relationship.destination==psql) && {(element.tag==personOptional) || {(relationship.source!=twx) && }}}", containerView.getExcludeExpression());
		assertTrue("Exclude condition is CompositeCondition", containerView.getExclude() instanceof CompositeCondition);
		CompositeCondition compositeCondition = (CompositeCondition)containerView.getExclude();
		try {
			model.deleteElement(compositeCondition);
		} catch (EolRuntimeException e) {
			e.printStackTrace();
		}
		assertEquals("ContainerView has the final expected exclude", "", containerView.getExcludeExpression());
	}
	
	@Test
	public void deleteCompositeElement() {
		assertTrue("First view is XtextContainerViewImpl", workspace.getViews().getViewElements().get(0) instanceof XtextContainerViewImpl);
		XtextContainerViewImpl containerView = (XtextContainerViewImpl) workspace.getViews().getViewElements().get(0);
		assertEquals("ContainerView has the initial expected exclude", "{(relationship.destination==psql) && {(element.tag==personOptional) || {(relationship.source!=twx) && }}}", containerView.getExcludeExpression());
		assertTrue("Exclude condition is CompositeCondition", containerView.getExclude() instanceof CompositeCondition);
		assertTrue("Right element of Exclude condition is CompositeCondition", ((CompositeCondition)containerView.getExclude()).getRight() instanceof CompositeCondition);
		CompositeCondition compositeCondition = (CompositeCondition)((CompositeCondition)containerView.getExclude()).getRight();
		try {
			model.deleteElement(compositeCondition);
		} catch (EolRuntimeException e) {
			e.printStackTrace();
		}
		assertEquals("ContainerView has the final expected exclude", "{ ( relationship . destination ==psql ) && }", containerView.getExcludeExpression());
	}
	
	@Test
	public void addElement() {
		assertTrue("First view is XtextContainerViewImpl", workspace.getViews().getViewElements().get(0) instanceof XtextContainerViewImpl);
		XtextContainerViewImpl containerView = (XtextContainerViewImpl) workspace.getViews().getViewElements().get(0);
		assertEquals("ContainerView has the initial expected exclude", "{(relationship.destination==psql) && {(element.tag==personOptional) || {(relationship.source!=twx) && }}}", containerView.getExcludeExpression());
		assertTrue("Exclude condition is CompositeCondition", containerView.getExclude() instanceof CompositeCondition);
		assertTrue("Right element of Exclude condition is CompositeCondition", ((CompositeCondition)containerView.getExclude()).getRight() instanceof CompositeCondition);
		CompositeCondition compositeCondition = (CompositeCondition)((CompositeCondition)containerView.getExclude()).getRight();
		assertTrue("Right element of CompositeCondition is CompositeCondition", compositeCondition.getRight() instanceof CompositeCondition);		
		StructurizrFactory structurizrFactory = StructurizrFactoryImpl.init();
		ElementTypeCondition elementTypeCondition = structurizrFactory.createElementTypeCondition();
		elementTypeCondition.setComparisonOperation(ConditionComparisonOperation.EQUALS);
		elementTypeCondition.setType(FilterType.SOFTWARE_SYSTEM);
		((CompositeCondition)compositeCondition.getRight()).setRight(elementTypeCondition);		
		assertEquals("ContainerView has the final expected exclude", "{ ( relationship . destination ==psql ) && { ( element . tag ==personOptional ) || { ( relationship . source !=twx ) && ( element . type == SoftwareSystem ) } } }", containerView.getExcludeExpression());
	}
	
}
