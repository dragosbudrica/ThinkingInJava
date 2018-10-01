package exceptions.exercises;

@SuppressWarnings("serial")
class NewException1 extends Exception {
}

@SuppressWarnings("serial")
class NewException2 extends Exception {
}

@SuppressWarnings("serial")
class NewException3 extends Exception {
}

public class ExceptionsEx13 {
	 @SuppressWarnings("null")
	void f(ExceptionsEx13 e, int i) throws NewException1, NewException2, NewException3 {
		if (i == 10) {
			System.out.println("Throwing NewException1 from f()");
			throw new NewException1();
		} else if (i == 11) {
			System.out.println("Throwing NewException2 from f()");
			throw new NewException2();
		} else if (i == 12) {
			System.out.println("Throwing Exception12 from f()");
			throw new NewException3();
		}
		else {
			e = null;
			System.out.println(e.equals(new ExceptionsEx13()));
		}
	}

	public static void main(String[] args) {
		ExceptionsEx13 ex13 = new ExceptionsEx13();
		int number = 10;
		while (number < 14) {
			try {
				ex13.f(ex13, number);
			} catch (Exception e) {
				System.out.println("Exception caught");
				e.printStackTrace(System.out);
				number++;
			} finally {
				System.out.println("Finally is always executed");
			}
		}
	}
}