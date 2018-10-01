package exceptions.exercises;

@SuppressWarnings("serial")
class MyPersonalExp extends RuntimeException {
	private String msg;
	public MyPersonalExp(String msg) {
		super(msg);
		this.msg = msg;
	}
	public void printMsg() {
		System.out.println(msg);
	}
}

public class ExceptionsEx28 {
	public static void main(String[] args) {
			System.out.println("Throwing MyPersonalExp in main");
			MyPersonalExp me2 = new MyPersonalExp("Originated in main");
			me2.printMsg();
			throw me2;
	}
}

