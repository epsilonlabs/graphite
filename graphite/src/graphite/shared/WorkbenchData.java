package graphite.shared;

public class WorkbenchData {

	protected static ModelData modelData;

	public static ModelData getModelData() {
		return modelData;
	}

	public static void setModelData(ModelData modelData) {
		WorkbenchData.modelData = modelData;
	}
	
}