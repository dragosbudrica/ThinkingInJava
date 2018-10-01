package innerclasses.exercise19_a;

public class InnerClassesEx19a {
	class Inner1 {
		class Inner2 {}
	}
	public static void main(String[] args) {
		new InnerClassesEx19a(); // InnerClassesEx19a.class, InnerClassesEx19a$Inner1.class, InnerClassesEx19a$Inner1$Inner2.class
		// the name of the outer class, the name of the outer class appended with $ appended with the most outer inner class, the name of the outer class appended with $ appended with the most outer inner class appended with $ appended with the most inner inner class
	}
}
