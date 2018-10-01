package polymorphism.exercise5;

public class Tricycle extends Cycle {
	@Override
	public void ride() {
		System.out.println("Riding Tricycle");
	}
	@Override
	public int wheels() {
		return 3;
	}
}
