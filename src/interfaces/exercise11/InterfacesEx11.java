package interfaces.exercise11;
import java.util.*;

abstract class StringProcessor implements Processor {
	public String name() {
		return getClass().getSimpleName();
	}
	public abstract String process(Object input);
	public static String s =
			"If she weighs the same as a duck, she's made of wood";
	public static void main(String[] args) {
		Apply.process(new Upcase(), s);
		Apply.process(new Downcase(), s);
		Apply.process(new Splitter(), s);
		Apply.process(new Swapper(), s);
	}
}

class Upcase extends StringProcessor {
	public String process(Object input) { 
		return ((String)input).toUpperCase();
	}
}

class Downcase extends StringProcessor {
	public String process(Object input) {
		return ((String)input).toLowerCase();
	}
}

class Splitter extends StringProcessor {
	public String process(Object input) { 
		return Arrays.toString(((String)input).split(" "));
	}
}

class Swapper extends StringProcessor {
	public String process(Object input) {
		String result = "";
		if(((String)input).length() == 0)
			return result;
		else if(((String)input).length() == 1)
			return (String)input;
		else if(((String)input).length() % 2 == 0) {
			for(int i = 0;  i <= ((String)input).length() -1; i+=2) {
				result += ((String)input).charAt(i + 1) +""+ ((String)input).charAt(i);
			}
		}
		else {
			for(int i = 0;  i <= ((String)input).length() - 2; i+=2) {
				result += ((String)input).charAt(i + 1) +""+ ((String)input).charAt(i);
			}
			result += ((String)input).charAt(((String)input).length() - 1);
		}
		return result;
	}
}

public class InterfacesEx11 {
	public static void main(String[] args) {
		StringProcessor.main(args);
	}
}
