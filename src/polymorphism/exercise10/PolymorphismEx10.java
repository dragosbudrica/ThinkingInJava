package polymorphism.exercise10;

class Class1 {
	void firstMethod() {
		secondMethod();
	}
	void secondMethod() {
		System.out.println("Class1 Second Method");
	}
}

class Class2 extends Class1 {
	@Override
	 void secondMethod() {
;		 System.out.println("Class2 Second Method");
	 }
}

public class PolymorphismEx10 {
	public static void main(String[] args) {
		Class1 cls2 = new Class2();
		cls2.firstMethod(); // At compile time, the compiler observe that firstMethod() is not overriden, so it is called from Class1, but in firstMethod, the secondMethod() is called, which it's overriden in Class2 so it is called from Class2.
	}
}
