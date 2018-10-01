package holding.exercises;
import java.util.*;

public class HoldingEx24 {
	public static void main(String[] args) {
		Map<String,String> map = new LinkedHashMap<String,String>();
		Random rand = new Random(47);
		for(int i = 0; i < 50; i++) {
			int number = rand.nextInt(10);
			map.put("key"+number, "value"+number);
		}
		System.out.println("Actual map: " + map);
		Map<String,String> copyMap = new LinkedHashMap<String,String>(map);
		List<String> keys = new ArrayList<String>(map.keySet());
		map.clear();
		Collections.sort(keys);
		for (String key : keys) {
			map.put(key, copyMap.get(key));
		}
		System.out.println("New map: " + map); 
	}
}
