package holding.exercises;
import java.util.*;

public class HoldingEx14 {
	public static void main(String[] args) {
		List<Integer> ints = new LinkedList<Integer>();
		Random rand = new Random(47);
		for(int i = 0; i < 9; i++) {
			ListIterator<Integer> it = ints.listIterator(ints.size() / 2);
			int newNumber = rand.nextInt(10);
			it.add(newNumber);
			System.out.println(ints);
		}
	}
}
