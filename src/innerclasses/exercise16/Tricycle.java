package innerclasses.exercise16;

public class Tricycle implements Cycle {
	public static CycleFactory factory = new CycleFactory() {
		@Override
		public Cycle getCycle() {
			return new Tricycle();
		}
	};
	@Override
	public void ride() {
		System.out.println("Riding Tricycle");
	}
}
