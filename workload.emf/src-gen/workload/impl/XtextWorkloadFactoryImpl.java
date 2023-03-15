package workload.impl;

import graphite.shared.ModelData;
import graphite.shared.WorkbenchData;
import workload.WorkloadFactory;
import workload.Task;

public class XtextWorkloadFactoryImpl extends WorkloadFactoryImpl {

	public static WorkloadFactory init() {
		ModelData modelData = new ModelData(PropertiesData.xtextFactory, PropertiesData.derivedPropertiesData, PropertiesData.derivedPairsMappings, PropertiesData.identifierByType);
		WorkbenchData.setModelData(modelData);
		return new XtextWorkloadFactoryImpl();
	}
	
	@Override
	public Task createTask() {
		TaskImpl task = new XtextTaskImpl();
		return task;
	}
	
} //XtextWorkloadFactoryImpl