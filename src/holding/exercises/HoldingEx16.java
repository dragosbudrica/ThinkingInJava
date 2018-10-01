package holding.exercises;
import java.util.*;

import net.mindview.util.*;

class UniqueWords {
	private static int numberOfVowelsInFile = 0;
	public static void vowelCounter(Set<String> words, Set<Character> vowels) {
		for (String word : words) {
			int numberOfVowels = 0;
				for (Character ch : word.toCharArray()) {
					if(vowels.contains(ch)) {
						numberOfVowels++;
						numberOfVowelsInFile++;
					}
			}
			System.out.println("Word: " + word + " - number of vowels " + numberOfVowels);
		}
		System.out.println("Number of vowels in file " + numberOfVowelsInFile);
	}
	
	public static void main(String[] args) {
		Set<Character> vowels = new TreeSet<Character>();
		Collections.addAll(vowels, 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u');
		Set<String> words = new TreeSet<String>(
				new TextFile("src\\holding\\SetOperations.java", "\\W+"));
		vowelCounter(words, vowels);
	}
}

public class HoldingEx16 {
	public static void main(String[] args) {
		UniqueWords.main(args);
	}
}
