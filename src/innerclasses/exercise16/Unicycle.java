package innerclasses.exercise16;

public class Unicycle implements Cycle {
	public static CycleFactory factory = new CycleFactory() {
		@Override
		public Cycle getCycle() {
			return new Unicycle();
		}
	};
	@Override
	public void ride() {
		System.out.println("Riding Unicycle");
	}
}
