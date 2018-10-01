package holding.exercises;
import java.util.*;
import net.mindview.util.TextFile;

public class HoldingEx26 {
	public static Map<String,ArrayList<Integer>> findWordsLocations(List<String> words, Map<String, ArrayList<Integer>> map) {
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
		return map;
	}
	public static void displayInitialWordsInList(Map<String,ArrayList<Integer>> mapWordsLocations) {
		int sizeForAllLocations = 0;
		for(String key : mapWordsLocations.keySet()) {
			int sizeOfLocationsArray = mapWordsLocations.get(key).size();
			sizeForAllLocations+=sizeOfLocationsArray;
		}
		String[] initialWordsNames = new String[sizeForAllLocations];
		for(String key : mapWordsLocations.keySet()) {
			for(Integer location : mapWordsLocations.get(key)) {
				initialWordsNames[location-1] = key;
			}
		}
		System.out.println("Initial file words order in list: " + Arrays.asList(initialWordsNames));
	}
	public static void displayInitialWordsInMap(Map<String,ArrayList<Integer>> mapWordsLocations) {
		Map<Integer,String> initialWordsOrder = new TreeMap<Integer,String>();
		for(String word : mapWordsLocations.keySet()) {
			for(int i = 0; i < mapWordsLocations.get(word).size(); i++) {
				initialWordsOrder.put(mapWordsLocations.get(word).get(i), word);
			}
		}
		System.out.println("Initial file words in map values: " + initialWordsOrder.values());
	}
	public static void main(String[] args) {
		Map<String,ArrayList<Integer>> map = new HashMap<String,ArrayList<Integer>>();
		List<String> words = new TextFile("src\\holding\\SetOperations.java",
				"\\W+");
		Map<String,ArrayList<Integer>> mapWordsLocations = findWordsLocations(words, map);
		System.out.println("Map words locations: " + mapWordsLocations);
		displayInitialWordsInList(mapWordsLocations);
		displayInitialWordsInMap(mapWordsLocations);
	}
}

