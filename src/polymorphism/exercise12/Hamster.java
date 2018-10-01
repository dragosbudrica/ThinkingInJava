package polymorphism.exercise12;

public class Hamster extends Rodent {
	@SuppressWarnings("unused")
	private Characteristic p = new Characteristic("remains underground during the day");
	@SuppressWarnings("unused")
	private Description t = new Description("eats seeds, fruits and vegetation");
	Hamster() { System.out.println("Hamster()"); }
	@Override
	public void walk() {
		System.out.println("The Hamster walks in a cage"); 
		}
	@Override
	public void bite() {
		System.out.println("The Hamster bites a seed"); 
		}
	@Override
	public void eat() {
		System.out.println("The Hamster eating grasses"); 
		}
}
