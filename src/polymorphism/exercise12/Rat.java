package polymorphism.exercise12;

public class Rat extends Rodent {
	@SuppressWarnings("unused")
	private Characteristic p = new Characteristic("opportunistic survivors");
	@SuppressWarnings("unused")
	private Description t = new Description("eats mice and plants");
	Rat() { System.out.println("Rat()"); }
	@Override
	public void walk() {
		System.out.println("The Rat walks in field in crop"); 
		}
	@Override
	public void bite() {
		System.out.println("The Rat bites a piece of wood"); 
		}
	@Override
	public void eat() {
		System.out.println("The Rat eating mice"); 
		}
}
