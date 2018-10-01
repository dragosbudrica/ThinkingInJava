package polymorphism.exercise12;

public class Gerbil extends Rodent {
	@SuppressWarnings("unused")
	private Characteristic p = new Characteristic("lives in groups in the wild");
	@SuppressWarnings("unused")
	private Description t = new Description("desert rat");
	
	Gerbil() { System.out.println("Gerbil()"); }
	@Override
	public void walk() {
		System.out.println("The Gerbil walks in Africa"); 
		}
	@Override
	public void bite() {
		System.out.println("The Gerbil bites a burrito"); 
		}
	@Override
	public void eat() {
		System.out.println("The Gerbil eating a carrot"); 
		}
}
