package polymorphism.exercise12;

public class Rodent {
	@SuppressWarnings("unused")
	private Characteristic p = new Characteristic("mammals of the order Rodentia");
	@SuppressWarnings("unused")
	private Description t = new Description("most rodents are herbivorous");
	Rodent() { System.out.println("Rodent()"); }
	public void walk() {
		System.out.println("The Rodent walks"); 
		}
	public void bite() {
		System.out.println("The Rodent bites"); 
		}
	public void eat() {
		System.out.println("The Rodent eating"); 
		}
}
