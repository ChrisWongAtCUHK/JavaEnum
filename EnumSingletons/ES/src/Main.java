import static java.lang.System.out;

public class Main {
	public static void main(String[] args){
		// test for EasySingleton
		EasySingleton es = EasySingleton.INSTANCE;
		out.println(es);
		
		// Test for DoubleCheckedLockingSingleton
		DoubleCheckedLockingSingleton dels = DoubleCheckedLockingSingleton.getInstance();
		out.println(dels);
		
		// Test for Singleton
		Singleton singleton = Singleton.getSingleton();
		out.println(singleton);
	}
}