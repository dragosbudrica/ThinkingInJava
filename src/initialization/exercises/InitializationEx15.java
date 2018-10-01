package initialization.exercises;

public class InitializationEx15 {
	String str;
	{ 
		str = new String("str");
	}
	public static void main(String[] args) {
		InitializationEx15 it = new InitializationEx15();
		System.out.println(it.str);
	}
}
