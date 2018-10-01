package initialization.exercises;

class ClassWithDefaultAndNonDefaultConstructor {
	ClassWithDefaultAndNonDefaultConstructor() {
		System.out.println("The default constructor of ClassWithDefaultAndNonDefaultConstructor was called");
	}
	ClassWithDefaultAndNonDefaultConstructor(String str) {
		System.out.println("The overloaded constructor of ClassWithDefaultAndNonDefaultConstructor was called. The string is " + str);
	}
}
public class InitializationEx4 {
	public static void main(String[] args) {
		new ClassWithDefaultAndNonDefaultConstructor();
		new ClassWithDefaultAndNonDefaultConstructor("Dragos");
	}
}
