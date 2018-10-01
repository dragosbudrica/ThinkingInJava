package holding.exercises;
import java.util.*;

public class HoldingEx19 {
	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<String>();
		for(int i = 0; i < 10; i++)
			hashSet.add("String"+i);
		for (String string : hashSet) {
			System.out.println("Value: " + string + "  value hash code: " + string.hashCode());
		}
		System.out.println("HashSet: " + hashSet);
		List<String> newHashSet = new ArrayList<String>(hashSet);
		Collections.sort(newHashSet);
		Set<String> linkedHashSet = new LinkedHashSet<String>(newHashSet);
		System.out.println("LinkedHashSet: " + linkedHashSet);
	}
}
