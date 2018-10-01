package innerclasses.exercise16;

public class InnerClassesEx16 {
	public static void ride(CycleFactory cf) {
		Cycle c = cf.getCycle();
		c.ride();
	}
	public static void main(String[] args) {
		ride(Unicycle.factory);
		ride(Bicycle.factory);
		ride(Tricycle.factory);
	}
}
