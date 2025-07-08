package workload.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.Arrays;

import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import graphite.shared.Settings;
import workload.Effort;
import workload.Person;
import workload.Project;
import workload.WorkloadFactory;
import workload.WorkloadPackage;
import workload.impl.XtextTaskImpl;

public class ModifyingDerivedElementsTests {

	private EmfModel model;
	private Project project;
	
	@Before
	public void setup() throws Exception {
		Settings.setMergeDerivedModelElements(false);
 		model = new EmfModel();
 		model.setMetamodelUris((Arrays.asList(WorkloadPackage.eINSTANCE.getNsURI()))); 		
 		model.setModelFile(new File(TestsData.MODEL).getAbsolutePath());
 		model.setReadOnLoad(true);
 		model.setStoredOnDisposal(false);
 		model.load();
 		project = (Project)model.getResource().getContents().get(0); 		
	}
	
	@After
	public void teardown() {
	    if (model != null) {
	    	model.getResource().unload();
	    }
	}
	
	@Test
	public void changeElementReferenceValue() {
		assertTrue("The task is of type XtextTaskImpl", project.getTasks().get(2) instanceof XtextTaskImpl);
		XtextTaskImpl task = (XtextTaskImpl)project.getTasks().get(2);
		assertEquals("Task has the initial expected efforts", "Alice : 3\nBob : 6\nCharlie : 8", task.getEffortsExpression());
		Person person = project.getPeople().get(2);
		task.getEfforts().get(0).setPerson(person);
		assertEquals("Task has the final expected efforts", "Charlie : 3\nBob : 6\nCharlie : 8", task.getEffortsExpression());
	}
	
	@Test
	public void changeElementLiteralValue() {
		assertTrue("The task is of type XtextTaskImpl", project.getTasks().get(2) instanceof XtextTaskImpl);
		XtextTaskImpl task = (XtextTaskImpl)project.getTasks().get(2);
		assertEquals("Task has the initial expected efforts", "Alice : 3\nBob : 6\nCharlie : 8", task.getEffortsExpression());
		task.getEfforts().get(0).setMonths(5);
		assertEquals("Task has the final expected efforts", "Alice : 5\nBob : 6\nCharlie : 8", task.getEffortsExpression());	
	}
	
	@Test
	public void setReferenceToNull() {
		assertTrue("The task is of type XtextTaskImpl", project.getTasks().get(2) instanceof XtextTaskImpl);
		XtextTaskImpl task = (XtextTaskImpl)project.getTasks().get(2);
		assertEquals("Task has the initial expected efforts", "Alice : 3\nBob : 6\nCharlie : 8", task.getEffortsExpression());
		task.getEfforts().get(0).setPerson(null);
		assertEquals("Task has the final expected efforts", ": 3\nBob : 6\nCharlie : 8", task.getEffortsExpression());
	}
	
	@Test
	public void deleteElement() {
		assertTrue("The task is of type XtextTaskImpl", project.getTasks().get(2) instanceof XtextTaskImpl);
		XtextTaskImpl task = (XtextTaskImpl)project.getTasks().get(2);
		assertEquals("Task has the initial expected efforts", "Alice : 3\nBob : 6\nCharlie : 8", task.getEffortsExpression());
		try {
			model.deleteElement(task.getEfforts().get(0));
		} catch (EolRuntimeException e) {
			e.printStackTrace();
		}
		assertEquals("Task has the final expected efforts", "Bob : 6\nCharlie : 8", task.getEffortsExpression());
	}
	
	@Test
	public void deleteAllElements() {
		assertTrue("The task is of type XtextTaskImpl", project.getTasks().get(2) instanceof XtextTaskImpl);
		XtextTaskImpl task = (XtextTaskImpl)project.getTasks().get(2);
		assertEquals("Task has the initial expected efforts", "Alice : 3\nBob : 6\nCharlie : 8", task.getEffortsExpression());
		try {
			model.deleteElement(task.getEfforts().get(0));
			model.deleteElement(task.getEfforts().get(0));
			model.deleteElement(task.getEfforts().get(0));
		} catch (EolRuntimeException e) {
			e.printStackTrace();
		}
		assertEquals("Task has the final expected efforts", "", task.getEffortsExpression());
	}
	
	@Test
	public void addElementToNonEmptyContainer() {
		assertTrue("The task is of type XtextTaskImpl", project.getTasks().get(2) instanceof XtextTaskImpl);
		XtextTaskImpl task = (XtextTaskImpl)project.getTasks().get(2);
		assertEquals("Task has the initial expected efforts", "Alice : 3\nBob : 6\nCharlie : 8", task.getEffortsExpression());
		Person person = project.getPeople().get(0);
		WorkloadFactory workloadFactory = workload.impl.WorkloadFactoryImpl.init();
		Effort effort = workloadFactory.createEffort();
		effort.setPerson(person);
		effort.setMonths(10);
		task.getEfforts().add(effort);
		assertEquals("Task has the final expected efforts", "Alice : 3\nBob : 6\nCharlie : 8\nAlice : 10", task.getEffortsExpression());
	}
	
	@Test
	public void addElementToEmptyContainer() {
		assertTrue("The task is of type XtextTaskImpl", project.getTasks().get(1) instanceof XtextTaskImpl);
		XtextTaskImpl task = (XtextTaskImpl)project.getTasks().get(1);
		assertEquals("Task has the initial expected efforts", null, task.getEffortsExpression());
		Person person = project.getPeople().get(0);
		WorkloadFactory workloadFactory = workload.impl.WorkloadFactoryImpl.init();
		Effort effort = workloadFactory.createEffort();
		effort.setPerson(person);
		effort.setMonths(10);
		task.getEfforts().add(effort);
		assertEquals("Task has the final expected efforts", "Alice : 10", task.getEffortsExpression());
	}
	
	@Test
	public void changeOrderOfElements() {
		assertTrue("The task is of type XtextTaskImpl", project.getTasks().get(2) instanceof XtextTaskImpl);
		XtextTaskImpl task = (XtextTaskImpl)project.getTasks().get(2);
		assertEquals("Task has the initial expected efforts", "Alice : 3\nBob : 6\nCharlie : 8", task.getEffortsExpression());
		task.getEfforts().move(2, 0);
		assertEquals("Task has the final expected efforts", "Bob : 6\nCharlie : 8\nAlice : 3", task.getEffortsExpression());
	}
	
}
