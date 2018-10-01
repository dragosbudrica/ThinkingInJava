package reusing.exercises;

class Cl1 {
	Cl1() {
		System.out.println("Constructor Cl1 called");
	}
}

class Cl2 extends Cl1 {}

class Cl3 extends Cl2 {}

class Cl4 extends Cl3 {
	public Cl4() {
		System.out.println("Constructor Cl4 called");
	}
}

public class ReusingEx4 {
	public static void main(String[] args) {
		new Cl4();
	}
}
