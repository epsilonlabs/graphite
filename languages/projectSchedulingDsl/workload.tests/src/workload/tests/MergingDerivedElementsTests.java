package workload.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.epsilon.emc.emf.EmfModel;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import graphite.shared.Settings;
import workload.Effort;
import workload.Project;
import workload.WorkloadPackage;
import workload.impl.XtextTaskImpl;

public class MergingDerivedElementsTests {

	private EmfModel model;
	private Project project;
	
	@Before
	public void setup() throws Exception {
		Settings.setMergeDerivedModelElements(true);
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
	public void mergingElementsReversedList() {
		assertTrue("The task is of type XtextTaskImpl", project.getTasks().get(2) instanceof XtextTaskImpl);
		XtextTaskImpl task = (XtextTaskImpl)project.getTasks().get(2);
		assertEquals("Task has the initial expected efforts", "Alice : 3\nBob : 6\nCharlie : 8", task.getEffortsExpression());
		List<Effort> initialEfforts = new ArrayList<Effort>();
		initialEfforts.addAll(task.getEfforts());
		task.setEffortsExpression("Charlie : 8\nBob : 6\nAlice : 3");
		List<Effort> finalEfforts = task.getEfforts();
		assertEquals("First effort is now last effort", initialEfforts.get(0), finalEfforts.get(2));
		assertEquals("Middle effort is now middle effort", initialEfforts.get(1), finalEfforts.get(1));
		assertEquals("Last effort is now first effort", initialEfforts.get(2), finalEfforts.get(0));
	}
	
	@Test
	public void mergingElementsChangedValues() {
		assertTrue("The task is of type XtextTaskImpl", project.getTasks().get(2) instanceof XtextTaskImpl);
		XtextTaskImpl task = (XtextTaskImpl)project.getTasks().get(2);
		assertEquals("Task has the initial expected efforts", "Alice : 3\nBob : 6\nCharlie : 8", task.getEffortsExpression());
		List<Effort> initialEfforts = new ArrayList<Effort>();
		initialEfforts.addAll(task.getEfforts());
		task.setEffortsExpression("Charlie : 1\nAlice : 2\nBob : 4");
		List<Effort> finalEfforts = task.getEfforts();
		assertEquals("First effort is now second effort", initialEfforts.get(0), finalEfforts.get(1));
		assertEquals("Second effort is now third effort", initialEfforts.get(1), finalEfforts.get(2));
		assertEquals("Third effort is now first effort", initialEfforts.get(2), finalEfforts.get(0));
	}
	
}
