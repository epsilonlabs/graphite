package graphite.shared;

public class Settings {

	final public static String xtextWidgetId = "graphite.xtextwidgetViewer";
	private static boolean isRefactor = true;
	private static boolean mergeDerivedModelElements = false;
	private static boolean storeDerivedModelElements = false;
	private static boolean validateDiagramEditor = true;

	public static boolean isRefactor() {
		return isRefactor;
	}

	public static void setRefactor(boolean refactor) {
		isRefactor = refactor;
	}
	
	public static boolean isMergeDerivedModelElements() {
		return mergeDerivedModelElements;
	}

	public static void setMergeDerivedModelElements(boolean mergeDerivedModelElements) {
		Settings.mergeDerivedModelElements = mergeDerivedModelElements;
	}
	
	public static boolean isStoreDerivedModelElements() {
		return storeDerivedModelElements;
	}

	public static void setStoreDerivedModelElements(boolean storeDerivedModelElements) {
		Settings.storeDerivedModelElements = storeDerivedModelElements;
	}
	
	public static boolean isValidateDiagramEditor() {
		return validateDiagramEditor;
	}
	
	public static void setValidateDiagramEditor(boolean validateDiagramEditor) {
		Settings.validateDiagramEditor = validateDiagramEditor;
	}
	
}