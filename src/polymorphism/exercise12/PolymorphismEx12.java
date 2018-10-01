package polymorphism.exercise12;

public class PolymorphismEx12 {
	public static void bite(Rodent r) {
		r.bite();
	}
	public static void eat(Rodent r) {
		r.eat();
	}
	public static void walk(Rodent r) {
		r.walk();
	}
	
	public static void main(String[] args) {
		Rodent[] rodents = {
				new Hamster(),
				new Mouse(),
				new Gerbil(),
				new Rat()
		};
		for(Rodent r : rodents) {
			bite(r);
			eat(r);
			walk(r);
			System.out.println("----------------------------------------");
		}
	}
}
