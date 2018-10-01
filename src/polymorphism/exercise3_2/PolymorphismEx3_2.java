package polymorphism.exercise3_2;

class Shapes {
	private static RandomShapeGenerator gen =
			new RandomShapeGenerator();
	public static void main(String[] args) {
		Shape[] s = new Shape[9];
		for(int i = 0; i < s.length; i++)
			s[i] = gen.next();
		for(Shape shp : s) {
			System.out.println("------------------");
			shp.draw();
			shp.printMessage();
		}
	}
}

public class PolymorphismEx3_2 {
	public static void main(String[] args) {
		Shapes.main(args);
	}
}
