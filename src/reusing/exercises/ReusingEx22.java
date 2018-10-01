package reusing.exercises;

final class ClassToInherit {
	String str = "test";
}

// class InheritFinalClass extends ClassToInherit {} // The type InheritFinalClass cannot subclass the final class ClassToInherit

public class ReusingEx22 {
	public static void main(String[] args) {
		ClassToInherit cti = new ClassToInherit();
		System.out.println(cti.str);
	}
}