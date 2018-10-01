package polymorphism.exercise5;

public class PolymorphismEx5 {
	public static void ride(Cycle c) {
		System.out.println("---------------------------------");
		c.ride();
		System.out.println("Number of wheels: " + c.wheels());
	}
	public static void main(String[] args) {
		Unicycle u = new Unicycle();
		Bicycle b = new Bicycle();
		Tricycle t = new Tricycle();
		ride(u);
		ride(b);
		ride(t);
	}
}
