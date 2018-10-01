package holding.exercises;
import java.util.*;

public class HoldingEx12_1 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		List<Integer> integers = new ArrayList<Integer>();
		Collections.addAll(integers, new Integer(10), new Integer(14),
				new Integer(7), new Integer(19), new Integer(23));
		List<Integer> integers2 = new ArrayList<Integer>();
		Collections.addAll(integers2, new Integer(13), new Integer(12),
				new Integer(9), new Integer(14), new Integer(29));
		ListIterator<Integer> it = integers.listIterator();
		ListIterator<Integer> it2 = integers2.listIterator(integers.size());
		while(it.hasNext() && it2.hasPrevious()) {
			it2.previous();
			it2.set(it.next());
		}  
		System.out.println(integers);
		System.out.println(integers2); 
	}
}
