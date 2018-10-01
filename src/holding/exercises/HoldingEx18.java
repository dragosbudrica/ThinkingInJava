package holding.exercises;
import java.util.*;

public class HoldingEx18 {
	public static void main(String[] args) {
		Map<String, String> hashMap = new HashMap<String,String>();
		for(int i = 0; i < 10; i++) {
			hashMap.put("key"+i, "value"+i);
		}
		for (String key : hashMap.keySet()) {
			System.out.println("Key: " + key + "\tkey hash code: " + key.hashCode());
			System.out.println("Value: " + hashMap.get(key) + "\tvalue hash code: " + hashMap.get(key).hashCode());
		}
		System.out.println("HashMap: " + hashMap);
		List<String> keys = new ArrayList<String>(hashMap.keySet());
		Collections.sort(keys);
		Map<String, String> linkedHashMap = new LinkedHashMap<String,String>();
		for(String key : keys) {
			linkedHashMap.put(key, hashMap.get(key));
		}
		System.out.println("LinkedHashMap: " + linkedHashMap);
	}
}
