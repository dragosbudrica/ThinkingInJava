package access.exercise4_a;

public class AccessEx4_a {
	public static void main(String[] args) {
		Prot prot = new Prot();
		// protected methods can be accessed by other classes from the same package
		prot.testProd1(); 
		prot.testProd2();
	}
}
