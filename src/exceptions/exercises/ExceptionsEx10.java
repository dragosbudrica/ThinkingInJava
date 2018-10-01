package exceptions.exercises;

@SuppressWarnings("serial")
class PersonalException1 extends Exception {
}

@SuppressWarnings("serial")
class PersonalException2 extends Exception {
}

class MyClass {
	public void f() throws PersonalException2 {
		try {
			g();
		} catch (PersonalException1 e) {
			PersonalException2 e7 = new PersonalException2();
			e7.initCause(e);
			throw e7;
		}
	}

	public void g() throws PersonalException1 {
		throw new PersonalException1();
	}
}

public class ExceptionsEx10 {
	public static void main(String[] args) {
		MyClass class2 = new MyClass();
		try {
			class2.f();
		} catch (PersonalException2 e) {
			e.printStackTrace(System.out);
		}
	}
}
