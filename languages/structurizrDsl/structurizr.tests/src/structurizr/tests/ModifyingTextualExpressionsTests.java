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
import structurizr.ConditionLogicalOperation;
import structurizr.Container;
import structurizr.ElementTypeCondition;
import structurizr.FilterType;
import structurizr.RelationshipDestinationCondition;
import structurizr.StructurizrPackage;
import structurizr.Workspace;
import structurizr.impl.XtextContainerViewImpl;

import org.eclipse.epsilon.emc.emf.EmfModel;


public class ModifyingTextualExpressionsTests {
	
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
	public void deleteReference() {
		assertTrue("First view is XtextContainerViewImpl", workspace.getViews().getViewElements().get(0) instanceof XtextContainerViewImpl);
		XtextContainerViewImpl containerView = (XtextContainerViewImpl) workspace.getViews().getViewElements().get(0);
		assertEquals("ContainerView has the initial expected exclude", "{(relationship.destination==psql) && {(element.tag==personOptional) || {(relationship.source!=twx) && }}}", containerView.getExcludeExpression());
		assertTrue("Exclude condition is CompositeCondition", containerView.getExclude() instanceof CompositeCondition);
		assertTrue("Left element of Exclude condition is RelationshipDestinationCondition", ((CompositeCondition)containerView.getExclude()).getLeft() instanceof RelationshipDestinationCondition);
		containerView.setExcludeExpression("{(relationship.destination==) && {(element.tag==personOptional) || {(relationship.source!=twx) && }}}");
		RelationshipDestinationCondition relationshipDestinationCondition = (RelationshipDestinationCondition)((CompositeCondition)containerView.getExclude()).getLeft();
		assertEquals("RelationshipDestinationCondition has null destination", null, relationshipDestinationCondition.getDestination());
	}
	
	@Test
	public void deleteElement() {
		assertTrue("First view is XtextContainerViewImpl", workspace.getViews().getViewElements().get(0) instanceof XtextContainerViewImpl);
		XtextContainerViewImpl containerView = (XtextContainerViewImpl) workspace.getViews().getViewElements().get(0);
		assertEquals("ContainerView has the initial expected exclude", "{(relationship.destination==psql) && {(element.tag==personOptional) || {(relationship.source!=twx) && }}}", containerView.getExcludeExpression());
		assertTrue("Exclude condition is CompositeCondition", containerView.getExclude() instanceof CompositeCondition);
		containerView.setExcludeExpression("{ && {(element.tag==personOptional) || {(relationship.source!=twx) && }}}");
		assertEquals("Left element of Exclude condition is null", null, ((CompositeCondition)containerView.getExclude()).getLeft());
	}
	
	@Test
	public void deleteEntireCondition() {
		assertTrue("First view is XtextContainerViewImpl", workspace.getViews().getViewElements().get(0) instanceof XtextContainerViewImpl);
		XtextContainerViewImpl containerView = (XtextContainerViewImpl) workspace.getViews().getViewElements().get(0);
		assertEquals("ContainerView has the initial expected exclude", "{(relationship.destination==psql) && {(element.tag==personOptional) || {(relationship.source!=twx) && }}}", containerView.getExcludeExpression());
		containerView.setExcludeExpression("");
		assertEquals("Exclude condition is null", null, containerView.getExclude());
	}
	
	@Test
	public void deleteCompositeElement() {
		assertTrue("First view is XtextContainerViewImpl", workspace.getViews().getViewElements().get(0) instanceof XtextContainerViewImpl);
		XtextContainerViewImpl containerView = (XtextContainerViewImpl) workspace.getViews().getViewElements().get(0);
		assertEquals("ContainerView has the initial expected exclude", "{(relationship.destination==psql) && {(element.tag==personOptional) || {(relationship.source!=twx) && }}}", containerView.getExcludeExpression());
		assertTrue("Exclude condition is CompositeCondition", containerView.getExclude() instanceof CompositeCondition);
		containerView.setExcludeExpression("{(relationship.destination==psql) && }");
		assertEquals("Right element of Exclude condition is null", null, ((CompositeCondition)containerView.getExclude()).getRight());
	}
	
	@Test
	public void changeReference() {
		assertTrue("First view is XtextContainerViewImpl", workspace.getViews().getViewElements().get(0) instanceof XtextContainerViewImpl);
		XtextContainerViewImpl containerView = (XtextContainerViewImpl) workspace.getViews().getViewElements().get(0);
		assertEquals("ContainerView has the initial expected exclude", "{(relationship.destination==psql) && {(element.tag==personOptional) || {(relationship.source!=twx) && }}}", containerView.getExcludeExpression());
		assertTrue("Exclude condition is CompositeCondition", containerView.getExclude() instanceof CompositeCondition);
		assertTrue("Left element of Exclude condition is RelationshipDestinationCondition", ((CompositeCondition)containerView.getExclude()).getLeft() instanceof RelationshipDestinationCondition);
		containerView.setExcludeExpression("{(relationship.destination==twx) && {(element.tag==personOptional) || {(relationship.source!=twx) && }}}");
		RelationshipDestinationCondition relationshipDestinationCondition = (RelationshipDestinationCondition)((CompositeCondition)containerView.getExclude()).getLeft();
		Container container = workspace.getModel().getSoftwareSystem().getContainers().get(0);
		assertEquals("RelationshipDestinationCondition has new reference", container, relationshipDestinationCondition.getDestination());
	}
	
	@Test
	public void changeValue() {
		assertTrue("First view is XtextContainerViewImpl", workspace.getViews().getViewElements().get(0) instanceof XtextContainerViewImpl);
		XtextContainerViewImpl containerView = (XtextContainerViewImpl) workspace.getViews().getViewElements().get(0);
		assertEquals("ContainerView has the initial expected exclude", "{(relationship.destination==psql) && {(element.tag==personOptional) || {(relationship.source!=twx) && }}}", containerView.getExcludeExpression());
		assertTrue("Exclude condition is CompositeCondition", containerView.getExclude() instanceof CompositeCondition);
		containerView.setExcludeExpression("{(relationship.destination==psql) || {(element.tag==personOptional) || {(relationship.source!=twx) && }}}");
		ConditionLogicalOperation conditionLogicalOperation = ((CompositeCondition)containerView.getExclude()).getLogicalOperation();
		assertEquals("ConditionLogicalOperation is changed", ConditionLogicalOperation.OR, conditionLogicalOperation);
	}
		
	@Test
	public void addElement() {
		assertTrue("First view is XtextContainerViewImpl", workspace.getViews().getViewElements().get(0) instanceof XtextContainerViewImpl);
		XtextContainerViewImpl containerView = (XtextContainerViewImpl) workspace.getViews().getViewElements().get(0);
		assertEquals("ContainerView has the initial expected exclude", "{(relationship.destination==psql) && {(element.tag==personOptional) || {(relationship.source!=twx) && }}}", containerView.getExcludeExpression());
		assertTrue("Exclude condition is CompositeCondition", containerView.getExclude() instanceof CompositeCondition);
		assertTrue("Right element of Exclude condition is CompositeCondition", ((CompositeCondition)containerView.getExclude()).getRight() instanceof CompositeCondition);		
		containerView.setExcludeExpression("{(relationship.destination==psql) && {(element.tag==personOptional) || {(relationship.source!=twx) && (element.type==Component)}}}");
		CompositeCondition compositeCondition = (CompositeCondition)((CompositeCondition)containerView.getExclude()).getRight();
		assertTrue("Right element of CompositeCondition is CompositeCondition", compositeCondition.getRight() instanceof CompositeCondition);			
		assertTrue("Right element of CompositeCondition is ElementTypeCondition", ((CompositeCondition)compositeCondition.getRight()).getRight() instanceof ElementTypeCondition);
		ElementTypeCondition elementTypeCondition = (ElementTypeCondition)((CompositeCondition)compositeCondition.getRight()).getRight();
		assertEquals("FilterType is of type Component", FilterType.COMPONENT, elementTypeCondition.getType());
	}
	
}
