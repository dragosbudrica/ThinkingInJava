package exceptions.exercises;

@SuppressWarnings("serial")
class MyNewExp1 extends Exception {
}

@SuppressWarnings("serial")
class MyNewExp2 extends Exception {
}

@SuppressWarnings("serial")
class MyNewExp3 extends Exception {
}

public class ExceptionsEx9 {
	void f(int i) throws MyNewExp1, MyNewExp2, MyNewExp3 {
		if (i == 3) {
			System.out.println("Throwing MyNewExp1 from f()");
			throw new MyNewExp1();
		} else if (i == 4) {
			System.out.println("Throwing MyNewExp2 from f()");
			throw new MyNewExp2();
		} else if (i == 5) {
			System.out.println("Throwing MyNewExp3 from f()");
			throw new MyNewExp3();
		}
		else {
			System.out.println("No exception thrown");
		}
	}

	public static void main(String[] args) {
		ExceptionsEx9 ex9 = new ExceptionsEx9();
		int number = 3;
		while (number < 6) {
			try {
				ex9.f(number);
			} catch (Exception e) {
				System.out.println("Caught Exception"+number);
				e.printStackTrace(System.out);
				number++;
			}
		}
	}
}
