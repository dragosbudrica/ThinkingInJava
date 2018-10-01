package initialization.exercises;

class Tank {
	boolean statusEmpty = false;
	Tank(boolean status) {
		statusEmpty = status;
	}
	void fill() {
		statusEmpty = false;
	}
	void empty() {
		statusEmpty = true;
	}
	protected void finalize() {
		if(statusEmpty) {
			System.out.println("Termination Condition fullfield: Status: Empty!");
		}
	}
}

public class InitializationEx12 {
	public static void main(String[] args) {
		Tank tank = new Tank(true);
		
		tank.empty();
		
		new Tank(true).fill();
		
		System.gc();
		
		new Tank(true);
		
		System.gc();
	}
}
