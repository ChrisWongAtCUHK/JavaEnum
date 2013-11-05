// Do one more refinement by fine grained locking or say using double check algo
public class DoubleCheckedSingleton {

	private static DoubleCheckedSingleton instance = null;
	
	// private constructor 
	private DoubleCheckedSingleton(){

	}

	// public static constructor
	public static DoubleCheckedSingleton getInstance(){
		if(instance == null)
		{
			synchronized (DoubleCheckedSingleton.class) {
				if(instance == null)
					instance = new DoubleCheckedSingleton();
			}
		}
		return instance;
	}
	
	public void sayHello(){
		System.out.println("Double Checked Singleton is saying Hello");
	}

	public void sayBye(){
		System.out.println("Double Checked Singleton is saying Bye Bye");
	}

}
