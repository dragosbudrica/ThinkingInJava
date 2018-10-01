package initialization.exercises;

enum Currency {
	ONE, FIVE, TEN, TWENTY, FIFTY, HUNDRED
}

public class InitializationEx21 {
	public static void main(String[] args) {
		for (Currency curr : Currency.values()) {
			System.out.println(curr + ", ordinal " + curr.ordinal());
		}
	}
}
