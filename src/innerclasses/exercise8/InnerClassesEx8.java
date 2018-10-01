package innerclasses.exercise8;

class Outer {
	class Inner {
		private int intNumber1 = 10;
		private String str = "Hello!";
	}
	
	public void modifyAndDisplayInnerFields() {
		Inner inner = new Inner();
		System.out.println("Int Number = " + inner.intNumber1);
		System.out.println("String = " + inner.str);
		System.out.println("--------------------------------");
		inner.intNumber1 = 11;
		inner.str = "Hello, World!";
		System.out.println("Int Number = " + inner.intNumber1);
		System.out.println("String = " + inner.str);
	}	
}

public class InnerClassesEx8 {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.modifyAndDisplayInnerFields();
	}
}