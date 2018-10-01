package innerclasses.exercise23;

public class A {
	U makeU() {
		return new U() {
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
