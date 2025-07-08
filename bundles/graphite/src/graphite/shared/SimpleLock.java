package graphite.shared;

public class SimpleLock {
	
	private boolean isLocked = false;
	
	public synchronized void lock() {
		isLocked = true;
	}
	
	public synchronized void unlock() {
		isLocked = false;
	}
	
	public boolean isLocked() {
		return isLocked;
	}
}