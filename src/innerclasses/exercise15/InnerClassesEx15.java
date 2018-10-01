package innerclasses.exercise15;

class Class1 {
	private int number1;
	private String str1;
	Class1(int number1, String str1){
		this.number1 = number1;
		this.str1 = str1;
	}
	public int getNumber1() {
		return number1;
	}
	public String getStr1() {
		return str1;
	}
}

class Class2 {
	public Class1 method(int number1, String str1) {
		return new Class1(number1, str1) {};
	}
}

public class InnerClassesEx15 {
	public static void main(String[] args) {
		Class2 class2 = new Class2();
		Class1 class1 = class2.method(23, "Dragos");
		System.out.println("Number1 = " + class1.getNumber1());
		System.out.println("Str1: " + class1.getStr1());
	}
}
