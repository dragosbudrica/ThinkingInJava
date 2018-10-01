package exceptions.exercises;

public class ExceptionsEx27 {
	public static void main(String[] args) {
		try {
			Integer[] arrayOfInteger = new Integer[5];
			arrayOfInteger[5] = 10;
		} catch (ArrayIndexOutOfBoundsException aioobe) {
			throw new RuntimeException(aioobe);
		}
	}
}
