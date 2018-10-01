package reusing.exercises;

class Art {
	Art() { System.out.println("Art constructor"); }
}

class Drawing extends Art {
	Drawing() { System.out.println("Drawing constructor"); }
}

class Cartoon extends Drawing {
	Cartoon() { System.out.println("Cartoon constructor"); }
}

public class ReusingEx3 {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Cartoon x = new Cartoon();
	}
}
