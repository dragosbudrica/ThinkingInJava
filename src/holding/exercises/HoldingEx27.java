package holding.exercises;
import java.util.*;

class Command {
	private String str;
	Command(String str) {
		this.str = str;
	}
	public void operation() {
		System.out.println(str);
	}
}

class Fill {
	public static Queue<Command> fillQueue() {
		Queue<Command> queue = new LinkedList<Command>();
		for(int i = 0; i < 10; i++) {
			queue.offer(new Command("str" + i));
		}
		return queue;
	}
}

public class HoldingEx27 {
	public static void displayQueue(Queue<Command> queue) {
		while(queue.peek() != null) {
			queue.remove().operation();
		}
	}
	public static void main(String[] args) {
		displayQueue(Fill.fillQueue());
	}
}
