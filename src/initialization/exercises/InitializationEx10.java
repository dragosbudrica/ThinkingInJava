package initialization.exercises;

class FinalizeNotAlways {
	protected void finalize() {
		System.out.println("Finalize is not always called.");
	}
}

public class InitializationEx10 {
	public static void main(String[] args) {
			new FinalizeNotAlways(); // finalize method is not always called, but only when garbage collector reclaims the memory.
	}
}
