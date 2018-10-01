//: initialization/NoSynthesis.java
package initialization;

class Bird2 {
	Bird2(int i) {}
	Bird2(double d) {}
}

public class NoSynthesis {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//! Bird2 b = new Bird2(); // No default
		Bird2 b2 = new Bird2(1);
		Bird2 b3 = new Bird2(1.0);
	}
} ///:~
