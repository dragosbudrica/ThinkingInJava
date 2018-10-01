package operators.exercises;
import java.util.*;

public class OperatorsEx7 {
	public static void main(String[] args) {
		System.out.println("Flip the coin!");
		Random rand = new Random();
		int i = rand.nextInt(2);
		System.out.println("Is it the tail? " + (i == 0));
		System.out.println("Is it the head? " + (i == 1));
	}
}
