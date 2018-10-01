package innerclasses.exercise21;

interface Interface {
	void method1();
	void method2();
	void method3();
	
	static class NestedClass2 {
		static void callInterfaceMethod(Interface int5) {
			int5.method1();
			int5.method2();
			int5.method3();
		}
	}
}

class Class implements Interface {
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

public class InnerClassesEx21 {
	public static void main(String[] args) {
		Interface.NestedClass2.callInterfaceMethod(new Class());
	}
}
