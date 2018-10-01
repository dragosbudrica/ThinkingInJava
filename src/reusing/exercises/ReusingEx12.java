package reusing.exercises;

class Component1WithDisp {
	Component1WithDisp() {
		System.out.println("Component1WithDisp default constructor called");
	}
	void dispose() {
		System.out.println("Component1WithDisp dispose");
	}
}
class Component2WithDisp {
	Component2WithDisp() {
		System.out.println("Component2WithDisp default constructor called");
	}
	void dispose() {
		System.out.println("Component2WithDisp dispose");
	}
}
class Component3WithDisp {
	Component3WithDisp() {
		System.out.println("Component3WithDisp default constructor called");
	}
	void dispose() {
		System.out.println("Component3WithDisp dispose");
	}
}

class RootWithDisp {
	Component1WithDisp comp1;
	Component2WithDisp comp2;
	Component3WithDisp comp3;
	
	RootWithDisp() {
		comp1 = new Component1WithDisp();
		comp2 = new Component2WithDisp();
		comp3 = new Component3WithDisp();
		System.out.println("RootDisp default constructor called");
	}
	
	void dispose() {
		System.out.println("RootDisp dispose");
		comp3.dispose();
		comp2.dispose();
		comp1.dispose();
	}
}

class StemWithDisp extends RootWithDisp {
	Component1WithDisp comp1;
	Component2WithDisp comp2;
	Component3WithDisp comp3;
	
	StemWithDisp() {
		comp1 = new Component1WithDisp();
		comp2 = new Component2WithDisp();
		comp3 = new Component3WithDisp();
		System.out.println("StemWithDisp default constructor called");
	}
	
	void dispose() {
		System.out.println("StemDisp dispose");
		comp3.dispose();
		comp2.dispose();
		comp1.dispose();
		super.dispose();
	}
}

public class ReusingEx12 {
	public static void main(String[] args) {
		StemWithDisp sd = new StemWithDisp();
		try {
		} finally {
			sd.dispose();
		}
	}
}