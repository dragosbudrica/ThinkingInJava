package control.exercises;

public class ControlEx9 {
	public static void fibonacciNumbers(int number) {
		if (number <= 0) {
			System.out.println("The number is not positive!");
			return;
		}
		int[] numbers = new int[number];
		switch (number) {
		case 1:
			numbers[0] = 1;
			break;
		case 2:
			numbers[0] = 1;
			numbers[1] = 1;
			break;
		default:
			numbers[0] = 1;
			numbers[1] = 1;
			for (int i = 2; i < numbers.length; i++) {
				numbers[i] = numbers[i - 2] + numbers[i - 1];
			}
		}

		for (int i = 0; i < numbers.length; i++) {
			if (i != numbers.length - 1)
				System.out.print(numbers[i] + ", ");
			else
				System.out.println(numbers[i]);
		}
	}

	public static void main(String[] args) {
		fibonacciNumbers(5);
	}
}
