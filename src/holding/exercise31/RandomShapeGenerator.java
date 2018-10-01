package holding.exercise31;
import java.util.*;

public class RandomShapeGenerator implements Iterable<Shape> {
	private Random rand = new Random(47);
	private int numberOfShapes;
	
	public RandomShapeGenerator(int numberOfShapes) {
		this.numberOfShapes = numberOfShapes;
	}

	public int getNumberOfShapes() {
		return numberOfShapes;
	}

	@Override
	public Iterator<Shape> iterator() {
		return new Iterator<Shape>() {
			private int currentShape = 0;

			@Override
			public boolean hasNext() {
				return currentShape < numberOfShapes;
			}

			@Override
			public Shape next() {
				currentShape++;
				switch (rand.nextInt(3)) {
				default:
				case 0:
					return new Circle();
				case 1:
					return new Square();
				case 2:
					return new Triangle();
				}
			}
		};
	}
}
