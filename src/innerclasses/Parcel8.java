//: innerclasses/Parcel8.java
// Calling the base-class constructor.
package innerclasses;

public class Parcel8 {
	public Wrapping wrapping(int x) {
		// Base constructor call:
		return new Wrapping(x) { // Pass constructor argument.
			public int value() {
				return super.value() * 47;
			}
		}; // Semicolon required
	}
	public static void main(String[] args) {
		Parcel8 p = new Parcel8();
		@SuppressWarnings("unused")
		Wrapping w = p.wrapping(10);
	}
} ///:~
