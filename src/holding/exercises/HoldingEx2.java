package holding.exercises;
import java.util.*;

class SimpleCollection {
	public static void main(String[] args) {
		Collection<Integer> c = new TreeSet<Integer>();
		for(int i = 0; i < 10; i++)
			c.add(i); 
		for(Integer i : c)
			System.out.print(i + ", ");
	}
}

public class HoldingEx2 {
	public static void main(String[] args) {
		SimpleCollection.main(args);
	}
}