package strings.exercises;
import java.util.regex.*;

public class StringsEx11 {
	public static void main(String[] args) {
		String input = "Airline ate eight apples and one orange while Anita hadn't any";
		String exp = "(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b";
		
		System.out.println("Input: \"" + input + "\"");
		System.out.println("Regular expression: \"" + exp + "\"");
		Pattern p = Pattern.compile(exp);
		Matcher m = p.matcher(input);
		while(m.find()) {
			System.out.println("Match \"" + m.group() + "\" at positions " +
					m.start() + "-" + (m.end() - 1));
		}
	}
}
