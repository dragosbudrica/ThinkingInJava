package reusing.exercises;

public class ReusingEx19 {
	private final String test;
	public ReusingEx19(String test) {
		this.test = test;
	}
	public ReusingEx19() {
		this.test = "default";
	}
	
	public String toString() {
		return test;
	}
	
	public static void main(String[] args) {
		ReusingEx19 bf1 = new ReusingEx19();
		System.out.println(bf1);
	//	bf1.test = new String("Test"); // The final field ReusingEx19.test cannot be assigned
	//	bf1.test = "Test"; // The final field ReusingEx19.test cannot be assigned
		
		ReusingEx19 bf2 = new ReusingEx19("test");
		System.out.println(bf2);
    //	bf2.test = new String("Tes2"); // The final field ReusingEx19.test cannot be assigned
	//	bf2.test = "Test2"; // The final field ReusingEx19.test cannot be assigned
	}
}
