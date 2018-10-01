package interfaces.exercise8;

interface FastFood {
	void prepare();
	void taste();
	void eat();
}

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

class Lunch extends Meal {
	Lunch() { System.out.println("Lunch()"); }
}

class PortableLunch extends Lunch {
	PortableLunch() { System.out.println("PortableLunch()"); }
}
class Sandwich extends PortableLunch implements FastFood {
	@SuppressWarnings("unused")
	private Bread b = new Bread();
	@SuppressWarnings("unused")
	private Cheese c = new Cheese();
	@SuppressWarnings("unused")
	private Lettuce l = new Lettuce();
	public Sandwich() { System.out.println("Sandwich()"); }
	
	public void prepare() {
		System.out.println("Prepare Sandwich");
	}
	
	public void taste() {
		System.out.println("Taste Sandwich");
	}
	
	public void eat() {
		System.out.println("Eat Sandwich");
	}
	
	public static void main(String[] args) {
		FastFood sandwich = new Sandwich();
		sandwich.prepare();
		sandwich.taste();
		sandwich.eat();
	}
}

public class InterfacesEx8 {
	public static void main(String[] args) {
		Sandwich.main(args);
	}
}