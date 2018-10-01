package polymorphism.exercise14;

public class Characteristic {
	@SuppressWarnings("unused")
	private String s;
	Characteristic(String s) {
		this.s = s;
		System.out.println("Creating Characteristic " + s);
	}
}
