package holding.exercises;
import java.util.*;

class CharacterGenerator {
	private static int currentCharIndex;
	
	private enum StarWarsChars {
		DARTH_VADER, LEIA_ORGANA, LUKE_SKYWALKER, 
		HAN_SOLO, OBI_WAN_KENOBI, GRAND_MOFF_TARKIN, BERU,
		OWEN_LARS, WEDGE_ANTILLES, GENERAL_TAGGI
	}
	
	public static String next() {
		if(currentCharIndex == StarWarsChars.values().length)
			currentCharIndex = 0;
		return StarWarsChars.values()[currentCharIndex++].toString();
	}
}

public class HoldingEx4 {
	public static Collection<String> fill(Collection<String> c) {
		for(int i = 0; i < 20; i++) {
			c.add(CharacterGenerator.next());
		}
		return c;
	}
	public static String[] fill(String[] a) {
		for(int i = 0; i < 20; i++) {
			a[i] = CharacterGenerator.next();
		}
		return a;
	}
	public static void main(String[] args) {
		System.out.println(Arrays.toString(fill(new String[20])));
		System.out.println(fill(new ArrayList<String>()));
		System.out.println(fill(new LinkedList<String>()));
		System.out.println(fill(new HashSet<String>()));
		System.out.println(fill(new LinkedHashSet<String>()));
		System.out.println(fill(new TreeSet<String>()));
	}
}
