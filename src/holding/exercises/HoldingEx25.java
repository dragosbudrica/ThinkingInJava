package holding.exercises;
import java.util.*;
import net.mindview.util.TextFile;

public class HoldingEx25 {
	public static void displayWordsLocations(List<String> words, Map<String, ArrayList<Integer>> map) {
		for(String word : words) {
			if(!map.containsKey(word)) {
				List<Integer> locations = new ArrayList<Integer>();
				for(int j = 0; j < words.size(); j++) {
					if(word.equals(words.get(j)))
						locations.add(j+1);
				}
				map.put(word, (ArrayList<Integer>)locations);
			}
		}
		System.out.println(map);
	}
	public static void main(String[] args) {
		Map<String,ArrayList<Integer>> map = new HashMap<String,ArrayList<Integer>>();
		List<String> words = new TextFile("src\\holding\\SetOperations.java",
				"\\W+");
		displayWordsLocations(words, map);
	}
}
