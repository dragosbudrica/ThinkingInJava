package operators.exercises;

public class OperatorsEx10 {
	int const1 = 0xAAAAAAAA;
	int const2 = 0x55555555;
	
	public static void main(String[] args) {
		OperatorsEx10 bo = new OperatorsEx10();
		
		System.out.println(Integer.toBinaryString(bo.const1) + " & " + Integer.toBinaryString(bo.const1) + " : " + Integer.toBinaryString(bo.const1 & bo.const1));
		System.out.println(Integer.toBinaryString(bo.const1) + " & ~" + Integer.toBinaryString(bo.const1) + " : " + Integer.toBinaryString(bo.const1 & (~bo.const1)));
		System.out.println(Integer.toBinaryString(bo.const1) + " & ~" + Integer.toBinaryString(bo.const2) + " : " + Integer.toBinaryString(bo.const1 & (~bo.const2)));
		System.out.println(Integer.toBinaryString(bo.const1) + " & " + Integer.toBinaryString(bo.const2) + " : " + Integer.toBinaryString(bo.const1 & bo.const2));
		
		
		System.out.println(Integer.toBinaryString(bo.const1) + " | " + Integer.toBinaryString(bo.const1) + " : " + Integer.toBinaryString(bo.const1 | bo.const1));
		System.out.println(Integer.toBinaryString(bo.const1) + " | ~" + Integer.toBinaryString(bo.const1) + " : " + Integer.toBinaryString(bo.const1 | (~bo.const1)));
		System.out.println(Integer.toBinaryString(bo.const1) + " | ~" + Integer.toBinaryString(bo.const2) + " : " + Integer.toBinaryString(bo.const1 | (~bo.const2)));
		System.out.println(Integer.toBinaryString(bo.const1) + " | " + Integer.toBinaryString(bo.const2) + " : " + Integer.toBinaryString(bo.const1 | bo.const2));
		
		System.out.println(Integer.toBinaryString(bo.const1) + " ^ " + Integer.toBinaryString(bo.const1) + " : " + Integer.toBinaryString(bo.const1 ^ bo.const1));
		System.out.println(Integer.toBinaryString(bo.const1) + " ^ ~" + Integer.toBinaryString(bo.const1) + " : " + Integer.toBinaryString(bo.const1 ^ (~bo.const1)));
		System.out.println(Integer.toBinaryString(bo.const1) + " ^ ~" + Integer.toBinaryString(bo.const2) + " : " + Integer.toBinaryString(bo.const1 ^ (~bo.const2)));
		System.out.println(Integer.toBinaryString(bo.const1) + " ^ " + Integer.toBinaryString(bo.const2) + " : " + Integer.toBinaryString(bo.const1 ^ bo.const2));
		
		System.out.println("~" + Integer.toBinaryString(bo.const1) + " : " + Integer.toBinaryString(~bo.const1));
		System.out.println("~" + Integer.toBinaryString(bo.const2) + " : " + Integer.toBinaryString(~bo.const2));
		
		
		System.out.println("~" + Integer.toBinaryString(bo.const1) + " & ~" + Integer.toBinaryString(bo.const1) + " : " + Integer.toBinaryString((~bo.const1) & (~bo.const1)));
		System.out.println("~" + Integer.toBinaryString(bo.const1) + " | ~" + Integer.toBinaryString(bo.const1) + " : " + Integer.toBinaryString((~bo.const1) | (~bo.const1)));
		System.out.println("~" + Integer.toBinaryString(bo.const1) + " ^ ~" + Integer.toBinaryString(bo.const1) + " : " + Integer.toBinaryString((~bo.const1) ^ (~bo.const1)));
		
		System.out.println("~" + Integer.toBinaryString(bo.const2) + " & ~" + Integer.toBinaryString(bo.const2) + " : " + Integer.toBinaryString((~bo.const2) & (~bo.const2)));
		System.out.println("~" + Integer.toBinaryString(bo.const2) + " | ~" + Integer.toBinaryString(bo.const2) + " : " + Integer.toBinaryString((~bo.const2) | (~bo.const2)));
		System.out.println("~" + Integer.toBinaryString(bo.const2) + " ^ ~" + Integer.toBinaryString(bo.const2) + " : " + Integer.toBinaryString((~bo.const2) ^ (~bo.const2)));
		
		
		System.out.println("~" + Integer.toBinaryString(bo.const1) + " & ~" + Integer.toBinaryString(bo.const2) + " : " + Integer.toBinaryString((~bo.const1) & (~bo.const2)));
		System.out.println("~" + Integer.toBinaryString(bo.const1) + " | ~" + Integer.toBinaryString(bo.const2) + " : " + Integer.toBinaryString((~bo.const1) | (~bo.const2)));
		System.out.println("~" + Integer.toBinaryString(bo.const1) + " ^ ~" + Integer.toBinaryString(bo.const2) + " : " + Integer.toBinaryString((~bo.const1) ^ (~bo.const2)));
		
		System.out.println(Integer.toBinaryString(bo.const2) + " & " + Integer.toBinaryString(bo.const2) + " : " + Integer.toBinaryString(bo.const2 & bo.const2));
		System.out.println(Integer.toBinaryString(bo.const2) + " & ~" + Integer.toBinaryString(bo.const1) + " : " + Integer.toBinaryString(bo.const2 & (~bo.const1)));
		System.out.println(Integer.toBinaryString(bo.const2) + " & ~" + Integer.toBinaryString(bo.const2) + " : " + Integer.toBinaryString(bo.const2 & (~bo.const2)));
		
		System.out.println(Integer.toBinaryString(bo.const2) + " | " + Integer.toBinaryString(bo.const2) + " : " + Integer.toBinaryString(bo.const2 | bo.const2));
		System.out.println(Integer.toBinaryString(bo.const2) + " | ~" + Integer.toBinaryString(bo.const1) + " : " + Integer.toBinaryString(bo.const2 | (~bo.const1)));
		System.out.println(Integer.toBinaryString(bo.const2) + " | ~" + Integer.toBinaryString(bo.const2) + " : " + Integer.toBinaryString(bo.const2 | (~bo.const2)));
		
		System.out.println(Integer.toBinaryString(bo.const2) + " ^ " + Integer.toBinaryString(bo.const2) + " : " + Integer.toBinaryString(bo.const2 ^ bo.const2));
		System.out.println(Integer.toBinaryString(bo.const2) + " ^ ~" + Integer.toBinaryString(bo.const1) + " : " + Integer.toBinaryString(bo.const2 ^ (~bo.const1)));
		System.out.println(Integer.toBinaryString(bo.const2) + " ^ ~" + Integer.toBinaryString(bo.const2) + " : " + Integer.toBinaryString(bo.const2 ^ (~bo.const2)));
	}
}
