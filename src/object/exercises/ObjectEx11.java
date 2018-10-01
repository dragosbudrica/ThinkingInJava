package object.exercises;

public class ObjectEx11 {
	int anIntegerRepresentingColors;
	
	int red = 0;
	int orange = 1;
	int yellow = 2;
	int green = 3;
	int blue = 4;
	int indigo = 5;
	int violet = 6;
	
	int currentColor;
	void changeTheHueOfTheColor(int newHue) {
		 currentColor = newHue;
	}

	public static void main(String[] args) {
		ObjectEx11 color = new ObjectEx11();
		color.anIntegerRepresentingColors = 7;
		color.changeTheHueOfTheColor(color.blue);
		
		System.out.println(color.currentColor);
	}
}
