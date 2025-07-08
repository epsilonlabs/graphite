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
import structurizr.Container;
import structurizr.ElementTagCondition;
import structurizr.NoFilterCondition;
import structurizr.Person;
import structurizr.RelationshipDestinationCondition;
import structurizr.RelationshipSourceCondition;
import structurizr.StructurizrPackage;
import structurizr.Tag;
import structurizr.Workspace;
import structurizr.impl.XtextContainerViewImpl;
import structurizr.impl.XtextSystemContextViewImpl;

import org.eclipse.epsilon.emc.emf.EmfModel;


public class IntegratedASGTests {
	
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
	public void equivalentContainerViewInclude() {
		assertTrue("First view is XtextContainerViewImpl", workspace.getViews().getViewElements().get(0) instanceof XtextContainerViewImpl);
		XtextContainerViewImpl containerView = (XtextContainerViewImpl) workspace.getViews().getViewElements().get(0);
		assertEquals("ContainerView has the initial expected include", "( element.tag  != personMain)", containerView.getIncludeExpression());
		assertTrue("Include condition is ElementTagCondition", containerView.getInclude() instanceof ElementTagCondition);
		ElementTagCondition elementTagCondition = (ElementTagCondition)containerView.getInclude();
		assertEquals("ElementTagCondition has expected Tag", "personMain", elementTagCondition.getTags().get(0).getName());
		assertEquals("ElementTagCondition has expected Comparison Operation", ConditionComparisonOperation.NOT_EQUALS, elementTagCondition.getComparisonOperation());
	}
	
	@Test
	public void equivalentContainerViewExclude() {
		assertTrue("First view is XtextContainerViewImpl", workspace.getViews().getViewElements().get(0) instanceof XtextContainerViewImpl);
		XtextContainerViewImpl containerView = (XtextContainerViewImpl) workspace.getViews().getViewElements().get(0);
		assertEquals("ContainerView has the initial expected exclude", "{(relationship.destination==psql) && {(element.tag==personOptional) || {(relationship.source!=twx) && }}}", containerView.getExcludeExpression());
		assertTrue("Exclude condition is CompositeCondition", containerView.getExclude() instanceof CompositeCondition);
		CompositeCondition compositeCondition = (CompositeCondition)containerView.getExclude();
		
		assertTrue("Left side of Exclude condition is RelationshipDestinationCondition", compositeCondition.getLeft() instanceof RelationshipDestinationCondition);
		RelationshipDestinationCondition relationshipDestinationCondition = (RelationshipDestinationCondition)compositeCondition.getLeft();
		Container container1 = workspace.getModel().getSoftwareSystem().getContainers().get(1);
		assertEquals("DestinationCondition has expected destination", container1, relationshipDestinationCondition.getDestination());
		
		assertTrue("Right side of Exclude condition is CompositeCondition", compositeCondition.getRight() instanceof CompositeCondition);
		CompositeCondition innerCompositeCondition1 = (CompositeCondition)compositeCondition.getRight();
		assertTrue("Left side of CompositeCondition is ElementTagCondition", innerCompositeCondition1.getLeft() instanceof ElementTagCondition);
		ElementTagCondition elementTagCondition = (ElementTagCondition)innerCompositeCondition1.getLeft();
		Tag tag = workspace.getModel().getPersons().get(1).getTags().get(0);		
		assertEquals("ElementTagCondition has expected Comparison Operation", ConditionComparisonOperation.EQUALS, elementTagCondition.getComparisonOperation());
		assertEquals("ElementTagCondition has expected Tag", tag, elementTagCondition.getTags().get(0));

		assertTrue("Right side of CompositeCondition is CompositeCondition", innerCompositeCondition1.getRight() instanceof CompositeCondition);
		CompositeCondition innerCompositeCondition2 = (CompositeCondition)innerCompositeCondition1.getRight();
		assertTrue("Left side of InnerCompositeCondition is RelationshipSourceCondition", innerCompositeCondition2.getLeft() instanceof RelationshipSourceCondition);
		Container container2 = workspace.getModel().getSoftwareSystem().getContainers().get(0);
		RelationshipSourceCondition relationshipSourceCondition = (RelationshipSourceCondition)innerCompositeCondition2.getLeft();
		assertEquals("SourceCondition has expected Comparison Operation", ConditionComparisonOperation.NOT_EQUALS, relationshipSourceCondition.getComparisonOperation());
		assertEquals("SourceCondition has expected Source", container2, relationshipSourceCondition.getSource());
		assertEquals("Right side of InnerCompositeCondition is null", null, innerCompositeCondition2.getRight());
	}
	
	@Test
	public void equivalentSystemContextViewInclude() {
		assertTrue("First view is XtextSystemContextViewImpl", workspace.getViews().getViewElements().get(1) instanceof XtextSystemContextViewImpl);
		XtextSystemContextViewImpl systemContextView = (XtextSystemContextViewImpl) workspace.getViews().getViewElements().get(1);
		assertEquals("SystemContextView has the initial expected include", "*", systemContextView.getIncludeExpression());
		assertTrue("Include condition is NoFilterCondition", systemContextView.getInclude() instanceof NoFilterCondition);
	}
	
	@Test
	public void equivalentSystemContextViewExclude() {
		assertTrue("First view is XtextSystemContextViewImpl", workspace.getViews().getViewElements().get(1) instanceof XtextSystemContextViewImpl);
		XtextSystemContextViewImpl systemContextView = (XtextSystemContextViewImpl) workspace.getViews().getViewElements().get(1);
		assertEquals("SystemContextView has the initial expected exclude", "(relationship.source==p1)", systemContextView.getExcludeExpression());
		assertTrue("Exclude condition is RelationshipSourceCondition", systemContextView.getExclude() instanceof RelationshipSourceCondition);
		RelationshipSourceCondition relationshipSourceCondition = (RelationshipSourceCondition)systemContextView.getExclude();
		Person person = workspace.getModel().getPersons().get(0);
		assertEquals("SourceCondition has expected Comparison Operation", ConditionComparisonOperation.EQUALS, relationshipSourceCondition.getComparisonOperation());
		assertEquals("SourceCondition has expected Source", person, relationshipSourceCondition.getSource());
	}
	
}
