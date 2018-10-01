package holding.exercise6;
import java.util.*;

class ListFeatures {
	private static List<String> arrayList(int size) {
		Random rand = new Random(47);
		List<String> strs = new ArrayList<String>();
		for (int i = 0; i < size; i++)
			if (i % 2 == 0)
				strs.add(String.valueOf("String no " + rand.nextInt(size)));
			else
				strs.add(String.valueOf("String " + rand.nextInt(size)));
		return strs;
	}

	public static void main(String[] args) {
		Random rand = new Random(47);
		List<String> strings = ListFeatures.arrayList(7);
		System.out.println("1: " + strings);
		String s = new String("abc");
		strings.add(s); 
		System.out.println("2: " + strings); 
		System.out.println("3: " + strings.contains(s)); 
		strings.remove(s);
		String s2 = strings.get(2); 
		System.out.println("4: " + s2 + " " + strings.indexOf(s2)); 
		String s3 = new String("bcd"); 
		System.out.println("5: " + strings.indexOf(s3)); 
		System.out.println("6: " + strings.remove(s3)); 
		System.out.println("7: " + strings.remove(s2)); 
		System.out.println("8: " + strings);
		strings.add(3, new String("String 1")); 
		System.out.println("9: " + strings);
		List<String> sub = strings.subList(1, 4); 
		System.out.println("subList: " + sub);
		System.out.println("10: " + strings.containsAll(sub)); 
		Collections.sort(sub); 
		System.out.println("sorted subList: " + sub); 
		System.out.println("11: " + strings.containsAll(sub));
		Collections.shuffle(sub, rand); 
		System.out.println("shuffled subList: " + sub); 
		System.out.println("12: " + strings.containsAll(sub)); 
		List<String> copy = new ArrayList<String>(strings);
		sub = Arrays.asList(strings.get(1), strings.get(4)); 
		System.out.println("sub: " + sub);
		copy.retainAll(sub); 
		System.out.println("13: " + copy); 
		copy = new ArrayList<String>(strings); 
		copy.remove(2); 
		System.out.println("14: " + copy); 
		copy.removeAll(sub); 
		System.out.println("15: " + copy); 
		copy.set(1, new String("efg")); 
		System.out.println("16: " + copy); 
		copy.addAll(2, sub); 
		System.out.println("17: " + copy); 
		System.out.println("18: " + strings.isEmpty()); 
		strings.clear(); 
		System.out.println("19: " + strings); 
		System.out.println("20: " + strings.isEmpty());
		strings.addAll(ListFeatures.arrayList(4)); 
		System.out.println("21: " + strings);
		Object[] o = strings.toArray(); 
		System.out.println("22: " + o[3]); 
		String[] sa = strings.toArray(new String[0]); 
		System.out.println("23: " + sa[3].toUpperCase()); 
	}
}

public class HoldingEx6 {
	public static void main(String[] args) {
		ListFeatures.main(args);
	}
}
