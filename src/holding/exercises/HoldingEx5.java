package holding.exercises;
import java.util.*;

class ListFeatures {
	private static List<Integer> arrayList(int size) {
		Random rand = new Random(47);
		List<Integer> numbers = new ArrayList<Integer>();
		for(int i = 0; i < size; i++)
			numbers.add(rand.nextInt(size));
		return numbers;
	}

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Random rand = new Random(47);
		List<Integer> intNumbers = ListFeatures.arrayList(7);
		System.out.println("1: " + intNumbers);
		Integer i = new Integer(8);
		intNumbers.add(i);
		System.out.println("2: " + intNumbers);
		System.out.println("3: " + intNumbers.contains(i));
		intNumbers.remove(i); 
		Integer i2 = intNumbers.get(2);
		System.out.println("4: " + i2 + " " + intNumbers.indexOf(i2));
		Integer i3 = new Integer(5);
		System.out.println("5: " + intNumbers.indexOf(i3));
		System.out.println("6: " + intNumbers.remove(i3));
		System.out.println("7: " + intNumbers.remove(i2));
		System.out.println("8: " + intNumbers);
		intNumbers.add(3, new Integer(9)); 
		System.out.println("9: " + intNumbers);
		List<Integer> sub = intNumbers.subList(1, 4);
		System.out.println("subList: " + sub);
		System.out.println("10: " + intNumbers.containsAll(sub));
		Collections.sort(sub); 
		System.out.println("sorted subList: " + sub);
		System.out.println("11: " + intNumbers.containsAll(sub));
		Collections.shuffle(sub, rand);
		System.out.println("shuffled subList: " + sub);
		System.out.println("12: " + intNumbers.containsAll(sub));
		List<Integer> copy = new ArrayList<Integer>(intNumbers);
		sub = Arrays.asList(intNumbers.get(1), intNumbers.get(4));
		System.out.println("sub: " + sub);
		copy.retainAll(sub);
		System.out.println("13: " + copy);
		copy = new ArrayList<Integer>(intNumbers);
		copy.remove(2); 
		System.out.println("14: " + copy);
		copy.removeAll(sub); 
		System.out.println("15: " + copy);
		copy.set(1, new Integer(5));
		System.out.println("16: " + copy);
		copy.addAll(2, sub); 
		System.out.println("17: " + copy);
		System.out.println("18: " + intNumbers.isEmpty());
		intNumbers.clear(); 
		System.out.println("19: " + intNumbers);
		System.out.println("20: " + intNumbers.isEmpty());
		intNumbers.addAll(ListFeatures.arrayList(4));
		System.out.println("21: " + intNumbers);
		Object[] o = intNumbers.toArray();
		System.out.println("22: " + o[3]);
		Integer[] ia = intNumbers.toArray(new Integer[0]);
		System.out.println("23: " + ia[3].intValue()); 
	}
}

public class HoldingEx5 {
	public static void main(String[] args) {
		ListFeatures.main(args);
	}
}
