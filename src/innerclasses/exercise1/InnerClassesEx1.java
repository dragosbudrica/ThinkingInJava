package innerclasses.exercise1;

class Outer {
	class Inner {
		Inner() {
			System.out.println("Inner Default Constructor");
		}
	}
	public Inner inner() {
		return new Inner();
	}
}

public class InnerClassesEx1 {
	public static void main(String[] args) {
		Outer outer = new Outer();
		@SuppressWarnings("unused")
		Outer.Inner inner = outer.inner();
	}
}
