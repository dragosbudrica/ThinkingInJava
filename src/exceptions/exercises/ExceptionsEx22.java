package exceptions.exercises;

class FailingConstructor {
	private String str;
	private int i;

	FailingConstructor(int i, String str) throws Exception {
		this.i = i;
		System.out.println(this.str.equals(str));
		this.str = str;
	}

	public String getStr() {
		return str;
	}
	
	public int getI() {
		return i;
	}
}

public class ExceptionsEx22 {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		FailingConstructor fc = null;
		try {
			fc = new FailingConstructor(23, "Dragos");
		} catch (Exception e) {
			System.out.println("Construction failed");
			e.printStackTrace(System.out);
		}

	}
}
