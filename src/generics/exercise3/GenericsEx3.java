package generics.exercise3;
import net.mindview.util.*;

class SixTuple<A, B, C, D, E, F>
extends FiveTuple<A, B, C, D, E> {
	public final F sixth;
	public SixTuple(A a, B b, C c, D d, E e, F f) {
		super(a, b, c, d, e);
		sixth = f;
	}
	public String toString() {
		return "(" + first + ", " + second + ", " + third + ", " +
				fourth + ", " + fifth + ", " + sixth + ")";
	}
}

public class GenericsEx3 {
	static 
	SixTuple<String, String, String, Integer, Integer, Integer> l() {
		return new SixTuple<String, String, String, Integer, Integer, Integer>(
				"Dragos", "Budrica", "Calea Bucuresti", 104, 4, 17);
	}
	public static void main(String[] args) {
		System.out.println(l());
	}
}
