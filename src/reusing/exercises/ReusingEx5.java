package reusing.exercises;

class A {
	A() {System.out.println("Constructor A called");}
}

class B {
	B() {System.out.println("Constructor B called");}
}

class C extends A {
	@SuppressWarnings("unused")
	private B b = new B();
}

public class ReusingEx5 {
	public static void main(String[] args) {
		new C();
	}
}
