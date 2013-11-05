/* 
 * Both has pros and cons, first one is not thread safe and 
 * the second creates the Singleton Object even before it is actually required. 
 * Some times we refine our first approach to make it thread safe, 
 * so we made getInstance() method syncronized
*/
public class OldSingletonSynchronized {

	private static OldSingletonSynchronized instance = null;
	private OldSingletonSynchronized(){

	}

	// made getInstance() method syncronized
	public static synchronized OldSingletonSynchronized getInstance(){
		if(instance == null)
			instance = new OldSingletonSynchronized();
		return instance;
	}
	
	public void sayHello(){
		System.out.println("Some times we refine our first approach to make it thread safe, so we made getInstance() method syncronized.");
	}

	public void sayBye(){
		System.out.println("Some times we refine our first approach to make it thread safe, so we made getInstance() method syncronized.");
	}

}
