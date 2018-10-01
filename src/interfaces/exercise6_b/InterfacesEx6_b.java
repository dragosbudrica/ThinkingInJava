package interfaces.exercise6_b;
import interfaces.exercise6_a.InterfacesEx6_a;

public class InterfacesEx6_b implements InterfacesEx6_a {
	public void method1() { System.out.println("Method1");}
	public void method2() { System.out.println("Method2");}
	public void method3() { System.out.println("Method3");}
	
	public static void main(String[] args) {
		InterfacesEx6_a ex6 = new InterfacesEx6_b();
		ex6.method1();
		ex6.method2();
		ex6.method3();
	}
}
