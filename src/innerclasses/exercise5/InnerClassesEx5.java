package innerclasses.exercise5;

class Outer {
	class Inner {
		public String toString() {
			return "Inner";
		}
	}
}

public class InnerClassesEx5 {
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner o3i = outer.new Inner();
		System.out.println(o3i);
	}
}