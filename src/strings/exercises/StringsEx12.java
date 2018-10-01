package strings.exercises;
import java.util.*;
import java.util.regex.*;

class Groups {
	static public final String POEM =
		"Twas brillig, and the slithy toves\n" +
		"Did gyre and gimble in the wabe.\n" +
		"All mimsy were the borogoves,\n" +
		"And the mome raths outgrabe.\n\n" +
		"Beware the Jabberwock, my son,\n" +
		"The jaws that bite, the claws that catch.\n" +
		"Beware the Jubjub bird, and shun\n" +
		"The frumious Bandersnatch.";
	public static void main(String[] args) {
		Set<CharSequence> uniqueWords = new LinkedHashSet<CharSequence>();
		Matcher m =
			Pattern.compile("\\b[a-z]+")
				.matcher(POEM);
			while(m.find()) {
				uniqueWords.add(m.group());
			}
			System.out.println(uniqueWords);
			System.out.println("Number of unique words: " + uniqueWords.size());
	}
}

public class StringsEx12 {
	public static void main(String[] args) {
		Groups.main(args);
	}
}
