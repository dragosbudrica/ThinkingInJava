package reusing.exercise2;

class Sterilant extends Detergent {
	public void scrub() {
		append(" Sterilant.scrub()");
	}
	
	public void sterilize() {
		append(" sterilize()");
	}
}

public class ReusingEx2 {
	public static void main(String[] args) {
		Sterilant sterilant = new Sterilant();
		sterilant.scrub();
		sterilant.sterilize();
		System.out.println(sterilant);
	}
}
