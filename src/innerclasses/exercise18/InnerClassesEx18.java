package innerclasses.exercise18;

public class InnerClassesEx18 {
	private static class Nested {
		private int value = 23;
		private String str = "Dragos";
	}
	
	public static Nested nested() {
		return new Nested();
	}
 	
	public static void main(String[] args) {
		Nested nested = nested();
		System.out.println("Name: " + nested.str);
		System.out.println("Age: " + nested.value);
	}
}
