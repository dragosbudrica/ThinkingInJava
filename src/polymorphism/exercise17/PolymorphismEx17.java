package polymorphism.exercise17;

public class PolymorphismEx17 {
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
		
		
		Cycle[] cycles = {
				new Unicycle(),
				new Bicycle(),
				new Tricycle()
		};
		
		for(@SuppressWarnings("unused") Cycle c: cycles) {
		// c.balance(); // Compile time: method not found in Cycle
		}
		((Unicycle)cycles[0]).balance();
		((Bicycle)cycles[1]).balance();
		// ((Tricycle)cycles[2]).balance(); // Compile time: method not found in Cycle
	}
}
