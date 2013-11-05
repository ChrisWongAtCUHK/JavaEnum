public class TestSingleton {

	public static void main(String[] args) {
		// Old Singleton version 1: not thread safe
		OldSingletonFirst oldSingletonFirst = OldSingletonFirst.getInstance();
		oldSingletonFirst.sayHello();
		oldSingletonFirst.sayBye();
	
		// Old Singleton version 2: creates the Singleton Object even before it is actually required
		OldSingletonSecond oldSingletonSecond = OldSingletonSecond.getInstance();
		oldSingletonSecond.sayHello();
		oldSingletonSecond.sayBye();
		
		// Old Singleton with Synchronized getInstance() method test
		OldSingletonSynchronized oldSingletonSynchronized = OldSingletonSynchronized.getInstance();
		oldSingletonSynchronized.sayHello();
		oldSingletonSynchronized.sayBye();
		
		// Double Checked Singleton test
		DoubleCheckedSingleton doubleCheckedSingleton = DoubleCheckedSingleton.getInstance();
		doubleCheckedSingleton.sayHello();
		doubleCheckedSingleton.sayBye();
		
		// enum version 1
		/* 
		 * Obviously the sayHello() and sayBye() is not thread safe(since we have not made them thread safe).
		 */
		EnumSingleton.INSTANCE.sayHello();
		EnumSingleton.INSTANCE.sayBye();
		
		// enum version 2
		/* 
		 * As far as creation of singleton instance is concern 
		 * ‘It is completely thread safe’. 
		 * Also since enum is special type of java class and it can have methods and other variables. 
		 * So we can add all other required stuff to the enum class and use where ever required.
		 */
		EnumSingleton singleton = EnumSingleton.INSTANCE;
		singleton.sayHello();
		singleton.sayBye();
	}

}
