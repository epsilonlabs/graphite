package workload.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.Arrays;

import org.eclipse.epsilon.emc.emf.EmfModel;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import graphite.shared.Settings;
import workload.Project;
import workload.WorkloadPackage;
import workload.impl.XtextTaskImpl;

public class IntegratedASGTests {

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
	public void equivalentAnalysisTaskEfforts() {
		assertTrue("The task is of type XtextTaskImpl", project.getTasks().get(0) instanceof XtextTaskImpl);
		XtextTaskImpl task = (XtextTaskImpl)project.getTasks().get(0);
		assertEquals("Task has the initial expected efforts", "Alice : 6\n: 4", task.getEffortsExpression());
		assertEquals("First effort has expected person", project.getPeople().get(0), task.getEfforts().get(0).getPerson());
		assertEquals("First effort has expected months", 6, task.getEfforts().get(0).getMonths());
		assertEquals("Second effort has expected person", null, task.getEfforts().get(1).getPerson());
		assertEquals("Second effort has expected months", 4, task.getEfforts().get(1).getMonths());
	}
	
	@Test
	public void equivalentDesignTaskEfforts() {
		assertTrue("The task is of type XtextTaskImpl", project.getTasks().get(1) instanceof XtextTaskImpl);
		XtextTaskImpl task = (XtextTaskImpl)project.getTasks().get(1);
		assertEquals("Task has the initial expected efforts", null, task.getEffortsExpression());
		assertTrue("Task has no efforts", task.getEfforts().isEmpty());
	}
	
	@Test
	public void equivalentImplementationTaskEfforts() {
		assertTrue("The task is of type XtextTaskImpl", project.getTasks().get(2) instanceof XtextTaskImpl);
		XtextTaskImpl task = (XtextTaskImpl)project.getTasks().get(2);
		assertEquals("Task has the initial expected efforts", "Alice : 3\nBob : 6\nCharlie : 8", task.getEffortsExpression());
		assertEquals("First effort has expected person", project.getPeople().get(0), task.getEfforts().get(0).getPerson());
		assertEquals("First effort has expected months", 3, task.getEfforts().get(0).getMonths());
		assertEquals("Second effort has expected person", project.getPeople().get(1), task.getEfforts().get(1).getPerson());
		assertEquals("Second effort has expected months", 6, task.getEfforts().get(1).getMonths());
		assertEquals("Third effort has expected person", project.getPeople().get(2), task.getEfforts().get(2).getPerson());
		assertEquals("Third effort has expected months", 8, task.getEfforts().get(2).getMonths());
	}
}
