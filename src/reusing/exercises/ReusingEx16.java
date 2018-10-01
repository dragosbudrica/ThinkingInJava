package reusing.exercises;

class Amphibian {
	public void eat() { System.out.println("Eat..."); }
	public void jump() { System.out.println("Jump..."); }
	public void swim() { System.out.println("Swim..."); }
	public void sing() { System.out.println("Sing..."); }
	
	public static void transform(Amphibian a) {
		System.out.println("Transforming...");
	}
}

class Frog extends Amphibian {}

public class ReusingEx16 {
	public static void main(String[] args) {
		Frog frog = new Frog();
		Amphibian.transform(frog);
		frog.eat();
		frog.jump();
		frog.swim();
		frog.sing();
	}
}
