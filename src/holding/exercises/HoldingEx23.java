package holding.exercises;
import java.util.*;

class Statistics {
	public static void testStatistics(Map<Integer, Integer> numbers, int numberOfTests) {
		Map<Integer,Double> mediaOfEachNumber = new HashMap<Integer,Double>();
		Random rand = new Random(47);
		for (int j = 0; j < numberOfTests; j++) {
			for (int i = 0; i < 10000; i++) {
				int r = rand.nextInt(20);
				Integer freq = numbers.get(r);
				numbers.put(r, freq == null ? 1 : freq + 1);
			}
			for (Integer number : numbers.keySet()) {
				mediaOfEachNumber.put(number, mediaOfEachNumber.get(number) == null ? numbers.get(number).doubleValue() : mediaOfEachNumber.get(number) + numbers.get(number));
			}
			numbers = new HashMap<Integer,Integer>();
		}
		for (Integer number : mediaOfEachNumber.keySet()) {
			mediaOfEachNumber.put(number, mediaOfEachNumber.get(number)/numberOfTests);
		}
		System.out.println(mediaOfEachNumber);
		int keyOfMax = -1;
		Double max = -1.0d;
		for (Integer keyOfTotal : mediaOfEachNumber.keySet()) {
			if(mediaOfEachNumber.get(keyOfTotal) > max) {
				max = mediaOfEachNumber.get(keyOfTotal);
				keyOfMax = keyOfTotal;
			}	
		}
		System.out.println("The number " + keyOfMax + " tends to appear more than the others.");
	}

	public static void main(String[] args) {
		Map<Integer, Integer> numbers = new HashMap<Integer, Integer>();
		testStatistics(numbers, 2000);
	}
}

public class HoldingEx23 {
	public static void main(String[] args) {
		Statistics.main(args);
	}

}