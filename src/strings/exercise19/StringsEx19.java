package strings.exercise19;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringsEx19 {
	public static void main(String[] args) {
		if(args.length < 2) {
			System.out.println("Usage: java java file1 java file2");
			System.exit(0);
		}	
	
		Set<String> classNames = new LinkedHashSet<String>();
		String s = null;
		for(int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
			s = TextFile.read(args[i]);
			s = s.replaceAll("(//(.*))|(?s)/\\*(.*?)\\*/", "");
			s = s.replaceAll("\"(.*?)\"", "");
			Pattern p = Pattern.compile("\\b[A-Z]\\w+");
			Matcher m = p.matcher(s);
			while(m.find())
				classNames.add(m.group()); 
			for (String className : classNames) {
				System.out.println(className);
			}
			classNames = new LinkedHashSet<String>(); 
		} 
	}
}
