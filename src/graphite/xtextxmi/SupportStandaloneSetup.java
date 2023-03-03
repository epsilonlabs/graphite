package graphite.xtextxmi;

public class SupportStandaloneSetup {
	
	public static void setup() {
		new SupportStandaloneSetup();
	}
	
	public SupportStandaloneSetup() {
		new ResourceSupport().registerServices(false);
	}
	
}