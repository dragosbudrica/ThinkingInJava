package initialization.exercises;

public class InitializationEx14 {
	static String str1 = new String("str1");
	static String str2;
	static {
		str2 = new String("str2");
	}
	static void test() {
		System.out.println(str1 + " " + str2);
	}
	public static void main(String[] args) {
		InitializationEx14.test();
	}
}
