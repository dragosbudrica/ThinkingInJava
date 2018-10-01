package initialization.exercise6;

class Dog {
	void bark(char action) {
		System.out.println("The dog is barking.");
	}
	
	void bark(byte action) {
		System.out.println("The dog is howling.");
	}
	
	void bark(short action1, int action2) {
		System.out.println("The dog is yelping and is baying.");
	}
	
	void bark(int action1, short action2) {
		System.out.println("The dog is baying and is yelping.");
	}
	
	void bark(long action) {
		System.out.println("The dog is yaping.");
	}
	
	void bark(float action) {
		System.out.println("The dog is whimpering.");
	}
	
	void bark(double action) {
		System.out.println("The dog is whining.");
	}
}

public class InitializationEx6 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		
		char c = 'c';
		byte b = 0;
		short s = 0;
		int i = 0;
		long l = 0;
		float f = 0;
		double d = 0;
	
		dog.bark(c);
		dog.bark(b);
		dog.bark(s, i);
		dog.bark(i, s);
		dog.bark(l);
		dog.bark(f);
		dog.bark(d);
	}
}

