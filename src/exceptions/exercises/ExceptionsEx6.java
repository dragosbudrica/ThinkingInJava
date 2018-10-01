package exceptions.exercises;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

@SuppressWarnings("serial")
class SevereException1 extends Exception {
	private static Logger logger = Logger.getLogger("SevereException1");
	public SevereException1() {
		StringWriter trace = new StringWriter();
		printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
}
@SuppressWarnings("serial")
class SevereException2 extends Exception {
	private static Logger logger = Logger.getLogger("SevereException2");
	public SevereException2() {
		StringWriter trace = new StringWriter();
		printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
}

public class ExceptionsEx6 {
	public static void main(String[] args) {
		try {
			throw new SevereException1();
		} catch(SevereException1 e) {
			System.err.println("Caught " + e);
		}
		try {
			throw new SevereException2();
		} catch(SevereException2 e) {
			System.err.println("Caught " + e);
		}
	}
}
