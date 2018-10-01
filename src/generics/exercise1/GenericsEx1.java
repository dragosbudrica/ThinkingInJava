package generics.exercise1;
import typeinfo.pets.*;

public class GenericsEx1<T> {
	private T pet;
	public GenericsEx1(T pet) { this.pet = pet; }
	public void set(T pet) { this.pet = pet; }
	public T get() { return pet; }
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		GenericsEx1<Pet> pet = new GenericsEx1<Pet>(new Pet());
		pet.set(new EgyptianMau());
		EgyptianMau egyptianMau = (EgyptianMau)pet.get();
		pet.set(new Manx());
		Manx manx = (Manx)pet.get();
		pet.set(new Cymric());
		Cymric cymric = (Cymric)pet.get();
		pet.set(new Dog());
		Dog dog = (Dog)pet.get();
	}
}
