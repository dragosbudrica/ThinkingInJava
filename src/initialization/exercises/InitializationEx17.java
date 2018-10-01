package initialization.exercises;
import java.util.Random;

public class InitializationEx17 {
	InitializationEx17(String str) {
		System.out.println(str);
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Random rand = new Random(47);
		InitializationEx17[] strs = new InitializationEx17[rand.nextInt(20)];
		// none of the messages from constructor InitializationEx17 will be displayed, because only the array object itself is created, not a specific object from that array.
	}
}
