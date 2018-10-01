package innerclasses.exercise23;

public class InnerClassesEx23 {
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A();
		A a3 = new A();
		A a4 = new A();
		B b = new B();
		b.addElement(a1.makeU());
		b.addElement(a2.makeU());
		b.addElement(a3.makeU());
		b.addElement(a4.makeU());
		b.move();
		b.setElemenToNull(1);
		b.setElemenToNull(3);
		b.move();
	}
}
