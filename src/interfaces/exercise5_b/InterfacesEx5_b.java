package interfaces.exercise5_b;
import interfaces.exercise5_a.InterfacesEx5_a;

public class InterfacesEx5_b implements InterfacesEx5_a {
	public void method1() { System.out.println("Method1");}
	public void method2() { System.out.println("Method2");}
	public void method3() { System.out.println("Method3");}
	
	public static void main(String[] args) {
		InterfacesEx5_a ex5 = new InterfacesEx5_b();
		ex5.method1();
		ex5.method2();
		ex5.method3();
	}
}
