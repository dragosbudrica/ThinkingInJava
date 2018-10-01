package reusing.exercise15_b;
import reusing.exercise15_a.ReusingEx15_a;

public class ReusingEx15_b1 {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		ReusingEx15_a ex15 = new ReusingEx15_a();
	//	ex15.test2(); // The method test2() from the type ReusingEx15_a is not visible
	}
}
