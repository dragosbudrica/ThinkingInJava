package exceptions.exercises;

public class ExceptionsEx2 {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		try {
			String str = null;
			System.out.println(str.toCharArray());
		} catch (NullPointerException npe) {
			System.out.println("NullPointerException handled!");
		}
	}
}
