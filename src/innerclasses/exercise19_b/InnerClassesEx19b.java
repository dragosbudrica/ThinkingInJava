package innerclasses.exercise19_b;

public class InnerClassesEx19b {
	static class Nested1 {
		static class Nested2 {}
	}
	public static void main(String[] args) {
		new InnerClassesEx19b(); // InnerClassesEx19a.class, InnerClassesEx19a$Nested1.class, InnerClassesEx19a$Nested1$Nested2.class
		// the name of the outer class, the name of the outer class appended with $ appended with the most outer nested class, the name of the outer class appended with $ appended with the most outer nested class appended with $ appended with the most nested nested class
	}
}
