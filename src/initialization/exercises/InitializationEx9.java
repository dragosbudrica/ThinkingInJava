package initialization.exercises;

class ThisConstructors {
	 ThisConstructors() {
		this("Constructor with String arg called!");
		System.out.println("Default Constructor!");
	}
	
	 ThisConstructors(String message) {
		System.out.println(message);
	}
}

public class InitializationEx9 {
	public static void main(String[] args) {
		new ThisConstructors();
	}
}
