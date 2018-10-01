package reusing.exercises;
import java.util.Random;

class FinalData {
	private static Random rand = new Random(53);
	static final int INT_1 = rand.nextInt(25);
	final int int2 = rand.nextInt(20);
	
	public String toString() {
		return "INT_1 = " + INT_1 + ", int2 = " + int2;
	}
}

public class ReusingEx18 {
	public static void main(String[] args) {
		FinalData fd1 = new FinalData();
		System.out.println(fd1);
		
		FinalData fd2 = new FinalData();
		System.out.println(fd2);
	}
}
