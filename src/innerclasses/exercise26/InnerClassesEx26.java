package innerclasses.exercise26;

class Outer {
	class Inner {
		protected String name;
		protected int age;
		Inner(String name, int age) {
			this.name = name;
			this.age = age;
		}
		public int getAge() {
			return age;
		}
		public String getName() {
			return name;
		}
	}
}

class Outer2 {
	class Inner2 extends Outer.Inner {
		Inner2(Outer out) {
			out.super("Dragos", 23);
		}
	}
}

public class InnerClassesEx26 {
	public static void main(String[] args) {
		Outer2 outer2 = new Outer2();
		Outer2.Inner2 inner2 = outer2.new Inner2(new Outer());
		System.out.println("Name: " + inner2.name + "\nAge: " + inner2.age);
	} 
}
