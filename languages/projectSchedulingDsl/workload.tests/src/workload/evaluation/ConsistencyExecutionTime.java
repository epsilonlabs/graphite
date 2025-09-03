package workload.evaluation;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.Before;
import org.junit.Test;

import graphite.textual.XtextXMIResourceFactoryImpl;
import workload.Person;
import workload.Project;
import workload.WorkloadPackage;

public class ConsistencyExecutionTime {
	
	@Before
	public void setup() throws Exception {
		WorkloadPackage.eINSTANCE.eClass();		
	}
	
	@Test
	public void renameReferenceExecutionTime() {
		
		List<Long> renameReferenceDurations = new ArrayList<Long>();
	
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
			 		Person alice = project.getPeople().get(0);
			 		
			 		long startTime = System.nanoTime();
			 		
					alice.setName("AliceX");
					
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
	 		
			renameReferenceDurations.add(averageModelDuration);
			
			System.out.println("RenameReferenceX Duration [" + (i+1) + "]: " + String.format("%.5f", (renameReferenceDurations.get(i) / 1_000_000_000.0)));
		}
		
		for (int i = 0; i < renameReferenceDurations.size(); i++) {
			System.out.println("RenameReference Duration [" + (i+1) + "]: " + String.format("%.5f", (renameReferenceDurations.get(i) / 1_000_000_000.0)));
		}
		
	}
	
	@Test
	public void deleteReferenceExecutionTime() {
		
		List<Long> deleteReferenceDurations = new ArrayList<Long>();
	
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
				    Person alice = project.getPeople().get(0);

				    long startTime = System.nanoTime();

				    EcoreUtil.delete(alice);

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
	 		
			deleteReferenceDurations.add(averageModelDuration);
			
			System.out.println("DeleteReferenceX Duration [" + (i+1) + "]: " + String.format("%.5f", (deleteReferenceDurations.get(i) / 1_000_000_000.0)));

		}
		
		for (int i = 0; i < deleteReferenceDurations.size(); i++) {
			System.out.println("DeleteReference Duration [" + (i+1) + "]: " + String.format("%.5f", (deleteReferenceDurations.get(i) / 1_000_000_000.0)));
		}
		
	}
	
	@Test
	public void deleteReferenceLargestModel() {
		
		try {
			File file = new File(EvaluationData.GeneratedModelsDirectory + EvaluationData.ModelFileName + 5 + "." + EvaluationData.ModelExtension);
		    URI uri = URI.createFileURI(file.getAbsolutePath());
		    ResourceSet resourceSet = new ResourceSetImpl();
		    resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(EvaluationData.ModelExtension, new XtextXMIResourceFactoryImpl());
		    Resource resource = resourceSet.createResource(uri);
		    resource.load(null);
		    
		    Project project = (Project)resource.getContents().get(0);
		    Person alice = project.getPeople().get(0);

		    long startTime = System.nanoTime();

		    EcoreUtil.delete(alice);

		    long endTime = System.nanoTime();
		    long duration = endTime - startTime;

			System.out.println("DeleteReference Duration: " + String.format("%.5f", (duration / 1_000_000_000.0)));

		    resource.unload();
		}
		catch (Exception e) {
		    e.printStackTrace();
		}
		
	}
	
	@Test
	public void renameReferenceLargestModel() {
		
		try {
			File file = new File(EvaluationData.GeneratedModelsDirectory + EvaluationData.ModelFileName + 1 + "." + EvaluationData.ModelExtension);
		    URI uri = URI.createFileURI(file.getAbsolutePath());
		    ResourceSet resourceSet = new ResourceSetImpl();
		    resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(EvaluationData.ModelExtension, new XtextXMIResourceFactoryImpl());
		    Resource resource = resourceSet.createResource(uri);
		    resource.load(null);

		    Project project = (Project)resource.getContents().get(0);
		    Person alice = project.getPeople().get(0);

		    long startTime = System.nanoTime();

		    alice.setName("AliceX");

		    long endTime = System.nanoTime();
		    long duration = endTime - startTime;

			System.out.println("RenameReference Duration: " + String.format("%.5f", (duration / 1_000_000_000.0)));

		    resource.unload();
		}
		catch (Exception e) {
		    e.printStackTrace();
		}
		
	}
		
}
