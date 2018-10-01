package initialization.exercises;
import java.util.Random;

public class InitializationEx16 {
	public static void main(String[] args) {
		Random rand = new Random(47);
		String[] strings = new String[rand.nextInt(20)];
		for(int i = 0; i < strings.length; i++) {
			strings[i] = new String("str" + (i + 1));
		}
		System.out.println("length of array: " + strings.length);
		for(int i = 0; i < strings.length; i++)
			System.out.print(strings[i] + " ");
	}
}
