package holding.exercise10;
import java.util.*;

public class HoldingEx10 {
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
		List<Rodent> rodents = new ArrayList<Rodent>();
		Collections.addAll(rodents, new Hamster(), new Mouse(), new Gerbil(), new Rat());
		Iterator<Rodent> it = rodents.iterator();
		while(it.hasNext()) {
			Rodent r = it.next();
			bite(r);
			eat(r);
			walk(r);
			System.out.println("----------------------------------------");
		}
	}
}
