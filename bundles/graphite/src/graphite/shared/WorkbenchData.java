package graphite.shared;

public class WorkbenchData {

	final public static String RENAME_COMMAND = "graphite.renameCommand";
	
	protected static ModelData modelData;

	public static ModelData getModelData() {
		return modelData;
	}

	public static void setModelData(ModelData modelData) {
		WorkbenchData.modelData = modelData;
	}
	
}