package control.exercises;

public class ControlEx8 {
	public static void switchWithBreaks() {
		for(int i = 1; i <= 5; i++) {
			switch(i) {
			case 1:
				System.out.println("Case 1 executed");
				break;
			case 2:
				System.out.println("Case 2 executed");
				break;
			case 3:
				System.out.println("Case 3 executed");
				break;
			case 4:
				System.out.println("Case 4 executed");
				break;
			case 5:
				System.out.println("Case 5 executed");
				break;
			}
		}
	}
	
	public static void switchWithoutBreaks() {
		for(int i = 1; i <= 5; i++) {
			switch(i) {
			case 1:
				System.out.println("Case 1 executed");
			case 2:
				System.out.println("Case 2 executed");
			case 3:
				System.out.println("Case 3 executed");
			case 4:
				System.out.println("Case 4 executed");
			case 5:
				System.out.println("Case 5 executed");
			}
		}
	}
	
	public static void main(String[] args) {
		switchWithBreaks();
		System.out.println();
		switchWithoutBreaks();
	}
}
