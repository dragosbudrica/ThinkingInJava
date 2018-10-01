package interfaces.exercise4_2;

abstract class InterfacesEx4Base {
	abstract void method1();
}

class InterfacesEx4Derived extends InterfacesEx4Base {
	public void method1() { System.out.println("Method1"); }
	
	public static void method2(InterfacesEx4Base ex4) {
		ex4.method1();
	}
}

public class InterfacesEx4_2 {
	public static void main(String[] args) {
		InterfacesEx4Derived.method2(new InterfacesEx4Derived());
	}
}
