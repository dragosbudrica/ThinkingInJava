package reusing.exercises;

class Amphibian2 {
	public void eat() { System.out.println("Eat..."); }
	public void jump() { System.out.println("Jump..."); }
	public void swim() { System.out.println("Swim..."); }
	public void sing() { System.out.println("Sing..."); }
	
	public static void transform(Amphibian2 a) {
		System.out.println("Transforming...");
	}
}

class Frog2 extends Amphibian2 {
	@Override public void eat() { System.out.println("The frog is eating..."); }
	@Override public void jump() { System.out.println("The frog jumps..."); }
	@Override public void swim() { System.out.println("The frog swims..."); }
	@Override public void sing() { System.out.println("The frog is singing..."); }
}

public class ReusingEx17 {
	public static void main(String[] args) {
		Frog2 frog = new Frog2();
		Amphibian2.transform(frog);
		frog.eat();
		frog.jump();
		frog.swim();
		frog.sing();
	}
}

