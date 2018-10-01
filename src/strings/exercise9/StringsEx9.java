package strings.exercise9;

public class StringsEx9 {
	public static void main(String[] args) {
		String regex = "[aeiou]";
		System.out.println(Splitting.knights.replaceAll(regex, "_"));
	}
}
