//: innerclasses/DotNew.java
// Creating an inner class directly using the .new syntax.
package innerclasses;

public class DotNew {
	public class Inner {}
	public static void main(String[] args) {
		DotNew dn = new DotNew();
		@SuppressWarnings("unused")
		DotNew.Inner dni = dn.new Inner();
	}
} ///:~
