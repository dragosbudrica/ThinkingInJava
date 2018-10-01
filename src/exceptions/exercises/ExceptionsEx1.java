package exceptions.exercises;

public class ExceptionsEx1 {
	public static void main(String[] args) {
		try {
		throw new Exception("Originated in main");
		} catch(Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Finally is always executed");
		}
	}
}
