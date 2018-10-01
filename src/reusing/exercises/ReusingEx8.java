package reusing.exercises;

class Class1 {
	Class1(String constr) {
		System.out.println(constr);
	}
}

class Class2 extends Class1 {
	Class2() {
		super("default constructor");
	}
	
	Class2(String constrTest) {
		super(constrTest);
	}
}

public class ReusingEx8 {
	public static void main(String[] args) {
		new Class2();
		new Class2("non-default constructor");
	}
}
