package control.exercises;

public class ControlEx10 {
	public static boolean vampire(int number) {
		int digit1 = number / 1000;
		int digit2 = (number / 100) % 10;
		int digit3 = (number / 10) % 10;
		int digit4 = number % 10;
		
		int[] pairs = new int[12];
		pairs[0] = digit1 * 10 + digit2;
		pairs[1] = digit1 * 10 + digit3;
		pairs[2] = digit1 * 10 + digit4;
		pairs[3] = digit2 * 10 + digit3;
		pairs[4] = digit2 * 10 + digit4;
		pairs[5] = digit3 * 10 + digit4;
	
		pairs[6] = digit2 * 10 + digit1;
		pairs[7] = digit3 * 10 + digit1;
		pairs[8] = digit4 * 10 + digit1;
		pairs[9] = digit3 * 10 + digit2;
		pairs[10] = digit4 * 10 + digit2;
		pairs[11] = digit4 * 10 + digit3;
		
		int i = 0;
		int j = pairs.length - 1;
		while(i <= pairs.length / 2 - 1 && j >= pairs.length / 2) {
			if(pairs[i] != 0 && pairs[j] != 0 && (pairs[i] * pairs[j] == number)) {
				return true;
			}
			i++;
			j--;
		}
		
		i = 0;
		j = pairs.length / 2 - 1;
		while(i <= j) {
			if(pairs[i] != 0 && pairs[j] != 0 && (pairs[i] * pairs[j] == number)) {
				return true;
			}
			i++;
			j--;
		}
		
		i = pairs.length / 2;
		j = pairs.length - 1;
		while(i <= j) {
			if(pairs[i] != 0 && pairs[j] != 0 && (pairs[i] * pairs[j] == number)) {
				return true;
			}
			i++;
			j--;
		}
		
		return false;
	}

	public static void main(String[] args) {
		for (int i = 1000; i <= 9999; i++) {
			if(vampire(i))
				System.out.println(i + " is a vampire number.");
		}
	}
}
