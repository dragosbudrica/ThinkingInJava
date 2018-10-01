package exceptions.exercises;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class ExceptionsEx7 {
	private static Logger logger = Logger.getLogger("ExceptionsEx7");
	static void logException(Exception aioobe) {
		StringWriter trace = new StringWriter();
		aioobe.printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
	public static void main(String[] args) {
		try {
			Integer[] arrayOfInteger = new Integer[5];
			arrayOfInteger[5] = 10;
		} catch (ArrayIndexOutOfBoundsException aioobe) {
			logException(aioobe);
		}
	}
}
