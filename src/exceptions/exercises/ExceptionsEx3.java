package exceptions.exercises;

public class ExceptionsEx3 {
	public static void main(String[] args) {
		try {
			Integer[] arrayOfInteger = new Integer[5];
			arrayOfInteger[5] = 10;
		} catch (ArrayIndexOutOfBoundsException aioobe) {
			System.out.println("ArrayIndexOutOfBoundsException handled!");
		}
	}
}
