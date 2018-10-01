package interfaces.exercise18;

public class UnicycleFactory implements CycleFactory {
	@Override
	public Cycle getCycle() {
		return new Unicycle();
	}
}
