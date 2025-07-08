package workload.impl;

import org.eclipse.emf.ecore.EFactory;

import graphite.textual.XtextBaseFactory;

import workload.WorkloadFactory;
import workload.Task;

public class XtextWorkloadFactoryImpl extends WorkloadFactoryImpl implements XtextBaseFactory {

	private static EFactory baseFactory;
	
	public EFactory getBaseFactory() {
		return baseFactory;
	}
	
	public static WorkloadFactory init() {
		baseFactory = WorkloadFactoryImpl.init();
		return new XtextWorkloadFactoryImpl();
	}
	
	@Override
	public Task createTask() {
		TaskImpl task = new XtextTaskImpl();
		return task;
	}
	
} //XtextWorkloadFactoryImpl