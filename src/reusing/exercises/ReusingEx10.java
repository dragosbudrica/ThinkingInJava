package reusing.exercises;

class Component1Modified {
	Component1Modified(String comp1Modif) {
		System.out.println(comp1Modif);
	}
}
class Component2Modified {
	Component2Modified(String comp2Modif) {
		System.out.println(comp2Modif);
	}
}
class Component3Modified {
	Component3Modified(String comp3Modif) {
		System.out.println(comp3Modif);
	}
}

class RootModified {
	Component1Modified comp1 = new Component1Modified("Component1 non-default constructor called");
	Component2Modified comp2 = new Component2Modified("Component2 non-default constructor called");
	Component3Modified comp3 = new Component3Modified("Component3 non-default constructor called");
	
	RootModified(String rootModif) {
		System.out.println(rootModif);
	}
}

class StemModified extends RootModified {
	Component1Modified comp1 = new Component1Modified("Component1 non-default constructor called");
	Component2Modified comp2 = new Component2Modified("Component2 non-default constructor called");
	Component3Modified comp3 = new Component3Modified("Component3 non-default constructor called");
	
	StemModified(String stemModif) {
		super("Root non-default constructor called");
		System.out.println(stemModif);
	}
}

public class ReusingEx10 {
	public static void main(String[] args) {
		new StemModified("Stem non-default constructor called");
	}
}
