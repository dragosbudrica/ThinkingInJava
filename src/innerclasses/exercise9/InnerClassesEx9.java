package innerclasses.exercise9;

interface Interface {
	void method1();
	void method2();
	void method3();
}

class Outer {
	public Interface method() {
		class Inner implements Interface {
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
		}
		return new Inner();
	}
}

public class InnerClassesEx9 {
	public static void main(String[] args) {
		Outer ex9 = new Outer();
		Interface inner = ex9.method();
		inner.method1();
		inner.method2();
		inner.method3();
	}
}
