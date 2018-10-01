package reusing.exercises;

class Component1 {
	Component1() {
		System.out.println("Component1 default constructor called");
	}
}
class Component2 {
	Component2() {
		System.out.println("Component2 default constructor called");
	}
}
class Component3 {
	Component3() {
		System.out.println("Component3 default constructor called");
	}
}

class Root {
	Component1 comp1 = new Component1();
	Component2 comp2 = new Component2();
	Component3 comp3 = new Component3();
	
	Root() {
		System.out.println("Root default constructor called");
	}
}

class Stem extends Root {
	Component1 comp1 = new Component1();
	Component2 comp2 = new Component2();
	Component3 comp3 = new Component3();
	
	Stem() {
		System.out.println("Stem default constructor called");
	}
}

public class ReusingEx9 {
	public static void main(String[] args) {
		new Stem();
	}
}


