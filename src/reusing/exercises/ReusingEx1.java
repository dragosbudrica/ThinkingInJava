package reusing.exercises;

class FirstClass {
	public String toString() {
		return "first class";
	}
}

class SecondClass {
	private FirstClass fc;
	
	public void initializeFirstClassMemberAndDisplayId() {
		fc = new FirstClass();
		System.out.println(fc);
	}
	
	public FirstClass getFc() {
		return fc;
	}
}

public class ReusingEx1 {
	public static void main(String[] args) {
		SecondClass sc = new SecondClass();
		sc.initializeFirstClassMemberAndDisplayId();
	}
}
