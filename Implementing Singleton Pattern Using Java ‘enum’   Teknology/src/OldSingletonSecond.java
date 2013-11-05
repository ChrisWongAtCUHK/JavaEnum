/*
 * Create the Singleton Object even before it is actually required.
 */
public class OldSingletonSecond {

	private static OldSingletonSecond instance = new OldSingletonSecond();
	
	// Making constructor private and 
	private OldSingletonSecond(){

	}

	// Having another factory method to get instance
	public static OldSingletonSecond getInstance(){
		return instance;
	}

	public void sayHello(){
		System.out.println("The Singleton Object is created even before it is actually required.");
	}

	public void sayBye(){
		System.out.println("The Singleton Object is created even before it is actually required.");
	}
}
