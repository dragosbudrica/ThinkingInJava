package operators.exercises;

class ConstantProperties {
	int distance = 500; 
	int time = 1; 
}

public class OperatorsEx4 {
	public static void main(String[] args) {
		ConstantProperties properties = new ConstantProperties();
		
		int displacementInMetres = properties.distance * 1000;
		int timeInSeconds = properties.time * 60 * 60;
		
		int velocity = displacementInMetres / timeInSeconds;
		System.out.println("The velocity is " + velocity + " m/s");
	}
}
