package initialization.exercises;

class FinalizeAlways {
	protected void finalize() {
		System.out.println("Finalize always called");
	}
}

public class InitializationEx11 {
	public static void main(String[] args) {
			new FinalizeAlways();
			System.gc();
	}
}
