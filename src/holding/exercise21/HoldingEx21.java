package holding.exercise21;
import java.util.*;
import net.mindview.util.*;

class UniqueWords {
	public static void wordCounter(List<String> words, Map<String,Integer> wordsOccurences) {
		Collections.sort(words, String.CASE_INSENSITIVE_ORDER);
		for (String word : words) {
			Integer count = wordsOccurences.get(word);
			wordsOccurences.put(word, count == null ? 1 : count + 1);
		}
		System.out.println(wordsOccurences);
	}
	public static void main(String[] args) {
		Map<String,Integer> wordsOccurences = new LinkedHashMap<String,Integer>();
		List<String> words = new TextFile("src\\holding\\SetOperations.java", "\\W+");
		wordCounter(words, wordsOccurences);
	}
}

public class HoldingEx21 {
	public static void main(String[] args) {
		UniqueWords.main(args);
	}
}
