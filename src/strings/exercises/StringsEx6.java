package strings.exercises;

class MyClass {
	private int myInt;
	private long myLong;
	private float myFloat;
	private double myDouble;
	
	public MyClass(int myInt, long myLong, float myFloat, double myDouble) {
		this.myInt = myInt;
		this.myLong = myLong;
		this.myFloat = myFloat;
		this.myDouble = myDouble;
	}
	
	public String toString() {
		return String.format("myInt = %3d\nmyLong = %3d\nmyFloat = %5.2f\nmyDouble = %5.2f", myInt, myLong, myFloat, myDouble);
	}
}

public class StringsEx6 {
	public static void main(String[] args) {
		MyClass mc = new MyClass(100, 150, 100.104f, 150.109d);
		System.out.println(mc);
	}
}
