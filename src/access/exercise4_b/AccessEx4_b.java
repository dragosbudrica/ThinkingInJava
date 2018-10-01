package access.exercise4_b;
import access.exercise4_a.Prot;

public class AccessEx4_b {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Prot prot = new Prot();
		// protected methods cannot be accessed by the classes from a different package
		//! prot.testProd1(); 
		//! prot.testProd2();
	}
}