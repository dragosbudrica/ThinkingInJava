package holding.exercise22;
import java.util.*;
import net.mindview.util.*;

class WordOcc {
	private String wordName;
	private int count;

	public WordOcc(String wordName) {
		this.wordName = wordName;
		this.count = 0;
	}

	public String getWordName() {
		return wordName;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String toString() {
		return wordName;
	}
}

class UniqueWords {
	public static void wordCounter(List<String> words,
			Set<WordOcc> wordsOccurences) {
		Collections.sort(words, String.CASE_INSENSITIVE_ORDER);
		for (String currentWord : words) {
			boolean isInSet = false;
			for (WordOcc wordOcc : wordsOccurences) {
				if (wordOcc.getWordName().equals(currentWord)) {
					isInSet = true;
					wordOcc.setCount(wordOcc.getCount()+1);
					break;
				}
			}
			if (!isInSet) {
				WordOcc word = new WordOcc(currentWord);
				word.setCount(1);
				wordsOccurences.add(word);
			}
		}
		for (WordOcc wordOcc : wordsOccurences) {
			System.out.println("Word: " + wordOcc.getWordName());
			System.out.println("Occurences: " + wordOcc.getCount() + "\n");
		}
	}

	public static void main(String[] args) {
		Set<WordOcc> wordOcc = new LinkedHashSet<WordOcc>();
		List<String> words = new TextFile("src\\holding\\SetOperations.java",
				"\\W+");
		wordCounter(words, wordOcc);
	}
}

public class HoldingEx22 {
	public static void main(String[] args) {
		UniqueWords.main(args);
	}
}
