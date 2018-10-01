package exceptions.exercises;

@SuppressWarnings("serial")
class MyException extends Exception {
	private String msg;
	public MyException(String msg) {
		super(msg);
		this.msg = msg;
	}
	public void printMsg() {
		System.out.println(msg);
	}
}

public class ExceptionsEx4 {
	public static void main(String[] args) {
		try {
			System.out.println("Throwing MyException in main");
			throw new MyException("Originated in main");
		} catch(MyException e) {
			e.printMsg();
			e.printStackTrace(System.out);
		}
	}
}
