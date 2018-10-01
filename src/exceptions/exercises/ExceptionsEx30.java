package exceptions.exercises;

@SuppressWarnings("serial")
class Annoyance extends RuntimeException {}

@SuppressWarnings("serial")
class Sneeze extends RuntimeException {}

class WrapCheckedException {
	void throwRuntimeException(int type) {
		try {
			switch (type) {
			case 0:
				throw new Sneeze();
			case 1:
				throw new Annoyance();
			case 2:
				throw new RuntimeException("Where am I?");
			default:
				return;
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}

class TurnOffChecking {
	public static void main(String[] args) {
		WrapCheckedException wce = new WrapCheckedException();
		wce.throwRuntimeException(3);
		for (int i = 0; i < 3; i++)
			try {
				wce.throwRuntimeException(i);
			} catch (RuntimeException re) {
				try {
					throw re.getCause();
				} catch (Sneeze e) {
					System.out.println("Caught Sneeze: " + e);
				} catch (Annoyance e) {
					System.out.println("Caught Annoyance: " + e);
				} catch (Throwable e) {
					System.out.println("Caught Throwable: " + e);
				}
			}
	}
}

public class ExceptionsEx30 {
	public static void main(String[] args) {
		TurnOffChecking.main(args);
	}
}
