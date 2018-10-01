package innerclasses.exercise20;

interface Interface {
	static class NestedClass {
		public void method() {
			System.out.println("Method1");
		}
	}
}

class Class implements Interface {}

public class InnerClassesEx20 {
	public static void main(String[] args) {
		Interface.NestedClass nc = new Interface.NestedClass();
		nc.method();
	}
}
