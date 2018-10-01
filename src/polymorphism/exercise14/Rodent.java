package polymorphism.exercise14;

public class Rodent {
	@SuppressWarnings("unused")
	private Characteristic p = new Characteristic("mammals of the order Rodentia");
	@SuppressWarnings("unused")
	private Description t = new Description("most rodents are herbivorous");
	private Shared shared;
	private static long counter = 0;
	@SuppressWarnings("unused")
	private final long id = counter++;
	Rodent() { System.out.println("Rodent()"); }
	Rodent(Shared shared) {
		this.shared = shared;
		this.shared.addRef();
	}
	public void walk() {
		System.out.println("The Rodent walks"); 
		}
	public void bite() {
		System.out.println("The Rodent bites"); 
		}
	public void eat() {
		System.out.println("The Rodent eating"); 
		}
	protected void dispose() {
		System.out.println("disposing " + this);
		shared.dispose();
	}
	protected void finalize() {
		System.out.println("Preparing to finalize Rodent...");     
		System.out.println("Finalized " + this);  
	}
}
