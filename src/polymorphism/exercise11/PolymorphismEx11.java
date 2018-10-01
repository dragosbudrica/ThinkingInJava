package polymorphism.exercise11;

class Meal {
	Meal() { System.out.println("Meal()"); }
}

class Bread {
	Bread() { System.out.println("Bread()"); }
}

class Cheese {
	Cheese() { System.out.println("Cheese()"); }
}

class Lettuce {
	Lettuce() { System.out.println("Lettuce()"); }
}

class Pickle {
	Pickle() { System.out.println("Pickle()"); }
}

class Lunch extends Meal {
	Lunch() { System.out.println("Lunch()"); }
}

class PortableLunch extends Lunch {
	PortableLunch() { System.out.println("PortableLunch()"); }
}
class Sandwich extends PortableLunch {
	@SuppressWarnings("unused")
	private Bread b = new Bread();
	@SuppressWarnings("unused")
	private Cheese c = new Cheese();
	@SuppressWarnings("unused")
	private Lettuce l = new Lettuce();
	@SuppressWarnings("unused")
	private Pickle p = new Pickle();
	public Sandwich() { System.out.println("Sandwich()"); }
	public static void main(String[] args) {
		new Sandwich();
	}
}

public class PolymorphismEx11 {
	public static void main(String[] args) {
		Sandwich.main(args);
	}
}
