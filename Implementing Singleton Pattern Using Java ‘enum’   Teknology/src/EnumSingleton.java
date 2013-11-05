// Use enum
public enum EnumSingleton {
	INSTANCE;

	public void sayHello(){
		System.out.println("Hello, I am using enum to implement Singleton");
	}

	public void sayBye(){
		System.out.println("Bye Bye, I am using enum to implement Singleton");
	}
}
