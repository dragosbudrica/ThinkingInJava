package control.exercises;

public class ControlEx5 {
	int const1 = 0xAAAAAAAA;
	int const2 = 0x55555555;

	public String decimalToBinary(int dec) {
		String result = "";

		if (dec == 0)
			return "0";
		else if (dec == -1)
			return "11111111111111111111111111111111";

		int actualNumber = (dec < 0) ? ~dec : dec;
		result += (dec < 0) ? "0" : "";

		while (actualNumber != 0) {
			result = (actualNumber % 2) + result;
			actualNumber /= 2;
		}

		return result;
	}

	public static void main(String[] args) {
		ControlEx5 bo = new ControlEx5();

		System.out.println(bo.decimalToBinary(bo.const1) + " & "
				+ bo.decimalToBinary(bo.const1) + " : "
				+ bo.decimalToBinary(bo.const1 & bo.const1));
		System.out.println(bo.decimalToBinary(bo.const1) + " & ~"
				+ bo.decimalToBinary(bo.const1) + " : "
				+ bo.decimalToBinary(bo.const1 & (~bo.const1)));
		System.out.println(bo.decimalToBinary(bo.const1) + " & ~"
				+ bo.decimalToBinary(bo.const2) + " : "
				+ bo.decimalToBinary(bo.const1 & (~bo.const2)));
		System.out.println(bo.decimalToBinary(bo.const1) + " & "
				+ bo.decimalToBinary(bo.const2) + " : "
				+ bo.decimalToBinary(bo.const1 & bo.const2));

		System.out.println(bo.decimalToBinary(bo.const1) + " | "
				+ bo.decimalToBinary(bo.const1) + " : "
				+ bo.decimalToBinary(bo.const1 | bo.const1));
		System.out.println(bo.decimalToBinary(bo.const1) + " | ~"
				+ bo.decimalToBinary(bo.const1) + " : "
				+ bo.decimalToBinary(bo.const1 | (~bo.const1)));
		System.out.println(bo.decimalToBinary(bo.const1) + " | ~"
				+ bo.decimalToBinary(bo.const2) + " : "
				+ bo.decimalToBinary(bo.const1 | (~bo.const2)));
		System.out.println(bo.decimalToBinary(bo.const1) + " | "
				+ bo.decimalToBinary(bo.const2) + " : "
				+ bo.decimalToBinary(bo.const1 | bo.const2));

		System.out.println(bo.decimalToBinary(bo.const1) + " ^ "
				+ bo.decimalToBinary(bo.const1) + " : "
				+ bo.decimalToBinary(bo.const1 ^ bo.const1));
		System.out.println(bo.decimalToBinary(bo.const1) + " ^ ~"
				+ bo.decimalToBinary(bo.const1) + " : "
				+ bo.decimalToBinary(bo.const1 ^ (~bo.const1)));
		System.out.println(bo.decimalToBinary(bo.const1) + " ^ ~"
				+ bo.decimalToBinary(bo.const2) + " : "
				+ bo.decimalToBinary(bo.const1 ^ (~bo.const2)));
		System.out.println(bo.decimalToBinary(bo.const1) + " ^ "
				+ bo.decimalToBinary(bo.const2) + " : "
				+ bo.decimalToBinary(bo.const1 ^ bo.const2));

		System.out.println("~" + bo.decimalToBinary(bo.const1) + " : "
				+ bo.decimalToBinary(~bo.const1));
		System.out.println("~" + bo.decimalToBinary(bo.const2) + " : "
				+ bo.decimalToBinary(~bo.const2));

		System.out.println("~" + bo.decimalToBinary(bo.const1) + " & ~"
				+ bo.decimalToBinary(bo.const1) + " : "
				+ bo.decimalToBinary((~bo.const1) & (~bo.const1)));
		System.out.println("~" + bo.decimalToBinary(bo.const1) + " | ~"
				+ bo.decimalToBinary(bo.const1) + " : "
				+ bo.decimalToBinary((~bo.const1) | (~bo.const1)));
		System.out.println("~" + bo.decimalToBinary(bo.const1) + " ^ ~"
				+ bo.decimalToBinary(bo.const1) + " : "
				+ bo.decimalToBinary((~bo.const1) ^ (~bo.const1)));

		System.out.println("~" + bo.decimalToBinary(bo.const2) + " & ~"
				+ bo.decimalToBinary(bo.const2) + " : "
				+ bo.decimalToBinary((~bo.const2) & (~bo.const2)));
		System.out.println("~" + bo.decimalToBinary(bo.const2) + " | ~"
				+ bo.decimalToBinary(bo.const2) + " : "
				+ bo.decimalToBinary((~bo.const2) | (~bo.const2)));
		System.out.println("~" + bo.decimalToBinary(bo.const2) + " ^ ~"
				+ bo.decimalToBinary(bo.const2) + " : "
				+ bo.decimalToBinary((~bo.const2) ^ (~bo.const2)));

		System.out.println("~" + bo.decimalToBinary(bo.const1) + " & ~"
				+ bo.decimalToBinary(bo.const2) + " : "
				+ bo.decimalToBinary((~bo.const1) & (~bo.const2)));
		System.out.println("~" + bo.decimalToBinary(bo.const1) + " | ~"
				+ bo.decimalToBinary(bo.const2) + " : "
				+ bo.decimalToBinary((~bo.const1) | (~bo.const2)));
		System.out.println("~" + bo.decimalToBinary(bo.const1) + " ^ ~"
				+ bo.decimalToBinary(bo.const2) + " : "
				+ bo.decimalToBinary((~bo.const1) ^ (~bo.const2)));

		System.out.println(bo.decimalToBinary(bo.const2) + " & "
				+ bo.decimalToBinary(bo.const2) + " : "
				+ bo.decimalToBinary(bo.const2 & bo.const2));
		System.out.println(bo.decimalToBinary(bo.const2) + " & ~"
				+ bo.decimalToBinary(bo.const1) + " : "
				+ bo.decimalToBinary(bo.const2 & (~bo.const1)));
		System.out.println(bo.decimalToBinary(bo.const2) + " & ~"
				+ bo.decimalToBinary(bo.const2) + " : "
				+ bo.decimalToBinary(bo.const2 & (~bo.const2)));

		System.out.println(bo.decimalToBinary(bo.const2) + " | "
				+ bo.decimalToBinary(bo.const2) + " : "
				+ bo.decimalToBinary(bo.const2 | bo.const2));
		System.out.println(bo.decimalToBinary(bo.const2) + " | ~"
				+ bo.decimalToBinary(bo.const1) + " : "
				+ bo.decimalToBinary(bo.const2 | (~bo.const1)));
		System.out.println(bo.decimalToBinary(bo.const2) + " | ~"
				+ bo.decimalToBinary(bo.const2) + " : "
				+ bo.decimalToBinary(bo.const2 | (~bo.const2)));

		System.out.println(bo.decimalToBinary(bo.const2) + " ^ "
				+ bo.decimalToBinary(bo.const2) + " : "
				+ bo.decimalToBinary(bo.const2 ^ bo.const2));
		System.out.println(bo.decimalToBinary(bo.const2) + " ^ ~"
				+ bo.decimalToBinary(bo.const1) + " : "
				+ bo.decimalToBinary(bo.const2 ^ (~bo.const1)));
		System.out.println(bo.decimalToBinary(bo.const2) + " ^ ~"
				+ bo.decimalToBinary(bo.const2) + " : "
				+ bo.decimalToBinary(bo.const2 ^ (~bo.const2)));
	}
}
