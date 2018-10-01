package innerclasses.exercise13;

interface Interface {
	void method1();
	void method2();
	void method3();
}

class Outer {
	public Interface method() {
		return new Interface() {
			@Override
			public void method1() {
				System.out.println("Method1");
			}
			@Override
			public void method2() {
				System.out.println("Method2");
			}
			@Override
			public void method3() {
				System.out.println("Method3");
			}
		};
	}
	
}

public class InnerClassesEx13 {
	public static void main(String[] args) {
		Outer ex13 = new Outer();
		Interface inner = ex13.method();
		inner.method1();
		inner.method2();
		inner.method3();
	}
}

