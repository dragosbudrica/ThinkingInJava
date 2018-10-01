package operators.exercises;

public class OperatorsEx14 {
	public static void stringComp(String str1, String str2) {
		System.out.println(str1 + " == " + str2 + " : " + (str1 == str2));
		System.out.println(str1 + " != " + str2 + " : " + (str1 != str2));
		System.out.println(str1 + ".equals(" + str2 + ") : " +  str1.equals(str2));
	}
	
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "bcd";
		String s3 = s1;
		stringComp(s1, s2);
		System.out.println();
		stringComp(s1, s3);
		System.out.println();
		stringComp(s2, s3);
	}
}
