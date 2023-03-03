package graphite.shared;

public class Settings {

	private static boolean isRefactor = true;

	public static boolean isRefactor() {
		return isRefactor;
	}

	public static void setRefactor(boolean refactor) {
		isRefactor = refactor;
	}
	
}