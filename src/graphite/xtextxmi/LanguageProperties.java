package graphite.xtextxmi;

public class LanguageProperties {

	protected static String languageName;
	protected static String editorId;
	protected static String fileExtensions;
	protected static String xtextWidgetId;
	
	public static String getLanguageName() {
		return languageName;
	}
	
	public static void setLanguageName(String languageName) {
		LanguageProperties.languageName = languageName;
	}
	
	public static String getEditorId() {
		return editorId;
	}
	
	public static void setEditorId(String editorId) {
		LanguageProperties.editorId = editorId;
	}

	public static String getFileExtensions() {
		return fileExtensions;
	}
	
	public static void setFileExtensions(String fileExtensions) {
		LanguageProperties.fileExtensions = fileExtensions;
	}
	
	public static String getXtextWidgetId() {
		return xtextWidgetId;
	}
	
	public static void setXtextWidgetId(String xtextWidgetId) {
		LanguageProperties.xtextWidgetId = xtextWidgetId;
	}

	
}
