package innerclasses.exercise10;

interface Interface {
	public void method1();
	public void method2();
	public void method3();
}

class Outer {
	public Interface method(int a) {
		if (a < 10) {
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
	return null;
	}
}

public class InnerClassesEx10 {
	public static void main(String[] args) {
		Outer ex10 = new Outer();
		Interface inner = ex10.method(5);
		inner.method1();
		inner.method2();
		inner.method3();
	}
}
