package strings.exercises;
import java.util.regex.Pattern;

public class StringsEx7 {
	public static void main(String[] args) {
		String regex = "^[A-Z].*[\\.]$";
		System.out.println("\"ana are mere\"  matches? " + Pattern.matches(regex, "ana are mere"));
		System.out.println("\"ana are mere.\"  matches? " + Pattern.matches(regex, "ana are mere."));
		System.out.println("\"Ana are mere\"  matches? " + Pattern.matches(regex, "Ana are mere"));
		System.out.println("\"Ana are mere.\"  matches? " + Pattern.matches(regex, "Ana are mere."));
	}
}
