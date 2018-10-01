package exceptions.exercises;
import java.util.*;

public class ExceptionsEx5 {
	public static void main(String[] args) {
		Random rand = new Random(47);
		int numerator = rand.nextInt(10);
		Integer[] denominators = {0, 0, 0, 0, 1, 1, 1};
		int i = 0;
		while (denominators[i] == 0) {
			try {
				System.out.println("Denominator = " + denominators[i]);
				System.out.println("Number = " + numerator / denominators[i]);
			} catch (ArithmeticException e) {
				e.printStackTrace();
				i++;
			}
		}
		System.out.println("Denominator = " + denominators[i]);
		System.out.println("Number = " + numerator/denominators[i]);
	}
}
