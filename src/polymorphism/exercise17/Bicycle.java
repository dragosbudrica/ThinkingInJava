package polymorphism.exercise17;

public class Bicycle extends Cycle {
	@Override
	public void ride() {
		System.out.println("Riding Bicycle");
	}
	public void balance() {
		System.out.println("Balancing Bicycle");
	}
}
