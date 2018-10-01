//: reusing/Cartoon.java
// Constructor calls during inheritance.
package reusing;
import static net.mindview.util.Print.*;

class Art {
	Art() { print("Art constructor"); }
}

class Drawing extends Art {
	Drawing() { print("Drawing constructor"); }
}

public class Cartoon extends Drawing {
	public Cartoon() { print("Cartoon constructor"); }
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Cartoon x = new Cartoon();
	}
} /* Output:
Art constructor
Drawing constructor
Cartoon constructor
*///:~
