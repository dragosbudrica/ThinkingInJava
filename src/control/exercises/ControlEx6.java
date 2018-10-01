package control.exercises;

public class ControlEx6 {
	static int result = 0;
	
	static void test1(int testval, int target, int begin, int end) {
		if(testval > target && testval >= begin && testval < end)
			result = +1;
		else if(testval < target && testval >= begin && testval < end)
			result = -1;
		else if((testval > target || testval < target) && (testval < begin || testval >= end))
			System.out.println("The testval number is not in the specified interval!");
		else
			result = 0; 
	}
	
	static int test2(int testval, int target, int begin, int end) {
		if(testval > target && testval >= begin && testval < end)
			return +1;
		else if(testval < target && testval >= begin && testval < end)
			return -1;
		else if((testval > target || testval < target) && (testval < begin || testval >= end))
			return 500;
		else 
			return 0; 
	}
	public static void main(String[] args) {
		System.out.println("TEST1:");
		test1(10, 5, 0, 20);
		System.out.println(result);
		test1(5, 10, 0, 20);
		System.out.println(result);
		test1(5, 5, 0, 20);
		System.out.println(result);
		System.out.println("TEST2:");
		int number1 = test2(10, 5, 0, 20);
		int number2 = test2(5, 10, 0, 20);
		int number3 = test2(5, 5, 0, 20);
		if(number1 != 500)
			System.out.println(number1);
		else
			System.out.println("The testval number is not in the specified interval!");
		if(number2!= 500)
			System.out.println(number2);
		else
			System.out.println("The testval number is not in the specified interval!");
		if(number3 != 500)
			System.out.println(number3);
		else
			System.out.println("The testval number is not in the specified interval!");
	}
}
