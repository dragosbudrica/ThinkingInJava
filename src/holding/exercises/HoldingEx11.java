package holding.exercises;
import java.util.*;

public class HoldingEx11 {
	public static void display(Collection<Object> c) {
		Iterator<Object> it = c.iterator();
		while(it.hasNext()) {
			Object o = it.next();
			System.out.print(o.toString() + " ");
		}
		System.out.println();
	}
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		ArrayList<Object> integersAL = new ArrayList<Object>();
		LinkedList<Object> integersLL = new LinkedList<Object>();
		HashSet<Object> integersHS = new HashSet<Object>();
		LinkedHashSet<Object> integersLHS = new LinkedHashSet<Object>();
		TreeSet<Object> integersTS = new TreeSet<Object>();
		
		Collections.addAll(integersAL, new Integer(7), new Integer(1),
				new Integer(4), new Integer(9), new Integer(15));
		Collections.addAll(integersLL, new Float(2.5f), new Float(3.1f), new Float(4.9f),
				new Float(10.29f), new Float(95.21f));
		Collections.addAll(integersHS, new Double(21.52d), new Double(39.1d), new Double(41.9d),
				new Double(10.94d), new Double(104.27d));
		Collections.addAll(integersLHS, new String("bcd"), new String("abc"), new String("def"),
				new String("acd"), new String("dar"));
		Collections.addAll(integersTS, new Character('d'), new Character('a'), new Character('f'),
				new Character('c'), new Character('t'));
		
		display(integersAL);
		display(integersLL);
		display(integersHS);
		display(integersLHS);
		display(integersTS);
	}
}
