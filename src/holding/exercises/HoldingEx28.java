package holding.exercises;
import java.util.*;

public class HoldingEx28 {
	public static void displayPriorityQueue(PriorityQueue<Double> priorityQueue) {
		while(priorityQueue.peek() != null) {
			System.out.print(priorityQueue.poll() + " ");
		}
	}
	public static void main(String[] args) {
		PriorityQueue<Double> priorityQueue = new PriorityQueue<Double>();
		Random rand = new Random(47);
		for(int i = 0; i < 10; i++) {
			priorityQueue.offer(rand.nextDouble());
		}
		displayPriorityQueue(priorityQueue);
	}
}
