package exceptions.exercise24;

class FailingConstructor {
	private static long counter = 1;
	private final long id = counter++;
	
	private String name;
	private int age;
	
	FailingConstructor(int age, String name) throws Exception {
		this.age = age;
		System.out.println(this.name.equals(name));
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void dispose() {
		System.out.println("FailingConstructor " + id + " disposed");
	}
}

public class ExceptionsEx24 {
	public static void main(String[] args) {
		FailingConstructor fc = null;
		try {
			fc = new FailingConstructor(23, "Dragos");
			try {
				System.out.println("Name: " + fc.getName() + "\nAge: " + fc.getAge());
			} finally {
				fc.dispose();
			}
		} catch (Exception e) {
			System.out.println("Construction failed");
			e.printStackTrace(System.out);
		}
	}
}
