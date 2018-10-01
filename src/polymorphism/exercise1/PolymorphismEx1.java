package polymorphism.exercise1;

public class PolymorphismEx1 {
	public static void ride(Cycle c) {
		c.ride();
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
