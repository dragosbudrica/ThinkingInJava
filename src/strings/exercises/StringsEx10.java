package strings.exercises;
import java.util.regex.*;

public class StringsEx10 {
	public static void main(String[] args) {
		String input = "Java now has regular expressions";
		String[] arrayOfExp = new String[] {"^Java", "\\Breg.*", "n.w\\s+h(a|i)s", 
				"s?", "s*", "s+", "s{4}", "S{1}.", "s{0,3}"};
		System.out.println("Input: \"" + input + "\"");
		for(String exp : arrayOfExp) {
			System.out.println("Regular expression: \"" + exp + "\"");
			Pattern p = Pattern.compile(exp);
			Matcher m = p.matcher(input);
			while(m.find()) {
				System.out.println("Match \"" + m.group() + "\" at position " +
						m.start() + ((m.end() - m.start() < 2) ? "" : "-" + (m.end() - 1)));
			}
		}
	}
}
