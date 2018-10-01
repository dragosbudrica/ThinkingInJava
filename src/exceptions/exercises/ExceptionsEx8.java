package exceptions.exercises;

class Class {
	public void f() throws MyException {
		System.out.println("Throwing MyException from f()");
		throw new MyException("Originated in f()"); // If it is compiled without exception specification, the message "Unhandled exception type MyException" appears.
	}
}
public class ExceptionsEx8 {
	public static void main(String[] args) {
		try {
			Class cls = new Class();
			cls.f();
		} catch(MyException e) {
			e.printMsg();
			e.printStackTrace(System.out);
		}
	}
}
