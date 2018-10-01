package strings.exercise15;
import java.util.*;
import java.util.regex.*;

public class JGrep {
	private static Integer[] flags = new Integer[]{Pattern.CANON_EQ, Pattern.CASE_INSENSITIVE,
				Pattern.COMMENTS, Pattern.DOTALL, Pattern.LITERAL, Pattern.MULTILINE, Pattern.UNICODE_CASE,
				Pattern.UNICODE_CHARACTER_CLASS, Pattern.UNIX_LINES};
	
	private enum PatternFlags {
		CANON_EQ, CASE_INSENSITIVE, COMMENTS, DOTALL, LITERAL, MULTILINE, UNICODE_CASE,
		UNICODE_CHARACTER_CLASS, UNIX_LINES
	}
	
	private static int getFlags(List<Integer> chosenFlags) {
		int fl = 0;
		for(int i = 0; i < chosenFlags.size(); i++) {
			fl |= chosenFlags.get(i).intValue();
		}
		return fl;
	}
	
	public static void main(String[] args) throws Exception {
		if (args.length < 3) {
			System.out.println("Usage: java JGrep file regex flag");
			System.exit(0);
		}
		
		List<Integer> chosenFlags = new ArrayList<Integer>();
		for (int i = 2; i < args.length; i++) {
			int currentFlagIndex = 0;
			for(PatternFlags flag : PatternFlags.values()) {
				if(args[i].equals("Pattern."+flag)) {
					chosenFlags.add(flags[PatternFlags.values()[currentFlagIndex].ordinal()]);
				}
				currentFlagIndex++;
			}
		}
		
		Pattern p = Pattern.compile(args[1], getFlags(chosenFlags));
		int index = 0;
		Matcher m = p.matcher("");
		for (String line : new TextFile(args[0])) {
			m.reset(line);
			while (m.find()) {
				System.out.println(index++ + ": " + m.group() + ": "
						+ m.start());
			}
		}
	}
}
