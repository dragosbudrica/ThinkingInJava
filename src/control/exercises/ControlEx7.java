package control.exercises;

public class ControlEx7 {
	public static void displayWithBreak() {
		for(int i = 1; i <= 100; i++) {
			System.out.println(i);
			if(i == 99)
				break;
		}
	}
	public static void displayWithReturn() {
		for(int i = 1; i <= 100; i++) {
			System.out.println(i);
			if(i == 99)
				return;
		}
	}
	public static void main(String[] args) {
		displayWithBreak();
		System.out.println();
		displayWithReturn();
	}
}
