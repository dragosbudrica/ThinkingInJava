package initialization.exercises;

class Dog {
	void bark(char action) {
		System.out.println("The dog is barking.");
	}
	
	void bark(byte action) {
		System.out.println("The dog is howling.");
	}
	
	void bark(short action) {
		System.out.println("The dog is yelping.");
	}
	
	void bark(int action) {
		System.out.println("The dog is baying.");
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

public class InitializationEx5 {
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
		dog.bark(s);
		dog.bark(i);
		dog.bark(l);
		dog.bark(f);
		dog.bark(d);
	}
}
