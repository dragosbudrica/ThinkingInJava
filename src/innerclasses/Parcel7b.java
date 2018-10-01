//: innerclasses/Parcel7b.java
// Expanded version of Parcel7.java
package innerclasses;

public class Parcel7b {
	class MyContents implements Contents {
		private int i = 11;
		public int value() { return i; }
	}
	public Contents contents() { return new MyContents(); }
	public static void main(String[] args) {
		Parcel7b p = new Parcel7b();
		@SuppressWarnings("unused")
		Contents c = p.contents();
	}
} ///:~
