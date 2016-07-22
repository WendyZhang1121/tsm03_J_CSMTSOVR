package tsm03_J_CSMTSOVR;

//Mutable but thread-safe Helper 
public class Helper {

	private volatile int n;
	private final Object lock = new Object();

	public Helper(int n) { 
		this.n = n;
	}
	
	public void setN(int value) { 
		synchronized (lock) {
			n = value; 
			}
	} 
}
