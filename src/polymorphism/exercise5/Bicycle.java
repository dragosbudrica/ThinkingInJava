package polymorphism.exercise5;

public class Bicycle extends Cycle {
	@Override
	public void ride() {
		System.out.println("Riding Bicycle");
	}
	@Override
	public int wheels() {
		return 2;
	}
}
