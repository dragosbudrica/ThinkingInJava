package operators.exercises;

class DogV2 {
	String name;
	String says;
}

public class OperatorsEx6 {
	public static void main(String[] args) {
		DogV2 dog1 = new DogV2();
		DogV2 dog2 = new DogV2();
		
		dog1.name = "spot";
		dog1.says = "Ruff!";
		dog2.name = "scruffy";
		dog2.says = "Wurf!";
		
		System.out.println(dog1.name + " says " + dog1.says);
		System.out.println(dog2.name + " says " + dog2.says);
		
		DogV2 dog3 = new DogV2();
		dog3 = dog1;
		
		System.out.println(dog1 == dog2); 
		System.out.println(dog1 == dog3); 
		System.out.println(dog2 == dog3); 
		
		System.out.println(dog1.equals(dog2)); 
		System.out.println(dog1.equals(dog3)); 
		System.out.println(dog2.equals(dog3)); 
	}
}