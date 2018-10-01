package reusing.exercises;

class Test4 {
	final void testMethod() {
		System.out.println("some text");
	}
}

class OverrideFinalMethod extends Test4 {
/*	void testMethod() {
		System.out.println("Override doesn't work!"); // Cannot override the final method from Test4
	}  */ 
}

public class ReusingEx21 {
	public static void main(String[] args) {
		OverrideFinalMethod ofm = new OverrideFinalMethod();
		ofm.testMethod();
	}
}
