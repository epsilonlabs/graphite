package workload.evaluation;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Before;
import org.junit.Test;

import graphite.textual.XtextXMIResourceFactoryImpl;
import workload.Project;
import workload.Task;
import workload.WorkloadPackage;

public class ScalabilityExecutionTime {
		
	@Before
	public void setup() throws Exception {
		WorkloadPackage.eINSTANCE.eClass();		
	}
	
	@Test
	public void loadExecutionTime() {
		
		List<Long> loadDurations = new ArrayList<Long>();
	
		for (int i = 0; i < EvaluationData.NumberOfModels; i++) {
		
			List<Long> modelDurations = new ArrayList<Long>();
			
			for (int j = 0; j < EvaluationData.Iterations; j++) {
 		
		 		try {
		 			File file = new File(EvaluationData.GeneratedModelsDirectory + EvaluationData.ModelFileName + (i+1) + "." + EvaluationData.ModelExtension);
				    URI uri = URI.createFileURI(file.getAbsolutePath());
				    ResourceSet resourceSet = new ResourceSetImpl();
				    resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(EvaluationData.ModelExtension, new XtextXMIResourceFactoryImpl());
				    Resource resource = resourceSet.createResource(uri);
			 		
			 		long startTime = System.nanoTime();
			 		
			 		resource.load(null);
					
					long endTime = System.nanoTime();
			 		long duration = endTime - startTime;
		 		
			 		modelDurations.add(duration);
			 		
			 		resource.unload();
				}
		 		catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			long averageModelDuration = modelDurations.stream().mapToLong(Long::longValue).sum() / (modelDurations.isEmpty() ? 1 : modelDurations.size());
	 		
	 		loadDurations.add(averageModelDuration);
	 		
			System.out.println("LoadX Duration [" + (i+1) + "]: " + String.format("%.5f", (loadDurations.get(i) / 1_000_000_000.0)));

		}
		
		for (int i = 0; i < loadDurations.size(); i++) {
			System.out.println("Load Duration [" + (i+1) + "]: " + String.format("%.5f", (loadDurations.get(i) / 1_000_000_000.0)));
		}
		
	}
	
	@Test
	public void storageExecutionTime() {
		
		String effortsList = "Alice : 1\nBob : 2\nBob : 3";
		String duplicatedEffortsList = IntStream.range(0, EvaluationData.TimesEfforts).mapToObj(i -> effortsList).collect(Collectors.joining("\n"));
		
		List<Long> storeDurations = new ArrayList<Long>();
		
		for (int i = 0; i < EvaluationData.NumberOfModels; i++) {

			List<Long> modelDurations = new ArrayList<Long>();
			
			for (int j = 0; j < EvaluationData.Iterations; j++) {
 		
		 		try {
		 			File file = new File(EvaluationData.GeneratedModelsDirectory + EvaluationData.ModelFileName + (i+1) + "." + EvaluationData.ModelExtension);		
			 		URI uri = URI.createFileURI(file.getAbsolutePath());
				    ResourceSet resourceSet = new ResourceSetImpl();
				    resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(EvaluationData.ModelExtension, new XtextXMIResourceFactoryImpl());
				    Resource resource = resourceSet.createResource(uri);
			 		resource.load(null);
			 		
			 		Project project = (Project)resource.getContents().get(0);
			 		for (Task task: project.getTasks()) {
			 			task.setEffortsExpression(duplicatedEffortsList);
			 		}
			 		
			 		long startTime = System.nanoTime();
			 		
			 		resource.save(null);
					
					long endTime = System.nanoTime();
			 		long duration = endTime - startTime;
		 		
			 		modelDurations.add(duration);
			 		
			 		resource.unload();
				}
		 		catch (Exception e) {
					e.printStackTrace();
				}
		 		
			}
			
			long averageModelDuration = modelDurations.stream().mapToLong(Long::longValue).sum() / (modelDurations.isEmpty() ? 1 : modelDurations.size());
	 		
			storeDurations.add(averageModelDuration);
			
			System.out.println("StoreX Duration [" + (i+1) + "]: " + String.format("%.5f", (storeDurations.get(i) / 1_000_000_000.0)));

		}
		
		for (int i = 0; i < storeDurations.size(); i++) {
			System.out.println("Store Duration [" + (i+1) + "]: " + String.format("%.5f", (storeDurations.get(i) / 1_000_000_000.0)));
		}
		
	}
	
	@Test
	public void loadExecutionTimeLargestModel() {
		
		try {
			File file = new File(EvaluationData.GeneratedModelsDirectory + EvaluationData.ModelFileName + 1 + "." + EvaluationData.ModelExtension);		
		    URI uri = URI.createFileURI(file.getAbsolutePath());
		    ResourceSet resourceSet = new ResourceSetImpl();
		    resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(EvaluationData.ModelExtension, new XtextXMIResourceFactoryImpl());
		    Resource resource = resourceSet.createResource(uri);
		    
		    long startTime = System.nanoTime();

		    resource.load(null);

		    long endTime = System.nanoTime();
		    long duration = endTime - startTime;

			System.out.println("Load Duration: " + String.format("%.5f", (duration / 1_000_000_000.0)));

		    resource.unload();
		}
		catch (Exception e) {
		    e.printStackTrace();
		}
		
	}
	
	@Test
	public void storageExecutionTimeLargestModel() {
		
		String effortsList = "Alice : 1\nBob : 2\nBob : 3";
		String duplicatedEffortsList = IntStream.range(0, EvaluationData.TimesEfforts).mapToObj(i -> effortsList).collect(Collectors.joining("\n"));
		
		try {
			File file = new File(EvaluationData.GeneratedModelsDirectory + EvaluationData.ModelFileName + 10 + "." + EvaluationData.ModelExtension);			
		    URI uri = URI.createFileURI(file.getAbsolutePath());
		    ResourceSet resourceSet = new ResourceSetImpl();
		    resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(EvaluationData.ModelExtension, new XtextXMIResourceFactoryImpl());
		    Resource resource = resourceSet.createResource(uri);
		    resource.load(null);

		    Project project = (Project)resource.getContents().get(0);
		    for (Task task: project.getTasks()) {
	 			task.setEffortsExpression(duplicatedEffortsList);
	 		}

		    long startTime = System.nanoTime();

		    resource.save(null);

		    long endTime = System.nanoTime();
		    long duration = endTime - startTime;

			System.out.println("Store Duration: " + String.format("%.5f", (duration / 1_000_000_000.0)));

		    resource.unload();
		}
		catch (Exception e) {
		    e.printStackTrace();
		}
		
	}
		
}
