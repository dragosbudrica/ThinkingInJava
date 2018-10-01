package exceptions.exercise19;

@SuppressWarnings("serial")
class VeryImportantException extends Exception {
	public String toString() {
		return "A very important exception!";
	}
}

@SuppressWarnings("serial")
class HoHumException extends Exception {
	public String toString() {
		return "A trivial exception";
	}
}

class LostMessage {
	void f() throws VeryImportantException {
		throw new VeryImportantException();
	}
	void dispose() throws HoHumException {
		throw new HoHumException();
	}
	public static void main(String[] args) {
		try {
			LostMessage lm = new LostMessage();
			try {
				lm.f();
			} finally {
				try {
					lm.dispose();
				} catch(Exception e) {
					System.out.println(e);
				}
			}
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}

public class ExceptionsEx19 {
	public static void main(String[] args) {
		LostMessage.main(args);
	}
}
