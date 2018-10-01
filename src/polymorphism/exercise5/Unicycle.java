package polymorphism.exercise5;

public class Unicycle extends Cycle {
	@Override
	public void ride() {
		System.out.println("Riding Unicycle");
	}
	@Override
	public int wheels() {
		return 1;
	}
}
