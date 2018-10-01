package innerclasses.exercise6_b;
import innerclasses.exercise6_a.InnerClassesEx6_a;

public class InnerClassesEx6_b {
	protected static class Inner implements InnerClassesEx6_a {
		public Inner() {}
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
}
