package control.exercises;

public class ControlEx4 {
	public static void displayPrimeNumbersUntil(int high) {
		for (int i = 2; i <= high; i++) {
			int ok = 0;
			for (int d = 2; d <= i / 2; d++) {
				if (i % d == 0) {
					ok = 1;
					break;
				}
			}
			if(ok == 0)
				System.out.println(i + " is a prime number");
		}
	}

	public static void main(String[] args) {
		displayPrimeNumbersUntil(100);
	}
}
