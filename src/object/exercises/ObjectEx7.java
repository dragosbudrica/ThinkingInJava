package object.exercises;

class StaticTest {
	static int i = 47;
}

public class ObjectEx7 {
	static void increment() { StaticTest.i++; }

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		ObjectEx7 sf = new ObjectEx7();
		sf.increment();
		ObjectEx7.increment();
		
		System.out.println(StaticTest.i);
	}
}
