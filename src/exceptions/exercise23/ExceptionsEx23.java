package exceptions.exercise23;

class FailingConstructor {
	private Disposable disp1;
	private Disposable disp2;

	FailingConstructor() throws Exception {
		this.disp1 = new Disposable();
		System.out.println(this.disp2.equals(this.disp1));
		this.disp2 = new Disposable();
	}
	
	public Disposable getDisp1() {
		return disp1;
	}
	public Disposable getDisp2() {
		return disp2;
	}
}

class Disposable {
	private static long counter = 1;
	private final long id = counter++;

	public void dispose() {
		System.out.println("Disposable " + id + " disposed");
	}
}

public class ExceptionsEx23 {
	public static void main(String[] args) {
		try {
			FailingConstructor fc = new FailingConstructor();
			try {
			} finally {
				fc.getDisp2().dispose();
				fc.getDisp1().dispose();
			}
		} catch (Exception e) {
			System.out.println("Construction failed");
			e.printStackTrace(System.out);
		}
	}
}
