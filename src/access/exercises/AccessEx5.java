package access.exercises;

class AccessModifiers {
	private int a;
	protected int b;
	public int c;
	int d;
	
	@SuppressWarnings("unused")
	private void displayA() {
		System.out.println("a=" + a);
	}
	
	protected void displayB() {
		System.out.println("b=" + b);
	}
	
	public void displayC() {
		System.out.println("c=" + c);
	}
	
	void displayD() {
		System.out.println("d=" + d);
	}
}

public class AccessEx5 {
	public static void main(String[] args) {
		AccessModifiers am = new AccessModifiers();
		//	System.out.println("am.a=" + am.a);  cannot access this field
			System.out.println("am.b=" + am.b);
			System.out.println("am.c=" + am.c);
			System.out.println("am.d=" + am.d);
		//	am.displayA();  cannot access this method
			am.displayB();
			am.displayC();
			am.displayD();
	}
}
