package operators.exercises;

public class OperatorsEx8 {
	public static void main(String[] args) {
		long l1 = 0X2FFFFFFFFFL;
		System.out.println("l1: " + Long.toBinaryString(l1));
		long l2 = 0x2fffffffffl;
		System.out.println("l2: " + Long.toBinaryString(l2));
		long l3 = 0777777777777L;
		System.out.println("l3: " + Long.toBinaryString(l3));
	}
}
