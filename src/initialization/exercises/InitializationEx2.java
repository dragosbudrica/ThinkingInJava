package initialization.exercises;

public class InitializationEx2 {
	String string1 = "string1"; // initialized when the class is loaded
	String string2;
	
	InitializationEx2() {
		string2 = "string2"; // initialized when an instance from this class is constructed
	}
	
	public static void main(String[] args) {
		InitializationEx2 obj = new InitializationEx2();
		System.out.println(obj.string1);
		System.out.println(obj.string2);
	}
}
