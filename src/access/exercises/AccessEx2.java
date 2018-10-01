package access.exercises;
import net.mindview.simple.*;

import java.util.*;

@SuppressWarnings("unused")
public class AccessEx2 {
	public static void main(String[] args) {
	//	Vector v = new Vector(); // The type Vector is ambiguous
		@SuppressWarnings("rawtypes")
		java.util.Vector v = new java.util.Vector();
	}
}
