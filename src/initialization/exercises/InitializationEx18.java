package initialization.exercises;
import java.util.Random;

public class InitializationEx18 {
	InitializationEx18(String str) {
		System.out.println(str);
	}
	public static void main(String[] args) {
		Random rand = new Random(47);
		InitializationEx18[] strs = new InitializationEx18[rand.nextInt(20)];
		for(int i = 0; i < strs.length; i++) {
			strs[i] = new InitializationEx18("str" + (i + 1));
		}
	}
}

