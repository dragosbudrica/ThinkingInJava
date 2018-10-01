package polymorphism.exercise14;

public class PolymorphismEx14 {
	public static void bite(Rodent r) {
		r.bite();
	}
	public static void eat(Rodent r) {
		r.eat();
	}
	public static void walk(Rodent r) {
		r.walk();
	}
	public static void dispose(Rodent r) {
		r.dispose();
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
		
		Shared shared = new Shared();
		Rodent[] rodentsShared = {
				new Hamster(shared),
				new Mouse(shared),
				new Gerbil(shared),
				new Rat(shared)
		};
		for(Rodent r : rodentsShared) {
			dispose(r);
		}
	}
}
