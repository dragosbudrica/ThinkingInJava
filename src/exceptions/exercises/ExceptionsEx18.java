package exceptions.exercises;

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

@SuppressWarnings("serial")
class NewException extends Exception {
	public String toString() {
		return "A new exception";
	}
}

class LostMessage {
	void f() throws VeryImportantException {
		throw new VeryImportantException();
	}
	void dispose() throws HoHumException {
		throw new HoHumException();
	}
	void remove() throws NewException {
		throw new NewException();
	}
	public static void main(String[] args) {
		try {
			LostMessage lm = new LostMessage();
			try {
				try {
					lm.f();
				} finally {
					lm.dispose();
				}
			} finally {
				lm.remove();
			}
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}

public class ExceptionsEx18 {
	public static void main(String[] args) {
		LostMessage.main(args);
	}
}
