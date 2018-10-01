package initialization.exercises;

public class InitializationEx19 {
	static void f(String... args) {
		for(String str : args) {
			System.out.print(str + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		f("str1", "str2", "str3");
		f(new String[]{"str4", "str5", "str6"});
	}
}
