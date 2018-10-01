package strings.exercises;
import java.util.*;

class SplitDemo {
	public static void main(String[] args) {
		String input =
			"This!!unusual use!!of exclamation!!points";
		System.out.println(Arrays.toString(
			input.split("!!")));
		System.out.println(Arrays.toString(
			input.split("!!", 3)));
	}
}

public class StringsEx14 {
	public static void main(String[] args) {
		SplitDemo.main(args);
	}
}
