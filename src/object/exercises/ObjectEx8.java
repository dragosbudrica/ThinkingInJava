package object.exercises;

public class ObjectEx8 {
	static int testStatic = 25;
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		System.out.println("Creating the first object...");
		ObjectEx8 object1 = new ObjectEx8();
		
		System.out.println("Creating the second object...");
		ObjectEx8 object2 = new ObjectEx8();
		
		System.out.println("Creating the third object...");
		ObjectEx8 object3 = new ObjectEx8();
		
		System.out.println("Actual value: " + ObjectEx8.testStatic);
		
		object1.testStatic++;
		System.out.println("After the increment of static field from the first object: " + ObjectEx8.testStatic);
		
		object2.testStatic++;
		System.out.println("After the increment of static field from the second object: " + ObjectEx8.testStatic);
		
		object3.testStatic++;
		System.out.println("After the increment of static field from the third object: " + ObjectEx8.testStatic);
		
		System.out.println("Final state: " + testStatic);
	}
}
