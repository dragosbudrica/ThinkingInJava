package generics.exercise2;

public class GenericsEx2<T> {
	private T a;
	private T b;
	private T c;
	public GenericsEx2(T a, T b, T c) { 
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public void setA(T a) { this.a = a; }
	public T getA() { return a; }
	public void setB(T b) { this.b = b; }
	public T getB() { return b; }
	public void setC(T c) { this.c = c; }
	public T getC() { return c; }
	public static void main(String[] args) {
		GenericsEx2<String> strings = new GenericsEx2<String>("Dragos", "Budrica", 
				"1931202160022");
		System.out.println("First Name: " + strings.getA());
		System.out.println("Last Name: " + strings.getB());
		System.out.println("CNP: " + strings.getC());
	}
}
