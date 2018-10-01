package innerclasses.exercise3;

class Outer {
	private String aString;
	public Outer(String aString) {
		this.aString = aString;
	}
	class Inner {
		public String toString() {
			return aString;
		}
	}
	public Inner inner() {
		return new Inner();
	}
}

public class InnerClassesEx3 {
	public static void main(String[] args) {
		Outer outer = new Outer("test");
		Outer.Inner inner = outer.inner();
		System.out.println(inner);
	}
}
