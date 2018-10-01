package innerclasses.exercise16;

public class Bicycle implements Cycle {
	public static CycleFactory factory = new CycleFactory() {
		@Override
		public Cycle getCycle() {
			return new Bicycle();
		}
	};
	@Override
	public void ride() {
		System.out.println("Riding Bicycle");
	}
}
