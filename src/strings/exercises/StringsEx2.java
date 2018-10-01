package strings.exercises;
import java.util.*;

class InfiniteRecursion {
	public String toString() {
		return " InfiniteRecursion address: " + super.toString() + "\n";
	}
	public static void main(String[] args) {
		List<StringsEx2> v =
				new ArrayList<StringsEx2>();
		for(int i = 0; i < 10; i++)
			v.add(new StringsEx2());
		System.out.println(v);
	}
}

public class StringsEx2 {
	public static void main(String[] args) {
		InfiniteRecursion.main(args);
	}
}