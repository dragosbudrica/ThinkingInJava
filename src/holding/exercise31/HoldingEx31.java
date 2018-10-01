package holding.exercise31;

class Shapes {
	public static void main(String[] args) {
		for(Shape shp : new RandomShapeGenerator(9))
			shp.draw();
	}
}

public class HoldingEx31 {
	public static void main(String[] args) {
		Shapes.main(args);
	}
}
