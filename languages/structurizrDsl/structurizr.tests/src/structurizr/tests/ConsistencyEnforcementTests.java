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
import structurizr.Container;
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


public class ConsistencyEnforcementTests {
	
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
	public void changedNameOfReference() {
		assertTrue("First view is XtextContainerViewImpl", workspace.getViews().getViewElements().get(0) instanceof XtextContainerViewImpl);
		XtextContainerViewImpl containerView = (XtextContainerViewImpl) workspace.getViews().getViewElements().get(0);
		assertEquals("ContainerView has the initial expected include", "( element.tag  != personMain)", containerView.getIncludeExpression());
		Tag tag = workspace.getModel().getPersons().get(0).getTags().get(0);
		tag.setName("personInvalid");
		assertEquals("ContainerView has the final expected include", "( element . tag != personInvalid )", containerView.getIncludeExpression());
	}
	
	@Test
	public void changedIdentifierOfReference() {
		assertTrue("First view is XtextContainerViewImpl", workspace.getViews().getViewElements().get(0) instanceof XtextContainerViewImpl);
		XtextContainerViewImpl containerView = (XtextContainerViewImpl) workspace.getViews().getViewElements().get(0);
		assertEquals("ContainerView has the initial expected exclude", "{(relationship.destination==psql) && {(element.tag==personOptional) || {(relationship.source!=twx) && }}}", containerView.getExcludeExpression());
		Container container = workspace.getModel().getSoftwareSystem().getContainers().get(1);
		container.setIdentifier("containerInvalid");
		assertEquals("ContainerView has the final expected exclude", "{ ( relationship . destination ==containerInvalid ) && { ( element . tag ==personOptional ) || { ( relationship . source !=twx ) && } } }", containerView.getExcludeExpression());
	}
	
	@Test
	public void deletedReference() {
		assertTrue("First view is XtextContainerViewImpl", workspace.getViews().getViewElements().get(0) instanceof XtextContainerViewImpl);
		XtextContainerViewImpl containerView = (XtextContainerViewImpl)workspace.getViews().getViewElements().get(0);
		assertEquals("ContainerView has the initial expected include", "( element.tag  != personMain)", containerView.getIncludeExpression());
		Tag tag = workspace.getModel().getPersons().get(0).getTags().get(0);
		try {
			model.deleteElement(tag);
		} catch (EolRuntimeException e) {
			e.printStackTrace();
		}
		assertEquals("ContainerView has the final expected include", "( element . tag != )", containerView.getIncludeExpression());
	}
	
	@Test
	public void invalidExpressionBecomingValid() {
		assertTrue("First view is XtextContainerViewImpl", workspace.getViews().getViewElements().get(0) instanceof XtextContainerViewImpl);
		XtextContainerViewImpl containerView = (XtextContainerViewImpl) workspace.getViews().getViewElements().get(0);
		assertEquals("ContainerView has the initial expected exclude", "{(relationship.destination==psql) && {(element.tag==personOptional) || {(relationship.source!=twx) && }}}", containerView.getExcludeExpression());
		containerView.setExcludeExpression("{(relationship.destination==psqlX) && {(element.tag==personOptional) || {(relationship.source!=twx) && }}}");
		StructurizrFactory structurizrFactory = StructurizrFactoryImpl.init();
		Person person = structurizrFactory.createPerson();
		workspace.getModel().getPersons().add(person);
		person.setIdentifier("psqlX");
		assertTrue("Exclude condition is CompositeCondition", containerView.getExclude() instanceof CompositeCondition);
		assertTrue("Left element of Exclude condition is RelationshipDestinationCondition", ((CompositeCondition)containerView.getExclude()).getLeft() instanceof RelationshipDestinationCondition);
		RelationshipDestinationCondition relationshipDestinationCondition = (RelationshipDestinationCondition)((CompositeCondition)containerView.getExclude()).getLeft();
		assertEquals("Person is the new destination", person, relationshipDestinationCondition.getDestination());
	}

}
