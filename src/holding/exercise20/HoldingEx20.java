package holding.exercise20;
import java.util.*;
import net.mindview.util.*;

class UniqueWords {
	private static int numberOfVowelsInFile = 0;
	public static void vowelCounter(Set<String> words, Map<Character,Integer> vowels) {
		for (String word : words) {
			int numberOfVowelsInWord = 0;
				for (Character ch : word.toCharArray()) {
					if(vowels.containsKey(ch)) {
						numberOfVowelsInWord++;
						numberOfVowelsInFile++;
						vowels.put(ch, vowels.get(ch)+1);
					}
			}
			System.out.println("Word: " + word + " - number of vowels " + numberOfVowelsInWord);
		}
		System.out.println("Number of vowels in file " + numberOfVowelsInFile);
		System.out.println(vowels);
	}
	
	public static void main(String[] args) {
		Map<Character, Integer> vowels = new HashMap<Character, Integer>();
		vowels.put('A', 0);
		vowels.put('E', 0);
		vowels.put('I', 0);
		vowels.put('O', 0);
		vowels.put('U', 0);
		vowels.put('a', 0);
		vowels.put('e', 0);
		vowels.put('i', 0);
		vowels.put('o', 0);
		vowels.put('u', 0);
		Set<String> words = new TreeSet<String>(
				new TextFile("src\\holding\\SetOperations.java", "\\W+"));
		vowelCounter(words, vowels);
	}
}

public class HoldingEx20 {
	public static void main(String[] args) {
		UniqueWords.main(args);
	}
}

