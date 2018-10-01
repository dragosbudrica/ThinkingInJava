package innerclasses.exercise11_b;
import innerclasses.exercise11_a.InnerClassesEx11_a;

class Outer {
	  private class Inner implements InnerClassesEx11_a {
		@Override
		public void method1() {
			System.out.println("Method1");
		}
	}
	public InnerClassesEx11_a method() {	
		return new Inner();
	}
}
public class InnerClassesEx11_b {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.method().method1();
		
	//	Outer.Inner in = ((Inner) outer).method();  // The type Outer.Inner is not visible
	}
}
