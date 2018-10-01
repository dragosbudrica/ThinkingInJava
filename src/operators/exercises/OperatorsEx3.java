package operators.exercises;

public class OperatorsEx3 {
	float floatNumber;
	
	static void f(OperatorsEx3 am) {
		am.floatNumber = 18.75F;
	}
	
	public static void main(String[] args) {
		OperatorsEx3 am1 = new OperatorsEx3();
		am1.floatNumber = 20.05F;
		System.out.println("1: am1.floatNumber: " + am1.floatNumber);
		f(am1);
		System.out.println("2: am1.floatNumber: " + am1.floatNumber);
	}
}
