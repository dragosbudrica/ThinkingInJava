package control.exercises;

public class ControlEx3 {
	private static String compareIntNumbers(int number1, int number2) {
		String result = null;
		if (number1 > number2)
			result = "Greater";
		else if (number1 < number2)
			result = "Lower";
		else
			result = "Equal";

		return result;
	}

	public static int generateRandomInt(int lower, int higher) {
		int number = (int) (lower + Math.random() * (higher - lower));
		return number;
	}

	public static void main(String[] args) {
		while (true) {
			for (int i = 1; i <= 13; i++) {
				if (i < 13) {
					int number1 = generateRandomInt(10, 100);
					int number2 = generateRandomInt(10, 100);
					System.out.println(compareIntNumbers(number1, number2));

				} else {
					int finalNumber = generateRandomInt(10, 100);
					System.out
							.println(finalNumber
									+ " is the 25th number so it's just equal with itself.");
				}
			}
		}
	}
}
