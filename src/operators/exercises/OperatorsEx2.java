package operators.exercises;

public class OperatorsEx2 {
	float floatNumber;
	
	public static void main(String[] args) {
		OperatorsEx2 alias1 = new OperatorsEx2();
		OperatorsEx2 alias2 = new OperatorsEx2();
		
		alias1.floatNumber = 75.2F;
		alias2.floatNumber = 101.35F;
		
		System.out.println("1: alias1.floatNumber: " + alias1.floatNumber
				 + ", alias2.floatNumber: " + alias2.floatNumber);
		alias1 = alias2;
		System.out.println("2: alias1.floatNumber: " + alias1.floatNumber
				 + ", alias2.floatNumber: " + alias2.floatNumber);
		alias2.floatNumber = 3.125F;
		System.out.println("3: alias1.floatNumber: " + alias1.floatNumber
				 + ", alias2.floatNumber: " + alias2.floatNumber);
	}
}
