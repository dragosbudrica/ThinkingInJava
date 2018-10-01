package reusing.exercises;

class Insect2 {
	private int i = 9;
	protected int j;
	Insect2() {
		System.out.println("i = " + i + ", j = " + j);
		j = 39;
	}
	@SuppressWarnings("unused")
	private static int x1 =
			printInit("static Insect.x1 initialized");
	static int printInit(String s) {
		System.out.println(s);
		return 47;
	}
}

class Beetle2 extends Insect2 {
	private int k = printInit("Beetle.k initialized");
	public Beetle2() {
		System.out.println("k = " + k);
		System.out.println("j = " + j);
	}
	@SuppressWarnings("unused")
	private static int x2 =
			printInit("static Beetle.x2 initialized");
} 
class ColoradoPotatoBeetle extends Beetle2 {
	private int l = printInit("ColoradoPotatoBeetle.l initialized");
	public ColoradoPotatoBeetle() {
		System.out.println("l = " + l);
		System.out.println("j = " + j);
	}
	@SuppressWarnings("unused")
	private static int x3 =
			printInit("static ColoradoPotatoBeetle.x3 initialized");
}

public class ReusingEx24 {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		ColoradoPotatoBeetle c = new ColoradoPotatoBeetle(); // first of all, the static fields are initialized from the most base class to the most derived class, and after that, instance fields and constructors are initialized/called in the same order.
	}
}

