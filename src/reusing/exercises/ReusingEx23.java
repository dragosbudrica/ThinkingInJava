package reusing.exercises;

class Proof1 {
	static String str = "abc";
	int b;
	int a = 15;
	Proof1() {
		System.out.println("Proof1 default constructor called");
		this.b = 30;
	}
}

class Proof2 {
	static String str = "abc";
	int b;
	int a = 15;
	Proof2() {
		System.out.println("Default Constructor called");
		this.b = 30;
	}
}

public class ReusingEx23 {
	public static void main(String[] args) {
		new Proof1();
		System.out.println("Proof2.str = " + Proof2.str);
	}
}
