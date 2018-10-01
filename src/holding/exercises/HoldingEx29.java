package holding.exercises;
import java.util.*;

class Class {}

public class HoldingEx29 {
	public static void main(String[] args) {
		PriorityQueue<Class> priorityQueue = new PriorityQueue<Class>();
		priorityQueue.offer(new Class());
	//	priorityQueue.offer(new Class()); // java.lang.ClassCastException: holding.exercises.Class cannot be cast to java.lang.Comparable
		System.out.println(priorityQueue); 
	}
}
