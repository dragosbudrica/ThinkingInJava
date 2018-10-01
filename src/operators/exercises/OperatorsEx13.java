package operators.exercises;

public class OperatorsEx13 {
	public static String charBinaryValue(char ch) {
		return Integer.toBinaryString(ch);
	}
	
	public static void main(String[] args) {
		System.out.println(charBinaryValue('c'));
		System.out.println(charBinaryValue('A'));
		System.out.println(charBinaryValue('b'));
	}
}
