package innerclasses.exercise6_c;
import innerclasses.exercise6_a.InnerClassesEx6_a;
import innerclasses.exercise6_b.InnerClassesEx6_b;

public class InnerClassesEx6_c extends InnerClassesEx6_b {
	public InnerClassesEx6_a method4() {
		return new Inner();
	}
	public static void main(String[] args) {
		InnerClassesEx6_c c = new InnerClassesEx6_c();
		InnerClassesEx6_a i  = c.method4();
		i.method1();
		i.method2();
		i.method3();
	}
}
