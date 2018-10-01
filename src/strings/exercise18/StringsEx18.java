package strings.exercise18;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import strings.exercise17.TextFile;

public class StringsEx18 {
	public static void main(String[] args) {
		if(args.length < 1) {
			System.out.println("Usage: java java file");
			System.exit(0);
		}	
		
		String s = TextFile.read(args[0]);
		Pattern p = Pattern.compile("\"(.*?)\"");
		Matcher m = p.matcher(s);
		while(m.find())
			System.out.println(m.group()); 
	}
}
