package exceptions.exercises;

@SuppressWarnings("serial")
class MyExp1 extends Exception {
}

@SuppressWarnings("serial")
class MyExp2 extends Exception {
}

class NewClass {
	public void f() {
		try {
			g();
		} catch (MyExp1 e) {
			throw new RuntimeException(e);
		}
	}

	public void g() throws MyExp1 {
		throw new MyExp1();
	}
}

public class ExceptionsEx11 {
	public static void main(String[] args) {
		NewClass newClass = new NewClass();
		newClass.f();
	}
}
