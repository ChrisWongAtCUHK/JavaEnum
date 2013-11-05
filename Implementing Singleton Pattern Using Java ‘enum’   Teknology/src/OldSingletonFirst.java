/*
 * Not thread safe
 */
public class OldSingletonFirst {

	private static OldSingletonFirst instance = null;
	
	// Making constructor private and 
	private OldSingletonFirst(){

	}

	// Having another factory method to get instance
	public static OldSingletonFirst getInstance(){
		if(instance == null)
			instance = new OldSingletonFirst();
		return instance;
	}

	public void sayHello(){
		System.out.println("I am NOT thread safe.");
	}

	public void sayBye(){
		System.out.println("I am NOT thread safe.");
	}
}
