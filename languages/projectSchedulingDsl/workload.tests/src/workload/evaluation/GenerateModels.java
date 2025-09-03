package workload.evaluation;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import graphite.textual.XtextXMIResourceFactoryImpl;
import workload.Person;
import workload.Project;
import workload.Task;
import workload.WorkloadFactory;
import workload.WorkloadPackage;

public class GenerateModels {
		
	@Before
	public void setup() throws Exception {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(EvaluationData.ModelExtension, new XtextXMIResourceFactoryImpl());
		EPackage.Registry.INSTANCE.put(WorkloadPackage.eNS_URI, WorkloadPackage.eINSTANCE);
	}
	
	@After
	public void teardown() {
		File directory = new File(EvaluationData.GeneratedModelsDirectory);

		if (!directory.exists() || !directory.isDirectory()) {
			System.out.println("Invalid directory.");
			return;
		}

		File[] files = directory.listFiles();

		if (files == null || files.length == 0) {
			System.out.println("Directory is empty or cannot be read.");
			return;
		}
		
        Arrays.sort(files, (f1, f2) -> f1.getName().compareToIgnoreCase(f2.getName()));


		System.out.printf("%-30s %-10s%n", "File Name", "Size (KB)");
		System.out.println("-----------------------------------------------");

		for (File file : files) {
			if (file.isFile()) {
				long sizeInKB = file.length() / 1024;
				System.out.printf("%-30s %-10d%n", file.getName(), sizeInKB);
			}
		}
	}
	
	@Test
	public void generateModelsScalability() {
		
		for (int i = 0; i < EvaluationData.NumberOfModels; i++) {
			generateModelScalability(i+1, EvaluationData.NumberOfTasks * (i+1));
		}
		
	}
	
	@Test
	public void generateModelsConsistencyFixedTasks() {
	
		for (int i = 0; i < EvaluationData.NumberOfModels; i++) {
			generateModelConsistencyFixedTasks(i+1, EvaluationData.NumberOfTasks * (i+1), EvaluationData.NumberOfModels * EvaluationData.NumberOfTasks);
		}
		
	}
	
	@Test
	public void generateModelsConsistencyVariableTasks() {
			
		for (int i = 0; i < EvaluationData.NumberOfModels; i++) {
			generateModelConsistencyVariableTasks(i+1, EvaluationData.NumberOfTasks, EvaluationData.NumberOfTasks * (i+1));
		}
		
	}
	
	public void generateModelScalability(int modelId, int numberOfTasks) {
		
		String effortsList = "Alice : 3\nBob : 6\nCharlie : 9";
		String duplicatedEffortsList = IntStream.range(0, EvaluationData.TimesEfforts).mapToObj(i -> effortsList).collect(Collectors.joining("\n"));
		
		File file = new File(EvaluationData.GeneratedModelsDirectory + EvaluationData.ModelFileName + modelId + "." + EvaluationData.ModelExtension);
		URI uri = URI.createFileURI(file.getAbsolutePath());
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(uri);
			
		WorkloadFactory factory = workload.impl.WorkloadFactoryImpl.init();
		
		Project project = factory.createProject();
		
		Person alice = factory.createPerson();
		alice.setName("Alice");
		
		Person bob = factory.createPerson();
		bob.setName("Bob");
		
		Person charlie = factory.createPerson();
		charlie.setName("Charlie");
		
		project.getPeople().add(alice);
		project.getPeople().add(bob);
		project.getPeople().add(charlie);
	
		for (int i = 0; i < numberOfTasks; i++) {
			
			Task task = factory.createTask();
			task.setName("Task_" + i);
			task.setEffortsExpression(duplicatedEffortsList);			
			project.getTasks().add(task);
			
		}
		
		resource.getContents().add(project);
		
		try {
			resource.save(null);
			resource.unload();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Model generated at: " + file.getAbsolutePath());
		
	}
	
	public void generateModelConsistencyFixedTasks(int modelId, int numberOfTasksWithReferences, int totalNumberOfTasks) {
		
		String effortsWithReferences = "Alice : 2\nBob : 4\nCharlie : 6";
		String effortsWithoutReferences = "Bob : 1\nCharlie : 3\nDavid : 5";
		String duplicatedEffortsWithReferences = IntStream.range(0, EvaluationData.TimesEfforts).mapToObj(i -> effortsWithReferences).collect(Collectors.joining("\n"));
		String duplicatedEffortsWithoutReferences = IntStream.range(0, EvaluationData.TimesEfforts).mapToObj(i -> effortsWithoutReferences).collect(Collectors.joining("\n"));
		
		File file = new File(EvaluationData.GeneratedModelsDirectory + EvaluationData.ModelFileName + modelId + "." + EvaluationData.ModelExtension);
		URI uri = URI.createFileURI(file.getAbsolutePath());
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(uri);
		
		int numberOfTasksWithoutReferences = totalNumberOfTasks - numberOfTasksWithReferences;
		
		WorkloadFactory factory = workload.impl.WorkloadFactoryImpl.init();
		
		Project project = factory.createProject();
		
		Person alice = factory.createPerson();
		alice.setName("Alice");
		
		Person bob = factory.createPerson();
		bob.setName("Bob");
		
		Person charlie = factory.createPerson();
		charlie.setName("Charlie");
		
		Person david = factory.createPerson();
		david.setName("David");
		
		project.getPeople().add(alice);
		project.getPeople().add(bob);
		project.getPeople().add(charlie);
		project.getPeople().add(david);
	
		for (int i = 0; i < totalNumberOfTasks; i++) {
			Task task = factory.createTask();
			task.setName("Task_" + i);
			project.getTasks().add(task);
			if (i < numberOfTasksWithoutReferences) {
				task.setEffortsExpression(duplicatedEffortsWithoutReferences);
			}
			else {
				task.setEffortsExpression(duplicatedEffortsWithReferences);
			}
		}
		
		resource.getContents().add(project);
		
		try {
			resource.save(null);
			resource.unload();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Model generated at: " + file.getAbsolutePath());
		
	}
	
	public void generateModelConsistencyVariableTasks(int modelId, int numberOfTasksWithReferences, int totalNumberOfTasks) {
		
		String effortsWithReferences = "Alice : 2\nBob : 4\nCharlie : 6";
		String effortsWithoutReferences = "Bob : 1\nCharlie : 3\nDavid : 5";
		String duplicatedEffortsWithReferences = IntStream.range(0, EvaluationData.TimesEfforts).mapToObj(i -> effortsWithReferences).collect(Collectors.joining("\n"));
		String duplicatedEffortsWithoutReferences = IntStream.range(0, EvaluationData.TimesEfforts).mapToObj(i -> effortsWithoutReferences).collect(Collectors.joining("\n"));
		
		File file = new File(EvaluationData.GeneratedModelsDirectory + EvaluationData.ModelFileName + modelId + "." + EvaluationData.ModelExtension);
		URI uri = URI.createFileURI(file.getAbsolutePath());
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(uri);

		int numberOfTasksWithoutReferences = totalNumberOfTasks - numberOfTasksWithReferences;
		
		WorkloadFactory factory = workload.impl.WorkloadFactoryImpl.init();
		
		Project project = factory.createProject();
		
		Person alice = factory.createPerson();
		alice.setName("Alice");
		
		Person bob = factory.createPerson();
		bob.setName("Bob");
		
		Person charlie = factory.createPerson();
		charlie.setName("Charlie");
		
		Person david = factory.createPerson();
		david.setName("David");
		
		project.getPeople().add(alice);
		project.getPeople().add(bob);
		project.getPeople().add(charlie);
		project.getPeople().add(david);
	
		for (int i = 0; i < totalNumberOfTasks; i++) {
			Task task = factory.createTask();
			task.setName("Task_" + i);
			project.getTasks().add(task);
			if (i < numberOfTasksWithoutReferences) {
				task.setEffortsExpression(duplicatedEffortsWithoutReferences);
			}
			else {
				task.setEffortsExpression(duplicatedEffortsWithReferences);
			}
		}
		
		resource.getContents().add(project);
		
		try {
			resource.save(null);
			resource.unload();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Model generated at: " + file.getAbsolutePath());
		
	}
	
}