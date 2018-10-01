package interfaces.exercise13;

interface Interface1 {
	void method1();
}
interface Interface2 extends Interface1 {
	void method2();
}
interface Interface3 extends Interface1, Interface2 {
	void method3();
}

class Cls implements Interface1, Interface2, Interface3 {
	public void method1() {
		System.out.println("Method1");
	}
	public void method2() {
		System.out.println("Method2");
	}
	public void method3() {
		System.out.println("Method3");
	}
}

public class InterfacesEx13 {
	public static void u(Interface1 x) { x.method1(); }
	public static void v(Interface2 x) { x.method2(); }
	public static void x(Interface3 x) { x.method3(); }
	public static void main(String[] args) {
			Cls c = new Cls();
			u(c);
			v(c);
			x(c);
	}
}
