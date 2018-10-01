package initialization.exercises;

class ClassWithDefaultConstructor {
	ClassWithDefaultConstructor() {
		System.out.println("The default constructor of ClassWithDefaultConstructor was called.");
	}
}

public class InitializationEx3 {
	public static void main(String[] args) {
		new ClassWithDefaultConstructor();
	}
}
