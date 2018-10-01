package interfaces.exercise18;

public class InterfacesEx18 {
	public static void ride(CycleFactory cf) {
		Cycle c = cf.getCycle();
		c.ride();
	}
	public static void main(String[] args) {
		ride(new UnicycleFactory());
		ride(new BicycleFactory());
		ride(new TricycleFactory());
	}
}
