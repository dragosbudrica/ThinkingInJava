package initialization.exercises;

class TestThis {
	int i = 10;
	
	void decrementWith2() {
		decrement();
		this.decrement();
		System.out.println("i = " + i);
	}
	
	void decrement() {
		i--;
	}
}

public class InitializationEx8 {
	public static void main(String[] args) {
		TestThis tt = new TestThis();
		tt.decrementWith2();
	}
}
